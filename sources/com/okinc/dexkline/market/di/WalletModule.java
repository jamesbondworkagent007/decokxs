package com.okinc.dexkline.market.di;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C34580nek;
import o.C43251rlk;
import o.InterfaceC34581nel;
import o.InterfaceC9852bdR;
import o.xWP;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class WalletModule {
    public static final WalletModule EZpvd = new WalletModule();

    private WalletModule() {
    }

    @yCR
    public final InterfaceC9852bdR KWHzl() {
        return (InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class);
    }

    @yCR
    public final xWP copydefault() {
        return (xWP) C43251rlk.copydefault(xWP.class);
    }

    @yCR
    public final InterfaceC34581nel AEQbTJ(@NotNull InterfaceC9852bdR interfaceC9852bdR, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC9852bdR, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C34580nek(interfaceC9852bdR, coroutineDispatcher);
    }
}
