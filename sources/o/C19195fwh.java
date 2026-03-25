package o;

import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.wallet.mine.search.ui.view.WalletSearchSubPage;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fwh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19195fwh extends AbstractC19130fvV<WalletSearchSubPage> {
    public final android.os.Bundle AEQbTJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19195fwh(@NotNull androidx.fragment.app.Fragment fragment, android.os.Bundle bundle) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        this.AEQbTJ = bundle;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        androidx.fragment.app.Fragment fragmentCreateFragment;
        WalletSearchSubPage walletSearchSubPageEZpvd = EZpvd(i);
        return (walletSearchSubPageEZpvd == null || (fragmentCreateFragment = walletSearchSubPageEZpvd.createFragment(this.AEQbTJ)) == null) ? new androidx.fragment.app.Fragment() : fragmentCreateFragment;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return EZpvd(i) != null ? r3.hashCode() : 0;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.fvV.submitList$default(o.fvV, java.util.List, java.lang.Runnable, int, java.lang.Object):void */
    public final void EZpvd(@NotNull java.util.List<? extends WalletSearchSubPage> list) {
        Intrinsics.checkNotNullParameter(list, "");
        AbstractC19130fvV.submitList$default(this, list, null, 2, null);
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(@NotNull RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "");
        super.onAttachedToRecyclerView(recyclerView);
        recyclerView.setItemViewCacheSize(WalletSearchSubPage.values().length);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            layoutManager.setItemPrefetchEnabled(false);
        }
    }
}
