package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31284lrC {
    public final JsonElement EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31284lrC copy$default(C31284lrC c31284lrC, java.lang.String str, JsonElement jsonElement, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c31284lrC.copydefault;
        }
        if ((i & 2) != 0) {
            jsonElement = c31284lrC.EZpvd;
        }
        if ((i & 4) != 0) {
            z = c31284lrC.OLrzqt;
        }
        if ((i & 8) != 0) {
            z2 = c31284lrC.KWHzl;
        }
        return c31284lrC.AEQbTJ(str, jsonElement, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31284lrC AEQbTJ(@NotNull java.lang.String str, @NotNull JsonElement jsonElement, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        return new C31284lrC(str, jsonElement, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31284lrC)) {
            return false;
        }
        C31284lrC c31284lrC = (C31284lrC) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c31284lrC.copydefault) && Intrinsics.EZpvd(this.EZpvd, c31284lrC.EZpvd) && this.OLrzqt == c31284lrC.OLrzqt && this.KWHzl == c31284lrC.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Boolean.hashCode(this.OLrzqt)) * 31) + java.lang.Boolean.hashCode(this.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ClaimInfo(uopHash=" + this.copydefault + ", serverOption=" + this.EZpvd + ", needToSyncPasskey=" + this.OLrzqt + ", needToDeployContract=" + this.KWHzl + ")";
    }

    public C31284lrC(@NotNull java.lang.String str, @NotNull JsonElement jsonElement, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        this.copydefault = str;
        this.EZpvd = jsonElement;
        this.OLrzqt = z;
        this.KWHzl = z2;
    }
}
