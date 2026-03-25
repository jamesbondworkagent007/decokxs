package o;

import com.ibm.icu.impl.StandardPlural;
import com.ibm.icu.impl.number.DecimalFormatProperties;
import com.ibm.icu.text.PluralRules;
import java.math.MathContext;
import java.math.RoundingMode;

/* JADX INFO: renamed from: o.aev, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7180aev {
    public static final MathContext EZpvd;
    public static final MathContext KWHzl;
    public static final RoundingMode OLrzqt = RoundingMode.HALF_EVEN;
    public static final MathContext[] AEQbTJ = new MathContext[RoundingMode.values().length];
    public static final MathContext[] copydefault = new MathContext[RoundingMode.values().length];

    public static boolean KWHzl(int i) {
        return (i == 0 || i == 1 || i == 2 || i == 3) ? false : true;
    }

    static {
        int i = 0;
        while (true) {
            MathContext[] mathContextArr = copydefault;
            if (i < mathContextArr.length) {
                AEQbTJ[i] = new MathContext(0, RoundingMode.valueOf(i));
                mathContextArr[i] = new MathContext(34);
                i++;
            } else {
                MathContext[] mathContextArr2 = AEQbTJ;
                RoundingMode roundingMode = OLrzqt;
                EZpvd = mathContextArr2[roundingMode.ordinal()];
                KWHzl = mathContextArr[roundingMode.ordinal()];
                return;
            }
        }
    }

    public static boolean KWHzl(boolean z, boolean z2, int i, int i2, java.lang.Object obj) {
        switch (i2) {
            case 0:
                return false;
            case 1:
                return true;
            case 2:
                return z2;
            case 3:
                return !z2;
            case 4:
                if (i == 1) {
                    return true;
                }
                if (i == 2 || i == 3) {
                    return false;
                }
                break;
            case 5:
                if (i == 1 || i == 2) {
                    return true;
                }
                if (i == 3) {
                    return false;
                }
                break;
            case 6:
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return z;
                }
                if (i == 3) {
                    return false;
                }
                break;
        }
        throw new java.lang.ArithmeticException("Rounding is required on " + obj.toString());
    }

    public static MathContext EZpvd(DecimalFormatProperties decimalFormatProperties) {
        MathContext mathContext = decimalFormatProperties.getMathContext();
        if (mathContext != null) {
            return mathContext;
        }
        RoundingMode roundingMode = decimalFormatProperties.getRoundingMode();
        if (roundingMode == null) {
            roundingMode = RoundingMode.HALF_EVEN;
        }
        return AEQbTJ[roundingMode.ordinal()];
    }

    public static MathContext copydefault(DecimalFormatProperties decimalFormatProperties) {
        MathContext mathContext = decimalFormatProperties.getMathContext();
        if (mathContext != null) {
            return mathContext;
        }
        RoundingMode roundingMode = decimalFormatProperties.getRoundingMode();
        if (roundingMode == null) {
            roundingMode = RoundingMode.HALF_EVEN;
        }
        return copydefault[roundingMode.ordinal()];
    }

    public static MathContext EZpvd(RoundingMode roundingMode) {
        return AEQbTJ[roundingMode.ordinal()];
    }

    public static C7235afx OLrzqt(DecimalFormatProperties decimalFormatProperties) {
        MathContext mathContextCopydefault = copydefault(decimalFormatProperties);
        if (decimalFormatProperties.getMagnitudeMultiplier() != 0) {
            return C7235afx.EZpvd(decimalFormatProperties.getMagnitudeMultiplier()).EZpvd(mathContextCopydefault);
        }
        if (decimalFormatProperties.getMultiplier() != null) {
            return C7235afx.EZpvd(decimalFormatProperties.getMultiplier()).EZpvd(mathContextCopydefault);
        }
        return null;
    }

    public static StandardPlural EZpvd(AbstractC7236afy abstractC7236afy, PluralRules pluralRules, InterfaceC7163aee interfaceC7163aee) {
        if (abstractC7236afy == null) {
            return interfaceC7163aee.OLrzqt(pluralRules);
        }
        InterfaceC7163aee interfaceC7163aeeOLrzqt = interfaceC7163aee.OLrzqt();
        abstractC7236afy.AEQbTJ(interfaceC7163aeeOLrzqt);
        return interfaceC7163aeeOLrzqt.OLrzqt(pluralRules);
    }
}
