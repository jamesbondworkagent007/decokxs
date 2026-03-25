package com.okinc.okimcore.model.im;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ChannelConnectionStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChannelConnectionStatus[] $VALUES;
    public static final ChannelConnectionStatus Unknown = new ChannelConnectionStatus("Unknown", 0);
    public static final ChannelConnectionStatus KickedOff = new ChannelConnectionStatus("KickedOff", 1);
    public static final ChannelConnectionStatus Timeout = new ChannelConnectionStatus("Timeout", 2);
    public static final ChannelConnectionStatus Connected = new ChannelConnectionStatus("Connected", 3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChannelConnectionStatus[] $values() {
        return new ChannelConnectionStatus[]{Unknown, KickedOff, Timeout, Connected};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChannelConnectionStatus> getEntries() {
        return $ENTRIES;
    }

    private ChannelConnectionStatus(String str, int i) {
    }

    static {
        ChannelConnectionStatus[] channelConnectionStatusArr$values = $values();
        $VALUES = channelConnectionStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(channelConnectionStatusArr$values);
    }

    public static ChannelConnectionStatus valueOf(String str) {
        return (ChannelConnectionStatus) Enum.valueOf(ChannelConnectionStatus.class, str);
    }

    public static ChannelConnectionStatus[] values() {
        return (ChannelConnectionStatus[]) $VALUES.clone();
    }
}
