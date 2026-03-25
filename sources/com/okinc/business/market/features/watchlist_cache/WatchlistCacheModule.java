package com.okinc.business.market.features.watchlist_cache;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C27781kDc;
import o.InterfaceC27595jyE;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class WatchlistCacheModule {
    public static final WatchlistCacheModule AEQbTJ = new WatchlistCacheModule();

    private WatchlistCacheModule() {
    }

    @yCR
    public final C27781kDc AEQbTJ(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C27781kDc(interfaceC27595jyE, coroutineDispatcher);
    }
}
