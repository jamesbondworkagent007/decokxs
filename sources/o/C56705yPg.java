package o;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.yPg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C56705yPg implements yNX {
    public final java.lang.String AEQbTJ;
    public final java.util.List<yNU> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends o.yNU> */
    /* JADX WARN: Multi-variable type inference failed */
    public C56705yPg(@NotNull java.util.List<? extends yNU> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = list;
        this.AEQbTJ = str;
        list.size();
        CollectionsKt___CollectionsKt.OqFWZa(list).size();
    }

    @Override // o.yNU
    public java.util.List<yNW> copydefault(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<yNU> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            C56672yOa.AEQbTJ(it.next(), c56933yXs, arrayList);
        }
        return CollectionsKt___CollectionsKt.AxsJAYsNCnLh(arrayList);
    }

    @Override // o.yNX
    public void EZpvd(@NotNull C56933yXs c56933yXs, @NotNull java.util.Collection<yNW> collection) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(collection, "");
        java.util.Iterator<yNU> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            C56672yOa.AEQbTJ(it.next(), c56933yXs, collection);
        }
    }

    @Override // o.yNU
    public java.util.Collection<C56933yXs> KWHzl(@NotNull C56933yXs c56933yXs, @NotNull Function1<? super C56935yXu, java.lang.Boolean> function1) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        Intrinsics.checkNotNullParameter(function1, "");
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<yNU> it = this.EZpvd.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().KWHzl(c56933yXs, function1));
        }
        return hashSet;
    }

    @Override // o.yNX
    public boolean OLrzqt(@NotNull C56933yXs c56933yXs) {
        Intrinsics.checkNotNullParameter(c56933yXs, "");
        java.util.List<yNU> list = this.EZpvd;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (!C56672yOa.EZpvd((yNU) it.next(), c56933yXs)) {
                    return false;
                }
            }
        }
        return true;
    }
}
