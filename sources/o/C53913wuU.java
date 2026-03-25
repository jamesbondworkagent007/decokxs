package o;

import android.os.Build;
import android.view.View;
import android.widget.CompoundButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.core.view.PointerIconCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.tradeapi.bean.CurrencyModel;
import com.okinc.tradeapi.framework.constant.TradeKey;
import com.okinc.tradeuilib.widget.oktinputlayout.core.InputLayoutState;
import com.okinc.tradingbot.impl.strategy.dialog.SpotGridAddInvestmentDialog$setupViewModel$2;
import com.okinc.tradingbot.impl.strategy.dialog.SpotGridAddInvestmentDialog$setupViewModel$3;
import com.okinc.uilab.reminder.OKReminder;
import com.okinc.unify_trade.biz.BaseInstrument;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.SpotGridAddInvestmentInfo;
import com.okinc.unify_trade.biz.SpotInstrument;
import com.okinc.unify_trade.biz.TradeCoinInfo;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.net.BizApiService;
import java.math.BigDecimal;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import o.C48033uCm;
import o.C52761wXj;
import o.C55688xof;
import o.InterfaceC54581xNr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wuU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C53913wuU extends wXX {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public BigDecimal AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm DbNXlk;
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public wYF copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public uQN isConnected;
    public boolean valueOf;
    public final InterfaceC56387yDm values;

    /* JADX INFO: renamed from: o.wuU$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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

    @Override // o.wXX
    public boolean getHasFooter() {
        return true;
    }

    /* JADX INFO: renamed from: o.wuU$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wuU.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C53913wuU AEQbTJ(TacticsData tacticsData, @NotNull SpotGridAddInvestmentInfo spotGridAddInvestmentInfo) {
            Intrinsics.checkNotNullParameter(spotGridAddInvestmentInfo, "");
            C53913wuU c53913wuU = new C53913wuU();
            c53913wuU.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("KEY_TACTICS_DATA", tacticsData), C56390yDp.OLrzqt("KEY_ADD_INVESTMENT_INFO", spotGridAddInvestmentInfo)));
            return c53913wuU;
        }
    }

    public C53913wuU() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.SpotGridAddInvestmentDialog$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.SpotGridAddInvestmentDialog$special$$inlined$viewModels$default$2
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
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.SpotGridAddInvestmentDialog$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.SpotGridAddInvestmentDialog$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.SpotGridAddInvestmentDialog$special$$inlined$viewModels$default$5
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.SpotGridAddInvestmentDialog$special$$inlined$viewModels$default$6
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.SpotGridAddInvestmentDialog$special$$inlined$viewModels$default$7
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
        this.fetchVPNInfo = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(wTC.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.SpotGridAddInvestmentDialog$special$$inlined$viewModels$default$8
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.SpotGridAddInvestmentDialog$special$$inlined$viewModels$default$9
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.dialog.SpotGridAddInvestmentDialog$special$$inlined$viewModels$default$10
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
        this.AYXKKw = new BigDecimal(0);
        this.KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wuV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53913wuU.fetchVPNInfo(this.copydefault);
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.wuW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Integer.valueOf(C53913wuU.fARcdN(this.EZpvd));
            }
        });
        this.DbNXlk = C56392yDr.copydefault(new Function0() { // from class: o.wuZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53913wuU.ejfBZ(this.KWHzl);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.wvc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53913wuU.AuCTel(this.KWHzl);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.wvb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53913wuU.fJNWhG(this.OLrzqt);
            }
        });
        this.values = C56392yDr.copydefault(new Function0() { // from class: o.wuY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53913wuU.fIwbmz(this.EZpvd);
            }
        });
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wvd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C53913wuU.isConnected(this.copydefault);
            }
        });
    }

    private final C55915xsu values() {
        return (C55915xsu) this.OLrzqt.getValue();
    }

    public final wTC AhwBna() {
        return (wTC) this.fetchVPNInfo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C55887xsS isConnected() {
        return (C55887xsS) this.KWHzl.getValue();
    }

    public static final C55887xsS fetchVPNInfo(C53913wuU c53913wuU) {
        java.lang.String instType;
        java.lang.String tradeQuoteCcy;
        java.lang.String instId;
        TacticsData tacticsDataDbNXlk = c53913wuU.DbNXlk();
        java.lang.String str = "";
        if (tacticsDataDbNXlk == null || (instType = tacticsDataDbNXlk.getInstType()) == null) {
            instType = "";
        }
        TacticsData tacticsDataDbNXlk2 = c53913wuU.DbNXlk();
        if (tacticsDataDbNXlk2 != null && (instId = tacticsDataDbNXlk2.getInstId()) != null) {
            str = instId;
        }
        C55887xsS c55887xsS = new C55887xsS(instType, str);
        TacticsData tacticsDataDbNXlk3 = c53913wuU.DbNXlk();
        if (tacticsDataDbNXlk3 == null || (tradeQuoteCcy = tacticsDataDbNXlk3.getTradeQuoteCcy()) == null || !java.lang.Boolean.valueOf(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) tradeQuoteCcy)).booleanValue()) {
            tradeQuoteCcy = null;
        }
        c55887xsS.gEmmrt(tradeQuoteCcy);
        return c55887xsS;
    }

    public final int valueOf() {
        return ((java.lang.Number) this.AhwBna.getValue()).intValue();
    }

    public static final int fARcdN(C53913wuU c53913wuU) {
        java.lang.String instType;
        java.lang.String strCopydefault;
        java.lang.String instFamily;
        java.lang.String instType2;
        C54589xNz c54589xNz = C54589xNz.EZpvd;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null) {
            return 2;
        }
        TacticsData tacticsDataDbNXlk = c53913wuU.DbNXlk();
        java.lang.String str = "";
        if (tacticsDataDbNXlk == null || (instType = tacticsDataDbNXlk.getInstType()) == null) {
            instType = "";
        }
        AbstractC54531xLw abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(instType);
        if (abstractC54531xLwOLrzqt == null) {
            return 2;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 != null) {
            TacticsData tacticsDataDbNXlk2 = c53913wuU.DbNXlk();
            java.lang.String str2 = (tacticsDataDbNXlk2 == null || (instType2 = tacticsDataDbNXlk2.getInstType()) == null) ? "" : instType2;
            TacticsData tacticsDataDbNXlk3 = c53913wuU.DbNXlk();
            BizInstrument suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, str2, tacticsDataDbNXlk3 != null ? tacticsDataDbNXlk3.getInstId() : null, null, null, 12, null);
            if (suggestedInstrument$default != null && (instFamily = suggestedInstrument$default.getInstFamily()) != null) {
                str = instFamily;
            }
        }
        xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, str, null, 2, null);
        if (xmvCreateSizeConverterWithIndex$default == null || (strCopydefault = xmvCreateSizeConverterWithIndex$default.copydefault()) == null) {
            return 2;
        }
        return C33129mqd.AhwBna(strCopydefault);
    }

    public final java.lang.String gEmmrt() {
        return (java.lang.String) this.DbNXlk.getValue();
    }

    public static final java.lang.String ejfBZ(C53913wuU c53913wuU) {
        java.lang.String trailingDownFund;
        SpotGridAddInvestmentInfo spotGridAddInvestmentInfoOLrzqt = c53913wuU.OLrzqt();
        if (spotGridAddInvestmentInfoOLrzqt == null || (trailingDownFund = spotGridAddInvestmentInfoOLrzqt.getTrailingDownFund()) == null) {
            trailingDownFund = "0";
        }
        return C53930wul.copydefault(pTB.formatRoundToFixed$default(pTB.OLrzqt((java.lang.Object) trailingDownFund), c53913wuU.valueOf(), null, 2, null), c53913wuU.isConnected().copydefault("grid"));
    }

    public final BigDecimal AYXKKw() {
        return (BigDecimal) this.gEmmrt.getValue();
    }

    public static final BigDecimal AuCTel(C53913wuU c53913wuU) {
        java.lang.String profit;
        SpotGridAddInvestmentInfo spotGridAddInvestmentInfoOLrzqt = c53913wuU.OLrzqt();
        if (spotGridAddInvestmentInfoOLrzqt == null || (profit = spotGridAddInvestmentInfoOLrzqt.getProfit()) == null) {
            profit = "0";
        }
        return pTB.OLrzqt((java.lang.Object) profit);
    }

    public final BigDecimal copydefault() {
        return (BigDecimal) this.djBIcL.getValue();
    }

    public static final BigDecimal fJNWhG(C53913wuU c53913wuU) {
        java.lang.String minAdditionalInvestment;
        SpotGridAddInvestmentInfo spotGridAddInvestmentInfoOLrzqt = c53913wuU.OLrzqt();
        if (spotGridAddInvestmentInfoOLrzqt == null || (minAdditionalInvestment = spotGridAddInvestmentInfoOLrzqt.getMinAdditionalInvestment()) == null) {
            minAdditionalInvestment = "0";
        }
        return pTB.OLrzqt((java.lang.Object) minAdditionalInvestment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TacticsData DbNXlk() {
        return (TacticsData) this.values.getValue();
    }

    public static final TacticsData fIwbmz(C53913wuU c53913wuU) {
        java.lang.Object parcelable;
        android.os.Bundle arguments = c53913wuU.getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = arguments.getParcelable("KEY_TACTICS_DATA", TacticsData.class);
        } else {
            java.lang.Object parcelable2 = arguments.getParcelable("KEY_TACTICS_DATA");
            parcelable = (TacticsData) (parcelable2 instanceof TacticsData ? parcelable2 : null);
        }
        return (TacticsData) parcelable;
    }

    public final SpotGridAddInvestmentInfo OLrzqt() {
        return (SpotGridAddInvestmentInfo) this.AEQbTJ.getValue();
    }

    public static final SpotGridAddInvestmentInfo isConnected(C53913wuU c53913wuU) {
        java.lang.Object parcelable;
        android.os.Bundle arguments = c53913wuU.getArguments();
        if (arguments == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = arguments.getParcelable("KEY_ADD_INVESTMENT_INFO", SpotGridAddInvestmentInfo.class);
        } else {
            java.lang.Object parcelable2 = arguments.getParcelable("KEY_ADD_INVESTMENT_INFO");
            parcelable = (SpotGridAddInvestmentInfo) (parcelable2 instanceof SpotGridAddInvestmentInfo ? parcelable2 : null);
        }
        return (SpotGridAddInvestmentInfo) parcelable;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(5);
        wxq.AEQbTJ().setVisibility(8);
        wxq.setTitle(C33070mpX.OLrzqt(C55688xof.Application.MediaBrowserCompatSubscriptionCallback, requireContext()));
        wxq.AYXKKw().setTextSize(16.0f);
        wxq.setDividerVisibility(true);
        wxq.KWHzl().setVisibility(0);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Activity(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        android.app.Dialog dialog = getDialog();
        BottomSheetDialog bottomSheetDialog = dialog instanceof BottomSheetDialog ? (BottomSheetDialog) dialog : null;
        if (bottomSheetDialog != null) {
            bottomSheetDialog.getBehavior().setDraggable(false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        java.lang.String instId;
        super.onResume();
        if (DbNXlk() == null) {
            return;
        }
        values().AYXKKw();
        C55915xsu c55915xsuValues = values();
        TacticsData tacticsDataDbNXlk = DbNXlk();
        if (tacticsDataDbNXlk == null || (instId = tacticsDataDbNXlk.getInstId()) == null) {
            instId = "";
        }
        SpotInstrument spotInstrument = new SpotInstrument(new BaseInstrument("SPOT", instId, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, PointerIconCompat.TYPE_GRAB, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 1, null);
        TacticsData tacticsDataDbNXlk2 = DbNXlk();
        c55915xsuValues.EZpvd("grid", (64 & 2) != 0 ? "cash" : null, (64 & 4) != 0 ? "" : null, (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : spotInstrument, (64 & 64) != 0 ? null : null, (64 & 128) == 0 ? tacticsDataDbNXlk2 != null ? tacticsDataDbNXlk2.getTradeQuoteCcy() : null : null);
    }

    /* JADX INFO: renamed from: o.wuU$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C53913wuU EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ java.lang.String OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C53913wuU c53913wuU, java.lang.String str) {
            this.AEQbTJ = view;
            this.KWHzl = j;
            this.EZpvd = c53913wuU;
            this.OLrzqt = str;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            TradeCoinInfo tradeCoinInfoAhwBna;
            java.lang.String id;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.KWHzl || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                InterfaceC49497upf interfaceC49497upf = (InterfaceC49497upf) ((InterfaceC49425uoM) C43251rlk.copydefault(InterfaceC49425uoM.class)).KWHzl(TradeKey.TRADE_UI);
                FragmentActivity fragmentActivityRequireActivity = this.EZpvd.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                interfaceC49497upf.OLrzqt(fragmentActivityRequireActivity, new CurrencyModel((interfaceC54581xNrOLrzqt == null || (tradeCoinInfoAhwBna = interfaceC54581xNrOLrzqt.AhwBna(this.OLrzqt)) == null || (id = tradeCoinInfoAhwBna.getId()) == null) ? -1 : C33129mqd.AhwBna(id), this.OLrzqt), false);
            }
        }
    }

    /* JADX INFO: renamed from: o.wuU$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C53913wuU EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C53913wuU c53913wuU) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.EZpvd = c53913wuU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.EZpvd.dismissAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: renamed from: o.wuU$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C53913wuU EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C53913wuU c53913wuU) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.EZpvd = c53913wuU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            java.lang.String strAkhnZx;
            C47988uAv c47988uAv;
            wYK wyk;
            uQN uqn;
            C47988uAv c47988uAv2;
            C47988uAv c47988uAv3;
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                uQN uqn2 = this.EZpvd.isConnected;
                if (!C33129mqd.OLrzqt((java.lang.CharSequence) ((uqn2 == null || (c47988uAv3 = uqn2.OLrzqt) == null) ? null : c47988uAv3.AkhnZx())) || (uqn = this.EZpvd.isConnected) == null || (c47988uAv2 = uqn.OLrzqt) == null || (strAkhnZx = c47988uAv2.AkhnZx()) == null) {
                    strAkhnZx = "0";
                }
                java.lang.String str = strAkhnZx;
                if (this.EZpvd.valueOf) {
                    TacticsData tacticsDataDbNXlk = this.EZpvd.DbNXlk();
                    if (tacticsDataDbNXlk != null) {
                        wTC wtcAhwBna = this.EZpvd.AhwBna();
                        java.lang.String algoId = tacticsDataDbNXlk.getAlgoId();
                        uQN uqn3 = this.EZpvd.isConnected;
                        wtcAhwBna.copydefault(algoId, (uqn3 == null || (wyk = uqn3.AYXKKw) == null) ? false : wyk.isChecked(), str, Dispatchers.getIO(), (BizApiService) C43393roT.httpService$default(C56524yIo.AEQbTJ(BizApiService.class), null, 1, null));
                        return;
                    }
                    return;
                }
                uQN uqn4 = this.EZpvd.isConnected;
                if (uqn4 == null || (c47988uAv = uqn4.OLrzqt) == null) {
                    return;
                }
                c47988uAv.setInputFocus();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        values().AYXKKw();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.isConnected = uQN.AEQbTJ(android.view.LayoutInflater.from(requireContext()), constraintLayout, true);
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AuCTel();
        fARcdN();
    }

    @Override // o.wXX
    public void onFooterCreated(@NotNull wYF wyf) {
        Intrinsics.checkNotNullParameter(wyf, "");
        super.onFooterCreated(wyf);
        wyf.setType(5);
        wyf.setOKDSSize(52);
        wyf.setPrimaryText(C33070mpX.AYXKKw(C48033uCm.Fragment.hrNTAI));
        this.copydefault = wyf;
        this.valueOf = false;
        wyf.setOnClickListener(new Application(wyf, 1000L, this));
    }

    private final void fARcdN() {
        values().AhwBna().observe(this, new StateListAnimator(new Function1() { // from class: o.wvh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53913wuU.KWHzl(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SpotGridAddInvestmentDialog$setupViewModel$2(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), null, null, new SpotGridAddInvestmentDialog$setupViewModel$3(this, null), 3, null);
    }

    public static final Unit KWHzl(C53913wuU c53913wuU, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c53913wuU.AYXKKw = pTB.OLrzqt((java.lang.Object) str);
        c53913wuU.djBIcL();
        return Unit.INSTANCE;
    }

    private final void AuCTel() {
        ConstraintLayout constraintLayout;
        OKReminder oKReminder;
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.TextView textView4;
        TrailingConfig trailingDownConfig;
        OKReminder oKReminder2;
        android.widget.TextView textView5;
        ConstraintLayout constraintLayout2;
        TacticsData tacticsDataDbNXlk = DbNXlk();
        if (tacticsDataDbNXlk == null || (trailingDownConfig = tacticsDataDbNXlk.getTrailingDownConfig()) == null || !trailingDownConfig.getEnabled()) {
            uQN uqn = this.isConnected;
            if (uqn != null && (oKReminder = uqn.AuCTel) != null) {
                oKReminder.setVisibility(8);
            }
            uQN uqn2 = this.isConnected;
            if (uqn2 != null && (constraintLayout = uqn2.values) != null) {
                constraintLayout.setVisibility(8);
            }
        } else {
            uQN uqn3 = this.isConnected;
            if (uqn3 != null && (constraintLayout2 = uqn3.values) != null) {
                constraintLayout2.setVisibility(0);
            }
            uQN uqn4 = this.isConnected;
            if (uqn4 != null && (textView5 = uqn4.isConnected) != null) {
                textView5.setText(gEmmrt());
            }
            uQN uqn5 = this.isConnected;
            if (uqn5 != null && (oKReminder2 = uqn5.AuCTel) != null) {
                oKReminder2.setMessage(C33069mpW.copydefault(this, C48033uCm.Fragment.HJWChPQPAeHI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(OtcExtraKeys.AMOUNT, gEmmrt()))));
                oKReminder2.setStyle(2);
                oKReminder2.setCloseIconVisibility(false);
                oKReminder2.setVisibility(0);
            }
        }
        uQN uqn6 = this.isConnected;
        if (uqn6 != null && (textView4 = uqn6.fetchVPNInfo) != null) {
            textView4.setText(C53930wul.copydefault(pTB.formatRoundToFixed$default(AYXKKw(), valueOf(), null, 2, null), isConnected().copydefault("grid")));
        }
        if (AYXKKw().compareTo(BigDecimal.ZERO) > 0) {
            uQN uqn7 = this.isConnected;
            if (uqn7 != null && (textView3 = uqn7.fetchVPNInfo) != null) {
                C33512mxp c33512mxp = C33512mxp.AEQbTJ;
                android.content.Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                textView3.setTextColor(C33512mxp.tradeRise$default(c33512mxp, contextRequireContext, 0.0f, 2, null));
            }
        } else {
            uQN uqn8 = this.isConnected;
            if (uqn8 != null && (textView = uqn8.fetchVPNInfo) != null) {
                int i = C52761wXj.Activity.DQYQgr;
                android.content.Context contextRequireContext2 = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext2, "");
                textView.setTextColor(C33070mpX.OLrzqt(i, contextRequireContext2));
            }
        }
        uQN uqn9 = this.isConnected;
        if (uqn9 != null && (textView2 = uqn9.copydefault) != null) {
            textView2.setVisibility(8);
        }
        fetchVPNInfo();
        AkhnZx();
    }

    private final void fetchVPNInfo() {
        final C47988uAv c47988uAv;
        uQN uqn = this.isConnected;
        if (uqn == null || (c47988uAv = uqn.OLrzqt) == null) {
            return;
        }
        c47988uAv.copydefault();
        C47988uAv.setInputLabel$default(c47988uAv, C33069mpW.OLrzqt(C33070mpX.AYXKKw(C48033uCm.Fragment.getLocation), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatDownToFixed$default(EZpvd(), valueOf(), null, 2, null)))), null, 2, null);
        C47988uAv.setInputLayoutState$default(c47988uAv, InputLayoutState.NORMAL, false, 2, null);
        c47988uAv.setInputUnit(isConnected().copydefault("grid"));
        c47988uAv.setMaxDecimal(valueOf());
        final Function2<? super C47988uAv, ? super java.lang.String, Unit> function2 = new Function2() { // from class: o.wve
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C53913wuU.copydefault(c47988uAv, this, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        c47988uAv.setOnTextChangeCallback(function2);
        c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.wvg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C53913wuU.OLrzqt(c47988uAv, this, function2, ((java.lang.Float) obj).floatValue());
            }
        });
    }

    public static final Unit copydefault(C47988uAv c47988uAv, C53913wuU c53913wuU, C47988uAv c47988uAv2, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv2, "");
        if (c47988uAv.zLjUOn()) {
            C47988uAv.clearSeekBarData$default(c47988uAv, false, 1, null);
        }
        c53913wuU.KWHzl();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C47988uAv c47988uAv, C53913wuU c53913wuU, Function2 function2, float f) {
        if (!c47988uAv.zLjUOn()) {
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
        } else {
            c47988uAv.setOnTextChangeCallback(null);
            C47988uAv.setInputContent$default(c47988uAv, c53913wuU.OLrzqt(c47988uAv.fJNWhG()), false, false, 6, null);
            c47988uAv.setOnTextChangeCallback(function2);
        }
        c53913wuU.KWHzl();
        return Unit.INSTANCE;
    }

    private final void AkhnZx() {
        wYK wyk;
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        java.lang.String strCopydefault = isConnected().copydefault("grid");
        uQN uqn = this.isConnected;
        if (uqn != null && (imageView2 = uqn.AEQbTJ) != null) {
            imageView2.setVisibility(C54589xNz.EZpvd.EZpvd() ^ true ? 0 : 8);
        }
        uQN uqn2 = this.isConnected;
        if (uqn2 != null && (imageView = uqn2.AEQbTJ) != null) {
            imageView.setOnClickListener(new ActionBar(imageView, 1000L, this, strCopydefault));
        }
        uQN uqn3 = this.isConnected;
        if (uqn3 == null || (wyk = uqn3.AYXKKw) == null) {
            return;
        }
        wyk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.wva
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C53913wuU.AEQbTJ(this.copydefault, compoundButton, z);
            }
        });
    }

    public static final void AEQbTJ(C53913wuU c53913wuU, android.widget.CompoundButton compoundButton, boolean z) {
        ConstraintLayout constraintLayout;
        wYK wyk;
        C47988uAv c47988uAv;
        uQN uqn = c53913wuU.isConnected;
        if (uqn != null && (c47988uAv = uqn.OLrzqt) != null) {
            C47988uAv.setInputLabel$default(c47988uAv, C33069mpW.OLrzqt(C33070mpX.AYXKKw(C48033uCm.Fragment.getLocation), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatDownToFixed$default(c53913wuU.EZpvd(), c53913wuU.valueOf(), null, 2, null)))), null, 2, null);
        }
        uQN uqn2 = c53913wuU.isConnected;
        if (uqn2 != null && (constraintLayout = uqn2.AkhnZx) != null) {
            constraintLayout.setVisibility((uqn2 == null || (wyk = uqn2.AYXKKw) == null || !wyk.isChecked()) ? 8 : 0);
        }
        c53913wuU.KWHzl();
    }

    public final void djBIcL() {
        android.widget.TextView textView;
        uQN uqn = this.isConnected;
        if (uqn != null && (textView = uqn.djBIcL) != null) {
            C55915xsu c55915xsuValues = values();
            C55887xsS c55887xsSIsConnected = isConnected();
            java.lang.String plainString = this.AYXKKw.toPlainString();
            Intrinsics.checkNotNullExpressionValue(plainString, "");
            textView.setText(c55915xsuValues.KWHzl(c55887xsSIsConnected, plainString, isConnected().AEQbTJ("grid")));
        }
        KWHzl();
    }

    public final void KWHzl() {
        C47988uAv c47988uAv;
        android.widget.TextView textView;
        C47988uAv c47988uAv2;
        android.widget.TextView textView2;
        C47988uAv c47988uAv3;
        C47988uAv c47988uAv4;
        android.widget.TextView textView3;
        C47988uAv c47988uAv5;
        android.widget.TextView textView4;
        C47988uAv c47988uAv6;
        android.widget.TextView textView5;
        C47988uAv c47988uAv7;
        C47988uAv c47988uAv8;
        uQN uqn = this.isConnected;
        java.lang.String strAkhnZx = null;
        if (C33129mqd.OLrzqt((java.lang.CharSequence) ((uqn == null || (c47988uAv8 = uqn.OLrzqt) == null) ? null : c47988uAv8.AkhnZx()))) {
            uQN uqn2 = this.isConnected;
            BigDecimal bigDecimalOLrzqt = pTB.OLrzqt((java.lang.Object) ((uqn2 == null || (c47988uAv7 = uqn2.OLrzqt) == null) ? null : c47988uAv7.AkhnZx()));
            if (bigDecimalOLrzqt.compareTo(EZpvd()) < 0) {
                uQN uqn3 = this.isConnected;
                if (uqn3 != null && (textView5 = uqn3.copydefault) != null) {
                    textView5.setVisibility(8);
                }
                uQN uqn4 = this.isConnected;
                if (uqn4 != null && (c47988uAv6 = uqn4.OLrzqt) != null) {
                    c47988uAv6.setInputErrorMsg(C33069mpW.copydefault(C55688xof.Application.gGNlxh, C56424yEw.gEmmrt(C56390yDp.OLrzqt("fieldName", getString(C55688xof.Application.MediaControllerCompatApi24TransportControls)), C56390yDp.OLrzqt("minValue", pTB.formatDownToFixed$default(EZpvd(), valueOf(), null, 2, null)), C56390yDp.OLrzqt("unit", isConnected().copydefault("grid")))));
                }
                this.valueOf = false;
                return;
            }
            if (bigDecimalOLrzqt.compareTo(this.AYXKKw) > 0) {
                uQN uqn5 = this.isConnected;
                if (uqn5 != null && (textView4 = uqn5.copydefault) != null) {
                    textView4.setVisibility(0);
                }
                uQN uqn6 = this.isConnected;
                if (uqn6 != null && (c47988uAv5 = uqn6.OLrzqt) != null) {
                    c47988uAv5.copydefault();
                }
                this.valueOf = false;
                return;
            }
            uQN uqn7 = this.isConnected;
            if (uqn7 != null && (textView3 = uqn7.copydefault) != null) {
                textView3.setVisibility(8);
            }
            uQN uqn8 = this.isConnected;
            if (uqn8 != null && (c47988uAv4 = uqn8.OLrzqt) != null) {
                c47988uAv4.copydefault();
            }
            this.valueOf = true;
            return;
        }
        uQN uqn9 = this.isConnected;
        if (uqn9 != null && (c47988uAv3 = uqn9.OLrzqt) != null) {
            strAkhnZx = c47988uAv3.AkhnZx();
        }
        if ((strAkhnZx == null || strAkhnZx.length() == 0) && AEQbTJ()) {
            uQN uqn10 = this.isConnected;
            if (uqn10 != null && (textView = uqn10.copydefault) != null) {
                textView.setVisibility(8);
            }
            uQN uqn11 = this.isConnected;
            if (uqn11 != null && (c47988uAv = uqn11.OLrzqt) != null) {
                c47988uAv.copydefault();
            }
            this.valueOf = true;
            return;
        }
        uQN uqn12 = this.isConnected;
        if (uqn12 != null && (textView2 = uqn12.copydefault) != null) {
            textView2.setVisibility(8);
        }
        uQN uqn13 = this.isConnected;
        if (uqn13 != null && (c47988uAv2 = uqn13.OLrzqt) != null) {
            c47988uAv2.copydefault();
        }
        this.valueOf = false;
    }

    public final boolean AEQbTJ() {
        uQN uqn;
        wYK wyk;
        return AYXKKw().compareTo(copydefault()) >= 0 && (uqn = this.isConnected) != null && (wyk = uqn.AYXKKw) != null && wyk.isChecked();
    }

    public final BigDecimal EZpvd() {
        wYK wyk;
        uQN uqn = this.isConnected;
        if (uqn != null && (wyk = uqn.AYXKKw) != null && wyk.isChecked()) {
            if (copydefault().compareTo(AYXKKw()) >= 0) {
                BigDecimal bigDecimalSubtract = copydefault().subtract(AYXKKw());
                Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "");
                return bigDecimalSubtract;
            }
            BigDecimal bigDecimal = BigDecimal.ZERO;
            Intrinsics.copydefault(bigDecimal);
            return bigDecimal;
        }
        return copydefault();
    }

    public final java.lang.String OLrzqt(float f) {
        C54589xNz c54589xNz;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        java.lang.String instFamily;
        C54536xML c54536xMLOLrzqt;
        C54536xML c54536xMLCopydefault;
        java.lang.String safeString$default;
        BizInstrument suggestedInstrument$default;
        TacticsData tacticsDataDbNXlk = DbNXlk();
        if (tacticsDataDbNXlk == null || (interfaceC54581xNrOLrzqt = (c54589xNz = C54589xNz.EZpvd).OLrzqt()) == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrOLrzqt.OLrzqt(tacticsDataDbNXlk.getInstType())) == null) {
            return "";
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt2 = c54589xNz.OLrzqt();
        if (interfaceC54581xNrOLrzqt2 == null || (suggestedInstrument$default = InterfaceC54581xNr.TaskDescription.getSuggestedInstrument$default(interfaceC54581xNrOLrzqt2, tacticsDataDbNXlk.getInstType(), tacticsDataDbNXlk.getInstId(), null, null, 12, null)) == null || (instFamily = suggestedInstrument$default.getInstFamily()) == null) {
            instFamily = "";
        }
        xMV xmvCreateSizeConverterWithIndex$default = AbstractC54531xLw.createSizeConverterWithIndex$default(abstractC54531xLwOLrzqt, instFamily, null, 2, null);
        return (xmvCreateSizeConverterWithIndex$default == null || (c54536xMLOLrzqt = xmvCreateSizeConverterWithIndex$default.OLrzqt(C33129mqd.mulS$default(java.lang.Float.valueOf(f), this.AYXKKw, null, null, null, 14, null))) == null || (c54536xMLCopydefault = c54536xMLOLrzqt.copydefault()) == null || (safeString$default = C54536xML.toSafeString$default(c54536xMLCopydefault, false, 1, null)) == null) ? "" : safeString$default;
    }
}
