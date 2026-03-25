package com.okinc.okimcore.model.im.inhouseim.ws;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class MessageHandlingType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MessageHandlingType[] $VALUES;
    private final int value;
    public static final MessageHandlingType UNKNOWN = new MessageHandlingType("UNKNOWN", 0, -1);
    public static final MessageHandlingType REPLACE = new MessageHandlingType("REPLACE", 1, 0);
    public static final MessageHandlingType DELETE = new MessageHandlingType("DELETE", 2, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MessageHandlingType[] $values() {
        return new MessageHandlingType[]{UNKNOWN, REPLACE, DELETE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MessageHandlingType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private MessageHandlingType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        MessageHandlingType[] messageHandlingTypeArr$values = $values();
        $VALUES = messageHandlingTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(messageHandlingTypeArr$values);
    }

    public static MessageHandlingType valueOf(String str) {
        return (MessageHandlingType) Enum.valueOf(MessageHandlingType.class, str);
    }

    public static MessageHandlingType[] values() {
        return (MessageHandlingType[]) $VALUES.clone();
    }
}
