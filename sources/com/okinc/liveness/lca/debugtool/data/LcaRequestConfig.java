package com.okinc.liveness.lca.debugtool.data;

import kotlin.jvm.internal.Intrinsics;
import o.C43280rmM;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class LcaRequestConfig extends C43280rmM {
    public static final int $stable = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LcaRequestConfig(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // o.C43280rmM
    public OkHttpClient.Builder initClientBuilder() {
        OkHttpClient.Builder builderInitClientBuilder = super.initClientBuilder();
        builderInitClientBuilder.addInterceptor(new LcaDebugInterceptor());
        return builderInitClientBuilder;
    }
}
