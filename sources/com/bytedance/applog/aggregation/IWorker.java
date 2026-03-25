package com.bytedance.applog.aggregation;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public interface IWorker {
    void post(@NotNull Function0<Unit> function0);
}
