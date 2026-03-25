package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mSc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C32171mSc extends FragmentStateAdapter {
    public final java.util.List<Function0<androidx.fragment.app.Fragment>> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends kotlin.jvm.functions.Function0<? extends androidx.fragment.app.Fragment>> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C32171mSc(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.util.List<? extends Function0<? extends androidx.fragment.app.Fragment>> list) {
        super(fragment.getChildFragmentManager(), fragment.getLifecycle());
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return this.copydefault.get(i).invoke();
    }

    public final androidx.fragment.app.Fragment AEQbTJ(int i, @NotNull androidx.fragment.app.Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "");
        return fragment.getChildFragmentManager().findFragmentByTag("f" + i);
    }
}
