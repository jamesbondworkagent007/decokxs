package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mpJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33056mpJ {
    public static final boolean AEQbTJ(@NotNull java.io.File file) {
        java.io.File parentFile;
        Intrinsics.checkNotNullParameter(file, "");
        if (file.exists()) {
            return true;
        }
        java.io.File parentFile2 = file.getParentFile();
        if ((parentFile2 == null || !parentFile2.exists()) && (parentFile = file.getParentFile()) != null) {
            parentFile.mkdirs();
        }
        return file.createNewFile();
    }
}
