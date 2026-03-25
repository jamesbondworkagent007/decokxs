package o;

import com.okinc.business.dexui.main.market.detail.adapter.CoinDetailTabInfo;
import com.okinc.business.dexui.main.market.detail.fragment.MarketDetailFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hPv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C21882hPv extends AbstractC21883hPw {
    public final MarketDetailFragment AEQbTJ;
    public java.util.List<CoinDetailTabInfo> KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21882hPv(@NotNull MarketDetailFragment marketDetailFragment, @NotNull java.util.List<CoinDetailTabInfo> list) {
        super(marketDetailFragment);
        Intrinsics.checkNotNullParameter(marketDetailFragment, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = marketDetailFragment;
        this.KWHzl = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.KWHzl.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return this.KWHzl.get(i).getFragmentCreator().invoke();
    }

    @Override // o.AbstractC21883hPw
    public androidx.fragment.app.Fragment KWHzl(int i) {
        return this.AEQbTJ.getChildFragmentManager().findFragmentByTag("f" + i);
    }

    public void copydefault(CoinDetailTabInfo coinDetailTabInfo) {
        if (coinDetailTabInfo == null) {
            return;
        }
        java.util.Iterator<CoinDetailTabInfo> it = this.KWHzl.iterator();
        while (it.hasNext()) {
            if (it.next().getTabType() == coinDetailTabInfo.getTabType()) {
                return;
            }
        }
        java.util.List<CoinDetailTabInfo> list = this.KWHzl;
        list.add(list.size(), coinDetailTabInfo);
    }
}
