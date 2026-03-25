package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.order.strategy.contractdca.presenter.ContractDcaManualPresenter;
import com.okinc.tradingbot.impl.order.strategy.recommend.presenter.BotRecommendPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcaTriggerParam;
import com.okinc.unify_trade.biz.IdxConfig;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.bot.config.SpotDcaInvestTypeData;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import com.okinc.unify_trade.bot.data.BotParamColorItemData;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC49496upe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vDm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C50143vDm extends AbstractC49945uyC<AbstractC48528uUt, ContractDcaManualPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final Function2<C47988uAv, java.lang.String, Unit> AEQbTJ;
    public final InterfaceC56387yDm OLrzqt;
    public wYF copydefault;
    public final int AhwBna = C48033uCm.Activity.fcfzuX;
    public final InterfaceC56387yDm AYXKKw = C56392yDr.copydefault(new Function0() { // from class: o.vDq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C50143vDm.valueOf(this.copydefault);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.vDw
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C50143vDm.gEmmrt(this.AEQbTJ);
        }
    });
    public final C43316rmw djBIcL = new C43316rmw();

    /* JADX INFO: renamed from: o.vDm$LoaderManager */
    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
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
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.AhwBna;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final /* synthetic */ AbstractC48528uUt AYXKKw(C50143vDm c50143vDm) {
        return c50143vDm.values();
    }

    public C50143vDm() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.dialog.ContractDcaAiOrderDialog$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.dialog.ContractDcaAiOrderDialog$special$$inlined$viewModels$default$2
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.dialog.ContractDcaAiOrderDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.dialog.ContractDcaAiOrderDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractdca.ui.dialog.ContractDcaAiOrderDialog$special$$inlined$viewModels$default$5
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
        this.AEQbTJ = new Function2() { // from class: o.vDz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50143vDm.AEQbTJ(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
    }

    public final DcaOrderReq fIwbmz() {
        return (DcaOrderReq) this.AYXKKw.getValue();
    }

    public static final DcaOrderReq valueOf(C50143vDm c50143vDm) {
        android.os.Parcelable parcelableOLrzqt = BotRecommendPresenter.Companion.OLrzqt(c50143vDm.fJNWhG());
        Intrinsics.copydefault(parcelableOLrzqt, "");
        return (DcaOrderReq) parcelableOLrzqt;
    }

    public final SmartRecommendResp fJNWhG() {
        return (SmartRecommendResp) this.valueOf.getValue();
    }

    public static final SmartRecommendResp gEmmrt(C50143vDm c50143vDm) {
        SmartRecommendResp smartRecommendResp;
        android.os.Bundle arguments = c50143vDm.getArguments();
        return (arguments == null || (smartRecommendResp = (SmartRecommendResp) arguments.getParcelable("data")) == null) ? new SmartRecommendResp(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1, null) : smartRecommendResp;
    }

    private final C55915xsu getNewProxyInstance() {
        return (C55915xsu) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean hDKMBd() {
        AbstractC54531xLw abstractC54531xLwAEQbTJ = OLrzqt().fvQaOB().AEQbTJ();
        return (abstractC54531xLwAEQbTJ == null || abstractC54531xLwAEQbTJ.getFieldNames()) ? false : true;
    }

    /* JADX INFO: renamed from: o.vDm$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vDm.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final void AEQbTJ(@NotNull SmartRecommendResp smartRecommendResp, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(smartRecommendResp, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C50143vDm c50143vDm = new C50143vDm();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", smartRecommendResp);
            c50143vDm.setArguments(bundle);
            c50143vDm.show(fragmentManager, C50143vDm.class.getSimpleName());
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        uzCIH();
        wlaJM();
        AubY();
        AuCTelauCTel();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.FQMcgE));
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Dialog(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.copydefault = wyf;
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0));
        wyf.setOKDSSize(44);
        wyf.setOnClickListener(new Fragment(wyf, 1000L, this));
    }

    private final void uzCIH() {
        ContractDcaManualPresenter contractDcaManualPresenterOLrzqt = OLrzqt();
        java.lang.String instType = fJNWhG().getInstType();
        if (instType == null) {
            instType = "";
        }
        java.lang.String instId = fJNWhG().getInstId();
        contractDcaManualPresenterOLrzqt.OLrzqt(instType, instId != null ? instId : "");
        OLrzqt().AEQbTJ();
        OLrzqt().EZpvd();
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.xuU.getParams$default(o.xuU, com.okinc.unify_trade.biz.bot.SmartRecommendResp, android.os.Parcelable, kotlin.jvm.functions.Function1, int, java.lang.Object):java.util.List */
    private final void wlaJM() {
        fARcdN();
        zsXlph();
        values().isConnected.setLayoutManager(new LinearLayoutManager(getContext()));
        values().isConnected.setAdapter(this.djBIcL);
        values().isConnected.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(10.0f, null, 1, null), 0));
        this.djBIcL.register(BotParamItemData.class, new C51263vji());
        this.djBIcL.register(BotParamColorItemData.class, new C51261vjg());
        this.djBIcL.register(C55848xrg.class, new C51233vjE());
        C33064mpR.OLrzqt(this.djBIcL, (java.util.List<? extends java.lang.Object>) C55995xuU.getParams$default(C55995xuU.copydefault, fJNWhG(), fIwbmz(), null, 4, null));
        vKO vko = values().AkhnZx;
        vko.setTitle(C33070mpX.AYXKKw(C55688xof.Application.hDKMBd));
        vko.EZpvd(true, new View.OnClickListener() { // from class: o.vDv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50143vDm.AEQbTJ(this.EZpvd, view);
            }
        });
        values().KWHzl.setChecked(false);
        C47988uAv c47988uAv = values().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c47988uAv.setVisibility(8);
    }

    /* JADX INFO: renamed from: o.vDm$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C50143vDm AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C50143vDm c50143vDm) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = c50143vDm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C33070mpX.OLrzqt(C48033uCm.Fragment.fsSxsn, viewOnClickListenerC54939xaY.getContext()));
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.OLrzqt(C48033uCm.Fragment.gUEfcq, viewOnClickListenerC54939xaY.getContext()));
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.fjfviF), (View.OnClickListener) new FragmentManager(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.vDm$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C50143vDm AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C50143vDm c50143vDm) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = c50143vDm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            BotRangeConfig lever;
            BotRangeConfig lever2;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C50191vFg c50191vFg = (C50191vFg) this.OLrzqt;
                java.lang.String strGEmmrt = this.AEQbTJ.OLrzqt().fvQaOB().gEmmrt();
                java.lang.String strDjBIcL = this.AEQbTJ.OLrzqt().fvQaOB().djBIcL();
                StrategyConfigInfo value = this.AEQbTJ.OLrzqt().valueOf().getValue();
                java.lang.String max = null;
                java.lang.String leveragePercents = value != null ? value.getLeveragePercents() : null;
                StrategyConfigInfo value2 = this.AEQbTJ.OLrzqt().valueOf().getValue();
                java.lang.String min = (value2 == null || (lever2 = value2.getLever()) == null) ? null : lever2.getMin();
                StrategyConfigInfo value3 = this.AEQbTJ.OLrzqt().valueOf().getValue();
                if (value3 != null && (lever = value3.getLever()) != null) {
                    max = lever.getMax();
                }
                java.lang.String direction = this.AEQbTJ.fIwbmz().getDirection();
                androidx.fragment.app.FragmentManager childFragmentManager = this.AEQbTJ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c50191vFg.AEQbTJ(strGEmmrt, strDjBIcL, leveragePercents, min, max, direction, "cross", childFragmentManager, "contract_dca");
            }
        }
    }

    /* JADX INFO: renamed from: o.vDm$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C50143vDm EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C50143vDm c50143vDm) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c50143vDm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.iwGUEr();
            }
        }
    }

    /* JADX INFO: renamed from: o.vDm$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C50143vDm KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C50143vDm c50143vDm) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c50143vDm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                wYF wyf = (wYF) this.AEQbTJ;
                if (!this.KWHzl.hDKMBd()) {
                    this.KWHzl.ejfBZ();
                    ContractDcaManualPresenter contractDcaManualPresenterOLrzqt = this.KWHzl.OLrzqt();
                    C47988uAv c47988uAv = C50143vDm.AYXKKw(this.KWHzl).EZpvd;
                    Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                    contractDcaManualPresenterOLrzqt.EZpvd(c47988uAv, C50143vDm.AYXKKw(this.KWHzl).EZpvd.fARcdN());
                    android.widget.TextView textView = C50143vDm.AYXKKw(this.KWHzl).gEmmrt;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    if (textView.getVisibility() == 0) {
                        C56002xub.KWHzl.OLrzqt();
                        return;
                    }
                    if (C50143vDm.AYXKKw(this.KWHzl).EZpvd.hDKMBd() && this.KWHzl.getFieldNames()) {
                        pUU.KWHzl("BotOrder", "ContractDcaAiOrderDialog Start Order");
                        ContractDcaManualPresenter contractDcaManualPresenterOLrzqt2 = this.KWHzl.OLrzqt();
                        C50143vDm c50143vDm = this.KWHzl;
                        DcaOrderReq dcaOrderReqKWHzl = c50143vDm.KWHzl(C50143vDm.AYXKKw(c50143vDm).EZpvd.AkhnZx());
                        androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                        contractDcaManualPresenterOLrzqt2.EZpvd(dcaOrderReqKWHzl, childFragmentManager);
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

    /* JADX INFO: renamed from: o.vDm$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ C50143vDm AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C50143vDm c50143vDm) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = c50143vDm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                RecyclerView recyclerView = C50143vDm.AYXKKw(this.AEQbTJ).isConnected;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                boolean z = !(recyclerView.getVisibility() == 0);
                AppCompatImageView appCompatImageView = C50143vDm.AYXKKw(this.AEQbTJ).AhwBna;
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(z ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
                } else {
                    drawableKWHzl = null;
                }
                appCompatImageView.setImageDrawable(drawableKWHzl);
                RecyclerView recyclerView2 = C50143vDm.AYXKKw(this.AEQbTJ).isConnected;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                recyclerView2.setVisibility(z ? 0 : 8);
                android.view.View view2 = C50143vDm.AYXKKw(this.AEQbTJ).fJNWhG;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                view2.setVisibility(z ? 0 : 8);
                android.widget.TextView textView = C50143vDm.AYXKKw(this.AEQbTJ).AuCTel;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(z ? 0 : 8);
            }
        }
    }

    /* JADX INFO: renamed from: o.vDm$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ C50143vDm AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C50143vDm c50143vDm) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c50143vDm;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C53274wiR c53274wiRAEQbTJ = C53274wiR.Companion.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.DuXjdv), this.AEQbTJ.OLrzqt().fIwbmz());
                androidx.fragment.app.FragmentManager childFragmentManager = this.AEQbTJ.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c53274wiRAEQbTJ.show(childFragmentManager);
            }
        }
    }

    public static final void AEQbTJ(C50143vDm c50143vDm, android.view.View view) {
        android.content.Context contextRequireContext = c50143vDm.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.FSMca));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.fjfviF), new View.OnClickListener() { // from class: o.vDx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C50143vDm.AEQbTJ(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fARcdN() {
        java.lang.String quoteSymbol;
        int iAhwBna;
        java.lang.String instType;
        java.lang.String marginDig;
        java.lang.String instFamily;
        final BizInstrument bizInstrumentAhwBna = OLrzqt().fvQaOB().AhwBna();
        C53539wnR c53539wnR = values().AYXKKw;
        java.lang.String str = "";
        if (bizInstrumentAhwBna == null || (quoteSymbol = bizInstrumentAhwBna.getQuoteSymbol()) == null) {
            quoteSymbol = "";
        }
        c53539wnR.setTransferCoin(quoteSymbol);
        final C47988uAv c47988uAv = values().EZpvd;
        c47988uAv.setInputUnit(bizInstrumentAhwBna != null ? bizInstrumentAhwBna.getQuoteSymbol() : null);
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
        c47988uAv.setOnTextChangeCallback(this.AEQbTJ);
        c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.vDr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50143vDm.AEQbTJ(this.EZpvd, c47988uAv, bizInstrumentAhwBna, ((java.lang.Float) obj).floatValue());
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit AEQbTJ(C50143vDm c50143vDm, C47988uAv c47988uAv, BizInstrument bizInstrument, float f) {
        java.lang.String str;
        java.lang.String instType;
        java.lang.String instFamily;
        C54536xML c54536xMLCopydefault;
        java.lang.String safeString$default;
        c50143vDm.copydefault("BotPlaceOrder_Btm_InvestmentAmount_Drag", "bot_type", "contract_dca");
        if (!c47988uAv.zLjUOn()) {
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
        } else {
            c47988uAv.setOnTextChangeCallback(null);
            InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
            if (interfaceC54581xNrOLrzqt == null) {
                str = "";
                C47988uAv.setInputContent$default(c47988uAv, str, false, false, 6, null);
                c50143vDm.copydefault();
                ContractDcaManualPresenter contractDcaManualPresenterOLrzqt = c50143vDm.OLrzqt();
                Intrinsics.copydefault(c47988uAv);
                contractDcaManualPresenterOLrzqt.EZpvd(c47988uAv, c47988uAv.fARcdN());
                c50143vDm.zLjUOn();
                c47988uAv.setOnTextChangeCallback(c50143vDm.AEQbTJ);
            } else {
                if (bizInstrument == null || (instType = bizInstrument.getInstType()) == null) {
                    instType = "";
                }
                AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
                if (abstractC54531xLwOLrzqt != null) {
                    if (bizInstrument == null || (instFamily = bizInstrument.getInstFamily()) == null) {
                        instFamily = "";
                    }
                    xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
                    if (xmvCreateSizeConverterWithIndex$default != null) {
                        float fFJNWhG = c47988uAv.fJNWhG();
                        MaxAvailableResp maxAvailableResp = c50143vDm.getNewProxyInstance().AEQbTJ().get();
                        C54536xML c54536xMLOLrzqt = xmvCreateSizeConverterWithIndex$default.OLrzqt(C33129mqd.mulS$default(java.lang.Float.valueOf(fFJNWhG), maxAvailableResp != null ? maxAvailableResp.getQuoteMax() : null, null, null, null, 14, null));
                        if (c54536xMLOLrzqt != null && (c54536xMLCopydefault = c54536xMLOLrzqt.copydefault()) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) != null) {
                            str = safeString$default;
                        }
                        C47988uAv.setInputContent$default(c47988uAv, str, false, false, 6, null);
                        c50143vDm.copydefault();
                        ContractDcaManualPresenter contractDcaManualPresenterOLrzqt2 = c50143vDm.OLrzqt();
                        Intrinsics.copydefault(c47988uAv);
                        contractDcaManualPresenterOLrzqt2.EZpvd(c47988uAv, c47988uAv.fARcdN());
                        c50143vDm.zLjUOn();
                        c47988uAv.setOnTextChangeCallback(c50143vDm.AEQbTJ);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    private final void zsXlph() {
        C50191vFg c50191vFg = values().djBIcL;
        c50191vFg.setOnLeverChangeCallback(new Function1() { // from class: o.vDy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50143vDm.AEQbTJ(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        c50191vFg.OLrzqt(fIwbmz().getLever());
        c50191vFg.setOnClickListener(new Application(c50191vFg, 1000L, this));
    }

    public static final Unit AEQbTJ(C50143vDm c50143vDm, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c50143vDm.fIwbmz().setLever(str);
        c50143vDm.isConnected();
        c50143vDm.copydefault();
        return Unit.INSTANCE;
    }

    public final void copydefault() {
        kotlin.Pair<java.lang.String, java.lang.String> pairAuCTel = AuCTel();
        java.lang.String strComponent1 = pairAuCTel.component1();
        java.lang.String strComponent2 = pairAuCTel.component2();
        ContractDcaManualPresenter contractDcaManualPresenterOLrzqt = OLrzqt();
        java.lang.String maxSafetyOrds = fIwbmz().getMaxSafetyOrds();
        java.lang.String str = maxSafetyOrds == null ? "" : maxSafetyOrds;
        java.lang.String pxSteps = fIwbmz().getPxSteps();
        contractDcaManualPresenterOLrzqt.KWHzl(strComponent1, strComponent2, str, pxSteps == null ? "" : pxSteps, (1008 & 16) != 0 ? contractDcaManualPresenterOLrzqt.AuCTelauCTel() : fIwbmz().getPxStepsMult(), (1008 & 32) != 0 ? contractDcaManualPresenterOLrzqt.zuBGHE() : fIwbmz().getVolMult(), (1008 & 64) != 0 ? contractDcaManualPresenterOLrzqt.OLrzqt().getValue() : fIwbmz().getDirection(), (1008 & 128) != 0 ? contractDcaManualPresenterOLrzqt.DbNXlk.getValue() : fIwbmz().getLever(), (1008 & 256) != 0 ? false : true, (1008 & 512) != 0 ? null : null);
    }

    public final kotlin.Pair<java.lang.String, java.lang.String> AuCTel() {
        java.lang.String strAkhnZx = values().EZpvd.AkhnZx();
        java.lang.String strMulS$default = C33129mqd.mulS$default(strAkhnZx, fIwbmz().getInitOrdPct(), null, null, null, 14, null);
        RoundingMode roundingMode = RoundingMode.DOWN;
        return C56390yDp.OLrzqt(C33129mqd.formatS$default(strMulS$default, 8, null, roundingMode, 2, null), C33129mqd.formatS$default(C56045xvR.KWHzl.copydefault(strAkhnZx, fIwbmz().getMaxSafetyOrds(), fIwbmz().getVolMult(), fIwbmz().getInitOrdPct()), 8, null, roundingMode, 2, null));
    }

    public static final Unit AEQbTJ(C50143vDm c50143vDm, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        C47988uAv c47988uAv2 = c50143vDm.values().EZpvd;
        ContractDcaManualPresenter contractDcaManualPresenterOLrzqt = c50143vDm.OLrzqt();
        Intrinsics.copydefault(c47988uAv2);
        contractDcaManualPresenterOLrzqt.EZpvd(c47988uAv2, c47988uAv2.fARcdN());
        c50143vDm.copydefault();
        if (c47988uAv2.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(c47988uAv2, false, 1, null);
        }
        c50143vDm.zLjUOn();
        return Unit.INSTANCE;
    }

    private final void AubY() {
        C55258xgZ c55258xgZ = values().fIwbmz;
        c55258xgZ.setOnClickListener(new ActionBar(c55258xgZ, 1000L, this));
        C55258xgZ c55258xgZ2 = values().AEQbTJ;
        c55258xgZ2.setOnClickListener(new TaskDescription(c55258xgZ2, 1000L, this));
        values().KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vDA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C50143vDm.KWHzl(this.copydefault, compoundButton, z);
            }
        });
        values().OLrzqt.setOnTextChangeCallback(new Function2() { // from class: o.vDE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50143vDm.KWHzl(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        });
        AppCompatImageView appCompatImageView = values().AhwBna;
        appCompatImageView.setOnClickListener(new StateListAnimator(appCompatImageView, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vDm$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    public static final void KWHzl(C50143vDm c50143vDm, android.widget.CompoundButton compoundButton, boolean z) {
        c50143vDm.fIwbmz().setAutoMarginReloadSwitch(z);
        C47988uAv c47988uAv = c50143vDm.values().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c47988uAv.setVisibility(z ? 0 : 8);
        if (z) {
            c50143vDm.values().OLrzqt.zsXlph();
            return;
        }
        C47988uAv.setInputContent$default(c50143vDm.values().OLrzqt, "", false, false, 6, null);
        android.content.Context context = c50143vDm.getContext();
        if (context != null) {
            C33054mpH.OLrzqt(context, c50143vDm.values().OLrzqt);
        }
        c50143vDm.values().OLrzqt.copydefault();
        AppCompatTextView appCompatTextView = c50143vDm.values().copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(8);
    }

    public static final Unit KWHzl(C50143vDm c50143vDm, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        c50143vDm.fIwbmz().setAutoMarginReloadMaxAmount(str);
        c50143vDm.getFieldNames();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean getFieldNames() {
        if (!values().KWHzl.isChecked()) {
            return true;
        }
        java.lang.String strAkhnZx = values().OLrzqt.AkhnZx();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx) || C33129mqd.valueOf(strAkhnZx, "0")) {
            values().OLrzqt.setInputErrorMsg(C33070mpX.AYXKKw(C55688xof.Application.gkZNMa));
            AppCompatTextView appCompatTextView = values().copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            appCompatTextView.setVisibility(8);
            return false;
        }
        MaxAvailableResp maxAvailableResp = getNewProxyInstance().AEQbTJ().get();
        if (C33129mqd.AEQbTJ(strAkhnZx, maxAvailableResp != null ? maxAvailableResp.getQuoteMax() : null)) {
            AppCompatTextView appCompatTextView2 = values().copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
            appCompatTextView2.setVisibility(0);
            values().OLrzqt.copydefault();
            return true;
        }
        values().OLrzqt.copydefault();
        AppCompatTextView appCompatTextView3 = values().copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
        appCompatTextView3.setVisibility(8);
        return true;
    }

    public final DcaOrderReq KWHzl(java.lang.String str) {
        kotlin.Pair<java.lang.String, java.lang.String> pairAuCTel = AuCTel();
        java.lang.String strComponent1 = pairAuCTel.component1();
        java.lang.String strComponent2 = pairAuCTel.component2();
        java.lang.String strGEmmrt = OLrzqt().fvQaOB().gEmmrt();
        java.lang.String maxSafetyOrds = fIwbmz().getMaxSafetyOrds();
        java.lang.String pxSteps = fIwbmz().getPxSteps();
        java.lang.String pxStepsMult = fIwbmz().getPxStepsMult();
        java.lang.String volMult = fIwbmz().getVolMult();
        java.lang.String tpPct = fIwbmz().getTpPct();
        java.lang.String slPct = fIwbmz().getSlPct();
        java.lang.String direction = fIwbmz().getDirection();
        java.lang.String mode = SpotDcaInvestTypeData.AI.getMode();
        java.lang.String lever = fIwbmz().getLever();
        java.lang.String slMode = fIwbmz().getSlMode();
        java.util.List<DcaTriggerParam> triggerParams = fIwbmz().getTriggerParams();
        java.lang.String userRiskMode = fIwbmz().getUserRiskMode();
        boolean autoMarginReloadSwitch = fIwbmz().getAutoMarginReloadSwitch();
        java.lang.String autoMarginReloadMaxAmount = fIwbmz().getAutoMarginReloadMaxAmount();
        boolean zIsChecked = values().values.isChecked();
        return new DcaOrderReq(strGEmmrt, strComponent1, java.lang.Boolean.TRUE, strComponent2, maxSafetyOrds, pxSteps, pxStepsMult, volMult, tpPct, slPct, direction, mode, str, userRiskMode, (java.lang.String) null, lever, slMode, (java.util.List) triggerParams, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, java.lang.String.valueOf(zIsChecked), false, autoMarginReloadSwitch, autoMarginReloadMaxAmount, (java.lang.String) null, "SWAP", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, C54149wys.AEQbTJ.EZpvd(OLrzqt().valueOf().getValue()), -188989440, 7, (DefaultConstructorMarker) null);
    }

    private final void AuCTelauCTel() {
        OLrzqt().valueOf().observe(this, new LoaderManager(new Function1() { // from class: o.vDC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50143vDm.KWHzl(this.AEQbTJ, (StrategyConfigInfo) obj);
            }
        }));
        OLrzqt().hDKMBd().observe(this, new LoaderManager(new Function1() { // from class: o.vDH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50143vDm.copydefault(this.AEQbTJ, (Unit) obj);
            }
        }));
        OLrzqt().getFieldNames().observe(this, new LoaderManager(new Function1() { // from class: o.vDF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50143vDm.KWHzl(this.KWHzl, (Triple) obj);
            }
        }));
        OLrzqt().gEmmrt().observe(this, new LoaderManager(new Function1() { // from class: o.vDI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50143vDm.EZpvd(this.copydefault, (StrategyResponse) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().AhwBna().AhwBna();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner, new Observer() { // from class: o.vDs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C50143vDm.EZpvd(this.OLrzqt, (java.lang.Exception) obj);
            }
        });
        getNewProxyInstance().AhwBna().observe(this, new LoaderManager(new Function1() { // from class: o.vDt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50143vDm.EZpvd(this.OLrzqt, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit KWHzl(C50143vDm c50143vDm, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        c50143vDm.gHZMYf();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C50143vDm c50143vDm, Unit unit) {
        c50143vDm.isConnected();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C50143vDm c50143vDm, Triple triple) {
        java.lang.String safeString$default;
        C54536xML c54536xMLDjBIcL;
        C54536xML c54536xMLFetchVPNInfo;
        Intrinsics.checkNotNullParameter(triple, "");
        java.lang.String str = (java.lang.String) triple.component1();
        boolean zBooleanValue = ((java.lang.Boolean) triple.component2()).booleanValue();
        vKO vko = c50143vDm.values().AkhnZx;
        if (C33129mqd.AEQbTJ(str, 0)) {
            xMS xmsCopydefault = c50143vDm.OLrzqt().fvQaOB().copydefault();
            safeString$default = null;
            if (xmsCopydefault != null) {
                if (str == null) {
                    str = "";
                }
                C54536xML c54536xMLAYXKKw = xmsCopydefault.AYXKKw(str);
                if (c54536xMLAYXKKw != null && (c54536xMLDjBIcL = c54536xMLAYXKKw.djBIcL()) != null && (c54536xMLFetchVPNInfo = c54536xMLDjBIcL.fetchVPNInfo()) != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLFetchVPNInfo, false, 1, null);
                }
            }
        } else {
            safeString$default = "--";
        }
        vko.setValue(safeString$default);
        android.widget.TextView textView = c50143vDm.values().valueOf;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(zBooleanValue ? 0 : 8);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C50143vDm c50143vDm, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        c50143vDm.iwGUEr();
        FragmentActivity activity = c50143vDm.getActivity();
        if (activity != null) {
            ActivityC51150vhb.Companion.AEQbTJ(activity, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : "contract_dca", (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : strategyResponse.getAlgoId(), (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? null : null);
        }
        return Unit.INSTANCE;
    }

    public static final void EZpvd(C50143vDm c50143vDm, java.lang.Exception exc) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strGEmmrt = c50143vDm.OLrzqt().fvQaOB().gEmmrt();
        java.lang.String message2 = exc.getMessage();
        java.lang.String str = message2 == null ? "" : message2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        c55867xrz.KWHzl("bot_create_page", java.lang.String.valueOf(jCurrentTimeMillis), "contract_dca_ai", strGEmmrt, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str, null, (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 5, null));
    }

    public static final Unit EZpvd(C50143vDm c50143vDm, java.lang.String str) {
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        Intrinsics.checkNotNullParameter(str, "");
        xMV xmvKWHzl = c50143vDm.OLrzqt().fvQaOB().KWHzl();
        java.lang.String safeString$default = null;
        if (xmvKWHzl != null && (c54536xMLCopydefault = xmvKWHzl.copydefault(str)) != null && (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault2.fetchVPNInfo()) != null && (c54536xMLDjBIcL = c54536xMLFetchVPNInfo.djBIcL()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
        }
        c50143vDm.values().AYXKKw.setFooterAvaValue(safeString$default);
        c50143vDm.zLjUOn();
        return Unit.INSTANCE;
    }

    private final void gHZMYf() {
        StrategyConfigInfo value = OLrzqt().valueOf().getValue();
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = values().fARcdN;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.EZpvd(c54154wyx, value);
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void isConnected() {
        java.lang.String strEZpvd = OLrzqt().EZpvd(OLrzqt().AEQbTJ(fIwbmz()), RoundingMode.UP);
        ContractDcaManualPresenter contractDcaManualPresenterOLrzqt = OLrzqt();
        C47988uAv c47988uAv = values().EZpvd;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        contractDcaManualPresenterOLrzqt.OLrzqt(c47988uAv, new BotRangeConfig(strEZpvd, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 62, (DefaultConstructorMarker) null), (12 & 4) != 0 ? null : null, (Function1<? super java.lang.String, java.lang.String>) ((12 & 8) != 0 ? null : null), (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.vDu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50143vDm.AEQbTJ((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String AEQbTJ(java.lang.String str) {
        if (str != null) {
            return xMR.copydefault.copydefault(str);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zLjUOn() {
        int i;
        android.widget.TextView textView = values().gEmmrt;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        MaxAvailableResp maxAvailableResp = getNewProxyInstance().AEQbTJ().get();
        if ((maxAvailableResp != null ? maxAvailableResp.getQuoteMax() : null) != null) {
            java.lang.String strAkhnZx = values().EZpvd.AkhnZx();
            MaxAvailableResp maxAvailableResp2 = getNewProxyInstance().AEQbTJ().get();
            i = C33129mqd.AEQbTJ(strAkhnZx, maxAvailableResp2 != null ? maxAvailableResp2.getQuoteMax() : null) ? 0 : 8;
        }
        textView.setVisibility(i);
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (hDKMBd()) {
            wYF wyf = this.copydefault;
            if (wyf != null) {
                wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.init));
            }
        } else {
            wYF wyf2 = this.copydefault;
            if (wyf2 != null) {
                wyf2.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0));
            }
        }
        getNewProxyInstance().EZpvd("contract_dca", (64 & 2) != 0 ? "cash" : "cross", (64 & 4) != 0 ? "" : "net_mode", (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? null : null);
    }

    private final void copydefault(java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.vDB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50143vDm.KWHzl(str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(str, str2, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iwGUEr() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getNewProxyInstance().AYXKKw();
    }

    public final void ejfBZ() {
        C32866mlf.onEvent$default("AIBotPlaceOrder_Sheet_PlaceOrder_Click", (TrackChannel[]) null, new Function1() { // from class: o.vDD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50143vDm.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "contract_dca", false, 4, null);
        return Unit.INSTANCE;
    }
}
