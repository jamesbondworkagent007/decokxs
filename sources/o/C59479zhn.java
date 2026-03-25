package o;

import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.common.base.Ascii;
import com.google.common.primitives.UnsignedBytes;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.Intrinsics;
import o.C59480zho;
import org.bouncycastle.crypto.hpke.HPKE;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zhn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C59479zhn {
    public static final int[] AEQbTJ;
    public static final int[] EZpvd;
    public static final long[] KWHzl;
    public static final int[] copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final int[] AEQbTJ() {
        return copydefault;
    }

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        copydefault = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        EZpvd = iArr2;
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        AEQbTJ = iArr3;
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        KWHzl = jArr;
    }

    public static final java.lang.String OLrzqt(@NotNull byte[] bArr, @NotNull C59480zho c59480zho) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(c59480zho, "");
        return AEQbTJ(bArr, 0, bArr.length, c59480zho);
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte[] bArr, C59480zho c59480zho, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c59480zho = C59480zho.EZpvd.OLrzqt();
        }
        return OLrzqt(bArr, c59480zho);
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte[] bArr, int i, int i2, C59480zho c59480zho, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            c59480zho = C59480zho.EZpvd.OLrzqt();
        }
        return AEQbTJ(bArr, i, i2, c59480zho);
    }

    public static final java.lang.String AEQbTJ(@NotNull byte[] bArr, int i, int i2, @NotNull C59480zho c59480zho) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(c59480zho, "");
        yDG.Companion.AEQbTJ(i, i2, bArr.length);
        if (i == i2) {
            return "";
        }
        int[] iArr = c59480zho.EZpvd() ? EZpvd : copydefault;
        C59480zho.Application applicationAEQbTJ = c59480zho.AEQbTJ();
        if (applicationAEQbTJ.AYXKKw()) {
            return KWHzl(bArr, i, i2, applicationAEQbTJ, iArr);
        }
        return copydefault(bArr, i, i2, applicationAEQbTJ, iArr);
    }

    public static final java.lang.String KWHzl(byte[] bArr, int i, int i2, C59480zho.Application application, int[] iArr) {
        if (application.valueOf()) {
            return AEQbTJ(bArr, i, i2, application, iArr);
        }
        return EZpvd(bArr, i, i2, application, iArr);
    }

    public static final java.lang.String AEQbTJ(byte[] bArr, int i, int i2, C59480zho.Application application, int[] iArr) {
        int length = application.OLrzqt().length();
        if (length > 1) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int i3 = i2 - i;
        int iAEQbTJ = 0;
        if (length == 0) {
            char[] cArr = new char[KWHzl(((long) i3) * 2)];
            while (i < i2) {
                iAEQbTJ = AEQbTJ(bArr, i, iArr, cArr, iAEQbTJ);
                i++;
            }
            return C59449zhJ.copydefault(cArr);
        }
        char[] cArr2 = new char[KWHzl((((long) i3) * 3) - 1)];
        char cCharAt = application.OLrzqt().charAt(0);
        int iAEQbTJ2 = AEQbTJ(bArr, i, iArr, cArr2, 0);
        for (int i4 = i + 1; i4 < i2; i4++) {
            cArr2[iAEQbTJ2] = cCharAt;
            iAEQbTJ2 = AEQbTJ(bArr, i4, iArr, cArr2, iAEQbTJ2 + 1);
        }
        return C59449zhJ.copydefault(cArr2);
    }

    public static final java.lang.String EZpvd(byte[] bArr, int i, int i2, C59480zho.Application application, int[] iArr) {
        java.lang.String strKWHzl = application.KWHzl();
        java.lang.String strAEQbTJ = application.AEQbTJ();
        java.lang.String strOLrzqt = application.OLrzqt();
        char[] cArr = new char[KWHzl(i2 - i, strOLrzqt.length(), strKWHzl.length(), strAEQbTJ.length())];
        int iKWHzl = KWHzl(bArr, i, strKWHzl, strAEQbTJ, iArr, cArr, 0);
        while (true) {
            i++;
            if (i < i2) {
                iKWHzl = KWHzl(bArr, i, strKWHzl, strAEQbTJ, iArr, cArr, AEQbTJ(strOLrzqt, cArr, iKWHzl));
            } else {
                return C59449zhJ.copydefault(cArr);
            }
        }
    }

    public static final java.lang.String copydefault(byte[] bArr, int i, int i2, C59480zho.Application application, int[] iArr) {
        int i3;
        int i4;
        int iGEmmrt = application.gEmmrt();
        int iEZpvd = application.EZpvd();
        java.lang.String strKWHzl = application.KWHzl();
        java.lang.String strAEQbTJ = application.AEQbTJ();
        java.lang.String strOLrzqt = application.OLrzqt();
        java.lang.String strAhwBna = application.AhwBna();
        int iKWHzl = KWHzl(i2 - i, iGEmmrt, iEZpvd, strAhwBna.length(), strOLrzqt.length(), strKWHzl.length(), strAEQbTJ.length());
        char[] cArr = new char[iKWHzl];
        int iAEQbTJ = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = i; i7 < i2; i7++) {
            if (i5 == iGEmmrt) {
                cArr[iAEQbTJ] = '\n';
                iAEQbTJ++;
                i3 = 0;
                i4 = 0;
            } else if (i6 == iEZpvd) {
                iAEQbTJ = AEQbTJ(strAhwBna, cArr, iAEQbTJ);
                i3 = i5;
                i4 = 0;
            } else {
                i3 = i5;
                i4 = i6;
            }
            if (i4 != 0) {
                iAEQbTJ = AEQbTJ(strOLrzqt, cArr, iAEQbTJ);
            }
            iAEQbTJ = KWHzl(bArr, i7, strKWHzl, strAEQbTJ, iArr, cArr, iAEQbTJ);
            i6 = i4 + 1;
            i5 = i3 + 1;
        }
        if (iAEQbTJ != iKWHzl) {
            throw new java.lang.IllegalStateException("Check failed.");
        }
        return C59449zhJ.copydefault(cArr);
    }

    public static final int KWHzl(byte[] bArr, int i, java.lang.String str, java.lang.String str2, int[] iArr, char[] cArr, int i2) {
        return AEQbTJ(str2, cArr, AEQbTJ(bArr, i, iArr, cArr, AEQbTJ(str, cArr, i2)));
    }

    public static final int AEQbTJ(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & UnsignedBytes.MAX_VALUE];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & 255);
        return i2 + 2;
    }

    public static final int KWHzl(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        long j = i2;
        return KWHzl((((long) i) * (((((long) i3) + 2) + ((long) i4)) + j)) - j);
    }

    public static final int KWHzl(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int i8 = i - 1;
        int i9 = i8 / i2;
        int i10 = (i2 - 1) / i3;
        int i11 = i % i2;
        if (i11 == 0) {
            i11 = i2;
        }
        int i12 = (i10 * i9) + ((i11 - 1) / i3);
        return KWHzl(((long) i9) + (((long) i12) * ((long) i4)) + (((long) ((i8 - i9) - i12)) * ((long) i5)) + (((long) i) * (((long) i6) + 2 + ((long) i7))));
    }

    public static final int KWHzl(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        throw new java.lang.IllegalArgumentException("The resulting string length is too big: " + ((java.lang.Object) C56396yDv.EZpvd(C56396yDv.copydefault(j))));
    }

    public static final byte[] KWHzl(@NotNull java.lang.String str, @NotNull C59480zho c59480zho) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c59480zho, "");
        return OLrzqt(str, 0, str.length(), c59480zho);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(java.lang.String str, C59480zho c59480zho, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c59480zho = C59480zho.EZpvd.OLrzqt();
        }
        return KWHzl(str, c59480zho);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(java.lang.String str, int i, int i2, C59480zho c59480zho, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            c59480zho = C59480zho.EZpvd.OLrzqt();
        }
        return OLrzqt(str, i, i2, c59480zho);
    }

    public static final byte[] OLrzqt(java.lang.String str, int i, int i2, C59480zho c59480zho) {
        byte[] bArrAEQbTJ;
        yDG.Companion.AEQbTJ(i, i2, str.length());
        if (i == i2) {
            return new byte[0];
        }
        C59480zho.Application applicationAEQbTJ = c59480zho.AEQbTJ();
        return (!applicationAEQbTJ.AYXKKw() || (bArrAEQbTJ = AEQbTJ(str, i, i2, applicationAEQbTJ)) == null) ? OLrzqt(str, i, i2, applicationAEQbTJ) : bArrAEQbTJ;
    }

    public static final byte[] AEQbTJ(java.lang.String str, int i, int i2, C59480zho.Application application) {
        if (application.valueOf()) {
            return EZpvd(str, i, i2, application);
        }
        return copydefault(str, i, i2, application);
    }

    public static final byte[] EZpvd(java.lang.String str, int i, int i2, C59480zho.Application application) {
        int length = application.OLrzqt().length();
        if (length > 1) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int i3 = i2 - i;
        int i4 = 2;
        if (length == 0) {
            if ((i3 & 1) != 0) {
                return null;
            }
            int i5 = i3 >> 1;
            byte[] bArr = new byte[i5];
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                bArr[i7] = copydefault(str, i6);
                i6 += 2;
            }
            return bArr;
        }
        if (i3 % 3 != 2) {
            return null;
        }
        int i8 = (i3 / 3) + 1;
        byte[] bArr2 = new byte[i8];
        char cCharAt = application.OLrzqt().charAt(0);
        bArr2[0] = copydefault(str, 0);
        for (int i9 = 1; i9 < i8; i9++) {
            if (str.charAt(i4) != cCharAt) {
                java.lang.String strOLrzqt = application.OLrzqt();
                boolean zDjBIcL = application.djBIcL();
                if (strOLrzqt.length() != 0) {
                    int length2 = strOLrzqt.length();
                    for (int i10 = 0; i10 < length2; i10++) {
                        if (!C59475zhj.OLrzqt(strOLrzqt.charAt(i10), str.charAt(i4 + i10), zDjBIcL)) {
                            KWHzl(str, i4, i2, strOLrzqt, "byte separator");
                        }
                    }
                    strOLrzqt.length();
                }
            }
            bArr2[i9] = copydefault(str, i4 + 1);
            i4 += 3;
        }
        return bArr2;
    }

    public static final byte[] copydefault(java.lang.String str, int i, int i2, C59480zho.Application application) {
        java.lang.String strKWHzl = application.KWHzl();
        java.lang.String strAEQbTJ = application.AEQbTJ();
        java.lang.String strOLrzqt = application.OLrzqt();
        long length = strOLrzqt.length();
        long length2 = ((long) strKWHzl.length()) + 2 + ((long) strAEQbTJ.length()) + length;
        long j = i2 - i;
        int i3 = (int) ((j + length) / length2);
        if ((((long) i3) * length2) - length != j) {
            return null;
        }
        boolean zDjBIcL = application.djBIcL();
        byte[] bArr = new byte[i3];
        if (strKWHzl.length() != 0) {
            int length3 = strKWHzl.length();
            for (int i4 = 0; i4 < length3; i4++) {
                if (!C59475zhj.OLrzqt(strKWHzl.charAt(i4), str.charAt(i + i4), zDjBIcL)) {
                    KWHzl(str, i, i2, strKWHzl, "byte prefix");
                }
            }
            i += strKWHzl.length();
        }
        java.lang.String str2 = strAEQbTJ + strOLrzqt + strKWHzl;
        int i5 = i3 - 1;
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i6] = copydefault(str, i);
            i += 2;
            if (str2.length() != 0) {
                int length4 = str2.length();
                for (int i7 = 0; i7 < length4; i7++) {
                    if (!C59475zhj.OLrzqt(str2.charAt(i7), str.charAt(i + i7), zDjBIcL)) {
                        KWHzl(str, i, i2, str2, "byte suffix + byte separator + byte prefix");
                    }
                }
                i += str2.length();
            }
        }
        bArr[i5] = copydefault(str, i);
        int i8 = i + 2;
        if (strAEQbTJ.length() != 0) {
            int length5 = strAEQbTJ.length();
            for (int i9 = 0; i9 < length5; i9++) {
                if (!C59475zhj.OLrzqt(strAEQbTJ.charAt(i9), str.charAt(i8 + i9), zDjBIcL)) {
                    KWHzl(str, i8, i2, strAEQbTJ, "byte suffix");
                }
            }
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final byte[] OLrzqt(java.lang.String str, int i, int i2, C59480zho.Application application) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int iGEmmrt = application.gEmmrt();
        int iEZpvd = application.EZpvd();
        java.lang.String strKWHzl = application.KWHzl();
        java.lang.String strAEQbTJ = application.AEQbTJ();
        java.lang.String strOLrzqt = application.OLrzqt();
        java.lang.String strAhwBna = application.AhwBna();
        boolean zDjBIcL = application.djBIcL();
        int iAEQbTJ = AEQbTJ(i2 - i, iGEmmrt, iEZpvd, strAhwBna.length(), strOLrzqt.length(), strKWHzl.length(), strAEQbTJ.length());
        byte[] bArr = new byte[iAEQbTJ];
        int length = i;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (length < i2) {
            if (i10 == iGEmmrt) {
                length = KWHzl(str, length, i2);
                i3 = 0;
            } else if (i11 == iEZpvd) {
                if (strAhwBna.length() == 0) {
                    i5 = i10;
                } else {
                    int length2 = strAhwBna.length();
                    int i12 = 0;
                    while (i12 < length2) {
                        int i13 = i10;
                        int i14 = length2;
                        if (!C59475zhj.OLrzqt(strAhwBna.charAt(i12), str.charAt(length + i12), zDjBIcL)) {
                            KWHzl(str, length, i2, strAhwBna, "group separator");
                        }
                        i12++;
                        i10 = i13;
                        length2 = i14;
                    }
                    i5 = i10;
                    length += strAhwBna.length();
                }
                i3 = i5;
            } else {
                int i15 = i10;
                if (i11 != 0) {
                    if (strOLrzqt.length() == 0) {
                        i4 = i11;
                    } else {
                        int length3 = strOLrzqt.length();
                        int i16 = 0;
                        while (i16 < length3) {
                            int i17 = length3;
                            int i18 = i11;
                            if (!C59475zhj.OLrzqt(strOLrzqt.charAt(i16), str.charAt(length + i16), zDjBIcL)) {
                                KWHzl(str, length, i2, strOLrzqt, "byte separator");
                            }
                            i16++;
                            length3 = i17;
                            i11 = i18;
                        }
                        i4 = i11;
                        length += strOLrzqt.length();
                    }
                    i3 = i15;
                    i11 = i4;
                } else {
                    i3 = i15;
                }
                int i19 = i3 + 1;
                int i20 = i11 + 1;
                if (strKWHzl.length() != 0) {
                    i6 = i19;
                    i7 = i20;
                } else {
                    int length4 = strKWHzl.length();
                    i6 = i19;
                    int i21 = 0;
                    while (i21 < length4) {
                        int i22 = length4;
                        int i23 = i20;
                        if (!C59475zhj.OLrzqt(strKWHzl.charAt(i21), str.charAt(length + i21), zDjBIcL)) {
                            KWHzl(str, length, i2, strKWHzl, "byte prefix");
                        }
                        i21++;
                        length4 = i22;
                        i20 = i23;
                    }
                    i7 = i20;
                    length += strKWHzl.length();
                }
                if (i2 - 2 < length) {
                    AEQbTJ(str, length, i2, "exactly", 2);
                }
                int i24 = i9 + 1;
                bArr[i9] = copydefault(str, length);
                length += 2;
                if (strAEQbTJ.length() != 0) {
                    i8 = i24;
                } else {
                    int length5 = strAEQbTJ.length();
                    int i25 = 0;
                    while (i25 < length5) {
                        int i26 = i24;
                        if (!C59475zhj.OLrzqt(strAEQbTJ.charAt(i25), str.charAt(length + i25), zDjBIcL)) {
                            KWHzl(str, length, i2, strAEQbTJ, "byte suffix");
                        }
                        i25++;
                        i24 = i26;
                    }
                    i8 = i24;
                    length += strAEQbTJ.length();
                }
                i10 = i6;
                i9 = i8;
                i11 = i7;
            }
            i11 = 0;
            int i192 = i3 + 1;
            int i202 = i11 + 1;
            if (strKWHzl.length() != 0) {
            }
            if (i2 - 2 < length) {
            }
            int i242 = i9 + 1;
            bArr[i9] = copydefault(str, length);
            length += 2;
            if (strAEQbTJ.length() != 0) {
            }
            i10 = i6;
            i9 = i8;
            i11 = i7;
        }
        if (i9 == iAEQbTJ) {
            return bArr;
        }
        byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, i9);
        Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
        return bArrCopyOf;
    }

    public static final int AEQbTJ(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long jOLrzqt;
        int i8;
        int i9;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        long j = ((long) i6) + 2 + ((long) i7);
        long jOLrzqt2 = OLrzqt(j, i3, i5);
        if (i2 <= i3) {
            jOLrzqt = OLrzqt(j, i2, i5);
        } else {
            jOLrzqt = OLrzqt(jOLrzqt2, i2 / i3, i4);
            int i10 = i2 % i3;
            if (i10 != 0) {
                jOLrzqt = jOLrzqt + ((long) i4) + OLrzqt(j, i10, i5);
            }
        }
        long j2 = i;
        long jOLrzqt3 = OLrzqt(j2, jOLrzqt, 1);
        long j3 = j2 - ((jOLrzqt + 1) * jOLrzqt3);
        long jOLrzqt4 = OLrzqt(j3, jOLrzqt2, i4);
        long j4 = j3 - ((jOLrzqt2 + ((long) i4)) * jOLrzqt4);
        long jOLrzqt5 = OLrzqt(j4, j, i5);
        if (j4 - ((j + ((long) i5)) * jOLrzqt5) > 0) {
            i9 = i2;
            i8 = 1;
        } else {
            i8 = 0;
            i9 = i2;
        }
        return (int) ((jOLrzqt3 * ((long) i9)) + (jOLrzqt4 * ((long) i3)) + jOLrzqt5 + ((long) i8));
    }

    public static final long OLrzqt(long j, int i, int i2) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        long j2 = i;
        return (j * j2) + (((long) i2) * (j2 - 1));
    }

    public static final long OLrzqt(long j, long j2, int i) {
        if (j <= 0 || j2 <= 0) {
            return 0L;
        }
        long j3 = i;
        return (j + j3) / (j2 + j3);
    }

    public static final int KWHzl(java.lang.String str, int i, int i2) {
        if (str.charAt(i) == '\r') {
            int i3 = i + 1;
            return (i3 >= i2 || str.charAt(i3) != '\n') ? i3 : i + 2;
        }
        if (str.charAt(i) == '\n') {
            return i + 1;
        }
        throw new java.lang.NumberFormatException("Expected a new line at index " + i + ", but was " + str.charAt(i));
    }

    public static /* synthetic */ java.lang.String toHexString$default(byte b, C59480zho c59480zho, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c59480zho = C59480zho.EZpvd.OLrzqt();
        }
        return copydefault(b, c59480zho);
    }

    public static final java.lang.String copydefault(byte b, @NotNull C59480zho c59480zho) {
        Intrinsics.checkNotNullParameter(c59480zho, "");
        java.lang.String str = c59480zho.EZpvd() ? "0123456789ABCDEF" : "0123456789abcdef";
        C59480zho.ActionBar actionBarCopydefault = c59480zho.copydefault();
        if (actionBarCopydefault.djBIcL()) {
            char[] cArr = {str.charAt((b >> 4) & 15), str.charAt(b & Ascii.SI)};
            if (actionBarCopydefault.copydefault()) {
                return C59449zhJ.concatToString$default(cArr, C56548yJl.valueOf((java.lang.Integer.numberOfLeadingZeros(b & UnsignedBytes.MAX_VALUE) - 24) >> 2, 1), 0, 2, null);
            }
            return C59449zhJ.copydefault(cArr);
        }
        return KWHzl(b, actionBarCopydefault, str, 8);
    }

    public static final byte OLrzqt(@NotNull java.lang.String str, @NotNull C59480zho c59480zho) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c59480zho, "");
        return copydefault(str, 0, str.length(), c59480zho);
    }

    public static /* synthetic */ byte hexToByte$default(java.lang.String str, C59480zho c59480zho, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c59480zho = C59480zho.EZpvd.OLrzqt();
        }
        return OLrzqt(str, c59480zho);
    }

    public static /* synthetic */ byte hexToByte$default(java.lang.String str, int i, int i2, C59480zho c59480zho, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            c59480zho = C59480zho.EZpvd.OLrzqt();
        }
        return copydefault(str, i, i2, c59480zho);
    }

    public static final byte copydefault(java.lang.String str, int i, int i2, C59480zho c59480zho) {
        return (byte) KWHzl(str, i, i2, c59480zho, 2);
    }

    public static /* synthetic */ java.lang.String toHexString$default(short s, C59480zho c59480zho, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c59480zho = C59480zho.EZpvd.OLrzqt();
        }
        return KWHzl(s, c59480zho);
    }

    public static final java.lang.String KWHzl(short s, @NotNull C59480zho c59480zho) {
        Intrinsics.checkNotNullParameter(c59480zho, "");
        java.lang.String str = c59480zho.EZpvd() ? "0123456789ABCDEF" : "0123456789abcdef";
        C59480zho.ActionBar actionBarCopydefault = c59480zho.copydefault();
        if (actionBarCopydefault.djBIcL()) {
            char[] cArr = {str.charAt((s >> 12) & 15), str.charAt((s >> 8) & 15), str.charAt((s >> 4) & 15), str.charAt(s & 15)};
            if (actionBarCopydefault.copydefault()) {
                return C59449zhJ.concatToString$default(cArr, C56548yJl.valueOf((java.lang.Integer.numberOfLeadingZeros(s & HPKE.aead_EXPORT_ONLY) - 16) >> 2, 3), 0, 2, null);
            }
            return C59449zhJ.copydefault(cArr);
        }
        return KWHzl(s, actionBarCopydefault, str, 16);
    }

    public static final short AEQbTJ(@NotNull java.lang.String str, @NotNull C59480zho c59480zho) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c59480zho, "");
        return EZpvd(str, 0, str.length(), c59480zho);
    }

    public static /* synthetic */ short hexToShort$default(java.lang.String str, C59480zho c59480zho, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c59480zho = C59480zho.EZpvd.OLrzqt();
        }
        return AEQbTJ(str, c59480zho);
    }

    public static /* synthetic */ short hexToShort$default(java.lang.String str, int i, int i2, C59480zho c59480zho, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            c59480zho = C59480zho.EZpvd.OLrzqt();
        }
        return EZpvd(str, i, i2, c59480zho);
    }

    public static final short EZpvd(java.lang.String str, int i, int i2, C59480zho c59480zho) {
        return (short) KWHzl(str, i, i2, c59480zho, 4);
    }

    public static /* synthetic */ java.lang.String toHexString$default(int i, C59480zho c59480zho, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            c59480zho = C59480zho.EZpvd.OLrzqt();
        }
        return OLrzqt(i, c59480zho);
    }

    public static final java.lang.String OLrzqt(int i, @NotNull C59480zho c59480zho) {
        Intrinsics.checkNotNullParameter(c59480zho, "");
        java.lang.String str = c59480zho.EZpvd() ? "0123456789ABCDEF" : "0123456789abcdef";
        C59480zho.ActionBar actionBarCopydefault = c59480zho.copydefault();
        if (actionBarCopydefault.djBIcL()) {
            char[] cArr = {str.charAt((i >> 28) & 15), str.charAt((i >> 24) & 15), str.charAt((i >> 20) & 15), str.charAt((i >> 16) & 15), str.charAt((i >> 12) & 15), str.charAt((i >> 8) & 15), str.charAt((i >> 4) & 15), str.charAt(i & 15)};
            if (actionBarCopydefault.copydefault()) {
                return C59449zhJ.concatToString$default(cArr, C56548yJl.valueOf(java.lang.Integer.numberOfLeadingZeros(i) >> 2, 7), 0, 2, null);
            }
            return C59449zhJ.copydefault(cArr);
        }
        return KWHzl(i, actionBarCopydefault, str, 32);
    }

    public static final int EZpvd(@NotNull java.lang.String str, @NotNull C59480zho c59480zho) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c59480zho, "");
        return KWHzl(str, 0, str.length(), c59480zho);
    }

    public static /* synthetic */ int hexToInt$default(java.lang.String str, C59480zho c59480zho, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c59480zho = C59480zho.EZpvd.OLrzqt();
        }
        return EZpvd(str, c59480zho);
    }

    public static /* synthetic */ int hexToInt$default(java.lang.String str, int i, int i2, C59480zho c59480zho, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            c59480zho = C59480zho.EZpvd.OLrzqt();
        }
        return KWHzl(str, i, i2, c59480zho);
    }

    public static final int KWHzl(java.lang.String str, int i, int i2, C59480zho c59480zho) {
        return KWHzl(str, i, i2, c59480zho, 8);
    }

    public static /* synthetic */ java.lang.String toHexString$default(long j, C59480zho c59480zho, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c59480zho = C59480zho.EZpvd.OLrzqt();
        }
        return EZpvd(j, c59480zho);
    }

    public static final java.lang.String EZpvd(long j, @NotNull C59480zho c59480zho) {
        Intrinsics.checkNotNullParameter(c59480zho, "");
        java.lang.String str = c59480zho.EZpvd() ? "0123456789ABCDEF" : "0123456789abcdef";
        C59480zho.ActionBar actionBarCopydefault = c59480zho.copydefault();
        if (actionBarCopydefault.djBIcL()) {
            char[] cArr = {str.charAt((int) ((j >> 60) & 15)), str.charAt((int) ((j >> 56) & 15)), str.charAt((int) ((j >> 52) & 15)), str.charAt((int) ((j >> 48) & 15)), str.charAt((int) ((j >> 44) & 15)), str.charAt((int) ((j >> 40) & 15)), str.charAt((int) ((j >> 36) & 15)), str.charAt((int) ((j >> 32) & 15)), str.charAt((int) ((j >> 28) & 15)), str.charAt((int) ((j >> 24) & 15)), str.charAt((int) ((j >> 20) & 15)), str.charAt((int) ((j >> 16) & 15)), str.charAt((int) ((j >> 12) & 15)), str.charAt((int) ((j >> 8) & 15)), str.charAt((int) ((j >> 4) & 15)), str.charAt((int) (15 & j))};
            if (actionBarCopydefault.copydefault()) {
                return C59449zhJ.concatToString$default(cArr, C56548yJl.valueOf(java.lang.Long.numberOfLeadingZeros(j) >> 2, 15), 0, 2, null);
            }
            return C59449zhJ.copydefault(cArr);
        }
        return KWHzl(j, actionBarCopydefault, str, 64);
    }

    public static final long copydefault(@NotNull java.lang.String str, @NotNull C59480zho c59480zho) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c59480zho, "");
        return AEQbTJ(str, 0, str.length(), c59480zho);
    }

    public static /* synthetic */ long hexToLong$default(java.lang.String str, C59480zho c59480zho, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c59480zho = C59480zho.EZpvd.OLrzqt();
        }
        return copydefault(str, c59480zho);
    }

    public static /* synthetic */ long hexToLong$default(java.lang.String str, int i, int i2, C59480zho c59480zho, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            c59480zho = C59480zho.EZpvd.OLrzqt();
        }
        return AEQbTJ(str, i, i2, c59480zho);
    }

    public static final long AEQbTJ(@NotNull java.lang.String str, int i, int i2, @NotNull C59480zho c59480zho) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(c59480zho, "");
        return copydefault(str, i, i2, c59480zho, 16);
    }

    public static final java.lang.String KWHzl(long j, C59480zho.ActionBar actionBar, java.lang.String str, int i) {
        if ((i & 3) != 0) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        int i2 = i >> 2;
        int iKWHzl = actionBar.KWHzl();
        int iCopydefault = C56548yJl.copydefault(iKWHzl - i2, 0);
        java.lang.String strOLrzqt = actionBar.OLrzqt();
        java.lang.String strAYXKKw = actionBar.AYXKKw();
        boolean zCopydefault = actionBar.copydefault();
        int iKWHzl2 = KWHzl(((long) strOLrzqt.length()) + ((long) iCopydefault) + ((long) i2) + ((long) strAYXKKw.length()));
        char[] cArr = new char[iKWHzl2];
        int iAEQbTJ = AEQbTJ(strOLrzqt, cArr, 0);
        if (iCopydefault > 0) {
            int i3 = iCopydefault + iAEQbTJ;
            yDT.AEQbTJ(cArr, str.charAt(0), iAEQbTJ, i3);
            iAEQbTJ = i3;
        }
        int i4 = i;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 -= 4;
            int i6 = (int) ((j >> i4) & 15);
            zCopydefault = zCopydefault && i6 == 0 && (i4 >> 2) >= iKWHzl;
            if (!zCopydefault) {
                cArr[iAEQbTJ] = str.charAt(i6);
                iAEQbTJ++;
            }
        }
        int iAEQbTJ2 = AEQbTJ(strAYXKKw, cArr, iAEQbTJ);
        return iAEQbTJ2 == iKWHzl2 ? C59449zhJ.copydefault(cArr) : C59449zhJ.concatToString$default(cArr, 0, iAEQbTJ2, 1, null);
    }

    public static final int AEQbTJ(java.lang.String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length == 1) {
                cArr[i] = str.charAt(0);
            } else {
                int length2 = str.length();
                Intrinsics.copydefault(str, "");
                str.getChars(0, length2, cArr, i);
            }
        }
        return i + str.length();
    }

    public static final int KWHzl(java.lang.String str, int i, int i2, C59480zho c59480zho, int i3) {
        yDG.Companion.AEQbTJ(i, i2, str.length());
        C59480zho.ActionBar actionBarCopydefault = c59480zho.copydefault();
        if (actionBarCopydefault.gEmmrt()) {
            EZpvd(str, i, i2, i3);
            return copydefault(str, i, i2);
        }
        java.lang.String strOLrzqt = actionBarCopydefault.OLrzqt();
        java.lang.String strAYXKKw = actionBarCopydefault.AYXKKw();
        EZpvd(str, i, i2, strOLrzqt, strAYXKKw, actionBarCopydefault.EZpvd(), i3);
        return copydefault(str, i + strOLrzqt.length(), i2 - strAYXKKw.length());
    }

    public static final long copydefault(java.lang.String str, int i, int i2, C59480zho c59480zho, int i3) {
        yDG.Companion.AEQbTJ(i, i2, str.length());
        C59480zho.ActionBar actionBarCopydefault = c59480zho.copydefault();
        if (actionBarCopydefault.gEmmrt()) {
            EZpvd(str, i, i2, i3);
            return EZpvd(str, i, i2);
        }
        java.lang.String strOLrzqt = actionBarCopydefault.OLrzqt();
        java.lang.String strAYXKKw = actionBarCopydefault.AYXKKw();
        EZpvd(str, i, i2, strOLrzqt, strAYXKKw, actionBarCopydefault.EZpvd(), i3);
        return EZpvd(str, i + strOLrzqt.length(), i2 - strAYXKKw.length());
    }

    public static final void EZpvd(java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3, boolean z, int i3) {
        if ((i2 - i) - str2.length() <= str3.length()) {
            AEQbTJ(str, i, i2, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i4 = 0; i4 < length; i4++) {
                if (!C59475zhj.OLrzqt(str2.charAt(i4), str.charAt(i + i4), z)) {
                    KWHzl(str, i, i2, str2, RequestParameters.PREFIX);
                }
            }
            i += str2.length();
        }
        int length2 = i2 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i5 = 0; i5 < length3; i5++) {
                if (!C59475zhj.OLrzqt(str3.charAt(i5), str.charAt(length2 + i5), z)) {
                    KWHzl(str, length2, i2, str3, "suffix");
                }
            }
        }
        EZpvd(str, i, length2, i3);
    }

    public static final void EZpvd(java.lang.String str, int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i4 < 1) {
            AEQbTJ(str, i, i2, "at least", 1);
        } else if (i4 > i3) {
            AEQbTJ(str, i, (i4 + i) - i3);
        }
    }

    public static final void AEQbTJ(java.lang.String str, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) != '0') {
                throw new java.lang.NumberFormatException("Expected the hexadecimal digit '0' at index " + i + ", but was '" + str.charAt(i) + "'.\nThe result won't fit the type being parsed.");
            }
            i++;
        }
    }

    public static final void AEQbTJ(java.lang.String str, int i, int i2, java.lang.String str2, int i3) {
        Intrinsics.copydefault(str, "");
        java.lang.String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        throw new java.lang.NumberFormatException("Expected " + str2 + ' ' + i3 + " hexadecimal digits at index " + i + ", but was \"" + strSubstring + "\" of length " + (i2 - i));
    }

    public static final void KWHzl(java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3) {
        int iValueOf = C56548yJl.valueOf(str2.length() + i, i2);
        Intrinsics.copydefault(str, "");
        java.lang.String strSubstring = str.substring(i, iValueOf);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        throw new java.lang.NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i + ", but was " + strSubstring);
    }

    public static final void AEQbTJ(java.lang.String str, int i, int i2, java.lang.String str2, java.lang.String str3) {
        Intrinsics.copydefault(str, "");
        java.lang.String strSubstring = str.substring(i, i2);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        throw new java.lang.NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }

    public static final java.lang.Void AEQbTJ(java.lang.String str, int i) {
        throw new java.lang.NumberFormatException("Expected a hexadecimal digit at index " + i + ", but was " + str.charAt(i));
    }

    public static final byte copydefault(java.lang.String str, int i) {
        int[] iArr;
        int i2;
        int i3;
        char cCharAt = str.charAt(i);
        if ((cCharAt >>> '\b') != 0 || (i2 = (iArr = AEQbTJ)[cCharAt]) < 0) {
            AEQbTJ(str, i);
            throw new KotlinNothingValueException();
        }
        int i4 = i + 1;
        char cCharAt2 = str.charAt(i4);
        if ((cCharAt2 >>> '\b') == 0 && (i3 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i2 << 4) | i3);
        }
        AEQbTJ(str, i4);
        throw new KotlinNothingValueException();
    }

    public static final int copydefault(java.lang.String str, int i, int i2) {
        int i3;
        int i4 = 0;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') != 0 || (i3 = AEQbTJ[cCharAt]) < 0) {
                AEQbTJ(str, i);
                throw new KotlinNothingValueException();
            }
            i4 = (i4 << 4) | i3;
            i++;
        }
        return i4;
    }

    public static final long EZpvd(java.lang.String str, int i, int i2) {
        long j = 0;
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') == 0) {
                long j2 = KWHzl[cCharAt];
                if (j2 >= 0) {
                    j = (j << 4) | j2;
                    i++;
                }
            }
            AEQbTJ(str, i);
            throw new KotlinNothingValueException();
        }
        return j;
    }
}
