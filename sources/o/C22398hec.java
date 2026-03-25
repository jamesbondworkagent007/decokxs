package o;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.hec, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C22398hec {
    public final java.util.List<?> AEQbTJ;
    public final java.lang.String EZpvd;
    public final JsonObject KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C22398hec() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: o.hec */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C22398hec copy$default(C22398hec c22398hec, JsonObject jsonObject, java.util.List list, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            jsonObject = c22398hec.KWHzl;
        }
        if ((i & 2) != 0) {
            list = c22398hec.AEQbTJ;
        }
        if ((i & 4) != 0) {
            str = c22398hec.EZpvd;
        }
        return c22398hec.EZpvd(jsonObject, list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C22398hec EZpvd(JsonObject jsonObject, java.util.List<?> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new C22398hec(jsonObject, list, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22398hec)) {
            return false;
        }
        C22398hec c22398hec = (C22398hec) obj;
        return Intrinsics.EZpvd(this.KWHzl, c22398hec.KWHzl) && Intrinsics.EZpvd(this.AEQbTJ, c22398hec.AEQbTJ) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c22398hec.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        JsonObject jsonObject = this.KWHzl;
        int iHashCode = jsonObject == null ? 0 : jsonObject.hashCode();
        java.util.List<?> list = this.AEQbTJ;
        return (((iHashCode * 31) + (list != null ? list.hashCode() : 0)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "TokenDetailSharePayload(tokenInfo=" + this.KWHzl + ", kline=" + this.AEQbTJ + ", accountId=" + this.EZpvd + ")";
    }

    public C22398hec(JsonObject jsonObject, java.util.List<?> list, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.KWHzl = jsonObject;
        this.AEQbTJ = list;
        this.EZpvd = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0011: CONSTRUCTOR 
  (wrap:com.google.gson.JsonObject:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null com.google.gson.JsonObject) : (r2v0 com.google.gson.JsonObject))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
 A[MD:(com.google.gson.JsonObject, java.util.List<?>, java.lang.String):void (m)] (LINE:52) call: o.hec.<init>(com.google.gson.JsonObject, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ C22398hec(JsonObject jsonObject, java.util.List list, java.lang.String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : jsonObject, (i & 2) != 0 ? null : list, (i & 4) != 0 ? "" : str);
    }

    public final java.lang.String copydefault() throws JSONException {
        if (this.KWHzl == null) {
            return C33129mqd.gEmmrt(new JSONObject());
        }
        java.util.List<?> list = this.AEQbTJ;
        if (list == null || list.isEmpty()) {
            return C33129mqd.gEmmrt(this.KWHzl);
        }
        JSONObject jSONObject = new JSONObject(C33129mqd.gEmmrt(this.KWHzl));
        jSONObject.put("kLinesData", new JSONArray((java.util.Collection) this.AEQbTJ));
        return C33129mqd.gEmmrt(jSONObject);
    }
}
