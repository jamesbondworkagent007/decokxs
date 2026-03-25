package o;

import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.discover.features.root.DiscoverSubPage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qoJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C41302qoJ extends AbstractC40514qYr<DiscoverSubPage> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41302qoJ(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        androidx.fragment.app.Fragment fragmentCreateFragment;
        DiscoverSubPage discoverSubPageAhwBna = AhwBna(i);
        if (discoverSubPageAhwBna != null && (fragmentCreateFragment = discoverSubPageAhwBna.createFragment()) != null) {
            fragmentCreateFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("name", discoverSubPageAhwBna.name())));
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
        DiscoverSubPage discoverSubPageAhwBna = AhwBna(i);
        return (discoverSubPageAhwBna == null || (strAYXKKw = C33070mpX.AYXKKw(discoverSubPageAhwBna.getTitleResId())) == null) ? "" : strAYXKKw;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.qYr.submitList$default(o.qYr, java.util.List, kotlin.jvm.functions.Function0, int, java.lang.Object):void */
    public final void OLrzqt(@NotNull java.util.List<? extends DiscoverSubPage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC40514qYr.submitList$default(this, list, null, 2, null);
    }

    public final int EZpvd(@NotNull DiscoverSubPage discoverSubPage) {
        Intrinsics.checkNotNullParameter(discoverSubPage, "");
        return gEmmrt().indexOf(discoverSubPage);
    }

    public final java.lang.CharSequence EZpvd(int i) {
        java.lang.String trackEventPara;
        DiscoverSubPage discoverSubPageAhwBna = AhwBna(i);
        return (discoverSubPageAhwBna == null || (trackEventPara = discoverSubPageAhwBna.getTrackEventPara()) == null) ? "" : trackEventPara;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(DiscoverSubPage.values().length);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }
}
