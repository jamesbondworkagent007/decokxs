package com.okinc.business.market.di;

import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import o.C25996jOb;
import o.C25997jOc;
import o.C26212jWb;
import o.C26284jYt;
import o.C26285jYu;
import o.C26288jYx;
import o.C26290jYz;
import o.C27592jyB;
import o.C27613jyW;
import o.C27631jyo;
import o.C27637jyu;
import o.C27640jyx;
import o.C28622keJ;
import o.C28625keM;
import o.C28626keN;
import o.C28627keO;
import o.C28628keP;
import o.C28903kjZ;
import o.C28987klD;
import o.C29253kqE;
import o.C29293kqs;
import o.C29455ktv;
import o.C29726kzA;
import o.InterfaceC23229huL;
import o.InterfaceC23234huQ;
import o.InterfaceC25998jOd;
import o.InterfaceC27595jyE;
import o.InterfaceC27611jyU;
import o.InterfaceC27628jyl;
import o.InterfaceC27636jyt;
import o.InterfaceC28692kfa;
import o.InterfaceC28697kff;
import o.InterfaceC28699kfh;
import o.InterfaceC28700kfi;
import o.InterfaceC28701kfj;
import o.InterfaceC28901kjX;
import o.InterfaceC29035klz;
import o.InterfaceC29249kqA;
import o.InterfaceC29294kqt;
import o.InterfaceC29449ktp;
import o.InterfaceC29729kzD;
import o.jNV;
import o.jNW;
import o.jQJ;
import o.jQK;
import o.jQL;
import o.jQM;
import o.jRM;
import o.jRO;
import o.jRT;
import o.jRU;
import o.jVZ;
import o.jYA;
import o.jYB;
import o.jYG;
import o.kAM;
import o.kAY;
import o.yCL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class RepositoryModule {
    public static final RepositoryModule OLrzqt = new RepositoryModule();

    private RepositoryModule() {
    }

    public final jYA KWHzl(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull C26285jYu c26285jYu, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(c26285jYu, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C26284jYt(interfaceC23229huL, c26285jYu, c27640jyx, coroutineDispatcher);
    }

    public final jYG copydefault(@yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        return new C26290jYz(c27640jyx, new C27592jyB());
    }

    public final jYB EZpvd(@yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        return new C26288jYx(c27640jyx);
    }

    public final InterfaceC27636jyt EZpvd(@NotNull InterfaceC23229huL interfaceC23229huL) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        return new C27637jyu(interfaceC23229huL);
    }

    public final InterfaceC28901kjX KWHzl(@NotNull InterfaceC23229huL interfaceC23229huL, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        return new C28903kjZ(interfaceC23229huL, c27640jyx);
    }

    public final C26285jYu copydefault(@NotNull Json json) {
        Intrinsics.checkNotNullParameter(json, "");
        return new C26285jYu(json, new Gson());
    }

    public final InterfaceC27628jyl KWHzl(@NotNull InterfaceC27595jyE interfaceC27595jyE, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(json, "");
        return new C27631jyo(interfaceC27595jyE, c27640jyx, json);
    }

    public final jNW OLrzqt(@NotNull InterfaceC27595jyE interfaceC27595jyE) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        return new jNW(interfaceC27595jyE);
    }

    public final InterfaceC27611jyU AEQbTJ(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        return new C27613jyW(interfaceC23234huQ);
    }

    public final InterfaceC29449ktp AEQbTJ(@NotNull InterfaceC23229huL interfaceC23229huL) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        return new C29455ktv(interfaceC23229huL);
    }

    public final jQJ OLrzqt(@NotNull InterfaceC23229huL interfaceC23229huL) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        return new jQK(interfaceC23229huL);
    }

    public final InterfaceC29035klz KWHzl(@NotNull InterfaceC27595jyE interfaceC27595jyE) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        return new C28987klD(interfaceC27595jyE);
    }

    public final jQL KWHzl(@NotNull InterfaceC23229huL interfaceC23229huL) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        return new jQM(interfaceC23229huL);
    }

    public final jVZ AEQbTJ(@NotNull InterfaceC27595jyE interfaceC27595jyE) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        return new C26212jWb(interfaceC27595jyE);
    }

    public final InterfaceC25998jOd copydefault(@NotNull InterfaceC23229huL interfaceC23229huL, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C25996jOb(interfaceC23229huL, c27640jyx, coroutineDispatcher);
    }

    public final InterfaceC29729kzD EZpvd(@NotNull InterfaceC23229huL interfaceC23229huL, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        return new C29726kzA(interfaceC23229huL, c27640jyx, new Gson());
    }

    public final jNV copydefault(@NotNull InterfaceC23229huL interfaceC23229huL) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        return new C25997jOc(interfaceC23229huL);
    }

    public final jRU AYXKKw(@NotNull InterfaceC23229huL interfaceC23229huL) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        return new jRT(interfaceC23229huL);
    }

    public final kAM OLrzqt(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new kAY(interfaceC23229huL, coroutineDispatcher);
    }

    public final InterfaceC28700kfi AEQbTJ(@yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx2, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c27640jyx2, "");
        Intrinsics.checkNotNullParameter(json, "");
        return new C28626keN(c27640jyx, c27640jyx2, json);
    }

    public final InterfaceC28699kfh OLrzqt(@yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(json, "");
        return new C28625keM(c27640jyx, json);
    }

    public final InterfaceC28701kfj EZpvd(@yCL(AEQbTJ = "private_client") @NotNull C27640jyx c27640jyx, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(json, "");
        return new C28628keP(c27640jyx, json);
    }

    public final InterfaceC28697kff copydefault(@yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(json, "");
        return new C28627keO(c27640jyx, json);
    }

    public final InterfaceC28692kfa OLrzqt(@yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @yCL(AEQbTJ = "private_client") @NotNull C27640jyx c27640jyx2, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c27640jyx2, "");
        Intrinsics.checkNotNullParameter(json, "");
        return new C28622keJ(c27640jyx, c27640jyx2, json);
    }

    public final jRO EZpvd(@NotNull InterfaceC27595jyE interfaceC27595jyE) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        return new jRM(interfaceC27595jyE);
    }

    public final InterfaceC29249kqA AEQbTJ(@NotNull InterfaceC27595jyE interfaceC27595jyE, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(json, "");
        return new C29253kqE(interfaceC27595jyE, c27640jyx, new C27592jyB(), json);
    }

    public final InterfaceC29294kqt OLrzqt(@NotNull InterfaceC27595jyE interfaceC27595jyE, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(json, "");
        return new C29293kqs(interfaceC27595jyE, c27640jyx, json);
    }
}
