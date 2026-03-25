package com.okinc.okassetslite.api.assets_lite_api.ia.plugin;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class IaAdvAssetDetailPluginId {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IaAdvAssetDetailPluginId[] $VALUES;
    public static final IaAdvAssetDetailPluginId TOTAL_VALUE = new IaAdvAssetDetailPluginId("TOTAL_VALUE", 0);
    public static final IaAdvAssetDetailPluginId QUICK_ACTIONS = new IaAdvAssetDetailPluginId("QUICK_ACTIONS", 1);
    public static final IaAdvAssetDetailPluginId ASSET_OVERVIEW = new IaAdvAssetDetailPluginId("ASSET_OVERVIEW", 2);
    public static final IaAdvAssetDetailPluginId BORROW_DETAIL = new IaAdvAssetDetailPluginId("BORROW_DETAIL", 3);
    public static final IaAdvAssetDetailPluginId REWARDS_DETAIL = new IaAdvAssetDetailPluginId("REWARDS_DETAIL", 4);
    public static final IaAdvAssetDetailPluginId EARN_OVERVIEW = new IaAdvAssetDetailPluginId("EARN_OVERVIEW", 5);
    public static final IaAdvAssetDetailPluginId LEND_OVERVIEW = new IaAdvAssetDetailPluginId("LEND_OVERVIEW", 6);
    public static final IaAdvAssetDetailPluginId FREQUENT_TRADED = new IaAdvAssetDetailPluginId("FREQUENT_TRADED", 7);
    public static final IaAdvAssetDetailPluginId RECENT_TRANSACTION = new IaAdvAssetDetailPluginId("RECENT_TRANSACTION", 8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IaAdvAssetDetailPluginId[] $values() {
        return new IaAdvAssetDetailPluginId[]{TOTAL_VALUE, QUICK_ACTIONS, ASSET_OVERVIEW, BORROW_DETAIL, REWARDS_DETAIL, EARN_OVERVIEW, LEND_OVERVIEW, FREQUENT_TRADED, RECENT_TRANSACTION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IaAdvAssetDetailPluginId> getEntries() {
        return $ENTRIES;
    }

    private IaAdvAssetDetailPluginId(String str, int i) {
    }

    static {
        IaAdvAssetDetailPluginId[] iaAdvAssetDetailPluginIdArr$values = $values();
        $VALUES = iaAdvAssetDetailPluginIdArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(iaAdvAssetDetailPluginIdArr$values);
    }

    public static IaAdvAssetDetailPluginId valueOf(String str) {
        return (IaAdvAssetDetailPluginId) Enum.valueOf(IaAdvAssetDetailPluginId.class, str);
    }

    public static IaAdvAssetDetailPluginId[] values() {
        return (IaAdvAssetDetailPluginId[]) $VALUES.clone();
    }
}
