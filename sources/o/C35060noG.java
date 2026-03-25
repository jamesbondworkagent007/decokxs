package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.find_ui.ranking.stock.adapter.MarketStockSubPage;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.noG, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C35060noG extends AbstractC40514qYr<MarketStockSubPage> implements mAR {
    public final java.util.Map<java.lang.Long, WeakReference<androidx.fragment.app.Fragment>> OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35060noG(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        this.OLrzqt = new LinkedHashMap();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        androidx.fragment.app.Fragment fragment;
        MarketStockSubPage marketStockSubPageAhwBna = AhwBna(i);
        if (marketStockSubPageAhwBna == null || (fragment = marketStockSubPageAhwBna.createFragment()) == null) {
            fragment = new androidx.fragment.app.Fragment();
        }
        this.OLrzqt.put(java.lang.Long.valueOf(getItemId(i)), new WeakReference<>(fragment));
        return fragment;
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence KWHzl(int i) {
        java.lang.String strAYXKKw;
        MarketStockSubPage marketStockSubPageAhwBna = AhwBna(i);
        return (marketStockSubPageAhwBna == null || (strAYXKKw = C33070mpX.AYXKKw(marketStockSubPageAhwBna.getTitleResId())) == null) ? "" : strAYXKKw;
    }

    public final java.lang.String AEQbTJ(int i) {
        java.lang.String contentDescription;
        MarketStockSubPage marketStockSubPageAhwBna = AhwBna(i);
        return (marketStockSubPageAhwBna == null || (contentDescription = marketStockSubPageAhwBna.getContentDescription()) == null) ? "" : contentDescription;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.noG */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(C35060noG c35060noG, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c35060noG.OLrzqt(list, function0);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(MarketStockSubPage.getEntries().size());
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }

    @Override // o.mAR
    public java.util.List<mAS> KWHzl() {
        java.util.Collection<WeakReference<androidx.fragment.app.Fragment>> collectionValues = this.OLrzqt.values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            java.lang.Object obj = ((WeakReference) it.next()).get();
            mAS mas = obj instanceof mAS ? (mAS) obj : null;
            if (mas != null) {
                arrayList.add(mas);
            }
        }
        return arrayList;
    }

    public final void OLrzqt(@NotNull java.util.List<? extends MarketStockSubPage> list, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Long.valueOf(((MarketStockSubPage) it.next()).hashCode()));
        }
        java.util.Set setOqFWZa = CollectionsKt___CollectionsKt.OqFWZa(arrayList);
        java.util.Set<java.lang.Long> setKeySet = this.OLrzqt.keySet();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : setKeySet) {
            if (!setOqFWZa.contains(java.lang.Long.valueOf(((java.lang.Number) obj).longValue()))) {
                arrayList2.add(obj);
            }
        }
        java.util.Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            this.OLrzqt.remove(java.lang.Long.valueOf(((java.lang.Number) it2.next()).longValue()));
        }
        EZpvd(list, function0);
    }
}
