package o;

import android.view.View;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.api.client.googleapis.media.MediaHttpDownloader;
import com.okinc.biz.TacticsType;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.tradeapi.bean.BotGridOrderDialogData;
import com.okinc.tradingbot.impl.order.strategy.dialog.PriceOutOfRangeBottomSheet;
import com.okinc.tradingbot.impl.order.strategy.recommend.presenter.BotRecommendPresenter;
import com.okinc.tradingbot.impl.utils.PriceRangeUtil;
import com.okinc.unify_trade.biz.AIData;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.GridNumRangeBean;
import com.okinc.unify_trade.biz.GridProfitRateResp;
import com.okinc.unify_trade.biz.PendingOrderLine;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.bot.contract_grid.viewModel.ContractManuallyPresenter;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vIF extends AbstractC49945uyC<uMX, ContractManuallyPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int KWHzl = 8;
    public final boolean AEQbTJ;
    public boolean AYXKKw;
    public final int AhwBna = C48033uCm.Activity.AwvSrB;
    public boolean DbNXlk;
    public java.lang.String OLrzqt;
    public BotGridOrderDialogData copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final Function2<C47988uAv, java.lang.Boolean, Unit> gEmmrt;
    public final Function2<C47988uAv, java.lang.String, Unit> valueOf;

    public static final /* synthetic */ class LoaderManager implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(Function1 function1) {
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

    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[PriceRangeUtil.ValidatedPriceRange.values().length];
            try {
                iArr[PriceRangeUtil.ValidatedPriceRange.ExtremeLowerOutOfRange.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[PriceRangeUtil.ValidatedPriceRange.LowerOutOfRange.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[PriceRangeUtil.ValidatedPriceRange.ExtremeUpperOutOfRange.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[PriceRangeUtil.ValidatedPriceRange.UpperOutOfRange.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            OLrzqt = iArr;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public boolean getHasFooter() {
        return this.AEQbTJ;
    }

    public static final /* synthetic */ uMX EZpvd(vIF vif) {
        return vif.values();
    }

    public vIF() {
        final Function0 function0 = new Function0() { // from class: o.vIT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vIF.valueOf(this.KWHzl);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.ContractGridRangeQuickOrderDialog$special$$inlined$viewModels$default$1
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(vPY.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.ContractGridRangeQuickOrderDialog$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.ContractGridRangeQuickOrderDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.ContractGridRangeQuickOrderDialog$special$$inlined$viewModels$default$4
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
        this.AEQbTJ = true;
        this.OLrzqt = "";
        this.gEmmrt = new Function2() { // from class: o.vIQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vIF.KWHzl(this.AEQbTJ, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        };
        this.valueOf = new Function2() { // from class: o.vIR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vIF.EZpvd(this.KWHzl, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
    }

    private final vPY fARcdN() {
        return (vPY) this.djBIcL.getValue();
    }

    public static final ViewModelStoreOwner valueOf(vIF vif) {
        androidx.fragment.app.Fragment parentFragment = vif.getParentFragment();
        return parentFragment != null ? parentFragment : vif;
    }

    public static final Unit KWHzl(vIF vif, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, vif.values().gEmmrt)) {
            vif.copydefault(z);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(vIF vif, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, vif.values().fetchVPNInfo) || Intrinsics.EZpvd(c47988uAv, vif.values().AYXKKw)) {
            vif.OLrzqt().QVAiDq();
        } else if (Intrinsics.EZpvd(c47988uAv, vif.values().gEmmrt)) {
            vif.OLrzqt().uzCIH().setGridNum(vif.values().gEmmrt.AkhnZx());
            vif.OLrzqt().QUSxYX();
            vif.fJNWhG();
            vif.OLrzqt().QVAiDq();
            if (!vif.AYXKKw) {
                vif.isConnected();
            }
        }
        return Unit.INSTANCE;
    }

    private final void copydefault(boolean z) {
        if (z) {
            return;
        }
        java.lang.String strAuCTelauCTel = AuCTelauCTel();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAuCTelauCTel)) {
            values().gEmmrt.setInputErrorMsg(strAuCTelauCTel);
        }
    }

    private final void fJNWhG() {
        values().gEmmrt.copydefault();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vIF.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final vIF OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(str2, "");
            vIF vif = new vIF();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("bot_inst_id", str);
            bundle.putString("bot_inst_type", str2);
            vif.setArguments(bundle);
            return vif;
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        StgyParam stgyParam;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        OLrzqt().EZpvd(getArguments());
        OLrzqt().uzCIH().setInstId(OLrzqt().fvQaOB().gEmmrt());
        OLrzqt().uzCIH().setInstType(OLrzqt().fvQaOB().djBIcL());
        C54782xVc.AEQbTJ.AhwBna(OLrzqt().fvQaOB().AhwBna());
        OLrzqt().fIwbmz();
        hDKMBd();
        iwGUEr();
        uzCIH();
        getFieldNames();
        zLjUOn();
        getNewProxyInstance();
        sSMYrx();
        wlaJM();
        if (fARcdN().copydefault().getValue() == null) {
            ContractManuallyPresenter.queryRecommendList$default(OLrzqt(), false, 1, null);
        } else {
            this.DbNXlk = true;
            SmartRecommendResp value = fARcdN().copydefault().getValue();
            if (value != null && (stgyParam = value.getStgyParam()) != null) {
                java.lang.String direction = stgyParam.getDirection();
                if (direction != null) {
                    SmartRecommendResp value2 = fARcdN().copydefault().getValue();
                    Intrinsics.copydefault(value2);
                    KWHzl(direction, value2);
                    KWHzl(direction);
                    values().AEQbTJ.setDirectionType(direction);
                }
                MutableLiveData<java.util.List<SmartRecommendResp>> mutableLiveDataDjBIcL = OLrzqt().djBIcL();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                SmartRecommendResp value3 = fARcdN().copydefault().getValue();
                Intrinsics.copydefault(value3);
                arrayList.add(value3);
                mutableLiveDataDjBIcL.postValue(arrayList);
            }
        }
        values().DbNXlk.setOnTouchListener(new View.OnTouchListener() { // from class: o.vIU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(android.view.View view2, android.view.MotionEvent motionEvent) {
                return vIF.OLrzqt(view2, motionEvent);
            }
        });
        values().DbNXlk.setNestedScrollingEnabled(true);
        C55867xrz.KWHzl.OLrzqt("contract_grid", OLrzqt().fvQaOB().gEmmrt());
    }

    public static final boolean OLrzqt(android.view.View view, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 1 || action == 3) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ vIF EZpvd;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vIF vif) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.EZpvd = vif;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.EZpvd.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.setQueueTitle);
                viewOnClickListenerC54939xaY.EZpvd(this.EZpvd.getString(C55688xof.Application.setSessionActivity));
                java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.QWSkGZ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new Fragment(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ vIF KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, vIF vif) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = vif;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C32866mlf.onEvent$default("KlineBotCreate_Kline_SetChart_Click", (TrackChannel[]) null, Dialog.EZpvd, 1, (java.lang.Object) null);
                vIF.EZpvd(this.KWHzl).fetchVPNInfo.AuCTelauCTel();
                vIF.EZpvd(this.KWHzl).AYXKKw.AuCTelauCTel();
                this.KWHzl.AubY();
                this.KWHzl.fIwbmz();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ vIF AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, vIF vif) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.AEQbTJ = vif;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.createCallback);
                viewOnClickListenerC54939xaY.copydefault(C55688xof.Application.RihMUf);
                java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.QWSkGZ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new Application(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        java.lang.String strAYXKKw;
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        TacticsType tacticsTypeAEQbTJ = TacticsType.Companion.AEQbTJ("contract_grid");
        if (tacticsTypeAEQbTJ != null && (strAYXKKw = C33070mpX.AYXKKw(tacticsTypeAEQbTJ.getStgyName())) != null) {
            wxq.setTitle(strAYXKKw);
        }
        wxq.valueOf().setVisibility(0);
        wxq.KWHzl().setVisibility(8);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(false);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.RdAHlO));
        wyf.setOKDSSize(44);
        wyf.setOnClickListener(new FragmentManager(wyf, 1000L, this));
    }

    public static final class Dialog implements Function1<EventParamsList, Unit> {
        public static final Dialog EZpvd = new Dialog();

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(EventParamsList eventParamsList) {
            copydefault(eventParamsList);
            return Unit.INSTANCE;
        }

        public final void copydefault(EventParamsList eventParamsList) {
            Intrinsics.checkNotNullParameter(eventParamsList, "");
            EventParamsList.put$default(eventParamsList, "button", "next", false, 4, null);
            EventParamsList.put$default(eventParamsList, "bot_type", "future_grid", false, 4, null);
        }
    }

    @Override // o.AbstractC49393unh, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        C32866mlf.onEvent$default("KlineBotCreate_Kline_SetChart_View", (TrackChannel[]) null, new Function1() { // from class: o.vJb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vIF.OLrzqt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit OLrzqt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "future_grid", false, 4, null);
        return Unit.INSTANCE;
    }

    private final void hDKMBd() {
        OLrzqt().uzCIH().setBasePos(Intrinsics.EZpvd((java.lang.Object) values().AEQbTJ.EZpvd(), (java.lang.Object) "neutral") ? null : java.lang.Boolean.TRUE);
    }

    private final void uzCIH() {
        final C47988uAv c47988uAv = values().fetchVPNInfo;
        c47988uAv.setMaxDecimal(OLrzqt().fvQaOB().isConnected().getDigit());
        c47988uAv.KWHzl(new uBH(new Function0() { // from class: o.vIY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vIF.KWHzl(c47988uAv, this);
            }
        }));
        final C47988uAv c47988uAv2 = values().AYXKKw;
        c47988uAv2.setMaxDecimal(OLrzqt().fvQaOB().isConnected().getDigit());
        c47988uAv2.KWHzl(new uBH(new Function0() { // from class: o.vIW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vIF.copydefault(c47988uAv2, this);
            }
        }));
    }

    public static final Unit KWHzl(C47988uAv c47988uAv, vIF vif) {
        if (c47988uAv.hasFocus()) {
            c47988uAv.setInputErrorMsg(xVK.EZpvd.EZpvd(c47988uAv.AkhnZx(), vif.OLrzqt().fvQaOB().gEmmrt(), vif.OLrzqt().fvQaOB().djBIcL()));
        }
        if (!c47988uAv.getFieldNames()) {
            vif.zsXlph();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C47988uAv c47988uAv, vIF vif) {
        if (c47988uAv.hasFocus()) {
            c47988uAv.setInputErrorMsg(xVK.EZpvd.EZpvd(c47988uAv.AkhnZx(), vif.OLrzqt().fvQaOB().gEmmrt(), vif.OLrzqt().fvQaOB().djBIcL()));
        }
        if (!c47988uAv.getFieldNames()) {
            vif.zsXlph();
        }
        return Unit.INSTANCE;
    }

    private final void iwGUEr() {
        uMX umxValues = values();
        umxValues.AEQbTJ.setTabSelectedWithPreCallBack(new Function2() { // from class: o.vIL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vIF.copydefault(this.EZpvd, (java.lang.String) obj, (java.lang.String) obj2);
            }
        });
        umxValues.AEQbTJ.OLrzqt();
        C55258xgZ c55258xgZ = umxValues.isConnected;
        c55258xgZ.setOnClickListener(new TaskDescription(c55258xgZ, 1000L, this));
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "direction_type", str, false, 4, null);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vIF vif, final java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        C32866mlf.onEvent$default("FuturesBotPlaceOrder_Direction_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vIM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vIF.KWHzl(str, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        if (C33129mqd.OLrzqt((java.lang.CharSequence) vif.values().AYXKKw.AkhnZx()) || C33129mqd.OLrzqt((java.lang.CharSequence) vif.values().fetchVPNInfo.AkhnZx()) || C33129mqd.OLrzqt((java.lang.CharSequence) vif.values().gEmmrt.AkhnZx())) {
            SmartRecommendResp value = vif.fARcdN().copydefault().getValue();
            if (value == null) {
                value = new SmartRecommendResp(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, -1, null);
            }
            StgyParam stgyParam = value.getStgyParam();
            if (stgyParam != null) {
                stgyParam.setDirection(str2);
            }
            StgyParam stgyParam2 = value.getStgyParam();
            if (stgyParam2 != null) {
                stgyParam2.setGridNum(vif.values().gEmmrt.AkhnZx());
            }
            StgyParam stgyParam3 = value.getStgyParam();
            if (stgyParam3 != null) {
                stgyParam3.setMinPx(vif.OLrzqt(vif.values().fetchVPNInfo.AkhnZx()));
            }
            StgyParam stgyParam4 = value.getStgyParam();
            if (stgyParam4 != null) {
                stgyParam4.setMaxPx(vif.OLrzqt(vif.values().AYXKKw.AkhnZx()));
            }
            Unit unit = Unit.INSTANCE;
            vif.KWHzl(str2, value);
        }
        vif.KWHzl(str);
        return Unit.INSTANCE;
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.copydefault = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.copydefault.dismiss();
        }
    }

    private final void zLjUOn() {
        uMX umxValues = values();
        C49960uyR.setWindowSoftInput$default(this, umxValues.fetchVPNInfo, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), umxValues.fetchVPNInfo, 0, 8, (java.lang.Object) null);
        C49960uyR.setWindowSoftInput$default(this, umxValues.AYXKKw, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), umxValues.AYXKKw, 0, 8, (java.lang.Object) null);
        C49960uyR.setWindowSoftInput$default(this, umxValues.gEmmrt, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), umxValues.gEmmrt, 0, 8, (java.lang.Object) null);
    }

    private final void getNewProxyInstance() {
        values().gEmmrt.setMaxDecimal(0);
        values().gEmmrt.setOnFocusChangeCallback(this.gEmmrt);
        values().gEmmrt.setOnTextChangeCallback(this.valueOf);
    }

    private final void sSMYrx() {
        TradeLiveData<java.lang.Boolean> tradeLiveDataGHZMYf = OLrzqt().gHZMYf();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataGHZMYf.observe(viewLifecycleOwner, new LoaderManager(new Function1() { // from class: o.vII
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vIF.KWHzl(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataORxRYg = OLrzqt().ORxRYg();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataORxRYg.observe(viewLifecycleOwner2, new LoaderManager(new Function1() { // from class: o.vIJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vIF.AEQbTJ(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        TradeLiveData<java.lang.Boolean> tradeLiveDataOcIXYQ = OLrzqt().OcIXYQ();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataOcIXYQ.observe(viewLifecycleOwner3, new LoaderManager(new Function1() { // from class: o.vIP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vIF.gEmmrt(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        TradeLiveData<StrategyConfigInfo> tradeLiveDataCopydefault = OLrzqt().copydefault();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner4, new LoaderManager(new Function1() { // from class: o.vIX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vIF.copydefault(this.OLrzqt, (StrategyConfigInfo) obj);
            }
        }));
        TradeLiveData<GridNumRangeBean> tradeLiveDataFARcdN = OLrzqt().fARcdN();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        tradeLiveDataFARcdN.observe(viewLifecycleOwner5, new LoaderManager(new Function1() { // from class: o.vIV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vIF.EZpvd(this.KWHzl, (GridNumRangeBean) obj);
            }
        }));
        C56111xwe<GridProfitRateResp> c56111xweFJNWhG = OLrzqt().fJNWhG();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        c56111xweFJNWhG.observe(viewLifecycleOwner6, new LoaderManager(new Function1() { // from class: o.vJd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vIF.KWHzl(this.copydefault, (GridProfitRateResp) obj);
            }
        }));
        OLrzqt().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.vJa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vIF.EZpvd(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
        TradeLiveData<xMJ.Application> tradeLiveDataAhwBna = C54782xVc.AEQbTJ.AhwBna();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        tradeLiveDataAhwBna.observe(viewLifecycleOwner7, new LoaderManager(new Function1() { // from class: o.vJc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vIF.copydefault(this.OLrzqt, (xMJ.Application) obj);
            }
        }));
    }

    public static final Unit KWHzl(vIF vif, boolean z) {
        if (vif.getContext() == null || !z) {
            return Unit.INSTANCE;
        }
        vif.OLrzqt().uzCIH().setBasePos(java.lang.Boolean.TRUE);
        if (!Intrinsics.EZpvd((java.lang.Object) vif.OLrzqt().uzCIH().getDirection(), (java.lang.Object) "long")) {
            vif.OLrzqt().uzCIH().setDirection("long");
            java.util.Map<java.lang.String, SmartRecommendResp> value = vif.fARcdN().AYXKKw().getValue();
            if ((value != null ? value.get(vif.OLrzqt().uzCIH().getDirection()) : null) != null) {
                vif.DbNXlk = true;
                MutableLiveData<java.util.List<SmartRecommendResp>> mutableLiveDataDjBIcL = vif.OLrzqt().djBIcL();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Map<java.lang.String, SmartRecommendResp> value2 = vif.fARcdN().AYXKKw().getValue();
                SmartRecommendResp smartRecommendResp = value2 != null ? value2.get(vif.OLrzqt().uzCIH().getDirection()) : null;
                Intrinsics.copydefault(smartRecommendResp);
                arrayList.add(smartRecommendResp);
                mutableLiveDataDjBIcL.postValue(arrayList);
            }
            vif.OLrzqt().KWHzl(vif.DbNXlk);
            vif.DbNXlk = false;
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vIF vif, boolean z) {
        if (vif.getContext() == null || !z) {
            return Unit.INSTANCE;
        }
        vif.OLrzqt().uzCIH().setBasePos(java.lang.Boolean.TRUE);
        if (!Intrinsics.EZpvd((java.lang.Object) vif.OLrzqt().uzCIH().getDirection(), (java.lang.Object) "short")) {
            vif.OLrzqt().uzCIH().setDirection("short");
            java.util.Map<java.lang.String, SmartRecommendResp> value = vif.fARcdN().AYXKKw().getValue();
            if ((value != null ? value.get(vif.OLrzqt().uzCIH().getDirection()) : null) != null) {
                vif.DbNXlk = true;
                MutableLiveData<java.util.List<SmartRecommendResp>> mutableLiveDataDjBIcL = vif.OLrzqt().djBIcL();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Map<java.lang.String, SmartRecommendResp> value2 = vif.fARcdN().AYXKKw().getValue();
                SmartRecommendResp smartRecommendResp = value2 != null ? value2.get(vif.OLrzqt().uzCIH().getDirection()) : null;
                Intrinsics.copydefault(smartRecommendResp);
                arrayList.add(smartRecommendResp);
                mutableLiveDataDjBIcL.postValue(arrayList);
            }
            vif.OLrzqt().KWHzl(vif.DbNXlk);
            vif.DbNXlk = false;
        }
        return Unit.INSTANCE;
    }

    public static final Unit gEmmrt(vIF vif, boolean z) {
        if (vif.getContext() == null || !z) {
            return Unit.INSTANCE;
        }
        vif.OLrzqt().uzCIH().setBasePos(null);
        if (!Intrinsics.EZpvd((java.lang.Object) vif.OLrzqt().uzCIH().getDirection(), (java.lang.Object) "neutral")) {
            vif.OLrzqt().uzCIH().setDirection("neutral");
            java.util.Map<java.lang.String, SmartRecommendResp> value = vif.fARcdN().AYXKKw().getValue();
            if ((value != null ? value.get(vif.OLrzqt().uzCIH().getDirection()) : null) != null) {
                vif.DbNXlk = true;
                MutableLiveData<java.util.List<SmartRecommendResp>> mutableLiveDataDjBIcL = vif.OLrzqt().djBIcL();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.util.Map<java.lang.String, SmartRecommendResp> value2 = vif.fARcdN().AYXKKw().getValue();
                SmartRecommendResp smartRecommendResp = value2 != null ? value2.get(vif.OLrzqt().uzCIH().getDirection()) : null;
                Intrinsics.copydefault(smartRecommendResp);
                arrayList.add(smartRecommendResp);
                mutableLiveDataDjBIcL.postValue(arrayList);
            }
            vif.OLrzqt().KWHzl(vif.DbNXlk);
            vif.DbNXlk = false;
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vIF vif, StrategyConfigInfo strategyConfigInfo) {
        java.lang.String maxGridNum;
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        GridNumRangeBean value = vif.OLrzqt().fARcdN().getValue();
        if (value == null || (maxGridNum = value.getMaxGridNum()) == null) {
            maxGridNum = strategyConfigInfo.getMaxGridNum();
        }
        vif.EZpvd(strategyConfigInfo.getMinGridNum(), maxGridNum);
        ContractManuallyPresenter.loadMinInvest$default(vif.OLrzqt(), false, 1, null);
        vif.OLrzqt().ejfBZ();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(vIF vif, GridNumRangeBean gridNumRangeBean) {
        java.lang.String maxGridNum;
        java.lang.String minGridNum;
        java.lang.String str = "0";
        if (gridNumRangeBean == null || (maxGridNum = gridNumRangeBean.getMaxGridNum()) == null) {
            StrategyConfigInfo value = vif.OLrzqt().copydefault().getValue();
            maxGridNum = value != null ? value.getMaxGridNum() : "0";
        }
        StrategyConfigInfo value2 = vif.OLrzqt().copydefault().getValue();
        if (value2 != null && (minGridNum = value2.getMinGridNum()) != null) {
            str = minGridNum;
        }
        vif.EZpvd(str, maxGridNum);
        java.lang.String strAuCTelauCTel = vif.AuCTelauCTel();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAuCTelauCTel)) {
            vif.values().gEmmrt.setInputErrorMsg(strAuCTelauCTel);
        } else {
            vif.values().gEmmrt.copydefault();
        }
        vif.OLrzqt().QUSxYX();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vIF vif, GridProfitRateResp gridProfitRateResp) {
        java.lang.String minGridNum;
        java.lang.String strCopydefault;
        java.lang.String str = "--";
        if (gridProfitRateResp == null) {
            vif.values().EZpvd.setText("--");
            vif.values().KWHzl.setVisibility(8);
            return Unit.INSTANCE;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) gridProfitRateResp.getPerMinProfitRate()) && C33129mqd.valueOf(gridProfitRateResp.getPerMinProfitRate(), 0)) {
            vif.values().KWHzl.setVisibility(0);
            C47988uAv.setInputErrorMsg$default(vif.values().gEmmrt, null, 1, null);
            if (C33129mqd.gEmmrt(gridProfitRateResp.getMaxGirdNum(), 2)) {
                vif.values().KWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.fromRating));
            } else {
                StrategyConfigInfo value = vif.OLrzqt().copydefault().getValue();
                if (Intrinsics.EZpvd((java.lang.Object) (value != null ? value.getMinGridNum() : null), (java.lang.Object) gridProfitRateResp.getMaxGirdNum())) {
                    strCopydefault = xMR.copydefault.copydefault(gridProfitRateResp.getMaxGirdNum());
                } else {
                    xMR xmr = xMR.copydefault;
                    if (value == null || (minGridNum = value.getMinGridNum()) == null) {
                        minGridNum = "";
                    }
                    strCopydefault = xmr.copydefault(minGridNum) + "-" + xmr.copydefault(gridProfitRateResp.getMaxGirdNum());
                }
                vif.values().KWHzl.setText(C33069mpW.copydefault(vif, C55688xof.Application.newHeartRating, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("range", strCopydefault))));
            }
        } else {
            vif.values().KWHzl.setVisibility(8);
        }
        xMR xmr2 = xMR.copydefault;
        java.lang.String perMinProfitRate = gridProfitRateResp.getPerMinProfitRate();
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.String percent$default = xMR.formatPercent$default(xmr2, perMinProfitRate, 0, roundingMode, 2, null);
        java.lang.String percent$default2 = xMR.formatPercent$default(xmr2, gridProfitRateResp.getPerMaxProfitRate(), 0, roundingMode, 2, null);
        if (Intrinsics.EZpvd((java.lang.Object) percent$default, (java.lang.Object) percent$default2)) {
            android.widget.TextView textView = vif.values().EZpvd;
            if (percent$default != null && percent$default.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) percent$default)) {
                str = percent$default;
            }
            textView.setText(str);
        } else {
            vif.values().EZpvd.setText(percent$default + " - " + percent$default2);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: F */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(vIF vif, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) vif.OLrzqt().DbNXlk().bB_())) {
            vif.values().KWHzl.setVisibility(8);
            vif.values().EZpvd.setText("--");
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) vif.OLrzqt().AuCTel().bB_())) {
            vif.OLrzqt().fARcdN().setValue(null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vIF vif, xMJ.Application application) {
        C54536xML c54536xMLAYXKKw;
        Intrinsics.checkNotNullParameter(application, "");
        java.lang.String strAYXKKw = application.AYXKKw();
        if (strAYXKKw == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAYXKKw)) {
            return Unit.INSTANCE;
        }
        xMS xmsAEQbTJ = C54797xVr.copydefault.AEQbTJ(vif.OLrzqt().fvQaOB().gEmmrt(), vif.OLrzqt().fvQaOB().djBIcL());
        java.lang.String safeString$default = null;
        if (xmsAEQbTJ != null && (c54536xMLAYXKKw = xmsAEQbTJ.AYXKKw(application.AYXKKw())) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null);
        }
        vif.OLrzqt = safeString$default != null ? safeString$default : "";
        return Unit.INSTANCE;
    }

    private final void wlaJM() {
        C56111xwe<BotGridOrderDialogData> c56111xweEZpvd = fARcdN().EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweEZpvd.observe(viewLifecycleOwner, new LoaderManager(new Function1() { // from class: o.vIK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vIF.KWHzl(this.KWHzl, (BotGridOrderDialogData) obj);
            }
        }));
        OLrzqt().djBIcL().observe(getViewLifecycleOwner(), new LoaderManager(new Function1() { // from class: o.vIO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vIF.OLrzqt(this.KWHzl, (java.util.List) obj);
            }
        }));
        getParentFragmentManager().setFragmentResultListener("bot_one_click_copy", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vIN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                vIF.OLrzqt(this.EZpvd, str, bundle);
            }
        });
        getParentFragmentManager().setFragmentResultListener("recommend_data", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vIS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                vIF.AEQbTJ(this.EZpvd, str, bundle);
            }
        });
    }

    public static final Unit KWHzl(vIF vif, BotGridOrderDialogData botGridOrderDialogData) {
        Intrinsics.checkNotNullParameter(botGridOrderDialogData, "");
        vif.AYXKKw = true;
        C47988uAv.setInputContent$default(vif.values().fetchVPNInfo, botGridOrderDialogData.getMinPx(), false, false, 6, null);
        C47988uAv.setInputContent$default(vif.values().AYXKKw, botGridOrderDialogData.getMaxPx(), false, false, 6, null);
        C47988uAv.setInputContent$default(vif.values().gEmmrt, C33129mqd.formatS$default(botGridOrderDialogData.getGridCount(), 0, null, null, 6, null), false, false, 6, null);
        vif.OLrzqt().uzCIH().setGridNum(C33129mqd.formatS$default(botGridOrderDialogData.getGridCount(), 0, null, null, 6, null));
        vif.OLrzqt().uzCIH().setMinPx(vif.OLrzqt(botGridOrderDialogData.getMinPx()));
        vif.OLrzqt().uzCIH().setMaxPx(vif.OLrzqt(botGridOrderDialogData.getMaxPx()));
        vif.fARcdN().gEmmrt().setValue(new BotGridOrderDialogData((java.lang.String) null, botGridOrderDialogData.getMaxPx(), botGridOrderDialogData.getMinPx(), botGridOrderDialogData.getGridCount(), vif.copydefault(), false, vif.OLrzqt().fvQaOB().isConnected().getDigit(), true, 1, (DefaultConstructorMarker) null));
        vif.AYXKKw = false;
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(vIF vif, java.util.List list) {
        java.lang.Object obj;
        boolean zEZpvd;
        Intrinsics.copydefault(list);
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            SmartRecommendResp smartRecommendResp = (SmartRecommendResp) next;
            java.lang.Boolean value = vif.OLrzqt().OcIXYQ().getValue();
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            if (Intrinsics.EZpvd(value, bool)) {
                StgyParam stgyParam = smartRecommendResp.getStgyParam();
                zEZpvd = Intrinsics.EZpvd(stgyParam != null ? stgyParam.getDirection() : null, (java.lang.Object) "neutral");
            } else if (Intrinsics.EZpvd(vif.OLrzqt().ORxRYg().getValue(), bool)) {
                StgyParam stgyParam2 = smartRecommendResp.getStgyParam();
                zEZpvd = Intrinsics.EZpvd(stgyParam2 != null ? stgyParam2.getDirection() : null, (java.lang.Object) "short");
            } else {
                StgyParam stgyParam3 = smartRecommendResp.getStgyParam();
                zEZpvd = Intrinsics.EZpvd(stgyParam3 != null ? stgyParam3.getDirection() : null, (java.lang.Object) "long");
            }
            if (zEZpvd) {
                obj = next;
                break;
            }
        }
        SmartRecommendResp smartRecommendResp2 = (SmartRecommendResp) obj;
        if (smartRecommendResp2 != null) {
            vif.fARcdN().copydefault().setValue(smartRecommendResp2);
            android.os.Parcelable parcelableAEQbTJ = BotRecommendPresenter.Companion.AEQbTJ(smartRecommendResp2);
            if (parcelableAEQbTJ != null) {
                Intrinsics.copydefault(parcelableAEQbTJ, "");
                AIData aIData = (AIData) parcelableAEQbTJ;
                aIData.setSignParams(vif.OLrzqt().uzCIH().getSignParams());
                aIData.setTpPx(vif.OLrzqt().uzCIH().getTpTriggerPx());
                aIData.setSlPx(vif.OLrzqt().uzCIH().getSlTriggerPx());
                aIData.setTpRatio(vif.OLrzqt().uzCIH().getTpRatio());
                aIData.setSlRatio(vif.OLrzqt().uzCIH().getSlRatio());
                java.lang.Boolean basePos = vif.OLrzqt().uzCIH().getBasePos();
                aIData.setBasePos(basePos != null ? basePos.booleanValue() : true);
                vif.EZpvd(aIData);
                vif.fARcdN().gEmmrt().setValue(new BotGridOrderDialogData((java.lang.String) null, vif.values().AYXKKw.AkhnZx(), vif.values().fetchVPNInfo.AkhnZx(), vif.OLrzqt().uzCIH().getGridNum(), vif.copydefault(), false, vif.OLrzqt().fvQaOB().isConnected().getDigit(), false, 129, (DefaultConstructorMarker) null));
            }
        }
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(vIF vif, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        android.os.Bundle arguments = vif.getArguments();
        if (arguments != null) {
            arguments.putParcelable("bot_copy_req", bundle.getParcelable("bot_copy_req"));
        }
        vif.OLrzqt().QVAiDq();
    }

    public static final void AEQbTJ(vIF vif, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        vif.EZpvd(bundle);
        vif.OLrzqt().QfsBiF();
    }

    private final void zsXlph() {
        OLrzqt().uzCIH().setMinPx(OLrzqt(values().fetchVPNInfo.AkhnZx()));
        OLrzqt().uzCIH().setMaxPx(OLrzqt(values().AYXKKw.AkhnZx()));
        java.lang.Boolean boolSSMYrx = OLrzqt().sSMYrx();
        if (Intrinsics.EZpvd(boolSSMYrx, java.lang.Boolean.TRUE)) {
            ejfBZ();
            if (this.AYXKKw) {
                BotGridOrderDialogData botGridOrderDialogData = this.copydefault;
                if (botGridOrderDialogData == null || !botGridOrderDialogData.isFinally()) {
                    return;
                }
                OLrzqt().ejfBZ();
                return;
            }
            isConnected();
            OLrzqt().ejfBZ();
            return;
        }
        if (!Intrinsics.EZpvd(boolSSMYrx, java.lang.Boolean.FALSE)) {
            if (boolSSMYrx != null) {
                throw new NoWhenBranchMatchedException();
            }
            ejfBZ();
        } else {
            C47988uAv.setInputErrorMsg$default(values().fetchVPNInfo, null, 1, null);
            C47988uAv.setInputErrorMsg$default(values().AYXKKw, null, 1, null);
            java.lang.String string = getString(C55688xof.Application.setLogo);
            Intrinsics.checkNotNullExpressionValue(string, "");
            copydefault(string);
        }
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void isConnected() {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) OLrzqt().uzCIH().getMinPx()) && C33129mqd.OLrzqt((java.lang.CharSequence) OLrzqt().uzCIH().getMaxPx()) && C33129mqd.OLrzqt((java.lang.CharSequence) OLrzqt().uzCIH().getGridNum())) {
            fARcdN().gEmmrt().setValue(new BotGridOrderDialogData((java.lang.String) null, values().AYXKKw.AkhnZx(), values().fetchVPNInfo.AkhnZx(), OLrzqt().uzCIH().getGridNum(), copydefault(), false, OLrzqt().fvQaOB().isConnected().getDigit(), false, 129, (DefaultConstructorMarker) null));
        }
    }

    public final PendingOrderLine copydefault() {
        wPG wpg = wPG.KWHzl;
        ContractGridReq contractGridReqUzCIH = OLrzqt().uzCIH();
        return wpg.OLrzqt(contractGridReqUzCIH.copy(((-97) & 1) != 0 ? contractGridReqUzCIH.instId : null, ((-97) & 2) != 0 ? contractGridReqUzCIH.instType : null, ((-97) & 4) != 0 ? contractGridReqUzCIH.basePos : null, ((-97) & 8) != 0 ? contractGridReqUzCIH.gridNum : null, ((-97) & 16) != 0 ? contractGridReqUzCIH.investType : null, ((-97) & 32) != 0 ? contractGridReqUzCIH.maxPx : values().AYXKKw.AkhnZx(), ((-97) & 64) != 0 ? contractGridReqUzCIH.minPx : values().fetchVPNInfo.AkhnZx(), ((-97) & 128) != 0 ? contractGridReqUzCIH.sz : null, ((-97) & 256) != 0 ? contractGridReqUzCIH.runType : null, ((-97) & 512) != 0 ? contractGridReqUzCIH.slTriggerPx : null, ((-97) & 1024) != 0 ? contractGridReqUzCIH.tpTriggerPx : null, ((-97) & 2048) != 0 ? contractGridReqUzCIH.tpRatio : null, ((-97) & 4096) != 0 ? contractGridReqUzCIH.slRatio : null, ((-97) & 8192) != 0 ? contractGridReqUzCIH.tpOrdPx : null, ((-97) & 16384) != 0 ? contractGridReqUzCIH.slOrdPx : null, ((-97) & 32768) != 0 ? contractGridReqUzCIH.direction : null, ((-97) & 65536) != 0 ? contractGridReqUzCIH.displayName : null, ((-97) & 131072) != 0 ? contractGridReqUzCIH.lever : null, ((-97) & 262144) != 0 ? contractGridReqUzCIH.signParams : null, ((-97) & 524288) != 0 ? contractGridReqUzCIH.profitSharingRatio : null, ((-97) & 1048576) != 0 ? contractGridReqUzCIH.ordType : null, ((-97) & 2097152) != 0 ? contractGridReqUzCIH.annualizedRate : null, ((-97) & 4194304) != 0 ? contractGridReqUzCIH.autoTransfer : null, ((-97) & 8388608) != 0 ? contractGridReqUzCIH.systemSource : null, ((-97) & 16777216) != 0 ? contractGridReqUzCIH.nmpUnderlyingId : null, ((-97) & MediaHttpDownloader.MAXIMUM_CHUNK_SIZE) != 0 ? contractGridReqUzCIH.batchNo : null, ((-97) & 67108864) != 0 ? contractGridReqUzCIH.voucherId : null, ((-97) & 134217728) != 0 ? contractGridReqUzCIH.autoReserve : null, ((-97) & 268435456) != 0 ? contractGridReqUzCIH.actualMarginSz : null, ((-97) & 536870912) != 0 ? contractGridReqUzCIH.extraMarginSz : null, ((-97) & 1073741824) != 0 ? contractGridReqUzCIH.contractGridVersion : null, ((-97) & Integer.MIN_VALUE) != 0 ? contractGridReqUzCIH.openPosSlippage : null, (15 & 1) != 0 ? contractGridReqUzCIH.openPosSlippageDefault : null, (15 & 2) != 0 ? contractGridReqUzCIH.ordVariant : null, (15 & 4) != 0 ? contractGridReqUzCIH.algoId : null, (15 & 8) != 0 ? contractGridReqUzCIH.topupActualMarginSz : null));
    }

    private final void ejfBZ() {
        values().fetchVPNInfo.copydefault();
        values().AYXKKw.copydefault();
        copydefault("");
    }

    public final void KWHzl(java.lang.String str, SmartRecommendResp smartRecommendResp) {
        if (fARcdN().AYXKKw().getValue() != null) {
            java.util.Map<java.lang.String, SmartRecommendResp> value = fARcdN().AYXKKw().getValue();
            if (value != null) {
                value.put(str, smartRecommendResp);
                return;
            }
            return;
        }
        MutableLiveData<java.util.Map<java.lang.String, SmartRecommendResp>> mutableLiveDataAYXKKw = fARcdN().AYXKKw();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(str, smartRecommendResp);
        mutableLiveDataAYXKKw.setValue(linkedHashMap);
    }

    private final void KWHzl(java.lang.String str) {
        AuCTel();
        OLrzqt().gHZMYf().setValue(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) "long", (java.lang.Object) str)));
        OLrzqt().ORxRYg().setValue(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) "short", (java.lang.Object) str)));
        OLrzqt().OcIXYQ().setValue(java.lang.Boolean.valueOf(Intrinsics.EZpvd((java.lang.Object) "neutral", (java.lang.Object) str)));
    }

    private final void EZpvd(android.os.Bundle bundle) {
        AIData aIData = bundle != null ? (AIData) bundle.getParcelable("bot_copy_req") : null;
        AIData aIData2 = aIData instanceof AIData ? aIData : null;
        if (aIData2 == null) {
            return;
        }
        bundle.remove("bot_copy_req");
        values().AEQbTJ.setDirectionType(aIData2.getDirection());
        OLrzqt().uzCIH().setSystemSource(aIData2.getSystemSource());
        OLrzqt().uzCIH().setNmpUnderlyingId(aIData2.getNmpUnderlyingId());
        EZpvd(aIData2);
    }

    private final void AuCTel() {
        C47988uAv.setInputContent$default(values().fetchVPNInfo, "", false, false, 6, null);
        C47988uAv.setInputContent$default(values().AYXKKw, "", false, false, 6, null);
        C47988uAv.setInputContent$default(values().gEmmrt, "", false, false, 6, null);
        values().fetchVPNInfo.copydefault();
        values().AYXKKw.copydefault();
        copydefault("");
    }

    private final void copydefault(java.lang.String str) {
        android.widget.TextView textView = values().copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ^ true ? 0 : 8);
        values().copydefault.setText(str);
    }

    private final void EZpvd(java.lang.String str, java.lang.String str2) {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        if (C33129mqd.valueOf(str, str2)) {
            xMR xmr = xMR.copydefault;
            java.lang.String str3 = xmr.copydefault(str) + " - " + xmr.copydefault(str2);
            C55312xha c55312xhaValueOf = values().isConnected.valueOf();
            if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
                c55320xhiKWHzl2.setText(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultCallerLauncher) + " (" + str3 + ")");
            }
            C47988uAv.setInputLabel$default(values().gEmmrt, str3, null, 2, null);
            return;
        }
        C55312xha c55312xhaValueOf2 = values().isConnected.valueOf();
        if (c55312xhaValueOf2 == null || (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.ActivityResultCallerLauncher));
    }

    private final java.lang.String AuCTelauCTel() {
        java.lang.String maxGridNum;
        java.lang.String strAkhnZx = values().gEmmrt.AkhnZx();
        StrategyConfigInfo value = OLrzqt().copydefault().getValue();
        java.lang.String maxGridNum2 = null;
        java.lang.String minGridNum = value != null ? value.getMinGridNum() : null;
        GridNumRangeBean value2 = OLrzqt().fARcdN().getValue();
        if (value2 == null || (maxGridNum = value2.getMaxGridNum()) == null) {
            StrategyConfigInfo value3 = OLrzqt().copydefault().getValue();
            if (value3 != null) {
                maxGridNum2 = value3.getMaxGridNum();
            }
        } else {
            maxGridNum2 = maxGridNum;
        }
        if (minGridNum == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) minGridNum) || maxGridNum2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxGridNum2) || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            return "";
        }
        return C33129mqd.gEmmrt(strAkhnZx, minGridNum) ? C33069mpW.copydefault(this, C55688xof.Application.onDrawerSlide, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xMR.copydefault.copydefault(minGridNum)))) : C33129mqd.AEQbTJ(strAkhnZx, maxGridNum2) ? C33069mpW.copydefault(this, C55688xof.Application.ActionBarLayoutParams, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, xMR.copydefault.copydefault(maxGridNum2)))) : "";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void EZpvd(AIData aIData) {
        java.lang.String safeString$default;
        java.lang.String safeString$default2;
        C54536xML c54536xMLAYXKKw;
        C54536xML c54536xMLAYXKKw2;
        AbstractC54531xLw abstractC54531xLwAEQbTJ = OLrzqt().fvQaOB().AEQbTJ();
        if (abstractC54531xLwAEQbTJ == null) {
            safeString$default = null;
        } else {
            java.lang.String strValueOf = OLrzqt().fvQaOB().valueOf();
            if (strValueOf == null) {
                strValueOf = "";
            }
            xMS xmsGEmmrt = abstractC54531xLwAEQbTJ.gEmmrt(strValueOf);
            if (xmsGEmmrt != null && (c54536xMLAYXKKw2 = xmsGEmmrt.AYXKKw(aIData.getMinPx())) != null) {
                safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw2, false, 1, null);
            }
        }
        if (abstractC54531xLwAEQbTJ == null) {
            safeString$default2 = null;
        } else {
            java.lang.String strValueOf2 = OLrzqt().fvQaOB().valueOf();
            xMS xmsGEmmrt2 = abstractC54531xLwAEQbTJ.gEmmrt(strValueOf2 != null ? strValueOf2 : "");
            if (xmsGEmmrt2 != null && (c54536xMLAYXKKw = xmsGEmmrt2.AYXKKw(aIData.getMaxPx())) != null) {
                safeString$default2 = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null);
            }
        }
        OLrzqt().uzCIH().setLever(C33129mqd.formatS$default(aIData.getLever(), 2, java.lang.Boolean.FALSE, null, 4, null));
        OLrzqt().uzCIH().setGridNum(C33129mqd.formatS$default(aIData.getGridNum(), 0, null, null, 6, null));
        OLrzqt().uzCIH().setMinPx(aIData.getMinPx());
        OLrzqt().uzCIH().setMaxPx(aIData.getMaxPx());
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) aIData.getProfitSharingRatio())) {
            OLrzqt().uzCIH().setProfitSharingRatio(aIData.getProfitSharingRatio());
        }
        OLrzqt().uzCIH().setBasePos(Intrinsics.EZpvd((java.lang.Object) OLrzqt().uzCIH().getDirection(), (java.lang.Object) "neutral") ? null : java.lang.Boolean.valueOf(aIData.getBasePos()));
        C47988uAv.setInputContent$default(values().fetchVPNInfo, safeString$default, false, false, 6, null);
        C47988uAv.setInputContent$default(values().AYXKKw, safeString$default2, false, false, 6, null);
        C47988uAv.setInputContent$default(values().gEmmrt, C33129mqd.formatS$default(aIData.getGridNum(), 0, null, null, 6, null), false, false, 6, null);
    }

    private final void getFieldNames() {
        C55258xgZ c55258xgZ = values().OLrzqt;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this));
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fIwbmz() {
        PriceOutOfRangeBottomSheet.Application application = PriceOutOfRangeBottomSheet.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        application.EZpvd(childFragmentManager, new PriceOutOfRangeBottomSheet.PriceOutOfRangeBottomSheetInput(this.OLrzqt, values().fetchVPNInfo.AkhnZx(), values().AYXKKw.AkhnZx(), OLrzqt().fvQaOB().isConnected().getSymbol()), new Function1() { // from class: o.vIZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vIF.KWHzl(this.copydefault, (PriceRangeUtil.ValidatedPriceRange) obj);
            }
        }, new Function0() { // from class: o.vIG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vIF.AYXKKw(this.KWHzl);
            }
        }, new Function0() { // from class: o.vIH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vIF.djBIcL(this.KWHzl);
            }
        });
    }

    public static final Unit KWHzl(vIF vif, PriceRangeUtil.ValidatedPriceRange validatedPriceRange) {
        Intrinsics.checkNotNullParameter(validatedPriceRange, "");
        int i = StateListAnimator.OLrzqt[validatedPriceRange.ordinal()];
        if (i == 1 || i == 2) {
            vif.values().fetchVPNInfo.zsXlph();
        } else if (i == 3 || i == 4) {
            vif.values().AYXKKw.zsXlph();
        } else {
            vif.values().fetchVPNInfo.zsXlph();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(vIF vif) {
        StgyParam stgyParam;
        SmartRecommendResp value = vif.fARcdN().copydefault().getValue();
        if (value != null && (stgyParam = value.getStgyParam()) != null) {
            stgyParam.setMinPx(vif.OLrzqt().uzCIH().getMinPx());
            stgyParam.setMaxPx(vif.OLrzqt().uzCIH().getMaxPx());
            stgyParam.setGridNum(vif.OLrzqt().uzCIH().getGridNum());
            vif.fARcdN().copydefault().setValue(value);
            vif.fARcdN().djBIcL().setValue(C50297vJe.Companion.AEQbTJ());
        }
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(vIF vif) {
        StgyParam stgyParam;
        SmartRecommendResp value = vif.fARcdN().copydefault().getValue();
        if (value != null && (stgyParam = value.getStgyParam()) != null) {
            stgyParam.setMinPx(vif.OLrzqt().uzCIH().getMinPx());
            stgyParam.setMaxPx(vif.OLrzqt().uzCIH().getMaxPx());
            stgyParam.setGridNum(vif.OLrzqt().uzCIH().getGridNum());
            vif.fARcdN().copydefault().setValue(value);
            vif.fARcdN().djBIcL().setValue(C50297vJe.Companion.AEQbTJ());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AubY() {
        if (values().fetchVPNInfo.AkhnZx().length() == 0) {
            C55326xho.toast$default(C33069mpW.copydefault(this, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", values().fetchVPNInfo.values()))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            values().fetchVPNInfo.zsXlph();
            return false;
        }
        if (values().AYXKKw.AkhnZx().length() == 0) {
            C55326xho.toast$default(C33069mpW.copydefault(this, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", values().AYXKKw.values()))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            values().AYXKKw.zsXlph();
            return false;
        }
        if (!Intrinsics.EZpvd(OLrzqt().sSMYrx(), java.lang.Boolean.TRUE)) {
            C55326xho.toast$default(getString(C55688xof.Application.setLogo), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            values().AYXKKw.zsXlph();
            return false;
        }
        if (values().gEmmrt.AkhnZx().length() == 0) {
            C55326xho.toast$default(C33069mpW.copydefault(this, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", values().gEmmrt.values()))), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            values().gEmmrt.zsXlph();
            return false;
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) AuCTelauCTel())) {
            C55326xho.toast$default(AuCTelauCTel(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            values().fetchVPNInfo.zsXlph();
            return false;
        }
        if (values().KWHzl.getVisibility() != 0 || !C33129mqd.OLrzqt(values().KWHzl.getText())) {
            return true;
        }
        C55326xho.toast$default(values().KWHzl.getText().toString(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        values().gEmmrt.zsXlph();
        return false;
    }

    private final java.lang.String OLrzqt(java.lang.String str) {
        return C56033xvF.KWHzl(str, OLrzqt().fvQaOB().AhwBna());
    }
}
