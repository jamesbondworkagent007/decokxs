package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.engagelab.privates.push.constants.MTPushConstants;
import com.okinc.tradingbot.impl.market_place.home.filter.BotStyleManagerViewModel;
import com.okinc.tradingbot.impl.strategy.fragment.tactics_trade.BotOrderListPresenter;
import com.okinc.unify_trade.biz.BotOngoingParams;
import com.okinc.unify_trade.biz.OrderPositionData;
import com.okinc.unify_trade.bot.list.FilterState;
import com.okinc.unify_trade.bot.list.SortOption;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vpu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C51593vpu extends AbstractC54505xKx<AbstractC50788vak, BotOrderListPresenter> {
    public static final Activity Companion = new Activity(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm AEQbTJ;
    public boolean copydefault = true;

    /* JADX INFO: renamed from: o.vpu$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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

    @Override // o.AbstractC54505xKx
    public boolean bv_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.iLAtSv;
    }

    public C51593vpu() {
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotStyleManagerViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.BotOnGoingListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.BotOnGoingListFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.market_place.home.list.ui.fragment.BotOnGoingListFragment$special$$inlined$activityViewModels$default$3
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

    public final BotStyleManagerViewModel AEQbTJ() {
        return (BotStyleManagerViewModel) this.AEQbTJ.getValue();
    }

    /* JADX INFO: renamed from: o.vpu$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vpu.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public static /* synthetic */ C51593vpu newInstance$default(Activity activity, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return activity.copydefault(str);
        }

        public final C51593vpu copydefault(java.lang.String str) {
            C51593vpu c51593vpu = new C51593vpu();
            c51593vpu.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("filterType", str)));
            return c51593vpu;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.initView(view, bundle);
        gGvvIC().OLrzqt.copydefault.setText(KWHzl());
        valueOf();
        C56028xvA.registerBotFragmentTrack$default(this, "BotOnGoingListFragment", new kotlin.Pair[0], null, 8, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        android.widget.TextView textView = gGvvIC().OLrzqt.copydefault;
        textView.setOnClickListener(new StateListAnimator(textView, 1000L, this));
        android.widget.ImageView imageView = gGvvIC().OLrzqt.AEQbTJ;
        imageView.setOnClickListener(new Application(imageView, 1000L, this));
        android.widget.ImageView imageView2 = gGvvIC().OLrzqt.OLrzqt;
        imageView2.setOnClickListener(new ActionBar(imageView2, 1000L, this));
    }

    /* JADX INFO: renamed from: o.vpu$LoaderManager */
    public static final class LoaderManager implements Function1<SortOption, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* synthetic */ Unit invoke(SortOption sortOption) {
            EZpvd(sortOption);
            return Unit.INSTANCE;
        }

        public final void EZpvd(SortOption sortOption) {
            Intrinsics.checkNotNullParameter(sortOption, "");
            C51593vpu.this.AEQbTJ().OLrzqt(sortOption);
            C51593vpu.this.AYXKKw();
        }
    }

    private final void valueOf() {
        C56111xwe<android.os.Bundle> c56111xweValueOf = finit().valueOf();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        c56111xweValueOf.observe(viewLifecycleOwner, new TaskDescription(new Function1() { // from class: o.vpz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51593vpu.OLrzqt(this.OLrzqt, (android.os.Bundle) obj);
            }
        }));
        TradeLiveData<OrderPositionData> tradeLiveDataCopydefault = dxcTrN().copydefault();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner2, new TaskDescription(new Function1() { // from class: o.vpy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51593vpu.OLrzqt(this.OLrzqt, (OrderPositionData) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = dxcTrN().gEmmrt().AhwBna();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner3, new TaskDescription(new Function1() { // from class: o.vpC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51593vpu.copydefault(this.OLrzqt, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C51593vpu c51593vpu, android.os.Bundle bundle) {
        java.lang.String string = bundle != null ? bundle.getString("filterType") : null;
        if (string == null) {
            string = "";
        }
        if (C33129mqd.OLrzqt((java.lang.CharSequence) string)) {
            c51593vpu.dxcTrN().valueOf().setBotType(string);
            c51593vpu.gGvvIC().OLrzqt.copydefault.setText(c51593vpu.KWHzl());
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C51593vpu c51593vpu, OrderPositionData orderPositionData) {
        Intrinsics.checkNotNullParameter(orderPositionData, "");
        if (C33129mqd.OLrzqt((java.lang.Object) java.lang.Integer.valueOf(orderPositionData.getBotAmtData().getTotalAmt()), (java.lang.Object) 0)) {
            c51593vpu.dxcTrN().valueOf().setBotType("all_bot");
            c51593vpu.gGvvIC().OLrzqt.copydefault.setText(c51593vpu.KWHzl());
            c51593vpu.getChildFragmentManager().setFragmentResult("bot_nmp_empty_status", new android.os.Bundle());
            android.view.View root = c51593vpu.gGvvIC().OLrzqt.getRoot();
            Intrinsics.checkNotNullExpressionValue(root, "");
            root.setVisibility(8);
        } else {
            android.view.View root2 = c51593vpu.gGvvIC().OLrzqt.getRoot();
            Intrinsics.checkNotNullExpressionValue(root2, "");
            root2.setVisibility(0);
        }
        if (c51593vpu.copydefault) {
            c51593vpu.copydefault = false;
            c51593vpu.EZpvd();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C51593vpu c51593vpu, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c51593vpu.EZpvd();
        c51593vpu.gGvvIC().OLrzqt.copydefault.setText(c51593vpu.KWHzl());
        return Unit.INSTANCE;
    }

    public final java.lang.String KWHzl() {
        java.lang.String strJoinToString$default;
        java.lang.String botType = dxcTrN().valueOf().getBotType();
        java.lang.String strAYXKKw = Intrinsics.EZpvd((java.lang.Object) botType, (java.lang.Object) "all_bot") ? C33070mpX.AYXKKw(C55688xof.Application.setCurrentControllerInfo) : C56033xvF.iwGUEr(botType);
        if (AEQbTJ().copydefault().getSelectedCurrencyIds().isEmpty()) {
            strJoinToString$default = C33070mpX.AYXKKw(C55688xof.Application.iWlNch);
        } else {
            strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(CollectionsKt___CollectionsKt.AhwBna((java.lang.Iterable) AEQbTJ().copydefault().getSelectedCurrencyIds(), 8), ",", null, null, 0, null, null, 62, null);
        }
        return strAYXKKw + " (" + strJoinToString$default + ")";
    }

    public final void copydefault() {
        C51459vnS c51459vnSKWHzl = C51459vnS.Companion.KWHzl(FilterState.copy$default(AEQbTJ().copydefault(), null, dxcTrN().valueOf().getBotType(), null, 5, null), true, false);
        OrderPositionData value = dxcTrN().copydefault().getValue();
        c51459vnSKWHzl.copydefault(value != null ? value.getBotAmtData() : null);
        c51459vnSKWHzl.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: o.vpA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(android.content.DialogInterface dialogInterface) {
                C51593vpu.KWHzl(this.OLrzqt, dialogInterface);
            }
        });
        c51459vnSKWHzl.EZpvd(new Function1() { // from class: o.vpB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C51593vpu.AEQbTJ(this.copydefault, (FilterState) obj);
            }
        });
        c51459vnSKWHzl.show(getParentFragmentManager(), getTAG());
    }

    public static final void KWHzl(C51593vpu c51593vpu, android.content.DialogInterface dialogInterface) {
        c51593vpu.gGvvIC().OLrzqt.copydefault.setText(c51593vpu.KWHzl());
    }

    public static final Unit AEQbTJ(C51593vpu c51593vpu, FilterState filterState) {
        Intrinsics.checkNotNullParameter(filterState, "");
        c51593vpu.AEQbTJ().copydefault(filterState);
        c51593vpu.dxcTrN().valueOf().setBotType(filterState.getSelectedBotTypeId());
        c51593vpu.gGvvIC().OLrzqt.copydefault.setText(c51593vpu.KWHzl());
        c51593vpu.gEmmrt();
        return Unit.INSTANCE;
    }

    public final void EZpvd() {
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        int i = C48033uCm.Application.keyboardTargetTextChanged;
        C52324wHe c52324wHeOLrzqt = C52324wHe.Companion.OLrzqt(new BotOngoingParams(dxcTrN().valueOf().getBotType(), false, false, false, false, true, false, false, false, false, false, null, MTPushConstants.RemoteWhat.ON_NOTIFICATION_ARRIVED, null));
        Unit unit = Unit.INSTANCE;
        fragmentTransactionBeginTransaction.replace(i, c52324wHeOLrzqt).commitNowAllowingStateLoss();
    }

    private final void gEmmrt() {
        getChildFragmentManager().setFragmentResult("bot_filter", new android.os.Bundle());
    }

    /* JADX INFO: renamed from: o.vpu$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ C51593vpu AEQbTJ;
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C51593vpu c51593vpu) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.AEQbTJ = c51593vpu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C51448vnH c51448vnHAEQbTJ = C51448vnH.Companion.AEQbTJ(this.AEQbTJ.AEQbTJ().AEQbTJ());
                c51448vnHAEQbTJ.OLrzqt(this.AEQbTJ.new LoaderManager());
                c51448vnHAEQbTJ.show(this.AEQbTJ.getChildFragmentManager(), this.AEQbTJ.getTAG());
            }
        }
    }

    /* JADX INFO: renamed from: o.vpu$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C51593vpu OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C51593vpu c51593vpu) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c51593vpu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.copydefault();
                C55867xrz.KWHzl.OLrzqt("filter");
            }
        }
    }

    /* JADX INFO: renamed from: o.vpu$StateListAnimator */
    public static final class StateListAnimator implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C51593vpu OLrzqt;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(android.view.View view, long j, C51593vpu c51593vpu) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.OLrzqt = c51593vpu;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                this.OLrzqt.copydefault();
                C55867xrz.KWHzl.OLrzqt("filter");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AYXKKw() {
        getChildFragmentManager().setFragmentResult("BOT_REFRESH_AFTER_SORT", new android.os.Bundle());
    }
}
