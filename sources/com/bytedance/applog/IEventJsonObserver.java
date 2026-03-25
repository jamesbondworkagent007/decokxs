package com.bytedance.applog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface IEventJsonObserver {
    void eventJson(@NonNull String str, @Nullable JSONObject jSONObject);

    void launchJson(@Nullable JSONObject jSONObject);

    void pageJson(@Nullable JSONObject jSONObject, boolean z);
}
