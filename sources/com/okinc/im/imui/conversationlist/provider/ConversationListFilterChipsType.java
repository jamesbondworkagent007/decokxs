package com.okinc.im.imui.conversationlist.provider;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class ConversationListFilterChipsType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ConversationListFilterChipsType[] $VALUES;
    public static final ConversationListFilterChipsType ALL = new ConversationListFilterChipsType("ALL", 0);
    public static final ConversationListFilterChipsType UNREAD = new ConversationListFilterChipsType("UNREAD", 1);
    public static final ConversationListFilterChipsType FLAGGED = new ConversationListFilterChipsType("FLAGGED", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ConversationListFilterChipsType[] $values() {
        return new ConversationListFilterChipsType[]{ALL, UNREAD, FLAGGED};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConversationListFilterChipsType> getEntries() {
        return $ENTRIES;
    }

    private ConversationListFilterChipsType(String str, int i) {
    }

    static {
        ConversationListFilterChipsType[] conversationListFilterChipsTypeArr$values = $values();
        $VALUES = conversationListFilterChipsTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(conversationListFilterChipsTypeArr$values);
    }

    public static ConversationListFilterChipsType valueOf(String str) {
        return (ConversationListFilterChipsType) Enum.valueOf(ConversationListFilterChipsType.class, str);
    }

    public static ConversationListFilterChipsType[] values() {
        return (ConversationListFilterChipsType[]) $VALUES.clone();
    }
}
