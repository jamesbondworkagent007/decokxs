package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class yNS implements yNX {
    public final java.util.Collection<yNW> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Collection<? extends o.yNW> */
    /* JADX WARN: Multi-variable type inference failed */
    public yNS(@NotNull java.util.Collection<? extends yNW> collection) {
        Intrinsics.checkNotNullParameter(collection, "");
        this.AEQbTJ = collection;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: java.util.Collection<o.yNW> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.yNX
    public void EZpvd(@NotNull C56933yXs c56933yXs, @NotNull java.util.Collection<yNW> collection) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(collection, "");
        for (java.lang.Object obj : this.AEQbTJ) {
            if (Intrinsics.EZpvd(((yNW) obj).KWHzl(), c56933yXs)) {
                collection.add(obj);
            }
        }
    }

    @Override // o.yNX
    public boolean OLrzqt(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        java.util.Collection<yNW> collection = this.AEQbTJ;
        if (!(collection instanceof java.util.Collection) || !collection.isEmpty()) {
            java.util.Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                if (Intrinsics.EZpvd(((yNW) it.next()).KWHzl(), c56933yXs)) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // o.yNU
    public java.util.List<yNW> copydefault(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        java.util.Collection<yNW> collection = this.AEQbTJ;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : collection) {
            if (Intrinsics.EZpvd(((yNW) obj).KWHzl(), c56933yXs)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // o.yNU
    public java.util.Collection<C56933yXs> KWHzl(@NotNull C56933yXs c56933yXs, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        return C59467zhb.zuBGHE(C59467zhb.DbNXlk(C59467zhb.fetchVPNInfo(CollectionsKt___CollectionsKt.QVAiDq(this.AEQbTJ), C56673yOb.copydefault), new yNZ(c56933yXs)));
    }

    public static final C56933yXs copydefault(yNW ynw) {
        Intrinsics.checkNotNullParameter(ynw, "");
        return ynw.KWHzl();
    }

    public static final boolean OLrzqt(C56933yXs c56933yXs, C56933yXs c56933yXs2) {
        Intrinsics.checkNotNullParameter(c56933yXs2, "");
        return !c56933yXs2.AEQbTJ() && Intrinsics.EZpvd(c56933yXs2.EZpvd(), c56933yXs);
    }
}
