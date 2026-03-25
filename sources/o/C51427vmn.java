package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.app.FrameMetricsAggregator;
import androidx.core.os.BundleKt;
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
import com.okinc.business.defi.biz.core.error.WalletImportError;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.SignalBotCopyCreatePresenter;
import com.okinc.tradingbot.impl.market_place.bot_copy.presenter.SignalBotCopyPresenter;
import com.okinc.tradingbot.impl.order.strategy.signalbot.ui.itembinder.SignalBotConfirmData;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.BotTradeData;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.EntrySignalOrderAmtParam;
import com.okinc.unify_trade.biz.ExitSignalOrderAmtParam;
import com.okinc.unify_trade.biz.GridReq;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.MultiMinAmountItem;
import com.okinc.unify_trade.biz.RecurringOrderData;
import com.okinc.unify_trade.biz.SignalBotReq;
import com.okinc.unify_trade.biz.SignalDetails;
import com.okinc.unify_trade.biz.SignalListItem;
import com.okinc.unify_trade.biz.SmartArbitrageReq;
import com.okinc.unify_trade.biz.SmartPortfolioReq;
import com.okinc.unify_trade.biz.StrategyConfigInfo;
import com.okinc.unify_trade.biz.StrategyMoveOrderReq;
import com.okinc.unify_trade.biz.StrategyReqGroup;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.ThirdSignalDetail;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.bot.data.SignalCoinPairItemData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotOrderPresenter;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
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
import o.InterfaceC54581xNr;
import o.vYW;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vmn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C51427vmn extends AbstractC49945uyC<uVA, SignalBotOrderPresenter> {
    public final int AYXKKw = C48033uCm.Activity.QKDJJA;
    public ViewOnClickListenerC54939xaY AhwBna;
    public final C43316rmw KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public boolean djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final Function2<C47988uAv, java.lang.String, Unit> valueOf;
    public final InterfaceC56387yDm values;
    public static final ActionBar Companion = new ActionBar(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.vmn$Fragment */
    public static final /* synthetic */ class Fragment implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(Function1 function1) {
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
        return this.AYXKKw;
    }

    public static final /* synthetic */ uVA AhwBna(C51427vmn c51427vmn) {
        return c51427vmn.values();
    }

    public C51427vmn() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SignalBotCopyPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.dialog.SignalCreateBotDialog$special$$inlined$activityViewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.dialog.SignalCreateBotDialog$special$$inlined$activityViewModels$default$2
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
                Function0 function02 = function0;
                if (function02 != null && (creationExtras = (CreationExtras) function02.invoke()) != null) {
                    return creationExtras;
                }
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.dialog.SignalCreateBotDialog$special$$inlined$activityViewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.market_place.dialog.SignalCreateBotDialog$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.market_place.dialog.SignalCreateBotDialog$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function02.invoke();
            }
        });
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(SignalBotCopyCreatePresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.dialog.SignalCreateBotDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.dialog.SignalCreateBotDialog$special$$inlined$viewModels$default$4
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
                Function0 function03 = function0;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.dialog.SignalCreateBotDialog$special$$inlined$viewModels$default$5
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.market_place.dialog.SignalCreateBotDialog$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.market_place.dialog.SignalCreateBotDialog$special$$inlined$viewModels$default$7
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
        this.gEmmrt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.dialog.SignalCreateBotDialog$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.dialog.SignalCreateBotDialog$special$$inlined$viewModels$default$9
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
                Function0 function04 = function0;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.dialog.SignalCreateBotDialog$special$$inlined$viewModels$default$10
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
        this.KWHzl = new C43316rmw();
        this.djBIcL = true;
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.vmt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51427vmn.AkhnZx(this.AEQbTJ);
            }
        });
        this.valueOf = new Function2() { // from class: o.vmp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C51427vmn.copydefault(this.KWHzl, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
    }

    public final SignalBotCopyPresenter isConnected() {
        return (SignalBotCopyPresenter) this.OLrzqt.getValue();
    }

    public final SignalBotCopyCreatePresenter AuCTel() {
        return (SignalBotCopyCreatePresenter) this.copydefault.getValue();
    }

    private final C55915xsu getNewProxyInstance() {
        return (C55915xsu) this.gEmmrt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SignalDetails uzCIH() {
        return (SignalDetails) this.values.getValue();
    }

    public static final SignalDetails AkhnZx(C51427vmn c51427vmn) {
        SignalDetails signalDetails;
        java.lang.String string;
        SignalDetails signalDetails2;
        android.os.Bundle arguments = c51427vmn.getArguments();
        if (arguments == null || (signalDetails2 = (SignalDetails) arguments.getParcelable("SUB_CONFIRM_DATA")) == null || (signalDetails = (SignalDetails) xVA.EZpvd(signalDetails2)) == null) {
            signalDetails = new SignalDetails(null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 67108863, null);
        }
        android.os.Bundle arguments2 = c51427vmn.getArguments();
        if (arguments2 != null && (string = arguments2.getString("type")) != null) {
            signalDetails.setSubscriptionType(string);
        }
        return signalDetails;
    }

    public static final Unit copydefault(C51427vmn c51427vmn, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, c51427vmn.values().djBIcL)) {
            c51427vmn.getFieldNames();
            c51427vmn.gHZMYf();
            c51427vmn.OcIXYQ();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vmn$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vmn.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final void OLrzqt(@NotNull SignalDetails signalDetails, java.lang.String str, @NotNull androidx.fragment.app.FragmentManager fragmentManager) {
            Intrinsics.checkNotNullParameter(signalDetails, "");
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            C51427vmn c51427vmn = new C51427vmn();
            c51427vmn.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("SUB_CONFIRM_DATA", signalDetails), C56390yDp.OLrzqt("type", str)));
            c51427vmn.show(fragmentManager, "SignalCreateBotDialog");
        }
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        zuBGHE();
        AuCTelauCTel();
        ORxRYg();
        QKVWgx();
        wlaJM();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.KWHzl().setVisibility(0);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setDividerVisibility(true);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new FragmentManager(imageViewKWHzl, 1000L, this));
        wxq.AYXKKw().setText(C33070mpX.AYXKKw(C55688xof.Application.hBORwR));
    }

    private final void zuBGHE() {
        uVA uvaValues = values();
        boolean z = !AuCTel().copydefault(uzCIH());
        C51969vwz c51969vwz = uvaValues.valueOf;
        Intrinsics.copydefault(c51969vwz);
        c51969vwz.setVisibility(z ? 0 : 8);
        AEQbTJ(c51969vwz);
        c51969vwz.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vmu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z2) {
                C51427vmn.EZpvd(this.AEQbTJ, compoundButton, z2);
            }
        });
        c51969vwz.setChecked(true);
        AppCompatTextView appCompatTextView = uvaValues.AYXKKw;
        Intrinsics.copydefault(appCompatTextView);
        appCompatTextView.setVisibility(z ? 0 : 8);
        appCompatTextView.setText(C33069mpW.copydefault(C55688xof.Application.zMXLsR, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xMR.formatPercent$default(xMR.copydefault, uzCIH().getProfitSharingRatio(), 0, null, 4, null)))));
        android.view.View view = uvaValues.KWHzl;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(z ? 0 : 8);
        android.graphics.drawable.Drawable drawableKWHzl = C33070mpX.KWHzl(C52761wXj.TaskDescription.DGUQLI);
        if (drawableKWHzl != null) {
            drawableKWHzl.setBounds(0, 0, C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null), C55298xhM.dpInt$default(16.0f, (android.content.Context) null, 1, (java.lang.Object) null));
            uvaValues.AkhnZx.setCompoundDrawablesRelative(null, null, drawableKWHzl, null);
        }
        zsXlph();
        AubY();
        fJNWhG();
        hDKMBd();
    }

    public static final void EZpvd(C51427vmn c51427vmn, android.widget.CompoundButton compoundButton, boolean z) {
        c51427vmn.fARcdN();
    }

    /* JADX INFO: renamed from: o.vmn$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C51427vmn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51427vmn c51427vmn) {
            this.AEQbTJ = view;
            this.EZpvd = j;
            this.copydefault = c51427vmn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.EZpvd || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                vYW.ActionBar actionBar = vYW.Companion;
                java.lang.String lever = this.copydefault.OLrzqt().fJNWhG().getLever();
                StrategyConfigInfo value = this.copydefault.OLrzqt().OLrzqt().getValue();
                java.lang.String leveragePercents = value != null ? value.getLeveragePercents() : null;
                StrategyConfigInfo value2 = this.copydefault.OLrzqt().OLrzqt().getValue();
                java.lang.String minLever = value2 != null ? value2.getMinLever() : null;
                StrategyConfigInfo value3 = this.copydefault.OLrzqt().OLrzqt().getValue();
                actionBar.EZpvd(lever, leveragePercents, minLever, value3 != null ? value3.getMaxLever() : null, this.copydefault.getChildFragmentManager(), this.copydefault.OLrzqt().iwGUEr(), this.copydefault.OLrzqt().AuCTelauCTel(), this.copydefault.new Application());
            }
        }
    }

    /* JADX INFO: renamed from: o.vmn$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ C51427vmn KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C51427vmn c51427vmn) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c51427vmn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.KWHzl.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.vmn$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C51427vmn copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51427vmn c51427vmn) {
            this.EZpvd = view;
            this.AEQbTJ = j;
            this.copydefault = c51427vmn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.AEQbTJ || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                if (this.copydefault.AwvSrB()) {
                    android.widget.TextView textView = C51427vmn.AhwBna(this.copydefault).copydefault;
                    Intrinsics.checkNotNullExpressionValue(textView, "");
                    if (textView.getVisibility() != 0) {
                        if (this.copydefault.AuCTel().copydefault(this.copydefault.uzCIH())) {
                            this.copydefault.AxsJAY();
                            return;
                        } else {
                            this.copydefault.isConnected().copydefault(this.copydefault.uzCIH());
                            return;
                        }
                    }
                    C56002xub.KWHzl.OLrzqt();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.vmn$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C51427vmn OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C51427vmn c51427vmn) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.OLrzqt = c51427vmn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                if (this.OLrzqt.AuCTel().copydefault(this.OLrzqt.uzCIH())) {
                    this.OLrzqt.ejfBZ();
                    C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.DuQ, 0, 1, (java.lang.Object) null);
                    return;
                }
                android.content.Context context = this.OLrzqt.getContext();
                if (context != null) {
                    C51427vmn c51427vmn = this.OLrzqt;
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.xxhdY));
                    viewOnClickListenerC54939xaY.EZpvd(C33069mpW.copydefault(C55688xof.Application.DtA, C56423yEv.EZpvd(C56390yDp.OLrzqt("percent", xMR.formatPercent$default(xMR.copydefault, this.OLrzqt.uzCIH().getProfitSharingRatio(), 0, null, 6, null)))));
                    C51969vwz c51969vwz = new C51969vwz(context, null, 0, 6, null);
                    this.OLrzqt.AEQbTJ(c51969vwz);
                    c51969vwz.setOnCheckedChangeListener(new PendingIntent(viewOnClickListenerC54939xaY));
                    c51969vwz.setChecked(true);
                    viewOnClickListenerC54939xaY.EZpvd(c51969vwz);
                    viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.PipHintTrackerKt), (View.OnClickListener) new Dialog(c51969vwz, this.OLrzqt));
                    viewOnClickListenerC54939xaY.OLrzqt(C55688xof.Application.OnBackPressedDispatcherKt, new LoaderManager(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.show();
                    c51427vmn.AhwBna = viewOnClickListenerC54939xaY;
                }
            }
        }
    }

    private final void zsXlph() {
        RecyclerView recyclerView = values().AhwBna;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(this.KWHzl);
        C43316rmw c43316rmw = this.KWHzl;
        c43316rmw.register(TacticsInsideItemData.class, new C52510wOb(null, null, null, 7, null));
        c43316rmw.register(SignalBotConfirmData.class, new vZN(new Function0() { // from class: o.vmv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C51427vmn.AYXKKw(this.KWHzl);
            }
        }));
        C33064mpR.OLrzqt(c43316rmw, (java.util.List<? extends java.lang.Object>) AuCTel().EZpvd(uzCIH(), yDY.AhwBna()));
    }

    public static final Unit AYXKKw(C51427vmn c51427vmn) {
        C50741vZq c50741vZqOLrzqt = C50741vZq.Companion.OLrzqt(new SignalBotReq((java.lang.String) null, (java.lang.String) null, (java.util.ArrayList) null, c51427vmn.OLrzqt().fJNWhG().getLever(), (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (EntrySignalOrderAmtParam) null, (ExitSignalOrderAmtParam) null, false, (ThirdSignalDetail) null, false, (java.util.ArrayList) c51427vmn.OLrzqt().AuCTelauCTel(), (java.lang.String) null, (AutoVipProfitInfo) null, 28663, (DefaultConstructorMarker) null));
        androidx.fragment.app.FragmentManager childFragmentManager = c51427vmn.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c50741vZqOLrzqt.show(childFragmentManager);
        return Unit.INSTANCE;
    }

    private final void AubY() {
        OLrzqt().fJNWhG().setLever("5");
        C50189vFe c50189vFe = values().AEQbTJ;
        c50189vFe.EZpvd(OLrzqt().fJNWhG().getLever());
        c50189vFe.setOnLeverChangeCallback(new Function1() { // from class: o.vmx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51427vmn.EZpvd(this.copydefault, (java.lang.String) obj);
            }
        });
    }

    public static final Unit EZpvd(C51427vmn c51427vmn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c51427vmn.OLrzqt().fJNWhG().setLever(str);
        return Unit.INSTANCE;
    }

    public final void fJNWhG() {
        final C47988uAv c47988uAv = values().djBIcL;
        c47988uAv.setOnTextChangeCallback(this.valueOf);
        C47988uAv.setInputLabel$default(c47988uAv, "> " + xMR.copydefault.copydefault("0"), null, 2, null);
        c47988uAv.setInputUnit(OLrzqt().djBIcL());
        c47988uAv.setMaxDecimal(OLrzqt().values());
        c47988uAv.copydefault(new Function1() { // from class: o.vmq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51427vmn.copydefault(c47988uAv, this, ((java.lang.Float) obj).floatValue());
            }
        });
    }

    public static final Unit copydefault(C47988uAv c47988uAv, C51427vmn c51427vmn, float f) {
        if (c47988uAv.zLjUOn()) {
            c47988uAv.setOnTextChangeCallback(null);
            C47988uAv.setInputContent$default(c47988uAv, C33129mqd.mulS$default(java.lang.Float.valueOf(f), c51427vmn.getNewProxyInstance().AhwBna().getValue(), java.lang.Integer.valueOf(c51427vmn.OLrzqt().values()), null, null, 12, null), false, false, 6, null);
            c51427vmn.gHZMYf();
            c47988uAv.setOnTextChangeCallback(c51427vmn.valueOf);
        } else {
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
        }
        c51427vmn.OcIXYQ();
        return Unit.INSTANCE;
    }

    private final void hDKMBd() {
        values().OLrzqt.setTransferCoin(OLrzqt().djBIcL());
        values().OLrzqt.setFooterAvaValue("--");
    }

    /* JADX INFO: renamed from: o.vmn$Application */
    public static final class Application implements Function2<java.lang.String, java.util.ArrayList<SignalCoinPairItemData>, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function2
        public /* synthetic */ Unit invoke(java.lang.String str, java.util.ArrayList<SignalCoinPairItemData> arrayList) {
            OLrzqt(str, arrayList);
            return Unit.INSTANCE;
        }

        public final void OLrzqt(java.lang.String str, java.util.ArrayList<SignalCoinPairItemData> arrayList) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(arrayList, "");
            C51427vmn.AhwBna(C51427vmn.this).AEQbTJ.EZpvd(str);
            C51427vmn.this.OLrzqt().fIwbmz().clear();
            C51427vmn.this.OLrzqt().fIwbmz().addAll(C51427vmn.this.OLrzqt().AuCTelauCTel());
            C51427vmn.this.OLrzqt().OLrzqt(arrayList);
            C51427vmn.this.OLrzqt().zsXlph();
        }
    }

    private final void AuCTelauCTel() {
        C50189vFe c50189vFe = values().AEQbTJ;
        c50189vFe.setOnClickListener(new Activity(c50189vFe, 1000L, this));
        AppCompatTextView appCompatTextView = values().AkhnZx;
        appCompatTextView.setOnClickListener(new TaskDescription(appCompatTextView, 1000L, this));
        C52794wYp c52794wYp = values().EZpvd;
        c52794wYp.setOnClickListener(new StateListAnimator(c52794wYp, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vmn$PendingIntent */
    public static final class PendingIntent implements CompoundButton.OnCheckedChangeListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
            android.widget.TextView textViewEZpvd = this.AEQbTJ.EZpvd();
            if (textViewEZpvd != null) {
                textViewEZpvd.setEnabled(z);
            }
        }
    }

    /* JADX INFO: renamed from: o.vmn$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ C51969vwz KWHzl;
        public final /* synthetic */ C51427vmn OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(C51969vwz c51969vwz, C51427vmn c51427vmn) {
            this.KWHzl = c51969vwz;
            this.OLrzqt = c51427vmn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            if (this.KWHzl.AEQbTJ()) {
                AbstractC49945uyC.showLoading$default(this.OLrzqt, 0L, 1, null);
                this.OLrzqt.uzCIH().setBotOrderType("customOrder");
                this.OLrzqt.isConnected().copydefault(this.OLrzqt.uzCIH());
            }
        }
    }

    /* JADX INFO: renamed from: o.vmn$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean AwvSrB() {
        if (!values().djBIcL.KWHzl()) {
            C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(this, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.IResultReceiver2Default)))), 0, 1, (java.lang.Object) null);
            values().djBIcL.zsXlph();
            return false;
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) values().djBIcL.fetchVPNInfo())) {
            values().djBIcL.zsXlph();
            return false;
        }
        if (!C33129mqd.gEmmrt(java.lang.Integer.valueOf(OLrzqt().fJNWhG().getInstIds().size()), 1)) {
            return true;
        }
        C55326xho.toastWithFailedIcon$default(C55688xof.Application.SUwuXE, 0, 1, (java.lang.Object) null);
        return false;
    }

    public final void ejfBZ() {
        java.lang.String signalChanId = uzCIH().getSignalChanId();
        java.lang.String signalChanName = uzCIH().getSignalChanName();
        java.lang.String type = uzCIH().getType();
        SignalListItem signalListItem = new SignalListItem((java.lang.String) null, signalChanId, signalChanName, (java.lang.String) null, uzCIH().getUserSubscriptionType(), uzCIH().getProfitSharingRatio(), uzCIH().getSubscriptionFee(), uzCIH().getUsername(), uzCIH().getAvatar(), type, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, false, 31753, (DefaultConstructorMarker) null);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            ActivityC52122vzt.Companion.OLrzqt(activity, new BotTradeData("signal_bot", "", "SWAP", (android.os.Parcelable) signalListItem, false, (java.lang.String) null, (java.lang.String) null, false, (java.util.List) null, 496, (DefaultConstructorMarker) null), (244 & 4) != 0 ? null : null, (244 & 8) != 0 ? null : "copy_signal_detail", (244 & 16) != 0 ? null : null, (244 & 32) != 0 ? null : null, (244 & 64) != 0 ? null : null, (244 & 128) != 0 ? "2" : null);
        }
        dismissAllowingStateLoss();
    }

    private final void ORxRYg() {
        TradeLiveData<java.lang.Boolean> tradeLiveDataKWHzl = AuCTel().KWHzl();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner, new Fragment(new Function1() { // from class: o.vmr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51427vmn.copydefault(this.copydefault, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        TradeLiveData<ThirdSignalDetail> tradeLiveDataUzCIH = OLrzqt().uzCIH();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataUzCIH.observe(viewLifecycleOwner2, new Fragment(new Function1() { // from class: o.vms
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51427vmn.copydefault(this.copydefault, (ThirdSignalDetail) obj);
            }
        }));
        C56111xwe<java.util.ArrayList<SignalCoinPairItemData>> c56111xweAYXKKw = OLrzqt().AYXKKw();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweAYXKKw.observe(viewLifecycleOwner3, new Fragment(new Function1() { // from class: o.vmw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51427vmn.KWHzl(this.KWHzl, (java.util.ArrayList) obj);
            }
        }));
        C56111xwe<StrategyConfigInfo> c56111xweOLrzqt = OLrzqt().OLrzqt();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        c56111xweOLrzqt.observe(viewLifecycleOwner4, new Fragment(new Function1() { // from class: o.vmD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51427vmn.AEQbTJ(this.OLrzqt, (StrategyConfigInfo) obj);
            }
        }));
        C56111xwe<MultiMinAmountItem> c56111xweIsConnected = OLrzqt().isConnected();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        c56111xweIsConnected.observe(viewLifecycleOwner5, new Fragment(new Function1() { // from class: o.vmA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51427vmn.OLrzqt(this.copydefault, (MultiMinAmountItem) obj);
            }
        }));
        C56111xwe<java.lang.String> c56111xweAhwBna = getNewProxyInstance().AhwBna();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        c56111xweAhwBna.observe(viewLifecycleOwner6, new Fragment(new Function1() { // from class: o.vmB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51427vmn.copydefault(this.copydefault, (java.lang.String) obj);
            }
        }));
        C56111xwe<java.lang.String> fieldNames = isConnected().getFieldNames();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        fieldNames.observe(viewLifecycleOwner7, new Fragment(new Function1() { // from class: o.vmz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51427vmn.valueOf(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        C56111xwe<StrategyResponse> c56111xweEjfBZ = OLrzqt().ejfBZ();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        c56111xweEjfBZ.observe(viewLifecycleOwner8, new Fragment(new Function1() { // from class: o.vmC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51427vmn.copydefault(this.KWHzl, (StrategyResponse) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = OLrzqt().fARcdN().AhwBna();
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner9, new Fragment(new Function1() { // from class: o.vmH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51427vmn.KWHzl((java.lang.Exception) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna2 = OLrzqt().valueOf().AhwBna();
        LifecycleOwner viewLifecycleOwner10 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner10, "");
        c56109xwcAhwBna2.observe(viewLifecycleOwner10, new Observer() { // from class: o.vmF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                C51427vmn.copydefault((java.lang.Exception) obj);
            }
        });
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotOrderPresenter.refreshBaseData$default(com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotOrderPresenter, java.lang.String, java.lang.String, java.lang.String, int, java.lang.Object):void */
    public static final Unit copydefault(C51427vmn c51427vmn, boolean z) {
        c51427vmn.zLjUOn();
        SignalBotOrderPresenter.refreshBaseData$default(c51427vmn.OLrzqt(), c51427vmn.uzCIH().getSignalChanId(), c51427vmn.uzCIH().getSignalChanName(), null, 4, null);
        c51427vmn.OLrzqt().AEQbTJ(c51427vmn.uzCIH().getSignalChanId());
        c51427vmn.OLrzqt().uzCIH().setValue(new ThirdSignalDetail((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, c51427vmn.uzCIH().getTickType(), c51427vmn.uzCIH().getInstIds(), c51427vmn.uzCIH().getTipLever(), c51427vmn.uzCIH().getTipMinInvest(), FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null));
        c51427vmn.OLrzqt().DbNXlk().setValue(c51427vmn.uzCIH());
        c51427vmn.OLrzqt().zuBGHE();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51427vmn c51427vmn, ThirdSignalDetail thirdSignalDetail) {
        Intrinsics.checkNotNullParameter(thirdSignalDetail, "");
        c51427vmn.OLrzqt().gHZMYf();
        c51427vmn.OLrzqt().QKVWgx();
        c51427vmn.OLrzqt().QOLQEE();
        c51427vmn.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C51427vmn c51427vmn, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C43316rmw c43316rmw = c51427vmn.KWHzl;
        SignalBotCopyCreatePresenter signalBotCopyCreatePresenterAuCTel = c51427vmn.AuCTel();
        SignalDetails signalDetailsUzCIH = c51427vmn.uzCIH();
        java.util.ArrayList<SignalCoinPairItemData> arrayListAuCTelauCTel = c51427vmn.OLrzqt().AuCTelauCTel();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(arrayListAuCTelauCTel, 10));
        java.util.Iterator<T> it = arrayListAuCTelauCTel.iterator();
        while (it.hasNext()) {
            arrayList2.add(((SignalCoinPairItemData) it.next()).getInstId());
        }
        C33064mpR.OLrzqt(c43316rmw, (java.util.List<? extends java.lang.Object>) signalBotCopyCreatePresenterAuCTel.EZpvd(signalDetailsUzCIH, arrayList2));
        c51427vmn.fIwbmz();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C51427vmn c51427vmn, StrategyConfigInfo strategyConfigInfo) {
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        c51427vmn.values().AEQbTJ.AEQbTJ(strategyConfigInfo.getMaxLever());
        c51427vmn.sSMYrx();
        c51427vmn.fIwbmz();
        c51427vmn.RJOkX();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51427vmn c51427vmn, MultiMinAmountItem multiMinAmountItem) {
        Intrinsics.checkNotNullParameter(multiMinAmountItem, "");
        c51427vmn.DTwDnp();
        c51427vmn.iwGUEr();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51427vmn c51427vmn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c51427vmn.values().OLrzqt.setFooterAvaValue(C56033xvF.fmtBotValueBySymbol$default(c51427vmn.OLrzqt().djBIcL(), str, RoundingMode.DOWN, true, null, false, null, null, null, null, null, 2032, null));
        c51427vmn.copydefault();
        c51427vmn.iwGUEr();
        c51427vmn.OcIXYQ();
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C51427vmn c51427vmn, java.lang.String str) {
        ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY;
        Intrinsics.checkNotNullParameter(str, "");
        c51427vmn.uzCIH().setSubscribed(true);
        c51427vmn.EZpvd();
        uVA uvaValues = c51427vmn.values();
        android.view.View view = uvaValues.KWHzl;
        Intrinsics.checkNotNullExpressionValue(view, "");
        view.setVisibility(8);
        AppCompatTextView appCompatTextView = uvaValues.AYXKKw;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(8);
        C51969vwz c51969vwz = uvaValues.valueOf;
        Intrinsics.checkNotNullExpressionValue(c51969vwz, "");
        c51969vwz.setVisibility(8);
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "customOrder")) {
            ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = c51427vmn.AhwBna;
            if (viewOnClickListenerC54939xaY2 != null && viewOnClickListenerC54939xaY2.isShowing() && (viewOnClickListenerC54939xaY = c51427vmn.AhwBna) != null) {
                viewOnClickListenerC54939xaY.dismiss();
            }
            c51427vmn.ejfBZ();
            C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.DuQ, 0, 1, (java.lang.Object) null);
        } else {
            c51427vmn.AxsJAY();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51427vmn c51427vmn, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        FragmentActivity activity = c51427vmn.getActivity();
        if (activity != null) {
            ActivityC51150vhb.Companion.AEQbTJ(activity, (WalletImportError.ERROR_CODE_AA_EXIST & 2) != 0 ? null : "signal_bot", (WalletImportError.ERROR_CODE_AA_EXIST & 4) != 0 ? null : strategyResponse.getAlgoId(), (WalletImportError.ERROR_CODE_AA_EXIST & 8) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 16) != 0 ? false : false, (WalletImportError.ERROR_CODE_AA_EXIST & 32) != 0 ? null : null, (WalletImportError.ERROR_CODE_AA_EXIST & 64) == 0 ? null : null);
        }
        c51427vmn.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final void copydefault(java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        pUU.copydefault("SignalCreateBotDialog", "reqBotConfig error: " + exc.getMessage());
    }

    public final void copydefault() {
        ThirdSignalDetail value = OLrzqt().uzCIH().getValue();
        java.lang.String tipMinInvest = value != null ? value.getTipMinInvest() : null;
        java.lang.String value2 = getNewProxyInstance().AhwBna().getValue();
        if (C33129mqd.OLrzqt((java.lang.CharSequence) tipMinInvest) && C33129mqd.OLrzqt((java.lang.CharSequence) value2) && C33129mqd.valueOf(tipMinInvest, value2) && this.djBIcL) {
            this.djBIcL = false;
            C47988uAv.setInputContent$default(values().djBIcL, tipMinInvest, false, false, 6, null);
        }
    }

    public final void fIwbmz() {
        if (OLrzqt().AYXKKw().getValue() == null || OLrzqt().OLrzqt().getValue() == null) {
            return;
        }
        OLrzqt().AwvSrB();
        OLrzqt().zsXlph();
    }

    private final void QKVWgx() {
        getChildFragmentManager().setFragmentResultListener("bot_order", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vmy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C51427vmn.AEQbTJ(this.AEQbTJ, str, bundle);
            }
        });
    }

    public static final void AEQbTJ(C51427vmn c51427vmn, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c51427vmn.OLrzqt().EZpvd();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void sSMYrx() {
        java.lang.String tipLever = OLrzqt().AhwBna().getTipLever();
        if (C33129mqd.OLrzqt((java.lang.Object) tipLever, (java.lang.Object) 0)) {
            StrategyConfigInfo value = OLrzqt().OLrzqt().getValue();
            tipLever = value != null ? value.getDefaultLeverage() : null;
        } else {
            StrategyConfigInfo value2 = OLrzqt().OLrzqt().getValue();
            if (C33129mqd.AEQbTJ(tipLever, value2 != null ? value2.getMaxLever() : null)) {
            }
        }
        if (tipLever == null) {
            tipLever = "5";
        }
        values().AEQbTJ.EZpvd(tipLever);
    }

    private final void wlaJM() {
        AuCTel().OLrzqt();
    }

    private final void zLjUOn() {
        TradeCoinInfo tradeCoinInfoAhwBna;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        java.lang.String sizeDig = (interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(OLrzqt().djBIcL())) == null) ? null : tradeCoinInfoAhwBna.getSizeDig();
        OLrzqt().AEQbTJ(sizeDig != null ? C33129mqd.AhwBna(sizeDig) : 4);
        values().djBIcL.setMaxDecimal(OLrzqt().values());
        OLrzqt().AxsJAY();
        QOLQEE();
    }

    private final void QOLQEE() {
        getNewProxyInstance().AYXKKw();
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        getNewProxyInstance().EZpvd("signal_bot", (64 & 2) != 0 ? "cash" : "cross", (64 & 4) != 0 ? "" : "net_mode", (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : interfaceC54581xNrOLrzqt != null ? InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt, "SWAP", "BTC-USDT-SWAP", null, null, 12, null) : null, (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? null : null);
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.vTu.Application.newInstance$default(o.vTu$Application, java.lang.String, java.lang.String, com.okinc.unify_trade.biz.StrategyReqGroup, boolean, int, java.lang.Object):o.vTu */
    /* JADX INFO: Access modifiers changed from: private */
    public final void AxsJAY() {
        xOW newProxyInstance;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.QbewEr()) {
            OLrzqt().copydefault();
            AbstractC50583vTu abstractC50583vTuNewInstance$default = AbstractC50583vTu.Application.newInstance$default(AbstractC50583vTu.Companion, "", "", new StrategyReqGroup(OLrzqt().sSMYrx(), (IceBergReq) null, (TwapReq) null, (GridReq) null, (ContractGridReq) null, (StrategyMoveOrderReq) null, OLrzqt().fJNWhG(), (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, C54149wys.AEQbTJ.EZpvd(OLrzqt().OLrzqt().getValue()), (DcaOrderReq) null, (AiOrderReq) null, 28606, (DefaultConstructorMarker) null), false, 8, null);
            if (abstractC50583vTuNewInstance$default != null) {
                abstractC50583vTuNewInstance$default.show(getChildFragmentManager(), AbstractC50583vTu.class.getSimpleName());
            }
            return;
        }
        AbstractC49945uyC.showLoading$default(this, 0L, 1, null);
        pUU.KWHzl("BotOrder", "二次确认功能关闭 SignalCreateBotDialog Start Create Signal");
        OLrzqt().EZpvd();
    }

    private final void DTwDnp() {
        java.lang.String strCopydefault;
        java.lang.String minAmount;
        java.lang.String tipMinInvest = OLrzqt().AhwBna().getTipMinInvest();
        MultiMinAmountItem value = OLrzqt().isConnected().getValue();
        boolean zAEQbTJ = C33129mqd.AEQbTJ(tipMinInvest, value != null ? value.getMinAmount() : null);
        strCopydefault = "";
        if (zAEQbTJ) {
            values().djBIcL.setInputUnit("");
            xMR xmr = xMR.copydefault;
            java.lang.String tipMinInvest2 = OLrzqt().AhwBna().getTipMinInvest();
            strCopydefault = C33069mpW.copydefault(C55688xof.Application.OmPrLP, C56424yEw.gEmmrt(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, xmr.AhwBna(tipMinInvest2 != null ? tipMinInvest2 : "", OLrzqt().values())), C56390yDp.OLrzqt("ccy", OLrzqt().djBIcL())));
        } else {
            values().djBIcL.setInputUnit(OLrzqt().djBIcL());
            MultiMinAmountItem value2 = OLrzqt().isConnected().getValue();
            java.lang.String minAmount2 = value2 != null ? value2.getMinAmount() : null;
            if (minAmount2 != null && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) minAmount2)) {
                java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.invalidateMenu);
                java.lang.String strDjBIcL = OLrzqt().djBIcL();
                MultiMinAmountItem value3 = OLrzqt().isConnected().getValue();
                strCopydefault = strAYXKKw + " " + C56033xvF.fmtBotValueBySymbol$default(strDjBIcL, (value3 == null || (minAmount = value3.getMinAmount()) == null) ? "" : minAmount, RoundingMode.UP, false, null, false, null, null, null, null, null, 2040, null);
            }
        }
        C47988uAv.setInputLabel$default(values().djBIcL, strCopydefault, null, 2, null);
    }

    private final void getFieldNames() {
        if (values().djBIcL.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(values().djBIcL, false, 1, null);
        }
    }

    private final void gHZMYf() {
        OLrzqt().fJNWhG().setTotalAmt(values().djBIcL.AkhnZx());
        iwGUEr();
    }

    private final void OcIXYQ() {
        java.lang.String value = getNewProxyInstance().AhwBna().getValue();
        android.widget.TextView textView = values().copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility((value == null || !C33129mqd.AEQbTJ(values().djBIcL.AkhnZx(), C33129mqd.formatS$default(value, java.lang.Integer.valueOf(OLrzqt().values()), null, null, 6, null))) ? 8 : 0);
    }

    private final boolean iwGUEr() {
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) values().djBIcL.AkhnZx())) {
            values().djBIcL.copydefault();
            return true;
        }
        MultiMinAmountItem value = OLrzqt().isConnected().getValue();
        java.lang.String s$default = C33129mqd.formatS$default(value != null ? value.getMinAmount() : null, java.lang.Integer.valueOf(OLrzqt().values()), null, null, 6, null);
        if (C33129mqd.gEmmrt(OLrzqt().fJNWhG().getTotalAmt(), s$default)) {
            values().djBIcL.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.gGNlxh, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", C33070mpX.AYXKKw(C55688xof.Application.ActivityComposeUtilsKt)), C56390yDp.OLrzqt("minValue", xMR.copydefault.copydefault(s$default)), C56390yDp.OLrzqt("unit", OLrzqt().djBIcL()))));
            return false;
        }
        values().djBIcL.copydefault();
        return true;
    }

    public final void AEQbTJ(C51969vwz c51969vwz) {
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.IYdWPz);
        c51969vwz.KWHzl(C33069mpW.copydefault(C55688xof.Application.ikcuIV, C56423yEv.EZpvd(C56390yDp.OLrzqt("agreement", strAYXKKw))), strAYXKKw, C33070mpX.AYXKKw(C55688xof.Application.iMXFZQ));
    }

    public final void fARcdN() {
        uVA uvaValues = values();
        uvaValues.EZpvd.setEnabled(uvaValues.valueOf.AEQbTJ());
    }

    private final void RJOkX() {
        StrategyConfigInfo value = OLrzqt().OLrzqt().getValue();
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = values().isConnected;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.EZpvd(c54154wyx, value);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getNewProxyInstance().AYXKKw();
        values().djBIcL.setOnTextChangeCallback(null);
        values().AEQbTJ.setOnLeverChangeCallback(null);
    }
}
