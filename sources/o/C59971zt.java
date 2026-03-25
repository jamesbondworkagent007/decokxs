package o;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC59908zr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.zt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C59971zt {
    public static final byte[] copydefault(@NotNull InterfaceC59908zr interfaceC59908zr, @NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(interfaceC59908zr, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        InterfaceC59908zr.StateListAnimator.update$default(interfaceC59908zr, bArr, 0, 0, 6, null);
        return interfaceC59908zr.AEQbTJ();
    }

    public static final byte[] OLrzqt(@NotNull byte[] bArr, @NotNull InterfaceC59908zr interfaceC59908zr) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(interfaceC59908zr, "");
        return copydefault(interfaceC59908zr, bArr);
    }

    public static final byte[] copydefault(@NotNull byte[] bArr, @NotNull Function0<? extends InterfaceC59908zr> function0) {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(function0, "");
        return copydefault(function0.invoke(), bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [65=5] */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final InterfaceC59908zr copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        switch (lowerCase.hashCode()) {
            case -1352399984:
                if (lowerCase.equals("crc32c")) {
                    return new C59863zp();
                }
                return null;
            case -903629273:
                if (lowerCase.equals("sha256")) {
                    return new C60243zz();
                }
                return null;
            case 107902:
                if (lowerCase.equals("md5")) {
                    return new C60077zv();
                }
                return null;
            case 3528965:
                if (lowerCase.equals("sha1")) {
                    return new C60190zy();
                }
                return null;
            case 94921523:
                if (lowerCase.equals("crc32")) {
                    return new C59598zk();
                }
                return null;
            default:
                return null;
        }
    }
}
