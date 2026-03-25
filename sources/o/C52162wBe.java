package o;

import android.view.View;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.AutoVipProfitInfo;
import com.okinc.unify_trade.biz.StrategyDetailsResponse;
import com.okinc.unify_trade.biz.StrategyResponse;
import com.okinc.unify_trade.biz.subscribe.FundingRateData;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.DcaDetailsData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.presenter.DealRecordPresenter;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C48033uCm;
import o.C54066wxO;
import o.C54132wyb;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wBe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52162wBe extends AbstractC54505xKx<uNJ, DealRecordPresenter> {
    public final InterfaceC56387yDm EZpvd;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;
    public final int djBIcL = C48033uCm.Activity.AxsJAYsNCnLh;
    public java.lang.String valueOf = "";
    public java.util.List<DcaDetailsData> copydefault = yDY.AhwBna();
    public java.util.List<CommonEmptyData> KWHzl = yDY.AhwBna();
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wBd
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C52162wBe.KWHzl(this.EZpvd));
        }
    });
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.wBb
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52162wBe.AEQbTJ(this.OLrzqt);
        }
    });
    public java.lang.Runnable AYXKKw = new java.lang.Runnable() { // from class: o.wBn
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // java.lang.Runnable
        public final void run() {
            C52162wBe.AhwBna(this.copydefault);
        }
    };

    /* JADX INFO: renamed from: o.wBe$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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
        return this.djBIcL;
    }

    public C52162wBe() {
        final Function0 function0 = null;
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DcaHistoryFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DcaHistoryFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.DcaHistoryFragment$special$$inlined$activityViewModels$default$3
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
    }

    /* JADX INFO: renamed from: o.wBe$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wBe.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    private final TacticsDetailPresenter AEQbTJ() {
        return (TacticsDetailPresenter) this.EZpvd.getValue();
    }

    public static final boolean KWHzl(C52162wBe c52162wBe) {
        return Intrinsics.EZpvd((java.lang.Object) c52162wBe.dxcTrN().EZpvd().getOrderType(), (java.lang.Object) "contract_dca");
    }

    public final boolean copydefault() {
        return ((java.lang.Boolean) this.OLrzqt.getValue()).booleanValue();
    }

    public final C50027uzf<java.lang.Object> KWHzl() {
        return (C50027uzf) this.AhwBna.getValue();
    }

    public static final C50027uzf AEQbTJ(final C52162wBe c52162wBe) {
        C50027uzf c50027uzf = new C50027uzf(new TaskDescription());
        c50027uzf.register(C52536wPa.class, new wOU(new yHO() { // from class: o.wBw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.yHO
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return C52162wBe.OLrzqt(this.OLrzqt, (java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
            }
        }, new Function1() { // from class: o.wBc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52162wBe.EZpvd(this.KWHzl, (java.lang.String) obj);
            }
        }, new Function1() { // from class: o.wBh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52162wBe.copydefault(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        c50027uzf.register(java.lang.String.class, new wOV());
        c50027uzf.register(DcaDetailsData.class, new C52537wPb(new Function1() { // from class: o.wBk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52162wBe.valueOf(this.KWHzl, (java.lang.String) obj);
            }
        }, new Function2() { // from class: o.wBi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52162wBe.KWHzl(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2);
            }
        }));
        c50027uzf.register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wBj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52162wBe.KWHzl(this.AEQbTJ, (EmptyData) obj);
            }
        }));
        return c50027uzf;
    }

    /* JADX INFO: renamed from: o.wBe$TaskDescription */
    public static final class TaskDescription extends DiffUtil.ItemCallback<java.lang.Object> {
        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areItemsTheSame(java.lang.Object obj, java.lang.Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            return obj instanceof C52536wPa ? obj2 instanceof C52536wPa : obj instanceof java.lang.String ? obj2 instanceof java.lang.String : ((obj instanceof DcaDetailsData) && (obj2 instanceof DcaDetailsData)) ? Intrinsics.EZpvd((java.lang.Object) ((DcaDetailsData) obj).getCycleId(), (java.lang.Object) ((DcaDetailsData) obj2).getCycleId()) : (obj instanceof CommonEmptyData) && (obj2 instanceof CommonEmptyData) && ((CommonEmptyData) obj).getEmptyType() == ((CommonEmptyData) obj2).getEmptyType();
        }

        @Override // androidx.recyclerview.widget.DiffUtil.ItemCallback
        public boolean areContentsTheSame(java.lang.Object obj, java.lang.Object obj2) {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(obj2, "");
            if ((obj instanceof C52536wPa) && (obj2 instanceof C52536wPa)) {
                return Intrinsics.EZpvd(obj, obj2);
            }
            if ((obj instanceof java.lang.String) && (obj2 instanceof java.lang.String)) {
                return Intrinsics.EZpvd(obj, obj2);
            }
            if ((obj instanceof DcaDetailsData) && (obj2 instanceof DcaDetailsData)) {
                return Intrinsics.EZpvd(obj, obj2);
            }
            if ((obj instanceof CommonEmptyData) && (obj2 instanceof CommonEmptyData)) {
                return Intrinsics.EZpvd(obj, obj2);
            }
            return false;
        }
    }

    public static final Unit OLrzqt(C52162wBe c52162wBe, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        C43056riA c43056riA = C43056riA.AEQbTJ;
        android.content.Context contextRequireContext = c52162wBe.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        kotlin.Pair[] pairArr = new kotlin.Pair[4];
        pairArr[0] = C56390yDp.OLrzqt("sId", java.lang.String.valueOf(c52162wBe.AEQbTJ().KWHzl()));
        pairArr[1] = C56390yDp.OLrzqt("fee", str3);
        FundingRateData value = c52162wBe.dxcTrN().copydefault().getValue();
        java.lang.String fundingRate = value != null ? value.getFundingRate() : null;
        if (fundingRate == null) {
            fundingRate = "";
        }
        pairArr[2] = C56390yDp.OLrzqt("rate", fundingRate);
        pairArr[3] = C56390yDp.OLrzqt("precision", java.lang.String.valueOf(C56033xvF.gEmmrt(str, str2, C56033xvF.OLrzqt(str2, str, ""))));
        c43056riA.OLrzqt(contextRequireContext, "okluatradingeco", "/bot/grid/funding-fee-history", C56424yEw.gEmmrt(pairArr));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C52162wBe c52162wBe, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C54066wxO.ActionBar actionBar = C54066wxO.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = c52162wBe.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        AutoVipProfitInfo autoVipProfitInfo = c52162wBe.AEQbTJ().zLjUOn().getAutoVipProfitInfo();
        if (autoVipProfitInfo == null) {
            autoVipProfitInfo = new AutoVipProfitInfo((java.util.List) null, (java.util.List) null, (java.lang.String) null, false, false, 31, (DefaultConstructorMarker) null);
        }
        actionBar.AEQbTJ(childFragmentManager, str, (56 & 4) != 0 ? null : autoVipProfitInfo, (56 & 8) != 0 ? null : null, (56 & 16) != 0 ? false : false, (56 & 32) != 0 ? 0 : 0);
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C52162wBe c52162wBe, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C54132wyb.TaskDescription taskDescription = C54132wyb.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = c52162wBe.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        C54132wyb.TaskDescription.newInstance$default(taskDescription, childFragmentManager, str, c52162wBe.AEQbTJ().zLjUOn(), false, 8, null);
        return Unit.INSTANCE;
    }

    public static final Unit valueOf(C52162wBe c52162wBe, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        c52162wBe.OLrzqt(str);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52162wBe c52162wBe, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c52162wBe.AEQbTJ(str, str2);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52162wBe c52162wBe, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        refreshDcaRecordData$default(c52162wBe, false, 1, null);
        return Unit.INSTANCE;
    }

    public static final void AhwBna(C52162wBe c52162wBe) {
        c52162wBe.valueOf();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        uNJ unjGGvvIC = gGvvIC();
        RecyclerView recyclerView = unjGGvvIC.EZpvd;
        recyclerView.setAdapter(KWHzl());
        recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
        unjGGvvIC.KWHzl.KWHzl(new InterfaceC57900yrD() { // from class: o.wBl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C52162wBe.KWHzl(this.EZpvd, interfaceC57934yrl);
            }
        });
    }

    public static final void KWHzl(C52162wBe c52162wBe, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c52162wBe.copydefault(true);
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        StrategyDetailsResponse strategyDetailsResponseAhwBna = AEQbTJ().AhwBna();
        dxcTrN().OLrzqt(strategyDetailsResponseAhwBna);
        dxcTrN().EZpvd(strategyDetailsResponseAhwBna.getInstId());
        AYXKKw();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        refreshDcaRecordData$default(this, false, 1, null);
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        if (KWHzl().getItemCount() == 0) {
            super.showLoading();
        }
    }

    public final void OLrzqt(java.lang.String str) {
        java.lang.Object next;
        java.util.Iterator<T> it = this.copydefault.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) ((DcaDetailsData) next).getCycleId(), (java.lang.Object) str)) {
                    break;
                }
            }
        }
        DcaDetailsData dcaDetailsData = (DcaDetailsData) next;
        if (dcaDetailsData == null) {
            return;
        }
        this.valueOf = str;
        Date detailsExpTime = dcaDetailsData.getDetailsExpTime();
        if (!dcaDetailsData.isDetailsVisible() && (detailsExpTime == null || Calendar.getInstance().getTime().after(detailsExpTime))) {
            this.copydefault = EZpvd(new Function1() { // from class: o.wBg
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52162wBe.EZpvd((DcaDetailsData) obj);
                }
            });
            C50029uzh.EZpvd.copydefault(this.AYXKKw, 500L);
            AEQbTJ(str);
        } else {
            this.copydefault = EZpvd(new Function1() { // from class: o.wBp
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52162wBe.OLrzqt((DcaDetailsData) obj);
                }
            });
            valueOf();
        }
    }

    public static final DcaDetailsData EZpvd(DcaDetailsData dcaDetailsData) {
        Intrinsics.checkNotNullParameter(dcaDetailsData, "");
        return dcaDetailsData.copy((2047 & 1) != 0 ? dcaDetailsData.cycleId : null, (2047 & 2) != 0 ? dcaDetailsData.cycleIdText : null, (2047 & 4) != 0 ? dcaDetailsData.ccy : null, (2047 & 8) != 0 ? dcaDetailsData.createTime : null, (2047 & 16) != 0 ? dcaDetailsData.profit : null, (2047 & 32) != 0 ? dcaDetailsData.profitRatio : null, (2047 & 64) != 0 ? dcaDetailsData.profitColor : 0, (2047 & 128) != 0 ? dcaDetailsData.isPendingSell : false, (2047 & 256) != 0 ? dcaDetailsData.isDetailsVisible : false, (2047 & 512) != 0 ? dcaDetailsData.detailsData : null, (2047 & 1024) != 0 ? dcaDetailsData.detailsExpTime : null, (2047 & 2048) != 0 ? dcaDetailsData.showLoading : true);
    }

    public static final DcaDetailsData OLrzqt(DcaDetailsData dcaDetailsData) {
        Intrinsics.checkNotNullParameter(dcaDetailsData, "");
        return dcaDetailsData.copy((2047 & 1) != 0 ? dcaDetailsData.cycleId : null, (2047 & 2) != 0 ? dcaDetailsData.cycleIdText : null, (2047 & 4) != 0 ? dcaDetailsData.ccy : null, (2047 & 8) != 0 ? dcaDetailsData.createTime : null, (2047 & 16) != 0 ? dcaDetailsData.profit : null, (2047 & 32) != 0 ? dcaDetailsData.profitRatio : null, (2047 & 64) != 0 ? dcaDetailsData.profitColor : 0, (2047 & 128) != 0 ? dcaDetailsData.isPendingSell : false, (2047 & 256) != 0 ? dcaDetailsData.isDetailsVisible : !dcaDetailsData.isDetailsVisible(), (2047 & 512) != 0 ? dcaDetailsData.detailsData : null, (2047 & 1024) != 0 ? dcaDetailsData.detailsExpTime : null, (2047 & 2048) != 0 ? dcaDetailsData.showLoading : false);
    }

    public final void AEQbTJ(java.lang.String str) {
        dxcTrN().KWHzl("", copydefault() ? "2" : "1", "", str);
    }

    public final void AEQbTJ(final java.lang.String str, final java.lang.String str2) {
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.copydefault(C55688xof.Application.Hx);
        viewOnClickListenerC54939xaY.EZpvd(C48033uCm.Fragment.DVmcag, new View.OnClickListener() { // from class: o.wBm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52162wBe.OLrzqt(this.OLrzqt, str, str2, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.OLrzqt(C55688xof.Application.DcMfJKfwDlxl, new View.OnClickListener() { // from class: o.wBu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52162wBe.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void OLrzqt(C52162wBe c52162wBe, java.lang.String str, java.lang.String str2, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        c52162wBe.dxcTrN().OLrzqt(str, str2);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static /* synthetic */ void refreshDcaRecordData$default(C52162wBe c52162wBe, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        c52162wBe.copydefault(z);
    }

    public final void copydefault(boolean z) {
        if (copydefault()) {
            dxcTrN().EZpvd(z);
        } else {
            dxcTrN().copydefault(z);
        }
    }

    private final void AYXKKw() {
        TradeLiveData<C55804xqp<StrategyDetailsResponse>> newProxyInstance = AEQbTJ().getNewProxyInstance();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        newProxyInstance.observe(viewLifecycleOwner, new Application(new Function1() { // from class: o.wBq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52162wBe.KWHzl(this.KWHzl, (C55804xqp) obj);
            }
        }));
        dxcTrN().AYXKKw().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.wBt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52162wBe.AEQbTJ(this.KWHzl, (java.util.ArrayList) obj);
            }
        }));
        dxcTrN().valueOf().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.wBr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52162wBe.KWHzl(this.EZpvd, (java.util.List) obj);
            }
        }));
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.wBs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52162wBe.OLrzqt(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.wBy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52162wBe.copydefault(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().OLrzqt().observe(getViewLifecycleOwner(), new Application(new Function1() { // from class: o.wBx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52162wBe.KWHzl(this.KWHzl, (StrategyResponse) obj);
            }
        }));
    }

    public static final Unit KWHzl(C52162wBe c52162wBe, C55804xqp c55804xqp) {
        Intrinsics.checkNotNullParameter(c55804xqp, "");
        c52162wBe.valueOf();
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C52162wBe c52162wBe, final java.util.ArrayList arrayList) {
        C50029uzh.EZpvd.KWHzl(c52162wBe.AYXKKw);
        c52162wBe.copydefault = c52162wBe.EZpvd(new Function1() { // from class: o.wBo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52162wBe.KWHzl(arrayList, (DcaDetailsData) obj);
            }
        });
        c52162wBe.valueOf();
        return Unit.INSTANCE;
    }

    public static final DcaDetailsData KWHzl(java.util.ArrayList arrayList, DcaDetailsData dcaDetailsData) {
        Intrinsics.checkNotNullParameter(dcaDetailsData, "");
        Calendar calendar = Calendar.getInstance();
        calendar.add(12, 1);
        Unit unit = Unit.INSTANCE;
        return dcaDetailsData.copy((2047 & 1) != 0 ? dcaDetailsData.cycleId : null, (2047 & 2) != 0 ? dcaDetailsData.cycleIdText : null, (2047 & 4) != 0 ? dcaDetailsData.ccy : null, (2047 & 8) != 0 ? dcaDetailsData.createTime : null, (2047 & 16) != 0 ? dcaDetailsData.profit : null, (2047 & 32) != 0 ? dcaDetailsData.profitRatio : null, (2047 & 64) != 0 ? dcaDetailsData.profitColor : 0, (2047 & 128) != 0 ? dcaDetailsData.isPendingSell : false, (2047 & 256) != 0 ? dcaDetailsData.isDetailsVisible : true, (2047 & 512) != 0 ? dcaDetailsData.detailsData : arrayList, (2047 & 1024) != 0 ? dcaDetailsData.detailsExpTime : calendar.getTime(), (2047 & 2048) != 0 ? dcaDetailsData.showLoading : false);
    }

    public static final Unit KWHzl(C52162wBe c52162wBe, java.util.List list) {
        C33546myW c33546myW = c52162wBe.gGvvIC().KWHzl;
        c33546myW.valueOf();
        Intrinsics.copydefault(list);
        DcaDetailsData dcaDetailsData = (DcaDetailsData) CollectionsKt___CollectionsKt.wlaJM(list);
        c33546myW.AhwBna(C33129mqd.AEQbTJ(dcaDetailsData != null ? dcaDetailsData.getCycleId() : null, 1));
        if (list.isEmpty()) {
            c52162wBe.KWHzl = CommonEmptyData.ActionBar.buildEmptyData$default(CommonEmptyData.Companion, null, 0, null, null, false, false, 31, null);
            c52162wBe.copydefault = yDY.AhwBna();
        } else {
            c52162wBe.KWHzl = yDY.AhwBna();
            c52162wBe.copydefault = list;
        }
        c52162wBe.valueOf();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52162wBe, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r14v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C52162wBe c52162wBe, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c52162wBe.dxcTrN().AkhnZx().bB_()) || Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c52162wBe.dxcTrN().gEmmrt().bB_())) {
            java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
            if (message == null) {
                message = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
            }
            c52162wBe.KWHzl = CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, message, 60, false, null, null, false, 28, null);
            c52162wBe.copydefault = yDY.AhwBna();
            c52162wBe.valueOf();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52162wBe, false, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
            if (message2 != null) {
                C55326xho.toastWithFailedIcon$default(message2, 0, 1, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C52162wBe c52162wBe, androidx.core.util.Pair pair) {
        if (((java.lang.Boolean) pair.second).booleanValue()) {
            c52162wBe.showLoading();
        } else {
            c52162wBe.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52162wBe c52162wBe, StrategyResponse strategyResponse) {
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.DcMfJKsfEqpH, 0, 1, (java.lang.Object) null);
        refreshDcaRecordData$default(c52162wBe, false, 1, null);
        return Unit.INSTANCE;
    }

    private final void valueOf() {
        java.lang.String strTakeNonBlankTradeQuoteCcy;
        C50027uzf<java.lang.Object> c50027uzfKWHzl = KWHzl();
        java.util.List listOLrzqt = C56402yEa.OLrzqt();
        C55804xqp<StrategyDetailsResponse> value = AEQbTJ().getNewProxyInstance().getValue();
        listOLrzqt.add(new C52536wPa(value != null ? value.copydefault() : null, AEQbTJ().valueOf().getValue()));
        if (!this.copydefault.isEmpty()) {
            DcaDetailsData dcaDetailsData = (DcaDetailsData) CollectionsKt___CollectionsKt.firstOrNull(this.copydefault);
            java.lang.String ccy = dcaDetailsData != null ? dcaDetailsData.getCcy() : null;
            if (ccy == null) {
                ccy = "";
            }
            if (!copydefault() && (strTakeNonBlankTradeQuoteCcy = dxcTrN().EZpvd().takeNonBlankTradeQuoteCcy()) != null && strTakeNonBlankTradeQuoteCcy.length() != 0 && !StringsKt__StringsKt.fARcdN((java.lang.CharSequence) strTakeNonBlankTradeQuoteCcy)) {
                ccy = strTakeNonBlankTradeQuoteCcy;
            }
            if (StringsKt__StringsKt.fARcdN((java.lang.CharSequence) ccy)) {
                ccy = "--";
            }
            listOLrzqt.add(ccy);
        }
        listOLrzqt.addAll(this.copydefault);
        listOLrzqt.addAll(this.KWHzl);
        C50027uzf.submitList$default(c50027uzfKWHzl, C56402yEa.fARcdN(listOLrzqt), null, 2, null);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        C50029uzh.EZpvd.KWHzl(this.AYXKKw);
    }

    public final java.util.List<DcaDetailsData> EZpvd(Function1<? super DcaDetailsData, DcaDetailsData> function1) {
        java.util.List<DcaDetailsData> list = this.copydefault;
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(list, 10));
        for (DcaDetailsData dcaDetailsDataInvoke : list) {
            if (Intrinsics.EZpvd((java.lang.Object) dcaDetailsDataInvoke.getCycleId(), (java.lang.Object) this.valueOf)) {
                dcaDetailsDataInvoke = function1.invoke(dcaDetailsDataInvoke);
            }
            arrayList.add(dcaDetailsDataInvoke);
        }
        return arrayList;
    }
}
