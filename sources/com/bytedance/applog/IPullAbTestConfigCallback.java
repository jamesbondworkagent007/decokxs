package com.bytedance.applog;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public interface IPullAbTestConfigCallback {
    void onRemoteConfig(@Nullable JSONObject jSONObject);

    void onThrottle(long j);

    void onTimeoutError();
}
