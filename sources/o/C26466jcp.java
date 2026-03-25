package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.business.invest_biz.data.usecase.V2ProductQuery;
import com.okinc.business.invest_biz.ui.screens.home.CommonProductListFragment;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jcp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C26466jcp extends FragmentStateAdapter {
    public final java.util.List<V2ProductQuery> AEQbTJ;
    public final java.util.Map<java.lang.Integer, androidx.fragment.app.Fragment> OLrzqt;
    public final java.util.List<java.util.List<C24148iWr>> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26466jcp(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        this.AEQbTJ = new java.util.ArrayList();
        this.copydefault = new java.util.ArrayList();
        this.OLrzqt = new LinkedHashMap();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        java.util.Map<java.lang.Integer, androidx.fragment.app.Fragment> map = this.OLrzqt;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        androidx.fragment.app.Fragment fragmentOLrzqt = map.get(numValueOf);
        if (fragmentOLrzqt == null) {
            fragmentOLrzqt = CommonProductListFragment.Companion.OLrzqt(this.AEQbTJ.get(i), (i < 0 || i >= this.copydefault.size()) ? yDY.AhwBna() : this.copydefault.get(i));
            map.put(numValueOf, fragmentOLrzqt);
        }
        return fragmentOLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jcp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void submitList$default(C26466jcp c26466jcp, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: submitList");
        }
        if ((i & 2) != 0) {
            list2 = yDY.AhwBna();
        }
        c26466jcp.KWHzl(list, list2);
    }

    public final void KWHzl(@NotNull java.util.List<V2ProductQuery> list, @NotNull java.util.List<? extends java.util.List<C24148iWr>> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        EZpvd(list, list2);
        if (!this.OLrzqt.isEmpty()) {
            int size = list.size();
            int size2 = this.OLrzqt.size() - 1;
            if (size2 >= 0 && size2 < size) {
                for (Map.Entry<java.lang.Integer, androidx.fragment.app.Fragment> entry : this.OLrzqt.entrySet()) {
                    int iIntValue = entry.getKey().intValue();
                    androidx.fragment.app.Fragment value = entry.getValue();
                    Intrinsics.copydefault(value, "");
                    ((CommonProductListFragment) value).EZpvd(list.get(iIntValue), (iIntValue < 0 || iIntValue >= list2.size()) ? yDY.AhwBna() : list2.get(iIntValue));
                }
            }
        }
        notifyDataSetChanged();
    }

    public final void EZpvd(java.util.List<V2ProductQuery> list, java.util.List<? extends java.util.List<C24148iWr>> list2) {
        this.AEQbTJ.clear();
        this.AEQbTJ.addAll(list);
        this.copydefault.clear();
        this.copydefault.addAll(list2);
    }
}
