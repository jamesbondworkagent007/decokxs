package com.okinc.business.market.di;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import o.C27670jza;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SpModule {
    public static final SpModule copydefault = new SpModule();

    private SpModule() {
    }

    @yCR
    public final C27670jza KWHzl(@NotNull Context context, @NotNull Json json, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C27670jza(context, json, coroutineDispatcher);
    }
}
