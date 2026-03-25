package com.amplifyframework.api.aws.sigv4;

import com.amplifyframework.api.ApiException;

/* JADX INFO: loaded from: classes21.dex */
@FunctionalInterface
public interface AuthProvider {
    String getLatestAuthToken() throws ApiException;
}
