package o;

import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.HistoryFilterType;
import com.okinc.business.defi.wallet.mine.search.ui.viewmodel.WalletSearchHistoryViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fvR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C19126fvR extends FragmentStateAdapter {
    public final WalletSearchHistoryViewModel EZpvd;
    public final Function2<C18989fsn, InterfaceC9738bbJ, Unit> KWHzl;
    public final Function1<C18989fsn, Unit> OLrzqt;
    public final java.util.List<HistoryFilterType> copydefault;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.okinc.business.defi.wallet.mine.search.ui.viewmodel.HistoryFilterType> */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: kotlin.jvm.functions.Function2<? super o.fsn, ? super o.bbJ, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: kotlin.jvm.functions.Function1<? super o.fsn, kotlin.Unit> */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C19126fvR(@NotNull androidx.fragment.app.Fragment fragment, @NotNull java.util.List<? extends HistoryFilterType> list, @NotNull WalletSearchHistoryViewModel walletSearchHistoryViewModel, @NotNull Function2<? super C18989fsn, ? super InterfaceC9738bbJ, Unit> function2, @NotNull Function1<? super C18989fsn, Unit> function1) {
        super(fragment);
        Intrinsics.checkNotNullParameter(fragment, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(walletSearchHistoryViewModel, "");
        Intrinsics.checkNotNullParameter(function2, "");
        Intrinsics.checkNotNullParameter(function1, "");
        this.copydefault = list;
        this.EZpvd = walletSearchHistoryViewModel;
        this.KWHzl = function2;
        this.OLrzqt = function1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        HistoryFilterType historyFilterType;
        java.util.List<HistoryFilterType> list = this.copydefault;
        if (i < 0 || i >= list.size()) {
            pUU.copydefault("HistoryPagerAdapter", "Invalid position: " + i + ", defaulting to ALL");
            historyFilterType = HistoryFilterType.ALL;
        } else {
            historyFilterType = list.get(i);
        }
        return C19152fvr.Companion.OLrzqt(historyFilterType, this.EZpvd, this.KWHzl, this.OLrzqt);
    }
}
