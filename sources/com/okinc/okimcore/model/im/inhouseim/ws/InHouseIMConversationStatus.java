package com.okinc.okimcore.model.im.inhouseim.ws;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class InHouseIMConversationStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ InHouseIMConversationStatus[] $VALUES;
    private final int status;
    public static final InHouseIMConversationStatus NORMAL = new InHouseIMConversationStatus("NORMAL", 0, 0);
    public static final InHouseIMConversationStatus CONVERSATION_REMOVED = new InHouseIMConversationStatus("CONVERSATION_REMOVED", 1, 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ InHouseIMConversationStatus[] $values() {
        return new InHouseIMConversationStatus[]{NORMAL, CONVERSATION_REMOVED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<InHouseIMConversationStatus> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    private InHouseIMConversationStatus(String str, int i, int i2) {
        this.status = i2;
    }

    static {
        InHouseIMConversationStatus[] inHouseIMConversationStatusArr$values = $values();
        $VALUES = inHouseIMConversationStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(inHouseIMConversationStatusArr$values);
    }

    public static InHouseIMConversationStatus valueOf(String str) {
        return (InHouseIMConversationStatus) Enum.valueOf(InHouseIMConversationStatus.class, str);
    }

    public static InHouseIMConversationStatus[] values() {
        return (InHouseIMConversationStatus[]) $VALUES.clone();
    }
}
