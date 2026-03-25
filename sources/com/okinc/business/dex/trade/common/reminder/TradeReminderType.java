package com.okinc.business.dex.trade.common.reminder;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
public final class TradeReminderType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TradeReminderType[] $VALUES;
    public static final TradeReminderType None = new TradeReminderType("None", 0);
    public static final TradeReminderType ServiceSuspended = new TradeReminderType("ServiceSuspended", 1);
    public static final TradeReminderType ServiceSuspendedRecommendDapp = new TradeReminderType("ServiceSuspendedRecommendDapp", 2);
    public static final TradeReminderType PRE_CHECK_ERROR = new TradeReminderType("PRE_CHECK_ERROR", 3);
    public static final TradeReminderType ConnectWallet = new TradeReminderType("ConnectWallet", 4);
    public static final TradeReminderType WalletStatusAbnormal = new TradeReminderType("WalletStatusAbnormal", 5);
    public static final TradeReminderType WalletMPCNeedRefreshed = new TradeReminderType("WalletMPCNeedRefreshed", 6);
    public static final TradeReminderType WalletMPCNeedLogin = new TradeReminderType("WalletMPCNeedLogin", 7);
    public static final TradeReminderType WalletMPCAccountInUse = new TradeReminderType("WalletMPCAccountInUse", 8);
    public static final TradeReminderType WalletMPCAuthenticateAccount = new TradeReminderType("WalletMPCAuthenticateAccount", 9);
    public static final TradeReminderType WalletMPCLoggedOutNeedVerify = new TradeReminderType("WalletMPCLoggedOutNeedVerify", 10);
    public static final TradeReminderType WalletMPCWalletHacked = new TradeReminderType("WalletMPCWalletHacked", 11);
    public static final TradeReminderType WalletMPCAccountFrozen = new TradeReminderType("WalletMPCAccountFrozen", 12);
    public static final TradeReminderType WalletMPCAccountDeleted = new TradeReminderType("WalletMPCAccountDeleted", 13);
    public static final TradeReminderType WalletBusinessUnsupported = new TradeReminderType("WalletBusinessUnsupported", 14);
    public static final TradeReminderType SAException = new TradeReminderType("SAException", 15);
    public static final TradeReminderType SAExpiringSoon = new TradeReminderType("SAExpiringSoon", 16);
    public static final TradeReminderType SAOrderLimitExceeded = new TradeReminderType("SAOrderLimitExceeded", 17);
    public static final TradeReminderType SALimitUnsupportChain = new TradeReminderType("SALimitUnsupportChain", 18);
    public static final TradeReminderType SANeedUpgrade = new TradeReminderType("SANeedUpgrade", 19);
    public static final TradeReminderType SAOrderExceedsValidity = new TradeReminderType("SAOrderExceedsValidity", 20);
    public static final TradeReminderType TokenHighRiskLeverage = new TradeReminderType("TokenHighRiskLeverage", 21);
    public static final TradeReminderType TokenHoneypot = new TradeReminderType("TokenHoneypot", 22);
    public static final TradeReminderType ChainNeedUseDapp = new TradeReminderType("ChainNeedUseDapp", 23);
    public static final TradeReminderType QuoteDapp = new TradeReminderType("QuoteDapp", 24);
    public static final TradeReminderType QuoteSafemoon = new TradeReminderType("QuoteSafemoon", 25);
    public static final TradeReminderType QuoteValueDiffExceeded = new TradeReminderType("QuoteValueDiffExceeded", 26);
    public static final TradeReminderType QuoteNoLiquidityServer = new TradeReminderType("QuoteNoLiquidityServer", 27);
    public static final TradeReminderType NoSupportTPLS = new TradeReminderType("NoSupportTPLS", 28);
    public static final TradeReminderType QuoteBlackAddress = new TradeReminderType("QuoteBlackAddress", 29);
    public static final TradeReminderType QuoteNewAddress = new TradeReminderType("QuoteNewAddress", 30);
    public static final TradeReminderType QuoteHoneypot = new TradeReminderType("QuoteHoneypot", 31);
    public static final TradeReminderType NoLiquidityForOKX = new TradeReminderType("NoLiquidityForOKX", 32);
    public static final TradeReminderType NoLiquidityForOKXWarning = new TradeReminderType("NoLiquidityForOKXWarning", 33);
    public static final TradeReminderType QuoteNoLiquidityFallback = new TradeReminderType("QuoteNoLiquidityFallback", 34);
    public static final TradeReminderType QuoteFailed = new TradeReminderType("QuoteFailed", 35);
    public static final TradeReminderType AntiMevForbidden = new TradeReminderType("AntiMevForbidden", 36);
    public static final TradeReminderType AntiMevInstability = new TradeReminderType("AntiMevInstability", 37);
    public static final TradeReminderType PresetConfigMiss = new TradeReminderType("PresetConfigMiss", 38);
    public static final TradeReminderType RevokeApproval = new TradeReminderType("RevokeApproval", 39);
    public static final TradeReminderType LimitMiniTradeAmount = new TradeReminderType("LimitMiniTradeAmount", 40);
    public static final TradeReminderType MCapEmpty = new TradeReminderType("MCapEmpty", 41);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TradeReminderType[] $values() {
        return new TradeReminderType[]{None, ServiceSuspended, ServiceSuspendedRecommendDapp, PRE_CHECK_ERROR, ConnectWallet, WalletStatusAbnormal, WalletMPCNeedRefreshed, WalletMPCNeedLogin, WalletMPCAccountInUse, WalletMPCAuthenticateAccount, WalletMPCLoggedOutNeedVerify, WalletMPCWalletHacked, WalletMPCAccountFrozen, WalletMPCAccountDeleted, WalletBusinessUnsupported, SAException, SAExpiringSoon, SAOrderLimitExceeded, SALimitUnsupportChain, SANeedUpgrade, SAOrderExceedsValidity, TokenHighRiskLeverage, TokenHoneypot, ChainNeedUseDapp, QuoteDapp, QuoteSafemoon, QuoteValueDiffExceeded, QuoteNoLiquidityServer, NoSupportTPLS, QuoteBlackAddress, QuoteNewAddress, QuoteHoneypot, NoLiquidityForOKX, NoLiquidityForOKXWarning, QuoteNoLiquidityFallback, QuoteFailed, AntiMevForbidden, AntiMevInstability, PresetConfigMiss, RevokeApproval, LimitMiniTradeAmount, MCapEmpty};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TradeReminderType> getEntries() {
        return $ENTRIES;
    }

    private TradeReminderType(String str, int i) {
    }

    static {
        TradeReminderType[] tradeReminderTypeArr$values = $values();
        $VALUES = tradeReminderTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tradeReminderTypeArr$values);
    }

    public static TradeReminderType valueOf(String str) {
        return (TradeReminderType) Enum.valueOf(TradeReminderType.class, str);
    }

    public static TradeReminderType[] values() {
        return (TradeReminderType[]) $VALUES.clone();
    }
}
