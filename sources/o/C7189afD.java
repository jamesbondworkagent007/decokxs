package o;

import com.ibm.icu.text.ArabicShapingException;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: o.afD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C7189afD {
    public boolean djBIcL;
    public final int fetchVPNInfo;
    public char isConnected;
    public boolean values;
    public static final int[] EZpvd = {0, 2, 4, 6, 8, 10, 12, 14};
    public static final int[] AhwBna = {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1};
    public static final int[] AYXKKw = {0, 1, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1};
    public static final char[] valueOf = {65263, 65264};
    public static final char[] copydefault = {1570, 1571, 1573, 1575};
    public static final int[] AEQbTJ = {4385, 4897, 5377, 5921, 6403, 7457, 7939, 8961, 9475, 10499, 11523, 12547, 13571, 14593, 15105, 15617, 16129, 16643, 17667, 18691, 19715, 20739, 21763, 22787, 23811, 0, 0, 0, 0, 0, 3, 24835, 25859, 26883, 27923, 28931, 29955, 30979, 32001, 32513, 33027, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 0, 0, 0, 0, 34049, 34561, 35073, 35585, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 33, 33, 0, 33, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3, 3, 3, 3, 1, 1};
    public static final int[] OLrzqt = {3, 3, 3, 0, 3, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 32, 33, 32, 33, 0, 1, 32, 33, 0, 2, 3, 1, 32, 33, 0, 2, 3, 1, 0, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 16, 18, 19, 17, 0, 2, 3, 1, 0, 2, 3, 1, 0, 2, 3, 1, 0, 1, 0, 1, 0, 2, 3, 1, 0, 1, 0, 1, 0, 1, 0, 1};
    public static int[] KWHzl = {1611, 1611, 1612, 1612, 1613, 1613, 1614, 1614, 1615, 1615, 1616, 1616, 1617, 1617, 1618, 1618, 1569, 1570, 1570, 1571, 1571, 1572, 1572, 1573, 1573, 1574, 1574, 1574, 1574, 1575, 1575, 1576, 1576, 1576, 1576, 1577, 1577, 1578, 1578, 1578, 1578, 1579, 1579, 1579, 1579, 1580, 1580, 1580, 1580, 1581, 1581, 1581, 1581, 1582, 1582, 1582, 1582, 1583, 1583, 1584, 1584, 1585, 1585, 1586, 1586, 1587, 1587, 1587, 1587, 1588, 1588, 1588, 1588, 1589, 1589, 1589, 1589, 1590, 1590, 1590, 1590, 1591, 1591, 1591, 1591, 1592, 1592, 1592, 1592, 1593, 1593, 1593, 1593, 1594, 1594, 1594, 1594, 1601, 1601, 1601, 1601, 1602, 1602, 1602, 1602, 1603, 1603, 1603, 1603, 1604, 1604, 1604, 1604, 1605, 1605, 1605, 1605, 1606, 1606, 1606, 1606, 1607, 1607, 1607, 1607, 1608, 1608, 1609, 1609, 1610, 1610, 1610, 1610, 1628, 1628, 1629, 1629, 1630, 1630, 1631, 1631};
    public static final int[][][] gEmmrt = {new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}, new int[]{0, 1, 0, 3}, new int[]{0, 1, 0, 1}}, new int[][]{new int[]{0, 0, 2, 2}, new int[]{0, 0, 1, 2}, new int[]{0, 1, 1, 2}, new int[]{0, 1, 1, 3}}, new int[][]{new int[]{0, 0, 0, 0}, new int[]{0, 0, 0, 0}, new int[]{0, 1, 0, 3}, new int[]{0, 1, 0, 3}}, new int[][]{new int[]{0, 0, 1, 2}, new int[]{0, 0, 1, 2}, new int[]{0, 1, 1, 2}, new int[]{0, 1, 1, 3}}};

    public static int AYXKKw(char c) {
        return (c < 1587 || c > 1590) ? 0 : 1;
    }

    public static boolean AhwBna(char c) {
        return c >= 65269 && c <= 65276;
    }

    public static boolean AkhnZx(char c) {
        return c != 65141 && c >= 65136 && c <= 65151;
    }

    public static char EZpvd(char c) {
        if (c == 1570) {
            return (char) 1628;
        }
        if (c == 1571) {
            return (char) 1629;
        }
        if (c != 1573) {
            return c != 1575 ? (char) 0 : (char) 1631;
        }
        return (char) 1630;
    }

    public static boolean OLrzqt(char c) {
        return c == 65263 || c == 65264 || c == 1609;
    }

    public static boolean copydefault(char c) {
        return c == 1570 || c == 1571 || c == 1573 || c == 1575;
    }

    public static boolean djBIcL(char c) {
        return c >= 1628 && c <= 1631;
    }

    public static boolean fetchVPNInfo(char c) {
        return c == 65161 || c == 65162;
    }

    public static boolean gEmmrt(char c) {
        return c == 8203 || c == 65139;
    }

    public static boolean isConnected(char c) {
        return c >= 1611 && c <= 1618;
    }

    public static int values(char c) {
        if ((c > 1569 && c < 1574) || c == 1575) {
            return 1;
        }
        if (c > 1582 && c < 1587) {
            return 1;
        }
        if ((c > 1607 && c < 1610) || c == 1577) {
            return 1;
        }
        if (c >= 1611 && c <= 1618) {
            return 2;
        }
        if ((c < 1619 || c > 1621) && c != 1648) {
            return (c < 65136 || c > 65151) ? 0 : 3;
        }
        return 3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.fetchVPNInfo;
    }

    public int AEQbTJ(char[] cArr, int i, int i2, char[] cArr2, int i3, int i4) throws ArabicShapingException {
        if (cArr == null) {
            throw new java.lang.IllegalArgumentException("source can not be null");
        }
        if (i < 0 || i2 < 0 || i + i2 > cArr.length) {
            throw new java.lang.IllegalArgumentException("bad source start (" + i + ") or length (" + i2 + ") for buffer of length " + cArr.length);
        }
        if (cArr2 == null && i4 != 0) {
            throw new java.lang.IllegalArgumentException("null dest requires destSize == 0");
        }
        if (i4 != 0 && (i3 < 0 || i4 < 0 || i3 + i4 > cArr2.length)) {
            throw new java.lang.IllegalArgumentException("bad dest start (" + i3 + ") or size (" + i4 + ") for buffer of length " + cArr2.length);
        }
        int i5 = this.fetchVPNInfo;
        int i6 = 917504 & i5;
        if (i6 != 0 && i6 != 262144 && i6 != 393216 && i6 != 524288 && i6 != 786432) {
            throw new java.lang.IllegalArgumentException("Wrong Tashkeel argument");
        }
        int i7 = 65539 & i5;
        if (i7 != 0 && i7 != 3 && i7 != 2 && i7 != 0 && i7 != 65536 && i7 != 1) {
            throw new java.lang.IllegalArgumentException("Wrong Lam Alef argument");
        }
        if (i6 != 0 && (i5 & 24) == 16) {
            throw new java.lang.IllegalArgumentException("Tashkeel replacement should not be enabled in deshaping mode ");
        }
        return OLrzqt(cArr, i, i2, cArr2, i3, i4);
    }

    public java.lang.String EZpvd(java.lang.String str) throws ArabicShapingException {
        char[] charArray = str.toCharArray();
        int i = this.fetchVPNInfo;
        char[] cArr = ((65539 & i) == 0 && (i & 24) == 16) ? new char[charArray.length * 2] : charArray;
        return new java.lang.String(cArr, 0, AEQbTJ(charArray, 0, charArray.length, cArr, 0, cArr.length));
    }

    public C7189afD(int i) {
        this.fetchVPNInfo = i;
        if ((i & 224) > 128) {
            throw new java.lang.IllegalArgumentException("bad DIGITS options");
        }
        this.djBIcL = (i & 4) == 0;
        this.values = (i & 67108864) == 67108864;
        this.isConnected = (i & 134217728) == 134217728 ? (char) 65139 : (char) 8203;
    }

    public boolean equals(java.lang.Object obj) {
        return obj != null && obj.getClass() == C7189afD.class && this.fetchVPNInfo == ((C7189afD) obj).fetchVPNInfo;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(super.toString());
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        int i = this.fetchVPNInfo & 65539;
        if (i == 0) {
            sb.append("LamAlef resize");
        } else if (i == 1) {
            sb.append("LamAlef spaces at near");
        } else if (i == 2) {
            sb.append("LamAlef spaces at end");
        } else if (i == 3) {
            sb.append("LamAlef spaces at begin");
        } else if (i == 65536) {
            sb.append("lamAlef auto");
        }
        int i2 = this.fetchVPNInfo & 4;
        if (i2 == 0) {
            sb.append(", logical");
        } else if (i2 == 4) {
            sb.append(", visual");
        }
        int i3 = this.fetchVPNInfo & 24;
        if (i3 == 0) {
            sb.append(", no letter shaping");
        } else if (i3 == 8) {
            sb.append(", shape letters");
        } else if (i3 == 16) {
            sb.append(", unshape letters");
        } else if (i3 == 24) {
            sb.append(", shape letters tashkeel isolated");
        }
        if ((this.fetchVPNInfo & 7340032) == 2097152) {
            sb.append(", Seen at near");
        }
        if ((this.fetchVPNInfo & 58720256) == 16777216) {
            sb.append(", Yeh Hamza at near");
        }
        int i4 = this.fetchVPNInfo & 917504;
        if (i4 == 262144) {
            sb.append(", Tashkeel at begin");
        } else if (i4 == 393216) {
            sb.append(", Tashkeel at end");
        } else if (i4 == 524288) {
            sb.append(", Tashkeel resize");
        } else if (i4 == 786432) {
            sb.append(", Tashkeel replace with tatweel");
        }
        int i5 = this.fetchVPNInfo & 224;
        if (i5 == 0) {
            sb.append(", no digit shaping");
        } else if (i5 == 32) {
            sb.append(", shape digits to AN");
        } else if (i5 == 64) {
            sb.append(", shape digits to EN");
        } else if (i5 == 96) {
            sb.append(", shape digits to AN contextually: default EN");
        } else if (i5 == 128) {
            sb.append(", shape digits to AN contextually: default AL");
        }
        int i6 = this.fetchVPNInfo & 256;
        if (i6 == 0) {
            sb.append(", standard Arabic-Indic digits");
        } else if (i6 == 256) {
            sb.append(", extended Arabic-Indic digits");
        }
        sb.append("]");
        return sb.toString();
    }

    public final void AEQbTJ(char[] cArr, int i, int i2, char c, boolean z) {
        C7030acD c7030acD = C7030acD.KWHzl;
        char c2 = (char) (c - '0');
        int i3 = i2 + i;
        while (true) {
            i3--;
            if (i3 < i) {
                return;
            }
            char c3 = cArr[i3];
            int iAEQbTJ = c7030acD.AEQbTJ(c3);
            if (iAEQbTJ == 0 || iAEQbTJ == 1) {
                z = false;
            } else if (iAEQbTJ != 2) {
                if (iAEQbTJ == 13) {
                    z = true;
                }
            } else if (z && c3 <= '9') {
                cArr[i3] = (char) (c3 + c2);
            }
        }
    }

    public static void OLrzqt(char[] cArr, int i, int i2) {
        for (int i3 = (i2 + i) - 1; i < i3; i3--) {
            char c = cArr[i];
            cArr[i] = cArr[i3];
            cArr[i3] = c;
            i++;
        }
    }

    public static int KWHzl(char c) {
        if (c >= 1570 && c <= 1747) {
            return AEQbTJ[c - 1570];
        }
        if (c == 8205) {
            return 3;
        }
        if (c >= 8301 && c <= 8303) {
            return 4;
        }
        if (c < 65136 || c > 65276) {
            return 0;
        }
        return OLrzqt[c - 65136];
    }

    public static int EZpvd(char[] cArr, int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            if (cArr[i3] != ' ') {
                return i3 - i;
            }
        }
        return i2;
    }

    public static int KWHzl(char[] cArr, int i, int i2) {
        int i3 = i + i2;
        int i4 = i3;
        do {
            i4--;
            if (i4 < i) {
                return i2;
            }
        } while (cArr[i4] == ' ');
        return (i3 - 1) - i4;
    }

    public static int valueOf(char c) {
        if (c < 65201 || c >= 65215) {
            return 0;
        }
        return AhwBna[c - 65201];
    }

    public static int DbNXlk(char c) {
        if (c < 65136 || c > 65151 || c == 65139 || c == 65141 || c == 65149) {
            return ((c < 64754 || c > 64756) && c != 65149) ? 0 : 2;
        }
        return AYXKKw[c - 65136];
    }

    public static int AEQbTJ(char c) {
        if (c < 65136 || c > 65151 || c == 65139 || c == 65141) {
            return (c < 64606 || c > 64611) ? 0 : 1;
        }
        return 1 - AYXKKw[c - 65136];
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int AEQbTJ(char[] cArr, int i, int i2) {
        int i3;
        int i4 = this.fetchVPNInfo & 24;
        if (i4 == 8) {
            if (this.djBIcL) {
                int i5 = i2;
                for (int i6 = i + 1; i6 < i + i2; i6++) {
                    if ((cArr[i6] == 1604 && copydefault(cArr[i6 - 1])) || AkhnZx(cArr[i6])) {
                        i5--;
                    }
                }
                return i5;
            }
            i3 = i2;
            for (int i7 = i; i7 < (i + i2) - 1; i7++) {
                if ((cArr[i7] == 1604 && copydefault(cArr[i7 + 1])) || AkhnZx(cArr[i7])) {
                    i3--;
                }
            }
        } else if (i4 != 16) {
            if (i4 != 24) {
                return i2;
            }
            if (this.djBIcL) {
            }
        } else {
            i3 = i2;
            for (int i8 = i; i8 < i + i2; i8++) {
                if (AhwBna(cArr[i8])) {
                    i3++;
                }
            }
        }
        return i3;
    }

    public static int EZpvd(char[] cArr, int i, char c) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (cArr[i3] == c) {
                i2++;
            }
        }
        return i2;
    }

    public static void AEQbTJ(char[] cArr, int i, int i2, char c) {
        int i3 = i2;
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            char c2 = cArr[i2];
            if (c2 != c && i3 - 1 != i2) {
                cArr[i3] = c2;
            }
        }
    }

    public static int AEQbTJ(char[] cArr, int i, int i2, int i3) {
        if (i3 <= i) {
            return i2;
        }
        while (i3 < i2) {
            cArr[i] = cArr[i3];
            i++;
            i3++;
        }
        return i;
    }

    public static int OLrzqt(char[] cArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (DbNXlk(cArr[i2]) == 1) {
                cArr[i2] = 1600;
            } else if (DbNXlk(cArr[i2]) == 2) {
                cArr[i2] = 65149;
            } else if (AEQbTJ(cArr[i2]) == 1 && cArr[i2] != 65148) {
                cArr[i2] = ' ';
            }
        }
        return i;
    }

    public final int AYXKKw(char[] cArr, int i, int i2) {
        int iAEQbTJ;
        int i3 = i2;
        int i4 = this.fetchVPNInfo;
        int i5 = 65539 & i4;
        int i6 = i4 & 917504;
        if ((!this.djBIcL) & (!this.values)) {
            if (i5 == 2) {
                i5 = 3;
            } else if (i5 == 3) {
                i5 = 2;
            }
            if (i6 == 262144) {
                i6 = 393216;
            } else if (i6 == 393216) {
                i6 = 262144;
            }
        }
        if (i5 == 1) {
            for (int i7 = i; i7 < i + i3; i7++) {
                if (cArr[i7] == 65535) {
                    cArr[i7] = ' ';
                }
            }
        } else {
            int i8 = i + i3;
            int iEZpvd = EZpvd(cArr, i3, (char) 65535);
            int iEZpvd2 = EZpvd(cArr, i3, (char) 65534);
            boolean z = i5 == 2;
            boolean z2 = i6 == 393216;
            if (z && i5 == 2) {
                AEQbTJ(cArr, i, i8, (char) 65535);
                while (iEZpvd > i) {
                    iEZpvd--;
                    cArr[iEZpvd] = ' ';
                }
            }
            if (z2 && i6 == 393216) {
                AEQbTJ(cArr, i, i8, (char) 65534);
                iAEQbTJ = iEZpvd2;
                while (iAEQbTJ > i) {
                    iAEQbTJ--;
                    cArr[iAEQbTJ] = ' ';
                }
            } else {
                iAEQbTJ = iEZpvd2;
            }
            boolean z3 = i5 == 0;
            boolean z4 = i6 == 524288;
            if (z3 && i5 == 0) {
                AEQbTJ(cArr, i, i8, (char) 65535);
                iEZpvd = AEQbTJ(cArr, i, i8, iEZpvd);
                i3 = iEZpvd - i;
            }
            if (z4 && i6 == 524288) {
                AEQbTJ(cArr, i, i8, (char) 65534);
                iAEQbTJ = AEQbTJ(cArr, i, i8, iAEQbTJ);
                i3 = iAEQbTJ - i;
            }
            boolean z5 = i5 == 3 || i5 == 65536;
            boolean z6 = i6 == 262144;
            if (z5 && (i5 == 3 || i5 == 65536)) {
                AEQbTJ(cArr, i, i8, (char) 65535);
                for (int iAEQbTJ2 = AEQbTJ(cArr, i, i8, iEZpvd); iAEQbTJ2 < i8; iAEQbTJ2++) {
                    cArr[iAEQbTJ2] = ' ';
                }
            }
            if (z6 && i6 == 262144) {
                AEQbTJ(cArr, i, i8, (char) 65534);
                for (int iAEQbTJ3 = AEQbTJ(cArr, i, i8, iAEQbTJ); iAEQbTJ3 < i8; iAEQbTJ3++) {
                    cArr[iAEQbTJ3] = ' ';
                }
            }
        }
        return i3;
    }

    public final boolean copydefault(char[] cArr, int i, int i2, int i3) {
        if (i3 > KWHzl(cArr, i, i2)) {
            return true;
        }
        int i4 = i2 + i;
        int i5 = i4 - i3;
        while (true) {
            i5--;
            if (i5 < i) {
                return false;
            }
            char c = cArr[i5];
            if (djBIcL(c)) {
                cArr[i4 - 1] = 1604;
                i4 -= 2;
                cArr[i4] = copydefault[c - 1628];
            } else {
                i4--;
                cArr[i4] = c;
            }
        }
    }

    public final boolean KWHzl(char[] cArr, int i, int i2, int i3) {
        if (i3 > EZpvd(cArr, i, i2)) {
            return true;
        }
        int i4 = i;
        for (int i5 = i3 + i; i5 < i2 + i; i5++) {
            char c = cArr[i5];
            if (djBIcL(c)) {
                cArr[i4] = copydefault[c - 1628];
                cArr[i4 + 1] = 1604;
                i4 += 2;
            } else {
                cArr[i4] = c;
                i4++;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0048, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AEQbTJ(char[] cArr, int i, int i2, int i3, int i4, int i5) {
        if (djBIcL(cArr[i])) {
            return true;
        }
        int i6 = i2 + i;
        while (true) {
            int i7 = i6 - 1;
            if (i7 < i) {
                return false;
            }
            char c = cArr[i7];
            if (i5 == 1 && djBIcL(c)) {
                if (i7 <= i || cArr[i6 - 2] != ' ') {
                    break;
                }
                cArr[i7] = 1604;
                i6 -= 2;
                cArr[i6] = copydefault[c - 1628];
            } else {
                if (i4 != 1 || valueOf(c) != 1) {
                    if (i3 == 1 && fetchVPNInfo(c)) {
                        if (i7 <= i) {
                            break;
                        }
                        int i8 = i6 - 2;
                        if (cArr[i8] != ' ') {
                            break;
                        }
                        cArr[i7] = valueOf[c - 65161];
                        cArr[i8] = 65152;
                    }
                } else {
                    if (i7 <= i) {
                        break;
                    }
                    int i9 = i6 - 2;
                    if (cArr[i9] != ' ') {
                        break;
                    }
                    cArr[i9] = this.isConnected;
                }
                i6 = i7;
            }
        }
        return true;
    }

    public final int AEQbTJ(char[] cArr, int i, int i2, int i3, int i4) throws ArabicShapingException {
        int i5 = this.fetchVPNInfo;
        int i6 = 65539 & i5;
        boolean z = this.djBIcL;
        if (!z && !this.values) {
            if (i6 == 2) {
                i6 = 3;
            } else if (i6 == 3) {
                i6 = 2;
            }
        }
        if (i4 != 1) {
            if ((7340032 & i5) == 2097152 && AEQbTJ(cArr, i, i2, 0, 1, 0)) {
                throw new ArabicShapingException("No space for Seen tail expansion");
            }
            if ((58720256 & i5) == 16777216 && AEQbTJ(cArr, i, i2, 1, 0, 0)) {
                throw new ArabicShapingException("No space for YehHamza expansion");
            }
            return i2;
        }
        if (i6 == 65536) {
            if (z) {
                boolean zKWHzl = KWHzl(cArr, i, i2, i3);
                if (zKWHzl) {
                    zKWHzl = copydefault(cArr, i, i2, i3);
                }
                if (zKWHzl) {
                    zKWHzl = AEQbTJ(cArr, i, i2, 0, 0, 1);
                }
                if (zKWHzl) {
                    throw new ArabicShapingException("No spacefor lamalef");
                }
                return i2;
            }
            boolean zCopydefault = copydefault(cArr, i, i2, i3);
            if (zCopydefault) {
                zCopydefault = KWHzl(cArr, i, i2, i3);
            }
            if (zCopydefault) {
                zCopydefault = AEQbTJ(cArr, i, i2, 0, 0, 1);
            }
            if (zCopydefault) {
                throw new ArabicShapingException("No spacefor lamalef");
            }
            return i2;
        }
        if (i6 == 2) {
            if (KWHzl(cArr, i, i2, i3)) {
                throw new ArabicShapingException("No spacefor lamalef");
            }
            return i2;
        }
        if (i6 == 3) {
            if (copydefault(cArr, i, i2, i3)) {
                throw new ArabicShapingException("No spacefor lamalef");
            }
            return i2;
        }
        if (i6 == 1) {
            if (AEQbTJ(cArr, i, i2, 0, 0, 1)) {
                throw new ArabicShapingException("No spacefor lamalef");
            }
            return i2;
        }
        if (i6 != 0) {
            return i2;
        }
        int i7 = i + i2;
        int i8 = i7 + i3;
        while (true) {
            i7--;
            if (i7 < i) {
                return i2 + i3;
            }
            char c = cArr[i7];
            if (djBIcL(c)) {
                cArr[i8 - 1] = 1604;
                i8 -= 2;
                cArr[i8] = copydefault[c - 1628];
            } else {
                i8--;
                cArr[i8] = c;
            }
        }
    }

    public final int gEmmrt(char[] cArr, int i, int i2) {
        int i3 = 0;
        for (int i4 = i; i4 < i2 + i; i4++) {
            char c = cArr[i4];
            if (c >= 65136 && c <= 65276) {
                if (AhwBna(c)) {
                    i3++;
                }
                cArr[i4] = (char) KWHzl[c - 65136];
            }
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int copydefault(char[] cArr, int i, int i2) {
        int i3 = this.fetchVPNInfo;
        int i4 = 0;
        boolean z = (58720256 & i3) == 16777216;
        boolean z2 = (i3 & 7340032) == 2097152;
        for (int i5 = i; i5 < i + i2; i5++) {
            char c = cArr[i5];
            if (z && ((c == 1569 || c == 65152) && i5 < i2 - 1)) {
                int i6 = i5 + 1;
                if (OLrzqt(cArr[i6])) {
                    cArr[i5] = ' ';
                    cArr[i6] = 1574;
                }
            } else if (z2 && gEmmrt(c) && i5 < i2 - 1 && valueOf(cArr[i5 + 1]) == 1) {
                cArr[i5] = ' ';
            } else if (c >= 65136 && c <= 65276) {
                if (AhwBna(c)) {
                    i4++;
                }
                cArr[i5] = (char) KWHzl[c - 65136];
            }
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int copydefault(char[] cArr, int i, int i2, int i3, int i4) throws ArabicShapingException {
        int iValues;
        int i5;
        char c;
        int iGEmmrt = gEmmrt(cArr, i, i2);
        int i6 = 1;
        int i7 = (i + i2) - 1;
        int iKWHzl = KWHzl(cArr[i7]);
        int i8 = 0;
        boolean z = false;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int iKWHzl2 = 0;
        int i13 = -2;
        int i14 = i7;
        while (i7 >= 0) {
            if ((iKWHzl & 65280) != 0 || isConnected(cArr[i7])) {
                int i15 = i7 - 1;
                i13 = -2;
                while (i13 < 0) {
                    if (i15 == -1) {
                        i13 = Integer.MAX_VALUE;
                        iKWHzl2 = 0;
                    } else {
                        iKWHzl2 = KWHzl(cArr[i15]);
                        if ((iKWHzl2 & 4) == 0) {
                            i13 = i15;
                        } else {
                            i15--;
                        }
                    }
                }
                if ((iKWHzl & 32) > 0 && (i11 & 16) > 0) {
                    char cEZpvd = EZpvd(cArr[i7]);
                    if (cEZpvd != 0) {
                        cArr[i7] = 65535;
                        cArr[i14] = cEZpvd;
                        i7 = i14;
                    }
                    iKWHzl = KWHzl(cEZpvd);
                    i8 = i6;
                    i11 = i12;
                }
                if (i7 > 0 && cArr[i7 - 1] == ' ') {
                    if (AYXKKw(cArr[i7]) != i6) {
                        if (cArr[i7] == 1574) {
                        }
                    }
                    iValues = values(cArr[i7]);
                    int i16 = gEmmrt[iKWHzl2 & 3][i11 & 3][iKWHzl & 3];
                    i5 = i14;
                    if (iValues != i6) {
                    }
                    if (iValues != 2) {
                    }
                } else {
                    if (i7 == 0) {
                        if (AYXKKw(cArr[i7]) == i6) {
                            i9 = i6;
                        } else if (cArr[i7] == 1574) {
                            i10 = i6;
                        }
                    }
                    iValues = values(cArr[i7]);
                    int i162 = gEmmrt[iKWHzl2 & 3][i11 & 3][iKWHzl & 3];
                    i5 = i14;
                    if (iValues != i6) {
                        i162 &= 1;
                    } else if (iValues == 2) {
                        i162 = ((i4 != 0 || (i11 & 2) == 0 || (iKWHzl2 & 1) == 0 || (c = cArr[i7]) == 1612 || c == 1613 || ((iKWHzl2 & 32) == 32 && (i11 & 16) == 16)) && !(i4 == 2 && cArr[i7] == 1617)) ? 0 : 1;
                    }
                    if (iValues != 2) {
                        if (i4 == 2 && cArr[i7] != 1617) {
                            cArr[i7] = 65534;
                            z = true;
                        } else {
                            cArr[i7] = (char) (EZpvd[cArr[i7] - 1611] + 65136 + i162);
                        }
                    } else {
                        cArr[i7] = (char) ((iKWHzl >> 8) + 65136 + i162);
                    }
                }
            } else {
                i5 = i14;
            }
            if ((iKWHzl & 4) == 0) {
                i14 = i7;
                i12 = i11;
                i6 = 1;
                i11 = iKWHzl;
            } else {
                i14 = i5;
                i6 = 1;
            }
            i7 -= i6;
            if (i7 == i13) {
                iKWHzl = iKWHzl2;
                i13 = -2;
            } else if (i7 != -1) {
                iKWHzl = KWHzl(cArr[i7]);
            }
        }
        int iAYXKKw = (i8 != 0 || z) ? AYXKKw(cArr, i, i2) : i2;
        return (i9 == 0 && i10 == 0) ? iAYXKKw : AEQbTJ(cArr, i, iAYXKKw, iGEmmrt, 0);
    }

    public final int EZpvd(char[] cArr, int i, int i2, int i3) throws ArabicShapingException {
        int iCopydefault = copydefault(cArr, i, i2);
        return iCopydefault != 0 ? AEQbTJ(cArr, i, i2, iCopydefault, 1) : i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int OLrzqt(char[] cArr, int i, int i2, char[] cArr2, int i3, int i4) throws ArabicShapingException {
        char c;
        char c2;
        if (i2 == 0) {
            return 0;
        }
        if (i4 == 0) {
            int i5 = this.fetchVPNInfo;
            return ((i5 & 24) == 0 || (i5 & 65539) != 0) ? i2 : AEQbTJ(cArr, i, i2);
        }
        char[] cArr3 = new char[i2 * 2];
        java.lang.System.arraycopy(cArr, i, cArr3, 0, i2);
        if (this.djBIcL) {
            OLrzqt(cArr3, 0, i2);
        }
        int i6 = this.fetchVPNInfo;
        int i7 = i6 & 24;
        if (i7 == 8) {
            int i8 = i6 & 917504;
            if (i8 != 0 && i8 != 786432) {
                i2 = copydefault(cArr3, 0, i2, i4, 2);
            } else {
                i2 = (917504 & this.fetchVPNInfo) == 786432 ? OLrzqt(cArr3, i2) : copydefault(cArr3, 0, i2, i4, 0);
            }
        } else if (i7 == 16) {
            i2 = EZpvd(cArr3, 0, i2, i4);
        } else if (i7 == 24) {
            i2 = copydefault(cArr3, 0, i2, i4, 1);
        }
        if (i2 > i4) {
            throw new ArabicShapingException("not enough room for result data");
        }
        int i9 = this.fetchVPNInfo;
        int i10 = i9 & 224;
        if (i10 != 0) {
            int i11 = i9 & 256;
            if (i11 == 0) {
                c = 1632;
            } else if (i11 != 256) {
                c2 = '0';
                if (i10 != 32) {
                    for (int i12 = 0; i12 < i2; i12++) {
                        char c3 = cArr3[i12];
                        if (c3 <= '9' && c3 >= '0') {
                            cArr3[i12] = (char) (c3 + (c2 - '0'));
                        }
                    }
                } else if (i10 == 64) {
                    char c4 = (char) (c2 + '\t');
                    for (int i13 = 0; i13 < i2; i13++) {
                        char c5 = cArr3[i13];
                        if (c5 <= c4 && c5 >= c2) {
                            cArr3[i13] = (char) (c5 + ('0' - c2));
                        }
                    }
                } else if (i10 == 96) {
                    AEQbTJ(cArr3, 0, i2, c2, false);
                } else if (i10 == 128) {
                    AEQbTJ(cArr3, 0, i2, c2, true);
                }
            } else {
                c = 1776;
            }
            c2 = c;
            if (i10 != 32) {
            }
        }
        if (this.djBIcL) {
            OLrzqt(cArr3, 0, i2);
        }
        java.lang.System.arraycopy(cArr3, 0, cArr2, i3, i2);
        return i2;
    }
}
