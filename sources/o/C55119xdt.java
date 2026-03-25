package o;

import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xdt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C55119xdt {
    public static final C55119xdt AEQbTJ = new C55119xdt();

    private C55119xdt() {
    }

    public final AbstractC55115xdp KWHzl(@NotNull ActivityResultCaller activityResultCaller, @NotNull ActivityResultCallback<android.net.Uri> activityResultCallback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "");
        Intrinsics.checkNotNullParameter(activityResultCallback, "");
        return new C55122xdw(activityResultCaller, activityResultCallback);
    }

    public static /* synthetic */ AbstractC55115xdp createMultiMediaPicker$default(C55119xdt c55119xdt, ActivityResultCaller activityResultCaller, java.lang.Integer num, ActivityResultCallback activityResultCallback, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return c55119xdt.KWHzl(activityResultCaller, num, activityResultCallback);
    }

    public final AbstractC55115xdp KWHzl(@NotNull ActivityResultCaller activityResultCaller, java.lang.Integer num, @NotNull ActivityResultCallback<java.util.List<android.net.Uri>> activityResultCallback) {
        Intrinsics.checkNotNullParameter(activityResultCaller, "");
        Intrinsics.checkNotNullParameter(activityResultCallback, "");
        return new C55116xdq(activityResultCaller, num, activityResultCallback);
    }
}
