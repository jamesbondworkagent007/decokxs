package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CW {
    public static /* synthetic */ CN SdkByteChannel$default(boolean z, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            i = 16384;
        }
        return EZpvd(z, i);
    }

    public static final CN EZpvd(boolean z, int i) {
        return new CL(z, i);
    }

    public static /* synthetic */ CS SdkByteReadChannel$default(byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length - i;
        }
        return OLrzqt(bArr, i, i2);
    }

    public static final CS OLrzqt(@NotNull byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "");
        return new CL(bArr, i, i2);
    }
}
