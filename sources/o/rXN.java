package o;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.systempush.model.NotificationType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class rXN {
    public final NotificationType OLrzqt;
    public final int copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ rXN copy$default(rXN rxn, NotificationType notificationType, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            notificationType = rxn.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            i = rxn.copydefault;
        }
        return rxn.AEQbTJ(notificationType, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final rXN AEQbTJ(@NotNull NotificationType notificationType, int i) {
        Intrinsics.checkNotNullParameter(notificationType, "");
        return new rXN(notificationType, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final NotificationType copydefault() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rXN)) {
            return false;
        }
        rXN rxn = (rXN) obj;
        return this.OLrzqt == rxn.OLrzqt && this.copydefault == rxn.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + java.lang.Integer.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NotificationSwitch(notificationType=" + this.OLrzqt + ", switchStatus=" + this.copydefault + ")";
    }

    public rXN(@NotNull NotificationType notificationType, int i) {
        Intrinsics.checkNotNullParameter(notificationType, "");
        this.OLrzqt = notificationType;
        this.copydefault = i;
    }
}
