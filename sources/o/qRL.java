package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import com.okinc.market.search.features.navigation.spot.NavSearchSpotListFragment;
import com.okinc.market.search.features.navigation.spot.model.NavSearchSpotPageVo;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qRL extends AbstractC40514qYr<NavSearchSpotPageVo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qRL(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        NavSearchSpotPageVo navSearchSpotPageVoAhwBna = AhwBna(i);
        return navSearchSpotPageVoAhwBna == null ? new androidx.fragment.app.Fragment() : NavSearchSpotListFragment.Companion.copydefault(navSearchSpotPageVoAhwBna.createFragment(), navSearchSpotPageVoAhwBna.AEQbTJ());
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence KWHzl(int i) {
        java.lang.String strOLrzqt;
        NavSearchSpotPageVo navSearchSpotPageVoAhwBna = AhwBna(i);
        return (navSearchSpotPageVoAhwBna == null || (strOLrzqt = navSearchSpotPageVoAhwBna.OLrzqt()) == null) ? "" : strOLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qRL */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(qRL qrl, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        qrl.copydefault(list, function0);
    }

    public final void copydefault(@NotNull java.util.List<NavSearchSpotPageVo> list, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        EZpvd(list, function0);
    }

    public final boolean copydefault() {
        return getItemCount() == 0;
    }

    public final int OLrzqt(@NotNull CategoryGroupVo categoryGroupVo) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        java.util.List<NavSearchSpotPageVo> listGEmmrt = gEmmrt();
        java.util.Iterator<T> it = gEmmrt().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((NavSearchSpotPageVo) next).AEQbTJ().gEmmrt().getId(), (java.lang.Object) categoryGroupVo.gEmmrt().getId())) {
                break;
            }
        }
        return CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends java.lang.Object>) listGEmmrt, next);
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
