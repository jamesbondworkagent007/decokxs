package com.bytedance.applog.event;

import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface IEventHandler {
    int acceptType();

    EventPolicy onReceive(int i, @NonNull String str, @NonNull JSONObject jSONObject, @NonNull EventBasicData eventBasicData);
}
