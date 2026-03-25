package com.bytedance.applog;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public interface IPresetEventObserver {
    void onLaunch(@Nullable JSONObject jSONObject);

    void onPageEnter(@Nullable JSONObject jSONObject);

    void onPageLeave(@Nullable JSONObject jSONObject);
}
