package o;

import com.google.common.base.Ascii;

/* JADX INFO: loaded from: classes13.dex */
public final class yXZ {
    public static int AEQbTJ(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    public static int EZpvd(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    public static int KWHzl(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    public static boolean AEQbTJ(byte[] bArr) {
        return EZpvd(bArr, 0, bArr.length);
    }

    public static boolean EZpvd(byte[] bArr, int i, int i2) {
        return KWHzl(bArr, i, i2) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r7[r8] > (-65)) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0042, code lost:
    
        if (r7[r8] > (-65)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x007f, code lost:
    
        if (r7[r8] > (-65)) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int AEQbTJ(int i, byte[] bArr, int i2, int i3) {
        byte b;
        int i4;
        if (i != 0) {
            if (i2 >= i3) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i4 = i2 + 1;
                }
                return -1;
            }
            if (b2 < -16) {
                byte b3 = (byte) (~(i >> 8));
                if (b3 == 0) {
                    int i5 = i2 + 1;
                    byte b4 = bArr[i2];
                    if (i5 >= i3) {
                        return AEQbTJ(b2, b4);
                    }
                    i2 = i5;
                    b3 = b4;
                }
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    i4 = i2 + 1;
                }
                return -1;
            }
            byte b5 = (byte) (~(i >> 8));
            if (b5 == 0) {
                int i6 = i2 + 1;
                b5 = bArr[i2];
                if (i6 >= i3) {
                    return AEQbTJ(b2, b5);
                }
                i2 = i6;
                b = 0;
            } else {
                b = (byte) (i >> 16);
            }
            if (b == 0) {
                int i7 = i2 + 1;
                byte b6 = bArr[i2];
                if (i7 >= i3) {
                    return EZpvd(b2, b5, b6);
                }
                i2 = i7;
                b = b6;
            }
            if (b5 <= -65 && (((b2 << Ascii.FS) + (b5 + 112)) >> 30) == 0 && b <= -65) {
                i4 = i2 + 1;
            }
            return -1;
            i2 = i4;
        }
        return KWHzl(bArr, i2, i3);
    }

    public static int KWHzl(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        return copydefault(bArr, i, i2);
    }

    public static int copydefault(byte[] bArr, int i, int i2) {
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return -1;
                }
                if (b >= -16) {
                    if (i3 >= i2 - 2) {
                        return OLrzqt(bArr, i3, i2);
                    }
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && (((b << Ascii.FS) + (b2 + 112)) >> 30) == 0 && bArr[i + 2] <= -65) {
                        i3 = i + 4;
                        if (bArr[i + 3] > -65) {
                        }
                    }
                    return -1;
                }
                if (i3 >= i2 - 1) {
                    return OLrzqt(bArr, i3, i2);
                }
                byte b3 = bArr[i3];
                if (b3 <= -65 && ((b != -32 || b3 >= -96) && (b != -19 || b3 < -96))) {
                    i3 = i + 3;
                    if (bArr[i + 2] > -65) {
                    }
                }
                return -1;
            }
            i = i3;
        }
        return 0;
    }

    public static int OLrzqt(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return KWHzl(b);
        }
        if (i3 == 1) {
            return AEQbTJ(b, bArr[i]);
        }
        if (i3 == 2) {
            return EZpvd(b, bArr[i], bArr[i + 1]);
        }
        throw new java.lang.AssertionError();
    }
}
