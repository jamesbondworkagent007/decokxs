package com.amplifyframework.auth.cognito.actions;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.ResourceNotFoundException;
import com.amplifyframework.auth.AuthUserAttribute;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.StoreClientBehavior;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AuthChallenge;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.CustomSignInEvent;
import com.amplifyframework.statemachine.codegen.events.SignInChallengeEvent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AccountManagerResponse;
import o.BinaryOperator;
import o.C56391yDq;
import o.C56403yEb;
import o.C56424yEw;
import o.C56442yFn;
import o.GrantCredentialsPermissionActivity;
import o.RecoverableSecurityException;
import o.RemoteAction;
import o.RestoreDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ String $answer$inlined;
    final /* synthetic */ List $attributes$inlined;
    final /* synthetic */ AuthChallenge $challenge$inlined;
    final /* synthetic */ Map $metadata$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.SignInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1$1, reason: invalid class name */
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
            return SignInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0199 A[Catch: Exception -> 0x0089, TryCatch #2 {Exception -> 0x0089, blocks: (B:90:0x0211, B:94:0x021a, B:96:0x0236, B:22:0x0084, B:66:0x0178, B:70:0x018b, B:72:0x0199, B:74:0x01a8, B:76:0x01ae, B:78:0x01d3, B:80:0x01dd, B:81:0x01e5), top: B:120:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0211 A[Catch: Exception -> 0x0089, TRY_ENTER, TryCatch #2 {Exception -> 0x0089, blocks: (B:90:0x0211, B:94:0x021a, B:96:0x0236, B:22:0x0084, B:66:0x0178, B:70:0x018b, B:72:0x0199, B:74:0x01a8, B:76:0x01ae, B:78:0x01d3, B:80:0x01dd, B:81:0x01e5), top: B:120:0x0084 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0236 A[Catch: Exception -> 0x0089, TRY_LEAVE, TryCatch #2 {Exception -> 0x0089, blocks: (B:90:0x0211, B:94:0x021a, B:96:0x0236, B:22:0x0084, B:66:0x0178, B:70:0x018b, B:72:0x0199, B:74:0x01a8, B:76:0x01ae, B:78:0x01d3, B:80:0x01dd, B:81:0x01e5), top: B:120:0x0084 }] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String id;
        AuthEnvironment authEnvironment;
        EventDispatcher eventDispatcher2;
        SignInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1 signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1;
        EventDispatcher eventDispatcher3;
        String username;
        Map<String, String> linkedHashMap;
        Map<String, String> map;
        String str;
        final String str2;
        BinaryOperator cognitoIdentityProviderClient;
        RecoverableSecurityException recoverableSecurityException;
        AuthEnvironment authEnvironment2;
        String str3;
        EventDispatcher eventDispatcher4;
        SignInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1 signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12;
        EventDispatcher eventDispatcher5;
        StateMachineEvent customSignInEvent;
        AuthEnvironment authEnvironment3;
        String str4;
        SignInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1 signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$13;
        EventDispatcher eventDispatcher6;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objOLrzqt = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            Intrinsics.copydefault(environment, "");
            id = getId();
            authEnvironment = (AuthEnvironment) environment;
            authEnvironment.getLogger().verbose(id + " Starting execution");
            try {
                username = this.$challenge$inlined.getUsername();
                linkedHashMap = new LinkedHashMap<>();
                if (username != null) {
                    try {
                        if (username.length() != 0) {
                            linkedHashMap.put("USERNAME", username);
                        }
                    } catch (Exception e) {
                        e = e;
                        eventDispatcher3 = eventDispatcher;
                        signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1 = this;
                        authEnvironment2 = authEnvironment;
                        eventDispatcher5 = eventDispatcher3;
                        signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12 = signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1;
                        if (e instanceof ResourceNotFoundException) {
                        }
                    }
                }
                String challengeResponseKey = SignInChallengeCognitoActions.INSTANCE.getChallengeResponseKey(this.$challenge$inlined.getChallengeName());
                if (challengeResponseKey != null) {
                    linkedHashMap.put(challengeResponseKey, this.$answer$inlined);
                }
                List<AuthUserAttribute> list = this.$attributes$inlined;
                ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
                for (AuthUserAttribute authUserAttribute : list) {
                    arrayList.add(new Pair("userAttributes." + authUserAttribute.getKey().getKeyString(), authUserAttribute.getValue()));
                }
                C56424yEw.OLrzqt(linkedHashMap, arrayList);
                AuthHelper.Companion companion = AuthHelper.Companion;
                UserPoolConfiguration userPool = authEnvironment.getConfiguration().getUserPool();
                String appClient = userPool != null ? userPool.getAppClient() : null;
                UserPoolConfiguration userPool2 = authEnvironment.getConfiguration().getUserPool();
                String secretHash = companion.getSecretHash(username, appClient, userPool2 != null ? userPool2.getAppClientSecret() : null);
                if (secretHash != null) {
                    linkedHashMap.put("SECRET_HASH", secretHash);
                }
            } catch (Exception e2) {
                e = e2;
                eventDispatcher2 = eventDispatcher;
            }
            if (username != null) {
                anonymousClass1.L$0 = this;
                eventDispatcher2 = eventDispatcher;
                try {
                    anonymousClass1.L$1 = eventDispatcher2;
                    anonymousClass1.L$2 = id;
                    anonymousClass1.L$3 = authEnvironment;
                    anonymousClass1.L$4 = username;
                    anonymousClass1.L$5 = linkedHashMap;
                    anonymousClass1.label = 1;
                    Object userContextData = authEnvironment.getUserContextData(username, anonymousClass1);
                    if (userContextData == objCopydefault) {
                        return objCopydefault;
                    }
                    signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1 = this;
                    eventDispatcher3 = eventDispatcher2;
                    objOLrzqt = userContextData;
                } catch (Exception e3) {
                    e = e3;
                    signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1 = this;
                    eventDispatcher3 = eventDispatcher2;
                    authEnvironment2 = authEnvironment;
                    eventDispatcher5 = eventDispatcher3;
                    signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12 = signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1;
                    if (e instanceof ResourceNotFoundException) {
                    }
                }
            } else {
                signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1 = this;
                eventDispatcher3 = eventDispatcher;
                map = linkedHashMap;
                str = username;
                str2 = null;
                final String pinpointEndpointId = authEnvironment.getPinpointEndpointId();
                cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient == null) {
                    RemoteAction.ActionBar actionBar = new RemoteAction.ActionBar();
                    UserPoolConfiguration userPool3 = authEnvironment.getConfiguration().getUserPool();
                    actionBar.EZpvd(userPool3 != null ? userPool3.getAppClient() : null);
                    actionBar.KWHzl(GrantCredentialsPermissionActivity.copydefault.EZpvd(signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1.$challenge$inlined.getChallengeName()));
                    actionBar.copydefault(map);
                    actionBar.OLrzqt(signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1.$challenge$inlined.getSession());
                    actionBar.OLrzqt(signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1.$metadata$inlined);
                    if (pinpointEndpointId != null) {
                        actionBar.KWHzl(new Function1<AccountManagerResponse.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.SignInChallengeCognitoActions$verifyChallengeAuthAction$1$evt$response$1$1$1
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
                    if (str2 != null) {
                        actionBar.EZpvd(new Function1<RestoreDescription.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.SignInChallengeCognitoActions$verifyChallengeAuthAction$1$evt$response$1$2$1
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
                    RemoteAction remoteActionKWHzl = actionBar.KWHzl();
                    anonymousClass1.L$0 = signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1;
                    anonymousClass1.L$1 = eventDispatcher3;
                    anonymousClass1.L$2 = id;
                    anonymousClass1.L$3 = authEnvironment;
                    anonymousClass1.L$4 = str;
                    anonymousClass1.L$5 = null;
                    anonymousClass1.label = 2;
                    objOLrzqt = cognitoIdentityProviderClient.OLrzqt(remoteActionKWHzl, anonymousClass1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    authEnvironment2 = authEnvironment;
                    str3 = id;
                    eventDispatcher4 = eventDispatcher3;
                    signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12 = signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1;
                    recoverableSecurityException = (RecoverableSecurityException) objOLrzqt;
                    signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1 = signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12;
                    eventDispatcher3 = eventDispatcher4;
                    id = str3;
                    authEnvironment = authEnvironment2;
                    if (recoverableSecurityException != null) {
                    }
                    authEnvironment.getLogger().verbose(id + " Sending event " + customSignInEvent.getType());
                    eventDispatcher3.send(customSignInEvent);
                    return Unit.INSTANCE;
                }
                recoverableSecurityException = null;
                if (recoverableSecurityException != null) {
                }
                authEnvironment.getLogger().verbose(id + " Sending event " + customSignInEvent.getType());
                eventDispatcher3.send(customSignInEvent);
                return Unit.INSTANCE;
            }
            signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1 = this;
            eventDispatcher3 = eventDispatcher2;
            authEnvironment2 = authEnvironment;
            eventDispatcher5 = eventDispatcher3;
            signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12 = signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1;
            if (e instanceof ResourceNotFoundException) {
                String username2 = signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12.$challenge$inlined.getUsername();
                if (username2 != null) {
                    StoreClientBehavior credentialStoreClient = authEnvironment2.getCredentialStoreClient();
                    CredentialType.Device device = new CredentialType.Device(username2);
                    anonymousClass1.L$0 = signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12;
                    anonymousClass1.L$1 = eventDispatcher5;
                    anonymousClass1.L$2 = id;
                    anonymousClass1.L$3 = authEnvironment2;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.L$5 = null;
                    anonymousClass1.label = 3;
                    if (credentialStoreClient.clearCredentials(device, anonymousClass1) == objCopydefault) {
                        return objCopydefault;
                    }
                    authEnvironment3 = authEnvironment2;
                    str4 = id;
                    signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$13 = signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12;
                    eventDispatcher6 = eventDispatcher5;
                    authEnvironment = authEnvironment3;
                    signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12 = signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$13;
                    id = str4;
                    eventDispatcher5 = eventDispatcher6;
                    customSignInEvent = new SignInChallengeEvent(new SignInChallengeEvent.EventType.RetryVerifyChallengeAnswer(signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12.$answer$inlined, signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12.$metadata$inlined, signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12.$attributes$inlined, signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12.$challenge$inlined), null, 2, null);
                    eventDispatcher3 = eventDispatcher5;
                    authEnvironment.getLogger().verbose(id + " Sending event " + customSignInEvent.getType());
                    eventDispatcher3.send(customSignInEvent);
                    return Unit.INSTANCE;
                }
                authEnvironment = authEnvironment2;
                customSignInEvent = new SignInChallengeEvent(new SignInChallengeEvent.EventType.RetryVerifyChallengeAnswer(signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12.$answer$inlined, signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12.$metadata$inlined, signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12.$attributes$inlined, signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12.$challenge$inlined), null, 2, null);
                eventDispatcher3 = eventDispatcher5;
                authEnvironment.getLogger().verbose(id + " Sending event " + customSignInEvent.getType());
                eventDispatcher3.send(customSignInEvent);
                return Unit.INSTANCE;
            }
            SignInChallengeEvent signInChallengeEvent = new SignInChallengeEvent(new SignInChallengeEvent.EventType.ThrowError(e, signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12.$challenge$inlined, true), null, 2, null);
            eventDispatcher3 = eventDispatcher5;
            authEnvironment = authEnvironment2;
            customSignInEvent = signInChallengeEvent;
            authEnvironment.getLogger().verbose(id + " Sending event " + customSignInEvent.getType());
            eventDispatcher3.send(customSignInEvent);
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                authEnvironment3 = (AuthEnvironment) anonymousClass1.L$3;
                str4 = (String) anonymousClass1.L$2;
                eventDispatcher6 = (EventDispatcher) anonymousClass1.L$1;
                signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$13 = (SignInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1) anonymousClass1.L$0;
                C56391yDq.AEQbTJ(objOLrzqt);
                authEnvironment = authEnvironment3;
                signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12 = signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$13;
                id = str4;
                eventDispatcher5 = eventDispatcher6;
                customSignInEvent = new SignInChallengeEvent(new SignInChallengeEvent.EventType.RetryVerifyChallengeAnswer(signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12.$answer$inlined, signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12.$metadata$inlined, signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12.$attributes$inlined, signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12.$challenge$inlined), null, 2, null);
                eventDispatcher3 = eventDispatcher5;
                authEnvironment.getLogger().verbose(id + " Sending event " + customSignInEvent.getType());
                eventDispatcher3.send(customSignInEvent);
                return Unit.INSTANCE;
            }
            str = (String) anonymousClass1.L$4;
            authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
            str3 = (String) anonymousClass1.L$2;
            eventDispatcher4 = (EventDispatcher) anonymousClass1.L$1;
            signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12 = (SignInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
                recoverableSecurityException = (RecoverableSecurityException) objOLrzqt;
                signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1 = signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12;
                eventDispatcher3 = eventDispatcher4;
                id = str3;
                authEnvironment = authEnvironment2;
                if (recoverableSecurityException != null) {
                    customSignInEvent = SignInChallengeHelper.evaluateNextStep$default(SignInChallengeHelper.INSTANCE, str == null ? "" : str, recoverableSecurityException.AEQbTJ(), recoverableSecurityException.KWHzl(), recoverableSecurityException.copydefault(), recoverableSecurityException.EZpvd(), null, 32, null);
                    if (customSignInEvent == null) {
                        customSignInEvent = new CustomSignInEvent(new CustomSignInEvent.EventType.ThrowAuthError(new UnknownException("Sign in failed", null, 2, null)), null, 2, null);
                    }
                }
            } catch (Exception e4) {
                e = e4;
                eventDispatcher5 = eventDispatcher4;
                id = str3;
                if (e instanceof ResourceNotFoundException) {
                }
            }
            authEnvironment.getLogger().verbose(id + " Sending event " + customSignInEvent.getType());
            eventDispatcher3.send(customSignInEvent);
            return Unit.INSTANCE;
        }
        linkedHashMap = (Map) anonymousClass1.L$5;
        username = (String) anonymousClass1.L$4;
        authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
        id = (String) anonymousClass1.L$2;
        eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
        signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1 = (SignInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1) anonymousClass1.L$0;
        try {
            C56391yDq.AEQbTJ(objOLrzqt);
        } catch (Exception e5) {
            e = e5;
            authEnvironment2 = authEnvironment;
            eventDispatcher5 = eventDispatcher3;
            signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$12 = signInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1;
            if (e instanceof ResourceNotFoundException) {
            }
        }
        String str5 = (String) objOLrzqt;
        map = linkedHashMap;
        str = username;
        str2 = str5;
        final String pinpointEndpointId2 = authEnvironment.getPinpointEndpointId();
        cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
        if (cognitoIdentityProviderClient == null) {
        }
    }

    public SignInChallengeCognitoActions$verifyChallengeAuthAction$$inlined$invoke$1(String str, AuthChallenge authChallenge, List list, String str2, Map map) {
        this.$challenge$inlined = authChallenge;
        this.$attributes$inlined = list;
        this.$answer$inlined = str2;
        this.$metadata$inlined = map;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
