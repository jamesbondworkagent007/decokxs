package com.amplifyframework.auth.cognito.actions;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.NotAuthorizedException;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.StoreClientBehavior;
import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SRPHelper;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent;
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
public final class DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1 implements Action {
    final /* synthetic */ DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge $event$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1$1, reason: invalid class name */
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
            return DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [48=4] */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(3:(1:(1:(5:14|100|102|103|104)(2:15|16))(5:17|114|18|73|(4:(1:76)|77|103|104)(2:78|79)))(17:22|108|23|24|107|43|(1:49)(1:48)|50|(1:55)|56|(1:58)(1:59)|60|(1:62)(1:63)|64|(1:66)|67|(2:69|(1:71)(3:72|73|(0)(0)))(2:81|82))|94|(2:96|(1:98)(5:99|100|102|103|104))(4:101|102|103|104))(4:27|105|28|29))(7:32|110|33|34|112|35|(1:37)(1:38))|115|39|(1:41)(6:42|107|43|(13:45|47|49|50|(2:52|55)|56|(0)(0)|60|(0)(0)|64|(0)|67|(0)(0))(0)|103|104)) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0234, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0235, code lost:
    
        r7 = r14;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0180 A[Catch: Exception -> 0x0230, TryCatch #1 {Exception -> 0x0230, blocks: (B:43:0x0127, B:45:0x0132, B:50:0x013d, B:52:0x0151, B:56:0x0159, B:58:0x0180, B:60:0x0186, B:62:0x0190, B:64:0x0198, B:66:0x019e, B:67:0x01a3, B:69:0x01ad, B:81:0x022a, B:82:0x022f), top: B:107:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0190 A[Catch: Exception -> 0x0230, TryCatch #1 {Exception -> 0x0230, blocks: (B:43:0x0127, B:45:0x0132, B:50:0x013d, B:52:0x0151, B:56:0x0159, B:58:0x0180, B:60:0x0186, B:62:0x0190, B:64:0x0198, B:66:0x019e, B:67:0x01a3, B:69:0x01ad, B:81:0x022a, B:82:0x022f), top: B:107:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019e A[Catch: Exception -> 0x0230, TryCatch #1 {Exception -> 0x0230, blocks: (B:43:0x0127, B:45:0x0132, B:50:0x013d, B:52:0x0151, B:56:0x0159, B:58:0x0180, B:60:0x0186, B:62:0x0190, B:64:0x0198, B:66:0x019e, B:67:0x01a3, B:69:0x01ad, B:81:0x022a, B:82:0x022f), top: B:107:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ad A[Catch: Exception -> 0x0230, TRY_LEAVE, TryCatch #1 {Exception -> 0x0230, blocks: (B:43:0x0127, B:45:0x0132, B:50:0x013d, B:52:0x0151, B:56:0x0159, B:58:0x0180, B:60:0x0186, B:62:0x0190, B:64:0x0198, B:66:0x019e, B:67:0x01a3, B:69:0x01ad, B:81:0x022a, B:82:0x022f), top: B:107:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0213 A[Catch: Exception -> 0x0075, TryCatch #5 {Exception -> 0x0075, blocks: (B:18:0x0070, B:73:0x01db, B:76:0x01e5, B:77:0x01ff, B:78:0x0213, B:79:0x0224), top: B:114:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x022a A[Catch: Exception -> 0x0230, TRY_ENTER, TryCatch #1 {Exception -> 0x0230, blocks: (B:43:0x0127, B:45:0x0132, B:50:0x013d, B:52:0x0151, B:56:0x0159, B:58:0x0180, B:60:0x0186, B:62:0x0190, B:64:0x0198, B:66:0x019e, B:67:0x01a3, B:69:0x01ad, B:81:0x022a, B:82:0x022f), top: B:107:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x024d  */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.util.Date, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r2v37 */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String id;
        EventDispatcher eventDispatcher2;
        AuthEnvironment authEnvironment;
        String str;
        String str2;
        AuthEnvironment authEnvironment2;
        DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1 deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1;
        EventDispatcher eventDispatcher3;
        String str3;
        String str4;
        final String str5;
        String str6;
        DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1 deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$12;
        DeviceMetadata.Metadata metadata;
        String secretHash;
        BinaryOperator cognitoIdentityProviderClient;
        String str7;
        AuthEnvironment authEnvironment3;
        EventDispatcher eventDispatcher4;
        String deviceKey;
        String deviceSecret;
        ?? r2;
        boolean z;
        EventDispatcher eventDispatcher5;
        AuthEnvironment authEnvironment4;
        Map<String, String> mapCopydefault;
        StateMachineEvent deviceSRPSignInEvent;
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
        String str8 = "";
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objOLrzqt);
            Intrinsics.copydefault(environment, "");
            id = getId();
            AuthEnvironment authEnvironment5 = (AuthEnvironment) environment;
            authEnvironment5.getLogger().verbose(id + " Starting execution");
            String username = this.$event$inlined.getUsername();
            try {
                anonymousClass1.L$0 = this;
                eventDispatcher2 = eventDispatcher;
                try {
                    anonymousClass1.L$1 = eventDispatcher2;
                    anonymousClass1.L$2 = id;
                    anonymousClass1.L$3 = authEnvironment5;
                    anonymousClass1.L$4 = username;
                    anonymousClass1.label = 1;
                    Object userContextData = authEnvironment5.getUserContextData(username, anonymousClass1);
                    if (userContextData == objCopydefault) {
                        return objCopydefault;
                    }
                    str2 = id;
                    authEnvironment2 = authEnvironment5;
                    str = username;
                    objOLrzqt = userContextData;
                    deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1 = this;
                } catch (Exception e) {
                    e = e;
                    authEnvironment = authEnvironment5;
                    str = username;
                    authEnvironment2 = authEnvironment;
                    eventDispatcher3 = eventDispatcher2;
                    String str9 = str;
                    str3 = id;
                    str4 = str9;
                }
            } catch (Exception e2) {
                e = e2;
                eventDispatcher2 = eventDispatcher;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        metadata = (DeviceMetadata.Metadata) anonymousClass1.L$5;
                        String str10 = (String) anonymousClass1.L$4;
                        authEnvironment3 = (AuthEnvironment) anonymousClass1.L$3;
                        str7 = (String) anonymousClass1.L$2;
                        eventDispatcher4 = (EventDispatcher) anonymousClass1.L$1;
                        deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$12 = (DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1) anonymousClass1.L$0;
                        try {
                            C56391yDq.AEQbTJ(objOLrzqt);
                            mapCopydefault = ((RecoverableSecurityException) objOLrzqt).copydefault();
                        } catch (Exception e3) {
                            e = e3;
                            str4 = str10;
                            str3 = str7;
                            eventDispatcher3 = eventDispatcher4;
                            authEnvironment2 = authEnvironment3;
                            if (e instanceof NotAuthorizedException) {
                            }
                        }
                        if (mapCopydefault != null) {
                            throw new ServiceException("Challenge params are empty.", "Sorry, we don't have a suggested fix for this error yet.", null, 4, null);
                        }
                        if (metadata != null) {
                            mapCopydefault = C56424yEw.KWHzl(C56424yEw.KWHzl((Map) mapCopydefault, C56390yDp.OLrzqt("DEVICE_KEY", metadata.getDeviceKey())), C56390yDp.OLrzqt("DEVICE_GROUP_KEY", metadata.getDeviceGroupKey()));
                        }
                        deviceSRPSignInEvent = new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier(mapCopydefault, deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$12.$event$inlined.getMetadata()), null, 2, null);
                        authEnvironment3.getLogger().verbose(str7 + " Sending event " + deviceSRPSignInEvent.getType());
                        eventDispatcher4.send(deviceSRPSignInEvent);
                        return Unit.INSTANCE;
                    }
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    e = (Exception) anonymousClass1.L$3;
                    authEnvironment4 = (AuthEnvironment) anonymousClass1.L$2;
                    str3 = (String) anonymousClass1.L$1;
                    eventDispatcher5 = (EventDispatcher) anonymousClass1.L$0;
                    C56391yDq.AEQbTJ(objOLrzqt);
                    z = false;
                    eventDispatcher4 = eventDispatcher5;
                    authEnvironment3 = authEnvironment4;
                    str7 = str3;
                    r2 = z;
                    DeviceSRPSignInEvent deviceSRPSignInEvent2 = new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.ThrowAuthError(e), r2, 2, r2);
                    authEnvironment3.getLogger().verbose(str7 + " Sending event " + deviceSRPSignInEvent2.getType());
                    eventDispatcher4.send(deviceSRPSignInEvent2);
                    SignInEvent signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment3.getLogger().verbose(str7 + " Sending event " + deviceSRPSignInEvent2.getType());
                    eventDispatcher4.send(signInEvent);
                    deviceSRPSignInEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    authEnvironment3.getLogger().verbose(str7 + " Sending event " + deviceSRPSignInEvent.getType());
                    eventDispatcher4.send(deviceSRPSignInEvent);
                    return Unit.INSTANCE;
                }
                String str11 = (String) anonymousClass1.L$5;
                str = (String) anonymousClass1.L$4;
                authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
                String str12 = (String) anonymousClass1.L$2;
                eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
                DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1 deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$13 = (DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1) anonymousClass1.L$0;
                try {
                    C56391yDq.AEQbTJ(objOLrzqt);
                    str5 = str11;
                    deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$12 = deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$13;
                    str6 = str12;
                } catch (Exception e4) {
                    e = e4;
                    str4 = str;
                    str3 = str12;
                }
                try {
                    metadata = (DeviceMetadata.Metadata) objOLrzqt;
                    final String pinpointEndpointId = authEnvironment2.getPinpointEndpointId();
                    authEnvironment2.setSrpHelper$aws_auth_cognito_release(new SRPHelper((metadata != null || (deviceSecret = metadata.getDeviceSecret()) == null) ? "" : deviceSecret));
                    Pair[] pairArr = new Pair[3];
                    pairArr[0] = C56390yDp.OLrzqt("USERNAME", str);
                    if (metadata != null && (deviceKey = metadata.getDeviceKey()) != null) {
                        str8 = deviceKey;
                    }
                    pairArr[1] = C56390yDp.OLrzqt("DEVICE_KEY", str8);
                    pairArr[2] = C56390yDp.OLrzqt("SRP_A", authEnvironment2.getSrpHelper$aws_auth_cognito_release().getPublicA());
                    final Map mapDjBIcL = C56424yEw.djBIcL(pairArr);
                    AuthHelper.Companion companion = AuthHelper.Companion;
                    UserPoolConfiguration userPool = authEnvironment2.getConfiguration().getUserPool();
                    String appClient = userPool == null ? userPool.getAppClient() : null;
                    UserPoolConfiguration userPool2 = authEnvironment2.getConfiguration().getUserPool();
                    secretHash = companion.getSecretHash(str, appClient, userPool2 == null ? userPool2.getAppClientSecret() : null);
                    if (secretHash != null) {
                        mapDjBIcL.put("SECRET_HASH", secretHash);
                    }
                    cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient != null) {
                        throw new InvalidUserPoolConfigurationException();
                    }
                    RemoteAction.StateListAnimator stateListAnimator = RemoteAction.KWHzl;
                    final DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge respondDeviceSRPChallenge = deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$12.$event$inlined;
                    final AuthEnvironment authEnvironment6 = authEnvironment2;
                    RemoteAction remoteActionEZpvd = stateListAnimator.EZpvd(new Function1<RemoteAction.ActionBar, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDeviceSRP$1$evt$2$respondToAuthChallenge$1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(RemoteAction.ActionBar actionBar) {
                            invoke2(actionBar);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull RemoteAction.ActionBar actionBar) {
                            Intrinsics.checkNotNullParameter(actionBar, "");
                            actionBar.KWHzl(GrantCredentialsPermissionActivity.Activity.EZpvd);
                            UserPoolConfiguration userPool3 = authEnvironment6.getConfiguration().getUserPool();
                            actionBar.EZpvd(userPool3 != null ? userPool3.getAppClient() : null);
                            actionBar.copydefault(mapDjBIcL);
                            actionBar.OLrzqt(respondDeviceSRPChallenge.getMetadata());
                            final String str13 = pinpointEndpointId;
                            if (str13 != null) {
                                actionBar.KWHzl(new Function1<AccountManagerResponse.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDeviceSRP$1$evt$2$respondToAuthChallenge$1$1$1
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
                                        application.OLrzqt(str13);
                                    }
                                });
                            }
                            final String str14 = str5;
                            if (str14 != null) {
                                actionBar.EZpvd(new Function1<RestoreDescription.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDeviceSRP$1$evt$2$respondToAuthChallenge$1$2$1
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
                                        application.copydefault(str14);
                                    }
                                });
                            }
                        }
                    });
                    anonymousClass1.L$0 = deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$12;
                    anonymousClass1.L$1 = eventDispatcher3;
                    anonymousClass1.L$2 = str6;
                    anonymousClass1.L$3 = authEnvironment2;
                    anonymousClass1.L$4 = str;
                    anonymousClass1.L$5 = metadata;
                    anonymousClass1.label = 3;
                    objOLrzqt = cognitoIdentityProviderClient.OLrzqt(remoteActionEZpvd, anonymousClass1);
                    if (objOLrzqt == objCopydefault) {
                        return objCopydefault;
                    }
                    str7 = str6;
                    authEnvironment3 = authEnvironment2;
                    eventDispatcher4 = eventDispatcher3;
                    mapCopydefault = ((RecoverableSecurityException) objOLrzqt).copydefault();
                    if (mapCopydefault != null) {
                    }
                } catch (Exception e5) {
                    e = e5;
                    str4 = str;
                    str3 = str6;
                    if (e instanceof NotAuthorizedException) {
                    }
                }
                if (e instanceof NotAuthorizedException) {
                    r2 = 0;
                    str7 = str3;
                    authEnvironment3 = authEnvironment2;
                    eventDispatcher4 = eventDispatcher3;
                    DeviceSRPSignInEvent deviceSRPSignInEvent22 = new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.ThrowAuthError(e), r2, 2, r2);
                    authEnvironment3.getLogger().verbose(str7 + " Sending event " + deviceSRPSignInEvent22.getType());
                    eventDispatcher4.send(deviceSRPSignInEvent22);
                    SignInEvent signInEvent2 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment3.getLogger().verbose(str7 + " Sending event " + deviceSRPSignInEvent22.getType());
                    eventDispatcher4.send(signInEvent2);
                    deviceSRPSignInEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    authEnvironment3.getLogger().verbose(str7 + " Sending event " + deviceSRPSignInEvent.getType());
                    eventDispatcher4.send(deviceSRPSignInEvent);
                    return Unit.INSTANCE;
                }
                StoreClientBehavior credentialStoreClient = authEnvironment2.getCredentialStoreClient();
                CredentialType.Device device = new CredentialType.Device(str4);
                anonymousClass1.L$0 = eventDispatcher3;
                anonymousClass1.L$1 = str3;
                anonymousClass1.L$2 = authEnvironment2;
                anonymousClass1.L$3 = e;
                z = false;
                anonymousClass1.L$4 = null;
                anonymousClass1.L$5 = null;
                anonymousClass1.label = 4;
                if (credentialStoreClient.clearCredentials(device, anonymousClass1) == objCopydefault) {
                    return objCopydefault;
                }
                eventDispatcher5 = eventDispatcher3;
                authEnvironment4 = authEnvironment2;
                eventDispatcher4 = eventDispatcher5;
                authEnvironment3 = authEnvironment4;
                str7 = str3;
                r2 = z;
                DeviceSRPSignInEvent deviceSRPSignInEvent222 = new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.ThrowAuthError(e), r2, 2, r2);
                authEnvironment3.getLogger().verbose(str7 + " Sending event " + deviceSRPSignInEvent222.getType());
                eventDispatcher4.send(deviceSRPSignInEvent222);
                SignInEvent signInEvent22 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment3.getLogger().verbose(str7 + " Sending event " + deviceSRPSignInEvent222.getType());
                eventDispatcher4.send(signInEvent22);
                deviceSRPSignInEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                authEnvironment3.getLogger().verbose(str7 + " Sending event " + deviceSRPSignInEvent.getType());
                eventDispatcher4.send(deviceSRPSignInEvent);
                return Unit.INSTANCE;
            }
            str = (String) anonymousClass1.L$4;
            authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
            String str13 = (String) anonymousClass1.L$2;
            EventDispatcher eventDispatcher6 = (EventDispatcher) anonymousClass1.L$1;
            deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1 = (DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(objOLrzqt);
                str2 = str13;
                eventDispatcher2 = eventDispatcher6;
                authEnvironment2 = authEnvironment;
            } catch (Exception e6) {
                e = e6;
                str2 = str13;
                eventDispatcher2 = eventDispatcher6;
                id = str2;
                authEnvironment2 = authEnvironment;
                eventDispatcher3 = eventDispatcher2;
                String str92 = str;
                str3 = id;
                str4 = str92;
                if (e instanceof NotAuthorizedException) {
                }
            }
        }
        String str14 = (String) objOLrzqt;
        anonymousClass1.L$0 = deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1;
        anonymousClass1.L$1 = eventDispatcher2;
        anonymousClass1.L$2 = str2;
        anonymousClass1.L$3 = authEnvironment2;
        anonymousClass1.L$4 = str;
        anonymousClass1.L$5 = str14;
        anonymousClass1.label = 2;
        Object deviceMetadata = authEnvironment2.getDeviceMetadata(str, anonymousClass1);
        if (deviceMetadata == objCopydefault) {
            return objCopydefault;
        }
        str5 = str14;
        objOLrzqt = deviceMetadata;
        eventDispatcher3 = eventDispatcher2;
        str6 = str2;
        deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$12 = deviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1;
        metadata = (DeviceMetadata.Metadata) objOLrzqt;
        final String pinpointEndpointId2 = authEnvironment2.getPinpointEndpointId();
        if (metadata != null) {
            authEnvironment2.setSrpHelper$aws_auth_cognito_release(new SRPHelper((metadata != null || (deviceSecret = metadata.getDeviceSecret()) == null) ? "" : deviceSecret));
            Pair[] pairArr2 = new Pair[3];
            pairArr2[0] = C56390yDp.OLrzqt("USERNAME", str);
            if (metadata != null) {
                str8 = deviceKey;
            }
            pairArr2[1] = C56390yDp.OLrzqt("DEVICE_KEY", str8);
            pairArr2[2] = C56390yDp.OLrzqt("SRP_A", authEnvironment2.getSrpHelper$aws_auth_cognito_release().getPublicA());
            final Map<String, String> mapDjBIcL2 = C56424yEw.djBIcL(pairArr2);
            AuthHelper.Companion companion2 = AuthHelper.Companion;
            UserPoolConfiguration userPool3 = authEnvironment2.getConfiguration().getUserPool();
            if (userPool3 == null) {
            }
            UserPoolConfiguration userPool22 = authEnvironment2.getConfiguration().getUserPool();
            secretHash = companion2.getSecretHash(str, appClient, userPool22 == null ? userPool22.getAppClientSecret() : null);
            if (secretHash != null) {
            }
            cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
            if (cognitoIdentityProviderClient != null) {
            }
        }
        authEnvironment3.getLogger().verbose(str7 + " Sending event " + deviceSRPSignInEvent.getType());
        eventDispatcher4.send(deviceSRPSignInEvent);
        return Unit.INSTANCE;
    }

    public DeviceSRPCognitoSignInActions$respondDeviceSRP$$inlined$invoke$1(String str, DeviceSRPSignInEvent.EventType.RespondDeviceSRPChallenge respondDeviceSRPChallenge) {
        this.$event$inlined = respondDeviceSRPChallenge;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
