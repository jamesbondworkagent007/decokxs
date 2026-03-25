package o;

import com.okinc.business.invest_biz.ui.viewmodel.InvestTransactionResultViewModel;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iyF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C25515iyF implements RxBus.Application {
    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    public C25515iyF(@NotNull InvestTransactionResultViewModel.TransactionType transactionType, java.lang.Long l, java.lang.Long l2) {
        Intrinsics.checkNotNullParameter(transactionType, "");
    }
}
