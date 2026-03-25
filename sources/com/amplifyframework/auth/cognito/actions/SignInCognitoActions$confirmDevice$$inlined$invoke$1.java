package com.amplifyframework.auth.cognito.actions;

import android.os.Build;
import com.amplifyframework.auth.cognito.AuthEnvironment;
import com.amplifyframework.auth.cognito.StoreClientBehavior;
import com.amplifyframework.auth.cognito.helpers.CognitoDeviceHelper;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.statemachine.Action;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.EventDispatcher;
import com.amplifyframework.statemachine.StateMachineEvent;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.events.AuthenticationEvent;
import com.amplifyframework.statemachine.codegen.events.SignInEvent;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.ArgbEvaluator;
import o.BidirectionalTypeConverter;
import o.BinaryOperator;
import o.C56391yDq;
import o.C56442yFn;
import o.PluralsRes;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class SignInCognitoActions$confirmDevice$$inlined$invoke$1 implements Action {
    final /* synthetic */ SignInEvent.EventType.ConfirmDevice $event$inlined;
    private final String id;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$confirmDevice$$inlined$invoke$1$1, reason: invalid class name */
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
            return SignInCognitoActions$confirmDevice$$inlined$invoke$1.this.execute(null, null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.Action
    public String getId() {
        return this.id;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // com.amplifyframework.statemachine.Action
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object execute(@NotNull EventDispatcher eventDispatcher, @NotNull Environment environment, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String id;
        AuthEnvironment authEnvironment;
        EventDispatcher eventDispatcher2;
        String str;
        EventDispatcher eventDispatcher3;
        EventDispatcher eventDispatcher4;
        SignInCognitoActions$confirmDevice$$inlined$invoke$1 signInCognitoActions$confirmDevice$$inlined$invoke$1;
        DeviceMetadata.Metadata metadata;
        String str2;
        Map<String, String> map;
        String str3;
        AuthEnvironment authEnvironment2;
        String str4;
        String str5;
        String str6;
        SignInCognitoActions$confirmDevice$$inlined$invoke$1 signInCognitoActions$confirmDevice$$inlined$invoke$12;
        StateMachineEvent signInEvent;
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
            DeviceMetadata.Metadata deviceMetadata = this.$event$inlined.getDeviceMetadata();
            final String deviceKey = deviceMetadata.getDeviceKey();
            String deviceGroupKey = deviceMetadata.getDeviceGroupKey();
            try {
                final Map<String, String> mapGenerateVerificationParameters = CognitoDeviceHelper.INSTANCE.generateVerificationParameters(deviceKey, deviceGroupKey);
                BinaryOperator cognitoIdentityProviderClient = authEnvironment.getCognitoAuthService().getCognitoIdentityProviderClient();
                if (cognitoIdentityProviderClient != null) {
                    ArgbEvaluator.TaskDescription taskDescription = ArgbEvaluator.copydefault;
                    final SignInEvent.EventType.ConfirmDevice confirmDevice = this.$event$inlined;
                    ArgbEvaluator argbEvaluatorOLrzqt = taskDescription.OLrzqt(new Function1<ArgbEvaluator.ActionBar, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$confirmDevice$1$evt$1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(ArgbEvaluator.ActionBar actionBar) {
                            invoke2(actionBar);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull ArgbEvaluator.ActionBar actionBar) {
                            Intrinsics.checkNotNullParameter(actionBar, "");
                            actionBar.OLrzqt(confirmDevice.getSignedInData().getCognitoUserPoolTokens().getAccessToken());
                            actionBar.copydefault(deviceKey);
                            actionBar.AEQbTJ(Build.MODEL);
                            PluralsRes.ActionBar actionBar2 = PluralsRes.EZpvd;
                            final Map<String, String> map2 = mapGenerateVerificationParameters;
                            actionBar.copydefault(actionBar2.copydefault(new Function1<PluralsRes.Application, Unit>() { // from class: com.amplifyframework.auth.cognito.actions.SignInCognitoActions$confirmDevice$1$evt$1.1
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                                /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(PluralsRes.Application application) {
                                    invoke2(application);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull PluralsRes.Application application) {
                                    Intrinsics.checkNotNullParameter(application, "");
                                    application.AEQbTJ(map2.get("verifier"));
                                    application.OLrzqt(map2.get("salt"));
                                }
                            }));
                        }
                    });
                    anonymousClass1.L$0 = this;
                    eventDispatcher2 = eventDispatcher;
                    try {
                        anonymousClass1.L$1 = eventDispatcher2;
                        anonymousClass1.L$2 = id;
                        anonymousClass1.L$3 = authEnvironment;
                        anonymousClass1.L$4 = deviceMetadata;
                        anonymousClass1.L$5 = deviceKey;
                        anonymousClass1.L$6 = deviceGroupKey;
                        anonymousClass1.L$7 = mapGenerateVerificationParameters;
                        anonymousClass1.label = 1;
                        Object objOLrzqt = cognitoIdentityProviderClient.OLrzqt(argbEvaluatorOLrzqt, anonymousClass1);
                        if (objOLrzqt == objCopydefault) {
                            return objCopydefault;
                        }
                        signInCognitoActions$confirmDevice$$inlined$invoke$1 = this;
                        eventDispatcher4 = eventDispatcher2;
                        metadata = deviceMetadata;
                        str2 = deviceKey;
                        map = mapGenerateVerificationParameters;
                        str3 = id;
                        obj = objOLrzqt;
                        authEnvironment2 = authEnvironment;
                        str4 = deviceGroupKey;
                    } catch (Exception e) {
                        e = e;
                        str = id;
                        eventDispatcher3 = eventDispatcher2;
                        signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                    }
                } else {
                    eventDispatcher4 = eventDispatcher;
                    try {
                        throw new ServiceException("Sign in failed", "Sorry, we don't have a suggested fix for this error yet.", null, 4, null);
                    } catch (Exception e2) {
                        e = e2;
                        str = id;
                        eventDispatcher3 = eventDispatcher4;
                        signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
                        authEnvironment.getLogger().verbose(str + " Sending event " + signInEvent.getType());
                        eventDispatcher3.send(signInEvent);
                        return Unit.INSTANCE;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                eventDispatcher2 = eventDispatcher;
            }
            str = id;
            eventDispatcher3 = eventDispatcher2;
            signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
            authEnvironment.getLogger().verbose(str + " Sending event " + signInEvent.getType());
            eventDispatcher3.send(signInEvent);
            return Unit.INSTANCE;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str7 = (String) anonymousClass1.L$5;
            String str8 = (String) anonymousClass1.L$4;
            authEnvironment = (AuthEnvironment) anonymousClass1.L$3;
            str = (String) anonymousClass1.L$2;
            eventDispatcher3 = (EventDispatcher) anonymousClass1.L$1;
            signInCognitoActions$confirmDevice$$inlined$invoke$12 = (SignInCognitoActions$confirmDevice$$inlined$invoke$1) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(obj);
                str5 = str7;
                str6 = str8;
                signInEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.SignInCompleted(signInCognitoActions$confirmDevice$$inlined$invoke$12.$event$inlined.getSignedInData(), new DeviceMetadata.Metadata(str6, str5, (String) null, 4, (DefaultConstructorMarker) null)), null, 2, null);
            } catch (Exception e4) {
                e = e4;
                signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
            }
            authEnvironment.getLogger().verbose(str + " Sending event " + signInEvent.getType());
            eventDispatcher3.send(signInEvent);
            return Unit.INSTANCE;
        }
        map = (Map) anonymousClass1.L$7;
        str4 = (String) anonymousClass1.L$6;
        str2 = (String) anonymousClass1.L$5;
        DeviceMetadata.Metadata metadata2 = (DeviceMetadata.Metadata) anonymousClass1.L$4;
        authEnvironment2 = (AuthEnvironment) anonymousClass1.L$3;
        str3 = (String) anonymousClass1.L$2;
        eventDispatcher4 = (EventDispatcher) anonymousClass1.L$1;
        signInCognitoActions$confirmDevice$$inlined$invoke$1 = (SignInCognitoActions$confirmDevice$$inlined$invoke$1) anonymousClass1.L$0;
        try {
            C56391yDq.AEQbTJ(obj);
            metadata = metadata2;
        } catch (Exception e5) {
            e = e5;
            authEnvironment = authEnvironment2;
            str = str3;
            eventDispatcher3 = eventDispatcher4;
            signInEvent = new SignInEvent(new SignInEvent.EventType.ThrowError(e), null, 2, null);
            authEnvironment.getLogger().verbose(str + " Sending event " + signInEvent.getType());
            eventDispatcher3.send(signInEvent);
            return Unit.INSTANCE;
        }
        if (((BidirectionalTypeConverter) obj) == null) {
            authEnvironment = authEnvironment2;
            id = str3;
            throw new ServiceException("Sign in failed", "Sorry, we don't have a suggested fix for this error yet.", null, 4, null);
        }
        DeviceMetadata.Metadata metadataCopy$default = DeviceMetadata.Metadata.copy$default(metadata, null, null, map.get("secret"), 3, null);
        StoreClientBehavior credentialStoreClient = authEnvironment2.getCredentialStoreClient();
        CredentialType.Device device = new CredentialType.Device(signInCognitoActions$confirmDevice$$inlined$invoke$1.$event$inlined.getSignedInData().getUsername());
        AmplifyCredential.DeviceData deviceData = new AmplifyCredential.DeviceData(metadataCopy$default);
        anonymousClass1.L$0 = signInCognitoActions$confirmDevice$$inlined$invoke$1;
        anonymousClass1.L$1 = eventDispatcher4;
        anonymousClass1.L$2 = str3;
        anonymousClass1.L$3 = authEnvironment2;
        anonymousClass1.L$4 = str2;
        anonymousClass1.L$5 = str4;
        anonymousClass1.L$6 = null;
        anonymousClass1.L$7 = null;
        anonymousClass1.label = 2;
        if (credentialStoreClient.storeCredentials(device, deviceData, anonymousClass1) == objCopydefault) {
            return objCopydefault;
        }
        str5 = str4;
        str6 = str2;
        authEnvironment = authEnvironment2;
        str = str3;
        eventDispatcher3 = eventDispatcher4;
        signInCognitoActions$confirmDevice$$inlined$invoke$12 = signInCognitoActions$confirmDevice$$inlined$invoke$1;
        signInEvent = new AuthenticationEvent(new AuthenticationEvent.EventType.SignInCompleted(signInCognitoActions$confirmDevice$$inlined$invoke$12.$event$inlined.getSignedInData(), new DeviceMetadata.Metadata(str6, str5, (String) null, 4, (DefaultConstructorMarker) null)), null, 2, null);
        authEnvironment.getLogger().verbose(str + " Sending event " + signInEvent.getType());
        eventDispatcher3.send(signInEvent);
        return Unit.INSTANCE;
    }

    public SignInCognitoActions$confirmDevice$$inlined$invoke$1(String str, SignInEvent.EventType.ConfirmDevice confirmDevice) {
        this.$event$inlined = confirmDevice;
        this.id = str == null ? Action.DefaultImpls.getId(this) : str;
    }
}
