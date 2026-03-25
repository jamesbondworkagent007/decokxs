package com.bytedance.applog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface IDataObserver {
    void onAbVidsChange(@NonNull String str, @NonNull String str2);

    void onIdLoaded(@NonNull String str, @NonNull String str2, @NonNull String str3);

    void onRemoteAbConfigGet(boolean z, @NonNull JSONObject jSONObject);

    void onRemoteConfigGet(boolean z, @Nullable JSONObject jSONObject);

    void onRemoteIdGet(boolean z, @Nullable String str, @NonNull String str2, @NonNull String str3, @NonNull String str4, @NonNull String str5, @NonNull String str6);
}
