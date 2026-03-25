package com.okinc.okimcore.feature.agentbot.model.enums;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class AgentBotEntryInfo {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ AgentBotEntryInfo[] $VALUES;
    private final String apiValue;
    public static final AgentBotEntryInfo OtcTrade = new AgentBotEntryInfo("OtcTrade", 0, "OTC_TRADE");
    public static final AgentBotEntryInfo AccountFloatingIcon = new AgentBotEntryInfo("AccountFloatingIcon", 1, "account_floatingicon");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ AgentBotEntryInfo[] $values() {
        return new AgentBotEntryInfo[]{OtcTrade, AccountFloatingIcon};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<AgentBotEntryInfo> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getApiValue() {
        return this.apiValue;
    }

    private AgentBotEntryInfo(String str, int i, String str2) {
        this.apiValue = str2;
    }

    static {
        AgentBotEntryInfo[] agentBotEntryInfoArr$values = $values();
        $VALUES = agentBotEntryInfoArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(agentBotEntryInfoArr$values);
    }

    public static AgentBotEntryInfo valueOf(String str) {
        return (AgentBotEntryInfo) Enum.valueOf(AgentBotEntryInfo.class, str);
    }

    public static AgentBotEntryInfo[] values() {
        return (AgentBotEntryInfo[]) $VALUES.clone();
    }
}
