package com.okinc.business.market.di;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C25650jBg;
import o.C28586kda;
import o.C28603kdr;
import o.C29161koS;
import o.C29444ktk;
import o.InterfaceC23229huL;
import o.InterfaceC25651jBh;
import o.InterfaceC27595jyE;
import o.InterfaceC29159koQ;
import o.InterfaceC29443ktj;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class RepositorySingletonModule {
    public static final RepositorySingletonModule AEQbTJ = new RepositorySingletonModule();

    private RepositorySingletonModule() {
    }

    @yCR
    public final InterfaceC29443ktj copydefault(@NotNull InterfaceC23229huL interfaceC23229huL) {
        Intrinsics.checkNotNullParameter(interfaceC23229huL, "");
        return new C29444ktk(interfaceC23229huL);
    }

    public final InterfaceC25651jBh copydefault(@NotNull InterfaceC27595jyE interfaceC27595jyE, @NotNull C28603kdr c28603kdr, @NotNull C28586kda c28586kda, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        Intrinsics.checkNotNullParameter(c28603kdr, "");
        Intrinsics.checkNotNullParameter(c28586kda, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C25650jBg(interfaceC27595jyE, c28603kdr, c28586kda, coroutineDispatcher);
    }

    @yCR
    public final InterfaceC29159koQ OLrzqt(@NotNull InterfaceC27595jyE interfaceC27595jyE) {
        Intrinsics.checkNotNullParameter(interfaceC27595jyE, "");
        return new C29161koS(interfaceC27595jyE);
    }
}
