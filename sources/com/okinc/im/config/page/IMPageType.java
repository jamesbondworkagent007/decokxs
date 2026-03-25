package com.okinc.im.config.page;

import com.okinc.okimcore.model.im.inhouseim.ws.CustomMessageData;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class IMPageType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ IMPageType[] $VALUES;
    public static final IMPageType NORMAL_IM = new IMPageType("NORMAL_IM", 0);
    public static final IMPageType P2P = new IMPageType(CustomMessageData.SERVICE_NAME_P2P, 1);
    public static final IMPageType P2P_CS_CHAT = new IMPageType("P2P_CS_CHAT", 2);
    public static final IMPageType OTC_AGENT_BOT = new IMPageType("OTC_AGENT_BOT", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ IMPageType[] $values() {
        return new IMPageType[]{NORMAL_IM, P2P, P2P_CS_CHAT, OTC_AGENT_BOT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<IMPageType> getEntries() {
        return $ENTRIES;
    }

    private IMPageType(String str, int i) {
    }

    static {
        IMPageType[] iMPageTypeArr$values = $values();
        $VALUES = iMPageTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(iMPageTypeArr$values);
    }

    public static IMPageType valueOf(String str) {
        return (IMPageType) Enum.valueOf(IMPageType.class, str);
    }

    public static IMPageType[] values() {
        return (IMPageType[]) $VALUES.clone();
    }
}
