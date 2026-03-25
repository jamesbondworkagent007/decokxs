package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.search.features.kline.landscape.model.LandscapeNavSearchSubPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qBb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C39877qBb extends AbstractC40514qYr<LandscapeNavSearchSubPage> {
    public androidx.fragment.app.Fragment copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39877qBb(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        androidx.fragment.app.Fragment fragmentCreateFragment;
        LandscapeNavSearchSubPage landscapeNavSearchSubPageAhwBna = AhwBna(i);
        if (landscapeNavSearchSubPageAhwBna != LandscapeNavSearchSubPage.DEFAULT) {
            return (landscapeNavSearchSubPageAhwBna == null || (fragmentCreateFragment = landscapeNavSearchSubPageAhwBna.createFragment()) == null) ? new androidx.fragment.app.Fragment() : fragmentCreateFragment;
        }
        androidx.fragment.app.Fragment fragment = this.copydefault;
        if (fragment != null) {
            return fragment;
        }
        androidx.fragment.app.Fragment fragmentCreateFragment2 = landscapeNavSearchSubPageAhwBna.createFragment();
        this.copydefault = fragmentCreateFragment2;
        return fragmentCreateFragment2;
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence EZpvd(int i) {
        java.lang.String tabTitle;
        LandscapeNavSearchSubPage landscapeNavSearchSubPageAhwBna = AhwBna(i);
        return (landscapeNavSearchSubPageAhwBna == null || (tabTitle = landscapeNavSearchSubPageAhwBna.getTabTitle()) == null) ? "" : tabTitle;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qBb */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(C39877qBb c39877qBb, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c39877qBb.KWHzl(list, function0);
    }

    public final void KWHzl(@NotNull java.util.List<? extends LandscapeNavSearchSubPage> list, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        EZpvd(list, function0);
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
