package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zuF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60030zuF {
    public static final byte[] OLrzqt(@NotNull int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "");
        byte[] bArr = new byte[iArr.length * 4];
        int length = iArr.length - 1;
        if (length >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                java.lang.Byte[] bArrEZpvd = C60029zuE.EZpvd(iArr[i]);
                int i3 = i * 4;
                bArr[i3] = bArrEZpvd[0].byteValue();
                bArr[i3 + 1] = bArrEZpvd[1].byteValue();
                bArr[i3 + 2] = bArrEZpvd[2].byteValue();
                bArr[i3 + 3] = bArrEZpvd[3].byteValue();
                if (i2 > length) {
                    break;
                }
                i = i2;
            }
        }
        return bArr;
    }

    public static final void copydefault(@NotNull int[] iArr, int i, @NotNull int[] iArr2, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "");
        Intrinsics.checkNotNullParameter(iArr2, "");
        yDT.copydefault(iArr, iArr2, i2, i, i3 + i);
    }
}
