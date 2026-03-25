package com.amplitude.core.platform;

import kotlin.jvm.internal.Intrinsics;
import o.C5242Ke;
import o.JZ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface Plugin {

    public enum Type {
        Before,
        Enrichment,
        Destination,
        Utility,
        Observe
    }

    void AEQbTJ(@NotNull JZ jz);

    Type EZpvd();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    default C5242Ke EZpvd(@NotNull C5242Ke c5242Ke) {
        Intrinsics.checkNotNullParameter(c5242Ke, "");
        return c5242Ke;
    }

    default void KWHzl(@NotNull JZ jz) {
        Intrinsics.checkNotNullParameter(jz, "");
        AEQbTJ(jz);
    }
}
