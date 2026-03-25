package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kwq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29609kwq extends FragmentStateAdapter {
    public final boolean KWHzl;
    public final androidx.fragment.app.Fragment copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.KWHzl ? 3 : 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29609kwq(@NotNull androidx.fragment.app.Fragment fragment, boolean z) {
        super(fragment.getChildFragmentManager(), fragment.getLifecycle());
        Intrinsics.checkNotNullParameter(fragment, "");
        this.copydefault = fragment;
        this.KWHzl = z;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        if (!this.KWHzl) {
            if (i == 0) {
                return C29607kwo.Companion.copydefault();
            }
            return C29617kwy.Companion.AEQbTJ();
        }
        if (i == 0) {
            return C29610kwr.Companion.KWHzl();
        }
        if (i == 1) {
            return C29607kwo.Companion.copydefault();
        }
        return C29617kwy.Companion.AEQbTJ();
    }
}
