package com.okinc.biz.model;

import com.okinc.business.dexlogic.bean.UnsignedSwapData;
import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class ModuleType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ModuleType[] $VALUES;
    private final String value;
    public static final ModuleType KycLevelOne = new ModuleType("KycLevelOne", 0, UnsignedSwapData.CALLDATA_TYPE_EVM_TRANSFER);
    public static final ModuleType KycLevelTwo = new ModuleType("KycLevelTwo", 1, "102");
    public static final ModuleType KycLevelThree = new ModuleType("KycLevelThree", 2, "103");
    public static final ModuleType CoinRechargeType = new ModuleType("CoinRechargeType", 3, "201");
    public static final ModuleType CoinWithdrawalType = new ModuleType("CoinWithdrawalType", 4, "202");
    public static final ModuleType CoinAhcType = new ModuleType("CoinAhcType", 5, "205");
    public static final ModuleType AffiliateType = new ModuleType("AffiliateType", 6, "206");
    public static final ModuleType TradingExperience = new ModuleType("TradingExperience", 7, "301");
    public static final ModuleType TradingBot = new ModuleType("TradingBot", 8, "302");
    public static final ModuleType TradingCopy = new ModuleType("TradingCopy", 9, "303");
    public static final ModuleType TradingNormal311 = new ModuleType("TradingNormal311", 10, "311");
    public static final ModuleType TradingNormal321 = new ModuleType("TradingNormal321", 11, "321");
    public static final ModuleType TradingNormal331 = new ModuleType("TradingNormal331", 12, "331");
    public static final ModuleType TradingNormal341 = new ModuleType("TradingNormal341", 13, "341");
    public static final ModuleType TradingNormal351 = new ModuleType("TradingNormal351", 14, "351");
    public static final ModuleType TradingQuartz = new ModuleType("TradingQuartz", 15, "361");
    public static final ModuleType TradingMarginRatio = new ModuleType("TradingMarginRatio", 16, "371");
    public static final ModuleType AffiliatePortal = new ModuleType("AffiliatePortal", 17, "401");
    public static final ModuleType Xbot = new ModuleType("Xbot", 18, "501");
    public static final ModuleType FaqArticle = new ModuleType("FaqArticle", 19, "601");
    public static final ModuleType CnCs = new ModuleType("CnCs", 20, "701");
    public static final ModuleType P2P = new ModuleType(CustomMessageData.SERVICE_NAME_P2P, 21, "801");
    public static final ModuleType P2PTranslation = new ModuleType("P2PTranslation", 22, "802");
    public static final ModuleType HelpCenter = new ModuleType("HelpCenter", 23, "901");
    public static final ModuleType OkAssistantChatbotSession = new ModuleType("OkAssistantChatbotSession", 24, "1001");
    public static final ModuleType OkAssistantAgentSession = new ModuleType("OkAssistantAgentSession", 25, "1002");
    public static final ModuleType OkAssistantAgentSessionCN = new ModuleType("OkAssistantAgentSessionCN", 26, "1003");
    public static final ModuleType OkAssistantAnswer = new ModuleType("OkAssistantAnswer", 27, "1004");
    public static final ModuleType Boss3Email = new ModuleType("Boss3Email", 28, "1005");
    public static final ModuleType Unknown = new ModuleType("Unknown", 29, "");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ModuleType[] $values() {
        return new ModuleType[]{KycLevelOne, KycLevelTwo, KycLevelThree, CoinRechargeType, CoinWithdrawalType, CoinAhcType, AffiliateType, TradingExperience, TradingBot, TradingCopy, TradingNormal311, TradingNormal321, TradingNormal331, TradingNormal341, TradingNormal351, TradingQuartz, TradingMarginRatio, AffiliatePortal, Xbot, FaqArticle, CnCs, P2P, P2PTranslation, HelpCenter, OkAssistantChatbotSession, OkAssistantAgentSession, OkAssistantAgentSessionCN, OkAssistantAnswer, Boss3Email, Unknown};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ModuleType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String getValue() {
        return this.value;
    }

    private ModuleType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        ModuleType[] moduleTypeArr$values = $values();
        $VALUES = moduleTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(moduleTypeArr$values);
    }

    public static ModuleType valueOf(String str) {
        return (ModuleType) Enum.valueOf(ModuleType.class, str);
    }

    public static ModuleType[] values() {
        return (ModuleType[]) $VALUES.clone();
    }
}
