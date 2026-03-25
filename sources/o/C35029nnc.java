package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.find_ui.ranking.hot.adapter.MarketHomeHotRankingSubPage;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nnc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35029nnc extends AbstractC40514qYr<MarketHomeHotRankingSubPage> implements mAR {
    public final java.util.Map<MarketHomeHotRankingSubPage, androidx.fragment.app.Fragment> KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35029nnc(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        this.KWHzl = new LinkedHashMap();
    }

    public final androidx.fragment.app.Fragment KWHzl(int i) {
        MarketHomeHotRankingSubPage marketHomeHotRankingSubPageAhwBna = AhwBna(i);
        java.util.Map<MarketHomeHotRankingSubPage, androidx.fragment.app.Fragment> map = this.KWHzl;
        androidx.fragment.app.Fragment fragment = map.get(marketHomeHotRankingSubPageAhwBna);
        if (fragment == null) {
            if (marketHomeHotRankingSubPageAhwBna == null || (fragment = marketHomeHotRankingSubPageAhwBna.createFragment()) == null) {
                fragment = new androidx.fragment.app.Fragment();
            }
            map.put(marketHomeHotRankingSubPageAhwBna, fragment);
        }
        return fragment;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return KWHzl(i);
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence AEQbTJ(int i) {
        java.lang.String strAYXKKw;
        MarketHomeHotRankingSubPage marketHomeHotRankingSubPageAhwBna = AhwBna(i);
        return (marketHomeHotRankingSubPageAhwBna == null || (strAYXKKw = C33070mpX.AYXKKw(marketHomeHotRankingSubPageAhwBna.getTitleResId())) == null) ? "" : strAYXKKw;
    }

    public final void KWHzl(@NotNull java.util.List<? extends MarketHomeHotRankingSubPage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC40514qYr.submitList$default(this, list, null, 2, null);
    }

    public final java.lang.String copydefault(int i) {
        java.lang.String contentDescription;
        MarketHomeHotRankingSubPage marketHomeHotRankingSubPageAhwBna = AhwBna(i);
        return (marketHomeHotRankingSubPageAhwBna == null || (contentDescription = marketHomeHotRankingSubPageAhwBna.getContentDescription()) == null) ? "" : contentDescription;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(MarketHomeHotRankingSubPage.getEntries().size());
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }

    @Override // o.mAR
    public java.util.List<mAS> KWHzl() {
        int itemCount = getItemCount() - 1;
        java.util.ArrayList arrayList = new java.util.ArrayList(getItemCount());
        if (itemCount >= 0) {
            int i = 0;
            while (true) {
                ActivityResultCaller activityResultCallerKWHzl = KWHzl(i);
                mAS mas = activityResultCallerKWHzl instanceof mAS ? (mAS) activityResultCallerKWHzl : null;
                if (mas != null) {
                    arrayList.add(mas);
                }
                if (i == itemCount) {
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }
}
