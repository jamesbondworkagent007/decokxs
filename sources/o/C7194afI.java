package o;

/* JADX INFO: renamed from: o.afI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C7194afI {
    public static boolean AEQbTJ(int i) {
        return ((1 << i) & 448) != 0;
    }

    public static java.lang.String copydefault(java.lang.String str, int i) {
        int i2 = i & 10;
        if (i2 == 0) {
            return str;
        }
        int iCopydefault = 0;
        if (i2 == 2) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(str.length());
            do {
                int iAEQbTJ = C7242agD.AEQbTJ(str, iCopydefault);
                iCopydefault += C7242agD.copydefault(iAEQbTJ);
                C7242agD.copydefault(stringBuffer, C7223afl.AhwBna(iAEQbTJ));
            } while (iCopydefault < str.length());
            return stringBuffer.toString();
        }
        if (i2 == 8) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
            while (true) {
                int i3 = iCopydefault + 1;
                char cCharAt = str.charAt(iCopydefault);
                if (!C7190afE.OLrzqt(cCharAt)) {
                    sb.append(cCharAt);
                }
                if (i3 >= str.length()) {
                    return sb.toString();
                }
                iCopydefault = i3;
            }
        } else {
            java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer(str.length());
            do {
                int iAEQbTJ2 = C7242agD.AEQbTJ(str, iCopydefault);
                iCopydefault += C7242agD.copydefault(iAEQbTJ2);
                if (!C7190afE.OLrzqt(iAEQbTJ2)) {
                    C7242agD.copydefault(stringBuffer2, C7223afl.AhwBna(iAEQbTJ2));
                }
            } while (iCopydefault < str.length());
            return stringBuffer2.toString();
        }
    }

    public static java.lang.String OLrzqt(char[] cArr, int i, int i2, int i3) {
        return copydefault(new java.lang.String(cArr, i, i2 - i), i3);
    }

    public static java.lang.String OLrzqt(java.lang.String str, int i) {
        int iAEQbTJ;
        int iCopydefault;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(str.length());
        int i2 = i & 11;
        if (i2 == 0) {
            int length = str.length();
            while (true) {
                int iCopydefault2 = length - C7242agD.copydefault(C7242agD.AEQbTJ(str, length - 1));
                stringBuffer.append(str.substring(iCopydefault2, length));
                if (iCopydefault2 <= 0) {
                    break;
                }
                length = iCopydefault2;
            }
        } else if (i2 == 1) {
            int length2 = str.length();
            while (true) {
                int iCopydefault3 = length2;
                do {
                    iAEQbTJ = C7242agD.AEQbTJ(str, iCopydefault3 - 1);
                    iCopydefault3 -= C7242agD.copydefault(iAEQbTJ);
                    if (iCopydefault3 <= 0) {
                        break;
                    }
                } while (AEQbTJ(C7223afl.djBIcL(iAEQbTJ)));
                stringBuffer.append(str.substring(iCopydefault3, length2));
                if (iCopydefault3 <= 0) {
                    break;
                }
                length2 = iCopydefault3;
            }
        } else {
            int length3 = str.length();
            while (true) {
                int iAEQbTJ2 = C7242agD.AEQbTJ(str, length3 - 1);
                int iCopydefault4 = length3 - C7242agD.copydefault(iAEQbTJ2);
                if ((i & 1) != 0) {
                    while (iCopydefault4 > 0 && AEQbTJ(C7223afl.djBIcL(iAEQbTJ2))) {
                        iAEQbTJ2 = C7242agD.AEQbTJ(str, iCopydefault4 - 1);
                        iCopydefault4 -= C7242agD.copydefault(iAEQbTJ2);
                    }
                }
                if ((i & 8) == 0 || !C7190afE.OLrzqt(iAEQbTJ2)) {
                    if ((i & 2) != 0) {
                        int iAhwBna = C7223afl.AhwBna(iAEQbTJ2);
                        C7242agD.copydefault(stringBuffer, iAhwBna);
                        iCopydefault = C7242agD.copydefault(iAhwBna) + iCopydefault4;
                    } else {
                        iCopydefault = iCopydefault4;
                    }
                    stringBuffer.append(str.substring(iCopydefault, length3));
                }
                if (iCopydefault4 <= 0) {
                    break;
                }
                length3 = iCopydefault4;
            }
        }
        return stringBuffer.toString();
    }

    public static java.lang.String KWHzl(char[] cArr, int i, int i2, int i3) {
        return OLrzqt(new java.lang.String(cArr, i, i2 - i), i3);
    }

    public static java.lang.String OLrzqt(C7190afE c7190afE, int i) {
        char[] cArr = c7190afE.getPostValueLengthLimit;
        int iKWHzl = c7190afE.KWHzl();
        int i2 = c7190afE.DarRvM;
        if ((i2 & 1) != 0) {
            i = (i | 4) & (-9);
        }
        if ((i2 & 2) != 0) {
            i = (i | 8) & (-5);
        }
        int i3 = c7190afE.OqFWZa;
        if (i3 != 4 && i3 != 5 && i3 != 6 && i3 != 3) {
            i &= -5;
        }
        int i4 = i & 4;
        int i5 = c7190afE.fvQaOB;
        if (i4 != 0) {
            i5 *= 2;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i5);
        if ((i & 16) == 0) {
            if (i4 == 0) {
                for (int i6 = 0; i6 < iKWHzl; i6++) {
                    C7196afK c7196afKValues = c7190afE.values(i6);
                    if (c7196afKValues.OLrzqt()) {
                        sb.append(OLrzqt(cArr, c7196afKValues.OLrzqt, c7196afKValues.EZpvd, i & (-3)));
                    } else {
                        sb.append(KWHzl(cArr, c7196afKValues.OLrzqt, c7196afKValues.EZpvd, i));
                    }
                }
            } else {
                byte[] bArr = c7190afE.UeEOUB;
                for (int i7 = 0; i7 < iKWHzl; i7++) {
                    C7196afK c7196afKValues2 = c7190afE.values(i7);
                    int i8 = c7190afE.ffGIBT[i7].copydefault;
                    if (i8 < 0) {
                        i8 = 0;
                    }
                    if (c7196afKValues2.OLrzqt()) {
                        if (c7190afE.AkhnZx() && bArr[c7196afKValues2.OLrzqt] != 0) {
                            i8 |= 1;
                        }
                        char c = (i8 & 1) != 0 ? (char) 8206 : (i8 & 4) != 0 ? (char) 8207 : (char) 0;
                        if (c != 0) {
                            sb.append(c);
                        }
                        sb.append(OLrzqt(cArr, c7196afKValues2.OLrzqt, c7196afKValues2.EZpvd, i & (-3)));
                        if (c7190afE.AkhnZx() && bArr[c7196afKValues2.EZpvd - 1] != 0) {
                            i8 |= 2;
                        }
                        char c2 = (i8 & 2) != 0 ? (char) 8206 : (i8 & 8) != 0 ? (char) 8207 : (char) 0;
                        if (c2 != 0) {
                            sb.append(c2);
                        }
                    } else {
                        if (c7190afE.AkhnZx() && !c7190afE.KWHzl(8194, c7196afKValues2.EZpvd - 1)) {
                            i8 |= 4;
                        }
                        char c3 = (i8 & 1) != 0 ? (char) 8206 : (i8 & 4) != 0 ? (char) 8207 : (char) 0;
                        if (c3 != 0) {
                            sb.append(c3);
                        }
                        sb.append(KWHzl(cArr, c7196afKValues2.OLrzqt, c7196afKValues2.EZpvd, i));
                        if (c7190afE.AkhnZx() && (C7190afE.copydefault(bArr[c7196afKValues2.OLrzqt]) & 8194) == 0) {
                            i8 |= 8;
                        }
                        char c4 = (i8 & 2) != 0 ? (char) 8206 : (i8 & 8) != 0 ? (char) 8207 : (char) 0;
                        if (c4 != 0) {
                            sb.append(c4);
                        }
                    }
                }
            }
        } else if (i4 != 0) {
            byte[] bArr2 = c7190afE.UeEOUB;
            while (true) {
                iKWHzl--;
                if (iKWHzl < 0) {
                    break;
                }
                C7196afK c7196afKValues3 = c7190afE.values(iKWHzl);
                if (c7196afKValues3.OLrzqt()) {
                    if (bArr2[c7196afKValues3.EZpvd - 1] != 0) {
                        sb.append((char) 8206);
                    }
                    sb.append(KWHzl(cArr, c7196afKValues3.OLrzqt, c7196afKValues3.EZpvd, i & (-3)));
                    if (bArr2[c7196afKValues3.OLrzqt] != 0) {
                        sb.append((char) 8206);
                    }
                } else {
                    if ((C7190afE.copydefault(bArr2[c7196afKValues3.OLrzqt]) & 8194) == 0) {
                        sb.append((char) 8207);
                    }
                    sb.append(OLrzqt(cArr, c7196afKValues3.OLrzqt, c7196afKValues3.EZpvd, i));
                    if ((C7190afE.copydefault(bArr2[c7196afKValues3.EZpvd - 1]) & 8194) == 0) {
                        sb.append((char) 8207);
                    }
                }
            }
        } else {
            while (true) {
                iKWHzl--;
                if (iKWHzl < 0) {
                    break;
                }
                C7196afK c7196afKValues4 = c7190afE.values(iKWHzl);
                if (c7196afKValues4.OLrzqt()) {
                    sb.append(KWHzl(cArr, c7196afKValues4.OLrzqt, c7196afKValues4.EZpvd, i & (-3)));
                } else {
                    sb.append(OLrzqt(cArr, c7196afKValues4.OLrzqt, c7196afKValues4.EZpvd, i));
                }
            }
        }
        return sb.toString();
    }
}
