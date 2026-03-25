package o;

import com.google.gson.annotations.SerializedName;
import com.huawei.hms.push.constant.RemoteMessageConst;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.prp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C39412prp {
    public static final int $stable = 8;

    @SerializedName("code")
    private final java.lang.Integer code;

    @SerializedName(RemoteMessageConst.Notification.ICON)
    private final java.lang.String icon;

    @SerializedName("iconDark")
    private final java.lang.String iconDark;

    @SerializedName("name")
    private final java.lang.String name;

    @SerializedName("products")
    private final java.util.List<C39377prE> products;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: o.prp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C39412prp copy$default(C39412prp c39412prp, java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = c39412prp.code;
        }
        if ((i & 2) != 0) {
            str = c39412prp.icon;
        }
        java.lang.String str4 = str;
        if ((i & 4) != 0) {
            str2 = c39412prp.iconDark;
        }
        java.lang.String str5 = str2;
        if ((i & 8) != 0) {
            str3 = c39412prp.name;
        }
        java.lang.String str6 = str3;
        if ((i & 16) != 0) {
            list = c39412prp.products;
        }
        return c39412prp.copydefault(num, str4, str5, str6, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<C39377prE> KWHzl() {
        return this.products;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39412prp copydefault(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<C39377prE> list) {
        return new C39412prp(num, str, str2, str3, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39412prp)) {
            return false;
        }
        C39412prp c39412prp = (C39412prp) obj;
        return Intrinsics.EZpvd(this.code, c39412prp.code) && Intrinsics.EZpvd((java.lang.Object) this.icon, (java.lang.Object) c39412prp.icon) && Intrinsics.EZpvd((java.lang.Object) this.iconDark, (java.lang.Object) c39412prp.iconDark) && Intrinsics.EZpvd((java.lang.Object) this.name, (java.lang.Object) c39412prp.name) && Intrinsics.EZpvd(this.products, c39412prp.products);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Integer num = this.code;
        int iHashCode = num == null ? 0 : num.hashCode();
        java.lang.String str = this.icon;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.iconDark;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.name;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        java.util.List<C39377prE> list = this.products;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "Category(code=" + this.code + ", icon=" + this.icon + ", iconDark=" + this.iconDark + ", name=" + this.name + ", products=" + this.products + ")";
    }

    public C39412prp(java.lang.Integer num, java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<C39377prE> list) {
        this.code = num;
        this.icon = str;
        this.iconDark = str2;
        this.name = str3;
        this.products = list;
    }
}
