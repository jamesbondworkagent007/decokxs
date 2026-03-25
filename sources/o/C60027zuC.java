package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zuC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60027zuC {
    public static final void KWHzl(@NotNull byte[] bArr, int i, long j) {
        Intrinsics.checkNotNullParameter(bArr, "");
        int i2 = 7;
        while (true) {
            int i3 = i2 - 1;
            bArr[(i + 7) - i2] = C56393yDs.copydefault((byte) (j >>> (i2 * 8)));
            if (i3 < 0) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    public static final int[] copydefault(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length % 4 != 0) {
            throw new java.lang.IllegalArgumentException("Byte array length must be a multiple of 4");
        }
        int length = bArr.length / 4;
        int[] iArr = new int[length];
        int i = length - 1;
        if (i >= 0) {
            int i2 = 0;
            while (true) {
                int i3 = i2 + 1;
                int i4 = i2 * 4;
                iArr[i2] = C60026zuB.AEQbTJ(new java.lang.Byte[]{java.lang.Byte.valueOf(bArr[i4]), java.lang.Byte.valueOf(bArr[i4 + 1]), java.lang.Byte.valueOf(bArr[i4 + 2]), java.lang.Byte.valueOf(bArr[i4 + 3])});
                if (i3 > i) {
                    break;
                }
                i2 = i3;
            }
        }
        return iArr;
    }

    public static final void copydefault(@NotNull byte[] bArr, int i, @NotNull byte[] bArr2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        yDT.copydefault(bArr, bArr2, i2, i, i3 + i);
    }
}
