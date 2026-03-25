package org.koin.core.error;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class ScopeNotCreatedException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopeNotCreatedException(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
