package com.amplifyframework.auth;

import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.core.Consumer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface AWSCredentialsProvider<T extends AWSCredentials> {
    void fetchAWSCredentials(@NotNull Consumer<T> consumer, @NotNull Consumer<AuthException> consumer2);
}
