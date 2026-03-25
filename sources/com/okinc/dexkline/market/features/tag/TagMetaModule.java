package com.okinc.dexkline.market.features.tag;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C34537ndu;
import o.InterfaceC32260mVk;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class TagMetaModule {
    public static final TagMetaModule EZpvd = new TagMetaModule();

    private TagMetaModule() {
    }

    @yCR
    public final C34537ndu AEQbTJ(@NotNull InterfaceC32260mVk interfaceC32260mVk, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC32260mVk, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C34537ndu(interfaceC32260mVk, coroutineDispatcher);
    }
}
