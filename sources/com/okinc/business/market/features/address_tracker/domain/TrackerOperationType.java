package com.okinc.business.market.features.address_tracker.domain;

import com.okinc.business.market.features.address_tracker.domain.TrackerOperationType;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class TrackerOperationType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TrackerOperationType[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final int value;

    @SerialName("0")
    public static final TrackerOperationType ADD = new TrackerOperationType("ADD", 0, 0);

    @SerialName("1")
    public static final TrackerOperationType UPDATE = new TrackerOperationType("UPDATE", 1, 1);

    @SerialName("2")
    public static final TrackerOperationType DELETE = new TrackerOperationType("DELETE", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TrackerOperationType[] $values() {
        return new TrackerOperationType[]{ADD, UPDATE, DELETE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TrackerOperationType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.address_tracker.domain.TrackerOperationType.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) TrackerOperationType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<TrackerOperationType> serializer() {
            return copydefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.market.features.address_tracker.domain.TrackerOperationType", values(), new String[]{"0", "1", "2"}, new Annotation[][]{null, null, null}, null);
    }

    private TrackerOperationType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        TrackerOperationType[] trackerOperationTypeArr$values = $values();
        $VALUES = trackerOperationTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(trackerOperationTypeArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.jAW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return TrackerOperationType._init_$_anonymous_();
            }
        });
    }

    public static TrackerOperationType valueOf(String str) {
        return (TrackerOperationType) Enum.valueOf(TrackerOperationType.class, str);
    }

    public static TrackerOperationType[] values() {
        return (TrackerOperationType[]) $VALUES.clone();
    }
}
