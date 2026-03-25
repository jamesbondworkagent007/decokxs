package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31345lsK {
    public final JsonElement AEQbTJ;
    public final java.lang.String AYXKKw;
    public final java.lang.String EZpvd;
    public final boolean KWHzl;
    public final boolean OLrzqt;
    public final boolean copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31345lsK copy$default(C31345lsK c31345lsK, boolean z, java.lang.String str, JsonElement jsonElement, boolean z2, boolean z3, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = c31345lsK.copydefault;
        }
        if ((i & 2) != 0) {
            str = c31345lsK.AYXKKw;
        }
        java.lang.String str3 = str;
        if ((i & 4) != 0) {
            jsonElement = c31345lsK.AEQbTJ;
        }
        JsonElement jsonElement2 = jsonElement;
        if ((i & 8) != 0) {
            z2 = c31345lsK.KWHzl;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            z3 = c31345lsK.OLrzqt;
        }
        boolean z5 = z3;
        if ((i & 32) != 0) {
            str2 = c31345lsK.EZpvd;
        }
        return c31345lsK.EZpvd(z, str3, jsonElement2, z4, z5, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31345lsK EZpvd(boolean z, @NotNull java.lang.String str, @NotNull JsonElement jsonElement, boolean z2, boolean z3, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        return new C31345lsK(z, str, jsonElement, z2, z3, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31345lsK)) {
            return false;
        }
        C31345lsK c31345lsK = (C31345lsK) obj;
        return this.copydefault == c31345lsK.copydefault && Intrinsics.EZpvd((java.lang.Object) this.AYXKKw, (java.lang.Object) c31345lsK.AYXKKw) && Intrinsics.EZpvd(this.AEQbTJ, c31345lsK.AEQbTJ) && this.KWHzl == c31345lsK.KWHzl && this.OLrzqt == c31345lsK.OLrzqt && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c31345lsK.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = java.lang.Boolean.hashCode(this.copydefault);
        int iHashCode2 = this.AYXKKw.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        int iHashCode4 = java.lang.Boolean.hashCode(this.KWHzl);
        int iHashCode5 = java.lang.Boolean.hashCode(this.OLrzqt);
        java.lang.String str = this.EZpvd;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ConvertUopInfo(need2FA=" + this.copydefault + ", uopHash=" + this.AYXKKw + ", serverOption=" + this.AEQbTJ + ", needToSyncPasskey=" + this.KWHzl + ", needToDeployContract=" + this.OLrzqt + ", mfaSessionId=" + this.EZpvd + ")";
    }

    public C31345lsK(boolean z, @NotNull java.lang.String str, @NotNull JsonElement jsonElement, boolean z2, boolean z3, java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        this.copydefault = z;
        this.AYXKKw = str;
        this.AEQbTJ = jsonElement;
        this.KWHzl = z2;
        this.OLrzqt = z3;
        this.EZpvd = str2;
    }
}
