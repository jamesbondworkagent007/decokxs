package o;

import com.okinc.dexkline.dexui.main.market.detail.adapter.CoinDetailTabInfo;
import com.okinc.dexkline.dexui.main.market.detail.fragment.DexMarketDetailFragment;
import com.okinc.dexkline.market.features.coindetail.domain.type.CoinDetailTabType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class mRU extends mRV {
    public final DexMarketDetailFragment AEQbTJ;
    public java.util.ArrayList<CoinDetailTabInfo> KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mRU(@NotNull DexMarketDetailFragment dexMarketDetailFragment, @NotNull java.util.ArrayList<CoinDetailTabInfo> arrayList) {
        super(dexMarketDetailFragment);
        Intrinsics.checkNotNullParameter(dexMarketDetailFragment, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.AEQbTJ = dexMarketDetailFragment;
        this.KWHzl = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.KWHzl.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return this.KWHzl.get(i).getFragmentCreator().invoke();
    }

    @Override // o.mRV
    public androidx.fragment.app.Fragment copydefault(int i) {
        return this.AEQbTJ.getChildFragmentManager().findFragmentByTag("f" + i);
    }

    public final CoinDetailTabInfo AEQbTJ(int i) {
        return (CoinDetailTabInfo) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
    }

    public final int KWHzl(@NotNull CoinDetailTabType coinDetailTabType) {
        Intrinsics.checkNotNullParameter(coinDetailTabType, "");
        java.util.Iterator<CoinDetailTabInfo> it = this.KWHzl.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().getTabType() == coinDetailTabType) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
