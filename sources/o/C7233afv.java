package o;

import com.ibm.icu.impl.number.CustomSymbolCurrency;
import com.ibm.icu.impl.number.DecimalFormatProperties;
import com.ibm.icu.impl.number.Padder;
import com.ibm.icu.impl.number.PatternStringUtils;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.text.CompactDecimalFormat;
import com.ibm.icu.text.DecimalFormatSymbols;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.util.Currency;
import com.ibm.icu.util.ULocale;
import java.math.BigDecimal;
import java.math.MathContext;
import o.AbstractC7236afy;

/* JADX INFO: renamed from: o.afv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7233afv {
    public static C7187afB OLrzqt(DecimalFormatProperties decimalFormatProperties, DecimalFormatSymbols decimalFormatSymbols, DecimalFormatProperties decimalFormatProperties2) {
        return NumberFormatter.EZpvd().OLrzqt(copydefault(decimalFormatProperties, decimalFormatSymbols, decimalFormatProperties2));
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C7168aej copydefault(DecimalFormatProperties decimalFormatProperties, DecimalFormatSymbols decimalFormatSymbols, DecimalFormatProperties decimalFormatProperties2) {
        AbstractC7236afy abstractC7236afyOLrzqt;
        int i;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        int iScale;
        int iScale2;
        C7168aej c7168aej = new C7168aej();
        ULocale uLocale = decimalFormatSymbols.getULocale();
        c7168aej.fetchVPNInfo = decimalFormatSymbols;
        PluralRules pluralRules = decimalFormatProperties.getPluralRules();
        if (pluralRules == null && decimalFormatProperties.getCurrencyPluralInfo() != null) {
            pluralRules = decimalFormatProperties.getCurrencyPluralInfo().getPluralRules();
        }
        c7168aej.DbNXlk = pluralRules;
        InterfaceC7102adW interfaceC7102adWOLrzqt = C7181aew.OLrzqt(decimalFormatProperties);
        c7168aej.AEQbTJ = interfaceC7102adWOLrzqt;
        boolean z = (decimalFormatProperties.getCurrency() == null && decimalFormatProperties.getCurrencyPluralInfo() == null && decimalFormatProperties.getCurrencyUsage() == null && !interfaceC7102adWOLrzqt.KWHzl()) ? false : true;
        Currency currencyResolve = CustomSymbolCurrency.resolve(decimalFormatProperties.getCurrency(), uLocale, decimalFormatSymbols);
        Currency.CurrencyUsage currencyUsage = decimalFormatProperties.getCurrencyUsage();
        boolean z2 = currencyUsage != null;
        if (!z2) {
            currencyUsage = Currency.CurrencyUsage.STANDARD;
        }
        if (z) {
            c7168aej.ejfBZ = currencyResolve;
        }
        int maximumIntegerDigits = decimalFormatProperties.getMaximumIntegerDigits();
        int minimumIntegerDigits = decimalFormatProperties.getMinimumIntegerDigits();
        int maximumFractionDigits = decimalFormatProperties.getMaximumFractionDigits();
        int minimumFractionDigits = decimalFormatProperties.getMinimumFractionDigits();
        int minimumSignificantDigits = decimalFormatProperties.getMinimumSignificantDigits();
        int maximumSignificantDigits = decimalFormatProperties.getMaximumSignificantDigits();
        BigDecimal roundingIncrement = decimalFormatProperties.getRoundingIncrement();
        MathContext mathContextEZpvd = C7180aev.EZpvd(decimalFormatProperties);
        boolean z3 = (minimumFractionDigits == -1 && maximumFractionDigits == -1) ? false : true;
        boolean z4 = (minimumSignificantDigits == -1 && maximumSignificantDigits == -1) ? false : true;
        if (z) {
            if (minimumFractionDigits == -1 && maximumFractionDigits == -1) {
                minimumFractionDigits = currencyResolve.getDefaultFractionDigits(currencyUsage);
                maximumFractionDigits = currencyResolve.getDefaultFractionDigits(currencyUsage);
            } else if (minimumFractionDigits == -1) {
                minimumFractionDigits = java.lang.Math.min(maximumFractionDigits, currencyResolve.getDefaultFractionDigits(currencyUsage));
            } else if (maximumFractionDigits == -1) {
                maximumFractionDigits = java.lang.Math.max(minimumFractionDigits, currencyResolve.getDefaultFractionDigits(currencyUsage));
            }
        }
        if (minimumIntegerDigits != 0 || maximumFractionDigits == 0) {
            if (minimumFractionDigits < 0) {
                minimumFractionDigits = 0;
            }
            if (maximumFractionDigits < 0) {
                maximumFractionDigits = -1;
            } else if (maximumFractionDigits < minimumFractionDigits) {
                maximumFractionDigits = minimumFractionDigits;
            }
            if (minimumIntegerDigits <= 0 || minimumIntegerDigits > 999) {
                minimumIntegerDigits = 1;
            }
            if (maximumIntegerDigits >= 0) {
                if (maximumIntegerDigits < minimumIntegerDigits) {
                    maximumIntegerDigits = minimumIntegerDigits;
                } else if (maximumIntegerDigits > 999) {
                    maximumIntegerDigits = -1;
                }
            }
        } else {
            if (minimumFractionDigits < 0 || (minimumFractionDigits == 0 && maximumIntegerDigits == 0)) {
                minimumFractionDigits = 1;
            }
            if (maximumFractionDigits < 0) {
                maximumFractionDigits = -1;
            } else if (maximumFractionDigits < minimumFractionDigits) {
                maximumFractionDigits = minimumFractionDigits;
            }
            if (maximumIntegerDigits < 0 || maximumIntegerDigits > 999) {
                maximumIntegerDigits = -1;
            }
            minimumIntegerDigits = 0;
        }
        if (z2) {
            abstractC7236afyOLrzqt = AbstractC7236afy.OLrzqt(currencyUsage).EZpvd(currencyResolve);
        } else if (roundingIncrement != null) {
            if (PatternStringUtils.EZpvd(roundingIncrement, maximumFractionDigits)) {
                abstractC7236afyOLrzqt = AbstractC7236afy.copydefault(minimumFractionDigits, maximumFractionDigits);
            } else {
                abstractC7236afyOLrzqt = AbstractC7236afy.AEQbTJ(roundingIncrement);
            }
        } else if (z4) {
            if (minimumSignificantDigits < 1) {
                minimumSignificantDigits = 1;
                i = 999;
            } else {
                i = 999;
                if (minimumSignificantDigits > 999) {
                    minimumSignificantDigits = 999;
                }
            }
            if (maximumSignificantDigits >= 0) {
                if (maximumSignificantDigits < minimumSignificantDigits) {
                    maximumSignificantDigits = minimumSignificantDigits;
                } else if (maximumSignificantDigits > i) {
                    maximumSignificantDigits = i;
                }
                abstractC7236afyOLrzqt = AbstractC7236afy.KWHzl(minimumSignificantDigits, maximumSignificantDigits);
            }
        } else if (z3) {
            abstractC7236afyOLrzqt = AbstractC7236afy.copydefault(minimumFractionDigits, maximumFractionDigits);
        } else {
            abstractC7236afyOLrzqt = z ? AbstractC7236afy.OLrzqt(currencyUsage) : null;
        }
        if (abstractC7236afyOLrzqt != null) {
            abstractC7236afyOLrzqt = abstractC7236afyOLrzqt.KWHzl(mathContextEZpvd);
            c7168aej.valueOf = abstractC7236afyOLrzqt;
        }
        c7168aej.OLrzqt = C7228afq.KWHzl(minimumIntegerDigits).AEQbTJ(maximumIntegerDigits);
        c7168aej.EZpvd = C7166aeh.AEQbTJ(decimalFormatProperties);
        if (decimalFormatProperties.getFormatWidth() > 0) {
            c7168aej.djBIcL = Padder.AEQbTJ(decimalFormatProperties);
        }
        c7168aej.KWHzl = decimalFormatProperties.getDecimalSeparatorAlwaysShown() ? NumberFormatter.DecimalSeparatorDisplay.ALWAYS : NumberFormatter.DecimalSeparatorDisplay.AUTO;
        c7168aej.AkhnZx = decimalFormatProperties.getSignAlwaysShown() ? NumberFormatter.SignDisplay.ALWAYS : NumberFormatter.SignDisplay.AUTO;
        if (decimalFormatProperties.getMinimumExponentDigits() != -1) {
            if (maximumIntegerDigits > 8) {
                c7168aej.OLrzqt = C7228afq.KWHzl(minimumIntegerDigits).AEQbTJ(minimumIntegerDigits);
                maximumIntegerDigits = minimumIntegerDigits;
            } else if (maximumIntegerDigits > minimumIntegerDigits && minimumIntegerDigits > 1) {
                c7168aej.OLrzqt = C7228afq.KWHzl(1).AEQbTJ(maximumIntegerDigits);
                minimumIntegerDigits = 1;
            }
            int i2 = maximumIntegerDigits < 0 ? -1 : maximumIntegerDigits;
            c7168aej.AYXKKw = new C7234afw(i2, i2 == minimumIntegerDigits, decimalFormatProperties.getMinimumExponentDigits(), decimalFormatProperties.getExponentSignAlwaysShown() ? NumberFormatter.SignDisplay.ALWAYS : NumberFormatter.SignDisplay.AUTO);
            if (c7168aej.valueOf instanceof AbstractC7224afm) {
                int maximumIntegerDigits2 = decimalFormatProperties.getMaximumIntegerDigits();
                int minimumIntegerDigits2 = decimalFormatProperties.getMinimumIntegerDigits();
                int minimumFractionDigits2 = decimalFormatProperties.getMinimumFractionDigits();
                int maximumFractionDigits2 = decimalFormatProperties.getMaximumFractionDigits();
                if (minimumIntegerDigits2 == 0 && maximumFractionDigits2 == 0) {
                    c7168aej.valueOf = AbstractC7236afy.AEQbTJ().KWHzl(mathContextEZpvd);
                } else if (minimumIntegerDigits2 == 0 && minimumFractionDigits2 == 0) {
                    c7168aej.valueOf = AbstractC7236afy.KWHzl(1, maximumFractionDigits2 + 1).KWHzl(mathContextEZpvd);
                } else {
                    c7168aej.valueOf = AbstractC7236afy.KWHzl(((maximumIntegerDigits2 <= minimumIntegerDigits2 || minimumIntegerDigits2 <= 1) ? minimumIntegerDigits2 : 1) + minimumFractionDigits2, maximumFractionDigits2 + minimumIntegerDigits2).KWHzl(mathContextEZpvd);
                }
            }
        }
        if (decimalFormatProperties.getCompactStyle() != null) {
            if (decimalFormatProperties.getCompactCustomData() != null) {
                c7168aej.AYXKKw = new C7220afi(decimalFormatProperties.getCompactCustomData());
            } else if (decimalFormatProperties.getCompactStyle() == CompactDecimalFormat.CompactStyle.LONG) {
                c7168aej.AYXKKw = C7230afs.EZpvd();
            } else {
                c7168aej.AYXKKw = C7230afs.AEQbTJ();
            }
            bigDecimal = null;
            c7168aej.AEQbTJ = null;
        } else {
            bigDecimal = null;
        }
        c7168aej.isConnected = C7180aev.OLrzqt(decimalFormatProperties);
        if (decimalFormatProperties2 != null) {
            decimalFormatProperties2.setCurrency(currencyResolve);
            decimalFormatProperties2.setMathContext(mathContextEZpvd);
            decimalFormatProperties2.setRoundingMode(mathContextEZpvd.getRoundingMode());
            decimalFormatProperties2.setMinimumIntegerDigits(minimumIntegerDigits);
            if (maximumIntegerDigits == -1) {
                maximumIntegerDigits = Integer.MAX_VALUE;
            }
            decimalFormatProperties2.setMaximumIntegerDigits(maximumIntegerDigits);
            if (abstractC7236afyOLrzqt instanceof AbstractC7226afo) {
                abstractC7236afyOLrzqt = ((AbstractC7226afo) abstractC7236afyOLrzqt).EZpvd(currencyResolve);
            }
            if (abstractC7236afyOLrzqt instanceof AbstractC7236afy.ActionBar) {
                AbstractC7236afy.ActionBar actionBar = (AbstractC7236afy.ActionBar) abstractC7236afyOLrzqt;
                minimumFractionDigits = actionBar.DbNXlk;
                maximumFractionDigits = actionBar.fetchVPNInfo;
            } else if (abstractC7236afyOLrzqt instanceof AbstractC7236afy.Dialog) {
                bigDecimal2 = ((AbstractC7236afy.Dialog) abstractC7236afyOLrzqt).fARcdN;
                iScale = bigDecimal2.scale();
                iScale2 = bigDecimal2.scale();
                decimalFormatProperties2.setMinimumFractionDigits(iScale);
                decimalFormatProperties2.setMaximumFractionDigits(iScale2);
                decimalFormatProperties2.setMinimumSignificantDigits(minimumSignificantDigits);
                decimalFormatProperties2.setMaximumSignificantDigits(maximumSignificantDigits);
                decimalFormatProperties2.setRoundingIncrement(bigDecimal2);
            } else if (abstractC7236afyOLrzqt instanceof AbstractC7236afy.LoaderManager) {
                AbstractC7236afy.LoaderManager loaderManager = (AbstractC7236afy.LoaderManager) abstractC7236afyOLrzqt;
                minimumSignificantDigits = loaderManager.fetchVPNInfo;
                maximumSignificantDigits = loaderManager.DbNXlk;
            }
            bigDecimal2 = bigDecimal;
            iScale2 = maximumFractionDigits;
            iScale = minimumFractionDigits;
            decimalFormatProperties2.setMinimumFractionDigits(iScale);
            decimalFormatProperties2.setMaximumFractionDigits(iScale2);
            decimalFormatProperties2.setMinimumSignificantDigits(minimumSignificantDigits);
            decimalFormatProperties2.setMaximumSignificantDigits(maximumSignificantDigits);
            decimalFormatProperties2.setRoundingIncrement(bigDecimal2);
        }
        return c7168aej;
    }
}
