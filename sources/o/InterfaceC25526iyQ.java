package o;

import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.iyQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public interface InterfaceC25526iyQ extends InterfaceC25524iyO {
    java.lang.Object AEQbTJ(long j, @NotNull InvestmentKind investmentKind, @NotNull Continuation<? super Result<? extends InterfaceC26561jee>> continuation);

    void KWHzl(long j, @NotNull InvestmentKind investmentKind, long j2, boolean z, boolean z2);

    java.lang.Object OLrzqt(long j, @NotNull InvestmentKind investmentKind, ProductDetailsUserTradeAction productDetailsUserTradeAction, @NotNull Continuation<? super Result<? extends InterfaceC26561jee>> continuation);

    static /* synthetic */ void loadData$default(InterfaceC25526iyQ interfaceC25526iyQ, long j, InvestmentKind investmentKind, long j2, boolean z, boolean z2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadData");
        }
        interfaceC25526iyQ.KWHzl(j, investmentKind, j2, (i & 8) != 0 ? true : z, (i & 16) != 0 ? false : z2);
    }
}
