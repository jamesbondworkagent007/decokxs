package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import com.okinc.market.search.features.navigation.dex.NavSearchDexListFragment;
import com.okinc.market.search.features.navigation.dex.model.NavSearchDexPageVo;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qKd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40122qKd extends AbstractC40514qYr<NavSearchDexPageVo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40122qKd(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        NavSearchDexPageVo navSearchDexPageVoAhwBna = AhwBna(i);
        return navSearchDexPageVoAhwBna == null ? new androidx.fragment.app.Fragment() : NavSearchDexListFragment.Companion.AEQbTJ(navSearchDexPageVoAhwBna.createFragment(), navSearchDexPageVoAhwBna.AEQbTJ());
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence EZpvd(int i) {
        java.lang.String strEZpvd;
        NavSearchDexPageVo navSearchDexPageVoAhwBna = AhwBna(i);
        return (navSearchDexPageVoAhwBna == null || (strEZpvd = navSearchDexPageVoAhwBna.EZpvd()) == null) ? "" : strEZpvd;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qKd */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(C40122qKd c40122qKd, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c40122qKd.KWHzl(list, function0);
    }

    public final void KWHzl(@NotNull java.util.List<NavSearchDexPageVo> list, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        EZpvd(list, function0);
    }

    /* JADX DEBUG: Possible override for method o.qYr.AEQbTJ()Landroidx/recyclerview/widget/AsyncListDiffer; */
    public final boolean AEQbTJ() {
        return getItemCount() == 0;
    }

    public final java.lang.String AEQbTJ(int i) {
        DexChainGroupVo dexChainGroupVoAEQbTJ;
        NavSearchDexPageVo navSearchDexPageVoAhwBna = AhwBna(i);
        if (navSearchDexPageVoAhwBna != null && navSearchDexPageVoAhwBna.copydefault()) {
            return "all";
        }
        java.lang.String strEZpvd = (navSearchDexPageVoAhwBna == null || (dexChainGroupVoAEQbTJ = navSearchDexPageVoAhwBna.AEQbTJ()) == null) ? null : dexChainGroupVoAEQbTJ.EZpvd();
        return strEZpvd == null ? "" : strEZpvd;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(3);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }
}
