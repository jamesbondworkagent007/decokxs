package com.reown.sign.engine.use_case.calls;

import com.reown.sign.engine.model.EngineDO;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface FormatAuthenticateMessageUseCaseInterface {
    Object formatMessage(@NotNull EngineDO.PayloadParams payloadParams, @NotNull String str, @NotNull Continuation<? super String> continuation) throws Exception;
}
