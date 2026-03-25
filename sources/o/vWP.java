package o;

import android.view.View;
import androidx.lifecycle.Observer;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.ThirdSignalDetail;
import com.okinc.unify_trade.biz.TradeMenuItemBean;
import com.okinc.unify_trade.bot.signalbot.viewmodel.ExitOptionsSelectPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C47978uAl;
import o.C48033uCm;
import o.C55688xof;

/* JADX INFO: loaded from: classes11.dex */
public final class vWP extends AbstractActivityC48163uHh<AbstractC48413uQo, ExitOptionsSelectPresenter> {
    public StrategyConfigInfo EZpvd;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt = "1";
    public SignalBotReq AEQbTJ = new SignalBotReq((java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, (ThirdSignalDetail) null, false, (java.util.ArrayList) null, (java.lang.String) null, (AutoVipProfitInfo) null, 32767, (DefaultConstructorMarker) null);

    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.AEQbTJ = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final boolean equals(java.lang.Object obj) {
            if ((obj instanceof Observer) && (obj instanceof InterfaceC56514yIe)) {
                return Intrinsics.EZpvd(getFunctionDelegate(), ((InterfaceC56514yIe) obj).getFunctionDelegate());
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // o.InterfaceC56514yIe
        public final InterfaceC56388yDn<?> getFunctionDelegate() {
            return this.AEQbTJ;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.AEQbTJ.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.akftKQ;
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC48413uQo AEQbTJ(vWP vwp) {
        return (AbstractC48413uQo) vwp.sSMYrx();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ ExitOptionsSelectPresenter OLrzqt(vWP vwp) {
        return (ExitOptionsSelectPresenter) vwp.gHZMYf();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        valueOf();
        copydefault();
        djBIcL();
        gEmmrt();
        EZpvd();
        AhwBna();
        KWHzl();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void valueOf() {
        SignalBotReq signalBotReq = (SignalBotReq) getIntent().getParcelableExtra("request");
        if (signalBotReq == null) {
            signalBotReq = new SignalBotReq((java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, (ThirdSignalDetail) null, false, (java.util.ArrayList) null, (java.lang.String) null, (AutoVipProfitInfo) null, 32767, (DefaultConstructorMarker) null);
        }
        this.AEQbTJ = signalBotReq;
        ExitSignalOrderAmtParam signalBotOrderStopParam = signalBotReq.getSignalBotOrderStopParam();
        this.OLrzqt = (signalBotOrderStopParam == null || !((C33129mqd.OLrzqt((java.lang.CharSequence) signalBotOrderStopParam.getSlPercentage()) || C33129mqd.OLrzqt((java.lang.CharSequence) signalBotOrderStopParam.getTpPercentage())) && C33129mqd.OLrzqt((java.lang.CharSequence) signalBotOrderStopParam.getTpSlType()))) ? "1" : "2";
        this.KWHzl = getIntent().getStringExtra("algoId");
        StrategyConfigInfo strategyConfigInfo = (StrategyConfigInfo) getIntent().getParcelableExtra("config");
        this.EZpvd = strategyConfigInfo;
        if (strategyConfigInfo == null) {
            ((ExitOptionsSelectPresenter) gHZMYf()).AEQbTJ(this.AEQbTJ.getInstId());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd() {
        ((AbstractC48413uQo) sSMYrx()).valueOf.setTpContent(((ExitOptionsSelectPresenter) gHZMYf()).ejfBZ());
        ((AbstractC48413uQo) sSMYrx()).valueOf.setSlContent(((ExitOptionsSelectPresenter) gHZMYf()).DbNXlk());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault() {
        java.lang.String tpSlType;
        java.lang.String tpPercentage;
        java.lang.String slPercentage;
        ((ExitOptionsSelectPresenter) gHZMYf()).valueOf(this.OLrzqt);
        ExitOptionsSelectPresenter exitOptionsSelectPresenter = (ExitOptionsSelectPresenter) gHZMYf();
        ExitSignalOrderAmtParam signalBotOrderStopParam = this.AEQbTJ.getSignalBotOrderStopParam();
        if (signalBotOrderStopParam == null || (tpSlType = signalBotOrderStopParam.getTpSlType()) == null) {
            tpSlType = "2";
        }
        exitOptionsSelectPresenter.gEmmrt(tpSlType);
        ExitOptionsSelectPresenter exitOptionsSelectPresenter2 = (ExitOptionsSelectPresenter) gHZMYf();
        ExitSignalOrderAmtParam signalBotOrderStopParam2 = this.AEQbTJ.getSignalBotOrderStopParam();
        java.lang.String str = "";
        if (signalBotOrderStopParam2 == null || (tpPercentage = signalBotOrderStopParam2.getTpPercentage()) == null) {
            tpPercentage = "";
        }
        exitOptionsSelectPresenter2.KWHzl(tpPercentage);
        ExitOptionsSelectPresenter exitOptionsSelectPresenter3 = (ExitOptionsSelectPresenter) gHZMYf();
        ExitSignalOrderAmtParam signalBotOrderStopParam3 = this.AEQbTJ.getSignalBotOrderStopParam();
        if (signalBotOrderStopParam3 != null && (slPercentage = signalBotOrderStopParam3.getSlPercentage()) != null) {
            str = slPercentage;
        }
        exitOptionsSelectPresenter3.OLrzqt(str);
        OLrzqt();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Possible override for method o.xKr.OLrzqt()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt() {
        java.lang.String minTpPercentage;
        java.lang.String minSlPercentage;
        ExitOptionsSelectPresenter exitOptionsSelectPresenter = (ExitOptionsSelectPresenter) gHZMYf();
        StrategyConfigInfo strategyConfigInfo = this.EZpvd;
        java.lang.String str = "0.001";
        if (strategyConfigInfo == null || (minTpPercentage = strategyConfigInfo.getMinTpPercentage()) == null) {
            minTpPercentage = "0.001";
        }
        exitOptionsSelectPresenter.EZpvd(minTpPercentage);
        ExitOptionsSelectPresenter exitOptionsSelectPresenter2 = (ExitOptionsSelectPresenter) gHZMYf();
        StrategyConfigInfo strategyConfigInfo2 = this.EZpvd;
        if (strategyConfigInfo2 != null && (minSlPercentage = strategyConfigInfo2.getMinSlPercentage()) != null) {
            str = minSlPercentage;
        }
        exitOptionsSelectPresenter2.copydefault(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gEmmrt() {
        if (Intrinsics.EZpvd((java.lang.Object) ((ExitOptionsSelectPresenter) gHZMYf()).fetchVPNInfo(), (java.lang.Object) "2")) {
            ((AbstractC48413uQo) sSMYrx()).AEQbTJ.setSelect(false);
            ((AbstractC48413uQo) sSMYrx()).valueOf.setSelect(true);
        } else {
            ((AbstractC48413uQo) sSMYrx()).AEQbTJ.setSelect(true);
            ((AbstractC48413uQo) sSMYrx()).valueOf.setSelect(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        C52833waA.setTpInputViewConfig$default(((AbstractC48413uQo) sSMYrx()).valueOf, C33070mpX.AYXKKw(C55688xof.Application.onBackPressed), ((ExitOptionsSelectPresenter) gHZMYf()).fARcdN(), java.lang.Integer.valueOf(((ExitOptionsSelectPresenter) gHZMYf()).isConnected()), false, 8, null);
        C52833waA.setSlInputViewConfig$default(((AbstractC48413uQo) sSMYrx()).valueOf, C33070mpX.AYXKKw(C55688xof.Application.getLifecycle), ((ExitOptionsSelectPresenter) gHZMYf()).values(), java.lang.Integer.valueOf(((ExitOptionsSelectPresenter) gHZMYf()).AkhnZx()), false, 8, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AhwBna() {
        ((AbstractC48413uQo) sSMYrx()).AEQbTJ.AEQbTJ(new Function1() { // from class: o.vWN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vWP.copydefault(this.copydefault, (android.view.View) obj);
            }
        });
        final C52833waA c52833waA = ((AbstractC48413uQo) sSMYrx()).valueOf;
        c52833waA.setTpSlTypeTitle(((ExitOptionsSelectPresenter) gHZMYf()).AuCTel());
        c52833waA.setClick(new Function1() { // from class: o.vWQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vWP.AEQbTJ(this.EZpvd, (android.view.View) obj);
            }
        });
        c52833waA.setTypeSelectClick(new Function1() { // from class: o.vWO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vWP.EZpvd(this.OLrzqt, c52833waA, (C53526wnE) obj);
            }
        });
        c52833waA.KWHzl(new Function2() { // from class: o.vWU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vWP.EZpvd(this.EZpvd, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        c52833waA.EZpvd(new Function2() { // from class: o.vWV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vWP.copydefault(this.OLrzqt, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        C52794wYp c52794wYp = ((AbstractC48413uQo) sSMYrx()).KWHzl;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(vWP vwp, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((ExitOptionsSelectPresenter) vwp.gHZMYf()).valueOf("1");
        vwp.gEmmrt();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(vWP vwp, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((ExitOptionsSelectPresenter) vwp.gHZMYf()).valueOf("2");
        vwp.gEmmrt();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(vWP vwp, C52833waA c52833waA, final C53526wnE c53526wnE) {
        Intrinsics.checkNotNullParameter(c53526wnE, "");
        C47978uAl c47978uAlNewInstance$default = C47978uAl.Application.newInstance$default(C47978uAl.Companion, ((ExitOptionsSelectPresenter) vwp.gHZMYf()).fIwbmz(), null, false, null, 0, 30, null);
        c47978uAlNewInstance$default.KWHzl(new Application(c52833waA, vwp, c53526wnE));
        c47978uAlNewInstance$default.copydefault(new Function0() { // from class: o.vWY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vWP.AEQbTJ(c53526wnE);
            }
        });
        c53526wnE.setArrowDirection(1);
        androidx.fragment.app.FragmentManager supportFragmentManager = vwp.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "");
        c47978uAlNewInstance$default.show(supportFragmentManager, "StartAndBuildDialog");
        return Unit.INSTANCE;
    }

    public static final class Application implements C47978uAl.StateListAnimator {
        public final /* synthetic */ C53526wnE EZpvd;
        public final /* synthetic */ C52833waA KWHzl;
        public final /* synthetic */ vWP copydefault;

        public Application(C52833waA c52833waA, vWP vwp, C53526wnE c53526wnE) {
            this.KWHzl = c52833waA;
            this.copydefault = vwp;
            this.EZpvd = c53526wnE;
        }

        @Override // o.C47978uAl.StateListAnimator
        public void copydefault(TradeMenuItemBean tradeMenuItemBean) {
            Intrinsics.checkNotNullParameter(tradeMenuItemBean, "");
            this.KWHzl.setTpSlTypeTitle(tradeMenuItemBean.getTitle());
            ExitOptionsSelectPresenter exitOptionsSelectPresenterOLrzqt = vWP.OLrzqt(this.copydefault);
            java.lang.Object data = tradeMenuItemBean.getData();
            Intrinsics.copydefault(data, "");
            exitOptionsSelectPresenterOLrzqt.gEmmrt((java.lang.String) data);
            this.KWHzl.AEQbTJ();
            this.EZpvd.setArrowDirection(0);
        }
    }

    public static final Unit AEQbTJ(C53526wnE c53526wnE) {
        c53526wnE.setArrowDirection(0);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r9v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r9v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(vWP vwp, C47988uAv c47988uAv, java.lang.String str) {
        java.lang.String strDivS$default = "";
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        c47988uAv.copydefault();
        ExitOptionsSelectPresenter exitOptionsSelectPresenter = (ExitOptionsSelectPresenter) vwp.gHZMYf();
        if (str != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            strDivS$default = C33129mqd.divS$default(str, 100, 4, null, null, 12, null);
        }
        exitOptionsSelectPresenter.KWHzl(strDivS$default);
        if (((ExitOptionsSelectPresenter) vwp.gHZMYf()).copydefault().getFirst().booleanValue()) {
            ((AbstractC48413uQo) vwp.sSMYrx()).valueOf.KWHzl();
        } else {
            ((AbstractC48413uQo) vwp.sSMYrx()).valueOf.setTpInputError(((ExitOptionsSelectPresenter) vwp.gHZMYf()).copydefault().getSecond());
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ((AbstractC48413uQo) vwp.sSMYrx()).valueOf.OLrzqt())) {
            ((AbstractC48413uQo) vwp.sSMYrx()).valueOf.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ vWP AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vWP vwp) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = vwp;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                if (vWP.OLrzqt(this.AEQbTJ).fJNWhG()) {
                    ExitSignalOrderAmtParam exitSignalOrderAmtParamAEQbTJ = this.AEQbTJ.AEQbTJ();
                    if (!Intrinsics.EZpvd(this.AEQbTJ.AEQbTJ.getSignalBotOrderStopParam(), exitSignalOrderAmtParamAEQbTJ)) {
                        this.AEQbTJ.AEQbTJ.setSignalBotOrderStopParam(exitSignalOrderAmtParamAEQbTJ);
                        if (C33129mqd.OLrzqt((java.lang.CharSequence) this.AEQbTJ.KWHzl)) {
                            this.AEQbTJ.showLoading();
                            ExitOptionsSelectPresenter exitOptionsSelectPresenterOLrzqt = vWP.OLrzqt(this.AEQbTJ);
                            java.lang.String str = this.AEQbTJ.KWHzl;
                            Intrinsics.copydefault((java.lang.Object) str);
                            exitOptionsSelectPresenterOLrzqt.OLrzqt(str, this.AEQbTJ.AEQbTJ.getSignalBotOrderStopParam());
                            return;
                        }
                        vWP vwp = this.AEQbTJ;
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("data", this.AEQbTJ.AEQbTJ);
                        Unit unit = Unit.INSTANCE;
                        vwp.setResult(-1, intent);
                        this.AEQbTJ.finish();
                        return;
                    }
                    this.AEQbTJ.finish();
                    return;
                }
                if (!vWP.OLrzqt(this.AEQbTJ).KWHzl().getFirst().booleanValue()) {
                    vWP.AEQbTJ(this.AEQbTJ).valueOf.setTpInputError(vWP.OLrzqt(this.AEQbTJ).KWHzl().getSecond());
                }
                if (vWP.OLrzqt(this.AEQbTJ).OLrzqt().getFirst().booleanValue()) {
                    return;
                }
                vWP.AEQbTJ(this.AEQbTJ).valueOf.setSlInputError(vWP.OLrzqt(this.AEQbTJ).OLrzqt().getSecond());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r9v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r9v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r9v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(vWP vwp, C47988uAv c47988uAv, java.lang.String str) {
        java.lang.String strDivS$default = "";
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        c47988uAv.copydefault();
        ExitOptionsSelectPresenter exitOptionsSelectPresenter = (ExitOptionsSelectPresenter) vwp.gHZMYf();
        if (str != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str)) {
            strDivS$default = C33129mqd.divS$default(str, 100, 4, null, null, 12, null);
        }
        exitOptionsSelectPresenter.OLrzqt(strDivS$default);
        if (((ExitOptionsSelectPresenter) vwp.gHZMYf()).AEQbTJ().getFirst().booleanValue()) {
            ((AbstractC48413uQo) vwp.sSMYrx()).valueOf.copydefault();
        } else {
            ((AbstractC48413uQo) vwp.sSMYrx()).valueOf.setSlInputError(((ExitOptionsSelectPresenter) vwp.gHZMYf()).AEQbTJ().getSecond());
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ((AbstractC48413uQo) vwp.sSMYrx()).valueOf.EZpvd())) {
            ((AbstractC48413uQo) vwp.sSMYrx()).valueOf.KWHzl();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Possible override for method o.xKr.KWHzl()Ljava/lang/Class; */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl() {
        ((ExitOptionsSelectPresenter) gHZMYf()).gEmmrt().observe(this, new ActionBar(new Function1() { // from class: o.vWS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vWP.copydefault(this.AEQbTJ, (StrategyConfigInfo) obj);
            }
        }));
        ((ExitOptionsSelectPresenter) gHZMYf()).EZpvd().observe(this, new ActionBar(new Function1() { // from class: o.vWR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vWP.OLrzqt(this.KWHzl, (java.util.List) obj);
            }
        }));
        ((ExitOptionsSelectPresenter) gHZMYf()).AhwBna().AhwBna().observe(this, new ActionBar(new Function1() { // from class: o.vWT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vWP.KWHzl(this.OLrzqt, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit copydefault(vWP vwp, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        vwp.EZpvd = strategyConfigInfo;
        vwp.OLrzqt();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(vWP vwp, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        vwp.dismissLoading();
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.sendSocketRequest, 0, 1, (java.lang.Object) null);
        vwp.finish();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vWP vwp, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        vwp.dismissLoading();
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(C55688xof.Application.fXG, C56423yEv.EZpvd(C56390yDp.OLrzqt("codeReason", message))), 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final ExitSignalOrderAmtParam AEQbTJ() {
        return new ExitSignalOrderAmtParam(((ExitOptionsSelectPresenter) gHZMYf()).djBIcL(), ((ExitOptionsSelectPresenter) gHZMYf()).valueOf(), ((ExitOptionsSelectPresenter) gHZMYf()).AYXKKw());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((AbstractC48413uQo) sSMYrx()).valueOf.valueOf();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
