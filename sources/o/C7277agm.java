package o;

import androidx.camera.video.AudioStats;
import com.fasterxml.jackson.core.JsonPointer;
import com.ibm.icu.text.DecimalFormatSymbols;
import com.ibm.icu.text.PluralFormat;
import com.ibm.icu.text.PluralRules;
import com.ibm.icu.text.RuleBasedNumberFormat;
import com.ibm.icu.util.ULocale;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.util.Objects;

/* JADX INFO: renamed from: o.agm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7277agm {
    public static final java.lang.Long EZpvd = 0L;
    public static final java.lang.String[] KWHzl = {"<<", "<%", "<#", "<0", ">>", ">%", ">#", ">0", "=%", "=#", "=0"};
    public long AEQbTJ;
    public java.lang.String AYXKKw;
    public final RuleBasedNumberFormat AhwBna;
    public int valueOf = 10;
    public short copydefault = 0;
    public char OLrzqt = 0;
    public PluralFormat djBIcL = null;
    public AbstractC7276agl gEmmrt = null;
    public AbstractC7276agl DbNXlk = null;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final char AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long EZpvd() {
        return this.AEQbTJ;
    }

    public int hashCode() {
        return 42;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void copydefault(java.lang.String str, C7279ago c7279ago, C7277agm c7277agm, RuleBasedNumberFormat ruleBasedNumberFormat, java.util.List<C7277agm> list) {
        int i;
        C7277agm c7277agm2;
        C7277agm c7277agm3 = new C7277agm(ruleBasedNumberFormat, str);
        java.lang.String str2 = c7277agm3.AYXKKw;
        int iIndexOf = str2.indexOf(91);
        int iIndexOf2 = iIndexOf < 0 ? -1 : str2.indexOf(93);
        if (iIndexOf2 < 0 || iIndexOf > iIndexOf2) {
            c7277agm3.EZpvd(c7279ago, str2, c7277agm);
        } else {
            long j = c7277agm3.AEQbTJ;
            if (j != -3 && j != -1 && j != -5 && j != -6) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                long j2 = c7277agm3.AEQbTJ;
                if (j2 <= 0 || j2 % AEQbTJ(c7277agm3.valueOf, c7277agm3.copydefault) != 0) {
                    long j3 = c7277agm3.AEQbTJ;
                    if (j3 == -2 || j3 == -4) {
                        C7277agm c7277agm4 = new C7277agm(ruleBasedNumberFormat, null);
                        long j4 = c7277agm3.AEQbTJ;
                        if (j4 >= 0) {
                            c7277agm4.AEQbTJ = j4;
                            if (!c7279ago.KWHzl()) {
                                c7277agm3.AEQbTJ++;
                            }
                        } else if (j4 == -2) {
                            c7277agm4.AEQbTJ = -3L;
                        } else if (j4 == -4) {
                            c7277agm4.AEQbTJ = j4;
                            c7277agm3.AEQbTJ = -2L;
                        }
                        c7277agm4.valueOf = c7277agm3.valueOf;
                        c7277agm4.copydefault = c7277agm3.copydefault;
                        sb.append(str2.substring(0, iIndexOf));
                        int i2 = iIndexOf2 + 1;
                        if (i2 < str2.length()) {
                            sb.append(str2.substring(i2));
                        }
                        c7277agm4.EZpvd(c7279ago, sb.toString(), c7277agm);
                        c7277agm2 = c7277agm4;
                        i = 0;
                    } else {
                        i = 0;
                        c7277agm2 = null;
                    }
                    sb.setLength(i);
                    sb.append(str2.substring(i, iIndexOf));
                    sb.append(str2.substring(iIndexOf + 1, iIndexOf2));
                    int i3 = iIndexOf2 + 1;
                    if (i3 < str2.length()) {
                        sb.append(str2.substring(i3));
                    }
                    c7277agm3.EZpvd(c7279ago, sb.toString(), c7277agm);
                    if (c7277agm2 != null) {
                        if (c7277agm2.AEQbTJ >= 0) {
                            list.add(c7277agm2);
                        } else {
                            c7279ago.OLrzqt(c7277agm2);
                        }
                    }
                }
            }
        }
        if (c7277agm3.AEQbTJ >= 0) {
            list.add(c7277agm3);
        } else {
            c7279ago.OLrzqt(c7277agm3);
        }
    }

    public C7277agm(RuleBasedNumberFormat ruleBasedNumberFormat, java.lang.String str) {
        this.AYXKKw = null;
        this.AhwBna = ruleBasedNumberFormat;
        this.AYXKKw = str != null ? copydefault(str) : null;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.String copydefault(java.lang.String str) {
        short s;
        java.lang.String strSubstring = str;
        int iIndexOf = strSubstring.indexOf(":");
        if (iIndexOf != -1) {
            java.lang.String strSubstring2 = strSubstring.substring(0, iIndexOf);
            int i = iIndexOf + 1;
            while (i < str.length() && C7070acr.AEQbTJ(strSubstring.charAt(i))) {
                i++;
            }
            strSubstring = strSubstring.substring(i);
            int length = strSubstring2.length();
            char cCharAt = strSubstring2.charAt(0);
            char cCharAt2 = strSubstring2.charAt(length - 1);
            char c = '0';
            if (cCharAt >= '0') {
                char c2 = '9';
                if (cCharAt <= '9' && cCharAt2 != 'x') {
                    int i2 = 0;
                    char cCharAt3 = 0;
                    long j = 0;
                    while (i2 < length) {
                        cCharAt3 = strSubstring2.charAt(i2);
                        if (cCharAt3 >= '0' && cCharAt3 <= '9') {
                            j = (j * 10) + ((long) (cCharAt3 - '0'));
                        } else {
                            if (cCharAt3 == '/' || cCharAt3 == '>') {
                                break;
                            }
                            if (!C7070acr.AEQbTJ(cCharAt3) && cCharAt3 != ',' && cCharAt3 != '.') {
                                throw new java.lang.IllegalArgumentException("Illegal character " + cCharAt3 + " in rule descriptor");
                            }
                        }
                        i2++;
                    }
                    copydefault(j);
                    if (cCharAt3 == '/') {
                        i2++;
                        long j2 = 0;
                        while (i2 < length) {
                            cCharAt3 = strSubstring2.charAt(i2);
                            if (cCharAt3 >= c && cCharAt3 <= c2) {
                                j2 = (j2 * 10) + ((long) (cCharAt3 - '0'));
                            } else {
                                if (cCharAt3 == '>') {
                                    break;
                                }
                                if (!C7070acr.AEQbTJ(cCharAt3) && cCharAt3 != ',' && cCharAt3 != '.') {
                                    throw new java.lang.IllegalArgumentException("Illegal character " + cCharAt3 + " in rule descriptor");
                                }
                            }
                            i2++;
                            c = '0';
                            c2 = '9';
                        }
                        int i3 = (int) j2;
                        this.valueOf = i3;
                        if (i3 == 0) {
                            throw new java.lang.IllegalArgumentException("Rule can't have radix of 0");
                        }
                        this.copydefault = KWHzl();
                    }
                    if (cCharAt3 == '>') {
                        while (i2 < length) {
                            if (strSubstring2.charAt(i2) != '>' || (s = this.copydefault) <= 0) {
                                throw new java.lang.IllegalArgumentException("Illegal character in rule descriptor");
                            }
                            this.copydefault = (short) (s - 1);
                            i2++;
                        }
                    }
                } else if (strSubstring2.equals("-x")) {
                    copydefault(-1L);
                } else if (length == 3) {
                    if (cCharAt == '0' && cCharAt2 == 'x') {
                        copydefault(-3L);
                        this.OLrzqt = strSubstring2.charAt(1);
                    } else if (cCharAt == 'x' && cCharAt2 == 'x') {
                        copydefault(-2L);
                        this.OLrzqt = strSubstring2.charAt(1);
                    } else if (cCharAt == 'x' && cCharAt2 == '0') {
                        copydefault(-4L);
                        this.OLrzqt = strSubstring2.charAt(1);
                    } else if (strSubstring2.equals("NaN")) {
                        copydefault(-6L);
                    } else if (strSubstring2.equals("Inf")) {
                        copydefault(-5L);
                    }
                }
            }
        }
        return (strSubstring.length() <= 0 || strSubstring.charAt(0) != '\'') ? strSubstring : strSubstring.substring(1);
    }

    public final void EZpvd(C7279ago c7279ago, java.lang.String str, C7277agm c7277agm) {
        PluralRules.PluralType pluralType;
        this.AYXKKw = str;
        AbstractC7276agl abstractC7276aglCopydefault = copydefault(c7279ago, c7277agm);
        this.gEmmrt = abstractC7276aglCopydefault;
        if (abstractC7276aglCopydefault == null) {
            this.DbNXlk = null;
        } else {
            this.DbNXlk = copydefault(c7279ago, c7277agm);
        }
        java.lang.String str2 = this.AYXKKw;
        int iIndexOf = str2.indexOf("$(");
        int iIndexOf2 = iIndexOf >= 0 ? str2.indexOf(")$", iIndexOf) : -1;
        if (iIndexOf2 >= 0) {
            int iIndexOf3 = str2.indexOf(44, iIndexOf);
            if (iIndexOf3 < 0) {
                throw new java.lang.IllegalArgumentException("Rule \"" + str2 + "\" does not have a defined type");
            }
            java.lang.String strSubstring = this.AYXKKw.substring(iIndexOf + 2, iIndexOf3);
            if ("cardinal".equals(strSubstring)) {
                pluralType = PluralRules.PluralType.CARDINAL;
            } else if ("ordinal".equals(strSubstring)) {
                pluralType = PluralRules.PluralType.ORDINAL;
            } else {
                throw new java.lang.IllegalArgumentException(strSubstring + " is an unknown type");
            }
            this.djBIcL = this.AhwBna.createPluralFormat(pluralType, str2.substring(iIndexOf3 + 1, iIndexOf2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC7276agl copydefault(C7279ago c7279ago, C7277agm c7277agm) {
        int i;
        int iKWHzl = KWHzl(this.AYXKKw);
        if (iKWHzl == -1) {
            return null;
        }
        if (this.AYXKKw.startsWith(">>>", iKWHzl)) {
            i = iKWHzl + 2;
        } else {
            char cCharAt = this.AYXKKw.charAt(iKWHzl);
            int iIndexOf = this.AYXKKw.indexOf(cCharAt, iKWHzl + 1);
            if (cCharAt != '<' || iIndexOf == -1 || iIndexOf >= this.AYXKKw.length() - 1) {
                i = iIndexOf;
            } else {
                int i2 = iIndexOf + 1;
                if (this.AYXKKw.charAt(i2) == cCharAt) {
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        int i3 = i + 1;
        AbstractC7276agl abstractC7276aglAEQbTJ = AbstractC7276agl.AEQbTJ(iKWHzl, this, c7277agm, c7279ago, this.AhwBna, this.AYXKKw.substring(iKWHzl, i3));
        this.AYXKKw = this.AYXKKw.substring(0, iKWHzl) + this.AYXKKw.substring(i3);
        return abstractC7276aglAEQbTJ;
    }

    public final void copydefault(long j) {
        this.AEQbTJ = j;
        this.valueOf = 10;
        if (j < 1) {
            this.copydefault = (short) 0;
            return;
        }
        short sKWHzl = KWHzl();
        this.copydefault = sKWHzl;
        AbstractC7276agl abstractC7276agl = this.gEmmrt;
        if (abstractC7276agl != null) {
            abstractC7276agl.KWHzl(this.valueOf, sKWHzl);
        }
        AbstractC7276agl abstractC7276agl2 = this.DbNXlk;
        if (abstractC7276agl2 != null) {
            abstractC7276agl2.KWHzl(this.valueOf, this.copydefault);
        }
    }

    public final short KWHzl() {
        if (this.valueOf == 0) {
            return (short) 0;
        }
        if (this.AEQbTJ < 1) {
            return (short) 0;
        }
        short sLog = (short) (java.lang.Math.log(r0) / java.lang.Math.log(this.valueOf));
        short s = (short) (sLog + 1);
        return AEQbTJ((long) this.valueOf, s) <= this.AEQbTJ ? s : sLog;
    }

    public static int KWHzl(java.lang.String str) {
        if (str.length() <= 0) {
            return -1;
        }
        int i = -1;
        for (java.lang.String str2 : KWHzl) {
            int iIndexOf = str.indexOf(str2);
            if (iIndexOf != -1 && (i == -1 || iIndexOf < i)) {
                i = iIndexOf;
            }
        }
        return i;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof C7277agm) {
            C7277agm c7277agm = (C7277agm) obj;
            if (this.AEQbTJ == c7277agm.AEQbTJ && this.valueOf == c7277agm.valueOf && this.copydefault == c7277agm.copydefault && this.AYXKKw.equals(c7277agm.AYXKKw) && Objects.equals(this.gEmmrt, c7277agm.gEmmrt) && Objects.equals(this.DbNXlk, c7277agm.DbNXlk)) {
                return true;
            }
        }
        return false;
    }

    public java.lang.String toString() {
        AbstractC7276agl abstractC7276agl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        long j = this.AEQbTJ;
        if (j == -1) {
            sb.append("-x: ");
        } else if (j == -2) {
            sb.append(ULocale.PRIVATE_USE_EXTENSION);
            char c = this.OLrzqt;
            sb.append(c != 0 ? c : '.');
            sb.append("x: ");
        } else if (j == -3) {
            sb.append('0');
            char c2 = this.OLrzqt;
            sb.append(c2 != 0 ? c2 : '.');
            sb.append("x: ");
        } else if (j == -4) {
            sb.append(ULocale.PRIVATE_USE_EXTENSION);
            char c3 = this.OLrzqt;
            sb.append(c3 != 0 ? c3 : '.');
            sb.append("0: ");
        } else if (j == -5) {
            sb.append("Inf: ");
        } else if (j == -6) {
            sb.append("NaN: ");
        } else {
            sb.append(java.lang.String.valueOf(j));
            if (this.valueOf != 10) {
                sb.append(JsonPointer.SEPARATOR);
                sb.append(this.valueOf);
            }
            short sKWHzl = KWHzl();
            short s = this.copydefault;
            for (int i = 0; i < sKWHzl - s; i++) {
                sb.append('>');
            }
            sb.append(": ");
        }
        if (this.AYXKKw.startsWith(" ") && ((abstractC7276agl = this.gEmmrt) == null || abstractC7276agl.EZpvd() != 0)) {
            sb.append('\'');
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(this.AYXKKw);
        AbstractC7276agl abstractC7276agl2 = this.DbNXlk;
        if (abstractC7276agl2 != null) {
            sb2.insert(abstractC7276agl2.EZpvd(), this.DbNXlk.toString());
        }
        AbstractC7276agl abstractC7276agl3 = this.gEmmrt;
        if (abstractC7276agl3 != null) {
            sb2.insert(abstractC7276agl3.EZpvd(), this.gEmmrt.toString());
        }
        sb.append(sb2.toString());
        sb.append(';');
        return sb.toString();
    }

    public long copydefault() {
        return AEQbTJ(this.valueOf, this.copydefault);
    }

    public void copydefault(long j, java.lang.StringBuilder sb, int i, int i2) {
        int i3;
        int length;
        int length2 = this.AYXKKw.length();
        if (this.djBIcL == null) {
            sb.insert(i, this.AYXKKw);
            i3 = length2;
            length = 0;
        } else {
            int iIndexOf = this.AYXKKw.indexOf("$(");
            int iIndexOf2 = this.AYXKKw.indexOf(")$", iIndexOf);
            int length3 = sb.length();
            if (iIndexOf2 < this.AYXKKw.length() - 1) {
                sb.insert(i, this.AYXKKw.substring(iIndexOf2 + 2));
            }
            sb.insert(i, this.djBIcL.format(j / AEQbTJ(this.valueOf, this.copydefault)));
            if (iIndexOf > 0) {
                sb.insert(i, this.AYXKKw.substring(0, iIndexOf));
            }
            i3 = iIndexOf;
            length = this.AYXKKw.length() - (sb.length() - length3);
        }
        AbstractC7276agl abstractC7276agl = this.DbNXlk;
        if (abstractC7276agl != null) {
            abstractC7276agl.EZpvd(j, sb, i - (abstractC7276agl.EZpvd() > i3 ? length : 0), i2);
        }
        AbstractC7276agl abstractC7276agl2 = this.gEmmrt;
        if (abstractC7276agl2 != null) {
            abstractC7276agl2.EZpvd(j, sb, i - (abstractC7276agl2.EZpvd() > i3 ? length : 0), i2);
        }
    }

    public void EZpvd(double d, java.lang.StringBuilder sb, int i, int i2) {
        double dAEQbTJ;
        int i3;
        int length;
        int length2 = this.AYXKKw.length();
        if (this.djBIcL == null) {
            sb.insert(i, this.AYXKKw);
            i3 = length2;
            length = 0;
        } else {
            int iIndexOf = this.AYXKKw.indexOf("$(");
            int iIndexOf2 = this.AYXKKw.indexOf(")$", iIndexOf);
            int length3 = sb.length();
            if (iIndexOf2 < this.AYXKKw.length() - 1) {
                sb.insert(i, this.AYXKKw.substring(iIndexOf2 + 2));
            }
            if (AudioStats.AUDIO_AMPLITUDE_NONE <= d && d < 1.0d) {
                dAEQbTJ = java.lang.Math.round(AEQbTJ(this.valueOf, this.copydefault) * d);
            } else {
                dAEQbTJ = d / AEQbTJ(this.valueOf, this.copydefault);
            }
            sb.insert(i, this.djBIcL.format((long) dAEQbTJ));
            if (iIndexOf > 0) {
                sb.insert(i, this.AYXKKw.substring(0, iIndexOf));
            }
            i3 = iIndexOf;
            length = this.AYXKKw.length() - (sb.length() - length3);
        }
        AbstractC7276agl abstractC7276agl = this.DbNXlk;
        if (abstractC7276agl != null) {
            abstractC7276agl.EZpvd(d, sb, i - (abstractC7276agl.EZpvd() > i3 ? length : 0), i2);
        }
        AbstractC7276agl abstractC7276agl2 = this.gEmmrt;
        if (abstractC7276agl2 != null) {
            abstractC7276agl2.EZpvd(d, sb, i - (abstractC7276agl2.EZpvd() > i3 ? length : 0), i2);
        }
    }

    public static long AEQbTJ(long j, short s) {
        if (s < 0) {
            throw new java.lang.IllegalArgumentException("Exponent can not be negative");
        }
        if (j < 0) {
            throw new java.lang.IllegalArgumentException("Base can not be negative");
        }
        long j2 = 1;
        while (s > 0) {
            if ((s & 1) == 1) {
                j2 *= j;
            }
            j *= j;
            s = (short) (s >> 1);
        }
        return j2;
    }

    public boolean OLrzqt(long j) {
        AbstractC7276agl abstractC7276agl;
        AbstractC7276agl abstractC7276agl2 = this.gEmmrt;
        if ((abstractC7276agl2 != null && abstractC7276agl2.AEQbTJ()) || ((abstractC7276agl = this.DbNXlk) != null && abstractC7276agl.AEQbTJ())) {
            long jAEQbTJ = AEQbTJ(this.valueOf, this.copydefault);
            if (j % jAEQbTJ == 0 && this.AEQbTJ % jAEQbTJ != 0) {
                return true;
            }
        }
        return false;
    }

    public java.lang.Number OLrzqt(java.lang.String str, ParsePosition parsePosition, boolean z, double d, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        ParsePosition parsePosition2 = new ParsePosition(0);
        AbstractC7276agl abstractC7276agl = this.gEmmrt;
        int iEZpvd = abstractC7276agl != null ? abstractC7276agl.EZpvd() : this.AYXKKw.length();
        AbstractC7276agl abstractC7276agl2 = this.DbNXlk;
        int iEZpvd2 = abstractC7276agl2 != null ? abstractC7276agl2.EZpvd() : this.AYXKKw.length();
        java.lang.String strOLrzqt = OLrzqt(str, this.AYXKKw.substring(0, iEZpvd), parsePosition2);
        int length = str.length() - strOLrzqt.length();
        if (parsePosition2.getIndex() == 0 && iEZpvd != 0) {
            return EZpvd;
        }
        long j = this.AEQbTJ;
        if (j == -5) {
            parsePosition.setIndex(parsePosition2.getIndex());
            return java.lang.Double.valueOf(Double.POSITIVE_INFINITY);
        }
        if (j == -6) {
            parsePosition.setIndex(parsePosition2.getIndex());
            return java.lang.Double.valueOf(Double.NaN);
        }
        double dMax = java.lang.Math.max(0L, j);
        double d2 = 0.0d;
        int index = 0;
        int i7 = 0;
        while (true) {
            parsePosition2.setIndex(i6);
            int i8 = index;
            double d3 = dMax;
            int i9 = iEZpvd2;
            java.lang.String str2 = strOLrzqt;
            int i10 = iEZpvd;
            double dDoubleValue = copydefault(strOLrzqt, i7, dMax, this.AYXKKw.substring(iEZpvd, iEZpvd2), this.djBIcL, parsePosition2, this.gEmmrt, d, i).doubleValue();
            if (parsePosition2.getIndex() != 0 || this.gEmmrt == null) {
                int index2 = parsePosition2.getIndex();
                java.lang.String strSubstring = str2.substring(parsePosition2.getIndex());
                ParsePosition parsePosition3 = new ParsePosition(0);
                i2 = 0;
                double dDoubleValue2 = copydefault(strSubstring, 0, dDoubleValue, this.AYXKKw.substring(i9), this.djBIcL, parsePosition3, this.DbNXlk, d, i).doubleValue();
                if (parsePosition3.getIndex() != 0 || this.DbNXlk == null) {
                    i3 = i8;
                    if (length + parsePosition2.getIndex() + parsePosition3.getIndex() > i3) {
                        index = length + parsePosition2.getIndex() + parsePosition3.getIndex();
                        d2 = dDoubleValue2;
                    }
                    i4 = index2;
                    i5 = i9;
                } else {
                    i3 = i8;
                }
                index = i3;
                i4 = index2;
                i5 = i9;
            } else {
                i4 = i7;
                index = i8;
                i5 = i9;
                i2 = 0;
            }
            if (i10 == i5 || parsePosition2.getIndex() <= 0 || parsePosition2.getIndex() >= str2.length() || parsePosition2.getIndex() == i4) {
                break;
            }
            i7 = i4;
            iEZpvd2 = i5;
            iEZpvd = i10;
            strOLrzqt = str2;
            i6 = i2;
            dMax = d3;
        }
        parsePosition.setIndex(index);
        if (z && index > 0 && this.gEmmrt == null) {
            d2 = 1.0d / d2;
        }
        double d4 = d2;
        long j2 = (long) d4;
        if (d4 == j2) {
            return java.lang.Long.valueOf(j2);
        }
        return new java.lang.Double(d4);
    }

    public final java.lang.String OLrzqt(java.lang.String str, java.lang.String str2, ParsePosition parsePosition) {
        int iKWHzl;
        if (str2.length() == 0 || (iKWHzl = KWHzl(str, str2)) == 0) {
            return str;
        }
        parsePosition.setIndex(parsePosition.getIndex() + iKWHzl);
        return str.substring(iKWHzl);
    }

    public final java.lang.Number copydefault(java.lang.String str, int i, double d, java.lang.String str2, PluralFormat pluralFormat, ParsePosition parsePosition, AbstractC7276agl abstractC7276agl, double d2, int i2) {
        if (OLrzqt(str2)) {
            if (abstractC7276agl == null) {
                return java.lang.Double.valueOf(d);
            }
            ParsePosition parsePosition2 = new ParsePosition(0);
            java.lang.Long l = EZpvd;
            java.lang.Number numberKWHzl = abstractC7276agl.KWHzl(str, parsePosition2, d, d2, this.AhwBna.lenientParseEnabled(), i2);
            if (parsePosition2.getIndex() == 0) {
                return l;
            }
            parsePosition.setIndex(parsePosition2.getIndex());
            return numberKWHzl != null ? numberKWHzl : l;
        }
        ParsePosition parsePosition3 = new ParsePosition(0);
        int[] iArrAEQbTJ = AEQbTJ(str, str2, pluralFormat, i);
        int i3 = iArrAEQbTJ[0];
        int i4 = iArrAEQbTJ[1];
        while (i3 >= 0) {
            java.lang.String strSubstring = str.substring(0, i3);
            if (strSubstring.length() > 0) {
                java.lang.Number numberKWHzl2 = abstractC7276agl.KWHzl(strSubstring, parsePosition3, d, d2, this.AhwBna.lenientParseEnabled(), i2);
                if (parsePosition3.getIndex() == i3) {
                    parsePosition.setIndex(i3 + i4);
                    return numberKWHzl2;
                }
            }
            parsePosition3.setIndex(0);
            int[] iArrAEQbTJ2 = AEQbTJ(str, str2, pluralFormat, i3 + i4);
            i3 = iArrAEQbTJ2[0];
            i4 = iArrAEQbTJ2[1];
        }
        parsePosition.setIndex(0);
        return EZpvd;
    }

    public final int KWHzl(java.lang.String str, java.lang.String str2) {
        if (str2.length() == 0) {
            return 0;
        }
        InterfaceC7280agp lenientScanner = this.AhwBna.getLenientScanner();
        if (lenientScanner != null) {
            if (str.startsWith(str2)) {
                return str2.length();
            }
            return lenientScanner.KWHzl(str, str2);
        }
        if (str.startsWith(str2)) {
            return str2.length();
        }
        return 0;
    }

    public final int[] AEQbTJ(java.lang.String str, java.lang.String str2, PluralFormat pluralFormat, int i) {
        InterfaceC7280agp lenientScanner = this.AhwBna.getLenientScanner();
        if (pluralFormat == null) {
            if (lenientScanner != null) {
                int[] iArr = {str.indexOf(str2, i), str2.length()};
                return iArr[0] >= 0 ? iArr : lenientScanner.copydefault(str, str2, i);
            }
            return new int[]{str.indexOf(str2, i), str2.length()};
        }
        FieldPosition fieldPosition = new FieldPosition(0);
        fieldPosition.setBeginIndex(i);
        pluralFormat.parseType(str, lenientScanner, fieldPosition);
        int beginIndex = fieldPosition.getBeginIndex();
        if (beginIndex >= 0) {
            int iIndexOf = this.AYXKKw.indexOf("$(");
            int iIndexOf2 = this.AYXKKw.indexOf(")$", iIndexOf);
            int endIndex = fieldPosition.getEndIndex() - beginIndex;
            java.lang.String strSubstring = this.AYXKKw.substring(0, iIndexOf);
            java.lang.String strSubstring2 = this.AYXKKw.substring(iIndexOf2 + 2);
            if (str.regionMatches(beginIndex - strSubstring.length(), strSubstring, 0, strSubstring.length()) && str.regionMatches(beginIndex + endIndex, strSubstring2, 0, strSubstring2.length())) {
                return new int[]{beginIndex - strSubstring.length(), endIndex + strSubstring.length() + strSubstring2.length()};
            }
        }
        return new int[]{-1, 0};
    }

    public final boolean OLrzqt(java.lang.String str) {
        InterfaceC7280agp lenientScanner;
        return str == null || str.length() == 0 || ((lenientScanner = this.AhwBna.getLenientScanner()) != null && lenientScanner.AEQbTJ(str));
    }

    public void copydefault(DecimalFormatSymbols decimalFormatSymbols) {
        AbstractC7276agl abstractC7276agl = this.gEmmrt;
        if (abstractC7276agl != null) {
            abstractC7276agl.EZpvd(decimalFormatSymbols);
        }
        AbstractC7276agl abstractC7276agl2 = this.DbNXlk;
        if (abstractC7276agl2 != null) {
            abstractC7276agl2.EZpvd(decimalFormatSymbols);
        }
    }
}
