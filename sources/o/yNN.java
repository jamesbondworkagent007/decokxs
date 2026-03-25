package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yNN<T> {
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.copydefault;
    }

    public yNN(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.copydefault = str;
    }
}
