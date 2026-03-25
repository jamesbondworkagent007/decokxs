package com.reown.sign.engine.use_case.calls;

import com.reown.android.internal.common.model.SDKError;
import com.reown.sign.engine.model.EngineDO;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface SessionRequestUseCaseInterface {
    SharedFlow<SDKError> getErrors();

    Object sessionRequest(@NotNull EngineDO.Request request, @NotNull Function1<? super Long, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12, @NotNull Continuation<? super Unit> continuation);
}
