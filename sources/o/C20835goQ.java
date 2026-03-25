package o;

import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.goQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C20835goQ extends FragmentStateAdapter {
    public java.util.List<C20832goN> KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20835goQ(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Lifecycle lifecycle, @NotNull java.util.List<C20832goN> list) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycle, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.KWHzl.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return C20891gpT.Companion.AEQbTJ(this.KWHzl.get(i).OLrzqt());
    }
}
