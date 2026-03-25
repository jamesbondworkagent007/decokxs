package com.okinc.business.market.features.floatwindow.di;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import o.C26235jWy;
import o.C27640jyx;
import o.C27670jza;
import o.C28433kag;
import o.C28434kah;
import o.C28440kan;
import o.InterfaceC23229huL;
import o.InterfaceC28437kak;
import o.jWB;
import o.jWL;
import o.jWM;
import o.jWQ;
import o.kKD;
import o.kKG;
import o.yCL;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class FloatWindowModule {
    public static final FloatWindowModule KWHzl = new FloatWindowModule();

    private FloatWindowModule() {
    }

    @yCL(AEQbTJ = "float_window_holdings")
    @yCR
    public final InterfaceC28437kak OLrzqt(@NotNull InterfaceC23229huL interfaceC23229huL, @yCL(AEQbTJ = "public_bg_client") @NotNull C27640jyx c27640jyx, @yCL(AEQbTJ = "public_bg_client") @NotNull C27640jyx c27640jyx2, @NotNull Json json) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(c27640jyx2, "");
        Intrinsics.checkNotNullParameter(json, "");
        return new C28440kan(interfaceC23229huL, c27640jyx, c27640jyx2, json);
    }

    @yCR
    public final C28433kag EZpvd() {
        return new C28433kag();
    }

    @yCR
    public final kKG AEQbTJ(@NotNull kKD kkd, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(kkd, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new kKG(kkd, coroutineDispatcher);
    }

    @yCL(AEQbTJ = "float_window_holdings")
    @yCR
    public final C28434kah AEQbTJ(@yCL(AEQbTJ = "float_window_holdings") @NotNull InterfaceC28437kak interfaceC28437kak, @NotNull kKG kkg, @NotNull C28433kag c28433kag, @NotNull C27670jza c27670jza, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28437kak, "");
        Intrinsics.checkNotNullParameter(kkg, "");
        Intrinsics.checkNotNullParameter(c28433kag, "");
        Intrinsics.checkNotNullParameter(c27670jza, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C28434kah(interfaceC28437kak, kkg, c28433kag, c27670jza, coroutineDispatcher);
    }

    @yCR
    public final C26235jWy copydefault(@NotNull C27670jza c27670jza, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c27670jza, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C26235jWy(c27670jza, coroutineDispatcher);
    }

    @yCR
    public final jWM OLrzqt(@NotNull C26235jWy c26235jWy, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(c26235jWy, "");
        Intrinsics.checkNotNullParameter(context, "");
        return new jWM(c26235jWy, context);
    }

    @yCR
    public final jWL EZpvd(@NotNull Context context, @NotNull jWM jwm) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(jwm, "");
        return new jWL(context, jwm);
    }

    @yCR
    public final jWQ AEQbTJ(@NotNull C26235jWy c26235jWy) {
        Intrinsics.checkNotNullParameter(c26235jWy, "");
        return new jWQ(c26235jWy);
    }

    @yCR
    public final jWB copydefault() {
        return new jWB();
    }
}
