package o;

import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vvB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51866vvB extends FragmentStateAdapter {
    public final java.util.ArrayList<C51790vtf> AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C51866vvB(@NotNull FragmentActivity fragmentActivity, @NotNull java.util.ArrayList<C51790vtf> arrayList) {
        super(fragmentActivity);
        Intrinsics.checkNotNullParameter(fragmentActivity, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.AEQbTJ = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.AEQbTJ.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return this.AEQbTJ.get(i).OLrzqt();
    }
}
