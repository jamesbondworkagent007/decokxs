package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.os.BundleKt;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.NavHostFragment;
import com.okinc.ok_kyc_core.data.remote.networkmodel.UpdateFormAppModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C43662rtX;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rLt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C42246rLt extends wXX {
    public final InterfaceC56387yDm EZpvd;
    public AbstractC43770rvZ KWHzl;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int AEQbTJ = 8;

    /* JADX INFO: renamed from: o.rLt$TaskDescription */
    public static final /* synthetic */ class TaskDescription implements Observer, InterfaceC56514yIe {
        public final /* synthetic */ Function1 EZpvd;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public TaskDescription(Function1 function1) {
            Intrinsics.checkNotNullParameter(function1, "");
            this.EZpvd = function1;
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
            return this.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(java.lang.Object obj) {
            this.EZpvd.invoke(obj);
        }
    }

    public C42246rLt() {
        final Function0 function0 = null;
        this.EZpvd = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C42163rIr.class), new Function0<ViewModelStore>() { // from class: com.okinc.ok_kyc_core.presentation.views.ComplianceFormBottomSheet$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.ok_kyc_core.presentation.views.ComplianceFormBottomSheet$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.ok_kyc_core.presentation.views.ComplianceFormBottomSheet$special$$inlined$activityViewModels$default$3
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

    private final C42163rIr KWHzl() {
        return (C42163rIr) this.EZpvd.getValue();
    }

    /* JADX INFO: renamed from: o.rLt$StateListAnimator */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.rLt.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final C42246rLt KWHzl(boolean z) {
            android.os.Bundle bundleBundleOf = BundleKt.bundleOf(C56390yDp.OLrzqt("canClose", java.lang.Boolean.valueOf(z)));
            C42246rLt c42246rLt = new C42246rLt();
            c42246rLt.setArguments(bundleBundleOf);
            return c42246rLt;
        }
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            dismissAllowingStateLoss();
        } else {
            KWHzl().copydefault().observe(this, new TaskDescription(new Function1() { // from class: o.rLs
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return C42246rLt.OLrzqt(this.KWHzl, (C43734ruq) obj);
                }
            }));
        }
    }

    public static final Unit OLrzqt(C42246rLt c42246rLt, C43734ruq c43734ruq) {
        if (c43734ruq != null && ((UpdateFormAppModel) c43734ruq.KWHzl()) != null) {
            c42246rLt.dismissAllowingStateLoss();
        }
        return Unit.INSTANCE;
    }

    @Override // o.wXX, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(@NotNull android.content.DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "");
        super.onDismiss(dialogInterface);
        KWHzl().KWHzl(false);
        KWHzl().copydefault().setValue(null);
    }

    @Override // o.wXX
    public void onHeaderCreated(@NotNull C52781wYc c52781wYc) {
        Intrinsics.checkNotNullParameter(c52781wYc, "");
        super.onHeaderCreated(c52781wYc);
        android.os.Bundle arguments = getArguments();
        if (arguments != null && arguments.getBoolean("canClose")) {
            c52781wYc.setType(9);
            android.widget.ImageView imageViewOLrzqt = c52781wYc.OLrzqt();
            if (imageViewOLrzqt != null) {
                imageViewOLrzqt.setOnClickListener(new Activity(imageViewOLrzqt, 1000L, this));
            }
            setCancelable(false);
            return;
        }
        c52781wYc.setType(2);
    }

    @Override // o.wXX
    public void onCreateContent(@NotNull ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "");
        AbstractC43770rvZ abstractC43770rvZ = (AbstractC43770rvZ) DataBindingUtil.inflate(android.view.LayoutInflater.from(getContext()), C43662rtX.TaskDescription.isConnected, constraintLayout, true);
        this.KWHzl = abstractC43770rvZ;
        if (abstractC43770rvZ != null) {
            androidx.fragment.app.Fragment fragmentFindFragmentById = getChildFragmentManager().findFragmentById(C43662rtX.ActionBar.QfsBiF);
            NavHostFragment navHostFragmentCreate$default = fragmentFindFragmentById instanceof NavHostFragment ? (NavHostFragment) fragmentFindFragmentById : null;
            if (navHostFragmentCreate$default == null) {
                navHostFragmentCreate$default = NavHostFragment.Companion.create$default(NavHostFragment.Companion, C43662rtX.LoaderManager.AEQbTJ, null, 2, null);
                getChildFragmentManager().beginTransaction().replace(C43662rtX.ActionBar.QfsBiF, navHostFragmentCreate$default).setPrimaryNavigationFragment(navHostFragmentCreate$default).commitNow();
            }
            navHostFragmentCreate$default.getNavController().setGraph(C43662rtX.LoaderManager.AEQbTJ, new android.os.Bundle());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.KWHzl = null;
    }

    /* JADX INFO: renamed from: o.rLt$Activity */
    public static final class Activity implements View.OnClickListener {
        public final /* synthetic */ C42246rLt AEQbTJ;
        public final /* synthetic */ android.view.View KWHzl;
        public final /* synthetic */ long OLrzqt;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public Activity(android.view.View view, long j, C42246rLt c42246rLt) {
            this.KWHzl = view;
            this.OLrzqt = j;
            this.AEQbTJ = c42246rLt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(android.view.View view) {
            long jCurrentTimeMillis = java.lang.System.currentTimeMillis();
            if (jCurrentTimeMillis - C55296xhK.copydefault(this.KWHzl) > this.OLrzqt || (this.KWHzl instanceof android.widget.Checkable)) {
                C55296xhK.OLrzqt(this.KWHzl, jCurrentTimeMillis);
                this.AEQbTJ.dismissAllowingStateLoss();
            }
        }
    }
}
