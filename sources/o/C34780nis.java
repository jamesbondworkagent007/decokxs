package o;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bumptech.glide.Glide;
import com.okinc.business.appupdate.api.AppUpdateService;
import com.okinc.feature.public_beta_impl.ui.fragment.LandingPageFragment$observeViewModel$1;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o.C34783niv;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nis, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C34780nis extends androidx.fragment.app.Fragment {
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int OLrzqt = 8;
    public C34772nik AEQbTJ;
    public final InterfaceC56387yDm KWHzl;

    public C34780nis() {
        final Function0<androidx.fragment.app.Fragment> function0 = new Function0<androidx.fragment.app.Fragment>() { // from class: com.okinc.feature.public_beta_impl.ui.fragment.LandingPageFragment$special$$inlined$viewModels$default$1
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
        final InterfaceC56387yDm interfaceC56387yDmEZpvd = C56392yDr.EZpvd(LazyThreadSafetyMode.NONE, new Function0<ViewModelStoreOwner>() { // from class: com.okinc.feature.public_beta_impl.ui.fragment.LandingPageFragment$special$$inlined$viewModels$default$2
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
        this.KWHzl = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(C34783niv.class), new Function0<ViewModelStore>() { // from class: com.okinc.feature.public_beta_impl.ui.fragment.LandingPageFragment$special$$inlined$viewModels$default$3
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.feature.public_beta_impl.ui.fragment.LandingPageFragment$special$$inlined$viewModels$default$4
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.feature.public_beta_impl.ui.fragment.LandingPageFragment$special$$inlined$viewModels$default$5
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

    /* JADX INFO: renamed from: o.nis$TaskDescription */
    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.nis.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final C34780nis OLrzqt(@NotNull java.lang.String str) {
            Intrinsics.checkNotNullParameter(str, "");
            C34780nis c34780nis = new C34780nis();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("feature_code", str);
            c34780nis.setArguments(bundle);
            return c34780nis;
        }
    }

    public final C34772nik OLrzqt() {
        C34772nik c34772nik = this.AEQbTJ;
        Intrinsics.copydefault(c34772nik);
        return c34772nik;
    }

    public final C34783niv AEQbTJ() {
        return (C34783niv) this.KWHzl.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(@NotNull android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "");
        this.AEQbTJ = C34772nik.OLrzqt(layoutInflater, viewGroup, false);
        ConstraintLayout root = OLrzqt().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull android.view.View view, android.os.Bundle bundle) {
        java.lang.String string;
        Intrinsics.checkNotNullParameter(view, "");
        super.onViewCreated(view, bundle);
        EZpvd();
        KWHzl();
        android.os.Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("feature_code")) == null) {
            string = "okx_range_shake";
        }
        AEQbTJ().EZpvd(string);
    }

    private final void EZpvd() {
        copydefault();
        OLrzqt().OLrzqt.setOnClickListener(new View.OnClickListener() { // from class: o.nit
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34780nis.copydefault(this.copydefault, view);
            }
        });
        OLrzqt().KWHzl.setOnClickListener(new View.OnClickListener() { // from class: o.niu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                C34780nis.KWHzl(this.OLrzqt, view);
            }
        });
    }

    public static final void copydefault(C34780nis c34780nis, android.view.View view) {
        c34780nis.AEQbTJ().OLrzqt();
    }

    public static final void KWHzl(C34780nis c34780nis, android.view.View view) {
        c34780nis.AEQbTJ().KWHzl();
    }

    public final void copydefault() {
        ComponentCallbacks2C5333Nr componentCallbacks2C5333NrAEQbTJ = Glide.AEQbTJ(requireContext());
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        componentCallbacks2C5333NrAEQbTJ.EZpvd(C43454rpb.copydefault("images/public_beta/shake_outline.webp", contextRequireContext, true)).EZpvd(OLrzqt().valueOf);
        pUU.KWHzl("ShakeFeedbackIntroFragment", "Loading shake icon from static drawable");
    }

    private final void KWHzl() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(viewLifecycleOwner), null, null, new LandingPageFragment$observeViewModel$1(this, null), 3, null);
    }

    public final void OLrzqt(C34783niv.Activity activity) {
        OLrzqt().OLrzqt.setEnabled(!activity.OLrzqt());
        if (activity.KWHzl() != null) {
            pUU.copydefault("ShakeFeedbackIntroFragment", "Error: " + activity.KWHzl().EZpvd());
            if (C33129mqd.OLrzqt((java.lang.CharSequence) activity.KWHzl().EZpvd())) {
                C55326xho.toastWithFailedIcon$default(activity.KWHzl().EZpvd(), 0, 1, (java.lang.Object) null);
            }
            C2349AIi c2349AIiEZpvd = activity.EZpvd();
            if (c2349AIiEZpvd != null && c2349AIiEZpvd.KWHzl() == 405) {
                AppUpdateService appUpdateService = (AppUpdateService) C43251rlk.copydefault(AppUpdateService.class);
                if (appUpdateService.hasNewVersion()) {
                    FragmentActivity fragmentActivityRequireActivity = requireActivity();
                    Intrinsics.copydefault(fragmentActivityRequireActivity, "");
                    appUpdateService.checkUpdate((AbstractActivityC33041mov) fragmentActivityRequireActivity, false);
                }
            }
        }
        if (activity.AEQbTJ()) {
            requireActivity().finish();
        }
    }

    public final void copydefault(C34783niv.TaskDescription taskDescription) {
        if (!(taskDescription instanceof C34783niv.TaskDescription.Activity)) {
            throw new NoWhenBranchMatchedException();
        }
        requireActivity().finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.AEQbTJ = null;
    }
}
