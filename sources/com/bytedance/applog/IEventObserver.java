package com.bytedance.applog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface IEventObserver {
    void onEvent(@NonNull String str, @NonNull String str2, String str3, long j, long j2, String str4);

    void onEventV3(@NonNull String str, @Nullable JSONObject jSONObject);
}
