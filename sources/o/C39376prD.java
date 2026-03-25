package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.prD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C39376prD {
    public static final int $stable = 0;

    @SerializedName("code")
    private final java.lang.Integer code;

    @SerializedName("color")
    private final java.lang.String color;

    @SerializedName("colorDark")
    private final java.lang.String colorDark;

    @SerializedName("name")
    private final java.lang.String name;

    @SerializedName("show")
    private final java.lang.Boolean show;

    @SerializedName("textColor")
    private final java.lang.String textColor;

    @SerializedName("textColorDark")
    private final java.lang.String textColorDark;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C39376prD copy$default(C39376prD c39376prD, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = c39376prD.code;
        }
        if ((i & 2) != 0) {
            str = c39376prD.color;
        }
        java.lang.String str6 = str;
        if ((i & 4) != 0) {
            str2 = c39376prD.colorDark;
        }
        java.lang.String str7 = str2;
        if ((i & 8) != 0) {
            str3 = c39376prD.name;
        }
        java.lang.String str8 = str3;
        if ((i & 16) != 0) {
            bool = c39376prD.show;
        }
        java.lang.Boolean bool2 = bool;
        if ((i & 32) != 0) {
            str4 = c39376prD.textColor;
        }
        java.lang.String str9 = str4;
        if ((i & 64) != 0) {
            str5 = c39376prD.textColorDark;
        }
        return c39376prD.KWHzl(num, str6, str7, str8, bool2, str9, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Integer EZpvd() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39376prD KWHzl(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.String str4, java.lang.String str5) {
        return new C39376prD(num, str, str2, str3, bool, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39376prD)) {
            return false;
        }
        C39376prD c39376prD = (C39376prD) obj;
        return Intrinsics.EZpvd(this.code, c39376prD.code) && Intrinsics.EZpvd((java.lang.Object) this.color, (java.lang.Object) c39376prD.color) && Intrinsics.EZpvd((java.lang.Object) this.colorDark, (java.lang.Object) c39376prD.colorDark) && Intrinsics.EZpvd((java.lang.Object) this.name, (java.lang.Object) c39376prD.name) && Intrinsics.EZpvd(this.show, c39376prD.show) && Intrinsics.EZpvd((java.lang.Object) this.textColor, (java.lang.Object) c39376prD.textColor) && Intrinsics.EZpvd((java.lang.Object) this.textColorDark, (java.lang.Object) c39376prD.textColorDark);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Integer num = this.code;
        int iHashCode = num == null ? 0 : num.hashCode();
        java.lang.String str = this.color;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.colorDark;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.name;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.Boolean bool = this.show;
        int iHashCode5 = bool == null ? 0 : bool.hashCode();
        java.lang.String str4 = this.textColor;
        int iHashCode6 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.textColorDark;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "ProductType(code=" + this.code + ", color=" + this.color + ", colorDark=" + this.colorDark + ", name=" + this.name + ", show=" + this.show + ", textColor=" + this.textColor + ", textColorDark=" + this.textColorDark + ")";
    }

    public C39376prD(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Boolean bool, java.lang.String str4, java.lang.String str5) {
        this.code = num;
        this.color = str;
        this.colorDark = str2;
        this.name = str3;
        this.show = bool;
        this.textColor = str4;
        this.textColorDark = str5;
    }
}
