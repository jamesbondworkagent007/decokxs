package com.okinc.crcore.coreapi.net.responsebean.content;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class CommunityPostFormatType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CommunityPostFormatType[] $VALUES;
    private final int value;
    public static final CommunityPostFormatType RICH_TEXT = new CommunityPostFormatType("RICH_TEXT", 0, 1);
    public static final CommunityPostFormatType NORMAL_TEXT = new CommunityPostFormatType("NORMAL_TEXT", 1, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CommunityPostFormatType[] $values() {
        return new CommunityPostFormatType[]{RICH_TEXT, NORMAL_TEXT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CommunityPostFormatType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private CommunityPostFormatType(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        CommunityPostFormatType[] communityPostFormatTypeArr$values = $values();
        $VALUES = communityPostFormatTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(communityPostFormatTypeArr$values);
    }

    public static CommunityPostFormatType valueOf(String str) {
        return (CommunityPostFormatType) Enum.valueOf(CommunityPostFormatType.class, str);
    }

    public static CommunityPostFormatType[] values() {
        return (CommunityPostFormatType[]) $VALUES.clone();
    }
}
