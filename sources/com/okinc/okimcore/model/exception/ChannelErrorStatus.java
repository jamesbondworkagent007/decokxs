package com.okinc.okimcore.model.exception;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ChannelErrorStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ChannelErrorStatus[] $VALUES;
    public static final ChannelErrorStatus Unknown = new ChannelErrorStatus("Unknown", 0);
    public static final ChannelErrorStatus DisconnectByKick = new ChannelErrorStatus("DisconnectByKick", 1);
    public static final ChannelErrorStatus NotInGroup = new ChannelErrorStatus("NotInGroup", 2);
    public static final ChannelErrorStatus InvalidChannel = new ChannelErrorStatus("InvalidChannel", 3);
    public static final ChannelErrorStatus RejectedByBlackList = new ChannelErrorStatus("RejectedByBlackList", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ChannelErrorStatus[] $values() {
        return new ChannelErrorStatus[]{Unknown, DisconnectByKick, NotInGroup, InvalidChannel, RejectedByBlackList};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ChannelErrorStatus> getEntries() {
        return $ENTRIES;
    }

    private ChannelErrorStatus(String str, int i) {
    }

    static {
        ChannelErrorStatus[] channelErrorStatusArr$values = $values();
        $VALUES = channelErrorStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(channelErrorStatusArr$values);
    }

    public static ChannelErrorStatus valueOf(String str) {
        return (ChannelErrorStatus) Enum.valueOf(ChannelErrorStatus.class, str);
    }

    public static ChannelErrorStatus[] values() {
        return (ChannelErrorStatus[]) $VALUES.clone();
    }
}
