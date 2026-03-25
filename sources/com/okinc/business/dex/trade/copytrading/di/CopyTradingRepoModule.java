package com.okinc.business.dex.trade.copytrading.di;

import kotlin.jvm.internal.Intrinsics;
import o.C19864gSd;
import o.InterfaceC19862gSb;
import o.InterfaceC23234huQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class CopyTradingRepoModule {
    public static final CopyTradingRepoModule EZpvd = new CopyTradingRepoModule();

    private CopyTradingRepoModule() {
    }

    public final InterfaceC19862gSb copydefault(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        return new C19864gSd(interfaceC23234huQ);
    }
}
