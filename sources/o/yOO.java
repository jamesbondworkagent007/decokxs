package o;

import kotlin.jvm.internal.Intrinsics;
import o.yOL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yOO implements yOL {
    public final java.util.List<yOJ> OLrzqt;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.yOJ> */
    /* JADX WARN: Multi-variable type inference failed */
    public yOO(@NotNull java.util.List<? extends yOJ> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
    }

    @Override // o.yOL
    public yOJ EZpvd(@NotNull C56933yXs c56933yXs) {
        return yOL.Activity.EZpvd(this, c56933yXs);
    }

    @Override // o.yOL
    public boolean copydefault(@NotNull C56933yXs c56933yXs) {
        return yOL.Activity.OLrzqt(this, c56933yXs);
    }

    @Override // o.yOL
    public boolean AEQbTJ() {
        return this.OLrzqt.isEmpty();
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<yOJ> iterator() {
        return this.OLrzqt.iterator();
    }

    public java.lang.String toString() {
        return this.OLrzqt.toString();
    }
}
