package o;

import com.google.gson.annotations.SerializedName;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.aGu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5993aGu {
    public static final int $stable = 0;

    @SerializedName(OtcExtraKeys.SESSIONID)
    private final java.lang.String sessionId;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5993aGu copy$default(C5993aGu c5993aGu, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c5993aGu.sessionId;
        }
        return c5993aGu.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5993aGu AEQbTJ(java.lang.String str) {
        return new C5993aGu(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5993aGu) && Intrinsics.EZpvd((java.lang.Object) this.sessionId, (java.lang.Object) ((C5993aGu) obj).sessionId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.sessionId;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UnlockTokenFromMfaRequestBody(sessionId=" + this.sessionId + ")";
    }

    public C5993aGu(java.lang.String str) {
        this.sessionId = str;
    }
}
