package com.okinc.okassetslite.api.assets_lite_api.ia.plugin;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class IaAdvFundingDetailsPluginId {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IaAdvFundingDetailsPluginId[] $VALUES;
    public static final IaAdvFundingDetailsPluginId TOTAL_VALUE = new IaAdvFundingDetailsPluginId("TOTAL_VALUE", 0);
    public static final IaAdvFundingDetailsPluginId QUICK_ACTIONS = new IaAdvFundingDetailsPluginId("QUICK_ACTIONS", 1);
    public static final IaAdvFundingDetailsPluginId ASSET_LIST = new IaAdvFundingDetailsPluginId("ASSET_LIST", 2);
    public static final IaAdvFundingDetailsPluginId TRANSACTION_LIST = new IaAdvFundingDetailsPluginId("TRANSACTION_LIST", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IaAdvFundingDetailsPluginId[] $values() {
        return new IaAdvFundingDetailsPluginId[]{TOTAL_VALUE, QUICK_ACTIONS, ASSET_LIST, TRANSACTION_LIST};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IaAdvFundingDetailsPluginId> getEntries() {
        return $ENTRIES;
    }

    private IaAdvFundingDetailsPluginId(String str, int i) {
    }

    static {
        IaAdvFundingDetailsPluginId[] iaAdvFundingDetailsPluginIdArr$values = $values();
        $VALUES = iaAdvFundingDetailsPluginIdArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(iaAdvFundingDetailsPluginIdArr$values);
    }

    public static IaAdvFundingDetailsPluginId valueOf(String str) {
        return (IaAdvFundingDetailsPluginId) Enum.valueOf(IaAdvFundingDetailsPluginId.class, str);
    }

    public static IaAdvFundingDetailsPluginId[] values() {
        return (IaAdvFundingDetailsPluginId[]) $VALUES.clone();
    }
}
