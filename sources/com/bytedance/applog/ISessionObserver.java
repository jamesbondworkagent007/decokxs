package com.bytedance.applog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface ISessionObserver {
    void onSessionBatchEvent(long j, @NonNull String str, @Nullable JSONObject jSONObject);

    void onSessionStart(long j, @NonNull String str);

    void onSessionTerminate(long j, @NonNull String str, @Nullable JSONObject jSONObject);
}
