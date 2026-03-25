package o;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.qin, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C41014qin extends FragmentStateAdapter {
    public final java.util.List<C40979qiE> EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41014qin(@NotNull FragmentActivity fragmentActivity, @NotNull java.util.List<C40979qiE> list) {
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = list;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return this.EZpvd.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.EZpvd.size();
    }
}
