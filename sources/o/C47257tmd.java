package o;

import com.okinc.okuser.data.User;
import dagger.Lazy;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tmd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47257tmd implements InterfaceC5017Bzn {
    public final Lazy<C47270tmq> EZpvd;

    @yCM
    public C47257tmd(@NotNull Lazy<C47270tmq> lazy) {
        Intrinsics.checkNotNullParameter(lazy, "");
        this.EZpvd = lazy;
    }

    public final C47270tmq KWHzl() {
        C47270tmq c47270tmq = this.EZpvd.get();
        Intrinsics.checkNotNullExpressionValue(c47270tmq, "");
        return c47270tmq;
    }

    @Override // o.InterfaceC5017Bzn
    public java.util.List<BvH> OLrzqt() {
        java.util.List<User> listGEmmrt = KWHzl().gEmmrt();
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(listGEmmrt, 10));
        java.util.Iterator<T> it = listGEmmrt.iterator();
        while (it.hasNext()) {
            arrayList.add(C47262tmi.EZpvd((User) it.next()));
        }
        return arrayList;
    }

    @Override // o.InterfaceC5017Bzn
    public void copydefault(@NotNull BvH bvH) {
        Intrinsics.checkNotNullParameter(bvH, "");
        java.util.List<User> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) KWHzl().gEmmrt());
        java.util.Iterator<User> it = listFJNWhG.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.EZpvd((java.lang.Object) it.next().getUid(), (java.lang.Object) bvH.valueOf())) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            listFJNWhG.set(i, C47262tmi.copydefault(bvH));
        } else {
            listFJNWhG.add(C47262tmi.copydefault(bvH));
        }
        KWHzl().KWHzl(listFJNWhG);
    }

    @Override // o.InterfaceC5017Bzn
    public void OLrzqt(@NotNull BvH bvH) {
        Intrinsics.checkNotNullParameter(bvH, "");
        java.util.List<User> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) KWHzl().gEmmrt());
        java.util.Iterator<User> it = listFJNWhG.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.EZpvd((java.lang.Object) it.next().getUid(), (java.lang.Object) bvH.valueOf())) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            listFJNWhG.remove(i);
            KWHzl().KWHzl(listFJNWhG);
        }
    }

    @Override // o.InterfaceC5017Bzn
    public void AEQbTJ() {
        KWHzl().KWHzl(yDY.AhwBna());
    }

    @Override // o.InterfaceC5017Bzn
    public void AEQbTJ(@NotNull java.util.List<BvH> list) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(C47262tmi.copydefault((BvH) it.next()));
        }
        KWHzl().KWHzl(arrayList);
    }
}
