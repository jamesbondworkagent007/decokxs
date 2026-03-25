package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.buysell.ui.paymentmethod.PaymentMethodSelectionViewModel;
import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodParameter;
import com.okinc.buysell.ui.paymentmethod.data.SelectionRow;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import java.util.LinkedHashMap;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lBt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C29826lBt extends AbstractC29810lBd {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int djBIcL = 8;
    public final InterfaceC56387yDm AYXKKw;
    public AbstractC31475lui AhwBna;
    public SelectPaymentMethodParameter gEmmrt;
    public wXQ valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull SelectPaymentMethodParameter selectPaymentMethodParameter) {
        Intrinsics.checkNotNullParameter(selectPaymentMethodParameter, "");
        this.gEmmrt = selectPaymentMethodParameter;
    }

    public C29826lBt() {
        final Function0 function0 = new Function0() { // from class: o.lBD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29826lBt.AEQbTJ(this.KWHzl);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PaymentSelectionBottomSheet$special$$inlined$viewModels$default$1
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
        this.AYXKKw = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PaymentMethodSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PaymentSelectionBottomSheet$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PaymentSelectionBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.buysell.ui.bsc.bottomsheet.PaymentSelectionBottomSheet$special$$inlined$viewModels$default$4
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
    }

    /* JADX DEBUG: Possible override for method o.lBd.EZpvd()V */
    public final SelectPaymentMethodParameter EZpvd() {
        SelectPaymentMethodParameter selectPaymentMethodParameter = this.gEmmrt;
        if (selectPaymentMethodParameter != null) {
            return selectPaymentMethodParameter;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    private final PaymentMethodSelectionViewModel valueOf() {
        return (PaymentMethodSelectionViewModel) this.AYXKKw.getValue();
    }

    public static final ViewModelStoreOwner AEQbTJ(C29826lBt c29826lBt) {
        FragmentActivity fragmentActivityRequireActivity = c29826lBt.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return fragmentActivityRequireActivity;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        SelectPaymentMethodParameter selectPaymentMethodParameter;
        super.onCreate(bundle);
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (selectPaymentMethodParameter = (SelectPaymentMethodParameter) arguments.getParcelable("PaymentSelectionBottomSheet.key_param")) == null) {
            throw new java.lang.IllegalArgumentException("SelectPaymentMethodParameter is required");
        }
        KWHzl(selectPaymentMethodParameter);
        getChildFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() { // from class: o.lBz
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
            public final void onBackStackChanged() {
                C29826lBt.EZpvd(this.KWHzl);
            }
        });
    }

    public static final void EZpvd(C29826lBt c29826lBt) {
        c29826lBt.AYXKKw();
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        AbstractC31475lui abstractC31475luiOLrzqt = AbstractC31475lui.OLrzqt(android.view.LayoutInflater.from(getContext()));
        this.AhwBna = abstractC31475luiOLrzqt;
        if (abstractC31475luiOLrzqt == null) {
            Intrinsics.gEmmrt("");
            abstractC31475luiOLrzqt = null;
        }
        constraintLayout.addView(abstractC31475luiOLrzqt.getRoot(), new ConstraintLayout.LayoutParams(-1, -1));
        AhwBna();
        djBIcL();
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.EZpvd().setVisibility(8);
        wxq.setStyle(4);
        wxq.AEQbTJ().setVisibility(0);
        wxq.AYXKKw().setText(getString(C31351lsQ.Activity.DlABUU));
        this.valueOf = wxq;
        wxq.EZpvd().setVisibility(8);
        wXQ wxq2 = this.valueOf;
        if (wxq2 == null) {
            Intrinsics.gEmmrt("");
            wxq2 = null;
        }
        wxq2.EZpvd().setOnClickListener(new View.OnClickListener() { // from class: o.lBv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29826lBt.OLrzqt(this.OLrzqt, view);
            }
        });
    }

    public static final void OLrzqt(C29826lBt c29826lBt, android.view.View view) {
        android.view.View view2;
        androidx.fragment.app.FragmentManager childFragmentManager = c29826lBt.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        if (childFragmentManager.getBackStackEntryCount() > 0) {
            AbstractC31475lui abstractC31475lui = c29826lBt.AhwBna;
            AbstractC31475lui abstractC31475lui2 = null;
            if (abstractC31475lui == null) {
                Intrinsics.gEmmrt("");
                abstractC31475lui = null;
            }
            androidx.fragment.app.Fragment fragmentFindFragmentById = childFragmentManager.findFragmentById(abstractC31475lui.AEQbTJ.getId());
            if (fragmentFindFragmentById == null || (view2 = fragmentFindFragmentById.getView()) == null) {
                AbstractC31475lui abstractC31475lui3 = c29826lBt.AhwBna;
                if (abstractC31475lui3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC31475lui2 = abstractC31475lui3;
                }
                view2 = abstractC31475lui2.AEQbTJ;
            }
            childFragmentManager.addOnBackStackChangedListener(new Activity(childFragmentManager, c29826lBt, view2.getHeight()));
            childFragmentManager.popBackStack();
            return;
        }
        c29826lBt.dismiss();
    }

    /* JADX INFO: renamed from: o.lBt$Activity */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Activity implements FragmentManager.OnBackStackChangedListener {
        public final /* synthetic */ androidx.fragment.app.FragmentManager KWHzl;
        public final /* synthetic */ C29826lBt OLrzqt;
        public final /* synthetic */ int copydefault;

        public Activity(androidx.fragment.app.FragmentManager fragmentManager, C29826lBt c29826lBt, int i) {
            this.KWHzl = fragmentManager;
            this.OLrzqt = c29826lBt;
            this.copydefault = i;
        }

        @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
        public void onBackStackChanged() {
            int height;
            android.view.View view;
            this.KWHzl.removeOnBackStackChangedListener(this);
            androidx.fragment.app.FragmentManager fragmentManager = this.KWHzl;
            AbstractC31475lui abstractC31475lui = this.OLrzqt.AhwBna;
            AbstractC31475lui abstractC31475lui2 = null;
            if (abstractC31475lui == null) {
                Intrinsics.gEmmrt("");
                abstractC31475lui = null;
            }
            androidx.fragment.app.Fragment fragmentFindFragmentById = fragmentManager.findFragmentById(abstractC31475lui.AEQbTJ.getId());
            java.lang.Integer numKWHzl = C30017lIv.EZpvd.KWHzl(fragmentFindFragmentById != null ? fragmentFindFragmentById.getTag() : null);
            if (numKWHzl != null) {
                height = numKWHzl.intValue();
            } else {
                AbstractC31475lui abstractC31475lui3 = this.OLrzqt.AhwBna;
                if (abstractC31475lui3 == null) {
                    Intrinsics.gEmmrt("");
                } else {
                    abstractC31475lui2 = abstractC31475lui3;
                }
                height = abstractC31475lui2.AEQbTJ.getHeight();
            }
            if (fragmentFindFragmentById == null || (view = fragmentFindFragmentById.getView()) == null) {
                return;
            }
            Intrinsics.checkNotNullExpressionValue(OneShotPreDrawListener.add(view, new TaskDescription(view, this.OLrzqt, this.copydefault, height)), "");
        }

        /* JADX INFO: renamed from: o.lBt$Activity$TaskDescription */
        public static final class TaskDescription implements java.lang.Runnable {
            public final /* synthetic */ C29826lBt AEQbTJ;
            public final /* synthetic */ android.view.View EZpvd;
            public final /* synthetic */ int OLrzqt;
            public final /* synthetic */ int copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public TaskDescription(android.view.View view, C29826lBt c29826lBt, int i, int i2) {
                this.EZpvd = view;
                this.AEQbTJ = c29826lBt;
                this.OLrzqt = i;
                this.copydefault = i2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C30017lIv c30017lIv = C30017lIv.EZpvd;
                AbstractC31475lui abstractC31475lui = this.AEQbTJ.AhwBna;
                if (abstractC31475lui == null) {
                    Intrinsics.gEmmrt("");
                    abstractC31475lui = null;
                }
                FragmentContainerView fragmentContainerView = abstractC31475lui.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
                c30017lIv.AEQbTJ(fragmentContainerView, this.OLrzqt, this.copydefault);
            }
        }
    }

    public final void AhwBna() {
        lBI lbiCopydefault = lBI.Companion.copydefault(EZpvd());
        androidx.fragment.app.FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        AbstractC31475lui abstractC31475lui = this.AhwBna;
        if (abstractC31475lui == null) {
            Intrinsics.gEmmrt("");
            abstractC31475lui = null;
        }
        androidx.fragment.app.FragmentTransaction fragmentTransactionAdd = fragmentTransactionBeginTransaction.add(abstractC31475lui.AEQbTJ.getId(), lbiCopydefault, "SelectPaymentMethodFragment");
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionAdd, "");
        fragmentTransactionAdd.addToBackStack("SelectPaymentMethodFragment");
        fragmentTransactionAdd.setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        getChildFragmentManager().registerFragmentLifecycleCallbacks(new ActionBar("SelectPaymentMethodFragment", this), true);
        fragmentTransactionAdd.commitAllowingStateLoss();
        AYXKKw();
    }

    /* JADX INFO: renamed from: o.lBt$ActionBar */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class ActionBar extends FragmentManager.FragmentLifecycleCallbacks {
        public final /* synthetic */ java.lang.String AEQbTJ;
        public final /* synthetic */ C29826lBt OLrzqt;

        public ActionBar(java.lang.String str, C29826lBt c29826lBt) {
            this.AEQbTJ = str;
            this.OLrzqt = c29826lBt;
        }

        @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
        public void onFragmentViewCreated(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment, android.view.View view, android.os.Bundle bundle) {
            Intrinsics.checkNotNullParameter(fragmentManager, "");
            Intrinsics.checkNotNullParameter(fragment, "");
            Intrinsics.checkNotNullParameter(view, "");
            if (Intrinsics.EZpvd((java.lang.Object) fragment.getTag(), (java.lang.Object) this.AEQbTJ)) {
                Intrinsics.checkNotNullExpressionValue(OneShotPreDrawListener.add(view, new Activity(view, view, this.AEQbTJ, this.OLrzqt, this)), "");
            }
        }

        /* JADX INFO: renamed from: o.lBt$ActionBar$Activity */
        public static final class Activity implements java.lang.Runnable {
            public final /* synthetic */ android.view.View AEQbTJ;
            public final /* synthetic */ ActionBar EZpvd;
            public final /* synthetic */ java.lang.String KWHzl;
            public final /* synthetic */ C29826lBt OLrzqt;
            public final /* synthetic */ android.view.View copydefault;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public Activity(android.view.View view, android.view.View view2, java.lang.String str, C29826lBt c29826lBt, ActionBar actionBar) {
                this.copydefault = view;
                this.AEQbTJ = view2;
                this.KWHzl = str;
                this.OLrzqt = c29826lBt;
                this.EZpvd = actionBar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C30017lIv.EZpvd.KWHzl().put(this.KWHzl, java.lang.Integer.valueOf(this.AEQbTJ.getHeight()));
                this.OLrzqt.getChildFragmentManager().unregisterFragmentLifecycleCallbacks(this.EZpvd);
            }
        }
    }

    private final void djBIcL() {
        mHA mha = mHA.OLrzqt;
        LiveData<C32989mnw<Unit>> liveDataAYXKKw = valueOf().AYXKKw();
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        mha.copydefault(liveDataAYXKKw, viewLifecycleOwner, new Function1() { // from class: o.lBy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29826lBt.copydefault(this.KWHzl, (Unit) obj);
            }
        });
        LiveData<C32989mnw<Unit>> liveDataValueOf = valueOf().valueOf();
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "");
        mha.copydefault(liveDataValueOf, viewLifecycleOwner2, new Function1() { // from class: o.lBA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29826lBt.EZpvd(this.AEQbTJ, (Unit) obj);
            }
        });
        LiveData<C32989mnw<kotlin.Pair<com.okinc.okpaymentapi.data.remote.model.management.Channel, androidx.fragment.app.Fragment>>> liveDataIwGUEr = valueOf().iwGUEr();
        LifecycleOwner viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "");
        mha.copydefault(liveDataIwGUEr, viewLifecycleOwner3, new Function1() { // from class: o.lBx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29826lBt.EZpvd(this.EZpvd, (kotlin.Pair) obj);
            }
        });
        LiveData<C32989mnw<kotlin.Pair<java.util.List<SelectionRow>, androidx.fragment.app.Fragment>>> fieldNames = valueOf().getFieldNames();
        LifecycleOwner viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "");
        mha.copydefault(fieldNames, viewLifecycleOwner4, new Function1() { // from class: o.lBw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C29826lBt.OLrzqt(this.copydefault, (kotlin.Pair) obj);
            }
        });
    }

    public static final Unit copydefault(C29826lBt c29826lBt, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        c29826lBt.dismiss();
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C29826lBt c29826lBt, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        java.util.Map<java.lang.String, java.lang.Integer> mapKWHzl = C30017lIv.EZpvd.KWHzl();
        AbstractC31475lui abstractC31475lui = c29826lBt.AhwBna;
        if (abstractC31475lui == null) {
            Intrinsics.gEmmrt("");
            abstractC31475lui = null;
        }
        mapKWHzl.put("SelectPaymentMethodFragment", java.lang.Integer.valueOf(abstractC31475lui.AEQbTJ.getHeight()));
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C29826lBt c29826lBt, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        LinkedHashMap<java.lang.String, java.lang.String> linkedHashMapCopydefault = C31662lzj.copydefault((com.okinc.okpaymentapi.data.remote.model.management.Channel) pair.getFirst());
        if (!linkedHashMapCopydefault.isEmpty()) {
            C29827lBu c29827lBuOLrzqt = C29827lBu.Companion.OLrzqt(linkedHashMapCopydefault, ((com.okinc.okpaymentapi.data.remote.model.management.Channel) pair.getFirst()).getSupportCurrency());
            AbstractC31475lui abstractC31475lui = c29826lBt.AhwBna;
            AbstractC31475lui abstractC31475lui2 = null;
            if (abstractC31475lui == null) {
                Intrinsics.gEmmrt("");
                abstractC31475lui = null;
            }
            int height = abstractC31475lui.AEQbTJ.getHeight();
            C30017lIv c30017lIv = C30017lIv.EZpvd;
            androidx.fragment.app.FragmentManager childFragmentManager = c29826lBt.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            AbstractC31475lui abstractC31475lui3 = c29826lBt.AhwBna;
            if (abstractC31475lui3 == null) {
                Intrinsics.gEmmrt("");
                abstractC31475lui3 = null;
            }
            FragmentContainerView fragmentContainerView = abstractC31475lui3.AEQbTJ;
            Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
            c30017lIv.AEQbTJ(childFragmentManager, fragmentContainerView, "PaymentLimitsFragment", height);
            androidx.fragment.app.FragmentTransaction fragmentTransactionHide = c29826lBt.getChildFragmentManager().beginTransaction().hide((androidx.fragment.app.Fragment) pair.getSecond());
            AbstractC31475lui abstractC31475lui4 = c29826lBt.AhwBna;
            if (abstractC31475lui4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                abstractC31475lui2 = abstractC31475lui4;
            }
            fragmentTransactionHide.add(abstractC31475lui2.AEQbTJ.getId(), c29827lBuOLrzqt, "PaymentLimitsFragment").addToBackStack("PaymentLimitsFragment").setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE).commitAllowingStateLoss();
            c29826lBt.AYXKKw();
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C29826lBt c29826lBt, kotlin.Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "");
        lAQ laqEZpvd = lAQ.Companion.EZpvd((java.util.List) pair.getFirst());
        AbstractC31475lui abstractC31475lui = c29826lBt.AhwBna;
        AbstractC31475lui abstractC31475lui2 = null;
        if (abstractC31475lui == null) {
            Intrinsics.gEmmrt("");
            abstractC31475lui = null;
        }
        int height = abstractC31475lui.AEQbTJ.getHeight();
        C30017lIv c30017lIv = C30017lIv.EZpvd;
        androidx.fragment.app.FragmentManager childFragmentManager = c29826lBt.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        AbstractC31475lui abstractC31475lui3 = c29826lBt.AhwBna;
        if (abstractC31475lui3 == null) {
            Intrinsics.gEmmrt("");
            abstractC31475lui3 = null;
        }
        FragmentContainerView fragmentContainerView = abstractC31475lui3.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(fragmentContainerView, "");
        c30017lIv.AEQbTJ(childFragmentManager, fragmentContainerView, "AddAccountListFragment", height);
        androidx.fragment.app.FragmentTransaction fragmentTransactionHide = c29826lBt.getChildFragmentManager().beginTransaction().hide((androidx.fragment.app.Fragment) pair.getSecond());
        AbstractC31475lui abstractC31475lui4 = c29826lBt.AhwBna;
        if (abstractC31475lui4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            abstractC31475lui2 = abstractC31475lui4;
        }
        fragmentTransactionHide.add(abstractC31475lui2.AEQbTJ.getId(), laqEZpvd, "AddAccountListFragment").addToBackStack("AddAccountListFragment").setTransition(androidx.fragment.app.FragmentTransaction.TRANSIT_FRAGMENT_FADE).commitAllowingStateLoss();
        c29826lBt.AYXKKw();
        return Unit.INSTANCE;
    }

    public final void AYXKKw() {
        java.lang.String string;
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        AbstractC31475lui abstractC31475lui = this.AhwBna;
        wXQ wxq = null;
        if (abstractC31475lui == null) {
            Intrinsics.gEmmrt("");
            abstractC31475lui = null;
        }
        androidx.fragment.app.Fragment fragmentFindFragmentById = childFragmentManager.findFragmentById(abstractC31475lui.AEQbTJ.getId());
        if (fragmentFindFragmentById instanceof lBI) {
            wXQ wxq2 = this.valueOf;
            if (wxq2 == null) {
                Intrinsics.gEmmrt("");
                wxq2 = null;
            }
            wxq2.EZpvd().setVisibility(8);
            wXQ wxq3 = this.valueOf;
            if (wxq3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                wxq = wxq3;
            }
            android.widget.TextView textViewAYXKKw = wxq.AYXKKw();
            if (EZpvd().getTradeType() != TradeType.BUY && EZpvd().getTradeType() == TradeType.SELL) {
                string = getString(C31351lsQ.Activity.DlmWDR);
            } else {
                string = getString(C31351lsQ.Activity.DlABUU);
            }
            textViewAYXKKw.setText(string);
            return;
        }
        if (fragmentFindFragmentById instanceof C29827lBu) {
            wXQ wxq4 = this.valueOf;
            if (wxq4 == null) {
                Intrinsics.gEmmrt("");
                wxq4 = null;
            }
            wxq4.EZpvd().setVisibility(0);
            wXQ wxq5 = this.valueOf;
            if (wxq5 == null) {
                Intrinsics.gEmmrt("");
            } else {
                wxq = wxq5;
            }
            wxq.AYXKKw().setText(getString(C31351lsQ.Activity.fLIjIY));
            return;
        }
        if (fragmentFindFragmentById instanceof lAQ) {
            wXQ wxq6 = this.valueOf;
            if (wxq6 == null) {
                Intrinsics.gEmmrt("");
                wxq6 = null;
            }
            wxq6.EZpvd().setVisibility(0);
            wXQ wxq7 = this.valueOf;
            if (wxq7 == null) {
                Intrinsics.gEmmrt("");
            } else {
                wxq = wxq7;
            }
            wxq.AYXKKw().setText(getString(C31351lsQ.Activity.RzdrRQ));
            return;
        }
        wXQ wxq8 = this.valueOf;
        if (wxq8 == null) {
            Intrinsics.gEmmrt("");
            wxq8 = null;
        }
        wxq8.EZpvd().setVisibility(0);
        wXQ wxq9 = this.valueOf;
        if (wxq9 == null) {
            Intrinsics.gEmmrt("");
        } else {
            wxq = wxq9;
        }
        wxq.AYXKKw().setText("");
    }

    /* JADX INFO: renamed from: o.lBt$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lBt.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C29826lBt EZpvd(@NotNull SelectPaymentMethodParameter selectPaymentMethodParameter) {
            Intrinsics.checkNotNullParameter(selectPaymentMethodParameter, "");
            C29826lBt c29826lBt = new C29826lBt();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("PaymentSelectionBottomSheet.key_param", selectPaymentMethodParameter);
            c29826lBt.setArguments(bundle);
            return c29826lBt;
        }
    }
}
