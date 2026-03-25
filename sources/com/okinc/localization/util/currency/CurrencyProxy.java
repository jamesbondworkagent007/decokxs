package com.okinc.localization.util.currency;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class CurrencyProxy {
    private static Function1<? super String, String> currencySymbolCallback;
    public static final CurrencyProxy INSTANCE = new CurrencyProxy();
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.String>, kotlin.jvm.functions.Function1<java.lang.String, java.lang.String> */
    public final Function1<String, String> getCurrencySymbolCallback() {
        return currencySymbolCallback;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencySymbolCallback(Function1<? super String, String> function1) {
        currencySymbolCallback = function1;
    }

    private CurrencyProxy() {
    }
}
