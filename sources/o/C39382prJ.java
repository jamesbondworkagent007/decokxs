package o;

import com.google.gson.annotations.SerializedName;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.prJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C39382prJ {
    public static final int $stable = 8;

    @SerializedName("type")
    private final java.lang.Integer type;

    @SerializedName("value")
    private final java.util.List<java.lang.String> value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.prJ */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C39382prJ copy$default(C39382prJ c39382prJ, java.lang.Integer num, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            num = c39382prJ.type;
        }
        if ((i & 2) != 0) {
            list = c39382prJ.value;
        }
        return c39382prJ.EZpvd(num, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C39382prJ EZpvd(java.lang.Integer num, java.util.List<java.lang.String> list) {
        return new C39382prJ(num, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.util.List<java.lang.String> OLrzqt() {
        return this.value;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39382prJ)) {
            return false;
        }
        C39382prJ c39382prJ = (C39382prJ) obj;
        return Intrinsics.EZpvd(this.type, c39382prJ.type) && Intrinsics.EZpvd(this.value, c39382prJ.value);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.Integer num = this.type;
        int iHashCode = num == null ? 0 : num.hashCode();
        java.util.List<java.lang.String> list = this.value;
        return (iHashCode * 31) + (list != null ? list.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "RateNum(type=" + this.type + ", value=" + this.value + ")";
    }

    public C39382prJ(java.lang.Integer num, java.util.List<java.lang.String> list) {
        this.type = num;
        this.value = list;
    }
}
