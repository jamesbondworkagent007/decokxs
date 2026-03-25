package o;

import kotlin.jvm.internal.Intrinsics;
import okio.Okio;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class CK {
    public static /* synthetic */ InterfaceC5060De source$default(java.nio.file.Path path, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = -1;
        }
        return cd_(path, j, j2);
    }

    public static final InterfaceC5060De cd_(@NotNull java.nio.file.Path path, long j, long j2) {
        Intrinsics.checkNotNullParameter(path, "");
        long j3 = j - 1;
        if (j2 < j3) {
            throw new java.lang.IllegalArgumentException(("end index " + j2 + " must be greater or equal to start index minus one (" + j3 + ')').toString());
        }
        java.io.File file = path.toFile();
        if (j2 == -1) {
            j2 = file.length() - 1;
        }
        Intrinsics.copydefault(file);
        return KWHzl(file, j, j2);
    }

    public static /* synthetic */ InterfaceC5060De source$default(java.io.File file, long j, long j2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = file.length() - 1;
        }
        return KWHzl(file, j, j2);
    }

    public static final InterfaceC5060De KWHzl(@NotNull java.io.File file, long j, long j2) {
        Intrinsics.checkNotNullParameter(file, "");
        return C5066Dk.EZpvd(new CJ(file, j, j2, null, 8, null));
    }

    public static final InterfaceC5058Dc AEQbTJ(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        return C5066Dk.copydefault(Okio.sink(file, false));
    }
}
