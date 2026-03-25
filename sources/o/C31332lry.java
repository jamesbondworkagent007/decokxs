package o;

import com.okinc.business.web3pay.lib.core.model.NetworkFeeInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lry, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31332lry {
    public final java.lang.String AEQbTJ;
    public final JsonElement EZpvd;
    public final NetworkFeeInfo OLrzqt;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C31332lry copy$default(C31332lry c31332lry, JsonElement jsonElement, java.lang.String str, NetworkFeeInfo networkFeeInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            jsonElement = c31332lry.EZpvd;
        }
        if ((i & 2) != 0) {
            str = c31332lry.AEQbTJ;
        }
        if ((i & 4) != 0) {
            networkFeeInfo = c31332lry.OLrzqt;
        }
        return c31332lry.OLrzqt(jsonElement, str, networkFeeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C31332lry OLrzqt(@NotNull JsonElement jsonElement, @NotNull java.lang.String str, @NotNull NetworkFeeInfo networkFeeInfo) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(networkFeeInfo, "");
        return new C31332lry(jsonElement, str, networkFeeInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31332lry)) {
            return false;
        }
        C31332lry c31332lry = (C31332lry) obj;
        return Intrinsics.EZpvd(this.EZpvd, c31332lry.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c31332lry.AEQbTJ) && this.OLrzqt == c31332lry.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.EZpvd.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UpdateAccountInfo(serverOption=" + this.EZpvd + ", uopHash=" + this.AEQbTJ + ", networkFeeInfo=" + this.OLrzqt + ")";
    }

    public C31332lry(@NotNull JsonElement jsonElement, @NotNull java.lang.String str, @NotNull NetworkFeeInfo networkFeeInfo) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(networkFeeInfo, "");
        this.EZpvd = jsonElement;
        this.AEQbTJ = str;
        this.OLrzqt = networkFeeInfo;
    }
}
