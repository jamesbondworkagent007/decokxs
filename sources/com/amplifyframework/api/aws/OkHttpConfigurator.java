package com.amplifyframework.api.aws;

import androidx.annotation.NonNull;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes21.dex */
@FunctionalInterface
public interface OkHttpConfigurator {
    void applyConfiguration(@NonNull OkHttpClient.Builder builder);
}
