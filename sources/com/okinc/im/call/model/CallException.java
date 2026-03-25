package com.okinc.im.call.model;

import kotlin.jvm.internal.Intrinsics;
import o.AbstractC35221nrI;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class CallException extends Exception {
    public static final int $stable = 0;
    private final AbstractC35221nrI error;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AbstractC35221nrI getError() {
        return this.error;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallException(@NotNull AbstractC35221nrI abstractC35221nrI) {
        super(abstractC35221nrI.AEQbTJ());
        Intrinsics.checkNotNullParameter(abstractC35221nrI, "");
        this.error = abstractC35221nrI;
    }
}
