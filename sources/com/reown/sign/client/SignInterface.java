package com.reown.sign.client;

import com.reown.sign.client.Sign;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public interface SignInterface {

    /* JADX INFO: loaded from: classes17.dex */
    public interface DappDelegate {

        /* JADX INFO: loaded from: classes24.dex */
        public static final class DefaultImpls {
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void onSessionAuthenticateResponse(@NotNull DappDelegate dappDelegate, @NotNull Sign.Model.SessionAuthenticateResponse sessionAuthenticateResponse) {
                Intrinsics.checkNotNullParameter(sessionAuthenticateResponse, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void onSessionEvent(@NotNull DappDelegate dappDelegate, @NotNull Sign.Model.Event event) {
                Intrinsics.checkNotNullParameter(event, "");
            }
        }

        void onConnectionStateChange(@NotNull Sign.Model.ConnectionState connectionState);

        void onError(@NotNull Sign.Model.Error error);

        void onProposalExpired(@NotNull Sign.Model.ExpiredProposal expiredProposal);

        void onRequestExpired(@NotNull Sign.Model.ExpiredRequest expiredRequest);

        void onSessionApproved(@NotNull Sign.Model.ApprovedSession approvedSession);

        void onSessionAuthenticateResponse(@NotNull Sign.Model.SessionAuthenticateResponse sessionAuthenticateResponse);

        void onSessionDelete(@NotNull Sign.Model.DeletedSession deletedSession);

        void onSessionEvent(@NotNull Sign.Model.Event event);

        void onSessionEvent(@NotNull Sign.Model.SessionEvent sessionEvent);

        void onSessionExtend(@NotNull Sign.Model.Session session);

        void onSessionRejected(@NotNull Sign.Model.RejectedSession rejectedSession);

        void onSessionRequestResponse(@NotNull Sign.Model.SessionRequestResponse sessionRequestResponse);

        void onSessionUpdate(@NotNull Sign.Model.UpdatedSession updatedSession);
    }

    public interface WalletDelegate {

        /* JADX INFO: loaded from: classes17.dex */
        public static final class DefaultImpls {
            public static Function2<Sign.Model.SessionAuthenticate, Sign.Model.VerifyContext, Unit> getOnSessionAuthenticate(@NotNull WalletDelegate walletDelegate) {
                return null;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void onProposalExpired(@NotNull WalletDelegate walletDelegate, @NotNull Sign.Model.ExpiredProposal expiredProposal) {
                Intrinsics.checkNotNullParameter(expiredProposal, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void onRequestExpired(@NotNull WalletDelegate walletDelegate, @NotNull Sign.Model.ExpiredRequest expiredRequest) {
                Intrinsics.checkNotNullParameter(expiredRequest, "");
            }
        }

        Function2<Sign.Model.SessionAuthenticate, Sign.Model.VerifyContext, Unit> getOnSessionAuthenticate();

        void onConnectionStateChange(@NotNull Sign.Model.ConnectionState connectionState);

        void onError(@NotNull Sign.Model.Error error);

        void onProposalExpired(@NotNull Sign.Model.ExpiredProposal expiredProposal);

        void onRequestExpired(@NotNull Sign.Model.ExpiredRequest expiredRequest);

        void onSessionDelete(@NotNull Sign.Model.DeletedSession deletedSession);

        void onSessionExtend(@NotNull Sign.Model.Session session);

        void onSessionProposal(@NotNull Sign.Model.SessionProposal sessionProposal, @NotNull Sign.Model.VerifyContext verifyContext);

        void onSessionRequest(@NotNull Sign.Model.SessionRequest sessionRequest, @NotNull Sign.Model.VerifyContext verifyContext);

        void onSessionSettleResponse(@NotNull Sign.Model.SettledSessionResponse settledSessionResponse);

        void onSessionUpdateResponse(@NotNull Sign.Model.SessionUpdateResponse sessionUpdateResponse);
    }

    void approveAuthenticate(@NotNull Sign.Params.ApproveAuthenticate approveAuthenticate, @NotNull Function1<? super Sign.Params.ApproveAuthenticate, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12);

    void approveSession(@NotNull Sign.Params.Approve approve, @NotNull Function1<? super Sign.Params.Approve, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12);

    void authenticate(@NotNull Sign.Params.Authenticate authenticate, String str, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12);

    void connect(@NotNull Sign.Params.Connect connect, @NotNull Function1<? super String, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12);

    void decryptMessage(@NotNull Sign.Params.DecryptMessage decryptMessage, @NotNull Function1<? super Sign.Model.Message, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12);

    void disconnect(@NotNull Sign.Params.Disconnect disconnect, @NotNull Function1<? super Sign.Params.Disconnect, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12);

    void dispatchEnvelope(@NotNull String str, @NotNull Function1<? super Sign.Model.Error, Unit> function1);

    void emit(@NotNull Sign.Params.Emit emit, @NotNull Function1<? super Sign.Params.Emit, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12);

    void extend(@NotNull Sign.Params.Extend extend, @NotNull Function1<? super Sign.Params.Extend, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12);

    String formatAuthMessage(@NotNull Sign.Params.FormatMessage formatMessage);

    Sign.Model.Session getActiveSessionByTopic(@NotNull String str);

    List<Sign.Model.Session> getListOfActiveSessions();

    List<Sign.Model.VerifyContext> getListOfVerifyContexts();

    List<Sign.Model.SessionAuthenticate> getPendingAuthenticateRequests();

    List<Sign.Model.SessionRequest> getPendingSessionRequests(@NotNull String str);

    List<Sign.Model.SessionProposal> getSessionProposals();

    Sign.Model.VerifyContext getVerifyContext(long j);

    void initialize(@NotNull Sign.Params.Init init, @NotNull Function0<Unit> function0, @NotNull Function1<? super Sign.Model.Error, Unit> function1);

    void ping(@NotNull Sign.Params.Ping ping, Sign.Listeners.SessionPing sessionPing);

    void rejectAuthenticate(@NotNull Sign.Params.RejectAuthenticate rejectAuthenticate, @NotNull Function1<? super Sign.Params.RejectAuthenticate, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12);

    void rejectSession(@NotNull Sign.Params.Reject reject, @NotNull Function1<? super Sign.Params.Reject, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12);

    void request(@NotNull Sign.Params.Request request, @NotNull Function1<? super Sign.Model.SentRequest, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12);

    void respond(@NotNull Sign.Params.Response response, @NotNull Function1<? super Sign.Params.Response, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12);

    void setDappDelegate(@NotNull DappDelegate dappDelegate);

    void setWalletDelegate(@NotNull WalletDelegate walletDelegate);

    void update(@NotNull Sign.Params.Update update, @NotNull Function1<? super Sign.Params.Update, Unit> function1, @NotNull Function1<? super Sign.Model.Error, Unit> function12);

    /* JADX INFO: loaded from: classes17.dex */
    public static final class DefaultImpls {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.SignInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void initialize$default(SignInterface signInterface, Sign.Params.Init init, Function0 function0, Function1 function1, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: initialize");
            }
            if ((i & 2) != 0) {
                function0 = new Function0<Unit>() { // from class: com.reown.sign.client.SignInterface.initialize.1
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
            signInterface.initialize(init, function0, function1);
        }

        public static /* synthetic */ void authenticate$default(SignInterface signInterface, Sign.Params.Authenticate authenticate, String str, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: authenticate");
            }
            if ((i & 2) != 0) {
                str = null;
            }
            signInterface.authenticate(authenticate, str, function1, function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.SignInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void approveSession$default(SignInterface signInterface, Sign.Params.Approve approve, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: approveSession");
            }
            if ((i & 2) != 0) {
                function1 = new Function1<Sign.Params.Approve, Unit>() { // from class: com.reown.sign.client.SignInterface.approveSession.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Sign.Params.Approve approve2) {
                        Intrinsics.checkNotNullParameter(approve2, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Sign.Params.Approve approve2) {
                        invoke2(approve2);
                        return Unit.INSTANCE;
                    }
                };
            }
            signInterface.approveSession(approve, function1, function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.SignInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void rejectSession$default(SignInterface signInterface, Sign.Params.Reject reject, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rejectSession");
            }
            if ((i & 2) != 0) {
                function1 = new Function1<Sign.Params.Reject, Unit>() { // from class: com.reown.sign.client.SignInterface.rejectSession.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Sign.Params.Reject reject2) {
                        Intrinsics.checkNotNullParameter(reject2, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Sign.Params.Reject reject2) {
                        invoke2(reject2);
                        return Unit.INSTANCE;
                    }
                };
            }
            signInterface.rejectSession(reject, function1, function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.SignInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void request$default(SignInterface signInterface, Sign.Params.Request request, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
            }
            if ((i & 2) != 0) {
                function1 = new Function1<Sign.Model.SentRequest, Unit>() { // from class: com.reown.sign.client.SignInterface.request.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Sign.Model.SentRequest sentRequest) {
                        Intrinsics.checkNotNullParameter(sentRequest, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Sign.Model.SentRequest sentRequest) {
                        invoke2(sentRequest);
                        return Unit.INSTANCE;
                    }
                };
            }
            signInterface.request(request, function1, function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.SignInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void respond$default(SignInterface signInterface, Sign.Params.Response response, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: respond");
            }
            if ((i & 2) != 0) {
                function1 = new Function1<Sign.Params.Response, Unit>() { // from class: com.reown.sign.client.SignInterface.respond.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Sign.Params.Response response2) {
                        Intrinsics.checkNotNullParameter(response2, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Sign.Params.Response response2) {
                        invoke2(response2);
                        return Unit.INSTANCE;
                    }
                };
            }
            signInterface.respond(response, function1, function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.SignInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void update$default(SignInterface signInterface, Sign.Params.Update update, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: update");
            }
            if ((i & 2) != 0) {
                function1 = new Function1<Sign.Params.Update, Unit>() { // from class: com.reown.sign.client.SignInterface.update.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Sign.Params.Update update2) {
                        Intrinsics.checkNotNullParameter(update2, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Sign.Params.Update update2) {
                        invoke2(update2);
                        return Unit.INSTANCE;
                    }
                };
            }
            signInterface.update(update, function1, function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.SignInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void extend$default(SignInterface signInterface, Sign.Params.Extend extend, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: extend");
            }
            if ((i & 2) != 0) {
                function1 = new Function1<Sign.Params.Extend, Unit>() { // from class: com.reown.sign.client.SignInterface.extend.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Sign.Params.Extend extend2) {
                        Intrinsics.checkNotNullParameter(extend2, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Sign.Params.Extend extend2) {
                        invoke2(extend2);
                        return Unit.INSTANCE;
                    }
                };
            }
            signInterface.extend(extend, function1, function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.SignInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void emit$default(SignInterface signInterface, Sign.Params.Emit emit, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: emit");
            }
            if ((i & 2) != 0) {
                function1 = new Function1<Sign.Params.Emit, Unit>() { // from class: com.reown.sign.client.SignInterface.emit.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Sign.Params.Emit emit2) {
                        Intrinsics.checkNotNullParameter(emit2, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Sign.Params.Emit emit2) {
                        invoke2(emit2);
                        return Unit.INSTANCE;
                    }
                };
            }
            signInterface.emit(emit, function1, function12);
        }

        public static /* synthetic */ void ping$default(SignInterface signInterface, Sign.Params.Ping ping, Sign.Listeners.SessionPing sessionPing, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ping");
            }
            if ((i & 2) != 0) {
                sessionPing = null;
            }
            signInterface.ping(ping, sessionPing);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.sign.client.SignInterface */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void disconnect$default(SignInterface signInterface, Sign.Params.Disconnect disconnect, Function1 function1, Function1 function12, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: disconnect");
            }
            if ((i & 2) != 0) {
                function1 = new Function1<Sign.Params.Disconnect, Unit>() { // from class: com.reown.sign.client.SignInterface.disconnect.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Sign.Params.Disconnect disconnect2) {
                        Intrinsics.checkNotNullParameter(disconnect2, "");
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Sign.Params.Disconnect disconnect2) {
                        invoke2(disconnect2);
                        return Unit.INSTANCE;
                    }
                };
            }
            signInterface.disconnect(disconnect, function1, function12);
        }
    }
}
