package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.discover.features.markets.sub.dex.MarketDiscoverDexListFragment;
import com.okinc.market.search.features.favorite.ui.dex.model.FavoriteDexPageVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qzC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41878qzC extends AbstractC40514qYr<FavoriteDexPageVo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41878qzC(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        FavoriteDexPageVo favoriteDexPageVoAhwBna = AhwBna(i);
        return favoriteDexPageVoAhwBna == null ? new androidx.fragment.app.Fragment() : MarketDiscoverDexListFragment.Companion.AEQbTJ(favoriteDexPageVoAhwBna.createFragment(), favoriteDexPageVoAhwBna.copydefault());
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence copydefault(int i) {
        java.lang.String strEZpvd;
        FavoriteDexPageVo favoriteDexPageVoAhwBna = AhwBna(i);
        return (favoriteDexPageVoAhwBna == null || (strEZpvd = favoriteDexPageVoAhwBna.EZpvd()) == null) ? "" : strEZpvd;
    }

    public final void KWHzl(@NotNull java.util.List<FavoriteDexPageVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC40514qYr.submitList$default(this, list, null, 2, null);
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
