package o;

import com.okinc.business.invest_biz.data.bean.TokenInvestDetail;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.InvestPageSource;
import com.okinc.business.invest_biz.ui.screens.base_transaction.model.TransactionConfig;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.InterfaceC26561jee;
import o.iOY;
import o.iTU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class iOZ {
    public final C23946iPe AEQbTJ;
    public final InterfaceC25466ixJ KWHzl;
    public final InterfaceC56387yDm copydefault;

    public iOZ(@NotNull C23946iPe c23946iPe, @NotNull InterfaceC25466ixJ interfaceC25466ixJ) {
        Intrinsics.checkNotNullParameter(c23946iPe, "");
        Intrinsics.checkNotNullParameter(interfaceC25466ixJ, "");
        this.AEQbTJ = c23946iPe;
        this.KWHzl = interfaceC25466ixJ;
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.iPd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return iOZ.AEQbTJ(this.KWHzl);
            }
        });
    }

    public final C26593jfJ AEQbTJ() {
        return (C26593jfJ) this.copydefault.getValue();
    }

    public static final C26593jfJ AEQbTJ(iOZ ioz) {
        return new C26593jfJ(ioz.KWHzl, null, 2, null);
    }

    public final void OLrzqt(final long j, @NotNull final TokenInvestDetail tokenInvestDetail, final boolean z, @NotNull final InvestPageSource investPageSource, final Function1<? super TransactionConfig, Unit> function1, final Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(tokenInvestDetail, "");
        Intrinsics.checkNotNullParameter(investPageSource, "");
        AEQbTJ().KWHzl(new iTU.Application() { // from class: o.iPf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.iTU.Application
            public final void copydefault(ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l) {
                iOZ.OLrzqt(this.AEQbTJ, j, tokenInvestDetail, z, investPageSource, function1, function0, productDetailsUserTradeAction, l);
            }
        });
        copydefault(j, tokenInvestDetail, z, investPageSource, function1, function0);
    }

    public static final void OLrzqt(iOZ ioz, long j, TokenInvestDetail tokenInvestDetail, boolean z, InvestPageSource investPageSource, Function1 function1, Function0 function0, ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l) {
        ioz.copydefault(j, tokenInvestDetail, z, investPageSource, function1, function0);
    }

    public final void copydefault(long j, TokenInvestDetail tokenInvestDetail, boolean z, final InvestPageSource investPageSource, final Function1<? super TransactionConfig, Unit> function1, final Function0<Unit> function0) {
        this.AEQbTJ.KWHzl(this.KWHzl, j, tokenInvestDetail, (32 & 8) != 0 ? false : z, investPageSource, (32 & 32) != 0, new Function1() { // from class: o.iOW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iOZ.OLrzqt(function0, investPageSource, this, function1, (iOY) obj);
            }
        }, new Function1() { // from class: o.iPa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return iOZ.copydefault(function0, (java.lang.Throwable) obj);
            }
        });
    }

    public static final Unit OLrzqt(Function0 function0, InvestPageSource investPageSource, iOZ ioz, Function1 function1, iOY ioy) throws java.io.UnsupportedEncodingException {
        InterfaceC26561jee interfaceC26561jeeCopydefault;
        Intrinsics.checkNotNullParameter(ioy, "");
        if (ioy instanceof iOY.ActionBar) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            if (!(ioy instanceof iOY.StateListAnimator)) {
                throw new NoWhenBranchMatchedException();
            }
            iOY.StateListAnimator stateListAnimator = (iOY.StateListAnimator) ioy;
            InterfaceC26561jee interfaceC26561jeeCopydefault2 = stateListAnimator.copydefault();
            InterfaceC26561jee.ActionBar actionBar = interfaceC26561jeeCopydefault2 instanceof InterfaceC26561jee.ActionBar ? (InterfaceC26561jee.ActionBar) interfaceC26561jeeCopydefault2 : null;
            if (actionBar == null || (interfaceC26561jeeCopydefault = actionBar.OLrzqt((261631 & 1) != 0 ? actionBar.ejfBZ : null, (261631 & 2) != 0 ? actionBar.isConnected : null, (261631 & 4) != 0 ? actionBar.AhwBna : 0L, (261631 & 8) != 0 ? actionBar.valueOf : null, (261631 & 16) != 0 ? actionBar.EZpvd : 0L, (261631 & 32) != 0 ? actionBar.AYXKKw : null, (261631 & 64) != 0 ? actionBar.fJNWhG : null, (261631 & 128) != 0 ? actionBar.gEmmrt : false, (261631 & 256) != 0 ? actionBar.fetchVPNInfo : null, (261631 & 512) != 0 ? actionBar.DbNXlk : null, (261631 & 1024) != 0 ? actionBar.values : null, (261631 & 2048) != 0 ? actionBar.OLrzqt : null, (261631 & 4096) != 0 ? actionBar.KWHzl : false, (261631 & 8192) != 0 ? actionBar.fARcdN : null, (261631 & 16384) != 0 ? actionBar.djBIcL : false, (261631 & 32768) != 0 ? actionBar.AEQbTJ : investPageSource, (261631 & 65536) != 0 ? actionBar.copydefault : null, (261631 & 131072) != 0 ? actionBar.AkhnZx : null)) == null) {
                interfaceC26561jeeCopydefault = stateListAnimator.copydefault();
            }
            ioz.AEQbTJ().copydefault(interfaceC26561jeeCopydefault, function1);
            if (function0 != null) {
                function0.invoke();
            }
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(Function0 function0, java.lang.Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }
}
