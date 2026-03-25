package com.okinc.okex.ia.plugin;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class IaAdvHomePluginId {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IaAdvHomePluginId[] $VALUES;
    public static final IaAdvHomePluginId PORTFOLIO_OVERVIEW = new IaAdvHomePluginId("PORTFOLIO_OVERVIEW", 0);
    public static final IaAdvHomePluginId QUICK_PRODUCT_ACCESS = new IaAdvHomePluginId("QUICK_PRODUCT_ACCESS", 1);
    public static final IaAdvHomePluginId SMART_CARD = new IaAdvHomePluginId("SMART_CARD", 2);
    public static final IaAdvHomePluginId TOKEN_LIST = new IaAdvHomePluginId("TOKEN_LIST", 3);
    public static final IaAdvHomePluginId ANNOUNCEMENT = new IaAdvHomePluginId("ANNOUNCEMENT", 4);
    public static final IaAdvHomePluginId BALANCE_CARD = new IaAdvHomePluginId("BALANCE_CARD", 5);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IaAdvHomePluginId[] $values() {
        return new IaAdvHomePluginId[]{PORTFOLIO_OVERVIEW, QUICK_PRODUCT_ACCESS, SMART_CARD, TOKEN_LIST, ANNOUNCEMENT, BALANCE_CARD};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IaAdvHomePluginId> getEntries() {
        return $ENTRIES;
    }

    private IaAdvHomePluginId(String str, int i) {
    }

    static {
        IaAdvHomePluginId[] iaAdvHomePluginIdArr$values = $values();
        $VALUES = iaAdvHomePluginIdArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(iaAdvHomePluginIdArr$values);
    }

    public static IaAdvHomePluginId valueOf(String str) {
        return (IaAdvHomePluginId) Enum.valueOf(IaAdvHomePluginId.class, str);
    }

    public static IaAdvHomePluginId[] values() {
        return (IaAdvHomePluginId[]) $VALUES.clone();
    }
}
