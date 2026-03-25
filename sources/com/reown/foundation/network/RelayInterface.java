package com.reown.foundation.network;

import com.reown.foundation.network.model.Relay;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface RelayInterface {
    void batchSubscribe(@NotNull List<String> list, Long l, @NotNull Function1<? super Result<Relay.Model.Call.BatchSubscribe.Acknowledgement>, Unit> function1);

    SharedFlow<Relay.Model.Event> getEventsFlow();

    Flow<Relay.Model.Call.Subscription.Request> getSubscriptionRequest();

    boolean isLoggingEnabled();

    void publish(@NotNull String str, @NotNull String str2, @NotNull Relay.Model.IrnParams irnParams, Long l, @NotNull Function1<? super Result<Relay.Model.Call.Publish.Acknowledgement>, Unit> function1);

    void setLoggingEnabled(boolean z);

    void subscribe(@NotNull String str, Long l, @NotNull Function1<? super Result<Relay.Model.Call.Subscribe.Acknowledgement>, Unit> function1);

    void unsubscribe(@NotNull String str, @NotNull String str2, Long l, @NotNull Function1<? super Result<Relay.Model.Call.Unsubscribe.Acknowledgement>, Unit> function1);

    public static final class DefaultImpls {
        /* JADX DEBUG: Multi-variable search result rejected for r6v0, resolved type: com.reown.foundation.network.RelayInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void publish$default(RelayInterface relayInterface, String str, String str2, Relay.Model.IrnParams irnParams, Long l, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: publish");
            }
            if ((i & 8) != 0) {
                l = null;
            }
            Long l2 = l;
            if ((i & 16) != 0) {
                function1 = new Function1<Result<? extends Relay.Model.Call.Publish.Acknowledgement>, Unit>() { // from class: com.reown.foundation.network.RelayInterface.publish.1
                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m7325invoke(@NotNull Object obj2) {
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* synthetic */ Unit invoke(Result<? extends Relay.Model.Call.Publish.Acknowledgement> result) {
                        m7325invoke(result.m7386unboximpl());
                        return Unit.INSTANCE;
                    }
                };
            }
            relayInterface.publish(str, str2, irnParams, l2, function1);
        }

        public static /* synthetic */ void subscribe$default(RelayInterface relayInterface, String str, Long l, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribe");
            }
            if ((i & 2) != 0) {
                l = null;
            }
            relayInterface.subscribe(str, l, function1);
        }

        public static /* synthetic */ void batchSubscribe$default(RelayInterface relayInterface, List list, Long l, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: batchSubscribe");
            }
            if ((i & 2) != 0) {
                l = null;
            }
            relayInterface.batchSubscribe(list, l, function1);
        }

        public static /* synthetic */ void unsubscribe$default(RelayInterface relayInterface, String str, String str2, Long l, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unsubscribe");
            }
            if ((i & 4) != 0) {
                l = null;
            }
            relayInterface.unsubscribe(str, str2, l, function1);
        }
    }
}
