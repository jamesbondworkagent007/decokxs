package com.okinc.business.defi.api.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.slf4j.Marker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class CurrencyPrependSign {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CurrencyPrependSign[] $VALUES;
    public static final Application Companion;
    private final String value;
    public static final CurrencyPrependSign CURRENCY_SIGN_NONE = new CurrencyPrependSign("CURRENCY_SIGN_NONE", 0, "");
    public static final CurrencyPrependSign CURRENCY_SIGN_PLUS = new CurrencyPrependSign("CURRENCY_SIGN_PLUS", 1, Marker.ANY_NON_NULL_MARKER);
    public static final CurrencyPrependSign CURRENCY_SIGN_MINUS = new CurrencyPrependSign("CURRENCY_SIGN_MINUS", 2, "-");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CurrencyPrependSign[] $values() {
        return new CurrencyPrependSign[]{CURRENCY_SIGN_NONE, CURRENCY_SIGN_PLUS, CURRENCY_SIGN_MINUS};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CurrencyPrependSign> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private CurrencyPrependSign(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        CurrencyPrependSign[] currencyPrependSignArr$values = $values();
        $VALUES = currencyPrependSignArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(currencyPrependSignArr$values);
        Companion = new Application(null);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.CurrencyPrependSign.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static CurrencyPrependSign valueOf(String str) {
        return (CurrencyPrependSign) Enum.valueOf(CurrencyPrependSign.class, str);
    }

    public static CurrencyPrependSign[] values() {
        return (CurrencyPrependSign[]) $VALUES.clone();
    }
}
