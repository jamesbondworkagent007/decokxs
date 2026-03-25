package com.okinc.okimcore.model.room.inhouseim;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class MessageStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ MessageStatus[] $VALUES;
    private final int status;
    public static final MessageStatus Normal = new MessageStatus("Normal", 0, 0);
    public static final MessageStatus Deleted = new MessageStatus("Deleted", 1, 1);
    public static final MessageStatus Rejected = new MessageStatus("Rejected", 2, 2);
    public static final MessageStatus SenderRecalled = new MessageStatus("SenderRecalled", 3, 3);
    public static final MessageStatus AdminRecalled = new MessageStatus("AdminRecalled", 4, 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ MessageStatus[] $values() {
        return new MessageStatus[]{Normal, Deleted, Rejected, SenderRecalled, AdminRecalled};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<MessageStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    private MessageStatus(String str, int i, int i2) {
        this.status = i2;
    }

    static {
        MessageStatus[] messageStatusArr$values = $values();
        $VALUES = messageStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(messageStatusArr$values);
    }

    public static MessageStatus valueOf(String str) {
        return (MessageStatus) Enum.valueOf(MessageStatus.class, str);
    }

    public static MessageStatus[] values() {
        return (MessageStatus[]) $VALUES.clone();
    }
}
