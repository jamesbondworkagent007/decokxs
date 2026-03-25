package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yGm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C56468yGm {
    public final java.lang.Object EZpvd;
    public final java.nio.file.Path KWHzl;
    public final C56468yGm OLrzqt;
    public java.util.Iterator<C56468yGm> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C56468yGm AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.Iterator<C56468yGm> KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(java.util.Iterator<C56468yGm> it) {
        this.copydefault = it;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.nio.file.Path eu_() {
        return this.KWHzl;
    }

    public C56468yGm(@NotNull java.nio.file.Path path, java.lang.Object obj, C56468yGm c56468yGm) {
        Intrinsics.checkNotNullParameter(path, "");
        this.KWHzl = path;
        this.EZpvd = obj;
        this.OLrzqt = c56468yGm;
    }
}
