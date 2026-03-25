package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zuB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C60026zuB {
    public static final int AEQbTJ(@NotNull java.lang.Byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        if (bArr.length < 4) {
            throw new java.lang.NumberFormatException("The array size is less than 4");
        }
        return (C60031zuG.KWHzl(bArr[0].byteValue()) << 24) + (C60031zuG.KWHzl(bArr[1].byteValue()) << 16) + (C60031zuG.KWHzl(bArr[2].byteValue()) << 8) + C60031zuG.KWHzl(bArr[3].byteValue());
    }
}
