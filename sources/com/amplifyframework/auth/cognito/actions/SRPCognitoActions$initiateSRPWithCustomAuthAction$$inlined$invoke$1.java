package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SRPHelper;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
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
public final class SRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ SRPEvent.EventType.InitiateSRPWithCustom $event$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1$1, reason: invalid class name */
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
            return SRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x0173 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0180 A[Catch: Exception -> 0x020d, TryCatch #2 {Exception -> 0x020d, blocks: (B:75:0x0208, B:79:0x0210, B:81:0x0218, B:84:0x0220, B:86:0x0226, B:90:0x0232, B:91:0x024a, B:92:0x025b, B:93:0x025c, B:94:0x0263, B:51:0x017c, B:53:0x0180, B:54:0x0187, B:56:0x0195, B:58:0x01a9, B:60:0x01af, B:62:0x01c0, B:64:0x01ca, B:65:0x01d2), top: B:108:0x017c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0195 A[Catch: Exception -> 0x020d, TryCatch #2 {Exception -> 0x020d, blocks: (B:75:0x0208, B:79:0x0210, B:81:0x0218, B:84:0x0220, B:86:0x0226, B:90:0x0232, B:91:0x024a, B:92:0x025b, B:93:0x025c, B:94:0x0263, B:51:0x017c, B:53:0x0180, B:54:0x0187, B:56:0x0195, B:58:0x01a9, B:60:0x01af, B:62:0x01c0, B:64:0x01ca, B:65:0x01d2), top: B:108:0x017c }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0208 A[Catch: Exception -> 0x020d, TRY_ENTER, TryCatch #2 {Exception -> 0x020d, blocks: (B:75:0x0208, B:79:0x0210, B:81:0x0218, B:84:0x0220, B:86:0x0226, B:90:0x0232, B:91:0x024a, B:92:0x025b, B:93:0x025c, B:94:0x0263, B:51:0x017c, B:53:0x0180, B:54:0x0187, B:56:0x0195, B:58:0x01a9, B:60:0x01af, B:62:0x01c0, B:64:0x01ca, B:65:0x01d2), top: B:108:0x017c }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0218 A[Catch: Exception -> 0x020d, TryCatch #2 {Exception -> 0x020d, blocks: (B:75:0x0208, B:79:0x0210, B:81:0x0218, B:84:0x0220, B:86:0x0226, B:90:0x0232, B:91:0x024a, B:92:0x025b, B:93:0x025c, B:94:0x0263, B:51:0x017c, B:53:0x0180, B:54:0x0187, B:56:0x0195, B:58:0x01a9, B:60:0x01af, B:62:0x01c0, B:64:0x01ca, B:65:0x01d2), top: B:108:0x017c }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x025c A[Catch: Exception -> 0x020d, TryCatch #2 {Exception -> 0x020d, blocks: (B:75:0x0208, B:79:0x0210, B:81:0x0218, B:84:0x0220, B:86:0x0226, B:90:0x0232, B:91:0x024a, B:92:0x025b, B:93:0x025c, B:94:0x0263, B:51:0x017c, B:53:0x0180, B:54:0x0187, B:56:0x0195, B:58:0x01a9, B:60:0x01af, B:62:0x01c0, B:64:0x01ca, B:65:0x01d2), top: B:108:0x017c }] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        EventDispatcher eventDispatcher2;
        String str;
        AuthEnvironment authEnvironment;
        SRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1 sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1;
        Map<String, String> map;
        String str2;
        Object deviceMetadata;
        Map<String, String> map2;
        final String str3;
        String str4;
        AuthEnvironment authEnvironment2;
        DeviceMetadata.Metadata metadata;
        BinaryOperator cognitoIdentityProviderClient;
        DialogFragment dialogFragment;
        EventDispatcher eventDispatcher3;
        SRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1 sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$12;
        DeviceMetadata.Metadata metadata2;
        StateMachineEvent authenticationEvent;
        String deviceKey;
        Map<String, String> mapKWHzl;
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
            String id = getId();
            AuthEnvironment authEnvironment3 = (AuthEnvironment) environment;
            authEnvironment3.getLogger().verbose(id + " Starting execution");
            try {
                authEnvironment3.setSrpHelper$aws_auth_cognito_release(new SRPHelper(this.$event$inlined.getPassword()));
                AuthHelper.Companion companion = AuthHelper.Companion;
                String username = this.$event$inlined.getUsername();
                UserPoolConfiguration userPool = authEnvironment3.getConfiguration().getUserPool();
                String appClient = userPool != null ? userPool.getAppClient() : null;
                UserPoolConfiguration userPool2 = authEnvironment3.getConfiguration().getUserPool();
                String secretHash = companion.getSecretHash(username, appClient, userPool2 != null ? userPool2.getAppClientSecret() : null);
                Map<String, String> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("USERNAME", this.$event$inlined.getUsername()), C56390yDp.OLrzqt("SRP_A", authEnvironment3.getSrpHelper$aws_auth_cognito_release().getPublicA()), C56390yDp.OLrzqt("CHALLENGE_NAME", "SRP_A"));
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
                    if (userContextData == objCopydefault) {
                        return objCopydefault;
                    }
                    sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1 = this;
                    obj = userContextData;
                    map = mapDjBIcL;
                    authEnvironment = authEnvironment3;
                    str2 = id;
                    String str5 = (String) obj;
                    String username3 = sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1.$event$inlined.getUsername();
                    anonymousClass1.L$0 = sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1;
                    anonymousClass1.L$1 = eventDispatcher2;
                    anonymousClass1.L$2 = str2;
                    anonymousClass1.L$3 = authEnvironment;
                    anonymousClass1.L$4 = map;
                    anonymousClass1.L$5 = str5;
                    anonymousClass1.label = 2;
                    deviceMetadata = authEnvironment.getDeviceMetadata(username3, anonymousClass1);
                    if (deviceMetadata != objCopydefault) {
                    }
                } catch (Exception e) {
                    e = e;
                    str = id;
                    authEnvironment = authEnvironment3;
                    SRPEvent sRPEvent = new SRPEvent(new SRPEvent.EventType.ThrowAuthError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(str + " Sending event " + sRPEvent.getType());
                    eventDispatcher2.send(sRPEvent);
                    SignInEvent signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(str + " Sending event " + sRPEvent.getType());
                    eventDispatcher2.send(signInEvent);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    authEnvironment2 = authEnvironment;
                    str4 = str;
                    authEnvironment2.getLogger().verbose(str4 + " Sending event " + authenticationEvent.getType());
                    eventDispatcher2.send(authenticationEvent);
                    return Unit.INSTANCE;
                }
            } catch (Exception e2) {
                e = e2;
                eventDispatcher2 = eventDispatcher;
            }
        } else if (i2 == 1) {
            map = (Map) anonymousClass1.L$4;
            authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
            str2 = (String) anonymousClass1.L$2;
            eventDispatcher2 = (EventDispatcher) anonymousClass1.L$1;
            sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1 = (SRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                String str52 = (String) obj;
                String username32 = sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1.$event$inlined.getUsername();
                anonymousClass1.L$0 = sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1;
                anonymousClass1.L$1 = eventDispatcher2;
                anonymousClass1.L$2 = str2;
                anonymousClass1.L$3 = authEnvironment;
                anonymousClass1.L$4 = map;
                anonymousClass1.L$5 = str52;
                anonymousClass1.label = 2;
                deviceMetadata = authEnvironment.getDeviceMetadata(username32, anonymousClass1);
                if (deviceMetadata != objCopydefault) {
                    return objCopydefault;
                }
                AuthEnvironment authEnvironment4 = authEnvironment;
                map2 = map;
                str3 = str52;
                obj = deviceMetadata;
                str4 = str2;
                authEnvironment2 = authEnvironment4;
                metadata = (DeviceMetadata.Metadata) obj;
                if (metadata != null) {
                }
                final String pinpointEndpointId = authEnvironment2.getPinpointEndpointId();
                cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient == null) {
                }
            } catch (Exception e3) {
                e = e3;
                str = str2;
                SRPEvent sRPEvent2 = new SRPEvent(new SRPEvent.EventType.ThrowAuthError(e), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + sRPEvent2.getType());
                eventDispatcher2.send(sRPEvent2);
                SignInEvent signInEvent2 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + sRPEvent2.getType());
                eventDispatcher2.send(signInEvent2);
                authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                authEnvironment2 = authEnvironment;
                str4 = str;
                authEnvironment2.getLogger().verbose(str4 + " Sending event " + authenticationEvent.getType());
                eventDispatcher2.send(authenticationEvent);
                return Unit.INSTANCE;
            }
        } else if (i2 == 2) {
            str3 = (String) anonymousClass1.L$5;
            map2 = (Map) anonymousClass1.L$4;
            authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
            String str6 = (String) anonymousClass1.L$2;
            EventDispatcher eventDispatcher4 = (EventDispatcher) anonymousClass1.L$1;
            SRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1 sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$13 = (SRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                str4 = str6;
                eventDispatcher2 = eventDispatcher4;
                sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1 = sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$13;
                try {
                    metadata = (DeviceMetadata.Metadata) obj;
                    if (metadata != null) {
                        map2.put("DEVICE_KEY", metadata.getDeviceKey());
                    }
                    final String pinpointEndpointId2 = authEnvironment2.getPinpointEndpointId();
                    cognitoIdentityProviderClient = authEnvironment2.getCognitoAuthService().getCognitoIdentityProviderClient();
                    if (cognitoIdentityProviderClient == null) {
                        BroadcastOptions.Activity activity = new BroadcastOptions.Activity();
                        activity.copydefault(NetworkErrorException.Application.AEQbTJ);
                        UserPoolConfiguration userPool3 = authEnvironment2.getConfiguration().getUserPool();
                        activity.AEQbTJ(userPool3 != null ? userPool3.getAppClient() : null);
                        activity.KWHzl(map2);
                        activity.AEQbTJ(sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1.$event$inlined.getMetadata());
                        if (pinpointEndpointId2 != null) {
                            activity.copydefault(new Function1<AccountManagerResponse.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$initiateSRPWithCustomAuthAction$1$evt$initiateAuthResponse$1$1$1
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
                        if (str3 != null) {
                            activity.OLrzqt(new Function1<RestoreDescription.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$initiateSRPWithCustomAuthAction$1$evt$initiateAuthResponse$1$2$1
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
                                    application.copydefault(str3);
                                }
                            });
                        }
                        BroadcastOptions broadcastOptionsEZpvd = activity.EZpvd();
                        anonymousClass1.L$0 = sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1;
                        anonymousClass1.L$1 = eventDispatcher2;
                        anonymousClass1.L$2 = str4;
                        anonymousClass1.L$3 = authEnvironment2;
                        anonymousClass1.L$4 = metadata;
                        anonymousClass1.L$5 = null;
                        anonymousClass1.label = 3;
                        Object objCopydefault2 = cognitoIdentityProviderClient.copydefault(broadcastOptionsEZpvd, anonymousClass1);
                        if (objCopydefault2 == objCopydefault) {
                            return objCopydefault;
                        }
                        authEnvironment = authEnvironment2;
                        eventDispatcher3 = eventDispatcher2;
                        sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$12 = sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1;
                        str = str4;
                        obj = objCopydefault2;
                        metadata2 = metadata;
                        DialogFragment dialogFragment2 = (DialogFragment) obj;
                        sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1 = sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$12;
                        str4 = str;
                        eventDispatcher2 = eventDispatcher3;
                        authEnvironment2 = authEnvironment;
                        metadata = metadata2;
                        dialogFragment = dialogFragment2;
                        if (Intrinsics.EZpvd(dialogFragment != null ? dialogFragment.OLrzqt() : null, GrantCredentialsPermissionActivity.FragmentManager.EZpvd)) {
                        }
                    } else {
                        dialogFragment = null;
                        if (Intrinsics.EZpvd(dialogFragment != null ? dialogFragment.OLrzqt() : null, GrantCredentialsPermissionActivity.FragmentManager.EZpvd)) {
                        }
                    }
                } catch (Exception e4) {
                    e = e4;
                    authEnvironment = authEnvironment2;
                    str = str4;
                    SRPEvent sRPEvent22 = new SRPEvent(new SRPEvent.EventType.ThrowAuthError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(str + " Sending event " + sRPEvent22.getType());
                    eventDispatcher2.send(sRPEvent22);
                    SignInEvent signInEvent22 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(str + " Sending event " + sRPEvent22.getType());
                    eventDispatcher2.send(signInEvent22);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    authEnvironment2 = authEnvironment;
                    str4 = str;
                }
            } catch (Exception e5) {
                e = e5;
                authEnvironment = authEnvironment2;
                str = str6;
                eventDispatcher2 = eventDispatcher4;
                SRPEvent sRPEvent222 = new SRPEvent(new SRPEvent.EventType.ThrowAuthError(e), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + sRPEvent222.getType());
                eventDispatcher2.send(sRPEvent222);
                SignInEvent signInEvent222 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + sRPEvent222.getType());
                eventDispatcher2.send(signInEvent222);
                authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                authEnvironment2 = authEnvironment;
                str4 = str;
                authEnvironment2.getLogger().verbose(str4 + " Sending event " + authenticationEvent.getType());
                eventDispatcher2.send(authenticationEvent);
                return Unit.INSTANCE;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            metadata2 = (DeviceMetadata.Metadata) anonymousClass1.L$4;
            authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
            str = (String) anonymousClass1.L$2;
            eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
            sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$12 = (SRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                DialogFragment dialogFragment22 = (DialogFragment) obj;
                sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1 = sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$12;
                str4 = str;
                eventDispatcher2 = eventDispatcher3;
                authEnvironment2 = authEnvironment;
                metadata = metadata2;
                dialogFragment = dialogFragment22;
                if (Intrinsics.EZpvd(dialogFragment != null ? dialogFragment.OLrzqt() : null, GrantCredentialsPermissionActivity.FragmentManager.EZpvd)) {
                    Map<String, String> mapCopydefault = dialogFragment.copydefault();
                    if (mapCopydefault != null) {
                        if (metadata != null && (deviceKey = metadata.getDeviceKey()) != null && (mapKWHzl = C56424yEw.KWHzl((Map) mapCopydefault, C56390yDp.OLrzqt("DEVICE_KEY", deviceKey))) != null) {
                            mapCopydefault = mapKWHzl;
                        }
                        authenticationEvent = new SRPEvent(new SRPEvent.EventType.RespondPasswordVerifier(mapCopydefault, sRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1.$event$inlined.getMetadata(), dialogFragment.AEQbTJ()), null, 2, null);
                    } else {
                        throw new ServiceException("Auth challenge parameters are empty.", "Sorry, we don't have a suggested fix for this error yet.", null, 4, null);
                    }
                } else {
                    throw new Exception("Not yet implemented.");
                }
            } catch (Exception e6) {
                e = e6;
                eventDispatcher2 = eventDispatcher3;
                SRPEvent sRPEvent2222 = new SRPEvent(new SRPEvent.EventType.ThrowAuthError(e), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + sRPEvent2222.getType());
                eventDispatcher2.send(sRPEvent2222);
                SignInEvent signInEvent2222 = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                authEnvironment.getLogger().verbose(str + " Sending event " + sRPEvent2222.getType());
                eventDispatcher2.send(signInEvent2222);
                authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                authEnvironment2 = authEnvironment;
                str4 = str;
            }
        }
        authEnvironment2.getLogger().verbose(str4 + " Sending event " + authenticationEvent.getType());
        eventDispatcher2.send(authenticationEvent);
        return Unit.INSTANCE;
    }

    public SRPCognitoActions$initiateSRPWithCustomAuthAction$$inlined$invoke$1(String str, SRPEvent.EventType.InitiateSRPWithCustom initiateSRPWithCustom) {
        this.$event$inlined = initiateSRPWithCustom;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
