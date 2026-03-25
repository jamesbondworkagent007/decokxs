package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ksN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29368ksN extends FragmentStateAdapter {
    public final androidx.fragment.app.Fragment AEQbTJ;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29368ksN(@NotNull androidx.fragment.app.Fragment fragment, int i) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        this.AEQbTJ = fragment;
        this.copydefault = i;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return C29370ksP.Companion.copydefault(i);
    }

    public final C29370ksP copydefault(int i) {
        androidx.fragment.app.Fragment fragmentFindFragmentByTag = this.AEQbTJ.getChildFragmentManager().findFragmentByTag("f" + i);
        if (fragmentFindFragmentByTag instanceof C29370ksP) {
            return (C29370ksP) fragmentFindFragmentByTag;
        }
        return null;
    }
}
