package com.amplifyframework.auth.cognito;

import android.content.Context;
import com.amplifyframework.auth.cognito.data.AWSCognitoAuthCredentialStore;
import com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.StateChangeListenerToken;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.AuthConfiguration;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.events.CredentialStoreEvent;
import com.amplifyframework.statemachine.codegen.states.CredentialStoreState;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56434yFf;
import o.C56441yFm;
import o.C56442yFn;
import o.C56447yFs;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class CredentialStoreClient implements StoreClientBehavior {
    private final CredentialStoreStateMachine credentialStoreStateMachine;
    private final Logger logger;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Logger getLogger() {
        return this.logger;
    }

    public CredentialStoreClient(@NotNull AuthConfiguration authConfiguration, @NotNull Context context, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(authConfiguration, "");
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.logger = logger;
        this.credentialStoreStateMachine = createCredentialStoreStateMachine(authConfiguration, context);
    }

    private final CredentialStoreStateMachine createCredentialStoreStateMachine(AuthConfiguration authConfiguration, Context context) {
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        AWSCognitoAuthCredentialStore aWSCognitoAuthCredentialStore = new AWSCognitoAuthCredentialStore(applicationContext, authConfiguration, false, null, 12, null);
        Context applicationContext2 = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
        return new CredentialStoreStateMachine(new CredentialStoreEnvironment(aWSCognitoAuthCredentialStore, new AWSCognitoLegacyCredentialStore(applicationContext2, authConfiguration, null, 4, null), this.logger));
    }

    private final void listenForResult(final CredentialStoreEvent credentialStoreEvent, final Function1<? super Result<? extends AmplifyCredential>, Unit> function1, final Function1<? super Exception, Unit> function12) {
        final StateChangeListenerToken stateChangeListenerToken = new StateChangeListenerToken();
        this.credentialStoreStateMachine.listen(stateChangeListenerToken, new AnonymousClass1(new OneShotCredentialStoreStateListener(new Function1<Result<? extends AmplifyCredential>, Unit>() { // from class: com.amplifyframework.auth.cognito.CredentialStoreClient$listenForResult$credentialStoreStateListener$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<? extends com.amplifyframework.statemachine.codegen.data.AmplifyCredential>, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Result<? extends AmplifyCredential> result) {
                m5949invoke(result.m7386unboximpl());
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m5949invoke(@NotNull Object obj) {
                this.this$0.credentialStoreStateMachine.cancel(stateChangeListenerToken);
                function1.invoke(Result.m7376boximpl(obj));
            }
        }, new Function1<Exception, Unit>() { // from class: com.amplifyframework.auth.cognito.CredentialStoreClient$listenForResult$credentialStoreStateListener$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                invoke2(exc);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "");
                this.this$0.credentialStoreStateMachine.cancel(stateChangeListenerToken);
                function12.invoke(exc);
            }
        }, this.logger)), new Function0<Unit>() { // from class: com.amplifyframework.auth.cognito.CredentialStoreClient.listenForResult.2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function0.invoke()Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                CredentialStoreClient.this.credentialStoreStateMachine.send(credentialStoreEvent);
            }
        });
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.CredentialStoreClient$listenForResult$1, reason: invalid class name */
    public final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements Function1<CredentialStoreState, Unit> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Object obj) {
            super(1, obj, OneShotCredentialStoreStateListener.class, "listen", "listen(Lcom/amplifyframework/statemachine/codegen/states/CredentialStoreState;)V", 0);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CredentialStoreState credentialStoreState) {
            invoke2(credentialStoreState);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull CredentialStoreState credentialStoreState) {
            Intrinsics.checkNotNullParameter(credentialStoreState, "");
            ((OneShotCredentialStoreStateListener) this.receiver).listen(credentialStoreState);
        }
    }

    @Override // com.amplifyframework.auth.cognito.StoreClientBehavior
    public Object loadCredentials(@NotNull CredentialType credentialType, @NotNull Continuation<? super AmplifyCredential> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        listenForResult(new CredentialStoreEvent(new CredentialStoreEvent.EventType.LoadCredentialStore(credentialType), null, 2, null), new Function1<Result<? extends AmplifyCredential>, Unit>() { // from class: com.amplifyframework.auth.cognito.CredentialStoreClient$loadCredentials$2$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super com.amplifyframework.statemachine.codegen.data.AmplifyCredential> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Result<? extends AmplifyCredential> result) {
                m5950invoke(result.m7386unboximpl());
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m5950invoke(@NotNull Object obj) {
                c56434yFf.resumeWith(obj);
            }
        }, new Function1<Exception, Unit>() { // from class: com.amplifyframework.auth.cognito.CredentialStoreClient$loadCredentials$2$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super com.amplifyframework.statemachine.codegen.data.AmplifyCredential> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                invoke2(exc);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "");
                Continuation<AmplifyCredential> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(exc)));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl;
    }

    @Override // com.amplifyframework.auth.cognito.StoreClientBehavior
    public Object storeCredentials(@NotNull CredentialType credentialType, @NotNull AmplifyCredential amplifyCredential, @NotNull Continuation<? super Unit> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        listenForResult(new CredentialStoreEvent(new CredentialStoreEvent.EventType.StoreCredentials(credentialType, amplifyCredential), null, 2, null), new Function1<Result<? extends AmplifyCredential>, Unit>() { // from class: com.amplifyframework.auth.cognito.CredentialStoreClient$storeCredentials$2$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Result<? extends AmplifyCredential> result) {
                m5951invoke(result.m7386unboximpl());
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m5951invoke(@NotNull Object obj) {
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }, new Function1<Exception, Unit>() { // from class: com.amplifyframework.auth.cognito.CredentialStoreClient$storeCredentials$2$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                invoke2(exc);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "");
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(exc)));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    @Override // com.amplifyframework.auth.cognito.StoreClientBehavior
    public Object clearCredentials(@NotNull CredentialType credentialType, @NotNull Continuation<? super Unit> continuation) {
        final C56434yFf c56434yFf = new C56434yFf(C56441yFm.OLrzqt(continuation));
        listenForResult(new CredentialStoreEvent(new CredentialStoreEvent.EventType.ClearCredentialStore(credentialType), null, 2, null), new Function1<Result<? extends AmplifyCredential>, Unit>() { // from class: com.amplifyframework.auth.cognito.CredentialStoreClient$clearCredentials$2$1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* synthetic */ Unit invoke(Result<? extends AmplifyCredential> result) {
                m5948invoke(result.m7386unboximpl());
                return Unit.INSTANCE;
            }

            /* JADX DEBUG: Possible override for method kotlin.jvm.functions.Function1.invoke(Ljava/lang/Object;)Ljava/lang/Object; */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m5948invoke(@NotNull Object obj) {
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(Unit.INSTANCE));
            }
        }, new Function1<Exception, Unit>() { // from class: com.amplifyframework.auth.cognito.CredentialStoreClient$clearCredentials$2$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: kotlin.coroutines.Continuation<? super kotlin.Unit> */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                invoke2(exc);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Exception exc) {
                Intrinsics.checkNotNullParameter(exc, "");
                Continuation<Unit> continuation2 = c56434yFf;
                Result.Application application = Result.Companion;
                continuation2.resumeWith(Result.m7377constructorimpl(C56391yDq.EZpvd(exc)));
            }
        });
        Object objKWHzl = c56434yFf.KWHzl();
        if (objKWHzl == C56442yFn.copydefault()) {
            C56447yFs.copydefault(continuation);
        }
        return objKWHzl == C56442yFn.copydefault() ? objKWHzl : Unit.INSTANCE;
    }

    public static final class OneShotCredentialStoreStateListener {
        private Exception capturedError;
        private Result<? extends AmplifyCredential> capturedSuccess;
        private final AtomicBoolean isActive;
        private final Logger logger;
        private final Function1<Exception, Unit> onError;
        private final Function1<Result<? extends AmplifyCredential>, Unit> onSuccess;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Logger getLogger() {
            return this.logger;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<Exception, Unit> getOnError() {
            return this.onError;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final Function1<Result<? extends AmplifyCredential>, Unit> getOnSuccess() {
            return this.onSuccess;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: kotlin.jvm.functions.Function1<? super kotlin.Result<? extends com.amplifyframework.statemachine.codegen.data.AmplifyCredential>, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public OneShotCredentialStoreStateListener(@NotNull Function1<? super Result<? extends AmplifyCredential>, Unit> function1, @NotNull Function1<? super Exception, Unit> function12, @NotNull Logger logger) {
            Intrinsics.checkNotNullParameter(function1, "");
            Intrinsics.checkNotNullParameter(function12, "");
            Intrinsics.checkNotNullParameter(logger, "");
            this.onSuccess = function1;
            this.onError = function12;
            this.logger = logger;
            this.isActive = new AtomicBoolean(true);
        }

        public final void listen(@NotNull CredentialStoreState credentialStoreState) {
            Intrinsics.checkNotNullParameter(credentialStoreState, "");
            this.logger.verbose("Credential Store State Change: " + credentialStoreState);
            if (credentialStoreState instanceof CredentialStoreState.Success) {
                Result.Application application = Result.Companion;
                this.capturedSuccess = Result.m7376boximpl(Result.m7377constructorimpl(((CredentialStoreState.Success) credentialStoreState).getStoredCredentials()));
                return;
            }
            if (credentialStoreState instanceof CredentialStoreState.Error) {
                this.capturedError = ((CredentialStoreState.Error) credentialStoreState).getError();
                return;
            }
            if (credentialStoreState instanceof CredentialStoreState.Idle) {
                Result<? extends AmplifyCredential> result = this.capturedSuccess;
                Exception exc = this.capturedError;
                if (!(result == null && exc == null) && this.isActive.getAndSet(false)) {
                    if (result != null) {
                        this.onSuccess.invoke(result);
                    } else if (exc != null) {
                        this.onError.invoke(exc);
                    }
                }
            }
        }
    }
}
