package com.reown.foundation.common;

import com.reown.foundation.network.model.Relay;
import com.reown.foundation.network.model.RelayDTO;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import o.AbstractC58082yua;
import o.C58088yug;
import o.InterfaceC58092yuk;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class RelayMapperKt {
    public static final /* synthetic */ Relay.Model.Event toRelayEvent(InterfaceC58092yuk.Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (activity instanceof InterfaceC58092yuk.Activity.TaskDescription) {
            return new Relay.Model.Event.OnConnectionOpened(((InterfaceC58092yuk.Activity.TaskDescription) activity).AEQbTJ());
        }
        if (activity instanceof InterfaceC58092yuk.Activity.C1015Activity) {
            return new Relay.Model.Event.OnMessageReceived(toRelay(((InterfaceC58092yuk.Activity.C1015Activity) activity).AEQbTJ()));
        }
        if (activity instanceof InterfaceC58092yuk.Activity.StateListAnimator) {
            return new Relay.Model.Event.OnConnectionClosing(toRelay(((InterfaceC58092yuk.Activity.StateListAnimator) activity).KWHzl()));
        }
        if (activity instanceof InterfaceC58092yuk.Activity.Application) {
            return new Relay.Model.Event.OnConnectionClosed(toRelay(((InterfaceC58092yuk.Activity.Application) activity).EZpvd()));
        }
        if (activity instanceof InterfaceC58092yuk.Activity.ActionBar) {
            return new Relay.Model.Event.OnConnectionFailed(((InterfaceC58092yuk.Activity.ActionBar) activity).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ Relay.Model.Message toRelay(AbstractC58082yua abstractC58082yua) {
        Intrinsics.checkNotNullParameter(abstractC58082yua, "");
        if (abstractC58082yua instanceof AbstractC58082yua.TaskDescription) {
            return new Relay.Model.Message.Text(((AbstractC58082yua.TaskDescription) abstractC58082yua).KWHzl());
        }
        if (abstractC58082yua instanceof AbstractC58082yua.ActionBar) {
            return new Relay.Model.Message.Bytes(((AbstractC58082yua.ActionBar) abstractC58082yua).KWHzl());
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final /* synthetic */ Relay.Model.ShutdownReason toRelay(C58088yug c58088yug) {
        Intrinsics.checkNotNullParameter(c58088yug, "");
        return new Relay.Model.ShutdownReason(c58088yug.copydefault(), c58088yug.OLrzqt());
    }

    public static final /* synthetic */ Relay.Model.Call.Subscription.Request.Params.SubscriptionData toRelay(RelayDTO.Subscription.Request.Params.SubscriptionData subscriptionData) {
        Intrinsics.checkNotNullParameter(subscriptionData, "");
        return new Relay.Model.Call.Subscription.Request.Params.SubscriptionData(subscriptionData.getTopic().getValue(), subscriptionData.getMessage(), subscriptionData.getPublishedAt(), subscriptionData.getAttestation(), subscriptionData.getTag());
    }

    public static final /* synthetic */ Relay.Model.Call.Subscription.Request.Params toRelay(RelayDTO.Subscription.Request.Params params) {
        Intrinsics.checkNotNullParameter(params, "");
        return new Relay.Model.Call.Subscription.Request.Params(params.getSubscriptionId().getId(), toRelay(params.getSubscriptionData()));
    }

    public static final /* synthetic */ Relay.Model.Call.Subscription.Request toRelay(RelayDTO.Subscription.Request request) {
        Intrinsics.checkNotNullParameter(request, "");
        return new Relay.Model.Call.Subscription.Request(request.getId(), request.getJsonrpc(), request.getMethod(), toRelay(request.getParams()));
    }

    public static final /* synthetic */ Relay.Model.Call.Publish.Acknowledgement toRelay(RelayDTO.Publish.Result.Acknowledgement acknowledgement) {
        Intrinsics.checkNotNullParameter(acknowledgement, "");
        return new Relay.Model.Call.Publish.Acknowledgement(acknowledgement.getId(), acknowledgement.getJsonrpc(), acknowledgement.getResult());
    }

    public static final /* synthetic */ Relay.Model.Call.Subscribe.Acknowledgement toRelay(RelayDTO.Subscribe.Result.Acknowledgement acknowledgement) {
        Intrinsics.checkNotNullParameter(acknowledgement, "");
        return new Relay.Model.Call.Subscribe.Acknowledgement(acknowledgement.getId(), acknowledgement.getJsonrpc(), acknowledgement.getResult().getId());
    }

    public static final /* synthetic */ Relay.Model.Call.BatchSubscribe.Acknowledgement toRelay(RelayDTO.BatchSubscribe.Result.Acknowledgement acknowledgement) {
        Intrinsics.checkNotNullParameter(acknowledgement, "");
        return new Relay.Model.Call.BatchSubscribe.Acknowledgement(acknowledgement.getId(), acknowledgement.getJsonrpc(), acknowledgement.getResult());
    }

    public static final /* synthetic */ Relay.Model.Call.Unsubscribe.Acknowledgement toRelay(RelayDTO.Unsubscribe.Result.Acknowledgement acknowledgement) {
        Intrinsics.checkNotNullParameter(acknowledgement, "");
        return new Relay.Model.Call.Unsubscribe.Acknowledgement(acknowledgement.getId(), acknowledgement.getJsonrpc(), acknowledgement.getResult());
    }
}
