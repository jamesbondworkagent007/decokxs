package o;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Hc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C5162Hc {
    public static final int[] KWHzl;

    static {
        int[] iArr = new int[256];
        int i = 0;
        while (i < 256) {
            iArr[i] = i == 61 ? 255 : StringsKt__StringsKt.indexOf$default((java.lang.CharSequence) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", (char) i, 0, false, 6, (java.lang.Object) null);
            i++;
        }
        KWHzl = iArr;
    }

    public static final int copydefault(int i) {
        return ((i + 2) / 3) * 4;
    }

    public static final int AEQbTJ(byte[] bArr) {
        int i = 0;
        if (bArr.length == 0) {
            return 0;
        }
        int length = bArr.length;
        if ((length & 3) != 0) {
            throw new java.lang.IllegalArgumentException("invalid base64 string of length " + length + "; not a multiple of 4");
        }
        if (length >= 2 && bArr[length - 1] == 61 && bArr[length - 2] == 61) {
            i = 2;
        } else if (bArr[length - 1] == 61) {
            i = 1;
        }
        return ((length * 3) / 4) - i;
    }

    public static final java.lang.String OLrzqt(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return C59449zhJ.copydefault(KWHzl(bArr));
    }

    public static final byte[] KWHzl(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArr2 = new byte[copydefault(bArr.length)];
        int length = bArr.length % 3;
        int length2 = (bArr.length + 2) / 3;
        int i = 0;
        int iEZpvd = C56453yFy.EZpvd(0, bArr.length - 1, 3);
        if (iEZpvd >= 0) {
            int i2 = 0;
            while (true) {
                int iCopydefault = copydefault(bArr, i + 2, 255) | (copydefault(bArr, i, 255) << 16) | (copydefault(bArr, i + 1, 255) << 8);
                bArr2[i2] = EZpvd((iCopydefault >> 18) & 63);
                bArr2[i2 + 1] = EZpvd((iCopydefault >> 12) & 63);
                bArr2[i2 + 2] = EZpvd((iCopydefault >> 6) & 63);
                int i3 = i2 + 4;
                bArr2[i2 + 3] = EZpvd(iCopydefault & 63);
                if (i == iEZpvd) {
                    break;
                }
                i += 3;
                i2 = i3;
            }
        }
        if (length > 0) {
            int i4 = length2 * 4;
            bArr2[i4 - 1] = 61;
            if (length == 1) {
                bArr2[i4 - 2] = 61;
            }
        }
        return bArr2;
    }

    public static final byte[] OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return EZpvd(C59449zhJ.getNewProxyInstance(str));
    }

    public static final byte[] EZpvd(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArr2 = new byte[AEQbTJ(bArr)];
        int length = (bArr.length / 4) - 1;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = 2;
            if (i >= length) {
                break;
            }
            int iKWHzl = KWHzl(bArr[i2]);
            int iKWHzl2 = KWHzl(bArr[i2 + 1]);
            int iKWHzl3 = KWHzl(bArr[i2 + 2]);
            int i5 = i2 + 4;
            int iKWHzl4 = KWHzl(bArr[i2 + 3]);
            while (-1 < i4) {
                bArr2[i3] = (byte) ((((((iKWHzl2 << 12) | (iKWHzl << 18)) | (iKWHzl3 << 6)) | (iKWHzl4 & 255)) >> (i4 * 8)) & 255);
                i4--;
                i3++;
            }
            i++;
            i2 = i5;
        }
        if (length * 3 >= 0) {
            int iKWHzl5 = KWHzl(bArr[i2]);
            int iKWHzl6 = KWHzl(bArr[i2 + 1]);
            int iKWHzl7 = KWHzl(bArr[i2 + 2]);
            int iKWHzl8 = KWHzl(bArr[i2 + 3]);
            if (iKWHzl5 == 255 || iKWHzl6 == 255) {
                throw new java.lang.IllegalArgumentException("decode base64: invalid padding");
            }
            int i6 = i3 + 1;
            bArr2[i3] = (byte) ((iKWHzl5 << 2) | ((iKWHzl6 >> 4) & 3));
            if (iKWHzl7 != 255) {
                bArr2[i6] = (byte) (((iKWHzl6 << 4) & PsExtractor.VIDEO_STREAM_MASK) | ((iKWHzl7 >> 2) & 15));
                i6 = i3 + 2;
            }
            if (iKWHzl8 != 255) {
                bArr2[i6] = (byte) (iKWHzl8 | ((iKWHzl7 & 3) << 6));
            }
        }
        return bArr2;
    }

    public static final byte EZpvd(int i) {
        return (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(i);
    }

    public static final int copydefault(byte[] bArr, int i, java.lang.Integer num) {
        if (i >= bArr.length) {
            return 0;
        }
        int i2 = bArr[i];
        return num != null ? i2 & num.intValue() : i2;
    }

    public static /* synthetic */ int getOrZero$default(byte[] bArr, int i, java.lang.Integer num, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            num = null;
        }
        return copydefault(bArr, i, num);
    }

    public static final int KWHzl(byte b) {
        int i = KWHzl[b];
        if (i != -1) {
            return i;
        }
        throw new java.lang.IllegalArgumentException("decode base64: invalid input byte: " + ((int) b));
    }
}
