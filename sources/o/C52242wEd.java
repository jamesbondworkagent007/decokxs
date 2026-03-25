package o;

import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotOrderListPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wEd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52242wEd extends AbstractC54505xKx<AbstractC48557uVv, SignalBotOrderListPresenter> {
    public final InterfaceC56387yDm EZpvd;
    public final int copydefault = C48033uCm.Activity.DzkRMH;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wEg
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52242wEd.AEQbTJ();
        }
    });

    /* JADX INFO: renamed from: o.wEd$StateListAnimator */
    public static final /* synthetic */ class StateListAnimator implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator(Function1 function1) {
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
        return this.copydefault;
    }

    public static final /* synthetic */ SignalBotOrderListPresenter EZpvd(C52242wEd c52242wEd) {
        return c52242wEd.dxcTrN();
    }

    public C52242wEd() {
        final Function0 function0 = null;
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.SignalBotOrderListFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.SignalBotOrderListFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.SignalBotOrderListFragment$special$$inlined$activityViewModels$default$3
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
    public static final C43316rmw AEQbTJ() {
        return new C43316rmw();
    }

    private final C43316rmw AYXKKw() {
        return (C43316rmw) this.KWHzl.getValue();
    }

    private final TacticsDetailPresenter valueOf() {
        return (TacticsDetailPresenter) this.EZpvd.getValue();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        KWHzl();
        djBIcL();
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        dxcTrN().OLrzqt(valueOf().AhwBna());
        gEmmrt();
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        dxcTrN().AEQbTJ();
    }

    public final void KWHzl() {
        AYXKKw().register(DetailsData.class, new wNL());
        AYXKKw().register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wEa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52242wEd.KWHzl(this.copydefault, (EmptyData) obj);
            }
        }));
        gGvvIC().KWHzl.setAdapter(AYXKKw());
        gGvvIC().KWHzl.setLayoutManager(new LinearLayoutManager(requireContext()));
    }

    public static final Unit KWHzl(C52242wEd c52242wEd, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        c52242wEd.dxcTrN().AEQbTJ();
        return Unit.INSTANCE;
    }

    private final void djBIcL() {
        AppCompatTextView appCompatTextView = gGvvIC().copydefault;
        appCompatTextView.setOnClickListener(new Application(appCompatTextView, 1000L, this));
    }

    private final void gEmmrt() {
        TradeLiveData<java.util.ArrayList<DetailsData>> tradeLiveDataCopydefault = dxcTrN().copydefault();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wEf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52242wEd.copydefault(this.EZpvd, (java.util.ArrayList) obj);
            }
        }));
        dxcTrN().OLrzqt().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wEh
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52242wEd.OLrzqt(this.AEQbTJ, (java.lang.Boolean) obj);
            }
        }));
        dxcTrN().EZpvd().AkhnZx().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wEi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52242wEd.KWHzl(this.KWHzl, (java.lang.Boolean) obj);
            }
        }));
        C56109xwc<java.lang.Exception> c56109xwcAhwBna = dxcTrN().EZpvd().AhwBna();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        c56109xwcAhwBna.observe(viewLifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.wEj
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52242wEd.AEQbTJ(this.KWHzl, (java.lang.Exception) obj);
            }
        }));
    }

    public static final Unit copydefault(C52242wEd c52242wEd, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C49952uyJ.updateDataOrEmpty$default(c52242wEd.AYXKKw(), arrayList, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, null, null, false, 60, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52242wEd, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C52242wEd c52242wEd, java.lang.Boolean bool) {
        AppCompatTextView appCompatTextView = c52242wEd.gGvvIC().EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(bool.booleanValue() ? 0 : 8);
        AppCompatTextView appCompatTextView2 = c52242wEd.gGvvIC().copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(bool.booleanValue() ? 0 : 8);
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52242wEd c52242wEd, java.lang.Boolean bool) {
        if (bool.booleanValue()) {
            c52242wEd.showLoading();
        } else {
            c52242wEd.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit AEQbTJ(C52242wEd c52242wEd, java.lang.Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "");
        AppCompatTextView appCompatTextView = c52242wEd.gGvvIC().EZpvd;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        appCompatTextView.setVisibility(8);
        AppCompatTextView appCompatTextView2 = c52242wEd.gGvvIC().copydefault;
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        appCompatTextView2.setVisibility(8);
        C43316rmw c43316rmwAYXKKw = c52242wEd.AYXKKw();
        CommonEmptyData.ActionBar actionBar = CommonEmptyData.Companion;
        java.lang.String message = exc.getMessage();
        C33064mpR.OLrzqt(c43316rmwAYXKKw, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(actionBar, message == null ? "" : message, 60, false, null, null, false, 60, null));
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52242wEd, false, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.wEd$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C52242wEd KWHzl;
        public final /* synthetic */ long copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C52242wEd c52242wEd) {
            this.AEQbTJ = view;
            this.copydefault = j;
            this.KWHzl = c52242wEd;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.copydefault || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                wEB.Companion.AEQbTJ(C52242wEd.EZpvd(this.KWHzl).KWHzl().getAlgoId()).show(this.KWHzl.getChildFragmentManager(), "SignalBotTotalOrdersDialog");
            }
        }
    }
}
