package com.okinc.im.imui.privacy;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class SecurityType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SecurityType[] $VALUES;
    public static final SecurityType IM_CONTACT_DISCOVERY = new SecurityType("IM_CONTACT_DISCOVERY", 0);
    public static final SecurityType IM_GROUP_SEARCH_ADD = new SecurityType("IM_GROUP_SEARCH_ADD", 1);
    public static final SecurityType IM_RECEIVE_INAPP_NOTIFICATION = new SecurityType("IM_RECEIVE_INAPP_NOTIFICATION", 2);
    public static final SecurityType IM_ALLOW_CHAT_VIA_PROFILE = new SecurityType("IM_ALLOW_CHAT_VIA_PROFILE", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SecurityType[] $values() {
        return new SecurityType[]{IM_CONTACT_DISCOVERY, IM_GROUP_SEARCH_ADD, IM_RECEIVE_INAPP_NOTIFICATION, IM_ALLOW_CHAT_VIA_PROFILE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SecurityType> getEntries() {
        return $ENTRIES;
    }

    private SecurityType(String str, int i) {
    }

    static {
        SecurityType[] securityTypeArr$values = $values();
        $VALUES = securityTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(securityTypeArr$values);
    }

    public static SecurityType valueOf(String str) {
        return (SecurityType) Enum.valueOf(SecurityType.class, str);
    }

    public static SecurityType[] values() {
        return (SecurityType[]) $VALUES.clone();
    }
}
