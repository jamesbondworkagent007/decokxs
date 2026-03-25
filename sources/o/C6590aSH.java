package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.navigation.fragment.FragmentKt;
import com.okinc.auth.impl.reset2fa.ui.ResetMfaViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.ActivityC6653aTR;
import o.C8206ayP;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aSH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C6590aSH extends AbstractC6628aSt {
    public final ActivityResultLauncher<android.content.Intent> djBIcL;
    public final InterfaceC56387yDm valueOf;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC32996moC
    public int getLayoutId() {
        return C8206ayP.Application.gHZMYf;
    }

    public C6590aSH() {
        final Function0 function0 = null;
        this.valueOf = FragmentViewModelLazyKt.createViewModelLazy(this, C56524yIo.AEQbTJ(ResetMfaViewModel.class), new Function0<ViewModelStore>() { // from class: com.okinc.auth.impl.reset2fa.ui.ResetMfaLandingFragment$special$$inlined$activityViewModels$default$1
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
        }, new Function0<CreationExtras>() { // from class: com.okinc.auth.impl.reset2fa.ui.ResetMfaLandingFragment$special$$inlined$activityViewModels$default$2
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
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.okinc.auth.impl.reset2fa.ui.ResetMfaLandingFragment$special$$inlined$activityViewModels$default$3
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
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.aSK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C6590aSH.copydefault(this.OLrzqt, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.djBIcL = activityResultLauncherRegisterForActivityResult;
    }

    /* JADX DEBUG: Possible override for method o.aSt.KWHzl()V */
    public final ResetMfaViewModel KWHzl() {
        return (ResetMfaViewModel) this.valueOf.getValue();
    }

    public static final void copydefault(C6590aSH c6590aSH, ActivityResult activityResult) {
        FragmentActivity activity;
        Intrinsics.checkNotNullParameter(activityResult, "");
        if (activityResult.getResultCode() != -1 || (activity = c6590aSH.getActivity()) == null) {
            return;
        }
        activity.finish();
    }

    @Override // o.AbstractC32996moC
    public void initView(@NotNull android.view.View view, android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "");
        KWHzl().djBIcL();
        AhwBna();
    }

    public final void AhwBna() {
        KWHzl().EZpvd().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.aSG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6590aSH.copydefault(this.EZpvd, ((java.lang.Boolean) obj).booleanValue());
            }
        }));
        KWHzl().fetchVPNInfo().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.aSJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6590aSH.EZpvd(this.AEQbTJ, (Unit) obj);
            }
        }));
        KWHzl().copydefault().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.aSF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6590aSH.copydefault(this.OLrzqt, (java.lang.String) obj);
            }
        }));
        KWHzl().DbNXlk().observe(getViewLifecycleOwner(), new C32991mny(new Function1() { // from class: o.aSO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C6590aSH.copydefault(this.AEQbTJ, (Unit) obj);
            }
        }));
    }

    public static final Unit copydefault(C6590aSH c6590aSH, boolean z) {
        if (z) {
            c6590aSH.showLoadingAtOnce();
        } else {
            c6590aSH.dismissLoading();
        }
        return Unit.INSTANCE;
    }

    public static final Unit EZpvd(C6590aSH c6590aSH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = c6590aSH.djBIcL;
        ActivityC6653aTR.StateListAnimator stateListAnimator = ActivityC6653aTR.Companion;
        android.content.Context contextRequireContext = c6590aSH.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "");
        activityResultLauncher.launch(stateListAnimator.KWHzl(contextRequireContext));
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C6590aSH c6590aSH, java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C55326xho.toast$default(str, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 31, (java.lang.Object) null);
        FragmentActivity activity = c6590aSH.getActivity();
        if (activity != null) {
            activity.finish();
        }
        return Unit.INSTANCE;
    }

    public static final Unit copydefault(C6590aSH c6590aSH, Unit unit) {
        Intrinsics.checkNotNullParameter(unit, "");
        FragmentKt.findNavController(c6590aSH).navigate(C8206ayP.StateListAnimator.DcMfJK, c6590aSH.getArguments());
        return Unit.INSTANCE;
    }
}
