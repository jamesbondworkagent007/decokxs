package com.okinc.remote.config;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class StrategyData {
    public static final int $stable = 8;
    private Valid valid = new Valid();
    private Object strategy = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Object getStrategy() {
        return this.strategy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Valid getValid() {
        return this.valid;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrategy(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        this.strategy = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValid(@NotNull Valid valid) {
        Intrinsics.checkNotNullParameter(valid, "");
        this.valid = valid;
    }
}
