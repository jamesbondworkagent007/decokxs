package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AccountManagerResponse;
import o.BinaryOperator;
import o.BroadcastOptions;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.DialogFragment;
import o.NetworkErrorException;
import o.RestoreDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class MigrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ SignInEvent.EventType.InitiateMigrateAuth $event$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.MigrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
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
            return MigrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0124 A[Catch: Exception -> 0x01e1, TryCatch #4 {Exception -> 0x01e1, blocks: (B:62:0x0188, B:64:0x0196, B:66:0x019e, B:68:0x01a4, B:70:0x01ae, B:71:0x01cf, B:72:0x01e0, B:41:0x0114, B:43:0x0124, B:45:0x0138, B:47:0x013e, B:49:0x014f, B:51:0x0159, B:52:0x0161), top: B:91:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0188 A[Catch: Exception -> 0x01e1, TRY_ENTER, TryCatch #4 {Exception -> 0x01e1, blocks: (B:62:0x0188, B:64:0x0196, B:66:0x019e, B:68:0x01a4, B:70:0x01ae, B:71:0x01cf, B:72:0x01e0, B:41:0x0114, B:43:0x0124, B:45:0x0138, B:47:0x013e, B:49:0x014f, B:51:0x0159, B:52:0x0161), top: B:91:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cf A[Catch: Exception -> 0x01e1, TryCatch #4 {Exception -> 0x01e1, blocks: (B:62:0x0188, B:64:0x0196, B:66:0x019e, B:68:0x01a4, B:70:0x01ae, B:71:0x01cf, B:72:0x01e0, B:41:0x0114, B:43:0x0124, B:45:0x0138, B:47:0x013e, B:49:0x014f, B:51:0x0159, B:52:0x0161), top: B:91:0x0114 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String id;
        EventDispatcher eventDispatcher2;
        AuthEnvironment authEnvironment;
        Map<String, String> mapDjBIcL;
        String str;
        AuthEnvironment authEnvironment2;
        MigrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1 migrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1;
        BinaryOperator cognitoIdentityProviderClient;
        DialogFragment dialogFragment;
        EventDispatcher eventDispatcher3;
        StateMachineEvent authenticationEvent;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objCopydefault = anonymousClass1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            Intrinsics.copydefault(environment, "");
            id = getId();
            AuthEnvironment authEnvironment3 = (AuthEnvironment) environment;
            authEnvironment3.getLogger().verbose(id + " Starting execution");
            try {
                AuthHelper.Companion companion = AuthHelper.Companion;
                String username = this.$event$inlined.getUsername();
                UserPoolConfiguration userPool = authEnvironment3.getConfiguration().getUserPool();
                String appClient = userPool != null ? userPool.getAppClient() : null;
                UserPoolConfiguration userPool2 = authEnvironment3.getConfiguration().getUserPool();
                String secretHash = companion.getSecretHash(username, appClient, userPool2 != null ? userPool2.getAppClientSecret() : null);
                mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("USERNAME", this.$event$inlined.getUsername()), C56390yDp.OLrzqt("PASSWORD", this.$event$inlined.getPassword()));
                if (secretHash != null) {
                    mapDjBIcL.put("SECRET_HASH", secretHash);
                }
                String username2 = this.$event$inlined.getUsername();
                anonymousClass1.L$0 = this;
                eventDispatcher2 = eventDispatcher;
                try {
                    anonymousClass1.L$1 = eventDispatcher2;
                    anonymousClass1.L$2 = id;
                    anonymousClass1.L$3 = authEnvironment3;
                    anonymousClass1.L$4 = mapDjBIcL;
                    anonymousClass1.label = 1;
                    Object userContextData = authEnvironment3.getUserContextData(username2, anonymousClass1);
                    if (userContextData == objCopydefault2) {
                        return objCopydefault2;
                    }
                    str = id;
                    authEnvironment2 = authEnvironment3;
                    objCopydefault = userContextData;
                    migrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1 = this;
                    final String str2 = (String) objCopydefault;
                    final String pinpointEndpointId = authEnvironment2.getPinpointEndpointId();
                    cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient == null) {
                    }
                } catch (Exception e) {
                    e = e;
                    authEnvironment = authEnvironment3;
                    SignInEvent signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + signInEvent.getType());
                    eventDispatcher2.send(signInEvent);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    str = id;
                    authEnvironment2 = authEnvironment;
                    authEnvironment2.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
                    eventDispatcher2.send(authenticationEvent);
                    return Unit.INSTANCE;
                }
            } catch (Exception e2) {
                e = e2;
                eventDispatcher2 = eventDispatcher;
            }
        } else if (i2 == 1) {
            Map<String, String> map = (Map) anonymousClass1.L$4;
            authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
            String str3 = (String) anonymousClass1.L$2;
            eventDispatcher2 = (EventDispatcher) anonymousClass1.L$1;
            MigrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1 migrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$12 = (MigrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(objCopydefault);
                mapDjBIcL = map;
                migrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1 = migrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$12;
                str = str3;
                try {
                    final String str22 = (String) objCopydefault;
                    final String pinpointEndpointId2 = authEnvironment2.getPinpointEndpointId();
                    cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient == null) {
                        BroadcastOptions.Activity activity = new BroadcastOptions.Activity();
                        activity.copydefault(NetworkErrorException.FragmentManager.copydefault);
                        UserPoolConfiguration userPool3 = authEnvironment2.getConfiguration().getUserPool();
                        activity.AEQbTJ(userPool3 != null ? userPool3.getAppClient() : null);
                        activity.KWHzl(mapDjBIcL);
                        activity.AEQbTJ(migrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1.$event$inlined.getMetadata());
                        if (pinpointEndpointId2 != null) {
                            activity.copydefault(new Function1<AccountManagerResponse.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.MigrateAuthCognitoActions$initiateMigrateAuthAction$1$evt$response$1$1$1
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
                                    application.OLrzqt(pinpointEndpointId2);
                                }
                            });
                        }
                        if (str22 != null) {
                            activity.OLrzqt(new Function1<RestoreDescription.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.MigrateAuthCognitoActions$initiateMigrateAuthAction$1$evt$response$1$2$1
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
                                    application.copydefault(str22);
                                }
                            });
                        }
                        BroadcastOptions broadcastOptionsEZpvd = activity.EZpvd();
                        anonymousClass1.L$0 = migrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1;
                        anonymousClass1.L$1 = eventDispatcher2;
                        anonymousClass1.L$2 = str;
                        anonymousClass1.L$3 = authEnvironment2;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.label = 2;
                        objCopydefault = cognitoIdentityProviderClient.copydefault(broadcastOptionsEZpvd, anonymousClass1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        authEnvironment = authEnvironment2;
                        eventDispatcher3 = eventDispatcher2;
                        id = str;
                        dialogFragment = (DialogFragment) objCopydefault;
                        str = id;
                        eventDispatcher2 = eventDispatcher3;
                        authEnvironment2 = authEnvironment;
                        if (dialogFragment != null) {
                        }
                    } else {
                        dialogFragment = null;
                        if (dialogFragment != null) {
                        }
                    }
                } catch (Exception e3) {
                    e = e3;
                    authEnvironment = authEnvironment2;
                    id = str;
                    SignInEvent signInEvent2 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + signInEvent2.getType());
                    eventDispatcher2.send(signInEvent2);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    str = id;
                    authEnvironment2 = authEnvironment;
                }
            } catch (Exception e4) {
                e = e4;
                authEnvironment = authEnvironment2;
                id = str3;
                SignInEvent signInEvent22 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + signInEvent22.getType());
                eventDispatcher2.send(signInEvent22);
                authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                str = id;
                authEnvironment2 = authEnvironment;
                authEnvironment2.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
                eventDispatcher2.send(authenticationEvent);
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
            id = (String) anonymousClass1.L$2;
            eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
            migrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1 = (MigrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(objCopydefault);
                dialogFragment = (DialogFragment) objCopydefault;
                str = id;
                eventDispatcher2 = eventDispatcher3;
                authEnvironment2 = authEnvironment;
                if (dialogFragment != null) {
                    AuthHelper.Companion companion2 = AuthHelper.Companion;
                    String username3 = migrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1.$event$inlined.getUsername();
                    Map<String, String> mapCopydefault = dialogFragment.copydefault();
                    String str4 = mapCopydefault != null ? mapCopydefault.get("USERNAME") : null;
                    Map<String, String> mapCopydefault2 = dialogFragment.copydefault();
                    authenticationEvent = SignInChallengeHelper.evaluateNextStep$default(SignInChallengeHelper.INSTANCE, companion2.getActiveUsername(username3, str4, mapCopydefault2 != null ? mapCopydefault2.get("USER_ID_FOR_SRP") : null), dialogFragment.OLrzqt(), dialogFragment.AEQbTJ(), dialogFragment.copydefault(), dialogFragment.EZpvd(), null, 32, null);
                } else {
                    throw new ServiceException("Sign in failed", "Sorry, we don't have a suggested fix for this error yet.", null, 4, null);
                }
            } catch (Exception e5) {
                e = e5;
                eventDispatcher2 = eventDispatcher3;
                SignInEvent signInEvent222 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + signInEvent222.getType());
                eventDispatcher2.send(signInEvent222);
                authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                str = id;
                authEnvironment2 = authEnvironment;
            }
        }
        authEnvironment2.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
        eventDispatcher2.send(authenticationEvent);
        return Unit.INSTANCE;
    }

    public MigrateAuthCognitoActions$initiateMigrateAuthAction$$inlined$invoke$1(String str, SignInEvent.EventType.InitiateMigrateAuth initiateMigrateAuth) {
        this.$event$inlined = initiateMigrateAuth;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
