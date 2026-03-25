package com.bytedance.applog;

import androidx.annotation.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
public interface IPickerCallback {
    void failed(@Nullable String str);

    void success(@Nullable JSONObject jSONObject);
}
