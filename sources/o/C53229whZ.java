package o;

import android.view.View;
import androidx.databinding.Observable;
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
import com.okinc.biz.TradeType;
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.tradingbot.impl.order.strategy.recommend.presenter.BotRecommendPresenter;
import com.okinc.tradingbot.impl.order.strategy.spotdca.viewmodel.SpotDcaManualPresenter;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotRangeConfig;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.MaxAvailableResp;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import com.okinc.unify_trade.bot.data.BotParamItemData;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC8104awT;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.whZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C53229whZ extends AbstractC49945uyC<AbstractC48526uUr, SpotDcaManualPresenter> {
    public static final Application Companion = new Application(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final Fragment AhwBna;
    public final Function2<C47988uAv, java.lang.String, Unit> OLrzqt;
    public final int copydefault = C48033uCm.Activity.getStatusCode;
    public final InterfaceC56387yDm gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.wia
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53229whZ.djBIcL(this.AEQbTJ);
        }
    });
    public final InterfaceC56387yDm valueOf = C56392yDr.copydefault(new Function0() { // from class: o.wid
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C53229whZ.AhwBna(this.EZpvd);
        }
    });
    public final C43316rmw djBIcL = new C43316rmw();

    /* JADX INFO: renamed from: o.whZ$ActionBar */
    public static final /* synthetic */ class ActionBar implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(Function1 function1) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.copydefault;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public static final /* synthetic */ AbstractC48526uUr EZpvd(C53229whZ c53229whZ) {
        return c53229whZ.values();
    }

    public C53229whZ() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.SpotDcaAiOrderDialog$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.SpotDcaAiOrderDialog$special$$inlined$viewModels$default$2
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.SpotDcaAiOrderDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.SpotDcaAiOrderDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.spotdca.ui.dialog.SpotDcaAiOrderDialog$special$$inlined$viewModels$default$5
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
        this.OLrzqt = new Function2() { // from class: o.wii
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53229whZ.copydefault(this.copydefault, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        this.AhwBna = new Fragment();
    }

    private final DcaOrderReq fJNWhG() {
        return (DcaOrderReq) this.gEmmrt.getValue();
    }

    public static final DcaOrderReq djBIcL(C53229whZ c53229whZ) {
        android.os.Parcelable parcelableOLrzqt = BotRecommendPresenter.Companion.OLrzqt(c53229whZ.ejfBZ());
        Intrinsics.copydefault(parcelableOLrzqt, "");
        return (DcaOrderReq) parcelableOLrzqt;
    }

    private final SmartRecommendResp ejfBZ() {
        return (SmartRecommendResp) this.valueOf.getValue();
    }

    public static final SmartRecommendResp AhwBna(C53229whZ c53229whZ) {
        SmartRecommendResp smartRecommendResp;
        android.os.Bundle arguments = c53229whZ.getArguments();
        return (arguments == null || (smartRecommendResp = (SmartRecommendResp) arguments.getParcelable("data")) == null) ? new SmartRecommendResp(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1, null) : smartRecommendResp;
    }

    private final C55915xsu AuCTel() {
        return (C55915xsu) this.AEQbTJ.getValue();
    }

    /* JADX INFO: renamed from: o.whZ$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.whZ.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final void EZpvd(@NotNull SmartRecommendResp smartRecommendResp, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(smartRecommendResp, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C53229whZ c53229whZ = new C53229whZ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("data", smartRecommendResp);
            c53229whZ.setArguments(bundle);
            c53229whZ.show(fragmentManager, C53229whZ.class.getSimpleName());
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        hDKMBd();
        getFieldNames();
        iwGUEr();
        uzCIH();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2));
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new StateListAnimator(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C55688xof.Application.r8lambdaOnwlVMZzrLePIRy6IUDTtLLUV0));
        wyf.setOKDSSize(44);
        wyf.setOnClickListener(new Activity(wyf, 1000L, this));
    }

    private final void hDKMBd() {
        SpotDcaManualPresenter spotDcaManualPresenterOLrzqt = OLrzqt();
        java.lang.String instType = ejfBZ().getInstType();
        if (instType == null) {
            instType = "";
        }
        java.lang.String instId = ejfBZ().getInstId();
        spotDcaManualPresenterOLrzqt.OLrzqt(instType, instId != null ? instId : "");
        OLrzqt().copydefault();
    }

    private final void wlaJM() {
        OLrzqt().fvQaOB().gEmmrt(fIwbmz());
        BizInstrument bizInstrumentFARcdN = fARcdN();
        if (bizInstrumentFARcdN != null) {
            java.lang.String strFIwbmz = fIwbmz();
            values().OLrzqt.setFm(getChildFragmentManager());
            values().OLrzqt.copydefault(this, bizInstrumentFARcdN, TradeType.BUY_OPEN, false);
            uBL ubl = values().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(ubl, "");
            ubl.setVisibility(bizInstrumentFARcdN.isDisplayTradeReceive() ? 0 : 8);
            if (Intrinsics.EZpvd((java.lang.Object) strFIwbmz, (java.lang.Object) fIwbmz())) {
                return;
            }
            AYXKKw(fIwbmz());
        }
    }

    /* JADX INFO: renamed from: o.whZ$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C53229whZ EZpvd;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C53229whZ c53229whZ) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.EZpvd = c53229whZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            InterfaceC8104awT interfaceC8104awT;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.EZpvd.zLjUOn();
                if (!C55697xoo.OLrzqt.isConnected()) {
                    android.content.Context context = this.EZpvd.getContext();
                    if (context == null || (interfaceC8104awT = (InterfaceC8104awT) C43251rlk.OLrzqt(InterfaceC8104awT.class)) == null) {
                        return;
                    }
                    InterfaceC8104awT.StateListAnimator.routeLogin$default(interfaceC8104awT, context, null, 2, null);
                    return;
                }
                C52658wTo c52658wTo = C52658wTo.AEQbTJ;
                C47988uAv c47988uAv = C53229whZ.EZpvd(this.EZpvd).AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
                c52658wTo.OLrzqt(c47988uAv, C53229whZ.EZpvd(this.EZpvd).AEQbTJ.fARcdN());
                android.widget.TextView textView = C53229whZ.EZpvd(this.EZpvd).KWHzl;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                if (textView.getVisibility() == 0) {
                    C56002xub.KWHzl.OLrzqt();
                    return;
                }
                if (C53229whZ.EZpvd(this.EZpvd).AEQbTJ.hDKMBd()) {
                    pUU.KWHzl("Order", "SpotDcaAiOrderDialog Order");
                    SpotDcaManualPresenter spotDcaManualPresenterOLrzqt = this.EZpvd.OLrzqt();
                    C53229whZ c53229whZ = this.EZpvd;
                    DcaOrderReq dcaOrderReqAEQbTJ = c53229whZ.AEQbTJ(C53229whZ.EZpvd(c53229whZ).AEQbTJ.AkhnZx());
                    androidx.fragment.app.FragmentManager childFragmentManager = this.EZpvd.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                    spotDcaManualPresenterOLrzqt.AEQbTJ(dcaOrderReqAEQbTJ, childFragmentManager);
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.whZ$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C53229whZ OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C53229whZ c53229whZ) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c53229whZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.isConnected();
            }
        }
    }

    /* JADX INFO: renamed from: o.whZ$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C53229whZ KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C53229whZ c53229whZ) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.KWHzl = c53229whZ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                RecyclerView recyclerView = C53229whZ.EZpvd(this.KWHzl).gEmmrt;
                Intrinsics.checkNotNullExpressionValue(recyclerView, "");
                boolean z = !(recyclerView.getVisibility() == 0);
                android.widget.ImageView imageView = C53229whZ.EZpvd(this.KWHzl).EZpvd;
                android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(z ? C52761wXj.TaskDescription.DNMMPQ : C52761wXj.TaskDescription.DCUTEIddSDPG);
                if (drawableKWHzl != null) {
                    drawableKWHzl.setTint(C33070mpX.copydefault(C52761wXj.Activity.Dmq));
                } else {
                    drawableKWHzl = null;
                }
                imageView.setImageDrawable(drawableKWHzl);
                RecyclerView recyclerView2 = C53229whZ.EZpvd(this.KWHzl).gEmmrt;
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "");
                recyclerView2.setVisibility(z ? 0 : 8);
                android.view.View view2 = C53229whZ.EZpvd(this.KWHzl).valueOf;
                Intrinsics.checkNotNullExpressionValue(view2, "");
                view2.setVisibility(z ? 0 : 8);
                android.widget.TextView textView = C53229whZ.EZpvd(this.KWHzl).AYXKKw;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(z ? 0 : 8);
            }
        }
    }

    private final void zsXlph() {
        AuCTel().AYXKKw();
        AuCTel().EZpvd("spot_dca", (64 & 2) != 0 ? "cash" : null, (64 & 4) != 0 ? "" : null, (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? null : OLrzqt().fvQaOB(), (64 & 128) == 0 ? null : null);
    }

    private final void getFieldNames() {
        getNewProxyInstance();
        values().gEmmrt.setLayoutManager(new LinearLayoutManager(getContext()));
        values().gEmmrt.setAdapter(this.djBIcL);
        values().gEmmrt.addItemDecoration(new C31703mAu(C55298xhM.dp2px$default(10.0f, null, 1, null), 0));
        this.djBIcL.register(BotParamItemData.class, new C51263vji());
        this.djBIcL.register(C55848xrg.class, new C51233vjE());
        C33064mpR.OLrzqt(this.djBIcL, (java.util.List<? extends java.lang.Object>) C55995xuU.getParams$default(C55995xuU.copydefault, ejfBZ(), fJNWhG(), null, 4, null));
    }

    private final void getNewProxyInstance() {
        C53539wnR c53539wnR = values().copydefault;
        java.lang.String strDbNXlk = OLrzqt().fvQaOB().DbNXlk();
        if (strDbNXlk == null) {
            strDbNXlk = "";
        }
        c53539wnR.setTransferCoin(strDbNXlk);
        values().copydefault.setFooterAvaValue("--");
        final C47988uAv c47988uAv = values().AEQbTJ;
        c47988uAv.setInputUnit(fIwbmz());
        c47988uAv.setMaxDecimal(OLrzqt().fvQaOB().values());
        c47988uAv.setOnTextChangeCallback(this.OLrzqt);
        c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.wif
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53229whZ.AEQbTJ(this.KWHzl, c47988uAv, ((java.lang.Float) obj).floatValue());
            }
        });
    }

    public static final Unit AEQbTJ(C53229whZ c53229whZ, C47988uAv c47988uAv, float f) {
        c53229whZ.copydefault("BotPlaceOrder_Btm_InvestmentAmount_Drag", "bot_type", "spot_dca");
        if (!c47988uAv.zLjUOn()) {
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
        } else {
            java.lang.String safeString$default = null;
            c47988uAv.setOnTextChangeCallback(null);
            C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(c53229whZ.OLrzqt().fvQaOB(), null, true, 1, null);
            if (c54571xNhCreateAmtConvert$default != null) {
                float fFJNWhG = c47988uAv.fJNWhG();
                MaxAvailableResp maxAvailableResp = c53229whZ.AuCTel().AEQbTJ().get();
                C54536xML c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default.AYXKKw(C33129mqd.mulS$default(java.lang.Float.valueOf(fFJNWhG), maxAvailableResp != null ? maxAvailableResp.getQuoteMax() : null, null, null, null, 14, null));
                if (c54536xMLAYXKKw != null) {
                    safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null);
                }
            }
            C47988uAv.setInputContent$default(c47988uAv, safeString$default, false, false, 6, null);
            C52658wTo c52658wTo = C52658wTo.AEQbTJ;
            Intrinsics.copydefault(c47988uAv);
            c52658wTo.OLrzqt(c47988uAv, c47988uAv.fARcdN());
            c53229whZ.AubY();
            c47988uAv.setOnTextChangeCallback(c53229whZ.OLrzqt);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C53229whZ c53229whZ, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        C47988uAv c47988uAv2 = c53229whZ.values().AEQbTJ;
        C52658wTo c52658wTo = C52658wTo.AEQbTJ;
        Intrinsics.copydefault(c47988uAv2);
        c52658wTo.OLrzqt(c47988uAv2, c47988uAv2.fARcdN());
        if (c47988uAv2.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(c47988uAv2, false, 1, null);
        }
        c53229whZ.AubY();
        return Unit.INSTANCE;
    }

    private final void iwGUEr() {
        android.widget.ImageView imageView = values().EZpvd;
        imageView.setOnClickListener(new TaskDescription(imageView, 1000L, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DcaOrderReq AEQbTJ(java.lang.String str) {
        java.lang.String strGEmmrt = OLrzqt().fvQaOB().gEmmrt();
        java.lang.String strMulS$default = C33129mqd.mulS$default(str, fJNWhG().getInitOrdPct(), null, null, null, 14, null);
        int iMax = java.lang.Math.max(OLrzqt().fvQaOB().values(), 8);
        RoundingMode roundingMode = RoundingMode.DOWN;
        return new DcaOrderReq(strGEmmrt, C33129mqd.formatS$default(strMulS$default, java.lang.Integer.valueOf(iMax), null, roundingMode, 2, null), java.lang.Boolean.TRUE, C33129mqd.formatS$default(C56045xvR.KWHzl.copydefault(str, fJNWhG().getMaxSafetyOrds(), fJNWhG().getVolMult(), fJNWhG().getInitOrdPct()), java.lang.Integer.valueOf(java.lang.Math.max(OLrzqt().fvQaOB().values(), 8)), null, roundingMode, 2, null), fJNWhG().getMaxSafetyOrds(), fJNWhG().getPxSteps(), fJNWhG().getPxStepsMult(), fJNWhG().getVolMult(), fJNWhG().getTpPct(), fJNWhG().getSlPct(), "long", fJNWhG().getInvestType(), str, fJNWhG().getUserRiskMode(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.List) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, false, (java.lang.String) null, (java.lang.String) null, "SPOT", (java.lang.String) null, "spot_dca", (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, OLrzqt().fvQaOB().AEQbTJ("spot_dca"), C54149wys.AEQbTJ.EZpvd(OLrzqt().KWHzl().getValue()), -671105024, 3, (DefaultConstructorMarker) null);
    }

    private final void uzCIH() {
        OLrzqt().fIwbmz().observe(getViewLifecycleOwner(), new ActionBar(new Function1() { // from class: o.wie
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53229whZ.copydefault(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        C56111xwe<StrategyResponse> c56111xweOLrzqt = OLrzqt().OLrzqt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweOLrzqt.observe(viewLifecycleOwner, new ActionBar(new Function1() { // from class: o.wim
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53229whZ.EZpvd(this.KWHzl, (StrategyResponse) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().EZpvd().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new Observer() { // from class: o.wik
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C53229whZ.copydefault(this.KWHzl, (java.lang.Exception) obj);
            }
        });
        C56111xwe<java.lang.String> c56111xweAhwBna = AuCTel().AhwBna();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweAhwBna.observe(viewLifecycleOwner3, new ActionBar(new Function1() { // from class: o.wic
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53229whZ.AhwBna(this.OLrzqt, (java.lang.String) obj);
            }
        }));
    }

    public static final Unit copydefault(C53229whZ c53229whZ, java.lang.String str) {
        java.lang.String strAEQbTJ = c53229whZ.OLrzqt().AEQbTJ(c53229whZ.copydefault(str), RoundingMode.UP);
        C52658wTo c52658wTo = C52658wTo.AEQbTJ;
        C47988uAv c47988uAv = c53229whZ.values().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c52658wTo.copydefault(c47988uAv, new BotRangeConfig(strAEQbTJ, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, 62, (DefaultConstructorMarker) null), (8 & 4) != 0 ? null : null, (8 & 8) != 0 ? null : null, new Function1() { // from class: o.wig
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53229whZ.OLrzqt((java.lang.String) obj);
            }
        });
        c53229whZ.AuCTelauCTel();
        return Unit.INSTANCE;
    }

    public static final java.lang.String OLrzqt(java.lang.String str) {
        if (str != null) {
            return xMR.copydefault.copydefault(str);
        }
        return null;
    }

    public static final Unit EZpvd(C53229whZ c53229whZ, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        c53229whZ.isConnected();
        FragmentActivity activity = c53229whZ.getActivity();
        if (activity != null) {
            ActivityC51150vhb.Companion.AEQbTJ(activity, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : "spot_dca", (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : strategyResponse.getAlgoId(), (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? null : null);
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(C53229whZ c53229whZ, java.lang.Exception exc) {
        xOW newProxyInstance;
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        C55867xrz c55867xrz = C55867xrz.KWHzl;
        long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String strGEmmrt = c53229whZ.OLrzqt().fvQaOB().gEmmrt();
        java.lang.String message2 = exc.getMessage();
        java.lang.String str = message2 == null ? "" : message2;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        c55867xrz.KWHzl("bot_create_page", java.lang.String.valueOf(jCurrentTimeMillis), "spot_dca_ai", strGEmmrt, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str, null, (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 5, null));
    }

    public static final Unit AhwBna(C53229whZ c53229whZ, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c53229whZ.values().copydefault.setFooterAvaValue(str);
        c53229whZ.AubY();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        AuCTel().EZpvd("spot_dca", (64 & 2) != 0 ? "cash" : null, (64 & 4) != 0 ? "" : null, (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : null, (64 & 64) != 0 ? null : OLrzqt().fvQaOB(), (64 & 128) == 0 ? null : null);
        wlaJM();
        EZpvd(this.AhwBna);
    }

    /* JADX INFO: renamed from: o.whZ$Fragment */
    public static final class Fragment extends Observable.OnPropertyChangedCallback {
        public Fragment() {
        }

        @Override // androidx.databinding.Observable.OnPropertyChangedCallback
        public void onPropertyChanged(androidx.databinding.Observable observable, int i) {
            C53229whZ c53229whZ = C53229whZ.this;
            c53229whZ.AYXKKw(c53229whZ.fIwbmz());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AYXKKw(java.lang.String str) {
        OLrzqt().fvQaOB().gEmmrt(str);
        values().AEQbTJ.setInputUnit(str);
        zsXlph();
        values().copydefault.setTransferCoin(OLrzqt().fvQaOB().copydefault("spot_dca"));
        copydefault();
    }

    private final void copydefault() {
        if (values().AEQbTJ.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(values().AEQbTJ, false, 1, null);
            values().AEQbTJ.setInputCover(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String fIwbmz() {
        java.lang.String strOLrzqt = values().OLrzqt.OLrzqt();
        return strOLrzqt == null ? OLrzqt().fvQaOB().AYXKKw() : strOLrzqt;
    }

    private final void EZpvd(Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        uBP ubpCopydefault = values().OLrzqt.copydefault();
        if (ubpCopydefault != null) {
            ubpCopydefault.EZpvd(onPropertyChangedCallback);
        }
    }

    private final void AEQbTJ(Observable.OnPropertyChangedCallback onPropertyChangedCallback) {
        uBP ubpCopydefault = values().OLrzqt.copydefault();
        if (ubpCopydefault != null) {
            ubpCopydefault.copydefault(onPropertyChangedCallback);
        }
    }

    private final BizInstrument fARcdN() {
        return OLrzqt().fvQaOB().AhwBna();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void AubY() {
        int i;
        android.widget.TextView textView = values().KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        MaxAvailableResp maxAvailableResp = AuCTel().AEQbTJ().get();
        if ((maxAvailableResp != null ? maxAvailableResp.getQuoteMax() : null) != null) {
            java.lang.String strAkhnZx = values().AEQbTJ.AkhnZx();
            MaxAvailableResp maxAvailableResp2 = AuCTel().AEQbTJ().get();
            i = C33129mqd.AEQbTJ(strAkhnZx, maxAvailableResp2 != null ? maxAvailableResp2.getQuoteMax() : null) ? 0 : 8;
        }
        textView.setVisibility(i);
    }

    public final java.lang.String copydefault(java.lang.String str) {
        java.lang.String str2;
        SpotDcaManualPresenter spotDcaManualPresenterOLrzqt = OLrzqt();
        java.lang.String maxSafetyOrds = fJNWhG().getMaxSafetyOrds();
        if (maxSafetyOrds == null) {
            maxSafetyOrds = "";
        }
        java.lang.String strCopydefault = spotDcaManualPresenterOLrzqt.copydefault(maxSafetyOrds, fJNWhG().getVolMult());
        C56045xvR c56045xvR = C56045xvR.KWHzl;
        java.lang.String strAEQbTJ = c56045xvR.AEQbTJ(fJNWhG().getInitOrdPct(), fJNWhG().getMaxSafetyOrds(), fJNWhG().getVolMult());
        java.lang.String strDivS$default = C33129mqd.divS$default(strCopydefault, strAEQbTJ, null, null, null, 14, null);
        if (C33129mqd.gEmmrt(strDivS$default, str)) {
            strCopydefault = C33129mqd.mulS$default(str, strAEQbTJ, null, null, null, 14, null);
            str2 = str;
        } else {
            str2 = strDivS$default;
        }
        return C33129mqd.addS$default(str2, c56045xvR.copydefault(strCopydefault, fJNWhG().getMaxSafetyOrds(), fJNWhG().getVolMult()), null, null, null, 14, null);
    }

    private final void copydefault(java.lang.String str, final java.lang.String str2, final java.lang.String str3) {
        C32866mlf.onEvent$default(str, (TrackChannel[]) null, new Function1() { // from class: o.wib
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53229whZ.KWHzl(str2, str3, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put(str, str2, true);
        return Unit.INSTANCE;
    }

    private final void AuCTelauCTel() {
        StrategyConfigInfo value = OLrzqt().KWHzl().getValue();
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = values().AhwBna;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.EZpvd(c54154wyx, value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void isConnected() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        AuCTel().AYXKKw();
        AEQbTJ(this.AhwBna);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zLjUOn() {
        C32866mlf.onEvent$default("AIBotPlaceOrder_Sheet_PlaceOrder_Click", (TrackChannel[]) null, new Function1() { // from class: o.wih
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53229whZ.KWHzl((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit KWHzl(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "spot_dca", false, 4, null);
        return Unit.INSTANCE;
    }
}
