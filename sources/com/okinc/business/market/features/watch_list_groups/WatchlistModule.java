package com.okinc.business.market.features.watch_list_groups;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C27774kCw;
import o.InterfaceC27595jyE;
import o.InterfaceC27771kCt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistModule {
    public static final WatchlistModule AEQbTJ = new WatchlistModule();

    private WatchlistModule() {
    }

    public final InterfaceC27771kCt copydefault(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C27774kCw(interfaceC27595jyE, coroutineDispatcher);
    }
}
