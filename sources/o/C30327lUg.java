package o;

import com.okinc.buysell.util.ABTestFeatureFlag;
import com.okinc.buysell.util.PaymentFeatureFlag;
import com.okinc.components.track.ABTestManager;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.lUg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C30327lUg {
    public static final boolean OLrzqt(@NotNull PaymentFeatureFlag paymentFeatureFlag) {
        Intrinsics.checkNotNullParameter(paymentFeatureFlag, "");
        return C35202nqq.OLrzqt.AEQbTJ(paymentFeatureFlag.getTag());
    }

    public static final boolean AEQbTJ(@NotNull ABTestFeatureFlag aBTestFeatureFlag) {
        Intrinsics.checkNotNullParameter(aBTestFeatureFlag, "");
        return C59449zhJ.equals$default(ABTestManager.getValue$default(ABTestManager.AEQbTJ, aBTestFeatureFlag.getTag(), null, 2, null), "treatment", false, 2, null);
    }

    public static final boolean EZpvd() {
        java.lang.String value$default = ABTestManager.getValue$default(ABTestManager.AEQbTJ, ABTestFeatureFlag.BUY_CAMPAIGN.getTag(), null, 2, null);
        return Intrinsics.EZpvd((java.lang.Object) value$default, (java.lang.Object) "no_bottom_sheet") || Intrinsics.EZpvd((java.lang.Object) value$default, (java.lang.Object) "full_campaign");
    }

    public static final java.util.Map<java.lang.String, java.lang.Integer> OLrzqt() {
        try {
            java.lang.Object payload$default = ABTestManager.getPayload$default(ABTestManager.AEQbTJ, ABTestFeatureFlag.CR_CEDEFI_SEARCH_CAP.getTag(), null, 2, null);
            JSONObject jSONObject = payload$default instanceof JSONObject ? (JSONObject) payload$default : null;
            if (jSONObject == null) {
                return C56424yEw.KWHzl();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            java.util.Iterator<java.lang.String> itKeys = jSONObject.keys();
            Intrinsics.checkNotNullExpressionValue(itKeys, "");
            while (itKeys.hasNext()) {
                java.lang.String next = itKeys.next();
                Intrinsics.copydefault((java.lang.Object) next);
                if (C59449zhJ.startsWith$default(next, "cap", false, 2, null)) {
                    try {
                        linkedHashMap.put(next, java.lang.Integer.valueOf(jSONObject.getInt(next)));
                    } catch (JSONException unused) {
                    }
                }
            }
            return linkedHashMap;
        } catch (java.lang.Exception unused2) {
            return C56424yEw.KWHzl();
        }
    }
}
