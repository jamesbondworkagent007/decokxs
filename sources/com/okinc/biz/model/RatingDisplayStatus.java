package com.okinc.biz.model;

import com.okinc.biz.model.RatingDisplayStatus;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import o.C56392yDr;
import o.C56444yFp;
import o.C6874aXc;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Serializable(with = C6874aXc.class)
public final class RatingDisplayStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RatingDisplayStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    public static final String RATING_DISPLAY_STATUS = "RATING_DISPLAY_STATUS";
    private final int value;
    public static final RatingDisplayStatus DisplayRating = new RatingDisplayStatus("DisplayRating", 0, 1);
    public static final RatingDisplayStatus RatingSubmitted = new RatingDisplayStatus("RatingSubmitted", 1, 2);
    public static final RatingDisplayStatus NoNeedToDisplay = new RatingDisplayStatus("NoNeedToDisplay", 2, 3);
    public static final RatingDisplayStatus RatingExpired = new RatingDisplayStatus("RatingExpired", 3, 4);
    public static final RatingDisplayStatus Unknown = new RatingDisplayStatus("Unknown", 4, -1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RatingDisplayStatus[] $values() {
        return new RatingDisplayStatus[]{DisplayRating, RatingSubmitted, NoNeedToDisplay, RatingExpired, Unknown};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RatingDisplayStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private RatingDisplayStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        RatingDisplayStatus[] ratingDisplayStatusArr$values = $values();
        $VALUES = ratingDisplayStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(ratingDisplayStatusArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.aXa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RatingDisplayStatus._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.biz.model.RatingDisplayStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer AEQbTJ() {
            return (KSerializer) RatingDisplayStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<RatingDisplayStatus> serializer() {
            return AEQbTJ();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return new C6874aXc();
    }

    @Override // java.lang.Enum
    public String toString() {
        return String.valueOf(this.value);
    }

    public static RatingDisplayStatus valueOf(String str) {
        return (RatingDisplayStatus) Enum.valueOf(RatingDisplayStatus.class, str);
    }

    public static RatingDisplayStatus[] values() {
        return (RatingDisplayStatus[]) $VALUES.clone();
    }
}
