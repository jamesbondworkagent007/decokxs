package o;

import android.view.View;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.HistoryEventExtData;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.EditCoinPairBean;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.data.HistoryEventCard;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import com.okinc.unify_trade.bot.presenter.HistoryEventPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C50719vYv;
import o.C53904wuL;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wDv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52233wDv extends AbstractC54505xKx<AbstractC48543uVh, HistoryEventPresenter> implements wNB {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int EZpvd = 8;
    public final InterfaceC56387yDm KWHzl;
    public final int AEQbTJ = C48033uCm.Activity.DxnCrt;
    public final InterfaceC56387yDm OLrzqt = C56392yDr.copydefault(new Function0() { // from class: o.wDu
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52233wDv.KWHzl();
        }
    });

    /* JADX INFO: renamed from: o.wDv$TaskDescription */
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
        return this.AEQbTJ;
    }

    public C52233wDv() {
        final Function0 function0 = null;
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.HistoryEventFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.HistoryEventFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.HistoryEventFragment$special$$inlined$activityViewModels$default$3
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

    private final TacticsDetailPresenter djBIcL() {
        return (TacticsDetailPresenter) this.KWHzl.getValue();
    }

    private final C43316rmw AEQbTJ() {
        return (C43316rmw) this.OLrzqt.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw KWHzl() {
        return new C43316rmw();
    }

    /* JADX INFO: renamed from: o.wDv$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.wDv.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        AYXKKw();
        valueOf();
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        dxcTrN().EZpvd(djBIcL().AhwBna());
        gEmmrt();
    }

    @Override // o.AbstractC54505xKx
    public void uzCIH() {
        dxcTrN().OLrzqt();
    }

    private final void AYXKKw() {
        AEQbTJ().register(HistoryEventCard.class, new wNA(this));
        AEQbTJ().register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wDA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52233wDv.KWHzl(this.AEQbTJ, (EmptyData) obj);
            }
        }));
        gGvvIC().KWHzl.setAdapter(AEQbTJ());
        gGvvIC().KWHzl.setLayoutManager(new LinearLayoutManager(requireActivity()));
    }

    public static final Unit KWHzl(C52233wDv c52233wDv, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        c52233wDv.dxcTrN().OLrzqt();
        return Unit.INSTANCE;
    }

    private final void valueOf() {
        gGvvIC().copydefault.KWHzl(new InterfaceC57900yrD() { // from class: o.wDy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C52233wDv.OLrzqt(this.KWHzl, interfaceC57934yrl);
            }
        });
    }

    public static final void OLrzqt(C52233wDv c52233wDv, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c52233wDv.dxcTrN().OLrzqt();
    }

    private final void gEmmrt() {
        TradeLiveData<java.util.List<HistoryEventCard>> tradeLiveDataEZpvd = dxcTrN().EZpvd();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataEZpvd.observe(viewLifecycleOwner, new TaskDescription(new Function1() { // from class: o.wDt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52233wDv.OLrzqt(this.copydefault, (java.util.List) obj);
            }
        }));
        TradeLiveData<java.util.ArrayList<TransDetailsData>> tradeLiveDataAEQbTJ = dxcTrN().AEQbTJ();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataAEQbTJ.observe(viewLifecycleOwner2, new TaskDescription(new Function1() { // from class: o.wDs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52233wDv.EZpvd(this.KWHzl, (java.util.ArrayList) obj);
            }
        }));
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.wDr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52233wDv.OLrzqt(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.wDx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52233wDv.copydefault(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit OLrzqt(C52233wDv c52233wDv, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C33546myW c33546myW = c52233wDv.gGvvIC().copydefault;
        Intrinsics.checkNotNullExpressionValue(c33546myW, "");
        C57589ylK.finishStatus$default(c33546myW, false, 1, null);
        if (C33129mqd.valueOf(C33129mqd.addS$default(java.lang.Integer.valueOf(c52233wDv.AEQbTJ().getItemCount()), java.lang.Integer.valueOf(list.size()), null, null, null, 14, null), 0)) {
            C49952uyJ.updateDataOrEmpty$default(c52233wDv.AEQbTJ(), list, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, null, null, false, 60, null);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52233wDv, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
        if (!list.isEmpty()) {
            C33064mpR.KWHzl(c52233wDv.AEQbTJ(), list);
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C52233wDv c52233wDv, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C53904wuL.Activity.newInstance$default(C53904wuL.Companion, arrayList, C33070mpX.AYXKKw(C55688xof.Application.getHeight), null, 4, null).show(c52233wDv.getChildFragmentManager(), C53904wuL.class.getSimpleName());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r14v6, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r15v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r15v9, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit OLrzqt(C52233wDv c52233wDv, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c52233wDv.dxcTrN().copydefault().bB_())) {
            C33546myW c33546myW = c52233wDv.gGvvIC().copydefault;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            C57589ylK.finishStatus$default(c33546myW, false, 1, null);
            if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(c52233wDv.AEQbTJ().getItemCount()), 0)) {
                java.lang.String tag = c52233wDv.getTAG();
                java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
                pUU.copydefault(tag, "can't load more cause by " + (message != null ? message : ""));
            } else {
                java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
                if (message2 == null) {
                    message2 = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
                }
                C33064mpR.OLrzqt(c52233wDv.AEQbTJ(), (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, message2, 60, false, null, null, false, 60, null));
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52233wDv, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c52233wDv.dxcTrN().KWHzl().bB_())) {
            C55326xho.toast$default(((java.lang.Exception) pair.second).getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(C52233wDv c52233wDv, androidx.core.util.Pair pair) {
        if (((java.lang.Boolean) pair.second).booleanValue()) {
            c52233wDv.showLoading();
        } else {
            c52233wDv.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    @Override // o.wNB
    public void KWHzl(@NotNull HistoryEventCard historyEventCard) {
        Intrinsics.checkNotNullParameter(historyEventCard, "");
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C55688xof.Application.FdcJU));
        viewOnClickListenerC54939xaY.EZpvd(historyEventCard.getSignalDetails());
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) C33070mpX.AYXKKw(C55688xof.Application.onCreate), new View.OnClickListener() { // from class: o.wDw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C52233wDv.EZpvd(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void EZpvd(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // o.wNB
    public void EZpvd(@NotNull HistoryEventCard historyEventCard) {
        java.util.List<java.lang.String> data;
        java.lang.Object next;
        HistoryEventExtData historyEventExtData;
        HistoryEventExtData historyEventExtData2;
        Intrinsics.checkNotNullParameter(historyEventCard, "");
        java.util.Iterator it = yDY.gEmmrt("pairs_add", "pairs_remove").iterator();
        while (true) {
            data = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            java.lang.String str = (java.lang.String) next;
            HistoryEventExtData historyEventExtData3 = historyEventCard.getHistoryEventExtData();
            if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) (historyEventExtData3 != null ? historyEventExtData3.getType() : null))) {
                break;
            }
        }
        java.lang.String str2 = (java.lang.String) next;
        if (str2 != null) {
            C50719vYv.TaskDescription taskDescription = C50719vYv.Companion;
            java.util.List<java.lang.String> data2 = (!Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "pairs_add") || (historyEventExtData2 = historyEventCard.getHistoryEventExtData()) == null) ? null : historyEventExtData2.getData();
            if (Intrinsics.EZpvd((java.lang.Object) str2, (java.lang.Object) "pairs_remove") && (historyEventExtData = historyEventCard.getHistoryEventExtData()) != null) {
                data = historyEventExtData.getData();
            }
            taskDescription.EZpvd(new EditCoinPairBean(null, data2, data, null, 9, null)).show(getChildFragmentManager(), C50719vYv.class.getSimpleName());
        }
    }

    @Override // o.wNB
    public void copydefault(@NotNull HistoryEventCard historyEventCard) {
        Intrinsics.checkNotNullParameter(historyEventCard, "");
        dxcTrN().AEQbTJ(historyEventCard.getClientIds());
    }
}
