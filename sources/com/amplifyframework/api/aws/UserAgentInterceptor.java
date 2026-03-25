package com.amplifyframework.api.aws;

import androidx.annotation.NonNull;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Response;

/* JADX INFO: loaded from: classes21.dex */
final class UserAgentInterceptor implements Interceptor {
    private final UserAgentProvider userAgentProvider;

    public interface UserAgentProvider {
        String getUserAgent();
    }

    private UserAgentInterceptor(UserAgentProvider userAgentProvider) {
        this.userAgentProvider = userAgentProvider;
    }

    public static UserAgentInterceptor using(UserAgentProvider userAgentProvider) {
        return new UserAgentInterceptor(userAgentProvider);
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NonNull Interceptor.Chain chain) throws IOException {
        return chain.proceed(chain.request().newBuilder().header("User-Agent", this.userAgentProvider.getUserAgent()).build());
    }
}
