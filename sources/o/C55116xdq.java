package o;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.PickVisualMediaRequest;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C55116xdq extends AbstractC55115xdp {
    public final ActivityResultLauncher<PickVisualMediaRequest> EZpvd;
    public final C55117xdr copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC55115xdp
    public ActivityResultLauncher<PickVisualMediaRequest> OLrzqt() {
        return this.EZpvd;
    }

    public C55116xdq(@NotNull ActivityResultCaller activityResultCaller, java.lang.Integer num, @NotNull ActivityResultCallback<java.util.List<android.net.Uri>> activityResultCallback) {
        C55117xdr c55117xdr;
        Intrinsics.checkNotNullParameter(activityResultCaller, "");
        Intrinsics.checkNotNullParameter(activityResultCallback, "");
        if (num == null) {
            c55117xdr = new C55117xdr(0, 1, null);
        } else {
            c55117xdr = new C55117xdr(num.intValue());
        }
        this.copydefault = c55117xdr;
        ActivityResultLauncher<PickVisualMediaRequest> activityResultLauncherRegisterForActivityResult = activityResultCaller.registerForActivityResult(c55117xdr, activityResultCallback);
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "");
        this.EZpvd = activityResultLauncherRegisterForActivityResult;
    }
}
