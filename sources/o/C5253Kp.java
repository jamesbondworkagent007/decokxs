package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Kp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5253Kp {
    public static final Application Companion = new Application(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;
    public final java.lang.String KWHzl;
    public final java.lang.String copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5253Kp() {
        this(null, null, null, null, 15, null);
    }

    public C5253Kp(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.copydefault = str;
        this.EZpvd = str2;
        this.KWHzl = str3;
        this.AEQbTJ = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:7) call: o.Kp.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C5253Kp(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public final JSONObject KWHzl() {
        JSONObject jSONObject = new JSONObject();
        try {
            java.lang.String str = this.copydefault;
            if (str != null && str.length() != 0) {
                jSONObject.put("branch", this.copydefault);
            }
            java.lang.String str2 = this.EZpvd;
            if (str2 != null && str2.length() != 0) {
                jSONObject.put("source", this.EZpvd);
            }
            java.lang.String str3 = this.KWHzl;
            if (str3 != null && str3.length() != 0) {
                jSONObject.put("version", this.KWHzl);
            }
            java.lang.String str4 = this.AEQbTJ;
            if (str4 != null && str4.length() != 0) {
                jSONObject.put("versionId", this.AEQbTJ);
            }
        } catch (JSONException unused) {
            C5238Ka.Companion.OLrzqt().EZpvd("JSON Serialization of tacking plan object failed");
        }
        return jSONObject;
    }

    public final C5253Kp AEQbTJ() {
        return new C5253Kp(this.copydefault, this.EZpvd, this.KWHzl, this.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.Kp$Application */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Kp.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final C5253Kp EZpvd(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            return new C5253Kp(jSONObject.optString("branch", null), jSONObject.optString("source", null), jSONObject.optString("version", null), jSONObject.optString("versionId", null));
        }
    }
}
