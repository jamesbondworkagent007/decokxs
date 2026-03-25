package o;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.Ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5246Ki {
    public static final Activity Companion = new Activity(null);
    public final java.lang.String AEQbTJ;
    public final java.lang.String EZpvd;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public C5246Ki() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public C5246Ki(java.lang.String str, java.lang.String str2) {
        this.EZpvd = str;
        this.AEQbTJ = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:7) call: o.Ki.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ C5246Ki(java.lang.String str, java.lang.String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }

    public final JSONObject AEQbTJ() {
        JSONObject jSONObject = new JSONObject();
        try {
            java.lang.String str = this.EZpvd;
            if (str != null && str.length() != 0) {
                jSONObject.put("source_name", this.EZpvd);
            }
            java.lang.String str2 = this.AEQbTJ;
            if (str2 != null && str2.length() != 0) {
                jSONObject.put("source_version", this.AEQbTJ);
            }
        } catch (JSONException unused) {
            C5238Ka.Companion.OLrzqt().EZpvd("JSON Serialization of ingestion metadata object failed");
        }
        return jSONObject;
    }

    public final C5246Ki copydefault() {
        return new C5246Ki(this.EZpvd, this.AEQbTJ);
    }

    /* JADX INFO: renamed from: o.Ki$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.Ki.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final C5246Ki copydefault(@NotNull JSONObject jSONObject) {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            return new C5246Ki(jSONObject.optString("source_name", null), jSONObject.optString("source_version", null));
        }
    }
}
