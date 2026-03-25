package com.reown.android.internal.common.model.type;

import com.reown.android.internal.common.JsonRpcResponse;
import com.reown.android.internal.common.model.EnvelopeType;
import com.reown.android.internal.common.model.IrnParams;
import com.reown.android.internal.common.model.Participants;
import com.reown.android.internal.common.model.WCRequest;
import com.reown.android.relay.WSSConnectionState;
import com.reown.foundation.common.model.Topic;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface RelayJsonRpcInteractorInterface extends JsonRpcInteractorInterface {
    void batchSubscribe(@NotNull List<String> list, @NotNull Function1<? super List<String>, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    void checkNetworkConnectivity();

    Flow<Object> getOnResubscribe();

    StateFlow<WSSConnectionState> getWssConnectionState();

    void publishJsonRpcRequest(@NotNull Topic topic, @NotNull IrnParams irnParams, @NotNull JsonRpcClientSync<?> jsonRpcClientSync, @NotNull EnvelopeType envelopeType, Participants participants, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1);

    void publishJsonRpcResponse(@NotNull Topic topic, @NotNull IrnParams irnParams, @NotNull JsonRpcResponse jsonRpcResponse, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1, Participants participants, @NotNull EnvelopeType envelopeType);

    void respondWithError(long j, @NotNull Topic topic, @NotNull Error error, @NotNull IrnParams irnParams, @NotNull EnvelopeType envelopeType, Participants participants, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1);

    void respondWithError(@NotNull WCRequest wCRequest, @NotNull Error error, @NotNull IrnParams irnParams, @NotNull EnvelopeType envelopeType, Participants participants, @NotNull Function1<? super WCRequest, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    void respondWithParams(long j, @NotNull Topic topic, @NotNull ClientParams clientParams, @NotNull IrnParams irnParams, @NotNull EnvelopeType envelopeType, Participants participants, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> function0);

    void respondWithParams(@NotNull WCRequest wCRequest, @NotNull ClientParams clientParams, @NotNull IrnParams irnParams, @NotNull EnvelopeType envelopeType, Participants participants, @NotNull Function1<? super Throwable, Unit> function1, @NotNull Function0<Unit> function0);

    void respondWithSuccess(@NotNull WCRequest wCRequest, @NotNull IrnParams irnParams, @NotNull EnvelopeType envelopeType, Participants participants);

    void subscribe(@NotNull Topic topic, @NotNull Function1<? super Topic, Unit> function1, @NotNull Function1<? super Throwable, Unit> function12);

    void unsubscribe(@NotNull Topic topic, @NotNull Function0<Unit> function0, @NotNull Function1<? super Throwable, Unit> function1);

    public static final class DefaultImpls {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void subscribe$default(RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, Topic topic, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribe");
            }
            if ((i & 2) != 0) {
                function1 = new Function1<Topic, Unit>() { // from class: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface.subscribe.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Topic topic2) {
                        Intrinsics.checkNotNullParameter(topic2, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Topic topic2) {
                        invoke2(topic2);
                        return Unit.INSTANCE;
                    }
                };
            }
            if ((i & 4) != 0) {
                function12 = new Function1<Throwable, Unit>() { // from class: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface.subscribe.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Throwable th) {
                        Intrinsics.checkNotNullParameter(th, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }
                };
            }
            relayJsonRpcInteractorInterface.subscribe(topic, function1, function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void batchSubscribe$default(RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, List list, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: batchSubscribe");
            }
            if ((i & 2) != 0) {
                function1 = new Function1<List<? extends String>, Unit>() { // from class: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface.batchSubscribe.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull List<String> list2) {
                        Intrinsics.checkNotNullParameter(list2, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends String> list2) {
                        invoke2((List<String>) list2);
                        return Unit.INSTANCE;
                    }
                };
            }
            if ((i & 4) != 0) {
                function12 = new Function1<Throwable, Unit>() { // from class: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface.batchSubscribe.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Throwable th) {
                        Intrinsics.checkNotNullParameter(th, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }
                };
            }
            relayJsonRpcInteractorInterface.batchSubscribe(list, function1, function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void unsubscribe$default(RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, Topic topic, Function0 function0, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unsubscribe");
            }
            if ((i & 2) != 0) {
                function0 = new Function0<Unit>() { // from class: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface.unsubscribe.1
                    /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                };
            }
            if ((i & 4) != 0) {
                function1 = new Function1<Throwable, Unit>() { // from class: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface.unsubscribe.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Throwable th) {
                        Intrinsics.checkNotNullParameter(th, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                        invoke2(th);
                        return Unit.INSTANCE;
                    }
                };
            }
            relayJsonRpcInteractorInterface.unsubscribe(topic, function0, function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void publishJsonRpcRequest$default(RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, Topic topic, IrnParams irnParams, JsonRpcClientSync jsonRpcClientSync, EnvelopeType envelopeType, Participants participants, Function0 function0, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: publishJsonRpcRequest");
            }
            relayJsonRpcInteractorInterface.publishJsonRpcRequest(topic, irnParams, jsonRpcClientSync, (i & 8) != 0 ? EnvelopeType.ZERO : envelopeType, (i & 16) != 0 ? null : participants, (i & 32) != 0 ? new Function0<Unit>() { // from class: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface.publishJsonRpcRequest.1
                /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            } : function0, (i & 64) != 0 ? new Function1<Throwable, Unit>() { // from class: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface.publishJsonRpcRequest.2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            } : function1);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void publishJsonRpcResponse$default(RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, Topic topic, IrnParams irnParams, JsonRpcResponse jsonRpcResponse, Function0 function0, Function1 function1, Participants participants, EnvelopeType envelopeType, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: publishJsonRpcResponse");
            }
            relayJsonRpcInteractorInterface.publishJsonRpcResponse(topic, irnParams, jsonRpcResponse, (i & 8) != 0 ? new Function0<Unit>() { // from class: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface.publishJsonRpcResponse.1
                /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            } : function0, (i & 16) != 0 ? new Function1<Throwable, Unit>() { // from class: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface.publishJsonRpcResponse.2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            } : function1, (i & 32) != 0 ? null : participants, (i & 64) != 0 ? EnvelopeType.ZERO : envelopeType);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void respondWithParams$default(RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, WCRequest wCRequest, ClientParams clientParams, IrnParams irnParams, EnvelopeType envelopeType, Participants participants, Function1 function1, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: respondWithParams");
            }
            relayJsonRpcInteractorInterface.respondWithParams(wCRequest, clientParams, irnParams, (i & 8) != 0 ? EnvelopeType.ZERO : envelopeType, (i & 16) != 0 ? null : participants, function1, (i & 64) != 0 ? new Function0<Unit>() { // from class: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface.respondWithParams.1
                /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            } : function0);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void respondWithParams$default(RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, long j, Topic topic, ClientParams clientParams, IrnParams irnParams, EnvelopeType envelopeType, Participants participants, Function1 function1, Function0 function0, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: respondWithParams");
            }
            relayJsonRpcInteractorInterface.respondWithParams(j, topic, clientParams, irnParams, (i & 16) != 0 ? EnvelopeType.ZERO : envelopeType, (i & 32) != 0 ? null : participants, function1, (i & 128) != 0 ? new Function0<Unit>() { // from class: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface.respondWithParams.2
                /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            } : function0);
        }

        public static /* synthetic */ void respondWithSuccess$default(RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, WCRequest wCRequest, IrnParams irnParams, EnvelopeType envelopeType, Participants participants, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: respondWithSuccess");
            }
            if ((i & 4) != 0) {
                envelopeType = EnvelopeType.ZERO;
            }
            if ((i & 8) != 0) {
                participants = null;
            }
            relayJsonRpcInteractorInterface.respondWithSuccess(wCRequest, irnParams, envelopeType, participants);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void respondWithError$default(RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, WCRequest wCRequest, Error error, IrnParams irnParams, EnvelopeType envelopeType, Participants participants, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: respondWithError");
            }
            relayJsonRpcInteractorInterface.respondWithError(wCRequest, error, irnParams, (i & 8) != 0 ? EnvelopeType.ZERO : envelopeType, (i & 16) != 0 ? null : participants, (i & 32) != 0 ? new Function1<WCRequest, Unit>() { // from class: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface.respondWithError.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull WCRequest wCRequest2) {
                    Intrinsics.checkNotNullParameter(wCRequest2, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(WCRequest wCRequest2) {
                    invoke2(wCRequest2);
                    return Unit.INSTANCE;
                }
            } : function1, (i & 64) != 0 ? new Function1<Throwable, Unit>() { // from class: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface.respondWithError.2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            } : function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void respondWithError$default(RelayJsonRpcInteractorInterface relayJsonRpcInteractorInterface, long j, Topic topic, Error error, IrnParams irnParams, EnvelopeType envelopeType, Participants participants, Function0 function0, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: respondWithError");
            }
            relayJsonRpcInteractorInterface.respondWithError(j, topic, error, irnParams, (i & 16) != 0 ? EnvelopeType.ZERO : envelopeType, (i & 32) != 0 ? null : participants, (i & 64) != 0 ? new Function0<Unit>() { // from class: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface.respondWithError.3
                /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            } : function0, (i & 128) != 0 ? new Function1<Throwable, Unit>() { // from class: com.reown.android.internal.common.model.type.RelayJsonRpcInteractorInterface.respondWithError.4
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Throwable th) {
                    Intrinsics.checkNotNullParameter(th, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }
            } : function1);
        }
    }
}
