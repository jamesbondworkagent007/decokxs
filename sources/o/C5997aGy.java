package o;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.aGy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C5997aGy {
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final double OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C5997aGy copy$default(C5997aGy c5997aGy, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, double d, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c5997aGy.KWHzl;
        }
        if ((i & 2) != 0) {
            str2 = c5997aGy.AEQbTJ;
        }
        java.lang.String str5 = str2;
        if ((i & 4) != 0) {
            str3 = c5997aGy.copydefault;
        }
        java.lang.String str6 = str3;
        if ((i & 8) != 0) {
            str4 = c5997aGy.EZpvd;
        }
        java.lang.String str7 = str4;
        if ((i & 16) != 0) {
            d = c5997aGy.OLrzqt;
        }
        return c5997aGy.OLrzqt(str, str5, str6, str7, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C5997aGy OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, double d) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new C5997aGy(str, str2, str3, str4, d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5997aGy)) {
            return false;
        }
        C5997aGy c5997aGy = (C5997aGy) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c5997aGy.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c5997aGy.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c5997aGy.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c5997aGy.EZpvd) && java.lang.Double.compare(this.OLrzqt, c5997aGy.OLrzqt) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.KWHzl.hashCode() * 31) + this.AEQbTJ.hashCode()) * 31) + this.copydefault.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + java.lang.Double.hashCode(this.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "CredentialMetadataInfo(credentialId=" + this.KWHzl + ", uid=" + this.AEQbTJ + ", rpId=" + this.copydefault + ", userName=" + this.EZpvd + ", createdAt=" + this.OLrzqt + ")";
    }

    public C5997aGy(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, double d) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.KWHzl = str;
        this.AEQbTJ = str2;
        this.copydefault = str3;
        this.EZpvd = str4;
        this.OLrzqt = d;
    }

    public final java.lang.String copydefault() {
        pUU.KWHzl("NativePasskeyKeyProviderImpl", "CredentialMetadataInfo.toJson " + this.KWHzl + " " + this.AEQbTJ + " " + this.copydefault);
        java.lang.String string = new JSONObject().put("credentialId", this.KWHzl).put("uid", this.AEQbTJ).put("rpId", this.copydefault).put("userName", this.EZpvd).put("createdAt", this.OLrzqt).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
