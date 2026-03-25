package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qeo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40803qeo extends AbstractC40514qYr<InterfaceC40812qex> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? "" : "options_copilot" : "simple_options" : "contracts_list" : "options_chain";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40803qeo(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        InterfaceC40812qex interfaceC40812qexAhwBna = AhwBna(i);
        return interfaceC40812qexAhwBna == null ? new androidx.fragment.app.Fragment() : interfaceC40812qexAhwBna.createFragment();
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence KWHzl(int i) {
        java.lang.String strAYXKKw;
        InterfaceC40812qex interfaceC40812qexAhwBna = AhwBna(i);
        return (interfaceC40812qexAhwBna == null || (strAYXKKw = C33070mpX.AYXKKw(interfaceC40812qexAhwBna.AEQbTJ())) == null) ? "" : strAYXKKw;
    }

    public final void KWHzl(@NotNull java.util.List<? extends InterfaceC40812qex> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC40514qYr.submitList$default(this, list, null, 2, null);
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
