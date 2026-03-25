package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rYr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C42595rYr {
    public static final int $stable = 0;

    @SerializedName("businessIdentity")
    private final java.lang.String businessIdentity;

    @SerializedName("type")
    private final java.lang.String type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C42595rYr copy$default(C42595rYr c42595rYr, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c42595rYr.businessIdentity;
        }
        if ((i & 2) != 0) {
            str2 = c42595rYr.type;
        }
        return c42595rYr.EZpvd(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C42595rYr EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new C42595rYr(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42595rYr)) {
            return false;
        }
        C42595rYr c42595rYr = (C42595rYr) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.businessIdentity, (java.lang.Object) c42595rYr.businessIdentity) && Intrinsics.EZpvd((java.lang.Object) this.type, (java.lang.Object) c42595rYr.type);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.businessIdentity.hashCode() * 31) + this.type.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PushNotificationViewedPostBody(businessIdentity=" + this.businessIdentity + ", type=" + this.type + ")";
    }

    public C42595rYr(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.businessIdentity = str;
        this.type = str2;
    }
}
