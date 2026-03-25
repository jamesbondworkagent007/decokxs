package com.ibm.icu.impl.number;

import androidx.camera.video.AudioStats;
import com.amplifyframework.core.model.ModelIdentifier;
import com.ibm.icu.impl.StandardPlural;
import com.ibm.icu.impl.number.Modifier;
import com.ibm.icu.impl.number.Padder;
import com.ibm.icu.number.NumberFormatter;
import com.ibm.icu.text.DecimalFormatSymbols;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.lang.reflect.Array;
import java.math.BigDecimal;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o.C7181aew;
import o.InterfaceC7102adW;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes3.dex */
public class PatternStringUtils {

    public enum PatternSignType {
        POS,
        POS_SIGN,
        NEG;

        public static final PatternSignType[] VALUES = values();
    }

    public static boolean EZpvd(BigDecimal bigDecimal, int i) {
        double dDoubleValue = bigDecimal.doubleValue();
        if (dDoubleValue == AudioStats.AUDIO_AMPLITUDE_NONE) {
            return true;
        }
        if (i < 0) {
            return false;
        }
        int i2 = 0;
        for (double d = dDoubleValue * 2.0d; i2 <= i && d <= 1.0d; d *= 10.0d) {
            i2++;
        }
        return i2 > i;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0104 A[LOOP:2: B:23:0x00fb->B:25:0x0104, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010c A[LOOP:3: B:26:0x0109->B:28:0x010c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01a3 A[LOOP:6: B:70:0x01a3->B:72:0x01ab, LOOP_START, PHI: r1
  0x01a3: PHI (r1v11 int) = (r1v6 int), (r1v14 int) binds: [B:69:0x01a1, B:72:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0207  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String copydefault(DecimalFormatProperties decimalFormatProperties) {
        int i;
        int i2;
        int iMin;
        int i3;
        int i4;
        StringBuilder sb = new StringBuilder();
        int iMax = Math.max(0, Math.min(decimalFormatProperties.getGroupingSize(), 100));
        int iMax2 = Math.max(0, Math.min(decimalFormatProperties.getSecondaryGroupingSize(), 100));
        boolean groupingUsed = decimalFormatProperties.getGroupingUsed();
        int iMin2 = Math.min(decimalFormatProperties.getFormatWidth(), 100);
        Padder.PadPosition padPosition = decimalFormatProperties.getPadPosition();
        String padString = decimalFormatProperties.getPadString();
        int iMax3 = Math.max(0, Math.min(decimalFormatProperties.getMinimumIntegerDigits(), 100));
        int iMin3 = Math.min(decimalFormatProperties.getMaximumIntegerDigits(), 100);
        int iMax4 = Math.max(0, Math.min(decimalFormatProperties.getMinimumFractionDigits(), 100));
        int iMin4 = Math.min(decimalFormatProperties.getMaximumFractionDigits(), 100);
        int iMin5 = Math.min(decimalFormatProperties.getMinimumSignificantDigits(), 100);
        int iMin6 = Math.min(decimalFormatProperties.getMaximumSignificantDigits(), 100);
        boolean decimalSeparatorAlwaysShown = decimalFormatProperties.getDecimalSeparatorAlwaysShown();
        int iMin7 = Math.min(decimalFormatProperties.getMinimumExponentDigits(), 100);
        boolean exponentSignAlwaysShown = decimalFormatProperties.getExponentSignAlwaysShown();
        InterfaceC7102adW interfaceC7102adWOLrzqt = C7181aew.OLrzqt(decimalFormatProperties);
        sb.append(interfaceC7102adWOLrzqt.KWHzl(256));
        int length = sb.length();
        if (!groupingUsed) {
            iMax = 0;
            iMax2 = 0;
        } else if (iMax == iMax2) {
            iMax = 0;
        }
        BigDecimal roundingIncrement = decimalFormatProperties.getRoundingIncrement();
        StringBuilder sb2 = new StringBuilder();
        if (iMin6 != Math.min(100, -1)) {
            while (sb2.length() < iMin5) {
                sb2.append('@');
            }
            while (sb2.length() < iMin6) {
                sb2.append('#');
            }
        } else {
            if (roundingIncrement != null && !EZpvd(roundingIncrement, iMin4)) {
                i = -roundingIncrement.scale();
                String plainString = roundingIncrement.scaleByPowerOfTen(roundingIncrement.scale()).toPlainString();
                if (plainString.charAt(0) == '-') {
                    sb2.append((CharSequence) plainString, 1, plainString.length());
                } else {
                    sb2.append(plainString);
                }
            }
            while (sb2.length() + i < iMax3) {
                sb2.insert(0, '0');
            }
            while ((-i) < iMax4) {
                sb2.append('0');
                i--;
            }
            int iMax5 = Math.max(iMax + iMax2 + 1, sb2.length() + i);
            if (iMin3 != 100) {
                iMax5 = Math.max(iMin3, iMax5);
            }
            iMin = iMin4 == 100 ? Math.min(-iMin4, i) : i;
            for (i2 = iMax5 - 1; i2 >= iMin; i2--) {
                int length2 = ((sb2.length() + i) - i2) - 1;
                if (length2 < 0 || length2 >= sb2.length()) {
                    sb.append('#');
                } else {
                    sb.append(sb2.charAt(length2));
                }
                if (i2 == 0 && (decimalSeparatorAlwaysShown || iMin < 0)) {
                    sb.append('.');
                }
                if (groupingUsed) {
                    if (i2 > 0 && i2 == iMax) {
                        sb.append(AbstractJsonLexerKt.COMMA);
                    }
                    if (i2 > iMax && iMax2 > 0 && (i2 - iMax) % iMax2 == 0) {
                        sb.append(AbstractJsonLexerKt.COMMA);
                    }
                }
            }
            if (iMin7 != Math.min(100, -1)) {
                sb.append('E');
                if (exponentSignAlwaysShown) {
                    sb.append('+');
                }
                for (int i5 = 0; i5 < iMin7; i5++) {
                    sb.append('0');
                }
            }
            int length3 = sb.length();
            sb.append(interfaceC7102adWOLrzqt.KWHzl(0));
            if (iMin2 <= 0) {
                while (iMin2 - sb.length() > 0) {
                    sb.insert(length, '#');
                    length3++;
                }
                i3 = length;
                int i6 = AnonymousClass1.EZpvd[padPosition.ordinal()];
                if (i6 == 1) {
                    int iCopydefault = copydefault(padString, sb, 0);
                    sb.insert(0, '*');
                    int i7 = iCopydefault + 1;
                    i4 = i3 + i7;
                    length3 += i7;
                } else if (i6 == 2) {
                    int iCopydefault2 = copydefault(padString, sb, i3);
                    sb.insert(i3, '*');
                    int i8 = iCopydefault2 + 1;
                    i4 = i3 + i8;
                    length3 += i8;
                } else if (i6 == 3) {
                    copydefault(padString, sb, length3);
                    sb.insert(length3, '*');
                } else if (i6 == 4) {
                    sb.append('*');
                    copydefault(padString, sb, sb.length());
                }
                if (interfaceC7102adWOLrzqt.OLrzqt()) {
                    sb.append(';');
                    sb.append(interfaceC7102adWOLrzqt.KWHzl(768));
                    sb.append((CharSequence) sb, i4, length3);
                    sb.append(interfaceC7102adWOLrzqt.KWHzl(512));
                }
                return sb.toString();
            }
            i3 = length;
            i4 = i3;
            if (interfaceC7102adWOLrzqt.OLrzqt()) {
            }
            return sb.toString();
        }
        i = 0;
        while (sb2.length() + i < iMax3) {
        }
        while ((-i) < iMax4) {
        }
        int iMax52 = Math.max(iMax + iMax2 + 1, sb2.length() + i);
        if (iMin3 != 100) {
        }
        if (iMin4 == 100) {
        }
        while (i2 >= iMin) {
        }
        if (iMin7 != Math.min(100, -1)) {
        }
        int length32 = sb.length();
        sb.append(interfaceC7102adWOLrzqt.KWHzl(0));
        if (iMin2 <= 0) {
        }
        i4 = i3;
        if (interfaceC7102adWOLrzqt.OLrzqt()) {
        }
        return sb.toString();
    }

    public static int copydefault(CharSequence charSequence, StringBuilder sb, int i) {
        if (charSequence == null || charSequence.length() == 0) {
            charSequence = " ";
        }
        int length = sb.length();
        int i2 = 1;
        if (charSequence.length() == 1) {
            if (charSequence.equals("'")) {
                sb.insert(i, "''");
            } else {
                sb.insert(i, charSequence);
            }
        } else {
            sb.insert(i, '\'');
            for (int i3 = 0; i3 < charSequence.length(); i3++) {
                char cCharAt = charSequence.charAt(i3);
                if (cCharAt == '\'') {
                    sb.insert(i + i2, "''");
                    i2 += 2;
                } else {
                    sb.insert(i + i2, cCharAt);
                    i2++;
                }
            }
            sb.insert(i + i2, '\'');
        }
        return sb.length() - length;
    }

    public static String KWHzl(String str, DecimalFormatSymbols decimalFormatSymbols, boolean z) {
        if (str == null) {
            return null;
        }
        char c = 2;
        String[][] strArr = (String[][]) Array.newInstance((Class<?>) String.class, 21, 2);
        int i = !z ? 1 : 0;
        strArr[0][i] = "%";
        strArr[0][z ? 1 : 0] = decimalFormatSymbols.getPercentString();
        strArr[1][i] = "‰";
        strArr[1][z ? 1 : 0] = decimalFormatSymbols.getPerMillString();
        strArr[2][i] = JwtUtilsKt.JWT_DELIMITER;
        strArr[2][z ? 1 : 0] = decimalFormatSymbols.getDecimalSeparatorString();
        strArr[3][i] = ",";
        strArr[3][z ? 1 : 0] = decimalFormatSymbols.getGroupingSeparatorString();
        strArr[4][i] = "-";
        strArr[4][z ? 1 : 0] = decimalFormatSymbols.getMinusSignString();
        char c2 = 5;
        strArr[5][i] = Marker.ANY_NON_NULL_MARKER;
        strArr[5][z ? 1 : 0] = decimalFormatSymbols.getPlusSignString();
        strArr[6][i] = ";";
        strArr[6][z ? 1 : 0] = Character.toString(decimalFormatSymbols.getPatternSeparator());
        strArr[7][i] = "@";
        strArr[7][z ? 1 : 0] = Character.toString(decimalFormatSymbols.getSignificantDigit());
        strArr[8][i] = "E";
        strArr[8][z ? 1 : 0] = decimalFormatSymbols.getExponentSeparator();
        strArr[9][i] = "*";
        strArr[9][z ? 1 : 0] = Character.toString(decimalFormatSymbols.getPadEscape());
        strArr[10][i] = ModelIdentifier.Helper.PRIMARY_KEY_DELIMITER;
        strArr[10][z ? 1 : 0] = Character.toString(decimalFormatSymbols.getDigit());
        for (int i2 = 0; i2 < 10; i2++) {
            int i3 = i2 + 11;
            strArr[i3][i] = Character.toString((char) (i2 + 48));
            strArr[i3][z ? 1 : 0] = decimalFormatSymbols.getDigitStringsLocal()[i2];
        }
        for (String[] strArr2 : strArr) {
            strArr2[z ? 1 : 0] = strArr2[z ? 1 : 0].replace('\'', (char) 8217);
        }
        StringBuilder sb = new StringBuilder();
        int length = 0;
        char c3 = 0;
        while (length < str.length()) {
            char cCharAt = str.charAt(length);
            if (cCharAt == '\'') {
                if (c3 == 0) {
                    sb.append('\'');
                } else if (c3 == 1) {
                    sb.append('\'');
                    c3 = 0;
                } else if (c3 == c) {
                    c3 = 3;
                } else if (c3 == 3) {
                    sb.append('\'');
                    sb.append('\'');
                } else if (c3 == 4) {
                    c3 = c2;
                } else {
                    sb.append('\'');
                    sb.append('\'');
                    c3 = 4;
                }
                c3 = 1;
            } else if (c3 == 0 || c3 == 3 || c3 == 4) {
                int length2 = strArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 < length2) {
                        String[] strArr3 = strArr[i4];
                        String str2 = strArr3[0];
                        if (str.regionMatches(length, str2, 0, str2.length())) {
                            length += strArr3[0].length() - 1;
                            if (c3 == 3 || c3 == 4) {
                                sb.append('\'');
                                c3 = 0;
                            }
                            sb.append(strArr3[1]);
                        } else {
                            i4++;
                        }
                    } else {
                        int length3 = strArr.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 < length3) {
                                String str3 = strArr[i5][1];
                                if (str.regionMatches(length, str3, 0, str3.length())) {
                                    if (c3 == 0) {
                                        sb.append('\'');
                                        c3 = 4;
                                    }
                                    sb.append(cCharAt);
                                } else {
                                    i5++;
                                }
                            } else {
                                if (c3 == 3 || c3 == 4) {
                                    sb.append('\'');
                                    c3 = 0;
                                }
                                sb.append(cCharAt);
                            }
                        }
                    }
                }
            } else {
                sb.append(cCharAt);
                c3 = c;
            }
            length++;
            c = 2;
            c2 = 5;
        }
        if (c3 == 3 || c3 == 4) {
            sb.append('\'');
        } else if (c3 != 0) {
            throw new IllegalArgumentException("Malformed localized pattern: unterminated quote");
        }
        return sb.toString();
    }

    public static void copydefault(InterfaceC7102adW interfaceC7102adW, boolean z, PatternSignType patternSignType, StandardPlural standardPlural, boolean z2, StringBuilder sb) {
        char cOLrzqt;
        int i = 1;
        int i2 = (patternSignType != PatternSignType.POS_SIGN || interfaceC7102adW.AEQbTJ()) ? 0 : 1;
        boolean z3 = interfaceC7102adW.OLrzqt() && (patternSignType == PatternSignType.NEG || (interfaceC7102adW.copydefault() && i2 != 0));
        int iOrdinal = z3 ? 512 : 0;
        if (z) {
            iOrdinal |= 256;
        }
        if (standardPlural != null) {
            iOrdinal |= standardPlural.ordinal();
        }
        if (!z || z3) {
            i = 0;
        } else if (patternSignType != PatternSignType.NEG) {
            i = i2;
        }
        int iOLrzqt = interfaceC7102adW.OLrzqt(iOrdinal);
        sb.setLength(0);
        for (int i3 = 0; i3 < iOLrzqt + i; i3++) {
            if (i != 0 && i3 == 0) {
                cOLrzqt = '-';
            } else if (i != 0) {
                cOLrzqt = interfaceC7102adW.OLrzqt(iOrdinal, i3 - 1);
            } else {
                cOLrzqt = interfaceC7102adW.OLrzqt(iOrdinal, i3);
            }
            if (i2 != 0 && cOLrzqt == '-') {
                cOLrzqt = '+';
            }
            if (z2 && cOLrzqt == '%') {
                cOLrzqt = 8240;
            }
            sb.append(cOLrzqt);
        }
    }

    /* JADX INFO: renamed from: com.ibm.icu.impl.number.PatternStringUtils$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] EZpvd;
        public static final /* synthetic */ int[] KWHzl;
        public static final /* synthetic */ int[] OLrzqt;

        static {
            int[] iArr = new int[NumberFormatter.SignDisplay.values().length];
            OLrzqt = iArr;
            try {
                iArr[NumberFormatter.SignDisplay.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                OLrzqt[NumberFormatter.SignDisplay.ACCOUNTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                OLrzqt[NumberFormatter.SignDisplay.ALWAYS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                OLrzqt[NumberFormatter.SignDisplay.ACCOUNTING_ALWAYS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                OLrzqt[NumberFormatter.SignDisplay.EXCEPT_ZERO.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                OLrzqt[NumberFormatter.SignDisplay.ACCOUNTING_EXCEPT_ZERO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                OLrzqt[NumberFormatter.SignDisplay.NEVER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[Modifier.Signum.values().length];
            KWHzl = iArr2;
            try {
                iArr2[Modifier.Signum.NEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                KWHzl[Modifier.Signum.NEG_ZERO.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                KWHzl[Modifier.Signum.POS_ZERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                KWHzl[Modifier.Signum.POS.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr3 = new int[Padder.PadPosition.values().length];
            EZpvd = iArr3;
            try {
                iArr3[Padder.PadPosition.BEFORE_PREFIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                EZpvd[Padder.PadPosition.AFTER_PREFIX.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                EZpvd[Padder.PadPosition.BEFORE_SUFFIX.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                EZpvd[Padder.PadPosition.AFTER_SUFFIX.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public static PatternSignType copydefault(NumberFormatter.SignDisplay signDisplay, Modifier.Signum signum) {
        switch (AnonymousClass1.OLrzqt[signDisplay.ordinal()]) {
            case 1:
            case 2:
                int i = AnonymousClass1.KWHzl[signum.ordinal()];
                if (i == 1 || i == 2) {
                    return PatternSignType.NEG;
                }
                if (i == 3 || i == 4) {
                    return PatternSignType.POS;
                }
                break;
            case 3:
            case 4:
                int i2 = AnonymousClass1.KWHzl[signum.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    return PatternSignType.NEG;
                }
                if (i2 == 3 || i2 == 4) {
                    return PatternSignType.POS_SIGN;
                }
                break;
            case 5:
            case 6:
                int i3 = AnonymousClass1.KWHzl[signum.ordinal()];
                if (i3 == 1) {
                    return PatternSignType.NEG;
                }
                if (i3 == 2 || i3 == 3) {
                    return PatternSignType.POS;
                }
                if (i3 == 4) {
                    return PatternSignType.POS_SIGN;
                }
                break;
            case 7:
                return PatternSignType.POS;
        }
        throw new AssertionError("Unreachable");
    }
}
