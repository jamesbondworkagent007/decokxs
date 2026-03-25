package o;

import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.search.features.main.result.ui.SubPage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class qEZ extends AbstractC40514qYr<SubPage> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qEZ(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        androidx.fragment.app.Fragment fragmentCreateFragment;
        SubPage subPageAhwBna = AhwBna(i);
        if (subPageAhwBna != null && (fragmentCreateFragment = subPageAhwBna.createFragment()) != null) {
            fragmentCreateFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt(SubPage.class.getSimpleName(), subPageAhwBna.name())));
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
        SubPage subPageAhwBna = AhwBna(i);
        return (subPageAhwBna == null || (strAYXKKw = C33070mpX.AYXKKw(subPageAhwBna.getTitleResId())) == null) ? "" : strAYXKKw;
    }

    public final java.lang.String copydefault(int i) {
        java.lang.String trackSubType;
        SubPage subPageAhwBna = AhwBna(i);
        return (subPageAhwBna == null || (trackSubType = subPageAhwBna.getTrackSubType()) == null) ? "" : trackSubType;
    }

    public final void EZpvd(@NotNull java.util.List<? extends SubPage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC40514qYr.submitList$default(this, list, null, 2, null);
    }

    public final int AEQbTJ(@NotNull SubPage subPage) {
        Intrinsics.checkNotNullParameter(subPage, "");
        return gEmmrt().indexOf(subPage);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(SubPage.values().length);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }
}
