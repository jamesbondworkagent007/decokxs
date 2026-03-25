package org.koin.core.error;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class InstanceCreationException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstanceCreationException(@NotNull String str, @NotNull Exception exc) {
        super(str, exc);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(exc, "");
    }
}
