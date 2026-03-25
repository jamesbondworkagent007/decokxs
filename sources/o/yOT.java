package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class yOT implements yOL {
    public final java.util.List<yOL> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.yOL> */
    /* JADX WARN: Multi-variable type inference failed */
    public yOT(@NotNull java.util.List<? extends yOL> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public yOT(@NotNull yOL... yolArr) {
        this((java.util.List<? extends yOL>) yDV.AwvSrB(yolArr));
        Intrinsics.checkNotNullParameter(yolArr, "");
    }

    @Override // o.yOL
    public boolean copydefault(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        java.util.Iterator it = CollectionsKt___CollectionsKt.QVAiDq(this.copydefault).iterator();
        while (it.hasNext()) {
            if (((yOL) it.next()).copydefault(c56933yXs)) {
                return true;
            }
        }
        return false;
    }

    public static final yOJ KWHzl(C56933yXs c56933yXs, yOL yol) {
        Intrinsics.checkNotNullParameter(yol, "");
        return yol.EZpvd(c56933yXs);
    }

    @Override // o.yOL
    public yOJ EZpvd(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        return (yOJ) C59467zhb.zLjUOn(C59467zhb.fJNWhG(CollectionsKt___CollectionsKt.QVAiDq(this.copydefault), new yOQ(c56933yXs)));
    }

    public static final Sequence OLrzqt(yOL yol) {
        Intrinsics.checkNotNullParameter(yol, "");
        return CollectionsKt___CollectionsKt.QVAiDq(yol);
    }

    @Override // java.lang.Iterable
    public java.util.Iterator<yOJ> iterator() {
        return C59467zhb.isConnected(CollectionsKt___CollectionsKt.QVAiDq(this.copydefault), yOR.copydefault).iterator();
    }

    @Override // o.yOL
    public boolean AEQbTJ() {
        java.util.List<yOL> list = this.copydefault;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!((yOL) it.next()).AEQbTJ()) {
                    return false;
                }
            }
        }
        return true;
    }
}
