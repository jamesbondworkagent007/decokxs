package o;

import androidx.camera.video.AudioStats;
import com.ibm.icu.text.DecimalFormatSymbols;
import com.ibm.icu.text.RuleBasedNumberFormat;
import java.text.ParsePosition;
import java.util.LinkedList;
import java.util.Objects;

/* JADX INFO: renamed from: o.ago, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7279ago {
    public final java.lang.String AEQbTJ;
    public final RuleBasedNumberFormat AhwBna;
    public LinkedList<C7277agm> KWHzl;
    public final boolean OLrzqt;
    public C7277agm[] gEmmrt;
    public final C7277agm[] copydefault = new C7277agm[6];
    public boolean EZpvd = false;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public void EZpvd() {
        this.EZpvd = true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean OLrzqt() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String copydefault() {
        return this.AEQbTJ;
    }

    public int hashCode() {
        return 42;
    }

    public C7279ago(RuleBasedNumberFormat ruleBasedNumberFormat, java.lang.String[] strArr, int i) throws java.lang.IllegalArgumentException {
        this.AhwBna = ruleBasedNumberFormat;
        java.lang.String strSubstring = strArr[i];
        if (strSubstring.length() == 0) {
            throw new java.lang.IllegalArgumentException("Empty rule set description");
        }
        if (strSubstring.charAt(0) == '%') {
            int iIndexOf = strSubstring.indexOf(58);
            if (iIndexOf == -1) {
                throw new java.lang.IllegalArgumentException("Rule set name doesn't end in colon");
            }
            java.lang.String strSubstring2 = strSubstring.substring(0, iIndexOf);
            boolean zEndsWith = true ^ strSubstring2.endsWith("@noparse");
            this.OLrzqt = zEndsWith;
            this.AEQbTJ = zEndsWith ? strSubstring2 : strSubstring2.substring(0, strSubstring2.length() - 8);
            while (iIndexOf < strSubstring.length()) {
                iIndexOf++;
                if (!C7070acr.AEQbTJ(strSubstring.charAt(iIndexOf))) {
                    break;
                }
            }
            strSubstring = strSubstring.substring(iIndexOf);
            strArr[i] = strSubstring;
        } else {
            this.AEQbTJ = "%default";
            this.OLrzqt = true;
        }
        if (strSubstring.length() == 0) {
            throw new java.lang.IllegalArgumentException("Empty rule set description");
        }
    }

    public void KWHzl(java.lang.String str) {
        java.util.ArrayList<C7277agm> arrayList = new java.util.ArrayList();
        int length = str.length();
        C7277agm c7277agm = null;
        int i = 0;
        do {
            int iIndexOf = str.indexOf(59, i);
            if (iIndexOf < 0) {
                iIndexOf = length;
            }
            C7277agm.copydefault(str.substring(i, iIndexOf), this, c7277agm, this.AhwBna, arrayList);
            if (!arrayList.isEmpty()) {
                c7277agm = (C7277agm) arrayList.get(arrayList.size() - 1);
            }
            i = iIndexOf + 1;
        } while (i < length);
        long j = 0;
        for (C7277agm c7277agm2 : arrayList) {
            long jEZpvd = c7277agm2.EZpvd();
            if (jEZpvd == 0) {
                c7277agm2.copydefault(j);
            } else {
                if (jEZpvd < j) {
                    throw new java.lang.IllegalArgumentException("Rules are not in order, base: " + jEZpvd + " < " + j);
                }
                j = jEZpvd;
            }
            if (!this.EZpvd) {
                j++;
            }
        }
        C7277agm[] c7277agmArr = new C7277agm[arrayList.size()];
        this.gEmmrt = c7277agmArr;
        arrayList.toArray(c7277agmArr);
    }

    public void OLrzqt(C7277agm c7277agm) {
        long jEZpvd = c7277agm.EZpvd();
        if (jEZpvd == -1) {
            this.copydefault[0] = c7277agm;
            return;
        }
        if (jEZpvd == -2) {
            KWHzl(1, c7277agm, true);
            return;
        }
        if (jEZpvd == -3) {
            KWHzl(2, c7277agm, true);
            return;
        }
        if (jEZpvd == -4) {
            KWHzl(3, c7277agm, true);
        } else if (jEZpvd == -5) {
            this.copydefault[4] = c7277agm;
        } else if (jEZpvd == -6) {
            this.copydefault[5] = c7277agm;
        }
    }

    public final void KWHzl(int i, C7277agm c7277agm, boolean z) {
        if (z) {
            if (this.KWHzl == null) {
                this.KWHzl = new LinkedList<>();
            }
            this.KWHzl.add(c7277agm);
        }
        C7277agm[] c7277agmArr = this.copydefault;
        if (c7277agmArr[i] == null) {
            c7277agmArr[i] = c7277agm;
        } else if (this.AhwBna.getDecimalFormatSymbols().getDecimalSeparator() == c7277agm.AEQbTJ()) {
            this.copydefault[i] = c7277agm;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof C7279ago)) {
            return false;
        }
        C7279ago c7279ago = (C7279ago) obj;
        if (!this.AEQbTJ.equals(c7279ago.AEQbTJ) || this.gEmmrt.length != c7279ago.gEmmrt.length || this.EZpvd != c7279ago.EZpvd) {
            return false;
        }
        int i = 0;
        while (true) {
            C7277agm[] c7277agmArr = this.copydefault;
            if (i >= c7277agmArr.length) {
                int i2 = 0;
                while (true) {
                    C7277agm[] c7277agmArr2 = this.gEmmrt;
                    if (i2 >= c7277agmArr2.length) {
                        return true;
                    }
                    if (!c7277agmArr2[i2].equals(c7279ago.gEmmrt[i2])) {
                        return false;
                    }
                    i2++;
                }
            } else {
                if (!Objects.equals(c7277agmArr[i], c7279ago.copydefault[i])) {
                    return false;
                }
                i++;
            }
        }
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(this.AEQbTJ);
        sb.append(":\n");
        for (C7277agm c7277agm : this.gEmmrt) {
            sb.append(c7277agm.toString());
            sb.append("\n");
        }
        for (C7277agm c7277agm2 : this.copydefault) {
            if (c7277agm2 != null) {
                if (c7277agm2.EZpvd() == -2 || c7277agm2.EZpvd() == -3 || c7277agm2.EZpvd() == -4) {
                    for (C7277agm c7277agm3 : this.KWHzl) {
                        if (c7277agm3.EZpvd() == c7277agm2.EZpvd()) {
                            sb.append(c7277agm3.toString());
                            sb.append("\n");
                        }
                    }
                } else {
                    sb.append(c7277agm2.toString());
                    sb.append("\n");
                }
            }
        }
        return sb.toString();
    }

    public boolean AEQbTJ() {
        return !this.AEQbTJ.startsWith("%%");
    }

    public void AEQbTJ(long j, java.lang.StringBuilder sb, int i, int i2) {
        if (i2 >= 64) {
            throw new java.lang.IllegalStateException("Recursion limit exceeded when applying ruleSet " + this.AEQbTJ);
        }
        copydefault(j).copydefault(j, sb, i, i2 + 1);
    }

    public void KWHzl(double d, java.lang.StringBuilder sb, int i, int i2) {
        if (i2 >= 64) {
            throw new java.lang.IllegalStateException("Recursion limit exceeded when applying ruleSet " + this.AEQbTJ);
        }
        EZpvd(d).EZpvd(d, sb, i, i2 + 1);
    }

    public C7277agm EZpvd(double d) {
        C7277agm c7277agm;
        if (this.EZpvd) {
            return copydefault(d);
        }
        if (java.lang.Double.isNaN(d)) {
            C7277agm c7277agm2 = this.copydefault[5];
            return c7277agm2 == null ? this.AhwBna.getDefaultNaNRule() : c7277agm2;
        }
        if (d < AudioStats.AUDIO_AMPLITUDE_NONE) {
            C7277agm c7277agm3 = this.copydefault[0];
            if (c7277agm3 != null) {
                return c7277agm3;
            }
            d = -d;
        }
        if (java.lang.Double.isInfinite(d)) {
            C7277agm c7277agm4 = this.copydefault[4];
            return c7277agm4 == null ? this.AhwBna.getDefaultInfinityRule() : c7277agm4;
        }
        if (d != java.lang.Math.floor(d)) {
            if (d < 1.0d && (c7277agm = this.copydefault[2]) != null) {
                return c7277agm;
            }
            C7277agm c7277agm5 = this.copydefault[1];
            if (c7277agm5 != null) {
                return c7277agm5;
            }
        }
        C7277agm c7277agm6 = this.copydefault[3];
        return c7277agm6 != null ? c7277agm6 : copydefault(java.lang.Math.round(d));
    }

    public final C7277agm copydefault(long j) {
        if (this.EZpvd) {
            return copydefault(j);
        }
        int i = 0;
        if (j < 0) {
            C7277agm c7277agm = this.copydefault[0];
            if (c7277agm != null) {
                return c7277agm;
            }
            j = -j;
        }
        int length = this.gEmmrt.length;
        if (length <= 0) {
            return this.copydefault[3];
        }
        while (i < length) {
            int i2 = (i + length) >>> 1;
            long jEZpvd = this.gEmmrt[i2].EZpvd();
            if (jEZpvd == j) {
                return this.gEmmrt[i2];
            }
            if (jEZpvd > j) {
                length = i2;
            } else {
                i = i2 + 1;
            }
        }
        if (length == 0) {
            throw new java.lang.IllegalStateException("The rule set " + this.AEQbTJ + " cannot format the value " + j);
        }
        C7277agm c7277agm2 = this.gEmmrt[length - 1];
        if (!c7277agm2.OLrzqt(j)) {
            return c7277agm2;
        }
        if (length == 1) {
            throw new java.lang.IllegalStateException("The rule set " + this.AEQbTJ + " cannot roll back from the rule '" + c7277agm2 + "'");
        }
        return this.gEmmrt[length - 2];
    }

    public final C7277agm copydefault(double d) {
        int i = 0;
        long jEZpvd = this.gEmmrt[0].EZpvd();
        int i2 = 1;
        while (true) {
            C7277agm[] c7277agmArr = this.gEmmrt;
            if (i2 >= c7277agmArr.length) {
                break;
            }
            jEZpvd = KWHzl(jEZpvd, c7277agmArr[i2].EZpvd());
            i2++;
        }
        long jRound = java.lang.Math.round(jEZpvd * d);
        long j = Long.MAX_VALUE;
        int i3 = 0;
        while (true) {
            C7277agm[] c7277agmArr2 = this.gEmmrt;
            if (i >= c7277agmArr2.length) {
                i = i3;
                break;
            }
            long jEZpvd2 = (c7277agmArr2[i].EZpvd() * jRound) % jEZpvd;
            long j2 = jEZpvd - jEZpvd2;
            if (j2 < jEZpvd2) {
                jEZpvd2 = j2;
            }
            if (jEZpvd2 < j) {
                if (jEZpvd2 == 0) {
                    break;
                }
                i3 = i;
                j = jEZpvd2;
            }
            i++;
        }
        int i4 = i + 1;
        C7277agm[] c7277agmArr3 = this.gEmmrt;
        if (i4 < c7277agmArr3.length && c7277agmArr3[i4].EZpvd() == this.gEmmrt[i].EZpvd() && (java.lang.Math.round(this.gEmmrt[i].EZpvd() * d) < 1 || java.lang.Math.round(d * this.gEmmrt[i].EZpvd()) >= 2)) {
            i = i4;
        }
        return this.gEmmrt[i];
    }

    public static long KWHzl(long j, long j2) {
        long j3;
        long j4;
        long j5;
        int i = 0;
        long j6 = j;
        long j7 = j2;
        while (true) {
            j3 = j6 & 1;
            if (j3 != 0 || (j7 & 1) != 0) {
                break;
            }
            i++;
            j6 >>= 1;
            j7 >>= 1;
        }
        if (j3 == 1) {
            long j8 = j6;
            j6 = -j7;
            j4 = j7;
            j5 = j8;
        } else {
            j4 = j7;
            j5 = j6;
        }
        while (j6 != 0) {
            while ((j6 & 1) == 0) {
                j6 >>= 1;
            }
            if (j6 > 0) {
                j5 = j6;
            } else {
                j4 = -j6;
            }
            j6 = j5 - j4;
        }
        return (j / (j5 << i)) * j2;
    }

    public java.lang.Number OLrzqt(java.lang.String str, ParsePosition parsePosition, double d, int i) {
        ParsePosition parsePosition2 = new ParsePosition(0);
        java.lang.Long l = C7277agm.EZpvd;
        if (str.length() == 0) {
            return l;
        }
        int i2 = i;
        java.lang.Number number = l;
        int i3 = 0;
        while (true) {
            C7277agm[] c7277agmArr = this.copydefault;
            if (i3 >= c7277agmArr.length) {
                break;
            }
            C7277agm c7277agm = c7277agmArr[i3];
            if (c7277agm != null && ((i2 >> i3) & 1) == 0) {
                i2 |= 1 << i3;
                java.lang.Number numberOLrzqt = c7277agm.OLrzqt(str, parsePosition, false, d, i2);
                if (parsePosition.getIndex() > parsePosition2.getIndex()) {
                    parsePosition2.setIndex(parsePosition.getIndex());
                    number = numberOLrzqt;
                }
                parsePosition.setIndex(0);
            }
            i3++;
        }
        java.lang.Number number2 = number;
        for (int length = this.gEmmrt.length - 1; length >= 0 && parsePosition2.getIndex() < str.length(); length--) {
            if (this.EZpvd || this.gEmmrt[length].EZpvd() < d) {
                java.lang.Number numberOLrzqt2 = this.gEmmrt[length].OLrzqt(str, parsePosition, this.EZpvd, d, i2);
                if (parsePosition.getIndex() > parsePosition2.getIndex()) {
                    parsePosition2.setIndex(parsePosition.getIndex());
                    number2 = numberOLrzqt2;
                }
                parsePosition.setIndex(0);
            }
        }
        parsePosition.setIndex(parsePosition2.getIndex());
        return number2;
    }

    public void copydefault(DecimalFormatSymbols decimalFormatSymbols) {
        for (C7277agm c7277agm : this.gEmmrt) {
            c7277agm.copydefault(decimalFormatSymbols);
        }
        if (this.KWHzl != null) {
            for (int i = 1; i <= 3; i++) {
                if (this.copydefault[i] != null) {
                    for (C7277agm c7277agm2 : this.KWHzl) {
                        if (this.copydefault[i].EZpvd() == c7277agm2.EZpvd()) {
                            KWHzl(i, c7277agm2, false);
                        }
                    }
                }
            }
        }
        for (C7277agm c7277agm3 : this.copydefault) {
            if (c7277agm3 != null) {
                c7277agm3.copydefault(decimalFormatSymbols);
            }
        }
    }
}
