package com.okinc.im.message;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class MessageClusterType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MessageClusterType[] $VALUES;
    public static final MessageClusterType First = new MessageClusterType("First", 0);
    public static final MessageClusterType Middle = new MessageClusterType("Middle", 1);
    public static final MessageClusterType RECALLED = new MessageClusterType("RECALLED", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MessageClusterType[] $values() {
        return new MessageClusterType[]{First, Middle, RECALLED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MessageClusterType> getEntries() {
        return $ENTRIES;
    }

    private MessageClusterType(String str, int i) {
    }

    static {
        MessageClusterType[] messageClusterTypeArr$values = $values();
        $VALUES = messageClusterTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(messageClusterTypeArr$values);
    }

    public static MessageClusterType valueOf(String str) {
        return (MessageClusterType) Enum.valueOf(MessageClusterType.class, str);
    }

    public static MessageClusterType[] values() {
        return (MessageClusterType[]) $VALUES.clone();
    }
}
