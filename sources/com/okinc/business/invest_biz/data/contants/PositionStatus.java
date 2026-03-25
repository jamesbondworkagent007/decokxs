package com.okinc.business.invest_biz.data.contants;

import com.okinc.business.invest_biz.data.contants.PositionStatus;
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
public final class PositionStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PositionStatus[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String value;

    @SerialName("UNKNOWN")
    public static final PositionStatus Unknown = new PositionStatus("Unknown", 0, "UNKNOWN");

    @SerialName("ACTIVE")
    public static final PositionStatus Active = new PositionStatus("Active", 1, "ACTIVE");

    @SerialName("INACTIVE")
    public static final PositionStatus Inactive = new PositionStatus("Inactive", 2, "INACTIVE");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PositionStatus[] $values() {
        return new PositionStatus[]{Unknown, Active, Inactive};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PositionStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.contants.PositionStatus.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) PositionStatus.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<PositionStatus> serializer() {
            return copydefault();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.business.invest_biz.data.contants.PositionStatus", values(), new String[]{"UNKNOWN", "ACTIVE", "INACTIVE"}, new Annotation[][]{null, null, null}, null);
    }

    private PositionStatus(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        PositionStatus[] positionStatusArr$values = $values();
        $VALUES = positionStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(positionStatusArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.iyu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return PositionStatus._init_$_anonymous_();
            }
        });
    }

    public static PositionStatus valueOf(String str) {
        return (PositionStatus) Enum.valueOf(PositionStatus.class, str);
    }

    public static PositionStatus[] values() {
        return (PositionStatus[]) $VALUES.clone();
    }
}
