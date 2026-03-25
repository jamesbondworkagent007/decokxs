package o;

import com.onesignal.OneSignal;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ypQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57807ypQ {
    public final java.lang.String EZpvd;
    public final OneSignal.LOG_LEVEL KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C57807ypQ copy$default(C57807ypQ c57807ypQ, OneSignal.LOG_LEVEL log_level, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            log_level = c57807ypQ.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c57807ypQ.EZpvd;
        }
        return c57807ypQ.OLrzqt(log_level, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C57807ypQ OLrzqt(@NotNull OneSignal.LOG_LEVEL log_level, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(log_level, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C57807ypQ(log_level, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57807ypQ)) {
            return false;
        }
        C57807ypQ c57807ypQ = (C57807ypQ) obj;
        return this.KWHzl == c57807ypQ.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c57807ypQ.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OneSignalLogEvent(level=" + this.KWHzl + ", entry=" + this.EZpvd + ')';
    }

    public C57807ypQ(@NotNull OneSignal.LOG_LEVEL log_level, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(log_level, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = log_level;
        this.EZpvd = str;
    }
}
