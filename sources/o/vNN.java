package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.okinc.biz.TradeType;
import com.okinc.business.defi.wallet.transaction.moduleModel.bean.DataInputModuleModel;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import com.okinc.liveness.lca.EopTrackEvent;
import com.okinc.p2p.api.OtcExtraKeys;
import com.okinc.rxutils.RxBus;
import com.okinc.tradingbot.impl.order.strategy.dialog.PriceOutOfRangeBottomSheet;
import com.okinc.tradingbot.impl.order.strategy.grid.SpotGridFragment$initListener$1$1;
import com.okinc.tradingbot.impl.order.strategy.grid.SpotGridFragment$subscribeOnUIChange$15;
import com.okinc.tradingbot.impl.order.strategy.grid.domain.SmartEarnParamsCheckUseCase;
import com.okinc.tradingbot.impl.order.strategy.ordercomfirm.BotOrderConfirmFragment;
import com.okinc.tradingbot.impl.utils.PriceRangeUtil;
import com.okinc.unify_trade.biz.AIData;
import com.okinc.unify_trade.biz.AdditionalInvest;
import com.okinc.unify_trade.biz.AiOrderReq;
import com.okinc.unify_trade.biz.BizInstrument;
import com.okinc.unify_trade.biz.BotUserConfigInfo;
import com.okinc.unify_trade.biz.ContractGridReq;
import com.okinc.unify_trade.biz.DcaOrderReq;
import com.okinc.unify_trade.biz.DcdOrderReq;
import com.okinc.unify_trade.biz.DigitInfoBean;
import com.okinc.unify_trade.biz.GridNumRangeBean;
import com.okinc.unify_trade.biz.GridProfitRateResp;
import com.okinc.unify_trade.biz.IceBergReq;
import com.okinc.unify_trade.biz.IdxConfig;
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
import com.okinc.unify_trade.biz.TicketEligibility;
import com.okinc.unify_trade.biz.TrailingConfig;
import com.okinc.unify_trade.biz.TrailingPxResp;
import com.okinc.unify_trade.biz.TwapReq;
import com.okinc.unify_trade.biz.bot.EarnType;
import com.okinc.unify_trade.biz.bot.SmartEarnConfig;
import com.okinc.unify_trade.biz.bot.SmartEarnRequestParam;
import com.okinc.unify_trade.biz.bot.SmartRecommendResp;
import com.okinc.unify_trade.biz.bot.StgyParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParam;
import com.okinc.unify_trade.biz.bot.TpSlTriggerParamReqResp;
import com.okinc.unify_trade.bot.config.AiBackTestCycle;
import com.okinc.unify_trade.bot.config.GridStartTriggerType;
import com.okinc.unify_trade.bot.data.BotGrafanaInfo;
import com.okinc.unify_trade.bot.grid.viewmodel.SpotGridPresenter;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.math.RoundingMode;
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
import o.wYX;
import o.xMJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class vNN extends AbstractC48165uHj<uPQ, SpotGridPresenter> implements ViewModelStoreOwner {
    private static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public java.lang.String AYXKKw;
    public final Function2<C47988uAv, java.lang.Boolean, Unit> AhwBna;
    public java.util.List<java.lang.String> AkhnZx;
    public final java.lang.Runnable DbNXlk;
    public final InterfaceC56387yDm EZpvd;
    public final java.lang.Runnable OLrzqt;
    public kotlin.Pair<java.lang.Boolean, java.lang.String> copydefault;
    public final Function2<C47988uAv, java.lang.String, Unit> djBIcL;
    public InterfaceC53558wnk ejfBZ;
    public final InterfaceC56387yDm fJNWhG;
    public kotlin.Pair<java.lang.Boolean, java.lang.String> fetchVPNInfo;
    public final InterfaceC56387yDm gEmmrt;
    public final int isConnected = C48033uCm.Activity.RVsVBY;
    public final InterfaceC56387yDm valueOf;
    public vSY values;

    /* JADX INFO: loaded from: classes19.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] copydefault;

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
            copydefault = iArr;
        }
    }

    public static final /* synthetic */ class PictureInPictureParams implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PictureInPictureParams(Function1 function1) {
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
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.isConnected;
    }

    public vNN() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.SpotGridFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.SpotGridFragment$special$$inlined$viewModels$default$2
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C55915xsu.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.SpotGridFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.SpotGridFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.order.strategy.grid.SpotGridFragment$special$$inlined$viewModels$default$5
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.vOh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vNN.zLjUOn(this.AEQbTJ);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.vOk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vNN.wlaJM(this.OLrzqt);
            }
        });
        this.AYXKKw = "";
        this.fJNWhG = C56392yDr.copydefault(new Function0() { // from class: o.vOm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vNN.AEQbTJ();
            }
        });
        this.AhwBna = new Function2() { // from class: o.vOl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vNN.KWHzl(this.copydefault, (C47988uAv) obj, ((java.lang.Boolean) obj2).booleanValue());
            }
        };
        this.djBIcL = new Function2() { // from class: o.vOn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return vNN.copydefault(this.AEQbTJ, (C47988uAv) obj, (java.lang.String) obj2);
            }
        };
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        this.fetchVPNInfo = new kotlin.Pair<>(bool, "");
        this.DbNXlk = new java.lang.Runnable() { // from class: o.vOs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                vNN.QKVWgx(this.EZpvd);
            }
        };
        this.copydefault = new kotlin.Pair<>(bool, "");
        this.OLrzqt = new java.lang.Runnable() { // from class: o.vOo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                vNN.hDKMBd(this.copydefault);
            }
        };
        this.AkhnZx = yDY.AhwBna();
        this.AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.vOq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vNN.iwGUEr(this.KWHzl);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ SpotGridPresenter fARcdN(vNN vnn) {
        return (SpotGridPresenter) vnn.dxcTrN();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ uPQ fIwbmz(vNN vnn) {
        return (uPQ) vnn.gGvvIC();
    }

    private final C55915xsu OcIXYQ() {
        return (C55915xsu) this.EZpvd.getValue();
    }

    public final C53492wmX valueOf() {
        return (C53492wmX) this.valueOf.getValue();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C53492wmX zLjUOn(vNN vnn) {
        uPQ upq = (uPQ) vnn.gGvvIC();
        androidx.fragment.app.FragmentManager childFragmentManager = vnn.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        return new C53492wmX(upq, childFragmentManager);
    }

    private final C53518wmx QKVWgx() {
        return (C53518wmx) this.gEmmrt.getValue();
    }

    public static final C53518wmx wlaJM(vNN vnn) {
        android.content.Context contextRequireContext = vnn.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C53518wmx(contextRequireContext, null, 0, 6, null);
    }

    /* JADX DEBUG: Method merged with bridge method: gEmmrt()Landroid/view/View; */
    @Override // o.AbstractC48165uHj
    /* JADX INFO: renamed from: AYXKKw, reason: merged with bridge method [inline-methods] */
    public C53518wmx gEmmrt() {
        return QKVWgx();
    }

    @Override // o.AbstractC48165uHj, o.AbstractC56129xww, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C56028xvA.registerBotFragmentTrack$default(this, "SpotGridFragment", new kotlin.Pair[0], null, 8, null);
    }

    public final SmartEarnParamsCheckUseCase djBIcL() {
        return (SmartEarnParamsCheckUseCase) this.fJNWhG.getValue();
    }

    public static final SmartEarnParamsCheckUseCase AEQbTJ() {
        return new SmartEarnParamsCheckUseCase(Dispatchers.getDefault());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r10v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r10v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r10v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r10v18, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r10v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(vNN vnn, C47988uAv c47988uAv, boolean z) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        if (Intrinsics.EZpvd(c47988uAv, ((uPQ) vnn.gGvvIC()).getNewProxyInstance) || Intrinsics.EZpvd(c47988uAv, ((uPQ) vnn.gGvvIC()).iwGUEr)) {
            if (!z) {
                android.text.Editable text = ((uPQ) vnn.gGvvIC()).getNewProxyInstance.djBIcL().getText();
                if (text != null) {
                    java.lang.String string = text.toString();
                    if (C59449zhJ.endsWith$default(string, JwtUtilsKt.JWT_DELIMITER, false, 2, null) || C59449zhJ.endsWith$default(string, ",", false, 2, null)) {
                        ((uPQ) vnn.gGvvIC()).getNewProxyInstance.djBIcL().setText(C59454zhO.DbNXlk(string, 1));
                    }
                }
                android.text.Editable text2 = ((uPQ) vnn.gGvvIC()).iwGUEr.djBIcL().getText();
                if (text2 != null) {
                    java.lang.String string2 = text2.toString();
                    if (C59449zhJ.endsWith$default(string2, JwtUtilsKt.JWT_DELIMITER, false, 2, null) || C59449zhJ.endsWith$default(string2, ",", false, 2, null)) {
                        ((uPQ) vnn.gGvvIC()).iwGUEr.djBIcL().setText(C59454zhO.DbNXlk(string2, 1));
                    }
                }
                if (Intrinsics.EZpvd(((SpotGridPresenter) vnn.dxcTrN()).QVAiDq(), java.lang.Boolean.FALSE)) {
                    C47988uAv.setInputErrorMsg$default(((uPQ) vnn.gGvvIC()).getNewProxyInstance, null, 1, null);
                    C47988uAv.setInputErrorMsg$default(((uPQ) vnn.gGvvIC()).iwGUEr, null, 1, null);
                    java.lang.String string3 = vnn.getString(C55688xof.Application.setLogo);
                    Intrinsics.checkNotNullExpressionValue(string3, "");
                    vnn.copydefault(string3);
                }
                vnn.sSMYrx();
                vnn.copydefault(c47988uAv);
            }
        } else if (Intrinsics.EZpvd(c47988uAv, ((uPQ) vnn.gGvvIC()).AuCTel)) {
            if (!z) {
                java.lang.String strFIwbmz = vnn.fIwbmz();
                if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strFIwbmz)) {
                    ((uPQ) vnn.gGvvIC()).AuCTel.setInputErrorMsg(strFIwbmz);
                    wPG.KWHzl.KWHzl();
                } else {
                    vnn.sSMYrx();
                }
            }
            vnn.KWHzl(z, c47988uAv);
        } else if (Intrinsics.EZpvd(c47988uAv, ((uPQ) vnn.gGvvIC()).wlaJM) || Intrinsics.EZpvd(c47988uAv, ((uPQ) vnn.gGvvIC()).AEQbTJ)) {
            vnn.EZpvd(z, c47988uAv);
        }
        return Unit.INSTANCE;
    }

    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ vNN EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, vNN vnn) {
            this.KWHzl = view;
            this.copydefault = j;
            this.EZpvd = vnn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.EZpvd.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.setQueueTitle);
                viewOnClickListenerC54939xaY.EZpvd(this.EZpvd.getString(C55688xof.Application.setSessionActivity));
                java.lang.String string = this.EZpvd.getString(C55688xof.Application.onCreate);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new LoaderManager(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ vNN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, vNN vnn) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.copydefault = vnn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                vNN.fIwbmz(this.copydefault).getNewProxyInstance.AuCTelauCTel();
                vNN.fIwbmz(this.copydefault).iwGUEr.AuCTelauCTel();
                this.copydefault.QfsBiF();
            }
        }
    }

    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ vNN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, vNN vnn) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = vnn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                new vOZ().show(this.copydefault.getChildFragmentManager(), "SpotGridReserveFundsTipsDialog");
            }
        }
    }

    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ vNN copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, vNN vnn) {
            this.KWHzl = view;
            this.AEQbTJ = j;
            this.copydefault = vnn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.AEQbTJ || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.copydefault.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.setVolumeTo));
                java.lang.String string = this.copydefault.getString(C55688xof.Application.QWSkGZ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new SharedElementCallback(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ vNN AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(android.view.View view, long j, vNN vnn) {
            this.EZpvd = view;
            this.KWHzl = j;
            this.AEQbTJ = vnn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.KWHzl || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.ensureClassLoader);
                viewOnClickListenerC54939xaY.copydefault(C55688xof.Application.RihMUf);
                java.lang.String string = this.AEQbTJ.getString(C55688xof.Application.QWSkGZ);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new VoiceInteractor(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ vNN AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, vNN vnn) {
            this.KWHzl = view;
            this.copydefault = j;
            this.AEQbTJ = vnn;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.copydefault || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                android.content.Context contextRequireContext = this.AEQbTJ.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
                ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
                viewOnClickListenerC54939xaY.setTitle(C55688xof.Application.putRating);
                viewOnClickListenerC54939xaY.EZpvd(this.AEQbTJ.getString(C55688xof.Application.MediaMetadataCompatBuilder));
                java.lang.String string = this.AEQbTJ.getString(C55688xof.Application.onCreate);
                Intrinsics.checkNotNullExpressionValue(string, "");
                viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, (View.OnClickListener) new TaskDescription(viewOnClickListenerC54939xaY));
                viewOnClickListenerC54939xaY.show();
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v25, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v30, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v32, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v36, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v39, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v41, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v43, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v44, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v46, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(vNN vnn, C47988uAv c47988uAv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(c47988uAv, "");
        uPQ upq = (uPQ) vnn.gGvvIC();
        if (Intrinsics.EZpvd(c47988uAv, upq.getNewProxyInstance) || Intrinsics.EZpvd(c47988uAv, upq.iwGUEr)) {
            ((SpotGridPresenter) vnn.dxcTrN()).wlaJM().setMinPx(upq.getNewProxyInstance.AkhnZx());
            ((SpotGridPresenter) vnn.dxcTrN()).wlaJM().setMaxPx(upq.iwGUEr.AkhnZx());
            if (c47988uAv.hasFocus()) {
                c47988uAv.setInputErrorMsg(xVK.EZpvd.EZpvd(c47988uAv.AkhnZx(), ((SpotGridPresenter) vnn.dxcTrN()).fvQaOB().gEmmrt(), ((SpotGridPresenter) vnn.dxcTrN()).fvQaOB().djBIcL()));
            }
            if (c47988uAv.getFieldNames()) {
                vnn.copydefault("");
            } else {
                if (!Intrinsics.EZpvd(((SpotGridPresenter) vnn.dxcTrN()).QVAiDq(), java.lang.Boolean.FALSE)) {
                    upq.getNewProxyInstance.copydefault();
                    upq.iwGUEr.copydefault();
                    vnn.copydefault("");
                }
                ((SpotGridPresenter) vnn.dxcTrN()).fZBcTu();
                ((SpotGridPresenter) vnn.dxcTrN()).UeEOUB();
                ((SpotGridPresenter) vnn.dxcTrN()).getFieldNames();
                ((SpotGridPresenter) vnn.dxcTrN()).djSkpj();
                upq.copydefault.AEQbTJ();
            }
            ((SpotGridPresenter) vnn.dxcTrN()).gasjUx();
            vnn.QOLQEE();
        } else if (Intrinsics.EZpvd(c47988uAv, upq.AuCTel)) {
            upq.AuCTel.copydefault();
            ((SpotGridPresenter) vnn.dxcTrN()).wlaJM().setGridNum(upq.AuCTel.AkhnZx());
            ((SpotGridPresenter) vnn.dxcTrN()).fZBcTu();
            ((SpotGridPresenter) vnn.dxcTrN()).UeEOUB();
            SpotGridPresenter.getGridProfitRate$default((SpotGridPresenter) vnn.dxcTrN(), 0L, null, 3, null);
            ((SpotGridPresenter) vnn.dxcTrN()).djSkpj();
            ((SpotGridPresenter) vnn.dxcTrN()).gasjUx();
            vnn.QOLQEE();
        } else if (Intrinsics.EZpvd(c47988uAv, upq.wlaJM)) {
            if (upq.wlaJM.zLjUOn()) {
                C47988uAv.clearSeekBarData$default(upq.wlaJM, false, 1, null);
            }
            ((SpotGridPresenter) vnn.dxcTrN()).EZpvd(upq.wlaJM.AkhnZx());
            vnn.getNewProxyInstance();
            ((SpotGridPresenter) vnn.dxcTrN()).UeEOUB();
            SpotGridPresenter.getGridProfitRate$default((SpotGridPresenter) vnn.dxcTrN(), 0L, null, 3, null);
        } else if (Intrinsics.EZpvd(c47988uAv, upq.AEQbTJ)) {
            if (upq.AEQbTJ.zLjUOn()) {
                C47988uAv.clearSeekBarData$default(upq.AEQbTJ, false, 1, null);
            }
            ((SpotGridPresenter) vnn.dxcTrN()).wlaJM().setBaseSz(upq.AEQbTJ.AkhnZx());
            vnn.AuCTel();
            ((SpotGridPresenter) vnn.dxcTrN()).UeEOUB();
            SpotGridPresenter.getGridProfitRate$default((SpotGridPresenter) vnn.dxcTrN(), 0L, null, 3, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void QKVWgx(vNN vnn) {
        if (vnn.fetchVPNInfo.getFirst().booleanValue()) {
            ((uPQ) vnn.gGvvIC()).wlaJM.copydefault();
        } else {
            ((uPQ) vnn.gGvvIC()).wlaJM.setInputErrorMsg(vnn.fetchVPNInfo.getSecond());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void hDKMBd(vNN vnn) {
        if (vnn.copydefault.getFirst().booleanValue()) {
            ((uPQ) vnn.gGvvIC()).AEQbTJ.copydefault();
        } else {
            ((uPQ) vnn.gGvvIC()).AEQbTJ.setInputErrorMsg(vnn.copydefault.getSecond());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        wPQ.OLrzqt(view);
        isConnected();
        QbewEr();
        QUSxYX();
        fetchVPNInfo();
        values();
        AubY();
        dNCPSb();
        aKErDB();
        RJOkX();
        QOLQEE();
        C55867xrz.KWHzl.OLrzqt("grid", ((SpotGridPresenter) dxcTrN()).fvQaOB().gEmmrt());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QOLQEE() {
        uPQ upq = (uPQ) gGvvIC();
        C53513wms c53513wms = upq.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c53513wms, "");
        boolean z = true;
        c53513wms.setVisibility(C56071xvr.isSupportAiBot$default(C56071xvr.gEmmrt, null, 1, null) ? 0 : 8);
        C53513wms c53513wms2 = upq.KWHzl;
        if (!(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) upq.getNewProxyInstance.AkhnZx())) && !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) upq.iwGUEr.AkhnZx())) && !(!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) upq.AuCTel.AkhnZx()))) {
            z = false;
        }
        c53513wms2.setClear(z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v7, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r6v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QVAiDq() {
        BotUserConfigInfo botUserConfigInfoCopydefault;
        C55886xsR c55886xsR = C55886xsR.OLrzqt;
        InterfaceC55881xsM interfaceC55881xsMCopydefault = c55886xsR.copydefault();
        if (interfaceC55881xsMCopydefault != null && interfaceC55881xsMCopydefault.OLrzqt(((SpotGridPresenter) dxcTrN()).OcIXYQ(), "grid")) {
            InterfaceC55881xsM interfaceC55881xsMCopydefault2 = c55886xsR.copydefault();
            java.util.List<java.lang.String> profitSharingRange = (interfaceC55881xsMCopydefault2 == null || (botUserConfigInfoCopydefault = interfaceC55881xsMCopydefault2.copydefault()) == null) ? null : botUserConfigInfoCopydefault.getProfitSharingRange();
            java.lang.String strEjfBZ = ((SpotGridPresenter) dxcTrN()).ejfBZ();
            pUU.KWHzl("Profit", "defaultProfitSharingRatio = " + strEjfBZ);
            if (profitSharingRange != null && !profitSharingRange.isEmpty()) {
                this.AkhnZx = profitSharingRange;
                ((uPQ) gGvvIC()).fJNWhG.setVisibility(0);
                ((uPQ) gGvvIC()).zLjUOn.setVisibility(0);
                java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(profitSharingRange, 10));
                for (java.lang.String str : profitSharingRange) {
                    boolean zEZpvd = Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) strEjfBZ);
                    if (zEZpvd) {
                        ((SpotGridPresenter) dxcTrN()).wlaJM().setProfitSharingRatio(str);
                    }
                    arrayList.add(new wYO(xMR.formatPercent$default(xMR.copydefault, str, 0, null, 4, null), 36, zEZpvd, true));
                }
                wYX wyx = ((uPQ) gGvvIC()).zLjUOn;
                wyx.setColumnCount(C56548yJl.valueOf(profitSharingRange.size(), 6));
                wyx.setSelectionChipBeans(arrayList);
                wyx.setOnChipClickListener(new AssistContent());
                wyx.setOnChipSelectionChangeListener(new TaskStackBuilder(wyx, this));
                return;
            }
        }
        ((uPQ) gGvvIC()).fJNWhG.setVisibility(8);
        ((uPQ) gGvvIC()).zLjUOn.setVisibility(8);
    }

    public static final class AssistContent implements wYX.ActionBar {
        @Override // o.wYX.ActionBar
        public void OLrzqt(wYS wys) {
            Intrinsics.checkNotNullParameter(wys, "");
            wys.setSelected(!wys.isSelected());
        }
    }

    public static final class TaskStackBuilder implements wYX.TaskDescription {
        public final /* synthetic */ wYX EZpvd;
        public final /* synthetic */ vNN KWHzl;

        public TaskStackBuilder(wYX wyx, vNN vnn) {
            this.EZpvd = wyx;
            this.KWHzl = vnn;
        }

        @Override // o.wYX.TaskDescription
        public void copydefault(wYS wys, wYO wyo, boolean z) {
            int i;
            Intrinsics.checkNotNullParameter(wys, "");
            Intrinsics.checkNotNullParameter(wyo, "");
            if (z) {
                java.util.Iterator<T> it = this.EZpvd.EZpvd().iterator();
                while (true) {
                    i = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    wYS wys2 = (wYS) it.next();
                    if (!Intrinsics.EZpvd(wys2, wys)) {
                        wys2.setSelected(false);
                    }
                }
                java.util.Iterator<wYO> it2 = this.EZpvd.OLrzqt().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    } else if (Intrinsics.EZpvd(it2.next().EZpvd(), wyo.EZpvd())) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0 || i >= this.KWHzl.AkhnZx.size()) {
                    return;
                }
                java.lang.String str = (java.lang.String) this.KWHzl.AkhnZx.get(i);
                vNN.fARcdN(this.KWHzl).wlaJM().setProfitSharingRatio(str);
                C56028xvA.OLrzqt("rcvRationContent", C56423yEv.EZpvd(C56390yDp.OLrzqt("ratio", str)));
                this.KWHzl.KWHzl(str);
            }
        }
    }

    public final void KWHzl(final java.lang.String str) {
        xOU xouWlaJM;
        final java.lang.String strOLrzqt;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (xouWlaJM = interfaceC54581xNrOLrzqt.wlaJM()) == null || (strOLrzqt = xouWlaJM.OLrzqt()) == null) {
            return;
        }
        C32866mlf.onEvent$default("LeadBotPlaceOrder_ProfitSharing_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vOL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.copydefault(str, strOLrzqt, (EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit copydefault(java.lang.String str, java.lang.String str2, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "profit_sharing_ratio", str, false, 4, null);
        EventParamsList.put$default(eventParamsList, "lead_bot_type", str2, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void EZpvd(int i) {
        int i2 = 0;
        for (java.lang.Object obj : ((uPQ) gGvvIC()).zLjUOn.EZpvd()) {
            if (i2 < 0) {
                yDY.AYXKKw();
            }
            ((wYS) obj).setSelected(i2 == i);
            i2++;
        }
    }

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vNN.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void RJOkX() {
        InterfaceC55881xsM interfaceC55881xsMCopydefault;
        if (C55697xoo.OLrzqt.isConnected()) {
            vSY vsy = this.values;
            if (vsy == null || !vsy.isAdded()) {
                int i = 0;
                if (SPUtils.getBoolean(vSY.Companion.AEQbTJ(), false) || (interfaceC55881xsMCopydefault = C55886xsR.OLrzqt.copydefault()) == null || !interfaceC55881xsMCopydefault.OLrzqt(((SpotGridPresenter) dxcTrN()).OcIXYQ(), "grid") || this.AkhnZx.isEmpty()) {
                    return;
                }
                java.lang.String strEjfBZ = ((SpotGridPresenter) dxcTrN()).ejfBZ();
                java.util.List<java.lang.String> list = this.AkhnZx;
                final java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
                for (java.lang.Object obj : list) {
                    if (i < 0) {
                        yDY.AYXKKw();
                    }
                    java.lang.String str = (java.lang.String) obj;
                    arrayList.add(new vSX(str, Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) strEjfBZ), i));
                    i++;
                }
                C50029uzh.EZpvd.copydefault(new java.lang.Runnable() { // from class: o.vNZ
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        vNN.KWHzl(this.AEQbTJ, arrayList);
                    }
                }, 0L);
            }
        }
    }

    public static final void KWHzl(final vNN vnn, java.util.List list) {
        if (vnn.values == null) {
            vnn.values = vSY.Companion.copydefault(new java.util.ArrayList<>(list), new Function1() { // from class: o.vOT
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return vNN.copydefault(this.KWHzl, ((java.lang.Integer) obj).intValue());
                }
            });
        }
        try {
            vSY vsy = vnn.values;
            if (vsy != null) {
                vsy.show(vnn.getChildFragmentManager(), vNN.class.getSimpleName());
            }
        } catch (java.lang.Exception e) {
            pUU.KWHzl(vnn.getTAG(), "Failed to show KolLeadingSettingFragment: " + e.getMessage());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(vNN vnn, int i) {
        vnn.EZpvd(i);
        ((SpotGridPresenter) vnn.dxcTrN()).wlaJM().setProfitSharingRatio(vnn.AkhnZx.get(i));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v31, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v34, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v37, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QUSxYX() {
        ((uPQ) gGvvIC()).KWHzl.setCallBack("grid", new Function1() { // from class: o.vOC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.OLrzqt(this.copydefault, (java.util.List) obj);
            }
        }, new Function0() { // from class: o.vOy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vNN.AubY(this.copydefault);
            }
        });
        C53518wmx c53518wmxQKVWgx = QKVWgx();
        c53518wmxQKVWgx.setOnClickListener(new Dialog(c53518wmxQKVWgx, 1000L, this));
        C55258xgZ c55258xgZ = ((uPQ) gGvvIC()).sSMYrx;
        c55258xgZ.setOnClickListener(new PendingIntent(c55258xgZ, 1000L, this));
        C55258xgZ c55258xgZ2 = ((uPQ) gGvvIC()).fJNWhG;
        c55258xgZ2.setOnClickListener(new FragmentManager(c55258xgZ2, 1000L, this));
        ((uPQ) gGvvIC()).AubY.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.vOH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                vNN.OLrzqt(this.EZpvd, compoundButton, z);
            }
        });
        C55258xgZ c55258xgZ3 = ((uPQ) gGvvIC()).gHZMYf;
        c55258xgZ3.setOnClickListener(new Fragment(c55258xgZ3, 1000L, this));
        ((uPQ) gGvvIC()).copydefault.setTrailingPreCheck(new Function1() { // from class: o.vOD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Boolean.valueOf(vNN.KWHzl(this.OLrzqt, ((java.lang.Boolean) obj).booleanValue()));
            }
        });
        ((uPQ) gGvvIC()).copydefault.setSmartEarnPreCheck(new Function0() { // from class: o.vOF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(vNN.AwvSrB(this.OLrzqt));
            }
        });
        ((uPQ) gGvvIC()).copydefault.setTrailingPostCheck(new Function0() { // from class: o.vOE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vNN.zuBGHE(this.copydefault);
            }
        });
        ((uPQ) gGvvIC()).copydefault.setTrailingUpChange(new Function0() { // from class: o.vOK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vNN.AxsJAY(this.EZpvd);
            }
        });
        ((uPQ) gGvvIC()).copydefault.setTpSlPreCheck(new Function0() { // from class: o.vOM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(vNN.sSMYrx(this.AEQbTJ));
            }
        });
        ((uPQ) gGvvIC()).copydefault.setTpSlPostCheck(new Function0() { // from class: o.vOJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vNN.gHZMYf(this.OLrzqt);
            }
        });
        ((uPQ) gGvvIC()).copydefault.setTrailingUpErrCheck(new Function0() { // from class: o.vOI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(vNN.OcIXYQ(this.AEQbTJ));
            }
        });
        ((uPQ) gGvvIC()).copydefault.setTriggerStrategyPostCheck(new Function0() { // from class: o.vOA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vNN.ORxRYg(this.EZpvd);
            }
        });
    }

    public static final Unit OLrzqt(vNN vnn, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        if (C56071xvr.gEmmrt.ejfBZ()) {
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(vnn), null, null, new SpotGridFragment$initListener$1$1(vnn, list, null), 3, null);
        } else {
            vnn.AEQbTJ((java.util.List<SmartRecommendResp>) list);
        }
        return Unit.INSTANCE;
    }

    public static final Unit AubY(vNN vnn) {
        vnn.KWHzl((StgyParam) null);
        return Unit.INSTANCE;
    }

    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.AEQbTJ = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.AEQbTJ.dismiss();
        }
    }

    public static final class SharedElementCallback implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public SharedElementCallback(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void OLrzqt(vNN vnn, android.widget.CompoundButton compoundButton, boolean z) {
        vnn.AEQbTJ(java.lang.Boolean.valueOf(z));
        ((SpotGridPresenter) vnn.dxcTrN()).UeEOUB();
        ((SpotGridPresenter) vnn.dxcTrN()).AwvSrB();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean KWHzl(vNN vnn, boolean z) {
        boolean z2 = (z || (vnn.getFieldNames() && vnn.ejfBZ() && isGridCountValid$default(vnn, null, 1, null))) ? false : true;
        SmartEarnRequestParam earnParam = ((SpotGridPresenter) vnn.dxcTrN()).wlaJM().getEarnParam();
        boolean z3 = earnParam != null && earnParam.getEnabled();
        if (z3) {
            android.content.Context context = vnn.getContext();
            if (context == null) {
                return false;
            }
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C48033uCm.Fragment.OAUGar);
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.fzHEvu));
            viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new View.OnClickListener() { // from class: o.vOW
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    vNN.AYXKKw(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
        return (z2 || z3) ? false : true;
    }

    public static final void AYXKKw(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final boolean AwvSrB(vNN vnn) {
        return vnn.OLrzqt(false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit zuBGHE(vNN vnn) {
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairQUSxYX = ((SpotGridPresenter) vnn.dxcTrN()).QUSxYX();
        C55251xgS c55251xgS = ((uPQ) vnn.gGvvIC()).DTwDnp;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(pairQUSxYX.getFirst().booleanValue() ? 0 : 8);
        ((uPQ) vnn.gGvvIC()).DTwDnp.setText(pairQUSxYX.getSecond());
        vnn.zsXlph();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AxsJAY(vNN vnn) {
        ((SpotGridPresenter) vnn.dxcTrN()).UeEOUB();
        ((SpotGridPresenter) vnn.dxcTrN()).djSkpj();
        ((SpotGridPresenter) vnn.dxcTrN()).AwvSrB();
        return Unit.INSTANCE;
    }

    public static final boolean sSMYrx(vNN vnn) {
        return vnn.getFieldNames() && vnn.ejfBZ() && isGridCountValid$default(vnn, null, 1, null) && vnn.hDKMBd() && vnn.fARcdN();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit gHZMYf(vNN vnn) {
        ((SpotGridPresenter) vnn.dxcTrN()).fZBcTu();
        return Unit.INSTANCE;
    }

    public static final boolean OcIXYQ(vNN vnn) {
        return vnn.iwGUEr();
    }

    public static final Unit ORxRYg(vNN vnn) {
        vnn.zsXlph();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r13v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r13v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v17, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v7, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean OLrzqt(boolean z) {
        SmartEarnConfig earnConfig;
        EarnType earnType;
        StrategyConfigInfo strategyConfigInfoDjBIcL = ((SpotGridPresenter) dxcTrN()).djBIcL();
        if (strategyConfigInfoDjBIcL != null && (earnConfig = strategyConfigInfoDjBIcL.getEarnConfig()) != null) {
            SmartEarnParamsCheckUseCase smartEarnParamsCheckUseCaseDjBIcL = djBIcL();
            java.lang.String strAkhnZx = ((uPQ) gGvvIC()).AuCTel.AkhnZx();
            InterfaceC56538yJb interfaceC56538yJbEZpvd = C56547yJk.EZpvd(((uPQ) gGvvIC()).getNewProxyInstance.AkhnZx(), ((uPQ) gGvvIC()).iwGUEr.AkhnZx());
            TrailingConfig trailingDownConfig = ((SpotGridPresenter) dxcTrN()).wlaJM().getTrailingDownConfig();
            TrailingConfig trailingUpConfig = ((SpotGridPresenter) dxcTrN()).wlaJM().getTrailingUpConfig();
            SmartEarnRequestParam earnParam = ((SpotGridPresenter) dxcTrN()).wlaJM().getEarnParam();
            EarnType earnType2 = (earnParam == null || (earnType = earnParam.getEarnType()) == null || !z) ? null : earnType;
            SmartEarnRequestParam earnParam2 = ((SpotGridPresenter) dxcTrN()).wlaJM().getEarnParam();
            if (earnParam2 != null) {
                java.lang.String earnMinLimit = earnParam2.getEarnMinLimit();
                if (earnMinLimit == null) {
                    earnMinLimit = "";
                }
                java.lang.String earnMaxLimit = earnParam2.getEarnMaxLimit();
                InterfaceC56538yJb interfaceC56538yJbEZpvd2 = C56547yJk.EZpvd(earnMinLimit, earnMaxLimit != null ? earnMaxLimit : "");
                InterfaceC56538yJb interfaceC56538yJb = (interfaceC56538yJbEZpvd2 == null || !z) ? null : interfaceC56538yJbEZpvd2;
                SmartEarnParamsCheckUseCase.Result resultPreCheck$default = SmartEarnParamsCheckUseCase.preCheck$default(smartEarnParamsCheckUseCaseDjBIcL, new SmartEarnParamsCheckUseCase.ActionBar(earnConfig, strAkhnZx, interfaceC56538yJbEZpvd, trailingDownConfig, trailingUpConfig, earnType2, interfaceC56538yJb), null, null, 6, null);
                if (resultPreCheck$default instanceof SmartEarnParamsCheckUseCase.Result.UserNotQualifiedForEarn) {
                    android.content.Context context = getContext();
                    if (context != null) {
                        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                        viewOnClickListenerC54939xaY.setTitle(C48033uCm.Fragment.OAUGar);
                        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.DAgZj));
                        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new View.OnClickListener() { // from class: o.vON
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            @Override // android.view.View.OnClickListener
                            public final void onClick(android.view.View view) {
                                vNN.AhwBna(viewOnClickListenerC54939xaY, view);
                            }
                        });
                        viewOnClickListenerC54939xaY.show();
                    }
                    return false;
                }
                if (getFieldNames() && ejfBZ()) {
                    if (resultPreCheck$default instanceof SmartEarnParamsCheckUseCase.Result.GridRangeIsNotWideEnough) {
                        C55326xho.toastWithFailedIcon$default(((SmartEarnParamsCheckUseCase.Result.GridRangeIsNotWideEnough) resultPreCheck$default).KWHzl(), 0, 1, (java.lang.Object) null);
                        ((uPQ) gGvvIC()).getNewProxyInstance.zsXlph();
                        return false;
                    }
                    if (!EZpvd(java.lang.Integer.valueOf(C33129mqd.AhwBna(earnConfig.getMinGridNum())))) {
                        if (resultPreCheck$default instanceof SmartEarnParamsCheckUseCase.Result.GridCountIsNotValid) {
                            ((uPQ) gGvvIC()).AuCTel.zsXlph();
                            C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(C48033uCm.Fragment.hfeTOA, C56423yEv.EZpvd(C56390yDp.OLrzqt("minGridNum", earnConfig.getMinGridNum()))), 0, 1, (java.lang.Object) null);
                        }
                        return false;
                    }
                    if (resultPreCheck$default instanceof SmartEarnParamsCheckUseCase.Result.TrailingUpOrDownIsSet) {
                        android.content.Context context2 = getContext();
                        if (context2 != null) {
                            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY2 = new ViewOnClickListenerC54939xaY(context2);
                            viewOnClickListenerC54939xaY2.setTitle(C48033uCm.Fragment.OAUGar);
                            viewOnClickListenerC54939xaY2.EZpvd(C33070mpX.AYXKKw(C48033uCm.Fragment.fzHEvu));
                            viewOnClickListenerC54939xaY2.EZpvd(C55688xof.Application.trackPipAnimationHintView, new View.OnClickListener() { // from class: o.vOP
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    vNN.gEmmrt(viewOnClickListenerC54939xaY2, view);
                                }
                            });
                            viewOnClickListenerC54939xaY2.show();
                        }
                        return false;
                    }
                    if ((resultPreCheck$default instanceof SmartEarnParamsCheckUseCase.Result.GapMustBeMoreThan) || (resultPreCheck$default instanceof SmartEarnParamsCheckUseCase.Result.GapMustBeLessThan)) {
                        android.content.Context context3 = getContext();
                        if (context3 != null) {
                            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY3 = new ViewOnClickListenerC54939xaY(context3);
                            viewOnClickListenerC54939xaY3.setTitle(C48033uCm.Fragment.OAUGar);
                            viewOnClickListenerC54939xaY3.EZpvd(resultPreCheck$default.KWHzl());
                            viewOnClickListenerC54939xaY3.EZpvd(C55688xof.Application.trackPipAnimationHintView, new View.OnClickListener() { // from class: o.vOQ
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                @Override // android.view.View.OnClickListener
                                public final void onClick(android.view.View view) {
                                    vNN.valueOf(viewOnClickListenerC54939xaY3, view);
                                }
                            });
                            viewOnClickListenerC54939xaY3.show();
                        }
                    } else {
                        return resultPreCheck$default instanceof SmartEarnParamsCheckUseCase.Result.Success;
                    }
                }
            }
        }
        return false;
    }

    public static final void AhwBna(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void gEmmrt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void valueOf(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(StgyParam stgyParam) {
        java.lang.String runType;
        uPQ upq = (uPQ) gGvvIC();
        upq.getNewProxyInstance.copydefault();
        upq.iwGUEr.copydefault();
        upq.AuCTel.copydefault();
        copydefault("");
        C47988uAv.setInputContent$default(upq.getNewProxyInstance, stgyParam != null ? stgyParam.getMinPx() : null, false, false, 6, null);
        C47988uAv.setInputContent$default(upq.iwGUEr, stgyParam != null ? stgyParam.getMaxPx() : null, false, false, 6, null);
        C47988uAv.setInputContent$default(upq.AuCTel, stgyParam != null ? stgyParam.getGridNum() : null, false, false, 6, null);
        C50553vSr c50553vSr = upq.copydefault;
        if (stgyParam == null || (runType = stgyParam.getRunType()) == null) {
            runType = "1";
        }
        c50553vSr.setControlSelected(runType);
        upq.copydefault.gEmmrt();
        if (stgyParam == null) {
            C47988uAv.setInputContent$default(upq.wlaJM, "", false, false, 6, null);
            C47988uAv.setInputContent$default(upq.AEQbTJ, "", false, false, 6, null);
        }
        sSMYrx();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v27, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zsXlph() {
        if (((SpotGridPresenter) dxcTrN()).aKErDB()) {
            LinearLayoutCompat linearLayoutCompat = ((uPQ) gGvvIC()).AxsJAY;
            Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
            linearLayoutCompat.setVisibility(0);
            if (((SpotGridPresenter) dxcTrN()).AEQbTJ()) {
                ((uPQ) gGvvIC()).AubY.setChecked(false);
                KWHzl(false);
            } else {
                ((uPQ) gGvvIC()).AubY.setChecked(((SpotGridPresenter) dxcTrN()).dNCPSb());
                KWHzl(true);
            }
            AEQbTJ(java.lang.Boolean.valueOf(((uPQ) gGvvIC()).AubY.isChecked()));
            ((SpotGridPresenter) dxcTrN()).UeEOUB();
            return;
        }
        LinearLayoutCompat linearLayoutCompat2 = ((uPQ) gGvvIC()).AxsJAY;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat2, "");
        linearLayoutCompat2.setVisibility(8);
        ((uPQ) gGvvIC()).AubY.setCheckedIgnoreListener(true);
        AEQbTJ((java.lang.Boolean) null);
        EZpvd((AdditionalInvest) null);
        pUU.EZpvd(getTAG(), "not show reserve funds, reset to null!");
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AEQbTJ(java.lang.Boolean bool) {
        ConstraintLayout constraintLayout = ((uPQ) gGvvIC()).valueOf;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility((Intrinsics.EZpvd(bool, java.lang.Boolean.TRUE) || (bool == null && (Intrinsics.EZpvd((java.lang.Object) valueOf().copydefault(), (java.lang.Object) TtmlNode.RUBY_BASE) || Intrinsics.EZpvd((java.lang.Object) valueOf().copydefault(), (java.lang.Object) "dual")))) ? 0 : 8);
        ConstraintLayout constraintLayout2 = ((uPQ) gGvvIC()).hDKMBd;
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "");
        java.lang.Boolean bool2 = java.lang.Boolean.FALSE;
        constraintLayout2.setVisibility(Intrinsics.EZpvd(bool, bool2) ? 0 : 8);
        android.widget.TextView textView = ((uPQ) gGvvIC()).getFieldNames;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(Intrinsics.EZpvd(bool, bool2) ? 0 : 8);
        ((SpotGridPresenter) dxcTrN()).OLrzqt(bool != null ? bool.booleanValue() : true);
        ((SpotGridPresenter) dxcTrN()).wlaJM().setReserveFunds(bool);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void KWHzl(boolean z) {
        java.lang.String strAYXKKw;
        C55320xhi c55320xhiKWHzl;
        ((uPQ) gGvvIC()).AubY.setEnabled(z);
        int iCopydefault = C33070mpX.copydefault(z ? C52761wXj.Activity.Dmq : C52761wXj.Activity.UlJrfe);
        C55312xha c55312xhaValueOf = ((uPQ) gGvvIC()).gHZMYf.valueOf();
        if (c55312xhaValueOf != null && (c55320xhiKWHzl = c55312xhaValueOf.KWHzl()) != null) {
            c55320xhiKWHzl.setTextColor(iCopydefault);
        }
        if (!((uPQ) gGvvIC()).AubY.isChecked() && !z) {
            strAYXKKw = C33070mpX.AYXKKw(C48033uCm.Fragment.HJWChPzRXNTw);
        } else {
            strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.remove);
        }
        ((uPQ) gGvvIC()).getFieldNames.setText(strAYXKKw);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void QbewEr() {
        uPQ upq = (uPQ) gGvvIC();
        C49960uyR.setWindowSoftInput$default(this, upq.getNewProxyInstance, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), upq.getNewProxyInstance, 0, 8, (java.lang.Object) null);
        C49960uyR.setWindowSoftInput$default(this, upq.iwGUEr, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), upq.iwGUEr, 0, 8, (java.lang.Object) null);
        C49960uyR.setWindowSoftInput$default(this, upq.AuCTel, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), upq.AuCTel, 0, 8, (java.lang.Object) null);
        C49960uyR.setWindowSoftInput$default(this, upq.zsXlph, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), upq.wlaJM, 0, 8, (java.lang.Object) null);
        C49960uyR.setWindowSoftInput$default(this, upq.EZpvd, java.lang.Integer.valueOf(C48033uCm.Application.fvQaOB), upq.AEQbTJ, 0, 8, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void isConnected() {
        ((uPQ) gGvvIC()).AuCTel.setMaxDecimal(0);
        ((uPQ) gGvvIC()).AuCTel.setOnFocusChangeCallback(this.AhwBna);
        ((uPQ) gGvvIC()).AuCTel.setOnTextChangeCallback(this.djBIcL);
        C55258xgZ c55258xgZ = ((uPQ) gGvvIC()).values;
        c55258xgZ.setOnClickListener(new ActionBar(c55258xgZ, 1000L, this));
    }

    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.copydefault = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.copydefault.dismiss();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void values() {
        final uPQ upq = (uPQ) gGvvIC();
        valueOf().KWHzl(new Function0() { // from class: o.vOr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vNN.zsXlph(this.OLrzqt);
            }
        });
        valueOf().EZpvd(new Function1() { // from class: o.vOp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.KWHzl(this.KWHzl, upq, (java.lang.String) obj);
            }
        });
        C47988uAv c47988uAv = ((uPQ) gGvvIC()).wlaJM;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        copydefault(this, c47988uAv, (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.vOw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.gEmmrt(this.KWHzl, (java.lang.String) obj);
            }
        });
        C47988uAv c47988uAv2 = ((uPQ) gGvvIC()).AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c47988uAv2, "");
        copydefault(this, c47988uAv2, (Function1<? super java.lang.String, java.lang.String>) new Function1() { // from class: o.vOx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.fetchVPNInfo(this.EZpvd, (java.lang.String) obj);
            }
        });
        C55258xgZ c55258xgZ = ((uPQ) gGvvIC()).QKVWgx;
        c55258xgZ.setOnClickListener(new StateListAnimator(c55258xgZ, 1000L, this));
    }

    public static final java.lang.String zsXlph(vNN vnn) {
        InterfaceC53558wnk interfaceC53558wnk = vnn.ejfBZ;
        if (interfaceC53558wnk != null) {
            return interfaceC53558wnk.AhwBna();
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(vNN vnn, uPQ upq, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (Intrinsics.EZpvd((java.lang.Object) ((SpotGridPresenter) vnn.dxcTrN()).zLjUOn(), (java.lang.Object) "default_usdt") || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "default_usdt")) {
            upq.copydefault.EZpvd(((SpotGridPresenter) vnn.dxcTrN()).wlaJM(), str);
            C55251xgS c55251xgS = upq.DTwDnp;
            Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
            c55251xgS.setVisibility(8);
        } else {
            upq.copydefault.EZpvd(str);
        }
        ((SpotGridPresenter) vnn.dxcTrN()).AEQbTJ(str);
        C47988uAv.setInputContent$default(upq.wlaJM, null, false, true, 2, null);
        C47988uAv.setInputContent$default(upq.AEQbTJ, null, false, true, 2, null);
        vnn.AuCTelauCTel();
        vnn.zLjUOn();
        vnn.zsXlph();
        ((SpotGridPresenter) vnn.dxcTrN()).AwvSrB();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: com.okinc.unify_trade.bot.grid.viewmodel.SpotGridPresenter.getGridProfitRate$default(com.okinc.unify_trade.bot.grid.viewmodel.SpotGridPresenter, long, java.lang.String, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void KWHzl(vNN vnn, C47988uAv c47988uAv) {
        if (Intrinsics.EZpvd(c47988uAv, ((uPQ) vnn.gGvvIC()).AEQbTJ) || Intrinsics.EZpvd(c47988uAv, ((uPQ) vnn.gGvvIC()).wlaJM)) {
            SpotGridPresenter.getGridProfitRate$default((SpotGridPresenter) vnn.dxcTrN(), 0L, null, 3, null);
        }
    }

    public static final void copydefault(final vNN vnn, final C47988uAv c47988uAv, final Function1<? super java.lang.String, java.lang.String> function1) {
        c47988uAv.setPercentSeekBarListener(new Function1() { // from class: o.vOj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.EZpvd(this.EZpvd, c47988uAv, function1, ((java.lang.Float) obj).floatValue());
            }
        });
        c47988uAv.setOnTextChangeCallback(vnn.djBIcL);
        c47988uAv.setOnFocusChangeCallback(vnn.AhwBna);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(vNN vnn, C47988uAv c47988uAv, Function1 function1, float f) {
        vnn.EZpvd();
        if (!c47988uAv.zLjUOn()) {
            C47988uAv.setInputContent$default(c47988uAv, "", false, false, 6, null);
        } else {
            c47988uAv.setOnTextChangeCallback(null);
            C47988uAv.setInputContent$default(c47988uAv, (java.lang.String) function1.invoke(C33129mqd.gEmmrt(java.lang.Float.valueOf(c47988uAv.fJNWhG()))), false, false, 6, null);
            KWHzl(vnn, c47988uAv);
            if (Intrinsics.EZpvd(c47988uAv, ((uPQ) vnn.gGvvIC()).AEQbTJ)) {
                vnn.AuCTel();
            } else {
                vnn.getNewProxyInstance();
            }
            c47988uAv.setOnTextChangeCallback(vnn.djBIcL);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.String gEmmrt(vNN vnn, java.lang.String str) {
        C54536xML c54536xMLAYXKKw;
        java.lang.String safeString$default;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(((SpotGridPresenter) vnn.dxcTrN()).fvQaOB(), null, true, 1, null);
        if (c54571xNhCreateAmtConvert$default != null && (c54536xMLAYXKKw = c54571xNhCreateAmtConvert$default.AYXKKw(C33129mqd.mulS$default(str, vnn.OcIXYQ().AhwBna().getValue(), null, null, null, 14, null))) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLAYXKKw, false, 1, null)) != null) {
            str2 = safeString$default;
        }
        ((SpotGridPresenter) vnn.dxcTrN()).EZpvd(str2);
        ((SpotGridPresenter) vnn.dxcTrN()).UeEOUB();
        return str2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.String fetchVPNInfo(vNN vnn, java.lang.String str) {
        C54536xML c54536xMLDjBIcL;
        java.lang.String safeString$default;
        java.lang.String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        C54571xNh c54571xNhCreateAmtConvert$default = C55887xsS.createAmtConvert$default(((SpotGridPresenter) vnn.dxcTrN()).fvQaOB(), null, false, 3, null);
        if (c54571xNhCreateAmtConvert$default != null && (c54536xMLDjBIcL = c54571xNhCreateAmtConvert$default.djBIcL(C33129mqd.mulS$default(str, vnn.OcIXYQ().EZpvd().getValue(), null, null, null, 14, null))) != null && (safeString$default = C54536xML.toSafeString$default(c54536xMLDjBIcL, false, 1, null)) != null) {
            str2 = safeString$default;
        }
        ((SpotGridPresenter) vnn.dxcTrN()).wlaJM().setBaseSz(str2);
        ((SpotGridPresenter) vnn.dxcTrN()).UeEOUB();
        return str2;
    }

    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.OLrzqt = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.OLrzqt.dismiss();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AubY() {
        ((uPQ) gGvvIC()).gEmmrt.setText(((SpotGridPresenter) dxcTrN()).isConnected());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fetchVPNInfo() {
        ((uPQ) gGvvIC()).copydefault.KWHzl(((SpotGridPresenter) dxcTrN()).wlaJM(), ((SpotGridPresenter) dxcTrN()).zLjUOn());
        ((uPQ) gGvvIC()).copydefault.fJNWhG();
        C50553vSr c50553vSr = ((uPQ) gGvvIC()).copydefault;
        java.lang.String runType = ((SpotGridPresenter) dxcTrN()).wlaJM().getRunType();
        Intrinsics.copydefault((java.lang.Object) runType);
        c50553vSr.setControlSelected(runType);
        ((uPQ) gGvvIC()).copydefault.setControlSelectedListener(new Function1() { // from class: o.vOR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.AYXKKw(this.EZpvd, (java.lang.String) obj);
            }
        });
        C50553vSr c50553vSr2 = ((uPQ) gGvvIC()).copydefault;
        c50553vSr2.AEQbTJ(new Function1() { // from class: o.vOO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.djBIcL(this.AEQbTJ, (java.lang.String) obj);
            }
        });
        ((SpotGridPresenter) dxcTrN()).fvQaOB().gEmmrt(c50553vSr2.EZpvd(this, ((SpotGridPresenter) dxcTrN()).fvQaOB().AhwBna(), TradeType.BUY_OPEN));
        this.ejfBZ = c50553vSr2;
        ((uPQ) gGvvIC()).copydefault.setTotalInvestAmtCallback(new Function0() { // from class: o.vOV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vNN.AuCTelauCTel(this.OLrzqt);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AYXKKw(vNN vnn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        ((SpotGridPresenter) vnn.dxcTrN()).wlaJM().setRunType(str);
        ((SpotGridPresenter) vnn.dxcTrN()).fZBcTu();
        ((SpotGridPresenter) vnn.dxcTrN()).UeEOUB();
        ((SpotGridPresenter) vnn.dxcTrN()).getFieldNames();
        ((SpotGridPresenter) vnn.dxcTrN()).djSkpj();
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "1")) {
            C32866mlf.onEvent$default("trade_grid_amount_type", (TrackChannel[]) null, new Function1() { // from class: o.vNR
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return vNN.djBIcL((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) "2")) {
            C32866mlf.onEvent$default("trade_grid_amount_type", (TrackChannel[]) null, new Function1() { // from class: o.vOb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return vNN.AYXKKw((EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
        ((SpotGridPresenter) vnn.dxcTrN()).gasjUx();
        vnn.sSMYrx();
        return Unit.INSTANCE;
    }

    public static final Unit djBIcL(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", "grade", true);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("type", "ratio", true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit djBIcL(vNN vnn, java.lang.String str) {
        pUU.EZpvd("USDRename", "SpotGridFragment onTradeWith selected: " + str);
        ((SpotGridPresenter) vnn.dxcTrN()).fvQaOB().gEmmrt(str);
        SpotGridPresenter.getGridConfigInfo$default((SpotGridPresenter) vnn.dxcTrN(), null, 1, null);
        vnn.AuCTelauCTel();
        vnn.zLjUOn();
        vnn.AubY();
        C47988uAv.clearSeekBarData$default(((uPQ) vnn.gGvvIC()).wlaJM, false, 1, null);
        C47988uAv.clearSeekBarData$default(((uPQ) vnn.gGvvIC()).AEQbTJ, false, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final java.lang.String AuCTelauCTel(vNN vnn) {
        return ((SpotGridPresenter) vnn.dxcTrN()).values();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(boolean z, boolean z2) {
        if (z) {
            final vSK vsk = ((uPQ) gGvvIC()).zuBGHE;
            vsk.setVisibility(0);
            vsk.setHelperLabelType(0);
            vsk.setToggleState(z2);
            ((SpotGridPresenter) dxcTrN()).KWHzl(z2);
            vsk.setOnToggleListener(new Function1() { // from class: o.vOt
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return vNN.OLrzqt(this.AEQbTJ, ((java.lang.Boolean) obj).booleanValue());
                }
            });
            vsk.setOnInfoClickListener(new Function0() { // from class: o.vOv
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return vNN.copydefault(vsk);
                }
            });
            return;
        }
        ((SpotGridPresenter) dxcTrN()).finit();
        vSK vsk2 = ((uPQ) gGvvIC()).zuBGHE;
        vsk2.AEQbTJ();
        vsk2.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(vNN vnn, boolean z) {
        ((SpotGridPresenter) vnn.dxcTrN()).KWHzl(z);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(vSK vsk) {
        android.content.Context context = vsk.getContext();
        if (context != null) {
            final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
            viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKDSqxTE));
            viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.onMetadataChanged));
            viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.vOS
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    vNN.djBIcL(viewOnClickListenerC54939xaY, view);
                }
            });
            viewOnClickListenerC54939xaY.show();
        }
        return Unit.INSTANCE;
    }

    public static final void djBIcL(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.AbstractC48165uHj
    public void AEQbTJ(boolean z) {
        ((SpotGridPresenter) dxcTrN()).EZpvd();
        ((SpotGridPresenter) dxcTrN()).AxsJAY();
        pUU.EZpvd("USDRename", "SpotGridFragment onRefresh");
        InterfaceC53558wnk interfaceC53558wnk = this.ejfBZ;
        if (interfaceC53558wnk != null) {
            ((SpotGridPresenter) dxcTrN()).fvQaOB().gEmmrt(interfaceC53558wnk.EZpvd(this, ((SpotGridPresenter) dxcTrN()).fvQaOB().AhwBna(), TradeType.BUY_OPEN));
        }
        fJNWhG();
        EZpvd(z);
        SpotGridPresenter.getGridConfigInfo$default((SpotGridPresenter) dxcTrN(), null, 1, null);
        zLjUOn();
        if (z) {
            if (((SpotGridPresenter) dxcTrN()).hDKMBd().getValue() != null) {
                ((SpotGridPresenter) dxcTrN()).hDKMBd().setValue(null);
            }
            ((SpotGridPresenter) dxcTrN()).EZpvd();
            AwvSrB();
            ((SpotGridPresenter) dxcTrN()).wlaJM().setProfitSharingRatio("");
        }
        copydefault(getArguments());
        QVAiDq();
        sSMYrx();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r15v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v10, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(android.os.Bundle bundle) {
        AIData aIData = bundle != null ? (AIData) bundle.getParcelable("bot_copy_req") : null;
        AIData aIData2 = aIData instanceof AIData ? aIData : null;
        if (aIData2 == null) {
            return;
        }
        bundle.remove("bot_copy_req");
        uPQ upq = (uPQ) gGvvIC();
        C47988uAv.setInputContent$default(upq.getNewProxyInstance, aIData2.getMinPx(), false, false, 6, null);
        C47988uAv.setInputContent$default(upq.iwGUEr, aIData2.getMaxPx(), false, false, 6, null);
        upq.copydefault.setControlSelected(aIData2.getRunType());
        C47988uAv.setInputContent$default(upq.AuCTel, aIData2.getGridNum(), false, false, 6, null);
        java.lang.String investmentType = aIData2.getInvestmentType();
        if (investmentType != null) {
            ((SpotGridPresenter) dxcTrN()).AEQbTJ(investmentType);
            valueOf().EZpvd(investmentType);
            if (C33129mqd.OLrzqt((java.lang.CharSequence) aIData2.getQuoteSz())) {
                C47988uAv.setInputContent$default(upq.wlaJM, aIData2.getQuoteSz(), false, true, 2, null);
                AuCTelauCTel();
            }
            if (C33129mqd.OLrzqt((java.lang.CharSequence) aIData2.getBaseSz())) {
                upq.AEQbTJ.setVisibility(0);
                C47988uAv.setInputContent$default(upq.AEQbTJ, aIData2.getBaseSz(), false, true, 2, null);
                wlaJM();
            }
            zLjUOn();
            zsXlph();
        }
        ((SpotGridPresenter) dxcTrN()).OLrzqt(Intrinsics.EZpvd(aIData2.getReserveFunds(), java.lang.Boolean.TRUE));
        ((SpotGridPresenter) dxcTrN()).wlaJM().setSystemSource(aIData2.getSystemSource());
        ((SpotGridPresenter) dxcTrN()).wlaJM().setNmpUnderlyingId(aIData2.getNmpUnderlyingId());
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) aIData2.getProfitSharingRatio())) {
            ((SpotGridPresenter) dxcTrN()).wlaJM().setProfitSharingRatio(aIData2.getProfitSharingRatio());
        }
        upq.copydefault.AEQbTJ(aIData2);
        java.lang.String quoteSz = aIData2.getQuoteSz();
        if (quoteSz != null) {
            C47988uAv.setInputContent$default(upq.wlaJM, quoteSz, false, false, 6, null);
        }
    }

    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        QKVWgx().OLrzqt();
        sSMYrx();
        ORxRYg().EZpvd();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final java.util.Map<C47988uAv, java.lang.String> DTwDnp() {
        if (giSNqX()) {
            return C56424yEw.gEmmrt(C56390yDp.OLrzqt(((uPQ) gGvvIC()).getNewProxyInstance, "minPrice"), C56390yDp.OLrzqt(((uPQ) gGvvIC()).iwGUEr, "maxPrice"), C56390yDp.OLrzqt(((uPQ) gGvvIC()).AuCTel, "gridCount"), C56390yDp.OLrzqt(((uPQ) gGvvIC()).wlaJM, "quoteAmt"), C56390yDp.OLrzqt(((uPQ) gGvvIC()).AEQbTJ, "baseAmt"));
        }
        return C56424yEw.KWHzl();
    }

    private final C53519wmy ORxRYg() {
        return (C53519wmy) this.AEQbTJ.getValue();
    }

    public static final C53519wmy iwGUEr(vNN vnn) {
        return new C53519wmy(vnn.DTwDnp());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v22, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v33, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v36, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void dNCPSb() {
        TradeLiveData<StrategyResponse> tradeLiveDataGHZMYf = ((SpotGridPresenter) dxcTrN()).gHZMYf();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataGHZMYf.observe(viewLifecycleOwner, new PictureInPictureParams(new Function1() { // from class: o.vOu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.copydefault(this.AEQbTJ, (StrategyResponse) obj);
            }
        }));
        C56111xwe<MinInvestResp> c56111xweZuBGHE = ((SpotGridPresenter) dxcTrN()).zuBGHE();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweZuBGHE.observe(viewLifecycleOwner2, new PictureInPictureParams(new Function1() { // from class: o.vOY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.EZpvd(this.EZpvd, (MinInvestResp) obj);
            }
        }));
        TradeLiveData<GridProfitRateResp> tradeLiveDataZsXlph = ((SpotGridPresenter) dxcTrN()).zsXlph();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        tradeLiveDataZsXlph.observe(viewLifecycleOwner3, new PictureInPictureParams(new Function1() { // from class: o.vNQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.KWHzl(this.copydefault, (GridProfitRateResp) obj);
            }
        }));
        TradeLiveData<StrategyConfigInfo> tradeLiveDataFetchVPNInfo = ((SpotGridPresenter) dxcTrN()).fetchVPNInfo();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataFetchVPNInfo.observe(viewLifecycleOwner4, new PictureInPictureParams(new Function1() { // from class: o.vNT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.OLrzqt(this.copydefault, (StrategyConfigInfo) obj);
            }
        }));
        ((SpotGridPresenter) dxcTrN()).fJNWhG().AkhnZx().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.vNS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.copydefault(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        ((SpotGridPresenter) dxcTrN()).getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.vNP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.AEQbTJ(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
        TradeLiveData<TrailingPxResp> tradeLiveDataQfsBiF = ((SpotGridPresenter) dxcTrN()).QfsBiF();
        LifecycleOwner viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "");
        tradeLiveDataQfsBiF.observe(viewLifecycleOwner5, new PictureInPictureParams(new Function1() { // from class: o.vNU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.OLrzqt(this.KWHzl, (TrailingPxResp) obj);
            }
        }));
        TradeLiveData<AdditionalInvest> tradeLiveDataAYXKKw = ((SpotGridPresenter) dxcTrN()).AYXKKw();
        LifecycleOwner viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "");
        tradeLiveDataAYXKKw.observe(viewLifecycleOwner6, new PictureInPictureParams(new Function1() { // from class: o.vNW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.OLrzqt(this.AEQbTJ, (AdditionalInvest) obj);
            }
        }));
        ((SpotGridPresenter) dxcTrN()).sSMYrx().AkhnZx().observe(getViewLifecycleOwner(), new PictureInPictureParams(new Function1() { // from class: o.vNV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.KWHzl(this.copydefault, (java.lang.Boolean) obj);
            }
        }));
        C56111xwe<java.lang.String> c56111xweEZpvd = OcIXYQ().EZpvd();
        LifecycleOwner viewLifecycleOwner7 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner7, "");
        c56111xweEZpvd.observe(viewLifecycleOwner7, new PictureInPictureParams(new Function1() { // from class: o.vNX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.values(this.EZpvd, (java.lang.String) obj);
            }
        }));
        C56111xwe<java.lang.String> c56111xweAhwBna = OcIXYQ().AhwBna();
        LifecycleOwner viewLifecycleOwner8 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner8, "");
        c56111xweAhwBna.observe(viewLifecycleOwner8, new PictureInPictureParams(new Function1() { // from class: o.vOG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.AkhnZx(this.AEQbTJ, (java.lang.String) obj);
            }
        }));
        TradeLiveData<TicketEligibility> tradeLiveDataFIwbmz = ((SpotGridPresenter) dxcTrN()).fIwbmz();
        LifecycleOwner viewLifecycleOwner9 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner9, "");
        tradeLiveDataFIwbmz.observe(viewLifecycleOwner9, new PictureInPictureParams(new Function1() { // from class: o.vOU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.copydefault(this.KWHzl, (TicketEligibility) obj);
            }
        }));
        TradeLiveData<GridNumRangeBean> tradeLiveDataHDKMBd = ((SpotGridPresenter) dxcTrN()).hDKMBd();
        LifecycleOwner viewLifecycleOwner10 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner10, "");
        tradeLiveDataHDKMBd.observe(viewLifecycleOwner10, new PictureInPictureParams(new Function1() { // from class: o.vPa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.OLrzqt(this.KWHzl, (GridNumRangeBean) obj);
            }
        }));
        TradeLiveData<xMJ.Application> tradeLiveDataAhwBna = C54782xVc.AEQbTJ.AhwBna();
        LifecycleOwner viewLifecycleOwner11 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner11, "");
        tradeLiveDataAhwBna.observe(viewLifecycleOwner11, new PictureInPictureParams(new Function1() { // from class: o.vOX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.OLrzqt(this.OLrzqt, (xMJ.Application) obj);
            }
        }));
        LifecycleOwner viewLifecycleOwner12 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner12, "");
        wUL.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner12), null, null, new SpotGridFragment$subscribeOnUIChange$15(this, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(vNN vnn, StrategyResponse strategyResponse) {
        Intrinsics.checkNotNullParameter(strategyResponse, "");
        vnn.finit().AuCTel().KWHzl(C56390yDp.OLrzqt("grid", strategyResponse.getAlgoId()));
        xDM xdmCopydefault = vnn.OcIXYQ().copydefault();
        if (xdmCopydefault != null) {
            xdmCopydefault.KWHzl();
        }
        if (GridStartTriggerType.Companion.KWHzl(((SpotGridPresenter) vnn.dxcTrN()).wlaJM().getSignParams())) {
            RxBus.KWHzl(new vSS());
        }
        vnn.AwvSrB();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r7v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(vNN vnn, MinInvestResp minInvestResp) {
        Intrinsics.checkNotNullParameter(minInvestResp, "");
        C47988uAv c47988uAv = ((uPQ) vnn.gGvvIC()).wlaJM;
        xMR xmr = xMR.copydefault;
        C47988uAv.setInputLabel$default(c47988uAv, "> " + xmr.copydefault(((SpotGridPresenter) vnn.dxcTrN()).AEQbTJ(true)), null, 2, null);
        C47988uAv.setInputLabel$default(((uPQ) vnn.gGvvIC()).AEQbTJ, "> " + xmr.copydefault(((SpotGridPresenter) vnn.dxcTrN()).AEQbTJ(false)), null, 2, null);
        vnn.AuCTel();
        vnn.getNewProxyInstance();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v24, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v30, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v46, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v49, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v52, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r13v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r13v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r14v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(vNN vnn, GridProfitRateResp gridProfitRateResp) {
        java.lang.String str;
        java.lang.String minGridNum;
        java.lang.String strCopydefault;
        java.lang.String str2 = "--";
        if (gridProfitRateResp == null) {
            ((uPQ) vnn.gGvvIC()).AkhnZx.setText("--");
            ((uPQ) vnn.gGvvIC()).djBIcL.setVisibility(8);
            return Unit.INSTANCE;
        }
        xMR xmr = xMR.copydefault;
        java.lang.String perMinProfitRate = gridProfitRateResp.getPerMinProfitRate();
        RoundingMode roundingMode = RoundingMode.DOWN;
        java.lang.String percent$default = xMR.formatPercent$default(xmr, perMinProfitRate, 0, roundingMode, 2, null);
        java.lang.String percent$default2 = xMR.formatPercent$default(xmr, gridProfitRateResp.getPerMaxProfitRate(), 0, roundingMode, 2, null);
        if (C33129mqd.valueOf(gridProfitRateResp.getPerMinProfitRate(), 0)) {
            if (C33129mqd.gEmmrt(gridProfitRateResp.getMaxGirdNum(), 2)) {
                ((uPQ) vnn.gGvvIC()).djBIcL.setText(C33070mpX.AYXKKw(C55688xof.Application.fromRating));
            } else {
                StrategyConfigInfo strategyConfigInfoDjBIcL = ((SpotGridPresenter) vnn.dxcTrN()).djBIcL();
                if (Intrinsics.EZpvd((java.lang.Object) (strategyConfigInfoDjBIcL != null ? strategyConfigInfoDjBIcL.getMinGridNum() : null), (java.lang.Object) gridProfitRateResp.getMaxGirdNum())) {
                    strCopydefault = xmr.copydefault(gridProfitRateResp.getMaxGirdNum());
                } else {
                    StrategyConfigInfo strategyConfigInfoDjBIcL2 = ((SpotGridPresenter) vnn.dxcTrN()).djBIcL();
                    if (strategyConfigInfoDjBIcL2 == null || (minGridNum = strategyConfigInfoDjBIcL2.getMinGridNum()) == null) {
                        minGridNum = "";
                    }
                    strCopydefault = xmr.copydefault(minGridNum) + "-" + xmr.copydefault(gridProfitRateResp.getMaxGirdNum());
                }
                ((uPQ) vnn.gGvvIC()).djBIcL.setText(C33069mpW.copydefault(vnn, C55688xof.Application.newHeartRating, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("range", strCopydefault))));
            }
            ((uPQ) vnn.gGvvIC()).djBIcL.setVisibility(0);
            C47988uAv.setInputErrorMsg$default(((uPQ) vnn.gGvvIC()).AuCTel, null, 1, null);
        } else {
            ((uPQ) vnn.gGvvIC()).djBIcL.setVisibility(8);
        }
        if (!Intrinsics.EZpvd((java.lang.Object) percent$default, (java.lang.Object) percent$default2)) {
            str2 = percent$default + " - " + percent$default2;
        } else {
            if (percent$default != null && percent$default.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) percent$default)) {
                str = percent$default;
            }
            ((uPQ) vnn.gGvvIC()).AkhnZx.setText(C56033xvF.copydefault(((SpotGridPresenter) vnn.dxcTrN()).fvQaOB().gEmmrt(), ((SpotGridPresenter) vnn.dxcTrN()).fvQaOB().djBIcL(), str, gridProfitRateResp.getPerMinProfitAmt(), gridProfitRateResp.getPerMaxProfitAmt(), !C33129mqd.OLrzqt((java.lang.CharSequence) ((SpotGridPresenter) vnn.dxcTrN()).fvQaOB().AkhnZx()) ? ((SpotGridPresenter) vnn.dxcTrN()).fvQaOB().AkhnZx() : gridProfitRateResp.getProfitCcy(), (256 & 64) != 0 ? "--" : "--", (256 & 128) != 0 ? true : true, (256 & 256) != 0 ? 0 : 0));
            return Unit.INSTANCE;
        }
        str = str2;
        ((uPQ) vnn.gGvvIC()).AkhnZx.setText(C56033xvF.copydefault(((SpotGridPresenter) vnn.dxcTrN()).fvQaOB().gEmmrt(), ((SpotGridPresenter) vnn.dxcTrN()).fvQaOB().djBIcL(), str, gridProfitRateResp.getPerMinProfitAmt(), gridProfitRateResp.getPerMaxProfitAmt(), !C33129mqd.OLrzqt((java.lang.CharSequence) ((SpotGridPresenter) vnn.dxcTrN()).fvQaOB().AkhnZx()) ? ((SpotGridPresenter) vnn.dxcTrN()).fvQaOB().AkhnZx() : gridProfitRateResp.getProfitCcy(), (256 & 64) != 0 ? "--" : "--", (256 & 128) != 0 ? true : true, (256 & 256) != 0 ? 0 : 0));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(vNN vnn, StrategyConfigInfo strategyConfigInfo) {
        java.lang.String maxGridNum;
        Intrinsics.checkNotNullParameter(strategyConfigInfo, "");
        ((SpotGridPresenter) vnn.dxcTrN()).OLrzqt(strategyConfigInfo);
        ((SpotGridPresenter) vnn.dxcTrN()).getFieldNames();
        ((uPQ) vnn.gGvvIC()).copydefault.OLrzqt(strategyConfigInfo);
        java.lang.String minGridNum = strategyConfigInfo.getMinGridNum();
        GridNumRangeBean value = ((SpotGridPresenter) vnn.dxcTrN()).hDKMBd().getValue();
        if (value == null || (maxGridNum = value.getMaxGridNum()) == null) {
            maxGridNum = strategyConfigInfo.getMaxGridNum();
        }
        vnn.OLrzqt(minGridNum, maxGridNum);
        ((SpotGridPresenter) vnn.dxcTrN()).djSkpj();
        vnn.fvQaOB();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) vnn, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v2, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(vNN vnn, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            ((uPQ) vnn.gGvvIC()).AkhnZx.setVisibility(8);
            ((uPQ) vnn.gGvvIC()).QOLQEE.KWHzl(0L);
        } else {
            ((uPQ) vnn.gGvvIC()).AkhnZx.setVisibility(0);
            ((uPQ) vnn.gGvvIC()).QOLQEE.copydefault();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Class process forced to load method for inline: o.vSr.syncTrailingResp$default(o.vSr, com.okinc.unify_trade.biz.TrailingPxResp, int, java.lang.Object):void */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r2v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v15, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v20, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v25, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v29, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(vNN vnn, androidx.core.util.Pair pair) {
        xOW newProxyInstance;
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SpotGridPresenter) vnn.dxcTrN()).fJNWhG().bB_())) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) vnn, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SpotGridPresenter) vnn.dxcTrN()).iwGUEr().bB_())) {
            ((uPQ) vnn.gGvvIC()).AkhnZx.setText("--");
            ((uPQ) vnn.gGvvIC()).djBIcL.setVisibility(8);
        } else {
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SpotGridPresenter) vnn.dxcTrN()).getNewProxyInstance().bB_())) {
                C50553vSr.syncTrailingResp$default(((uPQ) vnn.gGvvIC()).copydefault, null, 1, null);
                java.lang.String tag = vnn.getTAG();
                java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
                pUU.copydefault(tag, "Get trailing px fail cause by :" + (message != null ? message : ""));
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SpotGridPresenter) vnn.dxcTrN()).valueOf().bB_())) {
                vnn.UeEOUB();
                vnn.AubY();
                vnn.EZpvd((AdditionalInvest) null);
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SpotGridPresenter) vnn.dxcTrN()).sSMYrx().bB_())) {
                if (GridStartTriggerType.Companion.KWHzl(((SpotGridPresenter) vnn.dxcTrN()).wlaJM().getSignParams())) {
                    vSO.Companion.copydefault(((SpotGridPresenter) vnn.dxcTrN()).fvQaOB().djBIcL(), ((SpotGridPresenter) vnn.dxcTrN()).fvQaOB().gEmmrt()).show(vnn.getChildFragmentManager(), "BotOrderFailedDialog");
                } else {
                    C55326xho.toast$default(((java.lang.Exception) pair.second).getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
                }
                C55867xrz c55867xrz = C55867xrz.KWHzl;
                long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
                java.lang.String strGEmmrt = ((SpotGridPresenter) vnn.dxcTrN()).fvQaOB().gEmmrt();
                java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
                java.lang.String str2 = message2 == null ? "" : message2;
                InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
                c55867xrz.KWHzl("bot_create_page", java.lang.String.valueOf(jCurrentTimeMillis), "grid", strGEmmrt, EopTrackEvent.KEY_RESULT_FAILED, new BotGrafanaInfo(null, str2, null, (interfaceC54581xNrOLrzqt == null || (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) == null || !newProxyInstance.QbewEr()) ? false : true, 5, null));
            } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) ((SpotGridPresenter) vnn.dxcTrN()).uzCIH().bB_())) {
                ((SpotGridPresenter) vnn.dxcTrN()).hDKMBd().setValue(null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(vNN vnn, TrailingPxResp trailingPxResp) {
        ((uPQ) vnn.gGvvIC()).copydefault.KWHzl(trailingPxResp);
        ((SpotGridPresenter) vnn.dxcTrN()).djSkpj();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(vNN vnn, AdditionalInvest additionalInvest) {
        Intrinsics.checkNotNullParameter(additionalInvest, "");
        vnn.UeEOUB();
        vnn.AubY();
        vnn.EZpvd(additionalInvest);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(vNN vnn, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            vnn.showLoading();
        } else {
            vnn.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit values(vNN vnn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        vnn.AxsJAY();
        vnn.UeEOUB();
        return Unit.INSTANCE;
    }

    public static final Unit AkhnZx(vNN vnn, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        vnn.AxsJAY();
        vnn.UeEOUB();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(vNN vnn, TicketEligibility ticketEligibility) {
        ((uPQ) vnn.gGvvIC()).fIwbmz.setData(new LossInsuranceDisplayData(ticketEligibility != null ? ticketEligibility.getEntityValue() : null, ticketEligibility != null ? ticketEligibility.getEntityStatus() : null, ticketEligibility != null ? java.lang.Boolean.valueOf(ticketEligibility.getEligible()) : null, "grid", yDY.copydefault(((SpotGridPresenter) vnn.dxcTrN()).fvQaOB().gEmmrt()), false, null, null, null, null, null, false, null, 8160, null));
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r6v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r7v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(vNN vnn, GridNumRangeBean gridNumRangeBean) {
        java.lang.String maxGridNum;
        java.lang.String minGridNum;
        java.lang.String str = "0";
        if (gridNumRangeBean == null || (maxGridNum = gridNumRangeBean.getMaxGridNum()) == null) {
            StrategyConfigInfo strategyConfigInfoDjBIcL = ((SpotGridPresenter) vnn.dxcTrN()).djBIcL();
            maxGridNum = strategyConfigInfoDjBIcL != null ? strategyConfigInfoDjBIcL.getMaxGridNum() : "0";
        }
        StrategyConfigInfo strategyConfigInfoDjBIcL2 = ((SpotGridPresenter) vnn.dxcTrN()).djBIcL();
        if (strategyConfigInfoDjBIcL2 != null && (minGridNum = strategyConfigInfoDjBIcL2.getMinGridNum()) != null) {
            str = minGridNum;
        }
        vnn.OLrzqt(str, maxGridNum);
        java.lang.String strFIwbmz = vnn.fIwbmz();
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strFIwbmz)) {
            ((uPQ) vnn.gGvvIC()).AuCTel.setInputErrorMsg(strFIwbmz);
        } else {
            ((uPQ) vnn.gGvvIC()).AuCTel.copydefault();
        }
        SpotGridPresenter.getGridProfitRate$default((SpotGridPresenter) vnn.dxcTrN(), 0L, null, 3, null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(vNN vnn, xMJ.Application application) {
        Intrinsics.checkNotNullParameter(application, "");
        java.lang.String strAYXKKw = application.AYXKKw();
        if (strAYXKKw == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAYXKKw)) {
            return Unit.INSTANCE;
        }
        vnn.AYXKKw = application.AYXKKw();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void OLrzqt(java.lang.String str, java.lang.String str2) {
        C55320xhi c55320xhiKWHzl;
        C55320xhi c55320xhiKWHzl2;
        if (C33129mqd.valueOf(str, str2)) {
            xMR xmr = xMR.copydefault;
            java.lang.String str3 = xmr.copydefault(str) + " - " + xmr.copydefault(str2);
            C55312xha c55312xhaValueOf = ((uPQ) gGvvIC()).sSMYrx.valueOf();
            if (c55312xhaValueOf != null && (c55320xhiKWHzl2 = c55312xhaValueOf.KWHzl()) != null) {
                c55320xhiKWHzl2.setText(C33070mpX.AYXKKw(C55688xof.Application.ensureClassLoader) + " (" + str3 + ")");
            }
            C47988uAv.setInputLabel$default(((uPQ) gGvvIC()).AuCTel, str3, null, 2, null);
            return;
        }
        C55312xha c55312xhaValueOf2 = ((uPQ) gGvvIC()).sSMYrx.valueOf();
        if (c55312xhaValueOf2 == null || (c55320xhiKWHzl = c55312xhaValueOf2.KWHzl()) == null) {
            return;
        }
        c55320xhiKWHzl.setText(C33070mpX.AYXKKw(C55688xof.Application.ensureClassLoader));
    }

    private final void aKErDB() {
        getParentFragmentManager().setFragmentResultListener("bot_one_click_copy", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vOe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                vNN.KWHzl(this.KWHzl, str, bundle);
            }
        });
        getParentFragmentManager().setFragmentResultListener("recommend_data", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vOg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                vNN.copydefault(this.OLrzqt, str, bundle);
            }
        });
        getChildFragmentManager().setFragmentResultListener("bot_order", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vOi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                vNN.AhwBna(this.KWHzl, str, bundle);
            }
        });
    }

    public static final void KWHzl(vNN vnn, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        android.os.Bundle arguments = vnn.getArguments();
        if (arguments != null) {
            arguments.putParcelable("bot_copy_req", bundle.getParcelable("bot_copy_req"));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void copydefault(vNN vnn, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        vnn.copydefault(bundle);
        ((SpotGridPresenter) vnn.dxcTrN()).fFgQHt();
        vnn.sSMYrx();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AhwBna(vNN vnn, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        ((SpotGridPresenter) vnn.dxcTrN()).RcXXUw();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void fvQaOB() {
        StrategyConfigInfo strategyConfigInfoDjBIcL = ((SpotGridPresenter) dxcTrN()).djBIcL();
        C54149wys c54149wys = C54149wys.AEQbTJ;
        C54154wyx c54154wyx = ((uPQ) gGvvIC()).OcIXYQ;
        Intrinsics.checkNotNullExpressionValue(c54154wyx, "");
        c54149wys.OLrzqt(c54154wyx, strategyConfigInfoDjBIcL, (30 & 2) != 0 ? false : false, (30 & 4) != 0 ? false : false, (30 & 8) != 0 ? "" : null, (30 & 16) != 0 ? null : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(AdditionalInvest additionalInvest) {
        ((uPQ) gGvvIC()).uzCIH.setText(((SpotGridPresenter) dxcTrN()).KWHzl(additionalInvest));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void UeEOUB() {
        SpotGridPresenter spotGridPresenter = (SpotGridPresenter) dxcTrN();
        java.lang.String value = OcIXYQ().AhwBna().getValue();
        if (value == null) {
            value = "0";
        }
        java.lang.String value2 = OcIXYQ().EZpvd().getValue();
        java.lang.String strCopydefault = spotGridPresenter.copydefault(value, value2 != null ? value2 : "0");
        android.widget.TextView textView = ((uPQ) gGvvIC()).DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(strCopydefault.length() > 0 ? 0 : 8);
        ((uPQ) gGvvIC()).DbNXlk.setText(strCopydefault);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AxsJAY() {
        java.lang.String strKWHzl = OcIXYQ().KWHzl();
        if (strKWHzl != null) {
            OLrzqt(strKWHzl);
        }
        java.lang.String strAEQbTJ = OcIXYQ().AEQbTJ(((SpotGridPresenter) dxcTrN()).fvQaOB(), ((SpotGridPresenter) dxcTrN()).zLjUOn());
        if (strAEQbTJ != null) {
            EZpvd(strAEQbTJ);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void OLrzqt(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) valueOf().copydefault(), (java.lang.Object) TtmlNode.RUBY_BASE) || Intrinsics.EZpvd((java.lang.Object) valueOf().copydefault(), (java.lang.Object) "dual")) {
            C53605woe c53605woe = ((uPQ) gGvvIC()).EZpvd;
            Intrinsics.checkNotNullExpressionValue(c53605woe, "");
            if (c53605woe.getVisibility() != 0) {
                ((uPQ) gGvvIC()).EZpvd.setVisibility(0);
            }
        }
        ((uPQ) gGvvIC()).EZpvd.setFooterAvaValue(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v7, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(java.lang.String str) {
        if (Intrinsics.EZpvd((java.lang.Object) valueOf().copydefault(), (java.lang.Object) "quote") || Intrinsics.EZpvd((java.lang.Object) valueOf().copydefault(), (java.lang.Object) "dual") || Intrinsics.EZpvd((java.lang.Object) valueOf().copydefault(), (java.lang.Object) "default_usdt")) {
            C53605woe c53605woe = ((uPQ) gGvvIC()).zsXlph;
            Intrinsics.checkNotNullExpressionValue(c53605woe, "");
            if (c53605woe.getVisibility() != 0) {
                ((uPQ) gGvvIC()).zsXlph.setVisibility(0);
            }
        }
        ((uPQ) gGvvIC()).zsXlph.setFooterAvaValue(str);
    }

    @Override // o.AbstractC48165uHj, o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
        super.onInvisible();
        OcIXYQ().AYXKKw();
        wPG.KWHzl.KWHzl();
        ORxRYg().copydefault();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v17, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v20, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void fJNWhG() {
        DigitInfoBean digitInfoBeanIsConnected = ((SpotGridPresenter) dxcTrN()).fvQaOB().isConnected();
        java.lang.String strAYXKKw = ((SpotGridPresenter) dxcTrN()).fvQaOB().AYXKKw();
        if (strAYXKKw == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAYXKKw)) {
            strAYXKKw = digitInfoBeanIsConnected.getSymbol();
        }
        ((uPQ) gGvvIC()).fetchVPNInfo.setText(C33069mpW.copydefault(this, C55688xof.Application.getStateWithUpdatedPosition, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", strAYXKKw))));
        ((uPQ) gGvvIC()).getNewProxyInstance.setMaxDecimal(digitInfoBeanIsConnected.getDigit());
        ((uPQ) gGvvIC()).iwGUEr.setMaxDecimal(digitInfoBeanIsConnected.getDigit());
        ((uPQ) gGvvIC()).getNewProxyInstance.setOnFocusChangeCallback(this.AhwBna);
        ((uPQ) gGvvIC()).iwGUEr.setOnFocusChangeCallback(this.AhwBna);
        ((uPQ) gGvvIC()).getNewProxyInstance.setOnTextChangeCallback(this.djBIcL);
        ((uPQ) gGvvIC()).iwGUEr.setOnTextChangeCallback(this.djBIcL);
        ((uPQ) gGvvIC()).wlaJM.setOnTextChangeCallback(this.djBIcL);
        ((uPQ) gGvvIC()).AEQbTJ.setOnTextChangeCallback(this.djBIcL);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void EZpvd(boolean z) {
        if (z) {
            valueOf().copydefault(((SpotGridPresenter) dxcTrN()).fvQaOB().AhwBna());
            wlaJM();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void AuCTelauCTel() {
        ((uPQ) gGvvIC()).zsXlph.setTransferCoin(((SpotGridPresenter) dxcTrN()).AuCTel());
        ((uPQ) gGvvIC()).wlaJM.setInputUnit(((SpotGridPresenter) dxcTrN()).AkhnZx());
        java.lang.String strORxRYg = ((SpotGridPresenter) dxcTrN()).ORxRYg();
        ((uPQ) gGvvIC()).wlaJM.setMaxDecimal((strORxRYg == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strORxRYg)) ? 8 : C33129mqd.AhwBna(strORxRYg));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v10, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void wlaJM() {
        java.lang.String baseDig;
        AbstractC54531xLw abstractC54531xLwOLrzqt;
        ((uPQ) gGvvIC()).EZpvd.setTransferCoin(((SpotGridPresenter) dxcTrN()).QbewEr());
        ((uPQ) gGvvIC()).AEQbTJ.setInputUnit(((SpotGridPresenter) dxcTrN()).QbewEr());
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault == null || (abstractC54531xLwOLrzqt = interfaceC54581xNrCopydefault.OLrzqt("SPOT")) == null) {
            baseDig = null;
        } else {
            java.lang.String strValueOf = ((SpotGridPresenter) dxcTrN()).fvQaOB().valueOf();
            if (strValueOf == null) {
                strValueOf = "";
            }
            IdxConfig idxConfigAkhnZx = abstractC54531xLwOLrzqt.AkhnZx(strValueOf);
            if (idxConfigAkhnZx != null) {
                baseDig = idxConfigAkhnZx.getBaseDig();
            }
        }
        ((uPQ) gGvvIC()).AEQbTJ.setMaxDecimal((baseDig == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) baseDig)) ? 8 : C33129mqd.AhwBna(baseDig));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zLjUOn() {
        java.lang.String strGEmmrt;
        java.lang.String strDjBIcL;
        OcIXYQ().AYXKKw();
        BizInstrument bizInstrumentAhwBna = ((SpotGridPresenter) dxcTrN()).AhwBna();
        C55915xsu c55915xsuOcIXYQ = OcIXYQ();
        if (bizInstrumentAhwBna == null || (strGEmmrt = bizInstrumentAhwBna.getInstId()) == null) {
            strGEmmrt = ((SpotGridPresenter) dxcTrN()).fvQaOB().gEmmrt();
        }
        if (bizInstrumentAhwBna == null || (strDjBIcL = bizInstrumentAhwBna.getInstType()) == null) {
            strDjBIcL = ((SpotGridPresenter) dxcTrN()).fvQaOB().djBIcL();
        }
        java.lang.String strAkhnZx = ((SpotGridPresenter) dxcTrN()).fvQaOB().AkhnZx();
        C55887xsS c55887xsS = new C55887xsS(strDjBIcL, strGEmmrt);
        c55887xsS.gEmmrt(strAkhnZx);
        c55915xsuOcIXYQ.EZpvd("grid", (64 & 2) != 0 ? "cash" : null, (64 & 4) != 0 ? "" : null, (64 & 8) != 0 ? java.lang.Boolean.TRUE : null, (64 & 16) != 0, (64 & 32) != 0 ? null : bizInstrumentAhwBna, (64 & 64) != 0 ? null : c55887xsS, (64 & 128) == 0 ? null : null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    private final void copydefault(java.lang.String str) {
        android.widget.TextView textView = ((uPQ) gGvvIC()).AYXKKw;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(StringsKt__StringsKt.fARcdN((java.lang.CharSequence) str) ^ true ? 0 : 8);
        ((uPQ) gGvvIC()).AYXKKw.setText(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final java.lang.String fIwbmz() {
        java.lang.String maxGridNum;
        java.lang.String strAkhnZx = ((uPQ) gGvvIC()).AuCTel.AkhnZx();
        StrategyConfigInfo strategyConfigInfoDjBIcL = ((SpotGridPresenter) dxcTrN()).djBIcL();
        java.lang.String maxGridNum2 = null;
        java.lang.String minGridNum = strategyConfigInfoDjBIcL != null ? strategyConfigInfoDjBIcL.getMinGridNum() : null;
        GridNumRangeBean value = ((SpotGridPresenter) dxcTrN()).hDKMBd().getValue();
        if (value == null || (maxGridNum = value.getMaxGridNum()) == null) {
            StrategyConfigInfo strategyConfigInfoDjBIcL2 = ((SpotGridPresenter) dxcTrN()).djBIcL();
            if (strategyConfigInfoDjBIcL2 != null) {
                maxGridNum2 = strategyConfigInfoDjBIcL2.getMaxGridNum();
            }
        } else {
            maxGridNum2 = maxGridNum;
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strAkhnZx) || minGridNum == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) minGridNum) || maxGridNum2 == null || StringsKt__StringsKt.fARcdN((java.lang.CharSequence) maxGridNum2)) {
            return "";
        }
        return C33129mqd.gEmmrt(strAkhnZx, minGridNum) ? C33069mpW.copydefault(this, C55688xof.Application.onDrawerSlide, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, minGridNum))) : C33129mqd.AEQbTJ(strAkhnZx, maxGridNum2) ? C33069mpW.copydefault(this, C55688xof.Application.ActionBarLayoutParams, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(DataInputModuleModel.DataInputItem.INPUT_TYPE_NUMBER, maxGridNum2))) : "";
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getFieldNames() {
        if (((uPQ) gGvvIC()).getNewProxyInstance.AkhnZx().length() != 0) {
            return true;
        }
        ((uPQ) gGvvIC()).getNewProxyInstance.zsXlph();
        C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C55688xof.Application.TransitionRes), 0, 1, (java.lang.Object) null);
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean ejfBZ() {
        if (((uPQ) gGvvIC()).iwGUEr.AkhnZx().length() != 0) {
            return true;
        }
        ((uPQ) gGvvIC()).iwGUEr.zsXlph();
        C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C55688xof.Application.VisibleForTesting), 0, 1, (java.lang.Object) null);
        return false;
    }

    public static /* synthetic */ boolean isGridCountValid$default(vNN vnn, java.lang.Integer num, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        return vnn.EZpvd(num);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r6v5, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean EZpvd(java.lang.Integer num) {
        java.lang.String strAkhnZx = ((uPQ) gGvvIC()).AuCTel.AkhnZx();
        if (strAkhnZx.length() == 0) {
            ((uPQ) gGvvIC()).AuCTel.zsXlph();
            C55326xho.toastWithFailedIcon$default(C33070mpX.AYXKKw(C55688xof.Application.otherwise), 0, 1, (java.lang.Object) null);
            return false;
        }
        if (num == null || C33129mqd.AhwBna(strAkhnZx) >= num.intValue()) {
            return true;
        }
        ((uPQ) gGvvIC()).AuCTel.zsXlph();
        C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(C48033uCm.Fragment.hfeTOA, C56423yEv.EZpvd(C56390yDp.OLrzqt("minGridNum", num.toString()))), 0, 1, (java.lang.Object) null);
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v12, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v15, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v19, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v2, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v16, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v20, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v32, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v4, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: Binding */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void QfsBiF() {
        if (!getFieldNames() || !ejfBZ()) {
            zuBGHE();
            return;
        }
        if (!Intrinsics.EZpvd(((SpotGridPresenter) dxcTrN()).QVAiDq(), java.lang.Boolean.TRUE)) {
            C55326xho.toast$default(getString(C55688xof.Application.setLogo), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            ((uPQ) gGvvIC()).iwGUEr.zsXlph();
            zuBGHE();
            return;
        }
        if (!isGridCountValid$default(this, null, 1, null)) {
            zuBGHE();
            return;
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) fIwbmz())) {
            C55326xho.toast$default(fIwbmz(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            ((uPQ) gGvvIC()).getNewProxyInstance.zsXlph();
            zuBGHE();
            return;
        }
        android.widget.TextView textView = ((uPQ) gGvvIC()).djBIcL;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        if (textView.getVisibility() == 0 && C33129mqd.OLrzqt(((uPQ) gGvvIC()).djBIcL.getText())) {
            C55326xho.toast$default(((uPQ) gGvvIC()).djBIcL.getText().toString(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
            ((uPQ) gGvvIC()).AuCTel.zsXlph();
            zuBGHE();
            return;
        }
        android.widget.TextView textView2 = ((uPQ) gGvvIC()).DbNXlk;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        if (textView2.getVisibility() == 0) {
            C56002xub.KWHzl.OLrzqt();
            zuBGHE();
            return;
        }
        if (fARcdN() && hDKMBd()) {
            if (!AuCTel() || !getNewProxyInstance() || ((uPQ) gGvvIC()).copydefault.DbNXlk()) {
                zuBGHE();
                return;
            }
            SmartEarnRequestParam earnParam = ((SpotGridPresenter) dxcTrN()).wlaJM().getEarnParam();
            if (earnParam == null || !earnParam.getEnabled() || OLrzqt(true)) {
                final java.lang.String str = C54589xNz.EZpvd.EZpvd() ? "demo" : "live";
                C32866mlf.onEvent$default("BotPlaceOrder_PlaceOrder_Button_Click", (TrackChannel[]) null, new Function1() { // from class: o.vOB
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return vNN.EZpvd(str, (EventParamsList) obj);
                    }
                }, 1, (java.lang.Object) null);
                gHZMYf();
            }
        }
    }

    public static final Unit EZpvd(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "grid", false, 4, null);
        EventParamsList.put$default(eventParamsList, OtcExtraKeys.MODE, str, false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void gHZMYf() {
        PriceOutOfRangeBottomSheet.Application application = PriceOutOfRangeBottomSheet.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        application.EZpvd(childFragmentManager, new PriceOutOfRangeBottomSheet.PriceOutOfRangeBottomSheetInput(this.AYXKKw, ((uPQ) gGvvIC()).getNewProxyInstance.AkhnZx(), ((uPQ) gGvvIC()).iwGUEr.AkhnZx(), ((SpotGridPresenter) dxcTrN()).fvQaOB().isConnected().getSymbol()), new Function1() { // from class: o.vOd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.AEQbTJ(this.AEQbTJ, (PriceRangeUtil.ValidatedPriceRange) obj);
            }
        }, new Function0() { // from class: o.vOc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vNN.uzCIH(this.AEQbTJ);
            }
        }, new Function0() { // from class: o.vOf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return vNN.getNewProxyInstance(this.AEQbTJ);
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v8, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(vNN vnn, PriceRangeUtil.ValidatedPriceRange validatedPriceRange) {
        Intrinsics.checkNotNullParameter(validatedPriceRange, "");
        int i = Application.copydefault[validatedPriceRange.ordinal()];
        if (i == 1 || i == 2) {
            ((uPQ) vnn.gGvvIC()).getNewProxyInstance.zsXlph();
        } else if (i == 3 || i == 4) {
            ((uPQ) vnn.gGvvIC()).iwGUEr.zsXlph();
        } else {
            ((uPQ) vnn.gGvvIC()).getNewProxyInstance.zsXlph();
        }
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH(vNN vnn) {
        vnn.copydefault();
        return Unit.INSTANCE;
    }

    public static final Unit getNewProxyInstance(vNN vnn) {
        vnn.copydefault();
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v16, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v25, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v28, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v11, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v6, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r4v1, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public final void copydefault() {
        xOW newProxyInstance;
        TpSlTriggerParam tpSlTriggerParamUpdateWith;
        ((SpotGridPresenter) dxcTrN()).wlaJM().setTradeQuoteCcy(((SpotGridPresenter) dxcTrN()).fARcdN());
        TpSlTriggerParamReqResp tpslTriggerParamReq = ((SpotGridPresenter) dxcTrN()).wlaJM().getTpslTriggerParamReq();
        TpSlTriggerParam tpSlTriggerParamOLrzqt = tpslTriggerParamReq != null ? C55765xqC.OLrzqt(tpslTriggerParamReq) : null;
        ((SpotGridPresenter) dxcTrN()).wlaJM().setTpslTriggerParamReq((tpSlTriggerParamOLrzqt == null || (tpSlTriggerParamUpdateWith = tpSlTriggerParamOLrzqt.updateWith(((uPQ) gGvvIC()).copydefault.valueOf())) == null) ? null : C55765xqC.AEQbTJ(tpSlTriggerParamUpdateWith));
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && newProxyInstance.QbewEr()) {
            StrategyBaseReq strategyBaseReq = new StrategyBaseReq((java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.Boolean) null, (java.lang.String) null, (TradeType) null, (java.lang.String) null, (java.lang.Boolean) null, 2047, (DefaultConstructorMarker) null);
            strategyBaseReq.setInstId(((SpotGridPresenter) dxcTrN()).fvQaOB().gEmmrt());
            strategyBaseReq.setTdMode("cash");
            strategyBaseReq.setOrdType("grid");
            BotOrderConfirmFragment botOrderConfirmFragmentCopydefault = BotOrderConfirmFragment.Companion.copydefault(((SpotGridPresenter) dxcTrN()).fvQaOB().gEmmrt(), ((SpotGridPresenter) dxcTrN()).fvQaOB().djBIcL(), new StrategyReqGroup(strategyBaseReq, (IceBergReq) null, (TwapReq) null, ((SpotGridPresenter) dxcTrN()).wlaJM(), (ContractGridReq) null, (StrategyMoveOrderReq) null, (SignalBotReq) null, (SmartArbitrageReq) null, (RecurringOrderData) null, (SmartPortfolioReq) null, (DcdOrderReq) null, false, C54149wys.AEQbTJ.EZpvd(((SpotGridPresenter) dxcTrN()).djBIcL()), (DcaOrderReq) null, (AiOrderReq) null, 28662, (DefaultConstructorMarker) null), (248 & 8) != 0 ? false : false, (248 & 16) != 0 ? null : null, (248 & 32) != 0 ? "" : null, (248 & 64) != 0 ? null : ((SpotGridPresenter) dxcTrN()).zsXlph().getValue(), (248 & 128) != 0 ? null : null);
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            botOrderConfirmFragmentCopydefault.show(childFragmentManager);
        } else {
            pUU.KWHzl("BotOrder", "Secondary confirmation feature disabled SpotGridFragment Start Order");
            ((SpotGridPresenter) dxcTrN()).RcXXUw();
        }
        if (Intrinsics.EZpvd((java.lang.Object) ((SpotGridPresenter) dxcTrN()).wlaJM().getSystemSource(), (java.lang.Object) "nmp")) {
            C55867xrz c55867xrz = C55867xrz.KWHzl;
            android.os.Bundle arguments = getArguments();
            java.io.Serializable serializable = arguments != null ? arguments.getSerializable("bot_track_param") : null;
            c55867xrz.AEQbTJ(serializable instanceof java.util.HashMap ? (java.util.HashMap) serializable : null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v5, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r1v9, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean AuCTel() {
        C47988uAv c47988uAv = ((uPQ) gGvvIC()).AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        if (c47988uAv.getVisibility() != 0) {
            return true;
        }
        kotlin.Pair<java.lang.Boolean, java.lang.String> pairOLrzqt = ((SpotGridPresenter) dxcTrN()).OLrzqt(((uPQ) gGvvIC()).AEQbTJ.AkhnZx(), ((uPQ) gGvvIC()).AEQbTJ.fARcdN(), false);
        this.copydefault = pairOLrzqt;
        boolean zBooleanValue = pairOLrzqt.getFirst().booleanValue();
        if (!this.copydefault.getFirst().booleanValue()) {
            zuBGHE();
        }
        C47988uAv c47988uAv2 = ((uPQ) gGvvIC()).AEQbTJ;
        c47988uAv2.removeCallbacks(this.OLrzqt);
        c47988uAv2.postDelayed(this.OLrzqt, 500L);
        return zBooleanValue;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v13, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getNewProxyInstance() {
        C47988uAv c47988uAv = ((uPQ) gGvvIC()).wlaJM;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        boolean zBooleanValue = true;
        if (c47988uAv.getVisibility() == 0) {
            kotlin.Pair<java.lang.Boolean, java.lang.String> pairOLrzqt = ((SpotGridPresenter) dxcTrN()).OLrzqt(((uPQ) gGvvIC()).wlaJM.AkhnZx(), ((uPQ) gGvvIC()).wlaJM.fARcdN(), true);
            this.fetchVPNInfo = pairOLrzqt;
            zBooleanValue = pairOLrzqt.getFirst().booleanValue();
            if (!this.fetchVPNInfo.getFirst().booleanValue()) {
                zuBGHE();
            }
            C47988uAv c47988uAv2 = ((uPQ) gGvvIC()).wlaJM;
            c47988uAv2.removeCallbacks(this.DbNXlk);
            c47988uAv2.postDelayed(this.DbNXlk, 500L);
        }
        return zBooleanValue;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean hDKMBd() {
        C47988uAv c47988uAv = ((uPQ) gGvvIC()).wlaJM;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        if (c47988uAv.getVisibility() != 0 || C33129mqd.OLrzqt((java.lang.CharSequence) ((uPQ) gGvvIC()).wlaJM.AkhnZx())) {
            return true;
        }
        C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(this, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2)))), 0, 1, (java.lang.Object) null);
        ((uPQ) gGvvIC()).wlaJM.zsXlph();
        zuBGHE();
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v11, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean fARcdN() {
        C47988uAv c47988uAv = ((uPQ) gGvvIC()).AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        if (c47988uAv.getVisibility() != 0 || C33129mqd.OLrzqt((java.lang.CharSequence) ((uPQ) gGvvIC()).AEQbTJ.AkhnZx())) {
            return true;
        }
        C55326xho.toastWithFailedIcon$default(C33069mpW.copydefault(this, C55688xof.Application.ActionBarDrawerToggleFrameworkActionBarDelegateApi18Impl, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("titlePrice", C33070mpX.AYXKKw(C55688xof.Application.ReportDrawnKtReportDrawnWhen2)))), 0, 1, (java.lang.Object) null);
        ((uPQ) gGvvIC()).AEQbTJ.zsXlph();
        zuBGHE();
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zuBGHE() {
        uPQ upq = (uPQ) gGvvIC();
        java.util.ArrayList arrayListCopydefault = yDY.copydefault(upq.getNewProxyInstance, upq.iwGUEr, upq.AuCTel, upq.wlaJM, upq.AEQbTJ);
        C49967uyY c49967uyY = C49967uyY.EZpvd;
        C47988uAv c47988uAv = upq.getNewProxyInstance;
        Intrinsics.checkNotNullExpressionValue(c47988uAv, "");
        c49967uyY.KWHzl(c47988uAv, C48033uCm.Application.fvQaOB, arrayListCopydefault);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: Presenter */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void AwvSrB() {
        uPQ upq = (uPQ) gGvvIC();
        C47988uAv.setInputContent$default(upq.getNewProxyInstance, "", false, false, 6, null);
        C47988uAv.setInputContent$default(upq.iwGUEr, "", false, false, 6, null);
        C47988uAv.setInputContent$default(upq.AuCTel, "", false, false, 6, null);
        C47988uAv.setInputContent$default(upq.wlaJM, "", false, false, 6, null);
        C47988uAv.setInputContent$default(upq.AEQbTJ, "", false, false, 6, null);
        upq.AuCTel.copydefault();
        upq.getNewProxyInstance.copydefault();
        upq.iwGUEr.copydefault();
        upq.copydefault.OLrzqt(((SpotGridPresenter) dxcTrN()).wlaJM(), ((SpotGridPresenter) dxcTrN()).zLjUOn());
        C55251xgS c55251xgS = upq.DTwDnp;
        Intrinsics.checkNotNullExpressionValue(c55251xgS, "");
        c55251xgS.setVisibility(8);
        copydefault("");
    }

    private final void KWHzl(boolean z, C47988uAv c47988uAv) {
        if (z || !C33129mqd.OLrzqt((java.lang.CharSequence) c47988uAv.AkhnZx())) {
            return;
        }
        C32866mlf.onEvent$default("BotPlaceOrder_GridQuantity_InputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.vOz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.gEmmrt((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit gEmmrt(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "spot_grid", false, 4, null);
        return Unit.INSTANCE;
    }

    public final void copydefault(final C47988uAv c47988uAv) {
        if (C33129mqd.OLrzqt((java.lang.CharSequence) c47988uAv.AkhnZx())) {
            C32866mlf.onEvent$default("BotPlaceOrder_PriceRange_InputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.vNL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return vNN.KWHzl(c47988uAv, this, (EventParamsList) obj);
                }
            }, 1, (java.lang.Object) null);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C47988uAv c47988uAv, vNN vnn, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        EventParamsList.put$default(eventParamsList, "bot_type", "spot_grid", false, 4, null);
        EventParamsList.put$default(eventParamsList, "range_type", Intrinsics.EZpvd(c47988uAv, ((uPQ) vnn.gGvvIC()).getNewProxyInstance) ? "lower" : "upper", false, 4, null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v14, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v18, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v9, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean iwGUEr() {
        java.lang.String strFetchVPNInfo = ((uPQ) gGvvIC()).getNewProxyInstance.fetchVPNInfo();
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strFetchVPNInfo)) {
            strFetchVPNInfo = ((uPQ) gGvvIC()).iwGUEr.fetchVPNInfo();
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strFetchVPNInfo)) {
            strFetchVPNInfo = ((uPQ) gGvvIC()).AuCTel.fetchVPNInfo();
        }
        if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strFetchVPNInfo)) {
            strFetchVPNInfo = ((uPQ) gGvvIC()).AYXKKw.getText().toString();
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strFetchVPNInfo)) {
            C55326xho.toastWithFailedIcon$default(strFetchVPNInfo, 0, 1, (java.lang.Object) null);
        }
        return !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strFetchVPNInfo);
    }

    private final void EZpvd(boolean z, C47988uAv c47988uAv) {
        if (z || !C33129mqd.OLrzqt((java.lang.CharSequence) c47988uAv.AkhnZx())) {
            return;
        }
        C32866mlf.onEvent$default("SpotBotPlaceOrder_InvestmentAmount_InputBox_Input", (TrackChannel[]) null, new Function1() { // from class: o.vNY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.valueOf((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit valueOf(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        C32866mlf.onEvent$default("BotPlaceOrder_Btm_InvestmentAmount_Drag", (TrackChannel[]) null, new Function1() { // from class: o.vOa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return vNN.AhwBna((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
    }

    public static final Unit AhwBna(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        eventParamsList.put("bot_type", "grid", true);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    private final void sSMYrx() {
        wPG.KWHzl.OLrzqt(((SpotGridPresenter) dxcTrN()).wlaJM());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: Binding */
    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: Binding */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ((uPQ) gGvvIC()).copydefault.hDKMBd();
        ((uPQ) gGvvIC()).zuBGHE.EZpvd();
        super.onDestroyView();
    }

    public final void AEQbTJ(java.util.List<SmartRecommendResp> list) {
        java.lang.Object obj;
        java.util.Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            StgyParam stgyParam = ((SmartRecommendResp) next).getStgyParam();
            if (Intrinsics.EZpvd(stgyParam != null ? stgyParam.getDuration() : null, (java.lang.Object) AiBackTestCycle.DUR_30.getMode())) {
                obj = next;
                break;
            }
        }
        SmartRecommendResp smartRecommendResp = (SmartRecommendResp) obj;
        if (smartRecommendResp != null) {
            KWHzl(smartRecommendResp.getStgyParam());
        }
    }
}
