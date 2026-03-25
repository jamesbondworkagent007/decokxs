package org.koin.core.error;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class DefinitionOverrideException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefinitionOverrideException(@NotNull String str) {
        super(str);
        Intrinsics.checkNotNullParameter(str, "");
    }
}
