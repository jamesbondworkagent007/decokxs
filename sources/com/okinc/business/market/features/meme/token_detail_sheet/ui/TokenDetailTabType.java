package com.okinc.business.market.features.meme.token_detail_sheet.ui;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes7.dex */
public final class TokenDetailTabType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenDetailTabType[] $VALUES;
    public static final TokenDetailTabType TOKEN = new TokenDetailTabType("TOKEN", 0);
    public static final TokenDetailTabType SOCIAL = new TokenDetailTabType("SOCIAL", 1);
    public static final TokenDetailTabType DATA = new TokenDetailTabType("DATA", 2);
    public static final TokenDetailTabType TAG_EXPLANATION = new TokenDetailTabType("TAG_EXPLANATION", 3);
    public static final TokenDetailTabType DEV_TOKEN = new TokenDetailTabType("DEV_TOKEN", 4);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenDetailTabType[] $values() {
        return new TokenDetailTabType[]{TOKEN, SOCIAL, DATA, TAG_EXPLANATION, DEV_TOKEN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenDetailTabType> getEntries() {
        return $ENTRIES;
    }

    private TokenDetailTabType(String str, int i) {
    }

    static {
        TokenDetailTabType[] tokenDetailTabTypeArr$values = $values();
        $VALUES = tokenDetailTabTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenDetailTabTypeArr$values);
    }

    public static TokenDetailTabType valueOf(String str) {
        return (TokenDetailTabType) Enum.valueOf(TokenDetailTabType.class, str);
    }

    public static TokenDetailTabType[] values() {
        return (TokenDetailTabType[]) $VALUES.clone();
    }
}
