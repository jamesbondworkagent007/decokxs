package o;

import com.ibm.icu.impl.CurrencyData;
import com.ibm.icu.impl.ICUResourceBundle;
import com.ibm.icu.impl.StandardPlural;
import com.ibm.icu.impl.number.Modifier;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.util.Currency;
import com.ibm.icu.util.ICUException;
import com.ibm.icu.util.MeasureUnit;
import com.ibm.icu.util.ULocale;
import com.ibm.icu.util.UResourceBundle;
import java.util.EnumMap;
import java.util.Map;
import java.util.MissingResourceException;
import o.C7043acQ;
import o.C7170ael;

/* JADX INFO: renamed from: o.aeg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7165aeg implements InterfaceC7171aem, InterfaceC7176aer, C7170ael.StateListAnimator {
    public static final int AEQbTJ;
    public static final int KWHzl;
    public static final int OLrzqt;
    public final java.util.Map<StandardPlural, C7179aeu> EZpvd;
    public final InterfaceC7171aem copydefault;
    public final PluralRules valueOf;

    static {
        int i = StandardPlural.COUNT;
        OLrzqt = i;
        KWHzl = i + 1;
        AEQbTJ = i + 2;
    }

    public static int AEQbTJ(java.lang.String str) {
        return str.equals("dnam") ? OLrzqt : str.equals("per") ? KWHzl : StandardPlural.fromString(str).ordinal();
    }

    public static java.lang.String copydefault(java.lang.String[] strArr, StandardPlural standardPlural) {
        java.lang.String str = strArr[standardPlural.ordinal()];
        if (str == null) {
            str = strArr[StandardPlural.OTHER.ordinal()];
        }
        if (str != null) {
            return str;
        }
        throw new ICUException("Could not find data in 'other' plural variant");
    }

    /* JADX INFO: renamed from: o.aeg$TaskDescription */
    public static final class TaskDescription extends C7043acQ.ActionBar {
        public java.lang.String[] EZpvd;

        public TaskDescription(java.lang.String[] strArr) {
            this.EZpvd = strArr;
        }

        @Override // o.C7043acQ.ActionBar
        public void copydefault(C7043acQ.Application application, C7043acQ.TaskDescription taskDescription, boolean z) {
            C7043acQ.StateListAnimator stateListAnimatorValueOf = taskDescription.valueOf();
            for (int i = 0; stateListAnimatorValueOf.AEQbTJ(i, application, taskDescription); i++) {
                int iAEQbTJ = C7165aeg.AEQbTJ(application.toString());
                if (this.EZpvd[iAEQbTJ] == null) {
                    this.EZpvd[iAEQbTJ] = taskDescription.djBIcL();
                }
            }
        }
    }

    public static void copydefault(ULocale uLocale, MeasureUnit measureUnit, NumberFormatter.UnitWidth unitWidth, java.lang.String[] strArr) {
        TaskDescription taskDescription = new TaskDescription(strArr);
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b/unit", uLocale);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("units");
        if (unitWidth == NumberFormatter.UnitWidth.NARROW) {
            sb.append("Narrow");
        } else if (unitWidth == NumberFormatter.UnitWidth.SHORT) {
            sb.append("Short");
        }
        sb.append("/");
        sb.append(measureUnit.getType());
        sb.append("/");
        if (measureUnit.getSubtype() != null && measureUnit.getSubtype().endsWith("-person")) {
            sb.append((java.lang.CharSequence) measureUnit.getSubtype(), 0, measureUnit.getSubtype().length() - 7);
        } else {
            sb.append(measureUnit.getSubtype());
        }
        try {
            iCUResourceBundle.copydefault(sb.toString(), taskDescription);
        } catch (MissingResourceException e) {
            throw new java.lang.IllegalArgumentException("No data for unit " + measureUnit + ", width " + unitWidth, e);
        }
    }

    public static void copydefault(ULocale uLocale, Currency currency, java.lang.String[] strArr) {
        for (Map.Entry<java.lang.String, java.lang.String> entry : CurrencyData.KWHzl.OLrzqt(uLocale, true).copydefault().entrySet()) {
            java.lang.String key = entry.getKey();
            strArr[AEQbTJ(key)] = entry.getValue().replace("{1}", currency.getName(uLocale, 2, key, (boolean[]) null));
        }
    }

    public static java.lang.String EZpvd(ULocale uLocale, NumberFormatter.UnitWidth unitWidth) {
        ICUResourceBundle iCUResourceBundle = (ICUResourceBundle) UResourceBundle.KWHzl("com/ibm/icu/impl/data/icudt68b/unit", uLocale);
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("units");
        if (unitWidth == NumberFormatter.UnitWidth.NARROW) {
            sb.append("Narrow");
        } else if (unitWidth == NumberFormatter.UnitWidth.SHORT) {
            sb.append("Short");
        }
        sb.append("/compound/per");
        try {
            return iCUResourceBundle.djBIcL(sb.toString());
        } catch (MissingResourceException unused) {
            throw new java.lang.IllegalArgumentException("Could not find x-per-y format for " + uLocale + ", width " + unitWidth);
        }
    }

    public C7165aeg(java.util.Map<StandardPlural, C7179aeu> map, PluralRules pluralRules, InterfaceC7171aem interfaceC7171aem) {
        this.EZpvd = map;
        this.valueOf = pluralRules;
        this.copydefault = interfaceC7171aem;
    }

    public static java.lang.String copydefault(ULocale uLocale, MeasureUnit measureUnit, NumberFormatter.UnitWidth unitWidth) {
        java.lang.String[] strArr = new java.lang.String[AEQbTJ];
        copydefault(uLocale, measureUnit, unitWidth, strArr);
        return strArr[OLrzqt];
    }

    public static C7165aeg copydefault(ULocale uLocale, Currency currency, PluralRules pluralRules, InterfaceC7171aem interfaceC7171aem) {
        java.lang.String[] strArr = new java.lang.String[AEQbTJ];
        copydefault(uLocale, currency, strArr);
        C7165aeg c7165aeg = new C7165aeg(new EnumMap(StandardPlural.class), pluralRules, interfaceC7171aem);
        c7165aeg.KWHzl(strArr, NumberFormat.Field.CURRENCY);
        return c7165aeg;
    }

    public static C7165aeg copydefault(ULocale uLocale, MeasureUnit measureUnit, MeasureUnit measureUnit2, NumberFormatter.UnitWidth unitWidth, PluralRules pluralRules, InterfaceC7171aem interfaceC7171aem) {
        if (measureUnit2 != null) {
            MeasureUnit measureUnitProduct = measureUnit.product(measureUnit2.reciprocal());
            if (measureUnitProduct.getType() == null) {
                return KWHzl(uLocale, measureUnit, measureUnit2, unitWidth, pluralRules, interfaceC7171aem);
            }
            measureUnit = measureUnitProduct;
        }
        if (measureUnit.getType() == null) {
            throw new java.lang.UnsupportedOperationException("Unsanctioned unit, not yet supported: " + measureUnit.getIdentifier());
        }
        java.lang.String[] strArr = new java.lang.String[AEQbTJ];
        copydefault(uLocale, measureUnit, unitWidth, strArr);
        C7165aeg c7165aeg = new C7165aeg(new EnumMap(StandardPlural.class), pluralRules, interfaceC7171aem);
        c7165aeg.KWHzl(strArr, NumberFormat.Field.MEASURE_UNIT);
        return c7165aeg;
    }

    public static C7165aeg KWHzl(ULocale uLocale, MeasureUnit measureUnit, MeasureUnit measureUnit2, NumberFormatter.UnitWidth unitWidth, PluralRules pluralRules, InterfaceC7171aem interfaceC7171aem) {
        if (measureUnit.getType() == null || measureUnit2.getType() == null) {
            throw new java.lang.UnsupportedOperationException("Unsanctioned units, not yet supported: " + measureUnit.getIdentifier() + "/" + measureUnit2.getIdentifier());
        }
        int i = AEQbTJ;
        java.lang.String[] strArr = new java.lang.String[i];
        copydefault(uLocale, measureUnit, unitWidth, strArr);
        java.lang.String[] strArr2 = new java.lang.String[i];
        copydefault(uLocale, measureUnit2, unitWidth, strArr2);
        java.lang.String strEZpvd = strArr2[KWHzl];
        if (strEZpvd == null) {
            java.lang.String strEZpvd2 = EZpvd(uLocale, unitWidth);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            strEZpvd = C7028acB.EZpvd(C7028acB.OLrzqt(strEZpvd2, sb, 2, 2), "{0}", C7028acB.KWHzl(C7028acB.OLrzqt(copydefault(strArr2, StandardPlural.ONE), sb, 0, 1)).trim());
        }
        C7165aeg c7165aeg = new C7165aeg(new EnumMap(StandardPlural.class), pluralRules, interfaceC7171aem);
        c7165aeg.KWHzl(strArr, strEZpvd, NumberFormat.Field.MEASURE_UNIT);
        return c7165aeg;
    }

    public final void KWHzl(java.lang.String[] strArr, NumberFormat.Field field) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (StandardPlural standardPlural : StandardPlural.VALUES) {
            java.lang.String strOLrzqt = C7028acB.OLrzqt(copydefault(strArr, standardPlural), sb, 0, 1);
            Modifier.TaskDescription taskDescription = new Modifier.TaskDescription();
            taskDescription.EZpvd = this;
            taskDescription.AEQbTJ = null;
            taskDescription.OLrzqt = standardPlural;
            this.EZpvd.put(standardPlural, new C7179aeu(strOLrzqt, field, false, taskDescription));
        }
    }

    public final void KWHzl(java.lang.String[] strArr, java.lang.String str, NumberFormat.Field field) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strOLrzqt = C7028acB.OLrzqt(str, sb, 1, 1);
        for (StandardPlural standardPlural : StandardPlural.VALUES) {
            java.lang.String strOLrzqt2 = C7028acB.OLrzqt(C7028acB.EZpvd(strOLrzqt, copydefault(strArr, standardPlural)), sb, 0, 1);
            Modifier.TaskDescription taskDescription = new Modifier.TaskDescription();
            taskDescription.EZpvd = this;
            taskDescription.AEQbTJ = null;
            taskDescription.OLrzqt = standardPlural;
            this.EZpvd.put(standardPlural, new C7179aeu(strOLrzqt2, field, false, taskDescription));
        }
    }

    @Override // o.InterfaceC7171aem
    public C7169aek EZpvd(InterfaceC7163aee interfaceC7163aee) {
        C7169aek c7169aekEZpvd = this.copydefault.EZpvd(interfaceC7163aee);
        c7169aekEZpvd.AYXKKw = this.EZpvd.get(C7180aev.EZpvd(c7169aekEZpvd.AkhnZx, this.valueOf, interfaceC7163aee));
        return c7169aekEZpvd;
    }

    @Override // o.C7170ael.StateListAnimator
    public C7169aek OLrzqt(InterfaceC7163aee interfaceC7163aee, C7169aek c7169aek) {
        c7169aek.AYXKKw = this.EZpvd.get(C7180aev.EZpvd(c7169aek.AkhnZx, this.valueOf, interfaceC7163aee));
        return c7169aek;
    }
}
