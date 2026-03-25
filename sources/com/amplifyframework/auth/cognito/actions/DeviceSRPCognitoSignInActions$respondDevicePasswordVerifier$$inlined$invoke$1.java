package com.amplifyframework.auth.cognito.actions;

import aws.sdk.kotlin.services.cognitoidentityprovider.model.NotAuthorizedException;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.StoreClientBehavior;
import com.amplifyframework.auth.cognito.exceptions.configuration.InvalidUserPoolConfigurationException;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SignInChallengeHelper;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.DeviceSRPSignInEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import java.util.Map;
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
public final class DeviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$1 implements Action {
    final /* synthetic */ DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier $event$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
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
            return DeviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0198 A[Catch: Exception -> 0x0245, TryCatch #5 {Exception -> 0x0245, blocks: (B:33:0x013d, B:35:0x0198, B:37:0x019e, B:39:0x01a8, B:41:0x01ae, B:43:0x01b4, B:44:0x01b9, B:46:0x01c3), top: B:90:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01a8 A[Catch: Exception -> 0x0245, TryCatch #5 {Exception -> 0x0245, blocks: (B:33:0x013d, B:35:0x0198, B:37:0x019e, B:39:0x01a8, B:41:0x01ae, B:43:0x01b4, B:44:0x01b9, B:46:0x01c3), top: B:90:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b4 A[Catch: Exception -> 0x0245, TryCatch #5 {Exception -> 0x0245, blocks: (B:33:0x013d, B:35:0x0198, B:37:0x019e, B:39:0x01a8, B:41:0x01ae, B:43:0x01b4, B:44:0x01b9, B:46:0x01c3), top: B:90:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01c3 A[Catch: Exception -> 0x0245, TRY_LEAVE, TryCatch #5 {Exception -> 0x0245, blocks: (B:33:0x013d, B:35:0x0198, B:37:0x019e, B:39:0x01a8, B:41:0x01ae, B:43:0x01b4, B:44:0x01b9, B:46:0x01c3), top: B:90:0x013d }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.util.Date, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r7v30 */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String id;
        AuthEnvironment authEnvironment;
        String str;
        EventDispatcher eventDispatcher2;
        String str2;
        Object userContextData;
        DeviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$1 deviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$1;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        AuthEnvironment authEnvironment2;
        String str8;
        String str9;
        String secretHash;
        BinaryOperator cognitoIdentityProviderClient;
        EventDispatcher eventDispatcher3;
        AuthEnvironment authEnvironment3;
        String str10;
        String str11;
        ?? r7;
        boolean z;
        EventDispatcher eventDispatcher4;
        AuthEnvironment authEnvironment4;
        StateMachineEvent stateMachineEventEvaluateNextStep;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object obj = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(obj);
            Intrinsics.copydefault(environment, "");
            id = getId();
            authEnvironment = (AuthEnvironment) environment;
            authEnvironment.getLogger().verbose(id + " Starting execution");
            Map<String, String> challengeParameters = this.$event$inlined.getChallengeParameters();
            str = (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) challengeParameters), "USERNAME");
            try {
                String str12 = (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) challengeParameters), "SALT");
                String str13 = (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) challengeParameters), "SECRET_BLOCK");
                String str14 = (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) challengeParameters), "SRP_B");
                String str15 = (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) challengeParameters), "DEVICE_KEY");
                str2 = (String) C56424yEw.EZpvd((Map<String, ? extends V>) ((Map<Object, ? extends V>) challengeParameters), "DEVICE_GROUP_KEY");
                anonymousClass1.L$0 = this;
                eventDispatcher2 = eventDispatcher;
                try {
                    anonymousClass1.L$1 = eventDispatcher2;
                    anonymousClass1.L$2 = id;
                    anonymousClass1.L$3 = authEnvironment;
                    anonymousClass1.L$4 = str;
                    anonymousClass1.L$5 = str12;
                    anonymousClass1.L$6 = str13;
                    anonymousClass1.L$7 = str14;
                    anonymousClass1.L$8 = str15;
                    anonymousClass1.L$9 = str2;
                    anonymousClass1.label = 1;
                    userContextData = authEnvironment.getUserContextData(str, anonymousClass1);
                    if (userContextData == objCopydefault) {
                        return objCopydefault;
                    }
                    deviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$1 = this;
                    str3 = str12;
                    str4 = str13;
                    str5 = str14;
                    str6 = str;
                    str7 = id;
                    authEnvironment2 = authEnvironment;
                    str8 = str15;
                    final String str16 = (String) userContextData;
                    final String pinpointEndpointId = authEnvironment2.getPinpointEndpointId();
                    authEnvironment2.getSrpHelper$aws_auth_cognito_release().setUserPoolParams(str8, str2);
                    final Map mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("USERNAME", str6), C56390yDp.OLrzqt("PASSWORD_CLAIM_SECRET_BLOCK", str4), C56390yDp.OLrzqt("TIMESTAMP", authEnvironment2.getSrpHelper$aws_auth_cognito_release().getDateString()), C56390yDp.OLrzqt("PASSWORD_CLAIM_SIGNATURE", authEnvironment2.getSrpHelper$aws_auth_cognito_release().getSignature(str3, str5, str4)), C56390yDp.OLrzqt("DEVICE_KEY", str8));
                    AuthHelper.Companion companion = AuthHelper.Companion;
                    UserPoolConfiguration userPool = authEnvironment2.getConfiguration().getUserPool();
                    if (userPool == null) {
                    }
                    UserPoolConfiguration userPool2 = authEnvironment2.getConfiguration().getUserPool();
                    secretHash = companion.getSecretHash(str6, appClient, userPool2 == null ? userPool2.getAppClientSecret() : null);
                    if (secretHash != null) {
                    }
                    cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient != null) {
                    }
                    throw new InvalidUserPoolConfigurationException();
                } catch (Exception e) {
                    e = e;
                    str9 = id;
                    if (!(e instanceof NotAuthorizedException)) {
                    }
                }
            } catch (Exception e2) {
                e = e2;
                eventDispatcher2 = eventDispatcher;
            }
        } else if (i2 == 1) {
            String str17 = (String) anonymousClass1.L$9;
            String str18 = (String) anonymousClass1.L$8;
            String str19 = (String) anonymousClass1.L$7;
            String str20 = (String) anonymousClass1.L$6;
            String str21 = (String) anonymousClass1.L$5;
            str = (String) anonymousClass1.L$4;
            authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
            id = (String) anonymousClass1.L$2;
            EventDispatcher eventDispatcher5 = (EventDispatcher) anonymousClass1.L$1;
            DeviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$1 deviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$12 = (DeviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$1) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                str3 = str21;
                str4 = str20;
                str5 = str19;
                str6 = str;
                str7 = id;
                authEnvironment2 = authEnvironment;
                str8 = str18;
                deviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$1 = deviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$12;
                str2 = str17;
                userContextData = obj;
                eventDispatcher2 = eventDispatcher5;
                try {
                    final String str162 = (String) userContextData;
                    final String pinpointEndpointId2 = authEnvironment2.getPinpointEndpointId();
                    authEnvironment2.getSrpHelper$aws_auth_cognito_release().setUserPoolParams(str8, str2);
                    final Map mapDjBIcL2 = C56424yEw.djBIcL(C56390yDp.OLrzqt("USERNAME", str6), C56390yDp.OLrzqt("PASSWORD_CLAIM_SECRET_BLOCK", str4), C56390yDp.OLrzqt("TIMESTAMP", authEnvironment2.getSrpHelper$aws_auth_cognito_release().getDateString()), C56390yDp.OLrzqt("PASSWORD_CLAIM_SIGNATURE", authEnvironment2.getSrpHelper$aws_auth_cognito_release().getSignature(str3, str5, str4)), C56390yDp.OLrzqt("DEVICE_KEY", str8));
                    AuthHelper.Companion companion2 = AuthHelper.Companion;
                    UserPoolConfiguration userPool3 = authEnvironment2.getConfiguration().getUserPool();
                    String appClient = userPool3 == null ? userPool3.getAppClient() : null;
                    UserPoolConfiguration userPool22 = authEnvironment2.getConfiguration().getUserPool();
                    secretHash = companion2.getSecretHash(str6, appClient, userPool22 == null ? userPool22.getAppClientSecret() : null);
                    if (secretHash != null) {
                        mapDjBIcL2.put("SECRET_HASH", secretHash);
                    }
                    cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient != null) {
                        RemoteAction.StateListAnimator stateListAnimator = RemoteAction.KWHzl;
                        final DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier respondDevicePasswordVerifier = deviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$1.$event$inlined;
                        final AuthEnvironment authEnvironment5 = authEnvironment2;
                        RemoteAction remoteActionEZpvd = stateListAnimator.EZpvd(new Function1<RemoteAction.ActionBar, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDevicePasswordVerifier$1$evt$2$respondToAuthChallenge$1
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
                                actionBar.KWHzl(GrantCredentialsPermissionActivity.StateListAnimator.AEQbTJ);
                                UserPoolConfiguration userPool4 = authEnvironment5.getConfiguration().getUserPool();
                                actionBar.EZpvd(userPool4 != null ? userPool4.getAppClient() : null);
                                actionBar.copydefault(mapDjBIcL2);
                                actionBar.OLrzqt(respondDevicePasswordVerifier.getMetadata());
                                final String str22 = pinpointEndpointId2;
                                if (str22 != null) {
                                    actionBar.KWHzl(new Function1<AccountManagerResponse.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDevicePasswordVerifier$1$evt$2$respondToAuthChallenge$1$1$1
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
                                            application.OLrzqt(str22);
                                        }
                                    });
                                }
                                final String str23 = str162;
                                if (str23 != null) {
                                    actionBar.EZpvd(new Function1<RestoreDescription.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.DeviceSRPCognitoSignInActions$respondDevicePasswordVerifier$1$evt$2$respondToAuthChallenge$1$2$1
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
                                            application.copydefault(str23);
                                        }
                                    });
                                }
                            }
                        });
                        anonymousClass1.L$0 = eventDispatcher2;
                        anonymousClass1.L$1 = str7;
                        anonymousClass1.L$2 = authEnvironment2;
                        anonymousClass1.L$3 = str6;
                        anonymousClass1.L$4 = null;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.L$6 = null;
                        anonymousClass1.L$7 = null;
                        anonymousClass1.L$8 = null;
                        anonymousClass1.L$9 = null;
                        anonymousClass1.label = 2;
                        Object objOLrzqt = cognitoIdentityProviderClient.OLrzqt(remoteActionEZpvd, anonymousClass1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        eventDispatcher3 = eventDispatcher2;
                        authEnvironment3 = authEnvironment2;
                        str10 = str7;
                        str11 = str6;
                        obj = objOLrzqt;
                        RecoverableSecurityException recoverableSecurityException = (RecoverableSecurityException) obj;
                        new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.FinalizeSignIn(null, 1, null), null, 2, null);
                        stateMachineEventEvaluateNextStep = SignInChallengeHelper.INSTANCE.evaluateNextStep(str11, recoverableSecurityException.AEQbTJ(), recoverableSecurityException.KWHzl(), recoverableSecurityException.copydefault(), recoverableSecurityException.EZpvd(), new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_SRP_AUTH));
                        if (stateMachineEventEvaluateNextStep == null) {
                        }
                    }
                    throw new InvalidUserPoolConfigurationException();
                } catch (Exception e3) {
                    e = e3;
                    authEnvironment = authEnvironment2;
                    str9 = str7;
                    str = str6;
                    if (!(e instanceof NotAuthorizedException)) {
                    }
                }
            } catch (Exception e4) {
                e = e4;
                eventDispatcher2 = eventDispatcher5;
                str9 = id;
                if (!(e instanceof NotAuthorizedException)) {
                    StoreClientBehavior credentialStoreClient = authEnvironment.getCredentialStoreClient();
                    CredentialType.Device device = new CredentialType.Device(str);
                    anonymousClass1.L$0 = eventDispatcher2;
                    anonymousClass1.L$1 = str9;
                    anonymousClass1.L$2 = authEnvironment;
                    anonymousClass1.L$3 = e;
                    z = false;
                    anonymousClass1.L$4 = null;
                    anonymousClass1.L$5 = null;
                    anonymousClass1.L$6 = null;
                    anonymousClass1.L$7 = null;
                    anonymousClass1.L$8 = null;
                    anonymousClass1.L$9 = null;
                    anonymousClass1.label = 3;
                    if (credentialStoreClient.clearCredentials(device, anonymousClass1) == objCopydefault) {
                        return objCopydefault;
                    }
                    eventDispatcher4 = eventDispatcher2;
                    authEnvironment4 = authEnvironment;
                    eventDispatcher3 = eventDispatcher4;
                    authEnvironment3 = authEnvironment4;
                    r7 = z;
                    DeviceSRPSignInEvent deviceSRPSignInEvent = new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.ThrowPasswordVerifiedError(e), r7, 2, r7);
                    authEnvironment3.getLogger().verbose(str9 + " Sending event " + deviceSRPSignInEvent.getType());
                    eventDispatcher3.send(deviceSRPSignInEvent);
                    SignInEvent signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment3.getLogger().verbose(str9 + " Sending event " + deviceSRPSignInEvent.getType());
                    eventDispatcher3.send(signInEvent);
                    stateMachineEventEvaluateNextStep = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    str10 = str9;
                    authEnvironment3.getLogger().verbose(str10 + " Sending event " + stateMachineEventEvaluateNextStep.getType());
                    eventDispatcher3.send(stateMachineEventEvaluateNextStep);
                    return Unit.INSTANCE;
                }
                r7 = 0;
                eventDispatcher3 = eventDispatcher2;
                authEnvironment3 = authEnvironment;
                DeviceSRPSignInEvent deviceSRPSignInEvent2 = new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.ThrowPasswordVerifiedError(e), r7, 2, r7);
                authEnvironment3.getLogger().verbose(str9 + " Sending event " + deviceSRPSignInEvent2.getType());
                eventDispatcher3.send(deviceSRPSignInEvent2);
                SignInEvent signInEvent2 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment3.getLogger().verbose(str9 + " Sending event " + deviceSRPSignInEvent2.getType());
                eventDispatcher3.send(signInEvent2);
                stateMachineEventEvaluateNextStep = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                str10 = str9;
                authEnvironment3.getLogger().verbose(str10 + " Sending event " + stateMachineEventEvaluateNextStep.getType());
                eventDispatcher3.send(stateMachineEventEvaluateNextStep);
                return Unit.INSTANCE;
            }
        } else if (i2 == 2) {
            str11 = (String) anonymousClass1.L$3;
            authEnvironment3 = (AuthEnvironment) anonymousClass1.L$2;
            str10 = (String) anonymousClass1.L$1;
            EventDispatcher eventDispatcher6 = (EventDispatcher) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                eventDispatcher3 = eventDispatcher6;
                try {
                    RecoverableSecurityException recoverableSecurityException2 = (RecoverableSecurityException) obj;
                    new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.FinalizeSignIn(null, 1, null), null, 2, null);
                    stateMachineEventEvaluateNextStep = SignInChallengeHelper.INSTANCE.evaluateNextStep(str11, recoverableSecurityException2.AEQbTJ(), recoverableSecurityException2.KWHzl(), recoverableSecurityException2.copydefault(), recoverableSecurityException2.EZpvd(), new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_SRP_AUTH));
                    if (stateMachineEventEvaluateNextStep == null) {
                        eventDispatcher2 = eventDispatcher3;
                        str6 = str11;
                        authEnvironment2 = authEnvironment3;
                        str7 = str10;
                        try {
                            throw new InvalidUserPoolConfigurationException();
                        } catch (Exception e5) {
                            e = e5;
                            authEnvironment3 = authEnvironment2;
                            str10 = str7;
                            str = str6;
                            eventDispatcher6 = eventDispatcher2;
                            authEnvironment = authEnvironment3;
                            str9 = str10;
                            eventDispatcher2 = eventDispatcher6;
                            if (!(e instanceof NotAuthorizedException)) {
                            }
                        }
                    }
                } catch (Exception e6) {
                    e = e6;
                    eventDispatcher6 = eventDispatcher3;
                    str = str11;
                    authEnvironment = authEnvironment3;
                    str9 = str10;
                    eventDispatcher2 = eventDispatcher6;
                    if (!(e instanceof NotAuthorizedException)) {
                    }
                }
            } catch (Exception e7) {
                e = e7;
                str = str11;
                authEnvironment = authEnvironment3;
                str9 = str10;
                eventDispatcher2 = eventDispatcher6;
                if (!(e instanceof NotAuthorizedException)) {
                }
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e = (Exception) anonymousClass1.L$3;
            authEnvironment4 = (AuthEnvironment) anonymousClass1.L$2;
            str9 = (String) anonymousClass1.L$1;
            eventDispatcher4 = (EventDispatcher) anonymousClass1.L$0;
            C56391yDq.AEQbTJ(obj);
            z = false;
            eventDispatcher3 = eventDispatcher4;
            authEnvironment3 = authEnvironment4;
            r7 = z;
            DeviceSRPSignInEvent deviceSRPSignInEvent22 = new DeviceSRPSignInEvent(new DeviceSRPSignInEvent.EventType.ThrowPasswordVerifiedError(e), r7, 2, r7);
            authEnvironment3.getLogger().verbose(str9 + " Sending event " + deviceSRPSignInEvent22.getType());
            eventDispatcher3.send(deviceSRPSignInEvent22);
            SignInEvent signInEvent22 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
            authEnvironment3.getLogger().verbose(str9 + " Sending event " + deviceSRPSignInEvent22.getType());
            eventDispatcher3.send(signInEvent22);
            stateMachineEventEvaluateNextStep = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
            str10 = str9;
        }
        authEnvironment3.getLogger().verbose(str10 + " Sending event " + stateMachineEventEvaluateNextStep.getType());
        eventDispatcher3.send(stateMachineEventEvaluateNextStep);
        return Unit.INSTANCE;
    }

    public DeviceSRPCognitoSignInActions$respondDevicePasswordVerifier$$inlined$invoke$1(String str, DeviceSRPSignInEvent.EventType.RespondDevicePasswordVerifier respondDevicePasswordVerifier) {
        this.$event$inlined = respondDevicePasswordVerifier;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
