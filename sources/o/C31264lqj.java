package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31264lqj {
    public final boolean AEQbTJ;
    public final JsonElement EZpvd;
    public final java.lang.String KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;
    public final java.lang.String djBIcL;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31264lqj copy$default(C31264lqj c31264lqj, boolean z, java.lang.String str, JsonElement jsonElement, boolean z2, boolean z3, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c31264lqj.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = c31264lqj.djBIcL;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            jsonElement = c31264lqj.EZpvd;
        }
        JsonElement jsonElement2 = jsonElement;
        if ((i & 8) != 0) {
            z2 = c31264lqj.copydefault;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            z3 = c31264lqj.AEQbTJ;
        }
        boolean z5 = z3;
        if ((i & 32) != 0) {
            str2 = c31264lqj.KWHzl;
        }
        return c31264lqj.KWHzl(z, str3, jsonElement2, z4, z5, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31264lqj KWHzl(boolean z, @NotNull java.lang.String str, @NotNull JsonElement jsonElement, boolean z2, boolean z3, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        return new C31264lqj(z, str, jsonElement, z2, z3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31264lqj)) {
            return false;
        }
        C31264lqj c31264lqj = (C31264lqj) obj;
        return this.OLrzqt == c31264lqj.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.djBIcL, (java.lang.Object) c31264lqj.djBIcL) && Intrinsics.EZpvd(this.EZpvd, c31264lqj.EZpvd) && this.copydefault == c31264lqj.copydefault && this.AEQbTJ == c31264lqj.AEQbTJ && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c31264lqj.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.OLrzqt);
        int iHashCode2 = this.djBIcL.hashCode();
        int iHashCode3 = this.EZpvd.hashCode();
        int iHashCode4 = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode5 = java.lang.Boolean.hashCode(this.AEQbTJ);
        java.lang.String str = this.KWHzl;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "SaUopInfo(need2FA=" + this.OLrzqt + ", uopHash=" + this.djBIcL + ", serverOption=" + this.EZpvd + ", needToSyncPasskey=" + this.copydefault + ", needToDeployContract=" + this.AEQbTJ + ", mfaSessionId=" + this.KWHzl + ")";
    }

    public C31264lqj(boolean z, @NotNull java.lang.String str, @NotNull JsonElement jsonElement, boolean z2, boolean z3, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        this.OLrzqt = z;
        this.djBIcL = str;
        this.EZpvd = jsonElement;
        this.copydefault = z2;
        this.AEQbTJ = z3;
        this.KWHzl = str2;
    }
}
