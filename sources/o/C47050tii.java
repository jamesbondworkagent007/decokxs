package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.tii, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C47050tii {
    public static final ActionBar Companion = new ActionBar(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String OLrzqt;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C47050tii() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ C47050tii copy$default(C47050tii c47050tii, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = c47050tii.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = c47050tii.EZpvd;
        }
        if ((i & 4) != 0) {
            str3 = c47050tii.OLrzqt;
        }
        if ((i & 8) != 0) {
            str4 = c47050tii.AEQbTJ;
        }
        return c47050tii.AEQbTJ(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C47050tii AEQbTJ(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return new C47050tii(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47050tii)) {
            return false;
        }
        C47050tii c47050tii = (C47050tii) obj;
        return Intrinsics.EZpvd((java.lang.Object) this.copydefault, (java.lang.Object) c47050tii.copydefault) && Intrinsics.EZpvd((java.lang.Object) this.EZpvd, (java.lang.Object) c47050tii.EZpvd) && Intrinsics.EZpvd((java.lang.Object) this.OLrzqt, (java.lang.Object) c47050tii.OLrzqt) && Intrinsics.EZpvd((java.lang.Object) this.AEQbTJ, (java.lang.Object) c47050tii.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        java.lang.String str = this.copydefault;
        int iHashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.EZpvd;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.OLrzqt;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public java.lang.String toString() {
        return "AppSignatures(subject=" + this.copydefault + ", serialNum=" + this.EZpvd + ", sigAlg=" + this.OLrzqt + ", md5=" + this.AEQbTJ + ")";
    }

    public C47050tii(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.copydefault = str;
        this.EZpvd = str2;
        this.OLrzqt = str3;
        this.AEQbTJ = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:6) call: o.tii.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C47050tii(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public final JSONObject OLrzqt() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        java.lang.String str = this.copydefault;
        if (str != null && str.length() != 0) {
            jSONObject.put("subject", this.copydefault);
        }
        java.lang.String str2 = this.EZpvd;
        if (str2 != null && str2.length() != 0) {
            jSONObject.put("serialNum", this.EZpvd);
        }
        java.lang.String str3 = this.OLrzqt;
        if (str3 != null && str3.length() != 0) {
            jSONObject.put("sigAlg", this.OLrzqt);
        }
        java.lang.String str4 = this.AEQbTJ;
        if (str4 != null && str4.length() != 0) {
            jSONObject.put("md5", this.AEQbTJ);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: o.tii$ActionBar */
    public static final class ActionBar {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.tii.ActionBar.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ ActionBar(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private ActionBar() {
        }
    }
}
