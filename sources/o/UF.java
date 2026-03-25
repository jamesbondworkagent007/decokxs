package o;

/* JADX INFO: loaded from: classes21.dex */
public abstract class UF extends UH {
    private boolean copydefault(char c) {
        return '0' <= c && c <= '9';
    }

    public abstract long EZpvd(java.lang.CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);

    public abstract long KWHzl();

    public abstract long OLrzqt();

    public abstract long copydefault();

    public abstract long copydefault(java.lang.CharSequence charSequence, int i, int i2, boolean z, long j, int i3, boolean z2, int i4);

    public final long EZpvd(java.lang.CharSequence charSequence, int i, int i2, int i3, boolean z, boolean z2) {
        char c;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j;
        boolean z3;
        int i9;
        int iEZpvd;
        int i10 = i3;
        int i11 = -1;
        int i12 = i;
        long j2 = 0;
        char cCharAt = 0;
        boolean z4 = false;
        while (true) {
            c = '.';
            if (i12 >= i10) {
                break;
            }
            cCharAt = charSequence.charAt(i12);
            if (!copydefault(cCharAt)) {
                if (cCharAt != '.') {
                    break;
                }
                z4 |= i11 >= 0;
                int i13 = i12;
                while (i13 < i10 - 8 && (iEZpvd = EZpvd(charSequence, i13 + 1)) >= 0) {
                    j2 = (j2 * 100000000) + ((long) iEZpvd);
                    i13 += 8;
                }
                int i14 = i12;
                i12 = i13;
                i11 = i14;
            } else {
                j2 = ((j2 * 10) + ((long) cCharAt)) - 48;
            }
            i12++;
        }
        if (i11 < 0) {
            i6 = i12 - i;
            i5 = i12;
            i4 = 0;
        } else {
            i4 = (i11 - i12) + 1;
            i5 = i11;
            i6 = (i12 - i) - 1;
        }
        if (cCharAt == 'e' || cCharAt == 'E') {
            i7 = i12 + 1;
            char cCharAt2 = i7 < i10 ? charSequence.charAt(i7) : (char) 0;
            boolean z5 = cCharAt2 == '-';
            if (z5 || cCharAt2 == '+') {
                i7 = i12 + 2;
                cCharAt2 = i7 < i10 ? charSequence.charAt(i7) : (char) 0;
            }
            z4 |= !copydefault(cCharAt2);
            i8 = 0;
            while (true) {
                if (i8 < 1024) {
                    i8 = ((i8 * 10) + cCharAt2) - 48;
                }
                i7++;
                cCharAt2 = i7 < i10 ? charSequence.charAt(i7) : (char) 0;
                if (!copydefault(cCharAt2)) {
                    break;
                }
                i10 = i3;
            }
            if (z5) {
                i8 = -i8;
            }
            i4 += i8;
            cCharAt = cCharAt2;
        } else {
            i7 = i12;
            i8 = 0;
        }
        if (i7 < i10 && (cCharAt == 'd' || cCharAt == 'D' || cCharAt == 'f' || cCharAt == 'F')) {
            i7++;
        }
        int iEZpvd2 = EZpvd(charSequence, i7, i10);
        if (z4 || iEZpvd2 < i10) {
            return -1L;
        }
        if (!z2 && i6 == 0) {
            return -1L;
        }
        if (i6 > 19) {
            int i15 = i;
            long j3 = 0;
            int i16 = 0;
            while (i15 < i12) {
                char cCharAt3 = charSequence.charAt(i15);
                if (cCharAt3 != c) {
                    if (java.lang.Long.compare(j3 ^ Long.MIN_VALUE, 1000000000000000000L ^ Long.MIN_VALUE) >= 0) {
                        break;
                    }
                    j3 = ((j3 * 10) + ((long) cCharAt3)) - 48;
                } else {
                    i16++;
                }
                i15++;
                c = '.';
            }
            z3 = i15 < i12;
            j = j3;
            i9 = (i5 - i15) + i16 + i8;
        } else {
            j = j2;
            z3 = false;
            i9 = 0;
        }
        return copydefault(charSequence, i2, i3, z, j, i4, z3, i9);
    }

    public long copydefault(java.lang.CharSequence charSequence, int i, int i2) {
        int iEZpvd;
        int i3;
        int i4 = i + i2;
        if (i < 0 || i4 > charSequence.length() || (iEZpvd = EZpvd(charSequence, i, i4)) == i4) {
            return -1L;
        }
        char cCharAt = charSequence.charAt(iEZpvd);
        boolean z = cCharAt == '-';
        if (z || cCharAt == '+') {
            iEZpvd++;
            cCharAt = iEZpvd < i4 ? charSequence.charAt(iEZpvd) : (char) 0;
            if (cCharAt == 0) {
                return -1L;
            }
        }
        if (cCharAt >= 'I') {
            if (cCharAt == 'N') {
                return OLrzqt(charSequence, iEZpvd, i4);
            }
            return KWHzl(charSequence, iEZpvd, i4, z);
        }
        boolean z2 = cCharAt == '0';
        if (z2) {
            int i5 = iEZpvd + 1;
            char cCharAt2 = i5 < i4 ? charSequence.charAt(i5) : (char) 0;
            if (cCharAt2 == 'x' || cCharAt2 == 'X') {
                return EZpvd(charSequence, iEZpvd + 2, i, i4, z);
            }
            i3 = i5;
        } else {
            i3 = iEZpvd;
        }
        return EZpvd(charSequence, i3, i, i4, z, z2);
    }

    public final long EZpvd(java.lang.CharSequence charSequence, int i, int i2, int i3, boolean z) {
        int iMin;
        long j;
        boolean z2;
        int i4;
        char cCharAt;
        int i5;
        int i6;
        long j2;
        int i7;
        boolean z3;
        int i8 = i;
        long j3 = 0;
        int i9 = -1;
        char cCharAt2 = 0;
        boolean z4 = false;
        while (true) {
            if (i8 >= i3) {
                break;
            }
            cCharAt2 = charSequence.charAt(i8);
            byte b = cCharAt2 > 127 ? (byte) -1 : UH.AEQbTJ[cCharAt2];
            if (b < 0) {
                if (b != -4) {
                    break;
                }
                z4 |= i9 >= 0;
                i9 = i8;
            } else {
                j3 = (j3 << 4) | ((long) b);
            }
            i8++;
        }
        int i10 = i8 - i;
        if (i9 < 0) {
            i9 = i8;
            iMin = 0;
        } else {
            i10--;
            iMin = java.lang.Math.min((i9 - i8) + 1, 1024) * 4;
        }
        boolean z5 = cCharAt2 == 'p' || cCharAt2 == 'P';
        if (z5) {
            i6 = i8 + 1;
            cCharAt = i6 < i3 ? charSequence.charAt(i6) : (char) 0;
            boolean z6 = cCharAt == '-';
            if (z6 || cCharAt == '+') {
                i6 = i8 + 2;
                cCharAt = i6 < i3 ? charSequence.charAt(i6) : (char) 0;
            }
            boolean zCopydefault = copydefault(cCharAt);
            j = j3;
            int i11 = 0;
            do {
                if (i11 < 1024) {
                    i11 = ((i11 * 10) + cCharAt) - 48;
                }
                z2 = true;
                i6++;
                cCharAt = i6 < i3 ? charSequence.charAt(i6) : (char) 0;
            } while (copydefault(cCharAt));
            if (z6) {
                i11 = -i11;
            }
            z4 |= !zCopydefault;
            i5 = i11;
            i4 = iMin + i11;
        } else {
            j = j3;
            z2 = true;
            i4 = iMin;
            cCharAt = cCharAt2;
            i5 = 0;
            i6 = i8;
        }
        if (i6 < i3 && (cCharAt == 'd' || cCharAt == 'D' || cCharAt == 'f' || cCharAt == 'F')) {
            i6++;
        }
        int iEZpvd = EZpvd(charSequence, i6, i3);
        if (z4 || iEZpvd < i3 || i10 == 0 || !z5) {
            return -1L;
        }
        if (i10 > 16) {
            int i12 = i;
            long j4 = 0;
            int i13 = 0;
            while (i12 < i8) {
                char cCharAt3 = charSequence.charAt(i12);
                byte b2 = cCharAt3 > 127 ? (byte) -1 : UH.AEQbTJ[cCharAt3];
                if (b2 < 0) {
                    i13++;
                } else {
                    if (java.lang.Long.compare(j4 ^ Long.MIN_VALUE, 1000000000000000000L ^ Long.MIN_VALUE) >= 0) {
                        break;
                    }
                    j4 = (j4 << 4) | ((long) b2);
                }
                i12++;
            }
            j2 = j4;
            z3 = i12 < i8 ? z2 : false;
            iEZpvd = i12;
            i7 = i13;
        } else {
            j2 = j;
            i7 = 0;
            z3 = false;
        }
        return EZpvd(charSequence, i2, i3, z, j2, i4, z3, (i9 - iEZpvd) + i7 + i5);
    }

    public final long KWHzl(java.lang.CharSequence charSequence, int i, int i2, boolean z) {
        int i3 = i + 7;
        if (i3 < i2 && charSequence.charAt(i) == 'I' && charSequence.charAt(i + 1) == 'n' && charSequence.charAt(i + 2) == 'f' && charSequence.charAt(i + 3) == 'i' && charSequence.charAt(i + 4) == 'n' && charSequence.charAt(i + 5) == 'i' && charSequence.charAt(i + 6) == 't' && charSequence.charAt(i3) == 'y' && EZpvd(charSequence, i + 8, i2) == i2) {
            return z ? OLrzqt() : KWHzl();
        }
        return -1L;
    }

    public final long OLrzqt(java.lang.CharSequence charSequence, int i, int i2) {
        int i3 = i + 2;
        if (i3 < i2 && charSequence.charAt(i + 1) == 'a' && charSequence.charAt(i3) == 'N' && EZpvd(charSequence, i + 3, i2) == i2) {
            return copydefault();
        }
        return -1L;
    }

    public final int EZpvd(java.lang.CharSequence charSequence, int i, int i2) {
        while (i < i2 && charSequence.charAt(i) <= ' ') {
            i++;
        }
        return i;
    }

    public final int EZpvd(java.lang.CharSequence charSequence, int i) {
        return UI.KWHzl(((long) charSequence.charAt(i)) | (((long) charSequence.charAt(i + 1)) << 16) | (((long) charSequence.charAt(i + 2)) << 32) | (((long) charSequence.charAt(i + 3)) << 48), (((long) charSequence.charAt(i + 7)) << 48) | (((long) charSequence.charAt(i + 5)) << 16) | ((long) charSequence.charAt(i + 4)) | (((long) charSequence.charAt(i + 6)) << 32));
    }
}
