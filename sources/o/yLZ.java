package o;

import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yLZ {
    public java.lang.ClassLoader KWHzl;
    public final WeakReference<java.lang.ClassLoader> OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(java.lang.ClassLoader classLoader) {
        this.KWHzl = classLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.copydefault;
    }

    public yLZ(@NotNull java.lang.ClassLoader classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "");
        this.OLrzqt = new WeakReference<>(classLoader);
        this.copydefault = java.lang.System.identityHashCode(classLoader);
        this.KWHzl = classLoader;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof yLZ) && this.OLrzqt.get() == ((yLZ) obj).OLrzqt.get();
    }

    public java.lang.String toString() {
        java.lang.String string;
        java.lang.ClassLoader classLoader = this.OLrzqt.get();
        return (classLoader == null || (string = classLoader.toString()) == null) ? "<null>" : string;
    }
}
