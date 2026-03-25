package com.reown.android.internal.common.model;

import com.reown.android.internal.common.model.type.EngineEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SDKError implements EngineEvent {
    public final Throwable exception;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Throwable getException() {
        return this.exception;
    }

    public SDKError(@NotNull Throwable th) {
        Intrinsics.checkNotNullParameter(th, "");
        this.exception = th;
    }
}
