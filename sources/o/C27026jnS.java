package o;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.okinc.business.invest_biz.ui.screens.validator_selection.model.ValidatorSelectionParams;
import com.okinc.business.invest_biz.ui.screens.validator_selection.view_model.ValidatorSelectionViewModel;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlinx.coroutines.flow.FlowCollector;
import o.C25493ixk;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jnS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C27026jnS extends AbstractC27027jnT {
    public final InterfaceC56387yDm AkhnZx;
    public final InterfaceC56387yDm valueOf;
    public static final /* synthetic */ yJA<java.lang.Object>[] AYXKKw = {C56524yIo.EZpvd(new MutablePropertyReference1Impl(C27026jnS.class, "contentBinding", "getContentBinding()Lcom/okinc/business/invest_biz/databinding/LayoutInvestValidatorSelectionBottomSheetBinding;", 0))};
    public static final Application Companion = new Application(null);
    public static final int AhwBna = 8;
    public final float gEmmrt = 1.0f;
    public final yIP djBIcL = C27589jxz.EZpvd(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.wXX
    public float getHeightScale() {
        return this.gEmmrt;
    }

    @Override // o.wXX
    public boolean isFullScreen() {
        return false;
    }

    public C27026jnS() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.business.invest_biz.ui.screens.validator_selection.InvestValidatorSelectionBottomSheet$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.business.invest_biz.ui.screens.validator_selection.InvestValidatorSelectionBottomSheet$special$$inlined$viewModels$default$2
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
        this.AkhnZx = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ValidatorSelectionViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.business.invest_biz.ui.screens.validator_selection.InvestValidatorSelectionBottomSheet$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.business.invest_biz.ui.screens.validator_selection.InvestValidatorSelectionBottomSheet$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.business.invest_biz.ui.screens.validator_selection.InvestValidatorSelectionBottomSheet$special$$inlined$viewModels$default$5
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
        this.valueOf = C56392yDr.copydefault(new Function0() { // from class: o.jnX
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return C27026jnS.KWHzl(this.copydefault);
            }
        });
    }

    public final void EZpvd(C23836iLc c23836iLc) {
        this.djBIcL.KWHzl(this, AYXKKw[0], c23836iLc);
    }

    public final C23836iLc valueOf() {
        return (C23836iLc) this.djBIcL.getValue(this, AYXKKw[0]);
    }

    public final ValidatorSelectionParams AYXKKw() {
        android.os.Bundle arguments = getArguments();
        ValidatorSelectionParams validatorSelectionParams = arguments != null ? (ValidatorSelectionParams) arguments.getParcelable("key.params") : null;
        ValidatorSelectionParams validatorSelectionParams2 = validatorSelectionParams instanceof ValidatorSelectionParams ? validatorSelectionParams : null;
        if (validatorSelectionParams2 != null) {
            return validatorSelectionParams2;
        }
        throw new java.lang.IllegalArgumentException("required Params is missing.");
    }

    public final ValidatorSelectionViewModel gEmmrt() {
        return (ValidatorSelectionViewModel) this.AkhnZx.getValue();
    }

    /* JADX DEBUG: Possible override for method o.jnT.AEQbTJ()V */
    public final C27025jnR AEQbTJ() {
        return (C27025jnR) this.valueOf.getValue();
    }

    public static final C27025jnR KWHzl(final C27026jnS c27026jnS) {
        return new C27025jnR(c27026jnS.AYXKKw().KWHzl(), c27026jnS.AYXKKw().EZpvd(), new Function1() { // from class: o.jnY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C27026jnS.EZpvd(this.copydefault, (C27090jod) obj);
            }
        });
    }

    public static final Unit EZpvd(C27026jnS c27026jnS, C27090jod c27090jod) {
        Intrinsics.checkNotNullParameter(c27090jod, "");
        KeyEventDispatcher.Component activity = c27026jnS.getActivity();
        InterfaceC26761jiS interfaceC26761jiS = activity instanceof InterfaceC26761jiS ? (InterfaceC26761jiS) activity : null;
        if (interfaceC26761jiS != null) {
            interfaceC26761jiS.AEQbTJ(c27090jod.OLrzqt(), c27026jnS.AYXKKw().AEQbTJ());
        }
        c27026jnS.dismissAllowingStateLoss();
        return Unit.INSTANCE;
    }

    @Override // o.wXX
    public void onCreateHeader(@NotNull wXQ wxq) {
        Intrinsics.checkNotNullParameter(wxq, "");
        super.onCreateHeader(wxq);
        wxq.setStyle(1);
        wxq.setTitle(C33070mpX.AYXKKw(C25493ixk.FragmentManager.zuBGHE));
        wxq.setCloseVisibility(true);
        wxq.setDividerVisibility(true);
        wxq.AEQbTJ().setVisibility(8);
        android.widget.ImageView imageViewKWHzl = wxq.KWHzl();
        imageViewKWHzl.setOnClickListener(new TaskDescription(imageViewKWHzl, 1000L, this));
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        super.onCreateContent(constraintLayout);
        EZpvd(C23836iLc.copydefault(android.view.LayoutInflater.from(requireContext())));
        constraintLayout.addView(valueOf().getRoot(), new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // o.wXX, androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        C23836iLc c23836iLcValueOf = valueOf();
        c23836iLcValueOf.AEQbTJ.setAdapter(AEQbTJ());
        c23836iLcValueOf.EZpvd.setRetryClickListener(new View.OnClickListener() { // from class: o.joa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view2) {
                C27026jnS.AEQbTJ(this.copydefault, view2);
            }
        });
        C27589jxz.collectOnViewLifecycle$default(this, gEmmrt().AEQbTJ(), null, new StateListAnimator(), 2, null);
        C27589jxz.collectOnViewLifecycle$default(this, gEmmrt().OLrzqt(), null, new Activity(), 2, null);
        gEmmrt().copydefault(AYXKKw());
    }

    public static final void AEQbTJ(C27026jnS c27026jnS, android.view.View view) {
        c27026jnS.gEmmrt().copydefault(c27026jnS.AYXKKw());
    }

    /* JADX INFO: renamed from: o.jnS$StateListAnimator */
    public static final class StateListAnimator<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public StateListAnimator() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: EZpvd, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(C27088job c27088job, Continuation<? super Unit> continuation) {
            C27026jnS.this.copydefault(c27088job);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: o.jnS$Activity */
    public static final class Activity<T> implements FlowCollector {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity() {
        }

        /* JADX DEBUG: Method merged with bridge method: emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object; */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
        public final java.lang.Object emit(java.util.List<C27090jod> list, Continuation<? super Unit> continuation) {
            C27026jnS.this.copydefault(list);
            return Unit.INSTANCE;
        }
    }

    public final void copydefault(C27088job c27088job) {
        C23836iLc c23836iLcValueOf = valueOf();
        C55113xdn c55113xdn = c23836iLcValueOf.OLrzqt;
        Intrinsics.checkNotNullExpressionValue(c55113xdn, "");
        c55113xdn.setVisibility(c27088job.EZpvd() ? 0 : 8);
        C55173xeu c55173xeu = c23836iLcValueOf.EZpvd;
        Intrinsics.checkNotNullExpressionValue(c55173xeu, "");
        c55173xeu.setVisibility((c27088job.EZpvd() || c27088job.KWHzl() == null) ? 8 : 0);
        RecyclerView recyclerView = c23836iLcValueOf.AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility((c27088job.EZpvd() || c27088job.KWHzl() != null) ? 8 : 0);
        if (c27088job.EZpvd()) {
            return;
        }
        c27088job.KWHzl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void copydefault(java.util.List<C27090jod> list) {
        RecyclerView recyclerView = valueOf().AEQbTJ;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "");
        recyclerView.setVisibility(list.isEmpty() ^ true ? 0 : 8);
        if (list.isEmpty()) {
            return;
        }
        AEQbTJ().copydefault(list);
    }

    /* JADX INFO: renamed from: o.jnS$Application */
    /* JADX INFO: loaded from: classes18.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.jnS.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C27026jnS OLrzqt(@NotNull ValidatorSelectionParams validatorSelectionParams) {
            Intrinsics.checkNotNullParameter(validatorSelectionParams, "");
            C27026jnS c27026jnS = new C27026jnS();
            c27026jnS.setArguments(BundleKt.bundleOf(C56390yDp.OLrzqt("key.params", validatorSelectionParams)));
            return c27026jnS;
        }
    }

    /* JADX INFO: renamed from: o.jnS$TaskDescription */
    public static final class TaskDescription implements View.OnClickListener {
        public final /* synthetic */ long EZpvd;
        public final /* synthetic */ C27026jnS OLrzqt;
        public final /* synthetic */ android.view.View copydefault;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(android.view.View view, long j, C27026jnS c27026jnS) {
            this.copydefault = view;
            this.EZpvd = j;
            this.OLrzqt = c27026jnS;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.copydefault) > this.EZpvd || (this.copydefault instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.copydefault, jCurrentTimeMillis);
                this.OLrzqt.dismissAllowingStateLoss();
            }
        }
    }
}
