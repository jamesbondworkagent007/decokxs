package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.okinc.dexkline.dexui.main.market.detail.fragment.chart.pooltransactions.liquiditypools.itemviewbinding.liqpool.ChartDataUIItem;
import com.okinc.dexkline.market.features.data.ui.CoinDetailDataViewModel;
import com.okinc.dexkline.market.features.data.ui.holder.DataHolderViewModel;
import com.okinc.dexkline.market.features.data.ui.holder.HolderTimeframe;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o.C35964oKf;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mYb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32332mYb extends AbstractC32341mYk {
    public final InterfaceC56387yDm KWHzl;
    public final InterfaceC56387yDm OLrzqt;
    public oNN copydefault;

    /* JADX INFO: renamed from: o.mYb$Activity */
    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class Activity {
        public static final /* synthetic */ int[] copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[HolderTimeframe.values().length];
            try {
                iArr[HolderTimeframe.DAILY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[HolderTimeframe.WEEKLY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            copydefault = iArr;
        }
    }

    public C32332mYb() {
        final Function0 function0 = new Function0() { // from class: o.mYe
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C32332mYb.EZpvd(this.EZpvd);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.market.features.data.ui.holder.DataHolderFragment$special$$inlined$viewModels$default$1
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(CoinDetailDataViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.data.ui.holder.DataHolderFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.data.ui.holder.DataHolderFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.data.ui.holder.DataHolderFragment$special$$inlined$viewModels$default$4
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
        final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.dexkline.market.features.data.ui.holder.DataHolderFragment$special$$inlined$viewModels$default$5
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(lazyThreadSafetyMode, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.dexkline.market.features.data.ui.holder.DataHolderFragment$special$$inlined$viewModels$default$6
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function03.invoke();
            }
        });
        this.OLrzqt = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(DataHolderViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.dexkline.market.features.data.ui.holder.DataHolderFragment$special$$inlined$viewModels$default$7
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2).getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore, "");
                return viewModelStore;
            }
        }, new Function0<CreationExtras>() { // from class: com.okinc.dexkline.market.features.data.ui.holder.DataHolderFragment$special$$inlined$viewModels$default$8
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
                Function0 function04 = function02;
                if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.dexkline.market.features.data.ui.holder.DataHolderFragment$special$$inlined$viewModels$default$9
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
                ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                return defaultViewModelProviderFactory;
            }
        });
    }

    public final CoinDetailDataViewModel AEQbTJ() {
        return (CoinDetailDataViewModel) this.KWHzl.getValue();
    }

    public static final ViewModelStoreOwner EZpvd(C32332mYb c32332mYb) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c32332mYb.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX DEBUG: Possible override for method o.mYk.EZpvd()V */
    public final DataHolderViewModel EZpvd() {
        return (DataHolderViewModel) this.OLrzqt.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        oNN onnKWHzl = oNN.KWHzl(getLayoutInflater(), viewGroup, false);
        this.copydefault = onnKWHzl;
        if (onnKWHzl != null) {
            return onnKWHzl.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        AYXKKw();
        valueOf();
    }

    private final void AYXKKw() {
        oNN onn = this.copydefault;
        if (onn != null) {
            C55052xcf c55052xcf = onn.AhwBna;
            Intrinsics.checkNotNullExpressionValue(c55052xcf, "");
            c55052xcf.setVisibility(8);
            KWHzl();
            wYC wyc = onn.AYXKKw;
            wyc.setOnClickListener(new FragmentManager(wyc, 1000L, this));
            wYC wyc2 = onn.DbNXlk;
            wyc2.setOnClickListener(new Fragment(wyc2, 1000L, this));
            wYC wyc3 = onn.djBIcL;
            wyc3.setOnClickListener(new LoaderManager(wyc3, 1000L, this));
            wYC wyc4 = onn.gEmmrt;
            wyc4.setOnClickListener(new VoiceInteractor(wyc4, 1000L, this));
            C55173xeu c55173xeu = onn.valueOf;
            c55173xeu.setRetry(C33070mpX.AYXKKw(C35964oKf.Fragment.AwvSrB));
            c55173xeu.setEmptyTypeImage(8);
            c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.mYd
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C32332mYb.AEQbTJ(this.OLrzqt, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: o.mYb$ActionBar */
    public static final class ActionBar implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.mYb$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.mYb$PendingIntent */
    public static final class PendingIntent implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public PendingIntent(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.KWHzl = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.KWHzl.dismiss();
        }
    }

    /* JADX INFO: renamed from: o.mYb$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ ViewOnClickListenerC54939xaY EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY) {
            this.EZpvd = viewOnClickListenerC54939xaY;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            this.EZpvd.dismiss();
        }
    }

    public static final void AEQbTJ(C32332mYb c32332mYb, android.view.View view) {
        CoinDetailDataViewModel.getHolderData$default(c32332mYb.AEQbTJ(), true, false, 2, null);
    }

    /* JADX INFO: renamed from: o.mYb$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(mXJ mxj, Continuation<? super Unit> continuation) {
            oNN onn = C32332mYb.this.copydefault;
            if (onn != null) {
                C32332mYb c32332mYb = C32332mYb.this;
                if (!mxj.OLrzqt().copydefault()) {
                    C55113xdn c55113xdn = onn.fetchVPNInfo;
                    Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
                    c55113xdn.setVisibility(mxj.OLrzqt().EZpvd() ? 0 : 8);
                    C55173xeu c55173xeu = onn.valueOf;
                    Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
                    c55173xeu.setVisibility(mxj.KWHzl() ? 0 : 8);
                    ConstraintLayout constraintLayout = onn.EZpvd;
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "");
                    constraintLayout.setVisibility(mxj.AEQbTJ() == null ? 8 : 0);
                    java.lang.Object objAEQbTJ = mxj.AEQbTJ();
                    if (objAEQbTJ != null) {
                        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) c32332mYb, true, (java.lang.String) null, 2, (java.lang.Object) null);
                        mXM mxm = objAEQbTJ instanceof mXM ? (mXM) objAEQbTJ : null;
                        if (mxm != null) {
                            c32332mYb.OLrzqt(mxm);
                            c32332mYb.AEQbTJ(mxm);
                            c32332mYb.copydefault(mxm);
                            c32332mYb.KWHzl(mxm);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final void valueOf() {
        mUN.collectOnViewLifecycle$default(this, AEQbTJ().KWHzl(), null, new Application(), 2, null);
        mUN.collectOnViewLifecycle$default(this, FlowKt.filterNotNull(AEQbTJ().AEQbTJ()), null, new StateListAnimator(), 2, null);
    }

    /* JADX INFO: renamed from: o.mYb$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: AEQbTJ, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(kotlin.Pair<java.lang.Boolean, java.lang.Boolean> pair, Continuation<? super Unit> continuation) {
            boolean zBooleanValue = pair.component1().booleanValue();
            pair.component2().booleanValue();
            oNN onn = C32332mYb.this.copydefault;
            if (onn != null) {
                mYA mya = onn.AEQbTJ;
                Intrinsics.checkNotNullExpressionValue(mya, "");
                mya.setVisibility(0);
                android.widget.TextView textView = onn.ejfBZ;
                Intrinsics.checkNotNullExpressionValue(textView, "");
                textView.setVisibility(zBooleanValue ? 0 : 8);
                wYC wyc = onn.DbNXlk;
                Intrinsics.checkNotNullExpressionValue(wyc, "");
                wyc.setVisibility(zBooleanValue ? 0 : 8);
                mYF myf = onn.OLrzqt;
                Intrinsics.checkNotNullExpressionValue(myf, "");
                myf.setVisibility(zBooleanValue ? 0 : 8);
                android.widget.TextView textView2 = onn.fARcdN;
                Intrinsics.checkNotNullExpressionValue(textView2, "");
                textView2.setVisibility(8);
                wYC wyc2 = onn.djBIcL;
                Intrinsics.checkNotNullExpressionValue(wyc2, "");
                wyc2.setVisibility(8);
                mYK myk = onn.copydefault;
                Intrinsics.checkNotNullExpressionValue(myk, "");
                myk.setVisibility(8);
                android.widget.TextView textView3 = onn.AkhnZx;
                Intrinsics.checkNotNullExpressionValue(textView3, "");
                textView3.setVisibility(8);
                wYC wyc3 = onn.gEmmrt;
                Intrinsics.checkNotNullExpressionValue(wyc3, "");
                wyc3.setVisibility(8);
                C32348mYr c32348mYr = onn.KWHzl;
                Intrinsics.checkNotNullExpressionValue(c32348mYr, "");
                c32348mYr.setVisibility(8);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.mYb$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ C32332mYb KWHzl;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C32332mYb c32332mYb) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.KWHzl = c32332mYb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.content.Context context = this.KWHzl.getContext();
                if (context != null) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.gBtXYZ));
                    viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35964oKf.Fragment.dzkkkq));
                    viewOnClickListenerC54939xaY.EZpvd(C35964oKf.Fragment.DcMfJKDDUqPf, new TaskDescription(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.mYb$FragmentManager */
    public static final class FragmentManager implements View.OnClickListener {
        public final /* synthetic */ android.view.View AEQbTJ;
        public final /* synthetic */ C32332mYb KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public FragmentManager(android.view.View view, long j, C32332mYb c32332mYb) {
            this.AEQbTJ = view;
            this.OLrzqt = j;
            this.KWHzl = c32332mYb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.AEQbTJ) > this.OLrzqt || (this.AEQbTJ instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.AEQbTJ, jCurrentTimeMillis);
                android.content.Context context = this.KWHzl.getContext();
                if (context != null) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.deregisterUser));
                    viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35964oKf.Fragment.invokespecialhlXVux));
                    viewOnClickListenerC54939xaY.EZpvd(C35964oKf.Fragment.DcMfJKDDUqPf, new ActionBar(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.mYb$LoaderManager */
    public static final class LoaderManager implements View.OnClickListener {
        public final /* synthetic */ C32332mYb AEQbTJ;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager(android.view.View view, long j, C32332mYb c32332mYb) {
            this.copydefault = view;
            this.KWHzl = j;
            this.AEQbTJ = c32332mYb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.content.Context context = this.AEQbTJ.getContext();
                if (context != null) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.getUserContextRegisteredStatus));
                    viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35964oKf.Fragment.fupbxE));
                    viewOnClickListenerC54939xaY.EZpvd(C35964oKf.Fragment.DcMfJKDDUqPf, new PendingIntent(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    /* JADX INFO: renamed from: o.mYb$VoiceInteractor */
    public static final class VoiceInteractor implements View.OnClickListener {
        public final /* synthetic */ C32332mYb AEQbTJ;
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public VoiceInteractor(android.view.View view, long j, C32332mYb c32332mYb) {
            this.copydefault = view;
            this.EZpvd = j;
            this.AEQbTJ = c32332mYb;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                android.content.Context context = this.AEQbTJ.getContext();
                if (context != null) {
                    ViewOnClickListenerC54939xaY viewOnClickListenerC54939xaY = new ViewOnClickListenerC54939xaY(context);
                    viewOnClickListenerC54939xaY.setTitle(C33070mpX.AYXKKw(C35964oKf.Fragment.sCB));
                    viewOnClickListenerC54939xaY.EZpvd(C33070mpX.AYXKKw(C35964oKf.Fragment.hOMIpD));
                    viewOnClickListenerC54939xaY.EZpvd(C35964oKf.Fragment.DcMfJKDDUqPf, new Dialog(viewOnClickListenerC54939xaY));
                    viewOnClickListenerC54939xaY.setCanceledOnTouchOutside(true);
                    viewOnClickListenerC54939xaY.show();
                }
            }
        }
    }

    public final void OLrzqt(mXM mxm) {
        java.util.List<ChartDataUIItem> listOLrzqt;
        oNN onn = this.copydefault;
        if (onn != null) {
            mYA mya = onn.AEQbTJ;
            int i = Activity.copydefault[EZpvd().KWHzl().ordinal()];
            if (i == 1) {
                listOLrzqt = mxm.OLrzqt();
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                listOLrzqt = mxm.djBIcL();
            }
            mya.KWHzl(listOLrzqt, C34650ngB.EZpvd(mxm.copydefault()));
        }
    }

    public final void AEQbTJ(mXM mxm) {
        oNN onn = this.copydefault;
        if (onn != null) {
            onn.OLrzqt.copydefault(C34650ngB.EZpvd(mxm.gEmmrt()), C34650ngB.EZpvd(mxm.AhwBna()), C34650ngB.EZpvd(mxm.AYXKKw()));
        }
    }

    public final void copydefault(mXM mxm) {
        oNN onn = this.copydefault;
        if (onn != null) {
            onn.copydefault.OLrzqt(C34650ngB.EZpvd(mxm.EZpvd()), C34650ngB.EZpvd(mxm.valueOf()), C34650ngB.EZpvd(mxm.KWHzl()));
        }
    }

    public final void KWHzl(mXM mxm) {
        oNN onn = this.copydefault;
        if (onn != null) {
            onn.KWHzl.OLrzqt(C34650ngB.EZpvd(mxm.AEQbTJ()));
        }
    }

    public final void KWHzl() {
        oNN onn = this.copydefault;
        if (onn != null) {
            onn.AhwBna.setTitle(C33070mpX.AYXKKw(EZpvd().KWHzl().getResourceId()));
            mUO.setOnDoubleCheckClickListener$default(onn.AhwBna, 0L, new Function1() { // from class: o.mYc
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C32332mYb.OLrzqt(this.KWHzl, (android.view.View) obj);
                }
            }, 1, null);
        }
    }

    public static final Unit OLrzqt(final C32332mYb c32332mYb, final android.view.View view) {
        Intrinsics.checkNotNullParameter(view, "");
        boolean z = true;
        view.setSelected(true);
        HolderTimeframe[] holderTimeframeArrValues = HolderTimeframe.values();
        java.util.ArrayList arrayList = new java.util.ArrayList(holderTimeframeArrValues.length);
        int length = holderTimeframeArrValues.length;
        int i = 0;
        while (i < length) {
            HolderTimeframe holderTimeframe = holderTimeframeArrValues[i];
            arrayList.add(new C34640nfs(C33070mpX.AYXKKw(holderTimeframe.getResourceId()), null, null, null, c32332mYb.EZpvd().KWHzl() == holderTimeframe ? z : false, holderTimeframe, 14, null));
            i++;
            z = true;
        }
        C34642nfu.Companion.KWHzl(arrayList, c32332mYb.AEQbTJ().copydefault().getTokenSymbol(), new Function1() { // from class: o.mYg
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C32332mYb.copydefault(view, c32332mYb, (C34640nfs) obj);
            }
        }).show(c32332mYb.getChildFragmentManager(), "DexSelectionBottomSheet");
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(android.view.View view, C32332mYb c32332mYb, C34640nfs c34640nfs) {
        view.setSelected(false);
        java.lang.Object objGEmmrt = c34640nfs != null ? c34640nfs.gEmmrt() : null;
        HolderTimeframe holderTimeframe = objGEmmrt instanceof HolderTimeframe ? (HolderTimeframe) objGEmmrt : null;
        if (holderTimeframe != null) {
            c32332mYb.EZpvd().OLrzqt(holderTimeframe);
            c32332mYb.OLrzqt(holderTimeframe);
        }
        return Unit.INSTANCE;
    }

    public final void OLrzqt(HolderTimeframe holderTimeframe) {
        C55052xcf c55052xcf;
        java.lang.Object objAEQbTJ = AEQbTJ().KWHzl().getValue().AEQbTJ();
        mXM mxm = objAEQbTJ instanceof mXM ? (mXM) objAEQbTJ : null;
        if (mxm != null) {
            OLrzqt(mxm);
            oNN onn = this.copydefault;
            if (onn == null || (c55052xcf = onn.AhwBna) == null) {
                return;
            }
            c55052xcf.setTitle(C33070mpX.AYXKKw(EZpvd().KWHzl().getResourceId()));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.copydefault = null;
    }
}
