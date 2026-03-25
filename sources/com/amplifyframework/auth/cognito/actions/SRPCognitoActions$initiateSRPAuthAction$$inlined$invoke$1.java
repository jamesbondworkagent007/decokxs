package com.amplifyframework.auth.cognito.actions;

import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.helpers.AuthHelper;
import com.amplifyframework.auth.cognito.helpers.SRPHelper;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SRPEvent;
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
public final class SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 implements Action {
    final /* synthetic */ SRPEvent.EventType.InitiateSRP $event$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1$1, reason: invalid class name */
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
            return SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [48=4] */
    /* JADX WARN: Removed duplicated region for block: B:100:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02a9 A[Catch: Exception -> 0x02b1, TryCatch #8 {Exception -> 0x02b1, blocks: (B:98:0x0276, B:101:0x0280, B:103:0x0286, B:107:0x0292, B:108:0x02a9, B:109:0x02b0), top: B:142:0x0276 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b4 A[Catch: Exception -> 0x021f, TRY_ENTER, TryCatch #1 {Exception -> 0x021f, blocks: (B:80:0x021a, B:84:0x0226, B:86:0x022e, B:88:0x023c, B:90:0x0244, B:92:0x024a, B:94:0x0254, B:112:0x02b4, B:113:0x02bb), top: B:129:0x021a }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x021a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019b A[Catch: Exception -> 0x02c0, TryCatch #0 {Exception -> 0x02c0, blocks: (B:58:0x0197, B:60:0x019b, B:61:0x01a2, B:63:0x01b0, B:65:0x01c4, B:67:0x01ca, B:69:0x01db, B:71:0x01e5, B:72:0x01ed), top: B:127:0x0197 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01b0 A[Catch: Exception -> 0x02c0, TryCatch #0 {Exception -> 0x02c0, blocks: (B:58:0x0197, B:60:0x019b, B:61:0x01a2, B:63:0x01b0, B:65:0x01c4, B:67:0x01ca, B:69:0x01db, B:71:0x01e5, B:72:0x01ed), top: B:127:0x0197 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022e A[Catch: Exception -> 0x021f, TryCatch #1 {Exception -> 0x021f, blocks: (B:80:0x021a, B:84:0x0226, B:86:0x022e, B:88:0x023c, B:90:0x0244, B:92:0x024a, B:94:0x0254, B:112:0x02b4, B:113:0x02bb), top: B:129:0x021a }] */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String id;
        EventDispatcher eventDispatcher2;
        AuthEnvironment authEnvironment;
        SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1;
        Map<String, String> map;
        String str;
        AuthEnvironment authEnvironment2;
        EventDispatcher eventDispatcher3;
        final String str2;
        Object deviceMetadata;
        Map<String, String> map2;
        SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12;
        AuthEnvironment authEnvironment3;
        String str3;
        DeviceMetadata.Metadata metadata;
        BinaryOperator cognitoIdentityProviderClient;
        SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$13;
        DialogFragment dialogFragment;
        AuthEnvironment authEnvironment4;
        EventDispatcher eventDispatcher4;
        GrantCredentialsPermissionActivity grantCredentialsPermissionActivityOLrzqt;
        EventDispatcher eventDispatcher5;
        SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$14;
        StateMachineEvent authenticationEvent;
        DeviceMetadata.Metadata metadata2;
        Map<String, String> mapCopydefault;
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
        Object objCopydefault = anonymousClass1.result;
        Object objCopydefault2 = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objCopydefault);
            Intrinsics.copydefault(environment, "");
            id = getId();
            AuthEnvironment authEnvironment5 = (AuthEnvironment) environment;
            authEnvironment5.getLogger().verbose(id + " Starting execution");
            try {
                authEnvironment5.setSrpHelper$aws_auth_cognito_release(new SRPHelper(this.$event$inlined.getPassword()));
                AuthHelper.Companion companion = AuthHelper.Companion;
                String username = this.$event$inlined.getUsername();
                UserPoolConfiguration userPool = authEnvironment5.getConfiguration().getUserPool();
                String appClient = userPool != null ? userPool.getAppClient() : null;
                UserPoolConfiguration userPool2 = authEnvironment5.getConfiguration().getUserPool();
                String secretHash = companion.getSecretHash(username, appClient, userPool2 != null ? userPool2.getAppClientSecret() : null);
                Map<String, String> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("USERNAME", this.$event$inlined.getUsername()), C56390yDp.OLrzqt("SRP_A", authEnvironment5.getSrpHelper$aws_auth_cognito_release().getPublicA()));
                if (secretHash != null) {
                    mapDjBIcL.put("SECRET_HASH", secretHash);
                }
                String username2 = this.$event$inlined.getUsername();
                anonymousClass1.L$0 = this;
                eventDispatcher2 = eventDispatcher;
                try {
                    anonymousClass1.L$1 = eventDispatcher2;
                    anonymousClass1.L$2 = id;
                    anonymousClass1.L$3 = authEnvironment5;
                    anonymousClass1.L$4 = mapDjBIcL;
                    anonymousClass1.label = 1;
                    Object userContextData = authEnvironment5.getUserContextData(username2, anonymousClass1);
                    if (userContextData == objCopydefault2) {
                        return objCopydefault2;
                    }
                    sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 = this;
                    objCopydefault = userContextData;
                    map = mapDjBIcL;
                    str = id;
                    authEnvironment2 = authEnvironment5;
                } catch (Exception e) {
                    e = e;
                    authEnvironment = authEnvironment5;
                    eventDispatcher3 = eventDispatcher2;
                }
            } catch (Exception e2) {
                e = e2;
                eventDispatcher2 = eventDispatcher;
            }
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    String str4 = (String) anonymousClass1.L$5;
                    map2 = (Map) anonymousClass1.L$4;
                    authEnvironment3 = (AuthEnvironment) anonymousClass1.L$3;
                    String str5 = (String) anonymousClass1.L$2;
                    eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
                    SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$15 = (SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1) anonymousClass1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objCopydefault);
                        str2 = str4;
                        sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$15;
                        str3 = str5;
                        deviceMetadata = objCopydefault;
                    } catch (Exception e3) {
                        e = e3;
                        authEnvironment = authEnvironment3;
                        id = str5;
                    }
                    try {
                        metadata = (DeviceMetadata.Metadata) deviceMetadata;
                        if (metadata != null) {
                            map2.put("DEVICE_KEY", metadata.getDeviceKey());
                        }
                        final String pinpointEndpointId = authEnvironment3.getPinpointEndpointId();
                        cognitoIdentityProviderClient = authEnvironment3.getCognitoAuthService().getCognitoIdentityProviderClient();
                        if (cognitoIdentityProviderClient == null) {
                            BroadcastOptions.Activity activity = new BroadcastOptions.Activity();
                            activity.copydefault(NetworkErrorException.PendingIntent.KWHzl);
                            UserPoolConfiguration userPool3 = authEnvironment3.getConfiguration().getUserPool();
                            activity.AEQbTJ(userPool3 != null ? userPool3.getAppClient() : null);
                            activity.KWHzl(map2);
                            activity.AEQbTJ(sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12.$event$inlined.getMetadata());
                            if (pinpointEndpointId != null) {
                                activity.copydefault(new Function1<AccountManagerResponse.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$initiateSRPAuthAction$1$evt$initiateAuthResponse$1$1$1
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
                                activity.OLrzqt(new Function1<RestoreDescription.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.SRPCognitoActions$initiateSRPAuthAction$1$evt$initiateAuthResponse$1$2$1
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
                            anonymousClass1.L$0 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12;
                            anonymousClass1.L$1 = eventDispatcher3;
                            anonymousClass1.L$2 = str3;
                            anonymousClass1.L$3 = authEnvironment3;
                            anonymousClass1.L$4 = null;
                            anonymousClass1.L$5 = null;
                            anonymousClass1.label = 3;
                            objCopydefault = cognitoIdentityProviderClient.copydefault(broadcastOptionsEZpvd, anonymousClass1);
                            if (objCopydefault == objCopydefault2) {
                                return objCopydefault2;
                            }
                            authEnvironment4 = authEnvironment3;
                            eventDispatcher4 = eventDispatcher3;
                            DialogFragment dialogFragment2 = (DialogFragment) objCopydefault;
                            eventDispatcher3 = eventDispatcher4;
                            authEnvironment3 = authEnvironment4;
                            id = str3;
                            sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$13 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12;
                            dialogFragment = dialogFragment2;
                            if (dialogFragment != null) {
                            }
                            if (!Intrinsics.EZpvd(grantCredentialsPermissionActivityOLrzqt, GrantCredentialsPermissionActivity.FragmentManager.EZpvd)) {
                            }
                        } else {
                            sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$13 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12;
                            id = str3;
                            dialogFragment = null;
                            if (dialogFragment != null) {
                            }
                            if (!Intrinsics.EZpvd(grantCredentialsPermissionActivityOLrzqt, GrantCredentialsPermissionActivity.FragmentManager.EZpvd)) {
                            }
                        }
                    } catch (Exception e4) {
                        e = e4;
                        id = str3;
                        authEnvironment = authEnvironment3;
                        SRPEvent sRPEvent = new SRPEvent(new SRPEvent.EventType.ThrowAuthError(e), null, 2, null);
                        authEnvironment.getLogger().verbose(id + " Sending event " + sRPEvent.getType());
                        eventDispatcher3.send(sRPEvent);
                        authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                        eventDispatcher5 = eventDispatcher3;
                    }
                    authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                    eventDispatcher5.send(authenticationEvent);
                    return Unit.INSTANCE;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    dialogFragment = (DialogFragment) anonymousClass1.L$4;
                    authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
                    id = (String) anonymousClass1.L$2;
                    eventDispatcher5 = (EventDispatcher) anonymousClass1.L$1;
                    sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$14 = (SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1) anonymousClass1.L$0;
                    try {
                        C56391yDq.AEQbTJ(objCopydefault);
                        try {
                            metadata2 = (DeviceMetadata.Metadata) objCopydefault;
                            mapCopydefault = dialogFragment.copydefault();
                        } catch (Exception e5) {
                            e = e5;
                            eventDispatcher4 = eventDispatcher5;
                            eventDispatcher3 = eventDispatcher4;
                            SRPEvent sRPEvent2 = new SRPEvent(new SRPEvent.EventType.ThrowAuthError(e), null, 2, null);
                            authEnvironment.getLogger().verbose(id + " Sending event " + sRPEvent2.getType());
                            eventDispatcher3.send(sRPEvent2);
                            authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                            eventDispatcher5 = eventDispatcher3;
                        }
                    } catch (Exception e6) {
                        e = e6;
                        eventDispatcher3 = eventDispatcher5;
                        SRPEvent sRPEvent22 = new SRPEvent(new SRPEvent.EventType.ThrowAuthError(e), null, 2, null);
                        authEnvironment.getLogger().verbose(id + " Sending event " + sRPEvent22.getType());
                        eventDispatcher3.send(sRPEvent22);
                        authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                        eventDispatcher5 = eventDispatcher3;
                    }
                    if (mapCopydefault != null) {
                        throw new Exception("Auth challenge parameters are empty.");
                    }
                    if (metadata2 != null && (deviceKey = metadata2.getDeviceKey()) != null && (mapKWHzl = C56424yEw.KWHzl((Map) mapCopydefault, C56390yDp.OLrzqt("DEVICE_KEY", deviceKey))) != null) {
                        mapCopydefault = mapKWHzl;
                    }
                    authenticationEvent = new SRPEvent(new SRPEvent.EventType.RespondPasswordVerifier(mapCopydefault, sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$14.$event$inlined.getMetadata(), dialogFragment.AEQbTJ()), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                    eventDispatcher5.send(authenticationEvent);
                    return Unit.INSTANCE;
                }
                authEnvironment4 = (AuthEnvironment) anonymousClass1.L$3;
                str3 = (String) anonymousClass1.L$2;
                eventDispatcher4 = (EventDispatcher) anonymousClass1.L$1;
                sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12 = (SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1) anonymousClass1.L$0;
                try {
                    C56391yDq.AEQbTJ(objCopydefault);
                    DialogFragment dialogFragment22 = (DialogFragment) objCopydefault;
                    eventDispatcher3 = eventDispatcher4;
                    authEnvironment3 = authEnvironment4;
                    id = str3;
                    sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$13 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12;
                    dialogFragment = dialogFragment22;
                    if (dialogFragment != null) {
                        try {
                            grantCredentialsPermissionActivityOLrzqt = dialogFragment.OLrzqt();
                        } catch (Exception e7) {
                            e = e7;
                            str3 = id;
                            authEnvironment4 = authEnvironment3;
                            eventDispatcher4 = eventDispatcher3;
                            authEnvironment = authEnvironment4;
                            id = str3;
                            eventDispatcher3 = eventDispatcher4;
                            SRPEvent sRPEvent222 = new SRPEvent(new SRPEvent.EventType.ThrowAuthError(e), null, 2, null);
                            authEnvironment.getLogger().verbose(id + " Sending event " + sRPEvent222.getType());
                            eventDispatcher3.send(sRPEvent222);
                            authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                            eventDispatcher5 = eventDispatcher3;
                            authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                            eventDispatcher5.send(authenticationEvent);
                            return Unit.INSTANCE;
                        }
                    } else {
                        grantCredentialsPermissionActivityOLrzqt = null;
                    }
                    if (!Intrinsics.EZpvd(grantCredentialsPermissionActivityOLrzqt, GrantCredentialsPermissionActivity.FragmentManager.EZpvd)) {
                        throw new Exception("Not yet implemented.");
                    }
                    AuthHelper.Companion companion2 = AuthHelper.Companion;
                    String username3 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$13.$event$inlined.getUsername();
                    Map<String, String> mapCopydefault2 = dialogFragment.copydefault();
                    String str6 = mapCopydefault2 != null ? mapCopydefault2.get("USERNAME") : null;
                    Map<String, String> mapCopydefault3 = dialogFragment.copydefault();
                    String activeUsername = companion2.getActiveUsername(username3, str6, mapCopydefault3 != null ? mapCopydefault3.get("USER_ID_FOR_SRP") : null);
                    anonymousClass1.L$0 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$13;
                    anonymousClass1.L$1 = eventDispatcher3;
                    anonymousClass1.L$2 = id;
                    anonymousClass1.L$3 = authEnvironment3;
                    anonymousClass1.L$4 = dialogFragment;
                    anonymousClass1.L$5 = null;
                    anonymousClass1.label = 4;
                    Object deviceMetadata2 = authEnvironment3.getDeviceMetadata(activeUsername, anonymousClass1);
                    if (deviceMetadata2 == objCopydefault2) {
                        return objCopydefault2;
                    }
                    eventDispatcher5 = eventDispatcher3;
                    authEnvironment = authEnvironment3;
                    sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$14 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$13;
                    objCopydefault = deviceMetadata2;
                    metadata2 = (DeviceMetadata.Metadata) objCopydefault;
                    mapCopydefault = dialogFragment.copydefault();
                    if (mapCopydefault != null) {
                    }
                } catch (Exception e8) {
                    e = e8;
                    authEnvironment = authEnvironment4;
                    id = str3;
                    eventDispatcher3 = eventDispatcher4;
                    SRPEvent sRPEvent2222 = new SRPEvent(new SRPEvent.EventType.ThrowAuthError(e), null, 2, null);
                    authEnvironment.getLogger().verbose(id + " Sending event " + sRPEvent2222.getType());
                    eventDispatcher3.send(sRPEvent2222);
                    authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                    eventDispatcher5 = eventDispatcher3;
                    authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                    eventDispatcher5.send(authenticationEvent);
                    return Unit.INSTANCE;
                }
                SRPEvent sRPEvent22222 = new SRPEvent(new SRPEvent.EventType.ThrowAuthError(e), null, 2, null);
                authEnvironment.getLogger().verbose(id + " Sending event " + sRPEvent22222.getType());
                eventDispatcher3.send(sRPEvent22222);
                authenticationEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.CancelSignIn(null, 1, null), null, 2, null);
                eventDispatcher5 = eventDispatcher3;
                authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
                eventDispatcher5.send(authenticationEvent);
                return Unit.INSTANCE;
            }
            map = (Map) anonymousClass1.L$4;
            authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
            str = (String) anonymousClass1.L$2;
            eventDispatcher2 = (EventDispatcher) anonymousClass1.L$1;
            sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1 = (SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(objCopydefault);
            } catch (Exception e9) {
                e = e9;
                authEnvironment = authEnvironment2;
                id = str;
                eventDispatcher3 = eventDispatcher2;
            }
        }
        str2 = (String) objCopydefault;
        String username4 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1.$event$inlined.getUsername();
        anonymousClass1.L$0 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1;
        anonymousClass1.L$1 = eventDispatcher2;
        anonymousClass1.L$2 = str;
        anonymousClass1.L$3 = authEnvironment2;
        anonymousClass1.L$4 = map;
        anonymousClass1.L$5 = str2;
        anonymousClass1.label = 2;
        deviceMetadata = authEnvironment2.getDeviceMetadata(username4, anonymousClass1);
        if (deviceMetadata == objCopydefault2) {
            return objCopydefault2;
        }
        AuthEnvironment authEnvironment6 = authEnvironment2;
        map2 = map;
        sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$12 = sRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1;
        authEnvironment3 = authEnvironment6;
        EventDispatcher eventDispatcher6 = eventDispatcher2;
        str3 = str;
        eventDispatcher3 = eventDispatcher6;
        metadata = (DeviceMetadata.Metadata) deviceMetadata;
        if (metadata != null) {
        }
        final String pinpointEndpointId2 = authEnvironment3.getPinpointEndpointId();
        cognitoIdentityProviderClient = authEnvironment3.getCognitoAuthService().getCognitoIdentityProviderClient();
        if (cognitoIdentityProviderClient == null) {
        }
        authEnvironment.getLogger().verbose(id + " Sending event " + authenticationEvent.getType());
        eventDispatcher5.send(authenticationEvent);
        return Unit.INSTANCE;
    }

    public SRPCognitoActions$initiateSRPAuthAction$$inlined$invoke$1(String str, SRPEvent.EventType.InitiateSRP initiateSRP) {
        this.$event$inlined = initiateSRP;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
