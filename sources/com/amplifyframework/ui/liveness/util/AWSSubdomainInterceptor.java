package com.amplifyframework.ui.liveness.util;

import kotlin.jvm.internal.Intrinsics;
import o.C42459rTq;
import okhttp3.Interceptor;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSSubdomainInterceptor implements Interceptor {
    public static final int $stable = 0;
    private final String subdomainStrategy;

    public AWSSubdomainInterceptor(String str) {
        this.subdomainStrategy = str;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(@NotNull Interceptor.Chain chain) {
        String str;
        Intrinsics.checkNotNullParameter(chain, "");
        if (!C42459rTq.KWHzl.fIwbmz() || (str = this.subdomainStrategy) == null || str.length() == 0) {
            return chain.proceed(chain.request());
        }
        return chain.proceed(chain.request().newBuilder().addHeader("Subdomain-Strategy", this.subdomainStrategy).build());
    }
}
