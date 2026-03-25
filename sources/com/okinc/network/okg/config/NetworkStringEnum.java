package com.okinc.network.okg.config;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class NetworkStringEnum {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NetworkStringEnum[] $VALUES;
    private final String type;
    public static final NetworkStringEnum NETWORK_ERROR = new NetworkStringEnum("NETWORK_ERROR", 0, "network_error");
    public static final NetworkStringEnum IDAUTH_LINK = new NetworkStringEnum("IDAUTH_LINK", 1, "idauth_link_domain");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NetworkStringEnum[] $values() {
        return new NetworkStringEnum[]{NETWORK_ERROR, IDAUTH_LINK};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NetworkStringEnum> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private NetworkStringEnum(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        NetworkStringEnum[] networkStringEnumArr$values = $values();
        $VALUES = networkStringEnumArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(networkStringEnumArr$values);
    }

    public static NetworkStringEnum valueOf(String str) {
        return (NetworkStringEnum) Enum.valueOf(NetworkStringEnum.class, str);
    }

    public static NetworkStringEnum[] values() {
        return (NetworkStringEnum[]) $VALUES.clone();
    }
}
