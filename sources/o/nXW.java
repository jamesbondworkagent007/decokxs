package o;

import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class nXW extends FragmentStateAdapter {
    public final java.util.List<Function0<nXX>> EZpvd;
    public final boolean OLrzqt;
    public final java.util.List<C34286nYi> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nXW(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Lifecycle lifecycle, boolean z) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycle, "");
        this.OLrzqt = z;
        this.EZpvd = new java.util.ArrayList();
        this.copydefault = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.EZpvd.size();
    }

    /* JADX DEBUG: Method merged with bridge method: createFragment(I)Landroidx/fragment/app/Fragment; */
    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
    public nXX createFragment(int i) {
        return this.EZpvd.get(i).invoke();
    }

    public final void OLrzqt(@NotNull java.util.List<C34286nYi> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault.clear();
        this.copydefault.addAll(list);
        this.EZpvd.clear();
        java.util.List<Function0<nXX>> list2 = this.EZpvd;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (final C34286nYi c34286nYi : list) {
            arrayList.add(new Function0() { // from class: o.nYa
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return nXW.OLrzqt(c34286nYi, this);
                }
            });
        }
        list2.addAll(arrayList);
        notifyDataSetChanged();
    }

    public static final nXX OLrzqt(C34286nYi c34286nYi, nXW nxw) {
        return nXX.Companion.copydefault(c34286nYi.EZpvd(), nxw.OLrzqt);
    }

    public final java.lang.String EZpvd(int i) {
        java.lang.String strCopydefault;
        C34286nYi c34286nYi = (C34286nYi) CollectionsKt___CollectionsKt.AkhnZx(this.copydefault, i);
        if (c34286nYi == null) {
            strCopydefault = null;
        } else if (!c34286nYi.OLrzqt()) {
            strCopydefault = c34286nYi.copydefault() + " (" + c34286nYi.KWHzl() + ")";
        } else {
            strCopydefault = c34286nYi.copydefault();
        }
        return strCopydefault == null ? "" : strCopydefault;
    }
}
