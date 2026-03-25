package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5994aGv {
    public static final int $stable = 0;

    @SerializedName("credentialId")
    private final java.lang.String credentialId;

    @SerializedName("unlockToken")
    private final java.lang.String unlockToken;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5994aGv copy$default(C5994aGv c5994aGv, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c5994aGv.credentialId;
        }
        if ((i & 2) != 0) {
            str2 = c5994aGv.unlockToken;
        }
        return c5994aGv.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5994aGv OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C5994aGv(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5994aGv)) {
            return false;
        }
        C5994aGv c5994aGv = (C5994aGv) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.credentialId, (java.lang.Object) c5994aGv.credentialId) && Intrinsics.EZpvd((java.lang.Object) this.unlockToken, (java.lang.Object) c5994aGv.unlockToken);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.credentialId.hashCode() * 31) + this.unlockToken.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "UnlinkBody(credentialId=" + this.credentialId + ", unlockToken=" + this.unlockToken + ")";
    }

    public C5994aGv(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.credentialId = str;
        this.unlockToken = str2;
    }
}
