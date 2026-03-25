package com.amplitude.experiment.evaluation;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CycleException extends RuntimeException {
    private final Set<String> cycle;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Set<String> getCycle() {
        return this.cycle;
    }

    public CycleException(@NotNull Set<String> set) {
        Intrinsics.checkNotNullParameter(set, "");
        this.cycle = set;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Detected a cycle between flags " + this.cycle;
    }
}
