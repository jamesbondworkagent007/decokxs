package o;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentResultListener;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.biz.TacticsType;
import com.okinc.p2p.api.OtcRouteConst;
import com.okinc.tradeapi.bean.ParamBuilder;
import com.okinc.tradeuilib.widget.SelectedTime;
import com.okinc.tradingbot.impl.market_place.home.filter.BotStyleManagerViewModel;
import com.okinc.tradingbot.impl.market_place.my_bot.presenter.MyBotPresenter;
import com.okinc.tradingbot.impl.strategy.fragment.tactics_trade.BotOrderListPresenter;
import com.okinc.unify_trade.biz.BotCategoryConfig;
import com.okinc.unify_trade.biz.BotOngoingParams;
import com.okinc.unify_trade.biz.OrderPositionData;
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
import o.C52761wXj;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vrT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51672vrT extends AbstractC54505xKx<AbstractC50793vap, BotOrderListPresenter> {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int OLrzqt = 8;
    public C52006vxj AYXKKw;
    public final InterfaceC56387yDm AhwBna;
    public final InterfaceC56387yDm EZpvd;
    public boolean copydefault;
    public C50000uzE gEmmrt;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.vsg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return java.lang.Boolean.valueOf(C51672vrT.KWHzl(this.copydefault));
        }
    });
    public boolean AEQbTJ = true;

    /* JADX INFO: renamed from: o.vrT$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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

    public static final boolean EZpvd() {
        return true;
    }

    @Override // o.AbstractC54505xKx
    public boolean bv_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.QOjuYg;
    }

    public C51672vrT() {
        final Function0 function0 = null;
        this.AhwBna = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MyBotPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.my_bot.MyBotListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.my_bot.MyBotListFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.my_bot.MyBotListFragment$special$$inlined$activityViewModels$default$3
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
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotStyleManagerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.my_bot.MyBotListFragment$special$$inlined$activityViewModels$default$4
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.my_bot.MyBotListFragment$special$$inlined$activityViewModels$default$5
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.my_bot.MyBotListFragment$special$$inlined$activityViewModels$default$6
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

    public final MyBotPresenter AYXKKw() {
        return (MyBotPresenter) this.AhwBna.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BotStyleManagerViewModel AkhnZx() {
        return (BotStyleManagerViewModel) this.EZpvd.getValue();
    }

    private final boolean fIwbmz() {
        return ((java.lang.Boolean) this.KWHzl.getValue()).booleanValue();
    }

    public static final boolean KWHzl(C51672vrT c51672vrT) {
        android.os.Bundle arguments = c51672vrT.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("from_cr_activity", false);
        }
        return false;
    }

    /* JADX INFO: renamed from: o.vrT$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vrT.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public static /* synthetic */ C51672vrT newInstance$default(ActionBar actionBar, boolean z, java.lang.Boolean bool, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            if ((i & 2) != 0) {
                bool = java.lang.Boolean.FALSE;
            }
            return actionBar.KWHzl(z, bool);
        }

        public final C51672vrT KWHzl(boolean z, java.lang.Boolean bool) {
            C51672vrT c51672vrT = new C51672vrT();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("is_history_bot", z);
            bundle.putBoolean("from_cr_activity", bool != null ? bool.booleanValue() : false);
            c51672vrT.setArguments(bundle);
            return c51672vrT;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        C52006vxj c52006vxj = gGvvIC().copydefault;
        Intrinsics.checkNotNullExpressionValue(c52006vxj, "");
        wPQ.KWHzl(c52006vxj, C56071xvr.gEmmrt.fJNWhG());
        C52006vxj c52006vxj2 = gGvvIC().copydefault;
        Intrinsics.checkNotNullExpressionValue(c52006vxj2, "");
        c52006vxj2.setVisibility(fIwbmz() ^ true ? 0 : 8);
        android.os.Bundle arguments = getArguments();
        this.copydefault = arguments != null ? arguments.getBoolean("is_history_bot") : false;
        this.AYXKKw = gGvvIC().copydefault;
        gGvvIC().copydefault.OLrzqt(gEmmrt());
        gGvvIC().copydefault.setSelectIconVisibility(this.copydefault);
        if (this.copydefault) {
            wYC wyc = gGvvIC().copydefault.AEQbTJ().KWHzl().AYXKKw;
            wYC wyc2 = gGvvIC().copydefault.AEQbTJ().KWHzl().AYXKKw;
            Intrinsics.checkNotNullExpressionValue(wyc2, "");
            ViewGroup.LayoutParams layoutParams = wyc2.getLayoutParams();
            ConstraintLayout.LayoutParams layoutParams2 = layoutParams instanceof ConstraintLayout.LayoutParams ? (ConstraintLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                ((ViewGroup.MarginLayoutParams) layoutParams2).width = C55298xhM.dp2px$default(20.0f, null, 1, null);
                ((ViewGroup.MarginLayoutParams) layoutParams2).height = C55298xhM.dp2px$default(20.0f, null, 1, null);
                wyc2.setLayoutParams(layoutParams2);
            }
        }
        gGvvIC().copydefault.OLrzqt();
        copydefault();
        AuCTel();
        values();
        djBIcL();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void djBIcL() {
        AppCompatTextView appCompatTextView = (AppCompatTextView) gGvvIC().copydefault.findViewById(C48033uCm.Application.allOf);
        android.content.res.Resources resources = requireContext().getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "");
        appCompatTextView.setMaxWidth(C55302xhQ.EZpvd(resources) - C55298xhM.dp2px$default(96.0f, null, 1, null));
        appCompatTextView.setMaxLines(1);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
    }

    public final void AEQbTJ(boolean z) {
        C52006vxj c52006vxj = gGvvIC().copydefault;
        Intrinsics.checkNotNullExpressionValue(c52006vxj, "");
        c52006vxj.setVisibility(z ^ true ? 0 : 8);
        ViewGroup.LayoutParams layoutParams = gGvvIC().KWHzl.getLayoutParams();
        Intrinsics.copydefault(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.DbNXlk);
        gGvvIC().KWHzl.setLayoutParams(marginLayoutParams);
        gGvvIC().getRoot().setPadding(gGvvIC().getRoot().getPaddingLeft(), z ? 0 : getResources().getDimensionPixelSize(C52761wXj.StateListAnimator.AuCTel), gGvvIC().getRoot().getPaddingRight(), gGvvIC().getRoot().getPaddingBottom());
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        xOR xorCopydefault;
        super.onVisible();
        InterfaceC54581xNr interfaceC54581xNrCopydefault = C54589xNz.EZpvd.copydefault();
        if (interfaceC54581xNrCopydefault != null && (xorCopydefault = interfaceC54581xNrCopydefault.copydefault()) != null && xorCopydefault.valueOf()) {
            dxcTrN().ejfBZ();
        }
        BotOrderListPresenter botOrderListPresenterDxcTrN = dxcTrN();
        botOrderListPresenterDxcTrN.copydefault(this.copydefault);
        botOrderListPresenterDxcTrN.EZpvd(fIwbmz());
        gGvvIC().copydefault.EZpvd(0, gEmmrt());
        AEQbTJ(fIwbmz());
    }

    private final void AuCTel() {
        getParentFragmentManager().setFragmentResultListener("refresh_bot_action", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vrZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C51672vrT.AEQbTJ(this.EZpvd, str, bundle);
            }
        });
    }

    public static final void AEQbTJ(C51672vrT c51672vrT, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c51672vrT.getChildFragmentManager().setFragmentResult(str, bundle);
    }

    /* JADX INFO: renamed from: o.vrT$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C51672vrT EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C51672vrT c51672vrT) {
            this.copydefault = view;
            this.AEQbTJ = j;
            this.EZpvd = c51672vrT;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.AEQbTJ || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                C51448vnH c51448vnHAEQbTJ = C51448vnH.Companion.AEQbTJ(this.EZpvd.AkhnZx().AEQbTJ());
                c51448vnHAEQbTJ.OLrzqt(this.EZpvd.new Application());
                c51448vnHAEQbTJ.show(this.EZpvd.getChildFragmentManager(), this.EZpvd.getTAG());
            }
        }
    }

    private final void values() {
        if (this.copydefault) {
            fJNWhG();
            this.AEQbTJ = false;
            gGvvIC().copydefault.EZpvd(0, gEmmrt());
        } else {
            TradeLiveData<OrderPositionData> tradeLiveDataCopydefault = AYXKKw().copydefault();
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            tradeLiveDataCopydefault.observe(viewLifecycleOwner, new StateListAnimator(new Function1() { // from class: o.vsb
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51672vrT.copydefault(this.OLrzqt, (OrderPositionData) obj);
                }
            }));
            C56109xwc<java.lang.Exception> c56109xwcAhwBna = AYXKKw().EZpvd().AhwBna();
            LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
            c56109xwcAhwBna.observe(viewLifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.vrY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C51672vrT.KWHzl(this.OLrzqt, (java.lang.Exception) obj);
                }
            }));
        }
        C56111xwe<ParamBuilder> c56111xweKWHzl = dxcTrN().AYXKKw().KWHzl();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweKWHzl.observe(viewLifecycleOwner3, new StateListAnimator(new Function1() { // from class: o.vse
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51672vrT.KWHzl(this.OLrzqt, (ParamBuilder) obj);
            }
        }));
        TradeLiveData<java.util.List<BotCategoryConfig>> tradeLiveDataAhwBna = dxcTrN().AhwBna();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        tradeLiveDataAhwBna.observe(viewLifecycleOwner4, new TaskDescription());
    }

    public static final Unit copydefault(C51672vrT c51672vrT, OrderPositionData orderPositionData) {
        Intrinsics.checkNotNullParameter(orderPositionData, "");
        c51672vrT.dxcTrN().OLrzqt(orderPositionData);
        if (c51672vrT.AEQbTJ) {
            c51672vrT.AEQbTJ = false;
            c51672vrT.fJNWhG();
            c51672vrT.gGvvIC().copydefault.EZpvd(0, c51672vrT.gEmmrt());
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C51672vrT c51672vrT, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c51672vrT.fJNWhG();
        c51672vrT.gGvvIC().copydefault.EZpvd(0, c51672vrT.gEmmrt());
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C51672vrT c51672vrT, ParamBuilder paramBuilder) {
        Intrinsics.checkNotNullParameter(paramBuilder, "");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(OtcRouteConst.MAIN_ROUTE_NAV, "route_new_trade_other");
        bundle.putString("strategyType", paramBuilder.getStrategyType());
        bundle.putString("instId", paramBuilder.getInstId());
        bundle.putInt("bizType", C54799xVt.AEQbTJ.copydefault(paramBuilder.getInstType()));
        FragmentActivity activity = c51672vrT.getActivity();
        if (activity != null) {
            ((InterfaceC33172mrT) C43251rlk.copydefault(InterfaceC33172mrT.class)).AEQbTJ(activity, "trade/main/strategy", bundle);
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vrT$TaskDescription */
    public static final class TaskDescription implements Observer<java.util.List<? extends BotCategoryConfig>> {
        /* JADX DEBUG: Method merged with bridge method: onChanged(Ljava/lang/Object;)V */
        @Override // androidx.lifecycle.Observer
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public void onChanged(java.util.List<BotCategoryConfig> list) {
            xOR xorCopydefault;
            InterfaceC54581xNr interfaceC54581xNrCopydefault;
            xOR xorCopydefault2;
            Intrinsics.checkNotNullParameter(list, "");
            C54589xNz c54589xNz = C54589xNz.EZpvd;
            InterfaceC54581xNr interfaceC54581xNrCopydefault2 = c54589xNz.copydefault();
            if (interfaceC54581xNrCopydefault2 == null || (xorCopydefault = interfaceC54581xNrCopydefault2.copydefault()) == null || !xorCopydefault.valueOf() || (interfaceC54581xNrCopydefault = c54589xNz.copydefault()) == null || (xorCopydefault2 = interfaceC54581xNrCopydefault.copydefault()) == null) {
                return;
            }
            BotCategoryConfig botCategoryConfig = (BotCategoryConfig) CollectionsKt___CollectionsKt.firstOrNull(list);
            xorCopydefault2.OLrzqt(botCategoryConfig != null ? botCategoryConfig.getStrategy() : null);
        }
    }

    public final void copydefault() {
        valueOf();
        AEQbTJ();
    }

    private final void isConnected() {
        android.widget.LinearLayout linearLayout = gGvvIC().EZpvd;
        Intrinsics.checkNotNullExpressionValue(linearLayout, "");
        linearLayout.setVisibility((fIwbmz() || this.copydefault) ? 8 : 0);
    }

    public final void AEQbTJ() {
        gGvvIC().copydefault.setOnBotSelectCallback(new Function1() { // from class: o.vsa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51672vrT.AEQbTJ(this.copydefault, (TacticsType) obj);
            }
        });
        isConnected();
        android.widget.LinearLayout linearLayout = gGvvIC().EZpvd;
        linearLayout.setOnClickListener(new Activity(linearLayout, 1000L, this));
    }

    public static final Unit AEQbTJ(C51672vrT c51672vrT, TacticsType tacticsType) {
        Intrinsics.checkNotNullParameter(tacticsType, "");
        c51672vrT.ejfBZ();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.vrT$Application */
    public static final class Application implements Function1<SortOption, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
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
            C51672vrT.this.AkhnZx().OLrzqt(sortOption);
            C51672vrT.this.hDKMBd();
        }
    }

    public final void valueOf() {
        gGvvIC().copydefault.setSelectClickListener(new View.OnClickListener() { // from class: o.vsd
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C51672vrT.AEQbTJ(this.OLrzqt, view);
            }
        });
    }

    public static final void AEQbTJ(final C51672vrT c51672vrT, android.view.View view) {
        if (c51672vrT.gEmmrt == null) {
            c51672vrT.gEmmrt = new C50000uzE();
        }
        C50000uzE c50000uzE = c51672vrT.gEmmrt;
        if (c50000uzE != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = c51672vrT.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c50000uzE.show(childFragmentManager);
        }
        C50000uzE c50000uzE2 = c51672vrT.gEmmrt;
        if (c50000uzE2 != null) {
            c50000uzE2.KWHzl(new yHS() { // from class: o.vsi
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHS
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                    return C51672vrT.EZpvd(this.OLrzqt, (Calendar) obj, (Calendar) obj2, ((java.lang.Boolean) obj3).booleanValue(), ((java.lang.Boolean) obj4).booleanValue(), (SelectedTime) obj5);
                }
            });
        }
    }

    public static final Unit EZpvd(C51672vrT c51672vrT, Calendar calendar, Calendar calendar2, boolean z, boolean z2, SelectedTime selectedTime) {
        Intrinsics.checkNotNullParameter(calendar, "");
        Intrinsics.checkNotNullParameter(calendar2, "");
        Intrinsics.checkNotNullParameter(selectedTime, "");
        c51672vrT.dxcTrN().valueOf().setStartTime(java.lang.String.valueOf(calendar.getTimeInMillis()));
        c51672vrT.dxcTrN().valueOf().setEndTime(java.lang.String.valueOf(calendar2.getTimeInMillis()));
        c51672vrT.fARcdN();
        return Unit.INSTANCE;
    }

    public final C54982xbO gEmmrt() {
        return new C54982xbO(fetchVPNInfo(), null, null, false, false, new Function0() { // from class: o.vsc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C51672vrT.EZpvd());
            }
        }, null, null, null, null, null, null, null, null, null, null, null, null, null, 524254, null);
    }

    private final java.lang.String fetchVPNInfo() {
        java.lang.String strJoinToString$default;
        java.lang.String botType = dxcTrN().valueOf().getBotType();
        java.lang.String strAYXKKw = Intrinsics.EZpvd((java.lang.Object) botType, (java.lang.Object) "all_bot") ? C33070mpX.AYXKKw(C55688xof.Application.setCurrentControllerInfo) : C56033xvF.iwGUEr(botType);
        if (this.copydefault) {
            return strAYXKKw;
        }
        if (AkhnZx().copydefault().getSelectedCurrencyIds().isEmpty()) {
            strJoinToString$default = C33070mpX.AYXKKw(C55688xof.Application.iWlNch);
        } else {
            strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) AkhnZx().copydefault().getSelectedCurrencyIds(), 8), ",", null, null, 0, null, null, 62, null);
        }
        return strAYXKKw + " (" + strJoinToString$default + ")";
    }

    private final void ejfBZ() {
        C51459vnS.Application application = C51459vnS.Companion;
        FilterState filterStateCopy$default = FilterState.copy$default(AkhnZx().copydefault(), null, dxcTrN().valueOf().getBotType(), null, 5, null);
        boolean z = this.copydefault;
        final C51459vnS c51459vnSKWHzl = application.KWHzl(filterStateCopy$default, !z, z);
        OrderPositionData value = AYXKKw().copydefault().getValue();
        c51459vnSKWHzl.copydefault(value != null ? value.getBotAmtData() : null);
        c51459vnSKWHzl.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.vsh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C51672vrT.AEQbTJ(this.EZpvd, dialogInterface);
            }
        });
        c51459vnSKWHzl.EZpvd(new Function1() { // from class: o.vsf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51672vrT.AEQbTJ(this.EZpvd, c51459vnSKWHzl, (FilterState) obj);
            }
        });
        c51459vnSKWHzl.show(getParentFragmentManager(), getTAG());
    }

    public static final void AEQbTJ(C51672vrT c51672vrT, android.content.DialogInterface dialogInterface) {
        c51672vrT.gGvvIC().copydefault.EZpvd(0, c51672vrT.gEmmrt());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: Presenter */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(C51672vrT c51672vrT, C51459vnS c51459vnS, FilterState filterState) {
        Intrinsics.checkNotNullParameter(filterState, "");
        c51672vrT.AkhnZx().copydefault(filterState);
        ((BotOrderListPresenter) c51459vnS.OLrzqt()).valueOf().setBotType(filterState.getSelectedBotTypeId());
        c51672vrT.gGvvIC().copydefault.EZpvd(0, c51672vrT.gEmmrt());
        c51672vrT.fARcdN();
        return Unit.INSTANCE;
    }

    private final void fARcdN() {
        getChildFragmentManager().setFragmentResult("bot_filter", new android.os.Bundle());
    }

    private final void fJNWhG() {
        getChildFragmentManager().beginTransaction().replace(C48033uCm.Application.keyboardTargetTextChanged, C52324wHe.Companion.OLrzqt(new BotOngoingParams(dxcTrN().valueOf().getBotType(), this.copydefault, false, true, false, false, false, false, false, false, fIwbmz(), fIwbmz() ? 0 : null, 948, null))).commitNowAllowingStateLoss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hDKMBd() {
        getChildFragmentManager().setFragmentResult("BOT_REFRESH_AFTER_SORT", new android.os.Bundle());
    }
}
