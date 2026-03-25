package o;

import androidx.lifecycle.Lifecycle;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fdr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C18199fdr {
    public final androidx.fragment.app.FragmentManager KWHzl;
    public java.util.ArrayList<InterfaceC18198fdq> OLrzqt;
    public final int copydefault;

    public C18199fdr(@NotNull java.util.ArrayList<InterfaceC18198fdq> arrayList, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @androidx.annotation.IdRes int i) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        this.OLrzqt = arrayList;
        this.KWHzl = fragmentManager;
        this.copydefault = i;
    }

    public static /* synthetic */ void navigateToTab$default(C18199fdr c18199fdr, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        c18199fdr.AEQbTJ(i, z);
    }

    public final void AEQbTJ(int i, boolean z) {
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = this.KWHzl.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
        androidx.fragment.app.Fragment primaryNavigationFragment = this.KWHzl.getPrimaryNavigationFragment();
        if (primaryNavigationFragment != null) {
            fragmentTransactionBeginTransaction.setMaxLifecycle(primaryNavigationFragment, Lifecycle.State.STARTED);
            fragmentTransactionBeginTransaction.hide(primaryNavigationFragment);
        }
        java.lang.String strIsConnected = this.OLrzqt.get(i).isConnected();
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = this.KWHzl.findFragmentByTag(strIsConnected);
        if (fragmentFindFragmentByTag == null) {
            fragmentFindFragmentByTag = this.OLrzqt.get(i).KWHzl(z);
            fragmentTransactionBeginTransaction.add(this.copydefault, fragmentFindFragmentByTag, strIsConnected);
        } else {
            fragmentTransactionBeginTransaction.show(fragmentFindFragmentByTag);
            fragmentTransactionBeginTransaction.setMaxLifecycle(fragmentFindFragmentByTag, Lifecycle.State.RESUMED);
        }
        fragmentTransactionBeginTransaction.setPrimaryNavigationFragment(fragmentFindFragmentByTag);
        fragmentTransactionBeginTransaction.setReorderingAllowed(true);
        fragmentTransactionBeginTransaction.commitAllowingStateLoss();
    }

    public final void AEQbTJ(@NotNull java.util.Set<java.lang.String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        try {
            androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = this.KWHzl.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
            java.util.Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.Fragment fragmentFindFragmentByTag = this.KWHzl.findFragmentByTag((java.lang.String) it.next());
                if (fragmentFindFragmentByTag != null) {
                    fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag);
                }
            }
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public final androidx.fragment.app.Fragment OLrzqt(int i) {
        return this.KWHzl.findFragmentByTag(((i < 0 || i > this.OLrzqt.size() + (-1)) ? this.OLrzqt.get(0) : this.OLrzqt.get(i)).isConnected());
    }

    public final void KWHzl() {
        this.OLrzqt.clear();
    }

    public final void EZpvd(@NotNull java.util.ArrayList<InterfaceC18198fdq> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        java.util.ArrayList<InterfaceC18198fdq> arrayList2 = this.OLrzqt;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList2, 10));
        java.util.Iterator<T> it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((InterfaceC18198fdq) it.next()).isConnected());
        }
        java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList3);
        this.OLrzqt = arrayList;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayList, 10));
        java.util.Iterator<T> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((InterfaceC18198fdq) it2.next()).isConnected());
        }
        AEQbTJ(yEJ.EZpvd(CollectionsKt___CollectionsKt.OqFWZa(arrayList4), (java.lang.Iterable) setOqFWZa));
    }
}
