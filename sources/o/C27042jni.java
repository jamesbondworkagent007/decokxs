package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.okinc.business.invest_biz.data.bean.InvestUniv3SubscribeInfo;
import com.okinc.business.invest_biz.ui.screens.univ3.InvestUniv3SubscribeViewModel;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.InvestUniv3ZapViewModel;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.ZapMode;
import com.okinc.business.invest_biz.ui.screens.univ3.zap.model.ZapPageData;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.AbstractC27023jnP;
import o.C25493ixk;
import o.C27189jqW;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jni, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27042jni extends AbstractC27044jnk {
    public static final ActionBar Companion = new ActionBar(null);
    public static final int djBIcL = 8;
    public InvestUniv3SubscribeInfo AYXKKw;
    public iHP AhwBna;
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.jnq
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C27042jni.AkhnZx(this.KWHzl);
        }
    });
    public TaskDescription DbNXlk;
    public final InterfaceC56387yDm fIwbmz;
    public final InterfaceC56387yDm fJNWhG;
    public C27189jqW fetchVPNInfo;
    public java.util.List<C27022jnO> gEmmrt;
    public final InterfaceC56387yDm isConnected;
    public InvestUniv3SubscribeInfo valueOf;
    public ViewPager2.OnPageChangeCallback values;

    /* JADX INFO: renamed from: o.jni$StateListAnimator */
    /* JADX INFO: loaded from: classes23.dex */
    public final /* synthetic */ class StateListAnimator {
        public static final /* synthetic */ int[] KWHzl;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[ZapMode.values().length];
            try {
                iArr[ZapMode.SINGLE_CRYPTO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[ZapMode.DUAL_CRYPTO.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            KWHzl = iArr;
        }
    }

    /* JADX INFO: renamed from: o.jni$TaskDescription */
    /* JADX INFO: loaded from: classes6.dex */
    public interface TaskDescription {
        void KWHzl(int i, @NotNull ZapMode zapMode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void EZpvd(TaskDescription taskDescription) {
        this.DbNXlk = taskDescription;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C25493ixk.Activity.QVAiDq;
    }

    /* JADX INFO: renamed from: o.jni$ActionBar */
    /* JADX INFO: loaded from: classes23.dex */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jni.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }

        public final C27042jni copydefault(@NotNull ZapPageData zapPageData) {
            Intrinsics.checkNotNullParameter(zapPageData, "");
            C27042jni c27042jni = new C27042jni();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.args", zapPageData);
            c27042jni.setArguments(bundle);
            return c27042jni;
        }
    }

    public C27042jni() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.zap.InvestUniv3ZapFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.zap.InvestUniv3ZapFragment$special$$inlined$viewModels$default$2
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
        this.fIwbmz = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(InvestUniv3ZapViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.zap.InvestUniv3ZapFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.zap.InvestUniv3ZapFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.zap.InvestUniv3ZapFragment$special$$inlined$viewModels$default$5
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
        this.fJNWhG = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(InvestUniv3SubscribeViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.zap.InvestUniv3ZapFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.zap.InvestUniv3ZapFragment$special$$inlined$activityViewModels$default$2
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
                CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "");
                return defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.univ3.zap.InvestUniv3ZapFragment$special$$inlined$activityViewModels$default$3
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
        this.isConnected = C56392yDr.copydefault(new Function0() { // from class: o.jnn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27042jni.djBIcL(this.copydefault);
            }
        });
        this.gEmmrt = yDY.AhwBna();
    }

    public final ZapPageData gEmmrt() {
        return (ZapPageData) this.AkhnZx.getValue();
    }

    public static final ZapPageData AkhnZx(C27042jni c27042jni) {
        ZapPageData zapPageData;
        android.os.Bundle arguments = c27042jni.getArguments();
        if (arguments == null || (zapPageData = (ZapPageData) arguments.getParcelable("key.args")) == null) {
            throw new java.lang.IllegalStateException("Must provide params");
        }
        return zapPageData;
    }

    public final InvestUniv3ZapViewModel valueOf() {
        return (InvestUniv3ZapViewModel) this.fIwbmz.getValue();
    }

    public final InvestUniv3SubscribeViewModel AhwBna() {
        return (InvestUniv3SubscribeViewModel) this.fJNWhG.getValue();
    }

    public static final C27020jnM djBIcL(C27042jni c27042jni) {
        FragmentActivity fragmentActivityRequireActivity = c27042jni.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "");
        return new C27020jnM(fragmentActivityRequireActivity);
    }

    /* JADX DEBUG: Possible override for method o.jnk.EZpvd()V */
    public final C27020jnM EZpvd() {
        return (C27020jnM) this.isConnected.getValue();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        iHP ihpAEQbTJ = iHP.AEQbTJ(view);
        this.AhwBna = ihpAEQbTJ;
        iHP ihp = null;
        if (ihpAEQbTJ == null) {
            Intrinsics.gEmmrt("");
            ihpAEQbTJ = null;
        }
        C55113xdn c55113xdn = ihpAEQbTJ.copydefault;
        iHP ihp2 = this.AhwBna;
        if (ihp2 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ihp = ihp2;
        }
        android.content.Context context = ihp.copydefault.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "");
        c55113xdn.setAnimationFromUrl(C7827arF.EZpvd("lottie/web3_defi/defi_v3_zap.lottie", context, true));
        values();
        djBIcL();
        fetchVPNInfo();
        valueOf().OLrzqt(gEmmrt());
        valueOf().KWHzl();
    }

    public final void djBIcL() {
        iHP ihp = this.AhwBna;
        iHP ihp2 = null;
        if (ihp == null) {
            Intrinsics.gEmmrt("");
            ihp = null;
        }
        ihp.AEQbTJ.setEmptyTypeImage(9);
        iHP ihp3 = this.AhwBna;
        if (ihp3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ihp2 = ihp3;
        }
        C55173xeu c55173xeu = ihp2.AEQbTJ;
        c55173xeu.setOnClickListener(new Activity(c55173xeu, 1000L, this));
    }

    private final void values() {
        if (getView() != null) {
            iHP ihp = this.AhwBna;
            iHP ihp2 = null;
            if (ihp == null) {
                Intrinsics.gEmmrt("");
                ihp = null;
            }
            ihp.copydefault.setVisibility(8);
            iHP ihp3 = this.AhwBna;
            if (ihp3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ihp2 = ihp3;
            }
            ihp2.copydefault.copydefault();
        }
    }

    public final void AYXKKw() {
        if (getView() == null) {
            return;
        }
        iHP ihp = this.AhwBna;
        iHP ihp2 = null;
        if (ihp == null) {
            Intrinsics.gEmmrt("");
            ihp = null;
        }
        ihp.copydefault.setBackgroundColor(ContextCompat.getColor(requireContext(), C52761wXj.Activity.RSmiaq));
        iHP ihp3 = this.AhwBna;
        if (ihp3 == null) {
            Intrinsics.gEmmrt("");
            ihp3 = null;
        }
        ihp3.copydefault.setElevation(8.0f);
        iHP ihp4 = this.AhwBna;
        if (ihp4 == null) {
            Intrinsics.gEmmrt("");
            ihp4 = null;
        }
        ihp4.copydefault.setVisibility(0);
        iHP ihp5 = this.AhwBna;
        if (ihp5 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ihp2 = ihp5;
        }
        ihp2.copydefault.KWHzl(0L);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.jni */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void hideSwitchLoading$default(C27042jni c27042jni, Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        c27042jni.KWHzl((Function0<Unit>) function0);
    }

    public final void KWHzl(Function0<Unit> function0) {
        if (getView() == null) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        iHP ihp = this.AhwBna;
        iHP ihp2 = null;
        if (ihp == null) {
            Intrinsics.gEmmrt("");
            ihp = null;
        }
        ihp.copydefault.copydefault();
        iHP ihp3 = this.AhwBna;
        if (ihp3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ihp2 = ihp3;
        }
        ihp2.copydefault.setVisibility(8);
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: renamed from: o.jni$Application */
    public static final class Application<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(AbstractC27023jnP abstractC27023jnP, Continuation<? super Unit> continuation) {
            C27042jni.this.OLrzqt(abstractC27023jnP);
            return Unit.INSTANCE;
        }
    }

    private final void fetchVPNInfo() {
        C27589jxz.EZpvd(this, valueOf().AEQbTJ(), Lifecycle.State.CREATED, new Application());
    }

    public final void OLrzqt(final AbstractC27023jnP abstractC27023jnP) {
        iHP ihp = null;
        if (abstractC27023jnP instanceof AbstractC27023jnP.StateListAnimator) {
            iHP ihp2 = this.AhwBna;
            if (ihp2 == null) {
                Intrinsics.gEmmrt("");
                ihp2 = null;
            }
            ihp2.AEQbTJ.setVisibility(8);
            iHP ihp3 = this.AhwBna;
            if (ihp3 == null) {
                Intrinsics.gEmmrt("");
                ihp3 = null;
            }
            ihp3.OLrzqt.setVisibility(8);
            iHP ihp4 = this.AhwBna;
            if (ihp4 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ihp = ihp4;
            }
            ihp.KWHzl.setVisibility(8);
            AYXKKw();
            return;
        }
        if (abstractC27023jnP instanceof AbstractC27023jnP.TaskDescription) {
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
            iHP ihp5 = this.AhwBna;
            if (ihp5 == null) {
                Intrinsics.gEmmrt("");
                ihp5 = null;
            }
            ihp5.AEQbTJ.setVisibility(8);
            iHP ihp6 = this.AhwBna;
            if (ihp6 == null) {
                Intrinsics.gEmmrt("");
                ihp6 = null;
            }
            ihp6.OLrzqt.setVisibility(8);
            iHP ihp7 = this.AhwBna;
            if (ihp7 == null) {
                Intrinsics.gEmmrt("");
                ihp7 = null;
            }
            ihp7.KWHzl.setVisibility(8);
            iHP ihp8 = this.AhwBna;
            if (ihp8 == null) {
                Intrinsics.gEmmrt("");
            } else {
                ihp = ihp8;
            }
            ihp.copydefault.post(new java.lang.Runnable() { // from class: o.jnr
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // java.lang.Runnable
                public final void run() {
                    C27042jni.EZpvd(this.copydefault, abstractC27023jnP);
                }
            });
            return;
        }
        if (!(abstractC27023jnP instanceof AbstractC27023jnP.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
        KWHzl(new Function0() { // from class: o.jnp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27042jni.AYXKKw(this.EZpvd);
            }
        });
    }

    public static final void EZpvd(final C27042jni c27042jni, AbstractC27023jnP abstractC27023jnP) {
        iHP ihp = c27042jni.AhwBna;
        iHP ihp2 = null;
        if (ihp == null) {
            Intrinsics.gEmmrt("");
            ihp = null;
        }
        int width = ihp.copydefault.getWidth();
        iHP ihp3 = c27042jni.AhwBna;
        if (ihp3 == null) {
            Intrinsics.gEmmrt("");
            ihp3 = null;
        }
        int height = ihp3.copydefault.getHeight();
        if (width > 0 && height > 0) {
            ConstraintSet constraintSet = new ConstraintSet();
            iHP ihp4 = c27042jni.AhwBna;
            if (ihp4 == null) {
                Intrinsics.gEmmrt("");
                ihp4 = null;
            }
            ConstraintLayout root = ihp4.getRoot();
            Intrinsics.copydefault(root, "");
            constraintSet.clone(root);
            constraintSet.constrainWidth(C25493ixk.ActionBar.getQueueTitle, width);
            constraintSet.constrainHeight(C25493ixk.ActionBar.getQueueTitle, height);
            iHP ihp5 = c27042jni.AhwBna;
            if (ihp5 == null) {
                Intrinsics.gEmmrt("");
                ihp5 = null;
            }
            ConstraintLayout root2 = ihp5.getRoot();
            Intrinsics.copydefault(root2, "");
            constraintSet.applyTo(root2);
        }
        iHP ihp6 = c27042jni.AhwBna;
        if (ihp6 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ihp2 = ihp6;
        }
        c27042jni.AEQbTJ(ihp2, (AbstractC27023jnP.TaskDescription) abstractC27023jnP);
        c27042jni.KWHzl(new Function0() { // from class: o.jno
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27042jni.AhwBna(this.OLrzqt);
            }
        });
    }

    public static final Unit AhwBna(C27042jni c27042jni) {
        iHP ihp = c27042jni.AhwBna;
        iHP ihp2 = null;
        if (ihp == null) {
            Intrinsics.gEmmrt("");
            ihp = null;
        }
        ihp.OLrzqt.setVisibility(0);
        iHP ihp3 = c27042jni.AhwBna;
        if (ihp3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ihp2 = ihp3;
        }
        ihp2.KWHzl.setVisibility(0);
        return Unit.INSTANCE;
    }

    public static final Unit AYXKKw(C27042jni c27042jni) {
        iHP ihp = c27042jni.AhwBna;
        iHP ihp2 = null;
        if (ihp == null) {
            Intrinsics.gEmmrt("");
            ihp = null;
        }
        ihp.AEQbTJ.setVisibility(0);
        iHP ihp3 = c27042jni.AhwBna;
        if (ihp3 == null) {
            Intrinsics.gEmmrt("");
            ihp3 = null;
        }
        ihp3.OLrzqt.setVisibility(8);
        iHP ihp4 = c27042jni.AhwBna;
        if (ihp4 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ihp2 = ihp4;
        }
        ihp2.KWHzl.setVisibility(8);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.jni$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C27042jni AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C27042jni c27042jni) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c27042jni;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.valueOf().KWHzl();
            }
        }
    }

    public final boolean AEQbTJ(iHP ihp, AbstractC27023jnP.TaskDescription taskDescription) {
        final java.util.List<C27022jnO> listAEQbTJ = taskDescription.AEQbTJ();
        if (listAEQbTJ.isEmpty() || taskDescription.copydefault() == null || taskDescription.EZpvd() == null) {
            return false;
        }
        this.gEmmrt = listAEQbTJ;
        this.AYXKKw = taskDescription.copydefault();
        this.valueOf = taskDescription.EZpvd();
        if (ihp.KWHzl.getAdapter() == null) {
            ihp.KWHzl.setAdapter(EZpvd());
            C27569jxf c27569jxf = C27569jxf.OLrzqt;
            ViewPager2 viewPager2 = ihp.KWHzl;
            Intrinsics.checkNotNullExpressionValue(viewPager2, "");
            c27569jxf.EZpvd(viewPager2);
            Fragment fragment = new Fragment();
            this.values = fragment;
            ViewPager2 viewPager22 = ihp.KWHzl;
            Intrinsics.copydefault(fragment);
            viewPager22.registerOnPageChangeCallback(fragment);
        }
        EZpvd().copydefault(listAEQbTJ, taskDescription.copydefault(), taskDescription.EZpvd());
        C55254xgV c55254xgV = ihp.OLrzqt;
        ihp.KWHzl.setOffscreenPageLimit(listAEQbTJ.size());
        C27189jqW c27189jqW = this.fetchVPNInfo;
        if (c27189jqW != null) {
            c27189jqW.copydefault();
        }
        TabLayout tabLayoutCopydefault = c55254xgV.copydefault();
        ViewPager2 viewPager23 = ihp.KWHzl;
        android.os.Bundle arguments = getArguments();
        java.lang.String string = arguments != null ? arguments.getString("searchKey") : null;
        C27189jqW c27189jqW2 = new C27189jqW(tabLayoutCopydefault, viewPager23, false, string == null || string.length() == 0, new C27189jqW.Activity() { // from class: o.jnl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // o.C27189jqW.Activity
            public final void KWHzl(TabLayout.Tab tab, int i) {
                C27042jni.OLrzqt(listAEQbTJ, tab, i);
            }
        });
        this.fetchVPNInfo = c27189jqW2;
        c27189jqW2.KWHzl();
        c55254xgV.copydefault().selectTab(c55254xgV.copydefault(0));
        ihp.KWHzl.setCurrentItem(0);
        copydefault(0);
        return true;
    }

    /* JADX INFO: renamed from: o.jni$Fragment */
    public static final class Fragment extends ViewPager2.OnPageChangeCallback {
        public Fragment() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i) {
            super.onPageSelected(i);
            C27042jni.this.copydefault(i);
            if (i < 0 || i >= C27042jni.this.gEmmrt.size()) {
                return;
            }
            ZapMode zapModeCopydefault = ((C27022jnO) C27042jni.this.gEmmrt.get(i)).copydefault();
            TaskDescription taskDescription = C27042jni.this.DbNXlk;
            if (taskDescription != null) {
                taskDescription.KWHzl(i, zapModeCopydefault);
            }
        }
    }

    public static final void OLrzqt(java.util.List list, TabLayout.Tab tab, int i) {
        Intrinsics.checkNotNullParameter(tab, "");
        if (list.size() <= i) {
            return;
        }
        C27022jnO c27022jnO = (C27022jnO) list.get(i);
        tab.setText(c27022jnO.KWHzl());
        tab.setId(C33129mqd.AhwBna(java.lang.Integer.valueOf(c27022jnO.EZpvd())));
    }

    public final void copydefault(int i) {
        InvestUniv3SubscribeInfo investUniv3SubscribeInfo;
        if (i < 0 || i >= this.gEmmrt.size()) {
            return;
        }
        int i2 = StateListAnimator.KWHzl[this.gEmmrt.get(i).copydefault().ordinal()];
        if (i2 == 1) {
            AhwBna().OLrzqt(true);
            investUniv3SubscribeInfo = this.AYXKKw;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            AhwBna().OLrzqt(false);
            investUniv3SubscribeInfo = this.valueOf;
        }
        AhwBna().KWHzl(investUniv3SubscribeInfo);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        ViewPager2.OnPageChangeCallback onPageChangeCallback = this.values;
        iHP ihp = null;
        if (onPageChangeCallback != null) {
            iHP ihp2 = this.AhwBna;
            if (ihp2 == null) {
                Intrinsics.gEmmrt("");
                ihp2 = null;
            }
            ihp2.KWHzl.unregisterOnPageChangeCallback(onPageChangeCallback);
        }
        this.values = null;
        iHP ihp3 = this.AhwBna;
        if (ihp3 == null) {
            Intrinsics.gEmmrt("");
        } else {
            ihp = ihp3;
        }
        ihp.copydefault.copydefault();
        C27189jqW c27189jqW = this.fetchVPNInfo;
        if (c27189jqW != null) {
            c27189jqW.copydefault();
        }
        super.onDestroyView();
    }
}
