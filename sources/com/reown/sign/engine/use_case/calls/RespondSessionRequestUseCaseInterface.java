package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.model.type.EngineEvent;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface RespondSessionRequestUseCaseInterface {
    SharedFlow<EngineEvent> getEvents();

    Object respondSessionRequest(@NotNull String str, @NotNull JsonRpcResponse jsonRpcResponse, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Continuation<? super Unit> continuation);
}
