package com.okinc.network.request.retrofit;

import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class TaggedCallFactory implements Call.Factory {
    public static final int $stable = 8;
    private final OkHttpClient delegate;
    private final Map<Class<?>, Function0<Object>> typedTagFactories;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.Map<java.lang.Class<?>, ? extends kotlin.jvm.functions.Function0<? extends java.lang.Object>> */
    /* JADX WARN: Multi-variable type inference failed */
    public TaggedCallFactory(@NotNull OkHttpClient okHttpClient, @NotNull Map<Class<?>, ? extends Function0<? extends Object>> map) {
        Intrinsics.checkNotNullParameter(okHttpClient, "");
        Intrinsics.checkNotNullParameter(map, "");
        this.delegate = okHttpClient;
        this.typedTagFactories = map;
    }

    @Override // okhttp3.Call.Factory
    public Call newCall(@NotNull Request request) {
        Intrinsics.checkNotNullParameter(request, "");
        Request.Builder builderNewBuilder = request.newBuilder();
        for (Map.Entry<Class<?>, Function0<Object>> entry : this.typedTagFactories.entrySet()) {
            Class<?> key = entry.getKey();
            Function0<Object> value = entry.getValue();
            try {
                Intrinsics.copydefault(key, "");
                if (request.tag(key) == null) {
                    builderNewBuilder.tag(key, value.invoke());
                }
            } catch (Exception unused) {
            }
        }
        return this.delegate.newCall(builderNewBuilder.build());
    }
}
