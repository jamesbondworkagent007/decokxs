package o;

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
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.data.TransDetailsData;
import com.okinc.unify_trade.bot.presenter.HistoryPositionPresenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C53904wuL;
import o.C55688xof;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wDz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C52237wDz extends AbstractC54505xKx<AbstractC48541uVf, HistoryPositionPresenter> implements wND {
    public final InterfaceC56387yDm copydefault;
    public final int OLrzqt = C48033uCm.Activity.DwQSDd;
    public final InterfaceC56387yDm KWHzl = C56392yDr.copydefault(new Function0() { // from class: o.wDI
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C52237wDz.AEQbTJ();
        }
    });

    /* JADX INFO: renamed from: o.wDz$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
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
        return this.OLrzqt;
    }

    public C52237wDz() {
        final Function0 function0 = null;
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.HistoryPositionFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.HistoryPositionFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.HistoryPositionFragment$special$$inlined$activityViewModels$default$3
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

    private final TacticsDetailPresenter valueOf() {
        return (TacticsDetailPresenter) this.copydefault.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C43316rmw AEQbTJ() {
        return new C43316rmw();
    }

    private final C43316rmw KWHzl() {
        return (C43316rmw) this.KWHzl.getValue();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        djBIcL();
        gEmmrt();
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        dxcTrN().copydefault(valueOf().AhwBna());
        AYXKKw();
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        dxcTrN().gEmmrt();
    }

    private final void djBIcL() {
        KWHzl().register(TransDetailsData.class, new C52505wNx(this));
        KWHzl().register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wDC
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52237wDz.AEQbTJ(this.OLrzqt, (EmptyData) obj);
            }
        }));
        gGvvIC().OLrzqt.setAdapter(KWHzl());
        gGvvIC().OLrzqt.setLayoutManager(new LinearLayoutManager(requireActivity()));
    }

    public static final Unit AEQbTJ(C52237wDz c52237wDz, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        c52237wDz.dxcTrN().AhwBna();
        return Unit.INSTANCE;
    }

    private final void gEmmrt() {
        gGvvIC().EZpvd.KWHzl(new InterfaceC57900yrD() { // from class: o.wDH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC57900yrD
            public final void EZpvd(InterfaceC57934yrl interfaceC57934yrl) {
                C52237wDz.OLrzqt(this.EZpvd, interfaceC57934yrl);
            }
        });
    }

    public static final void OLrzqt(C52237wDz c52237wDz, InterfaceC57934yrl interfaceC57934yrl) {
        Intrinsics.checkNotNullParameter(interfaceC57934yrl, "");
        c52237wDz.dxcTrN().valueOf();
    }

    private final void AYXKKw() {
        TradeLiveData<java.util.ArrayList<TransDetailsData>> tradeLiveDataOLrzqt = dxcTrN().OLrzqt();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataOLrzqt.observe(viewLifecycleOwner, new TaskDescription(new Function1() { // from class: o.wDF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52237wDz.AEQbTJ(this.copydefault, (java.util.ArrayList) obj);
            }
        }));
        TradeLiveData<java.util.ArrayList<TransDetailsData>> tradeLiveDataEZpvd = dxcTrN().EZpvd();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataEZpvd.observe(viewLifecycleOwner2, new TaskDescription(new Function1() { // from class: o.wDD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52237wDz.KWHzl(this.copydefault, (java.util.ArrayList) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.wDB
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52237wDz.KWHzl(this.OLrzqt, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.wDE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C52237wDz.EZpvd(this.AEQbTJ, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C52237wDz c52237wDz, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        c52237wDz.gGvvIC().EZpvd.valueOf();
        if (c52237wDz.dxcTrN().copydefault()) {
            C49952uyJ.updateDataOrEmpty$default(c52237wDz.KWHzl(), arrayList, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, null, null, false, 60, null);
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52237wDz, true, (java.lang.String) null, 2, (java.lang.Object) null);
        } else {
            C33064mpR.KWHzl(c52237wDz.KWHzl(), arrayList);
        }
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(C52237wDz c52237wDz, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C53904wuL.Activity.newInstance$default(C53904wuL.Companion, arrayList, C33070mpX.AYXKKw(C55688xof.Application.ZAwExL), null, 4, null).show(c52237wDz.getChildFragmentManager(), C53904wuL.class.getSimpleName());
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit KWHzl(C52237wDz c52237wDz, androidx.core.util.Pair pair) {
        if (((java.lang.Boolean) pair.second).booleanValue()) {
            c52237wDz.showLoading();
        } else {
            c52237wDz.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r14v3, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r15v1, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r15v9, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit EZpvd(C52237wDz c52237wDz, androidx.core.util.Pair pair) {
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c52237wDz.dxcTrN().KWHzl().bB_())) {
            C55326xho.toast$default(((java.lang.Exception) pair.second).getMessage(), (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) c52237wDz.dxcTrN().AEQbTJ().bB_())) {
            C33546myW c33546myW = c52237wDz.gGvvIC().EZpvd;
            Intrinsics.checkNotNullExpressionValue(c33546myW, "");
            C57589ylK.finishStatus$default(c33546myW, false, 1, null);
            if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(c52237wDz.KWHzl().getItemCount()), 0)) {
                java.lang.String tag = c52237wDz.getTAG();
                java.lang.String message = ((java.lang.Exception) pair.second).getMessage();
                pUU.copydefault(tag, "can't load more cause by " + (message != null ? message : ""));
            } else {
                java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
                if (message2 == null) {
                    message2 = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
                }
                C33064mpR.OLrzqt(c52237wDz.KWHzl(), (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, message2, 60, false, null, null, false, 60, null));
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c52237wDz, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        }
        return Unit.INSTANCE;
    }

    @Override // o.wND
    public void copydefault(@NotNull TransDetailsData transDetailsData) {
        Intrinsics.checkNotNullParameter(transDetailsData, "");
        dxcTrN().EZpvd(transDetailsData);
    }
}
