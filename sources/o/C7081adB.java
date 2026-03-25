package o;

import o.C7083adD;
import o.C7086adG;

/* JADX INFO: renamed from: o.adB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C7081adB {
    public static boolean KWHzl = false;
    public final C7083adD AEQbTJ;
    public java.lang.String copydefault;

    public C7081adB(java.lang.String str, C7083adD c7083adD) {
        this.AEQbTJ = c7083adD;
        this.copydefault = str;
        if (str == null) {
            throw new java.lang.NullPointerException("localename is null");
        }
        if (c7083adD == null) {
            throw new java.lang.NullPointerException("data record is null");
        }
    }

    public boolean EZpvd() {
        return this.AEQbTJ.AEQbTJ;
    }

    public boolean copydefault() {
        return this.AEQbTJ.zuBGHE;
    }

    public int KWHzl() {
        return this.AEQbTJ.AxsJAY;
    }

    public boolean EZpvd(int i, int i2, java.lang.StringBuffer stringBuffer) {
        C7083adD.LoaderManager loaderManager;
        java.lang.String str;
        C7083adD.LoaderManager[] loaderManagerArr = this.AEQbTJ.zsXlph;
        if (loaderManagerArr == null || (loaderManager = loaderManagerArr[(i * 3) + i2]) == null || (str = loaderManager.EZpvd) == null) {
            return false;
        }
        stringBuffer.append(str);
        return loaderManager.copydefault;
    }

    public void KWHzl(int i, int i2, java.lang.StringBuffer stringBuffer) {
        C7083adD.LoaderManager loaderManager;
        java.lang.String str;
        C7083adD.LoaderManager[] loaderManagerArr = this.AEQbTJ.zsXlph;
        if (loaderManagerArr == null || (loaderManager = loaderManagerArr[(i * 3) + i2]) == null || (str = loaderManager.KWHzl) == null) {
            return;
        }
        if (KWHzl) {
            java.lang.System.out.println("appendSuffix '" + str + "'");
        }
        stringBuffer.append(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean copydefault(C7080adA c7080adA, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, java.lang.StringBuffer stringBuffer) {
        boolean z6;
        C7080adA c7080adA2;
        boolean z7;
        java.lang.String str;
        int i4;
        java.lang.String str2;
        int i5;
        java.lang.String str3;
        int iAEQbTJ;
        java.lang.String str4;
        java.lang.String[] strArr;
        C7083adD c7083adD;
        byte[] bArr;
        byte b;
        java.lang.String str5;
        java.lang.String str6;
        int i6 = i;
        int iAEQbTJ2 = c7080adA.AEQbTJ();
        C7083adD c7083adD2 = this.AEQbTJ;
        boolean[] zArr = c7083adD2.iwGUEr;
        boolean z8 = true;
        if (zArr == null || !zArr[iAEQbTJ2] || (str6 = c7083adD2.AubY) == null) {
            z6 = false;
        } else {
            if (!z5 && z4) {
                stringBuffer.append(str6);
            }
            z6 = true;
        }
        if (i3 != 0) {
            boolean z9 = i3 == 1;
            C7083adD c7083adD3 = this.AEQbTJ;
            java.lang.String[] strArr2 = z9 ? c7083adD3.isConnected : c7083adD3.AuCTelauCTel;
            if (strArr2 == null || strArr2[iAEQbTJ2] == null) {
                strArr2 = z9 ? this.AEQbTJ.AuCTelauCTel : this.AEQbTJ.isConnected;
            }
            if (strArr2 != null && (str5 = strArr2[iAEQbTJ2]) != null) {
                AEQbTJ(c7080adA, false, false, i, i2, z, str5, z4, stringBuffer);
                return false;
            }
        }
        int i7 = i2;
        if (i7 == 2 && (bArr = this.AEQbTJ.values) != null && ((b = bArr[iAEQbTJ2]) == 1 || (b == 2 && i6 <= 1000))) {
            i6 = (i6 / 500) * 500;
            i7 = 3;
        }
        int i8 = i7;
        if (z3 && z4) {
            c7080adA2 = c7080adA;
            z7 = true;
        } else {
            c7080adA2 = c7080adA;
            z7 = false;
        }
        int iEZpvd = EZpvd(c7080adA2, i6, i8, z7);
        if (iEZpvd == 4) {
            C7083adD c7083adD4 = this.AEQbTJ;
            java.lang.String[] strArr3 = c7083adD4.wlaJM;
            if (strArr3 == null) {
                str2 = c7083adD4.uzCIH[iAEQbTJ2][1];
                i4 = 1;
                if (str2 != null) {
                    str3 = this.AEQbTJ.uzCIH[iAEQbTJ2][0];
                    i5 = 0;
                } else {
                    i5 = i4;
                    str3 = str2;
                }
                if (i5 != 4 && i5 != 6) {
                    c7083adD = this.AEQbTJ;
                    if ((c7083adD.fARcdN || i5 != 1) && (!c7083adD.AuCTel || i5 != 2)) {
                    }
                }
                iAEQbTJ = AEQbTJ(c7080adA, z8, z2, i6, i8, z, str3, z4, stringBuffer);
                if (z4 && iAEQbTJ >= 0) {
                    C7083adD c7083adD5 = this.AEQbTJ;
                    java.lang.String[] strArr4 = c7083adD5.getFieldNames;
                    str4 = (strArr4 != null || iAEQbTJ >= strArr4.length) ? null : strArr4[iAEQbTJ];
                    if (str4 == null && (strArr = c7083adD5.fJNWhG) != null && iAEQbTJ < strArr.length) {
                        str4 = strArr[iAEQbTJ];
                    }
                    if (str4 != null) {
                        stringBuffer.append(str4);
                    }
                }
                return z6;
            }
            str = strArr3[iAEQbTJ2];
        } else if (iEZpvd == 5) {
            str = this.AEQbTJ.uzCIH[iAEQbTJ2][1];
        } else if (iEZpvd == 6) {
            str = this.AEQbTJ.AYXKKw[iAEQbTJ2];
        } else {
            try {
                str = this.AEQbTJ.uzCIH[iAEQbTJ2][iEZpvd];
            } catch (java.lang.NullPointerException e) {
                java.lang.System.out.println("Null Pointer in PeriodFormatterData[" + this.copydefault + "].au px: " + iAEQbTJ2 + " form: " + iEZpvd + " pn: " + java.util.Arrays.toString(this.AEQbTJ.uzCIH));
                throw e;
            }
        }
        java.lang.String str7 = str;
        i4 = iEZpvd;
        str2 = str7;
        if (str2 != null) {
        }
        if (i5 != 4) {
            c7083adD = this.AEQbTJ;
            z8 = c7083adD.fARcdN ? false : false;
        }
        iAEQbTJ = AEQbTJ(c7080adA, z8, z2, i6, i8, z, str3, z4, stringBuffer);
        if (z4) {
            C7083adD c7083adD52 = this.AEQbTJ;
            java.lang.String[] strArr42 = c7083adD52.getFieldNames;
            if (strArr42 != null) {
                if (str4 == null) {
                    str4 = strArr[iAEQbTJ];
                }
                if (str4 != null) {
                }
            }
        }
        return z6;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int AEQbTJ(C7080adA c7080adA, boolean z, boolean z2, int i, int i2, boolean z3, java.lang.String str, boolean z4, java.lang.StringBuffer stringBuffer) {
        java.lang.String str2;
        java.lang.String[] strArr;
        java.lang.String str3;
        C7083adD c7083adD;
        java.lang.String str4;
        java.lang.String[] strArr2;
        java.lang.String str5;
        int i3 = i2;
        if (i3 == 2 && this.AEQbTJ.DbNXlk == null) {
            i3 = 0;
        }
        if (!z && z2 && (str5 = this.AEQbTJ.OLrzqt) != null) {
            stringBuffer.append(str5);
        }
        int iAEQbTJ = c7080adA.AEQbTJ();
        if (i3 != 0) {
            if (i3 == 1) {
                int i4 = i / 1000;
                if (c7080adA == C7080adA.KWHzl && (((str4 = (c7083adD = this.AEQbTJ).djBIcL) != null || c7083adD.valueOf != null) && i4 != 0 && i4 % 5 == 0)) {
                    if (c7083adD.valueOf != null && (i4 == 15 || i4 == 45)) {
                        int i5 = i4 == 15 ? 1 : 3;
                        if (!z) {
                            OLrzqt(i5, 1, 10, stringBuffer);
                        }
                        str2 = this.AEQbTJ.valueOf;
                        iAEQbTJ = 8;
                    } else if (str4 != null) {
                        int i6 = i4 / 5;
                        if (!z) {
                            OLrzqt(i6, 1, 10, stringBuffer);
                        }
                        str2 = this.AEQbTJ.djBIcL;
                        iAEQbTJ = 9;
                    }
                    if (!z && z3) {
                        stringBuffer.append(this.AEQbTJ.EZpvd);
                    }
                    if (!z && (strArr = this.AEQbTJ.fetchVPNInfo) != null && iAEQbTJ < strArr.length && (str3 = strArr[iAEQbTJ]) != null) {
                        stringBuffer.append(str3);
                    }
                    stringBuffer.append(str2);
                    if (z4) {
                        return -1;
                    }
                    return iAEQbTJ;
                }
                if (!z) {
                    OLrzqt(i4, 1, 10, stringBuffer);
                }
            } else if (i3 != 2) {
                int i7 = i3 != 4 ? i3 != 5 ? 1 : 3 : 2;
                if (!z) {
                    AEQbTJ(i, 1, i7, stringBuffer);
                }
            } else {
                int i8 = i / 500;
                if (i8 != 1 && !z) {
                    AEQbTJ(i, 1, 0, stringBuffer);
                }
                if ((i8 & 1) == 1) {
                    if (i8 == 1 && (strArr2 = this.AEQbTJ.AYXKKw) != null && strArr2[iAEQbTJ] != null) {
                        stringBuffer.append(str);
                        if (z4) {
                            return iAEQbTJ;
                        }
                        return -1;
                    }
                    int i9 = i8 == 1 ? 0 : 1;
                    C7083adD c7083adD2 = this.AEQbTJ;
                    byte[] bArr = c7083adD2.AhwBna;
                    if (bArr != null && c7083adD2.DbNXlk.length > 2 && bArr[iAEQbTJ] == 1) {
                        i9 += 2;
                    }
                    byte[] bArr2 = c7083adD2.AkhnZx;
                    byte b = bArr2 != null ? bArr2[i9 & 1] : (byte) 0;
                    java.lang.String str6 = c7083adD2.DbNXlk[i9];
                    java.lang.String[] strArr3 = c7083adD2.fetchVPNInfo;
                    java.lang.String str7 = strArr3 == null ? null : strArr3[iAEQbTJ];
                    if (b == 0) {
                        stringBuffer.append(str6);
                    } else {
                        if (b == 1) {
                            if (str7 != null) {
                                stringBuffer.append(str7);
                                stringBuffer.append(str6);
                                if (z3 && !z) {
                                    stringBuffer.append(this.AEQbTJ.EZpvd);
                                }
                                stringBuffer.append(str);
                                return -1;
                            }
                            stringBuffer.append(str);
                            stringBuffer.append(str6);
                            if (z4) {
                                return iAEQbTJ;
                            }
                            return -1;
                        }
                        if (b == 2) {
                            if (str7 != null) {
                                stringBuffer.append(str7);
                            }
                            if (z3 && !z) {
                                stringBuffer.append(this.AEQbTJ.EZpvd);
                            }
                            stringBuffer.append(str);
                            stringBuffer.append(str6);
                            if (z4) {
                                return iAEQbTJ;
                            }
                            return -1;
                        }
                    }
                }
            }
        } else if (!z) {
            OLrzqt(i / 1000, 1, 10, stringBuffer);
        }
        str2 = str;
        if (!z) {
            stringBuffer.append(this.AEQbTJ.EZpvd);
        }
        if (!z) {
            stringBuffer.append(str3);
        }
        stringBuffer.append(str2);
        if (z4) {
        }
    }

    public void AEQbTJ(int i, int i2, int i3, java.lang.StringBuffer stringBuffer) {
        int i4 = i / 1000;
        if (i3 == 0) {
            OLrzqt(i4, i2, 10, stringBuffer);
            return;
        }
        if (this.AEQbTJ.hDKMBd && stringBuffer.length() > 0) {
            stringBuffer.append(' ');
        }
        KWHzl(i4, i2, 10, stringBuffer);
        int i5 = i % 1000;
        if (i3 == 1) {
            i5 /= 100;
        } else if (i3 == 2) {
            i5 /= 10;
        }
        stringBuffer.append(this.AEQbTJ.copydefault);
        KWHzl(i5, i3, i3, stringBuffer);
        if (this.AEQbTJ.hDKMBd) {
            stringBuffer.append(' ');
        }
    }

    public void OLrzqt(int i, int i2, int i3, java.lang.StringBuffer stringBuffer) {
        java.lang.String str;
        C7083adD c7083adD = this.AEQbTJ;
        java.lang.String[] strArr = c7083adD.ejfBZ;
        if (strArr != null && i < strArr.length && (str = strArr[i]) != null) {
            stringBuffer.append(str);
            return;
        }
        if (c7083adD.hDKMBd && stringBuffer.length() > 0) {
            stringBuffer.append(' ');
        }
        byte b = this.AEQbTJ.fIwbmz;
        if (b == 0) {
            KWHzl(i, i2, i3, stringBuffer);
        } else if (b == 1) {
            stringBuffer.append(C7086adG.KWHzl(i, C7086adG.TaskDescription.OLrzqt));
        } else if (b == 2) {
            stringBuffer.append(C7086adG.KWHzl(i, C7086adG.TaskDescription.AEQbTJ));
        } else if (b == 3) {
            stringBuffer.append(C7086adG.KWHzl(i, C7086adG.TaskDescription.EZpvd));
        }
        if (this.AEQbTJ.hDKMBd) {
            stringBuffer.append(' ');
        }
    }

    public void KWHzl(long j, int i, int i2, java.lang.StringBuffer stringBuffer) {
        char[] cArr = new char[i2];
        int i3 = i2;
        while (i3 > 0 && j > 0) {
            i3--;
            cArr[i3] = (char) (((long) this.AEQbTJ.AwvSrB) + (j % 10));
            j /= 10;
        }
        while (i3 > i2 - i) {
            i3--;
            cArr[i3] = this.AEQbTJ.AwvSrB;
        }
        stringBuffer.append(cArr, i3, i2 - i3);
    }

    public void OLrzqt(java.lang.StringBuffer stringBuffer) {
        java.lang.String str = this.AEQbTJ.AubY;
        if (str != null) {
            stringBuffer.append(str);
        }
    }

    public boolean KWHzl(C7080adA c7080adA, boolean z, boolean z2, boolean z3, java.lang.StringBuffer stringBuffer) {
        java.lang.String[] strArr;
        if ((z && this.AEQbTJ.sSMYrx != null) || this.AEQbTJ.zLjUOn != null) {
            if (z && (strArr = this.AEQbTJ.sSMYrx) != null) {
                int i = (z2 ? 2 : 0) + (z3 ? 1 : 0);
                stringBuffer.append(strArr[i]);
                boolean[] zArr = this.AEQbTJ.gHZMYf;
                return zArr != null && zArr[i];
            }
            stringBuffer.append(this.AEQbTJ.zLjUOn);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0099, code lost:
    
        if (r12 != 2) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0106, code lost:
    
        if (r13 != false) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int EZpvd(C7080adA c7080adA, int i, int i2, boolean z) {
        if (KWHzl) {
            java.lang.System.err.println("pfd.cf unit: " + c7080adA + " count: " + i + " cv: " + i2 + " dr.pl: " + ((int) this.AEQbTJ.getNewProxyInstance));
            java.lang.Thread.dumpStack();
        }
        C7083adD c7083adD = this.AEQbTJ;
        byte b = c7083adD.getNewProxyInstance;
        if (b == 0) {
            return 0;
        }
        int i3 = i / 1000;
        if (i2 != 0 && i2 != 1) {
            if (i2 == 2) {
                byte b2 = c7083adD.gEmmrt;
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        int i4 = i / 500;
                        if (i4 == 1) {
                            java.lang.String[] strArr = c7083adD.AYXKKw;
                            return (strArr == null || strArr[c7080adA.AEQbTJ()] == null) ? 5 : 6;
                        }
                        if ((i4 & 1) == 1) {
                            if (b == 5 && i4 > 21) {
                                return 5;
                            }
                            if (i4 == 3) {
                                if (b == 1) {
                                }
                            }
                        }
                    } else if (b2 == 3) {
                        int i5 = i / 500;
                        if (i5 == 1 || i5 == 3) {
                            return 3;
                        }
                    } else {
                        throw new java.lang.IllegalStateException();
                    }
                }
                return 0;
            }
            byte b3 = c7083adD.KWHzl;
            if (b3 == 1) {
                return 5;
            }
            if (b3 != 2) {
                if (b3 == 3 && b == 3) {
                    return 3;
                }
            } else if (i < 1000) {
                return 5;
            }
            return 0;
        }
        if (KWHzl && i == 0) {
            java.lang.System.err.println("EZeroHandling = " + ((int) this.AEQbTJ.QKVWgx));
        }
        if (i == 0 && this.AEQbTJ.QKVWgx == 1) {
            return 4;
        }
        byte b4 = this.AEQbTJ.getNewProxyInstance;
        if (b4 == 0) {
            return 0;
        }
        if (b4 != 1) {
            if (b4 == 2) {
                if (i3 != 2) {
                    if (i3 != 1) {
                        return 0;
                    }
                    return 1;
                }
                return 2;
            }
            if (b4 != 3) {
                if (b4 == 4) {
                    if (i3 != 2) {
                        if (i3 != 1) {
                            if (c7080adA != C7080adA.valueOf || i3 <= 11) {
                                return 0;
                            }
                            return 5;
                        }
                    }
                    return 2;
                }
                if (b4 == 5) {
                    if (i3 != 2) {
                        if (i3 != 1) {
                            if (i3 <= 10) {
                                return 0;
                            }
                            return 5;
                        }
                    }
                    return 2;
                }
                java.lang.System.err.println("dr.pl is " + ((int) this.AEQbTJ.getNewProxyInstance));
                throw new java.lang.IllegalStateException();
            }
            int i6 = i3 % 100;
            if (i6 > 20) {
                i6 %= 10;
            }
            if (i6 != 1) {
                return (i6 <= 1 || i6 >= 5) ? 0 : 3;
            }
            return 1;
        }
        if (i3 != 1) {
            return 0;
        }
        return 4;
    }
}
