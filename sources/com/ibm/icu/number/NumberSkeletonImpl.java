package com.ibm.icu.number;

import com.fasterxml.jackson.core.JsonPointer;
import com.ibm.icu.impl.units.MeasureUnitImpl;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.util.BytesTrie;
import com.ibm.icu.util.Currency;
import com.ibm.icu.util.MeasureUnit;
import com.ibm.icu.util.StringTrieBuilder;
import java.math.BigDecimal;
import java.math.RoundingMode;
import o.AbstractC7013abN;
import o.AbstractC7078acz;
import o.AbstractC7224afm;
import o.AbstractC7236afy;
import o.C7031acE;
import o.C7070acr;
import o.C7168aej;
import o.C7180aev;
import o.C7187afB;
import o.C7215afd;
import o.C7220afi;
import o.C7228afq;
import o.C7230afs;
import o.C7234afw;
import o.C7235afx;
import o.C7244agF;
import o.C7251agM;
import o.C7257agS;
import o.C7275agk;

/* JADX INFO: loaded from: classes3.dex */
public class NumberSkeletonImpl {
    public static final StemEnum[] AEQbTJ = StemEnum.values();
    public static final String copydefault = AEQbTJ();
    public static final AbstractC7013abN<String, C7187afB, Void> OLrzqt = new AbstractC7078acz<String, C7187afB, Void>() { // from class: com.ibm.icu.number.NumberSkeletonImpl.3
        /* JADX DEBUG: Method merged with bridge method: copydefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // o.AbstractC7013abN
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public C7187afB copydefault(String str, Void r2) {
            return NumberSkeletonImpl.EZpvd(str);
        }
    };

    public enum ParseState {
        STATE_NULL,
        STATE_SCIENTIFIC,
        STATE_FRACTION_PRECISION,
        STATE_INCREMENT_PRECISION,
        STATE_MEASURE_UNIT,
        STATE_PER_MEASURE_UNIT,
        STATE_IDENTIFIER_UNIT,
        STATE_UNIT_USAGE,
        STATE_CURRENCY_UNIT,
        STATE_INTEGER_WIDTH,
        STATE_NUMBERING_SYSTEM,
        STATE_SCALE
    }

    public enum StemEnum {
        STEM_COMPACT_SHORT,
        STEM_COMPACT_LONG,
        STEM_SCIENTIFIC,
        STEM_ENGINEERING,
        STEM_NOTATION_SIMPLE,
        STEM_BASE_UNIT,
        STEM_PERCENT,
        STEM_PERMILLE,
        STEM_PERCENT_100,
        STEM_PRECISION_INTEGER,
        STEM_PRECISION_UNLIMITED,
        STEM_PRECISION_CURRENCY_STANDARD,
        STEM_PRECISION_CURRENCY_CASH,
        STEM_ROUNDING_MODE_CEILING,
        STEM_ROUNDING_MODE_FLOOR,
        STEM_ROUNDING_MODE_DOWN,
        STEM_ROUNDING_MODE_UP,
        STEM_ROUNDING_MODE_HALF_EVEN,
        STEM_ROUNDING_MODE_HALF_DOWN,
        STEM_ROUNDING_MODE_HALF_UP,
        STEM_ROUNDING_MODE_UNNECESSARY,
        STEM_GROUP_OFF,
        STEM_GROUP_MIN2,
        STEM_GROUP_AUTO,
        STEM_GROUP_ON_ALIGNED,
        STEM_GROUP_THOUSANDS,
        STEM_LATIN,
        STEM_UNIT_WIDTH_NARROW,
        STEM_UNIT_WIDTH_SHORT,
        STEM_UNIT_WIDTH_FULL_NAME,
        STEM_UNIT_WIDTH_ISO_CODE,
        STEM_UNIT_WIDTH_FORMAL,
        STEM_UNIT_WIDTH_VARIANT,
        STEM_UNIT_WIDTH_HIDDEN,
        STEM_SIGN_AUTO,
        STEM_SIGN_ALWAYS,
        STEM_SIGN_NEVER,
        STEM_SIGN_ACCOUNTING,
        STEM_SIGN_ACCOUNTING_ALWAYS,
        STEM_SIGN_EXCEPT_ZERO,
        STEM_SIGN_ACCOUNTING_EXCEPT_ZERO,
        STEM_DECIMAL_AUTO,
        STEM_DECIMAL_ALWAYS,
        STEM_PRECISION_INCREMENT,
        STEM_MEASURE_UNIT,
        STEM_PER_MEASURE_UNIT,
        STEM_UNIT,
        STEM_UNIT_USAGE,
        STEM_CURRENCY,
        STEM_INTEGER_WIDTH,
        STEM_NUMBERING_SYSTEM,
        STEM_SCALE
    }

    public static boolean EZpvd(char c) {
        return c == '*' || c == '+';
    }

    public static String AEQbTJ() {
        C7251agM c7251agM = new C7251agM();
        StemEnum stemEnum = StemEnum.STEM_COMPACT_SHORT;
        c7251agM.EZpvd("compact-short", stemEnum.ordinal());
        StemEnum stemEnum2 = StemEnum.STEM_COMPACT_LONG;
        c7251agM.EZpvd("compact-long", stemEnum2.ordinal());
        c7251agM.EZpvd("scientific", StemEnum.STEM_SCIENTIFIC.ordinal());
        c7251agM.EZpvd("engineering", StemEnum.STEM_ENGINEERING.ordinal());
        c7251agM.EZpvd("notation-simple", StemEnum.STEM_NOTATION_SIMPLE.ordinal());
        c7251agM.EZpvd("base-unit", StemEnum.STEM_BASE_UNIT.ordinal());
        StemEnum stemEnum3 = StemEnum.STEM_PERCENT;
        c7251agM.EZpvd("percent", stemEnum3.ordinal());
        c7251agM.EZpvd("permille", StemEnum.STEM_PERMILLE.ordinal());
        c7251agM.EZpvd("precision-integer", StemEnum.STEM_PRECISION_INTEGER.ordinal());
        c7251agM.EZpvd("precision-unlimited", StemEnum.STEM_PRECISION_UNLIMITED.ordinal());
        c7251agM.EZpvd("precision-currency-standard", StemEnum.STEM_PRECISION_CURRENCY_STANDARD.ordinal());
        c7251agM.EZpvd("precision-currency-cash", StemEnum.STEM_PRECISION_CURRENCY_CASH.ordinal());
        c7251agM.EZpvd("rounding-mode-ceiling", StemEnum.STEM_ROUNDING_MODE_CEILING.ordinal());
        c7251agM.EZpvd("rounding-mode-floor", StemEnum.STEM_ROUNDING_MODE_FLOOR.ordinal());
        c7251agM.EZpvd("rounding-mode-down", StemEnum.STEM_ROUNDING_MODE_DOWN.ordinal());
        c7251agM.EZpvd("rounding-mode-up", StemEnum.STEM_ROUNDING_MODE_UP.ordinal());
        c7251agM.EZpvd("rounding-mode-half-even", StemEnum.STEM_ROUNDING_MODE_HALF_EVEN.ordinal());
        c7251agM.EZpvd("rounding-mode-half-down", StemEnum.STEM_ROUNDING_MODE_HALF_DOWN.ordinal());
        c7251agM.EZpvd("rounding-mode-half-up", StemEnum.STEM_ROUNDING_MODE_HALF_UP.ordinal());
        c7251agM.EZpvd("rounding-mode-unnecessary", StemEnum.STEM_ROUNDING_MODE_UNNECESSARY.ordinal());
        StemEnum stemEnum4 = StemEnum.STEM_GROUP_OFF;
        c7251agM.EZpvd("group-off", stemEnum4.ordinal());
        StemEnum stemEnum5 = StemEnum.STEM_GROUP_MIN2;
        c7251agM.EZpvd("group-min2", stemEnum5.ordinal());
        c7251agM.EZpvd("group-auto", StemEnum.STEM_GROUP_AUTO.ordinal());
        StemEnum stemEnum6 = StemEnum.STEM_GROUP_ON_ALIGNED;
        c7251agM.EZpvd("group-on-aligned", stemEnum6.ordinal());
        c7251agM.EZpvd("group-thousands", StemEnum.STEM_GROUP_THOUSANDS.ordinal());
        c7251agM.EZpvd("latin", StemEnum.STEM_LATIN.ordinal());
        c7251agM.EZpvd("unit-width-narrow", StemEnum.STEM_UNIT_WIDTH_NARROW.ordinal());
        c7251agM.EZpvd("unit-width-short", StemEnum.STEM_UNIT_WIDTH_SHORT.ordinal());
        c7251agM.EZpvd("unit-width-full-name", StemEnum.STEM_UNIT_WIDTH_FULL_NAME.ordinal());
        c7251agM.EZpvd("unit-width-iso-code", StemEnum.STEM_UNIT_WIDTH_ISO_CODE.ordinal());
        c7251agM.EZpvd("unit-width-formal", StemEnum.STEM_UNIT_WIDTH_FORMAL.ordinal());
        c7251agM.EZpvd("unit-width-variant", StemEnum.STEM_UNIT_WIDTH_VARIANT.ordinal());
        c7251agM.EZpvd("unit-width-hidden", StemEnum.STEM_UNIT_WIDTH_HIDDEN.ordinal());
        c7251agM.EZpvd("sign-auto", StemEnum.STEM_SIGN_AUTO.ordinal());
        StemEnum stemEnum7 = StemEnum.STEM_SIGN_ALWAYS;
        c7251agM.EZpvd("sign-always", stemEnum7.ordinal());
        StemEnum stemEnum8 = StemEnum.STEM_SIGN_NEVER;
        c7251agM.EZpvd("sign-never", stemEnum8.ordinal());
        StemEnum stemEnum9 = StemEnum.STEM_SIGN_ACCOUNTING;
        c7251agM.EZpvd("sign-accounting", stemEnum9.ordinal());
        StemEnum stemEnum10 = StemEnum.STEM_SIGN_ACCOUNTING_ALWAYS;
        c7251agM.EZpvd("sign-accounting-always", stemEnum10.ordinal());
        StemEnum stemEnum11 = StemEnum.STEM_SIGN_EXCEPT_ZERO;
        c7251agM.EZpvd("sign-except-zero", stemEnum11.ordinal());
        StemEnum stemEnum12 = StemEnum.STEM_SIGN_ACCOUNTING_EXCEPT_ZERO;
        c7251agM.EZpvd("sign-accounting-except-zero", stemEnum12.ordinal());
        c7251agM.EZpvd("decimal-auto", StemEnum.STEM_DECIMAL_AUTO.ordinal());
        c7251agM.EZpvd("decimal-always", StemEnum.STEM_DECIMAL_ALWAYS.ordinal());
        c7251agM.EZpvd("precision-increment", StemEnum.STEM_PRECISION_INCREMENT.ordinal());
        c7251agM.EZpvd("measure-unit", StemEnum.STEM_MEASURE_UNIT.ordinal());
        c7251agM.EZpvd("per-measure-unit", StemEnum.STEM_PER_MEASURE_UNIT.ordinal());
        c7251agM.EZpvd("unit", StemEnum.STEM_UNIT.ordinal());
        c7251agM.EZpvd("usage", StemEnum.STEM_UNIT_USAGE.ordinal());
        c7251agM.EZpvd("currency", StemEnum.STEM_CURRENCY.ordinal());
        c7251agM.EZpvd("integer-width", StemEnum.STEM_INTEGER_WIDTH.ordinal());
        c7251agM.EZpvd("numbering-system", StemEnum.STEM_NUMBERING_SYSTEM.ordinal());
        c7251agM.EZpvd("scale", StemEnum.STEM_SCALE.ordinal());
        c7251agM.EZpvd("K", stemEnum.ordinal());
        c7251agM.EZpvd("KK", stemEnum2.ordinal());
        c7251agM.EZpvd("%", stemEnum3.ordinal());
        c7251agM.EZpvd("%x100", StemEnum.STEM_PERCENT_100.ordinal());
        c7251agM.EZpvd(",_", stemEnum4.ordinal());
        c7251agM.EZpvd(",?", stemEnum5.ordinal());
        c7251agM.EZpvd(",!", stemEnum6.ordinal());
        c7251agM.EZpvd("+!", stemEnum7.ordinal());
        c7251agM.EZpvd("+_", stemEnum8.ordinal());
        c7251agM.EZpvd("()", stemEnum9.ordinal());
        c7251agM.EZpvd("()!", stemEnum10.ordinal());
        c7251agM.EZpvd("+?", stemEnum11.ordinal());
        c7251agM.EZpvd("()?", stemEnum12.ordinal());
        return c7251agM.KWHzl(StringTrieBuilder.Option.FAST).toString();
    }

    public static final class ActionBar {
        public static C7230afs fetchVPNInfo(StemEnum stemEnum) {
            int i = AnonymousClass5.valueOf[stemEnum.ordinal()];
            if (i == 1) {
                return C7230afs.AEQbTJ();
            }
            if (i == 2) {
                return C7230afs.EZpvd();
            }
            if (i == 3) {
                return C7230afs.KWHzl();
            }
            if (i == 4) {
                return C7230afs.copydefault();
            }
            if (i == 5) {
                return C7230afs.OLrzqt();
            }
            throw new AssertionError();
        }

        public static MeasureUnit isConnected(StemEnum stemEnum) {
            int i = AnonymousClass5.valueOf[stemEnum.ordinal()];
            if (i == 6) {
                return C7257agS.AEQbTJ;
            }
            if (i == 7) {
                return C7257agS.EZpvd;
            }
            if (i == 8) {
                return C7257agS.KWHzl;
            }
            throw new AssertionError();
        }

        public static AbstractC7236afy values(StemEnum stemEnum) {
            switch (AnonymousClass5.valueOf[stemEnum.ordinal()]) {
                case 9:
                    return AbstractC7236afy.KWHzl();
                case 10:
                    return AbstractC7236afy.OLrzqt();
                case 11:
                    return AbstractC7236afy.copydefault(Currency.CurrencyUsage.STANDARD);
                case 12:
                    return AbstractC7236afy.copydefault(Currency.CurrencyUsage.CASH);
                default:
                    throw new AssertionError();
            }
        }

        public static RoundingMode AkhnZx(StemEnum stemEnum) {
            switch (AnonymousClass5.valueOf[stemEnum.ordinal()]) {
                case 13:
                    return RoundingMode.CEILING;
                case 14:
                    return RoundingMode.FLOOR;
                case 15:
                    return RoundingMode.DOWN;
                case 16:
                    return RoundingMode.UP;
                case 17:
                    return RoundingMode.HALF_EVEN;
                case 18:
                    return RoundingMode.HALF_DOWN;
                case 19:
                    return RoundingMode.HALF_UP;
                case 20:
                    return RoundingMode.UNNECESSARY;
                default:
                    throw new AssertionError();
            }
        }

        public static NumberFormatter.GroupingStrategy gEmmrt(StemEnum stemEnum) {
            switch (AnonymousClass5.valueOf[stemEnum.ordinal()]) {
                case 21:
                    return NumberFormatter.GroupingStrategy.OFF;
                case 22:
                    return NumberFormatter.GroupingStrategy.MIN2;
                case 23:
                    return NumberFormatter.GroupingStrategy.AUTO;
                case 24:
                    return NumberFormatter.GroupingStrategy.ON_ALIGNED;
                case 25:
                    return NumberFormatter.GroupingStrategy.THOUSANDS;
                default:
                    return null;
            }
        }

        public static NumberFormatter.UnitWidth fIwbmz(StemEnum stemEnum) {
            switch (AnonymousClass5.valueOf[stemEnum.ordinal()]) {
                case 26:
                    return NumberFormatter.UnitWidth.NARROW;
                case 27:
                    return NumberFormatter.UnitWidth.SHORT;
                case 28:
                    return NumberFormatter.UnitWidth.FULL_NAME;
                case 29:
                    return NumberFormatter.UnitWidth.ISO_CODE;
                case 30:
                    return NumberFormatter.UnitWidth.FORMAL;
                case 31:
                    return NumberFormatter.UnitWidth.VARIANT;
                case 32:
                    return NumberFormatter.UnitWidth.HIDDEN;
                default:
                    return null;
            }
        }

        public static NumberFormatter.SignDisplay DbNXlk(StemEnum stemEnum) {
            switch (AnonymousClass5.valueOf[stemEnum.ordinal()]) {
                case 33:
                    return NumberFormatter.SignDisplay.AUTO;
                case 34:
                    return NumberFormatter.SignDisplay.ALWAYS;
                case 35:
                    return NumberFormatter.SignDisplay.NEVER;
                case 36:
                    return NumberFormatter.SignDisplay.ACCOUNTING;
                case 37:
                    return NumberFormatter.SignDisplay.ACCOUNTING_ALWAYS;
                case 38:
                    return NumberFormatter.SignDisplay.EXCEPT_ZERO;
                case 39:
                    return NumberFormatter.SignDisplay.ACCOUNTING_EXCEPT_ZERO;
                default:
                    return null;
            }
        }

        public static NumberFormatter.DecimalSeparatorDisplay AYXKKw(StemEnum stemEnum) {
            int i = AnonymousClass5.valueOf[stemEnum.ordinal()];
            if (i == 40) {
                return NumberFormatter.DecimalSeparatorDisplay.AUTO;
            }
            if (i != 41) {
                return null;
            }
            return NumberFormatter.DecimalSeparatorDisplay.ALWAYS;
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class Activity {
        public static void AEQbTJ(RoundingMode roundingMode, StringBuilder sb) {
            switch (AnonymousClass5.AhwBna[roundingMode.ordinal()]) {
                case 1:
                    sb.append("rounding-mode-ceiling");
                    return;
                case 2:
                    sb.append("rounding-mode-floor");
                    return;
                case 3:
                    sb.append("rounding-mode-down");
                    return;
                case 4:
                    sb.append("rounding-mode-up");
                    return;
                case 5:
                    sb.append("rounding-mode-half-even");
                    return;
                case 6:
                    sb.append("rounding-mode-half-down");
                    return;
                case 7:
                    sb.append("rounding-mode-half-up");
                    return;
                case 8:
                    sb.append("rounding-mode-unnecessary");
                    return;
                default:
                    throw new AssertionError();
            }
        }

        public static void copydefault(NumberFormatter.GroupingStrategy groupingStrategy, StringBuilder sb) {
            int i = AnonymousClass5.EZpvd[groupingStrategy.ordinal()];
            if (i == 1) {
                sb.append("group-off");
                return;
            }
            if (i == 2) {
                sb.append("group-min2");
                return;
            }
            if (i == 3) {
                sb.append("group-auto");
            } else if (i == 4) {
                sb.append("group-on-aligned");
            } else {
                if (i == 5) {
                    sb.append("group-thousands");
                    return;
                }
                throw new AssertionError();
            }
        }

        public static void OLrzqt(NumberFormatter.UnitWidth unitWidth, StringBuilder sb) {
            switch (AnonymousClass5.copydefault[unitWidth.ordinal()]) {
                case 1:
                    sb.append("unit-width-narrow");
                    return;
                case 2:
                    sb.append("unit-width-short");
                    return;
                case 3:
                    sb.append("unit-width-full-name");
                    return;
                case 4:
                    sb.append("unit-width-iso-code");
                    return;
                case 5:
                    sb.append("unit-width-formal");
                    return;
                case 6:
                    sb.append("unit-width-variant");
                    return;
                case 7:
                    sb.append("unit-width-hidden");
                    return;
                default:
                    throw new AssertionError();
            }
        }

        public static void EZpvd(NumberFormatter.SignDisplay signDisplay, StringBuilder sb) {
            switch (AnonymousClass5.OLrzqt[signDisplay.ordinal()]) {
                case 1:
                    sb.append("sign-auto");
                    return;
                case 2:
                    sb.append("sign-always");
                    return;
                case 3:
                    sb.append("sign-never");
                    return;
                case 4:
                    sb.append("sign-accounting");
                    return;
                case 5:
                    sb.append("sign-accounting-always");
                    return;
                case 6:
                    sb.append("sign-except-zero");
                    return;
                case 7:
                    sb.append("sign-accounting-except-zero");
                    return;
                default:
                    throw new AssertionError();
            }
        }

        public static void copydefault(NumberFormatter.DecimalSeparatorDisplay decimalSeparatorDisplay, StringBuilder sb) {
            int i = AnonymousClass5.KWHzl[decimalSeparatorDisplay.ordinal()];
            if (i == 1) {
                sb.append("decimal-auto");
            } else {
                if (i == 2) {
                    sb.append("decimal-always");
                    return;
                }
                throw new AssertionError();
            }
        }
    }

    public static C7187afB copydefault(String str) {
        return OLrzqt.AEQbTJ(str, null);
    }

    public static C7187afB EZpvd(String str) {
        return NumberFormatter.EZpvd().OLrzqt(KWHzl(str));
    }

    public static String copydefault(C7168aej c7168aej) {
        StringBuilder sb = new StringBuilder();
        AEQbTJ(c7168aej, sb);
        return sb.toString();
    }

    public static C7168aej KWHzl(String str) {
        ParseState parseState;
        C7168aej c7168aej = new C7168aej();
        C7031acE c7031acE = new C7031acE(str + " ", false);
        C7244agF c7244agF = new C7244agF(copydefault, 0);
        ParseState parseStateAEQbTJ = ParseState.STATE_NULL;
        int iCharCount = 0;
        while (iCharCount < c7031acE.length()) {
            int iKWHzl = c7031acE.KWHzl(iCharCount);
            boolean zAEQbTJ = C7070acr.AEQbTJ(iKWHzl);
            boolean z = iKWHzl == 47;
            if (!zAEQbTJ && !z) {
                iCharCount += Character.charCount(iKWHzl);
                if (parseStateAEQbTJ == ParseState.STATE_NULL) {
                    c7244agF.AEQbTJ(iKWHzl);
                }
            } else {
                if (iCharCount != 0) {
                    c7031acE.OLrzqt(iCharCount);
                    if (parseStateAEQbTJ == ParseState.STATE_NULL) {
                        parseStateAEQbTJ = copydefault(c7031acE, c7244agF, c7168aej);
                        c7244agF.OLrzqt();
                    } else {
                        parseStateAEQbTJ = AEQbTJ(parseStateAEQbTJ, c7031acE, c7168aej);
                    }
                    c7031acE.OLrzqt();
                    c7031acE.EZpvd(iCharCount);
                    iCharCount = 0;
                } else if (parseStateAEQbTJ != ParseState.STATE_NULL) {
                    c7031acE.OLrzqt(Character.charCount(iKWHzl));
                    throw new SkeletonSyntaxException("Unexpected separator character", c7031acE);
                }
                if (z && parseStateAEQbTJ == ParseState.STATE_NULL) {
                    c7031acE.OLrzqt(Character.charCount(iKWHzl));
                    throw new SkeletonSyntaxException("Unexpected option separator", c7031acE);
                }
                if (zAEQbTJ && parseStateAEQbTJ != (parseState = ParseState.STATE_NULL)) {
                    switch (AnonymousClass5.AEQbTJ[parseStateAEQbTJ.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                            c7031acE.OLrzqt(Character.charCount(iKWHzl));
                            throw new SkeletonSyntaxException("Stem requires an option", c7031acE);
                        default:
                            parseStateAEQbTJ = parseState;
                            break;
                    }
                }
                c7031acE.EZpvd(Character.charCount(iKWHzl));
            }
        }
        return c7168aej;
    }

    /* JADX INFO: renamed from: com.ibm.icu.number.NumberSkeletonImpl$5, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass5 {
        public static final /* synthetic */ int[] AEQbTJ;
        public static final /* synthetic */ int[] AhwBna;
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;
        public static final /* synthetic */ int[] copydefault;
        public static final /* synthetic */ int[] valueOf;

        static {
            int[] iArr = new int[ParseState.values().length];
            AEQbTJ = iArr;
            try {
                iArr[ParseState.STATE_INCREMENT_PRECISION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AEQbTJ[ParseState.STATE_MEASURE_UNIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                AEQbTJ[ParseState.STATE_PER_MEASURE_UNIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                AEQbTJ[ParseState.STATE_IDENTIFIER_UNIT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                AEQbTJ[ParseState.STATE_UNIT_USAGE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                AEQbTJ[ParseState.STATE_CURRENCY_UNIT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                AEQbTJ[ParseState.STATE_INTEGER_WIDTH.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                AEQbTJ[ParseState.STATE_NUMBERING_SYSTEM.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                AEQbTJ[ParseState.STATE_SCALE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                AEQbTJ[ParseState.STATE_SCIENTIFIC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                AEQbTJ[ParseState.STATE_FRACTION_PRECISION.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[NumberFormatter.DecimalSeparatorDisplay.values().length];
            KWHzl = iArr2;
            try {
                iArr2[NumberFormatter.DecimalSeparatorDisplay.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                KWHzl[NumberFormatter.DecimalSeparatorDisplay.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            int[] iArr3 = new int[NumberFormatter.SignDisplay.values().length];
            OLrzqt = iArr3;
            try {
                iArr3[NumberFormatter.SignDisplay.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                OLrzqt[NumberFormatter.SignDisplay.ALWAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                OLrzqt[NumberFormatter.SignDisplay.NEVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                OLrzqt[NumberFormatter.SignDisplay.ACCOUNTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                OLrzqt[NumberFormatter.SignDisplay.ACCOUNTING_ALWAYS.ordinal()] = 5;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                OLrzqt[NumberFormatter.SignDisplay.EXCEPT_ZERO.ordinal()] = 6;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                OLrzqt[NumberFormatter.SignDisplay.ACCOUNTING_EXCEPT_ZERO.ordinal()] = 7;
            } catch (NoSuchFieldError unused20) {
            }
            int[] iArr4 = new int[NumberFormatter.UnitWidth.values().length];
            copydefault = iArr4;
            try {
                iArr4[NumberFormatter.UnitWidth.NARROW.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                copydefault[NumberFormatter.UnitWidth.SHORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                copydefault[NumberFormatter.UnitWidth.FULL_NAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                copydefault[NumberFormatter.UnitWidth.ISO_CODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                copydefault[NumberFormatter.UnitWidth.FORMAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                copydefault[NumberFormatter.UnitWidth.VARIANT.ordinal()] = 6;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                copydefault[NumberFormatter.UnitWidth.HIDDEN.ordinal()] = 7;
            } catch (NoSuchFieldError unused27) {
            }
            int[] iArr5 = new int[NumberFormatter.GroupingStrategy.values().length];
            EZpvd = iArr5;
            try {
                iArr5[NumberFormatter.GroupingStrategy.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                EZpvd[NumberFormatter.GroupingStrategy.MIN2.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                EZpvd[NumberFormatter.GroupingStrategy.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                EZpvd[NumberFormatter.GroupingStrategy.ON_ALIGNED.ordinal()] = 4;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                EZpvd[NumberFormatter.GroupingStrategy.THOUSANDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused32) {
            }
            int[] iArr6 = new int[RoundingMode.values().length];
            AhwBna = iArr6;
            try {
                iArr6[RoundingMode.CEILING.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                AhwBna[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                AhwBna[RoundingMode.DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                AhwBna[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                AhwBna[RoundingMode.HALF_EVEN.ordinal()] = 5;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                AhwBna[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                AhwBna[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                AhwBna[RoundingMode.UNNECESSARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused40) {
            }
            int[] iArr7 = new int[StemEnum.values().length];
            valueOf = iArr7;
            try {
                iArr7[StemEnum.STEM_COMPACT_SHORT.ordinal()] = 1;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                valueOf[StemEnum.STEM_COMPACT_LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                valueOf[StemEnum.STEM_SCIENTIFIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                valueOf[StemEnum.STEM_ENGINEERING.ordinal()] = 4;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                valueOf[StemEnum.STEM_NOTATION_SIMPLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                valueOf[StemEnum.STEM_BASE_UNIT.ordinal()] = 6;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                valueOf[StemEnum.STEM_PERCENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                valueOf[StemEnum.STEM_PERMILLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                valueOf[StemEnum.STEM_PRECISION_INTEGER.ordinal()] = 9;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                valueOf[StemEnum.STEM_PRECISION_UNLIMITED.ordinal()] = 10;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                valueOf[StemEnum.STEM_PRECISION_CURRENCY_STANDARD.ordinal()] = 11;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                valueOf[StemEnum.STEM_PRECISION_CURRENCY_CASH.ordinal()] = 12;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                valueOf[StemEnum.STEM_ROUNDING_MODE_CEILING.ordinal()] = 13;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                valueOf[StemEnum.STEM_ROUNDING_MODE_FLOOR.ordinal()] = 14;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                valueOf[StemEnum.STEM_ROUNDING_MODE_DOWN.ordinal()] = 15;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                valueOf[StemEnum.STEM_ROUNDING_MODE_UP.ordinal()] = 16;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                valueOf[StemEnum.STEM_ROUNDING_MODE_HALF_EVEN.ordinal()] = 17;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                valueOf[StemEnum.STEM_ROUNDING_MODE_HALF_DOWN.ordinal()] = 18;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                valueOf[StemEnum.STEM_ROUNDING_MODE_HALF_UP.ordinal()] = 19;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                valueOf[StemEnum.STEM_ROUNDING_MODE_UNNECESSARY.ordinal()] = 20;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                valueOf[StemEnum.STEM_GROUP_OFF.ordinal()] = 21;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                valueOf[StemEnum.STEM_GROUP_MIN2.ordinal()] = 22;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                valueOf[StemEnum.STEM_GROUP_AUTO.ordinal()] = 23;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                valueOf[StemEnum.STEM_GROUP_ON_ALIGNED.ordinal()] = 24;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                valueOf[StemEnum.STEM_GROUP_THOUSANDS.ordinal()] = 25;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                valueOf[StemEnum.STEM_UNIT_WIDTH_NARROW.ordinal()] = 26;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                valueOf[StemEnum.STEM_UNIT_WIDTH_SHORT.ordinal()] = 27;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                valueOf[StemEnum.STEM_UNIT_WIDTH_FULL_NAME.ordinal()] = 28;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                valueOf[StemEnum.STEM_UNIT_WIDTH_ISO_CODE.ordinal()] = 29;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                valueOf[StemEnum.STEM_UNIT_WIDTH_FORMAL.ordinal()] = 30;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                valueOf[StemEnum.STEM_UNIT_WIDTH_VARIANT.ordinal()] = 31;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                valueOf[StemEnum.STEM_UNIT_WIDTH_HIDDEN.ordinal()] = 32;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                valueOf[StemEnum.STEM_SIGN_AUTO.ordinal()] = 33;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                valueOf[StemEnum.STEM_SIGN_ALWAYS.ordinal()] = 34;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                valueOf[StemEnum.STEM_SIGN_NEVER.ordinal()] = 35;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                valueOf[StemEnum.STEM_SIGN_ACCOUNTING.ordinal()] = 36;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                valueOf[StemEnum.STEM_SIGN_ACCOUNTING_ALWAYS.ordinal()] = 37;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                valueOf[StemEnum.STEM_SIGN_EXCEPT_ZERO.ordinal()] = 38;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                valueOf[StemEnum.STEM_SIGN_ACCOUNTING_EXCEPT_ZERO.ordinal()] = 39;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                valueOf[StemEnum.STEM_DECIMAL_AUTO.ordinal()] = 40;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                valueOf[StemEnum.STEM_DECIMAL_ALWAYS.ordinal()] = 41;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                valueOf[StemEnum.STEM_PERCENT_100.ordinal()] = 42;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                valueOf[StemEnum.STEM_LATIN.ordinal()] = 43;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                valueOf[StemEnum.STEM_PRECISION_INCREMENT.ordinal()] = 44;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                valueOf[StemEnum.STEM_MEASURE_UNIT.ordinal()] = 45;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                valueOf[StemEnum.STEM_PER_MEASURE_UNIT.ordinal()] = 46;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                valueOf[StemEnum.STEM_UNIT.ordinal()] = 47;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                valueOf[StemEnum.STEM_UNIT_USAGE.ordinal()] = 48;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                valueOf[StemEnum.STEM_CURRENCY.ordinal()] = 49;
            } catch (NoSuchFieldError unused89) {
            }
            try {
                valueOf[StemEnum.STEM_INTEGER_WIDTH.ordinal()] = 50;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                valueOf[StemEnum.STEM_NUMBERING_SYSTEM.ordinal()] = 51;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                valueOf[StemEnum.STEM_SCALE.ordinal()] = 52;
            } catch (NoSuchFieldError unused92) {
            }
        }
    }

    public static ParseState copydefault(C7031acE c7031acE, C7244agF c7244agF, C7168aej c7168aej) {
        char cCharAt = c7031acE.charAt(0);
        if (cCharAt == '.') {
            OLrzqt(c7168aej.valueOf, c7031acE);
            TaskDescription.getFieldNames(c7031acE, c7168aej);
            return ParseState.STATE_FRACTION_PRECISION;
        }
        if (cCharAt == '0') {
            OLrzqt(c7168aej.OLrzqt, c7031acE);
            TaskDescription.uzCIH(c7031acE, c7168aej);
            return ParseState.STATE_NULL;
        }
        if (cCharAt == '@') {
            OLrzqt(c7168aej.valueOf, c7031acE);
            TaskDescription.fARcdN(c7031acE, c7168aej);
            return ParseState.STATE_NULL;
        }
        if (cCharAt == 'E') {
            OLrzqt(c7168aej.AYXKKw, c7031acE);
            TaskDescription.gHZMYf(c7031acE, c7168aej);
            return ParseState.STATE_NULL;
        }
        BytesTrie.Result resultKWHzl = c7244agF.KWHzl();
        if (resultKWHzl != BytesTrie.Result.INTERMEDIATE_VALUE && resultKWHzl != BytesTrie.Result.FINAL_VALUE) {
            throw new SkeletonSyntaxException("Unknown stem", c7031acE);
        }
        StemEnum stemEnum = AEQbTJ[c7244agF.EZpvd()];
        int[] iArr = AnonymousClass5.valueOf;
        switch (iArr[stemEnum.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                OLrzqt(c7168aej.AYXKKw, c7031acE);
                c7168aej.AYXKKw = ActionBar.fetchVPNInfo(stemEnum);
                int i = iArr[stemEnum.ordinal()];
                if (i == 3 || i == 4) {
                    return ParseState.STATE_SCIENTIFIC;
                }
                return ParseState.STATE_NULL;
            case 6:
            case 7:
            case 8:
                OLrzqt(c7168aej.ejfBZ, c7031acE);
                c7168aej.ejfBZ = ActionBar.isConnected(stemEnum);
                return ParseState.STATE_NULL;
            case 9:
            case 10:
            case 11:
            case 12:
                OLrzqt(c7168aej.valueOf, c7031acE);
                c7168aej.valueOf = ActionBar.values(stemEnum);
                if (iArr[stemEnum.ordinal()] == 9) {
                    return ParseState.STATE_FRACTION_PRECISION;
                }
                return ParseState.STATE_NULL;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
                OLrzqt(c7168aej.gEmmrt, c7031acE);
                c7168aej.gEmmrt = ActionBar.AkhnZx(stemEnum);
                return ParseState.STATE_NULL;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                OLrzqt(c7168aej.EZpvd, c7031acE);
                c7168aej.EZpvd = ActionBar.gEmmrt(stemEnum);
                return ParseState.STATE_NULL;
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
                OLrzqt(c7168aej.fIwbmz, c7031acE);
                c7168aej.fIwbmz = ActionBar.fIwbmz(stemEnum);
                return ParseState.STATE_NULL;
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
                OLrzqt(c7168aej.AkhnZx, c7031acE);
                c7168aej.AkhnZx = ActionBar.DbNXlk(stemEnum);
                return ParseState.STATE_NULL;
            case 40:
            case 41:
                OLrzqt(c7168aej.KWHzl, c7031acE);
                c7168aej.KWHzl = ActionBar.AYXKKw(stemEnum);
                return ParseState.STATE_NULL;
            case 42:
                OLrzqt(c7168aej.isConnected, c7031acE);
                OLrzqt(c7168aej.ejfBZ, c7031acE);
                c7168aej.isConnected = C7235afx.EZpvd(2);
                c7168aej.ejfBZ = C7257agS.EZpvd;
                return ParseState.STATE_NULL;
            case 43:
                OLrzqt(c7168aej.fetchVPNInfo, c7031acE);
                c7168aej.fetchVPNInfo = C7275agk.EZpvd;
                return ParseState.STATE_NULL;
            case 44:
                OLrzqt(c7168aej.valueOf, c7031acE);
                return ParseState.STATE_INCREMENT_PRECISION;
            case 45:
                OLrzqt(c7168aej.ejfBZ, c7031acE);
                return ParseState.STATE_MEASURE_UNIT;
            case 46:
                if (c7168aej.ejfBZ instanceof Currency) {
                    throw new SkeletonSyntaxException("Duplicated setting", c7031acE);
                }
                OLrzqt(c7168aej.AhwBna, c7031acE);
                return ParseState.STATE_PER_MEASURE_UNIT;
            case 47:
                OLrzqt(c7168aej.ejfBZ, c7031acE);
                OLrzqt(c7168aej.AhwBna, c7031acE);
                return ParseState.STATE_IDENTIFIER_UNIT;
            case 48:
                OLrzqt(c7168aej.fARcdN, c7031acE);
                return ParseState.STATE_UNIT_USAGE;
            case 49:
                OLrzqt(c7168aej.ejfBZ, c7031acE);
                OLrzqt(c7168aej.AhwBna, c7031acE);
                return ParseState.STATE_CURRENCY_UNIT;
            case 50:
                OLrzqt(c7168aej.OLrzqt, c7031acE);
                return ParseState.STATE_INTEGER_WIDTH;
            case 51:
                OLrzqt(c7168aej.fetchVPNInfo, c7031acE);
                return ParseState.STATE_NUMBERING_SYSTEM;
            case 52:
                OLrzqt(c7168aej.isConnected, c7031acE);
                return ParseState.STATE_SCALE;
            default:
                throw new AssertionError();
        }
    }

    public static ParseState AEQbTJ(ParseState parseState, C7031acE c7031acE, C7168aej c7168aej) {
        int[] iArr = AnonymousClass5.AEQbTJ;
        switch (iArr[parseState.ordinal()]) {
            case 1:
                TaskDescription.hDKMBd(c7031acE, c7168aej);
                return ParseState.STATE_NULL;
            case 2:
                TaskDescription.wlaJM(c7031acE, c7168aej);
                return ParseState.STATE_NULL;
            case 3:
                TaskDescription.AubY(c7031acE, c7168aej);
                return ParseState.STATE_NULL;
            case 4:
                TaskDescription.getNewProxyInstance(c7031acE, c7168aej);
                return ParseState.STATE_NULL;
            case 5:
                TaskDescription.sSMYrx(c7031acE, c7168aej);
                return ParseState.STATE_NULL;
            case 6:
                TaskDescription.fJNWhG(c7031acE, c7168aej);
                return ParseState.STATE_NULL;
            case 7:
                TaskDescription.zLjUOn(c7031acE, c7168aej);
                return ParseState.STATE_NULL;
            case 8:
                TaskDescription.zsXlph(c7031acE, c7168aej);
                return ParseState.STATE_NULL;
            case 9:
                TaskDescription.AuCTelauCTel(c7031acE, c7168aej);
                return ParseState.STATE_NULL;
            default:
                if (iArr[parseState.ordinal()] == 10) {
                    if (TaskDescription.AuCTel(c7031acE, c7168aej)) {
                        return ParseState.STATE_SCIENTIFIC;
                    }
                    if (TaskDescription.ejfBZ(c7031acE, c7168aej)) {
                        return ParseState.STATE_SCIENTIFIC;
                    }
                }
                if (iArr[parseState.ordinal()] == 11 && TaskDescription.iwGUEr(c7031acE, c7168aej)) {
                    return ParseState.STATE_NULL;
                }
                throw new SkeletonSyntaxException("Invalid option", c7031acE);
        }
    }

    public static void AEQbTJ(C7168aej c7168aej, StringBuilder sb) {
        if (c7168aej.AYXKKw != null && StateListAnimator.fARcdN(c7168aej, sb)) {
            sb.append(' ');
        }
        if (c7168aej.ejfBZ != null && StateListAnimator.iwGUEr(c7168aej, sb)) {
            sb.append(' ');
        }
        if (c7168aej.fARcdN != null && StateListAnimator.hDKMBd(c7168aej, sb)) {
            sb.append(' ');
        }
        if (c7168aej.valueOf != null && StateListAnimator.AuCTel(c7168aej, sb)) {
            sb.append(' ');
        }
        if (c7168aej.gEmmrt != null && StateListAnimator.ejfBZ(c7168aej, sb)) {
            sb.append(' ');
        }
        if (c7168aej.EZpvd != null && StateListAnimator.DbNXlk(c7168aej, sb)) {
            sb.append(' ');
        }
        if (c7168aej.OLrzqt != null && StateListAnimator.fetchVPNInfo(c7168aej, sb)) {
            sb.append(' ');
        }
        if (c7168aej.fetchVPNInfo != null && StateListAnimator.getNewProxyInstance(c7168aej, sb)) {
            sb.append(' ');
        }
        if (c7168aej.fIwbmz != null && StateListAnimator.uzCIH(c7168aej, sb)) {
            sb.append(' ');
        }
        if (c7168aej.AkhnZx != null && StateListAnimator.fIwbmz(c7168aej, sb)) {
            sb.append(' ');
        }
        if (c7168aej.KWHzl != null && StateListAnimator.AkhnZx(c7168aej, sb)) {
            sb.append(' ');
        }
        if (c7168aej.isConnected != null && StateListAnimator.fJNWhG(c7168aej, sb)) {
            sb.append(' ');
        }
        if (c7168aej.djBIcL != null) {
            throw new UnsupportedOperationException("Cannot generate number skeleton with custom padder");
        }
        if (c7168aej.AEQbTJ != null) {
            throw new UnsupportedOperationException("Cannot generate number skeleton with custom affix provider");
        }
        if (c7168aej.DbNXlk != null) {
            throw new UnsupportedOperationException("Cannot generate number skeleton with custom plural rules");
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
    }

    public static final class TaskDescription {
        public static boolean AuCTel(C7031acE c7031acE, C7168aej c7168aej) {
            if (!NumberSkeletonImpl.EZpvd(c7031acE.charAt(0))) {
                return false;
            }
            int i = 0;
            int i2 = 1;
            while (i2 < c7031acE.length() && c7031acE.charAt(i2) == 'e') {
                i++;
                i2++;
            }
            if (i2 < c7031acE.length()) {
                return false;
            }
            c7168aej.AYXKKw = ((C7234afw) c7168aej.AYXKKw).AEQbTJ(i);
            return true;
        }

        public static void copydefault(int i, StringBuilder sb) {
            sb.append('*');
            NumberSkeletonImpl.EZpvd(sb, 101, i);
        }

        public static boolean ejfBZ(C7031acE c7031acE, C7168aej c7168aej) {
            NumberFormatter.SignDisplay signDisplayDbNXlk;
            C7244agF c7244agF = new C7244agF(NumberSkeletonImpl.copydefault, 0);
            BytesTrie.Result resultOLrzqt = c7244agF.OLrzqt(c7031acE, 0, c7031acE.length());
            if ((resultOLrzqt != BytesTrie.Result.INTERMEDIATE_VALUE && resultOLrzqt != BytesTrie.Result.FINAL_VALUE) || (signDisplayDbNXlk = ActionBar.DbNXlk(NumberSkeletonImpl.AEQbTJ[c7244agF.EZpvd()])) == null) {
                return false;
            }
            c7168aej.AYXKKw = ((C7234afw) c7168aej.AYXKKw).AEQbTJ(signDisplayDbNXlk);
            return true;
        }

        public static void fJNWhG(C7031acE c7031acE, C7168aej c7168aej) {
            try {
                c7168aej.ejfBZ = Currency.getInstance(c7031acE.subSequence(0, c7031acE.length()).toString());
            } catch (IllegalArgumentException e) {
                throw new SkeletonSyntaxException("Invalid currency", c7031acE, e);
            }
        }

        public static void KWHzl(Currency currency, StringBuilder sb) {
            sb.append(currency.getCurrencyCode());
        }

        public static void wlaJM(C7031acE c7031acE, C7168aej c7168aej) {
            int i = 0;
            while (i < c7031acE.length() && c7031acE.charAt(i) != '-') {
                i++;
            }
            if (i == c7031acE.length()) {
                throw new SkeletonSyntaxException("Invalid measure unit option", c7031acE);
            }
            String string = c7031acE.subSequence(0, i).toString();
            String string2 = c7031acE.subSequence(i + 1, c7031acE.length()).toString();
            for (MeasureUnit measureUnit : MeasureUnit.getAvailable(string)) {
                if (string2.equals(measureUnit.getSubtype())) {
                    c7168aej.ejfBZ = measureUnit;
                    return;
                }
            }
            throw new SkeletonSyntaxException("Unknown measure unit", c7031acE);
        }

        public static void AubY(C7031acE c7031acE, C7168aej c7168aej) {
            MeasureUnit measureUnit = c7168aej.ejfBZ;
            wlaJM(c7031acE, c7168aej);
            c7168aej.AhwBna = c7168aej.ejfBZ;
            c7168aej.ejfBZ = measureUnit;
        }

        public static void getNewProxyInstance(C7031acE c7031acE, C7168aej c7168aej) {
            try {
                MeasureUnitImpl measureUnitImplEZpvd = MeasureUnitImpl.EZpvd(c7031acE.KWHzl());
                if (measureUnitImplEZpvd.OLrzqt() == MeasureUnit.Complexity.MIXED) {
                    c7168aej.ejfBZ = measureUnitImplEZpvd.AEQbTJ();
                    return;
                }
                MeasureUnit measureUnitAEQbTJ = measureUnitImplEZpvd.AEQbTJ();
                if (measureUnitAEQbTJ.getType() != null) {
                    c7168aej.ejfBZ = measureUnitAEQbTJ;
                    return;
                }
                for (C7215afd c7215afd : measureUnitImplEZpvd.gEmmrt()) {
                    if (c7215afd.EZpvd() > 0) {
                        MeasureUnit measureUnit = c7168aej.ejfBZ;
                        if (measureUnit == null) {
                            c7168aej.ejfBZ = c7215afd.AEQbTJ();
                        } else {
                            c7168aej.ejfBZ = measureUnit.product(c7215afd.AEQbTJ());
                        }
                    } else {
                        c7215afd.copydefault(c7215afd.EZpvd() * (-1));
                        MeasureUnit measureUnit2 = c7168aej.AhwBna;
                        if (measureUnit2 == null) {
                            c7168aej.AhwBna = c7215afd.AEQbTJ();
                        } else {
                            c7168aej.AhwBna = measureUnit2.product(c7215afd.AEQbTJ());
                        }
                    }
                }
            } catch (IllegalArgumentException unused) {
                throw new SkeletonSyntaxException("Invalid unit stem", c7031acE);
            }
        }

        public static void sSMYrx(C7031acE c7031acE, C7168aej c7168aej) {
            c7168aej.fARcdN = c7031acE.KWHzl();
        }

        public static void getFieldNames(C7031acE c7031acE, C7168aej c7168aej) {
            int i;
            int i2 = 1;
            int i3 = 0;
            while (i2 < c7031acE.length() && c7031acE.charAt(i2) == '0') {
                i3++;
                i2++;
            }
            if (i2 >= c7031acE.length()) {
                i = i3;
            } else if (NumberSkeletonImpl.EZpvd(c7031acE.charAt(i2))) {
                i2++;
                i = -1;
            } else {
                i = i3;
                while (i2 < c7031acE.length() && c7031acE.charAt(i2) == '#') {
                    i++;
                    i2++;
                }
            }
            if (i2 < c7031acE.length()) {
                throw new SkeletonSyntaxException("Invalid fraction stem", c7031acE);
            }
            if (i != -1) {
                c7168aej.valueOf = AbstractC7236afy.OLrzqt(i3, i);
            } else if (i3 == 0) {
                c7168aej.valueOf = AbstractC7236afy.OLrzqt();
            } else {
                c7168aej.valueOf = AbstractC7236afy.djBIcL(i3);
            }
        }

        public static void OLrzqt(int i, int i2, StringBuilder sb) {
            if (i == 0 && i2 == 0) {
                sb.append("precision-integer");
                return;
            }
            sb.append('.');
            NumberSkeletonImpl.EZpvd(sb, 48, i);
            if (i2 != -1) {
                NumberSkeletonImpl.EZpvd(sb, 35, i2 - i);
            } else {
                sb.append('*');
            }
        }

        public static void fARcdN(C7031acE c7031acE, C7168aej c7168aej) {
            int i;
            int i2 = 0;
            int i3 = 0;
            while (i2 < c7031acE.length() && c7031acE.charAt(i2) == '@') {
                i3++;
                i2++;
            }
            if (i2 >= c7031acE.length()) {
                i = i3;
            } else if (NumberSkeletonImpl.EZpvd(c7031acE.charAt(i2))) {
                i2++;
                i = -1;
            } else {
                i = i3;
                while (i2 < c7031acE.length() && c7031acE.charAt(i2) == '#') {
                    i++;
                    i2++;
                }
            }
            if (i2 < c7031acE.length()) {
                throw new SkeletonSyntaxException("Invalid significant digits stem", c7031acE);
            }
            if (i == -1) {
                c7168aej.valueOf = AbstractC7236afy.DbNXlk(i3);
            } else {
                c7168aej.valueOf = AbstractC7236afy.EZpvd(i3, i);
            }
        }

        public static void EZpvd(int i, int i2, StringBuilder sb) {
            NumberSkeletonImpl.EZpvd(sb, 64, i);
            if (i2 != -1) {
                NumberSkeletonImpl.EZpvd(sb, 35, i2 - i);
            } else {
                sb.append('*');
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:36:? A[PHI: r1 r2
  PHI (r1v2 int) = (r1v1 int), (r1v5 int) binds: [B:11:0x0023, B:21:0x0048] A[DONT_GENERATE, DONT_INLINE]
  PHI (r2v2 com.ibm.icu.number.NumberFormatter$SignDisplay) = (r2v1 com.ibm.icu.number.NumberFormatter$SignDisplay), (r2v6 com.ibm.icu.number.NumberFormatter$SignDisplay) binds: [B:11:0x0023, B:21:0x0048] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static void gHZMYf(C7031acE c7031acE, C7168aej c7168aej) {
            boolean z;
            int i = 1;
            if (c7031acE.length() != 1) {
                int i2 = 0;
                if (c7031acE.charAt(1) != 'E') {
                    z = false;
                } else if (c7031acE.length() != 2) {
                    z = true;
                    i = 2;
                }
                NumberFormatter.SignDisplay signDisplay = NumberFormatter.SignDisplay.AUTO;
                if (c7031acE.charAt(i) == '+') {
                    int i3 = i + 1;
                    if (c7031acE.length() != i3) {
                        if (c7031acE.charAt(i3) == '!') {
                            signDisplay = NumberFormatter.SignDisplay.ALWAYS;
                        } else if (c7031acE.charAt(i3) == '?') {
                            signDisplay = NumberFormatter.SignDisplay.EXCEPT_ZERO;
                        }
                        i += 2;
                        if (c7031acE.length() != i) {
                        }
                    }
                } else {
                    while (i < c7031acE.length()) {
                        if (c7031acE.charAt(i) == '0') {
                            i2++;
                            i++;
                        }
                    }
                    c7168aej.AYXKKw = (z ? C7230afs.copydefault() : C7230afs.KWHzl()).AEQbTJ(signDisplay).AEQbTJ(i2);
                    return;
                }
            }
            throw new SkeletonSyntaxException("Invalid scientific stem", c7031acE);
        }

        public static void uzCIH(C7031acE c7031acE, C7168aej c7168aej) {
            int i = 1;
            while (true) {
                if (i >= c7031acE.length()) {
                    break;
                }
                if (c7031acE.charAt(i) != '0') {
                    i--;
                    break;
                }
                i++;
            }
            if (i < c7031acE.length()) {
                throw new SkeletonSyntaxException("Invalid integer stem", c7031acE);
            }
            c7168aej.OLrzqt = C7228afq.KWHzl(i);
        }

        public static boolean iwGUEr(C7031acE c7031acE, C7168aej c7168aej) {
            int i;
            int i2 = 0;
            if (c7031acE.charAt(0) != '@') {
                return false;
            }
            int i3 = 0;
            while (i2 < c7031acE.length() && c7031acE.charAt(i2) == '@') {
                i3++;
                i2++;
            }
            if (i2 < c7031acE.length()) {
                if (NumberSkeletonImpl.EZpvd(c7031acE.charAt(i2))) {
                    i2++;
                    i = -1;
                } else {
                    if (i3 > 1) {
                        throw new SkeletonSyntaxException("Invalid digits option for fraction rounder", c7031acE);
                    }
                    i = i3;
                    while (i2 < c7031acE.length() && c7031acE.charAt(i2) == '#') {
                        i++;
                        i2++;
                    }
                }
                if (i2 < c7031acE.length()) {
                    throw new SkeletonSyntaxException("Invalid digits option for fraction rounder", c7031acE);
                }
                AbstractC7224afm abstractC7224afm = (AbstractC7224afm) c7168aej.valueOf;
                if (i == -1) {
                    c7168aej.valueOf = abstractC7224afm.copydefault(i3);
                } else {
                    c7168aej.valueOf = abstractC7224afm.KWHzl(i);
                }
                return true;
            }
            throw new SkeletonSyntaxException("Invalid digits option for fraction rounder", c7031acE);
        }

        public static void hDKMBd(C7031acE c7031acE, C7168aej c7168aej) {
            try {
                c7168aej.valueOf = AbstractC7236afy.OLrzqt(new BigDecimal(c7031acE.subSequence(0, c7031acE.length()).toString()));
            } catch (NumberFormatException e) {
                throw new SkeletonSyntaxException("Invalid rounding increment", c7031acE, e);
            }
        }

        public static void OLrzqt(BigDecimal bigDecimal, StringBuilder sb) {
            sb.append(bigDecimal.toPlainString());
        }

        public static void zLjUOn(C7031acE c7031acE, C7168aej c7168aej) {
            int i;
            int i2;
            int i3 = 0;
            if (NumberSkeletonImpl.EZpvd(c7031acE.charAt(0))) {
                i = 1;
                i2 = -1;
            } else {
                i = 0;
                i2 = 0;
            }
            while (i < c7031acE.length() && i2 != -1 && c7031acE.charAt(i) == '#') {
                i2++;
                i++;
            }
            if (i < c7031acE.length()) {
                while (i < c7031acE.length() && c7031acE.charAt(i) == '0') {
                    i3++;
                    i++;
                }
            }
            if (i2 != -1) {
                i2 += i3;
            }
            if (i < c7031acE.length()) {
                throw new SkeletonSyntaxException("Invalid integer width stem", c7031acE);
            }
            if (i2 == -1) {
                c7168aej.OLrzqt = C7228afq.KWHzl(i3);
            } else {
                c7168aej.OLrzqt = C7228afq.KWHzl(i3).AEQbTJ(i2);
            }
        }

        public static void gEmmrt(int i, int i2, StringBuilder sb) {
            if (i2 != -1) {
                NumberSkeletonImpl.EZpvd(sb, 35, i2 - i);
            } else {
                sb.append('*');
            }
            NumberSkeletonImpl.EZpvd(sb, 48, i);
        }

        public static void zsXlph(C7031acE c7031acE, C7168aej c7168aej) {
            C7275agk c7275agkOLrzqt = C7275agk.OLrzqt(c7031acE.subSequence(0, c7031acE.length()).toString());
            if (c7275agkOLrzqt == null) {
                throw new SkeletonSyntaxException("Unknown numbering system", c7031acE);
            }
            c7168aej.fetchVPNInfo = c7275agkOLrzqt;
        }

        public static void KWHzl(C7275agk c7275agk, StringBuilder sb) {
            sb.append(c7275agk.EZpvd());
        }

        public static void AuCTelauCTel(C7031acE c7031acE, C7168aej c7168aej) {
            try {
                c7168aej.isConnected = C7235afx.EZpvd(new BigDecimal(c7031acE.subSequence(0, c7031acE.length()).toString()));
            } catch (NumberFormatException e) {
                throw new SkeletonSyntaxException("Invalid scale", c7031acE, e);
            }
        }

        public static void EZpvd(C7235afx c7235afx, StringBuilder sb) {
            BigDecimal bigDecimal = c7235afx.gEmmrt;
            if (bigDecimal == null) {
                bigDecimal = BigDecimal.ONE;
            }
            sb.append(bigDecimal.scaleByPowerOfTen(c7235afx.djBIcL).toPlainString());
        }
    }

    /* JADX INFO: loaded from: classes14.dex */
    public static final class StateListAnimator {
        public static boolean fARcdN(C7168aej c7168aej, StringBuilder sb) {
            C7230afs c7230afs = c7168aej.AYXKKw;
            if (c7230afs instanceof C7220afi) {
                if (c7230afs == C7230afs.EZpvd()) {
                    sb.append("compact-long");
                    return true;
                }
                if (c7168aej.AYXKKw == C7230afs.AEQbTJ()) {
                    sb.append("compact-short");
                    return true;
                }
                throw new UnsupportedOperationException("Cannot generate number skeleton with custom compact data");
            }
            if (!(c7230afs instanceof C7234afw)) {
                return false;
            }
            C7234afw c7234afw = (C7234afw) c7230afs;
            if (c7234afw.AEQbTJ == 3) {
                sb.append("engineering");
            } else {
                sb.append("scientific");
            }
            if (c7234afw.AhwBna > 1) {
                sb.append(JsonPointer.SEPARATOR);
                TaskDescription.copydefault(c7234afw.AhwBna, sb);
            }
            if (c7234afw.OLrzqt != NumberFormatter.SignDisplay.AUTO) {
                sb.append(JsonPointer.SEPARATOR);
                Activity.EZpvd(c7234afw.OLrzqt, sb);
            }
            return true;
        }

        public static boolean iwGUEr(C7168aej c7168aej, StringBuilder sb) {
            MeasureUnit measureUnitProduct = c7168aej.ejfBZ;
            MeasureUnit measureUnit = c7168aej.AhwBna;
            if (measureUnit != null) {
                if ((measureUnitProduct instanceof Currency) || (measureUnit instanceof Currency)) {
                    throw new UnsupportedOperationException("Cannot generate number skeleton with currency unit and per-unit");
                }
                measureUnitProduct = measureUnitProduct.product(measureUnit.reciprocal());
            }
            if (measureUnitProduct instanceof Currency) {
                sb.append("currency/");
                TaskDescription.KWHzl((Currency) measureUnitProduct, sb);
                return true;
            }
            if (measureUnitProduct.equals(MeasureUnit.PERCENT)) {
                sb.append("percent");
                return true;
            }
            if (measureUnitProduct.equals(MeasureUnit.PERMILLE)) {
                sb.append("permille");
                return true;
            }
            sb.append("unit/");
            sb.append(measureUnitProduct.getIdentifier());
            return true;
        }

        public static boolean hDKMBd(C7168aej c7168aej, StringBuilder sb) {
            String str = c7168aej.fARcdN;
            if (str == null || str.length() <= 0) {
                return false;
            }
            sb.append("usage/");
            sb.append(c7168aej.fARcdN);
            return true;
        }

        public static boolean AuCTel(C7168aej c7168aej, StringBuilder sb) {
            AbstractC7236afy abstractC7236afy = c7168aej.valueOf;
            if (abstractC7236afy instanceof AbstractC7236afy.FragmentManager) {
                sb.append("precision-unlimited");
            } else if (abstractC7236afy instanceof AbstractC7236afy.ActionBar) {
                AbstractC7236afy.ActionBar actionBar = (AbstractC7236afy.ActionBar) abstractC7236afy;
                TaskDescription.OLrzqt(actionBar.DbNXlk, actionBar.fetchVPNInfo, sb);
            } else if (abstractC7236afy instanceof AbstractC7236afy.LoaderManager) {
                AbstractC7236afy.LoaderManager loaderManager = (AbstractC7236afy.LoaderManager) abstractC7236afy;
                TaskDescription.EZpvd(loaderManager.fetchVPNInfo, loaderManager.DbNXlk, sb);
            } else if (abstractC7236afy instanceof AbstractC7236afy.StateListAnimator) {
                AbstractC7236afy.StateListAnimator stateListAnimator = (AbstractC7236afy.StateListAnimator) abstractC7236afy;
                TaskDescription.OLrzqt(stateListAnimator.fJNWhG, stateListAnimator.fetchVPNInfo, sb);
                sb.append(JsonPointer.SEPARATOR);
                int i = stateListAnimator.AuCTel;
                if (i == -1) {
                    TaskDescription.EZpvd(1, stateListAnimator.DbNXlk, sb);
                } else {
                    TaskDescription.EZpvd(i, -1, sb);
                }
            } else if (abstractC7236afy instanceof AbstractC7236afy.Dialog) {
                sb.append("precision-increment/");
                TaskDescription.OLrzqt(((AbstractC7236afy.Dialog) abstractC7236afy).fARcdN, sb);
            } else if (((AbstractC7236afy.Application) abstractC7236afy).DbNXlk == Currency.CurrencyUsage.STANDARD) {
                sb.append("precision-currency-standard");
            } else {
                sb.append("precision-currency-cash");
            }
            return true;
        }

        public static boolean ejfBZ(C7168aej c7168aej, StringBuilder sb) {
            RoundingMode roundingMode = c7168aej.gEmmrt;
            if (roundingMode == C7180aev.OLrzqt) {
                return false;
            }
            Activity.AEQbTJ(roundingMode, sb);
            return true;
        }

        public static boolean DbNXlk(C7168aej c7168aej, StringBuilder sb) {
            Object obj = c7168aej.EZpvd;
            if (obj instanceof NumberFormatter.GroupingStrategy) {
                if (obj == NumberFormatter.GroupingStrategy.AUTO) {
                    return false;
                }
                Activity.copydefault((NumberFormatter.GroupingStrategy) obj, sb);
                return true;
            }
            throw new UnsupportedOperationException("Cannot generate number skeleton with custom Grouper");
        }

        public static boolean fetchVPNInfo(C7168aej c7168aej, StringBuilder sb) {
            if (c7168aej.OLrzqt.equals(C7228afq.KWHzl)) {
                return false;
            }
            sb.append("integer-width/");
            C7228afq c7228afq = c7168aej.OLrzqt;
            TaskDescription.gEmmrt(c7228afq.OLrzqt, c7228afq.copydefault, sb);
            return true;
        }

        public static boolean getNewProxyInstance(C7168aej c7168aej, StringBuilder sb) {
            Object obj = c7168aej.fetchVPNInfo;
            if (obj instanceof C7275agk) {
                C7275agk c7275agk = (C7275agk) obj;
                if (c7275agk.EZpvd().equals("latn")) {
                    sb.append("latin");
                    return true;
                }
                sb.append("numbering-system/");
                TaskDescription.KWHzl(c7275agk, sb);
                return true;
            }
            throw new UnsupportedOperationException("Cannot generate number skeleton with custom DecimalFormatSymbols");
        }

        public static boolean uzCIH(C7168aej c7168aej, StringBuilder sb) {
            NumberFormatter.UnitWidth unitWidth = c7168aej.fIwbmz;
            if (unitWidth == NumberFormatter.UnitWidth.SHORT) {
                return false;
            }
            Activity.OLrzqt(unitWidth, sb);
            return true;
        }

        public static boolean fIwbmz(C7168aej c7168aej, StringBuilder sb) {
            NumberFormatter.SignDisplay signDisplay = c7168aej.AkhnZx;
            if (signDisplay == NumberFormatter.SignDisplay.AUTO) {
                return false;
            }
            Activity.EZpvd(signDisplay, sb);
            return true;
        }

        public static boolean AkhnZx(C7168aej c7168aej, StringBuilder sb) {
            NumberFormatter.DecimalSeparatorDisplay decimalSeparatorDisplay = c7168aej.KWHzl;
            if (decimalSeparatorDisplay == NumberFormatter.DecimalSeparatorDisplay.AUTO) {
                return false;
            }
            Activity.copydefault(decimalSeparatorDisplay, sb);
            return true;
        }

        public static boolean fJNWhG(C7168aej c7168aej, StringBuilder sb) {
            if (!c7168aej.isConnected.OLrzqt()) {
                return false;
            }
            sb.append("scale/");
            TaskDescription.EZpvd(c7168aej.isConnected, sb);
            return true;
        }
    }

    public static void OLrzqt(Object obj, CharSequence charSequence) {
        if (obj != null) {
            throw new SkeletonSyntaxException("Duplicated setting", charSequence);
        }
    }

    public static void EZpvd(StringBuilder sb, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.appendCodePoint(i);
        }
    }
}
