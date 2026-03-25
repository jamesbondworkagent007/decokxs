package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.oqz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C37290oqz {
    public static final C37290oqz copydefault = new C37290oqz();

    /* JADX INFO: renamed from: o.oqz$StateListAnimator */
    public interface StateListAnimator {
        void EZpvd(@NotNull ActivityResult activityResult);
    }

    private C37290oqz() {
    }

    public static /* synthetic */ ActivityResultLauncher registerForImNewChatActivityResult$default(C37290oqz c37290oqz, androidx.fragment.app.Fragment fragment, StateListAnimator stateListAnimator, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            stateListAnimator = null;
        }
        return c37290oqz.KWHzl(fragment, stateListAnimator);
    }

    public final ActivityResultLauncher<android.content.Intent> KWHzl(@NotNull final androidx.fragment.app.Fragment fragment, final StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(fragment, "");
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.oqv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C37290oqz.EZpvd(fragment, stateListAnimator, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        return activityResultLauncherRegisterForActivityResult;
    }

    public static final void EZpvd(androidx.fragment.app.Fragment fragment, StateListAnimator stateListAnimator, ActivityResult activityResult) {
        if (activityResult.getResultCode() == 1001) {
            fragment.requireActivity().setResult(1001, activityResult.getData());
            fragment.requireActivity().finish();
        } else if (stateListAnimator != null) {
            Intrinsics.copydefault(activityResult);
            stateListAnimator.EZpvd(activityResult);
        }
    }

    public static /* synthetic */ ActivityResultLauncher registerForImNewChatInConvoListActivityResult$default(C37290oqz c37290oqz, androidx.fragment.app.Fragment fragment, StateListAnimator stateListAnimator, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            stateListAnimator = null;
        }
        return c37290oqz.AEQbTJ(fragment, stateListAnimator);
    }

    public final ActivityResultLauncher<android.content.Intent> AEQbTJ(@NotNull final androidx.fragment.app.Fragment fragment, final StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(fragment, "");
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = fragment.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.oqw
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C37290oqz.copydefault(fragment, stateListAnimator, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        return activityResultLauncherRegisterForActivityResult;
    }

    public static final void copydefault(androidx.fragment.app.Fragment fragment, StateListAnimator stateListAnimator, ActivityResult activityResult) {
        if (activityResult.getResultCode() == 1001) {
            fragment.requireActivity().setResult(1001, activityResult.getData());
        } else if (stateListAnimator != null) {
            Intrinsics.copydefault(activityResult);
            stateListAnimator.EZpvd(activityResult);
        }
    }

    public static /* synthetic */ ActivityResultLauncher registerForImNewChatActivityResult$default(C37290oqz c37290oqz, AbstractActivityC33041mov abstractActivityC33041mov, StateListAnimator stateListAnimator, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            stateListAnimator = null;
        }
        return c37290oqz.OLrzqt(abstractActivityC33041mov, stateListAnimator);
    }

    public final ActivityResultLauncher<android.content.Intent> OLrzqt(@NotNull final AbstractActivityC33041mov abstractActivityC33041mov, final StateListAnimator stateListAnimator) {
        Intrinsics.checkNotNullParameter(abstractActivityC33041mov, "");
        ActivityResultLauncher<android.content.Intent> activityResultLauncherRegisterForActivityResult = abstractActivityC33041mov.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.oqy
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C37290oqz.EZpvd(abstractActivityC33041mov, stateListAnimator, (ActivityResult) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        return activityResultLauncherRegisterForActivityResult;
    }

    public static final void EZpvd(AbstractActivityC33041mov abstractActivityC33041mov, StateListAnimator stateListAnimator, ActivityResult activityResult) {
        if (activityResult.getResultCode() == 1001) {
            abstractActivityC33041mov.setResult(1001, activityResult.getData());
            abstractActivityC33041mov.finish();
        } else if (stateListAnimator != null) {
            Intrinsics.copydefault(activityResult);
            stateListAnimator.EZpvd(activityResult);
        }
    }

    public final void AEQbTJ(@NotNull android.app.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        activity.setResult(1001);
        activity.finish();
    }
}
