package com.okinc.okimcore.feature.conversation.repository.remote.inhouseim;

import com.okinc.network.okg.response.ResponseData;
import com.okinc.okimcore.model.remote.ConversationListRequest;
import com.okinc.okimcore.model.remote.DeleteConversationRequest;
import com.okinc.okimcore.model.remote.DeleteConversationResponse;
import com.okinc.okimcore.model.remote.EmptyResponse;
import com.okinc.okimcore.model.remote.MarkReadRequest;
import com.okinc.okimcore.model.remote.ResultDataResponse;
import com.okinc.okimcore.model.remote.UpdateConversationReq;
import com.okinc.okimcore.model.room.inhouseim.InHouseIMServerConversationResponse;
import java.util.List;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

/* JADX INFO: loaded from: classes10.dex */
public interface InHouseIMConversationService {
    @POST("/priapi/v1/im/conversation/v1/delete-conversation")
    Object deleteConversation(@Body @NotNull DeleteConversationRequest deleteConversationRequest, @NotNull Continuation<? super ResponseData<DeleteConversationResponse>> continuation);

    @POST("/priapi/v1/im/conversation/v1/list")
    Object getConversationsById(@Body @NotNull ConversationListRequest conversationListRequest, @NotNull Continuation<? super ResponseData<List<InHouseIMServerConversationResponse>>> continuation);

    @POST("/priapi/v1/im/conversation/v1/list-temp")
    Object getConversationsByIdNonLogin(@Body @NotNull ConversationListRequest conversationListRequest, @Header("im-token") String str, @NotNull Continuation<? super ResponseData<List<InHouseIMServerConversationResponse>>> continuation);

    @POST("/priapi/v1/im/conversation/v1/mark-read")
    Object markRead(@Body @NotNull MarkReadRequest markReadRequest, @NotNull Continuation<? super ResponseData<EmptyResponse>> continuation);

    @POST("/priapi/v1/im/conversation/v1/update")
    Object updateConversation(@Body @NotNull UpdateConversationReq updateConversationReq, @NotNull Continuation<? super ResponseData<ResultDataResponse>> continuation);
}
