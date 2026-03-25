package o;

import com.okinc.okimcore.feature.notification.model.NotificationType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sNa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44363sNa {
    public static final int OLrzqt = C46952tgq.OLrzqt;
    public final C46952tgq AEQbTJ;
    public final NotificationType KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44363sNa copy$default(C44363sNa c44363sNa, C46952tgq c46952tgq, NotificationType notificationType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c46952tgq = c44363sNa.AEQbTJ;
        }
        if ((i & 2) != 0) {
            notificationType = c44363sNa.KWHzl;
        }
        return c44363sNa.OLrzqt(c46952tgq, notificationType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationType AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46952tgq EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44363sNa OLrzqt(@NotNull C46952tgq c46952tgq, @NotNull NotificationType notificationType) {
        Intrinsics.checkNotNullParameter(c46952tgq, "");
        Intrinsics.checkNotNullParameter(notificationType, "");
        return new C44363sNa(c46952tgq, notificationType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44363sNa)) {
            return false;
        }
        C44363sNa c44363sNa = (C44363sNa) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, c44363sNa.AEQbTJ) && this.KWHzl == c44363sNa.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PushChannelNotification(notification=" + this.AEQbTJ + ", notificationType=" + this.KWHzl + ")";
    }

    public C44363sNa(@NotNull C46952tgq c46952tgq, @NotNull NotificationType notificationType) {
        Intrinsics.checkNotNullParameter(c46952tgq, "");
        Intrinsics.checkNotNullParameter(notificationType, "");
        this.AEQbTJ = c46952tgq;
        this.KWHzl = notificationType;
    }
}
