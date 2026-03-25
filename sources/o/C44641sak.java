package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sak, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44641sak {

    @SerializedName("businessIdentity")
    private final java.lang.String businessIdentity;

    @SerializedName("type")
    private final int type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C44641sak copy$default(C44641sak c44641sak, java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            str = c44641sak.businessIdentity;
        }
        if ((i2 & 2) != 0) {
            i = c44641sak.type;
        }
        return c44641sak.EZpvd(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.businessIdentity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C44641sak EZpvd(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C44641sak(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44641sak)) {
            return false;
        }
        C44641sak c44641sak = (C44641sak) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.businessIdentity, (java.lang.Object) c44641sak.businessIdentity) && this.type == c44641sak.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.businessIdentity.hashCode() * 31) + java.lang.Integer.hashCode(this.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "NotificationPushInfo(businessIdentity=" + this.businessIdentity + ", type=" + this.type + ")";
    }

    public C44641sak(@NotNull java.lang.String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.businessIdentity = str;
        this.type = i;
    }
}
