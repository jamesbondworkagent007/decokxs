package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zsK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C59929zsK {
    public static final boolean[] EZpvd(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        boolean[] zArr = new boolean[bArr.length * 8];
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                boolean z = true;
                if (((1 << (7 - i2)) & bArr[i]) == 0) {
                    z = false;
                }
                zArr[(i * 8) + i2] = z;
            }
        }
        return zArr;
    }

    public static /* synthetic */ byte[] toByteArray$default(boolean[] zArr, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = zArr.length / 8;
        }
        return OLrzqt(zArr, i);
    }

    public static final byte[] OLrzqt(@NotNull boolean[] zArr, int i) {
        Intrinsics.checkNotNullParameter(zArr, "");
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < 8; i3++) {
                if (zArr[(i2 * 8) + i3]) {
                    bArr[i2] = (byte) (bArr[i2] | ((byte) (1 << (7 - i3))));
                }
            }
        }
        return bArr;
    }
}
