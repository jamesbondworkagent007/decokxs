package com.okinc.business.market.features.coindetail_liquidity;

import com.google.gson.Gson;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.Json;
import o.C27672jzc;
import o.C27673jzd;
import o.InterfaceC27595jyE;
import o.jPQ;
import o.jPR;
import o.jPS;
import o.jPU;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class LiquidityChangeModule {
    public static final LiquidityChangeModule KWHzl = new LiquidityChangeModule();

    private LiquidityChangeModule() {
    }

    public final jPR KWHzl(@NotNull Json json) {
        Intrinsics.checkNotNullParameter(json, "");
        return new jPR(json, new Gson());
    }

    public final jPU copydefault(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull jPR jpr, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(jpr, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new jPU(interfaceC27595jyE, new C27672jzc(new C27673jzd()), jpr, coroutineDispatcher);
    }

    public final jPQ OLrzqt(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new jPQ(interfaceC27595jyE, coroutineDispatcher);
    }

    public final jPS OLrzqt(@NotNull jPU jpu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(jpu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new jPS(jpu, coroutineDispatcher);
    }
}
