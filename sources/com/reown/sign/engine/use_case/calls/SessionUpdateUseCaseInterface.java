package com.reown.sign.engine.use_case.calls;

import com.reown.sign.engine.model.EngineDO;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface SessionUpdateUseCaseInterface {
    Object sessionUpdate(@NotNull String str, @NotNull Map<String, EngineDO.Namespace.Session> map, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation);
}
