package com.okinc.business.market.features.position;

import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import o.C27640jyx;
import o.C28440kan;
import o.C29131knp;
import o.C29134kns;
import o.C29135knt;
import o.C29137knv;
import o.C29139knx;
import o.InterfaceC23229huL;
import o.InterfaceC27595jyE;
import o.InterfaceC28437kak;
import o.InterfaceC29130kno;
import o.InterfaceC29132knq;
import o.InterfaceC29133knr;
import o.InterfaceC9859bdY;
import o.yCL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class PositionModule {
    public static final PositionModule OLrzqt = new PositionModule();

    private PositionModule() {
    }

    public final C29137knv OLrzqt(@NotNull Json json) {
        Intrinsics.checkNotNullParameter(json, "");
        return new C29137knv(json, new Gson());
    }

    public final InterfaceC29132knq KWHzl(@NotNull InterfaceC27595jyE interfaceC27595jyE, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @NotNull C29137knv c29137knv) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c29137knv, "");
        return new C29139knx(interfaceC27595jyE, c27640jyx, c29137knv);
    }

    public final C29135knt KWHzl(@NotNull Json json) {
        Intrinsics.checkNotNullParameter(json, "");
        return new C29135knt(json, new Gson());
    }

    public final InterfaceC29133knr EZpvd(@NotNull InterfaceC27595jyE interfaceC27595jyE, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @NotNull C29135knt c29135knt) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c29135knt, "");
        return new C29134kns(interfaceC27595jyE, c27640jyx, c29135knt);
    }

    public final InterfaceC29130kno AEQbTJ(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull InterfaceC9859bdY interfaceC9859bdY, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(interfaceC9859bdY, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C29131knp(interfaceC27595jyE, interfaceC9859bdY, coroutineDispatcher);
    }

    public final InterfaceC28437kak OLrzqt(@NotNull InterfaceC23229huL interfaceC23229huL, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx2, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c27640jyx2, "");
        Intrinsics.checkNotNullParameter(json, "");
        return new C28440kan(interfaceC23229huL, c27640jyx, c27640jyx2, json);
    }
}
