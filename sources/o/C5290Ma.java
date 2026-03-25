package o;

import androidx.collection.ScatterMapKt;
import com.google.common.primitives.UnsignedBytes;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.Ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C5290Ma {
    public static final C5290Ma AEQbTJ = new C5290Ma();

    public final int KWHzl(int i) {
        int i2 = (i ^ (i >>> 16)) * (-2048144789);
        int i3 = (i2 ^ (i2 >>> 13)) * (-1028477387);
        return i3 ^ (i3 >>> 16);
    }

    public final int copydefault(int i) {
        return ((i & 65280) << 8) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((i & 255) << 24);
    }

    private C5290Ma() {
    }

    public final int KWHzl(@NotNull byte[] bArr, int i, int i2) {
        int iRotateLeft;
        Intrinsics.checkNotNullParameter(bArr, "");
        int i3 = i >> 2;
        for (int i4 = 0; i4 < i3; i4++) {
            i2 = EZpvd(KWHzl(bArr, i4 << 2), i2);
        }
        int i5 = i3 << 2;
        int i6 = i - i5;
        if (i6 == 1) {
            iRotateLeft = java.lang.Integer.rotateLeft((bArr[i5] & UnsignedBytes.MAX_VALUE) * ScatterMapKt.MurmurHashC1, 15);
        } else if (i6 == 2) {
            iRotateLeft = java.lang.Integer.rotateLeft(((bArr[i5] & UnsignedBytes.MAX_VALUE) ^ ((bArr[i5 + 1] & UnsignedBytes.MAX_VALUE) << 8)) * ScatterMapKt.MurmurHashC1, 15);
        } else {
            if (i6 == 3) {
                iRotateLeft = java.lang.Integer.rotateLeft(((bArr[i5] & UnsignedBytes.MAX_VALUE) ^ (((bArr[i5 + 2] & UnsignedBytes.MAX_VALUE) << 16) ^ ((bArr[i5 + 1] & UnsignedBytes.MAX_VALUE) << 8))) * ScatterMapKt.MurmurHashC1, 15);
            }
            return KWHzl(i2 ^ i);
        }
        i2 ^= iRotateLeft * 461845907;
        return KWHzl(i2 ^ i);
    }

    public final int EZpvd(int i, int i2) {
        return (java.lang.Integer.rotateLeft((java.lang.Integer.rotateLeft(i * ScatterMapKt.MurmurHashC1, 15) * 461845907) ^ i2, 13) * 5) - 430675100;
    }

    public static /* synthetic */ int readIntLe$default(C5290Ma c5290Ma, byte[] bArr, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return c5290Ma.KWHzl(bArr, i);
    }

    public final int KWHzl(byte[] bArr, int i) {
        return copydefault((bArr[i + 3] & UnsignedBytes.MAX_VALUE) | ((bArr[i] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i + 2] & UnsignedBytes.MAX_VALUE) << 8));
    }
}
