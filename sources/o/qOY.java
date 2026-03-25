package o;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qOY extends AbstractC40514qYr<qPR> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qOY(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        androidx.fragment.app.Fragment fragmentCreateFragment;
        qPR qprAhwBna = AhwBna(i);
        return (qprAhwBna == null || (fragmentCreateFragment = qprAhwBna.createFragment()) == null) ? new androidx.fragment.app.Fragment() : fragmentCreateFragment;
    }

    @Override // o.AbstractC40514qYr, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AhwBna(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence copydefault(int i) {
        java.lang.String strOLrzqt;
        qPR qprAhwBna = AhwBna(i);
        return (qprAhwBna == null || (strOLrzqt = qprAhwBna.OLrzqt()) == null) ? "" : strOLrzqt;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.qOY */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setData$default(qOY qoy, java.util.List list, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            function0 = null;
        }
        qoy.AEQbTJ(list, function0);
    }

    public final void AEQbTJ(@NotNull java.util.List<? extends qPR> list, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(list, "");
        EZpvd(list, function0);
    }

    public final int OLrzqt(@NotNull qPR qpr) {
        Intrinsics.checkNotNullParameter(qpr, "");
        return gEmmrt().indexOf(qpr);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final java.lang.String EZpvd(int i) {
        java.lang.String strKWHzl;
        qPR qprAhwBna = AhwBna(i);
        if (qprAhwBna == null || (strKWHzl = qprAhwBna.KWHzl()) == null) {
            strKWHzl = "";
        }
        switch (strKWHzl.hashCode()) {
            case -1956807563:
                if (!strKWHzl.equals("OPTION")) {
                }
                break;
            case 2552066:
                if (!strKWHzl.equals("SPOT")) {
                }
                break;
            case 2558355:
                if (!strKWHzl.equals("SWAP")) {
                }
                break;
            case 1724028365:
                if (strKWHzl.equals("Watchlist")) {
                }
                break;
        }
        return "";
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(getItemCount());
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }
}
