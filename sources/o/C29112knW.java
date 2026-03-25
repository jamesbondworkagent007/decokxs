package o;

import android.content.DialogInterface;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.os.BundleCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.okinc.business.dex.api.bean.TokenBase;
import com.okinc.business.market.common.marketconfig.domain.MarketConfig;
import com.okinc.business.market.features.position.ui.PositionDetailsParam;
import com.okinc.business.market.features.position.ui.PositionsViewModel;
import com.okinc.business.market.features.position.ui.widget.PnLDetailsUiModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import o.C23274hvD;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.knW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C29112knW extends AbstractC29097knH {
    public final InterfaceC56387yDm AhwBna = C56392yDr.copydefault(new Function0() { // from class: o.knS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C29112knW.valueOf(this.copydefault);
        }
    });
    public final InterfaceC56387yDm DbNXlk;
    public hED djBIcL;
    public Function0<Unit> gEmmrt;
    public C28439kam valueOf;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AYXKKw = 8;

    public C29112knW() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.market.features.position.ui.PositionsFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.market.features.position.ui.PositionsFragment$special$$inlined$viewModels$default$2
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
        this.DbNXlk = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(PositionsViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.market.features.position.ui.PositionsFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.market.features.position.ui.PositionsFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.market.features.position.ui.PositionsFragment$special$$inlined$viewModels$default$5
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

    /* JADX INFO: renamed from: o.knW$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.knW.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.knW$StateListAnimator */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ C29112knW newInstance$default(StateListAnimator stateListAnimator, PositionDetailsParam positionDetailsParam, MarketConfig marketConfig, Function0 function0, int i, java.lang.Object obj) {
            if ((i & 4) != 0) {
                function0 = null;
            }
            return stateListAnimator.OLrzqt(positionDetailsParam, marketConfig, function0);
        }

        public final C29112knW OLrzqt(PositionDetailsParam positionDetailsParam, @NotNull MarketConfig marketConfig, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(marketConfig, "");
            C29112knW c29112knW = new C29112knW();
            android.os.Bundle bundle = new android.os.Bundle();
            C31200lpY.EZpvd(bundle, positionDetailsParam != null ? positionDetailsParam.getSource() : null);
            bundle.putParcelable("key.position_details", positionDetailsParam);
            bundle.putParcelable("market_config", marketConfig);
            c29112knW.setArguments(bundle);
            c29112knW.gEmmrt = function0;
            return c29112knW;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PositionDetailsParam valueOf() {
        return (PositionDetailsParam) this.AhwBna.getValue();
    }

    public static final PositionDetailsParam valueOf(C29112knW c29112knW) {
        android.os.Bundle arguments = c29112knW.getArguments();
        if (arguments != null) {
            return (PositionDetailsParam) ((android.os.Parcelable) BundleCompat.getParcelable(arguments, "key.position_details", PositionDetailsParam.class));
        }
        return null;
    }

    private final PositionsViewModel djBIcL() {
        return (PositionsViewModel) this.DbNXlk.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        hED hedKWHzl = hED.KWHzl(layoutInflater, viewGroup, false);
        this.djBIcL = hedKWHzl;
        if (hedKWHzl != null) {
            return hedKWHzl.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        gEmmrt();
        AYXKKw();
        PositionsViewModel.loadData$default(djBIcL(), 0L, 1, null);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public android.app.Dialog onCreateDialog(android.os.Bundle bundle) {
        android.app.Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        Intrinsics.copydefault(dialogOnCreateDialog, "");
        final BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) dialogOnCreateDialog;
        android.view.Window window = bottomSheetDialog.getWindow();
        if (window != null) {
            window.setDimAmount(0.0f);
        }
        bottomSheetDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o.knZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(android.content.DialogInterface dialogInterface) {
                C29112knW.EZpvd(bottomSheetDialog, this, dialogInterface);
            }
        });
        return bottomSheetDialog;
    }

    public static final void EZpvd(BottomSheetDialog bottomSheetDialog, final C29112knW c29112knW, android.content.DialogInterface dialogInterface) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) bottomSheetDialog.findViewById(com.google.android.material.R.id.design_bottom_sheet);
        if (frameLayout == null) {
            return;
        }
        BottomSheetBehavior bottomSheetBehaviorFrom = BottomSheetBehavior.from(frameLayout);
        Intrinsics.checkNotNullExpressionValue(bottomSheetBehaviorFrom, "");
        frameLayout.setBackgroundResource(android.R.color.transparent);
        frameLayout.getLayoutParams().height = -1;
        bottomSheetBehaviorFrom.setState(3);
        bottomSheetBehaviorFrom.setSkipCollapsed(true);
        ViewCompat.setOnApplyWindowInsetsListener(frameLayout, new androidx.core.view.OnApplyWindowInsetsListener() { // from class: o.knV
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public final WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
                return C29112knW.KWHzl(this.copydefault, view, windowInsetsCompat);
            }
        });
        frameLayout.requestApplyInsets();
    }

    public static final WindowInsetsCompat KWHzl(C29112knW c29112knW, android.view.View view, WindowInsetsCompat windowInsetsCompat) {
        ConstraintLayout root;
        Intrinsics.checkNotNullParameter(view, "");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "");
        Insets insets = windowInsetsCompat.getInsets(WindowInsetsCompat.Type.navigationBars());
        Intrinsics.checkNotNullExpressionValue(insets, "");
        hED hed = c29112knW.djBIcL;
        if (hed != null && (root = hed.getRoot()) != null) {
            root.setPadding(root.getPaddingLeft(), root.getPaddingTop(), root.getPaddingRight(), insets.bottom);
        }
        return windowInsetsCompat;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.djBIcL = null;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        djBIcL().fARcdN();
        Function0<Unit> function0 = this.gEmmrt;
        if (function0 != null) {
            function0.invoke();
        }
        this.gEmmrt = null;
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        djBIcL().DbNXlk();
    }

    /* JADX INFO: renamed from: o.knW$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29109knT c29109knT, Continuation<? super Unit> continuation) {
            C29112knW.this.EZpvd(c29109knT);
            return Unit.INSTANCE;
        }
    }

    public final void gEmmrt() {
        C25390ivn.collectOnViewLifecycle$default(this, djBIcL().AkhnZx(), null, new ActionBar(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, djBIcL().OLrzqt(), null, new TaskDescription(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, djBIcL().isConnected(), null, new Activity(), 2, null);
        C25390ivn.collectOnViewLifecycle$default(this, djBIcL().djBIcL(), null, new LoaderManager(), 2, null);
    }

    /* JADX INFO: renamed from: o.knW$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29092knC c29092knC, Continuation<? super Unit> continuation) {
            C29112knW.this.copydefault(c29092knC);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.knW$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* synthetic */ java.lang.Object emit(java.lang.Object obj, Continuation continuation) {
            return OLrzqt(((java.lang.Boolean) obj).booleanValue(), continuation);
        }

        public final java.lang.Object OLrzqt(boolean z, Continuation<? super Unit> continuation) {
            C28439kam c28439kam = C29112knW.this.valueOf;
            if (c28439kam != null) {
                c28439kam.copydefault(z);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.knW$LoaderManager */
    public static final class LoaderManager<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public LoaderManager() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C29095knF c29095knF, Continuation<? super Unit> continuation) {
            android.widget.ImageView imageView;
            android.widget.ImageView imageView2;
            PnLDetailsUiModel pnLDetailsUiModelAEQbTJ = c29095knF.AEQbTJ();
            if (pnLDetailsUiModelAEQbTJ == null || !pnLDetailsUiModelAEQbTJ.AYXKKw()) {
                hED hed = C29112knW.this.djBIcL;
                if (hed != null && (imageView = hed.AEQbTJ) != null) {
                    imageView.setVisibility(8);
                }
            } else {
                hED hed2 = C29112knW.this.djBIcL;
                if (hed2 != null && (imageView2 = hed2.AEQbTJ) != null) {
                    imageView2.setVisibility(0);
                }
                C29112knW.this.EZpvd();
            }
            return Unit.INSTANCE;
        }
    }

    private final void AYXKKw() {
        hED hed = this.djBIcL;
        if (hed != null) {
            hed.KWHzl.setRetryClickListener(new View.OnClickListener() { // from class: o.knY
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    C29112knW.AEQbTJ(this.KWHzl, view);
                }
            });
            android.widget.ImageView imageView = hed.copydefault;
            imageView.setOnClickListener(new Fragment(imageView, 1000L, this));
            android.widget.ImageView imageView2 = hed.OLrzqt;
            imageView2.setOnClickListener(new Dialog(imageView2, 1000L, this));
        }
        AhwBna();
    }

    public static final void AEQbTJ(C29112knW c29112knW, android.view.View view) {
        PositionsViewModel.loadData$default(c29112knW.djBIcL(), 0L, 1, null);
    }

    private final void AhwBna() {
        hED hed = this.djBIcL;
        if (hed != null) {
            C29101knL c29101knLCopydefault = C29101knL.Companion.copydefault(valueOf());
            Function1 function1 = new Function1() { // from class: o.kob
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C29112knW.copydefault(this.EZpvd, (TokenBase) obj);
                }
            };
            boolean zBooleanValue = djBIcL().isConnected().getValue().booleanValue();
            androidx.fragment.app.FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
            C28439kam c28439kam = new C28439kam(function1, zBooleanValue, childFragmentManager, c29101knLCopydefault, "tag.position_header_fragment");
            this.valueOf = c28439kam;
            RecyclerView recyclerView = hed.gEmmrt;
            recyclerView.setAdapter(c28439kam);
            recyclerView.setItemAnimator(null);
        }
    }

    public static final Unit copydefault(C29112knW c29112knW, TokenBase tokenBase) {
        Intrinsics.checkNotNullParameter(tokenBase, "");
        c29112knW.EZpvd(tokenBase);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: o.knW$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ C29112knW EZpvd;
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ android.view.View OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C29112knW c29112knW) {
            this.OLrzqt = view;
            this.KWHzl = j;
            this.EZpvd = c29112knW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.OLrzqt) > this.KWHzl || (this.OLrzqt instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.OLrzqt, jCurrentTimeMillis);
                C29112knW c29112knW = this.EZpvd;
                PositionDetailsParam positionDetailsParamValueOf = c29112knW.valueOf();
                java.lang.String chainId = positionDetailsParamValueOf != null ? positionDetailsParamValueOf.getChainId() : null;
                if (chainId == null) {
                    chainId = "";
                }
                PositionDetailsParam positionDetailsParamValueOf2 = this.EZpvd.valueOf();
                java.lang.String tokenAddress = positionDetailsParamValueOf2 != null ? positionDetailsParamValueOf2.getTokenAddress() : null;
                C25392ivp.copydefault(c29112knW, chainId, tokenAddress != null ? tokenAddress : "");
            }
        }
    }

    /* JADX INFO: renamed from: o.knW$Dialog */
    public static final class Dialog implements View.OnClickListener {
        public final /* synthetic */ android.view.View EZpvd;
        public final /* synthetic */ C29112knW KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Dialog(android.view.View view, long j, C29112knW c29112knW) {
            this.EZpvd = view;
            this.OLrzqt = j;
            this.KWHzl = c29112knW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.EZpvd) > this.OLrzqt || (this.EZpvd instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.EZpvd, jCurrentTimeMillis);
                C29188kot c29188kotCopydefault = C29188kot.Companion.copydefault(this.KWHzl.valueOf());
                androidx.fragment.app.FragmentManager childFragmentManager = this.KWHzl.getChildFragmentManager();
                Intrinsics.checkNotNullExpressionValue(childFragmentManager, "");
                c29188kotCopydefault.show(childFragmentManager);
            }
        }
    }

    /* JADX INFO: renamed from: o.knW$Fragment */
    public static final class Fragment implements View.OnClickListener {
        public final /* synthetic */ C29112knW AEQbTJ;
        public final /* synthetic */ long OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Fragment(android.view.View view, long j, C29112knW c29112knW) {
            this.copydefault = view;
            this.OLrzqt = j;
            this.AEQbTJ = c29112knW;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.OLrzqt || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }

    public final void EZpvd(C29109knT c29109knT) {
        C55173xeu c55173xeu;
        hED hed = this.djBIcL;
        if (hed != null) {
            C55113xdn c55113xdn = hed.EZpvd;
            Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
            int i = 8;
            c55113xdn.setVisibility(c29109knT.KWHzl() ? 0 : 8);
            C55173xeu c55173xeu2 = hed.KWHzl;
            Intrinsics.checkNotNullExpressionValue(c55173xeu2, "");
            c55173xeu2.setVisibility(c29109knT.AEQbTJ() != null ? 0 : 8);
            RecyclerView recyclerView = hed.gEmmrt;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "");
            if (c29109knT.AEQbTJ() == null && !c29109knT.KWHzl()) {
                i = 0;
            }
            recyclerView.setVisibility(i);
            if (c29109knT.AEQbTJ() != null) {
                values();
                hED hed2 = this.djBIcL;
                if (hed2 != null && (c55173xeu = hed2.KWHzl) != null) {
                    c55173xeu.OLrzqt().setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.fdOvFl));
                    c55173xeu.EZpvd().setTextColor(C25382ivf.KWHzl(C52761wXj.Activity.Dmq));
                }
                rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, false, (java.lang.String) null, 2, (java.lang.Object) null);
                return;
            }
            if (c29109knT.KWHzl()) {
                return;
            }
            rVN.reportFullyDrawn$default((androidx.fragment.app.Fragment) this, true, (java.lang.String) null, 2, (java.lang.Object) null);
        }
    }

    public final void copydefault(final C29092knC c29092knC) {
        C28439kam c28439kam;
        if (c29092knC.KWHzl() || c29092knC.AEQbTJ() != null || c29092knC.OLrzqt() == null || (c28439kam = this.valueOf) == null) {
            return;
        }
        kLH.updateList$default(c28439kam, c29092knC.OLrzqt(), false, new Function0() { // from class: o.koa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C29112knW.KWHzl(this.AEQbTJ, c29092knC);
            }
        }, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Unit KWHzl(C29112knW c29112knW, C29092knC c29092knC) {
        boolean z;
        C28443kaq value;
        C28439kam c28439kam = c29112knW.valueOf;
        if (c28439kam != null) {
            if (!c29092knC.OLrzqt().isEmpty() || (value = c29112knW.djBIcL().KWHzl().getValue()) == null) {
                z = false;
                c28439kam.EZpvd(z);
            } else {
                z = true;
                if (!value.KWHzl()) {
                }
                c28439kam.EZpvd(z);
            }
        }
        return Unit.INSTANCE;
    }

    private final void values() {
        C55173xeu c55173xeu;
        hED hed = this.djBIcL;
        if (hed == null || (c55173xeu = hed.KWHzl) == null) {
            return;
        }
        c55173xeu.setVisibility(0);
        c55173xeu.setEmptyTypeImage(8);
        c55173xeu.setTitle(C33070mpX.AYXKKw(C23274hvD.Fragment.ActivityResultKt));
        c55173xeu.setSubTitle((java.lang.CharSequence) C33070mpX.AYXKKw(C23274hvD.Fragment.UscePu));
        c55173xeu.setRetry(C33070mpX.AYXKKw(C23274hvD.Fragment.EZpvd));
        c55173xeu.setRetryClickListener(new View.OnClickListener() { // from class: o.knU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C29112knW.KWHzl(this.KWHzl, view);
            }
        });
    }

    public static final void KWHzl(C29112knW c29112knW, android.view.View view) {
        PositionsViewModel.loadData$default(c29112knW.djBIcL(), 0L, 1, null);
    }

    public final void EZpvd() {
        hED hed = this.djBIcL;
        if (hed != null) {
            hed.AEQbTJ.setVisibility(0);
            android.widget.ImageView imageView = hed.AEQbTJ;
            imageView.setOnClickListener(new Application(imageView, 1000L, this));
        }
    }

    private final void EZpvd(TokenBase tokenBase) {
        java.lang.String lowerCase;
        java.lang.String tokenAddress;
        PositionDetailsParam positionDetailsParamValueOf = valueOf();
        if (positionDetailsParamValueOf == null || (tokenAddress = positionDetailsParamValueOf.getTokenAddress()) == null) {
            lowerCase = null;
        } else {
            lowerCase = tokenAddress.toLowerCase(java.util.Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        }
        java.lang.String lowerCase2 = tokenBase.getTokenContractAddress().toLowerCase(java.util.Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        if (Intrinsics.EZpvd((java.lang.Object) lowerCase, (java.lang.Object) lowerCase2)) {
            PositionDetailsParam positionDetailsParamValueOf2 = valueOf();
            if (Intrinsics.EZpvd((java.lang.Object) (positionDetailsParamValueOf2 != null ? positionDetailsParamValueOf2.getChainId() : null), (java.lang.Object) tokenBase.getChainId())) {
                return;
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C25352ivB.openMarketDetailPage$default(activity, "view_details", tokenBase, "token_detail_myposition", null, new int[0], 8, null);
        }
    }
}
