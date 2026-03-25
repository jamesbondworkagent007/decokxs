package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.SetupTOTPEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AccountManagerResponse;
import o.BinaryOperator;
import o.C56391yDq;
import o.C56442yFn;
import o.GrantCredentialsPermissionActivity;
import o.RecoverableSecurityException;
import o.RemoteAction;
import o.RestoreDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1 implements Action {
    final /* synthetic */ SetupTOTPEvent.EventType.RespondToAuthChallenge $eventType$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:66:0x01a4 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:0x002a */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:86:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0106 A[Catch: Exception -> 0x0076, TryCatch #2 {Exception -> 0x0076, blocks: (B:21:0x005d, B:43:0x00f6, B:45:0x0106, B:47:0x0126, B:49:0x012c, B:51:0x0131, B:53:0x013b, B:54:0x0143, B:24:0x0072, B:35:0x00d0, B:37:0x00d4, B:39:0x00da, B:40:0x00df), top: B:81:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0186 A[Catch: Exception -> 0x01a4, TRY_LEAVE, TryCatch #3 {Exception -> 0x01a4, blocks: (B:62:0x0162, B:64:0x0186), top: B:83:0x0162 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [com.amplifyframework.statemachine.EventDispatcher] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.amplifyframework.statemachine.EventDispatcher] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1 setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1;
        StateMachineEvent setupTOTPEvent;
        ?? r7;
        EventDispatcher eventDispatcher2;
        EventDispatcher eventDispatcher3;
        SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1 setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12;
        AuthEnvironment authEnvironment;
        Map<String, String> map;
        String deviceKey;
        BinaryOperator cognitoIdentityProviderClient;
        RecoverableSecurityException recoverableSecurityException;
        ?? r4;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object userContextData = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        ?? r72 = 1;
        try {
        } catch (Exception e) {
            e = e;
            setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1 = setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12;
        }
        if (i2 == 0) {
            C56391yDq.AEQbTJ(userContextData);
            Intrinsics.copydefault(environment, "");
            String id = getId();
            AuthEnvironment authEnvironment2 = (AuthEnvironment) environment;
            authEnvironment2.getLogger().verbose(id + " Starting execution");
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("USERNAME", this.$eventType$inlined.getUsername());
                String username = this.$eventType$inlined.getUsername();
                anonymousClass1.L$0 = this;
                eventDispatcher2 = eventDispatcher;
                try {
                    anonymousClass1.L$1 = eventDispatcher2;
                    anonymousClass1.L$2 = authEnvironment2;
                    anonymousClass1.L$3 = linkedHashMap;
                    anonymousClass1.label = 1;
                    Object deviceMetadata = authEnvironment2.getDeviceMetadata(username, anonymousClass1);
                    if (deviceMetadata == objCopydefault) {
                        return objCopydefault;
                    }
                    eventDispatcher3 = eventDispatcher2;
                    setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12 = this;
                    authEnvironment = authEnvironment2;
                    map = linkedHashMap;
                    userContextData = deviceMetadata;
                } catch (Exception e2) {
                    e = e2;
                    setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1 = this;
                    r72 = eventDispatcher2;
                }
            } catch (Exception e3) {
                e = e3;
                eventDispatcher2 = eventDispatcher;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r4 = (EventDispatcher) anonymousClass1.L$1;
                    setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1 = (SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1) anonymousClass1.L$0;
                    try {
                        C56391yDq.AEQbTJ(userContextData);
                        r4 = r4;
                        recoverableSecurityException = (RecoverableSecurityException) userContextData;
                        r72 = r4;
                        if (recoverableSecurityException != null) {
                            try {
                                setupTOTPEvent = SignInChallengeHelper.evaluateNextStep$default(SignInChallengeHelper.INSTANCE, setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getUsername(), recoverableSecurityException.AEQbTJ(), recoverableSecurityException.KWHzl(), recoverableSecurityException.copydefault(), recoverableSecurityException.EZpvd(), null, 32, null);
                                r7 = r72;
                                if (setupTOTPEvent == null) {
                                    setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(new Exception("Software token verification failed"), setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getUsername(), setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getSession()), null, 2, null);
                                    r7 = r72;
                                }
                            } catch (Exception e4) {
                                e = e4;
                                setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(e, setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getUsername(), setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getSession()), null, 2, null);
                                r7 = r72;
                            }
                        }
                    } catch (Exception e5) {
                        e = e5;
                        r72 = r4;
                    }
                    r7.send(setupTOTPEvent);
                    return Unit.INSTANCE;
                }
                map = (Map) anonymousClass1.L$3;
                authEnvironment = (AuthEnvironment) anonymousClass1.L$2;
                EventDispatcher eventDispatcher4 = (EventDispatcher) anonymousClass1.L$1;
                setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12 = (SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1) anonymousClass1.L$0;
                C56391yDq.AEQbTJ(userContextData);
                r72 = eventDispatcher4;
                final String str = (String) userContextData;
                final String pinpointEndpointId = authEnvironment.getPinpointEndpointId();
                cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient == null) {
                    RemoteAction.ActionBar actionBar = new RemoteAction.ActionBar();
                    actionBar.OLrzqt(setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12.$eventType$inlined.getSession());
                    actionBar.copydefault(map);
                    actionBar.KWHzl(GrantCredentialsPermissionActivity.Fragment.EZpvd);
                    UserPoolConfiguration userPool = authEnvironment.getConfiguration().getUserPool();
                    actionBar.EZpvd(userPool != null ? userPool.getAppClient() : null);
                    if (pinpointEndpointId != null) {
                        actionBar.KWHzl(new Function1<AccountManagerResponse.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions$respondToAuthChallenge$1$evt$response$1$1$1
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(AccountManagerResponse.Application application) {
                                invoke2(application);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull AccountManagerResponse.Application application) {
                                Intrinsics.checkNotNullParameter(application, "");
                                application.OLrzqt(pinpointEndpointId);
                            }
                        });
                    }
                    if (str != null) {
                        actionBar.EZpvd(new Function1<RestoreDescription.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.SetupTOTPCognitoActions$respondToAuthChallenge$1$evt$response$1$2$1
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(RestoreDescription.Application application) {
                                invoke2(application);
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull RestoreDescription.Application application) {
                                Intrinsics.checkNotNullParameter(application, "");
                                application.copydefault(str);
                            }
                        });
                    }
                    RemoteAction remoteActionKWHzl = actionBar.KWHzl();
                    anonymousClass1.L$0 = setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12;
                    anonymousClass1.L$1 = r72;
                    anonymousClass1.L$2 = null;
                    anonymousClass1.L$3 = null;
                    anonymousClass1.label = 3;
                    userContextData = cognitoIdentityProviderClient.OLrzqt(remoteActionKWHzl, anonymousClass1);
                    if (userContextData == objCopydefault) {
                        return objCopydefault;
                    }
                    r4 = r72;
                    setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1 = setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12;
                    recoverableSecurityException = (RecoverableSecurityException) userContextData;
                    r72 = r4;
                    if (recoverableSecurityException != null) {
                    }
                    r7.send(setupTOTPEvent);
                    return Unit.INSTANCE;
                }
                recoverableSecurityException = null;
                setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1 = setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12;
                r72 = r72;
                if (recoverableSecurityException != null) {
                }
                r7.send(setupTOTPEvent);
                return Unit.INSTANCE;
                setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(e, setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getUsername(), setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getSession()), null, 2, null);
                r7 = r72;
                r7.send(setupTOTPEvent);
                return Unit.INSTANCE;
            }
            map = (Map) anonymousClass1.L$3;
            authEnvironment = (AuthEnvironment) anonymousClass1.L$2;
            EventDispatcher eventDispatcher5 = (EventDispatcher) anonymousClass1.L$1;
            setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12 = (SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1) anonymousClass1.L$0;
            C56391yDq.AEQbTJ(userContextData);
            eventDispatcher3 = eventDispatcher5;
        }
        DeviceMetadata.Metadata metadata = (DeviceMetadata.Metadata) userContextData;
        if (metadata != null && (deviceKey = metadata.getDeviceKey()) != null) {
            map.put("DEVICE_KEY", deviceKey);
        }
        String username2 = setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12.$eventType$inlined.getUsername();
        anonymousClass1.L$0 = setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$12;
        anonymousClass1.L$1 = eventDispatcher3;
        anonymousClass1.L$2 = authEnvironment;
        anonymousClass1.L$3 = map;
        anonymousClass1.label = 2;
        userContextData = authEnvironment.getUserContextData(username2, anonymousClass1);
        r72 = eventDispatcher3;
        if (userContextData == objCopydefault) {
            return objCopydefault;
        }
        final String str2 = (String) userContextData;
        final String pinpointEndpointId2 = authEnvironment.getPinpointEndpointId();
        cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
        if (cognitoIdentityProviderClient == null) {
        }
        setupTOTPEvent = new SetupTOTPEvent(new SetupTOTPEvent.EventType.ThrowAuthError(e, setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getUsername(), setupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1.$eventType$inlined.getSession()), null, 2, null);
        r7 = r72;
        r7.send(setupTOTPEvent);
        return Unit.INSTANCE;
    }

    public SetupTOTPCognitoActions$respondToAuthChallenge$$inlined$invoke$1(String str, SetupTOTPEvent.EventType.RespondToAuthChallenge respondToAuthChallenge) {
        this.$eventType$inlined = respondToAuthChallenge;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
