package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gZe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C20054gZe<T> {
    public final java.lang.String KWHzl;
    public final java.util.List<C20073gZx<T>> copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.gZe */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C20054gZe copy$default(C20054gZe c20054gZe, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c20054gZe.KWHzl;
        }
        if ((i & 2) != 0) {
            list = c20054gZe.copydefault;
        }
        return c20054gZe.copydefault(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C20073gZx<T>> copydefault() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C20054gZe<T> copydefault(@NotNull java.lang.String str, @NotNull java.util.List<C20073gZx<T>> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new C20054gZe<>(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20054gZe)) {
            return false;
        }
        C20054gZe c20054gZe = (C20054gZe) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c20054gZe.KWHzl) && Intrinsics.EZpvd(this.copydefault, c20054gZe.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "MultiSelectionFilterData(title=" + this.KWHzl + ", datas=" + this.copydefault + ")";
    }

    public C20054gZe(@NotNull java.lang.String str, @NotNull java.util.List<C20073gZx<T>> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = str;
        this.copydefault = list;
    }
}
