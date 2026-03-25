package com.okinc.ok_kyc_core.data.remote.networkmodel;

import com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition;
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
/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class InsertPosition {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InsertPosition[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;

    @SerialName("top")
    public static final InsertPosition Top = new InsertPosition("Top", 0);

    @SerialName("bottom")
    public static final InsertPosition Bottom = new InsertPosition("Bottom", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InsertPosition[] $values() {
        return new InsertPosition[]{Top, Bottom};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InsertPosition> getEntries() {
        return $ENTRIES;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer OLrzqt() {
            return (KSerializer) InsertPosition.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<InsertPosition> serializer() {
            return OLrzqt();
        }
    }

    private InsertPosition(String str, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.ok_kyc_core.data.remote.networkmodel.InsertPosition", values(), new String[]{"top", "bottom"}, new Annotation[][]{null, null}, null);
    }

    static {
        InsertPosition[] insertPositionArr$values = $values();
        $VALUES = insertPositionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(insertPositionArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.rva
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return InsertPosition._init_$_anonymous_();
            }
        });
    }

    public static InsertPosition valueOf(String str) {
        return (InsertPosition) Enum.valueOf(InsertPosition.class, str);
    }

    public static InsertPosition[] values() {
        return (InsertPosition[]) $VALUES.clone();
    }
}
