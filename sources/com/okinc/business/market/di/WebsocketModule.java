package com.okinc.business.market.di;

import kotlin.jvm.internal.Intrinsics;
import o.C27640jyx;
import o.C43251rlk;
import o.C57567ykp;
import o.InterfaceC9859bdY;
import o.yCL;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class WebsocketModule {
    public static final WebsocketModule OLrzqt = new WebsocketModule();

    private WebsocketModule() {
    }

    @yCR
    public final InterfaceC9859bdY copydefault() {
        return (InterfaceC9859bdY) C43251rlk.copydefault(InterfaceC9859bdY.class);
    }

    @yCL(AEQbTJ = "private_connection")
    @yCR
    public final C57567ykp KWHzl(@NotNull InterfaceC9859bdY interfaceC9859bdY) {
        Intrinsics.checkNotNullParameter(interfaceC9859bdY, "");
        return interfaceC9859bdY.values();
    }

    @yCL(AEQbTJ = "public_connection")
    @yCR
    public final C57567ykp OLrzqt(@NotNull InterfaceC9859bdY interfaceC9859bdY) {
        Intrinsics.checkNotNullParameter(interfaceC9859bdY, "");
        return InterfaceC9859bdY.Application.walletPublicConnection$default(interfaceC9859bdY, false, 1, null);
    }

    @yCL(AEQbTJ = "public_connection_background")
    @yCR
    public final C57567ykp copydefault(@NotNull InterfaceC9859bdY interfaceC9859bdY) {
        Intrinsics.checkNotNullParameter(interfaceC9859bdY, "");
        return interfaceC9859bdY.KWHzl(true);
    }

    @yCL(AEQbTJ = "public_client")
    public final C27640jyx AEQbTJ(@yCL(AEQbTJ = "public_connection") @NotNull C57567ykp c57567ykp) {
        Intrinsics.checkNotNullParameter(c57567ykp, "");
        return new C27640jyx(c57567ykp);
    }

    @yCL(AEQbTJ = "public_bg_client")
    public final C27640jyx KWHzl(@yCL(AEQbTJ = "public_connection_background") @NotNull C57567ykp c57567ykp) {
        Intrinsics.checkNotNullParameter(c57567ykp, "");
        return new C27640jyx(c57567ykp);
    }

    @yCL(AEQbTJ = "private_client")
    public final C27640jyx copydefault(@yCL(AEQbTJ = "private_connection") @NotNull C57567ykp c57567ykp) {
        Intrinsics.checkNotNullParameter(c57567ykp, "");
        return new C27640jyx(c57567ykp);
    }
}
