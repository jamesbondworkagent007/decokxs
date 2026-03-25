package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResultCaller;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.data.models.InvestTokenWithAmount;
import com.okinc.business.invest_biz.ui.screens.token_selection.InvestTokenSelectionBottomSheet$onViewCreated$1$2$1;
import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionAction;
import com.okinc.business.invest_biz.ui.screens.token_selection.model.TokenSelectionParams;
import com.okinc.business.invest_biz.ui.screens.token_selection.view_model.InvestTokenSelectionViewModel;
import com.okinc.business.invest_biz.ui.screens.token_selection.view_model.RedeemTokenSelectionViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jfR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C26601jfR extends AbstractC26598jfO {
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int gEmmrt = 8;
    public iKD AYXKKw;
    public final InterfaceC56387yDm AkhnZx = C56392yDr.copydefault(new Function0() { // from class: o.jfS
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C26601jfR.valueOf(this.KWHzl);
        }
    });
    public final InterfaceC56387yDm djBIcL = C56392yDr.copydefault(new Function0() { // from class: o.jfV
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return C26601jfR.djBIcL(this.AEQbTJ);
        }
    });
    public final MutableSharedFlow<java.lang.String> AhwBna = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    public final float valueOf = 1.0f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.valueOf;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return true;
    }

    public final TokenSelectionParams valueOf() {
        android.os.Bundle arguments = getArguments();
        TokenSelectionParams tokenSelectionParams = arguments != null ? (TokenSelectionParams) arguments.getParcelable("key.params") : null;
        TokenSelectionParams tokenSelectionParams2 = tokenSelectionParams instanceof TokenSelectionParams ? tokenSelectionParams : null;
        if (tokenSelectionParams2 != null) {
            return tokenSelectionParams2;
        }
        throw new java.lang.IllegalStateException("Must provide params");
    }

    public final iKD djBIcL() {
        iKD ikd = this.AYXKKw;
        Intrinsics.copydefault(ikd);
        return ikd;
    }

    public final InterfaceC26664jgb gEmmrt() {
        return (InterfaceC26664jgb) this.AkhnZx.getValue();
    }

    public static final InterfaceC26664jgb valueOf(final C26601jfR c26601jfR) {
        InterfaceC56387yDm interfaceC56387yDmCreateViewModelLazy;
        final Function0 function0 = null;
        if (c26601jfR.valueOf().AEQbTJ() == TokenSelectionAction.Invest) {
            final Function0<androidx.fragment.app.Fragment> function02 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.token_selection.InvestTokenSelectionBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Fragment invoke() {
                    return c26601jfR;
                }
            };
            final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.token_selection.InvestTokenSelectionBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ViewModelStoreOwner invoke() {
                    return (ViewModelStoreOwner) function02.invoke();
                }
            });
            interfaceC56387yDmCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(c26601jfR, C56524yIo.AEQbTJ(InvestTokenSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.token_selection.InvestTokenSelectionBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$3
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
            }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.token_selection.InvestTokenSelectionBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$4
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
                    Function0 function03 = function0;
                    if (function03 != null && (creationExtras = (CreationExtras) function03.invoke()) != null) {
                        return creationExtras;
                    }
                    ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                    CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                    return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
                }
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.token_selection.InvestTokenSelectionBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$5
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
                        defaultViewModelProviderFactory = c26601jfR.getDefaultViewModelProviderFactory();
                    }
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                    return defaultViewModelProviderFactory;
                }
            });
        } else {
            final Function0<androidx.fragment.app.Fragment> function03 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.token_selection.InvestTokenSelectionBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$6
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                {
                    super(0);
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final Fragment invoke() {
                    return c26601jfR;
                }
            };
            final InterfaceC56387yDm interfaceC56387yDmEZpvd2 = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.token_selection.InvestTokenSelectionBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$7
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
            interfaceC56387yDmCreateViewModelLazy = FragmentViewModelLazyKt.createViewModelLazy(c26601jfR, C56524yIo.AEQbTJ(RedeemTokenSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.token_selection.InvestTokenSelectionBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$8
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
            }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.token_selection.InvestTokenSelectionBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$9
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
                    Function0 function04 = function0;
                    if (function04 != null && (creationExtras = (CreationExtras) function04.invoke()) != null) {
                        return creationExtras;
                    }
                    ViewModelStoreOwner viewModelStoreOwnerM5735viewModels$lambda1 = FragmentViewModelLazyKt.m5735viewModels$lambda1(interfaceC56387yDmEZpvd2);
                    HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerM5735viewModels$lambda1 instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerM5735viewModels$lambda1 : null;
                    CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                    return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
                }
            }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.token_selection.InvestTokenSelectionBottomSheet$viewModel_delegate$lambda$0$$inlined$viewModels$default$10
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
                        defaultViewModelProviderFactory = c26601jfR.getDefaultViewModelProviderFactory();
                    }
                    Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "");
                    return defaultViewModelProviderFactory;
                }
            });
        }
        return (InterfaceC26664jgb) interfaceC56387yDmCreateViewModelLazy.getValue();
    }

    /* JADX DEBUG: Possible override for method o.jfO.KWHzl()V */
    public final C26600jfQ KWHzl() {
        return (C26600jfQ) this.djBIcL.getValue();
    }

    public static final C26600jfQ djBIcL(final C26601jfR c26601jfR) {
        return new C26600jfQ(c26601jfR.valueOf().AEQbTJ(), new Function1() { // from class: o.jfW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C26601jfR.KWHzl(this.copydefault, (C26608jfY) obj);
            }
        });
    }

    public static final Unit KWHzl(C26601jfR c26601jfR, C26608jfY c26608jfY) {
        Intrinsics.checkNotNullParameter(c26608jfY, "");
        ActivityResultCaller parentFragment = c26601jfR.getParentFragment();
        InterfaceC26609jfZ interfaceC26609jfZ = null;
        InterfaceC26609jfZ interfaceC26609jfZ2 = parentFragment instanceof InterfaceC26609jfZ ? (InterfaceC26609jfZ) parentFragment : null;
        if (interfaceC26609jfZ2 == null) {
            KeyEventDispatcher.Component activity = c26601jfR.getActivity();
            if (activity instanceof InterfaceC26609jfZ) {
                interfaceC26609jfZ = (InterfaceC26609jfZ) activity;
            }
        } else {
            interfaceC26609jfZ = interfaceC26609jfZ2;
        }
        InvestTokenWithAmount investTokenWithAmountCopydefault = c26601jfR.gEmmrt().copydefault(c26608jfY);
        if (interfaceC26609jfZ != null && investTokenWithAmountCopydefault != null) {
            interfaceC26609jfZ.OLrzqt(investTokenWithAmountCopydefault);
        }
        c26601jfR.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.DSiOMJ));
        wxq.setCloseVisibility(false);
        wxq.setDividerVisibility(true);
        wxq.AEQbTJ().setVisibility(0);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new Application(imageViewKWHzl, 1000L, this));
    }

    /* JADX INFO: renamed from: o.jfR$Dialog */
    public static final class Dialog implements android.text.TextWatcher {
        @Override // android.text.TextWatcher
        public void beforeTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(java.lang.CharSequence charSequence, int i, int i2, int i3) {
        }

        public Dialog() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(android.text.Editable editable) {
            LifecycleOwner viewLifecycleOwner = C26601jfR.this.getViewLifecycleOwner();
            Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
            C27493jwI.safeLaunch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new InvestTokenSelectionBottomSheet$onViewCreated$1$2$1(C26601jfR.this, editable, null), 3, null);
        }
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        this.AYXKKw = iKD.AEQbTJ(android.view.LayoutInflater.from(requireContext()));
        constraintLayout.addView(djBIcL().getRoot(), new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        iKD ikdDjBIcL = djBIcL();
        ikdDjBIcL.AhwBna.setAdapter(KWHzl());
        ikdDjBIcL.EZpvd.setRetryClickListener(new View.OnClickListener() { // from class: o.jfT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C26601jfR.OLrzqt(this.KWHzl, view2);
            }
        });
        ikdDjBIcL.djBIcL.KWHzl().addTextChangedListener(new Dialog());
        C27589jxz.collectOnViewLifecycle$default(this, gEmmrt().AEQbTJ(), null, new TaskDescription(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, gEmmrt().OLrzqt(), null, new ActionBar(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, FlowKt.debounce(this.AhwBna, 250L), null, new Activity(), 2, null);
        gEmmrt().AEQbTJ(valueOf());
    }

    public static final void OLrzqt(C26601jfR c26601jfR, android.view.View view) {
        c26601jfR.gEmmrt().AEQbTJ(c26601jfR.valueOf());
    }

    /* JADX INFO: renamed from: o.jfR$TaskDescription */
    public static final class TaskDescription<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C26663jga c26663jga, Continuation<? super Unit> continuation) {
            C26601jfR.this.OLrzqt(c26663jga);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jfR$ActionBar */
    public static final class ActionBar<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public ActionBar() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: KWHzl, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<C26608jfY> list, Continuation<? super Unit> continuation) {
            C26601jfR.this.EZpvd(list);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jfR$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.lang.String str, Continuation<? super Unit> continuation) {
            C26601jfR.this.gEmmrt().OLrzqt(str, C26601jfR.this.valueOf());
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.AYXKKw = null;
        super.onDestroyView();
    }

    public final void OLrzqt(C26663jga c26663jga) {
        iKD ikdDjBIcL = djBIcL();
        C55173xeu c55173xeu = ikdDjBIcL.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        int i = 8;
        c55173xeu.setVisibility(c26663jga.OLrzqt() != null ? 0 : 8);
        C55113xdn c55113xdn = ikdDjBIcL.KWHzl;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(c26663jga.EZpvd() ? 0 : 8);
        LinearLayoutCompat linearLayoutCompat = ikdDjBIcL.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(linearLayoutCompat, "");
        if (!c26663jga.EZpvd() && c26663jga.OLrzqt() == null) {
            i = 0;
        }
        linearLayoutCompat.setVisibility(i);
        if (c26663jga.EZpvd()) {
            return;
        }
        c26663jga.OLrzqt();
    }

    public final void EZpvd(java.util.List<C26608jfY> list) {
        iKD ikdDjBIcL = djBIcL();
        RecyclerView recyclerView = ikdDjBIcL.AhwBna;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        C55173xeu c55173xeu = ikdDjBIcL.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility(list.isEmpty() ? 0 : 8);
        if (list.isEmpty()) {
            return;
        }
        KWHzl().EZpvd(list);
    }

    /* JADX INFO: renamed from: o.jfR$StateListAnimator */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jfR.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C26601jfR AEQbTJ(@NotNull TokenSelectionParams tokenSelectionParams) {
            Intrinsics.checkNotNullParameter(tokenSelectionParams, "");
            C26601jfR c26601jfR = new C26601jfR();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("key.params", tokenSelectionParams);
            c26601jfR.setArguments(bundle);
            return c26601jfR;
        }
    }

    /* JADX INFO: renamed from: o.jfR$Application */
    public static final class Application implements View.OnClickListener {
        public final /* synthetic */ long KWHzl;
        public final /* synthetic */ C26601jfR OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Application(android.view.View view, long j, C26601jfR c26601jfR) {
            this.copydefault = view;
            this.KWHzl = j;
            this.OLrzqt = c26601jfR;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.KWHzl || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }
}
