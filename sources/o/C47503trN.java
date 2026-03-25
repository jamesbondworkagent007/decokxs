package o;

import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.trN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47503trN extends FragmentStateAdapter {
    public final java.util.List<androidx.fragment.app.Fragment> OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C47503trN(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycle, "");
        this.OLrzqt = new java.util.ArrayList();
    }

    public final void AEQbTJ(@NotNull java.util.List<? extends androidx.fragment.app.Fragment> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt.clear();
        this.OLrzqt.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.OLrzqt.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return this.OLrzqt.get(i);
    }
}
