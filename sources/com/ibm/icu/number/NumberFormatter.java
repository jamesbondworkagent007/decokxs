package com.ibm.icu.number;

import com.ibm.icu.impl.number.DecimalFormatProperties;
import com.ibm.icu.text.DecimalFormatSymbols;
import com.ibm.icu.util.ULocale;
import java.util.Locale;
import o.C7187afB;
import o.C7232afu;
import o.C7233afv;

/* JADX INFO: loaded from: classes3.dex */
public final class NumberFormatter {
    public static final C7187afB AEQbTJ = new C7187afB();

    public enum DecimalSeparatorDisplay {
        AUTO,
        ALWAYS
    }

    public enum GroupingStrategy {
        OFF,
        MIN2,
        AUTO,
        ON_ALIGNED,
        THOUSANDS
    }

    public enum SignDisplay {
        AUTO,
        ALWAYS,
        NEVER,
        ACCOUNTING,
        ACCOUNTING_ALWAYS,
        EXCEPT_ZERO,
        ACCOUNTING_EXCEPT_ZERO
    }

    public enum UnitWidth {
        NARROW,
        SHORT,
        FULL_NAME,
        ISO_CODE,
        FORMAL,
        VARIANT,
        HIDDEN
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static C7187afB EZpvd() {
        return AEQbTJ;
    }

    private NumberFormatter() {
    }

    public static C7232afu EZpvd(Locale locale) {
        return AEQbTJ.copydefault(locale);
    }

    public static C7232afu AEQbTJ(ULocale uLocale) {
        return AEQbTJ.EZpvd(uLocale);
    }

    public static C7187afB KWHzl(String str) {
        return NumberSkeletonImpl.copydefault(str);
    }

    @Deprecated
    public static C7187afB OLrzqt(DecimalFormatProperties decimalFormatProperties, DecimalFormatSymbols decimalFormatSymbols, DecimalFormatProperties decimalFormatProperties2) {
        return C7233afv.OLrzqt(decimalFormatProperties, decimalFormatSymbols, decimalFormatProperties2);
    }
}
