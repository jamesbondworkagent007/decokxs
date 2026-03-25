package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.search.features.navigation.futures.NavSearchFuturesListFragment;
import com.okinc.market.search.features.navigation.futures.model.NavSearchFuturesPageVo;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qLD extends AbstractC40514qYr<NavSearchFuturesPageVo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qLD(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        NavSearchFuturesPageVo navSearchFuturesPageVoAhwBna = AhwBna(i);
        return navSearchFuturesPageVoAhwBna == null ? new androidx.fragment.app.Fragment() : NavSearchFuturesListFragment.Companion.EZpvd(navSearchFuturesPageVoAhwBna.createFragment(), navSearchFuturesPageVoAhwBna.copydefault());
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence copydefault(int i) {
        java.lang.String strKWHzl;
        NavSearchFuturesPageVo navSearchFuturesPageVoAhwBna = AhwBna(i);
        if (navSearchFuturesPageVoAhwBna != null) {
            navSearchFuturesPageVoAhwBna.EZpvd();
        }
        if (navSearchFuturesPageVoAhwBna == null || !navSearchFuturesPageVoAhwBna.EZpvd()) {
            return (navSearchFuturesPageVoAhwBna == null || (strKWHzl = navSearchFuturesPageVoAhwBna.KWHzl()) == null) ? "" : strKWHzl;
        }
        return C33070mpX.AYXKKw(C55688xof.Application.sbu);
    }

    public final int AEQbTJ(@NotNull CategoryGroupVo categoryGroupVo) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        java.util.List<NavSearchFuturesPageVo> listGEmmrt = gEmmrt();
        java.util.Iterator<T> it = gEmmrt().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((NavSearchFuturesPageVo) next).copydefault().gEmmrt().getId(), (java.lang.Object) categoryGroupVo.gEmmrt().getId())) {
                break;
            }
        }
        return CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends java.lang.Object>) listGEmmrt, next);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qLD */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(qLD qld, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        qld.AEQbTJ(list, function0);
    }

    public final void AEQbTJ(@NotNull java.util.List<NavSearchFuturesPageVo> list, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        EZpvd(list, function0);
    }

    public final boolean OLrzqt() {
        return getItemCount() == 0;
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
