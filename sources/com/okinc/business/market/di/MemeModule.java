package com.okinc.business.market.di;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C28623keK;
import o.C28659keu;
import o.C28732kgN;
import o.C28743kgY;
import o.C28778khG;
import o.C28800khc;
import o.C28804khg;
import o.InterfaceC23229huL;
import o.InterfaceC27595jyE;
import o.InterfaceC28619keG;
import o.InterfaceC28656ker;
import o.InterfaceC28726kgH;
import o.InterfaceC28744kgZ;
import o.InterfaceC28781khJ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class MemeModule {
    public static final MemeModule EZpvd = new MemeModule();

    private MemeModule() {
    }

    public final InterfaceC28656ker copydefault(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C28659keu(interfaceC23229huL, coroutineDispatcher);
    }

    public final InterfaceC28744kgZ copydefault(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C28743kgY(interfaceC27595jyE, coroutineDispatcher);
    }

    public final C28800khc EZpvd(@NotNull InterfaceC28744kgZ interfaceC28744kgZ, @NotNull C28804khg c28804khg, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC28744kgZ, "");
        Intrinsics.checkNotNullParameter(c28804khg, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C28800khc(interfaceC28744kgZ, c28804khg, coroutineDispatcher);
    }

    public final InterfaceC28781khJ OLrzqt(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C28778khG(interfaceC23229huL, coroutineDispatcher);
    }

    public final InterfaceC28619keG AEQbTJ(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C28623keK(interfaceC23229huL, coroutineDispatcher);
    }

    public final InterfaceC28726kgH EZpvd(@NotNull InterfaceC23229huL interfaceC23229huL, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C28732kgN(interfaceC23229huL, coroutineDispatcher);
    }
}
