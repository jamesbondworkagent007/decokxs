package o;

/* JADX INFO: loaded from: classes2.dex */
public class SP {
    public int copydefault;
    public static final float[] OLrzqt = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f, 9.9999998E10f, 1.0E12f, 9.9999998E12f, 1.0E14f, 9.9999999E14f, 1.00000003E16f, 9.9999998E16f, 9.9999998E17f, 1.0E19f, 1.0E20f, 1.0E21f, 1.0E22f, 1.0E23f, 1.0E24f, 1.0E25f, 1.0E26f, 1.0E27f, 1.0E28f, 1.0E29f, 1.0E30f, 1.0E31f, 1.0E32f, 1.0E33f, 1.0E34f, 1.0E35f, 1.0E36f, 1.0E37f, 1.0E38f};
    public static final float[] AEQbTJ = {1.0f, 0.1f, 0.01f, 0.001f, 1.0E-4f, 1.0E-5f, 1.0E-6f, 1.0E-7f, 1.0E-8f, 1.0E-9f, 1.0E-10f, 1.0E-11f, 1.0E-12f, 1.0E-13f, 1.0E-14f, 1.0E-15f, 1.0E-16f, 1.0E-17f, 1.0E-18f, 1.0E-19f, 1.0E-20f, 1.0E-21f, 1.0E-22f, 1.0E-23f, 1.0E-24f, 1.0E-25f, 1.0E-26f, 1.0E-27f, 1.0E-28f, 1.0E-29f, 1.0E-30f, 1.0E-31f, 1.0E-32f, 1.0E-33f, 1.0E-34f, 1.0E-35f, 1.0E-36f, 1.0E-37f, 1.0E-38f};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int KWHzl() {
        return this.copydefault;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x0102, code lost:
    
        if (r23.copydefault != r7) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0104, code lost:
    
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0105, code lost:
    
        if (r6 == false) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0107, code lost:
    
        r13 = r13 - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0109, code lost:
    
        r13 = r13 + r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x008b A[EDGE_INSN: B:110:0x008b->B:41:0x008b BREAK  A[LOOP:0: B:13:0x0032->B:40:0x0081], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float OLrzqt(java.lang.String str, int i, int i2) {
        boolean z;
        int i3;
        int i4;
        boolean z2;
        int i5;
        int i6;
        int i7;
        float f;
        char cCharAt;
        int i8;
        boolean z3;
        boolean z4;
        char cCharAt2;
        this.copydefault = i;
        if (i >= i2) {
            return Float.NaN;
        }
        char cCharAt3 = str.charAt(i);
        if (cCharAt3 == '+') {
            z = false;
        } else {
            if (cCharAt3 != '-') {
                z = false;
                int i9 = this.copydefault;
                long j = 0;
                i3 = 0;
                i4 = 0;
                int i10 = 0;
                z2 = false;
                int i11 = 0;
                while (true) {
                    i5 = this.copydefault;
                    if (i5 >= i2) {
                        break;
                    }
                    char cCharAt4 = str.charAt(i5);
                    if (cCharAt4 == '0') {
                        if (i3 == 0) {
                            i10++;
                        } else {
                            i4++;
                        }
                    } else if (cCharAt4 >= '1' && cCharAt4 <= '9') {
                        int i12 = i4;
                        while (i12 > 0) {
                            if (j > 922337203685477580L) {
                                return Float.NaN;
                            }
                            j *= 10;
                            i12--;
                        }
                        if (j > 922337203685477580L) {
                            return Float.NaN;
                        }
                        j = (j * 10) + ((long) (cCharAt4 - '0'));
                        i3 = i3 + i4 + 1;
                        if (j < 0) {
                            return Float.NaN;
                        }
                        i4 = i12;
                    } else {
                        if (cCharAt4 != '.' || z2) {
                            break;
                        }
                        i11 = this.copydefault - i9;
                        z2 = true;
                    }
                    this.copydefault++;
                }
                if (!z2 && this.copydefault == i11 + 1) {
                    return Float.NaN;
                }
                if (i3 == 0) {
                    if (i10 == 0) {
                        return Float.NaN;
                    }
                    i3 = 1;
                }
                if (z2) {
                    i4 = (i11 - i10) - i3;
                }
                i6 = this.copydefault;
                if (i6 < i2 && ((cCharAt = str.charAt(i6)) == 'E' || cCharAt == 'e')) {
                    i8 = this.copydefault + 1;
                    this.copydefault = i8;
                    if (i8 != i2) {
                        return Float.NaN;
                    }
                    char cCharAt5 = str.charAt(i8);
                    if (cCharAt5 == '+') {
                        z3 = false;
                    } else if (cCharAt5 != '-') {
                        switch (cCharAt5) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                z3 = false;
                                z4 = false;
                                break;
                            default:
                                this.copydefault--;
                                z4 = true;
                                z3 = false;
                                break;
                        }
                        if (!z4) {
                            int i13 = this.copydefault;
                            int i14 = 0;
                            while (true) {
                                int i15 = this.copydefault;
                                if (i15 < i2 && (cCharAt2 = str.charAt(i15)) >= '0' && cCharAt2 <= '9') {
                                    if (i14 > 922337203685477580L) {
                                        return Float.NaN;
                                    }
                                    i14 = (i14 * 10) + (cCharAt2 - '0');
                                    this.copydefault++;
                                }
                            }
                        }
                    } else {
                        z3 = true;
                    }
                    this.copydefault++;
                    z4 = false;
                    if (!z4) {
                    }
                }
                i7 = i3 + i4;
                if (i7 <= 39 || i7 < -44) {
                    return Float.NaN;
                }
                long j2 = j;
                float f2 = j2;
                if (j2 != 0) {
                    if (i4 > 0) {
                        f = OLrzqt[i4];
                    } else if (i4 < 0) {
                        if (i4 < -38) {
                            f2 = (float) (((double) f2) * 1.0E-20d);
                            i4 += 20;
                        }
                        f = AEQbTJ[-i4];
                    }
                    f2 *= f;
                }
                return z ? -f2 : f2;
            }
            z = true;
        }
        this.copydefault++;
        int i92 = this.copydefault;
        long j3 = 0;
        i3 = 0;
        i4 = 0;
        int i102 = 0;
        z2 = false;
        int i112 = 0;
        while (true) {
            i5 = this.copydefault;
            if (i5 >= i2) {
            }
            this.copydefault++;
        }
        if (!z2) {
        }
        if (i3 == 0) {
        }
        if (z2) {
        }
        i6 = this.copydefault;
        if (i6 < i2) {
            i8 = this.copydefault + 1;
            this.copydefault = i8;
            if (i8 != i2) {
            }
        }
        i7 = i3 + i4;
        if (i7 <= 39) {
        }
        return Float.NaN;
    }
}
