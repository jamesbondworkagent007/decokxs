package com.okinc.okassetslite.api.assets_lite_api.ia.plugin;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class IaAdvPortfolioL1PluginId {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IaAdvPortfolioL1PluginId[] $VALUES;
    public static final IaAdvPortfolioL1PluginId TOTAL_VALUE = new IaAdvPortfolioL1PluginId("TOTAL_VALUE", 0);
    public static final IaAdvPortfolioL1PluginId QUICK_ACTIONS = new IaAdvPortfolioL1PluginId("QUICK_ACTIONS", 1);
    public static final IaAdvPortfolioL1PluginId ACCOUNT_BREAKDOWN = new IaAdvPortfolioL1PluginId("ACCOUNT_BREAKDOWN", 2);
    public static final IaAdvPortfolioL1PluginId FROZEN_ASSET_BANNER = new IaAdvPortfolioL1PluginId("FROZEN_ASSET_BANNER", 3);
    public static final IaAdvPortfolioL1PluginId DEX_PENDING_TRANSACTION_BANNER = new IaAdvPortfolioL1PluginId("DEX_PENDING_TRANSACTION_BANNER", 4);
    public static final IaAdvPortfolioL1PluginId YOUR_ASSETS_HEADER = new IaAdvPortfolioL1PluginId("YOUR_ASSETS_HEADER", 5);
    public static final IaAdvPortfolioL1PluginId CASH_LIST = new IaAdvPortfolioL1PluginId("CASH_LIST", 6);
    public static final IaAdvPortfolioL1PluginId CRYPTO_LIST = new IaAdvPortfolioL1PluginId("CRYPTO_LIST", 7);
    public static final IaAdvPortfolioL1PluginId IN_USE_HEADER = new IaAdvPortfolioL1PluginId("IN_USE_HEADER", 8);
    public static final IaAdvPortfolioL1PluginId EARN_LIST = new IaAdvPortfolioL1PluginId("EARN_LIST", 9);
    public static final IaAdvPortfolioL1PluginId LEND_LIST = new IaAdvPortfolioL1PluginId("LEND_LIST", 10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IaAdvPortfolioL1PluginId[] $values() {
        return new IaAdvPortfolioL1PluginId[]{TOTAL_VALUE, QUICK_ACTIONS, ACCOUNT_BREAKDOWN, FROZEN_ASSET_BANNER, DEX_PENDING_TRANSACTION_BANNER, YOUR_ASSETS_HEADER, CASH_LIST, CRYPTO_LIST, IN_USE_HEADER, EARN_LIST, LEND_LIST};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IaAdvPortfolioL1PluginId> getEntries() {
        return $ENTRIES;
    }

    private IaAdvPortfolioL1PluginId(String str, int i) {
    }

    static {
        IaAdvPortfolioL1PluginId[] iaAdvPortfolioL1PluginIdArr$values = $values();
        $VALUES = iaAdvPortfolioL1PluginIdArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(iaAdvPortfolioL1PluginIdArr$values);
    }

    public static IaAdvPortfolioL1PluginId valueOf(String str) {
        return (IaAdvPortfolioL1PluginId) Enum.valueOf(IaAdvPortfolioL1PluginId.class, str);
    }

    public static IaAdvPortfolioL1PluginId[] values() {
        return (IaAdvPortfolioL1PluginId[]) $VALUES.clone();
    }
}
