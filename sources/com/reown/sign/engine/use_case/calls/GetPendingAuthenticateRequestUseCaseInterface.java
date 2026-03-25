package com.reown.sign.engine.use_case.calls;

import com.reown.sign.common.model.Request;
import com.reown.sign.common.model.vo.clientsync.session.params.SignParams;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface GetPendingAuthenticateRequestUseCaseInterface {
    Object getPendingAuthenticateRequests(@NotNull Continuation<? super List<Request<SignParams.SessionAuthenticateParams>>> continuation);
}
