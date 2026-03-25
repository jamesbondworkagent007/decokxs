package o;

import com.okinc.lib.monitor.memory.LeakCertainty;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.pJx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C38037pJx {
    public LeakCertainty EZpvd;
    public final C38039pJz KWHzl;
    public final long OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C38037pJx copy$default(C38037pJx c38037pJx, C38039pJz c38039pJz, java.lang.String str, long j, LeakCertainty leakCertainty, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            c38039pJz = c38037pJx.KWHzl;
        }
        if ((i & 2) != 0) {
            str = c38037pJx.copydefault;
        }
        java.lang.String str2 = str;
        if ((i & 4) != 0) {
            j = c38037pJx.OLrzqt;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            leakCertainty = c38037pJx.EZpvd;
        }
        return c38037pJx.OLrzqt(c38039pJz, str2, j2, leakCertainty);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LeakCertainty AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C38037pJx OLrzqt(@NotNull C38039pJz c38039pJz, @NotNull java.lang.String str, long j, @NotNull LeakCertainty leakCertainty) {
        Intrinsics.checkNotNullParameter(c38039pJz, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(leakCertainty, "");
        return new C38037pJx(c38039pJz, str, j, leakCertainty);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(@NotNull LeakCertainty leakCertainty) {
        Intrinsics.checkNotNullParameter(leakCertainty, "");
        this.EZpvd = leakCertainty;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38037pJx)) {
            return false;
        }
        C38037pJx c38037pJx = (C38037pJx) obj;
        return Intrinsics.EZpvd(this.KWHzl, c38037pJx.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c38037pJx.copydefault) && this.OLrzqt == c38037pJx.OLrzqt && this.EZpvd == c38037pJx.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.KWHzl.hashCode() * 31) + this.copydefault.hashCode()) * 31) + java.lang.Long.hashCode(this.OLrzqt)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TrackedObjectData(weakRef=" + this.KWHzl + ", className=" + this.copydefault + ", createdAt=" + this.OLrzqt + ", state=" + this.EZpvd + ")";
    }

    public C38037pJx(@NotNull C38039pJz c38039pJz, @NotNull java.lang.String str, long j, @NotNull LeakCertainty leakCertainty) {
        Intrinsics.checkNotNullParameter(c38039pJz, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(leakCertainty, "");
        this.KWHzl = c38039pJz;
        this.copydefault = str;
        this.OLrzqt = j;
        this.EZpvd = leakCertainty;
    }
}
