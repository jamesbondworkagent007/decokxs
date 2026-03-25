package com.okinc.business.trade.features.home.meme.di;

import kotlin.jvm.internal.Intrinsics;
import o.C28272kVg;
import o.C28280kVo;
import o.InterfaceC23234huQ;
import o.InterfaceC28273kVh;
import o.InterfaceC28274kVi;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TradeRepositoryModule {
    public static final TradeRepositoryModule copydefault = new TradeRepositoryModule();

    private TradeRepositoryModule() {
    }

    @yCR
    public final InterfaceC28274kVi KWHzl(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        return new C28280kVo(interfaceC23234huQ);
    }

    @yCR
    public final InterfaceC28273kVh EZpvd(@NotNull InterfaceC23234huQ interfaceC23234huQ) {
        Intrinsics.checkNotNullParameter(interfaceC23234huQ, "");
        return new C28272kVg(interfaceC23234huQ);
    }
}
