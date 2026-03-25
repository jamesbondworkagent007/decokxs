package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qgm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C40907qgm extends FragmentStateAdapter {
    public final java.util.List<C40912qgr> AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40907qgm(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.util.List<C40912qgr> list) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return this.AEQbTJ.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }
}
