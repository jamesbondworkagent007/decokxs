package com.okinc.business.dexui.main.swap.trade.savings.di;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C24850ilc;
import o.InterfaceC23234huQ;
import o.InterfaceC24852ile;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class SavingsModule {
    public static final SavingsModule KWHzl = new SavingsModule();

    private SavingsModule() {
    }

    public final InterfaceC24852ile EZpvd(@NotNull InterfaceC23234huQ interfaceC23234huQ, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C24850ilc(interfaceC23234huQ, coroutineDispatcher);
    }
}
