package o;

import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.okinc.trade.manager.common.position.TradePositionManager;
import com.okinc.tradingbot.impl.dto.TradeListResp;
import com.okinc.tradingbot.impl.strategy.fragment.detail.DcaOngoingFragment$initViewModel$1;
import com.okinc.tradingbot.impl.strategy.fragment.detail.DcaOngoingFragment$initViewModel$2;
import com.okinc.tradingbot.impl.strategy.fragment.detail.DcaOngoingFragment$initViewModel$4;
import com.okinc.tradingbot.impl.strategy.fragment.detail.DcaOngoingFragment$initViewModel$5;
import com.okinc.tradingbot.impl.strategy.fragment.detail.DcaOngoingFragment$initViewModel$6;
import com.okinc.tradingbot.impl.strategy.fragment.detail.DcaOngoingViewModel;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.ContractGridClosePositionData;
import com.okinc.unify_trade.biz.ContractGridClosePositionReq;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyPositionResponse;
import com.okinc.unify_trade.bot.constant.TacticsUiConst;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.TacticsData;
import com.okinc.unify_trade.bot.data.TacticsInsideItemData;
import java.math.RoundingMode;
import kotlin.LazyThreadSafetyMode;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import o.AbstractC53802wsP;
import o.C48033uCm;
import o.C49511upt;
import o.C52761wXj;
import o.C55688xof;
import o.vDZ;
import o.vNB;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wBv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C52179wBv extends AbstractC52227wDp {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public final int AYXKKw = C48033uCm.Activity.ODWQjV;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm DbNXlk;
    public uNP KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public final InterfaceC56387yDm valueOf;
    public java.lang.String values;

    /* JADX INFO: renamed from: o.wBv$Activity */
    public static final /* synthetic */ class Activity implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.AYXKKw;
    }

    public C52179wBv() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DcaOngoingFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DcaOngoingFragment$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DcaOngoingViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DcaOngoingFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DcaOngoingFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DcaOngoingFragment$special$$inlined$viewModels$default$5
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
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DcaOngoingFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DcaOngoingFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DcaOngoingFragment$special$$inlined$activityViewModels$default$3
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.wCb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52179wBv.wlaJM(this.EZpvd);
            }
        });
        this.gEmmrt = C56392yDr.copydefault(new Function0() { // from class: o.wCe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C52179wBv.QKVWgx(this.copydefault));
            }
        });
        this.AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.wBA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52179wBv.gHZMYf(this.copydefault);
            }
        });
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.wBE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52179wBv.DTwDnp(this.OLrzqt);
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.wBB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52179wBv.getNewProxyInstance(this.copydefault);
            }
        });
        this.OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wBD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52179wBv.AuCTelauCTel(this.OLrzqt);
            }
        });
        this.AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.wBH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52179wBv.OcIXYQ(this.AEQbTJ);
            }
        });
        this.djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.wBG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52179wBv.zLjUOn(this.AEQbTJ);
            }
        });
    }

    public final DcaOngoingViewModel DbNXlk() {
        return (DcaOngoingViewModel) this.DbNXlk.getValue();
    }

    private final TacticsDetailPresenter AuCTel() {
        return (TacticsDetailPresenter) this.AEQbTJ.getValue();
    }

    private final StrategyDetailsResponse fARcdN() {
        return (StrategyDetailsResponse) this.valueOf.getValue();
    }

    public static final StrategyDetailsResponse wlaJM(C52179wBv c52179wBv) {
        return c52179wBv.AuCTel().AhwBna();
    }

    public static final boolean QKVWgx(C52179wBv c52179wBv) {
        return Intrinsics.EZpvd((java.lang.Object) c52179wBv.fARcdN().getOrderType(), (java.lang.Object) "contract_dca");
    }

    private final boolean getNewProxyInstance() {
        return ((java.lang.Boolean) this.gEmmrt.getValue()).booleanValue();
    }

    public final StrategyDetailsResponse valueOf() {
        C55804xqp<StrategyDetailsResponse> value = AuCTel().getNewProxyInstance().getValue();
        if (value != null) {
            return value.copydefault();
        }
        return null;
    }

    public final java.lang.String AYXKKw() {
        StrategyDetailsResponse strategyDetailsResponseValueOf = valueOf();
        return C33129mqd.addS$default(strategyDetailsResponseValueOf != null ? strategyDetailsResponseValueOf.getCompletedCycles() : null, 1, null, null, null, 14, null);
    }

    public final C53801wsO AhwBna() {
        return (C53801wsO) this.AhwBna.getValue();
    }

    public static final C53801wsO gHZMYf(final C52179wBv c52179wBv) {
        return new C53801wsO(new Function0() { // from class: o.wBO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52179wBv.AxsJAY(this.copydefault);
            }
        }, new Function0() { // from class: o.wBW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52179wBv.zuBGHE(this.AEQbTJ);
            }
        });
    }

    public static final Unit AxsJAY(C52179wBv c52179wBv) {
        c52179wBv.KWHzl(C33069mpW.copydefault(C55688xof.Application.onSetCaptioningEnabled, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", C56033xvF.AEQbTJ(c52179wBv.fARcdN().getInstType(), c52179wBv.fARcdN().getInstId())))), C33070mpX.AYXKKw(C55688xof.Application.toKeyCode));
        return Unit.INSTANCE;
    }

    public static final Unit zuBGHE(C52179wBv c52179wBv) {
        c52179wBv.KWHzl(C33070mpX.AYXKKw(C55688xof.Application.gLWkOL), C33070mpX.AYXKKw(C55688xof.Application.getActiveQueueItemId));
        return Unit.INSTANCE;
    }

    public final C53800wsN djBIcL() {
        return (C53800wsN) this.isConnected.getValue();
    }

    public static final C53800wsN DTwDnp(final C52179wBv c52179wBv) {
        android.content.Context contextRequireContext = c52179wBv.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        return new C53800wsN(contextRequireContext, 3, true, new Function1() { // from class: o.wBM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52179wBv.KWHzl(this.AEQbTJ, (Triple) obj);
            }
        });
    }

    public static final Unit KWHzl(C52179wBv c52179wBv, Triple triple) {
        StrategyPositionResponse strategyPositionResponseKWHzl;
        TradePositionManager.PositionItem positionItem;
        Intrinsics.checkNotNullParameter(triple, "");
        TacticsUiConst.BotListSubItemType botListSubItemType = (TacticsUiConst.BotListSubItemType) triple.component1();
        TacticsInsideItemData tacticsInsideItemData = (TacticsInsideItemData) triple.component3();
        if (botListSubItemType instanceof TacticsUiConst.BotListSubItemType.BotSubTip) {
            c52179wBv.KWHzl(tacticsInsideItemData != null ? tacticsInsideItemData.getTitle() : null, tacticsInsideItemData != null ? tacticsInsideItemData.getDoubtMsg() : null);
        } else if ((botListSubItemType instanceof TacticsUiConst.BotListSubItemType.BotSubPosition) && (strategyPositionResponseKWHzl = c52179wBv.DbNXlk().OLrzqt().getValue().KWHzl()) != null && (positionItem = strategyPositionResponseKWHzl.getPositionItem()) != null) {
            android.content.Context contextRequireContext = c52179wBv.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            C52696wUz.OLrzqt(positionItem, contextRequireContext);
        }
        return Unit.INSTANCE;
    }

    public final C53796wsJ OLrzqt() {
        return (C53796wsJ) this.copydefault.getValue();
    }

    public static final C53796wsJ getNewProxyInstance(final C52179wBv c52179wBv) {
        return new C53796wsJ(new Function0() { // from class: o.wCd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52179wBv.hDKMBd(this.EZpvd);
            }
        }, new Function0() { // from class: o.wCa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52179wBv.uzCIH(this.EZpvd);
            }
        });
    }

    public static final Unit hDKMBd(C52179wBv c52179wBv) {
        c52179wBv.DbNXlk().AEQbTJ(c52179wBv.fARcdN().getAlgoId());
        return Unit.INSTANCE;
    }

    public static final Unit uzCIH(C52179wBv c52179wBv) {
        TacticsData tacticsDataZLjUOn = c52179wBv.AuCTel().zLjUOn();
        vDZ.StateListAnimator stateListAnimator = vDZ.Companion;
        androidx.fragment.app.FragmentManager parentFragmentManager = c52179wBv.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "");
        stateListAnimator.KWHzl(tacticsDataZLjUOn, parentFragmentManager);
        return Unit.INSTANCE;
    }

    public final C53797wsK gEmmrt() {
        return (C53797wsK) this.OLrzqt.getValue();
    }

    public static final Unit AubY(C52179wBv c52179wBv) {
        c52179wBv.EZpvd();
        return Unit.INSTANCE;
    }

    public static final C53797wsK AuCTelauCTel(final C52179wBv c52179wBv) {
        return new C53797wsK(new Function0() { // from class: o.wBY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52179wBv.zsXlph(this.AEQbTJ);
            }
        }, new Function0() { // from class: o.wBX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52179wBv.AubY(this.EZpvd);
            }
        });
    }

    public static final Unit zsXlph(C52179wBv c52179wBv) {
        DetailsData detailsDataKWHzl = c52179wBv.KWHzl();
        if (detailsDataKWHzl != null) {
            C52315wGw.Companion.AEQbTJ(detailsDataKWHzl).show(c52179wBv.getChildFragmentManager(), c52179wBv.getTAG());
        }
        return Unit.INSTANCE;
    }

    public final C53803wsQ values() {
        return (C53803wsQ) this.AkhnZx.getValue();
    }

    public static final C53803wsQ OcIXYQ(final C52179wBv c52179wBv) {
        return new C53803wsQ(new Function1() { // from class: o.wBJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52179wBv.OLrzqt(this.EZpvd, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.wBI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52179wBv.EZpvd(this.copydefault, (java.lang.String) obj);
            }
        });
    }

    public static final Unit OLrzqt(C52179wBv c52179wBv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c52179wBv.DbNXlk().copydefault(str);
        c52179wBv.EZpvd(c52179wBv.DbNXlk().OLrzqt().getValue(), c52179wBv.DbNXlk().copydefault().getValue());
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C52179wBv c52179wBv, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c52179wBv.copydefault(str);
        return Unit.INSTANCE;
    }

    private final ConcatAdapter fJNWhG() {
        return (ConcatAdapter) this.djBIcL.getValue();
    }

    public static final ConcatAdapter zLjUOn(C52179wBv c52179wBv) {
        return new ConcatAdapter(new ConcatAdapter.Config.Builder().setIsolateViewTypes(true).build(), (RecyclerView.Adapter<? extends RecyclerView.ViewHolder>[]) new RecyclerView.Adapter[]{c52179wBv.AhwBna(), c52179wBv.djBIcL(), c52179wBv.OLrzqt(), c52179wBv.gEmmrt(), c52179wBv.values()});
    }

    /* JADX INFO: renamed from: o.wBv$TaskDescription */
    /* JADX INFO: loaded from: classes19.dex */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wBv.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C52179wBv copydefault(boolean z) {
            C52179wBv c52179wBv = new C52179wBv();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("IS_NO_CLOSE_KEY", z);
            c52179wBv.setArguments(bundle);
            return c52179wBv;
        }
    }

    public final boolean AkhnZx() {
        android.os.Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("IS_NO_CLOSE_KEY", false);
        }
        return false;
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        uNP unpCopydefault = uNP.copydefault(view);
        this.KWHzl = unpCopydefault;
        if (unpCopydefault != null) {
            EZpvd(unpCopydefault);
        }
        ejfBZ();
    }

    private final void ejfBZ() {
        C52692wUv.flowAndCollect$default(FlowKt.combine(DbNXlk().OLrzqt(), DbNXlk().copydefault(), new DcaOngoingFragment$initViewModel$1(null)), this, null, new DcaOngoingFragment$initViewModel$2(this, null), 2, null);
        if (getNewProxyInstance()) {
            DbNXlk().KWHzl(fARcdN().getAlgoId());
        }
        TradeLiveData<C55804xqp<StrategyDetailsResponse>> newProxyInstance = AuCTel().getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        newProxyInstance.observe(viewLifecycleOwner, new Activity(new Function1() { // from class: o.wBK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52179wBv.AEQbTJ(this.OLrzqt, (C55804xqp) obj);
            }
        }));
        StateFlow<vNB<C51015vez>> stateFlowAEQbTJ = DbNXlk().AEQbTJ();
        Lifecycle.State state = Lifecycle.State.CREATED;
        C52692wUv.copydefault(stateFlowAEQbTJ, this, state, new DcaOngoingFragment$initViewModel$4(this, null));
        C52692wUv.copydefault(DbNXlk().EZpvd(), this, state, new DcaOngoingFragment$initViewModel$5(this, null));
        C52692wUv.flowAndCollect$default(DbNXlk().fJNWhG(), this, null, new DcaOngoingFragment$initViewModel$6(this, null), 2, null);
        AuCTel().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Activity(new Function1() { // from class: o.wBN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52179wBv.AEQbTJ(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
        C56111xwe<java.util.List<ContractGridClosePositionData>> c56111xweIsConnected = AuCTel().isConnected();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56111xweIsConnected.observe(viewLifecycleOwner2, new Activity(new Function1() { // from class: o.wBL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52179wBv.KWHzl((java.util.List) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C52179wBv c52179wBv, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        StrategyDetailsResponse strategyDetailsResponse = (StrategyDetailsResponse) c55804xqp.copydefault();
        if (!Intrinsics.EZpvd((java.lang.Object) strategyDetailsResponse.getAvgPx(), (java.lang.Object) c52179wBv.values)) {
            if (c52179wBv.values != null) {
                c52179wBv.AEQbTJ();
            }
            c52179wBv.values = strategyDetailsResponse.getAvgPx();
        } else {
            c52179wBv.EZpvd(c52179wBv.DbNXlk().OLrzqt().getValue(), c52179wBv.DbNXlk().copydefault().getValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C52179wBv c52179wBv, androidx.core.util.Pair pair) {
        java.lang.String message;
        if (Intrinsics.EZpvd(pair.first, (java.lang.Object) c52179wBv.AuCTel().values().bB_()) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.onRequestPermissionsResult, 0, 1, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public final void copydefault(StrategyPositionResponse strategyPositionResponse) {
        uNM unmAEQbTJ = uNM.AEQbTJ(android.view.LayoutInflater.from(getContext()), null, false);
        java.lang.String upl = strategyPositionResponse.getUpl();
        android.widget.TextView textView = unmAEQbTJ.AEQbTJ;
        java.lang.String instId = strategyPositionResponse.getInstId();
        java.lang.String instType = strategyPositionResponse.getInstType();
        RoundingMode roundingMode = RoundingMode.HALF_UP;
        textView.setText(C56033xvF.getBotPnl$default(instId, instType, upl, null, true, true, null, false, null, null, roundingMode, 968, null));
        textView.setTextColor(C56033xvF.OLrzqt((java.lang.Object) upl));
        unmAEQbTJ.EZpvd.setText(C56033xvF.getBotPnl$default(strategyPositionResponse.getInstId(), strategyPositionResponse.getInstType(), strategyPositionResponse.getEstClosePositionFee(), null, true, false, null, false, null, null, roundingMode, 1000, null));
        Intrinsics.checkNotNullExpressionValue(unmAEQbTJ, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        LinearLayoutCompat root = unmAEQbTJ.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        viewOnClickListenerC54939xaY.EZpvd(root);
        viewOnClickListenerC54939xaY.EZpvd(C48033uCm.Fragment.hrNTAI, new View.OnClickListener() { // from class: o.wCc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52179wBv.copydefault(this.AEQbTJ, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C55688xof.Application.onConfigurationChanged, new View.OnClickListener() { // from class: o.wBZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52179wBv.gEmmrt(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void copydefault(C52179wBv c52179wBv, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c52179wBv.DbNXlk().AEQbTJ(c52179wBv.fARcdN().getAlgoId(), c52179wBv.AYXKKw());
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void gEmmrt(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void EZpvd(vNB<StrategyPositionResponse> vnb, vNB<? extends java.util.List<TradeListResp>> vnb2) {
        StrategyDetailsResponse strategyDetailsResponseValueOf;
        java.lang.String floatProfit;
        java.lang.String floatProfitRate;
        if (AkhnZx()) {
            StrategyPositionResponse strategyPositionResponseKWHzl = vnb.KWHzl();
            if (getNewProxyInstance()) {
                floatProfit = strategyPositionResponseKWHzl != null ? strategyPositionResponseKWHzl.getUpl() : null;
                if (floatProfit == null) {
                    floatProfit = "";
                }
                if (!getNewProxyInstance()) {
                    floatProfitRate = strategyPositionResponseKWHzl != null ? strategyPositionResponseKWHzl.getUplRatio() : null;
                    java.lang.String str = floatProfitRate != null ? "" : floatProfitRate;
                    if (!getNewProxyInstance() && strategyPositionResponseKWHzl != null) {
                        C53801wsO c53801wsOAhwBna = AhwBna();
                        java.lang.String coinTitle$default = C56033xvF.getCoinTitle$default(fARcdN().getInstType(), fARcdN().getInstId(), false, null, null, 28, null);
                        java.lang.String strAhwBna = getNewProxyInstance() ? C56033xvF.AhwBna(fARcdN().getDirection()) : "";
                        java.lang.String botLever$default = getNewProxyInstance() ? C56033xvF.getBotLever$default(fARcdN().getLever(), false, 2, null) : "";
                        boolean newProxyInstance = getNewProxyInstance();
                        java.lang.String strCopydefault = C33069mpW.copydefault(C55688xof.Application.QSBOWP, C56423yEv.EZpvd(C56390yDp.OLrzqt("cycleNum", AYXKKw())));
                        java.lang.String adl = strategyPositionResponseKWHzl.getAdl();
                        java.lang.String str2 = str;
                        c53801wsOAhwBna.EZpvd(new C53804wsR(coinTitle$default, strAhwBna, botLever$default, newProxyInstance, strCopydefault, adl == null ? "" : adl, getNewProxyInstance() && (vnb instanceof vNB.TaskDescription), C56033xvF.getBotPnl$default(fARcdN().getInstId(), fARcdN().getInstType(), floatProfit, null, false, false, null, false, null, null, null, 2040, null), C56033xvF.OLrzqt((java.lang.Object) floatProfit), C56033xvF.fmtBotPnlPercent$default(str2, true, 0, 4, null), C56033xvF.OLrzqt((java.lang.Object) str2), C33069mpW.copydefault(C55688xof.Application.onSetCaptioningEnabled, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", C56033xvF.AEQbTJ(fARcdN().getInstType(), fARcdN().getInstId())))), C56033xvF.valueOf(fARcdN().getDirection())));
                        djBIcL().submitList(DbNXlk().EZpvd(strategyPositionResponseKWHzl, fARcdN().getDirection()));
                        OLrzqt().copydefault(false);
                        gEmmrt().KWHzl(true);
                        values().submitList(yDY.AhwBna());
                    } else {
                        AhwBna().submitList(yDY.AhwBna());
                        djBIcL().submitList(yDY.AhwBna());
                        OLrzqt().copydefault(false);
                        gEmmrt().KWHzl(false);
                        values().submitList(C56402yEa.EZpvd(new AbstractC53802wsP.StateListAnimator(null, null, C33070mpX.AYXKKw(C48033uCm.Fragment.hlkKmr), null, 6, 0, false, false, 0, 0, 1003, null)));
                    }
                } else {
                    StrategyDetailsResponse strategyDetailsResponseValueOf2 = valueOf();
                    if (strategyDetailsResponseValueOf2 != null) {
                        floatProfitRate = strategyDetailsResponseValueOf2.getFloatProfitRate();
                    }
                    if (floatProfitRate != null) {
                    }
                    if (!getNewProxyInstance()) {
                        AhwBna().submitList(yDY.AhwBna());
                        djBIcL().submitList(yDY.AhwBna());
                        OLrzqt().copydefault(false);
                        gEmmrt().KWHzl(false);
                        values().submitList(C56402yEa.EZpvd(new AbstractC53802wsP.StateListAnimator(null, null, C33070mpX.AYXKKw(C48033uCm.Fragment.hlkKmr), null, 6, 0, false, false, 0, 0, 1003, null)));
                    }
                }
            } else {
                StrategyDetailsResponse strategyDetailsResponseValueOf3 = valueOf();
                if (strategyDetailsResponseValueOf3 != null) {
                    floatProfit = strategyDetailsResponseValueOf3.getFloatProfit();
                }
                if (floatProfit == null) {
                }
                if (!getNewProxyInstance()) {
                }
            }
        } else {
            gEmmrt().KWHzl(false);
            java.util.List<TradeListResp> listKWHzl = vnb2.KWHzl();
            if (listKWHzl == null) {
                listKWHzl = yDY.AhwBna();
            }
            C53869wtd c53869wtd = new C53869wtd();
            android.content.Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
            java.util.List<AbstractC53802wsP> listAEQbTJ = c53869wtd.AEQbTJ(contextRequireContext, listKWHzl, valueOf(), DbNXlk().KWHzl());
            if (listAEQbTJ.isEmpty()) {
                AhwBna().submitList(yDY.AhwBna());
                djBIcL().submitList(yDY.AhwBna());
                OLrzqt().copydefault(false);
                values().submitList(C56402yEa.EZpvd(new AbstractC53802wsP.StateListAnimator(null, null, C33070mpX.AYXKKw(C48033uCm.Fragment.hlkKmr), null, 6, 0, false, false, 0, 0, 1003, null)));
            } else {
                values().submitList(listAEQbTJ);
                StrategyPositionResponse strategyPositionResponseKWHzl2 = vnb.KWHzl();
                StrategyDetailsResponse strategyDetailsResponseValueOf4 = valueOf();
                java.lang.String floatProfit2 = strategyDetailsResponseValueOf4 != null ? strategyDetailsResponseValueOf4.getFloatProfit() : null;
                if (floatProfit2 == null) {
                    floatProfit2 = "";
                }
                StrategyDetailsResponse strategyDetailsResponseValueOf5 = valueOf();
                java.lang.String floatProfitRate2 = strategyDetailsResponseValueOf5 != null ? strategyDetailsResponseValueOf5.getFloatProfitRate() : null;
                java.lang.String str3 = floatProfitRate2 == null ? "" : floatProfitRate2;
                C53801wsO c53801wsOAhwBna2 = AhwBna();
                java.lang.String coinTitle$default2 = C56033xvF.getCoinTitle$default(fARcdN().getInstType(), fARcdN().getInstId(), false, null, null, 28, null);
                java.lang.String strAhwBna2 = getNewProxyInstance() ? C56033xvF.AhwBna(fARcdN().getDirection()) : "";
                java.lang.String botLever$default2 = getNewProxyInstance() ? C56033xvF.getBotLever$default(fARcdN().getLever(), false, 2, null) : "";
                boolean newProxyInstance2 = getNewProxyInstance();
                java.lang.String strCopydefault2 = C33069mpW.copydefault(C55688xof.Application.QSBOWP, C56423yEv.EZpvd(C56390yDp.OLrzqt("cycleNum", AYXKKw())));
                java.lang.String adl2 = strategyPositionResponseKWHzl2 != null ? strategyPositionResponseKWHzl2.getAdl() : null;
                java.lang.String str4 = str3;
                c53801wsOAhwBna2.EZpvd(new C53804wsR(coinTitle$default2, strAhwBna2, botLever$default2, newProxyInstance2, strCopydefault2, adl2 == null ? "" : adl2, getNewProxyInstance() && (vnb instanceof vNB.TaskDescription), C56033xvF.getBotPnl$default(fARcdN().getInstId(), fARcdN().getInstType(), floatProfit2, null, false, false, null, false, null, null, null, 2040, null), C56033xvF.OLrzqt((java.lang.Object) floatProfit2), C56033xvF.fmtBotPnlPercent$default(str4, true, 0, 4, null), C56033xvF.OLrzqt((java.lang.Object) str4), C33069mpW.copydefault(C55688xof.Application.onSetCaptioningEnabled, C56423yEv.EZpvd(C56390yDp.OLrzqt("ccy", C56033xvF.AEQbTJ(fARcdN().getInstType(), fARcdN().getInstId())))), C56033xvF.valueOf(fARcdN().getDirection())));
                if (getNewProxyInstance() && strategyPositionResponseKWHzl2 != null) {
                    djBIcL().submitList(DbNXlk().EZpvd(strategyPositionResponseKWHzl2, fARcdN().getDirection()));
                } else if (!getNewProxyInstance() && (strategyDetailsResponseValueOf = valueOf()) != null) {
                    djBIcL().submitList(DbNXlk().copydefault(strategyDetailsResponseValueOf));
                }
                OLrzqt().copydefault(getNewProxyInstance());
            }
        }
        if (vnb2 instanceof vNB.Activity) {
            return;
        }
        rVN.reportFullyDrawn$default(this, vnb2 instanceof vNB.TaskDescription, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    /* JADX INFO: renamed from: o.wBv$Application */
    public static final class Application extends GridLayoutManager.SpanSizeLookup {
        public Application() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.SpanSizeLookup
        public int getSpanSize(int i) {
            int itemCount = C52179wBv.this.AhwBna().getItemCount();
            int itemCount2 = C52179wBv.this.djBIcL().getItemCount();
            (C52179wBv.this.AkhnZx() ? C52179wBv.this.gEmmrt() : C52179wBv.this.OLrzqt()).getItemCount();
            return (i >= itemCount && i < itemCount + itemCount2) ? 1 : 3;
        }
    }

    public final void EZpvd(uNP unp) {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
        gridLayoutManager.setSpanSizeLookup(new Application());
        RecyclerView recyclerView = unp.OLrzqt;
        if (AkhnZx()) {
            RecyclerView recyclerView2 = unp.OLrzqt;
            recyclerView2.setPadding(recyclerView2.getPaddingStart(), C55298xhM.dp2px$default(8.0f, null, 1, null), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
        }
        recyclerView.setLayoutManager(gridLayoutManager);
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        SimpleItemAnimator simpleItemAnimator = itemAnimator instanceof SimpleItemAnimator ? (SimpleItemAnimator) itemAnimator : null;
        if (simpleItemAnimator != null) {
            simpleItemAnimator.setSupportsChangeAnimations(false);
            simpleItemAnimator.setAddDuration(0L);
            simpleItemAnimator.setRemoveDuration(0L);
            simpleItemAnimator.setMoveDuration(0L);
            simpleItemAnimator.setChangeDuration(0L);
        }
        if (recyclerView.getItemDecorationCount() == 0) {
            recyclerView.addItemDecoration(new C52190wCf(3, 0, C55298xhM.dpInt$default(8, (android.content.Context) null, 1, (java.lang.Object) null)));
            recyclerView.addItemDecoration(new C52541wPf(new Function0() { // from class: o.wBz
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return C52179wBv.AwvSrB(this.EZpvd);
                }
            }, new Function0() { // from class: o.wBC
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return java.lang.Integer.valueOf(C52179wBv.sSMYrx(this.EZpvd));
                }
            }));
        }
        recyclerView.setAdapter(fJNWhG());
    }

    public static final C53803wsQ AwvSrB(C52179wBv c52179wBv) {
        return c52179wBv.values();
    }

    public static final int sSMYrx(C52179wBv c52179wBv) {
        return c52179wBv.AhwBna().getItemCount() + c52179wBv.djBIcL().getItemCount() + (c52179wBv.AkhnZx() ? c52179wBv.gEmmrt() : c52179wBv.OLrzqt()).getItemCount();
    }

    public final DetailsData KWHzl() {
        StrategyPositionResponse strategyPositionResponseKWHzl = DbNXlk().OLrzqt().getValue().KWHzl();
        if (strategyPositionResponseKWHzl == null) {
            return null;
        }
        C55969xtv c55969xtv = new C55969xtv();
        C55804xqp<StrategyDetailsResponse> value = AuCTel().getNewProxyInstance().getValue();
        c55969xtv.OLrzqt(value != null ? value.copydefault() : null);
        return (DetailsData) CollectionsKt___CollectionsKt.firstOrNull(c55969xtv.copydefault(new C55804xqp<>("", C56402yEa.EZpvd(strategyPositionResponseKWHzl), null, null, 12, null)));
    }

    public final void EZpvd() {
        StrategyDetailsResponse strategyDetailsResponseCopydefault;
        final DetailsData detailsDataKWHzl;
        xOW newProxyInstance;
        C55804xqp<StrategyDetailsResponse> value = AuCTel().getNewProxyInstance().getValue();
        if (value == null || (strategyDetailsResponseCopydefault = value.copydefault()) == null || (detailsDataKWHzl = KWHzl()) == null) {
            return;
        }
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt != null && (newProxyInstance = interfaceC54581xNrOLrzqt.getNewProxyInstance()) != null && !newProxyInstance.uzCIH()) {
            java.lang.String algoId = detailsDataKWHzl.getAlgoId();
            AuCTel().KWHzl(new ContractGridClosePositionReq(algoId == null ? "" : algoId, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, java.lang.Boolean.TRUE, 14, (DefaultConstructorMarker) null));
            return;
        }
        java.lang.String type = detailsDataKWHzl.getType();
        java.lang.String strAYXKKw = C33070mpX.AYXKKw(C55688xof.Application.ActivityResultContractsStartActivityForResult);
        java.lang.String strCopydefault = C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsRequestPermission, C56424yEw.gEmmrt(C56390yDp.OLrzqt("tradeTitle", C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, strategyDetailsResponseCopydefault.getInstId(), strategyDetailsResponseCopydefault.getInstType(), false, false, 8, null)), C56390yDp.OLrzqt("tradeType", type), C56390yDp.OLrzqt("tradeSymbol", C56033xvF.getBotLever$default(detailsDataKWHzl.getLevel(), false, 2, null))));
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C49511upt.StateListAnimator.AxsJAY, null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC49607urj abstractC49607urj = (AbstractC49607urj) viewDataBindingInflate;
        android.widget.TextView textView = abstractC49607urj.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        android.widget.TextView textView2 = abstractC49607urj.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
        abstractC49607urj.KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.wBQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                C52179wBv.AEQbTJ(this.EZpvd, compoundButton, z);
            }
        });
        java.lang.String strAYXKKw2 = C33070mpX.AYXKKw(C55688xof.Application.updateBackInvokedCallbackStateactivity_release);
        final int iCopydefault = C33070mpX.copydefault(C52761wXj.Activity.fbC);
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(C33061mpO.setupSpanStyles$default(C33061mpO.setupSpanStyles$default(strCopydefault, new java.lang.String[]{type}, 0, null, false, new Function1() { // from class: o.wBS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52179wBv.KWHzl(detailsDataKWHzl, (java.util.List) obj);
            }
        }, 14, null), new java.lang.String[]{strAYXKKw}, 0, null, false, new Function1() { // from class: o.wBT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52179wBv.copydefault(iCopydefault, (java.util.List) obj);
            }
        }, 14, null), strAYXKKw2);
        android.view.View root = abstractC49607urj.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        viewOnClickListenerC54939xaY.EZpvd(root);
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C55688xof.Application.itxZVF);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wBP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52179wBv.EZpvd(detailsDataKWHzl, this, viewOnClickListenerC54939xaY, view);
            }
        });
        java.lang.String string2 = viewOnClickListenerC54939xaY.getContext().getString(C48033uCm.Fragment.DjWNei);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        viewOnClickListenerC54939xaY.AEQbTJ(string2, new View.OnClickListener() { // from class: o.wBR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52179wBv.AhwBna(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(C52179wBv c52179wBv, android.widget.CompoundButton compoundButton, boolean z) {
        InterfaceC54581xNr interfaceC54581xNrOLrzqt;
        C54630xPm c54630xPmAuCTelauCTel;
        if (!(c52179wBv.getContext() instanceof LifecycleOwner) || (interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt()) == null || (c54630xPmAuCTelauCTel = interfaceC54581xNrOLrzqt.AuCTelauCTel()) == null) {
            return;
        }
        java.lang.Object context = c52179wBv.getContext();
        LifecycleOwner lifecycleOwner = context instanceof LifecycleOwner ? (LifecycleOwner) context : null;
        c54630xPmAuCTelauCTel.KWHzl(!z, lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null);
    }

    public static final Unit KWHzl(DetailsData detailsData, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(detailsData.getSideColor()));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(int i, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(i));
        return Unit.INSTANCE;
    }

    public static final void EZpvd(DetailsData detailsData, C52179wBv c52179wBv, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        java.lang.String algoId = detailsData.getAlgoId();
        if (algoId == null) {
            algoId = "";
        }
        c52179wBv.AuCTel().KWHzl(new ContractGridClosePositionReq(algoId, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, java.lang.Boolean.TRUE, 14, (DefaultConstructorMarker) null));
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void AhwBna(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void copydefault(final java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.copydefault(C55688xof.Application.Hx);
        viewOnClickListenerC54939xaY.EZpvd(C48033uCm.Fragment.DVmcag, new View.OnClickListener() { // from class: o.wBV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52179wBv.AEQbTJ(this.OLrzqt, str, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C55688xof.Application.DcMfJKfwDlxl, new View.OnClickListener() { // from class: o.wBU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52179wBv.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void AEQbTJ(C52179wBv c52179wBv, java.lang.String str, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        if (c52179wBv.getNewProxyInstance()) {
            c52179wBv.DbNXlk().OLrzqt(c52179wBv.fARcdN().getAlgoId(), str);
        } else {
            c52179wBv.DbNXlk().KWHzl(c52179wBv.fARcdN().getAlgoId(), str);
        }
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public final void KWHzl(java.lang.CharSequence charSequence, java.lang.String str) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(charSequence, str);
        viewOnClickListenerC54939xaY.EZpvd(C55688xof.Application.trackPipAnimationHintView, new View.OnClickListener() { // from class: o.wBF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52179wBv.valueOf(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void valueOf(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getNewProxyInstance()) {
            DcaOngoingViewModel dcaOngoingViewModelDbNXlk = DbNXlk();
            Lifecycle lifecycle = getLifecycle();
            Intrinsics.checkNotNullExpressionValue(lifecycle, "");
            dcaOngoingViewModelDbNXlk.EZpvd(lifecycle, fARcdN().getAlgoId());
        }
        AEQbTJ();
    }

    public final void AEQbTJ() {
        DbNXlk().OLrzqt(fARcdN().getAlgoId(), getNewProxyInstance() ? "2" : "1", AYXKKw());
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        DbNXlk().valueOf();
    }
}
