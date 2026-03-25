package com.okinc.okimcore.model.share;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class ShareTargetType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ShareTargetType[] $VALUES;
    public static final ShareTargetType Conversation = new ShareTargetType("Conversation", 0);
    public static final ShareTargetType Contact = new ShareTargetType("Contact", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ShareTargetType[] $values() {
        return new ShareTargetType[]{Conversation, Contact};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ShareTargetType> getEntries() {
        return $ENTRIES;
    }

    static {
        ShareTargetType[] shareTargetTypeArr$values = $values();
        $VALUES = shareTargetTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(shareTargetTypeArr$values);
    }

    private ShareTargetType(String str, int i) {
    }

    public static ShareTargetType valueOf(String str) {
        return (ShareTargetType) Enum.valueOf(ShareTargetType.class, str);
    }

    public static ShareTargetType[] values() {
        return (ShareTargetType[]) $VALUES.clone();
    }
}
