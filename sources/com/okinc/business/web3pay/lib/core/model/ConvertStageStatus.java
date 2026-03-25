package com.okinc.business.web3pay.lib.core.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class ConvertStageStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ConvertStageStatus[] $VALUES;
    public static final StateListAnimator Companion;
    private final int value;
    public static final ConvertStageStatus CONVERT_STAGE_STATUS_PENDING = new ConvertStageStatus("CONVERT_STAGE_STATUS_PENDING", 0, 0);
    public static final ConvertStageStatus CONVERT_STAGE_STATUS_SUCCESSFUL = new ConvertStageStatus("CONVERT_STAGE_STATUS_SUCCESSFUL", 1, 1);
    public static final ConvertStageStatus CONVERT_STAGE_STATUS_FAILED = new ConvertStageStatus("CONVERT_STAGE_STATUS_FAILED", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ConvertStageStatus[] $values() {
        return new ConvertStageStatus[]{CONVERT_STAGE_STATUS_PENDING, CONVERT_STAGE_STATUS_SUCCESSFUL, CONVERT_STAGE_STATUS_FAILED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConvertStageStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private ConvertStageStatus(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        ConvertStageStatus[] convertStageStatusArr$values = $values();
        $VALUES = convertStageStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(convertStageStatusArr$values);
        Companion = new StateListAnimator(null);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.lib.core.model.ConvertStageStatus.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final ConvertStageStatus copydefault(int i) {
            for (ConvertStageStatus convertStageStatus : ConvertStageStatus.values()) {
                if (convertStageStatus.getValue() == i) {
                    return convertStageStatus;
                }
            }
            return null;
        }
    }

    public static ConvertStageStatus valueOf(String str) {
        return (ConvertStageStatus) Enum.valueOf(ConvertStageStatus.class, str);
    }

    public static ConvertStageStatus[] values() {
        return (ConvertStageStatus[]) $VALUES.clone();
    }
}
