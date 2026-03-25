package o;

import com.okinc.components.track.ABTestManager;
import org.json.JSONObject;

/* JADX INFO: renamed from: o.mDu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C31784mDu {
    public static final C31784mDu AEQbTJ = new C31784mDu();

    private C31784mDu() {
    }

    public final JSONObject KWHzl() {
        JSONObject jSONObjectEZpvd = EZpvd("onshore_page_cache_android_v3");
        C43296rmc.AEQbTJ("OKCRCore-PageCache", C33129mqd.gEmmrt(jSONObjectEZpvd));
        return jSONObjectEZpvd;
    }

    public final long copydefault() {
        JSONObject jSONObjectKWHzl = KWHzl();
        if (jSONObjectKWHzl == null || !jSONObjectKWHzl.has("default_ttl") || jSONObjectKWHzl.getLong("default_ttl") <= 0) {
            return 0L;
        }
        return jSONObjectKWHzl.getLong("default_ttl");
    }

    public final JSONObject EZpvd(java.lang.String str) {
        java.lang.Object payload$default = ABTestManager.getPayload$default(ABTestManager.AEQbTJ, str, null, 2, null);
        if (payload$default instanceof JSONObject) {
            return (JSONObject) payload$default;
        }
        return null;
    }
}
