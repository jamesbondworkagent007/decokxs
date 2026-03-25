package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.okinc.business.dexlogic.bean.ConsumeData;
import com.okinc.business.dexlogic.bean.PathSelectionRouterItem;
import com.okinc.business.dexlogic.bean.QuoteErrorBean;
import com.okinc.business.dexlogic.bean.QuotePriceRes;
import com.okinc.business.dexlogic.track.DexTrackEventParameter;
import com.okinc.business.domain.model.PathRouterUi;
import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.wallet.api.WalletDexService;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.icJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24354icJ extends wXX implements InterfaceC24361icQ {
    public static final Activity Companion = new Activity(null);
    public static final int KWHzl = 8;
    public Function1<? super PathRouterUi, Unit> AEQbTJ;
    public C43316rmw AYXKKw = new C43316rmw();
    public C23495hzM EZpvd;
    public java.lang.Boolean OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm djBIcL;
    public AbstractC23101hrq gEmmrt;

    /* JADX INFO: renamed from: o.icJ$TaskDescription */
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

    @Override // o.wXX
    public boolean getHasFooter() {
        return false;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    public C24354icJ() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.dexui.main.swap.route.SmartRouteBridgeFragment$special$$inlined$viewModels$default$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.dexui.main.swap.route.SmartRouteBridgeFragment$special$$inlined$viewModels$default$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        final Function0 function02 = null;
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(kOC.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.dexui.main.swap.route.SmartRouteBridgeFragment$special$$inlined$viewModels$default$3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.dexui.main.swap.route.SmartRouteBridgeFragment$special$$inlined$viewModels$default$4
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
                Function0 function03 = function02;
                if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.dexui.main.swap.route.SmartRouteBridgeFragment$special$$inlined$viewModels$default$5
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
        this.copydefault = C56392yDr.copydefault(new Function0() { // from class: o.icO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C24354icJ.copydefault(this.EZpvd));
            }
        });
    }

    public final kOC copydefault() {
        return (kOC) this.djBIcL.getValue();
    }

    private final boolean AYXKKw() {
        return ((java.lang.Boolean) this.copydefault.getValue()).booleanValue();
    }

    public static final boolean copydefault(C24354icJ c24354icJ) {
        android.os.Bundle arguments = c24354icJ.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("extra_universal_1");
        }
        return false;
    }

    @Override // o.wXX
    public void onSetBehavior(@NotNull BottomSheetBehavior<android.widget.FrameLayout> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "");
        super.onSetBehavior(bottomSheetBehavior);
        bottomSheetBehavior.setDraggable(true);
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(2);
        wxq.setTitle(Intrinsics.EZpvd(this.OLrzqt, java.lang.Boolean.TRUE) ? C33070mpX.AYXKKw(C23274hvD.Fragment.onAvailable) : C33070mpX.AYXKKw(C23274hvD.Fragment.registerForActivityResultlambda1));
        wxq.AEQbTJ().setVisibility(8);
        wxq.setCloseVisibility(true);
        wxq.KWHzl().setOnClickListener(new View.OnClickListener() { // from class: o.icI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C24354icJ.EZpvd(this.EZpvd, view);
            }
        });
        wxq.KWHzl().setContentDescription("closeButton");
    }

    public static final void EZpvd(C24354icJ c24354icJ, android.view.View view) {
        C23301hve.trackDexBridgeProviderListClick$default(DexTrackEventParameter.ButtonName.CLOSE.getValue(), null, 2, null);
        c24354icJ.dismiss();
    }

    private final void djBIcL() {
        AbstractC23101hrq abstractC23101hrq = null;
        C32866mlf.onEvent$default("DEXSwap_BridgePage_ProviderList_View", (TrackChannel[]) null, new Function1() { // from class: o.icR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24354icJ.EZpvd((EventParamsList) obj);
            }
        }, 1, (java.lang.Object) null);
        C23495hzM c23495hzM = this.EZpvd;
        if (c23495hzM != null) {
            RecyclerView recyclerView = c23495hzM.AEQbTJ;
            recyclerView.setLayoutManager(new LinearLayoutManager(requireContext(), 1, false));
            C43316rmw c43316rmw = this.AYXKKw;
            AbstractC23101hrq abstractC23101hrq2 = this.gEmmrt;
            if (abstractC23101hrq2 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC23101hrq = abstractC23101hrq2;
            }
            c43316rmw.register(PathRouterUi.class, new C24400idC(abstractC23101hrq).copydefault(new Function1() { // from class: o.icP
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C24354icJ.OLrzqt(this.copydefault, (PathRouterUi) obj);
                }
            }).AEQbTJ(new Function2() { // from class: o.icN
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return C24354icJ.copydefault(this.AEQbTJ, ((java.lang.Integer) obj).intValue(), (PathRouterUi) obj2);
                }
            }));
            recyclerView.setAdapter(this.AYXKKw);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EZpvd(EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C24354icJ c24354icJ, PathRouterUi pathRouterUi) {
        Intrinsics.checkNotNullParameter(pathRouterUi, "");
        Function1<? super PathRouterUi, Unit> function1 = c24354icJ.AEQbTJ;
        if (function1 != null) {
            function1.invoke(pathRouterUi);
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C24354icJ c24354icJ, int i, PathRouterUi pathRouterUi) {
        C22901hoB c22901hoBZuBGHE;
        Intrinsics.checkNotNullParameter(pathRouterUi, "");
        AbstractC23101hrq abstractC23101hrq = c24354icJ.gEmmrt;
        AbstractC23101hrq abstractC23101hrq2 = null;
        if (abstractC23101hrq == null) {
            Intrinsics.gEmmrt("");
            abstractC23101hrq = null;
        }
        C22901hoB c22901hoBZuBGHE2 = abstractC23101hrq.zuBGHE();
        if (c22901hoBZuBGHE2 != null) {
            c22901hoBZuBGHE2.AYXKKw();
        }
        abstractC23101hrq.RlQdEF().updateBridgeId(pathRouterUi.OLrzqt(), pathRouterUi.gEmmrt());
        abstractC23101hrq.dNCPSb().KWHzl();
        abstractC23101hrq.AubY().setValue(abstractC23101hrq.RlQdEF().getQuotePrice());
        try {
            Result.Application application = Result.Companion;
            AbstractC23101hrq abstractC23101hrq3 = c24354icJ.gEmmrt;
            if (abstractC23101hrq3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC23101hrq2 = abstractC23101hrq3;
            }
            QuotePriceRes quotePriceResAxsJAYsNCnLh = abstractC23101hrq2.AxsJAYsNCnLh();
            if (quotePriceResAxsJAYsNCnLh != null && (c22901hoBZuBGHE = abstractC23101hrq.zuBGHE()) != null) {
                c22901hoBZuBGHE.copydefault(quotePriceResAxsJAYsNCnLh, abstractC23101hrq.ffGIBT());
            }
            if (!abstractC23101hrq.QUSxYX().AkhnZx()) {
                c24354icJ.dismiss();
            }
            Result.m7377constructorimpl(Unit.INSTANCE);
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        C22901hoB c22901hoBZuBGHE3 = abstractC23101hrq.zuBGHE();
        if (c22901hoBZuBGHE3 != null) {
            c22901hoBZuBGHE3.AEQbTJ();
        }
        C23301hve.KWHzl("router_select", pathRouterUi.gEmmrt());
        return Unit.INSTANCE;
    }

    private final void OLrzqt() {
        java.lang.String feeCurrencyValue;
        AbstractC23101hrq abstractC23101hrq = this.gEmmrt;
        java.lang.String str = "";
        AbstractC23101hrq abstractC23101hrq2 = null;
        if (abstractC23101hrq == null) {
            Intrinsics.gEmmrt("");
            abstractC23101hrq = null;
        }
        java.util.List<PathSelectionRouterItem> value = abstractC23101hrq.gasjUx().getValue();
        if (value == null || !C33129mqd.KWHzl((java.util.Collection) value)) {
            return;
        }
        C43316rmw c43316rmw = this.AYXKKw;
        kOC kocCopydefault = copydefault();
        AbstractC23101hrq abstractC23101hrq3 = this.gEmmrt;
        if (abstractC23101hrq3 == null) {
            Intrinsics.gEmmrt("");
            abstractC23101hrq3 = null;
        }
        boolean zFdOvFl = abstractC23101hrq3.fdOvFl();
        AbstractC23101hrq abstractC23101hrq4 = this.gEmmrt;
        if (abstractC23101hrq4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC23101hrq2 = abstractC23101hrq4;
        }
        WalletDexService.FeeInfo value2 = abstractC23101hrq2.RlQdEF().getBtcFreeGasLiveData().getValue();
        if (value2 != null && (feeCurrencyValue = value2.getFeeCurrencyValue()) != null) {
            str = feeCurrencyValue;
        }
        c43316rmw.AhwBna(kocCopydefault.AEQbTJ(value, zFdOvFl, str));
    }

    private final void EZpvd() {
        if (Intrinsics.EZpvd(this.OLrzqt, java.lang.Boolean.TRUE)) {
            return;
        }
        AEQbTJ();
    }

    public final void AEQbTJ() {
        AbstractC23101hrq abstractC23101hrq = this.gEmmrt;
        if (abstractC23101hrq == null) {
            Intrinsics.gEmmrt("");
            abstractC23101hrq = null;
        }
        abstractC23101hrq.gasjUx().observe(getViewLifecycleOwner(), new TaskDescription(new Function1() { // from class: o.icM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C24354icJ.AEQbTJ(this.AEQbTJ, (java.util.List) obj);
            }
        }));
    }

    public static final Unit AEQbTJ(C24354icJ c24354icJ, java.util.List list) {
        QuoteErrorBean data;
        java.lang.String feeCurrencyValue;
        C23495hzM c23495hzM = c24354icJ.EZpvd;
        if (c23495hzM != null) {
            AbstractC23101hrq abstractC23101hrq = c24354icJ.gEmmrt;
            AbstractC23101hrq abstractC23101hrq2 = null;
            java.lang.String str = "";
            if (abstractC23101hrq == null) {
                Intrinsics.gEmmrt("");
                abstractC23101hrq = null;
            }
            QuotePriceRes value = abstractC23101hrq.AubY().getValue();
            if (value != null && value.getSuccess()) {
                if (C33129mqd.KWHzl((java.util.Collection) list)) {
                    if (list != null) {
                        C43316rmw c43316rmw = c24354icJ.AYXKKw;
                        kOC kocCopydefault = c24354icJ.copydefault();
                        AbstractC23101hrq abstractC23101hrq3 = c24354icJ.gEmmrt;
                        if (abstractC23101hrq3 == null) {
                            Intrinsics.gEmmrt("");
                            abstractC23101hrq3 = null;
                        }
                        boolean zFdOvFl = abstractC23101hrq3.fdOvFl();
                        AbstractC23101hrq abstractC23101hrq4 = c24354icJ.gEmmrt;
                        if (abstractC23101hrq4 == null) {
                            Intrinsics.gEmmrt("");
                        } else {
                            abstractC23101hrq2 = abstractC23101hrq4;
                        }
                        WalletDexService.FeeInfo value2 = abstractC23101hrq2.RlQdEF().getBtcFreeGasLiveData().getValue();
                        if (value2 != null && (feeCurrencyValue = value2.getFeeCurrencyValue()) != null) {
                            str = feeCurrencyValue;
                        }
                        c43316rmw.setItems(kocCopydefault.AEQbTJ(list, zFdOvFl, str));
                        c24354icJ.AYXKKw.notifyDataSetChanged();
                    }
                    c23495hzM.AEQbTJ.setVisibility(0);
                    c23495hzM.copydefault.setVisibility(8);
                } else {
                    c24354icJ.AEQbTJ(c23495hzM);
                }
            } else {
                AbstractC23101hrq abstractC23101hrq5 = c24354icJ.gEmmrt;
                if (abstractC23101hrq5 == null) {
                    Intrinsics.gEmmrt("");
                    abstractC23101hrq5 = null;
                }
                ConsumeData<QuoteErrorBean> value3 = abstractC23101hrq5.hUfVAv().getValue();
                if (value3 != null && (data = value3.getData()) != null && data.isError()) {
                    c24354icJ.KWHzl(c23495hzM);
                } else {
                    AbstractC23101hrq abstractC23101hrq6 = c24354icJ.gEmmrt;
                    if (abstractC23101hrq6 == null) {
                        Intrinsics.gEmmrt("");
                    } else {
                        abstractC23101hrq2 = abstractC23101hrq6;
                    }
                    QuotePriceRes value4 = abstractC23101hrq2.AubY().getValue();
                    if (value4 != null && value4.lackLiquid()) {
                        c24354icJ.AEQbTJ(c23495hzM);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    public final void KWHzl(C23495hzM c23495hzM) {
        c23495hzM.AEQbTJ.setVisibility(4);
        c23495hzM.copydefault.setVisibility(0);
        C55173xeu c55173xeu = c23495hzM.EZpvd;
        java.lang.String string = getString(C23274hvD.Fragment.DGUQLI);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        C55173xeu c55173xeu2 = c23495hzM.EZpvd;
        java.lang.String string2 = getString(C23274hvD.Fragment.heceqZ);
        Intrinsics.checkNotNullExpressionValue(string2, "");
        c55173xeu2.setSubTitle((java.lang.CharSequence) string2);
    }

    public final void AEQbTJ(C23495hzM c23495hzM) {
        c23495hzM.AEQbTJ.setVisibility(4);
        c23495hzM.copydefault.setVisibility(0);
        C55173xeu c55173xeu = c23495hzM.EZpvd;
        java.lang.String string = getString(C23274hvD.Fragment.parseResult);
        Intrinsics.checkNotNullExpressionValue(string, "");
        c55173xeu.setTitle(string);
        c23495hzM.EZpvd.setSubTitle((java.lang.CharSequence) "");
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        AbstractC23101hrq abstractC23101hrq;
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        if (AYXKKw()) {
            androidx.fragment.app.Fragment fragmentRequireParentFragment = requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
            abstractC23101hrq = (AbstractC23101hrq) new ViewModelProvider(fragmentRequireParentFragment).get(C23159hsv.class);
        } else {
            androidx.fragment.app.Fragment fragmentRequireParentFragment2 = requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment2, "");
            abstractC23101hrq = (AbstractC23101hrq) new ViewModelProvider(fragmentRequireParentFragment2).get(C23154hsq.class);
        }
        this.gEmmrt = abstractC23101hrq;
        this.EZpvd = C23495hzM.KWHzl(getCustomLayoutInflater(), constraintLayout, true);
        djBIcL();
        OLrzqt();
        EZpvd();
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
    }

    public final void AEQbTJ(boolean z, @NotNull androidx.fragment.app.FragmentManager fragmentManager, @NotNull Function1<? super PathRouterUi, Unit> function1) {
        Intrinsics.checkNotNullParameter(fragmentManager, "");
        Intrinsics.checkNotNullParameter(function1, "");
        show(fragmentManager, "javaClass");
        this.OLrzqt = java.lang.Boolean.valueOf(z);
        this.AEQbTJ = function1;
    }

    /* JADX INFO: renamed from: o.icJ$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.icJ.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C24354icJ OLrzqt(boolean z) {
            C24354icJ c24354icJ = new C24354icJ();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("extra_universal_1", z);
            c24354icJ.setArguments(bundle);
            return c24354icJ;
        }
    }

    @Override // o.InterfaceC24361icQ
    public boolean KWHzl() {
        return isResumed();
    }
}
