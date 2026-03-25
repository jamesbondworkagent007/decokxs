package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.search.features.navigation.selection.ui.model.SelectionNavSearchSubPage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qQg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40287qQg extends AbstractC40514qYr<SelectionNavSearchSubPage> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40287qQg(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        androidx.fragment.app.Fragment fragmentCreateFragment;
        SelectionNavSearchSubPage selectionNavSearchSubPageAhwBna = AhwBna(i);
        return (selectionNavSearchSubPageAhwBna == null || (fragmentCreateFragment = selectionNavSearchSubPageAhwBna.createFragment()) == null) ? new androidx.fragment.app.Fragment() : fragmentCreateFragment;
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence AEQbTJ(int i) {
        java.lang.String strAYXKKw;
        SelectionNavSearchSubPage selectionNavSearchSubPageAhwBna = AhwBna(i);
        return (selectionNavSearchSubPageAhwBna == null || (strAYXKKw = C33070mpX.AYXKKw(selectionNavSearchSubPageAhwBna.getTitleResId())) == null) ? "" : strAYXKKw;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qQg */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(C40287qQg c40287qQg, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        c40287qQg.copydefault(list, function0);
    }

    public final void copydefault(@NotNull java.util.List<? extends SelectionNavSearchSubPage> list, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        EZpvd(list, function0);
    }

    public final int EZpvd(@NotNull SelectionNavSearchSubPage selectionNavSearchSubPage) {
        Intrinsics.checkNotNullParameter(selectionNavSearchSubPage, "");
        return gEmmrt().indexOf(selectionNavSearchSubPage);
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
