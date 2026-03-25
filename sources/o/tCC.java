package o;

import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.planet.biz_plugin.future.data.FutureTabPage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class tCC extends AbstractC47826txT<FutureTabPage> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tCC(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        androidx.fragment.app.Fragment fragmentCreateFragment;
        FutureTabPage futureTabPageCopydefault = copydefault(i);
        if (futureTabPageCopydefault != null && (fragmentCreateFragment = futureTabPageCopydefault.createFragment()) != null) {
            fragmentCreateFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("name", futureTabPageCopydefault.name())));
            return fragmentCreateFragment;
        }
        return new androidx.fragment.app.Fragment();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return copydefault(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence EZpvd(int i) {
        java.lang.String strAYXKKw;
        FutureTabPage futureTabPageCopydefault = copydefault(i);
        return (futureTabPageCopydefault == null || (strAYXKKw = C33070mpX.AYXKKw(futureTabPageCopydefault.getTitleResId())) == null) ? "" : strAYXKKw;
    }

    public final void copydefault(@NotNull java.util.List<? extends FutureTabPage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC47826txT.submitList$default(this, list, null, 2, null);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(FutureTabPage.values().length);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }
}
