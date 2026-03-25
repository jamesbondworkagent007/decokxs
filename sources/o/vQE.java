package o;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.biz.TradeType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.order.strategy.recommend.presenter.BotRecommendPresenter;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.LossInsuranceDisplayData;
import com.okinc.unify_trade.biz.MaxAvailableResp;
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
import com.okinc.unify_trade.biz.TicketEligibility;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import com.okinc.unify_trade.bot.grid.viewmodel.SpotGridPresenter;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
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
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class vQE extends AbstractC49945uyC<AbstractC48527uUs, SpotGridPresenter> {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int KWHzl = 8;
    public final Function2<C47988uAv, java.lang.String, Unit> AEQbTJ;
    public boolean AhwBna;
    public InterfaceC53558wnk AkhnZx;
    public final InterfaceC56387yDm copydefault;
    public final int gEmmrt = C48033uCm.Activity.fbC;
    public final boolean OLrzqt = true;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.vQU
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vQE.AYXKKw(this.EZpvd);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.vQG
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return vQE.valueOf(this.AEQbTJ);
        }
    });
    public final C43316rmw djBIcL = new C43316rmw();

    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
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
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.OLrzqt;
    }

    public static final /* synthetic */ AbstractC48527uUs AhwBna(vQE vqe) {
        return vqe.values();
    }

    public vQE() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridAiOrderDialog$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridAiOrderDialog$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridAiOrderDialog$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridAiOrderDialog$special$$inlined$viewModels$default$4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.dialog.SpotGridAiOrderDialog$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.AkhnZx = new LoaderManager();
        this.AEQbTJ = new Function2() { // from class: o.vQL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vQE.copydefault(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
    }

    public static final GridReq AYXKKw(vQE vqe) {
        android.os.Parcelable parcelableOLrzqt = BotRecommendPresenter.Companion.OLrzqt(vqe.fJNWhG());
        Intrinsics.copydefault(parcelableOLrzqt, "");
        return (GridReq) parcelableOLrzqt;
    }

    public final GridReq copydefault() {
        return (GridReq) this.AYXKKw.getValue();
    }

    private final SmartRecommendResp fJNWhG() {
        return (SmartRecommendResp) this.valueOf.getValue();
    }

    public static final SmartRecommendResp valueOf(vQE vqe) {
        SmartRecommendResp smartRecommendResp;
        android.os.Bundle arguments = vqe.getArguments();
        return (arguments == null || (smartRecommendResp = (SmartRecommendResp) arguments.getParcelable("data")) == null) ? new SmartRecommendResp(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1, null) : smartRecommendResp;
    }

    private final C55915xsu fARcdN() {
        return (C55915xsu) this.copydefault.getValue();
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vQE.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final void AEQbTJ(@NotNull SmartRecommendResp smartRecommendResp, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(smartRecommendResp, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            vQE vqe = new vQE();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", smartRecommendResp);
            vqe.setArguments(bundle);
            vqe.show(fragmentManager, vQE.class.getSimpleName());
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        fIwbmz();
        getFieldNames();
        uzCIH();
        iwGUEr();
        getNewProxyInstance();
        zsXlph();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.ActivityComposeUtilsKt));
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new ActionBar(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setOKDSSize(44);
        wyf.setOnClickListener(new Application(wyf, 1000L, this));
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ vQE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, vQE vqe) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = vqe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.copydefault.AuCTel();
            }
        }
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ vQE OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, vQE vqe) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = vqe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            xOW newProxyInstance;
            InterfaceC8104awT interfaceC8104awT;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.hDKMBd();
                if (C55697xoo.OLrzqt.isConnected()) {
                    this.OLrzqt.isConnected();
                    android.widget.TextView textView = vQE.AhwBna(this.OLrzqt).copydefault;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    if (textView.getVisibility() == 0) {
                        C56002xub.KWHzl.OLrzqt();
                        return;
                    }
                    if (vQE.AhwBna(this.OLrzqt).KWHzl.hDKMBd()) {
                        this.OLrzqt.copydefault().setQuoteSz(vQE.AhwBna(this.OLrzqt).KWHzl.AkhnZx());
                        this.OLrzqt.copydefault().setTradeQuoteCcy(this.OLrzqt.OLrzqt().fvQaOB().AEQbTJ("grid"));
                        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.QbewEr()) {
                            StrategyBaseReq strategyBaseReq = new StrategyBaseReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (TradeType) null, (java.lang.String) null, (java.lang.Boolean) null, 2047, (DefaultConstructorMarker) null);
                            strategyBaseReq.setInstId(this.OLrzqt.OLrzqt().fvQaOB().gEmmrt());
                            strategyBaseReq.setTdMode("cash");
                            strategyBaseReq.setOrdType("grid");
                            AbstractC50583vTu abstractC50583vTuNewInstance$default = AbstractC50583vTu.Application.newInstance$default(AbstractC50583vTu.Companion, this.OLrzqt.OLrzqt().fvQaOB().gEmmrt(), this.OLrzqt.OLrzqt().fvQaOB().djBIcL(), new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, this.OLrzqt.copydefault(), (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, C54149wys.AEQbTJ.EZpvd(this.OLrzqt.OLrzqt().fetchVPNInfo().getValue()), (DcaOrderReq) null, (AiOrderReq) null, 28662, (DefaultConstructorMarker) null), false, 8, null);
                            if (abstractC50583vTuNewInstance$default != null) {
                                abstractC50583vTuNewInstance$default.show(this.OLrzqt.getChildFragmentManager(), AbstractC50583vTu.class.getSimpleName());
                                return;
                            }
                            return;
                        }
                        pUU.KWHzl("BotOrder", "二次确认功能关闭 SpotGridAiOrderDialog Start Order");
                        this.OLrzqt.OLrzqt().RcXXUw();
                        return;
                    }
                    return;
                }
                android.content.Context context = this.OLrzqt.getContext();
                if (context == null || (interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class)) == null) {
                    return;
                }
                InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, context, null, 2, null);
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ vQE copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vQE vqe) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = vqe;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                RecyclerView recyclerView = vQE.AhwBna(this.copydefault).gEmmrt;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                boolean z = !(recyclerView.getVisibility() == 0);
                android.widget.ImageView imageView = vQE.AhwBna(this.copydefault).OLrzqt;
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(z ? C52761wXj.TaskDescription.QslYrK : C52761wXj.TaskDescription.abAflu);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.iLWfRf));
                } else {
                    drawableKWHzl = null;
                }
                imageView.setImageDrawable(drawableKWHzl);
                RecyclerView recyclerView2 = vQE.AhwBna(this.copydefault).gEmmrt;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                recyclerView2.setVisibility(z ? 0 : 8);
                android.view.View view2 = vQE.AhwBna(this.copydefault).values;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                view2.setVisibility(z ? 0 : 8);
                android.widget.TextView textView = vQE.AhwBna(this.copydefault).djBIcL;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(z ? 0 : 8);
            }
        }
    }

    private final void fIwbmz() {
        SpotGridPresenter spotGridPresenterOLrzqt = OLrzqt();
        java.lang.String instType = fJNWhG().getInstType();
        if (instType == null) {
            instType = "";
        }
        java.lang.String instId = fJNWhG().getInstId();
        spotGridPresenterOLrzqt.OLrzqt(instType, instId != null ? instId : "");
        SpotGridPresenter spotGridPresenterOLrzqt2 = OLrzqt();
        GridReq gridReqCopydefault = copydefault();
        gridReqCopydefault.setSignParams(OLrzqt().gEmmrt());
        gridReqCopydefault.setTradeQuoteCcy(OLrzqt().fARcdN());
        spotGridPresenterOLrzqt2.KWHzl(gridReqCopydefault);
        OLrzqt().AxsJAY();
        SpotGridPresenter.getGridConfigInfo$default(OLrzqt(), null, 1, null);
    }

    private final void uzCIH() {
        ejfBZ();
        values().gEmmrt.setLayoutManager(new LinearLayoutManager(getContext()));
        values().gEmmrt.setAdapter(this.djBIcL);
        values().gEmmrt.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(10.0f, null, 1, null), 0));
        this.djBIcL.register(BotParamItemData.class, new C51263vji());
        this.djBIcL.register(C55848xrg.class, new C51233vjE());
        C33064mpR.OLrzqt(this.djBIcL, (java.util.List<? extends java.lang.Object>) C55995xuU.copydefault.copydefault(fJNWhG(), (android.os.Parcelable) copydefault(), new Function1() { // from class: o.vQS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vQE.gEmmrt(this.KWHzl, (java.lang.String) obj);
            }
        }));
    }

    public static final java.lang.String gEmmrt(vQE vqe, java.lang.String str) {
        C54536xML c54536xMLKWHzl;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLCopydefault;
        java.lang.String safeString$default;
        Intrinsics.checkNotNullParameter(str, "");
        xMS xmsCopydefault = vqe.OLrzqt().fvQaOB().copydefault();
        return (xmsCopydefault == null || (c54536xMLKWHzl = xmsCopydefault.KWHzl(str)) == null || (c54536xMLDjBIcL = c54536xMLKWHzl.djBIcL()) == null || (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) == null || (c54536xMLCopydefault = c54536xMLFetchVPNInfo.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) ? "--" : safeString$default;
    }

    public static final class LoaderManager implements InterfaceC53558wnk {
        public LoaderManager() {
        }

        @Override // o.InterfaceC53558wnk
        public void AEQbTJ(Function1<? super java.lang.String, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            vQE.AhwBna(vQE.this).DbNXlk.setOnSelectedCallback(function1);
            vQE.AhwBna(vQE.this).DbNXlk.setFm(vQE.this.getChildFragmentManager());
        }

        @Override // o.InterfaceC53558wnk
        public java.lang.String EZpvd(ViewModelStoreOwner viewModelStoreOwner, BizInstrument bizInstrument, TradeType tradeType) {
            Intrinsics.checkNotNullParameter(tradeType, "");
            vQE.AhwBna(vQE.this).DbNXlk.copydefault(viewModelStoreOwner, bizInstrument, tradeType, false);
            uBL ubl = vQE.AhwBna(vQE.this).DbNXlk;
            Intrinsics.checkNotNullExpressionValue(ubl, "");
            ubl.setVisibility((bizInstrument == null || !bizInstrument.isDisplayTradeReceive()) ? 8 : 0);
            return AhwBna();
        }

        @Override // o.InterfaceC53558wnk
        public java.lang.String AhwBna() {
            return vQE.AhwBna(vQE.this).DbNXlk.OLrzqt();
        }
    }

    private final void getFieldNames() {
        InterfaceC53558wnk interfaceC53558wnk = this.AkhnZx;
        interfaceC53558wnk.AEQbTJ(new Function1() { // from class: o.vQM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vQE.OLrzqt(this.KWHzl, (java.lang.String) obj);
            }
        });
        OLrzqt().fvQaOB().gEmmrt(interfaceC53558wnk.EZpvd(getParentFragment(), OLrzqt().fvQaOB().AhwBna(), TradeType.BUY_OPEN));
    }

    public static final Unit OLrzqt(vQE vqe, java.lang.String str) {
        pUU.EZpvd("USDRename", "SpotGridAiOrderDialog onTradeWith selected: " + str);
        vqe.OLrzqt().fvQaOB().gEmmrt(str);
        vqe.AubY();
        vqe.AuCTelauCTel();
        return Unit.INSTANCE;
    }

    private final void AubY() {
        java.lang.String strCopydefault = OLrzqt().fvQaOB().copydefault("grid");
        values().EZpvd.setTransferCoin(strCopydefault);
        values().KWHzl.setInputUnit(strCopydefault);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void ejfBZ() {
        java.lang.String quoteDig;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        BizInstrument bizInstrumentAhwBna = OLrzqt().fvQaOB().AhwBna();
        AubY();
        final C47988uAv c47988uAv = values().KWHzl;
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt("SPOT")) == null) {
            quoteDig = null;
        } else {
            if (bizInstrumentAhwBna == null || (instFamily = bizInstrumentAhwBna.getInstFamily()) == null) {
                instFamily = "";
            }
            IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(instFamily);
            if (idxConfigAkhnZx != null) {
                quoteDig = idxConfigAkhnZx.getQuoteDig();
            }
        }
        c47988uAv.setMaxDecimal((quoteDig == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) quoteDig)) ? 8 : C33129mqd.AhwBna(quoteDig));
        c47988uAv.setOnTextChangeCallback(this.AEQbTJ);
        c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.vQK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vQE.OLrzqt(c47988uAv, this, ((java.lang.Float) obj).floatValue());
            }
        });
    }

    public static final Unit OLrzqt(C47988uAv c47988uAv, vQE vqe, float f) {
        if (!c47988uAv.zLjUOn()) {
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
        } else {
            java.lang.String safeString$default = null;
            c47988uAv.setOnTextChangeCallback(null);
            C54571xNh c54571xNhCreateAmtConvert$default = C56059xvf.createAmtConvert$default(C56059xvf.EZpvd, null, true, 1, null);
            if (c54571xNhCreateAmtConvert$default != null) {
                float fFJNWhG = c47988uAv.fJNWhG();
                MaxAvailableResp maxAvailableResp = vqe.fARcdN().AEQbTJ().get();
                C54536xML c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default.AYXKKw(C33129mqd.mulS$default(java.lang.Float.valueOf(fFJNWhG), maxAvailableResp != null ? maxAvailableResp.getQuoteMax() : null, null, null, null, 14, null));
                if (c54536xMLAYXKKw != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null);
                }
            }
            C47988uAv.setInputContent$default(c47988uAv, safeString$default, false, false, 6, null);
            vqe.isConnected();
            c47988uAv.setOnTextChangeCallback(vqe.AEQbTJ);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vQE vqe, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        C47988uAv c47988uAv2 = vqe.values().KWHzl;
        vqe.isConnected();
        if (c47988uAv2.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(c47988uAv2, false, 1, null);
        }
        return Unit.INSTANCE;
    }

    private final void iwGUEr() {
        android.widget.ImageView imageView = values().OLrzqt;
        imageView.setOnClickListener(new StateListAnimator(imageView, 1000L, this));
    }

    private final void getNewProxyInstance() {
        TradeLiveData<StrategyConfigInfo> tradeLiveDataFetchVPNInfo = OLrzqt().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataFetchVPNInfo.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.vQI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vQE.KWHzl(this.AEQbTJ, (StrategyConfigInfo) obj);
            }
        }));
        C56111xwe<MinInvestResp> c56111xweZuBGHE = OLrzqt().zuBGHE();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweZuBGHE.observe(viewLifecycleOwner2, new Activity(new Function1() { // from class: o.vQF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vQE.copydefault(this.copydefault, (MinInvestResp) obj);
            }
        }));
        TradeLiveData<StrategyResponse> tradeLiveDataGHZMYf = OLrzqt().gHZMYf();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataGHZMYf.observe(viewLifecycleOwner3, new Activity(new Function1() { // from class: o.vQN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vQE.AEQbTJ(this.KWHzl, (StrategyResponse) obj);
            }
        }));
        C56111xwe<java.lang.String> c56111xweAhwBna = fARcdN().AhwBna();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56111xweAhwBna.observe(viewLifecycleOwner4, new Activity(new Function1() { // from class: o.vQJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vQE.EZpvd(this.copydefault, (java.lang.String) obj);
            }
        }));
        TradeLiveData<TicketEligibility> tradeLiveDataFIwbmz = OLrzqt().fIwbmz();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        tradeLiveDataFIwbmz.observe(viewLifecycleOwner5, new Activity(new Function1() { // from class: o.vQP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vQE.AEQbTJ(this.KWHzl, (TicketEligibility) obj);
            }
        }));
        OLrzqt().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.vQO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vQE.EZpvd(this.KWHzl, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit KWHzl(vQE vqe, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        vqe.OLrzqt().djSkpj();
        vqe.wlaJM();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vQE vqe, MinInvestResp minInvestResp) {
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(minInvestResp, "");
        if (C33129mqd.AEQbTJ(minInvestResp.getMinQuoteSz(), 0)) {
            str = "≥ " + xMR.copydefault.copydefault(SpotGridPresenter.converterSz$default(vqe.OLrzqt(), minInvestResp.getMinQuoteSz(), null, vqe.OLrzqt().fvQaOB().DbNXlk(), 2, null));
        }
        vqe.values().KWHzl.setInputHint(str);
        vqe.isConnected();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vQE vqe, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        vqe.AuCTel();
        FragmentActivity activity = vqe.getActivity();
        if (activity != null) {
            ActivityC51150vhb.Companion.AEQbTJ(activity, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : "grid", (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : strategyResponse.getAlgoId(), (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? null : null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(vQE vqe, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C47988uAv c47988uAv = vqe.values().KWHzl;
        if (c47988uAv.zLjUOn()) {
            java.lang.String safeString$default = null;
            C54571xNh c54571xNhCreateAmtConvert$default = C56059xvf.createAmtConvert$default(C56059xvf.EZpvd, null, true, 1, null);
            if (c54571xNhCreateAmtConvert$default != null) {
                float fFJNWhG = c47988uAv.fJNWhG();
                MaxAvailableResp maxAvailableResp = vqe.fARcdN().AEQbTJ().get();
                C54536xML c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default.AYXKKw(C33129mqd.mulS$default(java.lang.Float.valueOf(fFJNWhG), maxAvailableResp != null ? maxAvailableResp.getQuoteMax() : null, null, null, null, 14, null));
                if (c54536xMLAYXKKw != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null);
                }
            }
            C47988uAv.setInputContent$default(c47988uAv, safeString$default, false, false, 6, null);
            vqe.isConnected();
        }
        vqe.values().EZpvd.setFooterAvaValue(str);
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vQE vqe, TicketEligibility ticketEligibility) {
        vqe.values().valueOf.setData(new LossInsuranceDisplayData(ticketEligibility != null ? ticketEligibility.getEntityValue() : null, ticketEligibility != null ? ticketEligibility.getEntityStatus() : null, ticketEligibility != null ? java.lang.Boolean.valueOf(ticketEligibility.getEligible()) : null, "grid", yDY.copydefault(vqe.OLrzqt().fvQaOB().gEmmrt()), false, null, null, null, null, null, false, null, 8128, null));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(vQE vqe, androidx.core.util.Pair pair) {
        xOW newProxyInstance;
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) vqe.OLrzqt().sSMYrx().bB_())) {
            if (GridStartTriggerType.Companion.KWHzl(vqe.copydefault().getSignParams())) {
                vSO.Companion.copydefault(vqe.OLrzqt().fvQaOB().djBIcL(), vqe.OLrzqt().fvQaOB().gEmmrt()).show(vqe.getChildFragmentManager(), "BotOrderFailedDialog");
            } else {
                C55326xho.toast$default(((java.lang.Exception) pair.second).getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            }
            C55867xrz c55867xrz = C55867xrz.KWHzl;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            java.lang.String strGEmmrt = vqe.OLrzqt().fvQaOB().gEmmrt();
            java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
            if (message == null) {
                message = "";
            }
            java.lang.String str = message;
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            c55867xrz.KWHzl("bot_create_page", java.lang.String.valueOf(jCurrentTimeMillis), "spot_grid_ai", strGEmmrt, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str, null, (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 5, null));
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AuCTelauCTel();
    }

    private final void AuCTelauCTel() {
        fARcdN().AYXKKw();
        fARcdN().EZpvd("grid", (64 & 2) != 0 ? "cash" : null, (64 & 4) != 0 ? "" : null, (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? OLrzqt().fvQaOB().AkhnZx() : null);
    }

    private final void zsXlph() {
        getChildFragmentManager().setFragmentResultListener("bot_order", this, new FragmentResultListener() { // from class: o.vQQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                vQE.OLrzqt(this.OLrzqt, str, bundle);
            }
        });
    }

    public static final void OLrzqt(vQE vqe, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        pUU.KWHzl("Order", "BotGuideContractGridFragment Order");
        vqe.OLrzqt().RcXXUw();
    }

    private final void wlaJM() {
        StrategyConfigInfo value = OLrzqt().fetchVPNInfo().getValue();
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = values().isConnected;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.EZpvd(c54154wyx, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean isConnected() {
        java.lang.String safeString$default;
        java.lang.String minQuoteSz;
        C54536xML c54536xMLAuCTel;
        java.lang.String strValueOf = OLrzqt().fvQaOB().valueOf();
        if (strValueOf == null) {
            strValueOf = "";
        }
        C54571xNh c54571xNhOLrzqt = C54566xNc.OLrzqt("SPOT", strValueOf, OLrzqt().fvQaOB().DbNXlk());
        boolean z = true;
        if (c54571xNhOLrzqt == null) {
            safeString$default = "";
        } else {
            MinInvestResp value = OLrzqt().zuBGHE().getValue();
            if (value == null || (minQuoteSz = value.getMinQuoteSz()) == null) {
                minQuoteSz = "";
            }
            C54536xML c54536xMLDjBIcL = c54571xNhOLrzqt.djBIcL(minQuoteSz);
            if (c54536xMLDjBIcL == null || (c54536xMLAuCTel = c54536xMLDjBIcL.AuCTel()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLAuCTel, false, 1, null)) == null) {
            }
        }
        C47988uAv c47988uAv = values().KWHzl;
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) c47988uAv.AkhnZx()) || C33129mqd.copydefault(c47988uAv.AkhnZx(), safeString$default)) {
            c47988uAv.copydefault();
        } else {
            int i = C55688xof.Application.ActivityResultContractsPickVisualMedia;
            kotlin.Pair[] pairArr = new kotlin.Pair[3];
            pairArr[0] = C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2));
            pairArr[1] = C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(safeString$default));
            java.lang.String strAYXKKw = OLrzqt().fvQaOB().AYXKKw();
            pairArr[2] = C56390yDp.OLrzqt("unit", strAYXKKw != null ? strAYXKKw : "");
            c47988uAv.setInputErrorMsg(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
            z = false;
        }
        zLjUOn();
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AuCTel() {
        java.lang.Object objM7377constructorimpl;
        if (this.AhwBna) {
            return;
        }
        this.AhwBna = true;
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        try {
            Result.Application application = Result.Companion;
            if (isAdded()) {
                dismissAllowingStateLoss();
            }
            if (!isAdded()) {
                this.AhwBna = false;
            }
            objM7377constructorimpl = Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl != null) {
            this.AhwBna = false;
            pUU.AEQbTJ("SpotGridAiOrderDialog", "dismissAllowingStateLoss failed", thM7380exceptionOrNullimpl);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zLjUOn() {
        boolean z;
        MaxAvailableResp maxAvailableResp = fARcdN().AEQbTJ().get();
        if ((maxAvailableResp != null ? maxAvailableResp.getQuoteMax() : null) != null) {
            java.lang.String strAkhnZx = values().KWHzl.AkhnZx();
            MaxAvailableResp maxAvailableResp2 = fARcdN().AEQbTJ().get();
            z = C33129mqd.AEQbTJ(strAkhnZx, maxAvailableResp2 != null ? maxAvailableResp2.getQuoteMax() : null);
        }
        android.widget.TextView textView = values().copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(z ? 0 : 8);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        fARcdN().AYXKKw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hDKMBd() {
        C32866mlf.onEvent$default("AIBotPlaceOrder_Sheet_PlaceOrder_Click", (TrackChannel[]) null, new Function1() { // from class: o.vQR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vQE.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "grid", false, 4, null);
        return Unit.INSTANCE;
    }
}
