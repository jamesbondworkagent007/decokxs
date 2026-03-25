package com.okinc.dexkline.market.di;

import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import o.C32259mVj;
import o.C32261mVl;
import o.C32268mVs;
import o.C32371mZn;
import o.C34378nau;
import o.C34381nax;
import o.InterfaceC32162mRu;
import o.InterfaceC32256mVg;
import o.InterfaceC32260mVk;
import o.InterfaceC32263mVn;
import o.InterfaceC32369mZl;
import o.InterfaceC34383naz;
import o.mWF;
import o.mWI;
import o.mWJ;
import o.mXN;
import o.mXO;
import o.mXP;
import o.mXV;
import o.yCL;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class RepositoryModule {
    public static final RepositoryModule AEQbTJ = new RepositoryModule();

    private RepositoryModule() {
    }

    public final InterfaceC32256mVg KWHzl(@NotNull InterfaceC32162mRu interfaceC32162mRu) {
        Intrinsics.checkNotNullParameter(interfaceC32162mRu, "");
        return new C32259mVj(interfaceC32162mRu);
    }

    public final C34378nau OLrzqt(@NotNull Json json) {
        Intrinsics.checkNotNullParameter(json, "");
        return new C34378nau(json, new Gson());
    }

    public final mWJ AEQbTJ(@NotNull InterfaceC32260mVk interfaceC32260mVk) {
        Intrinsics.checkNotNullParameter(interfaceC32260mVk, "");
        return new mWJ(interfaceC32260mVk);
    }

    public final InterfaceC32263mVn KWHzl() {
        return new C32268mVs();
    }

    public final mXO AEQbTJ(@NotNull InterfaceC32162mRu interfaceC32162mRu) {
        Intrinsics.checkNotNullParameter(interfaceC32162mRu, "");
        return new mXN(interfaceC32162mRu);
    }

    public final InterfaceC34383naz copydefault(@NotNull InterfaceC32260mVk interfaceC32260mVk) {
        Intrinsics.checkNotNullParameter(interfaceC32260mVk, "");
        return new C34381nax(interfaceC32260mVk);
    }

    public final mXP copydefault(@NotNull InterfaceC32162mRu interfaceC32162mRu) {
        Intrinsics.checkNotNullParameter(interfaceC32162mRu, "");
        return new mXV(interfaceC32162mRu);
    }

    public final InterfaceC32369mZl EZpvd(@NotNull InterfaceC32162mRu interfaceC32162mRu) {
        Intrinsics.checkNotNullParameter(interfaceC32162mRu, "");
        return new C32371mZn(interfaceC32162mRu);
    }

    public final mWI AEQbTJ(@NotNull InterfaceC32162mRu interfaceC32162mRu, @yCL(AEQbTJ = "kline_public_client") @NotNull C32261mVl c32261mVl, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC32162mRu, "");
        Intrinsics.checkNotNullParameter(c32261mVl, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new mWF(interfaceC32162mRu, c32261mVl, coroutineDispatcher);
    }
}
