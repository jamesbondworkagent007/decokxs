package com.okinc.business.market.di;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import o.C27612jyV;
import o.C27670jza;
import o.yCR;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class JwtRepoModule {
    public static final JwtRepoModule KWHzl = new JwtRepoModule();

    private JwtRepoModule() {
    }

    @yCR
    public final C27612jyV OLrzqt(@NotNull C27670jza c27670jza, @NotNull CoroutineDispatcher coroutineDispatcher) {
        Intrinsics.checkNotNullParameter(c27670jza, "");
        Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        return new C27612jyV(c27670jza, coroutineDispatcher);
    }
}
