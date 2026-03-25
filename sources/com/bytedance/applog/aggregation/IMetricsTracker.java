package com.bytedance.applog.aggregation;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface IMetricsTracker {
    void track(Object obj, JSONObject jSONObject);

    /* JADX INFO: loaded from: classes14.dex */
    public static final class DefaultImpls {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static /* synthetic */ void track$default(IMetricsTracker iMetricsTracker, Object obj, JSONObject jSONObject, int i, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
            }
            if ((i & 2) != 0) {
                jSONObject = null;
            }
            iMetricsTracker.track(obj, jSONObject);
        }
    }
}
