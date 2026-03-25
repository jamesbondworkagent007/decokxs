package com.okinc.business.dex.tee.di;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C19732gNg;
import o.InterfaceC19729gNd;
import o.InterfaceC23225huH;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class TeeLimitModule {
    public static final TeeLimitModule EZpvd = new TeeLimitModule();

    private TeeLimitModule() {
    }

    @yCR
    public final InterfaceC19729gNd KWHzl(@NotNull InterfaceC23225huH interfaceC23225huH, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23225huH, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C19732gNg(interfaceC23225huH, coroutineDispatcher);
    }
}
