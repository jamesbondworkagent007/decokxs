package o;

import com.okinc.remote.config.IntervalType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ucM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C48789ucM {
    public final IntervalType AEQbTJ;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C48789ucM copy$default(C48789ucM c48789ucM, IntervalType intervalType, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            intervalType = c48789ucM.AEQbTJ;
        }
        if ((i & 2) != 0) {
            str = c48789ucM.OLrzqt;
        }
        return c48789ucM.EZpvd(intervalType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C48789ucM EZpvd(@NotNull IntervalType intervalType, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(intervalType, "");
        Intrinsics.checkNotNullParameter(str, "");
        return new C48789ucM(intervalType, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntervalType KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48789ucM)) {
            return false;
        }
        C48789ucM c48789ucM = (C48789ucM) obj;
        return this.AEQbTJ == c48789ucM.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c48789ucM.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ParsedInterval(type=" + this.AEQbTJ + ", value=" + this.OLrzqt + ")";
    }

    public C48789ucM(@NotNull IntervalType intervalType, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(intervalType, "");
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = intervalType;
        this.OLrzqt = str;
    }
}
