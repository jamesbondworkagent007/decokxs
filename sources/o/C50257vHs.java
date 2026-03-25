package o;

import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.biz.TradeType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.BizApiException;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment;
import com.okinc.tradingbot.impl.order.strategy.recommend.presenter.BotRecommendPresenter;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.HedgingEstimatesResp;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.LiquidatePriceResponse;
import com.okinc.unify_trade.biz.MinInvestResp;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SlippageControl;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyBaseReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.contract_grid.viewModel.ContractManuallyPresenter;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import com.okinc.unify_trade.bot.data.BotParamColorItemData;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.AbstractC50583vTu;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC49496upe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vHs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50257vHs extends AbstractC49945uyC<AbstractC48524uUp, ContractManuallyPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int copydefault = 8;
    public wYF AEQbTJ;
    public boolean AYXKKw;
    public boolean gEmmrt;
    public final int OLrzqt = C48033uCm.Activity.sCB;
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.vHB
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C50257vHs.AhwBna(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.vHy
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C50257vHs.AkhnZx(this.KWHzl);
        }
    });
    public final C43316rmw djBIcL = new C43316rmw();
    public final Function2<C47988uAv, java.lang.String, Unit> KWHzl = new Function2() { // from class: o.vHA
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return C50257vHs.AEQbTJ(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
        }
    };

    /* JADX INFO: renamed from: o.vHs$PendingIntent */
    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.copydefault = function1;
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
            return this.copydefault;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.copydefault.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.OLrzqt;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final /* synthetic */ AbstractC48524uUp gEmmrt(C50257vHs c50257vHs) {
        return c50257vHs.values();
    }

    public final ContractGridReq copydefault() {
        return (ContractGridReq) this.valueOf.getValue();
    }

    public static final ContractGridReq AhwBna(C50257vHs c50257vHs) {
        android.os.Parcelable parcelableOLrzqt = BotRecommendPresenter.Companion.OLrzqt(c50257vHs.ejfBZ());
        Intrinsics.copydefault(parcelableOLrzqt, "");
        return (ContractGridReq) parcelableOLrzqt;
    }

    private final SmartRecommendResp ejfBZ() {
        return (SmartRecommendResp) this.AhwBna.getValue();
    }

    public static final SmartRecommendResp AkhnZx(C50257vHs c50257vHs) {
        SmartRecommendResp smartRecommendResp;
        android.os.Bundle arguments = c50257vHs.getArguments();
        return (arguments == null || (smartRecommendResp = (SmartRecommendResp) arguments.getParcelable("data")) == null) ? new SmartRecommendResp(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1, null) : smartRecommendResp;
    }

    /* JADX INFO: renamed from: o.vHs$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vHs.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void AEQbTJ(@NotNull SmartRecommendResp smartRecommendResp, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(smartRecommendResp, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C50257vHs c50257vHs = new C50257vHs();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", smartRecommendResp);
            c50257vHs.setArguments(bundle);
            c50257vHs.show(fragmentManager, C50257vHs.class.getSimpleName());
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        ContractManuallyPresenter contractManuallyPresenterOLrzqt = OLrzqt();
        java.lang.String instType = ejfBZ().getInstType();
        if (instType == null) {
            instType = "";
        }
        java.lang.String instId = ejfBZ().getInstId();
        contractManuallyPresenterOLrzqt.OLrzqt(instType, instId != null ? instId : "");
        uzCIH();
        fARcdN();
        iwGUEr();
        getFieldNames();
        AubY();
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final boolean isConnected() {
        return Intrinsics.EZpvd((java.lang.Object) copydefault().getDisplayName(), (java.lang.Object) "segmented_hedging");
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.FQMcgE));
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true ^ isConnected());
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.AEQbTJ = wyf;
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0));
        wyf.setOKDSSize(44);
        wyf.setOnClickListener(new StateListAnimator(wyf, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vHs$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ StrategyConfigInfo OLrzqt;
        public final /* synthetic */ C50257vHs copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C50257vHs c50257vHs, StrategyConfigInfo strategyConfigInfo) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = c50257vHs;
            this.OLrzqt = strategyConfigInfo;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C50191vFg c50191vFg = (C50191vFg) this.KWHzl;
                java.lang.String strGEmmrt = this.copydefault.OLrzqt().fvQaOB().gEmmrt();
                java.lang.String strDjBIcL = this.copydefault.OLrzqt().fvQaOB().djBIcL();
                java.lang.String leveragePercents = this.OLrzqt.getLeveragePercents();
                java.lang.String minLever = this.OLrzqt.getMinLever();
                java.lang.String maxLever = this.OLrzqt.getMaxLever();
                java.lang.String direction = this.copydefault.copydefault().getDirection();
                androidx.fragment.app.FragmentManager childFragmentManager = this.copydefault.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c50191vFg.AEQbTJ(strGEmmrt, strDjBIcL, leveragePercents, minLever, maxLever, direction, "cross", childFragmentManager, "contract_grid");
            }
        }
    }

    /* JADX INFO: renamed from: o.vHs$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C50257vHs EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C50257vHs c50257vHs) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c50257vHs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.EZpvd.fJNWhG();
            }
        }
    }

    /* JADX INFO: renamed from: o.vHs$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ C50257vHs EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C50257vHs c50257vHs) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c50257vHs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C50257vHs c50257vHs = this.EZpvd;
                c50257vHs.copydefault(C48033uCm.Fragment.isReflectionWorking, C33069mpW.copydefault(c50257vHs, C48033uCm.Fragment.DQzvGNdrmXxu, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, c50257vHs.OLrzqt().valueOf()))));
            }
        }
    }

    /* JADX INFO: renamed from: o.vHs$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C50257vHs OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C50257vHs c50257vHs) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c50257vHs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.copydefault(C48033uCm.Fragment.fXYAwm, C33070mpX.AYXKKw(C48033uCm.Fragment.gdmIOq));
            }
        }
    }

    /* JADX INFO: renamed from: o.vHs$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ C50257vHs copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C50257vHs c50257vHs) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = c50257vHs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                C50257vHs c50257vHs = this.copydefault;
                c50257vHs.copydefault(C48033uCm.Fragment.RIuxYh, C33069mpW.copydefault(c50257vHs, C48033uCm.Fragment.RSDDiY, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.TRADING_CRYPTO_CURRENCY_DEEPLINK, c50257vHs.OLrzqt().valueOf()))));
            }
        }
    }

    /* JADX INFO: renamed from: o.vHs$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C50257vHs OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C50257vHs c50257vHs) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = c50257vHs;
        }

        /* JADX WARN: Removed duplicated region for block: B:55:0x0166  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0168  */
        @Override // android.view.View.OnClickListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onClick(android.view.View view) {
            xOW newProxyInstance;
            java.lang.String askSlippage;
            SlippageControl slippageControl;
            SlippageControl slippageControl2;
            SlippageControl slippageControl3;
            java.lang.String askSlippage2;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                wYF wyf = (wYF) this.KWHzl;
                if (!this.OLrzqt.gEmmrt) {
                    this.OLrzqt.hDKMBd();
                    this.OLrzqt.AuCTel();
                    android.widget.TextView textView = C50257vHs.gEmmrt(this.OLrzqt).copydefault;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    if (textView.getVisibility() == 0) {
                        C56002xub.KWHzl.OLrzqt();
                        return;
                    }
                    if (C50257vHs.gEmmrt(this.OLrzqt).KWHzl.hDKMBd()) {
                        this.OLrzqt.copydefault().setSz(C50257vHs.gEmmrt(this.OLrzqt).KWHzl.AkhnZx());
                        new C55771xqI().AEQbTJ(this.OLrzqt.copydefault());
                        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.QbewEr()) {
                            StrategyBaseReq strategyBaseReq = new StrategyBaseReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (TradeType) null, (java.lang.String) null, (java.lang.Boolean) null, 2047, (DefaultConstructorMarker) null);
                            strategyBaseReq.setInstId(this.OLrzqt.OLrzqt().fvQaOB().gEmmrt());
                            strategyBaseReq.setOrdType("contract_grid");
                            StrategyConfigInfo value = this.OLrzqt.OLrzqt().copydefault().getValue();
                            java.lang.String direction = this.OLrzqt.OLrzqt().uzCIH().getDirection();
                            if (direction == null) {
                                askSlippage = "";
                            } else {
                                int iHashCode = direction.hashCode();
                                if (iHashCode != 3327612) {
                                    if (iHashCode != 109413500) {
                                        if (iHashCode == 1844321735 && direction.equals("neutral")) {
                                            if (value == null || (slippageControl3 = value.getSlippageControl()) == null || (askSlippage2 = slippageControl3.getAskSlippage()) == null) {
                                                askSlippage = null;
                                            } else {
                                                SlippageControl slippageControl4 = value.getSlippageControl();
                                                askSlippage = C33129mqd.EZpvd(askSlippage2, slippageControl4 != null ? slippageControl4.getBidSlippage() : null);
                                            }
                                        }
                                    } else if (direction.equals("short")) {
                                        if (value != null && (slippageControl2 = value.getSlippageControl()) != null) {
                                            askSlippage = slippageControl2.getBidSlippage();
                                        }
                                    }
                                } else if (direction.equals("long")) {
                                    if (value != null && (slippageControl = value.getSlippageControl()) != null) {
                                        askSlippage = slippageControl.getAskSlippage();
                                    }
                                }
                            }
                            this.OLrzqt.copydefault().setOpenPosSlippage(askSlippage);
                            if (this.OLrzqt.isConnected()) {
                                this.OLrzqt.copydefault().setOrdVariant("segmented_hedging");
                                this.OLrzqt.copydefault().setLever("1");
                                this.OLrzqt.copydefault().setActualMarginSz(this.OLrzqt.copydefault().getSz());
                                this.OLrzqt.copydefault().setExtraMarginSz("0");
                                this.OLrzqt.copydefault().setOrdType(strategyBaseReq.getOrdType());
                                BotOrderConfirmFragment botOrderConfirmFragmentCopydefault = BotOrderConfirmFragment.Companion.copydefault(this.OLrzqt.OLrzqt().fvQaOB().gEmmrt(), this.OLrzqt.OLrzqt().fvQaOB().djBIcL(), new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, this.OLrzqt.copydefault(), (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, C54149wys.AEQbTJ.EZpvd(value), (DcaOrderReq) null, (AiOrderReq) null, 28654, (DefaultConstructorMarker) null), (248 & 8) != 0 ? false : false, (248 & 16) != 0 ? null : null, (248 & 32) != 0 ? "" : null, (248 & 64) != 0 ? null : null, (248 & 128) != 0 ? null : null);
                                androidx.fragment.app.FragmentManager childFragmentManager = this.OLrzqt.getChildFragmentManager();
                                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                                java.lang.String simpleName = BotOrderConfirmFragment.class.getSimpleName();
                                Intrinsics.checkNotNullExpressionValue(simpleName, "");
                                C49662usl.EZpvd(botOrderConfirmFragmentCopydefault, childFragmentManager, simpleName);
                                return;
                            }
                            this.OLrzqt.copydefault().setOrdVariant(null);
                            AbstractC50583vTu abstractC50583vTuNewInstance$default = AbstractC50583vTu.Application.newInstance$default(AbstractC50583vTu.Companion, this.OLrzqt.OLrzqt().fvQaOB().gEmmrt(), this.OLrzqt.OLrzqt().fvQaOB().djBIcL(), new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, (GridReq) null, this.OLrzqt.copydefault(), (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, C54149wys.AEQbTJ.EZpvd(value), (DcaOrderReq) null, (AiOrderReq) null, 28654, (DefaultConstructorMarker) null), false, 8, null);
                            if (abstractC50583vTuNewInstance$default != null) {
                                abstractC50583vTuNewInstance$default.show(this.OLrzqt.getChildFragmentManager(), AbstractC50583vTu.class.getSimpleName());
                                return;
                            }
                            return;
                        }
                        pUU.KWHzl("BotOrder", "二次确认功能关闭 ContractGridAiOrderDialog Start Order");
                        ContractManuallyPresenter.order$default(this.OLrzqt.OLrzqt(), false, false, 3, null);
                        return;
                    }
                    return;
                }
                InterfaceC49496upe interfaceC49496upeCopydefault = C53685wqE.copydefault.copydefault();
                android.content.Context context = wyf.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "");
                InterfaceC49496upe.Application.startAccountModeActivity$default(interfaceC49496upeCopydefault, context, "2", null, 4, null);
            }
        }
    }

    /* JADX INFO: renamed from: o.vHs$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C50257vHs copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50257vHs c50257vHs) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = c50257vHs;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                RecyclerView recyclerView = C50257vHs.gEmmrt(this.copydefault).values;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                boolean z = !(recyclerView.getVisibility() == 0);
                android.widget.ImageView imageView = C50257vHs.gEmmrt(this.copydefault).AhwBna;
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(z ? C52761wXj.TaskDescription.QslYrK : C52761wXj.TaskDescription.abAflu);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.iLWfRf));
                } else {
                    drawableKWHzl = null;
                }
                imageView.setImageDrawable(drawableKWHzl);
                RecyclerView recyclerView2 = C50257vHs.gEmmrt(this.copydefault).values;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                recyclerView2.setVisibility(z ? 0 : 8);
                android.view.View view2 = C50257vHs.gEmmrt(this.copydefault).AuCTel;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                view2.setVisibility(z ? 0 : 8);
                android.widget.TextView textView = C50257vHs.gEmmrt(this.copydefault).AkhnZx;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(z ? 0 : 8);
            }
        }
    }

    private final void fARcdN() {
        copydefault().setSignParams(OLrzqt().KWHzl());
        OLrzqt().AEQbTJ(copydefault());
        OLrzqt().fIwbmz();
    }

    private final void uzCIH() {
        KWHzl(copydefault().getDirection());
        getNewProxyInstance();
        values().values.setLayoutManager(new LinearLayoutManager(getContext()));
        values().values.setAdapter(this.djBIcL);
        values().values.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(10.0f, null, 1, null), 0));
        this.djBIcL.register(BotParamItemData.class, new C51263vji());
        this.djBIcL.register(BotParamColorItemData.class, new C51261vjg());
        this.djBIcL.register(C55848xrg.class, new C51233vjE());
        C33064mpR.OLrzqt(this.djBIcL, (java.util.List<? extends java.lang.Object>) C55995xuU.getParams$default(C55995xuU.copydefault, ejfBZ(), copydefault(), null, 4, null));
        vKO vko = values().gEmmrt;
        Intrinsics.copydefault(vko);
        vko.setVisibility(CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.gEmmrt("long", "neutral")), copydefault().getDirection()) ? 0 : 8);
        final java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.removeAllTabs);
        vko.EZpvd(C33129mqd.OLrzqt((java.lang.CharSequence) strAYXKKw), new View.OnClickListener() { // from class: o.vHD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50257vHs.OLrzqt(this.OLrzqt, strAYXKKw, view);
            }
        });
        vKO vko2 = values().fetchVPNInfo;
        Intrinsics.copydefault(vko2);
        vko2.setVisibility(CollectionsKt___CollectionsKt.KWHzl((java.lang.Iterable<? extends java.lang.String>) ((java.lang.Iterable<? extends java.lang.Object>) yDY.gEmmrt("short", "neutral")), copydefault().getDirection()) ? 0 : 8);
        final java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.setCaptioningEnabled);
        vko2.EZpvd(C33129mqd.OLrzqt((java.lang.CharSequence) strAYXKKw2), new View.OnClickListener() { // from class: o.vHE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50257vHs.KWHzl(this.OLrzqt, strAYXKKw2, view);
            }
        });
    }

    public static final void OLrzqt(C50257vHs c50257vHs, java.lang.String str, android.view.View view) {
        c50257vHs.OLrzqt(str);
    }

    public static final void KWHzl(C50257vHs c50257vHs, java.lang.String str, android.view.View view) {
        c50257vHs.OLrzqt(str);
    }

    private final void KWHzl(java.lang.String str) {
        android.widget.ImageView imageViewEZpvd;
        android.widget.ImageView imageViewEZpvd2;
        AbstractC48524uUp abstractC48524uUpValues = values();
        if (isConnected()) {
            LinearLayoutCompat linearLayoutCompat = abstractC48524uUpValues.EZpvd;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(0);
            C50191vFg c50191vFg = abstractC48524uUpValues.valueOf;
            Intrinsics.checkNotNullExpressionValue(c50191vFg, "");
            c50191vFg.setVisibility(8);
            ConstraintLayout constraintLayout = abstractC48524uUpValues.AYXKKw;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
            constraintLayout.setVisibility(0);
            C55052xcf c55052xcfCopydefault = abstractC48524uUpValues.djBIcL.copydefault();
            if (c55052xcfCopydefault != null && (imageViewEZpvd2 = c55052xcfCopydefault.EZpvd()) != null) {
                imageViewEZpvd2.setVisibility(8);
            }
            C55052xcf c55052xcfCopydefault2 = abstractC48524uUpValues.djBIcL.copydefault();
            if (c55052xcfCopydefault2 != null) {
                c55052xcfCopydefault2.setClickable(false);
            }
            abstractC48524uUpValues.djBIcL.KWHzl("1.0");
            C55258xgZ c55258xgZ = (C55258xgZ) abstractC48524uUpValues.EZpvd.findViewById(C48033uCm.Application.accept);
            if (c55258xgZ != null) {
                c55258xgZ.setOnClickListener(new Fragment(c55258xgZ, 1000L, this));
            }
            C55258xgZ c55258xgZ2 = (C55258xgZ) abstractC48524uUpValues.EZpvd.findViewById(C48033uCm.Application.AxsJAYsNCnLh);
            if (c55258xgZ2 != null) {
                c55258xgZ2.setOnClickListener(new LoaderManager(c55258xgZ2, 1000L, this));
            }
            C55258xgZ c55258xgZ3 = (C55258xgZ) abstractC48524uUpValues.EZpvd.findViewById(C48033uCm.Application.ODWQjV);
            if (c55258xgZ3 != null) {
                c55258xgZ3.setOnClickListener(new FragmentManager(c55258xgZ3, 1000L, this));
                return;
            }
            return;
        }
        LinearLayoutCompat linearLayoutCompat2 = abstractC48524uUpValues.EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        linearLayoutCompat2.setVisibility(8);
        C50191vFg c50191vFg2 = abstractC48524uUpValues.valueOf;
        Intrinsics.checkNotNullExpressionValue(c50191vFg2, "");
        c50191vFg2.setVisibility(0);
        ConstraintLayout constraintLayout2 = abstractC48524uUpValues.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        constraintLayout2.setVisibility(8);
        C55052xcf c55052xcfCopydefault3 = abstractC48524uUpValues.djBIcL.copydefault();
        if (c55052xcfCopydefault3 != null && (imageViewEZpvd = c55052xcfCopydefault3.EZpvd()) != null) {
            imageViewEZpvd.setVisibility(0);
        }
        C55052xcf c55052xcfCopydefault4 = abstractC48524uUpValues.djBIcL.copydefault();
        if (c55052xcfCopydefault4 != null) {
            c55052xcfCopydefault4.setClickable(true);
        }
        abstractC48524uUpValues.djBIcL.KWHzl(copydefault().getLever());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(@androidx.annotation.StringRes int i, java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(i);
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.onCreate, new View.OnClickListener() { // from class: o.vHu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50257vHs.copydefault(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void getNewProxyInstance() {
        java.lang.String marginSymbol;
        int iAhwBna;
        java.lang.String instType;
        java.lang.String marginDig;
        java.lang.String instFamily;
        final BizInstrument bizInstrumentAhwBna = OLrzqt().fvQaOB().AhwBna();
        C53539wnR c53539wnR = values().OLrzqt;
        java.lang.String str = "";
        if (bizInstrumentAhwBna == null || (marginSymbol = bizInstrumentAhwBna.getMarginSymbol()) == null) {
            marginSymbol = "";
        }
        c53539wnR.setTransferCoin(marginSymbol);
        final C47988uAv c47988uAv = values().KWHzl;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            iAhwBna = 2;
        } else {
            if (bizInstrumentAhwBna == null || (instType = bizInstrumentAhwBna.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                if (bizInstrumentAhwBna != null && (instFamily = bizInstrumentAhwBna.getInstFamily()) != null) {
                    str = instFamily;
                }
                IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(str);
                if (idxConfigAkhnZx != null && (marginDig = idxConfigAkhnZx.getMarginDig()) != null) {
                    iAhwBna = C33129mqd.AhwBna(marginDig);
                }
            }
        }
        c47988uAv.setMaxDecimal(iAhwBna);
        c47988uAv.setInputUnit(bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getMarginSymbol() : null);
        c47988uAv.setOnTextChangeCallback(this.KWHzl);
        c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.vHG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50257vHs.OLrzqt(c47988uAv, this, bizInstrumentAhwBna, ((java.lang.Float) obj).floatValue());
            }
        });
    }

    public static final Unit OLrzqt(C47988uAv c47988uAv, C50257vHs c50257vHs, BizInstrument bizInstrument, float f) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54536xML c54536xMLOLrzqt;
        C54536xML c54536xMLCopydefault;
        java.lang.String safeString$default;
        if (!c47988uAv.zLjUOn()) {
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
        } else {
            c47988uAv.setOnTextChangeCallback(null);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            java.lang.String str = "";
            if (interfaceC54581xNrOLrzqt != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(c50257vHs.OLrzqt().fvQaOB().djBIcL())) != null) {
                if (bizInstrument == null || (instFamily = bizInstrument.getInstFamily()) == null) {
                    instFamily = "";
                }
                xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
                if (xmvCreateSizeConverterWithIndex$default != null && (c54536xMLOLrzqt = xmvCreateSizeConverterWithIndex$default.OLrzqt(C33129mqd.mulS$default(java.lang.Float.valueOf(c47988uAv.fJNWhG()), c50257vHs.OLrzqt().zLjUOn().getValue(), null, null, null, 14, null))) != null && (c54536xMLCopydefault = c54536xMLOLrzqt.copydefault()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) != null) {
                    str = safeString$default;
                }
            }
            C47988uAv.setInputContent$default(c47988uAv, str, false, false, 6, null);
            c50257vHs.copydefault().setSz(str);
            c50257vHs.wlaJM();
            c50257vHs.AuCTel();
            c47988uAv.setOnTextChangeCallback(c50257vHs.KWHzl);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C50257vHs c50257vHs, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        C47988uAv c47988uAv2 = c50257vHs.values().KWHzl;
        ContractGridReq contractGridReqCopydefault = c50257vHs.copydefault();
        if (str == null) {
            str = "";
        }
        contractGridReqCopydefault.setSz(str);
        c50257vHs.wlaJM();
        c50257vHs.fIwbmz();
        if (c47988uAv2.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(c47988uAv2, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    private final void fIwbmz() {
        java.lang.String strAkhnZx = values().KWHzl.AkhnZx();
        java.lang.String str = null;
        if (!C33129mqd.OLrzqt((java.lang.Object) strAkhnZx, (java.lang.Object) 0)) {
            MinInvestResp value = OLrzqt().zsXlph().getValue();
            if (!C33129mqd.valueOf(strAkhnZx, value != null ? value.getMinInvestment() : null)) {
                str = values().KWHzl.fARcdN() + ":" + strAkhnZx;
            }
        }
        OLrzqt().EZpvd(str, true);
    }

    private final void iwGUEr() {
        android.widget.ImageView imageView = values().AhwBna;
        imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this));
    }

    private final void getFieldNames() {
        OLrzqt().copydefault().observe(this, new PendingIntent(new Function1() { // from class: o.vHI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50257vHs.AEQbTJ(this.copydefault, (StrategyConfigInfo) obj);
            }
        }));
        OLrzqt().getFieldNames().observe(this, new PendingIntent(new Function1() { // from class: o.vHH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50257vHs.EZpvd(this.EZpvd, (LiquidatePriceResponse) obj);
            }
        }));
        OLrzqt().zsXlph().observe(this, new PendingIntent(new Function1() { // from class: o.vHK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50257vHs.OLrzqt(this.EZpvd, (MinInvestResp) obj);
            }
        }));
        TradeLiveData<HedgingEstimatesResp> tradeLiveDataHDKMBd = OLrzqt().hDKMBd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataHDKMBd.observe(viewLifecycleOwner, new PendingIntent(new Function1() { // from class: o.vHJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50257vHs.AEQbTJ(this.KWHzl, (HedgingEstimatesResp) obj);
            }
        }));
        OLrzqt().gEmmrt().observe(this, new PendingIntent(new Function1() { // from class: o.vHw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50257vHs.AEQbTJ(this.KWHzl, (MinInvestResp) obj);
            }
        }));
        OLrzqt().wlaJM().observe(this, new PendingIntent(new Function1() { // from class: o.vHv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50257vHs.copydefault(this.copydefault, (StrategyResponse) obj);
            }
        }));
        OLrzqt().zLjUOn().observe(this, new PendingIntent(new Function1() { // from class: o.vHx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50257vHs.copydefault(this.KWHzl, (java.lang.String) obj);
            }
        }));
        OLrzqt().QKVWgx();
        OLrzqt().getAggregateErrorLiveData().observe(this, new PendingIntent(new Function1() { // from class: o.vHz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50257vHs.OLrzqt(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(final C50257vHs c50257vHs, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        C50191vFg c50191vFg = c50257vHs.values().valueOf;
        c50191vFg.setOnLeverChangeCallback(new Function1() { // from class: o.vHC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50257vHs.AEQbTJ(this.copydefault, (java.lang.String) obj);
            }
        });
        c50191vFg.OLrzqt(c50257vHs.copydefault().getLever());
        c50191vFg.setOnClickListener(new Activity(c50191vFg, 1000L, c50257vHs, strategyConfigInfo));
        c50257vHs.zsXlph();
        c50257vHs.OLrzqt().iwGUEr();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C50257vHs c50257vHs, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c50257vHs.copydefault().setLever(str);
        c50257vHs.OLrzqt().AEQbTJ(false);
        c50257vHs.wlaJM();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C50257vHs c50257vHs, LiquidatePriceResponse liquidatePriceResponse) {
        Intrinsics.checkNotNullParameter(liquidatePriceResponse, "");
        LiquidatePriceResponse liquidatePriceResponseEZpvd = c50257vHs.OLrzqt().EZpvd(liquidatePriceResponse);
        vKO vko = c50257vHs.values().gEmmrt;
        java.lang.String longLiqPx = liquidatePriceResponseEZpvd.getLongLiqPx();
        if (longLiqPx == null) {
            longLiqPx = "--";
        }
        vko.setValue(longLiqPx);
        vKO vko2 = c50257vHs.values().fetchVPNInfo;
        java.lang.String shortLiqPx = liquidatePriceResponseEZpvd.getShortLiqPx();
        vko2.setValue(shortLiqPx != null ? shortLiqPx : "--");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C50257vHs c50257vHs, MinInvestResp minInvestResp) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLAuCTel;
        java.lang.String safeString$default;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(minInvestResp, "");
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(c50257vHs.OLrzqt().fvQaOB().djBIcL())) != null) {
            java.lang.String strValueOf = c50257vHs.OLrzqt().fvQaOB().valueOf();
            if (strValueOf == null) {
                strValueOf = "";
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, strValueOf, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null && (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(minInvestResp.getMinInvestment())) != null && (c54536xMLDjBIcL = c54536xMLCopydefault.djBIcL()) != null && (c54536xMLAuCTel = c54536xMLDjBIcL.AuCTel()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) != null) {
                str = safeString$default;
            }
        }
        c50257vHs.values().KWHzl.setInputHint("> " + str);
        c50257vHs.fIwbmz();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(C50257vHs c50257vHs, HedgingEstimatesResp hedgingEstimatesResp) {
        java.lang.String str;
        java.lang.String str2;
        AbstractC48524uUp abstractC48524uUpValues = c50257vHs.values();
        java.lang.String estAvgSellPrice = hedgingEstimatesResp != null ? hedgingEstimatesResp.getEstAvgSellPrice() : null;
        java.lang.String estAvgBuyPrice = hedgingEstimatesResp != null ? hedgingEstimatesResp.getEstAvgBuyPrice() : null;
        android.widget.TextView textView = (android.widget.TextView) abstractC48524uUpValues.EZpvd.findViewById(C48033uCm.Application.OqFWZa);
        if (textView != null) {
            java.lang.String botPrice$default = C56033xvF.getBotPrice$default(c50257vHs.OLrzqt().fvQaOB().djBIcL(), c50257vHs.OLrzqt().fvQaOB().gEmmrt(), estAvgSellPrice == null ? "" : estAvgSellPrice, false, false, RoundingMode.UP, null, 88, null);
            if (estAvgSellPrice != null) {
                if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) estAvgSellPrice))) {
                    estAvgSellPrice = null;
                }
                if (estAvgSellPrice != null) {
                    str2 = " " + C56033xvF.AEQbTJ(c50257vHs.OLrzqt().fvQaOB().djBIcL(), c50257vHs.OLrzqt().fvQaOB().gEmmrt());
                }
                if (str2 == null) {
                }
                textView.setText(botPrice$default + str2);
            } else {
                str2 = null;
                if (str2 == null) {
                    str2 = "";
                }
                textView.setText(botPrice$default + str2);
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) abstractC48524uUpValues.EZpvd.findViewById(C48033uCm.Application.getPostValueLengthLimit);
        if (textView2 != null) {
            java.lang.String botPrice$default2 = C56033xvF.getBotPrice$default(c50257vHs.OLrzqt().fvQaOB().djBIcL(), c50257vHs.OLrzqt().fvQaOB().gEmmrt(), estAvgBuyPrice == null ? "" : estAvgBuyPrice, false, false, RoundingMode.DOWN, null, 88, null);
            if (estAvgBuyPrice != null) {
                if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) estAvgBuyPrice))) {
                    estAvgBuyPrice = null;
                }
                if (estAvgBuyPrice != null) {
                    str = " " + C56033xvF.AEQbTJ(c50257vHs.OLrzqt().fvQaOB().djBIcL(), c50257vHs.OLrzqt().fvQaOB().gEmmrt());
                }
                if (str == null) {
                }
                textView2.setText(botPrice$default2 + str);
            } else {
                str = null;
                if (str == null) {
                    str = "";
                }
                textView2.setText(botPrice$default2 + str);
            }
        }
        android.widget.TextView textView3 = (android.widget.TextView) abstractC48524uUpValues.EZpvd.findViewById(C48033uCm.Application.ffGIBT);
        if (textView3 != null) {
            java.lang.String estFundingRateAPR = hedgingEstimatesResp != null ? hedgingEstimatesResp.getEstFundingRateAPR() : null;
            textView3.setText(getFormatedRatio$default(c50257vHs, estFundingRateAPR == null ? "" : estFundingRateAPR, null, false, 6, null));
            java.lang.String estFundingRateAPR2 = hedgingEstimatesResp != null ? hedgingEstimatesResp.getEstFundingRateAPR() : null;
            textView3.setTextColor(C56033xvF.OLrzqt((java.lang.Object) (estFundingRateAPR2 != null ? estFundingRateAPR2 : "")));
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C50257vHs c50257vHs, MinInvestResp minInvestResp) {
        Intrinsics.checkNotNullParameter(minInvestResp, "");
        c50257vHs.AYXKKw = false;
        c50257vHs.AuCTel();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C50257vHs c50257vHs, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        c50257vHs.fJNWhG();
        FragmentActivity activity = c50257vHs.getActivity();
        if (activity != null) {
            ActivityC51150vhb.Companion.AEQbTJ(activity, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : "contract_grid", (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : strategyResponse.getAlgoId(), (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? null : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C50257vHs c50257vHs, java.lang.String str) {
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        java.lang.String safeString$default = null;
        if (interfaceC54581xNrCopydefault != null && (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(c50257vHs.OLrzqt().fvQaOB().djBIcL())) != null) {
            java.lang.String strValueOf = c50257vHs.OLrzqt().fvQaOB().valueOf();
            if (strValueOf == null) {
                strValueOf = "";
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, strValueOf, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null) {
                if (str == null) {
                    str = "";
                }
                C54536xML c54536xMLCopydefault2 = xmvCreateSizeConverterWithIndex$default.copydefault(str);
                if (c54536xMLCopydefault2 != null && (c54536xMLCopydefault = c54536xMLCopydefault2.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault.fetchVPNInfo()) != null && (c54536xMLDjBIcL = c54536xMLFetchVPNInfo.djBIcL()) != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
                }
            }
        }
        c50257vHs.values().OLrzqt.setFooterAvaValue(safeString$default);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v14, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C50257vHs c50257vHs, androidx.core.util.Pair pair) {
        xOW newProxyInstance;
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c50257vHs.OLrzqt().AubY().bB_())) {
            if (GridStartTriggerType.Companion.KWHzl(c50257vHs.copydefault().getSignParams())) {
                vSO.Companion.copydefault(c50257vHs.OLrzqt().fvQaOB().djBIcL(), c50257vHs.OLrzqt().fvQaOB().gEmmrt()).show(c50257vHs.getChildFragmentManager(), "BotOrderFailedDialog");
            } else {
                C55326xho.toast$default(((java.lang.Exception) pair.second).getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
            C55867xrz c55867xrz = C55867xrz.KWHzl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String strGEmmrt = c50257vHs.OLrzqt().fvQaOB().gEmmrt();
            java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
            java.lang.String str2 = message == null ? "" : message;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            c55867xrz.KWHzl("bot_create_page", java.lang.String.valueOf(jCurrentTimeMillis), "contract_grid_ai", strGEmmrt, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str2, null, (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 5, null));
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c50257vHs.OLrzqt().values().bB_())) {
            c50257vHs.OLrzqt().getFieldNames().postValue(new LiquidatePriceResponse((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 127, (DefaultConstructorMarker) null));
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c50257vHs.OLrzqt().AhwBna().bB_())) {
            S s = pair.second;
            if (s instanceof BizApiException) {
                Intrinsics.copydefault(s, "");
                if (Intrinsics.EZpvd((java.lang.Object) ((BizApiException) s).getCode(), (java.lang.Object) "51399")) {
                    c50257vHs.AYXKKw = true;
                    C47988uAv c47988uAv = c50257vHs.values().KWHzl;
                    S s2 = pair.second;
                    Intrinsics.copydefault(s2, "");
                    c47988uAv.setInputErrorMsg(C33129mqd.gEmmrt(((BizApiException) s2).getMsg()));
                    c47988uAv.zsXlph();
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void zsXlph() {
        StrategyConfigInfo value = OLrzqt().copydefault().getValue();
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = values().fARcdN;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.EZpvd(c54154wyx, value);
    }

    private final void wlaJM() {
        AbstractC48524uUp abstractC48524uUpValues = values();
        java.lang.String direction = OLrzqt().uzCIH().getDirection();
        if (direction != null) {
            int iHashCode = direction.hashCode();
            if (iHashCode != 3327612) {
                if (iHashCode != 109413500) {
                    if (iHashCode == 1844321735 && direction.equals("neutral")) {
                        abstractC48524uUpValues.gEmmrt.setTitle(C33070mpX.AYXKKw(C55688xof.Application.FullyDrawnReporterExternalSyntheticLambda0));
                        abstractC48524uUpValues.fetchVPNInfo.setTitle(C33070mpX.AYXKKw(C55688xof.Application.removeReporter));
                    }
                } else if (direction.equals("short")) {
                    abstractC48524uUpValues.fetchVPNInfo.setTitle(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy));
                }
            } else if (direction.equals("long")) {
                abstractC48524uUpValues.gEmmrt.setTitle(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy));
            }
        }
        ContractManuallyPresenter.requestLiqPrice$default(OLrzqt(), false, false, false, true, 7, null);
    }

    private final void AubY() {
        getChildFragmentManager().setFragmentResultListener("bot_order", this, new FragmentResultListener() { // from class: o.vHL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C50257vHs.OLrzqt(this.OLrzqt, str, bundle);
            }
        });
    }

    public static final void OLrzqt(C50257vHs c50257vHs, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ContractManuallyPresenter.order$default(c50257vHs.OLrzqt(), !c50257vHs.isConnected(), false, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean AuCTel() {
        java.lang.String safeString$default;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String minInvestment;
        C54536xML c54536xMLAuCTel;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        boolean z = true;
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt(OLrzqt().fvQaOB().djBIcL())) == null) {
            safeString$default = "";
        } else {
            java.lang.String strValueOf = OLrzqt().fvQaOB().valueOf();
            if (strValueOf == null) {
                strValueOf = "";
            }
            xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, strValueOf, null, 2, null);
            if (xmvCreateSizeConverterWithIndex$default != null) {
                MinInvestResp value = OLrzqt().zsXlph().getValue();
                if (value == null || (minInvestment = value.getMinInvestment()) == null) {
                    minInvestment = "";
                }
                C54536xML c54536xMLOLrzqt = xmvCreateSizeConverterWithIndex$default.OLrzqt(minInvestment);
                if (c54536xMLOLrzqt == null || (c54536xMLAuCTel = c54536xMLOLrzqt.AuCTel()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) == null) {
                }
            }
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) values().KWHzl.AkhnZx()) && C33129mqd.valueOf(values().KWHzl.AkhnZx(), safeString$default)) {
            int i = C55688xof.Application.ActivityResultContractsPickVisualMedia;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2Default));
            pairArr[1] = C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(safeString$default));
            BizInstrument bizInstrumentAhwBna = OLrzqt().fvQaOB().AhwBna();
            java.lang.String marginSymbol = bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getMarginSymbol() : null;
            pairArr[2] = C56390yDp.OLrzqt("unit", marginSymbol != null ? marginSymbol : "");
            values().KWHzl.setInputErrorMsg(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
            z = false;
        } else if (!this.AYXKKw) {
            values().KWHzl.copydefault();
        }
        zLjUOn();
        return z;
    }

    private final void zLjUOn() {
        java.lang.String value = OLrzqt().zLjUOn().getValue();
        android.widget.TextView textView = values().copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((value == null || !C33129mqd.AEQbTJ(values().KWHzl.AkhnZx(), value)) ? 8 : 0);
    }

    private final void OLrzqt(java.lang.String str) {
        android.content.Context context = getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.EZpvd(str);
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.fjfviF), new View.OnClickListener() { // from class: o.vHt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C50257vHs.EZpvd(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fJNWhG() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AbstractC54531xLw abstractC54531xLwAEQbTJ = OLrzqt().fvQaOB().AEQbTJ();
        boolean z = (abstractC54531xLwAEQbTJ == null || abstractC54531xLwAEQbTJ.getFieldNames()) ? false : true;
        this.gEmmrt = z;
        if (z) {
            wYF wyf = this.AEQbTJ;
            if (wyf != null) {
                wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.init));
                return;
            }
            return;
        }
        wYF wyf2 = this.AEQbTJ;
        if (wyf2 != null) {
            wyf2.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hDKMBd() {
        C32866mlf.onEvent$default("AIBotPlaceOrder_Sheet_PlaceOrder_Click", (TrackChannel[]) null, new Function1() { // from class: o.vHF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50257vHs.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "contract_grid", false, 4, null);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String getFormatedRatio$default(C50257vHs c50257vHs, java.lang.String str, RoundingMode roundingMode, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            roundingMode = RoundingMode.FLOOR;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        return c50257vHs.KWHzl(str, roundingMode, z);
    }

    private final java.lang.String KWHzl(java.lang.String str, RoundingMode roundingMode, boolean z) {
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) str)) {
            return "--";
        }
        if (z) {
            xMR xmr = xMR.copydefault;
            if (str == null) {
                str = "";
            }
            return xmr.copydefault(str, 2, 0, roundingMode);
        }
        xMR xmr2 = xMR.copydefault;
        if (str == null) {
            str = "";
        }
        return xmr2.EZpvd(str, 2, 0, roundingMode);
    }
}
