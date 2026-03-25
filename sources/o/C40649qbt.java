package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.discover.features.markets.sub.dex.MarketDiscoverDexListFragment;
import com.okinc.market.discover.features.markets.sub.dex.model.DiscoverDexPageVo;
import com.okinc.market.quotation.ui.model.dex.DexChainGroupVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qbt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40649qbt extends AbstractC40514qYr<DiscoverDexPageVo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40649qbt(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        DiscoverDexPageVo discoverDexPageVoAhwBna = AhwBna(i);
        return discoverDexPageVoAhwBna == null ? new androidx.fragment.app.Fragment() : MarketDiscoverDexListFragment.Companion.AEQbTJ(discoverDexPageVoAhwBna.createFragment(), discoverDexPageVoAhwBna.KWHzl());
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence AEQbTJ(int i) {
        java.lang.String strOLrzqt;
        DiscoverDexPageVo discoverDexPageVoAhwBna = AhwBna(i);
        return (discoverDexPageVoAhwBna == null || (strOLrzqt = discoverDexPageVoAhwBna.OLrzqt()) == null) ? "" : strOLrzqt;
    }

    public final java.lang.String KWHzl(int i) {
        DexChainGroupVo dexChainGroupVoKWHzl;
        DiscoverDexPageVo discoverDexPageVoAhwBna = AhwBna(i);
        if (discoverDexPageVoAhwBna != null && discoverDexPageVoAhwBna.EZpvd()) {
            return "all";
        }
        java.lang.String strEZpvd = (discoverDexPageVoAhwBna == null || (dexChainGroupVoKWHzl = discoverDexPageVoAhwBna.KWHzl()) == null) ? null : dexChainGroupVoKWHzl.EZpvd();
        return strEZpvd == null ? "" : strEZpvd;
    }

    public final void OLrzqt(@NotNull java.util.List<DiscoverDexPageVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC40514qYr.submitList$default(this, list, null, 2, null);
    }

    public final boolean KWHzl() {
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
