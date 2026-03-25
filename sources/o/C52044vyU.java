package o;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.biz.TacticsType;
import com.okinc.p2p.api.OtcRouteConst;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradeuilib.widget.SelectedTime;
import com.okinc.tradingbot.impl.market_place.home.filter.BotStyleManagerViewModel;
import com.okinc.tradingbot.impl.market_place.my_bot.presenter.MyBotPresenter;
import com.okinc.tradingbot.impl.strategy.fragment.tactics_trade.BotOrderListPresenter;
import com.okinc.unify_trade.biz.BotOngoingParams;
import com.okinc.unify_trade.biz.OrderPositionData;
import com.okinc.unify_trade.bot.list.CardStyle;
import com.okinc.unify_trade.bot.list.FilterState;
import com.okinc.unify_trade.bot.list.SortOption;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C51459vnS;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vyU, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C52044vyU extends AbstractC54505xKx<AbstractC50793vap, BotOrderListPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int copydefault = 8;
    public C52006vxj AYXKKw;
    public C50000uzE AhwBna;
    public boolean EZpvd;
    public final InterfaceC56387yDm OLrzqt;
    public final InterfaceC56387yDm djBIcL;
    public final int KWHzl = C48033uCm.Activity.QOjuYg;
    public boolean AEQbTJ = true;

    /* JADX INFO: renamed from: o.vyU$Application */
    public static final /* synthetic */ class Application implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(Function1 function1) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean fetchVPNInfo() {
        return true;
    }

    @Override // o.AbstractC54505xKx
    public boolean bv_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.KWHzl;
    }

    public C52044vyU() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotStyleManagerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.nmp.my_bot.fragment.NmpBotListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.nmp.my_bot.fragment.NmpBotListFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.nmp.my_bot.fragment.NmpBotListFragment$special$$inlined$activityViewModels$default$3
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MyBotPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.nmp.my_bot.fragment.NmpBotListFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.nmp.my_bot.fragment.NmpBotListFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.nmp.my_bot.fragment.NmpBotListFragment$special$$inlined$activityViewModels$default$6
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

    /* JADX INFO: Access modifiers changed from: private */
    public final BotStyleManagerViewModel valueOf() {
        return (BotStyleManagerViewModel) this.OLrzqt.getValue();
    }

    private final MyBotPresenter AYXKKw() {
        return (MyBotPresenter) this.djBIcL.getValue();
    }

    /* JADX INFO: renamed from: o.vyU$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vyU.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C52044vyU newInstance$default(StateListAnimator stateListAnimator, boolean z, boolean z2, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                z2 = false;
            }
            return stateListAnimator.copydefault(z, z2);
        }

        public final C52044vyU copydefault(boolean z, boolean z2) {
            C52044vyU c52044vyU = new C52044vyU();
            c52044vyU.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("is_history_bot", java.lang.Boolean.valueOf(z)), C56390yDp.OLrzqt("bot_is_filter", java.lang.Boolean.valueOf(z2))));
            return c52044vyU;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C52006vxj c52006vxj = gGvvIC().copydefault;
        Intrinsics.checkNotNullExpressionValue(c52006vxj, "");
        wPQ.KWHzl(c52006vxj, C56071xvr.gEmmrt.fJNWhG());
        android.os.Bundle arguments = getArguments();
        this.EZpvd = arguments != null ? arguments.getBoolean("is_history_bot") : false;
        BotOrderListPresenter botOrderListPresenterDxcTrN = dxcTrN();
        android.os.Bundle arguments2 = getArguments();
        botOrderListPresenterDxcTrN.OLrzqt(arguments2 != null ? arguments2.getBoolean("bot_is_filter") : false);
        this.AYXKKw = gGvvIC().copydefault;
        gGvvIC().copydefault.OLrzqt(AkhnZx());
        gGvvIC().copydefault.setSelectIconVisibility(this.EZpvd);
        gGvvIC().copydefault.OLrzqt();
        AEQbTJ();
        KWHzl();
        fJNWhG();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    private final void fJNWhG() {
        AppCompatTextView appCompatTextView = (AppCompatTextView) gGvvIC().copydefault.findViewById(C48033uCm.Application.allOf);
        android.content.res.Resources resources = requireContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        appCompatTextView.setMaxWidth(C55302xhQ.EZpvd(resources) - C55298xhM.dp2px$default(96.0f, null, 1, null));
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        dxcTrN().copydefault(this.EZpvd);
        gGvvIC().copydefault.EZpvd(0, AkhnZx());
    }

    private final void KWHzl() {
        if (this.EZpvd) {
            fARcdN();
            this.AEQbTJ = false;
            gGvvIC().copydefault.EZpvd(0, AkhnZx());
        } else {
            TradeLiveData<OrderPositionData> tradeLiveDataCopydefault = AYXKKw().copydefault();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            tradeLiveDataCopydefault.observe(viewLifecycleOwner, new Application(new Function1() { // from class: o.vzb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52044vyU.KWHzl(this.KWHzl, (OrderPositionData) obj);
                }
            }));
            C56109xwc<java.lang.Exception> c56109xwcAhwBna = AYXKKw().EZpvd().AhwBna();
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
            c56109xwcAhwBna.observe(viewLifecycleOwner2, new Application(new Function1() { // from class: o.vza
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C52044vyU.copydefault(this.AEQbTJ, (java.lang.Exception) obj);
                }
            }));
        }
        C56111xwe<ParamBuilder> c56111xweKWHzl = dxcTrN().AYXKKw().KWHzl();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweKWHzl.observe(viewLifecycleOwner3, new Application(new Function1() { // from class: o.vzc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52044vyU.KWHzl(this.copydefault, (ParamBuilder) obj);
            }
        }));
    }

    public static final Unit KWHzl(C52044vyU c52044vyU, OrderPositionData orderPositionData) {
        Intrinsics.checkNotNullParameter(orderPositionData, "");
        c52044vyU.dxcTrN().OLrzqt(orderPositionData);
        if (c52044vyU.AEQbTJ) {
            c52044vyU.AEQbTJ = false;
            c52044vyU.fARcdN();
            c52044vyU.gGvvIC().copydefault.EZpvd(0, c52044vyU.AkhnZx());
        }
        if (!c52044vyU.EZpvd && c52044vyU.dxcTrN().DbNXlk()) {
            C52006vxj c52006vxj = c52044vyU.gGvvIC().copydefault;
            Intrinsics.checkNotNullExpressionValue(c52006vxj, "");
            c52006vxj.setVisibility(orderPositionData.getBotAmtData().getTotalAmt() <= 0 ? 8 : 0);
        }
        c52044vyU.EZpvd();
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C52044vyU c52044vyU, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c52044vyU.fARcdN();
        c52044vyU.gGvvIC().copydefault.EZpvd(0, c52044vyU.AkhnZx());
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52044vyU, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52044vyU c52044vyU, ParamBuilder paramBuilder) {
        Intrinsics.checkNotNullParameter(paramBuilder, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(OtcRouteConst.MAIN_ROUTE_NAV, "route_new_trade_other");
        bundle.putString("strategyType", paramBuilder.getStrategyType());
        bundle.putString("instId", paramBuilder.getInstId());
        bundle.putInt("bizType", C54799xVt.AEQbTJ.copydefault(paramBuilder.getInstType()));
        FragmentActivity activity = c52044vyU.getActivity();
        if (activity != null) {
            ((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class)).AEQbTJ(activity, "trade/main/strategy", bundle);
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    private final void AEQbTJ() {
        ejfBZ();
        djBIcL();
    }

    private final void values() {
        android.widget.LinearLayout linearLayout = gGvvIC().EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility(this.EZpvd ^ true ? 0 : 8);
    }

    private final void djBIcL() {
        gGvvIC().copydefault.setOnBotSelectCallback(new Function1() { // from class: o.vzi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52044vyU.OLrzqt(this.OLrzqt, (TacticsType) obj);
            }
        });
        values();
        android.widget.LinearLayout linearLayout = gGvvIC().EZpvd;
        linearLayout.setOnClickListener(new TaskDescription(linearLayout, 1000L, this));
    }

    public static final Unit OLrzqt(C52044vyU c52044vyU, TacticsType tacticsType) {
        Intrinsics.checkNotNullParameter(tacticsType, "");
        c52044vyU.AuCTel();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vyU$ActionBar */
    public static final class ActionBar implements Function1<SortOption, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(SortOption sortOption) {
            copydefault(sortOption);
            return Unit.INSTANCE;
        }

        public final void copydefault(SortOption sortOption) {
            Intrinsics.checkNotNullParameter(sortOption, "");
            C52044vyU.this.valueOf().OLrzqt(sortOption);
            C52044vyU.this.fIwbmz();
        }
    }

    private final void ejfBZ() {
        gGvvIC().copydefault.setSelectClickListener(new View.OnClickListener() { // from class: o.vzg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52044vyU.EZpvd(this.OLrzqt, view);
            }
        });
    }

    public static final void EZpvd(final C52044vyU c52044vyU, android.view.View view) {
        if (c52044vyU.AhwBna == null) {
            c52044vyU.AhwBna = new C50000uzE();
        }
        C50000uzE c50000uzE = c52044vyU.AhwBna;
        if (c50000uzE != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = c52044vyU.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c50000uzE.show(childFragmentManager);
        }
        C50000uzE c50000uzE2 = c52044vyU.AhwBna;
        if (c50000uzE2 != null) {
            c50000uzE2.KWHzl(new yHS() { // from class: o.vzf
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHS
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                    return C52044vyU.EZpvd(this.AEQbTJ, (Calendar) obj, (Calendar) obj2, ((java.lang.Boolean) obj3).booleanValue(), ((java.lang.Boolean) obj4).booleanValue(), (SelectedTime) obj5);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.vyU$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C52044vyU KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C52044vyU c52044vyU) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c52044vyU;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C51448vnH c51448vnHAEQbTJ = C51448vnH.Companion.AEQbTJ(this.KWHzl.valueOf().AEQbTJ());
                c51448vnHAEQbTJ.OLrzqt(this.KWHzl.new ActionBar());
                c51448vnHAEQbTJ.show(this.KWHzl.getChildFragmentManager(), this.KWHzl.getTAG());
            }
        }
    }

    public static final Unit EZpvd(C52044vyU c52044vyU, Calendar calendar, Calendar calendar2, boolean z, boolean z2, SelectedTime selectedTime) {
        Intrinsics.checkNotNullParameter(calendar, "");
        Intrinsics.checkNotNullParameter(calendar2, "");
        Intrinsics.checkNotNullParameter(selectedTime, "");
        c52044vyU.dxcTrN().valueOf().setStartTime(java.lang.String.valueOf(calendar.getTimeInMillis()));
        c52044vyU.dxcTrN().valueOf().setEndTime(java.lang.String.valueOf(calendar2.getTimeInMillis()));
        c52044vyU.isConnected();
        return Unit.INSTANCE;
    }

    private final C54982xbO AkhnZx() {
        return new C54982xbO(gEmmrt(), null, null, false, false, new Function0() { // from class: o.vzh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C52044vyU.fetchVPNInfo());
            }
        }, null, null, null, null, null, null, null, null, null, null, null, null, null, 524254, null);
    }

    private final java.lang.String gEmmrt() {
        java.lang.String strJoinToString$default;
        java.lang.String botType = dxcTrN().valueOf().getBotType();
        java.lang.String strAYXKKw = Intrinsics.EZpvd((java.lang.Object) botType, (java.lang.Object) "all_bot") ? C33070mpX.AYXKKw(C55688xof.Application.setCurrentControllerInfo) : C56033xvF.iwGUEr(botType);
        if (this.EZpvd) {
            return strAYXKKw;
        }
        if (valueOf().copydefault().getSelectedCurrencyIds().isEmpty()) {
            strJoinToString$default = C33070mpX.AYXKKw(C55688xof.Application.iWlNch);
        } else {
            strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) valueOf().copydefault().getSelectedCurrencyIds(), 8), ",", null, null, 0, null, null, 62, null);
        }
        return strAYXKKw + " (" + strJoinToString$default + ")";
    }

    private final void AuCTel() {
        C51459vnS.Application application = C51459vnS.Companion;
        FilterState filterStateCopy$default = FilterState.copy$default(valueOf().copydefault(), null, dxcTrN().valueOf().getBotType(), null, 5, null);
        boolean z = this.EZpvd;
        final C51459vnS c51459vnSKWHzl = application.KWHzl(filterStateCopy$default, !z, z);
        OrderPositionData value = AYXKKw().copydefault().getValue();
        c51459vnSKWHzl.copydefault(value != null ? value.getBotAmtData() : null);
        c51459vnSKWHzl.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.vzd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C52044vyU.OLrzqt(this.OLrzqt, dialogInterface);
            }
        });
        c51459vnSKWHzl.EZpvd(new Function1() { // from class: o.vyZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52044vyU.EZpvd(this.copydefault, c51459vnSKWHzl, (FilterState) obj);
            }
        });
        c51459vnSKWHzl.show(getParentFragmentManager(), getTAG());
    }

    public static final void OLrzqt(C52044vyU c52044vyU, android.content.DialogInterface dialogInterface) {
        c52044vyU.gGvvIC().copydefault.EZpvd(0, c52044vyU.AkhnZx());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C52044vyU c52044vyU, C51459vnS c51459vnS, FilterState filterState) {
        Intrinsics.checkNotNullParameter(filterState, "");
        c52044vyU.valueOf().copydefault(filterState);
        ((BotOrderListPresenter) c51459vnS.OLrzqt()).valueOf().setBotType(filterState.getSelectedBotTypeId());
        c52044vyU.gGvvIC().copydefault.EZpvd(0, c52044vyU.AkhnZx());
        c52044vyU.isConnected();
        return Unit.INSTANCE;
    }

    private final void isConnected() {
        getChildFragmentManager().setFragmentResult("bot_filter", new android.os.Bundle());
    }

    private final void fARcdN() {
        if (this.EZpvd) {
            getChildFragmentManager().beginTransaction().replace(C48033uCm.Application.keyboardTargetTextChanged, C52324wHe.Companion.OLrzqt(new BotOngoingParams(dxcTrN().valueOf().getBotType(), true, false, false, false, false, false, false, false, false, false, null, 4028, null))).commitNowAllowingStateLoss();
        } else {
            getChildFragmentManager().beginTransaction().replace(C48033uCm.Application.keyboardTargetTextChanged, C52324wHe.Companion.OLrzqt(new BotOngoingParams(dxcTrN().valueOf().getBotType(), false, false, false, false, false, false, true, false, false, false, null, MTPushConstants.PlatformNode.KEY_EVENT_TYPE_TURN_ON_PUSH, null))).commitNowAllowingStateLoss();
        }
    }

    public final void EZpvd() {
        if (!isResumed() || Intrinsics.EZpvd((java.lang.Object) dxcTrN().valueOf().getBotType(), (java.lang.Object) "all_bot") || this.EZpvd || dxcTrN().AEQbTJ().getTotalAmt() != 0) {
            return;
        }
        valueOf().copydefault(new FilterState((java.util.List) null, (java.lang.String) null, (CardStyle) null, 7, (DefaultConstructorMarker) null));
        dxcTrN().valueOf().setBotType("all_bot");
        isConnected();
        gGvvIC().copydefault.EZpvd(0, AkhnZx());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fIwbmz() {
        getChildFragmentManager().setFragmentResult("BOT_REFRESH_AFTER_SORT", new android.os.Bundle());
    }
}
