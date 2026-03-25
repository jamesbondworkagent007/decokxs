package com.okinc.im.imui.conversationlist.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class ConversationListSectionHeaderType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ConversationListSectionHeaderType[] $VALUES;
    public static final ConversationListSectionHeaderType SUGGESTED = new ConversationListSectionHeaderType("SUGGESTED", 0);
    public static final ConversationListSectionHeaderType TRENDING_GROUPS = new ConversationListSectionHeaderType("TRENDING_GROUPS", 1);
    public static final ConversationListSectionHeaderType MY_CHATS = new ConversationListSectionHeaderType("MY_CHATS", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ConversationListSectionHeaderType[] $values() {
        return new ConversationListSectionHeaderType[]{SUGGESTED, TRENDING_GROUPS, MY_CHATS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ConversationListSectionHeaderType> getEntries() {
        return $ENTRIES;
    }

    private ConversationListSectionHeaderType(String str, int i) {
    }

    static {
        ConversationListSectionHeaderType[] conversationListSectionHeaderTypeArr$values = $values();
        $VALUES = conversationListSectionHeaderTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(conversationListSectionHeaderTypeArr$values);
    }

    public static ConversationListSectionHeaderType valueOf(String str) {
        return (ConversationListSectionHeaderType) Enum.valueOf(ConversationListSectionHeaderType.class, str);
    }

    public static ConversationListSectionHeaderType[] values() {
        return (ConversationListSectionHeaderType[]) $VALUES.clone();
    }
}
