package o;

import kotlin.io.FileWalkDirection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class yFJ extends yFI {
    public static /* synthetic */ yFH walk$default(java.io.File file, FileWalkDirection fileWalkDirection, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        return AEQbTJ(file, fileWalkDirection);
    }

    public static final yFH AEQbTJ(@NotNull java.io.File file, @NotNull FileWalkDirection fileWalkDirection) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(fileWalkDirection, "");
        return new yFH(file, fileWalkDirection);
    }

    public static yFH AYXKKw(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        return AEQbTJ(file, FileWalkDirection.TOP_DOWN);
    }

    public static yFH djBIcL(@NotNull java.io.File file) {
        Intrinsics.checkNotNullParameter(file, "");
        return AEQbTJ(file, FileWalkDirection.BOTTOM_UP);
    }
}
