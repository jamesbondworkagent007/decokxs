package com.okinc.business.web3pay.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class CurrencyDisplayStyle {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CurrencyDisplayStyle[] $VALUES;
    public static final ActionBar Companion;
    private final int value;
    public static final CurrencyDisplayStyle CURRENCY_CODE_SUFFIX = new CurrencyDisplayStyle("CURRENCY_CODE_SUFFIX", 0, 0);
    public static final CurrencyDisplayStyle CURRENCY_SYMBOL_PREFIX = new CurrencyDisplayStyle("CURRENCY_SYMBOL_PREFIX", 1, 1);
    public static final CurrencyDisplayStyle CURRENCY_AMOUNT_ONLY = new CurrencyDisplayStyle("CURRENCY_AMOUNT_ONLY", 2, 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CurrencyDisplayStyle[] $values() {
        return new CurrencyDisplayStyle[]{CURRENCY_CODE_SUFFIX, CURRENCY_SYMBOL_PREFIX, CURRENCY_AMOUNT_ONLY};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CurrencyDisplayStyle> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getValue() {
        return this.value;
    }

    private CurrencyDisplayStyle(String str, int i, int i2) {
        this.value = i2;
    }

    static {
        CurrencyDisplayStyle[] currencyDisplayStyleArr$values = $values();
        $VALUES = currencyDisplayStyleArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(currencyDisplayStyleArr$values);
        Companion = new ActionBar(null);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.CurrencyDisplayStyle.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static CurrencyDisplayStyle valueOf(String str) {
        return (CurrencyDisplayStyle) Enum.valueOf(CurrencyDisplayStyle.class, str);
    }

    public static CurrencyDisplayStyle[] values() {
        return (CurrencyDisplayStyle[]) $VALUES.clone();
    }
}
