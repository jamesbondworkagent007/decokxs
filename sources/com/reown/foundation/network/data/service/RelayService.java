package com.reown.foundation.network.data.service;

import com.reown.foundation.network.model.RelayDTO;
import kotlinx.coroutines.flow.Flow;
import o.InterfaceC58092yuk;
import o.InterfaceC58150yvp;
import o.InterfaceC58154yvt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface RelayService {
    @InterfaceC58150yvp
    void batchSubscribeRequest(@NotNull RelayDTO.BatchSubscribe.Request request);

    @InterfaceC58154yvt
    Flow<RelayDTO.BatchSubscribe.Result.Acknowledgement> observeBatchSubscribeAcknowledgement();

    @InterfaceC58154yvt
    Flow<RelayDTO.BatchSubscribe.Result.JsonRpcError> observeBatchSubscribeError();

    @InterfaceC58154yvt
    Flow<RelayDTO.Publish.Result.Acknowledgement> observePublishAcknowledgement();

    @InterfaceC58154yvt
    Flow<RelayDTO.Publish.Result.JsonRpcError> observePublishError();

    @InterfaceC58154yvt
    Flow<RelayDTO.Subscribe.Result.Acknowledgement> observeSubscribeAcknowledgement();

    @InterfaceC58154yvt
    Flow<RelayDTO.Subscribe.Result.JsonRpcError> observeSubscribeError();

    @InterfaceC58154yvt
    Flow<RelayDTO.Subscription.Request> observeSubscriptionRequest();

    @InterfaceC58154yvt
    Flow<RelayDTO.Unsubscribe.Result.Acknowledgement> observeUnsubscribeAcknowledgement();

    @InterfaceC58154yvt
    Flow<RelayDTO.Unsubscribe.Result.JsonRpcError> observeUnsubscribeError();

    @InterfaceC58154yvt
    Flow<InterfaceC58092yuk.Activity> observeWebSocketEvent();

    @InterfaceC58150yvp
    void publishRequest(@NotNull RelayDTO.Publish.Request request);

    @InterfaceC58150yvp
    void publishSubscriptionAcknowledgement(@NotNull RelayDTO.Subscription.Result.Acknowledgement acknowledgement);

    @InterfaceC58150yvp
    void subscribeRequest(@NotNull RelayDTO.Subscribe.Request request);

    @InterfaceC58150yvp
    void unsubscribeRequest(@NotNull RelayDTO.Unsubscribe.Request request);
}
