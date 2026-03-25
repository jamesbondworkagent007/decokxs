package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
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
import com.okinc.tradeuilib.widget.SelectedTime;
import com.okinc.tradingbot.impl.nmp.my_bot.presenter.BotNmpOrderListPresenter;
import com.okinc.tradingbot.impl.strategy.fragment.tactics_trade.BotOrderListPresenter;
import com.okinc.unify_trade.biz.BotOngoingParams;
import com.okinc.unify_trade.biz.BotSectorUnderlyingListBean;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C52324wHe;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.vyJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C52033vyJ extends AbstractC54505xKx<AbstractC50794vaq, BotOrderListPresenter> {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int KWHzl = 8;
    public final InterfaceC56387yDm EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.vyR
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52033vyJ.EZpvd(this.OLrzqt);
        }
    });
    public final InterfaceC56387yDm OLrzqt;
    public C50000uzE copydefault;

    /* JADX INFO: renamed from: o.vyJ$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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

    public static final boolean copydefault() {
        return true;
    }

    @Override // o.AbstractC54505xKx
    public boolean bv_() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C48033uCm.Activity.itxZVF;
    }

    public C52033vyJ() {
        final Function0 function0 = null;
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(BotNmpOrderListPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.nmp.my_bot.fragment.BotListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.nmp.my_bot.fragment.BotListFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.nmp.my_bot.fragment.BotListFragment$special$$inlined$activityViewModels$default$3
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

    public final BotNmpOrderListPresenter KWHzl() {
        return (BotNmpOrderListPresenter) this.OLrzqt.getValue();
    }

    public final java.lang.Boolean EZpvd() {
        return (java.lang.Boolean) this.EZpvd.getValue();
    }

    public static final java.lang.Boolean EZpvd(C52033vyJ c52033vyJ) {
        android.os.Bundle arguments = c52033vyJ.getArguments();
        if (arguments != null) {
            return java.lang.Boolean.valueOf(arguments.getBoolean("is_history_bot"));
        }
        return null;
    }

    /* JADX INFO: renamed from: o.vyJ$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.vyJ.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public static /* synthetic */ C52033vyJ newInstance$default(StateListAnimator stateListAnimator, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return stateListAnimator.AEQbTJ(z);
        }

        public final C52033vyJ AEQbTJ(boolean z) {
            C52033vyJ c52033vyJ = new C52033vyJ();
            c52033vyJ.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("is_history_bot", java.lang.Boolean.valueOf(z))));
            return c52033vyJ;
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        gGvvIC().copydefault.setText(C33070mpX.AYXKKw(C48033uCm.Fragment.HJWChP));
        C52006vxj c52006vxj = gGvvIC().EZpvd;
        dxcTrN().valueOf().setUnderlyingListBean(KWHzl().copydefault());
        c52006vxj.OLrzqt(gEmmrt());
        java.lang.Boolean boolEZpvd = EZpvd();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        c52006vxj.setSelectIconVisibility(Intrinsics.EZpvd(boolEZpvd, bool));
        c52006vxj.OLrzqt();
        c52006vxj.EZpvd(0, gEmmrt());
        ConstraintLayout constraintLayout = gGvvIC().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
        constraintLayout.setVisibility(Intrinsics.EZpvd(EZpvd(), bool) ^ true ? 0 : 8);
        djBIcL();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        super.setListener();
        gGvvIC().EZpvd.setSelectClickListener(new View.OnClickListener() { // from class: o.vyN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52033vyJ.copydefault(this.copydefault, view);
            }
        });
        gGvvIC().EZpvd.setOnBotSelectCallback(new Function1() { // from class: o.vyS
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52033vyJ.OLrzqt(this.AEQbTJ, (TacticsType) obj);
            }
        });
        android.widget.ImageView imageView = gGvvIC().AEQbTJ;
        imageView.setOnClickListener(new ActionBar(imageView, 1000L, this));
        fetchVPNInfo();
        valueOf();
    }

    public static final void copydefault(final C52033vyJ c52033vyJ, android.view.View view) {
        if (c52033vyJ.copydefault == null) {
            c52033vyJ.copydefault = new C50000uzE();
        }
        C50000uzE c50000uzE = c52033vyJ.copydefault;
        if (c50000uzE != null) {
            androidx.fragment.app.FragmentManager childFragmentManager = c52033vyJ.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            c50000uzE.show(childFragmentManager, C56524yIo.AEQbTJ(C52033vyJ.class).valueOf());
        }
        C50000uzE c50000uzE2 = c52033vyJ.copydefault;
        if (c50000uzE2 != null) {
            c50000uzE2.KWHzl(new yHS() { // from class: o.vyL
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // o.yHS
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5) {
                    return C52033vyJ.KWHzl(this.EZpvd, (Calendar) obj, (Calendar) obj2, ((java.lang.Boolean) obj3).booleanValue(), ((java.lang.Boolean) obj4).booleanValue(), (SelectedTime) obj5);
                }
            });
        }
    }

    public static final Unit KWHzl(C52033vyJ c52033vyJ, Calendar calendar, Calendar calendar2, boolean z, boolean z2, SelectedTime selectedTime) {
        Intrinsics.checkNotNullParameter(calendar, "");
        Intrinsics.checkNotNullParameter(calendar2, "");
        Intrinsics.checkNotNullParameter(selectedTime, "");
        c52033vyJ.dxcTrN().valueOf().setStartTime(java.lang.String.valueOf(calendar.getTimeInMillis()));
        c52033vyJ.dxcTrN().valueOf().setEndTime(java.lang.String.valueOf(calendar2.getTimeInMillis()));
        c52033vyJ.AYXKKw();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C52033vyJ c52033vyJ, TacticsType tacticsType) {
        Intrinsics.checkNotNullParameter(tacticsType, "");
        c52033vyJ.KWHzl().EZpvd();
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        BotOrderListPresenter botOrderListPresenterDxcTrN = dxcTrN();
        java.lang.Boolean boolEZpvd = EZpvd();
        botOrderListPresenterDxcTrN.copydefault(boolEZpvd != null ? boolEZpvd.booleanValue() : false);
        gGvvIC().EZpvd.EZpvd(0, gEmmrt());
    }

    private final void fetchVPNInfo() {
        getParentFragmentManager().setFragmentResultListener("refresh_bot_action", getViewLifecycleOwner(), new FragmentResultListener() { // from class: o.vyP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentResultListener
            public final void onFragmentResult(java.lang.String str, android.os.Bundle bundle) {
                C52033vyJ.AEQbTJ(this.KWHzl, str, bundle);
            }
        });
    }

    public static final void AEQbTJ(C52033vyJ c52033vyJ, java.lang.String str, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(bundle, "");
        c52033vyJ.getChildFragmentManager().setFragmentResult(str, bundle);
    }

    private final void valueOf() {
        TradeLiveData<java.util.List<BotSectorUnderlyingListBean>> tradeLiveDataAEQbTJ = KWHzl().AEQbTJ();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataAEQbTJ.observe(viewLifecycleOwner, new TaskDescription(new Function1() { // from class: o.vyK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52033vyJ.copydefault(this.KWHzl, (java.util.List) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcGEmmrt = KWHzl().KWHzl().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcGEmmrt.observe(viewLifecycleOwner2, new TaskDescription(new Function1() { // from class: o.vyO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52033vyJ.KWHzl(this.AEQbTJ, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit copydefault(C52033vyJ c52033vyJ, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        c52033vyJ.values();
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52033vyJ c52033vyJ, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        c52033vyJ.values();
        java.lang.String message = exc.getMessage();
        if (message != null) {
            C55326xho.toast$default(message, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    private final C54982xbO gEmmrt() {
        java.lang.String sectorName;
        BotSectorUnderlyingListBean underlyingListBean = dxcTrN().valueOf().getUnderlyingListBean();
        if (underlyingListBean == null || (sectorName = underlyingListBean.getSectorName()) == null) {
            sectorName = "";
        }
        return new C54982xbO(sectorName, null, null, false, false, new Function0() { // from class: o.vyM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C52033vyJ.copydefault());
            }
        }, null, null, null, null, null, null, null, null, null, null, null, null, null, 524254, null);
    }

    private final void values() {
        C51983vxM c51983vxM = new C51983vxM();
        c51983vxM.AEQbTJ(new Function2() { // from class: o.vyQ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return C52033vyJ.AEQbTJ(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2);
            }
        });
        c51983vxM.KWHzl(new Function0() { // from class: o.vyT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C52033vyJ.OLrzqt(this.KWHzl);
            }
        });
        c51983vxM.show(getChildFragmentManager(), C56524yIo.AEQbTJ(C51983vxM.class).valueOf());
    }

    public static final Unit AEQbTJ(C52033vyJ c52033vyJ, java.lang.String str, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        c52033vyJ.AYXKKw();
        c52033vyJ.gGvvIC().EZpvd.EZpvd(0, c52033vyJ.gEmmrt());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C52033vyJ c52033vyJ) {
        c52033vyJ.gGvvIC().EZpvd.EZpvd(0, c52033vyJ.gEmmrt());
        return Unit.INSTANCE;
    }

    private final void AYXKKw() {
        getChildFragmentManager().setFragmentResult("bot_filter", new android.os.Bundle());
    }

    private final void djBIcL() {
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        int i = C48033uCm.Application.keyboardTargetTextChanged;
        C52324wHe.Application application = C52324wHe.Companion;
        java.lang.String botType = dxcTrN().valueOf().getBotType();
        java.lang.Boolean boolEZpvd = EZpvd();
        fragmentTransactionBeginTransaction.replace(i, application.OLrzqt(new BotOngoingParams(botType, boolEZpvd != null ? boolEZpvd.booleanValue() : false, false, false, true, false, Intrinsics.EZpvd(EZpvd(), java.lang.Boolean.TRUE), false, false, false, false, null, 4012, null))).commitNowAllowingStateLoss();
    }

    /* JADX INFO: renamed from: o.vyJ$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C52033vyJ OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(android.view.View view, long j, C52033vyJ c52033vyJ) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.OLrzqt = c52033vyJ;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                FragmentActivity activity = this.OLrzqt.getActivity();
                if (activity != null) {
                    ActivityC52030vyG.Companion.EZpvd(activity);
                }
            }
        }
    }
}
