package o;

import androidx.activity.result.ActivityResultCaller;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.find_ui.ranking.newcoin.adapter.MarketNewCoinSubPage;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nns, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35045nns extends AbstractC40514qYr<MarketNewCoinSubPage> implements mAR {
    public final java.util.Map<MarketNewCoinSubPage, androidx.fragment.app.Fragment> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35045nns(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        this.copydefault = new LinkedHashMap();
    }

    private final androidx.fragment.app.Fragment OLrzqt(int i) {
        MarketNewCoinSubPage marketNewCoinSubPageAhwBna = AhwBna(i);
        java.util.Map<MarketNewCoinSubPage, androidx.fragment.app.Fragment> map = this.copydefault;
        androidx.fragment.app.Fragment fragment = map.get(marketNewCoinSubPageAhwBna);
        if (fragment == null) {
            if (marketNewCoinSubPageAhwBna == null || (fragment = marketNewCoinSubPageAhwBna.createFragment()) == null) {
                fragment = new androidx.fragment.app.Fragment();
            }
            map.put(marketNewCoinSubPageAhwBna, fragment);
        }
        return fragment;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return OLrzqt(i);
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence copydefault(int i) {
        java.lang.String strAYXKKw;
        MarketNewCoinSubPage marketNewCoinSubPageAhwBna = AhwBna(i);
        return (marketNewCoinSubPageAhwBna == null || (strAYXKKw = C33070mpX.AYXKKw(marketNewCoinSubPageAhwBna.getTitleResId())) == null) ? "" : strAYXKKw;
    }

    public final void copydefault(@NotNull java.util.List<? extends MarketNewCoinSubPage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC40514qYr.submitList$default(this, list, null, 2, null);
    }

    public final java.lang.String AEQbTJ(int i) {
        java.lang.String contentDescription;
        MarketNewCoinSubPage marketNewCoinSubPageAhwBna = AhwBna(i);
        return (marketNewCoinSubPageAhwBna == null || (contentDescription = marketNewCoinSubPageAhwBna.getContentDescription()) == null) ? "" : contentDescription;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(MarketNewCoinSubPage.values().length);
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
                ActivityResultCaller activityResultCallerOLrzqt = OLrzqt(i);
                mAS mas = activityResultCallerOLrzqt instanceof mAS ? (mAS) activityResultCallerOLrzqt : null;
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
