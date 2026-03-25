package o;

import com.ibm.icu.impl.IllegalIcuArgumentException;
import com.ibm.icu.impl.StandardPlural;
import com.ibm.icu.impl.number.CompactData;
import com.ibm.icu.impl.number.Padder;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.text.DecimalFormatSymbols;
import com.ibm.icu.text.NumberFormat;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.util.Currency;
import com.ibm.icu.util.MeasureUnit;
import java.math.RoundingMode;
import o.C7173aeo;
import o.C7175aeq;

/* JADX INFO: renamed from: o.aft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7231aft {
    public static final Currency AEQbTJ = Currency.getInstance("XXX");
    public final InterfaceC7171aem KWHzl;
    public final C7169aek OLrzqt;

    public static boolean copydefault(MeasureUnit measureUnit) {
        return measureUnit == null;
    }

    public C7231aft(C7168aej c7168aej) {
        C7169aek c7169aek = new C7169aek(true);
        this.OLrzqt = c7169aek;
        this.KWHzl = KWHzl(c7168aej, c7169aek, true);
    }

    public static C7169aek AEQbTJ(C7168aej c7168aej, InterfaceC7163aee interfaceC7163aee, C7020abU c7020abU) {
        C7169aek c7169aekKWHzl = KWHzl(c7168aej, interfaceC7163aee);
        copydefault(c7169aekKWHzl, c7020abU, 0, KWHzl(c7169aekKWHzl, interfaceC7163aee, c7020abU, 0));
        return c7169aekKWHzl;
    }

    public static int copydefault(C7168aej c7168aej, byte b, StandardPlural standardPlural, C7020abU c7020abU) {
        return OLrzqt(KWHzl(c7168aej, new C7169aek(false), false), b, c7020abU);
    }

    public C7169aek OLrzqt(InterfaceC7163aee interfaceC7163aee, C7020abU c7020abU) {
        C7169aek c7169aekEZpvd = EZpvd(interfaceC7163aee);
        copydefault(c7169aekEZpvd, c7020abU, 0, KWHzl(c7169aekEZpvd, interfaceC7163aee, c7020abU, 0));
        return c7169aekEZpvd;
    }

    public C7169aek EZpvd(InterfaceC7163aee interfaceC7163aee) {
        C7169aek c7169aekEZpvd = this.KWHzl.EZpvd(interfaceC7163aee);
        C7228afq c7228afq = c7169aekEZpvd.EZpvd;
        if (c7228afq.copydefault == -1) {
            interfaceC7163aee.valueOf(c7228afq.OLrzqt);
        } else {
            interfaceC7163aee.valueOf(c7228afq.OLrzqt);
            interfaceC7163aee.OLrzqt(c7169aekEZpvd.EZpvd.copydefault);
        }
        return c7169aekEZpvd;
    }

    public static C7169aek KWHzl(C7168aej c7168aej, InterfaceC7163aee interfaceC7163aee) {
        C7169aek c7169aekEZpvd = KWHzl(c7168aej, new C7169aek(false), false).EZpvd(interfaceC7163aee);
        C7228afq c7228afq = c7169aekEZpvd.EZpvd;
        if (c7228afq.copydefault == -1) {
            interfaceC7163aee.valueOf(c7228afq.OLrzqt);
        } else {
            interfaceC7163aee.valueOf(c7228afq.OLrzqt);
            interfaceC7163aee.OLrzqt(c7169aekEZpvd.EZpvd.copydefault);
        }
        return c7169aekEZpvd;
    }

    public int KWHzl(byte b, StandardPlural standardPlural, C7020abU c7020abU) {
        return OLrzqt(this.KWHzl, b, c7020abU);
    }

    public static int OLrzqt(InterfaceC7171aem interfaceC7171aem, byte b, C7020abU c7020abU) {
        C7167aei c7167aei = new C7167aei(0);
        if (b < 0) {
            c7167aei.gEmmrt();
        }
        C7169aek c7169aekEZpvd = interfaceC7171aem.EZpvd(c7167aei);
        c7169aekEZpvd.djBIcL.AEQbTJ(c7020abU, 0, 0);
        return c7169aekEZpvd.djBIcL.OLrzqt();
    }

    public static boolean AEQbTJ(MeasureUnit measureUnit) {
        return measureUnit != null && "currency".equals(measureUnit.getType());
    }

    public static boolean EZpvd(MeasureUnit measureUnit) {
        return measureUnit != null && "percent".equals(measureUnit.getSubtype());
    }

    public static boolean KWHzl(MeasureUnit measureUnit) {
        return measureUnit != null && "permille".equals(measureUnit.getSubtype());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v11, resolved type: o.aex */
    /* JADX DEBUG: Multi-variable search result rejected for r10v6, resolved type: o.aex */
    /* JADX DEBUG: Multi-variable search result rejected for r10v9, resolved type: o.aex */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c5  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InterfaceC7171aem KWHzl(C7168aej c7168aej, C7169aek c7169aek, boolean z) {
        C7275agk c7275agkEZpvd;
        InterfaceC7171aem c7178aet;
        C7182aex c7182aex;
        C7175aeq.TaskDescription taskDescriptionKWHzl;
        C7175aeq.TaskDescription taskDescription;
        InterfaceC7171aem interfaceC7171aemCopydefault;
        int i;
        boolean zAEQbTJ = AEQbTJ(c7168aej.ejfBZ);
        boolean zCopydefault = copydefault(c7168aej.ejfBZ);
        boolean zEZpvd = EZpvd(c7168aej.ejfBZ);
        boolean zKWHzl = KWHzl(c7168aej.ejfBZ);
        boolean z2 = c7168aej.AYXKKw instanceof C7220afi;
        NumberFormatter.SignDisplay signDisplay = c7168aej.AkhnZx;
        boolean z3 = signDisplay == NumberFormatter.SignDisplay.ACCOUNTING || signDisplay == NumberFormatter.SignDisplay.ACCOUNTING_ALWAYS || signDisplay == NumberFormatter.SignDisplay.ACCOUNTING_EXCEPT_ZERO;
        Currency currency = zAEQbTJ ? (Currency) c7168aej.ejfBZ : AEQbTJ;
        NumberFormatter.UnitWidth unitWidth = NumberFormatter.UnitWidth.SHORT;
        NumberFormatter.UnitWidth unitWidth2 = c7168aej.fIwbmz;
        if (unitWidth2 == null) {
            unitWidth2 = unitWidth;
        }
        boolean z4 = (zAEQbTJ || zCopydefault || (unitWidth2 != NumberFormatter.UnitWidth.FULL_NAME && ((zEZpvd || zKWHzl) && !z2))) ? false : true;
        boolean z5 = z4 && c7168aej.ejfBZ.getType() == null && c7168aej.ejfBZ.getComplexity() == MeasureUnit.Complexity.MIXED;
        PluralRules pluralRulesForLocale = c7168aej.DbNXlk;
        java.lang.Object obj = c7168aej.fetchVPNInfo;
        if (obj instanceof C7275agk) {
            c7275agkEZpvd = (C7275agk) obj;
        } else {
            c7275agkEZpvd = C7275agk.EZpvd(c7168aej.copydefault);
        }
        c7169aek.valueOf = c7275agkEZpvd.EZpvd();
        java.lang.Object obj2 = c7168aej.fetchVPNInfo;
        if (obj2 instanceof DecimalFormatSymbols) {
            c7169aek.isConnected = (DecimalFormatSymbols) obj2;
        } else {
            DecimalFormatSymbols decimalFormatSymbolsForNumberingSystem = DecimalFormatSymbols.forNumberingSystem(c7168aej.copydefault, c7275agkEZpvd);
            c7169aek.isConnected = decimalFormatSymbolsForNumberingSystem;
            if (zAEQbTJ) {
                decimalFormatSymbolsForNumberingSystem.setCurrency(currency);
            }
        }
        java.lang.String currencyPattern = (!zAEQbTJ || c7169aek.isConnected.getCurrencyPattern() == null) ? null : c7169aek.isConnected.getCurrencyPattern();
        if (currencyPattern == null) {
            if (!z4) {
                if (zEZpvd || zKWHzl) {
                    i = 2;
                } else {
                    i = (!zAEQbTJ || unitWidth2 == NumberFormatter.UnitWidth.FULL_NAME) ? 0 : z3 ? 7 : 1;
                }
                currencyPattern = NumberFormat.getPatternForStyleAndNumberingSystem(c7168aej.copydefault, c7169aek.valueOf, i);
            }
        }
        C7173aeo.StateListAnimator stateListAnimatorCopydefault = C7173aeo.copydefault(currencyPattern);
        if (c7168aej.fARcdN == null) {
            c7178aet = z5 ? new C7178aet(c7168aej.ejfBZ.splitToSingleUnits().get(0), c7168aej.ejfBZ, c7169aek) : c7169aek;
            c7182aex = 0;
        } else {
            if (!z4) {
                throw new IllegalIcuArgumentException("We only support \"usage\" when the input unit is specified, and is a CLDR Unit.");
            }
            c7178aet = new C7182aex(c7168aej.copydefault, c7168aej.ejfBZ, c7168aej.fARcdN, c7169aek);
            c7182aex = c7178aet;
        }
        C7235afx c7235afx = c7168aej.isConnected;
        if (c7235afx != null) {
            c7178aet = new C7174aep(c7235afx, c7178aet);
        }
        AbstractC7236afy abstractC7236afy = c7168aej.valueOf;
        if (abstractC7236afy != null) {
            c7169aek.AkhnZx = abstractC7236afy;
        } else if (z2) {
            c7169aek.AkhnZx = AbstractC7236afy.OLrzqt;
        } else if (zAEQbTJ) {
            c7169aek.AkhnZx = AbstractC7236afy.AhwBna;
        } else if (c7168aej.fARcdN != null) {
            c7169aek.AkhnZx = AbstractC7236afy.EZpvd;
        } else {
            c7169aek.AkhnZx = AbstractC7236afy.KWHzl;
        }
        RoundingMode roundingMode = c7168aej.gEmmrt;
        if (roundingMode != null) {
            c7169aek.AkhnZx = c7169aek.AkhnZx.KWHzl(C7180aev.EZpvd(roundingMode));
        }
        c7169aek.AkhnZx = c7169aek.AkhnZx.AEQbTJ(currency);
        java.lang.Object obj3 = c7168aej.EZpvd;
        if (obj3 instanceof C7166aeh) {
            c7169aek.copydefault = (C7166aeh) obj3;
        } else if (obj3 instanceof NumberFormatter.GroupingStrategy) {
            c7169aek.copydefault = C7166aeh.copydefault((NumberFormatter.GroupingStrategy) obj3);
        } else if (z2) {
            c7169aek.copydefault = C7166aeh.copydefault(NumberFormatter.GroupingStrategy.MIN2);
        } else {
            c7169aek.copydefault = C7166aeh.copydefault(NumberFormatter.GroupingStrategy.AUTO);
        }
        c7169aek.copydefault = c7169aek.copydefault.KWHzl(c7168aej.copydefault, stateListAnimatorCopydefault);
        Padder padder = c7168aej.djBIcL;
        if (padder != null) {
            c7169aek.fetchVPNInfo = padder;
        } else {
            c7169aek.fetchVPNInfo = Padder.copydefault;
        }
        C7228afq c7228afq = c7168aej.OLrzqt;
        if (c7228afq != null) {
            c7169aek.EZpvd = c7228afq;
        } else {
            c7169aek.EZpvd = C7228afq.KWHzl;
        }
        NumberFormatter.SignDisplay signDisplay2 = c7168aej.AkhnZx;
        if (signDisplay2 != null) {
            c7169aek.values = signDisplay2;
        } else {
            c7169aek.values = NumberFormatter.SignDisplay.AUTO;
        }
        NumberFormatter.DecimalSeparatorDisplay decimalSeparatorDisplay = c7168aej.KWHzl;
        if (decimalSeparatorDisplay != null) {
            c7169aek.OLrzqt = decimalSeparatorDisplay;
        } else {
            c7169aek.OLrzqt = NumberFormatter.DecimalSeparatorDisplay.AUTO;
        }
        c7169aek.fJNWhG = zAEQbTJ;
        C7230afs c7230afs = c7168aej.AYXKKw;
        if (c7230afs instanceof C7234afw) {
            c7178aet = ((C7234afw) c7230afs).KWHzl(c7169aek.isConnected, z, c7178aet);
        } else {
            c7169aek.AhwBna = C7162aed.KWHzl;
        }
        C7175aeq c7175aeq = new C7175aeq(false);
        InterfaceC7102adW interfaceC7102adW = c7168aej.AEQbTJ;
        InterfaceC7102adW interfaceC7102adW2 = stateListAnimatorCopydefault;
        if (interfaceC7102adW != null) {
            interfaceC7102adW2 = interfaceC7102adW;
        }
        c7175aeq.EZpvd(interfaceC7102adW2, (NumberFormat.Field) null);
        c7175aeq.EZpvd(c7169aek.values, zKWHzl);
        if (c7175aeq.copydefault()) {
            if (pluralRulesForLocale == null) {
                pluralRulesForLocale = PluralRules.forLocale(c7168aej.copydefault);
            }
            c7175aeq.OLrzqt(c7169aek.isConnected, currency, unitWidth2, pluralRulesForLocale);
            taskDescriptionKWHzl = null;
        } else {
            taskDescriptionKWHzl = null;
            c7175aeq.OLrzqt(c7169aek.isConnected, currency, unitWidth2, null);
        }
        if (z) {
            taskDescriptionKWHzl = c7175aeq.KWHzl();
        }
        if (z4) {
            if (pluralRulesForLocale == null) {
                pluralRulesForLocale = PluralRules.forLocale(c7168aej.copydefault);
            }
            PluralRules pluralRules = pluralRulesForLocale;
            PluralRules pluralRulesForLocale2 = c7168aej.DbNXlk;
            if (pluralRulesForLocale2 == null) {
                pluralRulesForLocale2 = PluralRules.forLocale(c7168aej.copydefault);
            }
            if (c7168aej.fARcdN != null) {
                interfaceC7171aemCopydefault = C7170ael.OLrzqt(c7168aej.copydefault, c7182aex.EZpvd(), unitWidth2, pluralRulesForLocale2, c7178aet);
            } else if (z5) {
                interfaceC7171aemCopydefault = C7172aen.KWHzl(c7168aej.copydefault, c7168aej.ejfBZ, unitWidth2, pluralRulesForLocale2, c7178aet);
            } else {
                interfaceC7171aemCopydefault = C7165aeg.copydefault(c7168aej.copydefault, c7168aej.ejfBZ, c7168aej.AhwBna, unitWidth2, pluralRulesForLocale2, c7178aet);
            }
            pluralRulesForLocale = pluralRules;
            c7178aet = interfaceC7171aemCopydefault;
        } else if (zAEQbTJ && unitWidth2 == NumberFormatter.UnitWidth.FULL_NAME) {
            if (pluralRulesForLocale == null) {
                pluralRulesForLocale = PluralRules.forLocale(c7168aej.copydefault);
            }
            c7178aet = C7165aeg.copydefault(c7168aej.copydefault, currency, pluralRulesForLocale, c7178aet);
        } else {
            c7169aek.AYXKKw = C7162aed.KWHzl;
        }
        if (z2) {
            taskDescription = taskDescriptionKWHzl;
            c7178aet = ((C7220afi) c7168aej.AYXKKw).EZpvd(c7168aej.copydefault, c7169aek.valueOf, (!(c7168aej.ejfBZ instanceof Currency) || c7168aej.fIwbmz == NumberFormatter.UnitWidth.FULL_NAME) ? CompactData.CompactType.DECIMAL : CompactData.CompactType.CURRENCY, pluralRulesForLocale == null ? PluralRules.forLocale(c7168aej.copydefault) : pluralRulesForLocale, c7175aeq, z, c7178aet);
        } else {
            taskDescription = taskDescriptionKWHzl;
        }
        if (z) {
            return taskDescription.KWHzl(c7178aet);
        }
        return c7175aeq.OLrzqt(c7178aet);
    }

    public static int copydefault(C7169aek c7169aek, C7020abU c7020abU, int i, int i2) {
        int iAEQbTJ = c7169aek.AhwBna.AEQbTJ(c7020abU, i, i2);
        if (c7169aek.fetchVPNInfo.OLrzqt()) {
            c7169aek.fetchVPNInfo.OLrzqt(c7169aek.djBIcL, c7169aek.AYXKKw, c7020abU, i, i2 + iAEQbTJ);
            return iAEQbTJ;
        }
        int iAEQbTJ2 = iAEQbTJ + c7169aek.djBIcL.AEQbTJ(c7020abU, i, i2 + iAEQbTJ);
        return iAEQbTJ2 + c7169aek.AYXKKw.AEQbTJ(c7020abU, i, i2 + iAEQbTJ2);
    }

    public static int KWHzl(C7169aek c7169aek, InterfaceC7163aee interfaceC7163aee, C7020abU c7020abU, int i) {
        java.lang.String decimalSeparatorString;
        int iCopydefault;
        if (interfaceC7163aee.isInfinite()) {
            return c7020abU.copydefault(i, c7169aek.isConnected.getInfinity(), NumberFormat.Field.INTEGER);
        }
        if (interfaceC7163aee.isNaN()) {
            return c7020abU.copydefault(i, c7169aek.isConnected.getNaN(), NumberFormat.Field.INTEGER);
        }
        int iOLrzqt = OLrzqt(c7169aek, interfaceC7163aee, c7020abU, i);
        if (interfaceC7163aee.KWHzl() < 0 || c7169aek.OLrzqt == NumberFormatter.DecimalSeparatorDisplay.ALWAYS) {
            if (c7169aek.fJNWhG) {
                decimalSeparatorString = c7169aek.isConnected.getMonetaryDecimalSeparatorString();
            } else {
                decimalSeparatorString = c7169aek.isConnected.getDecimalSeparatorString();
            }
            iOLrzqt += c7020abU.copydefault(iOLrzqt + i, decimalSeparatorString, NumberFormat.Field.DECIMAL_SEPARATOR);
        }
        int iAEQbTJ = AEQbTJ(c7169aek, interfaceC7163aee, c7020abU, iOLrzqt + i) + iOLrzqt;
        if (iAEQbTJ != 0) {
            return iAEQbTJ;
        }
        if (c7169aek.isConnected.getCodePointZero() != -1) {
            iCopydefault = c7020abU.AEQbTJ(i, c7169aek.isConnected.getCodePointZero(), NumberFormat.Field.INTEGER);
        } else {
            iCopydefault = c7020abU.copydefault(i, c7169aek.isConnected.getDigitStringsLocal()[0], NumberFormat.Field.INTEGER);
        }
        return iCopydefault + iAEQbTJ;
    }

    public static int OLrzqt(C7169aek c7169aek, InterfaceC7163aee interfaceC7163aee, C7020abU c7020abU, int i) {
        int iCopydefault;
        java.lang.String groupingSeparatorString;
        int iEZpvd = interfaceC7163aee.EZpvd();
        int iCopydefault2 = 0;
        for (int i2 = 0; i2 < iEZpvd + 1; i2++) {
            if (c7169aek.copydefault.EZpvd(i2, interfaceC7163aee)) {
                if (c7169aek.fJNWhG) {
                    groupingSeparatorString = c7169aek.isConnected.getMonetaryGroupingSeparatorString();
                } else {
                    groupingSeparatorString = c7169aek.isConnected.getGroupingSeparatorString();
                }
                iCopydefault2 += c7020abU.copydefault(i, groupingSeparatorString, NumberFormat.Field.GROUPING_SEPARATOR);
            }
            byte bEZpvd = interfaceC7163aee.EZpvd(i2);
            if (c7169aek.isConnected.getCodePointZero() != -1) {
                iCopydefault = c7020abU.AEQbTJ(i, c7169aek.isConnected.getCodePointZero() + bEZpvd, NumberFormat.Field.INTEGER);
            } else {
                iCopydefault = c7020abU.copydefault(i, c7169aek.isConnected.getDigitStringsLocal()[bEZpvd], NumberFormat.Field.INTEGER);
            }
            iCopydefault2 += iCopydefault;
        }
        return iCopydefault2;
    }

    public static int AEQbTJ(C7169aek c7169aek, InterfaceC7163aee interfaceC7163aee, C7020abU c7020abU, int i) {
        int iCopydefault;
        int i2 = -interfaceC7163aee.KWHzl();
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            byte bEZpvd = interfaceC7163aee.EZpvd((-i4) - 1);
            if (c7169aek.isConnected.getCodePointZero() != -1) {
                iCopydefault = c7020abU.AEQbTJ(i3 + i, c7169aek.isConnected.getCodePointZero() + bEZpvd, NumberFormat.Field.FRACTION);
            } else {
                iCopydefault = c7020abU.copydefault(i3 + i, c7169aek.isConnected.getDigitStringsLocal()[bEZpvd], NumberFormat.Field.FRACTION);
            }
            i3 += iCopydefault;
        }
        return i3;
    }
}
