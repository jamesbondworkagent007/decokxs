package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.discover.features.markets.sub.options.MarketDiscoverOptionsQuoteListFragment;
import com.okinc.market.discover.features.markets.sub.options.model.DiscoverOptionsQuotePageVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qer, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40806qer extends AbstractC40514qYr<DiscoverOptionsQuotePageVo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40806qer(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        DiscoverOptionsQuotePageVo discoverOptionsQuotePageVoAhwBna = AhwBna(i);
        return discoverOptionsQuotePageVoAhwBna == null ? new androidx.fragment.app.Fragment() : MarketDiscoverOptionsQuoteListFragment.Companion.OLrzqt(discoverOptionsQuotePageVoAhwBna.createFragment(), discoverOptionsQuotePageVoAhwBna);
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence KWHzl(int i) {
        java.lang.String strCopydefault;
        DiscoverOptionsQuotePageVo discoverOptionsQuotePageVoAhwBna = AhwBna(i);
        return (discoverOptionsQuotePageVoAhwBna == null || (strCopydefault = discoverOptionsQuotePageVoAhwBna.copydefault()) == null) ? "" : strCopydefault;
    }

    public final void KWHzl(@NotNull java.util.List<DiscoverOptionsQuotePageVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC40514qYr.submitList$default(this, list, null, 2, null);
    }

    public final boolean EZpvd() {
        return getItemCount() == 0;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }
}
