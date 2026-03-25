package o;

import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pfg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C38769pfg extends FragmentStateAdapter {
    public java.util.ArrayList<InterfaceC38786pfx> OLrzqt;
    public androidx.fragment.app.FragmentManager copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38769pfg(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull java.util.ArrayList<InterfaceC38786pfx> arrayList, @NotNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(lifecycle, "");
        this.copydefault = fragmentManager;
        this.OLrzqt = arrayList;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return this.OLrzqt.get(i).EZpvd();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.OLrzqt.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(this.OLrzqt.size());
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }

    public final void copydefault() {
        try {
            if (!this.copydefault.isDestroyed() && !this.copydefault.isStateSaved()) {
                androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = this.copydefault.beginTransaction();
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "");
                java.util.List<androidx.fragment.app.Fragment> fragments = this.copydefault.getFragments();
                Intrinsics.checkNotNullExpressionValue(fragments, "");
                java.util.Iterator<T> it = fragments.iterator();
                while (it.hasNext()) {
                    fragmentTransactionBeginTransaction.remove((androidx.fragment.app.Fragment) it.next());
                }
                fragmentTransactionBeginTransaction.commitAllowingStateLoss();
                this.copydefault.executePendingTransactions();
            }
        } catch (java.lang.Exception e) {
            e.getMessage();
        }
    }
}
