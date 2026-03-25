package com.okinc.dexkline.market.di;

import kotlin.jvm.internal.Intrinsics;
import o.C32261mVl;
import o.C43251rlk;
import o.C57567ykp;
import o.InterfaceC9859bdY;
import o.yCL;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class WebsocketModule {
    public static final WebsocketModule AEQbTJ = new WebsocketModule();

    private WebsocketModule() {
    }

    @yCR
    public final InterfaceC9859bdY EZpvd() {
        return (InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class);
    }

    @yCL(AEQbTJ = "kline_private_connection")
    @yCR
    public final C57567ykp KWHzl(@NotNull InterfaceC9859bdY interfaceC9859bdY) {
        Intrinsics.checkNotNullParameter(interfaceC9859bdY, "");
        return interfaceC9859bdY.values();
    }

    @yCL(AEQbTJ = "kline_public_connection")
    @yCR
    public final C57567ykp EZpvd(@NotNull InterfaceC9859bdY interfaceC9859bdY) {
        Intrinsics.checkNotNullParameter(interfaceC9859bdY, "");
        return InterfaceC9859bdY.Application.walletPublicConnection$default(interfaceC9859bdY, false, 1, null);
    }

    @yCL(AEQbTJ = "kline_public_client")
    public final C32261mVl AEQbTJ(@yCL(AEQbTJ = "kline_public_connection") @NotNull C57567ykp c57567ykp) {
        Intrinsics.checkNotNullParameter(c57567ykp, "");
        return new C32261mVl(c57567ykp);
    }

    @yCL(AEQbTJ = "kline_private_client")
    public final C32261mVl OLrzqt(@yCL(AEQbTJ = "kline_private_connection") @NotNull C57567ykp c57567ykp) {
        Intrinsics.checkNotNullParameter(c57567ykp, "");
        return new C32261mVl(c57567ykp);
    }
}
