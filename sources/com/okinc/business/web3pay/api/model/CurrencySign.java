package com.okinc.business.web3pay.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.slf4j.Marker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes15.dex */
public final class CurrencySign {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CurrencySign[] $VALUES;
    public static final ActionBar Companion;
    private final String value;
    public static final CurrencySign CURRENCY_SIGN_PLUS = new CurrencySign("CURRENCY_SIGN_PLUS", 0, Marker.ANY_NON_NULL_MARKER);
    public static final CurrencySign CURRENCY_SIGN_MINUS = new CurrencySign("CURRENCY_SIGN_MINUS", 1, "-");
    public static final CurrencySign CURRENCY_SIGN_EMPTY = new CurrencySign("CURRENCY_SIGN_EMPTY", 2, "");
    public static final CurrencySign CURRENCY_SIGN_APPROX = new CurrencySign("CURRENCY_SIGN_APPROX", 3, "≈ ");
    public static final CurrencySign CURRENCY_SIGN_APPROX_SINGLE = new CurrencySign("CURRENCY_SIGN_APPROX_SINGLE", 4, "~ ");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CurrencySign[] $values() {
        return new CurrencySign[]{CURRENCY_SIGN_PLUS, CURRENCY_SIGN_MINUS, CURRENCY_SIGN_EMPTY, CURRENCY_SIGN_APPROX, CURRENCY_SIGN_APPROX_SINGLE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CurrencySign> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private CurrencySign(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        CurrencySign[] currencySignArr$values = $values();
        $VALUES = currencySignArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(currencySignArr$values);
        Companion = new ActionBar(null);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.web3pay.api.model.CurrencySign.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }

    public static CurrencySign valueOf(String str) {
        return (CurrencySign) Enum.valueOf(CurrencySign.class, str);
    }

    public static CurrencySign[] values() {
        return (CurrencySign[]) $VALUES.clone();
    }
}
