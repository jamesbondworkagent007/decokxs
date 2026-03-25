package com.okinc.business.trade.features.home.ui.cefi.common;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedApproveState {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AdvancedApproveState[] $VALUES;
    public static final AdvancedApproveState APPROVED = new AdvancedApproveState("APPROVED", 0);
    public static final AdvancedApproveState NEED_APPROVE = new AdvancedApproveState("NEED_APPROVE", 1);
    public static final AdvancedApproveState CANCEL_APPROVE = new AdvancedApproveState("CANCEL_APPROVE", 2);
    public static final AdvancedApproveState APPROVING = new AdvancedApproveState("APPROVING", 3);
    public static final AdvancedApproveState CANCEL_APPROVING = new AdvancedApproveState("CANCEL_APPROVING", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AdvancedApproveState[] $values() {
        return new AdvancedApproveState[]{APPROVED, NEED_APPROVE, CANCEL_APPROVE, APPROVING, CANCEL_APPROVING};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AdvancedApproveState> getEntries() {
        return $ENTRIES;
    }

    private AdvancedApproveState(String str, int i) {
    }

    static {
        AdvancedApproveState[] advancedApproveStateArr$values = $values();
        $VALUES = advancedApproveStateArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(advancedApproveStateArr$values);
    }

    public static AdvancedApproveState valueOf(String str) {
        return (AdvancedApproveState) Enum.valueOf(AdvancedApproveState.class, str);
    }

    public static AdvancedApproveState[] values() {
        return (AdvancedApproveState[]) $VALUES.clone();
    }
}
