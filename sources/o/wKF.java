package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentKt;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.biz.TradeType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.presenter.BotOrderConfirmPresenter;
import com.okinc.tradingbot.impl.strategy.guide.fragment.BotGuideContractGridFragment$subscribeOnUIChange$14;
import com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideContractGridPresenter;
import com.okinc.tradingbot.impl.strategy.guide.presenter.IBotGuidePresenter;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotAggregatedInfoBean;
import com.okinc.unify_trade.biz.BotGuideCoinItem;
import com.okinc.unify_trade.biz.BotParamTickerData;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.LossInsuranceBean;
import com.okinc.unify_trade.biz.LossInsuranceDisplayData;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TacticsVoucherType;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.bot.data.BotParamColorItemData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
public final class wKF extends AbstractC52405wKe<uUV, BotGuideContractGridPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public boolean AYXKKw;
    public final int KWHzl = C48033uCm.Activity.DcMfJKsuEgdN;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.wKD
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return wKF.gEmmrt();
        }
    });
    public boolean AEQbTJ = true;
    public final Function2<C47988uAv, java.lang.String, Unit> copydefault = new Function2() { // from class: o.wKR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return wKF.KWHzl(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
        }
    };

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.KWHzl = function1;
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
            return this.KWHzl;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.KWHzl.invoke(obj);
        }
    }

    @Override // o.AbstractC54505xKx
    public boolean bv_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0004: CHECK_CAST (com.okinc.tradingbot.impl.strategy.guide.presenter.BotGuideContractGridPresenter) (wrap:Presenter:0x0000: INVOKE (r0v0 o.wKF) VIRTUAL call: o.xKx.dxcTrN():com.okinc.unify_trade.refactor.presenter.AbsPresenter A[MD:():Presenter extends com.okinc.unify_trade.refactor.presenter.AbsPresenter (m), WRAPPED] (LINE:72)) */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ BotGuideContractGridPresenter KWHzl(wKF wkf) {
        return (BotGuideContractGridPresenter) wkf.dxcTrN();
    }

    private final C43316rmw AkhnZx() {
        return (C43316rmw) this.EZpvd.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw gEmmrt() {
        return new C43316rmw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(wKF wkf, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        C47988uAv c47988uAv2 = ((uUV) wkf.gGvvIC()).valueOf;
        if (c47988uAv2.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(c47988uAv2, false, 1, null);
        }
        wkf.valueOf();
        return Unit.INSTANCE;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wKF.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final wKF EZpvd() {
            return new wKF();
        }
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        rVN.copydefault(this);
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        values();
        fIwbmz();
        ejfBZ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void values() {
        C55320xhi c55320xhiKWHzl;
        C55312xha c55312xhaValueOf = ((uUV) gGvvIC()).copydefault.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.NRYds));
        }
        AkhnZx().register(BotParamColorItemData.class, new C51261vjg());
        AkhnZx().register(BotParamTickerData.class, new C51269vjo(null, 1, 0 == true ? 1 : 0));
        RecyclerView recyclerView = ((uUV) gGvvIC()).isConnected;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(AkhnZx());
        recyclerView.addItemDecoration(new C31703mAu(C55298xhM.dpInt$default(12, (android.content.Context) null, 1, (java.lang.Object) null), 0));
        C52468wMn c52468wMn = ((uUV) gGvvIC()).AkhnZx;
        Intrinsics.checkNotNullExpressionValue(c52468wMn, "");
        c52468wMn.setVisibility(((BotGuideContractGridPresenter) dxcTrN()).AwvSrB() ? 0 : 8);
        C49960uyR.OLrzqt(this, ((uUV) gGvvIC()).KWHzl, java.lang.Integer.valueOf(C48033uCm.Application.RgaQzq), ((uUV) gGvvIC()).valueOf, C55298xhM.dpInt$default(120, (android.content.Context) null, 1, (java.lang.Object) null));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void djBIcL() {
        java.lang.String quoteSymbol;
        java.lang.String quoteSymbol2;
        int iAhwBna;
        java.lang.String instType;
        java.lang.String marginDig;
        java.lang.String instFamily;
        BizInstrument bizInstrumentIsConnected = C56059xvf.EZpvd.isConnected();
        C53539wnR c53539wnR = ((uUV) gGvvIC()).KWHzl;
        java.lang.String str = "";
        if (bizInstrumentIsConnected == null || (quoteSymbol = bizInstrumentIsConnected.getQuoteSymbol()) == null) {
            quoteSymbol = "";
        }
        c53539wnR.setTransferCoin(quoteSymbol);
        final C47988uAv c47988uAv = ((uUV) gGvvIC()).valueOf;
        if (AuCTel()) {
            quoteSymbol2 = bizInstrumentIsConnected != null ? bizInstrumentIsConnected.getTradeSymbol() : null;
        } else if (bizInstrumentIsConnected != null) {
            quoteSymbol2 = bizInstrumentIsConnected.getQuoteSymbol();
        }
        c47988uAv.setInputUnit(quoteSymbol2);
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            iAhwBna = 2;
        } else {
            if (bizInstrumentIsConnected == null || (instType = bizInstrumentIsConnected.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                if (bizInstrumentIsConnected != null && (instFamily = bizInstrumentIsConnected.getInstFamily()) != null) {
                    str = instFamily;
                }
                IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(str);
                if (idxConfigAkhnZx != null && (marginDig = idxConfigAkhnZx.getMarginDig()) != null) {
                    iAhwBna = C33129mqd.AhwBna(marginDig);
                }
            }
        }
        c47988uAv.setMaxDecimal(iAhwBna);
        c47988uAv.setOnTextChangeCallback(this.copydefault);
        c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.wKU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKF.OLrzqt(c47988uAv, this, ((java.lang.Float) obj).floatValue());
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit OLrzqt(C47988uAv c47988uAv, wKF wkf, float f) {
        java.lang.String str;
        java.lang.String instFamily;
        C54536xML c54536xMLOLrzqt;
        C54536xML c54536xMLCopydefault;
        java.lang.String safeString$default;
        if (!c47988uAv.zLjUOn()) {
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
        } else {
            c47988uAv.setOnTextChangeCallback(null);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null) {
                str = "";
                C47988uAv.setInputContent$default(c47988uAv, str, false, false, 6, null);
                wkf.valueOf();
                c47988uAv.setOnTextChangeCallback(wkf.copydefault);
            } else {
                C56059xvf c56059xvf = C56059xvf.EZpvd;
                java.lang.String strAYXKKw = c56059xvf.AYXKKw();
                if (strAYXKKw == null) {
                    strAYXKKw = "";
                }
                AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(strAYXKKw);
                if (abstractC54531xLwOLrzqt != null) {
                    BizInstrument bizInstrumentIsConnected = c56059xvf.isConnected();
                    if (bizInstrumentIsConnected == null || (instFamily = bizInstrumentIsConnected.getInstFamily()) == null) {
                        instFamily = "";
                    }
                    xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
                    if (xmvCreateSizeConverterWithIndex$default != null && (c54536xMLOLrzqt = xmvCreateSizeConverterWithIndex$default.OLrzqt(C33129mqd.mulS$default(java.lang.Float.valueOf(c47988uAv.fJNWhG()), ((BotGuideContractGridPresenter) wkf.dxcTrN()).getNewProxyInstance().getValue(), null, null, null, 14, null))) != null && (c54536xMLCopydefault = c54536xMLOLrzqt.copydefault()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) != null) {
                        str = safeString$default;
                    }
                    C47988uAv.setInputContent$default(c47988uAv, str, false, false, 6, null);
                    wkf.valueOf();
                    c47988uAv.setOnTextChangeCallback(wkf.copydefault);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void valueOf() {
        ((BotGuideContractGridPresenter) dxcTrN()).ORxRYg();
        fARcdN();
        AYXKKw();
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ wKF copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, wKF wkf) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = wkf;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context context = this.copydefault.getContext();
                if (context != null) {
                    C52659wTp.copydefault.AEQbTJ(context);
                }
            }
        }
    }

    private final void fIwbmz() {
        getChildFragmentManager().setFragmentResultListener("bot_order", this, new FragmentResultListener() { // from class: o.wKT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                wKF.OLrzqt(this.copydefault, str, bundle);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(wKF wkf, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ((BotGuideContractGridPresenter) wkf.dxcTrN()).OcIXYQ();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v31, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v35, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v38, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void ejfBZ() {
        TradeLiveData<StrategyConfigInfo> tradeLiveDataAuCTelauCTel = ((BotGuideContractGridPresenter) dxcTrN()).AuCTelauCTel();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAuCTelauCTel.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.wKV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKF.OLrzqt(this.EZpvd, (StrategyConfigInfo) obj);
            }
        }));
        TradeLiveData<MinInvestResp> tradeLiveDataZLjUOn = ((BotGuideContractGridPresenter) dxcTrN()).zLjUOn();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataZLjUOn.observe(viewLifecycleOwner2, new Activity(new Function1() { // from class: o.wKX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKF.AEQbTJ(this.KWHzl, (MinInvestResp) obj);
            }
        }));
        TradeLiveData<MinInvestResp> tradeLiveDataGEmmrt = ((BotGuideContractGridPresenter) dxcTrN()).gEmmrt();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataGEmmrt.observe(viewLifecycleOwner3, new Activity(new Function1() { // from class: o.wKI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKF.EZpvd(this.EZpvd, (MinInvestResp) obj);
            }
        }));
        C56111xwe<LossInsuranceDisplayData> c56111xweHDKMBd = ((BotGuideContractGridPresenter) dxcTrN()).hDKMBd();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56111xweHDKMBd.observe(viewLifecycleOwner4, new Activity(new Function1() { // from class: o.wKH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKF.AEQbTJ(this.AEQbTJ, (LossInsuranceDisplayData) obj);
            }
        }));
        TradeLiveData<StrategyResponse> fieldNames = ((BotGuideContractGridPresenter) dxcTrN()).getFieldNames();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        fieldNames.observe(viewLifecycleOwner5, new Activity(new Function1() { // from class: o.wKK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKF.copydefault(this.KWHzl, (StrategyResponse) obj);
            }
        }));
        ((BotGuideContractGridPresenter) dxcTrN()).AubY().AkhnZx().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wKJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKF.OLrzqt(this.OLrzqt, (java.lang.Boolean) obj);
            }
        }));
        TradeLiveData<BotAggregatedInfoBean> tradeLiveDataDjBIcL = ((BotGuideContractGridPresenter) dxcTrN()).djBIcL();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        tradeLiveDataDjBIcL.observe(viewLifecycleOwner6, new Activity(new Function1() { // from class: o.wKL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKF.AEQbTJ(this.KWHzl, (BotAggregatedInfoBean) obj);
            }
        }));
        ((BotGuideContractGridPresenter) dxcTrN()).AhwBna().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wKO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKF.copydefault(this.copydefault, (java.util.List) obj);
            }
        }));
        TradeLiveData<java.lang.String> newProxyInstance = ((BotGuideContractGridPresenter) dxcTrN()).getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        newProxyInstance.observe(viewLifecycleOwner7, new Activity(new Function1() { // from class: o.wKN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKF.EZpvd(this.KWHzl, (java.lang.String) obj);
            }
        }));
        ((BotGuideContractGridPresenter) dxcTrN()).getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wKQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKF.KWHzl(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = ((BotGuideContractGridPresenter) dxcTrN()).AYXKKw().AhwBna();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner8, new Activity(new Function1() { // from class: o.wKZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKF.AEQbTJ(this.OLrzqt, (java.lang.Exception) obj);
            }
        }));
        C56111xwe<java.util.List<BotGuideCoinItem>> c56111xweEjfBZ = ((BotGuideContractGridPresenter) dxcTrN()).ejfBZ();
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        c56111xweEjfBZ.observe(viewLifecycleOwner9, new Activity(new Function1() { // from class: o.wKW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKF.OLrzqt(this.OLrzqt, (java.util.List) obj);
            }
        }));
        C56111xwe<Unit> c56111xweFJNWhG = ((BotGuideContractGridPresenter) dxcTrN()).fJNWhG();
        LifecycleOwner viewLifecycleOwner10 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner10, "");
        c56111xweFJNWhG.observe(viewLifecycleOwner10, new Activity(new Function1() { // from class: o.wLa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKF.AEQbTJ(this.KWHzl, (Unit) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner11 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner11, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner11), null, null, new BotGuideContractGridFragment$subscribeOnUIChange$14(this, null), 3, null);
    }

    public static final Unit OLrzqt(wKF wkf, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        wkf.fJNWhG();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r14v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(wKF wkf, MinInvestResp minInvestResp) {
        Intrinsics.checkNotNullParameter(minInvestResp, "");
        C47988uAv c47988uAv = ((uUV) wkf.gGvvIC()).valueOf;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        setInputRange$default(wkf, c47988uAv, new BotRangeConfig(minInvestResp.getMinInvestment(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 62, (DefaultConstructorMarker) null), null, null, new Function1() { // from class: o.wKS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wKF.OLrzqt((java.lang.String) obj);
            }
        }, 12, null);
        C47988uAv c47988uAv2 = ((uUV) wkf.gGvvIC()).valueOf;
        Intrinsics.copydefault(c47988uAv2);
        wkf.EZpvd(c47988uAv2, c47988uAv2.fARcdN());
        wkf.fetchVPNInfo();
        wkf.isConnected();
        return Unit.INSTANCE;
    }

    public static final java.lang.String OLrzqt(java.lang.String str) {
        java.lang.String instFamily;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAuCTel;
        java.lang.String safeString$default;
        if (str == null) {
            return null;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            C56059xvf c56059xvf = C56059xvf.EZpvd;
            java.lang.String strAYXKKw = c56059xvf.AYXKKw();
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(strAYXKKw);
            if (abstractC54531xLwOLrzqt != null) {
                BizInstrument bizInstrumentIsConnected = c56059xvf.isConnected();
                if (bizInstrumentIsConnected == null || (instFamily = bizInstrumentIsConnected.getInstFamily()) == null) {
                    instFamily = "";
                }
                xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
                if (xmvCreateSizeConverterWithIndex$default != null && (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(str)) != null && (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) != null && (c54536xMLAuCTel = c54536xMLDjBIcL.AuCTel()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) != null) {
                    return safeString$default;
                }
            }
        }
        return "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(wKF wkf, MinInvestResp minInvestResp) {
        Intrinsics.checkNotNullParameter(minInvestResp, "");
        wkf.AYXKKw = false;
        C47988uAv c47988uAv = ((uUV) wkf.gGvvIC()).valueOf;
        Intrinsics.copydefault(c47988uAv);
        wkf.EZpvd(c47988uAv, c47988uAv.fARcdN());
        wkf.fetchVPNInfo();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(wKF wkf, LossInsuranceDisplayData lossInsuranceDisplayData) {
        Intrinsics.checkNotNullParameter(lossInsuranceDisplayData, "");
        wkf.isConnected();
        C52468wMn c52468wMn = ((uUV) wkf.gGvvIC()).AkhnZx;
        c52468wMn.setNegativeContract(wkf.AuCTel());
        c52468wMn.setData(lossInsuranceDisplayData);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(wKF wkf, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        FragmentActivity activity = wkf.getActivity();
        if (activity != null) {
            ActivityC51150vhb.Companion.AEQbTJ(activity, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : "contract_grid", (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : strategyResponse.getAlgoId(), (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? null : null);
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(wKF wkf, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            wkf.showLoading();
        } else {
            wkf.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(wKF wkf, BotAggregatedInfoBean botAggregatedInfoBean) {
        Intrinsics.checkNotNullParameter(botAggregatedInfoBean, "");
        ((uUV) wkf.gGvvIC()).AYXKKw.copydefault(((BotGuideContractGridPresenter) wkf.dxcTrN()).copydefault(botAggregatedInfoBean));
        ((BotGuideContractGridPresenter) wkf.dxcTrN()).iwGUEr().setValue(new kotlin.Pair<>(java.lang.Boolean.TRUE, null));
        wkf.dismissLoading();
        ((BotGuideContractGridPresenter) wkf.dxcTrN()).ORxRYg();
        wkf.AEQbTJ(botAggregatedInfoBean);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(wKF wkf, java.util.List list) {
        uUV uuv = (uUV) wkf.gGvvIC();
        uuv.AhwBna.setData(((BotGuideContractGridPresenter) wkf.dxcTrN()).fIwbmz());
        android.widget.TextView textView = uuv.djBIcL;
        java.lang.String lever = ((BotGuideContractGridPresenter) wkf.dxcTrN()).AkhnZx().getLever();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) lever)) {
            lever = "5";
        }
        textView.setText(C56033xvF.getBotLever$default(lever, false, 2, null));
        C43316rmw c43316rmwAkhnZx = wkf.AkhnZx();
        Intrinsics.copydefault(list);
        C33064mpR.OLrzqt(c43316rmwAkhnZx, (java.util.List<? extends java.lang.Object>) list);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) wkf, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(wKF wkf, java.lang.String str) {
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        java.lang.String instFamily;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String safeString$default = null;
        if (interfaceC54581xNrOLrzqt != null) {
            C56059xvf c56059xvf = C56059xvf.EZpvd;
            java.lang.String strAYXKKw = c56059xvf.AYXKKw();
            if (strAYXKKw == null) {
                strAYXKKw = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(strAYXKKw);
            if (abstractC54531xLwOLrzqt != null) {
                BizInstrument bizInstrumentIsConnected = c56059xvf.isConnected();
                if (bizInstrumentIsConnected != null && (instFamily = bizInstrumentIsConnected.getInstFamily()) != null) {
                    str2 = instFamily;
                }
                xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, str2, null, 2, null);
                if (xmvCreateSizeConverterWithIndex$default != null && (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(str)) != null && (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault2.fetchVPNInfo()) != null && (c54536xMLDjBIcL = c54536xMLFetchVPNInfo.djBIcL()) != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
                }
            }
        }
        ((uUV) wkf.gGvvIC()).KWHzl.setFooterAvaValue(safeString$default);
        wkf.isConnected();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r8v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r8v6, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r8v8, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(wKF wkf, androidx.core.util.Pair pair) {
        java.lang.String message;
        pUU.copydefault(wkf.getTAG(), pair.first + " request failed cause by " + ((java.lang.Exception) pair.second).getMessage());
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((BotGuideContractGridPresenter) wkf.dxcTrN()).fetchVPNInfo().bB_())) {
            ((uUV) wkf.gGvvIC()).KWHzl.setFooterAvaValue("--");
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((BotGuideContractGridPresenter) wkf.dxcTrN()).wlaJM().bB_())) {
            ((BotGuideContractGridPresenter) wkf.dxcTrN()).iwGUEr().setValue(new kotlin.Pair<>(java.lang.Boolean.FALSE, pair.second));
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) wkf, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((BotGuideContractGridPresenter) wkf.dxcTrN()).AuCTel().bB_())) {
            java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
            if (message2 != null) {
                C55326xho.toast$default(message2, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((BotGuideContractGridPresenter) wkf.dxcTrN()).AubY().bB_()) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(wKF wkf, java.lang.Exception exc) {
        java.lang.String msg;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(exc, "");
        boolean z = exc instanceof BizApiException;
        BizApiException bizApiException = z ? (BizApiException) exc : null;
        if (Intrinsics.EZpvd((java.lang.Object) (bizApiException != null ? bizApiException.getCode() : null), (java.lang.Object) "51399")) {
            wkf.AYXKKw = true;
            C47988uAv c47988uAv = ((uUV) wkf.gGvvIC()).valueOf;
            BizApiException bizApiException2 = z ? (BizApiException) exc : null;
            if (bizApiException2 != null && (msg = bizApiException2.getMsg()) != null) {
                str = msg;
            }
            c47988uAv.setInputErrorMsg(str);
            wkf.fetchVPNInfo();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(final wKF wkf, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (C33129mqd.KWHzl((java.util.Collection) list) && list.size() > 1) {
            ((uUV) wkf.gGvvIC()).AYXKKw.setCoinSwitchEnable(new Function0() { // from class: o.wKG
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return wKF.OLrzqt(this.KWHzl);
                }
            });
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(wKF wkf) {
        FragmentKt.setFragmentResult(wkf, "key_switch_coin", new android.os.Bundle());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(wKF wkf, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        ((uUV) wkf.gGvvIC()).AYXKKw.setTitleArrow(false);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showConfirmationDialog$default(wKF wkf, BotGuideContractGridPresenter.TaskDescription taskDescription, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        wkf.OLrzqt(taskDescription, str);
    }

    public final void OLrzqt(BotGuideContractGridPresenter.TaskDescription taskDescription, java.lang.String str) {
        final LossInsuranceBean lossInsuranceBeanAEQbTJ = taskDescription.AEQbTJ();
        java.lang.String voucherValue = lossInsuranceBeanAEQbTJ != null ? lossInsuranceBeanAEQbTJ.getVoucherValue() : null;
        if (voucherValue == null) {
            voucherValue = "";
        }
        java.lang.String voucherCcy = lossInsuranceBeanAEQbTJ != null ? lossInsuranceBeanAEQbTJ.getVoucherCcy() : null;
        java.lang.String str2 = voucherCcy == null ? "" : voucherCcy;
        java.lang.String strMulS$default = C33129mqd.mulS$default(str, voucherValue, null, null, null, 14, null);
        BizInstrument bizInstrumentIsConnected = C56059xvf.EZpvd.isConnected();
        java.lang.String quoteSymbol = bizInstrumentIsConnected != null ? bizInstrumentIsConnected.getQuoteSymbol() : null;
        java.lang.String str3 = quoteSymbol == null ? "" : quoteSymbol;
        Function0<Unit> function0 = new Function0() { // from class: o.wKM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wKF.OLrzqt(this.KWHzl, lossInsuranceBeanAEQbTJ);
            }
        };
        Function0<Unit> function02 = new Function0() { // from class: o.wKP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return wKF.KWHzl(this.EZpvd, lossInsuranceBeanAEQbTJ);
            }
        };
        if (taskDescription instanceof BotGuideContractGridPresenter.TaskDescription.Application) {
            C52659wTp c52659wTp = C52659wTp.copydefault;
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            c52659wTp.EZpvd(contextRequireContext, voucherValue, str2, AuCTel(), strMulS$default, str3, function0, function02);
            return;
        }
        if (!(taskDescription instanceof BotGuideContractGridPresenter.TaskDescription.ActionBar)) {
            throw new NoWhenBranchMatchedException();
        }
        C52659wTp c52659wTp2 = C52659wTp.copydefault;
        android.content.Context contextRequireContext2 = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
        c52659wTp2.AEQbTJ(contextRequireContext2, voucherValue, str2, AuCTel(), strMulS$default, str3, function0, function02);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(wKF wkf, LossInsuranceBean lossInsuranceBean) {
        ((BotGuideContractGridPresenter) wkf.dxcTrN()).KWHzl(lossInsuranceBean);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(wKF wkf, LossInsuranceBean lossInsuranceBean) {
        ((BotGuideContractGridPresenter) wkf.dxcTrN()).OLrzqt(lossInsuranceBean);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AuCTel() {
        BizInstrument bizInstrumentIsConnected = C56059xvf.EZpvd.isConnected();
        if (bizInstrumentIsConnected != null) {
            return Intrinsics.EZpvd(bizInstrumentIsConnected.isNegativeContract(), java.lang.Boolean.TRUE);
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC52405wKe
    public void AEQbTJ() {
        LossInsuranceBean voucherInformation;
        java.lang.String tag = getTAG();
        BotAggregatedInfoBean value = ((BotGuideContractGridPresenter) dxcTrN()).djBIcL().getValue();
        pUU.EZpvd(tag, "onCreateClick voucher type: " + ((value == null || (voucherInformation = value.getVoucherInformation()) == null) ? null : voucherInformation.getVoucherType()));
        ((BotGuideContractGridPresenter) dxcTrN()).AkhnZx().setSz(((uUV) gGvvIC()).valueOf.AkhnZx());
        ((BotGuideContractGridPresenter) dxcTrN()).copydefault();
        if (((BotGuideContractGridPresenter) dxcTrN()).sSMYrx()) {
            ((BotGuideContractGridPresenter) dxcTrN()).OcIXYQ();
            return;
        }
        C47988uAv c47988uAv = ((uUV) gGvvIC()).valueOf;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        EZpvd(c47988uAv, ((uUV) gGvvIC()).valueOf.fARcdN());
        AppCompatTextView appCompatTextView = ((uUV) gGvvIC()).gEmmrt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        if (appCompatTextView.getVisibility() == 0) {
            C56002xub.KWHzl.OLrzqt();
            return;
        }
        ContractGridReq contractGridReqAkhnZx = ((BotGuideContractGridPresenter) dxcTrN()).AkhnZx();
        BotOrderConfirmFragment.TaskDescription taskDescription = BotOrderConfirmFragment.Companion;
        java.lang.String instId = contractGridReqAkhnZx.getInstId();
        java.lang.String instType = contractGridReqAkhnZx.getInstType();
        StrategyReqGroup strategyReqGroup = new StrategyReqGroup(new StrategyBaseReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, contractGridReqAkhnZx.getOrdType(), (TradeType) null, (java.lang.String) null, (java.lang.Boolean) null, 1919, (DefaultConstructorMarker) null), (IceBergReq) null, (TwapReq) null, (GridReq) null, contractGridReqAkhnZx, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, (AutoVipProfitInfo) null, (DcaOrderReq) null, (AiOrderReq) null, 32750, (DefaultConstructorMarker) null);
        LossInsuranceDisplayData value2 = ((BotGuideContractGridPresenter) dxcTrN()).hDKMBd().getValue();
        BotOrderConfirmFragment botOrderConfirmFragmentCopydefault = taskDescription.copydefault(instId, instType, strategyReqGroup, (248 & 8) != 0 ? false : true, (248 & 16) != 0 ? null : value2 != null ? new BotOrderConfirmPresenter.VoucherTagDisplayInfo(value2.getAmount(), value2.getVoucherCcy(), null, 4, null) : null, (248 & 32) != 0 ? "" : null, (248 & 64) != 0 ? null : null, (248 & 128) != 0 ? null : null);
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        botOrderConfirmFragmentCopydefault.show(childFragmentManager);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC52405wKe
    public void copydefault() {
        djBIcL();
        ((BotGuideContractGridPresenter) dxcTrN()).DTwDnp();
        ((BotGuideContractGridPresenter) dxcTrN()).QKVWgx();
        ((BotGuideContractGridPresenter) dxcTrN()).valueOf();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fJNWhG() {
        StrategyConfigInfo value = ((BotGuideContractGridPresenter) dxcTrN()).AuCTelauCTel().getValue();
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = ((uUV) gGvvIC()).fetchVPNInfo;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.copydefault(c54154wyx, value);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void isConnected() {
        java.lang.String value = ((BotGuideContractGridPresenter) dxcTrN()).getNewProxyInstance().getValue();
        MinInvestResp value2 = ((BotGuideContractGridPresenter) dxcTrN()).zLjUOn().getValue();
        java.lang.String minInvestment = value2 != null ? value2.getMinInvestment() : null;
        BotAggregatedInfoBean value3 = ((BotGuideContractGridPresenter) dxcTrN()).djBIcL().getValue();
        StgyParam botParam = value3 != null ? value3.getBotParam() : null;
        boolean z = (((BotGuideContractGridPresenter) dxcTrN()).AwvSrB() && ((BotGuideContractGridPresenter) dxcTrN()).hDKMBd().getValue() == null) ? false : true;
        if (!this.AEQbTJ || value == null || minInvestment == null || !z || botParam == null) {
            return;
        }
        this.AEQbTJ = false;
        C47988uAv.setInputContent$default(((uUV) gGvvIC()).valueOf, ((BotGuideContractGridPresenter) dxcTrN()).AEQbTJ(value, minInvestment), false, false, 6, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fARcdN() {
        ((uUV) gGvvIC()).gEmmrt.setVisibility(C33129mqd.AEQbTJ(((uUV) gGvvIC()).valueOf.AkhnZx(), ((BotGuideContractGridPresenter) dxcTrN()).getNewProxyInstance().getValue()) ? 0 : 4);
        AppCompatTextView appCompatTextView = ((uUV) gGvvIC()).gEmmrt;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        if (appCompatTextView.getVisibility() == 0) {
            ((BotGuideContractGridPresenter) dxcTrN()).fARcdN().setValue(IBotGuidePresenter.ButtonState.Generic.Disabled);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void fetchVPNInfo() {
        boolean z;
        uUV uuv = (uUV) gGvvIC();
        BotGuideContractGridPresenter botGuideContractGridPresenter = (BotGuideContractGridPresenter) dxcTrN();
        if (uuv.valueOf.AkhnZx().length() <= 0 || uuv.valueOf.getFieldNames()) {
            z = false;
        } else {
            AppCompatTextView appCompatTextView = uuv.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            if (appCompatTextView.getVisibility() != 0) {
                z = true;
            }
        }
        botGuideContractGridPresenter.OLrzqt(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v0, resolved type: o.wKF */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void setInputRange$default(wKF wkf, C47988uAv c47988uAv, BotRangeConfig botRangeConfig, java.lang.String str, Function1 function1, Function1 function12, int i, java.lang.Object obj) {
        wkf.copydefault(c47988uAv, botRangeConfig, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : function1, function12);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void copydefault(C47988uAv c47988uAv, BotRangeConfig botRangeConfig, java.lang.String str, Function1<? super java.lang.String, java.lang.String> function1, Function1<? super java.lang.String, java.lang.String> function12) {
        java.lang.String min;
        java.lang.String str2;
        int i = C48033uCm.Application.setSplitBackgroundDrawable;
        if (str == null) {
            min = botRangeConfig != null ? botRangeConfig.getMin() : null;
        } else {
            min = str;
        }
        c47988uAv.setTag(i, min);
        c47988uAv.setTag(C48033uCm.Application.setNavigationMode, botRangeConfig != null ? botRangeConfig.getMax() : null);
        java.lang.String max = botRangeConfig != null ? botRangeConfig.getMax() : null;
        if (max == null || max.length() == 0) {
            java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.invalidateMenu);
            java.lang.String strInvoke = function12.invoke(str);
            if (strInvoke == null) {
                strInvoke = function12.invoke(botRangeConfig != null ? botRangeConfig.getMin() : null);
            }
            C47988uAv.setInputLabel$default(c47988uAv, strAYXKKw + " " + strInvoke, null, 2, null);
        } else {
            if (!C33129mqd.gEmmrt(botRangeConfig != null ? botRangeConfig.getMax() : null, botRangeConfig != null ? botRangeConfig.getMin() : null)) {
                java.lang.String strInvoke2 = function12.invoke(str);
                if (strInvoke2 == null) {
                    strInvoke2 = function12.invoke(botRangeConfig != null ? botRangeConfig.getMin() : null);
                }
                C47988uAv.setInputLabel$default(c47988uAv, strInvoke2 + "-" + ((java.lang.Object) function12.invoke(botRangeConfig != null ? botRangeConfig.getMax() : null)), null, 2, null);
            }
        }
        if (C33129mqd.AEQbTJ(botRangeConfig != null ? botRangeConfig.getDefault() : null, 0)) {
            if (function1 == null) {
                str2 = botRangeConfig != null ? botRangeConfig.getDefault() : null;
            } else {
                java.lang.String strInvoke3 = function1.invoke(botRangeConfig != null ? botRangeConfig.getDefault() : null);
                if (strInvoke3 != null) {
                    str2 = strInvoke3;
                }
            }
            C47988uAv.setInputContent$default(c47988uAv, str2, false, false, 6, null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd(C47988uAv c47988uAv, java.lang.String str) {
        java.lang.String strCopydefault;
        java.lang.String strGEmmrt = C33129mqd.gEmmrt(c47988uAv.getTag(C48033uCm.Application.setSplitBackgroundDrawable));
        java.lang.String strGEmmrt2 = C33129mqd.gEmmrt(c47988uAv.getTag(C48033uCm.Application.setNavigationMode));
        java.lang.String strAkhnZx = c47988uAv.AkhnZx();
        if (C33129mqd.AEQbTJ(strGEmmrt2, 0) && C33129mqd.AEQbTJ(strAkhnZx, strGEmmrt2)) {
            strCopydefault = C33069mpW.copydefault(((BotGuideContractGridPresenter) dxcTrN()).copydefault(true), C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2Default)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(strGEmmrt2)), C56390yDp.OLrzqt("unit", str)));
        } else {
            strCopydefault = (strAkhnZx.length() == 0 || C33129mqd.gEmmrt(strAkhnZx, strGEmmrt)) ? C33069mpW.copydefault(((BotGuideContractGridPresenter) dxcTrN()).copydefault(false), C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2Default)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(strGEmmrt)), C56390yDp.OLrzqt("unit", str))) : "";
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c47988uAv.AkhnZx()) && strCopydefault.length() != 0) {
            c47988uAv.setInputErrorMsg(strCopydefault);
        } else {
            if (this.AYXKKw) {
                return;
            }
            c47988uAv.copydefault();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AYXKKw() {
        java.lang.String strAkhnZx = ((uUV) gGvvIC()).valueOf.AkhnZx();
        java.lang.String str = null;
        if (!C33129mqd.OLrzqt((java.lang.Object) strAkhnZx, (java.lang.Object) 0)) {
            MinInvestResp value = ((BotGuideContractGridPresenter) dxcTrN()).zLjUOn().getValue();
            if (!C33129mqd.valueOf(strAkhnZx, value != null ? value.getMinInvestment() : null)) {
                str = ((uUV) gGvvIC()).valueOf.fARcdN() + ":" + strAkhnZx;
            }
        }
        ((BotGuideContractGridPresenter) dxcTrN()).EZpvd(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(BotAggregatedInfoBean botAggregatedInfoBean) {
        java.lang.String voucherCcy;
        java.lang.String voucherValue;
        LossInsuranceBean voucherInformation = botAggregatedInfoBean.getVoucherInformation();
        if ((voucherInformation != null ? voucherInformation.getVoucherType() : null) == TacticsVoucherType.AIRDROP) {
            uUV uuv = (uUV) gGvvIC();
            ConstraintLayout constraintLayout = uuv.values;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(8);
            ConstraintLayout constraintLayout2 = uuv.EZpvd;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
            constraintLayout2.setVisibility(0);
            AppCompatTextView appCompatTextView = uuv.AEQbTJ;
            LossInsuranceBean voucherInformation2 = botAggregatedInfoBean.getVoucherInformation();
            java.lang.String str = "--";
            if (voucherInformation2 != null && voucherInformation2.getVoucherVisible()) {
                xMR xmr = xMR.copydefault;
                LossInsuranceBean voucherInformation3 = botAggregatedInfoBean.getVoucherInformation();
                if (voucherInformation3 != null && (voucherValue = voucherInformation3.getVoucherValue()) != null) {
                    str = voucherValue;
                }
                java.lang.String strCopydefault = xmr.copydefault(str);
                LossInsuranceBean voucherInformation4 = botAggregatedInfoBean.getVoucherInformation();
                if (voucherInformation4 == null || (voucherCcy = voucherInformation4.getVoucherCcy()) == null) {
                    voucherCcy = "USDT";
                }
                str = strCopydefault + " " + voucherCcy;
            }
            appCompatTextView.setText(str);
            C55258xgZ c55258xgZ = uuv.OLrzqt;
            c55258xgZ.setOnClickListener(new Application(c55258xgZ, 1000L, this));
        }
    }
}
