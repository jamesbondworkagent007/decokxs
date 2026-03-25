package o;

import com.okinc.components.track.ABTestManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.DebugKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.mwP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33433mwP {
    public static final Activity Companion = new Activity(null);

    public boolean KWHzl() {
        try {
            return C59449zhJ.equals$default(ABTestManager.getValue$default(ABTestManager.AEQbTJ, "mobile_security_accessibility_services_check_enabled", null, 2, null), DebugKt.DEBUG_PROPERTY_VALUE_ON, false, 2, null);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public boolean copydefault() {
        try {
            return C59449zhJ.equals$default(ABTestManager.getValue$default(ABTestManager.AEQbTJ, "mobile_security_accessibility_services_check_v2_enabled", null, 2, null), DebugKt.DEBUG_PROPERTY_VALUE_ON, false, 2, null);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public boolean AEQbTJ() {
        try {
            return C59449zhJ.equals$default(ABTestManager.getValue$default(ABTestManager.AEQbTJ, "mobile_security_accessibility_services_check_oversea_enabled", null, 2, null), DebugKt.DEBUG_PROPERTY_VALUE_ON, false, 2, null);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    public java.util.List<java.lang.String> OLrzqt() {
        JSONObject jSONObject;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            ABTestManager aBTestManager = ABTestManager.AEQbTJ;
            if (C59449zhJ.equals$default(ABTestManager.getValue$default(aBTestManager, "mobile_security_accessibility_app_allowlist", null, 2, null), "accessibility_allow_list", false, 2, null) && (jSONObject = (JSONObject) ABTestManager.getPayload$default(aBTestManager, "mobile_security_accessibility_app_allowlist", null, 2, null)) != null) {
                JSONArray jSONArray = jSONObject.getJSONArray("AccessibilityAllowList");
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    arrayList.add(C33129mqd.gEmmrt(jSONArray.get(i)));
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: o.mwP$Activity */
    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: o.mwP.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }
    }
}
