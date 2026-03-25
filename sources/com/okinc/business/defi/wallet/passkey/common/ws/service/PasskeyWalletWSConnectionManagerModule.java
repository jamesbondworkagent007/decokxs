package com.okinc.business.defi.wallet.passkey.common.ws.service;

import kotlin.jvm.internal.Intrinsics;
import o.C17660fNo;
import o.C43292rmY;
import o.InterfaceC47278tmy;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class PasskeyWalletWSConnectionManagerModule {
    public static final PasskeyWalletWSConnectionManagerModule EZpvd = new PasskeyWalletWSConnectionManagerModule();

    private PasskeyWalletWSConnectionManagerModule() {
    }

    @yCR
    public final C17660fNo OLrzqt(@NotNull InterfaceC47278tmy interfaceC47278tmy) {
        Intrinsics.checkNotNullParameter(interfaceC47278tmy, "");
        C43292rmY c43292rmY = C43292rmY.OLrzqt;
        return new C17660fNo(interfaceC47278tmy, c43292rmY.zuBGHE() + "/ws/v5/iprivate", c43292rmY.AxsJAY() + "/ws/v5/ipublic", null, 8, null);
    }
}
