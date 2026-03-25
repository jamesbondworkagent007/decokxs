package o;

import android.view.View;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.StrategyOrderBillDetailsResponse;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import com.okinc.unify_trade.bot.presenter.DealRecordPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class wEQ extends AbstractC54505xKx<AbstractC48651uZh, DealRecordPresenter> {
    public final InterfaceC56387yDm KWHzl;
    public final int OLrzqt = C48033uCm.Activity.GqbzPL;
    public final InterfaceC56387yDm copydefault = C56392yDr.copydefault(new Function0() { // from class: o.wEX
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return wEQ.AYXKKw();
        }
    });

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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return this.OLrzqt;
    }

    public wEQ() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.SpotRecurringRecordDetailsFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.SpotRecurringRecordDetailsFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.SpotRecurringRecordDetailsFragment$special$$inlined$activityViewModels$default$3
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

    private final TacticsDetailPresenter KWHzl() {
        return (TacticsDetailPresenter) this.KWHzl.getValue();
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
        valueOf();
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        dxcTrN().OLrzqt(KWHzl().AhwBna());
        djBIcL();
    }

    @Override // o.AbstractC32998moE, o.AbstractC32996moC, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        dxcTrN().fJNWhG();
    }

    private final void valueOf() {
        AEQbTJ().register(TransDetailsData.class, new wOH(getContext(), new Function2() { // from class: o.wET
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return wEQ.OLrzqt(this.copydefault, (java.lang.String) obj, (java.lang.String) obj2);
            }
        }));
        AEQbTJ().register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wEW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wEQ.OLrzqt(this.EZpvd, (EmptyData) obj);
            }
        }));
        gGvvIC().copydefault.setAdapter(AEQbTJ());
        gGvvIC().copydefault.setLayoutManager(new LinearLayoutManager(requireActivity()));
    }

    public static final Unit OLrzqt(final wEQ weq, final java.lang.String str, final java.lang.String str2) {
        android.content.Context contextRequireContext = weq.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C55688xof.Application.Hx));
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C48033uCm.Fragment.DVmcag), new View.OnClickListener() { // from class: o.wFa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                wEQ.copydefault(this.EZpvd, str, str2, viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.AEQbTJ(C33070mpX.AYXKKw(C55688xof.Application.DcMfJKfwDlxl), new View.OnClickListener() { // from class: o.wFc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                wEQ.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
        return Unit.INSTANCE;
    }

    public static final void copydefault(wEQ weq, java.lang.String str, java.lang.String str2, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        weq.dxcTrN().OLrzqt(str, str2);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final Unit OLrzqt(wEQ weq, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        weq.dxcTrN().fJNWhG();
        return Unit.INSTANCE;
    }

    private final void djBIcL() {
        Transformations.map(dxcTrN().DbNXlk(), new Function1() { // from class: o.wEO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wEQ.KWHzl(this.EZpvd, (C55804xqp) obj);
            }
        }).observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.wES
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wEQ.copydefault(this.KWHzl, (java.util.ArrayList) obj);
            }
        }));
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.wEU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wEQ.AEQbTJ(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.wEV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return wEQ.EZpvd(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final java.util.ArrayList KWHzl(wEQ weq, C55804xqp c55804xqp) {
        C55960xtm c55960xtm = new C55960xtm();
        c55960xtm.OLrzqt(weq.dxcTrN().EZpvd().getInstId());
        c55960xtm.AEQbTJ(weq.dxcTrN().EZpvd().getOrderType());
        c55960xtm.EZpvd(weq.dxcTrN().EZpvd().getAlgoId());
        Intrinsics.copydefault(c55804xqp);
        return c55960xtm.EZpvd((C55804xqp<java.util.List<StrategyOrderBillDetailsResponse>>) c55804xqp);
    }

    public static final Unit copydefault(wEQ weq, java.util.ArrayList arrayList) {
        C43316rmw c43316rmwAEQbTJ = weq.AEQbTJ();
        Intrinsics.copydefault(arrayList);
        C49952uyJ.updateDataOrEmpty$default(c43316rmwAEQbTJ, arrayList, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, null, null, false, 60, null);
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) weq, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r12v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r13v2, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(wEQ weq, androidx.core.util.Pair pair) {
        if (Intrinsics.EZpvd((java.lang.Object) pair.first, (java.lang.Object) weq.dxcTrN().AEQbTJ().bB_())) {
            C43316rmw c43316rmwAEQbTJ = weq.AEQbTJ();
            CommonEmptyData.ActionBar actionBar = CommonEmptyData.Companion;
            java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
            if (message == null) {
                message = "";
            }
            C33064mpR.OLrzqt(c43316rmwAEQbTJ, (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(actionBar, message, 60, false, null, null, false, 60, null));
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) weq, false, (java.lang.String) null, 2, (java.lang.Object) null);
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
    public static final Unit EZpvd(wEQ weq, androidx.core.util.Pair pair) {
        if (((java.lang.Boolean) pair.second).booleanValue()) {
            weq.showLoading();
        } else {
            weq.dismissLoading();
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
