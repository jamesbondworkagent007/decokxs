package com.amplifyframework.auth.cognito.actions;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.NotAuthorizedException;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SessionHelper;
import com.amplifyframework.auth.exceptions.SessionExpiredException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.LoginsMapProvider;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthorizationEvent;
import com.amplifyframework.statemachine.codegen.events.RefreshSessionEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationUnit;
import o.AccountManagerResponse;
import o.BinaryOperator;
import o.BroadcastOptions;
import o.C5173Hn;
import o.C56391yDq;
import o.C56442yFn;
import o.C56443yFo;
import o.C59462zhW;
import o.C59519zia;
import o.DialogFragment;
import o.NetworkErrorException;
import o.OnAccountsUpdateListener;
import o.RestoreDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ SignedInData $signedInData$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
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
            return FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x01fd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0173 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017d A[Catch: Exception -> 0x0209, NotAuthorizedException -> 0x02da, TryCatch #6 {Exception -> 0x0209, blocks: (B:83:0x01fd, B:85:0x0203, B:91:0x0211, B:93:0x0215, B:95:0x021b, B:98:0x0223, B:100:0x0229, B:102:0x022f, B:104:0x0258, B:107:0x0266, B:109:0x026d, B:114:0x027b, B:116:0x0293, B:118:0x029f, B:120:0x02a5, B:122:0x02af, B:124:0x02b5, B:125:0x02cb, B:106:0x0260, B:57:0x0179, B:59:0x017d, B:60:0x0186, B:62:0x0194, B:64:0x01a8, B:66:0x01ae, B:68:0x01b6, B:70:0x01c0, B:71:0x01c8, B:29:0x00b9, B:53:0x0159), top: B:150:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0194 A[Catch: Exception -> 0x0209, NotAuthorizedException -> 0x02da, TryCatch #6 {Exception -> 0x0209, blocks: (B:83:0x01fd, B:85:0x0203, B:91:0x0211, B:93:0x0215, B:95:0x021b, B:98:0x0223, B:100:0x0229, B:102:0x022f, B:104:0x0258, B:107:0x0266, B:109:0x026d, B:114:0x027b, B:116:0x0293, B:118:0x029f, B:120:0x02a5, B:122:0x02af, B:124:0x02b5, B:125:0x02cb, B:106:0x0260, B:57:0x0179, B:59:0x017d, B:60:0x0186, B:62:0x0194, B:64:0x01a8, B:66:0x01ae, B:68:0x01b6, B:70:0x01c0, B:71:0x01c8, B:29:0x00b9, B:53:0x0159), top: B:150:0x00b9 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020f  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AuthEnvironment authEnvironment;
        EventDispatcher eventDispatcher2;
        String str;
        String str2;
        AuthEnvironment authEnvironment2;
        String username;
        CognitoUserPoolTokens cognitoUserPoolTokens;
        LinkedHashMap linkedHashMap;
        FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1 fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1;
        String str3;
        Map<String, String> map;
        CognitoUserPoolTokens cognitoUserPoolTokens2;
        final String str4;
        Object deviceMetadata;
        Map<String, String> map2;
        CognitoUserPoolTokens cognitoUserPoolTokens3;
        DeviceMetadata.Metadata metadata;
        BinaryOperator cognitoIdentityProviderClient;
        DialogFragment dialogFragment;
        String str5;
        EventDispatcher eventDispatcher3;
        FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1 fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$12;
        StateMachineEvent authorizationEvent;
        NotAuthorizedException notAuthorizedException;
        String userId;
        String username2;
        OnAccountsUpdateListener onAccountsUpdateListenerEZpvd;
        OnAccountsUpdateListener onAccountsUpdateListenerEZpvd2;
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
            String id = getId();
            authEnvironment = (AuthEnvironment) environment;
            authEnvironment.getLogger().verbose(id + " Starting execution");
            try {
                username = this.$signedInData$inlined.getUsername();
                cognitoUserPoolTokens = this.$signedInData$inlined.getCognitoUserPoolTokens();
                linkedHashMap = new LinkedHashMap();
                AuthHelper.Companion companion = AuthHelper.Companion;
                UserPoolConfiguration userPool = authEnvironment.getConfiguration().getUserPool();
                String appClient = userPool != null ? userPool.getAppClient() : null;
                UserPoolConfiguration userPool2 = authEnvironment.getConfiguration().getUserPool();
                String secretHash = companion.getSecretHash(username, appClient, userPool2 != null ? userPool2.getAppClientSecret() : null);
                String refreshToken = cognitoUserPoolTokens.getRefreshToken();
                if (refreshToken != null) {
                    linkedHashMap.put("REFRESH_TOKEN", refreshToken);
                }
                if (secretHash != null) {
                    linkedHashMap.put("SECRET_HASH", secretHash);
                }
                anonymousClass1.L$0 = this;
                eventDispatcher2 = eventDispatcher;
            } catch (NotAuthorizedException e) {
                e = e;
                eventDispatcher2 = eventDispatcher;
            } catch (Exception e2) {
                e = e2;
                eventDispatcher2 = eventDispatcher;
            }
            try {
                anonymousClass1.L$1 = eventDispatcher2;
                anonymousClass1.L$2 = id;
                anonymousClass1.L$3 = authEnvironment;
                anonymousClass1.L$4 = username;
                anonymousClass1.L$5 = cognitoUserPoolTokens;
                anonymousClass1.L$6 = linkedHashMap;
                anonymousClass1.label = 1;
                Object userContextData = authEnvironment.getUserContextData(username, anonymousClass1);
                if (userContextData == objCopydefault2) {
                    return objCopydefault2;
                }
                fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1 = this;
                str3 = username;
                map = linkedHashMap;
                str2 = id;
                objCopydefault = userContextData;
                authEnvironment2 = authEnvironment;
                cognitoUserPoolTokens2 = cognitoUserPoolTokens;
                str4 = (String) objCopydefault;
                anonymousClass1.L$0 = fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1;
                anonymousClass1.L$1 = eventDispatcher2;
                anonymousClass1.L$2 = str2;
                anonymousClass1.L$3 = authEnvironment2;
                anonymousClass1.L$4 = str3;
                anonymousClass1.L$5 = cognitoUserPoolTokens2;
                anonymousClass1.L$6 = map;
                anonymousClass1.L$7 = str4;
                anonymousClass1.label = 2;
                deviceMetadata = authEnvironment2.getDeviceMetadata(str3, anonymousClass1);
                if (deviceMetadata != objCopydefault2) {
                }
            } catch (NotAuthorizedException e3) {
                e = e3;
                str2 = id;
                authEnvironment2 = authEnvironment;
                notAuthorizedException = e;
                authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new SessionExpiredException(null, null, notAuthorizedException, 3, null)), null, 2, null);
                authEnvironment2.getLogger().verbose(str2 + " Sending event " + authorizationEvent.getType());
                eventDispatcher2.send(authorizationEvent);
                return Unit.INSTANCE;
            } catch (Exception e4) {
                e = e4;
                str = id;
                authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment2 = authEnvironment;
                str2 = str;
            }
        } else {
            if (i2 == 1) {
                map = (Map) anonymousClass1.L$6;
                cognitoUserPoolTokens2 = (CognitoUserPoolTokens) anonymousClass1.L$5;
                str3 = (String) anonymousClass1.L$4;
                authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
                str2 = (String) anonymousClass1.L$2;
                eventDispatcher2 = (EventDispatcher) anonymousClass1.L$1;
                fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1 = (FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1) anonymousClass1.L$0;
                try {
                    try {
                        C56391yDq.AEQbTJ(objCopydefault);
                        str4 = (String) objCopydefault;
                        anonymousClass1.L$0 = fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1;
                        anonymousClass1.L$1 = eventDispatcher2;
                        anonymousClass1.L$2 = str2;
                        anonymousClass1.L$3 = authEnvironment2;
                        anonymousClass1.L$4 = str3;
                        anonymousClass1.L$5 = cognitoUserPoolTokens2;
                        anonymousClass1.L$6 = map;
                        anonymousClass1.L$7 = str4;
                        anonymousClass1.label = 2;
                        deviceMetadata = authEnvironment2.getDeviceMetadata(str3, anonymousClass1);
                        if (deviceMetadata != objCopydefault2) {
                            return objCopydefault2;
                        }
                        CognitoUserPoolTokens cognitoUserPoolTokens4 = cognitoUserPoolTokens2;
                        map2 = map;
                        cognitoUserPoolTokens3 = cognitoUserPoolTokens4;
                        metadata = (DeviceMetadata.Metadata) deviceMetadata;
                        if (metadata != null) {
                        }
                        final String pinpointEndpointId = authEnvironment2.getPinpointEndpointId();
                        cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                        if (cognitoIdentityProviderClient == null) {
                        }
                    } catch (NotAuthorizedException e5) {
                        e = e5;
                        authEnvironment = authEnvironment2;
                        str = str2;
                        authEnvironment2 = authEnvironment;
                        str2 = str;
                        notAuthorizedException = e;
                        authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new SessionExpiredException(null, null, notAuthorizedException, 3, null)), null, 2, null);
                        authEnvironment2.getLogger().verbose(str2 + " Sending event " + authorizationEvent.getType());
                        eventDispatcher2.send(authorizationEvent);
                        return Unit.INSTANCE;
                    }
                } catch (Exception e6) {
                    e = e6;
                    authEnvironment = authEnvironment2;
                    str = str2;
                    authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment2 = authEnvironment;
                    str2 = str;
                }
            } else if (i2 == 2) {
                String str6 = (String) anonymousClass1.L$7;
                map2 = (Map) anonymousClass1.L$6;
                CognitoUserPoolTokens cognitoUserPoolTokens5 = (CognitoUserPoolTokens) anonymousClass1.L$5;
                String str7 = (String) anonymousClass1.L$4;
                AuthEnvironment authEnvironment3 = (AuthEnvironment) anonymousClass1.L$3;
                String str8 = (String) anonymousClass1.L$2;
                EventDispatcher eventDispatcher4 = (EventDispatcher) anonymousClass1.L$1;
                FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1 fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$13 = (FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1) anonymousClass1.L$0;
                try {
                    C56391yDq.AEQbTJ(objCopydefault);
                    str4 = str6;
                    cognitoUserPoolTokens3 = cognitoUserPoolTokens5;
                    str3 = str7;
                    authEnvironment2 = authEnvironment3;
                    str2 = str8;
                    eventDispatcher2 = eventDispatcher4;
                    fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1 = fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$13;
                    deviceMetadata = objCopydefault;
                } catch (NotAuthorizedException e7) {
                    notAuthorizedException = e7;
                    authEnvironment2 = authEnvironment3;
                    str2 = str8;
                    eventDispatcher2 = eventDispatcher4;
                    authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new SessionExpiredException(null, null, notAuthorizedException, 3, null)), null, 2, null);
                } catch (Exception e8) {
                    e = e8;
                    authEnvironment = authEnvironment3;
                    str = str8;
                    eventDispatcher2 = eventDispatcher4;
                    authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment2 = authEnvironment;
                    str2 = str;
                }
                try {
                    metadata = (DeviceMetadata.Metadata) deviceMetadata;
                    if (metadata != null) {
                        map2.put("DEVICE_KEY", metadata.getDeviceKey());
                    }
                    final String pinpointEndpointId2 = authEnvironment2.getPinpointEndpointId();
                    cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient == null) {
                        BroadcastOptions.Activity activity = new BroadcastOptions.Activity();
                        activity.copydefault(NetworkErrorException.StateListAnimator.AEQbTJ);
                        UserPoolConfiguration userPool3 = authEnvironment2.getConfiguration().getUserPool();
                        activity.AEQbTJ(userPool3 != null ? userPool3.getAppClient() : null);
                        activity.KWHzl(map2);
                        if (pinpointEndpointId2 != null) {
                            activity.copydefault(new Function1<AccountManagerResponse.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$1$evt$response$1$1$1
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
                        if (str4 != null) {
                            activity.OLrzqt(new Function1<RestoreDescription.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$1$evt$response$1$2$1
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
                                    application.copydefault(str4);
                                }
                            });
                        }
                        BroadcastOptions broadcastOptionsEZpvd = activity.EZpvd();
                        anonymousClass1.L$0 = fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1;
                        anonymousClass1.L$1 = eventDispatcher2;
                        anonymousClass1.L$2 = str2;
                        anonymousClass1.L$3 = authEnvironment2;
                        anonymousClass1.L$4 = str3;
                        anonymousClass1.L$5 = cognitoUserPoolTokens3;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.label = 3;
                        objCopydefault = cognitoIdentityProviderClient.copydefault(broadcastOptionsEZpvd, anonymousClass1);
                        if (objCopydefault == objCopydefault2) {
                            return objCopydefault2;
                        }
                        str5 = str3;
                        authEnvironment = authEnvironment2;
                        str = str2;
                        eventDispatcher3 = eventDispatcher2;
                        fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$12 = fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1;
                        dialogFragment = (DialogFragment) objCopydefault;
                        fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1 = fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$12;
                        authEnvironment2 = authEnvironment;
                        str2 = str;
                        eventDispatcher2 = eventDispatcher3;
                        str3 = str5;
                        if (dialogFragment != null) {
                        }
                    } else {
                        dialogFragment = null;
                        if (dialogFragment != null) {
                        }
                    }
                } catch (NotAuthorizedException e9) {
                    e = e9;
                    notAuthorizedException = e;
                    authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new SessionExpiredException(null, null, notAuthorizedException, 3, null)), null, 2, null);
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cognitoUserPoolTokens3 = (CognitoUserPoolTokens) anonymousClass1.L$5;
                str5 = (String) anonymousClass1.L$4;
                authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
                str = (String) anonymousClass1.L$2;
                eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
                fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$12 = (FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1) anonymousClass1.L$0;
                try {
                    try {
                        C56391yDq.AEQbTJ(objCopydefault);
                    } catch (Exception e10) {
                        e = e10;
                        eventDispatcher2 = eventDispatcher3;
                        authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(e), null, 2, null);
                        authEnvironment2 = authEnvironment;
                        str2 = str;
                    }
                } catch (NotAuthorizedException e11) {
                    e = e11;
                    authEnvironment2 = authEnvironment;
                    str2 = str;
                    eventDispatcher2 = eventDispatcher3;
                    notAuthorizedException = e;
                    authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new SessionExpiredException(null, null, notAuthorizedException, 3, null)), null, 2, null);
                }
                try {
                    dialogFragment = (DialogFragment) objCopydefault;
                    fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1 = fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$12;
                    authEnvironment2 = authEnvironment;
                    str2 = str;
                    eventDispatcher2 = eventDispatcher3;
                    str3 = str5;
                    if (dialogFragment != null) {
                        try {
                            long jOLrzqt = dialogFragment.EZpvd() != null ? r3.OLrzqt() : 0L;
                            String strEZpvd = (dialogFragment == null || (onAccountsUpdateListenerEZpvd2 = dialogFragment.EZpvd()) == null) ? null : onAccountsUpdateListenerEZpvd2.EZpvd();
                            String strCopydefault = (dialogFragment == null || (onAccountsUpdateListenerEZpvd = dialogFragment.EZpvd()) == null) ? null : onAccountsUpdateListenerEZpvd.copydefault();
                            String refreshToken2 = cognitoUserPoolTokens3.getRefreshToken();
                            C5173Hn c5173HnKWHzl = C5173Hn.AEQbTJ.KWHzl();
                            C59462zhW.Activity activity2 = C59462zhW.OLrzqt;
                            CognitoUserPoolTokens cognitoUserPoolTokens6 = new CognitoUserPoolTokens(strEZpvd, strCopydefault, refreshToken2, C56443yFo.KWHzl(c5173HnKWHzl.copydefault(C59519zia.AEQbTJ(jOLrzqt, DurationUnit.SECONDS)).KWHzl()));
                            SignedInData signedInData = fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1.$signedInData$inlined;
                            String accessToken = cognitoUserPoolTokens6.getAccessToken();
                            if (accessToken == null || (userId = SessionHelper.INSTANCE.getUserSub(accessToken)) == null) {
                                userId = fetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1.$signedInData$inlined.getUserId();
                            }
                            String str9 = userId;
                            String accessToken2 = cognitoUserPoolTokens6.getAccessToken();
                            SignedInData signedInDataCopy$default = SignedInData.copy$default(signedInData, str9, (accessToken2 == null || (username2 = SessionHelper.INSTANCE.getUsername(accessToken2)) == null) ? str3 : username2, null, null, cognitoUserPoolTokens6, 12, null);
                            if (authEnvironment2.getConfiguration().getIdentityPool() != null) {
                                UserPoolConfiguration userPool4 = authEnvironment2.getConfiguration().getUserPool();
                                String region = userPool4 != null ? userPool4.getRegion() : null;
                                UserPoolConfiguration userPool5 = authEnvironment2.getConfiguration().getUserPool();
                                String poolId = userPool5 != null ? userPool5.getPoolId() : null;
                                String idToken = cognitoUserPoolTokens6.getIdToken();
                                Intrinsics.copydefault((Object) idToken);
                                authorizationEvent = new RefreshSessionEvent(new RefreshSessionEvent.EventType.RefreshAuthSession(signedInDataCopy$default, new LoginsMapProvider.CognitoUserPoolLogins(region, poolId, idToken)), null, 2, null);
                            } else {
                                authorizationEvent = new RefreshSessionEvent(new RefreshSessionEvent.EventType.Refreshed(signedInDataCopy$default), null, 2, null);
                            }
                        } catch (NotAuthorizedException e12) {
                            e = e12;
                            authEnvironment = authEnvironment2;
                            str = str2;
                            authEnvironment2 = authEnvironment;
                            str2 = str;
                            notAuthorizedException = e;
                            authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new SessionExpiredException(null, null, notAuthorizedException, 3, null)), null, 2, null);
                        }
                    }
                } catch (NotAuthorizedException e13) {
                    e = e13;
                    eventDispatcher2 = eventDispatcher3;
                    authEnvironment2 = authEnvironment;
                    str2 = str;
                    notAuthorizedException = e;
                    authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(new SessionExpiredException(null, null, notAuthorizedException, 3, null)), null, 2, null);
                }
            }
            authorizationEvent = new AuthorizationEvent(new AuthorizationEvent.EventType.ThrowError(e), null, 2, null);
            authEnvironment2 = authEnvironment;
            str2 = str;
        }
        authEnvironment2.getLogger().verbose(str2 + " Sending event " + authorizationEvent.getType());
        eventDispatcher2.send(authorizationEvent);
        return Unit.INSTANCE;
    }

    public FetchAuthSessionCognitoActions$refreshUserPoolTokensAction$$inlined$invoke$1(String str, SignedInData signedInData) {
        this.$signedInData$inlined = signedInData;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
