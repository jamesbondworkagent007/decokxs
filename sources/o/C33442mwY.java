package o;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mwY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33442mwY implements InterfaceC33441mwX {
    public ActivityResultCallback<ActivityResult> AEQbTJ;
    public ActivityResultLauncher<android.content.Intent> EZpvd;

    public void KWHzl(@NotNull ActivityResultCaller activityResultCaller) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "");
        this.EZpvd = activityResultCaller.registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback() { // from class: o.mxa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(java.lang.Object obj) {
                C33442mwY.AEQbTJ(this.copydefault, (ActivityResult) obj);
            }
        });
    }

    public static final void AEQbTJ(C33442mwY c33442mwY, ActivityResult activityResult) {
        ActivityResultCallback<ActivityResult> activityResultCallback = c33442mwY.AEQbTJ;
        if (activityResultCallback != null) {
            Intrinsics.copydefault(activityResult);
            activityResultCallback.onActivityResult(activityResult);
        }
    }

    @Override // o.InterfaceC33441mwX
    public void launchForResult(@NotNull android.content.Intent intent, ActivityResultCallback<ActivityResult> activityResultCallback) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.AEQbTJ = activityResultCallback;
        ActivityResultLauncher<android.content.Intent> activityResultLauncher = this.EZpvd;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(intent);
        }
    }
}
