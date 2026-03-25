package com.okinc.business.market.features.history;

import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import o.C26244jXg;
import o.C26252jXo;
import o.C26253jXp;
import o.C27640jyx;
import o.C29708kyj;
import o.InterfaceC27595jyE;
import o.yCL;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class HistoryChangeModule {
    public static final HistoryChangeModule EZpvd = new HistoryChangeModule();

    private HistoryChangeModule() {
    }

    @yCR
    public final C26244jXg copydefault(@NotNull Json json, @NotNull C29708kyj c29708kyj) {
        Intrinsics.checkNotNullParameter(json, "");
        Intrinsics.checkNotNullParameter(c29708kyj, "");
        return new C26244jXg(json, new Gson(), c29708kyj);
    }

    public final C26252jXo KWHzl(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull C26244jXg c26244jXg, @yCL(AEQbTJ = "public_client") @NotNull C27640jyx c27640jyx, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c26244jXg, "");
        Intrinsics.checkNotNullParameter(c27640jyx, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C26252jXo(interfaceC27595jyE, c26244jXg, c27640jyx, coroutineDispatcher);
    }

    @yCR
    public final C26253jXp OLrzqt(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C26253jXp(interfaceC27595jyE, coroutineDispatcher);
    }
}
