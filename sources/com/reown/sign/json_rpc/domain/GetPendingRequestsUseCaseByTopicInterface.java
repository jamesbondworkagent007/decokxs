package com.reown.sign.json_rpc.domain;

import com.reown.foundation.common.model.Topic;
import com.reown.sign.common.model.Request;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface GetPendingRequestsUseCaseByTopicInterface {
    Object getPendingRequests(@NotNull Topic topic, @NotNull Continuation<? super List<Request<String>>> continuation);
}
