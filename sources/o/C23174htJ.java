package o;

import com.google.gson.JsonObject;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.htJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23174htJ {
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String OLrzqt;
    public final JsonObject copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C23174htJ() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C23174htJ copy$default(C23174htJ c23174htJ, java.lang.String str, java.lang.String str2, java.lang.String str3, JsonObject jsonObject, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c23174htJ.OLrzqt;
        }
        if ((i & 2) != 0) {
            str2 = c23174htJ.KWHzl;
        }
        if ((i & 4) != 0) {
            str3 = c23174htJ.EZpvd;
        }
        if ((i & 8) != 0) {
            jsonObject = c23174htJ.copydefault;
        }
        return c23174htJ.AEQbTJ(str, str2, str3, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final JsonObject AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C23174htJ AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, JsonObject jsonObject) {
        return new C23174htJ(str, str2, str3, jsonObject);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final java.lang.String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23174htJ)) {
            return false;
        }
        C23174htJ c23174htJ = (C23174htJ) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c23174htJ.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.KWHzl, (java.lang.Object) c23174htJ.KWHzl) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c23174htJ.EZpvd) && Intrinsics.EZpvd(this.copydefault, c23174htJ.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.OLrzqt;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.KWHzl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.EZpvd;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        JsonObject jsonObject = this.copydefault;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (jsonObject != null ? jsonObject.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "PushItemBean(channel=" + this.OLrzqt + ", chainId=" + this.KWHzl + ", tokenAddress=" + this.EZpvd + ", extraParams=" + this.copydefault + ")";
    }

    public C23174htJ(java.lang.String str, java.lang.String str2, java.lang.String str3, JsonObject jsonObject) {
        this.OLrzqt = str;
        this.KWHzl = str2;
        this.EZpvd = str3;
        this.copydefault = jsonObject;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:com.google.gson.JsonObject:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.google.gson.JsonObject) : (r5v0 com.google.gson.JsonObject))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.google.gson.JsonObject):void (m)] (LINE:18) call: o.htJ.<init>(java.lang.String, java.lang.String, java.lang.String, com.google.gson.JsonObject):void type: THIS */
    public /* synthetic */ C23174htJ(java.lang.String str, java.lang.String str2, java.lang.String str3, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : jsonObject);
    }
}
