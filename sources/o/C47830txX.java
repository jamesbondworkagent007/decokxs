package o;

import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.planet.biz_home.root.PlanetSubPage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47830txX extends AbstractC47826txT<PlanetSubPage> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47830txX(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        androidx.fragment.app.Fragment fragmentCreateFragment;
        PlanetSubPage planetSubPageCopydefault = copydefault(i);
        if (planetSubPageCopydefault != null && (fragmentCreateFragment = planetSubPageCopydefault.createFragment()) != null) {
            fragmentCreateFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("name", planetSubPageCopydefault.name())));
            return fragmentCreateFragment;
        }
        return new androidx.fragment.app.Fragment();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return copydefault(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence AEQbTJ(int i) {
        java.lang.String strAYXKKw;
        PlanetSubPage planetSubPageCopydefault = copydefault(i);
        return (planetSubPageCopydefault == null || (strAYXKKw = C33070mpX.AYXKKw(planetSubPageCopydefault.getTitleResId())) == null) ? "" : strAYXKKw;
    }

    public static /* synthetic */ void setData$default(C47830txX c47830txX, java.util.List list, java.lang.Runnable runnable, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            runnable = null;
        }
        c47830txX.copydefault(list, runnable);
    }

    public final void copydefault(@NotNull java.util.List<? extends PlanetSubPage> list, java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(list, "");
        KWHzl(list, runnable);
    }

    public final int copydefault(@NotNull PlanetSubPage planetSubPage) {
        Intrinsics.checkNotNullParameter(planetSubPage, "");
        return AEQbTJ().indexOf(planetSubPage);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(PlanetSubPage.values().length);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }
}
