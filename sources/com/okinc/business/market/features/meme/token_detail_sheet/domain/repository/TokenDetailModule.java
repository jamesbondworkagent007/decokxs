package com.okinc.business.market.features.meme.token_detail_sheet.domain.repository;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C28777khF;
import o.InterfaceC27595jyE;
import o.InterfaceC28780khI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TokenDetailModule {
    public static final TokenDetailModule copydefault = new TokenDetailModule();

    private TokenDetailModule() {
    }

    public final InterfaceC28780khI OLrzqt(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C28777khF(interfaceC27595jyE, coroutineDispatcher);
    }
}
