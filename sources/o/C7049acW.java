package o;

/* JADX INFO: renamed from: o.acW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7049acW {
    public static int EZpvd(int i, int i2) {
        int i3;
        int i4 = 65535 & i2;
        if (i4 >= 4096) {
            i3 = -67044352;
        } else {
            if (i4 <= i) {
                if (i4 >= 3072) {
                    return 0;
                }
                return i2;
            }
            i3 = -458760;
        }
        return i3 & i2;
    }

    public static int EZpvd(int i, boolean z, int i2) {
        int i3;
        int i4;
        if (i2 > 65535) {
            int i5 = 65535 & i2;
            if (i5 >= 4096) {
                return (z ? 2031647 & i2 : i2 & 458759) + 2097184;
            }
            if (i5 > i) {
                int i6 = (i2 & 458759) + 2097184;
                return z ? i6 | 524296 : i6;
            }
        } else {
            if (i2 >= 4096) {
                if (z) {
                    i3 = (i2 & 31) + 32;
                    if ((i2 & 992) >= 384) {
                        i4 = 2621440;
                        return i4 | i3;
                    }
                    return i3;
                }
                i3 = (i2 & 7) + 32;
                if ((i2 & 992) >= 384) {
                    i4 = 2097152;
                    return i4 | i3;
                }
                return i3;
            }
            if (i2 > i) {
                int i7 = (i2 & 7) + 32;
                return z ? i7 | 8 : i7;
            }
            if (i2 < 3072) {
                return i2;
            }
        }
        return 0;
    }

    public static int OLrzqt(int i) {
        int i2 = i & 992;
        return i2 < 384 ? i2 + 32 : ((i2 + 32) << 16) | 192;
    }

    public static int copydefault(int i, int i2) {
        int i3;
        if (i2 > 65535) {
            if ((65535 & i2) <= i) {
                i3 = -458760;
                return i2 & i3;
            }
            return -67044352;
        }
        if (i2 >= 4096) {
            if ((i2 & 992) >= 384) {
                return -67044352;
            }
        } else if (i2 <= i) {
            if (i2 < 3072) {
                return i2;
            }
            i3 = 65528;
            return i2 & i3;
        }
        return 64512;
    }

    public static int copydefault(int i, boolean z, int i2) {
        if (i2 > 65535) {
            int i3 = 65535 & i2;
            if (i3 >= 4096) {
                return (z && ((-67108864) & i2) == 0) ? i2 & 24 : i2 & 1572888;
            }
            if (i3 > i) {
                return 524296;
            }
        } else {
            if (i2 >= 4096) {
                int i4 = i2 & 24;
                if (!z && (i2 & 992) >= 384) {
                    i4 |= 524288;
                }
                return i4;
            }
            if (i2 > i) {
                return 8;
            }
            if (i2 < 3072) {
                return i2;
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int AEQbTJ(C7048acV c7048acV, C7110ade c7110ade, char[] cArr) {
        char c;
        boolean z;
        int i;
        char c2;
        char[] cArr2 = c7048acV.djBIcL;
        if (cArr2 == null || cArr.length != 384) {
            return -1;
        }
        if ((c7110ade.OLrzqt & 12) == 0) {
            c = 3071;
        } else {
            char c3 = cArr2[0];
            int iGEmmrt = c7110ade.gEmmrt() + 1;
            if (iGEmmrt >= (c3 & 255)) {
                return -1;
            }
            c = cArr2[iGEmmrt];
        }
        if (c7110ade.AhwBna()) {
            long j = 0;
            long j2 = 0;
            long j3 = 0;
            long j4 = 0;
            for (int i2 = 4096; i2 < 4104; i2++) {
                long jCopydefault = c7110ade.copydefault(c7048acV.valueOf(i2));
                if (i2 == 4100) {
                    j4 = jCopydefault;
                    j3 = j;
                } else if (jCopydefault == 0) {
                    continue;
                } else {
                    if (jCopydefault < j) {
                        return -1;
                    }
                    if (j4 != 0 && j2 == 0 && j == j3) {
                        j2 = jCopydefault;
                    }
                    j = jCopydefault;
                }
            }
            long jCopydefault2 = c7110ade.copydefault(c7048acV.valueOf(25));
            if (jCopydefault2 < j) {
                return -1;
            }
            if (j2 == 0) {
                j2 = jCopydefault2;
            }
            z = j3 >= j4 || j4 >= j2;
        }
        char[] cArr3 = c7048acV.AhwBna;
        for (int i3 = 0; i3 < 384; i3++) {
            char c4 = cArr3[i3];
            if (c4 >= 4096) {
                c2 = 64512;
            } else if (c4 > c) {
                c2 = 65528;
            } else {
                i = 0;
                cArr[i3] = (char) i;
            }
            i = c4 & c2;
            cArr[i3] = (char) i;
        }
        if (z || (c7110ade.OLrzqt & 2) != 0) {
            for (int i4 = 48; i4 <= 57; i4++) {
                cArr[i4] = 0;
            }
        }
        return (c << 16) | c7110ade.OLrzqt;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:169:0x0208 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:223:0x029d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:276:0x032c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:327:0x0014 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:328:0x0014 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:330:0x00ec */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:332:0x0099 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:335:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:370:0x0243 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:386:0x02d8 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:401:0x0367 */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x02e0, code lost:
    
        r11 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x0370, code lost:
    
        if (r8 != 2) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0372, code lost:
    
        return 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v47, types: [int] */
    /* JADX WARN: Type inference failed for: r11v48 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v56 */
    /* JADX WARN: Type inference failed for: r11v57, types: [int] */
    /* JADX WARN: Type inference failed for: r11v58, types: [char] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int copydefault(char[] cArr, char[] cArr2, int i, java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, int i2) {
        int iEZpvd;
        int iEZpvd2;
        int i3;
        int iCopydefault;
        int iOLrzqt;
        int iOLrzqt2;
        char c;
        int i4;
        int iOLrzqt3;
        int i5;
        int iOLrzqt4;
        int i6;
        int iOLrzqt5;
        char c2;
        int i7 = i >> 16;
        int i8 = i & 65535;
        int i9 = i2;
        int i10 = i9;
        loop0: do {
            iEZpvd = 0;
            char cEZpvd = 0;
            while (true) {
                char c3 = '0';
                char c4 = '9';
                if (iEZpvd == 0) {
                    if (i9 == charSequence.length()) {
                        iEZpvd = 2;
                    } else {
                        int i11 = i9 + 1;
                        char cCharAt = charSequence.charAt(i9);
                        if (cCharAt <= 383) {
                            char c5 = cArr2[cCharAt];
                            if (c5 != 0) {
                                i9 = i11;
                                iEZpvd = c5;
                            } else {
                                if (cCharAt <= '9' && cCharAt >= '0' && (i & 2) != 0) {
                                    return -2;
                                }
                                iOLrzqt5 = cArr[cCharAt];
                            }
                        } else if (8192 <= cCharAt && cCharAt < 8256) {
                            iOLrzqt5 = cArr[cCharAt - 7808];
                        } else {
                            iOLrzqt5 = OLrzqt(cArr, cCharAt);
                        }
                        if (iOLrzqt5 >= 4096) {
                            c2 = 64512;
                        } else if (iOLrzqt5 > i7) {
                            c2 = 65528;
                        } else {
                            long jEZpvd = EZpvd(cArr, cCharAt, iOLrzqt5, charSequence, i11);
                            if (jEZpvd < 0) {
                                i9 += 2;
                                jEZpvd = ~jEZpvd;
                            } else {
                                i9 = i11;
                            }
                            int i12 = (int) jEZpvd;
                            if (i12 == 1) {
                                return -2;
                            }
                            iEZpvd = EZpvd(i7, i12);
                        }
                        int i13 = iOLrzqt5 & c2;
                        i9 = i11;
                        iEZpvd = i13;
                    }
                }
                while (true) {
                    if (cEZpvd != 0) {
                        break;
                    }
                    if (i10 == charSequence2.length()) {
                        cEZpvd = 2;
                        break;
                    }
                    i5 = i10 + 1;
                    char cCharAt2 = charSequence2.charAt(i10);
                    if (cCharAt2 <= 383) {
                        cEZpvd = cArr2[cCharAt2];
                        if (cEZpvd != 0) {
                            break;
                        }
                        if (cCharAt2 <= c4 && cCharAt2 >= c3 && (i & 2) != 0) {
                            return -2;
                        }
                        iOLrzqt4 = cArr[cCharAt2];
                    } else if (8192 <= cCharAt2 && cCharAt2 < 8256) {
                        iOLrzqt4 = cArr[cCharAt2 - 7808];
                    } else {
                        iOLrzqt4 = OLrzqt(cArr, cCharAt2);
                    }
                    if (iOLrzqt4 >= 4096) {
                        i6 = iOLrzqt4 & 64512;
                        break;
                    }
                    if (iOLrzqt4 > i7) {
                        i6 = iOLrzqt4 & 65528;
                        break;
                    }
                    long jEZpvd2 = EZpvd(cArr, cCharAt2, iOLrzqt4, charSequence2, i5);
                    if (jEZpvd2 < 0) {
                        i10 += 2;
                        jEZpvd2 = ~jEZpvd2;
                    } else {
                        i10 = i5;
                    }
                    int i14 = (int) jEZpvd2;
                    if (i14 == 1) {
                        return -2;
                    }
                    cEZpvd = EZpvd(i7, i14);
                    c3 = '0';
                    c4 = '9';
                }
                cEZpvd = i6;
                i10 = i5;
                if (iEZpvd == cEZpvd) {
                    break;
                }
                int i15 = iEZpvd & 65535;
                int i16 = cEZpvd & 65535;
                if (i15 != i16) {
                    return i15 < i16 ? -1 : 1;
                }
                if (iEZpvd == 2) {
                    break loop0;
                }
                iEZpvd >>>= 16;
                cEZpvd >>>= 16;
            }
        } while (iEZpvd != 2);
        if (C7110ade.AEQbTJ(i8) >= 1) {
            int i17 = i2;
            int i18 = i17;
            loop3: do {
                iOLrzqt = 0;
                int iOLrzqt6 = 0;
                while (true) {
                    if (iOLrzqt == 0) {
                        if (i17 == charSequence.length()) {
                            iOLrzqt = 2;
                        } else {
                            int i19 = i17 + 1;
                            char cCharAt3 = charSequence.charAt(i17);
                            if (cCharAt3 <= 383) {
                                iOLrzqt3 = cArr[cCharAt3];
                            } else if (8192 <= cCharAt3 && cCharAt3 < 8256) {
                                iOLrzqt3 = cArr[cCharAt3 - 7808];
                            } else {
                                iOLrzqt3 = OLrzqt(cArr, cCharAt3);
                            }
                            if (iOLrzqt3 >= 4096) {
                                iOLrzqt = OLrzqt(iOLrzqt3);
                                i17 = i19;
                            } else if (iOLrzqt3 > i7) {
                                i17 = i19;
                                iOLrzqt = 192;
                            } else {
                                long jEZpvd3 = EZpvd(cArr, cCharAt3, iOLrzqt3, charSequence, i19);
                                if (jEZpvd3 < 0) {
                                    i17 += 2;
                                    jEZpvd3 = ~jEZpvd3;
                                } else {
                                    i17 = i19;
                                }
                                iOLrzqt = AEQbTJ(i7, (int) jEZpvd3);
                            }
                        }
                    }
                    while (true) {
                        if (iOLrzqt6 != 0) {
                            break;
                        }
                        if (i18 == charSequence2.length()) {
                            iOLrzqt6 = 2;
                            break;
                        }
                        int i20 = i18 + 1;
                        char cCharAt4 = charSequence2.charAt(i18);
                        if (cCharAt4 <= 383) {
                            i4 = cArr[cCharAt4];
                            c = 4096;
                        } else {
                            if (8192 <= cCharAt4 && cCharAt4 < 8256) {
                                iOLrzqt2 = cArr[cCharAt4 - 7808];
                            } else {
                                iOLrzqt2 = OLrzqt(cArr, cCharAt4);
                            }
                            c = 4096;
                            i4 = iOLrzqt2;
                        }
                        if (i4 >= c) {
                            i18 = i20;
                            iOLrzqt6 = OLrzqt(i4);
                            break;
                        }
                        if (i4 > i7) {
                            i18 = i20;
                            iOLrzqt6 = 192;
                            break;
                        }
                        long jEZpvd4 = EZpvd(cArr, cCharAt4, i4, charSequence2, i20);
                        if (jEZpvd4 < 0) {
                            i18 += 2;
                            jEZpvd4 = ~jEZpvd4;
                        } else {
                            i18 = i20;
                        }
                        iOLrzqt6 = AEQbTJ(i7, (int) jEZpvd4);
                    }
                    if (iOLrzqt == iOLrzqt6) {
                        break;
                    }
                    int i21 = iOLrzqt & 65535;
                    int i22 = iOLrzqt6 & 65535;
                    if (i21 != i22) {
                        if ((i & 2048) != 0) {
                            return -2;
                        }
                        return i21 < i22 ? -1 : 1;
                    }
                    if (iOLrzqt == 2) {
                        break loop3;
                    }
                    iOLrzqt >>>= 16;
                    iOLrzqt6 >>>= 16;
                }
            } while (iOLrzqt != 2);
        }
        if ((i & 1024) != 0) {
            boolean z = C7110ade.AEQbTJ(i8) == 0;
            int i23 = i2;
            int i24 = i23;
            loop6: do {
                iCopydefault = 0;
                int iCopydefault2 = 0;
                while (true) {
                    if (iCopydefault == 0) {
                        if (i24 == charSequence.length()) {
                            iCopydefault = 2;
                        } else {
                            int i25 = i24 + 1;
                            char cCharAt5 = charSequence.charAt(i24);
                            int iOLrzqt7 = cCharAt5 <= 383 ? cArr[cCharAt5] : OLrzqt(cArr, cCharAt5);
                            if (iOLrzqt7 < 3072) {
                                long jEZpvd5 = EZpvd(cArr, cCharAt5, iOLrzqt7, charSequence, i25);
                                if (jEZpvd5 < 0) {
                                    i25 = i24 + 2;
                                    jEZpvd5 = ~jEZpvd5;
                                }
                                iOLrzqt7 = (int) jEZpvd5;
                            }
                            i24 = i25;
                            iCopydefault = copydefault(i7, z, iOLrzqt7);
                        }
                    }
                    while (true) {
                        if (iCopydefault2 != 0) {
                            break;
                        }
                        if (i23 == charSequence2.length()) {
                            iCopydefault2 = 2;
                            break;
                        }
                        int i26 = i23 + 1;
                        char cCharAt6 = charSequence2.charAt(i23);
                        int iOLrzqt8 = cCharAt6 <= 383 ? cArr[cCharAt6] : OLrzqt(cArr, cCharAt6);
                        if (iOLrzqt8 < 3072) {
                            long jEZpvd6 = EZpvd(cArr, cCharAt6, iOLrzqt8, charSequence2, i26);
                            if (jEZpvd6 < 0) {
                                i26 = i23 + 2;
                                jEZpvd6 = ~jEZpvd6;
                            }
                            iOLrzqt8 = (int) jEZpvd6;
                        }
                        i23 = i26;
                        iCopydefault2 = copydefault(i7, z, iOLrzqt8);
                    }
                    if (iCopydefault == iCopydefault2) {
                        break;
                    }
                    int i27 = iCopydefault & 65535;
                    int i28 = iCopydefault2 & 65535;
                    if (i27 != i28) {
                        return (i & 256) == 0 ? i27 < i28 ? -1 : 1 : i27 < i28 ? 1 : -1;
                    }
                    if (iCopydefault == 2) {
                        break loop6;
                    }
                    iCopydefault >>>= 16;
                    iCopydefault2 >>>= 16;
                }
            } while (iCopydefault != 2);
        }
        if (C7110ade.AEQbTJ(i8) <= 1) {
            return 0;
        }
        boolean zOLrzqt = C7110ade.OLrzqt(i8);
        int i29 = i2;
        int i30 = i29;
        loop9: do {
            iEZpvd2 = 0;
            int iEZpvd3 = 0;
            while (true) {
                if (iEZpvd2 == 0) {
                    if (i30 == charSequence.length()) {
                        iEZpvd2 = 2;
                    } else {
                        int i31 = i30 + 1;
                        char cCharAt7 = charSequence.charAt(i30);
                        int iOLrzqt9 = cCharAt7 <= 383 ? cArr[cCharAt7] : OLrzqt(cArr, cCharAt7);
                        if (iOLrzqt9 < 3072) {
                            long jEZpvd7 = EZpvd(cArr, cCharAt7, iOLrzqt9, charSequence, i31);
                            if (jEZpvd7 < 0) {
                                i31 = i30 + 2;
                                jEZpvd7 = ~jEZpvd7;
                            }
                            iOLrzqt9 = (int) jEZpvd7;
                        }
                        i30 = i31;
                        iEZpvd2 = EZpvd(i7, zOLrzqt, iOLrzqt9);
                    }
                }
                while (true) {
                    if (iEZpvd3 != 0) {
                        break;
                    }
                    if (i29 == charSequence2.length()) {
                        iEZpvd3 = 2;
                        break;
                    }
                    int i32 = i29 + 1;
                    char cCharAt8 = charSequence2.charAt(i29);
                    int iOLrzqt10 = cCharAt8 <= 383 ? cArr[cCharAt8] : OLrzqt(cArr, cCharAt8);
                    if (iOLrzqt10 < 3072) {
                        long jEZpvd8 = EZpvd(cArr, cCharAt8, iOLrzqt10, charSequence2, i32);
                        if (jEZpvd8 < 0) {
                            i32 = i29 + 2;
                            jEZpvd8 = ~jEZpvd8;
                        }
                        iOLrzqt10 = (int) jEZpvd8;
                    }
                    i29 = i32;
                    iEZpvd3 = EZpvd(i7, zOLrzqt, iOLrzqt10);
                }
                if (iEZpvd2 == iEZpvd3) {
                    break;
                }
                int i33 = iEZpvd2 & 65535;
                int i34 = iEZpvd3 & 65535;
                if (i33 != i34) {
                    if (C7110ade.copydefault(i8)) {
                        if (i33 > 3) {
                            i33 ^= 24;
                        }
                        if (i34 > 3) {
                            i34 ^= 24;
                        }
                    }
                    return i33 < i34 ? -1 : 1;
                }
                i3 = 2;
                if (iEZpvd2 == 2) {
                    break loop9;
                }
                iEZpvd2 >>>= 16;
                iEZpvd3 >>>= 16;
            }
        } while (iEZpvd2 != 2);
        if (C7110ade.AEQbTJ(i8) <= i3) {
            return 0;
        }
        int i35 = i2;
        int i36 = i35;
        while (true) {
            int i37 = i36;
            int iCopydefault3 = 0;
            int iCopydefault4 = 0;
            while (true) {
                if (iCopydefault4 == 0) {
                    if (i37 == charSequence.length()) {
                        iCopydefault4 = 2;
                    } else {
                        int i38 = i37 + 1;
                        char cCharAt9 = charSequence.charAt(i37);
                        int iOLrzqt11 = cCharAt9 <= 383 ? cArr[cCharAt9] : OLrzqt(cArr, cCharAt9);
                        if (iOLrzqt11 < 3072) {
                            long jEZpvd9 = EZpvd(cArr, cCharAt9, iOLrzqt11, charSequence, i38);
                            if (jEZpvd9 < 0) {
                                i38 = i37 + 2;
                                jEZpvd9 = ~jEZpvd9;
                            }
                            iOLrzqt11 = (int) jEZpvd9;
                        }
                        i37 = i38;
                        iCopydefault4 = copydefault(i7, iOLrzqt11);
                    }
                }
                while (true) {
                    if (iCopydefault3 != 0) {
                        break;
                    }
                    if (i35 == charSequence2.length()) {
                        iCopydefault3 = 2;
                        break;
                    }
                    int i39 = i35 + 1;
                    char cCharAt10 = charSequence2.charAt(i35);
                    int iOLrzqt12 = cCharAt10 <= 383 ? cArr[cCharAt10] : OLrzqt(cArr, cCharAt10);
                    if (iOLrzqt12 < 3072) {
                        long jEZpvd10 = EZpvd(cArr, cCharAt10, iOLrzqt12, charSequence2, i39);
                        if (jEZpvd10 < 0) {
                            i39 = i35 + 2;
                            jEZpvd10 = ~jEZpvd10;
                        }
                        iOLrzqt12 = (int) jEZpvd10;
                    }
                    i35 = i39;
                    iCopydefault3 = copydefault(i7, iOLrzqt12);
                }
                if (iCopydefault4 == iCopydefault3) {
                    break;
                }
                int i40 = iCopydefault4 & 65535;
                int i41 = iCopydefault3 & 65535;
                if (i40 != i41) {
                    return i40 < i41 ? -1 : 1;
                }
                if (iCopydefault4 == 2) {
                    return 0;
                }
                iCopydefault4 >>>= 16;
                iCopydefault3 >>>= 16;
            }
            i36 = i37;
        }
    }

    public static int OLrzqt(char[] cArr, int i) {
        if (8192 <= i && i < 8256) {
            return cArr[i - 7808];
        }
        if (i == 65534) {
            return 3;
        }
        return i == 65535 ? 64680 : 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long EZpvd(char[] cArr, int i, int i2, java.lang.CharSequence charSequence, int i3) {
        boolean z;
        int i4;
        if (i2 >= 3072 || i2 < 1024) {
            return i2;
        }
        if (i2 >= 2048) {
            int i5 = i2 & 1023;
            return ((long) cArr[i5 + 448]) | (((long) cArr[i5 + 449]) << 16);
        }
        int i6 = (i2 & 1023) + 448;
        if (i3 == charSequence.length()) {
            z = false;
        } else {
            int iCharAt = charSequence.charAt(i3);
            if (iCharAt > 383) {
                if (8192 <= iCharAt && iCharAt < 8256) {
                    iCharAt -= 7808;
                } else {
                    if (iCharAt != 65534 && iCharAt != 65535) {
                        return 1L;
                    }
                    iCharAt = -1;
                }
            }
            char c = cArr[i6];
            int i7 = i6;
            do {
                i7 += c >> '\t';
                c = cArr[i7];
                i4 = c & 511;
            } while (i4 < iCharAt);
            if (i4 == iCharAt) {
                i6 = i7;
                z = true;
            }
        }
        int i8 = cArr[i6] >> '\t';
        if (i8 == 1) {
            return 1L;
        }
        char c2 = cArr[i6 + 1];
        long j = i8 == 2 ? c2 : (((long) cArr[i6 + 2]) << 16) | ((long) c2);
        return z ? ~j : j;
    }

    public static int AEQbTJ(int i, int i2) {
        if (i2 > 65535) {
            int i3 = 65535 & i2;
            if (i3 >= 4096) {
                return 2097184 + (65012704 & i2);
            }
            if (i3 > i) {
                return 12583104;
            }
        } else {
            if (i2 >= 4096) {
                return OLrzqt(i2);
            }
            if (i2 > i) {
                return 192;
            }
            if (i2 < 3072) {
                return i2;
            }
        }
        return 0;
    }

    private C7049acW() {
    }
}
