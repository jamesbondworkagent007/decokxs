package com.okinc.okimcore.feature.agentbot.remote;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.feature.agentbot.model.InitAgentBotRequest;
import com.okinc.okimcore.feature.agentbot.model.InitAgentBotResponse;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes10.dex */
public interface AgentBotApiService {
    @POST("/priapi/v1/assistant/session/init")
    Object initAgentBotSession(@Body @NotNull InitAgentBotRequest initAgentBotRequest, @NotNull Continuation<? super ResponseData<InitAgentBotResponse>> continuation);
}
