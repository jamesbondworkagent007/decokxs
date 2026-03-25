package com.okinc.dexkline.market.di;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import o.C32272mVw;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class SpModule {
    public static final SpModule AEQbTJ = new SpModule();

    private SpModule() {
    }

    @yCR
    public final C32272mVw copydefault(@NotNull Context context, @NotNull Json json, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C32272mVw(context, json, coroutineDispatcher);
    }
}
