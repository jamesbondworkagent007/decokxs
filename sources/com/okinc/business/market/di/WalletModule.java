package com.okinc.business.market.di;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C23214htx;
import o.C43251rlk;
import o.InterfaceC23209hts;
import o.InterfaceC54829xWw;
import o.InterfaceC9852bdR;
import o.InterfaceC9858bdX;
import o.kKC;
import o.kKD;
import o.xWP;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class WalletModule {
    public static final WalletModule OLrzqt = new WalletModule();

    private WalletModule() {
    }

    @yCR
    public final InterfaceC9852bdR OLrzqt() {
        return (InterfaceC9852bdR) C43251rlk.copydefault(InterfaceC9852bdR.class);
    }

    @yCR
    public final InterfaceC9858bdX EZpvd() {
        return (InterfaceC9858bdX) C43251rlk.copydefault(InterfaceC9858bdX.class);
    }

    @yCR
    public final InterfaceC54829xWw KWHzl() {
        return (InterfaceC54829xWw) C43251rlk.copydefault(InterfaceC54829xWw.class);
    }

    @yCR
    public final xWP AEQbTJ() {
        return (xWP) C43251rlk.copydefault(xWP.class);
    }

    @yCR
    public final kKD KWHzl(@NotNull InterfaceC9852bdR interfaceC9852bdR, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC9852bdR, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new kKC(interfaceC9852bdR, coroutineDispatcher);
    }

    @yCR
    public final InterfaceC23209hts KWHzl(@NotNull xWP xwp) {
        Intrinsics.checkNotNullParameter(xwp, "");
        return new C23214htx(xwp);
    }
}
