package o;

import com.okinc.components.track.ABTestManager;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.rhO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43017rhO {
    public static final C43017rhO EZpvd = new C43017rhO();

    private C43017rhO() {
    }

    public final boolean KWHzl(@NotNull java.lang.String str) {
        JSONArray jSONArrayOptJSONArray;
        Intrinsics.checkNotNullParameter(str, "");
        ABTestManager aBTestManager = ABTestManager.AEQbTJ;
        if (Intrinsics.EZpvd((java.lang.Object) ABTestManager.getValue$default(aBTestManager, "mobile_infra_miniapp_not_use_embedded", null, 2, null), (java.lang.Object) DebugKt.DEBUG_PROPERTY_VALUE_ON)) {
            java.lang.Object payload$default = ABTestManager.getPayload$default(aBTestManager, "mobile_infra_miniapp_not_use_embedded", null, 2, null);
            pUU.EZpvd("MiniAppFeatureFlag", "shouldRemoveEmbeddedMiniApp payload: " + payload$default);
            if (!(payload$default instanceof JSONObject) || (jSONArrayOptJSONArray = ((JSONObject) payload$default).optJSONArray("appids")) == null) {
                return false;
            }
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                if (Intrinsics.EZpvd((java.lang.Object) jSONArrayOptJSONArray.getString(i), (java.lang.Object) str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
