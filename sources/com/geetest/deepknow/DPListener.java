package com.geetest.deepknow;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes17.dex */
public interface DPListener {
    void onSessionResult(JSONObject jSONObject);

    void onSessionStatus(boolean z);
}
