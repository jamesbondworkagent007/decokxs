package com.okinc.okimcore.model.im;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ConversationSyncStatus {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ConversationSyncStatus[] $VALUES;
    public static final ConversationSyncStatus Idle = new ConversationSyncStatus("Idle", 0);
    public static final ConversationSyncStatus Syncing = new ConversationSyncStatus("Syncing", 1);
    public static final ConversationSyncStatus Synced = new ConversationSyncStatus("Synced", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ConversationSyncStatus[] $values() {
        return new ConversationSyncStatus[]{Idle, Syncing, Synced};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConversationSyncStatus> getEntries() {
        return $ENTRIES;
    }

    private ConversationSyncStatus(String str, int i) {
    }

    static {
        ConversationSyncStatus[] conversationSyncStatusArr$values = $values();
        $VALUES = conversationSyncStatusArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(conversationSyncStatusArr$values);
    }

    public static ConversationSyncStatus valueOf(String str) {
        return (ConversationSyncStatus) Enum.valueOf(ConversationSyncStatus.class, str);
    }

    public static ConversationSyncStatus[] values() {
        return (ConversationSyncStatus[]) $VALUES.clone();
    }
}
