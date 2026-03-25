package o;

import android.view.View;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.GridProfitAutoReinvestResponse;
import com.okinc.unify_trade.biz.LmtOrderNumber;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartPortfolioConfig;
import com.okinc.unify_trade.biz.SpotGridTpSlConfig;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.ThirdSignalDetail;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.bot.signalbot.viewmodel.OrderTypeSelectPresenter;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;

/* JADX INFO: loaded from: classes19.dex */
public final class vWW extends AbstractActivityC48163uHh<AbstractC48419uQu, OrderTypeSelectPresenter> {
    public SignalBotReq AEQbTJ = new SignalBotReq((java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, (ThirdSignalDetail) null, false, (java.util.ArrayList) null, (java.lang.String) null, (AutoVipProfitInfo) null, 32767, (DefaultConstructorMarker) null);
    public StrategyConfigInfo OLrzqt = new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
    public final Function1<C52873wao, Unit> KWHzl = new Function1() { // from class: o.vXa
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            return vWW.copydefault(this.AEQbTJ, (C52873wao) obj);
        }
    };

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractActivityC54499xKr
    public int AYXKKw() {
        return C48033uCm.Activity.aHXSQp;
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC33041mov
    public boolean getApplyNavigationBarInsets() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ AbstractC48419uQu EZpvd(vWW vww) {
        return (AbstractC48419uQu) vww.sSMYrx();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ OrderTypeSelectPresenter KWHzl(vWW vww) {
        return (OrderTypeSelectPresenter) vww.gHZMYf();
    }

    @Override // o.AbstractActivityC48163uHh, o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        copydefault();
        EZpvd();
        djBIcL();
        AEQbTJ();
        KWHzl();
        rVN.reportFullyDrawn$default((android.app.Activity) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void copydefault() {
        SignalBotReq signalBotReq = (SignalBotReq) getIntent().getParcelableExtra("request");
        if (signalBotReq == null) {
            signalBotReq = new SignalBotReq((java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, (ThirdSignalDetail) null, false, (java.util.ArrayList) null, (java.lang.String) null, (AutoVipProfitInfo) null, 32767, (DefaultConstructorMarker) null);
        }
        this.AEQbTJ = signalBotReq;
        StrategyConfigInfo strategyConfigInfo = (StrategyConfigInfo) getIntent().getParcelableExtra("config");
        if (strategyConfigInfo == null) {
            strategyConfigInfo = new StrategyConfigInfo((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (SpotGridTpSlConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (BotRangeConfig) null, (java.lang.String) null, (java.lang.String) null, (LmtOrderNumber) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (SmartEarnConfig) null, (java.lang.String) null, (java.util.List) null, (java.util.List) null, (java.lang.String) null, (GridProfitAutoReinvestResponse) null, (SmartPortfolioConfig) null, (SlippageControl) null, -1, -1, 131071, (DefaultConstructorMarker) null);
        }
        this.OLrzqt = strategyConfigInfo;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd() {
        java.lang.String str;
        java.lang.String str2;
        java.util.List listSplit$default;
        java.util.List listSplit$default2;
        ((OrderTypeSelectPresenter) gHZMYf()).valueOf(this.AEQbTJ.getSubOrdType());
        OrderTypeSelectPresenter orderTypeSelectPresenter = (OrderTypeSelectPresenter) gHZMYf();
        java.lang.String ratio = this.AEQbTJ.getRatio();
        if (ratio == null) {
            ratio = "";
        }
        orderTypeSelectPresenter.AEQbTJ(ratio);
        OrderTypeSelectPresenter orderTypeSelectPresenter2 = (OrderTypeSelectPresenter) gHZMYf();
        java.lang.String minLimitVarPercentage = this.OLrzqt.getMinLimitVarPercentage();
        if (minLimitVarPercentage == null) {
            minLimitVarPercentage = "0";
        }
        orderTypeSelectPresenter2.KWHzl(minLimitVarPercentage);
        OrderTypeSelectPresenter orderTypeSelectPresenter3 = (OrderTypeSelectPresenter) gHZMYf();
        java.lang.String maxLimitVarPercentage = this.OLrzqt.getMaxLimitVarPercentage();
        if (maxLimitVarPercentage == null) {
            maxLimitVarPercentage = "0.9999";
        }
        orderTypeSelectPresenter3.OLrzqt(maxLimitVarPercentage);
        java.lang.String limitOrderOffsetRecommend = this.OLrzqt.getLimitOrderOffsetRecommend();
        OrderTypeSelectPresenter orderTypeSelectPresenter4 = (OrderTypeSelectPresenter) gHZMYf();
        if (limitOrderOffsetRecommend == null || (listSplit$default2 = StringsKt__StringsKt.split$default((java.lang.CharSequence) limitOrderOffsetRecommend, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) == null || (str = (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(listSplit$default2)) == null) {
            str = "0.05";
        }
        orderTypeSelectPresenter4.EZpvd(str);
        OrderTypeSelectPresenter orderTypeSelectPresenter5 = (OrderTypeSelectPresenter) gHZMYf();
        if (limitOrderOffsetRecommend == null || (listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) limitOrderOffsetRecommend, new java.lang.String[]{","}, false, 0, 6, (java.lang.Object) null)) == null || (str2 = (java.lang.String) CollectionsKt___CollectionsKt.wlaJM(listSplit$default)) == null) {
            str2 = "0.10";
        }
        orderTypeSelectPresenter5.AhwBna(str2);
        if (Intrinsics.EZpvd((java.lang.Object) ((OrderTypeSelectPresenter) gHZMYf()).AYXKKw(), (java.lang.Object) "1")) {
            ((AbstractC48419uQu) sSMYrx()).EZpvd.setInputContent(((OrderTypeSelectPresenter) gHZMYf()).copydefault(((OrderTypeSelectPresenter) gHZMYf()).AhwBna()));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void djBIcL() {
        java.lang.String strAYXKKw = ((OrderTypeSelectPresenter) gHZMYf()).AYXKKw();
        if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "1")) {
            ((AbstractC48419uQu) sSMYrx()).AEQbTJ.setSelect(false);
            ((AbstractC48419uQu) sSMYrx()).EZpvd.setSelect(true);
            ((AbstractC48419uQu) sSMYrx()).valueOf.setSelect(false);
        } else if (Intrinsics.EZpvd((java.lang.Object) strAYXKKw, (java.lang.Object) "9")) {
            ((AbstractC48419uQu) sSMYrx()).AEQbTJ.setSelect(false);
            ((AbstractC48419uQu) sSMYrx()).EZpvd.setSelect(false);
            ((AbstractC48419uQu) sSMYrx()).valueOf.setSelect(true);
        } else {
            ((AbstractC48419uQu) sSMYrx()).AEQbTJ.setSelect(true);
            ((AbstractC48419uQu) sSMYrx()).EZpvd.setSelect(false);
            ((AbstractC48419uQu) sSMYrx()).valueOf.setSelect(false);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AEQbTJ() {
        ((AbstractC48419uQu) sSMYrx()).AEQbTJ.setTitle(C33070mpX.AYXKKw(C55688xof.Application.getOnBackPressedDispatcherannotations));
        final C52873wao c52873wao = ((AbstractC48419uQu) sSMYrx()).EZpvd;
        c52873wao.setInputViewConfig(((OrderTypeSelectPresenter) gHZMYf()).copydefault(), ((OrderTypeSelectPresenter) gHZMYf()).djBIcL(), java.lang.Integer.valueOf(((OrderTypeSelectPresenter) gHZMYf()).AEQbTJ()));
        c52873wao.setRecommendText(((OrderTypeSelectPresenter) gHZMYf()).EZpvd(), ((OrderTypeSelectPresenter) gHZMYf()).valueOf());
        c52873wao.setFirstRecCallBack(new Function0() { // from class: o.vWX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vWW.copydefault(c52873wao, this);
            }
        });
        c52873wao.setSecondRecCallBack(new Function0() { // from class: o.vWZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vWW.OLrzqt(c52873wao, this);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C52873wao c52873wao, vWW vww) {
        c52873wao.OLrzqt();
        c52873wao.setInputContent(((OrderTypeSelectPresenter) vww.gHZMYf()).KWHzl());
        Intrinsics.copydefault(c52873wao);
        vww.copydefault(c52873wao);
        c52873wao.copydefault(vww.KWHzl);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C52873wao c52873wao, vWW vww) {
        c52873wao.OLrzqt();
        c52873wao.setInputContent(((OrderTypeSelectPresenter) vww.gHZMYf()).gEmmrt());
        Intrinsics.copydefault(c52873wao);
        vww.copydefault(c52873wao);
        c52873wao.copydefault(vww.KWHzl);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void KWHzl() {
        ((AbstractC48419uQu) sSMYrx()).EZpvd.AEQbTJ(new Function1() { // from class: o.vXf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vWW.OLrzqt(this.EZpvd, (android.view.View) obj);
            }
        });
        ((AbstractC48419uQu) sSMYrx()).EZpvd.copydefault(this.KWHzl);
        ((AbstractC48419uQu) sSMYrx()).AEQbTJ.AEQbTJ(new Function1() { // from class: o.vXe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vWW.AEQbTJ(this.KWHzl, (android.view.View) obj);
            }
        });
        ((AbstractC48419uQu) sSMYrx()).valueOf.AEQbTJ(new Function1() { // from class: o.vXc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vWW.AhwBna(this.KWHzl, (android.view.View) obj);
            }
        });
        C52794wYp c52794wYp = ((AbstractC48419uQu) sSMYrx()).copydefault;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(vWW vww, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((OrderTypeSelectPresenter) vww.gHZMYf()).valueOf("1");
        vww.djBIcL();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(vWW vww, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((OrderTypeSelectPresenter) vww.gHZMYf()).valueOf("2");
        vww.djBIcL();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AhwBna(vWW vww, android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        ((OrderTypeSelectPresenter) vww.gHZMYf()).valueOf("9");
        vww.djBIcL();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vWW vww, C52873wao c52873wao) {
        Intrinsics.checkNotNullParameter(c52873wao, "");
        vww.copydefault(c52873wao);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r11v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r11v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r11v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault(C52873wao c52873wao) {
        c52873wao.KWHzl();
        ((OrderTypeSelectPresenter) gHZMYf()).AEQbTJ(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c52873wao.EZpvd()) ? "" : C33129mqd.divS$default(c52873wao.EZpvd(), 100, 4, null, null, 12, null));
        if (((OrderTypeSelectPresenter) gHZMYf()).OLrzqt().getFirst().booleanValue()) {
            ((AbstractC48419uQu) sSMYrx()).EZpvd.setInputError("");
        } else {
            ((AbstractC48419uQu) sSMYrx()).EZpvd.setInputError(((OrderTypeSelectPresenter) gHZMYf()).OLrzqt().getSecond());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt() {
        this.AEQbTJ.setSubOrdType(((OrderTypeSelectPresenter) gHZMYf()).AYXKKw());
        this.AEQbTJ.setRatio(((OrderTypeSelectPresenter) gHZMYf()).AhwBna());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractActivityC54499xKr, o.AbstractActivityC33041mov, o.ActivityC52757wXf, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((AbstractC48419uQu) sSMYrx()).EZpvd.OLrzqt();
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ vWW KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vWW vww) {
            this.EZpvd = view;
            this.copydefault = j;
            this.KWHzl = vww;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.copydefault || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (vWW.KWHzl(this.KWHzl).isConnected().getFirst().booleanValue()) {
                    this.KWHzl.OLrzqt();
                    vWW vww = this.KWHzl;
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("data", this.KWHzl.AEQbTJ);
                    Unit unit = Unit.INSTANCE;
                    vww.setResult(-1, intent);
                    this.KWHzl.finish();
                    return;
                }
                vWW.EZpvd(this.KWHzl).EZpvd.setInputError(vWW.KWHzl(this.KWHzl).isConnected().getSecond());
            }
        }
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
