package o;

import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.ranking.features.main.ui.RankingSubPage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qvM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41676qvM extends AbstractC40514qYr<RankingSubPage> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41676qvM(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        androidx.fragment.app.Fragment fragmentCreateFragment;
        RankingSubPage rankingSubPageAhwBna = AhwBna(i);
        if (rankingSubPageAhwBna != null && (fragmentCreateFragment = rankingSubPageAhwBna.createFragment()) != null) {
            fragmentCreateFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt(RankingSubPage.class.getSimpleName(), rankingSubPageAhwBna.name())));
            return fragmentCreateFragment;
        }
        return new androidx.fragment.app.Fragment();
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter
    public boolean containsItem(long j) {
        java.util.List<RankingSubPage> listGEmmrt = gEmmrt();
        if (!(listGEmmrt instanceof java.util.Collection) || !listGEmmrt.isEmpty()) {
            java.util.Iterator<T> it = listGEmmrt.iterator();
            while (it.hasNext()) {
                if (((RankingSubPage) it.next()).hashCode() == j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void EZpvd(@NotNull java.util.List<? extends RankingSubPage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC40514qYr.submitList$default(this, list, null, 2, null);
    }

    public final java.lang.String KWHzl(int i) {
        java.lang.String trackSubType;
        RankingSubPage rankingSubPageAhwBna = AhwBna(i);
        return (rankingSubPageAhwBna == null || (trackSubType = rankingSubPageAhwBna.getTrackSubType()) == null) ? "" : trackSubType;
    }

    public final java.lang.String EZpvd(int i) {
        java.lang.String strAYXKKw;
        RankingSubPage rankingSubPageAhwBna = AhwBna(i);
        return (rankingSubPageAhwBna == null || (strAYXKKw = C33070mpX.AYXKKw(rankingSubPageAhwBna.getTitleResId())) == null) ? "" : strAYXKKw;
    }

    public final java.lang.String OLrzqt(int i) {
        java.lang.String strAYXKKw;
        RankingSubPage rankingSubPageAhwBna = AhwBna(i);
        return (rankingSubPageAhwBna == null || (strAYXKKw = C33070mpX.AYXKKw(rankingSubPageAhwBna.getSubTitleResId())) == null) ? "" : strAYXKKw;
    }

    public final java.lang.String copydefault(int i) {
        java.lang.String trackSubType;
        RankingSubPage rankingSubPageAhwBna = AhwBna(i);
        return (rankingSubPageAhwBna == null || (trackSubType = rankingSubPageAhwBna.getTrackSubType()) == null) ? "" : trackSubType;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(RankingSubPage.values().length);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }
}
