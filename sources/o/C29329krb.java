package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.krb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29329krb extends FragmentStateAdapter {
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29329krb(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment.getChildFragmentManager(), fragment.getLifecycle());
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        if (i == 0) {
            return C29333krf.Companion.OLrzqt();
        }
        return C29269kqU.Companion.copydefault();
    }
}
