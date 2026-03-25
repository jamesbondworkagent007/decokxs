package com.okinc.network.okg.dns.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class NetType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ NetType[] $VALUES;
    public static final NetType HTTP = new NetType("HTTP", 0);
    public static final NetType WebSocket = new NetType("WebSocket", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ NetType[] $values() {
        return new NetType[]{HTTP, WebSocket};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<NetType> getEntries() {
        return $ENTRIES;
    }

    private NetType(String str, int i) {
    }

    static {
        NetType[] netTypeArr$values = $values();
        $VALUES = netTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(netTypeArr$values);
    }

    public static NetType valueOf(String str) {
        return (NetType) Enum.valueOf(NetType.class, str);
    }

    public static NetType[] values() {
        return (NetType[]) $VALUES.clone();
    }
}
