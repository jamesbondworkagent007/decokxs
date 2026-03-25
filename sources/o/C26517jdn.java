package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.business.invest_biz.ui.screens.home.InvestHomeFragmentV2;
import com.okinc.business.invest_biz.ui.screens.home.container.InvestHomeContainerFragment;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jdn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26517jdn extends FragmentStateAdapter {
    public java.util.HashSet<java.lang.Integer> AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26517jdn(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        this.AEQbTJ = CollectionsKt___CollectionsKt.QKudOq(InvestHomeContainerFragment.Companion.AEQbTJ().keySet());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    /* JADX DEBUG: Method merged with bridge method: createFragment(I)Landroidx/fragment/app/Fragment; */
    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
    public InvestHomeFragmentV2 createFragment(int i) {
        if (EZpvd(i) == 0) {
            return InvestHomeFragmentV2.Companion.KWHzl();
        }
        throw new java.lang.IllegalArgumentException("Unknown position: " + i);
    }

    public final int EZpvd(int i) {
        java.util.Set<java.lang.Integer> setKeySet = InvestHomeContainerFragment.Companion.AEQbTJ().keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : setKeySet) {
            if (this.AEQbTJ.contains(java.lang.Integer.valueOf(((java.lang.Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        return ((java.lang.Number) ((i < 0 || i >= arrayList.size()) ? -1 : arrayList.get(i))).intValue();
    }
}
