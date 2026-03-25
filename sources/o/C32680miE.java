package o;

import com.okinc.components.security.api.SecurityEventType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.miE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C32680miE {
    public final boolean EZpvd;
    public final SecurityEventType KWHzl;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C32680miE copy$default(C32680miE c32680miE, SecurityEventType securityEventType, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            securityEventType = c32680miE.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c32680miE.OLrzqt;
        }
        if ((i & 4) != 0) {
            z = c32680miE.EZpvd;
        }
        return c32680miE.EZpvd(securityEventType, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C32680miE EZpvd(@NotNull SecurityEventType securityEventType, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(securityEventType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C32680miE(securityEventType, str, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C32680miE)) {
            return false;
        }
        C32680miE c32680miE = (C32680miE) obj;
        return this.KWHzl == c32680miE.KWHzl && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c32680miE.OLrzqt) && this.EZpvd == c32680miE.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.KWHzl.hashCode() * 31) + this.OLrzqt.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SecurityEvent(type=" + this.KWHzl + ", source=" + this.OLrzqt + ", isBlocked=" + this.EZpvd + ")";
    }

    public C32680miE(@NotNull SecurityEventType securityEventType, @NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(securityEventType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = securityEventType;
        this.OLrzqt = str;
        this.EZpvd = z;
    }
}
