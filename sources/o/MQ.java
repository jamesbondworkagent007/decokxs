package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MQ {
    public static final void copydefault(@NotNull java.io.File file) throws java.io.IOException {
        Intrinsics.checkNotNullParameter(file, "");
        if (file.exists() || file.mkdirs() || file.isDirectory()) {
            return;
        }
        throw new java.io.IOException("Could not create directory at " + file);
    }
}
