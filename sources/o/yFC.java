package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yFC {
    public final java.util.List<java.io.File> KWHzl;
    public final java.io.File copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.yFC */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ yFC copy$kotlin_stdlib$default(yFC yfc, java.io.File file, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            file = yfc.copydefault;
        }
        if ((i & 2) != 0) {
            list = yfc.KWHzl;
        }
        return yfc.EZpvd(file, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.io.File AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final yFC EZpvd(@NotNull java.io.File file, @NotNull java.util.List<? extends java.io.File> list) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new yFC(file, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.io.File> KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yFC)) {
            return false;
        }
        yFC yfc = (yFC) obj;
        return Intrinsics.EZpvd(this.copydefault, yfc.copydefault) && Intrinsics.EZpvd(this.KWHzl, yfc.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.copydefault.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "FilePathComponents(root=" + this.copydefault + ", segments=" + this.KWHzl + ')';
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends java.io.File> */
    /* JADX WARN: Multi-variable type inference failed */
    public yFC(@NotNull java.io.File file, @NotNull java.util.List<? extends java.io.File> list) {
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = file;
        this.KWHzl = list;
    }

    public final int OLrzqt() {
        return this.KWHzl.size();
    }
}
