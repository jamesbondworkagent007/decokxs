package com.amplifyframework.core.plugin;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.core.category.CategoryTypeable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public interface Plugin<E> extends CategoryTypeable {
    void configure(JSONObject jSONObject, @NonNull Context context) throws AmplifyException;

    E getEscapeHatch();

    String getPluginKey();

    String getVersion();

    void initialize(@NonNull Context context) throws AmplifyException;
}
