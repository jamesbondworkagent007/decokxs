package com.okinc.business.market.features.tag;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C29710kyl;
import o.InterfaceC27595jyE;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class TagMetaModule {
    public static final TagMetaModule copydefault = new TagMetaModule();

    private TagMetaModule() {
    }

    @yCR
    public final C29710kyl AEQbTJ(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C29710kyl(interfaceC27595jyE, coroutineDispatcher);
    }
}
