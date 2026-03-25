package o;

import androidx.activity.result.ActivityResultLauncher;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.snz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C45345snz {
    public final ActivityResultLauncher<android.content.Intent> KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.snz */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C45345snz copy$default(C45345snz c45345snz, ActivityResultLauncher activityResultLauncher, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            activityResultLauncher = c45345snz.KWHzl;
        }
        return c45345snz.KWHzl(activityResultLauncher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C45345snz KWHzl(@NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        return new C45345snz(activityResultLauncher);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C45345snz) && Intrinsics.EZpvd(this.KWHzl, ((C45345snz) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ActivityResultModel(launcher=" + this.KWHzl + ")";
    }

    public C45345snz(@NotNull ActivityResultLauncher<android.content.Intent> activityResultLauncher) {
        Intrinsics.checkNotNullParameter(activityResultLauncher, "");
        this.KWHzl = activityResultLauncher;
    }
}
