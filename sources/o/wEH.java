package o;

import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.presenter.DealRecordPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C53904wuL;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wEH extends AbstractC54505xKx<AbstractC48651uZh, DealRecordPresenter> {
    public final InterfaceC56387yDm AEQbTJ;
    public final int OLrzqt = C48033uCm.Activity.GqbzPL;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.wEK
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return wEH.AYXKKw();
        }
    });

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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    public wEH() {
        final Function0 function0 = null;
        this.AEQbTJ = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.SpotDealRecordFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.SpotDealRecordFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.SpotDealRecordFragment$special$$inlined$activityViewModels$default$3
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

    private final TacticsDetailPresenter copydefault() {
        return (TacticsDetailPresenter) this.AEQbTJ.getValue();
    }

    private final C43316rmw AEQbTJ() {
        return (C43316rmw) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw AYXKKw() {
        return new C43316rmw();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        gEmmrt();
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        dxcTrN().OLrzqt(copydefault().AhwBna());
        valueOf();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        dxcTrN().fJNWhG();
    }

    private final void gEmmrt() {
        AEQbTJ().register(DetailsData.class, new C52548wPm(new Function1() { // from class: o.wEL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wEH.KWHzl(this.EZpvd, (DetailsData) obj);
            }
        }));
        AEQbTJ().register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wEM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wEH.EZpvd(this.OLrzqt, (EmptyData) obj);
            }
        }));
        gGvvIC().copydefault.setAdapter(AEQbTJ());
        gGvvIC().copydefault.setLayoutManager(new LinearLayoutManager(requireActivity()));
    }

    public static final Unit KWHzl(wEH weh, DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(detailsData, "");
        DealRecordPresenter.requestSingleGridDealRecord$default(weh.dxcTrN(), "", "1", detailsData.getOrderId(), null, 8, null);
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(wEH weh, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        weh.dxcTrN().fJNWhG();
        return Unit.INSTANCE;
    }

    private final void valueOf() {
        dxcTrN().AYXKKw().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wEJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wEH.AEQbTJ(this.EZpvd, (java.util.ArrayList) obj);
            }
        }));
        dxcTrN().values().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wEN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wEH.OLrzqt(this.KWHzl, (java.util.ArrayList) obj);
            }
        }));
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wEP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wEH.OLrzqt(this.KWHzl, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wER
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wEH.KWHzl(this.EZpvd, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(wEH weh, java.util.ArrayList arrayList) {
        C53904wuL.Activity activity = C53904wuL.Companion;
        Intrinsics.copydefault(arrayList);
        C53904wuL.Activity.newInstance$default(activity, arrayList, null, null, 6, null).show(weh.getChildFragmentManager(), C53904wuL.class.getSimpleName());
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(wEH weh, java.util.ArrayList arrayList) {
        C43316rmw c43316rmwAEQbTJ = weh.AEQbTJ();
        Intrinsics.copydefault(arrayList);
        C49952uyJ.updateDataOrEmpty$default(c43316rmwAEQbTJ, arrayList, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, null, null, false, 60, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) weh, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(wEH weh, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd((java.lang.Object) pair.first, (java.lang.Object) weh.dxcTrN().AEQbTJ().bB_())) {
            C43316rmw c43316rmwAEQbTJ = weh.AEQbTJ();
            CommonEmptyData.ActionBar actionBar = CommonEmptyData.Companion;
            java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
            if (message == null) {
                message = "";
            }
            C33064mpR.OLrzqt(c43316rmwAEQbTJ, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(actionBar, message, 60, false, null, null, false, 60, null));
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) weh, false, (java.lang.String) null, 2, (java.lang.Object) null);
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
    public static final Unit KWHzl(wEH weh, androidx.core.util.Pair pair) {
        if (((java.lang.Boolean) pair.second).booleanValue()) {
            weh.showLoading();
        } else {
            weh.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    @Override // o.AbstractC32996moC, o.InterfaceC33075mpc
    public void showLoading() {
        if (AEQbTJ().getItemCount() == 0) {
            super.showLoading();
        }
    }
}
