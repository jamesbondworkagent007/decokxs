package o;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55122xdw extends AbstractC55115xdp {
    public final ActivityResultLauncher<PickVisualMediaRequest> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55115xdp
    public ActivityResultLauncher<PickVisualMediaRequest> OLrzqt() {
        return this.KWHzl;
    }

    public C55122xdw(@NotNull ActivityResultCaller activityResultCaller, @NotNull ActivityResultCallback<android.net.Uri> activityResultCallback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "");
        Intrinsics.checkNotNullParameter(activityResultCallback, "");
        ActivityResultLauncher<PickVisualMediaRequest> activityResultLauncherRegisterForActivityResult = activityResultCaller.registerForActivityResult(new C55123xdx(), activityResultCallback);
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.KWHzl = activityResultLauncherRegisterForActivityResult;
    }
}
