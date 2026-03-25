package o;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kjg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28910kjg extends FragmentStateAdapter {
    public java.lang.String OLrzqt;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28910kjg(@NotNull FragmentActivity fragmentActivity, @NotNull java.lang.String str) {
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28910kjg(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.lang.String str) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return C28575kdP.Companion.OLrzqt(this.OLrzqt, i);
    }
}
