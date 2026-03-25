package o;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lrE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31286lrE {
    public final JsonElement AEQbTJ;
    public final boolean EZpvd;
    public final java.lang.String OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31286lrE copy$default(C31286lrE c31286lrE, java.lang.String str, JsonElement jsonElement, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c31286lrE.OLrzqt;
        }
        if ((i & 2) != 0) {
            jsonElement = c31286lrE.AEQbTJ;
        }
        if ((i & 4) != 0) {
            z = c31286lrE.EZpvd;
        }
        return c31286lrE.KWHzl(str, jsonElement, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31286lrE KWHzl(@NotNull java.lang.String str, @NotNull JsonElement jsonElement, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        return new C31286lrE(str, jsonElement, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31286lrE)) {
            return false;
        }
        C31286lrE c31286lrE = (C31286lrE) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c31286lrE.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c31286lrE.AEQbTJ) && this.EZpvd == c31286lrE.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + java.lang.Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CancelTransferInfo(uopHash=" + this.OLrzqt + ", serverOption=" + this.AEQbTJ + ", needToDeployContract=" + this.EZpvd + ")";
    }

    public C31286lrE(@NotNull java.lang.String str, @NotNull JsonElement jsonElement, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jsonElement, "");
        this.OLrzqt = str;
        this.AEQbTJ = jsonElement;
        this.EZpvd = z;
    }
}
