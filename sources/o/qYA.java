package o;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC40518qYv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class qYA<T extends InterfaceC40518qYv> extends FragmentStateAdapter {
    public final InterfaceC56387yDm AEQbTJ;
    public final java.util.List<T> KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qYA(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        this.KWHzl = new java.util.ArrayList();
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.qYB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return qYA.EZpvd();
            }
        });
    }

    private final android.util.LongSparseArray<java.lang.Integer> AEQbTJ() {
        return (android.util.LongSparseArray) this.AEQbTJ.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final android.util.LongSparseArray EZpvd() {
        return new android.util.LongSparseArray();
    }

    public final T AEQbTJ(int i) {
        return (T) CollectionsKt___CollectionsKt.AkhnZx(this.KWHzl, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.KWHzl.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        androidx.fragment.app.Fragment fragmentCreateFragment;
        InterfaceC40518qYv interfaceC40518qYvAEQbTJ = AEQbTJ(i);
        return (interfaceC40518qYvAEQbTJ == null || (fragmentCreateFragment = interfaceC40518qYvAEQbTJ.createFragment()) == null) ? new androidx.fragment.app.Fragment() : fragmentCreateFragment;
    }

    public void AEQbTJ(@NotNull java.util.List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl.clear();
        this.KWHzl.addAll(list);
        AEQbTJ().clear();
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                yDY.AYXKKw();
            }
            AEQbTJ().put(getItemId(i), java.lang.Integer.valueOf(i));
            i++;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        long jHashCode = AEQbTJ(i) != null ? r0.hashCode() : i;
        AEQbTJ().put(jHashCode, java.lang.Integer.valueOf(i));
        return jHashCode;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public boolean containsItem(long j) {
        return AEQbTJ().indexOfKey(j) >= 0;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(this.KWHzl.size());
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }
}
