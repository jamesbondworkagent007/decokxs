package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.market.search.features.navigation.favorites.NavSearchFavoritesListFragment;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class qKK extends qYA<qKU> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qKK(@NotNull androidx.fragment.app.Fragment fragment) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
    }

    @Override // o.qYA, androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        qKU qkuAEQbTJ = AEQbTJ(i);
        return qkuAEQbTJ == null ? new androidx.fragment.app.Fragment() : NavSearchFavoritesListFragment.Companion.KWHzl(qkuAEQbTJ.createFragment(), qkuAEQbTJ.AEQbTJ());
    }

    @Override // o.qYA, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return AEQbTJ(i) != null ? r3.hashCode() : 0;
    }

    public final java.lang.CharSequence KWHzl(int i) {
        java.lang.String strEZpvd;
        qKU qkuAEQbTJ = AEQbTJ(i);
        if (qkuAEQbTJ == null || (strEZpvd = qkuAEQbTJ.copydefault()) == null) {
            strEZpvd = qkuAEQbTJ != null ? qkuAEQbTJ.EZpvd() : null;
        }
        return strEZpvd != null ? strEZpvd : "";
    }

    public final boolean EZpvd() {
        return getItemCount() == 0;
    }

    @Override // o.qYA, androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(4);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }
}
