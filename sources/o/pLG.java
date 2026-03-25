package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pLG {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: app, reason: collision with root package name */
    @SerializedName("app")
    private final java.lang.String f1063app;

    @SerializedName("date")
    private final java.lang.String date;

    @SerializedName("os")
    private final java.lang.String os;

    @SerializedName("version")
    private final java.lang.String version;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ pLG copy$default(pLG plg, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = plg.f1063app;
        }
        if ((i & 2) != 0) {
            str2 = plg.os;
        }
        if ((i & 4) != 0) {
            str3 = plg.version;
        }
        if ((i & 8) != 0) {
            str4 = plg.date;
        }
        return plg.AEQbTJ(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final pLG AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new pLG(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pLG)) {
            return false;
        }
        pLG plg = (pLG) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.f1063app, (java.lang.Object) plg.f1063app) && Intrinsics.EZpvd((java.lang.Object) this.os, (java.lang.Object) plg.os) && Intrinsics.EZpvd((java.lang.Object) this.version, (java.lang.Object) plg.version) && Intrinsics.EZpvd((java.lang.Object) this.date, (java.lang.Object) plg.date);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.f1063app.hashCode() * 31) + this.os.hashCode()) * 31) + this.version.hashCode()) * 31) + this.date.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AppInfo(app=" + this.f1063app + ", os=" + this.os + ", version=" + this.version + ", date=" + this.date + ")";
    }

    public pLG(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.f1063app = str;
        this.os = str2;
        this.version = str3;
        this.date = str4;
    }
}
