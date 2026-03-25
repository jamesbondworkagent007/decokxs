package com.okinc.lifecycle.api.business.clipboard;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes9.dex */
public final class ClipBoardContentType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ClipBoardContentType[] $VALUES;
    public static final ClipBoardContentType P2P_MERCHANT_PROFILE = new ClipBoardContentType("P2P_MERCHANT_PROFILE", 0, "otc/transfer");
    public static final ClipBoardContentType TRADE_SIGNAL_CLONE = new ClipBoardContentType("TRADE_SIGNAL_CLONE", 1, "SQ0079");
    private final String content;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ClipBoardContentType[] $values() {
        return new ClipBoardContentType[]{P2P_MERCHANT_PROFILE, TRADE_SIGNAL_CLONE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ClipBoardContentType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContent() {
        return this.content;
    }

    private ClipBoardContentType(String str, int i, String str2) {
        this.content = str2;
    }

    static {
        ClipBoardContentType[] clipBoardContentTypeArr$values = $values();
        $VALUES = clipBoardContentTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(clipBoardContentTypeArr$values);
    }

    public static ClipBoardContentType valueOf(String str) {
        return (ClipBoardContentType) Enum.valueOf(ClipBoardContentType.class, str);
    }

    public static ClipBoardContentType[] values() {
        return (ClipBoardContentType[]) $VALUES.clone();
    }
}
