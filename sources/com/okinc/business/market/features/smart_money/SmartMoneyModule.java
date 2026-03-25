package com.okinc.business.market.features.smart_money;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import o.C27640jyx;
import o.C29467kuG;
import o.C29470kuJ;
import o.C29471kuK;
import o.C29474kuN;
import o.InterfaceC27595jyE;
import o.InterfaceC29466kuF;
import o.yCL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SmartMoneyModule {
    public static final SmartMoneyModule EZpvd = new SmartMoneyModule();

    private SmartMoneyModule() {
    }

    public final InterfaceC29466kuF OLrzqt(@NotNull InterfaceC27595jyE interfaceC27595jyE, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @NotNull C29474kuN c29474kuN, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c29474kuN, "");
        Intrinsics.checkNotNullParameter(json, "");
        return new C29467kuG(interfaceC27595jyE, c27640jyx, c29474kuN, json);
    }

    public final C29474kuN copydefault(@NotNull Json json) {
        Intrinsics.checkNotNullParameter(json, "");
        return new C29474kuN(json);
    }

    public final C29470kuJ EZpvd() {
        return new C29470kuJ();
    }

    public final C29471kuK copydefault() {
        return new C29471kuK();
    }
}
