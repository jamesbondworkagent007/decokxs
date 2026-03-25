package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.CustomSignInEvent;
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
import o.GrantCredentialsPermissionActivity;
import o.NetworkErrorException;
import o.RestoreDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ CustomSignInEvent.EventType.InitiateCustomSignIn $event$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.SignInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
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
            return SignInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x015d A[Catch: Exception -> 0x01df, TryCatch #1 {Exception -> 0x01df, blocks: (B:75:0x01da, B:79:0x01e3, B:81:0x01eb, B:83:0x01f1, B:85:0x01ff, B:87:0x0207, B:89:0x020d, B:91:0x0217, B:92:0x023b, B:93:0x024c, B:51:0x0159, B:53:0x015d, B:54:0x0166, B:56:0x0174, B:58:0x0188, B:60:0x018e, B:62:0x019f, B:64:0x01a9, B:65:0x01b1), top: B:108:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0174 A[Catch: Exception -> 0x01df, TryCatch #1 {Exception -> 0x01df, blocks: (B:75:0x01da, B:79:0x01e3, B:81:0x01eb, B:83:0x01f1, B:85:0x01ff, B:87:0x0207, B:89:0x020d, B:91:0x0217, B:92:0x023b, B:93:0x024c, B:51:0x0159, B:53:0x015d, B:54:0x0166, B:56:0x0174, B:58:0x0188, B:60:0x018e, B:62:0x019f, B:64:0x01a9, B:65:0x01b1), top: B:108:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01da A[Catch: Exception -> 0x01df, TRY_ENTER, TryCatch #1 {Exception -> 0x01df, blocks: (B:75:0x01da, B:79:0x01e3, B:81:0x01eb, B:83:0x01f1, B:85:0x01ff, B:87:0x0207, B:89:0x020d, B:91:0x0217, B:92:0x023b, B:93:0x024c, B:51:0x0159, B:53:0x015d, B:54:0x0166, B:56:0x0174, B:58:0x0188, B:60:0x018e, B:62:0x019f, B:64:0x01a9, B:65:0x01b1), top: B:108:0x0159 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01eb A[Catch: Exception -> 0x01df, TryCatch #1 {Exception -> 0x01df, blocks: (B:75:0x01da, B:79:0x01e3, B:81:0x01eb, B:83:0x01f1, B:85:0x01ff, B:87:0x0207, B:89:0x020d, B:91:0x0217, B:92:0x023b, B:93:0x024c, B:51:0x0159, B:53:0x015d, B:54:0x0166, B:56:0x0174, B:58:0x0188, B:60:0x018e, B:62:0x019f, B:64:0x01a9, B:65:0x01b1), top: B:108:0x0159 }] */
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
        SignInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1 signInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1;
        final String str2;
        Object deviceMetadata;
        AuthEnvironment authEnvironment3;
        Map<String, String> map;
        DeviceMetadata.Metadata metadata;
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
            AuthEnvironment authEnvironment4 = (AuthEnvironment) environment;
            authEnvironment4.getLogger().verbose(id + " Starting execution");
            try {
                AuthHelper.Companion companion = AuthHelper.Companion;
                String username = this.$event$inlined.getUsername();
                UserPoolConfiguration userPool = authEnvironment4.getConfiguration().getUserPool();
                String appClient = userPool != null ? userPool.getAppClient() : null;
                UserPoolConfiguration userPool2 = authEnvironment4.getConfiguration().getUserPool();
                String secretHash = companion.getSecretHash(username, appClient, userPool2 != null ? userPool2.getAppClientSecret() : null);
                mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("USERNAME", this.$event$inlined.getUsername()));
                if (secretHash != null) {
                    mapDjBIcL.put("SECRET_HASH", secretHash);
                }
                String username2 = this.$event$inlined.getUsername();
                anonymousClass1.L$0 = this;
                eventDispatcher2 = eventDispatcher;
                try {
                    anonymousClass1.L$1 = eventDispatcher2;
                    anonymousClass1.L$2 = id;
                    anonymousClass1.L$3 = authEnvironment4;
                    anonymousClass1.L$4 = mapDjBIcL;
                    anonymousClass1.label = 1;
                    Object userContextData = authEnvironment4.getUserContextData(username2, anonymousClass1);
                    if (userContextData == objCopydefault2) {
                        return objCopydefault2;
                    }
                    str = id;
                    authEnvironment2 = authEnvironment4;
                    objCopydefault = userContextData;
                    signInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1 = this;
                    str2 = (String) objCopydefault;
                    String username3 = signInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1.$event$inlined.getUsername();
                    anonymousClass1.L$0 = signInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1;
                    anonymousClass1.L$1 = eventDispatcher2;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = authEnvironment2;
                    anonymousClass1.L$4 = mapDjBIcL;
                    anonymousClass1.L$5 = str2;
                    anonymousClass1.label = 2;
                    deviceMetadata = authEnvironment2.getDeviceMetadata(username3, anonymousClass1);
                    if (deviceMetadata != objCopydefault2) {
                    }
                } catch (Exception e) {
                    e = e;
                    authEnvironment = authEnvironment4;
                    SignInEvent signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + signInEvent.getType());
                    eventDispatcher2.send(signInEvent);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    authEnvironment3 = authEnvironment;
                    str = id;
                }
            } catch (Exception e2) {
                e = e2;
                eventDispatcher2 = eventDispatcher;
            }
        } else {
            if (i2 == 1) {
                Map<String, String> map2 = (Map) anonymousClass1.L$4;
                authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
                String str3 = (String) anonymousClass1.L$2;
                eventDispatcher2 = (EventDispatcher) anonymousClass1.L$1;
                SignInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1 signInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$12 = (SignInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1) anonymousClass1.L$0;
                try {
                    C56391yDq.AEQbTJ(objCopydefault);
                    mapDjBIcL = map2;
                    signInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1 = signInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$12;
                    str = str3;
                } catch (Exception e3) {
                    e = e3;
                    authEnvironment = authEnvironment2;
                    id = str3;
                    SignInEvent signInEvent2 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + signInEvent2.getType());
                    eventDispatcher2.send(signInEvent2);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    authEnvironment3 = authEnvironment;
                    str = id;
                }
                try {
                    str2 = (String) objCopydefault;
                    String username32 = signInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1.$event$inlined.getUsername();
                    anonymousClass1.L$0 = signInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1;
                    anonymousClass1.L$1 = eventDispatcher2;
                    anonymousClass1.L$2 = str;
                    anonymousClass1.L$3 = authEnvironment2;
                    anonymousClass1.L$4 = mapDjBIcL;
                    anonymousClass1.L$5 = str2;
                    anonymousClass1.label = 2;
                    deviceMetadata = authEnvironment2.getDeviceMetadata(username32, anonymousClass1);
                    if (deviceMetadata != objCopydefault2) {
                        return objCopydefault2;
                    }
                    Map<String, String> map3 = mapDjBIcL;
                    authEnvironment3 = authEnvironment2;
                    map = map3;
                    metadata = (DeviceMetadata.Metadata) deviceMetadata;
                    if (metadata != null) {
                    }
                    final String pinpointEndpointId = authEnvironment3.getPinpointEndpointId();
                    cognitoIdentityProviderClient = authEnvironment3.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient == null) {
                    }
                } catch (Exception e4) {
                    e = e4;
                    authEnvironment = authEnvironment2;
                    id = str;
                    SignInEvent signInEvent22 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + signInEvent22.getType());
                    eventDispatcher2.send(signInEvent22);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    authEnvironment3 = authEnvironment;
                    str = id;
                    authEnvironment3.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
                    eventDispatcher2.send(authenticationEvent);
                    return Unit.INSTANCE;
                }
            } else if (i2 == 2) {
                String str4 = (String) anonymousClass1.L$5;
                map = (Map) anonymousClass1.L$4;
                authEnvironment3 = (AuthEnvironment) anonymousClass1.L$3;
                String str5 = (String) anonymousClass1.L$2;
                EventDispatcher eventDispatcher4 = (EventDispatcher) anonymousClass1.L$1;
                SignInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1 signInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$13 = (SignInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1) anonymousClass1.L$0;
                try {
                    C56391yDq.AEQbTJ(objCopydefault);
                    str2 = str4;
                    signInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1 = signInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$13;
                    deviceMetadata = objCopydefault;
                    str = str5;
                    eventDispatcher2 = eventDispatcher4;
                } catch (Exception e5) {
                    e = e5;
                    authEnvironment = authEnvironment3;
                    id = str5;
                    eventDispatcher2 = eventDispatcher4;
                    SignInEvent signInEvent222 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + signInEvent222.getType());
                    eventDispatcher2.send(signInEvent222);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    authEnvironment3 = authEnvironment;
                    str = id;
                }
                try {
                    metadata = (DeviceMetadata.Metadata) deviceMetadata;
                    if (metadata != null) {
                        map.put("DEVICE_KEY", metadata.getDeviceKey());
                    }
                    final String pinpointEndpointId2 = authEnvironment3.getPinpointEndpointId();
                    cognitoIdentityProviderClient = authEnvironment3.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient == null) {
                        BroadcastOptions.Activity activity = new BroadcastOptions.Activity();
                        activity.copydefault(NetworkErrorException.Application.AEQbTJ);
                        UserPoolConfiguration userPool3 = authEnvironment3.getConfiguration().getUserPool();
                        activity.AEQbTJ(userPool3 != null ? userPool3.getAppClient() : null);
                        activity.KWHzl(map);
                        activity.AEQbTJ(signInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1.$event$inlined.getMetadata());
                        if (pinpointEndpointId2 != null) {
                            activity.copydefault(new Function1<AccountManagerResponse.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.SignInCustomCognitoActions$initiateCustomSignInAuthAction$1$evt$initiateAuthResponse$1$1$1
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
                        if (str2 != null) {
                            activity.OLrzqt(new Function1<RestoreDescription.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.SignInCustomCognitoActions$initiateCustomSignInAuthAction$1$evt$initiateAuthResponse$1$2$1
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
                                    application.copydefault(str2);
                                }
                            });
                        }
                        BroadcastOptions broadcastOptionsEZpvd = activity.EZpvd();
                        anonymousClass1.L$0 = signInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1;
                        anonymousClass1.L$1 = eventDispatcher2;
                        anonymousClass1.L$2 = str;
                        anonymousClass1.L$3 = authEnvironment3;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.label = 3;
                        objCopydefault = cognitoIdentityProviderClient.copydefault(broadcastOptionsEZpvd, anonymousClass1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        authEnvironment = authEnvironment3;
                        eventDispatcher3 = eventDispatcher2;
                        id = str;
                        dialogFragment = (DialogFragment) objCopydefault;
                        authEnvironment3 = authEnvironment;
                        str = id;
                        eventDispatcher2 = eventDispatcher3;
                        if (!Intrinsics.EZpvd(dialogFragment != null ? dialogFragment.OLrzqt() : null, GrantCredentialsPermissionActivity.Application.AEQbTJ)) {
                        }
                        throw new ServiceException("This sign in method is not supported", "Please consult our docs for supported sign in methods", null, 4, null);
                    }
                    dialogFragment = null;
                    if (!Intrinsics.EZpvd(dialogFragment != null ? dialogFragment.OLrzqt() : null, GrantCredentialsPermissionActivity.Application.AEQbTJ)) {
                    }
                    throw new ServiceException("This sign in method is not supported", "Please consult our docs for supported sign in methods", null, 4, null);
                } catch (Exception e6) {
                    e = e6;
                    authEnvironment = authEnvironment3;
                    id = str;
                    SignInEvent signInEvent2222 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + signInEvent2222.getType());
                    eventDispatcher2.send(signInEvent2222);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    authEnvironment3 = authEnvironment;
                    str = id;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
                id = (String) anonymousClass1.L$2;
                eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
                signInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1 = (SignInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1) anonymousClass1.L$0;
                try {
                    C56391yDq.AEQbTJ(objCopydefault);
                    dialogFragment = (DialogFragment) objCopydefault;
                    authEnvironment3 = authEnvironment;
                    str = id;
                    eventDispatcher2 = eventDispatcher3;
                    if (!Intrinsics.EZpvd(dialogFragment != null ? dialogFragment.OLrzqt() : null, GrantCredentialsPermissionActivity.Application.AEQbTJ) && dialogFragment.copydefault() != null) {
                        AuthHelper.Companion companion2 = AuthHelper.Companion;
                        String username4 = signInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1.$event$inlined.getUsername();
                        Map<String, String> mapCopydefault = dialogFragment.copydefault();
                        String str6 = mapCopydefault != null ? mapCopydefault.get("USERNAME") : null;
                        Map<String, String> mapCopydefault2 = dialogFragment.copydefault();
                        authenticationEvent = SignInChallengeHelper.INSTANCE.evaluateNextStep(companion2.getActiveUsername(username4, str6, mapCopydefault2 != null ? mapCopydefault2.get("USER_ID_FOR_SRP") : null), dialogFragment.OLrzqt(), dialogFragment.AEQbTJ(), dialogFragment.copydefault(), dialogFragment.EZpvd(), new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.CUSTOM_AUTH));
                    } else {
                        throw new ServiceException("This sign in method is not supported", "Please consult our docs for supported sign in methods", null, 4, null);
                    }
                } catch (Exception e7) {
                    e = e7;
                    eventDispatcher2 = eventDispatcher3;
                    SignInEvent signInEvent22222 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + signInEvent22222.getType());
                    eventDispatcher2.send(signInEvent22222);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    authEnvironment3 = authEnvironment;
                    str = id;
                }
            }
            SignInEvent signInEvent222222 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
            authEnvironment.getLogger().verbose(id + " Sending event " + signInEvent222222.getType());
            eventDispatcher2.send(signInEvent222222);
            authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
            authEnvironment3 = authEnvironment;
            str = id;
        }
        authEnvironment3.getLogger().verbose(str + " Sending event " + authenticationEvent.getType());
        eventDispatcher2.send(authenticationEvent);
        return Unit.INSTANCE;
    }

    public SignInCustomCognitoActions$initiateCustomSignInAuthAction$$inlined$invoke$1(String str, CustomSignInEvent.EventType.InitiateCustomSignIn initiateCustomSignIn) {
        this.$event$inlined = initiateCustomSignIn;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
