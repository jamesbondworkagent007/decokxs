package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.find_ui.ranking.percentchange.adapter.MarketHomeUpRankingSubPage;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.noa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35080noa extends AbstractC40514qYr<MarketHomeUpRankingSubPage> implements mAR {
    public final java.util.Map<MarketHomeUpRankingSubPage, androidx.fragment.app.Fragment> AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35080noa(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        this.AEQbTJ = new LinkedHashMap();
    }

    private final androidx.fragment.app.Fragment KWHzl(int i) {
        MarketHomeUpRankingSubPage marketHomeUpRankingSubPageAhwBna = AhwBna(i);
        java.util.Map<MarketHomeUpRankingSubPage, androidx.fragment.app.Fragment> map = this.AEQbTJ;
        androidx.fragment.app.Fragment fragment = map.get(marketHomeUpRankingSubPageAhwBna);
        if (fragment == null) {
            if (marketHomeUpRankingSubPageAhwBna == null || (fragment = marketHomeUpRankingSubPageAhwBna.createFragment()) == null) {
                fragment = new androidx.fragment.app.Fragment();
            }
            map.put(marketHomeUpRankingSubPageAhwBna, fragment);
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

    public final java.lang.CharSequence copydefault(int i) {
        java.lang.String strAYXKKw;
        MarketHomeUpRankingSubPage marketHomeUpRankingSubPageAhwBna = AhwBna(i);
        return (marketHomeUpRankingSubPageAhwBna == null || (strAYXKKw = C33070mpX.AYXKKw(marketHomeUpRankingSubPageAhwBna.getTitleResId())) == null) ? "" : strAYXKKw;
    }

    public final void copydefault(@NotNull java.util.List<? extends MarketHomeUpRankingSubPage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC40514qYr.submitList$default(this, list, null, 2, null);
    }

    public final java.lang.String OLrzqt(int i) {
        java.lang.String contentDescription;
        MarketHomeUpRankingSubPage marketHomeUpRankingSubPageAhwBna = AhwBna(i);
        return (marketHomeUpRankingSubPageAhwBna == null || (contentDescription = marketHomeUpRankingSubPageAhwBna.getContentDescription()) == null) ? "" : contentDescription;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(MarketHomeUpRankingSubPage.values().length);
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
