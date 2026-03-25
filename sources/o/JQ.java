package o;

import com.amplitude.android.utilities.ActivityCallbackType;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class JQ {
    public final ActivityCallbackType AEQbTJ;
    public final WeakReference<android.app.Activity> EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.JQ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ JQ copy$default(JQ jq, WeakReference weakReference, ActivityCallbackType activityCallbackType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            weakReference = jq.EZpvd;
        }
        if ((i & 2) != 0) {
            activityCallbackType = jq.AEQbTJ;
        }
        return jq.EZpvd(weakReference, activityCallbackType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JQ EZpvd(@NotNull WeakReference<android.app.Activity> weakReference, @NotNull ActivityCallbackType activityCallbackType) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        Intrinsics.checkNotNullParameter(activityCallbackType, "");
        return new JQ(weakReference, activityCallbackType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WeakReference<android.app.Activity> KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ActivityCallbackType copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JQ)) {
            return false;
        }
        JQ jq = (JQ) obj;
        return Intrinsics.EZpvd(this.EZpvd, jq.EZpvd) && this.AEQbTJ == jq.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ActivityCallbackEvent(activity=" + this.EZpvd + ", type=" + this.AEQbTJ + ')';
    }

    public JQ(@NotNull WeakReference<android.app.Activity> weakReference, @NotNull ActivityCallbackType activityCallbackType) {
        Intrinsics.checkNotNullParameter(weakReference, "");
        Intrinsics.checkNotNullParameter(activityCallbackType, "");
        this.EZpvd = weakReference;
        this.AEQbTJ = activityCallbackType;
    }
}
