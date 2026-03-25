package o;

import com.okinc.im.imui.group.paidgroup.transactionsummary.PaidGroupTransactionListViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class nZC implements InterfaceC57901yrE {
    public final PaidGroupTransactionListViewModel KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC57903yrG
    public void copydefault(@NotNull InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
    }

    public nZC(@NotNull PaidGroupTransactionListViewModel paidGroupTransactionListViewModel) {
        Intrinsics.checkNotNullParameter(paidGroupTransactionListViewModel, "");
        this.KWHzl = paidGroupTransactionListViewModel;
    }

    @Override // o.InterfaceC57900yrD
    public void EZpvd(@NotNull InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        this.KWHzl.AYXKKw();
    }
}
