package com.okinc.okx.paymentapi.service;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class SDUISourcePage {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SDUISourcePage[] $VALUES;
    private final String page;
    public static final SDUISourcePage DEPOSIT_TO_WITHDRAW = new SDUISourcePage("DEPOSIT_TO_WITHDRAW", 0, "depositToWithdraw");
    public static final SDUISourcePage PMC = new SDUISourcePage("PMC", 1, "PMC");
    public static final SDUISourcePage WITHDRAW = new SDUISourcePage("WITHDRAW", 2, "withdraw");
    public static final SDUISourcePage CURRENCY_SELECTION = new SDUISourcePage("CURRENCY_SELECTION", 3, "currencySelection");
    public static final SDUISourcePage ADD_ACCOUNT = new SDUISourcePage("ADD_ACCOUNT", 4, "addAccount");
    public static final SDUISourcePage PAYBACK = new SDUISourcePage("PAYBACK", 5, "payback");
    public static final SDUISourcePage PAYBACK_SUBMIT = new SDUISourcePage("PAYBACK_SUBMIT", 6, "paybackSubmit");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SDUISourcePage[] $values() {
        return new SDUISourcePage[]{DEPOSIT_TO_WITHDRAW, PMC, WITHDRAW, CURRENCY_SELECTION, ADD_ACCOUNT, PAYBACK, PAYBACK_SUBMIT};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SDUISourcePage> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPage() {
        return this.page;
    }

    private SDUISourcePage(String str, int i, String str2) {
        this.page = str2;
    }

    static {
        SDUISourcePage[] sDUISourcePageArr$values = $values();
        $VALUES = sDUISourcePageArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(sDUISourcePageArr$values);
    }

    public static SDUISourcePage valueOf(String str) {
        return (SDUISourcePage) Enum.valueOf(SDUISourcePage.class, str);
    }

    public static SDUISourcePage[] values() {
        return (SDUISourcePage[]) $VALUES.clone();
    }
}
