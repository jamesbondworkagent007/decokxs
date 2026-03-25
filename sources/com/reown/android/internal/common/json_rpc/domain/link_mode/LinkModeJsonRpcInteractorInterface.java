package com.reown.android.internal.common.json_rpc.domain.link_mode;

import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.model.EnvelopeType;
import com.reown.android.internal.common.model.Participants;
import com.reown.android.internal.common.model.type.JsonRpcClientSync;
import com.reown.android.internal.common.model.type.JsonRpcInteractorInterface;
import com.reown.foundation.common.model.Topic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface LinkModeJsonRpcInteractorInterface extends JsonRpcInteractorInterface {
    void dispatchEnvelope(@NotNull String str);

    void triggerRequest(@NotNull JsonRpcClientSync<?> jsonRpcClientSync, @NotNull Topic topic, @NotNull String str, @NotNull EnvelopeType envelopeType);

    void triggerResponse(@NotNull Topic topic, @NotNull JsonRpcResponse jsonRpcResponse, @NotNull String str, Participants participants, @NotNull EnvelopeType envelopeType);

    public static final class DefaultImpls {
        public static /* synthetic */ void triggerRequest$default(LinkModeJsonRpcInteractorInterface linkModeJsonRpcInteractorInterface, JsonRpcClientSync jsonRpcClientSync, Topic topic, String str, EnvelopeType envelopeType, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: triggerRequest");
            }
            if ((i & 8) != 0) {
                envelopeType = EnvelopeType.ZERO;
            }
            linkModeJsonRpcInteractorInterface.triggerRequest(jsonRpcClientSync, topic, str, envelopeType);
        }

        public static /* synthetic */ void triggerResponse$default(LinkModeJsonRpcInteractorInterface linkModeJsonRpcInteractorInterface, Topic topic, JsonRpcResponse jsonRpcResponse, String str, Participants participants, EnvelopeType envelopeType, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: triggerResponse");
            }
            if ((i & 8) != 0) {
                participants = null;
            }
            Participants participants2 = participants;
            if ((i & 16) != 0) {
                envelopeType = EnvelopeType.ZERO;
            }
            linkModeJsonRpcInteractorInterface.triggerResponse(topic, jsonRpcResponse, str, participants2, envelopeType);
        }
    }
}
