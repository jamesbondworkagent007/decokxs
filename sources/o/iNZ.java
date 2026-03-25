package o;

import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.okinc.business.invest_biz.data.contants.InvestAction;
import com.okinc.business.invest_biz.data.contants.InvestmentKind;
import com.okinc.business.invest_biz.data.models.ChainInfo;
import com.okinc.business.invest_biz.data.repository.product_details.model.ProductDetailsByChain;
import com.okinc.business.invest_biz.mln.DeFiLuaTransactionHostAdapter$handleClickAction$1;
import com.okinc.business.invest_biz.mln.DeFiLuaTransactionHostAdapter$initHandlerAndDoAction$1;
import com.okinc.business.invest_biz.mln.DeFiLuaTransactionHostAdapter$redeem$1;
import com.okinc.business.invest_biz.mln.DeFiLuaTransactionHostAdapter$runWithLoadingEffect$1;
import com.okinc.business.invest_biz.mln.DeFiLuaTransactionHostAdapter$showInvest$1;
import com.okinc.business.invest_biz.mln.DeFiLuaTransactionHostAdapter$supply$1;
import com.okinc.business.invest_biz.mln.DeFiLuaTransactionHostAdapter$withdraw$1;
import com.okinc.business.invest_biz.mln.vm.DeFiMiniProductDetailTabViewModel;
import com.okinc.business.invest_biz.ui.screens.product_details.ProductTransactionActivityParams;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction;
import com.okinc.business.invest_biz.ui.screens.product_details.tab.Supply;
import com.okinc.business.invest_biz.ui.widget.product_details.ProductDetailsClickAction;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import o.iTU;
import o.iTY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class iNZ implements InterfaceC27395juQ, iTU.Application, iTY.StateListAnimator, InterfaceC25466ixJ {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public final AbstractActivityC33041mov AEQbTJ;
    public final DeFiMiniProductDetailTabViewModel AYXKKw;
    public C26573jeq AhwBna;
    public C26566jej EZpvd;
    public final InterfaceC56387yDm KWHzl;
    public InterfaceC27395juQ copydefault;
    public final ProductTransactionActivityParams djBIcL;
    public C26534jeD gEmmrt;
    public InterfaceC25527iyR valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25466ixJ
    public android.content.Context AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC25466ixJ
    public AbstractActivityC33041mov EZpvd() {
        return this.AEQbTJ;
    }

    public iNZ(@NotNull AbstractActivityC33041mov abstractActivityC33041mov, @NotNull ProductTransactionActivityParams productTransactionActivityParams) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        Intrinsics.checkNotNullParameter(productTransactionActivityParams, "");
        this.AEQbTJ = abstractActivityC33041mov;
        this.djBIcL = productTransactionActivityParams;
        this.AYXKKw = (DeFiMiniProductDetailTabViewModel) new ViewModelProvider(abstractActivityC33041mov).get(DeFiMiniProductDetailTabViewModel.class);
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.iOf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return iNZ.AYXKKw(this.EZpvd);
            }
        });
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.iNZ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public final void OLrzqt(Function1<? super Continuation<? super Unit>, ? extends java.lang.Object> function1) {
        C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this.AEQbTJ), null, null, new DeFiLuaTransactionHostAdapter$runWithLoadingEffect$1(this, function1, null), 3, null);
    }

    public final C25528iyS copydefault() {
        return (C25528iyS) this.KWHzl.getValue();
    }

    public static final C25528iyS AYXKKw(iNZ inz) {
        return ((InterfaceC23937iOw) C58114yvF.KWHzl(inz.AEQbTJ, InterfaceC23937iOw.class)).EZpvd();
    }

    @Override // o.InterfaceC27395juQ
    public void KWHzl(@NotNull ProductDetailsClickAction productDetailsClickAction) {
        Intrinsics.checkNotNullParameter(productDetailsClickAction, "");
        if (productDetailsClickAction instanceof ProductDetailsClickAction.Activity) {
            C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(this.AEQbTJ), null, null, new DeFiLuaTransactionHostAdapter$handleClickAction$1(this, productDetailsClickAction, null), 3, null);
            return;
        }
        InterfaceC27395juQ interfaceC27395juQ = this.copydefault;
        if (interfaceC27395juQ != null) {
            interfaceC27395juQ.KWHzl(productDetailsClickAction);
        }
    }

    public final void AYXKKw() {
        long jCopydefault = this.djBIcL.copydefault();
        InvestmentKind investmentKindOLrzqt = this.djBIcL.OLrzqt();
        java.lang.Long lEZpvd = this.djBIcL.EZpvd();
        long jLongValue = lEZpvd != null ? lEZpvd.longValue() : 0L;
        java.lang.String strAEQbTJ = this.djBIcL.AEQbTJ();
        if (strAEQbTJ == null) {
            strAEQbTJ = "";
        }
        ProductDetailsByChain productDetailsByChain = new ProductDetailsByChain(jCopydefault, investmentKindOLrzqt, new ChainInfo(jLongValue, strAEQbTJ, null, null, null, 28, null), false, null, null, null, false, 248, null);
        this.gEmmrt = new C26534jeD(this, C25491ixi.copydefault);
        this.AhwBna = new C26573jeq(productDetailsByChain, this, this.AYXKKw, this.gEmmrt, null, null, 16, null);
        this.copydefault = new C23927iOm(this.AEQbTJ);
        C26573jeq c26573jeq = this.AhwBna;
        if (c26573jeq != null) {
            c26573jeq.copydefault(this);
        }
        C26573jeq c26573jeq2 = this.AhwBna;
        if (c26573jeq2 != null) {
            c26573jeq2.AEQbTJ(this);
        }
        long jCopydefault2 = this.djBIcL.copydefault();
        java.lang.Long lEZpvd2 = this.djBIcL.EZpvd();
        this.valueOf = new C25533iyX(this, new C26684jgv(new C26683jgu(jCopydefault2, lEZpvd2 != null ? lEZpvd2.longValue() : 0L, this.djBIcL.djBIcL(), InvestAction.Claim), false, 2, null));
        this.EZpvd = new C26566jej(productDetailsByChain, this, this.AYXKKw, this.gEmmrt, copydefault(), this.valueOf);
        ProductTransactionActivityParams productTransactionActivityParams = this.djBIcL;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (productTransactionActivityParams != null ? productTransactionActivityParams.KWHzl() : null))) {
            C27493jwI.safeLaunch$default(KWHzl(), null, null, new DeFiLuaTransactionHostAdapter$initHandlerAndDoAction$1(this, null), 3, null);
        }
    }

    @Override // o.iTU.Application
    public void copydefault(ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l) {
        C25491ixi.copydefault.EZpvd(C33129mqd.gEmmrt(java.lang.Long.valueOf(this.djBIcL.copydefault())), C33129mqd.gEmmrt(this.djBIcL.EZpvd()), "disclaimer_ok");
        if (productDetailsUserTradeAction instanceof Supply) {
            copydefault(l);
        } else {
            valueOf();
        }
    }

    @Override // o.iTY.StateListAnimator
    public void EZpvd(ProductDetailsUserTradeAction productDetailsUserTradeAction, java.lang.Long l) {
        if (productDetailsUserTradeAction instanceof Supply) {
            copydefault(l);
        } else {
            valueOf();
        }
    }

    public final void copydefault(java.lang.Long l) {
        OLrzqt(new DeFiLuaTransactionHostAdapter$supply$1(l, this, null));
    }

    public final void AEQbTJ(long j) {
        OLrzqt(new DeFiLuaTransactionHostAdapter$withdraw$1(j, this, null));
    }

    public final void gEmmrt() {
        OLrzqt(new DeFiLuaTransactionHostAdapter$redeem$1(this, null));
    }

    public final void valueOf() {
        OLrzqt(new DeFiLuaTransactionHostAdapter$showInvest$1(this, null));
    }

    @Override // o.InterfaceC25466ixJ
    public CoroutineScope KWHzl() {
        return LifecycleOwnerKt.getLifecycleScope(this.AEQbTJ);
    }

    @Override // o.InterfaceC25466ixJ
    public CoroutineScope AhwBna() {
        return LifecycleOwnerKt.getLifecycleScope(this.AEQbTJ);
    }

    @Override // o.InterfaceC25466ixJ
    public androidx.fragment.app.FragmentManager getChildFragmentManager() {
        androidx.fragment.app.FragmentManager supportFragmentManager = this.AEQbTJ.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        return supportFragmentManager;
    }

    @Override // o.InterfaceC25466ixJ
    public androidx.fragment.app.FragmentManager getParentFragmentManager() {
        androidx.fragment.app.FragmentManager supportFragmentManager = this.AEQbTJ.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        return supportFragmentManager;
    }

    @Override // o.InterfaceC25466ixJ
    public androidx.fragment.app.FragmentManager OLrzqt() {
        androidx.fragment.app.FragmentManager supportFragmentManager = this.AEQbTJ.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        return supportFragmentManager;
    }
}
