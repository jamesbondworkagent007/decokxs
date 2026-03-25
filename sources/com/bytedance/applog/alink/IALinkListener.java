package com.bytedance.applog.alink;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface IALinkListener {
    void onALinkData(JSONObject jSONObject, Exception exc);

    void onAttributionData(JSONObject jSONObject, Exception exc);

    void onAttributionFailedCallback(Exception exc);
}
