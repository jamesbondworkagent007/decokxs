package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.aGx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5996aGx {
    public static final int $stable = 0;

    @SerializedName("authCode")
    private final java.lang.String authCode;

    @SerializedName("authType")
    private final java.lang.String authType;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5996aGx copy$default(C5996aGx c5996aGx, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c5996aGx.authType;
        }
        if ((i & 2) != 0) {
            str2 = c5996aGx.authCode;
        }
        return c5996aGx.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5996aGx EZpvd(java.lang.String str, java.lang.String str2) {
        return new C5996aGx(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5996aGx)) {
            return false;
        }
        C5996aGx c5996aGx = (C5996aGx) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.authType, (java.lang.Object) c5996aGx.authType) && Intrinsics.EZpvd((java.lang.Object) this.authCode, (java.lang.Object) c5996aGx.authCode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.authType;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.authCode;
        return (iHashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UnlockTokenWithoutFidoRequestBody(authType=" + this.authType + ", authCode=" + this.authCode + ")";
    }

    public C5996aGx(java.lang.String str, java.lang.String str2) {
        this.authType = str;
        this.authCode = str2;
    }
}
