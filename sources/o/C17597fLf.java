package o;

import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedAddressTabItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fLf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C17597fLf extends FragmentStateAdapter {
    public final boolean EZpvd;
    public java.util.List<EscapedAddressTabItem> copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17597fLf(@NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Lifecycle lifecycle, @NotNull java.util.List<EscapedAddressTabItem> list, boolean z) {
        super(fragmentManager, lifecycle);
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(lifecycle, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.copydefault = list;
        this.EZpvd = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.copydefault.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public androidx.fragment.app.Fragment createFragment(int i) {
        return C17610fLs.Companion.copydefault(this.copydefault.get(i), this.EZpvd);
    }
}
