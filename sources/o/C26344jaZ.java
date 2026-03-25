package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.business.invest_biz.data.usecase.DexEntranceProductQuery;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jaZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26344jaZ extends FragmentStateAdapter {
    public final java.util.Map<java.lang.Integer, androidx.fragment.app.Fragment> AEQbTJ;
    public final java.util.List<DexEntranceProductQuery> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26344jaZ(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        this.copydefault = new java.util.ArrayList();
        this.AEQbTJ = new LinkedHashMap();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        java.util.Map<java.lang.Integer, androidx.fragment.app.Fragment> map = this.AEQbTJ;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        androidx.fragment.app.Fragment fragmentCopydefault = map.get(numValueOf);
        if (fragmentCopydefault == null) {
            fragmentCopydefault = C26330jaL.Companion.copydefault(this.copydefault.get(i));
            map.put(numValueOf, fragmentCopydefault);
        }
        return fragmentCopydefault;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }

    public final void AEQbTJ(@NotNull java.util.List<DexEntranceProductQuery> list) {
        Intrinsics.checkNotNullParameter(list, "");
        OLrzqt(list);
        if (!this.AEQbTJ.isEmpty()) {
            int size = list.size();
            int size2 = this.AEQbTJ.size() - 1;
            if (size2 >= 0 && size2 < size) {
                for (Map.Entry<java.lang.Integer, androidx.fragment.app.Fragment> entry : this.AEQbTJ.entrySet()) {
                    int iIntValue = entry.getKey().intValue();
                    androidx.fragment.app.Fragment value = entry.getValue();
                    Intrinsics.copydefault(value, "");
                    ((C26330jaL) value).AEQbTJ(list.get(iIntValue));
                }
            }
        }
        notifyDataSetChanged();
    }

    public final void OLrzqt(@NotNull java.util.List<DexEntranceProductQuery> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault.clear();
        this.copydefault.addAll(list);
    }
}
