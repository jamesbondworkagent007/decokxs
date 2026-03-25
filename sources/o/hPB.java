package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class hPB extends FragmentStateAdapter {
    public final java.util.List<Function0<androidx.fragment.app.Fragment>> AEQbTJ;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends kotlin.jvm.functions.Function0<? extends androidx.fragment.app.Fragment>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hPB(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.util.List<? extends Function0<? extends androidx.fragment.app.Fragment>> list) {
        super(fragment.getChildFragmentManager(), fragment.getLifecycle());
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return this.AEQbTJ.get(i).invoke();
    }

    public final androidx.fragment.app.Fragment OLrzqt(int i, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment.getChildFragmentManager().findFragmentByTag("f" + i);
    }
}
