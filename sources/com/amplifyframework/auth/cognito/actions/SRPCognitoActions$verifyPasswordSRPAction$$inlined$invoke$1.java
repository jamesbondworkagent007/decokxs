package com.amplifyframework.auth.cognito.actions;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.ResourceNotFoundException;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.StoreClientBehavior;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SRPHelper;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.AccountManagerResponse;
import o.BinaryOperator;
import o.C56390yDp;
import o.C56391yDq;
import o.C56424yEw;
import o.C56442yFn;
import o.GrantCredentialsPermissionActivity;
import o.RecoverableSecurityException;
import o.RemoteAction;
import o.RestoreDescription;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ Map $challengeParameters$inlined;
    final /* synthetic */ Map $metadata$inlined;
    final /* synthetic */ String $session$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1$1, reason: invalid class name */
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
            return SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(5:13|83|84|86|87)(2:14|15))(9:16|98|17|18|102|56|57|104|(4:62|84|86|87)(2:63|64)))(4:21|88|22|23))(14:26|90|27|(3:96|29|30)(1:33)|34|35|92|36|(1:38)|39|40|94|41|(1:43)(1:44))|100|45|(5:47|(1:49)|(1:51)|52|(1:54)(6:55|102|56|57|104|(0)(0)))(3:60|104|(0)(0))|77|(2:79|(1:81)(5:82|83|84|86|87))(3:85|86|87)) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0263, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0231 A[Catch: Exception -> 0x0261, TRY_ENTER, TryCatch #8 {Exception -> 0x0261, blocks: (B:62:0x0231, B:63:0x024f, B:64:0x0260), top: B:104:0x022f }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024f A[Catch: Exception -> 0x0261, TryCatch #8 {Exception -> 0x0261, blocks: (B:62:0x0231, B:63:0x024f, B:64:0x0260), top: B:104:0x022f }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02be  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.Date, kotlin.jvm.internal.DefaultConstructorMarker] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String id;
        EventDispatcher eventDispatcher2;
        String str;
        EventDispatcher eventDispatcher3;
        AuthEnvironment authEnvironment;
        SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1;
        String poolId;
        Object userContextData;
        String str2;
        Map<String, String> map;
        String str3;
        EventDispatcher eventDispatcher4;
        String str4;
        RecoverableSecurityException recoverableSecurityException;
        AuthEnvironment authEnvironment2;
        String str5;
        SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$12;
        String str6;
        StateMachineEvent authenticationEvent;
        Map mapIsConnected;
        ?? r6;
        SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$13;
        AuthEnvironment authEnvironment3;
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
            AuthEnvironment authEnvironment4 = (AuthEnvironment) environment;
            authEnvironment4.getLogger().verbose(id + " Starting execution");
            try {
                String str7 = (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) this.$challengeParameters$inlined), "SALT");
                String str8 = (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) this.$challengeParameters$inlined), "SECRET_BLOCK");
                String str9 = (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) this.$challengeParameters$inlined), "SRP_B");
                String str10 = (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) this.$challengeParameters$inlined), "USERNAME");
                String str11 = (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) this.$challengeParameters$inlined), "USER_ID_FOR_SRP");
                String str12 = (String) this.$challengeParameters$inlined.getOrDefault("DEVICE_KEY", "");
                SRPHelper srpHelper$aws_auth_cognito_release = authEnvironment4.getSrpHelper$aws_auth_cognito_release();
                UserPoolConfiguration userPool = authEnvironment4.getConfiguration().getUserPool();
                if (userPool != null) {
                    try {
                        poolId = userPool.getPoolId();
                    } catch (Exception e) {
                        e = e;
                        eventDispatcher3 = eventDispatcher;
                        str = " Sending event ";
                        authEnvironment = authEnvironment4;
                        sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 = this;
                    }
                } else {
                    poolId = null;
                }
                Intrinsics.copydefault((Object) poolId);
                srpHelper$aws_auth_cognito_release.setUserPoolParams(str11, poolId);
                String secretHash = AuthHelper.Companion.getSecretHash(str10, authEnvironment4.getConfiguration().getUserPool().getAppClient(), authEnvironment4.getConfiguration().getUserPool().getAppClientSecret());
                Pair[] pairArr = new Pair[4];
                pairArr[0] = C56390yDp.OLrzqt("USERNAME", str10);
                pairArr[1] = C56390yDp.OLrzqt("PASSWORD_CLAIM_SECRET_BLOCK", str8);
                str = " Sending event ";
                try {
                    pairArr[2] = C56390yDp.OLrzqt("PASSWORD_CLAIM_SIGNATURE", authEnvironment4.getSrpHelper$aws_auth_cognito_release().getSignature(str7, str9, str8));
                    pairArr[3] = C56390yDp.OLrzqt("TIMESTAMP", authEnvironment4.getSrpHelper$aws_auth_cognito_release().getDateString());
                    Map<String, String> mapDjBIcL = C56424yEw.djBIcL(pairArr);
                    if (secretHash != null) {
                        mapDjBIcL.put("SECRET_HASH", secretHash);
                    }
                    mapDjBIcL.put("DEVICE_KEY", str12);
                    anonymousClass1.L$0 = this;
                    eventDispatcher2 = eventDispatcher;
                    try {
                        anonymousClass1.L$1 = eventDispatcher2;
                        anonymousClass1.L$2 = id;
                        anonymousClass1.L$3 = authEnvironment4;
                        anonymousClass1.L$4 = str10;
                        anonymousClass1.L$5 = mapDjBIcL;
                        anonymousClass1.label = 1;
                        userContextData = authEnvironment4.getUserContextData(str10, anonymousClass1);
                        if (userContextData == objCopydefault) {
                            return objCopydefault;
                        }
                        str2 = id;
                        authEnvironment = authEnvironment4;
                        sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 = this;
                        map = mapDjBIcL;
                        str3 = str10;
                        eventDispatcher4 = eventDispatcher2;
                    } catch (Exception e2) {
                        e = e2;
                        eventDispatcher3 = eventDispatcher2;
                        authEnvironment = authEnvironment4;
                        sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 = this;
                    }
                } catch (Exception e3) {
                    e = e3;
                    eventDispatcher2 = eventDispatcher;
                }
            } catch (Exception e4) {
                e = e4;
                eventDispatcher2 = eventDispatcher;
                str = " Sending event ";
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mapIsConnected = (Map) anonymousClass1.L$4;
                    authEnvironment3 = (AuthEnvironment) anonymousClass1.L$3;
                    id = (String) anonymousClass1.L$2;
                    EventDispatcher eventDispatcher5 = (EventDispatcher) anonymousClass1.L$1;
                    sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$13 = (SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1) anonymousClass1.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt);
                    eventDispatcher3 = eventDispatcher5;
                    str = " Sending event ";
                    r6 = 0;
                    authenticationEvent = new SRPEvent(new SRPEvent.EventType.RetryRespondPasswordVerifier(mapIsConnected, sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$13.$metadata$inlined, sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$13.$session$inlined), r6, 2, r6);
                    authEnvironment = authEnvironment3;
                    str6 = str;
                    authEnvironment.getLogger().verbose(id + str6 + authenticationEvent.getType());
                    eventDispatcher3.send(authenticationEvent);
                    return Unit.INSTANCE;
                }
                str3 = (String) anonymousClass1.L$4;
                authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
                str5 = (String) anonymousClass1.L$2;
                eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
                sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$12 = (SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1) anonymousClass1.L$0;
                try {
                    C56391yDq.AEQbTJ(objOLrzqt);
                    str = " Sending event ";
                    try {
                        recoverableSecurityException = (RecoverableSecurityException) objOLrzqt;
                        str4 = str3;
                        sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 = sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$12;
                        String str13 = str5;
                        authEnvironment = authEnvironment2;
                        id = str13;
                        try {
                        } catch (Exception e5) {
                            e = e5;
                            if (!(e instanceof ResourceNotFoundException)) {
                            }
                        }
                    } catch (Exception e6) {
                        e = e6;
                        sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 = sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$12;
                        String str14 = str5;
                        authEnvironment = authEnvironment2;
                        id = str14;
                    }
                } catch (Exception e7) {
                    e = e7;
                    str = " Sending event ";
                    sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 = sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$12;
                    String str142 = str5;
                    authEnvironment = authEnvironment2;
                    id = str142;
                    if (!(e instanceof ResourceNotFoundException)) {
                    }
                }
                if (recoverableSecurityException != null) {
                    authenticationEvent = SignInChallengeHelper.evaluateNextStep$default(SignInChallengeHelper.INSTANCE, str4, recoverableSecurityException.AEQbTJ(), recoverableSecurityException.KWHzl(), recoverableSecurityException.copydefault(), recoverableSecurityException.EZpvd(), null, 32, null);
                    str6 = str;
                    authEnvironment.getLogger().verbose(id + str6 + authenticationEvent.getType());
                    eventDispatcher3.send(authenticationEvent);
                    return Unit.INSTANCE;
                }
                throw new ServiceException("Sign in failed", "Sorry, we don't have a suggested fix for this error yet.", null, 4, null);
            }
            Map<String, String> map2 = (Map) anonymousClass1.L$5;
            String str15 = (String) anonymousClass1.L$4;
            authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
            str2 = (String) anonymousClass1.L$2;
            eventDispatcher4 = (EventDispatcher) anonymousClass1.L$1;
            sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 = (SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
                str = " Sending event ";
                userContextData = objOLrzqt;
                map = map2;
                str3 = str15;
            } catch (Exception e8) {
                e = e8;
                str = " Sending event ";
                id = str2;
                eventDispatcher3 = eventDispatcher4;
                if (!(e instanceof ResourceNotFoundException)) {
                }
            }
        }
        final String str16 = (String) userContextData;
        final String pinpointEndpointId = authEnvironment.getPinpointEndpointId();
        BinaryOperator cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
        if (cognitoIdentityProviderClient != null) {
            RemoteAction.ActionBar actionBar = new RemoteAction.ActionBar();
            actionBar.KWHzl(GrantCredentialsPermissionActivity.FragmentManager.EZpvd);
            actionBar.EZpvd(authEnvironment.getConfiguration().getUserPool().getAppClient());
            actionBar.copydefault(map);
            actionBar.OLrzqt(sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1.$metadata$inlined);
            actionBar.OLrzqt(sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1.$session$inlined);
            if (pinpointEndpointId != null) {
                actionBar.KWHzl(new Function1<AccountManagerResponse.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$verifyPasswordSRPAction$1$evt$response$1$1$1
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
            if (str16 != null) {
                actionBar.EZpvd(new Function1<RestoreDescription.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$verifyPasswordSRPAction$1$evt$response$1$2$1
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
                        application.copydefault(str16);
                    }
                });
            }
            RemoteAction remoteActionKWHzl = actionBar.KWHzl();
            anonymousClass1.L$0 = sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1;
            anonymousClass1.L$1 = eventDispatcher4;
            anonymousClass1.L$2 = str2;
            anonymousClass1.L$3 = authEnvironment;
            anonymousClass1.L$4 = str3;
            anonymousClass1.L$5 = null;
            anonymousClass1.label = 2;
            objOLrzqt = cognitoIdentityProviderClient.OLrzqt(remoteActionKWHzl, anonymousClass1);
            if (objOLrzqt == objCopydefault) {
                return objCopydefault;
            }
            authEnvironment2 = authEnvironment;
            str5 = str2;
            eventDispatcher3 = eventDispatcher4;
            sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$12 = sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1;
            recoverableSecurityException = (RecoverableSecurityException) objOLrzqt;
            str4 = str3;
            sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1 = sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$12;
            String str132 = str5;
            authEnvironment = authEnvironment2;
            id = str132;
            if (recoverableSecurityException != null) {
            }
        } else {
            str4 = str3;
            id = str2;
            eventDispatcher3 = eventDispatcher4;
            recoverableSecurityException = null;
            if (recoverableSecurityException != null) {
            }
        }
        if (!(e instanceof ResourceNotFoundException)) {
            mapIsConnected = C56424yEw.isConnected(sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1.$challengeParameters$inlined);
            mapIsConnected.remove("DEVICE_KEY");
            StoreClientBehavior credentialStoreClient = authEnvironment.getCredentialStoreClient();
            CredentialType.Device device = new CredentialType.Device((String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) mapIsConnected), "USERNAME"));
            anonymousClass1.L$0 = sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1;
            anonymousClass1.L$1 = eventDispatcher3;
            anonymousClass1.L$2 = id;
            anonymousClass1.L$3 = authEnvironment;
            anonymousClass1.L$4 = mapIsConnected;
            r6 = 0;
            anonymousClass1.L$5 = null;
            anonymousClass1.label = 3;
            if (credentialStoreClient.clearCredentials(device, anonymousClass1) == objCopydefault) {
                return objCopydefault;
            }
            sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$13 = sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1;
            authEnvironment3 = authEnvironment;
            authenticationEvent = new SRPEvent(new SRPEvent.EventType.RetryRespondPasswordVerifier(mapIsConnected, sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$13.$metadata$inlined, sRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$13.$session$inlined), r6, 2, r6);
            authEnvironment = authEnvironment3;
            str6 = str;
            authEnvironment.getLogger().verbose(id + str6 + authenticationEvent.getType());
            eventDispatcher3.send(authenticationEvent);
            return Unit.INSTANCE;
        }
        SRPEvent sRPEvent = new SRPEvent(new SRPEvent.EventType.ThrowPasswordVerifierError(e), null, 2, null);
        Logger logger = authEnvironment.getLogger();
        String type = sRPEvent.getType();
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        str6 = str;
        sb.append(str6);
        sb.append(type);
        logger.verbose(sb.toString());
        eventDispatcher3.send(sRPEvent);
        SignInEvent signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
        authEnvironment.getLogger().verbose(id + str6 + sRPEvent.getType());
        eventDispatcher3.send(signInEvent);
        authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
        authEnvironment.getLogger().verbose(id + str6 + authenticationEvent.getType());
        eventDispatcher3.send(authenticationEvent);
        return Unit.INSTANCE;
    }

    public SRPCognitoActions$verifyPasswordSRPAction$$inlined$invoke$1(String str, Map map, Map map2, String str2) {
        this.$challengeParameters$inlined = map;
        this.$metadata$inlined = map2;
        this.$session$inlined = str2;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
