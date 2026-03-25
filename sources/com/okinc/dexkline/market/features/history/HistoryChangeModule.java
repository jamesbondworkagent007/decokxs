package com.okinc.dexkline.market.features.history;

import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import o.C32261mVl;
import o.C32374mZq;
import o.C32378mZu;
import o.C32381mZx;
import o.C34539ndw;
import o.InterfaceC32260mVk;
import o.yCL;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class HistoryChangeModule {
    public static final HistoryChangeModule EZpvd = new HistoryChangeModule();

    private HistoryChangeModule() {
    }

    @yCR
    public final C32374mZq OLrzqt(@NotNull Json json, @NotNull C34539ndw c34539ndw) {
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(c34539ndw, "");
        return new C32374mZq(json, new Gson(), c34539ndw);
    }

    public final C32378mZu AEQbTJ(@NotNull InterfaceC32260mVk interfaceC32260mVk, @NotNull C32374mZq c32374mZq, @yCL(AEQbTJ = "kline_public_client") @NotNull C32261mVl c32261mVl, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC32260mVk, "");
        Intrinsics.checkNotNullParameter(c32374mZq, "");
        Intrinsics.checkNotNullParameter(c32261mVl, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C32378mZu(interfaceC32260mVk, c32374mZq, c32261mVl, coroutineDispatcher);
    }

    @yCR
    public final C32381mZx EZpvd(@NotNull InterfaceC32260mVk interfaceC32260mVk, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC32260mVk, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C32381mZx(interfaceC32260mVk, coroutineDispatcher);
    }
}
