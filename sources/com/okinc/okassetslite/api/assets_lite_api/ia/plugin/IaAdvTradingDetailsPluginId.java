package com.okinc.okassetslite.api.assets_lite_api.ia.plugin;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class IaAdvTradingDetailsPluginId {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IaAdvTradingDetailsPluginId[] $VALUES;
    public static final IaAdvTradingDetailsPluginId TOTAL_VALUE = new IaAdvTradingDetailsPluginId("TOTAL_VALUE", 0);
    public static final IaAdvTradingDetailsPluginId QUICK_ACTIONS = new IaAdvTradingDetailsPluginId("QUICK_ACTIONS", 1);
    public static final IaAdvTradingDetailsPluginId ORDER_POSITION = new IaAdvTradingDetailsPluginId("ORDER_POSITION", 2);
    public static final IaAdvTradingDetailsPluginId ASSET_LIST = new IaAdvTradingDetailsPluginId("ASSET_LIST", 3);
    public static final IaAdvTradingDetailsPluginId TRANSACTION_LIST = new IaAdvTradingDetailsPluginId("TRANSACTION_LIST", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IaAdvTradingDetailsPluginId[] $values() {
        return new IaAdvTradingDetailsPluginId[]{TOTAL_VALUE, QUICK_ACTIONS, ORDER_POSITION, ASSET_LIST, TRANSACTION_LIST};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IaAdvTradingDetailsPluginId> getEntries() {
        return $ENTRIES;
    }

    private IaAdvTradingDetailsPluginId(String str, int i) {
    }

    static {
        IaAdvTradingDetailsPluginId[] iaAdvTradingDetailsPluginIdArr$values = $values();
        $VALUES = iaAdvTradingDetailsPluginIdArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(iaAdvTradingDetailsPluginIdArr$values);
    }

    public static IaAdvTradingDetailsPluginId valueOf(String str) {
        return (IaAdvTradingDetailsPluginId) Enum.valueOf(IaAdvTradingDetailsPluginId.class, str);
    }

    public static IaAdvTradingDetailsPluginId[] values() {
        return (IaAdvTradingDetailsPluginId[]) $VALUES.clone();
    }
}
