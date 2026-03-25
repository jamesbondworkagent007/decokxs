package o;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.market.features.meme.filter.domain.MemeFilterParams;
import com.okinc.business.market.features.meme.filter.ui.MemeFilterViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kft, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C28711kft extends AbstractC28708kfq {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int gEmmrt = 8;
    public C21569hEf AhwBna;
    public final InterfaceC56387yDm djBIcL;
    public final InterfaceC56387yDm valueOf;

    public C28711kft() {
        final Function0 function0 = new Function0() { // from class: o.kfp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28711kft.KWHzl(this.AEQbTJ);
            }
        };
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.meme.filter.blacklist.MemeBlacklistFragment$special$$inlined$viewModels$default$1
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
        this.djBIcL = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(MemeFilterViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.meme.filter.blacklist.MemeBlacklistFragment$special$$inlined$viewModels$default$2
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.meme.filter.blacklist.MemeBlacklistFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.meme.filter.blacklist.MemeBlacklistFragment$special$$inlined$viewModels$default$4
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.kfv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C28711kft.copydefault(this.OLrzqt);
            }
        });
    }

    /* JADX DEBUG: Possible override for method o.kfq.EZpvd()V */
    public final MemeFilterViewModel EZpvd() {
        return (MemeFilterViewModel) this.djBIcL.getValue();
    }

    public static final ViewModelStoreOwner KWHzl(C28711kft c28711kft) {
        androidx.fragment.app.Fragment fragmentRequireParentFragment = c28711kft.requireParentFragment();
        Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "");
        return fragmentRequireParentFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kMM valueOf() {
        return (kMM) this.valueOf.getValue();
    }

    public static final kMM copydefault(final C28711kft c28711kft) {
        kMM kmm = new kMM();
        kmm.register(C28714kfw.class, new C28709kfr(new Function1() { // from class: o.kfx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28711kft.OLrzqt(this.EZpvd, (C28714kfw) obj);
            }
        }, new Function1() { // from class: o.kfu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C28711kft.EZpvd(this.KWHzl, (java.lang.String) obj);
            }
        }));
        return kmm;
    }

    public static final Unit EZpvd(C28711kft c28711kft, java.lang.String str) {
        ConstraintLayout root;
        android.content.Context context;
        Intrinsics.checkNotNullParameter(str, "");
        C21569hEf c21569hEf = c28711kft.AhwBna;
        if (c21569hEf != null && (root = c21569hEf.getRoot()) != null && (context = root.getContext()) != null) {
            hSW.copyAddress$default(C23274hvD.Fragment.playFromMediaId, context, str, null, null, 24, null);
        }
        return Unit.INSTANCE;
    }

    public static final Unit OLrzqt(C28711kft c28711kft, C28714kfw c28714kfw) {
        ConstraintLayout root;
        android.content.Context context;
        Intrinsics.checkNotNullParameter(c28714kfw, "");
        C21569hEf c21569hEf = c28711kft.AhwBna;
        if (c21569hEf != null && (root = c21569hEf.getRoot()) != null && (context = root.getContext()) != null) {
            C28879kjB.copydefault(context, C33069mpW.copydefault(c28711kft, C23274hvD.Fragment.reportRunnablelambda2, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("token", c28714kfw.AEQbTJ()))));
            c28711kft.EZpvd().EZpvd(c28714kfw);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        C21569hEf c21569hEfOLrzqt = C21569hEf.OLrzqt(layoutInflater, viewGroup, false);
        this.AhwBna = c21569hEfOLrzqt;
        if (c21569hEfOLrzqt != null) {
            return c21569hEfOLrzqt.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C21569hEf c21569hEf = this.AhwBna;
        if (c21569hEf != null) {
            c21569hEf.OLrzqt.setAdapter(valueOf());
            C25390ivn.collectOnViewLifecycle$default(this, EZpvd().gEmmrt(), null, new ActionBar(c21569hEf, this), 2, null);
        }
    }

    /* JADX INFO: renamed from: o.kft$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        public final /* synthetic */ C28711kft EZpvd;
        public final /* synthetic */ C21569hEf OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar(C21569hEf c21569hEf, C28711kft c28711kft) {
            this.OLrzqt = c21569hEf;
            this.EZpvd = c28711kft;
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<C28714kfw> list, Continuation<? super Unit> continuation) {
            C55113xdn c55113xdn = this.OLrzqt.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            int i = 8;
            c55113xdn.setVisibility(list == null ? 0 : 8);
            C55173xeu c55173xeu = this.OLrzqt.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
            c55173xeu.setVisibility((list == null || !list.isEmpty()) ? 8 : 0);
            RecyclerView recyclerView = this.OLrzqt.OLrzqt;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            if (list != null && (!list.isEmpty())) {
                i = 0;
            }
            recyclerView.setVisibility(i);
            if (list != null) {
                kMM.setData$default(this.EZpvd.valueOf(), list, null, 2, null);
            }
            if (list != null) {
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this.EZpvd, true, (java.lang.String) null, 2, (java.lang.Object) null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.kft$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.kft.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C28711kft AEQbTJ(MemeFilterParams memeFilterParams) {
            C28711kft c28711kft = new C28711kft();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.meme_filter_params", memeFilterParams);
            c28711kft.setArguments(bundle);
            return c28711kft;
        }
    }
}
