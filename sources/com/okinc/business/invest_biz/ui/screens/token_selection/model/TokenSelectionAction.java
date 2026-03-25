package com.okinc.business.invest_biz.ui.screens.token_selection.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
public final class TokenSelectionAction {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ TokenSelectionAction[] $VALUES;
    public static final TokenSelectionAction Invest = new TokenSelectionAction("Invest", 0);
    public static final TokenSelectionAction Redeem = new TokenSelectionAction("Redeem", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ TokenSelectionAction[] $values() {
        return new TokenSelectionAction[]{Invest, Redeem};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<TokenSelectionAction> getEntries() {
        return $ENTRIES;
    }

    private TokenSelectionAction(String str, int i) {
    }

    static {
        TokenSelectionAction[] tokenSelectionActionArr$values = $values();
        $VALUES = tokenSelectionActionArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(tokenSelectionActionArr$values);
    }

    public static TokenSelectionAction valueOf(String str) {
        return (TokenSelectionAction) Enum.valueOf(TokenSelectionAction.class, str);
    }

    public static TokenSelectionAction[] values() {
        return (TokenSelectionAction[]) $VALUES.clone();
    }
}
