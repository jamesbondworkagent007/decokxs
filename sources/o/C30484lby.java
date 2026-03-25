package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.FlowLiveDataConversions;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.business.dex.api.bean.TradeParam;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import com.okinc.business.trade.features.home.domain.model.TradingType;
import com.okinc.business.trade.features.home.ui.DexHomeHeaderFragment$setListener$1;
import com.okinc.business.trade.features.home.ui.viewmodel.DexHomeViewModel;
import com.okinc.rxutils.RxBus;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C23274hvD;
import o.C31216lpo;
import o.C52761wXj;
import o.C52812wZg;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lby, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30484lby extends AbstractC30455lbV implements InterfaceC19682gLk, C31216lpo.StateListAnimator {
    public final InterfaceC56387yDm EZpvd;
    public final C31139loQ KWHzl;
    public C21463hAh OLrzqt;
    public final InterfaceC56387yDm copydefault;
    public final InterfaceC56387yDm djBIcL;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.lby$ActionBar */
    public final /* synthetic */ class ActionBar {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[TradingType.values().length];
            try {
                iArr[TradingType.None.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[TradingType.Meme.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[TradingType.Swap.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[TradingType.Bridge.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[TradingType.Advanced.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[TradingType.CopyTrading.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            AEQbTJ = iArr;
        }
    }

    public C30484lby() {
        final Function0 function0 = new Function0() { // from class: o.lbF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30484lby.valueOf(this.AEQbTJ);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.trade.features.home.ui.DexHomeHeaderFragment$special$$inlined$viewModels$default$1
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
        this.copydefault = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DexHomeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.trade.features.home.ui.DexHomeHeaderFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.trade.features.home.ui.DexHomeHeaderFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.trade.features.home.ui.DexHomeHeaderFragment$special$$inlined$viewModels$default$4
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
        this.djBIcL = C31200lpY.copydefault(this);
        this.EZpvd = C56392yDr.copydefault(new Function0() { // from class: o.lbG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return java.lang.Boolean.valueOf(C30484lby.djBIcL(this.OLrzqt));
            }
        });
        this.KWHzl = new C31139loQ();
    }

    /* JADX INFO: renamed from: o.lby$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.lby.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C30484lby AEQbTJ(@NotNull java.lang.String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "");
            C30484lby c30484lby = new C30484lby();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, str);
            bundle.putBoolean("extra_transaction_dialog_style", z);
            c30484lby.setArguments(bundle);
            return c30484lby;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DexHomeViewModel AkhnZx() {
        return (DexHomeViewModel) this.copydefault.getValue();
    }

    public static final ViewModelStoreOwner valueOf(C30484lby c30484lby) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c30484lby.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    private final java.lang.String fetchVPNInfo() {
        return (java.lang.String) this.djBIcL.getValue();
    }

    /* JADX DEBUG: Possible override for method o.lbV.EZpvd()V */
    public final boolean EZpvd() {
        return ((java.lang.Boolean) this.EZpvd.getValue()).booleanValue();
    }

    public static final boolean djBIcL(C30484lby c30484lby) {
        android.os.Bundle arguments = c30484lby.getArguments();
        if (arguments != null) {
            return arguments.getBoolean("extra_transaction_dialog_style");
        }
        return false;
    }

    @Override // o.AbstractC32996moC, androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21463hAh c21463hAhEZpvd = C21463hAh.EZpvd(layoutInflater, viewGroup, false);
        this.OLrzqt = c21463hAhEZpvd;
        if (c21463hAhEZpvd != null) {
            return c21463hAhEZpvd.getRoot();
        }
        return null;
    }

    @Override // o.AbstractC31214lpm
    public void OLrzqt() {
        C31216lpo c31216lpo;
        AppCompatTextView appCompatTextView;
        AppCompatTextView appCompatTextView2;
        if (EZpvd()) {
            AEQbTJ(C52761wXj.LoaderManager.DGOPHZ, true, true, true);
            C21463hAh c21463hAh = this.OLrzqt;
            if (c21463hAh == null || (appCompatTextView2 = c21463hAh.OLrzqt) == null) {
                return;
            }
            appCompatTextView2.setOnClickListener(new Activity(appCompatTextView2, 1000L, this));
            return;
        }
        if (!AkhnZx().ejfBZ()) {
            AEQbTJ(C52761wXj.LoaderManager.uzCIH, false, true, false);
            C21463hAh c21463hAh2 = this.OLrzqt;
            if (c21463hAh2 == null || (appCompatTextView = c21463hAh2.OLrzqt) == null) {
                return;
            }
            appCompatTextView.setOnClickListener(new Application(appCompatTextView, 1000L, this));
            return;
        }
        if (AkhnZx().OLrzqt() != TradingType.Advanced) {
            AEQbTJ(C52761wXj.LoaderManager.uzCIH, false, false, false);
            return;
        }
        C21463hAh c21463hAh3 = this.OLrzqt;
        if (c21463hAh3 == null || (c31216lpo = c21463hAh3.EZpvd) == null) {
            return;
        }
        c31216lpo.setCallback$OKDex_dex_impl(this);
    }

    @Override // o.C31216lpo.StateListAnimator
    public void AEQbTJ() {
        AkhnZx().fIwbmz();
    }

    @Override // o.AbstractC32996moC
    public void setListener() {
        AppCompatImageView appCompatImageView;
        C25390ivn.collectOnViewLifecycle$default(this, FlowKt.combine(AkhnZx().AEQbTJ(), FlowLiveDataConversions.asFlow(AkhnZx().AkhnZx()), new DexHomeHeaderFragment$setListener$1(null)), null, new Dialog(), 2, null);
        C21463hAh c21463hAh = this.OLrzqt;
        if (c21463hAh != null && (appCompatImageView = c21463hAh.copydefault) != null) {
            appCompatImageView.setOnClickListener(new TaskDescription(appCompatImageView, 1000L, this));
        }
        AbstractC58185ywX<java.lang.String> abstractC58185ywXAEQbTJ = RxBus.AEQbTJ("EVENT_CHANGE_LANGUAGE");
        final Function1 function1 = new Function1() { // from class: o.lbE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30484lby.OLrzqt((java.lang.String) obj);
            }
        };
        InterfaceC58227yxM<? super java.lang.String> interfaceC58227yxM = new InterfaceC58227yxM() { // from class: o.lbH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C30484lby.EZpvd(function1, obj);
            }
        };
        final Function1 function12 = new Function1() { // from class: o.lbL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30484lby.copydefault((java.lang.Throwable) obj);
            }
        };
        InterfaceC58217yxC interfaceC58217yxCAEQbTJ = abstractC58185ywXAEQbTJ.AEQbTJ(interfaceC58227yxM, new InterfaceC58227yxM() { // from class: o.lbJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.InterfaceC58227yxM
            public final void accept(java.lang.Object obj) {
                C30484lby.OLrzqt(function12, obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(interfaceC58217yxCAEQbTJ, "");
        yBK.EZpvd(interfaceC58217yxCAEQbTJ, gasjUx());
    }

    /* JADX INFO: renamed from: o.lby$Dialog */
    public static final class Dialog<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(kotlin.Pair<DexMultiTokenInfoBean, ? extends TradingType> pair, Continuation<? super Unit> continuation) {
            C31216lpo c31216lpo;
            C31216lpo c31216lpo2;
            AppCompatTextView appCompatTextView;
            AppCompatTextView appCompatTextView2;
            DexMultiTokenInfoBean dexMultiTokenInfoBeanComponent1 = pair.component1();
            TradingType tradingTypeComponent2 = pair.component2();
            C21463hAh c21463hAh = C30484lby.this.OLrzqt;
            if (c21463hAh != null && (appCompatTextView2 = c21463hAh.OLrzqt) != null) {
                appCompatTextView2.setVisibility((tradingTypeComponent2 == TradingType.Advanced && !C30484lby.this.EZpvd() && C30484lby.this.AkhnZx().ejfBZ()) ? 8 : 0);
            }
            C21463hAh c21463hAh2 = C30484lby.this.OLrzqt;
            if (c21463hAh2 != null && (appCompatTextView = c21463hAh2.OLrzqt) != null) {
                appCompatTextView.setText(tradingTypeComponent2.getTradingModeProvider().EZpvd());
            }
            C21463hAh c21463hAh3 = C30484lby.this.OLrzqt;
            if (c21463hAh3 != null && (c31216lpo2 = c21463hAh3.EZpvd) != null) {
                c31216lpo2.setVisibility((tradingTypeComponent2 != TradingType.Advanced || C30484lby.this.EZpvd() || dexMultiTokenInfoBeanComponent1 == null || !C30484lby.this.AkhnZx().ejfBZ()) ? 8 : 0);
            }
            C21463hAh c21463hAh4 = C30484lby.this.OLrzqt;
            if (c21463hAh4 != null && (c31216lpo = c21463hAh4.EZpvd) != null) {
                c31216lpo.AEQbTJ(dexMultiTokenInfoBeanComponent1);
            }
            C30484lby.this.OLrzqt();
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) C30484lby.this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EZpvd(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit OLrzqt(java.lang.String str) {
        C23317hvu.OLrzqt(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void OLrzqt(Function1 function1, java.lang.Object obj) {
        function1.invoke(obj);
    }

    public static final Unit copydefault(java.lang.Throwable th) {
        return Unit.INSTANCE;
    }

    @Override // o.InterfaceC19682gLk
    public LinearLayoutCompat copydefault() {
        C21463hAh c21463hAh = this.OLrzqt;
        if (c21463hAh != null) {
            return c21463hAh.KWHzl;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void AEQbTJ(@androidx.annotation.StyleRes int i, boolean z, boolean z2, boolean z3) {
        android.graphics.drawable.Drawable drawableKWHzl;
        C21463hAh c21463hAh = this.OLrzqt;
        if (c21463hAh != null) {
            AppCompatImageView appCompatImageView = c21463hAh.copydefault;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            appCompatImageView.setVisibility(z3 ? 0 : 8);
            AppCompatTextView appCompatTextView = c21463hAh.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
            C25352ivB.AEQbTJ(appCompatTextView, i);
            AppCompatTextView appCompatTextView2 = c21463hAh.OLrzqt;
            if (z2) {
                java.lang.CharSequence text = appCompatTextView2.getText();
                Intrinsics.checkNotNullExpressionValue(text, "");
                drawableKWHzl = text.length() > 0 ? C33070mpX.KWHzl(C52761wXj.TaskDescription.OJuSTm) : null;
            }
            appCompatTextView2.setCompoundDrawablesRelativeWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, drawableKWHzl, (android.graphics.drawable.Drawable) null);
            AppCompatTextView appCompatTextView3 = c21463hAh.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
            ViewGroup.LayoutParams layoutParams = appCompatTextView3.getLayoutParams();
            if (layoutParams != null) {
                ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
                layoutParams2.endToEnd = z ? 0 : -1;
                layoutParams2.startToStart = 0;
                appCompatTextView3.setLayoutParams(layoutParams2);
                return;
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    public final void AYXKKw() {
        C25295ity.KWHzl(C22877hne.getBusinessType$default(C22877hne.OLrzqt, fetchVPNInfo(), false, 2, null), AkhnZx().KWHzl(AkhnZx().OLrzqt()), EZpvd() ? "yes" : "no", "switch", "");
        C22355hdm c22355hdmOLrzqt = C22355hdm.Companion.OLrzqt(AkhnZx().OLrzqt(), EZpvd(), new Function1() { // from class: o.lbM
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C30484lby.KWHzl(this.KWHzl, (TradingType) obj);
            }
        });
        androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
        c22355hdmOLrzqt.show(childFragmentManager);
    }

    public static final Unit KWHzl(C30484lby c30484lby, TradingType tradingType) {
        java.lang.String str;
        Intrinsics.checkNotNullParameter(tradingType, "");
        if (c30484lby.AkhnZx().OLrzqt() == tradingType) {
            return Unit.INSTANCE;
        }
        switch (ActionBar.AEQbTJ[tradingType.ordinal()]) {
            case 1:
                str = "";
                break;
            case 2:
                str = "to_meme";
                break;
            case 3:
                str = "to_advance";
                break;
            case 4:
                str = "to_bridge";
                break;
            case 5:
                str = "to_cefi";
                break;
            case 6:
                str = "to_copytrading";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        C25295ity.KWHzl(C22877hne.getBusinessType$default(C22877hne.OLrzqt, c30484lby.fetchVPNInfo(), false, 2, null), c30484lby.AkhnZx().KWHzl(tradingType), c30484lby.EZpvd() ? "yes" : "no", str, "");
        C22380heK c22380heK = C22380heK.OLrzqt;
        MutableLiveData<TradeParam> mutableLiveDataValueOf = c22380heK.copydefault(c30484lby.fetchVPNInfo()).EZpvd(true).valueOf();
        TradeParam.Companion companion = TradeParam.Companion;
        mutableLiveDataValueOf.setValue(companion.AEQbTJ());
        c22380heK.copydefault(c30484lby.fetchVPNInfo()).EZpvd(false).valueOf().setValue(companion.AEQbTJ());
        DexHomeViewModel.updateTradeType$default(c30484lby.AkhnZx(), tradingType, false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.lby$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View OLrzqt;
        public final /* synthetic */ C30484lby copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C30484lby c30484lby) {
            this.OLrzqt = view;
            this.EZpvd = j;
            this.copydefault = c30484lby;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.EZpvd || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.copydefault.AYXKKw();
            }
        }
    }

    /* JADX INFO: renamed from: o.lby$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long AEQbTJ;
        public final /* synthetic */ C30484lby KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C30484lby c30484lby) {
            this.OLrzqt = view;
            this.AEQbTJ = j;
            this.KWHzl = c30484lby;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.AEQbTJ || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                this.KWHzl.AYXKKw();
            }
        }
    }

    /* JADX INFO: renamed from: o.lby$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ C30484lby copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C30484lby c30484lby) {
            this.KWHzl = view;
            this.EZpvd = j;
            this.copydefault = c30484lby;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.EZpvd || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.copydefault.requireActivity().finish();
            }
        }
    }

    @Override // o.AbstractC31214lpm, o.AbstractC32998moE
    public void onVisible() {
        if (EZpvd() || !C22416heu.zuBGHE() || AkhnZx().ejfBZ()) {
            return;
        }
        OLrzqt(new Function0() { // from class: o.lbD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30484lby.AkhnZx(this.OLrzqt);
            }
        });
    }

    public static final Unit AkhnZx(C30484lby c30484lby) {
        c30484lby.gEmmrt();
        return Unit.INSTANCE;
    }

    public final void OLrzqt(Function0<Unit> function0) {
        AppCompatTextView appCompatTextView;
        C21463hAh c21463hAh = this.OLrzqt;
        if (c21463hAh == null || (appCompatTextView = c21463hAh.OLrzqt) == null) {
            return;
        }
        this.KWHzl.EZpvd(this, appCompatTextView, function0);
    }

    @Override // o.AbstractC31214lpm, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.KWHzl.AEQbTJ();
        super.onDestroyView();
    }

    public final void gEmmrt() {
        AppCompatTextView appCompatTextView;
        C21463hAh c21463hAh = this.OLrzqt;
        if (c21463hAh == null || (appCompatTextView = c21463hAh.OLrzqt) == null) {
            return;
        }
        int size = TradingType.Companion.OLrzqt().size();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        C52812wZg c52812wZg = new C52812wZg(fragmentActivityRequireActivity);
        C52812wZg.StateListAnimator stateListAnimator = new C52812wZg.StateListAnimator(appCompatTextView);
        stateListAnimator.EZpvd(1);
        stateListAnimator.copydefault(16);
        stateListAnimator.AEQbTJ(C33070mpX.AYXKKw(C23274hvD.Fragment.fupbxE));
        stateListAnimator.OLrzqt(C33069mpW.copydefault(this, C23274hvD.Fragment.dPnHjp, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("num", java.lang.Integer.valueOf(size)))));
        c52812wZg.AEQbTJ(stateListAnimator);
        c52812wZg.OLrzqt(0);
        c52812wZg.KWHzl(new Function0() { // from class: o.lbA
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C30484lby.isConnected(this.OLrzqt);
            }
        });
        c52812wZg.fARcdN();
    }

    public static final Unit isConnected(C30484lby c30484lby) {
        c30484lby.AkhnZx().EZpvd(true);
        return Unit.INSTANCE;
    }
}
