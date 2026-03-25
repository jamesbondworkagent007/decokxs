package o;

import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.planet.biz_create_centre.common.CreatorCentreSubPage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.txg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47839txg extends AbstractC47840txh<CreatorCentreSubPage> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47839txg(@NotNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        androidx.fragment.app.Fragment fragmentCreateFragment;
        CreatorCentreSubPage creatorCentreSubPageKWHzl = KWHzl(i);
        if (creatorCentreSubPageKWHzl != null && (fragmentCreateFragment = creatorCentreSubPageKWHzl.createFragment()) != null) {
            fragmentCreateFragment.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("name", creatorCentreSubPageKWHzl.name())));
            return fragmentCreateFragment;
        }
        return new androidx.fragment.app.Fragment();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        if (KWHzl(i) == null) {
            return -1L;
        }
        return r3.ordinal();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public boolean containsItem(long j) {
        java.util.List<CreatorCentreSubPage> listAEQbTJ = AEQbTJ();
        if (!(listAEQbTJ instanceof java.util.Collection) || !listAEQbTJ.isEmpty()) {
            java.util.Iterator<T> it = listAEQbTJ.iterator();
            while (it.hasNext()) {
                if (((CreatorCentreSubPage) it.next()).ordinal() == j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final java.lang.CharSequence AEQbTJ(int i) {
        java.lang.String strAYXKKw;
        CreatorCentreSubPage creatorCentreSubPageKWHzl = KWHzl(i);
        return (creatorCentreSubPageKWHzl == null || (strAYXKKw = C33070mpX.AYXKKw(creatorCentreSubPageKWHzl.getTitleResId())) == null) ? "" : strAYXKKw;
    }

    public static /* synthetic */ void setData$default(C47839txg c47839txg, java.util.List list, java.lang.Runnable runnable, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            runnable = null;
        }
        c47839txg.OLrzqt(list, runnable);
    }

    public final void OLrzqt(@NotNull java.util.List<? extends CreatorCentreSubPage> list, java.lang.Runnable runnable) {
        Intrinsics.checkNotNullParameter(list, "");
        EZpvd(list, runnable);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(CreatorCentreSubPage.values().length);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }
}
