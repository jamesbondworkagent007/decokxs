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
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.AdvancedTriggerSign;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.GridNumRangeBean;
import com.okinc.unify_trade.biz.GridProfitRateResp;
import com.okinc.unify_trade.biz.LiquidatePriceResponse;
import com.okinc.unify_trade.biz.MinTopUpResp;
import com.okinc.unify_trade.biz.SignParamItem;
import com.okinc.unify_trade.biz.SpotGridEditParamReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.SwapInstrument;
import com.okinc.unify_trade.bot.contract_grid.viewModel.BotContractGridEditParamPresenter;
import com.okinc.unify_trade.bot.contract_grid.viewModel.ContractManuallyPresenter;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C50213vGb;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vGn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C50225vGn extends AbstractC49945uyC<AbstractC48500uTs, BotContractGridEditParamPresenter> {
    public wYF AYXKKw;
    public boolean AhwBna;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final Function2<C47988uAv, java.lang.String, Unit> copydefault;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.vGn$Dialog */
    public static final /* synthetic */ class Dialog implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(Function1 function1) {
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
        return C48033uCm.Activity.hlXVux;
    }

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    public C50225vGn() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotContractGridEditParamDialog$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotContractGridEditParamDialog$special$$inlined$viewModels$default$2
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotContractGridEditParamDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotContractGridEditParamDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotContractGridEditParamDialog$special$$inlined$viewModels$default$5
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotContractGridEditParamDialog$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotContractGridEditParamDialog$special$$inlined$viewModels$default$7
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ContractManuallyPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotContractGridEditParamDialog$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotContractGridEditParamDialog$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.contractgrid.dialog.BotContractGridEditParamDialog$special$$inlined$viewModels$default$10
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
        this.AhwBna = true;
        this.copydefault = new Function2() { // from class: o.vGu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C50225vGn.OLrzqt(this.KWHzl, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
    }

    private final C55915xsu AubY() {
        return (C55915xsu) this.KWHzl.getValue();
    }

    public final ContractManuallyPresenter AuCTel() {
        return (ContractManuallyPresenter) this.OLrzqt.getValue();
    }

    /* JADX INFO: renamed from: o.vGn$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vGn.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C50225vGn copydefault(@NotNull android.os.Parcelable parcelable) {
            Intrinsics.checkNotNullParameter(parcelable, "");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("bot_grid_req", parcelable);
            C50225vGn c50225vGn = new C50225vGn();
            c50225vGn.setArguments(bundle);
            return c50225vGn;
        }
    }

    public static final Unit OLrzqt(C50225vGn c50225vGn, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        AbstractC48500uTs abstractC48500uTsValues = c50225vGn.values();
        if (Intrinsics.EZpvd(c47988uAv, abstractC48500uTsValues.isConnected) || Intrinsics.EZpvd(c47988uAv, abstractC48500uTsValues.values)) {
            TacticsData tacticsDataAYXKKw = c50225vGn.OLrzqt().AYXKKw();
            if (tacticsDataAYXKKw != null && Intrinsics.EZpvd((java.lang.Object) tacticsDataAYXKKw.getOrderType(), (java.lang.Object) "contract_grid")) {
                ContractGridReq contractGridReqUzCIH = c50225vGn.AuCTel().uzCIH();
                contractGridReqUzCIH.setMinPx(C56033xvF.AEQbTJ(abstractC48500uTsValues.isConnected.AkhnZx(), tacticsDataAYXKKw.getInstType(), tacticsDataAYXKKw.getInstId()));
                contractGridReqUzCIH.setMaxPx(C56033xvF.AEQbTJ(abstractC48500uTsValues.values.AkhnZx(), tacticsDataAYXKKw.getInstType(), tacticsDataAYXKKw.getInstId()));
            }
            if (c47988uAv.hasFocus()) {
                xVK xvk = xVK.EZpvd;
                java.lang.String strAkhnZx = c47988uAv.AkhnZx();
                TacticsData tacticsDataAYXKKw2 = c50225vGn.OLrzqt().AYXKKw();
                java.lang.String instId = tacticsDataAYXKKw2 != null ? tacticsDataAYXKKw2.getInstId() : null;
                TacticsData tacticsDataAYXKKw3 = c50225vGn.OLrzqt().AYXKKw();
                c47988uAv.setInputErrorMsg(xvk.EZpvd(strAkhnZx, instId, tacticsDataAYXKKw3 != null ? tacticsDataAYXKKw3.getInstType() : null));
            }
            if (c47988uAv.getFieldNames()) {
                c50225vGn.KWHzl("");
                c50225vGn.copydefault();
            } else if (!c50225vGn.iwGUEr() || !c50225vGn.getNewProxyInstance()) {
                c50225vGn.values().isConnected.copydefault();
                c50225vGn.values().values.copydefault();
                c50225vGn.KWHzl("");
                c50225vGn.copydefault();
            } else if (!c50225vGn.uzCIH()) {
                C47988uAv.setInputErrorMsg$default(c50225vGn.values().isConnected, null, 1, null);
                C47988uAv.setInputErrorMsg$default(c50225vGn.values().values, null, 1, null);
                java.lang.String string = c50225vGn.getString(C55688xof.Application.setLogo);
                Intrinsics.checkNotNullExpressionValue(string, "");
                c50225vGn.KWHzl(string);
                c50225vGn.copydefault();
            } else {
                c50225vGn.values().isConnected.copydefault();
                c50225vGn.values().values.copydefault();
                c50225vGn.KWHzl("");
                c50225vGn.wlaJM();
                TacticsData tacticsDataAYXKKw4 = c50225vGn.OLrzqt().AYXKKw();
                if (tacticsDataAYXKKw4 != null && Intrinsics.EZpvd((java.lang.Object) tacticsDataAYXKKw4.getOrderType(), (java.lang.Object) "contract_grid")) {
                    c50225vGn.AuCTel().ejfBZ();
                }
            }
        } else if (Intrinsics.EZpvd(c47988uAv, abstractC48500uTsValues.AhwBna)) {
            TacticsData tacticsDataAYXKKw5 = c50225vGn.OLrzqt().AYXKKw();
            if (tacticsDataAYXKKw5 != null && Intrinsics.EZpvd((java.lang.Object) tacticsDataAYXKKw5.getOrderType(), (java.lang.Object) "contract_grid")) {
                c50225vGn.AuCTel().uzCIH().setGridNum(abstractC48500uTsValues.AhwBna.AkhnZx());
            }
            java.lang.String strDTwDnp = c50225vGn.DTwDnp();
            if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDTwDnp)) {
                c50225vGn.values().AhwBna.setInputErrorMsg(strDTwDnp);
            } else {
                c50225vGn.values().AhwBna.copydefault();
            }
            c50225vGn.copydefault();
            c50225vGn.wlaJM();
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        zuBGHE();
        gHZMYf();
        AxsJAY();
        OcIXYQ();
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        if (tacticsDataAYXKKw == null || !Intrinsics.EZpvd((java.lang.Object) tacticsDataAYXKKw.getOrderType(), (java.lang.Object) "contract_grid")) {
            return;
        }
        AuCTel().fIwbmz();
    }

    /* JADX INFO: renamed from: o.vGn$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C50225vGn KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C50225vGn c50225vGn) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c50225vGn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.KWHzl.AuCTelauCTel();
            }
        }
    }

    /* JADX INFO: renamed from: o.vGn$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C50225vGn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C50225vGn c50225vGn) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.copydefault = c50225vGn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.copydefault.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.EZpvd(this.copydefault.getString(C55688xof.Application.setSessionActivity));
                java.lang.String string = this.copydefault.getString(C55688xof.Application.onCreate);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new StateListAnimator(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX INFO: renamed from: o.vGn$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C50225vGn OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C50225vGn c50225vGn) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.OLrzqt = c50225vGn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.zLjUOn();
            }
        }
    }

    /* JADX INFO: renamed from: o.vGn$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C50225vGn OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, C50225vGn c50225vGn) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c50225vGn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }

    private final void zuBGHE() {
        java.util.ArrayList arrayList;
        java.lang.String strDbNXlk;
        java.lang.String strReplace$default;
        this.AhwBna = true;
        BotContractGridEditParamPresenter botContractGridEditParamPresenterOLrzqt = OLrzqt();
        android.os.Bundle arguments = getArguments();
        TacticsData tacticsData = arguments != null ? (TacticsData) arguments.getParcelable("bot_grid_req") : null;
        if (!(tacticsData instanceof TacticsData)) {
            tacticsData = null;
        }
        botContractGridEditParamPresenterOLrzqt.EZpvd(tacticsData);
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        if (tacticsDataAYXKKw == null || !Intrinsics.EZpvd((java.lang.Object) tacticsDataAYXKKw.getOrderType(), (java.lang.Object) "contract_grid")) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("bot_inst_id", tacticsDataAYXKKw.getInstId());
        bundle.putString("bot_inst_type", tacticsDataAYXKKw.getInstType());
        AuCTel().EZpvd(bundle);
        ContractGridReq contractGridReqUzCIH = AuCTel().uzCIH();
        contractGridReqUzCIH.setInstId(tacticsDataAYXKKw.getInstId());
        contractGridReqUzCIH.setInstType(tacticsDataAYXKKw.getInstType());
        contractGridReqUzCIH.setBasePos(java.lang.Boolean.valueOf(tacticsDataAYXKKw.getBasePos()));
        contractGridReqUzCIH.setGridNum(tacticsDataAYXKKw.getGridNum());
        contractGridReqUzCIH.setMaxPx(tacticsDataAYXKKw.getMaxPx());
        contractGridReqUzCIH.setMinPx(tacticsDataAYXKKw.getMinPx());
        java.lang.String sz = tacticsDataAYXKKw.getSz();
        java.lang.String str = "";
        if (sz == null) {
            sz = "";
        }
        contractGridReqUzCIH.setSz(sz);
        contractGridReqUzCIH.setRunType(tacticsDataAYXKKw.getRunType());
        contractGridReqUzCIH.setSlTriggerPx(tacticsDataAYXKKw.getSlTriggerPx());
        contractGridReqUzCIH.setTpTriggerPx(tacticsDataAYXKKw.getTpTriggerPx());
        contractGridReqUzCIH.setTpRatio(tacticsDataAYXKKw.getTpRatio());
        contractGridReqUzCIH.setSlRatio(tacticsDataAYXKKw.getSlRatio());
        contractGridReqUzCIH.setTpOrdPx(tacticsDataAYXKKw.getTpPx());
        contractGridReqUzCIH.setSlOrdPx(tacticsDataAYXKKw.getSlPx());
        contractGridReqUzCIH.setDirection(tacticsDataAYXKKw.getDirection());
        java.lang.String level = tacticsDataAYXKKw.getLevel();
        java.lang.String str2 = java.lang.Boolean.valueOf(level.length() > 1).booleanValue() ? level : null;
        if (str2 != null && (strDbNXlk = C59454zhO.DbNXlk(str2, 1)) != null && (strReplace$default = C59449zhJ.replace$default(strDbNXlk, ",", JwtUtilsKt.JWT_DELIMITER, false, 4, (java.lang.Object) null)) != null) {
            str = strReplace$default;
        }
        contractGridReqUzCIH.setLever(str);
        contractGridReqUzCIH.setOrdType(tacticsDataAYXKKw.getOrderType());
        contractGridReqUzCIH.setAlgoId(tacticsDataAYXKKw.getAlgoId());
        java.util.List<SignParamItem> signParams = tacticsDataAYXKKw.getSignParams();
        if (signParams == null) {
            arrayList = new java.util.ArrayList();
        } else {
            arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(signParams, 10));
            for (SignParamItem signParamItem : signParams) {
                arrayList.add(new AdvancedTriggerSign(signParamItem.getTriggerAction(), signParamItem.getIndicator(), (java.lang.String) null, signParamItem.getTriggerPx(), signParamItem.getDelaySeconds(), signParamItem.getTimePeriod(), signParamItem.getTimeframe(), signParamItem.getTriggerCond(), (java.lang.String) null, signParamItem.getThold(), signParamItem.getStopType(), (java.lang.String) null, 2308, (DefaultConstructorMarker) null));
            }
        }
        contractGridReqUzCIH.setSignParams(new java.util.ArrayList<>(arrayList));
        contractGridReqUzCIH.setTopupActualMarginSz(tacticsDataAYXKKw.getTopupActualMarginSz());
    }

    private final void AxsJAY() {
        AwvSrB();
        zsXlph();
        EZpvd(true, true);
        QOLQEE();
        sSMYrx();
        isConnected();
    }

    /* JADX DEBUG: Possible override for method o.uyC.isConnected()Lcom/okinc/unify_trade/refactor/presenter/AbsPresenter; */
    public final void isConnected() {
        java.lang.String longLiqPx;
        java.lang.String longLiqPx2;
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        if (tacticsDataAYXKKw != null) {
            C47988uAv.setInputContent$default(values().isConnected, C56033xvF.copydefault(tacticsDataAYXKKw.getMinPx(), tacticsDataAYXKKw.getInstType(), tacticsDataAYXKKw.getInstId()), false, false, 6, null);
            C47988uAv.setInputContent$default(values().values, C56033xvF.copydefault(tacticsDataAYXKKw.getMaxPx(), tacticsDataAYXKKw.getInstType(), tacticsDataAYXKKw.getInstId()), false, false, 6, null);
            C47988uAv.setInputContent$default(values().AhwBna, tacticsDataAYXKKw.getGridNum(), false, false, 6, null);
            if (Intrinsics.EZpvd((java.lang.Object) tacticsDataAYXKKw.getOrderType(), (java.lang.Object) "contract_grid")) {
                ContractGridReq contractGridReqUzCIH = AuCTel().uzCIH();
                TacticsData tacticsDataAYXKKw2 = OLrzqt().AYXKKw();
                contractGridReqUzCIH.setRunType(tacticsDataAYXKKw2 != null ? tacticsDataAYXKKw2.getRunType() : null);
                vKO vko = values().AkhnZx;
                TacticsData tacticsDataAYXKKw3 = OLrzqt().AYXKKw();
                java.lang.String str = "--";
                if (tacticsDataAYXKKw3 == null || (longLiqPx = tacticsDataAYXKKw3.getLongLiqPx()) == null) {
                    longLiqPx = "--";
                }
                vko.setValue(longLiqPx);
                vKO vko2 = values().iwGUEr;
                TacticsData tacticsDataAYXKKw4 = OLrzqt().AYXKKw();
                if (tacticsDataAYXKKw4 != null && (longLiqPx2 = tacticsDataAYXKKw4.getLongLiqPx()) != null) {
                    str = longLiqPx2;
                }
                vko2.setValue(str);
            }
        }
    }

    private final void OcIXYQ() {
        TradeLiveData<java.lang.String> tradeLiveDataAhwBna = OLrzqt().AhwBna();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAhwBna.observe(viewLifecycleOwner, new Dialog(new Function1() { // from class: o.vGo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50225vGn.KWHzl(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        final MediatorLiveData mediatorLiveData = new MediatorLiveData();
        mediatorLiveData.addSource(OLrzqt().EZpvd(), new Dialog(new Function1() { // from class: o.vGD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50225vGn.copydefault(this.copydefault, mediatorLiveData, (MinTopUpResp) obj);
            }
        }));
        mediatorLiveData.addSource(AubY().AhwBna(), new Dialog(new Function1() { // from class: o.vGA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50225vGn.AEQbTJ(this.EZpvd, mediatorLiveData, (java.lang.String) obj);
            }
        }));
        mediatorLiveData.observe(getViewLifecycleOwner(), new Dialog(new Function1() { // from class: o.vGz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50225vGn.OLrzqt(this.EZpvd, (Unit) obj);
            }
        }));
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        if (tacticsDataAYXKKw != null && Intrinsics.EZpvd((java.lang.Object) tacticsDataAYXKKw.getOrderType(), (java.lang.Object) "contract_grid")) {
            C56111xwe<GridProfitRateResp> c56111xweFJNWhG = AuCTel().fJNWhG();
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
            c56111xweFJNWhG.observe(viewLifecycleOwner2, new Dialog(new Function1() { // from class: o.vGB
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50225vGn.KWHzl(this.KWHzl, (GridProfitRateResp) obj);
                }
            }));
            AuCTel().AkhnZx().AkhnZx().observe(getViewLifecycleOwner(), new Dialog(new Function1() { // from class: o.vGE
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50225vGn.AEQbTJ(this.EZpvd, (java.lang.Boolean) obj);
                }
            }));
            TradeLiveData<GridNumRangeBean> tradeLiveDataFARcdN = AuCTel().fARcdN();
            LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
            tradeLiveDataFARcdN.observe(viewLifecycleOwner3, new Dialog(new Function1() { // from class: o.vGm
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50225vGn.OLrzqt(this.AEQbTJ, (GridNumRangeBean) obj);
                }
            }));
            C56111xwe<LiquidatePriceResponse> fieldNames = AuCTel().getFieldNames();
            LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
            fieldNames.observe(viewLifecycleOwner4, new Dialog(new Function1() { // from class: o.vGs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50225vGn.copydefault(this.AEQbTJ, (LiquidatePriceResponse) obj);
                }
            }));
            TradeLiveData<StrategyConfigInfo> tradeLiveDataCopydefault = AuCTel().copydefault();
            LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
            tradeLiveDataCopydefault.observe(viewLifecycleOwner5, new Dialog(new Function1() { // from class: o.vGt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50225vGn.AEQbTJ(this.copydefault, (StrategyConfigInfo) obj);
                }
            }));
            C56109xwc<java.lang.Exception> c56109xwcAhwBna = AuCTel().DbNXlk().AhwBna();
            LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
            c56109xwcAhwBna.observe(viewLifecycleOwner6, new Dialog(new Function1() { // from class: o.vGp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50225vGn.AEQbTJ(this.OLrzqt, (java.lang.Exception) obj);
                }
            }));
            C56109xwc<java.lang.Exception> c56109xwcAhwBna2 = AuCTel().AuCTel().AhwBna();
            LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
            c56109xwcAhwBna2.observe(viewLifecycleOwner7, new Dialog(new Function1() { // from class: o.vGv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50225vGn.djBIcL(this.EZpvd, (java.lang.Exception) obj);
                }
            }));
            C56109xwc<java.lang.Exception> c56109xwcAhwBna3 = AuCTel().values().AhwBna();
            LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
            c56109xwcAhwBna3.observe(viewLifecycleOwner8, new Dialog(new Function1() { // from class: o.vGw
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C50225vGn.valueOf(this.copydefault, (java.lang.Exception) obj);
                }
            }));
        }
        C56109xwc<java.lang.Exception> c56109xwcAhwBna4 = OLrzqt().KWHzl().AhwBna();
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        c56109xwcAhwBna4.observe(viewLifecycleOwner9, new Dialog(new Function1() { // from class: o.vGC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C50225vGn.AYXKKw(this.AEQbTJ, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit KWHzl(C50225vGn c50225vGn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c50225vGn.values().fIwbmz.setText(str);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C50225vGn c50225vGn, MediatorLiveData mediatorLiveData, MinTopUpResp minTopUpResp) {
        java.lang.String value = c50225vGn.AubY().AhwBna().getValue();
        if (value == null || value.length() == 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        mediatorLiveData.setValue(unit);
        return unit;
    }

    public static final Unit AEQbTJ(C50225vGn c50225vGn, MediatorLiveData mediatorLiveData, java.lang.String str) {
        if (c50225vGn.OLrzqt().EZpvd().getValue() == null) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        mediatorLiveData.setValue(unit);
        return unit;
    }

    public static final Unit OLrzqt(C50225vGn c50225vGn, Unit unit) {
        MinTopUpResp value = c50225vGn.OLrzqt().EZpvd().getValue();
        c50225vGn.AEQbTJ(value != null ? value.getRequiredTopUpAmount() : null);
        ContractGridReq contractGridReqUzCIH = c50225vGn.AuCTel().uzCIH();
        MinTopUpResp value2 = c50225vGn.OLrzqt().EZpvd().getValue();
        contractGridReqUzCIH.setTopupActualMarginSz(value2 != null ? value2.getRequiredTopUpAmount() : null);
        c50225vGn.ORxRYg();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C50225vGn c50225vGn, GridProfitRateResp gridProfitRateResp) {
        java.lang.String minGridNum;
        java.lang.String strCopydefault;
        if (gridProfitRateResp == null) {
            c50225vGn.values().AYXKKw.setText("--");
            c50225vGn.values().gEmmrt.setVisibility(8);
            c50225vGn.copydefault();
            return Unit.INSTANCE;
        }
        if (C33129mqd.valueOf(gridProfitRateResp.getPerMinProfitRate(), 0)) {
            if (C33129mqd.gEmmrt(gridProfitRateResp.getMaxGirdNum(), 2)) {
                c50225vGn.values().gEmmrt.setText(C33070mpX.AYXKKw(C55688xof.Application.fromRating));
            } else {
                StrategyConfigInfo value = c50225vGn.AuCTel().copydefault().getValue();
                if (Intrinsics.EZpvd((java.lang.Object) (value != null ? value.getMinGridNum() : null), (java.lang.Object) gridProfitRateResp.getMaxGirdNum())) {
                    strCopydefault = xMR.copydefault.copydefault(gridProfitRateResp.getMaxGirdNum());
                } else {
                    xMR xmr = xMR.copydefault;
                    StrategyConfigInfo value2 = c50225vGn.AuCTel().copydefault().getValue();
                    if (value2 == null || (minGridNum = value2.getMinGridNum()) == null) {
                        minGridNum = "";
                    }
                    strCopydefault = xmr.copydefault(minGridNum) + "-" + xmr.copydefault(gridProfitRateResp.getMaxGirdNum());
                }
                c50225vGn.values().gEmmrt.setText(C33069mpW.copydefault(c50225vGn, C55688xof.Application.newHeartRating, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("range", strCopydefault))));
            }
            c50225vGn.values().gEmmrt.setVisibility(0);
            C47988uAv.setInputErrorMsg$default(c50225vGn.values().AhwBna, null, 1, null);
            c50225vGn.copydefault();
        } else {
            c50225vGn.values().gEmmrt.setVisibility(8);
            c50225vGn.values().AhwBna.copydefault();
            c50225vGn.copydefault();
            c50225vGn.OLrzqt().OLrzqt(c50225vGn.values().isConnected.AkhnZx(), c50225vGn.values().values.AkhnZx(), c50225vGn.values().AhwBna.AkhnZx());
        }
        c50225vGn.values().AYXKKw.setText(C55918xsx.Companion.copydefault(gridProfitRateResp.getPerMinProfitRate(), gridProfitRateResp.getPerMaxProfitRate()));
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C50225vGn c50225vGn, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c50225vGn.values().AYXKKw.setVisibility(8);
            c50225vGn.values().getNewProxyInstance.KWHzl(0L);
        } else {
            c50225vGn.values().AYXKKw.setVisibility(0);
            c50225vGn.values().getNewProxyInstance.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C50225vGn c50225vGn, GridNumRangeBean gridNumRangeBean) {
        java.lang.String maxGridNum;
        java.lang.String minGridNum;
        java.lang.String str = "0";
        if (gridNumRangeBean == null || (maxGridNum = gridNumRangeBean.getMaxGridNum()) == null) {
            StrategyConfigInfo value = c50225vGn.AuCTel().copydefault().getValue();
            maxGridNum = value != null ? value.getMaxGridNum() : "0";
        }
        StrategyConfigInfo value2 = c50225vGn.AuCTel().copydefault().getValue();
        if (value2 != null && (minGridNum = value2.getMinGridNum()) != null) {
            str = minGridNum;
        }
        c50225vGn.AEQbTJ(str, maxGridNum);
        java.lang.String strDTwDnp = c50225vGn.DTwDnp();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strDTwDnp)) {
            c50225vGn.values().AhwBna.setInputErrorMsg(strDTwDnp);
        } else {
            c50225vGn.values().AhwBna.copydefault();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C50225vGn c50225vGn, LiquidatePriceResponse liquidatePriceResponse) {
        Intrinsics.checkNotNullParameter(liquidatePriceResponse, "");
        if (c50225vGn.AhwBna && (liquidatePriceResponse.getLongLiqPx() != null || liquidatePriceResponse.getShortLiqPx() != null)) {
            TacticsData tacticsDataAYXKKw = c50225vGn.OLrzqt().AYXKKw();
            if (tacticsDataAYXKKw != null) {
                tacticsDataAYXKKw.setLongLiqPx(liquidatePriceResponse.getLongLiqPx());
            }
            TacticsData tacticsDataAYXKKw2 = c50225vGn.OLrzqt().AYXKKw();
            if (tacticsDataAYXKKw2 != null) {
                tacticsDataAYXKKw2.setShortLiqPx(liquidatePriceResponse.getShortLiqPx());
            }
            c50225vGn.AhwBna = false;
        }
        android.widget.TextView textView = c50225vGn.values().hDKMBd;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(c50225vGn.AuCTel().KWHzl(liquidatePriceResponse) ^ true ? 0 : 8);
        LiquidatePriceResponse liquidatePriceResponseEZpvd = c50225vGn.AuCTel().EZpvd(liquidatePriceResponse);
        vKO vko = c50225vGn.values().AkhnZx;
        java.lang.String longLiqPx = liquidatePriceResponseEZpvd.getLongLiqPx();
        if (longLiqPx == null) {
            longLiqPx = "--";
        }
        vko.setValue(longLiqPx);
        vKO vko2 = c50225vGn.values().iwGUEr;
        java.lang.String shortLiqPx = liquidatePriceResponseEZpvd.getShortLiqPx();
        vko2.setValue(shortLiqPx != null ? shortLiqPx : "--");
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C50225vGn c50225vGn, StrategyConfigInfo strategyConfigInfo) {
        java.lang.String maxGridNum;
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        java.lang.String minGridNum = strategyConfigInfo.getMinGridNum();
        GridNumRangeBean value = c50225vGn.AuCTel().fARcdN().getValue();
        if (value == null || (maxGridNum = value.getMaxGridNum()) == null) {
            maxGridNum = strategyConfigInfo.getMaxGridNum();
        }
        c50225vGn.AEQbTJ(minGridNum, maxGridNum);
        c50225vGn.wlaJM();
        c50225vGn.ORxRYg();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C50225vGn c50225vGn, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        pUU.copydefault("BotContractGridEditParamDialog", "Get GridProfit fail cause by :" + (message != null ? message : ""));
        c50225vGn.values().AYXKKw.setText("--");
        c50225vGn.values().gEmmrt.setVisibility(8);
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(C50225vGn c50225vGn, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        pUU.copydefault("BotContractGridEditParamDialog", "Get NumRange fail cause by :" + (message != null ? message : ""));
        c50225vGn.AuCTel().fARcdN().setValue(null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C50225vGn c50225vGn, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        pUU.copydefault("BotContractGridEditParamDialog", "Get liquidate price fail cause by :" + (message != null ? message : ""));
        c50225vGn.AuCTel().getFieldNames().postValue(new LiquidatePriceResponse((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 127, (DefaultConstructorMarker) null));
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C50225vGn c50225vGn, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c50225vGn.copydefault();
        java.lang.String message = exc.getMessage();
        pUU.copydefault("BotContractGridEditParamDialog", "Get min-topup fail cause by :" + (message != null ? message : ""));
        return Unit.INSTANCE;
    }

    private final void AEQbTJ(java.lang.String str, java.lang.String str2) {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        if (C33129mqd.valueOf(str, str2)) {
            xMR xmr = xMR.copydefault;
            java.lang.String str3 = xmr.copydefault(str) + " - " + xmr.copydefault(str2);
            C55312xha c55312xhaValueOf = values().ejfBZ.valueOf();
            if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
                c55320xhiKWHzl2.setText(C33070mpX.AYXKKw(C55688xof.Application.ensureClassLoader) + " (" + str3 + ")");
            }
            values().AhwBna.setInputHint(str3);
            return;
        }
        C55312xha c55312xhaValueOf2 = values().ejfBZ.valueOf();
        if (c55312xhaValueOf2 == null || (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.ensureClassLoader));
    }

    public final void AEQbTJ(java.lang.String str) {
        if (C33129mqd.valueOf(str, 0)) {
            Group group = values().EZpvd;
            Intrinsics.checkNotNullExpressionValue(group, "");
            group.setVisibility(8);
            android.widget.TextView textView = values().OLrzqt;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(8);
            android.widget.TextView textView2 = values().KWHzl;
            Intrinsics.checkNotNullExpressionValue(textView2, "");
            textView2.setVisibility(8);
            copydefault();
            return;
        }
        android.widget.LinearLayout linearLayout = values().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(0);
        android.widget.TextView textView3 = values().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView3, "");
        textView3.setVisibility(0);
        android.widget.TextView textView4 = values().KWHzl;
        Intrinsics.checkNotNullExpressionValue(textView4, "");
        textView4.setVisibility(0);
        android.widget.TextView textView5 = values().KWHzl;
        xMR xmr = xMR.copydefault;
        textView5.setText(xmr.AhwBna(str == null ? "" : str, OLrzqt().copydefault()) + " " + fIwbmz());
        OKReminder oKReminder = values().getFieldNames;
        Intrinsics.copydefault(oKReminder);
        oKReminder.setVisibility(0);
        oKReminder.setCloseIconVisibility(false);
        oKReminder.setStyle(2);
        int i = C55688xof.Application.RatingCompat1;
        kotlin.Pair[] pairArr = new kotlin.Pair[2];
        pairArr[0] = C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, xmr.AhwBna(str != null ? str : "", OLrzqt().copydefault()));
        pairArr[1] = C56390yDp.OLrzqt("ccy", fIwbmz());
        oKReminder.setMessage(C33069mpW.copydefault(i, C56424yEw.gEmmrt(pairArr)));
        OLrzqt(str);
        copydefault();
    }

    public final void OLrzqt(java.lang.String str) {
        java.lang.String value;
        java.lang.Boolean boolIsNegativeContract;
        BizInstrument bizInstrumentAhwBna = AuCTel().fvQaOB().AhwBna();
        if ((bizInstrumentAhwBna instanceof SwapInstrument) && (boolIsNegativeContract = ((SwapInstrument) bizInstrumentAhwBna).isNegativeContract()) != null && boolIsNegativeContract.booleanValue()) {
            value = AubY().EZpvd().getValue();
        } else {
            value = AubY().AhwBna().getValue();
        }
        if (value == null) {
            value = "";
        }
        if (C33129mqd.AEQbTJ(str, value)) {
            QKVWgx();
            android.widget.TextView textView = values().djBIcL;
            Intrinsics.checkNotNullExpressionValue(textView, "");
            textView.setVisibility(0);
            values().djBIcL.setText(C33070mpX.AYXKKw(C55688xof.Application.getStarRating));
            return;
        }
        C53605woe c53605woe = values().AuCTel;
        Intrinsics.checkNotNullExpressionValue(c53605woe, "");
        c53605woe.setVisibility(8);
        android.widget.TextView textView2 = values().djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
    }

    private final void AwvSrB() {
        AppCompatTextView appCompatTextView = values().fJNWhG;
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        java.lang.String instType = tacticsDataAYXKKw != null ? tacticsDataAYXKKw.getInstType() : null;
        java.lang.String str = instType == null ? "" : instType;
        TacticsData tacticsDataAYXKKw2 = OLrzqt().AYXKKw();
        java.lang.String instId = tacticsDataAYXKKw2 != null ? tacticsDataAYXKKw2.getInstId() : null;
        appCompatTextView.setText(C56033xvF.getCoinTitle$default(str, instId == null ? "" : instId, false, null, null, 28, null));
        values().fARcdN.setText(C33069mpW.copydefault(this, C55688xof.Application.getStateWithUpdatedPosition, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", OLrzqt().valueOf()))));
        values().isConnected.setMaxDecimal(OLrzqt().OLrzqt());
        values().values.setMaxDecimal(OLrzqt().OLrzqt());
    }

    private final void gHZMYf() {
        values().isConnected.setOnTextChangeCallback(this.copydefault);
        values().values.setOnTextChangeCallback(this.copydefault);
        values().AhwBna.setOnTextChangeCallback(this.copydefault);
    }

    private final void zsXlph() {
        values().AuCTel.setTransferCoin(fIwbmz());
        values().AuCTel.setTransferClickCallback(new Function0() { // from class: o.vGq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C50225vGn.copydefault(this.EZpvd);
            }
        });
    }

    public static final Unit copydefault(C50225vGn c50225vGn) {
        c50225vGn.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    private final void EZpvd(boolean z, boolean z2) {
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        java.lang.String direction = tacticsDataAYXKKw != null ? tacticsDataAYXKKw.getDirection() : null;
        if (direction != null) {
            int iHashCode = direction.hashCode();
            if (iHashCode != 3327612) {
                if (iHashCode != 109413500) {
                    if (iHashCode == 1844321735 && direction.equals("neutral")) {
                        vKO vko = values().AkhnZx;
                        Intrinsics.checkNotNullExpressionValue(vko, "");
                        vko.setVisibility(0);
                        vKO vko2 = values().iwGUEr;
                        Intrinsics.checkNotNullExpressionValue(vko2, "");
                        vko2.setVisibility(0);
                        values().AkhnZx.setTitle(C33070mpX.AYXKKw(C55688xof.Application.FullyDrawnReporterExternalSyntheticLambda0));
                        values().iwGUEr.setTitle(C33070mpX.AYXKKw(C55688xof.Application.removeReporter));
                    }
                } else if (direction.equals("short")) {
                    vKO vko3 = values().AkhnZx;
                    Intrinsics.checkNotNullExpressionValue(vko3, "");
                    vko3.setVisibility(8);
                    vKO vko4 = values().iwGUEr;
                    Intrinsics.checkNotNullExpressionValue(vko4, "");
                    vko4.setVisibility(0);
                    values().iwGUEr.setTitle(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy));
                }
            } else if (direction.equals("long")) {
                vKO vko5 = values().AkhnZx;
                Intrinsics.checkNotNullExpressionValue(vko5, "");
                vko5.setVisibility(0);
                vKO vko6 = values().iwGUEr;
                Intrinsics.checkNotNullExpressionValue(vko6, "");
                vko6.setVisibility(8);
                values().AkhnZx.setTitle(C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2StubProxy));
            }
        }
        final AbstractC48500uTs abstractC48500uTsValues = values();
        abstractC48500uTsValues.AkhnZx.EZpvd(true, new View.OnClickListener() { // from class: o.vGy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50225vGn.EZpvd(this.KWHzl, abstractC48500uTsValues, view);
            }
        });
        abstractC48500uTsValues.iwGUEr.EZpvd(true, new View.OnClickListener() { // from class: o.vGx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C50225vGn.OLrzqt(this.copydefault, abstractC48500uTsValues, view);
            }
        });
    }

    public static final void EZpvd(C50225vGn c50225vGn, AbstractC48500uTs abstractC48500uTs, android.view.View view) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.removeAllTabs);
        android.content.Context contextRequireContext = c50225vGn.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(abstractC48500uTs.AkhnZx.KWHzl());
        viewOnClickListenerC54939xaY.EZpvd(strAYXKKw);
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.vGl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C50225vGn.OLrzqt(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void OLrzqt(C50225vGn c50225vGn, AbstractC48500uTs abstractC48500uTs, android.view.View view) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.setCaptioningEnabled);
        android.content.Context contextRequireContext = c50225vGn.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(abstractC48500uTs.iwGUEr.KWHzl());
        viewOnClickListenerC54939xaY.EZpvd(strAYXKKw);
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.QWSkGZ);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.vGr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C50225vGn.EZpvd(viewOnClickListenerC54939xaY, view2);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final boolean getFieldNames() {
        return (values().isConnected.getFieldNames() || values().values.getFieldNames()) ? false : true;
    }

    public final boolean uzCIH() {
        java.lang.String strAkhnZx = values().values.AkhnZx();
        if (strAkhnZx.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            return false;
        }
        java.lang.String strAkhnZx2 = values().isConnected.AkhnZx();
        if (strAkhnZx2.length() == 0 || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx2)) {
            return false;
        }
        return C33129mqd.AEQbTJ(java.lang.Double.valueOf(C33129mqd.AEQbTJ(strAkhnZx)), java.lang.Double.valueOf(C33129mqd.AEQbTJ(strAkhnZx2)));
    }

    public final boolean iwGUEr() {
        return values().isConnected.AkhnZx().length() > 0;
    }

    public final boolean getNewProxyInstance() {
        return values().values.AkhnZx().length() > 0;
    }

    private final java.lang.String DTwDnp() {
        java.lang.String minGridNum;
        java.lang.String maxGridNum;
        java.lang.String strCopydefault;
        java.lang.String maxGridNum2;
        java.lang.String strAkhnZx = values().AhwBna.AkhnZx();
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        if (tacticsDataAYXKKw == null || !Intrinsics.EZpvd((java.lang.Object) tacticsDataAYXKKw.getOrderType(), (java.lang.Object) "contract_grid")) {
            minGridNum = "";
            maxGridNum = minGridNum;
        } else {
            StrategyConfigInfo value = AuCTel().copydefault().getValue();
            maxGridNum = null;
            minGridNum = value != null ? value.getMinGridNum() : null;
            GridNumRangeBean value2 = AuCTel().fARcdN().getValue();
            if (value2 == null || (maxGridNum2 = value2.getMaxGridNum()) == null) {
                StrategyConfigInfo value3 = AuCTel().copydefault().getValue();
                if (value3 != null) {
                    maxGridNum = value3.getMaxGridNum();
                }
            } else {
                maxGridNum = maxGridNum2;
            }
        }
        if (minGridNum == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) minGridNum) || maxGridNum == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxGridNum)) {
            return "";
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx)) {
            return C33070mpX.AYXKKw(C55688xof.Application.otherwise);
        }
        if (C33129mqd.AEQbTJ(strAkhnZx, maxGridNum)) {
            int i = C55688xof.Application.ActionBarLayoutParams;
            if (maxGridNum == null) {
                maxGridNum = "";
            }
            strCopydefault = C33069mpW.copydefault(this, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, maxGridNum)));
        } else {
            strCopydefault = "";
        }
        if (C33129mqd.gEmmrt(strAkhnZx, minGridNum)) {
            return C33069mpW.copydefault(this, C55688xof.Application.onDrawerSlide, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, minGridNum != null ? minGridNum : "")));
        }
        return strCopydefault;
    }

    private final void KWHzl(java.lang.String str) {
        android.widget.TextView textView = values().copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ^ true ? 0 : 8);
        values().copydefault.setText(str);
    }

    public final void wlaJM() {
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        if (tacticsDataAYXKKw == null || !Intrinsics.EZpvd((java.lang.Object) tacticsDataAYXKKw.getOrderType(), (java.lang.Object) "contract_grid")) {
            return;
        }
        AuCTel().QUSxYX();
    }

    private final void ORxRYg() {
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        if (tacticsDataAYXKKw == null || !Intrinsics.EZpvd((java.lang.Object) tacticsDataAYXKKw.getOrderType(), (java.lang.Object) "contract_grid")) {
            return;
        }
        ContractManuallyPresenter.requestLiqPrice$default(AuCTel(), true, false, true, false, 8, null);
    }

    private final void sSMYrx() {
        values().AhwBna.setMaxDecimal(0);
        C55258xgZ c55258xgZ = values().valueOf;
        c55258xgZ.setOnClickListener(new Activity(c55258xgZ, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vGn$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.OLrzqt.dismiss();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void QOLQEE() {
        BizInstrument bizInstrumentValueOf;
        java.lang.String instType;
        java.lang.String instId;
        AubY().AYXKKw();
        C55915xsu c55915xsuAubY = AubY();
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
        c55915xsuAubY.EZpvd("contract_grid", (64 & 2) != 0 ? "cash" : "cross", (64 & 4) != 0 ? "" : "net_mode", (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : bizInstrumentValueOf, (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? null : null);
    }

    private final void QKVWgx() {
        java.lang.String value;
        xMV xmvCreateSizeConverterWithIndex$default;
        C54536xML c54536xMLCopydefault;
        C54536xML c54536xMLCopydefault2;
        C54536xML c54536xMLFetchVPNInfo;
        C54536xML c54536xMLDjBIcL;
        java.lang.Boolean boolIsNegativeContract;
        BizInstrument bizInstrumentAhwBna = AuCTel().fvQaOB().AhwBna();
        if ((bizInstrumentAhwBna instanceof SwapInstrument) && (boolIsNegativeContract = ((SwapInstrument) bizInstrumentAhwBna).isNegativeContract()) != null && boolIsNegativeContract.booleanValue()) {
            value = AubY().EZpvd().getValue();
        } else {
            value = AubY().AhwBna().getValue();
        }
        if (value == null) {
            value = "";
        }
        java.lang.String strValueOf = AuCTel().fvQaOB().valueOf();
        java.lang.String str = strValueOf != null ? strValueOf : "";
        AbstractC54531xLw abstractC54531xLwAEQbTJ = AuCTel().fvQaOB().AEQbTJ();
        java.lang.String safeString$default = null;
        if (abstractC54531xLwAEQbTJ != null && (xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwAEQbTJ, str, null, 2, null)) != null && (c54536xMLCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault(value)) != null && (c54536xMLCopydefault2 = c54536xMLCopydefault.copydefault()) != null && (c54536xMLFetchVPNInfo = c54536xMLCopydefault2.fetchVPNInfo()) != null && (c54536xMLDjBIcL = c54536xMLFetchVPNInfo.djBIcL()) != null) {
            safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null);
        }
        if (safeString$default != null) {
            copydefault(safeString$default);
        }
    }

    private final void copydefault(java.lang.String str) {
        C53605woe c53605woe = values().AuCTel;
        Intrinsics.checkNotNullExpressionValue(c53605woe, "");
        if (c53605woe.getVisibility() != 0) {
            values().AuCTel.setVisibility(0);
        }
        values().AuCTel.setFooterAvaValue(str);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.AhwBna = true;
        AubY().AYXKKw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zLjUOn() {
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
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
        wxq.AEQbTJ().setVisibility(8);
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        this.AYXKKw = wyf;
        wyf.setType(14);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        wyf.setSecondaryText(C33070mpX.AYXKKw(C55688xof.Application.onConfigurationChanged));
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(false);
        }
        C52794wYp c52794wYpCopydefault2 = wyf.copydefault();
        if (c52794wYpCopydefault2 != null) {
            c52794wYpCopydefault2.setOnClickListener(new ActionBar(c52794wYpCopydefault2, 1000L, this));
        }
        C52794wYp c52794wYpAEQbTJ = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ != null) {
            c52794wYpAEQbTJ.setOKDSType(260);
        }
        C52794wYp c52794wYpAEQbTJ2 = wyf.AEQbTJ();
        if (c52794wYpAEQbTJ2 != null) {
            c52794wYpAEQbTJ2.setOnClickListener(new PendingIntent(c52794wYpAEQbTJ2, 1000L, this));
        }
    }

    public final boolean fJNWhG() {
        if (fARcdN() && iwGUEr() && getNewProxyInstance() && uzCIH() && getFieldNames() && !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) DTwDnp()))) {
            return (values().gEmmrt.getVisibility() == 0 && C33129mqd.OLrzqt(values().gEmmrt.getText())) ? false : true;
        }
        return false;
    }

    public final boolean fARcdN() {
        AbstractC48500uTs abstractC48500uTsValues = values();
        java.lang.String strAkhnZx = abstractC48500uTsValues.isConnected.AkhnZx();
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        if (Intrinsics.EZpvd((java.lang.Object) strAkhnZx, (java.lang.Object) (tacticsDataAYXKKw != null ? tacticsDataAYXKKw.getMinPx() : null))) {
            java.lang.String strAkhnZx2 = abstractC48500uTsValues.values.AkhnZx();
            TacticsData tacticsDataAYXKKw2 = OLrzqt().AYXKKw();
            if (Intrinsics.EZpvd((java.lang.Object) strAkhnZx2, (java.lang.Object) (tacticsDataAYXKKw2 != null ? tacticsDataAYXKKw2.getMaxPx() : null))) {
                java.lang.String strAkhnZx3 = abstractC48500uTsValues.AhwBna.AkhnZx();
                TacticsData tacticsDataAYXKKw3 = OLrzqt().AYXKKw();
                if (Intrinsics.EZpvd((java.lang.Object) strAkhnZx3, (java.lang.Object) (tacticsDataAYXKKw3 != null ? tacticsDataAYXKKw3.getGridNum() : null))) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean ejfBZ() {
        if (!fJNWhG()) {
            return false;
        }
        android.widget.TextView textView = values().djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        return (textView.getVisibility() == 0 && C33129mqd.OLrzqt(values().djBIcL.getText())) ? false : true;
    }

    public final void copydefault() {
        wYF wyf = this.AYXKKw;
        if (wyf == null) {
            Intrinsics.gEmmrt("");
            wyf = null;
        }
        C52794wYp c52794wYpCopydefault = wyf.copydefault();
        if (c52794wYpCopydefault != null) {
            c52794wYpCopydefault.setEnabled(ejfBZ());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AuCTelauCTel() {
        TacticsData tacticsDataAYXKKw;
        if (ejfBZ() && (tacticsDataAYXKKw = OLrzqt().AYXKKw()) != null && Intrinsics.EZpvd((java.lang.Object) tacticsDataAYXKKw.getOrderType(), (java.lang.Object) "contract_grid")) {
            hDKMBd();
        }
    }

    public final void hDKMBd() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String requiredTopUpAmount;
        androidx.fragment.app.FragmentManager supportFragmentManager;
        java.lang.String estimatedPositionToClose;
        java.lang.String perMinProfitRate;
        java.lang.String perMaxProfitRate;
        TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
        java.lang.String localizedNumber$default = null;
        if (tacticsDataAYXKKw != null) {
            if (Intrinsics.EZpvd((java.lang.Object) tacticsDataAYXKKw.getOrderType(), (java.lang.Object) "contract_grid")) {
                GridProfitRateResp value = AuCTel().fJNWhG().getValue();
                perMinProfitRate = value != null ? value.getPerMinProfitRate() : null;
                GridProfitRateResp value2 = AuCTel().fJNWhG().getValue();
                perMaxProfitRate = value2 != null ? value2.getPerMaxProfitRate() : null;
            } else {
                perMinProfitRate = null;
                perMaxProfitRate = null;
            }
            str = perMinProfitRate;
            str2 = perMaxProfitRate;
        } else {
            str = null;
            str2 = null;
        }
        TacticsData tacticsDataAYXKKw2 = OLrzqt().AYXKKw();
        java.lang.String algoId = tacticsDataAYXKKw2 != null ? tacticsDataAYXKKw2.getAlgoId() : null;
        java.lang.String minPx = AuCTel().uzCIH().getMinPx();
        java.lang.String maxPx = AuCTel().uzCIH().getMaxPx();
        java.lang.String strAkhnZx = values().AhwBna.AkhnZx();
        MinTopUpResp value3 = OLrzqt().EZpvd().getValue();
        if (value3 == null || (requiredTopUpAmount = value3.getRequiredTopUpAmount()) == null) {
            requiredTopUpAmount = "";
        }
        java.lang.String str3 = requiredTopUpAmount;
        LiquidatePriceResponse value4 = AuCTel().getFieldNames().getValue();
        java.lang.String longLiqPx = value4 != null ? value4.getLongLiqPx() : null;
        LiquidatePriceResponse value5 = AuCTel().getFieldNames().getValue();
        SpotGridEditParamReq spotGridEditParamReq = new SpotGridEditParamReq(algoId, minPx, maxPx, strAkhnZx, str3, str, str2, longLiqPx, value5 != null ? value5.getShortLiqPx() : null, (java.lang.String) null, 512, (DefaultConstructorMarker) null);
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            C50213vGb.TaskDescription taskDescription = C50213vGb.Companion;
            TacticsData tacticsDataAYXKKw3 = OLrzqt().AYXKKw();
            MinTopUpResp value6 = OLrzqt().EZpvd().getValue();
            if (value6 != null && (estimatedPositionToClose = value6.getEstimatedPositionToClose()) != null) {
                localizedNumber$default = xHN.toLocalizedNumber$default(estimatedPositionToClose, false, null, false, false, 15, null);
            }
            taskDescription.AEQbTJ(tacticsDataAYXKKw3, C53418wlC.copydefault(localizedNumber$default), spotGridEditParamReq).show(supportFragmentManager);
        }
        dismissAllowingStateLoss();
    }

    public final java.lang.String fIwbmz() {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String marginSymbol = null;
        if (interfaceC54581xNrOLrzqt != null) {
            TacticsData tacticsDataAYXKKw = OLrzqt().AYXKKw();
            java.lang.String instType = tacticsDataAYXKKw != null ? tacticsDataAYXKKw.getInstType() : null;
            if (instType == null) {
                instType = "";
            }
            TacticsData tacticsDataAYXKKw2 = OLrzqt().AYXKKw();
            java.lang.String instId = tacticsDataAYXKKw2 != null ? tacticsDataAYXKKw2.getInstId() : null;
            BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, instType, instId != null ? instId : "", null, null, 12, null);
            if (suggestedInstrument$default != null) {
                marginSymbol = suggestedInstrument$default.getMarginSymbol();
            }
        }
        java.lang.String strCopydefault = C53418wlC.copydefault(marginSymbol);
        pUU.KWHzl("BotContractGridEditParamDialog", "Invest symbol " + strCopydefault);
        return strCopydefault;
    }
}
