package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.tgf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C46941tgf {
    public java.lang.Object AEQbTJ;
    public java.lang.String KWHzl;
    public java.lang.String OLrzqt;
    public JSONObject copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C46941tgf copy$default(C46941tgf c46941tgf, java.lang.String str, java.lang.Object obj, java.lang.String str2, JSONObject jSONObject, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = c46941tgf.OLrzqt;
        }
        if ((i & 2) != 0) {
            obj = c46941tgf.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str2 = c46941tgf.KWHzl;
        }
        if ((i & 8) != 0) {
            jSONObject = c46941tgf.copydefault;
        }
        return c46941tgf.KWHzl(str, obj, str2, jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C46941tgf KWHzl(@NotNull java.lang.String str, java.lang.Object obj, java.lang.String str2, @NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jSONObject, "");
        return new C46941tgf(str, obj, str2, jSONObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JSONObject KWHzl() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.Object OLrzqt() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String copydefault() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C46941tgf)) {
            return false;
        }
        C46941tgf c46941tgf = (C46941tgf) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c46941tgf.OLrzqt) && Intrinsics.EZpvd(this.AEQbTJ, c46941tgf.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c46941tgf.KWHzl) && Intrinsics.EZpvd(this.copydefault, c46941tgf.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.OLrzqt.hashCode();
        java.lang.Object obj = this.AEQbTJ;
        int iHashCode2 = obj == null ? 0 : obj.hashCode();
        java.lang.String str = this.KWHzl;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "OKPushMessage(msgAction=" + this.OLrzqt + ", notificationMsg=" + this.AEQbTJ + ", schemaUrl=" + this.KWHzl + ", pushJson=" + this.copydefault + ")";
    }

    public C46941tgf(@NotNull java.lang.String str, java.lang.Object obj, java.lang.String str2, @NotNull JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(jSONObject, "");
        this.OLrzqt = str;
        this.AEQbTJ = obj;
        this.KWHzl = str2;
        this.copydefault = jSONObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r1v0 java.lang.String))
  (wrap:java.lang.Object:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Object) : (r2v0 java.lang.Object))
  (r3v0 java.lang.String)
  (r4v0 org.json.JSONObject)
 A[MD:(java.lang.String, java.lang.Object, java.lang.String, org.json.JSONObject):void (m)] (LINE:10) call: o.tgf.<init>(java.lang.String, java.lang.Object, java.lang.String, org.json.JSONObject):void type: THIS */
    public /* synthetic */ C46941tgf(java.lang.String str, java.lang.Object obj, java.lang.String str2, JSONObject jSONObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : obj, str2, jSONObject);
    }
}
