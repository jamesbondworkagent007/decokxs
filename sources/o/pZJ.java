package o;

import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.discover.features.markets.MarketsSubPage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pZJ extends AbstractC40514qYr<MarketsSubPage> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pZJ(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        androidx.fragment.app.Fragment fragmentCreateFragment;
        MarketsSubPage marketsSubPageAhwBna = AhwBna(i);
        if (marketsSubPageAhwBna != null && (fragmentCreateFragment = marketsSubPageAhwBna.createFragment()) != null) {
            fragmentCreateFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("name", marketsSubPageAhwBna.name())));
            return fragmentCreateFragment;
        }
        return new androidx.fragment.app.Fragment();
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence AEQbTJ(int i) {
        java.lang.String strAYXKKw;
        MarketsSubPage marketsSubPageAhwBna = AhwBna(i);
        return (marketsSubPageAhwBna == null || (strAYXKKw = C33070mpX.AYXKKw(marketsSubPageAhwBna.getTitleResId())) == null) ? "" : strAYXKKw;
    }

    public final java.lang.CharSequence KWHzl(int i) {
        java.lang.String trackEventPara;
        MarketsSubPage marketsSubPageAhwBna = AhwBna(i);
        return (marketsSubPageAhwBna == null || (trackEventPara = marketsSubPageAhwBna.getTrackEventPara()) == null) ? "" : trackEventPara;
    }

    public final void AEQbTJ(@NotNull java.util.List<? extends MarketsSubPage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC40514qYr.submitList$default(this, list, null, 2, null);
    }

    public final int copydefault(@NotNull MarketsSubPage marketsSubPage) {
        Intrinsics.checkNotNullParameter(marketsSubPage, "");
        return gEmmrt().indexOf(marketsSubPage);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(getItemCount());
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }
}
