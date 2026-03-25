package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MediatorLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.amplifyframework.ui.liveness.ml.FaceDetector;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.GridNumRangeBean;
import com.okinc.unify_trade.biz.GridProfitRateResp;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.MinTopUpResp;
import com.okinc.unify_trade.biz.SpotGridEditParamReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnParam;
import com.okinc.unify_trade.bot.contract_grid.viewModel.BotGridEditParamPresenter;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.grid.mapper.GridProfitAmtDisplay;
import com.okinc.unify_trade.bot.grid.viewmodel.SpotGridPresenter;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class vGL extends AbstractC49945uyC<AbstractC48507uTz, BotGridEditParamPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public wYF AEQbTJ;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm copydefault;

    public static final /* synthetic */ class PendingIntent implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.OLrzqt = function1;
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
            return this.OLrzqt;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.OLrzqt.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC49945uyC
    public int AEQbTJ() {
        return C48033uCm.Activity.scanPackages;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public vGL() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotGridEditParamDialog$special$$inlined$viewModels$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotGridEditParamDialog$special$$inlined$viewModels$default$2
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotGridEditParamDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotGridEditParamDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotGridEditParamDialog$special$$inlined$viewModels$default$5
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotGridEditParamDialog$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotGridEditParamDialog$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SpotGridPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotGridEditParamDialog$special$$inlined$viewModels$default$8
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotGridEditParamDialog$special$$inlined$viewModels$default$9
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotGridEditParamDialog$special$$inlined$viewModels$default$10
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vGV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vGL.AhwBna(this.EZpvd);
            }
        });
    }

    private final C55915xsu fJNWhG() {
        return (C55915xsu) this.copydefault.getValue();
    }

    public final SpotGridPresenter isConnected() {
        return (SpotGridPresenter) this.AhwBna.getValue();
    }

    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vGL.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final vGL OLrzqt(@NotNull android.os.Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(parcelable, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("bot_grid_req", parcelable);
            vGL vgl = new vGL();
            vgl.setArguments(bundle);
            return vgl;
        }
    }

    public final Function2<C47988uAv, java.lang.String, Unit> copydefault() {
        return (Function2) this.KWHzl.getValue();
    }

    public static final Function2 AhwBna(final vGL vgl) {
        return new Function2() { // from class: o.vGP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vGL.AEQbTJ(this.AEQbTJ, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
    }

    public static final Unit AEQbTJ(vGL vgl, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        AbstractC48507uTz abstractC48507uTzValues = vgl.values();
        if (Intrinsics.EZpvd(c47988uAv, abstractC48507uTzValues.isConnected) || Intrinsics.EZpvd(c47988uAv, abstractC48507uTzValues.fetchVPNInfo)) {
            vgl.isConnected().wlaJM().setMinPx(abstractC48507uTzValues.isConnected.AkhnZx());
            vgl.isConnected().wlaJM().setMaxPx(abstractC48507uTzValues.fetchVPNInfo.AkhnZx());
            if (c47988uAv.hasFocus()) {
                xVK xvk = xVK.EZpvd;
                java.lang.String strAkhnZx = c47988uAv.AkhnZx();
                TacticsData tacticsDataAYXKKw = vgl.OLrzqt().AYXKKw();
                java.lang.String instId = tacticsDataAYXKKw != null ? tacticsDataAYXKKw.getInstId() : null;
                TacticsData tacticsDataAYXKKw2 = vgl.OLrzqt().AYXKKw();
                c47988uAv.setInputErrorMsg(xvk.EZpvd(strAkhnZx, instId, tacticsDataAYXKKw2 != null ? tacticsDataAYXKKw2.getInstType() : null));
            }
            if (c47988uAv.getFieldNames()) {
                vgl.OLrzqt("");
                vgl.fIwbmz();
            } else if (!vgl.sSMYrx() || !vgl.gHZMYf()) {
                vgl.values().isConnected.copydefault();
                vgl.values().fetchVPNInfo.copydefault();
                vgl.OLrzqt("");
                vgl.fIwbmz();
            } else if (!vgl.AwvSrB()) {
                C47988uAv.setInputErrorMsg$default(vgl.values().isConnected, null, 1, null);
                C47988uAv.setInputErrorMsg$default(vgl.values().fetchVPNInfo, null, 1, null);
                java.lang.String string = vgl.getString(C55688xof.Application.setLogo);
                Intrinsics.checkNotNullExpressionValue(string, "");
                vgl.OLrzqt(string);
                vgl.fIwbmz();
            } else {
                vgl.values().isConnected.copydefault();
                vgl.values().fetchVPNInfo.copydefault();
                vgl.OLrzqt("");
                vgl.QKVWgx();
                vgl.isConnected().getFieldNames();
            }
        } else if (Intrinsics.EZpvd(c47988uAv, abstractC48507uTzValues.AhwBna)) {
            vgl.isConnected().wlaJM().setGridNum(abstractC48507uTzValues.AhwBna.AkhnZx());
            java.lang.String strZLjUOn = vgl.zLjUOn();
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strZLjUOn)) {
                vgl.values().AhwBna.setInputErrorMsg(strZLjUOn);
            } else {
                vgl.values().AhwBna.copydefault();
            }
            vgl.fIwbmz();
            vgl.QKVWgx();
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        getFieldNames();
        getNewProxyInstance();
        AuCTelauCTel();
        ORxRYg();
    }

    private final void getFieldNames() {
        java.lang.String instType;
        java.lang.String instId;
        java.lang.String instId2;
        BotGridEditParamPresenter botGridEditParamPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        TacticsData tacticsData = arguments != null ? (TacticsData) arguments.getParcelable("bot_grid_req") : null;
        botGridEditParamPresenterOLrzqt.KWHzl(tacticsData instanceof TacticsData ? tacticsData : null);
        isConnected().dxcTrN();
        SpotGridPresenter spotGridPresenterIsConnected = isConnected();
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        java.lang.String str = "";
        if (tacticsDataAYXKKw == null || (instType = tacticsDataAYXKKw.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsDataAYXKKw2 = OLrzqt().AYXKKw();
        if (tacticsDataAYXKKw2 == null || (instId = tacticsDataAYXKKw2.getInstId()) == null) {
            instId = "";
        }
        spotGridPresenterIsConnected.OLrzqt(instType, instId);
        SpotGridPresenter spotGridPresenterIsConnected2 = isConnected();
        TacticsData tacticsDataAYXKKw3 = OLrzqt().AYXKKw();
        if (tacticsDataAYXKKw3 != null && (instId2 = tacticsDataAYXKKw3.getInstId()) != null) {
            str = instId2;
        }
        spotGridPresenterIsConnected2.copydefault(str);
    }

    private final void AuCTelauCTel() {
        wlaJM();
        hDKMBd();
        DTwDnp();
        uzCIH();
        fARcdN();
    }

    private final void fARcdN() {
        C47988uAv c47988uAv = values().isConnected;
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        C47988uAv.setInputContent$default(c47988uAv, tacticsDataAYXKKw != null ? tacticsDataAYXKKw.getMinPx() : null, false, false, 6, null);
        C47988uAv c47988uAv2 = values().fetchVPNInfo;
        TacticsData tacticsDataAYXKKw2 = OLrzqt().AYXKKw();
        C47988uAv.setInputContent$default(c47988uAv2, tacticsDataAYXKKw2 != null ? tacticsDataAYXKKw2.getMaxPx() : null, false, false, 6, null);
        C47988uAv c47988uAv3 = values().AhwBna;
        TacticsData tacticsDataAYXKKw3 = OLrzqt().AYXKKw();
        C47988uAv.setInputContent$default(c47988uAv3, tacticsDataAYXKKw3 != null ? tacticsDataAYXKKw3.getGridNum() : null, false, false, 6, null);
        GridReq gridReqWlaJM = isConnected().wlaJM();
        TacticsData tacticsDataAYXKKw4 = OLrzqt().AYXKKw();
        gridReqWlaJM.setRunType(tacticsDataAYXKKw4 != null ? tacticsDataAYXKKw4.getRunType() : null);
        GridReq gridReqWlaJM2 = isConnected().wlaJM();
        TacticsData tacticsDataAYXKKw5 = OLrzqt().AYXKKw();
        gridReqWlaJM2.setBaseSz(tacticsDataAYXKKw5 != null ? tacticsDataAYXKKw5.getCurBaseSz() : null);
        GridReq gridReqWlaJM3 = isConnected().wlaJM();
        TacticsData tacticsDataAYXKKw6 = OLrzqt().AYXKKw();
        gridReqWlaJM3.setQuoteSz(tacticsDataAYXKKw6 != null ? tacticsDataAYXKKw6.getCurQuoteSz() : null);
    }

    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ vGL AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, vGL vgl) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.AEQbTJ = vgl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.AEQbTJ.AuCTel();
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ vGL AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, vGL vgl) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = vgl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ vGL KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vGL vgl) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = vgl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.ejfBZ();
            }
        }
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ vGL OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, vGL vgl) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.OLrzqt = vgl;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.OLrzqt.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.EZpvd(this.OLrzqt.getString(C55688xof.Application.setSessionActivity));
                java.lang.String string = this.OLrzqt.getString(C55688xof.Application.onCreate);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new Application(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    private final void ORxRYg() {
        TradeLiveData<java.lang.String> tradeLiveDataValueOf = OLrzqt().valueOf();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataValueOf.observe(viewLifecycleOwner, new PendingIntent(new Function1() { // from class: o.vGT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGL.copydefault(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(OLrzqt().copydefault(), new PendingIntent(new Function1() { // from class: o.vGW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGL.copydefault(this.AEQbTJ, mediatorLiveData, (MinTopUpResp) obj);
            }
        }));
        mediatorLiveData.addSource(fJNWhG().AhwBna(), new PendingIntent(new Function1() { // from class: o.vHa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGL.copydefault(this.KWHzl, mediatorLiveData, (java.lang.String) obj);
            }
        }));
        mediatorLiveData.observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.vGY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGL.KWHzl(this.OLrzqt, (Unit) obj);
            }
        }));
        TradeLiveData<GridProfitRateResp> tradeLiveDataZsXlph = isConnected().zsXlph();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataZsXlph.observe(viewLifecycleOwner2, new PendingIntent(new Function1() { // from class: o.vHb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGL.KWHzl(this.copydefault, (GridProfitRateResp) obj);
            }
        }));
        isConnected().fJNWhG().AkhnZx().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.vHc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGL.AEQbTJ(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        TradeLiveData<GridNumRangeBean> tradeLiveDataHDKMBd = isConnected().hDKMBd();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataHDKMBd.observe(viewLifecycleOwner3, new PendingIntent(new Function1() { // from class: o.vGQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGL.OLrzqt(this.EZpvd, (GridNumRangeBean) obj);
            }
        }));
        TradeLiveData<StrategyConfigInfo> tradeLiveDataFetchVPNInfo = isConnected().fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataFetchVPNInfo.observe(viewLifecycleOwner4, new PendingIntent(new Function1() { // from class: o.vGR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGL.OLrzqt(this.AEQbTJ, (StrategyConfigInfo) obj);
            }
        }));
        isConnected().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new PendingIntent(new Function1() { // from class: o.vGS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGL.OLrzqt(this.KWHzl, (androidx.core.util.Pair) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().EZpvd().AhwBna();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner5, new PendingIntent(new Function1() { // from class: o.vGU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vGL.EZpvd(this.OLrzqt, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit copydefault(vGL vgl, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        vgl.values().AuCTel.setText(str);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vGL vgl, MediatorLiveData mediatorLiveData, MinTopUpResp minTopUpResp) {
        java.lang.String value = vgl.fJNWhG().AhwBna().getValue();
        if (value == null || value.length() == 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        mediatorLiveData.setValue(unit);
        return unit;
    }

    public static final Unit copydefault(vGL vgl, MediatorLiveData mediatorLiveData, java.lang.String str) {
        if (vgl.OLrzqt().copydefault().getValue() == null) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        mediatorLiveData.setValue(unit);
        return unit;
    }

    public static final Unit KWHzl(vGL vgl, Unit unit) {
        MinTopUpResp value = vgl.OLrzqt().copydefault().getValue();
        vgl.djBIcL(value != null ? value.getRequiredTopUpAmount() : null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vGL vgl, GridProfitRateResp gridProfitRateResp) {
        java.lang.String instType;
        java.lang.String instId;
        java.lang.String minGridNum;
        java.lang.String strCopydefault;
        if (gridProfitRateResp == null) {
            vgl.values().valueOf.setText("--");
            vgl.values().KWHzl.setVisibility(8);
            vgl.fIwbmz();
            return Unit.INSTANCE;
        }
        vgl.isConnected().copydefault(gridProfitRateResp.getPerMinProfitAmt(), gridProfitRateResp.getPerMaxProfitAmt(), vgl.copydefault(gridProfitRateResp.getProfitCcy()));
        if (C33129mqd.valueOf(gridProfitRateResp.getPerMinProfitRate(), 0)) {
            if (C33129mqd.gEmmrt(gridProfitRateResp.getMaxGirdNum(), 2)) {
                vgl.values().KWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.fromRating));
            } else {
                StrategyConfigInfo strategyConfigInfoDjBIcL = vgl.isConnected().djBIcL();
                if (Intrinsics.EZpvd((java.lang.Object) (strategyConfigInfoDjBIcL != null ? strategyConfigInfoDjBIcL.getMinGridNum() : null), (java.lang.Object) gridProfitRateResp.getMaxGirdNum())) {
                    strCopydefault = xMR.copydefault.copydefault(gridProfitRateResp.getMaxGirdNum());
                } else {
                    xMR xmr = xMR.copydefault;
                    StrategyConfigInfo strategyConfigInfoDjBIcL2 = vgl.isConnected().djBIcL();
                    if (strategyConfigInfoDjBIcL2 == null || (minGridNum = strategyConfigInfoDjBIcL2.getMinGridNum()) == null) {
                        minGridNum = "";
                    }
                    strCopydefault = xmr.copydefault(minGridNum) + "-" + xmr.copydefault(gridProfitRateResp.getMaxGirdNum());
                }
                vgl.values().KWHzl.setText(C33069mpW.copydefault(vgl, C55688xof.Application.newHeartRating, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("range", strCopydefault))));
            }
            vgl.values().KWHzl.setVisibility(0);
            C47988uAv.setInputErrorMsg$default(vgl.values().AhwBna, null, 1, null);
            vgl.fIwbmz();
        } else {
            vgl.values().KWHzl.setVisibility(8);
            vgl.values().AhwBna.copydefault();
            vgl.fIwbmz();
            vgl.OLrzqt().copydefault(vgl.values().isConnected.AkhnZx(), vgl.values().fetchVPNInfo.AkhnZx(), vgl.values().AhwBna.AkhnZx());
        }
        java.lang.String strCopydefault2 = C55918xsx.Companion.copydefault(gridProfitRateResp.getPerMinProfitRate(), gridProfitRateResp.getPerMaxProfitRate());
        TacticsData tacticsDataAYXKKw = vgl.OLrzqt().AYXKKw();
        java.lang.String str = (tacticsDataAYXKKw == null || (instId = tacticsDataAYXKKw.getInstId()) == null) ? "" : instId;
        TacticsData tacticsDataAYXKKw2 = vgl.OLrzqt().AYXKKw();
        vgl.values().valueOf.setText(C56033xvF.copydefault(str, (tacticsDataAYXKKw2 == null || (instType = tacticsDataAYXKKw2.getInstType()) == null) ? "" : instType, strCopydefault2, gridProfitRateResp.getPerMinProfitAmt(), gridProfitRateResp.getPerMaxProfitAmt(), vgl.copydefault(gridProfitRateResp.getProfitCcy()), "--", true, 1));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(vGL vgl, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            vgl.values().valueOf.setVisibility(8);
            vgl.values().ejfBZ.KWHzl(0L);
        } else {
            vgl.values().valueOf.setVisibility(0);
            vgl.values().ejfBZ.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(vGL vgl, GridNumRangeBean gridNumRangeBean) {
        java.lang.String maxGridNum;
        java.lang.String minGridNum;
        java.lang.String str = "0";
        if (gridNumRangeBean == null || (maxGridNum = gridNumRangeBean.getMaxGridNum()) == null) {
            StrategyConfigInfo strategyConfigInfoDjBIcL = vgl.isConnected().djBIcL();
            maxGridNum = strategyConfigInfoDjBIcL != null ? strategyConfigInfoDjBIcL.getMaxGridNum() : "0";
        }
        StrategyConfigInfo strategyConfigInfoDjBIcL2 = vgl.isConnected().djBIcL();
        if (strategyConfigInfoDjBIcL2 != null && (minGridNum = strategyConfigInfoDjBIcL2.getMinGridNum()) != null) {
            str = minGridNum;
        }
        vgl.AEQbTJ(str, maxGridNum);
        java.lang.String strZLjUOn = vgl.zLjUOn();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strZLjUOn)) {
            vgl.values().AhwBna.setInputErrorMsg(strZLjUOn);
        } else {
            vgl.values().AhwBna.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(vGL vgl, StrategyConfigInfo strategyConfigInfo) {
        java.lang.String maxGridNum;
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        vgl.isConnected().OLrzqt(strategyConfigInfo);
        java.lang.String minGridNum = strategyConfigInfo.getMinGridNum();
        GridNumRangeBean value = vgl.isConnected().hDKMBd().getValue();
        if (value == null || (maxGridNum = value.getMaxGridNum()) == null) {
            maxGridNum = strategyConfigInfo.getMaxGridNum();
        }
        vgl.AEQbTJ(minGridNum, maxGridNum);
        vgl.QKVWgx();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: F */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(vGL vgl, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) vgl.isConnected().iwGUEr().bB_())) {
            vgl.values().valueOf.setText("--");
            vgl.values().KWHzl.setVisibility(8);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) vgl.isConnected().uzCIH().bB_())) {
            vgl.isConnected().hDKMBd().setValue(null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(vGL vgl, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        vgl.fIwbmz();
        java.lang.String message = exc.getMessage();
        pUU.copydefault("BotGridEditParamDialog", "Get min-topup fail cause by :" + (message != null ? message : ""));
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        if (C33129mqd.valueOf(str, str2)) {
            xMR xmr = xMR.copydefault;
            java.lang.String str3 = xmr.copydefault(str) + " - " + xmr.copydefault(str2);
            C55312xha c55312xhaValueOf = values().fJNWhG.valueOf();
            if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
                c55320xhiKWHzl2.setText(C33070mpX.AYXKKw(C55688xof.Application.ensureClassLoader) + " (" + str3 + ")");
            }
            values().AhwBna.setInputHint(str3);
            return;
        }
        C55312xha c55312xhaValueOf2 = values().fJNWhG.valueOf();
        if (c55312xhaValueOf2 == null || (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.ensureClassLoader));
    }

    private final void djBIcL(java.lang.String str) {
        if (C33129mqd.valueOf(str, 0)) {
            Group group = values().copydefault;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(8);
            fIwbmz();
            return;
        }
        android.widget.TextView textView = values().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(0);
        android.widget.TextView textView2 = values().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(0);
        android.widget.TextView textView3 = values().OLrzqt;
        xMR xmr = xMR.copydefault;
        textView3.setText(xmr.AhwBna(str == null ? "" : str, OLrzqt().AEQbTJ()) + " " + OLrzqt().djBIcL());
        OKReminder oKReminder = values().fARcdN;
        Intrinsics.copydefault(oKReminder);
        oKReminder.setVisibility(0);
        oKReminder.setCloseIconVisibility(false);
        oKReminder.setStyle(2);
        int i = C55688xof.Application.RatingCompat1;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, xmr.AhwBna(str != null ? str : "", OLrzqt().AEQbTJ()));
        pairArr[1] = C56390yDp.OLrzqt("ccy", OLrzqt().djBIcL());
        oKReminder.setMessage(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
        AhwBna(str);
        fIwbmz();
    }

    private final void AhwBna(java.lang.String str) {
        if (C33129mqd.AEQbTJ(str, fJNWhG().AhwBna().getValue())) {
            OcIXYQ();
            android.widget.TextView textView = values().AYXKKw;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            values().AYXKKw.setText(C33070mpX.AYXKKw(C55688xof.Application.getStarRating));
            return;
        }
        C53605woe c53605woe = values().fIwbmz;
        Intrinsics.checkNotNullExpressionValue(c53605woe, "");
        c53605woe.setVisibility(8);
        android.widget.TextView textView2 = values().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
    }

    private final void wlaJM() {
        AppCompatTextView appCompatTextView = values().DbNXlk;
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        java.lang.String instType = tacticsDataAYXKKw != null ? tacticsDataAYXKKw.getInstType() : null;
        java.lang.String str = instType == null ? "" : instType;
        TacticsData tacticsDataAYXKKw2 = OLrzqt().AYXKKw();
        java.lang.String instId = tacticsDataAYXKKw2 != null ? tacticsDataAYXKKw2.getInstId() : null;
        appCompatTextView.setText(C56033xvF.getCoinTitle$default(str, instId == null ? "" : instId, false, null, null, 28, null));
        values().AkhnZx.setText(C33069mpW.copydefault(this, C55688xof.Application.getStateWithUpdatedPosition, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", OLrzqt().djBIcL()))));
        values().isConnected.setMaxDecimal(OLrzqt().OLrzqt());
        values().fetchVPNInfo.setMaxDecimal(OLrzqt().OLrzqt());
    }

    private final void getNewProxyInstance() {
        values().isConnected.setOnTextChangeCallback(copydefault());
        values().fetchVPNInfo.setOnTextChangeCallback(copydefault());
        values().AhwBna.setOnTextChangeCallback(copydefault());
    }

    private final void hDKMBd() {
        values().fIwbmz.setTransferCoin(OLrzqt().djBIcL());
        values().fIwbmz.setTransferClickCallback(new Function0() { // from class: o.vGX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vGL.copydefault(this.OLrzqt);
            }
        });
    }

    public static final Unit copydefault(vGL vgl) {
        vgl.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    private final boolean zuBGHE() {
        return (values().isConnected.getFieldNames() || values().fetchVPNInfo.getFieldNames()) ? false : true;
    }

    private final boolean AwvSrB() {
        java.lang.String strAkhnZx = values().fetchVPNInfo.AkhnZx();
        if (strAkhnZx.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            return false;
        }
        java.lang.String strAkhnZx2 = values().isConnected.AkhnZx();
        if (strAkhnZx2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx2)) {
            return false;
        }
        return C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.AEQbTJ(strAkhnZx)), java.lang.Double.valueOf(C33129mqd.AEQbTJ(strAkhnZx2)));
    }

    private final boolean sSMYrx() {
        return values().isConnected.AkhnZx().length() > 0;
    }

    private final boolean gHZMYf() {
        return values().fetchVPNInfo.AkhnZx().length() > 0;
    }

    private final java.lang.String zLjUOn() {
        java.lang.String maxGridNum;
        java.lang.String strAkhnZx = values().AhwBna.AkhnZx();
        StrategyConfigInfo strategyConfigInfoDjBIcL = isConnected().djBIcL();
        java.lang.String maxGridNum2 = null;
        java.lang.String minGridNum = strategyConfigInfoDjBIcL != null ? strategyConfigInfoDjBIcL.getMinGridNum() : null;
        GridNumRangeBean value = isConnected().hDKMBd().getValue();
        if (value == null || (maxGridNum = value.getMaxGridNum()) == null) {
            StrategyConfigInfo strategyConfigInfoDjBIcL2 = isConnected().djBIcL();
            if (strategyConfigInfoDjBIcL2 != null) {
                maxGridNum2 = strategyConfigInfoDjBIcL2.getMaxGridNum();
            }
        } else {
            maxGridNum2 = maxGridNum;
        }
        if (minGridNum == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) minGridNum) || maxGridNum2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxGridNum2)) {
            return "";
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            return C33070mpX.AYXKKw(C55688xof.Application.otherwise);
        }
        return C33129mqd.gEmmrt(strAkhnZx, minGridNum) ? C33069mpW.copydefault(this, C55688xof.Application.onDrawerSlide, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, minGridNum))) : C33129mqd.AEQbTJ(strAkhnZx, maxGridNum2) ? C33069mpW.copydefault(this, C55688xof.Application.ActionBarLayoutParams, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, maxGridNum2))) : "";
    }

    private final void OLrzqt(java.lang.String str) {
        android.widget.TextView textView = values().EZpvd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ^ true ? 0 : 8);
        values().EZpvd.setText(str);
    }

    private final void QKVWgx() {
        java.lang.String instId;
        SpotGridPresenter spotGridPresenterIsConnected = isConnected();
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        if (tacticsDataAYXKKw == null || (instId = tacticsDataAYXKKw.getInstId()) == null) {
            instId = "";
        }
        SpotGridPresenter.getGridProfitRate$default(spotGridPresenterIsConnected, 0L, instId, 1, null);
    }

    private final void uzCIH() {
        values().AhwBna.setMaxDecimal(0);
        C55258xgZ c55258xgZ = values().gEmmrt;
        c55258xgZ.setOnClickListener(new TaskDescription(c55258xgZ, 1000L, this));
    }

    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void DTwDnp() {
        BizInstrument bizInstrumentValueOf;
        java.lang.String instType;
        java.lang.String instId;
        fJNWhG().AYXKKw();
        C55915xsu c55915xsuFJNWhG = fJNWhG();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null) {
            TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
            java.lang.String str = "";
            if (tacticsDataAYXKKw == null || (instType = tacticsDataAYXKKw.getInstType()) == null) {
                instType = "";
            }
            AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
            if (abstractC54531xLwOLrzqt != null) {
                TacticsData tacticsDataAYXKKw2 = OLrzqt().AYXKKw();
                if (tacticsDataAYXKKw2 != null && (instId = tacticsDataAYXKKw2.getInstId()) != null) {
                    str = instId;
                }
                bizInstrumentValueOf = abstractC54531xLwOLrzqt.valueOf(str);
            } else {
                bizInstrumentValueOf = null;
            }
        }
        c55915xsuFJNWhG.EZpvd("grid", (64 & 2) != 0 ? "cash" : null, (64 & 4) != 0 ? "" : null, (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : bizInstrumentValueOf, (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? null : null);
    }

    private final void OcIXYQ() {
        java.lang.String instType;
        java.lang.String instId;
        C55915xsu c55915xsuFJNWhG = fJNWhG();
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        java.lang.String str = "";
        if (tacticsDataAYXKKw == null || (instType = tacticsDataAYXKKw.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsDataAYXKKw2 = OLrzqt().AYXKKw();
        if (tacticsDataAYXKKw2 != null && (instId = tacticsDataAYXKKw2.getInstId()) != null) {
            str = instId;
        }
        java.lang.String strOLrzqt = c55915xsuFJNWhG.OLrzqt(instType, str);
        if (strOLrzqt != null) {
            gEmmrt(strOLrzqt);
        }
    }

    private final void gEmmrt(java.lang.String str) {
        C53605woe c53605woe = values().fIwbmz;
        Intrinsics.checkNotNullExpressionValue(c53605woe, "");
        if (c53605woe.getVisibility() != 0) {
            values().fIwbmz.setVisibility(0);
        }
        values().fIwbmz.setFooterAvaValue(str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        fJNWhG().AYXKKw();
    }

    public final java.lang.String copydefault(java.lang.String str) {
        java.lang.String tradeQuoteCcy;
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) (tacticsDataAYXKKw != null ? tacticsDataAYXKKw.getTradeQuoteCcy() : null))) {
            TacticsData tacticsDataAYXKKw2 = OLrzqt().AYXKKw();
            if (tacticsDataAYXKKw2 != null && (tradeQuoteCcy = tacticsDataAYXKKw2.getTradeQuoteCcy()) != null) {
                return tradeQuoteCcy;
            }
        } else if (str != null) {
            return str;
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AuCTel() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C33054mpH.OLrzqt(activity, getView());
        }
        dismissAllowingStateLoss();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C55688xof.Application.fhwtiV));
        wxq.setDividerVisibility(false);
        wxq.setCloseVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
        wxq.AEQbTJ().setVisibility(8);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.AEQbTJ = wyf;
        wyf.setType(14);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C55688xof.Application.onConfigurationChanged));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(false);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new StateListAnimator(c52794wYpCopydefault2, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new Fragment(c52794wYpAEQbTJ2, 1000L, this));
        }
    }

    private final boolean AubY() {
        return iwGUEr() && sSMYrx() && gHZMYf() && AwvSrB() && zuBGHE() && !(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) zLjUOn()) ^ true) && !(values().KWHzl.getVisibility() == 0 && C33129mqd.OLrzqt(values().KWHzl.getText()));
    }

    private final boolean iwGUEr() {
        AbstractC48507uTz abstractC48507uTzValues = values();
        java.lang.String strAkhnZx = abstractC48507uTzValues.isConnected.AkhnZx();
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        if (Intrinsics.EZpvd((java.lang.Object) strAkhnZx, (java.lang.Object) (tacticsDataAYXKKw != null ? tacticsDataAYXKKw.getMinPx() : null))) {
            java.lang.String strAkhnZx2 = abstractC48507uTzValues.fetchVPNInfo.AkhnZx();
            TacticsData tacticsDataAYXKKw2 = OLrzqt().AYXKKw();
            if (Intrinsics.EZpvd((java.lang.Object) strAkhnZx2, (java.lang.Object) (tacticsDataAYXKKw2 != null ? tacticsDataAYXKKw2.getMaxPx() : null))) {
                java.lang.String strAkhnZx3 = abstractC48507uTzValues.AhwBna.AkhnZx();
                TacticsData tacticsDataAYXKKw3 = OLrzqt().AYXKKw();
                if (Intrinsics.EZpvd((java.lang.Object) strAkhnZx3, (java.lang.Object) (tacticsDataAYXKKw3 != null ? tacticsDataAYXKKw3.getGridNum() : null))) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean zsXlph() {
        if (!AubY()) {
            return false;
        }
        android.widget.TextView textView = values().AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return (textView.getVisibility() == 0 && C33129mqd.OLrzqt(values().AYXKKw.getText())) ? false : true;
    }

    private final void fIwbmz() {
        wYF wyf = this.AEQbTJ;
        if (wyf == null) {
            Intrinsics.gEmmrt("");
            wyf = null;
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(zsXlph());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ejfBZ() {
        TacticsData tacticsDataAYXKKw;
        if (!zsXlph() || (tacticsDataAYXKKw = OLrzqt().AYXKKw()) == null) {
            return;
        }
        if (AEQbTJ(tacticsDataAYXKKw.getTpTriggerPx())) {
            C33129mqd.valueOf(tacticsDataAYXKKw.getTpTriggerPx(), values().fetchVPNInfo.AkhnZx());
        }
        if (AEQbTJ(tacticsDataAYXKKw.getSlTriggerPx())) {
            C33129mqd.copydefault(tacticsDataAYXKKw.getSlTriggerPx(), values().isConnected.AkhnZx());
        }
        TrailingConfig trailingUpConfig = tacticsDataAYXKKw.getTrailingUpConfig();
        boolean z = false;
        boolean z2 = trailingUpConfig != null && trailingUpConfig.getEnabled();
        TrailingConfig trailingDownConfig = tacticsDataAYXKKw.getTrailingDownConfig();
        boolean z3 = trailingDownConfig != null && trailingDownConfig.getEnabled();
        SmartEarnParam simpleEarn = tacticsDataAYXKKw.getSimpleEarn();
        if (simpleEarn != null && simpleEarn.getEnabled()) {
            z = true;
        }
        if (z2 || z3) {
            KWHzl(C33070mpX.AYXKKw(C55688xof.Application.size));
        } else if (z) {
            KWHzl(C33070mpX.AYXKKw(C48033uCm.Fragment.apHBvG));
        } else {
            AxsJAY();
        }
    }

    public final boolean AEQbTJ(java.lang.String str) {
        return C33129mqd.OLrzqt((java.lang.CharSequence) str) && !Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "--");
    }

    public final void KWHzl(java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.putBitmap));
        viewOnClickListenerC54939xaY.EZpvd(str);
        viewOnClickListenerC54939xaY.EZpvd(C48033uCm.Fragment.hrNTAI, new View.OnClickListener() { // from class: o.vGO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                vGL.EZpvd(this.copydefault, viewOnClickListenerC54939xaY, view);
            }
        });
        ViewOnClickListenerC54939xaY.setSecondaryButton$default(viewOnClickListenerC54939xaY, C55688xof.Application.onConfigurationChanged, (View.OnClickListener) null, 2, (java.lang.Object) null);
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(vGL vgl, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        vgl.AxsJAY();
        viewOnClickListenerC54939xaY.dismiss();
    }

    private final void AxsJAY() {
        vGL vgl;
        java.lang.String profitCcy;
        java.lang.String requiredTopUpAmount;
        androidx.fragment.app.FragmentManager supportFragmentManager;
        GridProfitRateResp value = isConnected().zsXlph().getValue();
        if (value != null) {
            profitCcy = value.getProfitCcy();
            vgl = this;
        } else {
            vgl = this;
            profitCcy = null;
        }
        java.lang.String strCopydefault = vgl.copydefault(profitCcy);
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        java.lang.String algoId = tacticsDataAYXKKw != null ? tacticsDataAYXKKw.getAlgoId() : null;
        java.lang.String strAkhnZx = values().isConnected.AkhnZx();
        java.lang.String strAkhnZx2 = values().fetchVPNInfo.AkhnZx();
        java.lang.String strAkhnZx3 = values().AhwBna.AkhnZx();
        MinTopUpResp value2 = OLrzqt().copydefault().getValue();
        if (value2 == null || (requiredTopUpAmount = value2.getRequiredTopUpAmount()) == null) {
            requiredTopUpAmount = "";
        }
        SpotGridEditParamReq spotGridEditParamReq = new SpotGridEditParamReq(algoId, strAkhnZx, strAkhnZx2, strAkhnZx3, requiredTopUpAmount, value != null ? value.getPerMinProfitRate() : null, value != null ? value.getPerMaxProfitRate() : null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, FaceDetector.NUM_BOXES, (DefaultConstructorMarker) null);
        GridProfitAmtDisplay gridProfitAmtDisplay = new GridProfitAmtDisplay(isConnected().AubY(), isConnected().AuCTelauCTel(), value != null ? value.getPerMinProfitAmt() : null, value != null ? value.getPerMaxProfitAmt() : null, strCopydefault);
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            vGG.Companion.EZpvd(OLrzqt().AYXKKw(), spotGridEditParamReq, gridProfitAmtDisplay).show(supportFragmentManager);
        }
        dismissAllowingStateLoss();
    }
}
