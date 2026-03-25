package com.okinc.business.invest_biz.ui.widget.defi_dashboard.binder;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class UiDashboardTokenItemType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UiDashboardTokenItemType[] $VALUES;
    public static final UiDashboardTokenItemType SINGLE = new UiDashboardTokenItemType("SINGLE", 0);
    public static final UiDashboardTokenItemType DUAL = new UiDashboardTokenItemType("DUAL", 1);
    public static final UiDashboardTokenItemType BORROW = new UiDashboardTokenItemType("BORROW", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UiDashboardTokenItemType[] $values() {
        return new UiDashboardTokenItemType[]{SINGLE, DUAL, BORROW};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UiDashboardTokenItemType> getEntries() {
        return $ENTRIES;
    }

    private UiDashboardTokenItemType(String str, int i) {
    }

    static {
        UiDashboardTokenItemType[] uiDashboardTokenItemTypeArr$values = $values();
        $VALUES = uiDashboardTokenItemTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(uiDashboardTokenItemTypeArr$values);
    }

    public static UiDashboardTokenItemType valueOf(String str) {
        return (UiDashboardTokenItemType) Enum.valueOf(UiDashboardTokenItemType.class, str);
    }

    public static UiDashboardTokenItemType[] values() {
        return (UiDashboardTokenItemType[]) $VALUES.clone();
    }
}
