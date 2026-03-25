package o;

import o.C7190afE;

/* JADX INFO: renamed from: o.afH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C7193afH {
    public static byte[] OLrzqt(C7190afE c7190afE) {
        int i = c7190afE.zuWLRA;
        int i2 = c7190afE.fvQaOB;
        if (i != i2) {
            java.util.Arrays.fill(c7190afE.giSNqX, i, i2, c7190afE.RlQdEF);
            c7190afE.zuWLRA = i2;
        }
        byte[] bArr = c7190afE.giSNqX;
        if (i2 >= bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }

    public static C7196afK OLrzqt(C7190afE c7190afE, int i) {
        int i2;
        C7196afK[] c7196afKArr = c7190afE.ffGIBT;
        C7196afK c7196afK = c7196afKArr[i];
        int i3 = c7196afK.OLrzqt;
        byte b = c7196afK.AEQbTJ;
        if (i > 0) {
            i2 = (c7196afK.EZpvd + i3) - c7196afKArr[i - 1].EZpvd;
        } else {
            i2 = i3 + c7196afKArr[0].EZpvd;
        }
        return new C7196afK(i3, i2, b);
    }

    public static void KWHzl(C7190afE c7190afE, byte b) {
        C7196afK[] c7196afKArr = c7190afE.OuxcSI;
        c7190afE.ffGIBT = c7196afKArr;
        c7190afE.ODWQjV = 1;
        c7196afKArr[0] = new C7196afK(0, c7190afE.fvQaOB, b);
    }

    /* JADX DEBUG: Duplicate block (B:35:0x0068) to fix multi-entry loop: BACK_EDGE: B:35:0x0068 -> B:33:0x005c */
    public static void OLrzqt(C7190afE c7190afE, byte b, byte b2) {
        int i;
        int i2;
        int i3;
        if (b2 <= (b | 1)) {
            return;
        }
        byte b3 = (byte) (b + 1);
        C7196afK[] c7196afKArr = c7190afE.ffGIBT;
        byte[] bArr = c7190afE.giSNqX;
        int i4 = c7190afE.ODWQjV;
        if (c7190afE.zuWLRA < c7190afE.fvQaOB) {
            i4--;
        }
        while (true) {
            b2 = (byte) (b2 - 1);
            i = 0;
            if (b2 < b3) {
                break;
            }
            while (true) {
                if (i < i4 && bArr[c7196afKArr[i].OLrzqt] < b2) {
                    i++;
                } else {
                    if (i >= i4) {
                        break;
                    }
                    int i5 = i;
                    while (true) {
                        i3 = i5 + 1;
                        if (i3 >= i4 || bArr[c7196afKArr[i3].OLrzqt] < b2) {
                            break;
                        } else {
                            i5 = i3;
                        }
                    }
                    for (int i6 = i5; i < i6; i6--) {
                        C7196afK c7196afK = c7196afKArr[i];
                        c7196afKArr[i] = c7196afKArr[i6];
                        c7196afKArr[i6] = c7196afK;
                        i++;
                    }
                    if (i3 == i4) {
                        break;
                    } else {
                        i = i5 + 2;
                    }
                }
            }
        }
        if ((b3 & 1) != 0) {
            return;
        }
        if (c7190afE.zuWLRA != c7190afE.fvQaOB) {
            i2 = i4 - 1;
            while (i < i2) {
                C7196afK c7196afK2 = c7196afKArr[i];
                c7196afKArr[i] = c7196afKArr[i2];
                c7196afKArr[i2] = c7196afK2;
                i++;
            }
            return;
        }
        i2--;
    }

    public static int EZpvd(C7190afE c7190afE, int i) {
        C7196afK[] c7196afKArr = c7190afE.ffGIBT;
        int i2 = c7190afE.ODWQjV;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            C7196afK c7196afK = c7196afKArr[i4];
            int i5 = c7196afK.EZpvd - i3;
            int i6 = c7196afK.OLrzqt;
            if (i >= i6 && i < i6 + i5) {
                return i4;
            }
            i3 += i5;
        }
        throw new java.lang.IllegalStateException("Internal ICU error in getRunFromLogicalIndex");
    }

    public static void copydefault(C7190afE c7190afE) {
        if (c7190afE.ODWQjV >= 0) {
            return;
        }
        if (c7190afE.RcXXUw != 2) {
            KWHzl(c7190afE, c7190afE.RlQdEF);
        } else {
            int i = c7190afE.fvQaOB;
            byte[] bArr = c7190afE.giSNqX;
            int i2 = c7190afE.zuWLRA;
            byte b = -1;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                byte b2 = bArr[i4];
                if (b2 != b) {
                    i3++;
                    b = b2;
                }
            }
            if (i3 == 1 && i2 == i) {
                KWHzl(c7190afE, bArr[0]);
            } else {
                if (i2 < i) {
                    i3++;
                }
                c7190afE.valueOf(i3);
                C7196afK[] c7196afKArr = c7190afE.DCUTEI;
                byte b3 = 126;
                int i5 = 0;
                byte b4 = 0;
                int i6 = 0;
                while (true) {
                    byte b5 = bArr[i5];
                    if (b5 < b3) {
                        b3 = b5;
                    }
                    int i7 = i5;
                    if (b5 > b4) {
                        b4 = b5;
                    }
                    do {
                        i7++;
                        if (i7 >= i2) {
                            break;
                        }
                    } while (bArr[i7] == b5);
                    c7196afKArr[i6] = new C7196afK(i5, i7 - i5, b5);
                    i6++;
                    if (i7 >= i2) {
                        break;
                    } else {
                        i5 = i7;
                    }
                }
                if (i2 < i) {
                    c7196afKArr[i6] = new C7196afK(i2, i - i2, c7190afE.RlQdEF);
                    byte b6 = c7190afE.RlQdEF;
                    if (b6 < b3) {
                        b3 = b6;
                    }
                }
                c7190afE.ffGIBT = c7196afKArr;
                c7190afE.ODWQjV = i3;
                OLrzqt(c7190afE, b3, b4);
                int i8 = 0;
                for (int i9 = 0; i9 < i3; i9++) {
                    C7196afK c7196afK = c7196afKArr[i9];
                    c7196afK.AEQbTJ = bArr[c7196afK.OLrzqt];
                    i8 += c7196afK.EZpvd;
                    c7196afK.EZpvd = i8;
                }
                if (i6 < i3) {
                    byte b7 = c7190afE.RlQdEF;
                    if ((b7 & 1) != 0) {
                        i6 = 0;
                    }
                    c7196afKArr[i6].AEQbTJ = b7;
                }
            }
        }
        if (c7190afE.fFgQHt.EZpvd > 0) {
            int i10 = 0;
            while (true) {
                C7190afE.Activity activity = c7190afE.fFgQHt;
                if (i10 >= activity.EZpvd) {
                    break;
                }
                C7190afE.Fragment fragment = activity.KWHzl[i10];
                C7196afK c7196afK2 = c7190afE.ffGIBT[EZpvd(c7190afE, fragment.OLrzqt)];
                c7196afK2.copydefault = fragment.copydefault | c7196afK2.copydefault;
                i10++;
            }
        }
        if (c7190afE.QbewEr > 0) {
            for (int i11 = 0; i11 < c7190afE.fvQaOB; i11++) {
                if (C7190afE.OLrzqt(c7190afE.getPostValueLengthLimit[i11])) {
                    c7190afE.ffGIBT[EZpvd(c7190afE, i11)].copydefault--;
                }
            }
        }
    }

    public static int[] KWHzl(C7190afE c7190afE) {
        int i;
        int i2;
        C7196afK[] c7196afKArr = c7190afE.ffGIBT;
        int i3 = c7190afE.fvQaOB;
        int i4 = c7190afE.DCJXGO;
        if (i3 <= i4) {
            i3 = i4;
        }
        int[] iArr = new int[i3];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            i = c7190afE.ODWQjV;
            if (i5 >= i) {
                break;
            }
            C7196afK c7196afK = c7196afKArr[i5];
            int i8 = c7196afK.OLrzqt;
            int i9 = c7196afK.EZpvd;
            if (c7196afK.OLrzqt()) {
                while (true) {
                    i2 = i7 + 1;
                    iArr[i7] = i8;
                    i6++;
                    if (i6 >= i9) {
                        break;
                    }
                    i8++;
                    i7 = i2;
                }
            } else {
                int i10 = i8 + (i9 - i6);
                while (true) {
                    i2 = i7 + 1;
                    i10--;
                    iArr[i7] = i10;
                    i6++;
                    if (i6 >= i9) {
                        break;
                    }
                    i7 = i2;
                }
            }
            i7 = i2;
            i5++;
        }
        if (c7190afE.fFgQHt.EZpvd > 0) {
            C7196afK[] c7196afKArr2 = c7190afE.ffGIBT;
            int i11 = 0;
            for (int i12 = 0; i12 < i; i12++) {
                int i13 = c7196afKArr2[i12].copydefault;
                if ((i13 & 5) > 0) {
                    i11++;
                }
                if ((i13 & 10) > 0) {
                    i11++;
                }
            }
            int i14 = c7190afE.DCJXGO;
            int i15 = i - 1;
            while (i15 >= 0 && i11 > 0) {
                C7196afK c7196afK2 = c7196afKArr2[i15];
                int i16 = c7196afK2.copydefault;
                if ((i16 & 10) > 0) {
                    i14--;
                    iArr[i14] = -1;
                    i11--;
                }
                int i17 = i15 > 0 ? c7196afKArr2[i15 - 1].EZpvd : 0;
                for (int i18 = c7196afK2.EZpvd - 1; i18 >= i17 && i11 > 0; i18--) {
                    i14--;
                    iArr[i14] = iArr[i18];
                }
                if ((i16 & 5) > 0) {
                    i14--;
                    iArr[i14] = -1;
                    i11--;
                }
                i15--;
            }
        } else if (c7190afE.QbewEr > 0) {
            C7196afK[] c7196afKArr3 = c7190afE.ffGIBT;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i19 < i) {
                C7196afK c7196afK3 = c7196afKArr3[i19];
                int i22 = c7196afK3.EZpvd;
                int i23 = i22 - i20;
                int i24 = c7196afK3.copydefault;
                if (i24 == 0 && i21 == i20) {
                    i21 += i23;
                } else if (i24 == 0) {
                    int i25 = i20;
                    while (i25 < i22) {
                        iArr[i21] = iArr[i25];
                        i25++;
                        i21++;
                    }
                } else {
                    int i26 = c7196afK3.OLrzqt;
                    boolean zOLrzqt = c7196afK3.OLrzqt();
                    for (int i27 = 0; i27 < i23; i27++) {
                        int i28 = zOLrzqt ? i26 + i27 : ((i26 + i23) - 1) - i27;
                        if (!C7190afE.OLrzqt(c7190afE.getPostValueLengthLimit[i28])) {
                            iArr[i21] = i28;
                            i21++;
                        }
                    }
                }
                i19++;
                i20 += i23;
            }
        }
        int i29 = c7190afE.DCJXGO;
        if (i3 == i29) {
            return iArr;
        }
        int[] iArr2 = new int[i29];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, i29);
        return iArr2;
    }
}
