package com.okinc.dexkline.market.features.risk_control;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C34531ndo;
import o.InterfaceC32162mRu;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class RiskControlModule {
    public static final RiskControlModule OLrzqt = new RiskControlModule();

    private RiskControlModule() {
    }

    @yCR
    public final C34531ndo KWHzl(@NotNull InterfaceC32162mRu interfaceC32162mRu, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC32162mRu, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C34531ndo(interfaceC32162mRu, coroutineDispatcher);
    }
}
