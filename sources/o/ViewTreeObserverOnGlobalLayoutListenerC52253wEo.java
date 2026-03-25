package o;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.CompoundButton;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.lifecycle.TradeLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.tradingbot.impl.strategy.fragment.detail.TacticsDetailPresenter;
import com.okinc.unify_trade.biz.ContractGridClosePositionData;
import com.okinc.unify_trade.bot.data.CommonEmptyData;
import com.okinc.unify_trade.bot.data.DetailsData;
import com.okinc.unify_trade.bot.data.EmptyData;
import com.okinc.unify_trade.bot.signalbot.viewmodel.SignalBotPositionPresenter;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import o.C48033uCm;
import o.C49511upt;
import o.C55688xof;
import o.vYG;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.wEo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC52253wEo extends AbstractC54505xKx<AbstractC48559uVx, SignalBotPositionPresenter> implements wNE, ViewTreeObserver.OnGlobalLayoutListener {
    public final InterfaceC56387yDm EZpvd;
    public final int KWHzl = C48033uCm.Activity.QWpYiD;
    public final InterfaceC56387yDm AEQbTJ = C56392yDr.copydefault(new Function0() { // from class: o.wEt
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return ViewTreeObserverOnGlobalLayoutListenerC52253wEo.KWHzl();
        }
    });
    public final C52663wTt copydefault = new C52663wTt();

    /* JADX INFO: renamed from: o.wEo$StateListAnimator */
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
        return this.KWHzl;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC52253wEo() {
        final Function0 function0 = null;
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(TacticsDetailPresenter.class), new Function0<ViewModelStore>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.SignalBotPositionFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.SignalBotPositionFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.tradingbot.impl.strategy.fragment.detail.SignalBotPositionFragment$special$$inlined$activityViewModels$default$3
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
    public static final C43316rmw KWHzl() {
        return new C43316rmw();
    }

    private final C43316rmw copydefault() {
        return (C43316rmw) this.AEQbTJ.getValue();
    }

    private final TacticsDetailPresenter valueOf() {
        return (TacticsDetailPresenter) this.EZpvd.getValue();
    }

    @Override // o.AbstractC56129xww, o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        gEmmrt();
    }

    @Override // o.AbstractC56129xww
    public void bt_() {
        dxcTrN().KWHzl(valueOf().AhwBna());
        AYXKKw();
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onVisible() {
        super.onVisible();
        dxcTrN().AYXKKw();
    }

    @Override // o.AbstractC54505xKx, o.AbstractC32998moE
    public void onInvisible() {
        this.copydefault.AhwBna();
    }

    private final void gEmmrt() {
        copydefault().register(DetailsData.class, new wNS(this));
        copydefault().register(CommonEmptyData.class, new C50041uzt(new Function1() { // from class: o.wEu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewTreeObserverOnGlobalLayoutListenerC52253wEo.EZpvd(this.EZpvd, (EmptyData) obj);
            }
        }));
        gGvvIC().OLrzqt.setAdapter(copydefault());
        gGvvIC().OLrzqt.setLayoutManager(new LinearLayoutManager(requireContext()));
        gGvvIC().OLrzqt.getViewTreeObserver().addOnGlobalLayoutListener(this);
        C52663wTt c52663wTt = this.copydefault;
        RecyclerView recyclerView = gGvvIC().OLrzqt;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        C52663wTt.attachToRecyclerView$default(c52663wTt, recyclerView, 0, false, new Function1() { // from class: o.wEx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewTreeObserverOnGlobalLayoutListenerC52253wEo.OLrzqt(this.EZpvd, (C52661wTr) obj);
            }
        }, 6, null);
    }

    public static final Unit EZpvd(ViewTreeObserverOnGlobalLayoutListenerC52253wEo viewTreeObserverOnGlobalLayoutListenerC52253wEo, EmptyData emptyData) {
        Intrinsics.checkNotNullParameter(emptyData, "");
        viewTreeObserverOnGlobalLayoutListenerC52253wEo.dxcTrN().AYXKKw();
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(final ViewTreeObserverOnGlobalLayoutListenerC52253wEo viewTreeObserverOnGlobalLayoutListenerC52253wEo, C52661wTr c52661wTr) {
        Intrinsics.checkNotNullParameter(c52661wTr, "");
        c52661wTr.OLrzqt(new Function2() { // from class: o.wEk
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return ViewTreeObserverOnGlobalLayoutListenerC52253wEo.KWHzl(this.EZpvd, (android.view.View) obj, ((java.lang.Integer) obj2).intValue());
            }
        });
        return Unit.INSTANCE;
    }

    public static final Unit KWHzl(ViewTreeObserverOnGlobalLayoutListenerC52253wEo viewTreeObserverOnGlobalLayoutListenerC52253wEo, android.view.View view, int i) {
        Intrinsics.checkNotNullParameter(view, "");
        java.util.List<java.lang.Integer> listEZpvd = viewTreeObserverOnGlobalLayoutListenerC52253wEo.copydefault.EZpvd(i, viewTreeObserverOnGlobalLayoutListenerC52253wEo.copydefault().getItemCount());
        java.util.Iterator<T> it = listEZpvd.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            int iIntValue = ((java.lang.Number) it.next()).intValue();
            java.lang.Object obj = viewTreeObserverOnGlobalLayoutListenerC52253wEo.copydefault().getItems().get(iIntValue);
            DetailsData detailsData = obj instanceof DetailsData ? (DetailsData) obj : null;
            if (detailsData != null) {
                viewTreeObserverOnGlobalLayoutListenerC52253wEo.dxcTrN().copydefault(iIntValue, detailsData);
            }
        }
        java.util.Iterator<T> it2 = viewTreeObserverOnGlobalLayoutListenerC52253wEo.copydefault.AEQbTJ(listEZpvd, viewTreeObserverOnGlobalLayoutListenerC52253wEo.copydefault().getItemCount()).iterator();
        while (it2.hasNext()) {
            int iIntValue2 = ((java.lang.Number) it2.next()).intValue();
            java.lang.Object obj2 = viewTreeObserverOnGlobalLayoutListenerC52253wEo.copydefault().getItems().get(iIntValue2);
            DetailsData detailsData2 = obj2 instanceof DetailsData ? (DetailsData) obj2 : null;
            if (detailsData2 != null) {
                viewTreeObserverOnGlobalLayoutListenerC52253wEo.dxcTrN().OLrzqt(iIntValue2, detailsData2);
            }
        }
        return Unit.INSTANCE;
    }

    private final void AYXKKw() {
        TradeLiveData<java.util.ArrayList<DetailsData>> tradeLiveDataKWHzl = dxcTrN().KWHzl();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        tradeLiveDataKWHzl.observe(viewLifecycleOwner, new StateListAnimator(new Function1() { // from class: o.wEA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewTreeObserverOnGlobalLayoutListenerC52253wEo.copydefault(this.AEQbTJ, (java.util.ArrayList) obj);
            }
        }));
        TradeLiveData<java.util.ArrayList<DetailsData>> tradeLiveDataCopydefault = dxcTrN().copydefault();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        tradeLiveDataCopydefault.observe(viewLifecycleOwner2, new StateListAnimator(new Function1() { // from class: o.wEl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewTreeObserverOnGlobalLayoutListenerC52253wEo.OLrzqt(this.KWHzl, (java.util.ArrayList) obj);
            }
        }));
        C56111xwe<java.util.List<ContractGridClosePositionData>> c56111xweOLrzqt = dxcTrN().OLrzqt();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        c56111xweOLrzqt.observe(viewLifecycleOwner3, new Observer() { // from class: o.wEm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.lifecycle.Observer
            public final void onChanged(java.lang.Object obj) {
                ViewTreeObserverOnGlobalLayoutListenerC52253wEo.AEQbTJ((java.util.List) obj);
            }
        });
        dxcTrN().getAggregateErrorLiveData().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wEq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewTreeObserverOnGlobalLayoutListenerC52253wEo.copydefault(this.copydefault, (androidx.core.util.Pair) obj);
            }
        }));
        dxcTrN().getAggregateLoadingLiveData().observe(getViewLifecycleOwner(), new StateListAnimator(new Function1() { // from class: o.wEr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewTreeObserverOnGlobalLayoutListenerC52253wEo.AEQbTJ(this.KWHzl, (androidx.core.util.Pair) obj);
            }
        }));
    }

    public static final Unit copydefault(final ViewTreeObserverOnGlobalLayoutListenerC52253wEo viewTreeObserverOnGlobalLayoutListenerC52253wEo, java.util.ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        C49952uyJ.updateDataOrEmpty$default(viewTreeObserverOnGlobalLayoutListenerC52253wEo.copydefault(), arrayList, C33070mpX.AYXKKw(C55688xof.Application.WorkerThread), 0, null, null, false, 60, null);
        viewTreeObserverOnGlobalLayoutListenerC52253wEo.gGvvIC().OLrzqt.post(new java.lang.Runnable() { // from class: o.wEv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.lang.Runnable
            public final void run() {
                ViewTreeObserverOnGlobalLayoutListenerC52253wEo.OLrzqt(this.KWHzl);
            }
        });
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) viewTreeObserverOnGlobalLayoutListenerC52253wEo, true, (java.lang.String) null, 2, (java.lang.Object) null);
        return Unit.INSTANCE;
    }

    public static final void OLrzqt(ViewTreeObserverOnGlobalLayoutListenerC52253wEo viewTreeObserverOnGlobalLayoutListenerC52253wEo) {
        viewTreeObserverOnGlobalLayoutListenerC52253wEo.onGlobalLayout();
    }

    public static final Unit OLrzqt(ViewTreeObserverOnGlobalLayoutListenerC52253wEo viewTreeObserverOnGlobalLayoutListenerC52253wEo, java.util.ArrayList arrayList) {
        java.util.ArrayList<DetailsData> value;
        java.lang.Integer next;
        Intrinsics.checkNotNullParameter(arrayList, "");
        DetailsData detailsData = (DetailsData) CollectionsKt___CollectionsKt.firstOrNull(arrayList);
        if (detailsData != null && (value = viewTreeObserverOnGlobalLayoutListenerC52253wEo.dxcTrN().KWHzl().getValue()) != null) {
            java.util.Iterator<java.lang.Integer> it = yDY.valueOf((java.util.Collection<?>) value).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.EZpvd((java.lang.Object) value.get(next.intValue()).getInstId(), (java.lang.Object) detailsData.getInstId())) {
                    break;
                }
            }
            java.lang.Integer num = next;
            if (num != null) {
                value.set(num.intValue(), detailsData);
                viewTreeObserverOnGlobalLayoutListenerC52253wEo.copydefault().setItems(value);
                viewTreeObserverOnGlobalLayoutListenerC52253wEo.copydefault().notifyDataSetChanged();
            }
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        C55326xho.toastWithSuccessfulIcon$default(C55688xof.Application.onRequestPermissionsResult, 0, 1, (java.lang.Object) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: F */
    /* JADX DEBUG: Multi-variable search result rejected for r13v6, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r14v10, resolved type: S */
    /* JADX DEBUG: Multi-variable search result rejected for r14v2, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit copydefault(final ViewTreeObserverOnGlobalLayoutListenerC52253wEo viewTreeObserverOnGlobalLayoutListenerC52253wEo, androidx.core.util.Pair pair) {
        java.lang.String message;
        java.lang.String str = (java.lang.String) pair.first;
        if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) viewTreeObserverOnGlobalLayoutListenerC52253wEo.dxcTrN().EZpvd().bB_())) {
            if (C33129mqd.AEQbTJ(java.lang.Integer.valueOf(viewTreeObserverOnGlobalLayoutListenerC52253wEo.copydefault().getItemCount()), 0)) {
                viewTreeObserverOnGlobalLayoutListenerC52253wEo.gGvvIC().OLrzqt.post(new java.lang.Runnable() { // from class: o.wEy
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // java.lang.Runnable
                    public final void run() {
                        ViewTreeObserverOnGlobalLayoutListenerC52253wEo.AEQbTJ(this.EZpvd);
                    }
                });
                java.lang.String tag = viewTreeObserverOnGlobalLayoutListenerC52253wEo.getTAG();
                java.lang.String message2 = ((java.lang.Exception) pair.second).getMessage();
                if (message2 == null) {
                    message2 = "";
                }
                pUU.copydefault(tag, "can't load more cause by " + message2);
            } else {
                java.lang.String message3 = ((java.lang.Exception) pair.second).getMessage();
                if (message3 == null) {
                    message3 = C33070mpX.AYXKKw(C48033uCm.Fragment.RTWSvT);
                }
                C33064mpR.OLrzqt(viewTreeObserverOnGlobalLayoutListenerC52253wEo.copydefault(), (java.util.List<? extends java.lang.Object>) CommonEmptyData.ActionBar.buildErrorData$default(CommonEmptyData.Companion, message3, 60, false, null, null, false, 60, null));
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) viewTreeObserverOnGlobalLayoutListenerC52253wEo, false, (java.lang.String) null, 2, (java.lang.Object) null);
            }
        } else if (Intrinsics.EZpvd((java.lang.Object) str, (java.lang.Object) viewTreeObserverOnGlobalLayoutListenerC52253wEo.dxcTrN().AEQbTJ().bB_()) && (message = ((java.lang.Exception) pair.second).getMessage()) != null) {
            C55326xho.toastWithFailedIcon$default(message, 0, 1, (java.lang.Object) null);
        }
        return Unit.INSTANCE;
    }

    public static final void AEQbTJ(ViewTreeObserverOnGlobalLayoutListenerC52253wEo viewTreeObserverOnGlobalLayoutListenerC52253wEo) {
        viewTreeObserverOnGlobalLayoutListenerC52253wEo.onGlobalLayout();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: S */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit AEQbTJ(ViewTreeObserverOnGlobalLayoutListenerC52253wEo viewTreeObserverOnGlobalLayoutListenerC52253wEo, androidx.core.util.Pair pair) {
        if (((java.lang.Boolean) pair.second).booleanValue()) {
            viewTreeObserverOnGlobalLayoutListenerC52253wEo.showLoading();
        } else {
            viewTreeObserverOnGlobalLayoutListenerC52253wEo.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    @Override // o.wNE
    public void copydefault(@NotNull DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(detailsData, "");
        vYG.Application application = vYG.Companion;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        application.copydefault(detailsData, childFragmentManager);
    }

    @Override // o.wNE
    public void EZpvd(@NotNull final DetailsData detailsData) {
        Intrinsics.checkNotNullParameter(detailsData, "");
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        xOW newProxyInstance = interfaceC54581xNrOLrzqt != null ? interfaceC54581xNrOLrzqt.getNewProxyInstance() : null;
        if (newProxyInstance != null && !newProxyInstance.uzCIH()) {
            dxcTrN().copydefault(detailsData);
            return;
        }
        ViewDataBinding viewDataBindingInflate = DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C49511upt.StateListAnimator.AxsJAY, null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBindingInflate, "");
        AbstractC49607urj abstractC49607urj = (AbstractC49607urj) viewDataBindingInflate;
        android.widget.TextView textView = abstractC49607urj.copydefault;
        Intrinsics.checkNotNullExpressionValue(textView, "");
        textView.setVisibility(8);
        android.widget.TextView textView2 = abstractC49607urj.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(textView2, "");
        textView2.setVisibility(8);
        abstractC49607urj.KWHzl.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: o.wEn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z) {
                ViewTreeObserverOnGlobalLayoutListenerC52253wEo.KWHzl(this.EZpvd, compoundButton, z);
            }
        });
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        final ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(contextRequireContext);
        viewOnClickListenerC54939xaY.EZpvd(C33061mpO.setupSpanStyles$default(C33069mpW.copydefault(C55688xof.Application.ActivityResultContractsRequestPermission, C56424yEw.gEmmrt(C56390yDp.OLrzqt("tradeTitle", C54799xVt.getTitleByIdAndType$default(C54799xVt.AEQbTJ, detailsData.getInstId(), detailsData.getInstType(), false, false, 8, null)), C56390yDp.OLrzqt("tradeType", detailsData.getType()), C56390yDp.OLrzqt("tradeSymbol", C56033xvF.getBotLever$default(detailsData.getLevel(), false, 2, null)))), new java.lang.String[]{detailsData.getType()}, 0, null, false, new Function1() { // from class: o.wEp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return ViewTreeObserverOnGlobalLayoutListenerC52253wEo.EZpvd(detailsData, (java.util.List) obj);
            }
        }, 14, null), C33070mpX.AYXKKw(C55688xof.Application.updateBackInvokedCallbackStateactivity_release));
        android.view.View root = abstractC49607urj.getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        viewOnClickListenerC54939xaY.EZpvd(root);
        java.lang.String string = viewOnClickListenerC54939xaY.getContext().getString(C49511upt.Activity.AhwBna);
        Intrinsics.checkNotNullExpressionValue(string, "");
        viewOnClickListenerC54939xaY.AEQbTJ((java.lang.CharSequence) string, new View.OnClickListener() { // from class: o.wEs
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ViewTreeObserverOnGlobalLayoutListenerC52253wEo.EZpvd(this.EZpvd, detailsData, viewOnClickListenerC54939xaY, view);
            }
        });
        java.lang.String string2 = viewOnClickListenerC54939xaY.getContext().getString(C48033uCm.Fragment.DjWNei);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        viewOnClickListenerC54939xaY.AEQbTJ(string2, new View.OnClickListener() { // from class: o.wEw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                ViewTreeObserverOnGlobalLayoutListenerC52253wEo.KWHzl(viewOnClickListenerC54939xaY, view);
            }
        });
        viewOnClickListenerC54939xaY.show();
    }

    public static final void KWHzl(ViewTreeObserverOnGlobalLayoutListenerC52253wEo viewTreeObserverOnGlobalLayoutListenerC52253wEo, android.widget.CompoundButton compoundButton, boolean z) {
        C54630xPm c54630xPmAuCTelauCTel;
        InterfaceC54581xNr interfaceC54581xNrOLrzqt = C54589xNz.EZpvd.OLrzqt();
        if (interfaceC54581xNrOLrzqt == null || (c54630xPmAuCTelauCTel = interfaceC54581xNrOLrzqt.AuCTelauCTel()) == null) {
            return;
        }
        java.lang.Object context = viewTreeObserverOnGlobalLayoutListenerC52253wEo.getContext();
        LifecycleOwner lifecycleOwner = context instanceof LifecycleOwner ? (LifecycleOwner) context : null;
        c54630xPmAuCTelauCTel.KWHzl(!z, lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null);
    }

    public static final Unit EZpvd(DetailsData detailsData, java.util.List list) {
        Intrinsics.checkNotNullParameter(list, "");
        list.add(new android.text.style.ForegroundColorSpan(detailsData.getSideColor()));
        return Unit.INSTANCE;
    }

    public static final void EZpvd(ViewTreeObserverOnGlobalLayoutListenerC52253wEo viewTreeObserverOnGlobalLayoutListenerC52253wEo, DetailsData detailsData, ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewTreeObserverOnGlobalLayoutListenerC52253wEo.dxcTrN().copydefault(detailsData);
        viewOnClickListenerC54939xaY.dismiss();
    }

    public static final void KWHzl(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY, android.view.View view) {
        viewOnClickListenerC54939xaY.dismiss();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (!isVisible() || this.copydefault.KWHzl()) {
            return;
        }
        this.copydefault.OLrzqt();
    }
}
