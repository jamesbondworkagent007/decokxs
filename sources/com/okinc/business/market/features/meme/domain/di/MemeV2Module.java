package com.okinc.business.market.features.meme.domain.di;

import com.okinc.business.market.features.meme.ui.MemePumpUseCase;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C28624keL;
import o.C29712kyn;
import o.InterfaceC23229huL;
import o.InterfaceC28692kfa;
import o.InterfaceC28693kfb;
import o.InterfaceC28697kff;
import o.InterfaceC28699kfh;
import o.InterfaceC28700kfi;
import o.InterfaceC28701kfj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class MemeV2Module {
    public static final MemeV2Module OLrzqt = new MemeV2Module();

    private MemeV2Module() {
    }

    public final InterfaceC28693kfb KWHzl(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C28624keL(interfaceC23229huL, coroutineDispatcher);
    }

    public final MemePumpUseCase EZpvd(@NotNull InterfaceC28693kfb interfaceC28693kfb, @NotNull InterfaceC28700kfi interfaceC28700kfi, @NotNull InterfaceC28699kfh interfaceC28699kfh, @NotNull InterfaceC28701kfj interfaceC28701kfj, @NotNull InterfaceC28697kff interfaceC28697kff, @NotNull InterfaceC28692kfa interfaceC28692kfa, @NotNull C29712kyn c29712kyn, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28693kfb, "");
        Intrinsics.checkNotNullParameter(interfaceC28700kfi, "");
        Intrinsics.checkNotNullParameter(interfaceC28699kfh, "");
        Intrinsics.checkNotNullParameter(interfaceC28701kfj, "");
        Intrinsics.checkNotNullParameter(interfaceC28697kff, "");
        Intrinsics.checkNotNullParameter(interfaceC28692kfa, "");
        Intrinsics.checkNotNullParameter(c29712kyn, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new MemePumpUseCase(interfaceC28693kfb, interfaceC28700kfi, interfaceC28699kfh, interfaceC28701kfj, interfaceC28697kff, interfaceC28692kfa, c29712kyn, coroutineDispatcher);
    }
}
