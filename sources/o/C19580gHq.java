package o;

import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.gHq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19580gHq extends FragmentStateAdapter {
    public final java.util.List<C19579gHp> OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19580gHq(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Lifecycle lifecycle, @NotNull java.util.List<C19579gHp> list) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycle, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.OLrzqt = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.OLrzqt.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return C19567gHd.Companion.AEQbTJ(this.OLrzqt.get(i).KWHzl());
    }
}
