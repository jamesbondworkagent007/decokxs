package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.aGn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5986aGn {
    public static final int $stable = 0;

    @SerializedName("credentialId")
    private final java.lang.String credentialId;

    @SerializedName("updatedName")
    private final java.lang.String updatedName;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5986aGn copy$default(C5986aGn c5986aGn, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c5986aGn.updatedName;
        }
        if ((i & 2) != 0) {
            str2 = c5986aGn.credentialId;
        }
        return c5986aGn.OLrzqt(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5986aGn OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C5986aGn(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5986aGn)) {
            return false;
        }
        C5986aGn c5986aGn = (C5986aGn) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.updatedName, (java.lang.Object) c5986aGn.updatedName) && Intrinsics.EZpvd((java.lang.Object) this.credentialId, (java.lang.Object) c5986aGn.credentialId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.updatedName.hashCode() * 31) + this.credentialId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PasskeyRenameRequest(updatedName=" + this.updatedName + ", credentialId=" + this.credentialId + ")";
    }

    public C5986aGn(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.updatedName = str;
        this.credentialId = str2;
    }
}
