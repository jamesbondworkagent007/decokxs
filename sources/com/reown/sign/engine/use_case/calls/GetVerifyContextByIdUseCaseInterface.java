package com.reown.sign.engine.use_case.calls;

import com.reown.sign.engine.model.EngineDO;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface GetVerifyContextByIdUseCaseInterface {
    Object getVerifyContext(long j, @NotNull Continuation<? super EngineDO.VerifyContext> continuation);
}
