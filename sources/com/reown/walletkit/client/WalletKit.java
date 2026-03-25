package com.reown.walletkit.client;

import com.reown.android.Core;
import com.reown.android.CoreInterface;
import com.reown.android.internal.common.WalletConnectScopeKt;
import com.reown.sign.client.Sign;
import com.reown.sign.client.SignClient;
import com.reown.sign.client.utils.ApprovedNamespacesUtils;
import com.reown.sign.common.exceptions.SignClientAlreadyInitializedException;
import com.reown.walletkit.client.Wallet;
import com.reown.walletkit.client.WalletKit;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import o.C56391yDq;
import o.C56403yEb;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class WalletKit {
    public static final WalletKit INSTANCE = new WalletKit();
    public static CoreInterface coreClient;

    public interface WalletDelegate {

        public static final class DefaultImpls {
            public static Function2<Wallet.Model.SessionAuthenticate, Wallet.Model.VerifyContext, Unit> getOnSessionAuthenticate(@NotNull WalletDelegate walletDelegate) {
                return null;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void onProposalExpired(@NotNull WalletDelegate walletDelegate, @NotNull Wallet.Model.ExpiredProposal expiredProposal) {
                Intrinsics.checkNotNullParameter(expiredProposal, "");
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            public static void onRequestExpired(@NotNull WalletDelegate walletDelegate, @NotNull Wallet.Model.ExpiredRequest expiredRequest) {
                Intrinsics.checkNotNullParameter(expiredRequest, "");
            }
        }

        Function2<Wallet.Model.SessionAuthenticate, Wallet.Model.VerifyContext, Unit> getOnSessionAuthenticate();

        void onConnectionStateChange(@NotNull Wallet.Model.ConnectionState connectionState);

        void onError(@NotNull Wallet.Model.Error error);

        void onProposalExpired(@NotNull Wallet.Model.ExpiredProposal expiredProposal);

        void onRequestExpired(@NotNull Wallet.Model.ExpiredRequest expiredRequest);

        void onSessionDelete(@NotNull Wallet.Model.SessionDelete sessionDelete);

        void onSessionExtend(@NotNull Wallet.Model.Session session);

        void onSessionProposal(@NotNull Wallet.Model.SessionProposal sessionProposal, @NotNull Wallet.Model.VerifyContext verifyContext);

        void onSessionRequest(@NotNull Wallet.Model.SessionRequest sessionRequest, @NotNull Wallet.Model.VerifyContext verifyContext);

        void onSessionSettleResponse(@NotNull Wallet.Model.SettledSessionResponse settledSessionResponse);

        void onSessionUpdateResponse(@NotNull Wallet.Model.SessionUpdateResponse sessionUpdateResponse);
    }

    public final void setWalletDelegate(@NotNull final WalletDelegate walletDelegate) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(walletDelegate, "");
        final boolean z = walletDelegate.getOnSessionAuthenticate() != null;
        SignClient.INSTANCE.setWalletDelegate(new SignClient.WalletDelegate() { // from class: com.reown.walletkit.client.WalletKit$setWalletDelegate$signWalletDelegate$1
            @Override // com.reown.sign.client.SignInterface.WalletDelegate
            public Function2<Sign.Model.SessionAuthenticate, Sign.Model.VerifyContext, Unit> getOnSessionAuthenticate() {
                if (!z) {
                    return null;
                }
                final WalletKit.WalletDelegate walletDelegate2 = walletDelegate;
                return new Function2<Sign.Model.SessionAuthenticate, Sign.Model.VerifyContext, Unit>() { // from class: com.reown.walletkit.client.WalletKit$setWalletDelegate$signWalletDelegate$1$onSessionAuthenticate$1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    {
                        super(2);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Sign.Model.SessionAuthenticate sessionAuthenticate, Sign.Model.VerifyContext verifyContext) {
                        invoke2(sessionAuthenticate, verifyContext);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Sign.Model.SessionAuthenticate sessionAuthenticate, @NotNull Sign.Model.VerifyContext verifyContext) {
                        Intrinsics.checkNotNullParameter(sessionAuthenticate, "");
                        Intrinsics.checkNotNullParameter(verifyContext, "");
                        Function2<Wallet.Model.SessionAuthenticate, Wallet.Model.VerifyContext, Unit> onSessionAuthenticate = walletDelegate2.getOnSessionAuthenticate();
                        if (onSessionAuthenticate != null) {
                            onSessionAuthenticate.invoke(ClientMapperKt.toWallet(sessionAuthenticate), ClientMapperKt.toWallet(verifyContext));
                        }
                    }
                };
            }

            @Override // com.reown.sign.client.SignInterface.WalletDelegate
            public void onSessionProposal(@NotNull Sign.Model.SessionProposal sessionProposal, @NotNull Sign.Model.VerifyContext verifyContext) {
                Intrinsics.checkNotNullParameter(sessionProposal, "");
                Intrinsics.checkNotNullParameter(verifyContext, "");
                walletDelegate.onSessionProposal(ClientMapperKt.toWallet(sessionProposal), ClientMapperKt.toWallet(verifyContext));
            }

            @Override // com.reown.sign.client.SignInterface.WalletDelegate
            public void onSessionRequest(@NotNull Sign.Model.SessionRequest sessionRequest, @NotNull Sign.Model.VerifyContext verifyContext) {
                Intrinsics.checkNotNullParameter(sessionRequest, "");
                Intrinsics.checkNotNullParameter(verifyContext, "");
                walletDelegate.onSessionRequest(ClientMapperKt.toWallet(sessionRequest), ClientMapperKt.toWallet(verifyContext));
            }

            @Override // com.reown.sign.client.SignInterface.WalletDelegate
            public void onSessionDelete(@NotNull Sign.Model.DeletedSession deletedSession) {
                Intrinsics.checkNotNullParameter(deletedSession, "");
                walletDelegate.onSessionDelete(ClientMapperKt.toWallet(deletedSession));
            }

            @Override // com.reown.sign.client.SignInterface.WalletDelegate
            public void onSessionExtend(@NotNull Sign.Model.Session session) {
                Intrinsics.checkNotNullParameter(session, "");
                walletDelegate.onSessionExtend(ClientMapperKt.toWallet(session));
            }

            @Override // com.reown.sign.client.SignInterface.WalletDelegate
            public void onSessionSettleResponse(@NotNull Sign.Model.SettledSessionResponse settledSessionResponse) {
                Intrinsics.checkNotNullParameter(settledSessionResponse, "");
                walletDelegate.onSessionSettleResponse(ClientMapperKt.toWallet(settledSessionResponse));
            }

            @Override // com.reown.sign.client.SignInterface.WalletDelegate
            public void onSessionUpdateResponse(@NotNull Sign.Model.SessionUpdateResponse sessionUpdateResponse) {
                Intrinsics.checkNotNullParameter(sessionUpdateResponse, "");
                walletDelegate.onSessionUpdateResponse(ClientMapperKt.toWallet(sessionUpdateResponse));
            }

            @Override // com.reown.sign.client.SignInterface.WalletDelegate
            public void onProposalExpired(@NotNull Sign.Model.ExpiredProposal expiredProposal) {
                Intrinsics.checkNotNullParameter(expiredProposal, "");
                walletDelegate.onProposalExpired(ClientMapperKt.toWallet(expiredProposal));
            }

            @Override // com.reown.sign.client.SignInterface.WalletDelegate
            public void onRequestExpired(@NotNull Sign.Model.ExpiredRequest expiredRequest) {
                Intrinsics.checkNotNullParameter(expiredRequest, "");
                walletDelegate.onRequestExpired(ClientMapperKt.toWallet(expiredRequest));
            }

            @Override // com.reown.sign.client.SignInterface.WalletDelegate
            public void onConnectionStateChange(@NotNull Sign.Model.ConnectionState connectionState) {
                Intrinsics.checkNotNullParameter(connectionState, "");
                WalletKit.WalletDelegate walletDelegate2 = walletDelegate;
                boolean zIsAvailable = connectionState.isAvailable();
                Sign.Model.ConnectionState.Reason reason = connectionState.getReason();
                walletDelegate2.onConnectionStateChange(new Wallet.Model.ConnectionState(zIsAvailable, reason != null ? ClientMapperKt.toWallet(reason) : null));
            }

            @Override // com.reown.sign.client.SignInterface.WalletDelegate
            public void onError(@NotNull Sign.Model.Error error) {
                Intrinsics.checkNotNullParameter(error, "");
                walletDelegate.onError(new Wallet.Model.Error(error.getThrowable()));
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.walletkit.client.WalletKit */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void initialize$default(WalletKit walletKit, Wallet.Params.Init init, Function0 function0, Function1 function1, int i, Object obj) throws IllegalStateException {
        if ((i & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: com.reown.walletkit.client.WalletKit.initialize.1
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
        walletKit.initialize(init, function0, function1);
    }

    public final void initialize(@NotNull Wallet.Params.Init init, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super Wallet.Model.Error, Unit> function1) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(init, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        coreClient = init.getCore();
        SignClient.INSTANCE.initialize(new Sign.Params.Init(init.getCore()), function0, new Function1<Sign.Model.Error, Unit>() { // from class: com.reown.walletkit.client.WalletKit.initialize.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Error, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Model.Error error) {
                invoke2(error);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Model.Error error) {
                Intrinsics.checkNotNullParameter(error, "");
                if (error.getThrowable() instanceof SignClientAlreadyInitializedException) {
                    function0.invoke();
                } else {
                    function1.invoke(new Wallet.Model.Error(error.getThrowable()));
                }
            }
        });
    }

    public static /* synthetic */ void registerDeviceToken$default(WalletKit walletKit, String str, boolean z, Function0 function0, Function1 function1, int i, Object obj) throws IllegalStateException {
        if ((i & 2) != 0) {
            z = false;
        }
        walletKit.registerDeviceToken(str, z, function0, function1);
    }

    public final void registerDeviceToken(@NotNull String str, boolean z, @NotNull Function0<Unit> function0, @NotNull final Function1<? super Wallet.Model.Error, Unit> function1) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Intrinsics.checkNotNullParameter(function1, "");
        CoreInterface coreInterface = coreClient;
        if (coreInterface == null) {
            Intrinsics.gEmmrt("");
            coreInterface = null;
        }
        coreInterface.getEcho().register(str, z, function0, new Function1<Throwable, Unit>() { // from class: com.reown.walletkit.client.WalletKit.registerDeviceToken.1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Error, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable th) {
                Intrinsics.checkNotNullParameter(th, "");
                function1.invoke(new Wallet.Model.Error(th));
            }
        });
    }

    /* JADX INFO: renamed from: com.reown.walletkit.client.WalletKit$decryptMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class C20391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Wallet.Model.Error, Unit> $onError;
        public final /* synthetic */ Function1<Wallet.Model.Message, Unit> $onSuccess;
        public final /* synthetic */ Wallet.Params.DecryptMessage $params;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Message, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Error, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20391(Wallet.Params.DecryptMessage decryptMessage, Function1<? super Wallet.Model.Message, Unit> function1, Function1<? super Wallet.Model.Error, Unit> function12, Continuation<? super C20391> continuation) {
            super(2, continuation);
            this.$params = decryptMessage;
            this.$onSuccess = function1;
            this.$onError = function12;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new C20391(this.$params, this.$onSuccess, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                SignClient signClient = SignClient.INSTANCE;
                Sign.Params.DecryptMessage decryptMessage = new Sign.Params.DecryptMessage(this.$params.getTopic(), this.$params.getEncryptedMessage());
                final Function1<Wallet.Model.Message, Unit> function1 = this.$onSuccess;
                Function1<Sign.Model.Message, Unit> function12 = new Function1<Sign.Model.Message, Unit>() { // from class: com.reown.walletkit.client.WalletKit.decryptMessage.1.1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Message, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Sign.Model.Message message) {
                        invoke2(message);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Sign.Model.Message message) {
                        Intrinsics.checkNotNullParameter(message, "");
                        if (message instanceof Sign.Model.Message.SessionRequest) {
                            function1.invoke(ClientMapperKt.toWallet((Sign.Model.Message.SessionRequest) message));
                        } else if (message instanceof Sign.Model.Message.SessionProposal) {
                            function1.invoke(ClientMapperKt.toWallet((Sign.Model.Message.SessionProposal) message));
                        }
                    }
                };
                final Function1<Wallet.Model.Error, Unit> function13 = this.$onError;
                signClient.decryptMessage(decryptMessage, function12, new Function1<Sign.Model.Error, Unit>() { // from class: com.reown.walletkit.client.WalletKit.decryptMessage.1.2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Error, kotlin.Unit> */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Sign.Model.Error error) {
                        invoke2(error);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Sign.Model.Error error) {
                        Intrinsics.checkNotNullParameter(error, "");
                        function13.invoke(new Wallet.Model.Error(error.getThrowable()));
                    }
                });
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void decryptMessage(@NotNull Wallet.Params.DecryptMessage decryptMessage, @NotNull Function1<? super Wallet.Model.Message, Unit> function1, @NotNull Function1<? super Wallet.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(decryptMessage, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C20391(decryptMessage, function1, function12, null), 3, null);
    }

    /* JADX INFO: renamed from: com.reown.walletkit.client.WalletKit$dispatchEnvelope$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: loaded from: classes24.dex */
    public static final class C20431 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ Function1<Wallet.Model.Error, Unit> $onError;
        public final /* synthetic */ String $urlWithEnvelope;
        public int label;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Error, kotlin.Unit> */
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C20431(String str, Function1<? super Wallet.Model.Error, Unit> function1, Continuation<? super C20431> continuation) {
            super(2, continuation);
            this.$urlWithEnvelope = str;
            this.$onError = function1;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new C20431(this.$urlWithEnvelope, this.$onError, continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(@NotNull CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C20431) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            C56442yFn.copydefault();
            if (this.label == 0) {
                C56391yDq.AEQbTJ(obj);
                try {
                    SignClient signClient = SignClient.INSTANCE;
                    String str = this.$urlWithEnvelope;
                    final Function1<Wallet.Model.Error, Unit> function1 = this.$onError;
                    signClient.dispatchEnvelope(str, new Function1<Sign.Model.Error, Unit>() { // from class: com.reown.walletkit.client.WalletKit.dispatchEnvelope.1.1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Error, kotlin.Unit> */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(Sign.Model.Error error) {
                            invoke2(error);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Sign.Model.Error error) {
                            Intrinsics.checkNotNullParameter(error, "");
                            function1.invoke(new Wallet.Model.Error(error.getThrowable()));
                        }
                    });
                } catch (Exception e) {
                    this.$onError.invoke(new Wallet.Model.Error(e));
                }
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void dispatchEnvelope(@NotNull String str, @NotNull Function1<? super Wallet.Model.Error, Unit> function1) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function1, "");
        BuildersKt__Builders_commonKt.launch$default(WalletConnectScopeKt.getScope(), null, null, new C20431(str, function1, null), 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.walletkit.client.WalletKit */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void pair$default(WalletKit walletKit, Wallet.Params.Pair pair, Function1 function1, Function1 function12, int i, Object obj) throws IllegalStateException {
        if ((i & 2) != 0) {
            function1 = new Function1<Wallet.Params.Pair, Unit>() { // from class: com.reown.walletkit.client.WalletKit.pair.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Wallet.Params.Pair pair2) {
                    Intrinsics.checkNotNullParameter(pair2, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Wallet.Params.Pair pair2) {
                    invoke2(pair2);
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 4) != 0) {
            function12 = new Function1<Wallet.Model.Error, Unit>() { // from class: com.reown.walletkit.client.WalletKit.pair.2
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Wallet.Model.Error error) {
                    Intrinsics.checkNotNullParameter(error, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Wallet.Model.Error error) {
                    invoke2(error);
                    return Unit.INSTANCE;
                }
            };
        }
        walletKit.pair(pair, function1, function12);
    }

    public final void pair(@NotNull final Wallet.Params.Pair pair, @NotNull final Function1<? super Wallet.Params.Pair, Unit> function1, @NotNull final Function1<? super Wallet.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(pair, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        CoreInterface coreInterface = coreClient;
        if (coreInterface == null) {
            Intrinsics.gEmmrt("");
            coreInterface = null;
        }
        coreInterface.getPairing().pair(new Core.Params.Pair(pair.getUri()), new Function1<Core.Params.Pair, Unit>() { // from class: com.reown.walletkit.client.WalletKit.pair.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Params$Pair, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Core.Params.Pair pair2) {
                invoke2(pair2);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Core.Params.Pair pair2) {
                Intrinsics.checkNotNullParameter(pair2, "");
                function1.invoke(pair);
            }
        }, new Function1<Core.Model.Error, Unit>() { // from class: com.reown.walletkit.client.WalletKit.pair.4
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Error, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Core.Model.Error error) {
                invoke2(error);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Core.Model.Error error) {
                Intrinsics.checkNotNullParameter(error, "");
                function12.invoke(new Wallet.Model.Error(error.getThrowable()));
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.walletkit.client.WalletKit */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void approveSession$default(WalletKit walletKit, Wallet.Params.SessionApprove sessionApprove, Function1 function1, Function1 function12, int i, Object obj) throws IllegalStateException {
        if ((i & 2) != 0) {
            function1 = new Function1<Wallet.Params.SessionApprove, Unit>() { // from class: com.reown.walletkit.client.WalletKit.approveSession.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Wallet.Params.SessionApprove sessionApprove2) {
                    Intrinsics.checkNotNullParameter(sessionApprove2, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Wallet.Params.SessionApprove sessionApprove2) {
                    invoke2(sessionApprove2);
                    return Unit.INSTANCE;
                }
            };
        }
        walletKit.approveSession(sessionApprove, function1, function12);
    }

    public final void approveSession(@NotNull final Wallet.Params.SessionApprove sessionApprove, @NotNull final Function1<? super Wallet.Params.SessionApprove, Unit> function1, @NotNull final Function1<? super Wallet.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(sessionApprove, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        SignClient.INSTANCE.approveSession(new Sign.Params.Approve(sessionApprove.getProposerPublicKey(), ClientMapperKt.toSign(sessionApprove.getNamespaces()), sessionApprove.getRelayProtocol()), new Function1<Sign.Params.Approve, Unit>() { // from class: com.reown.walletkit.client.WalletKit.approveSession.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Params$SessionApprove, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Params.Approve approve) {
                invoke2(approve);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Params.Approve approve) {
                Intrinsics.checkNotNullParameter(approve, "");
                function1.invoke(sessionApprove);
            }
        }, new Function1<Sign.Model.Error, Unit>() { // from class: com.reown.walletkit.client.WalletKit.approveSession.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Error, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Model.Error error) {
                invoke2(error);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Model.Error error) {
                Intrinsics.checkNotNullParameter(error, "");
                function12.invoke(new Wallet.Model.Error(error.getThrowable()));
            }
        });
    }

    public final Map<String, Wallet.Model.Namespace.Session> generateApprovedNamespaces(@NotNull Wallet.Model.SessionProposal sessionProposal, @NotNull Map<String, Wallet.Model.Namespace.Session> map) throws Exception {
        Intrinsics.checkNotNullParameter(sessionProposal, "");
        Intrinsics.checkNotNullParameter(map, "");
        return ClientMapperKt.toWallet(ApprovedNamespacesUtils.generateApprovedNamespaces(ClientMapperKt.toSign(sessionProposal), ClientMapperKt.toSign(map)));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.walletkit.client.WalletKit */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void rejectSession$default(WalletKit walletKit, Wallet.Params.SessionReject sessionReject, Function1 function1, Function1 function12, int i, Object obj) throws IllegalStateException {
        if ((i & 2) != 0) {
            function1 = new Function1<Wallet.Params.SessionReject, Unit>() { // from class: com.reown.walletkit.client.WalletKit.rejectSession.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Wallet.Params.SessionReject sessionReject2) {
                    Intrinsics.checkNotNullParameter(sessionReject2, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Wallet.Params.SessionReject sessionReject2) {
                    invoke2(sessionReject2);
                    return Unit.INSTANCE;
                }
            };
        }
        walletKit.rejectSession(sessionReject, function1, function12);
    }

    public final void rejectSession(@NotNull final Wallet.Params.SessionReject sessionReject, @NotNull final Function1<? super Wallet.Params.SessionReject, Unit> function1, @NotNull final Function1<? super Wallet.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(sessionReject, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        SignClient.INSTANCE.rejectSession(new Sign.Params.Reject(sessionReject.getProposerPublicKey(), sessionReject.getReason()), new Function1<Sign.Params.Reject, Unit>() { // from class: com.reown.walletkit.client.WalletKit.rejectSession.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Params$SessionReject, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Params.Reject reject) {
                invoke2(reject);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Params.Reject reject) {
                Intrinsics.checkNotNullParameter(reject, "");
                function1.invoke(sessionReject);
            }
        }, new Function1<Sign.Model.Error, Unit>() { // from class: com.reown.walletkit.client.WalletKit.rejectSession.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Error, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Model.Error error) {
                invoke2(error);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Model.Error error) {
                Intrinsics.checkNotNullParameter(error, "");
                function12.invoke(new Wallet.Model.Error(error.getThrowable()));
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.walletkit.client.WalletKit */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void approveSessionAuthenticate$default(WalletKit walletKit, Wallet.Params.ApproveSessionAuthenticate approveSessionAuthenticate, Function1 function1, Function1 function12, int i, Object obj) throws IllegalStateException {
        if ((i & 2) != 0) {
            function1 = new Function1<Wallet.Params.ApproveSessionAuthenticate, Unit>() { // from class: com.reown.walletkit.client.WalletKit.approveSessionAuthenticate.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Wallet.Params.ApproveSessionAuthenticate approveSessionAuthenticate2) {
                    Intrinsics.checkNotNullParameter(approveSessionAuthenticate2, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Wallet.Params.ApproveSessionAuthenticate approveSessionAuthenticate2) {
                    invoke2(approveSessionAuthenticate2);
                    return Unit.INSTANCE;
                }
            };
        }
        walletKit.approveSessionAuthenticate(approveSessionAuthenticate, function1, function12);
    }

    public final void approveSessionAuthenticate(@NotNull final Wallet.Params.ApproveSessionAuthenticate approveSessionAuthenticate, @NotNull final Function1<? super Wallet.Params.ApproveSessionAuthenticate, Unit> function1, @NotNull final Function1<? super Wallet.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(approveSessionAuthenticate, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        SignClient.INSTANCE.approveAuthenticate(new Sign.Params.ApproveAuthenticate(approveSessionAuthenticate.getId(), ClientMapperKt.toSign(approveSessionAuthenticate.getAuths())), new Function1<Sign.Params.ApproveAuthenticate, Unit>() { // from class: com.reown.walletkit.client.WalletKit.approveSessionAuthenticate.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Params$ApproveSessionAuthenticate, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Params.ApproveAuthenticate approveAuthenticate) {
                invoke2(approveAuthenticate);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Params.ApproveAuthenticate approveAuthenticate) {
                Intrinsics.checkNotNullParameter(approveAuthenticate, "");
                function1.invoke(approveSessionAuthenticate);
            }
        }, new Function1<Sign.Model.Error, Unit>() { // from class: com.reown.walletkit.client.WalletKit.approveSessionAuthenticate.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Error, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Model.Error error) {
                invoke2(error);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Model.Error error) {
                Intrinsics.checkNotNullParameter(error, "");
                function12.invoke(new Wallet.Model.Error(error.getThrowable()));
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.walletkit.client.WalletKit */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void rejectSessionAuthenticate$default(WalletKit walletKit, Wallet.Params.RejectSessionAuthenticate rejectSessionAuthenticate, Function1 function1, Function1 function12, int i, Object obj) throws IllegalStateException {
        if ((i & 2) != 0) {
            function1 = new Function1<Wallet.Params.RejectSessionAuthenticate, Unit>() { // from class: com.reown.walletkit.client.WalletKit.rejectSessionAuthenticate.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Wallet.Params.RejectSessionAuthenticate rejectSessionAuthenticate2) {
                    Intrinsics.checkNotNullParameter(rejectSessionAuthenticate2, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Wallet.Params.RejectSessionAuthenticate rejectSessionAuthenticate2) {
                    invoke2(rejectSessionAuthenticate2);
                    return Unit.INSTANCE;
                }
            };
        }
        walletKit.rejectSessionAuthenticate(rejectSessionAuthenticate, function1, function12);
    }

    public final void rejectSessionAuthenticate(@NotNull final Wallet.Params.RejectSessionAuthenticate rejectSessionAuthenticate, @NotNull final Function1<? super Wallet.Params.RejectSessionAuthenticate, Unit> function1, @NotNull final Function1<? super Wallet.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(rejectSessionAuthenticate, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        SignClient.INSTANCE.rejectAuthenticate(new Sign.Params.RejectAuthenticate(rejectSessionAuthenticate.getId(), rejectSessionAuthenticate.getReason()), new Function1<Sign.Params.RejectAuthenticate, Unit>() { // from class: com.reown.walletkit.client.WalletKit.rejectSessionAuthenticate.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Params$RejectSessionAuthenticate, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Params.RejectAuthenticate rejectAuthenticate) {
                invoke2(rejectAuthenticate);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Params.RejectAuthenticate rejectAuthenticate) {
                Intrinsics.checkNotNullParameter(rejectAuthenticate, "");
                function1.invoke(rejectSessionAuthenticate);
            }
        }, new Function1<Sign.Model.Error, Unit>() { // from class: com.reown.walletkit.client.WalletKit.rejectSessionAuthenticate.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Error, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Model.Error error) {
                invoke2(error);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Model.Error error) {
                Intrinsics.checkNotNullParameter(error, "");
                function12.invoke(new Wallet.Model.Error(error.getThrowable()));
            }
        });
    }

    public final Wallet.Model.Cacao generateAuthObject(@NotNull Wallet.Model.PayloadAuthRequestParams payloadAuthRequestParams, @NotNull String str, @NotNull Wallet.Model.Cacao.Signature signature) throws Exception {
        Intrinsics.checkNotNullParameter(payloadAuthRequestParams, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(signature, "");
        return ClientMapperKt.toWallet(ApprovedNamespacesUtils.generateAuthObject(ClientMapperKt.toSign(payloadAuthRequestParams), str, ClientMapperKt.toSign(signature)));
    }

    public final Wallet.Model.PayloadAuthRequestParams generateAuthPayloadParams(@NotNull Wallet.Model.PayloadAuthRequestParams payloadAuthRequestParams, @NotNull List<String> list, @NotNull List<String> list2) throws Exception {
        Intrinsics.checkNotNullParameter(payloadAuthRequestParams, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return ClientMapperKt.toWallet(ApprovedNamespacesUtils.generateAuthPayloadParams(ClientMapperKt.toSign(payloadAuthRequestParams), list, list2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.walletkit.client.WalletKit */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateSession$default(WalletKit walletKit, Wallet.Params.SessionUpdate sessionUpdate, Function1 function1, Function1 function12, int i, Object obj) throws IllegalStateException {
        if ((i & 2) != 0) {
            function1 = new Function1<Wallet.Params.SessionUpdate, Unit>() { // from class: com.reown.walletkit.client.WalletKit.updateSession.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Wallet.Params.SessionUpdate sessionUpdate2) {
                    Intrinsics.checkNotNullParameter(sessionUpdate2, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Wallet.Params.SessionUpdate sessionUpdate2) {
                    invoke2(sessionUpdate2);
                    return Unit.INSTANCE;
                }
            };
        }
        walletKit.updateSession(sessionUpdate, function1, function12);
    }

    public final void updateSession(@NotNull final Wallet.Params.SessionUpdate sessionUpdate, @NotNull final Function1<? super Wallet.Params.SessionUpdate, Unit> function1, @NotNull final Function1<? super Wallet.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(sessionUpdate, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        SignClient.INSTANCE.update(new Sign.Params.Update(sessionUpdate.getSessionTopic(), ClientMapperKt.toSign(sessionUpdate.getNamespaces())), new Function1<Sign.Params.Update, Unit>() { // from class: com.reown.walletkit.client.WalletKit.updateSession.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Params$SessionUpdate, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Params.Update update) {
                invoke2(update);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Params.Update update) {
                Intrinsics.checkNotNullParameter(update, "");
                function1.invoke(sessionUpdate);
            }
        }, new Function1<Sign.Model.Error, Unit>() { // from class: com.reown.walletkit.client.WalletKit.updateSession.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Error, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Model.Error error) {
                invoke2(error);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Model.Error error) {
                Intrinsics.checkNotNullParameter(error, "");
                function12.invoke(new Wallet.Model.Error(error.getThrowable()));
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.walletkit.client.WalletKit */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void extendSession$default(WalletKit walletKit, Wallet.Params.SessionExtend sessionExtend, Function1 function1, Function1 function12, int i, Object obj) throws IllegalStateException {
        if ((i & 2) != 0) {
            function1 = new Function1<Wallet.Params.SessionExtend, Unit>() { // from class: com.reown.walletkit.client.WalletKit.extendSession.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Wallet.Params.SessionExtend sessionExtend2) {
                    Intrinsics.checkNotNullParameter(sessionExtend2, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Wallet.Params.SessionExtend sessionExtend2) {
                    invoke2(sessionExtend2);
                    return Unit.INSTANCE;
                }
            };
        }
        walletKit.extendSession(sessionExtend, function1, function12);
    }

    public final void extendSession(@NotNull final Wallet.Params.SessionExtend sessionExtend, @NotNull final Function1<? super Wallet.Params.SessionExtend, Unit> function1, @NotNull final Function1<? super Wallet.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(sessionExtend, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        SignClient.INSTANCE.extend(new Sign.Params.Extend(sessionExtend.getTopic()), new Function1<Sign.Params.Extend, Unit>() { // from class: com.reown.walletkit.client.WalletKit.extendSession.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Params$SessionExtend, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Params.Extend extend) {
                invoke2(extend);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Params.Extend extend) {
                Intrinsics.checkNotNullParameter(extend, "");
                function1.invoke(sessionExtend);
            }
        }, new Function1<Sign.Model.Error, Unit>() { // from class: com.reown.walletkit.client.WalletKit.extendSession.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Error, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Model.Error error) {
                invoke2(error);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Model.Error error) {
                Intrinsics.checkNotNullParameter(error, "");
                function12.invoke(new Wallet.Model.Error(error.getThrowable()));
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.walletkit.client.WalletKit */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void respondSessionRequest$default(WalletKit walletKit, Wallet.Params.SessionRequestResponse sessionRequestResponse, Function1 function1, Function1 function12, int i, Object obj) throws IllegalStateException {
        if ((i & 2) != 0) {
            function1 = new Function1<Wallet.Params.SessionRequestResponse, Unit>() { // from class: com.reown.walletkit.client.WalletKit.respondSessionRequest.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Wallet.Params.SessionRequestResponse sessionRequestResponse2) {
                    Intrinsics.checkNotNullParameter(sessionRequestResponse2, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Wallet.Params.SessionRequestResponse sessionRequestResponse2) {
                    invoke2(sessionRequestResponse2);
                    return Unit.INSTANCE;
                }
            };
        }
        walletKit.respondSessionRequest(sessionRequestResponse, function1, function12);
    }

    public final void respondSessionRequest(@NotNull final Wallet.Params.SessionRequestResponse sessionRequestResponse, @NotNull final Function1<? super Wallet.Params.SessionRequestResponse, Unit> function1, @NotNull final Function1<? super Wallet.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(sessionRequestResponse, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        SignClient.INSTANCE.respond(new Sign.Params.Response(sessionRequestResponse.getSessionTopic(), ClientMapperKt.toSign(sessionRequestResponse.getJsonRpcResponse())), new Function1<Sign.Params.Response, Unit>() { // from class: com.reown.walletkit.client.WalletKit.respondSessionRequest.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Params$SessionRequestResponse, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Params.Response response) {
                invoke2(response);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Params.Response response) {
                Intrinsics.checkNotNullParameter(response, "");
                function1.invoke(sessionRequestResponse);
            }
        }, new Function1<Sign.Model.Error, Unit>() { // from class: com.reown.walletkit.client.WalletKit.respondSessionRequest.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Error, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Model.Error error) {
                invoke2(error);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Model.Error error) {
                Intrinsics.checkNotNullParameter(error, "");
                function12.invoke(new Wallet.Model.Error(error.getThrowable()));
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.walletkit.client.WalletKit */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void emitSessionEvent$default(WalletKit walletKit, Wallet.Params.SessionEmit sessionEmit, Function1 function1, Function1 function12, int i, Object obj) throws IllegalStateException {
        if ((i & 2) != 0) {
            function1 = new Function1<Wallet.Params.SessionEmit, Unit>() { // from class: com.reown.walletkit.client.WalletKit.emitSessionEvent.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Wallet.Params.SessionEmit sessionEmit2) {
                    Intrinsics.checkNotNullParameter(sessionEmit2, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Wallet.Params.SessionEmit sessionEmit2) {
                    invoke2(sessionEmit2);
                    return Unit.INSTANCE;
                }
            };
        }
        walletKit.emitSessionEvent(sessionEmit, function1, function12);
    }

    public final void emitSessionEvent(@NotNull final Wallet.Params.SessionEmit sessionEmit, @NotNull final Function1<? super Wallet.Params.SessionEmit, Unit> function1, @NotNull final Function1<? super Wallet.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(sessionEmit, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        SignClient.INSTANCE.emit(new Sign.Params.Emit(sessionEmit.getTopic(), ClientMapperKt.toSign(sessionEmit.getEvent()), sessionEmit.getChainId()), new Function1<Sign.Params.Emit, Unit>() { // from class: com.reown.walletkit.client.WalletKit.emitSessionEvent.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Params$SessionEmit, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Params.Emit emit) {
                invoke2(emit);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Params.Emit emit) {
                Intrinsics.checkNotNullParameter(emit, "");
                function1.invoke(sessionEmit);
            }
        }, new Function1<Sign.Model.Error, Unit>() { // from class: com.reown.walletkit.client.WalletKit.emitSessionEvent.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Error, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Model.Error error) {
                invoke2(error);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Model.Error error) {
                Intrinsics.checkNotNullParameter(error, "");
                function12.invoke(new Wallet.Model.Error(error.getThrowable()));
            }
        });
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.reown.walletkit.client.WalletKit */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void disconnectSession$default(WalletKit walletKit, Wallet.Params.SessionDisconnect sessionDisconnect, Function1 function1, Function1 function12, int i, Object obj) throws IllegalStateException {
        if ((i & 2) != 0) {
            function1 = new Function1<Wallet.Params.SessionDisconnect, Unit>() { // from class: com.reown.walletkit.client.WalletKit.disconnectSession.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Wallet.Params.SessionDisconnect sessionDisconnect2) {
                    Intrinsics.checkNotNullParameter(sessionDisconnect2, "");
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Wallet.Params.SessionDisconnect sessionDisconnect2) {
                    invoke2(sessionDisconnect2);
                    return Unit.INSTANCE;
                }
            };
        }
        walletKit.disconnectSession(sessionDisconnect, function1, function12);
    }

    public final void disconnectSession(@NotNull final Wallet.Params.SessionDisconnect sessionDisconnect, @NotNull final Function1<? super Wallet.Params.SessionDisconnect, Unit> function1, @NotNull final Function1<? super Wallet.Model.Error, Unit> function12) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(sessionDisconnect, "");
        Intrinsics.checkNotNullParameter(function1, "");
        Intrinsics.checkNotNullParameter(function12, "");
        SignClient.INSTANCE.disconnect(new Sign.Params.Disconnect(sessionDisconnect.getSessionTopic()), new Function1<Sign.Params.Disconnect, Unit>() { // from class: com.reown.walletkit.client.WalletKit.disconnectSession.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Params$SessionDisconnect, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Params.Disconnect disconnect) {
                invoke2(disconnect);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Params.Disconnect disconnect) {
                Intrinsics.checkNotNullParameter(disconnect, "");
                function1.invoke(sessionDisconnect);
            }
        }, new Function1<Sign.Model.Error, Unit>() { // from class: com.reown.walletkit.client.WalletKit.disconnectSession.3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.jvm.functions.Function1<? super com.reown.walletkit.client.Wallet$Model$Error, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Sign.Model.Error error) {
                invoke2(error);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Sign.Model.Error error) {
                Intrinsics.checkNotNullParameter(error, "");
                function12.invoke(new Wallet.Model.Error(error.getThrowable()));
            }
        });
    }

    public final void pingSession(@NotNull Wallet.Params.Ping ping, final Wallet.Listeners.SessionPing sessionPing) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(ping, "");
        SignClient.INSTANCE.ping(new Sign.Params.Ping(ping.getSessionTopic(), 0L, 2, null), new Sign.Listeners.SessionPing() { // from class: com.reown.walletkit.client.WalletKit$pingSession$signPingLister$1
            @Override // com.reown.sign.client.Sign.Listeners.SessionPing
            public void onSuccess(@NotNull Sign.Model.Ping.Success success) {
                Intrinsics.checkNotNullParameter(success, "");
                Wallet.Listeners.SessionPing sessionPing2 = sessionPing;
                if (sessionPing2 != null) {
                    sessionPing2.onSuccess(new Wallet.Model.Ping.Success(success.getTopic()));
                }
            }

            @Override // com.reown.sign.client.Sign.Listeners.SessionPing
            public void onError(@NotNull Sign.Model.Ping.Error error) {
                Intrinsics.checkNotNullParameter(error, "");
                Wallet.Listeners.SessionPing sessionPing2 = sessionPing;
                if (sessionPing2 != null) {
                    sessionPing2.onError(new Wallet.Model.Ping.Error(error.getError()));
                }
            }
        });
    }

    public final String formatAuthMessage(@NotNull Wallet.Params.FormatAuthMessage formatAuthMessage) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(formatAuthMessage, "");
        return SignClient.INSTANCE.formatAuthMessage(new Sign.Params.FormatMessage(ClientMapperKt.toSign(formatAuthMessage.getPayloadParams()), formatAuthMessage.getIssuer()));
    }

    public static final List<Wallet.Model.Session> getListOfActiveSessions() throws IllegalStateException {
        List<Sign.Model.Session> listOfActiveSessions = SignClient.INSTANCE.getListOfActiveSessions();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOfActiveSessions, 10));
        Iterator<T> it = listOfActiveSessions.iterator();
        while (it.hasNext()) {
            arrayList.add(ClientMapperKt.toWallet((Sign.Model.Session) it.next()));
        }
        return arrayList;
    }

    public final Wallet.Model.Session getActiveSessionByTopic(@NotNull String str) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(str, "");
        Sign.Model.Session activeSessionByTopic = SignClient.INSTANCE.getActiveSessionByTopic(str);
        if (activeSessionByTopic != null) {
            return ClientMapperKt.toWallet(activeSessionByTopic);
        }
        return null;
    }

    public final List<Wallet.Model.SessionRequest> getPendingListOfSessionRequests(@NotNull String str) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(str, "");
        return ClientMapperKt.mapToPendingSessionRequests(SignClient.INSTANCE.getPendingSessionRequests(str));
    }

    public final List<Wallet.Model.SessionProposal> getSessionProposals() throws IllegalStateException {
        List<Sign.Model.SessionProposal> sessionProposals = SignClient.INSTANCE.getSessionProposals();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(sessionProposals, 10));
        Iterator<T> it = sessionProposals.iterator();
        while (it.hasNext()) {
            arrayList.add(ClientMapperKt.toWallet((Sign.Model.SessionProposal) it.next()));
        }
        return arrayList;
    }

    public final Wallet.Model.VerifyContext getVerifyContext(long j) throws IllegalStateException {
        Sign.Model.VerifyContext verifyContext = SignClient.INSTANCE.getVerifyContext(j);
        if (verifyContext != null) {
            return ClientMapperKt.toWallet(verifyContext);
        }
        return null;
    }

    public final List<Wallet.Model.VerifyContext> getListOfVerifyContexts() throws IllegalStateException {
        List<Sign.Model.VerifyContext> listOfVerifyContexts = SignClient.INSTANCE.getListOfVerifyContexts();
        ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(listOfVerifyContexts, 10));
        Iterator<T> it = listOfVerifyContexts.iterator();
        while (it.hasNext()) {
            arrayList.add(ClientMapperKt.toWallet((Sign.Model.VerifyContext) it.next()));
        }
        return arrayList;
    }
}
