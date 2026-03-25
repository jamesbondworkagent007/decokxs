package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.search.features.navigation.options.NavSearchOptionsQuoteListFragment;
import com.okinc.market.search.features.navigation.options.model.NavSearchOptionsQuotePageVo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qNc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40202qNc extends AbstractC40514qYr<NavSearchOptionsQuotePageVo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40202qNc(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        NavSearchOptionsQuotePageVo navSearchOptionsQuotePageVoAhwBna = AhwBna(i);
        return navSearchOptionsQuotePageVoAhwBna == null ? new androidx.fragment.app.Fragment() : NavSearchOptionsQuoteListFragment.Companion.copydefault(navSearchOptionsQuotePageVoAhwBna.createFragment(), navSearchOptionsQuotePageVoAhwBna);
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence AEQbTJ(int i) {
        java.lang.String strAEQbTJ;
        NavSearchOptionsQuotePageVo navSearchOptionsQuotePageVoAhwBna = AhwBna(i);
        return (navSearchOptionsQuotePageVoAhwBna == null || (strAEQbTJ = navSearchOptionsQuotePageVoAhwBna.AEQbTJ()) == null) ? "" : strAEQbTJ;
    }

    public final void EZpvd(@NotNull java.util.List<NavSearchOptionsQuotePageVo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC40514qYr.submitList$default(this, list, null, 2, null);
    }

    public final boolean copydefault() {
        return getItemCount() == 0;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }
}
