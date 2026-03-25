package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.discover.features.markets.sub.futures.MarketDiscoverFuturesListFragment;
import com.okinc.market.discover.features.markets.sub.futures.model.DiscoverFuturesPageVo;
import com.okinc.market.quotation.ui.model.CategoryGroupVo;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.pVX;
import o.qZH;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qdd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40739qdd extends AbstractC40514qYr<DiscoverFuturesPageVo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40739qdd(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        DiscoverFuturesPageVo discoverFuturesPageVoAhwBna = AhwBna(i);
        return discoverFuturesPageVoAhwBna == null ? new androidx.fragment.app.Fragment() : MarketDiscoverFuturesListFragment.Companion.AEQbTJ(discoverFuturesPageVoAhwBna.createFragment(), discoverFuturesPageVoAhwBna.EZpvd());
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence EZpvd(int i) {
        java.lang.String strAEQbTJ;
        DiscoverFuturesPageVo discoverFuturesPageVoAhwBna = AhwBna(i);
        CategoryGroupVo categoryGroupVoEZpvd = discoverFuturesPageVoAhwBna != null ? discoverFuturesPageVoAhwBna.EZpvd() : null;
        CategoryGroupVo.TaskDescription taskDescription = CategoryGroupVo.Companion;
        if (Intrinsics.EZpvd(categoryGroupVoEZpvd, taskDescription.KWHzl())) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.GiPPlLRPuVlr);
        }
        if (Intrinsics.EZpvd(categoryGroupVoEZpvd, taskDescription.gEmmrt())) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.fZc);
        }
        if (Intrinsics.EZpvd(categoryGroupVoEZpvd, taskDescription.OLrzqt())) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.zvzmfz);
        }
        if (Intrinsics.EZpvd(categoryGroupVoEZpvd, taskDescription.EZpvd())) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.unregister);
        }
        if (Intrinsics.EZpvd(categoryGroupVoEZpvd, taskDescription.AEQbTJ())) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.Dff);
        }
        if (Intrinsics.EZpvd(categoryGroupVoEZpvd, taskDescription.copydefault())) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.onReceive);
        }
        if (Intrinsics.EZpvd(categoryGroupVoEZpvd, taskDescription.djBIcL())) {
            return C33070mpX.AYXKKw(qZH.PendingIntent.GiPPlLgiPPlL);
        }
        if (Intrinsics.EZpvd(categoryGroupVoEZpvd, taskDescription.AYXKKw())) {
            return C33070mpX.AYXKKw(pVX.LoaderManager.hDKMBd);
        }
        return (discoverFuturesPageVoAhwBna == null || (strAEQbTJ = discoverFuturesPageVoAhwBna.AEQbTJ()) == null) ? "" : strAEQbTJ;
    }

    public final int AEQbTJ(@NotNull CategoryGroupVo categoryGroupVo) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(categoryGroupVo, "");
        java.util.List<DiscoverFuturesPageVo> listGEmmrt = gEmmrt();
        java.util.Iterator<T> it = gEmmrt().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.EZpvd((java.lang.Object) ((DiscoverFuturesPageVo) next).EZpvd().gEmmrt().getId(), (java.lang.Object) categoryGroupVo.gEmmrt().getId())) {
                break;
            }
        }
        return CollectionsKt___CollectionsKt.copydefault((java.util.List<? extends java.lang.Object>) listGEmmrt, next);
    }

    public final java.lang.CharSequence copydefault(int i) {
        java.lang.String strCopydefault;
        DiscoverFuturesPageVo discoverFuturesPageVoAhwBna = AhwBna(i);
        return (discoverFuturesPageVoAhwBna == null || (strCopydefault = discoverFuturesPageVoAhwBna.copydefault()) == null) ? "" : strCopydefault;
    }

    public final void OLrzqt(@NotNull java.util.List<DiscoverFuturesPageVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC40514qYr.submitList$default(this, list, null, 2, null);
    }

    public final boolean OLrzqt() {
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
