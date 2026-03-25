package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qNa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C40200qNa extends AbstractC40514qYr<InterfaceC40204qNe> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40200qNa(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        InterfaceC40204qNe interfaceC40204qNeAhwBna = AhwBna(i);
        return interfaceC40204qNeAhwBna == null ? new androidx.fragment.app.Fragment() : interfaceC40204qNeAhwBna.createFragment();
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence copydefault(int i) {
        java.lang.String strAYXKKw;
        InterfaceC40204qNe interfaceC40204qNeAhwBna = AhwBna(i);
        return (interfaceC40204qNeAhwBna == null || (strAYXKKw = C33070mpX.AYXKKw(interfaceC40204qNeAhwBna.KWHzl())) == null) ? "" : strAYXKKw;
    }

    public final void KWHzl(@NotNull java.util.List<? extends InterfaceC40204qNe> list) {
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
