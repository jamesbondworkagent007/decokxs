package com.amplifyframework.auth.cognito;

import android.content.Context;
import android.content.SharedPreferences;
import com.amplifyframework.auth.cognito.asf.UserContextDataProvider;
import com.amplifyframework.auth.cognito.helpers.SRPHelper;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.Environment;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.AuthConfiguration;
import com.amplifyframework.statemachine.codegen.data.CredentialType;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import java.util.Date;
import java.util.UUID;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56391yDq;
import o.C56442yFn;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AuthEnvironment implements Environment {
    public static final Companion Companion = new Companion(null);
    public static final String PINPOINT_SHARED_PREFS_SUFFIX = "515d6767-01b7-49e5-8273-c8d11b0f331d";
    public static final String PINPOINT_UNIQUE_ID_KEY = "UniqueId";
    private String cachedPinpointEndpointId;
    private final AWSCognitoAuthService cognitoAuthService;
    private final AuthConfiguration configuration;
    private final Context context;
    private final StoreClientBehavior credentialStoreClient;
    private final HostedUIClient hostedUIClient;
    private final Logger logger;
    public SRPHelper srpHelper;
    private final UserContextDataProvider userContextDataProvider;

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AuthEnvironment$getDeviceMetadata$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthEnvironment.this.getDeviceMetadata(null, this);
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.cognito.AuthEnvironment$getUserContextData$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16171 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C16171(Continuation<? super C16171> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AuthEnvironment.this.getUserContextData(null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AWSCognitoAuthService getCognitoAuthService() {
        return this.cognitoAuthService;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AuthConfiguration getConfiguration() {
        return this.configuration;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Context getContext() {
        return this.context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final StoreClientBehavior getCredentialStoreClient() {
        return this.credentialStoreClient;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HostedUIClient getHostedUIClient() {
        return this.hostedUIClient;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Logger getLogger() {
        return this.logger;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSrpHelper$aws_auth_cognito_release(@NotNull SRPHelper sRPHelper) {
        Intrinsics.checkNotNullParameter(sRPHelper, "");
        this.srpHelper = sRPHelper;
    }

    public AuthEnvironment(@NotNull Context context, @NotNull AuthConfiguration authConfiguration, @NotNull AWSCognitoAuthService aWSCognitoAuthService, @NotNull StoreClientBehavior storeClientBehavior, UserContextDataProvider userContextDataProvider, HostedUIClient hostedUIClient, @NotNull Logger logger) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(authConfiguration, "");
        Intrinsics.checkNotNullParameter(aWSCognitoAuthService, "");
        Intrinsics.checkNotNullParameter(storeClientBehavior, "");
        Intrinsics.checkNotNullParameter(logger, "");
        this.context = context;
        this.configuration = authConfiguration;
        this.cognitoAuthService = aWSCognitoAuthService;
        this.credentialStoreClient = storeClientBehavior;
        this.userContextDataProvider = userContextDataProvider;
        this.hostedUIClient = hostedUIClient;
        this.logger = logger;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r10v0 android.content.Context)
  (r11v0 com.amplifyframework.statemachine.codegen.data.AuthConfiguration)
  (r12v0 com.amplifyframework.auth.cognito.AWSCognitoAuthService)
  (r13v0 com.amplifyframework.auth.cognito.StoreClientBehavior)
  (wrap:com.amplifyframework.auth.cognito.asf.UserContextDataProvider:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.amplifyframework.auth.cognito.asf.UserContextDataProvider) : (r14v0 com.amplifyframework.auth.cognito.asf.UserContextDataProvider))
  (r15v0 com.amplifyframework.auth.cognito.HostedUIClient)
  (r16v0 com.amplifyframework.logging.Logger)
 A[MD:(android.content.Context, com.amplifyframework.statemachine.codegen.data.AuthConfiguration, com.amplifyframework.auth.cognito.AWSCognitoAuthService, com.amplifyframework.auth.cognito.StoreClientBehavior, com.amplifyframework.auth.cognito.asf.UserContextDataProvider, com.amplifyframework.auth.cognito.HostedUIClient, com.amplifyframework.logging.Logger):void (m)] (LINE:37) call: com.amplifyframework.auth.cognito.AuthEnvironment.<init>(android.content.Context, com.amplifyframework.statemachine.codegen.data.AuthConfiguration, com.amplifyframework.auth.cognito.AWSCognitoAuthService, com.amplifyframework.auth.cognito.StoreClientBehavior, com.amplifyframework.auth.cognito.asf.UserContextDataProvider, com.amplifyframework.auth.cognito.HostedUIClient, com.amplifyframework.logging.Logger):void type: THIS */
    public /* synthetic */ AuthEnvironment(Context context, AuthConfiguration authConfiguration, AWSCognitoAuthService aWSCognitoAuthService, StoreClientBehavior storeClientBehavior, UserContextDataProvider userContextDataProvider, HostedUIClient hostedUIClient, Logger logger, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, authConfiguration, aWSCognitoAuthService, storeClientBehavior, (i & 16) != 0 ? null : userContextDataProvider, hostedUIClient, logger);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.AuthEnvironment.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final SRPHelper getSrpHelper$aws_auth_cognito_release() {
        SRPHelper sRPHelper = this.srpHelper;
        if (sRPHelper != null) {
            return sRPHelper;
        }
        Intrinsics.gEmmrt("");
        return null;
    }

    public final String getPinpointEndpointId() {
        synchronized (this) {
            UserPoolConfiguration userPool = this.configuration.getUserPool();
            if ((userPool != null ? userPool.getPinpointAppId() : null) == null) {
                return null;
            }
            String str = this.cachedPinpointEndpointId;
            if (str != null) {
                return str;
            }
            SharedPreferences sharedPreferences = this.context.getSharedPreferences(this.configuration.getUserPool().getPinpointAppId() + PINPOINT_SHARED_PREFS_SUFFIX, 0);
            String string = sharedPreferences.getString(PINPOINT_UNIQUE_ID_KEY, null);
            if (string == null) {
                String string2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "");
                sharedPreferences.edit().putString(PINPOINT_UNIQUE_ID_KEY, string).commit();
                string = string2;
            }
            this.cachedPinpointEndpointId = string;
            return string;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getUserContextData(@NotNull String str, @NotNull Continuation<? super String> continuation) throws Throwable {
        C16171 c16171;
        AuthEnvironment authEnvironment;
        String id;
        String str2;
        String str3;
        AuthEnvironment authEnvironment2;
        UserContextDataProvider userContextDataProvider;
        if (continuation instanceof C16171) {
            c16171 = (C16171) continuation;
            int i = c16171.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16171.label = i - Integer.MIN_VALUE;
            } else {
                c16171 = new C16171(continuation);
            }
        }
        Object objLoadCredentials = c16171.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c16171.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objLoadCredentials);
            StoreClientBehavior storeClientBehavior = this.credentialStoreClient;
            CredentialType.ASF asf = CredentialType.ASF.INSTANCE;
            c16171.L$0 = this;
            c16171.L$1 = str;
            c16171.label = 1;
            objLoadCredentials = storeClientBehavior.loadCredentials(asf, c16171);
            if (objLoadCredentials == objCopydefault) {
                return objCopydefault;
            }
            authEnvironment = this;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str3 = (String) c16171.L$2;
                str2 = (String) c16171.L$1;
                authEnvironment2 = (AuthEnvironment) c16171.L$0;
                C56391yDq.AEQbTJ(objLoadCredentials);
                id = str3;
                authEnvironment = authEnvironment2;
                str = str2;
                userContextDataProvider = authEnvironment.userContextDataProvider;
                if (userContextDataProvider != null) {
                    return userContextDataProvider.getEncodedContextData(str, id);
                }
                return null;
            }
            str = (String) c16171.L$1;
            authEnvironment = (AuthEnvironment) c16171.L$0;
            C56391yDq.AEQbTJ(objLoadCredentials);
        }
        AmplifyCredential.ASFDevice aSFDevice = objLoadCredentials instanceof AmplifyCredential.ASFDevice ? (AmplifyCredential.ASFDevice) objLoadCredentials : null;
        if (aSFDevice == null) {
            authEnvironment.logger.warn("loadCredentials returned unexpected AmplifyCredential Type.");
        }
        if ((aSFDevice != null ? aSFDevice.getId() : null) == null) {
            String str4 = UUID.randomUUID() + ":" + new Date().getTime();
            AmplifyCredential.ASFDevice aSFDevice2 = new AmplifyCredential.ASFDevice(str4);
            StoreClientBehavior storeClientBehavior2 = authEnvironment.credentialStoreClient;
            CredentialType.ASF asf2 = CredentialType.ASF.INSTANCE;
            c16171.L$0 = authEnvironment;
            c16171.L$1 = str;
            c16171.L$2 = str4;
            c16171.label = 2;
            if (storeClientBehavior2.storeCredentials(asf2, aSFDevice2, c16171) == objCopydefault) {
                return objCopydefault;
            }
            str2 = str;
            str3 = str4;
            authEnvironment2 = authEnvironment;
            id = str3;
            authEnvironment = authEnvironment2;
            str = str2;
            userContextDataProvider = authEnvironment.userContextDataProvider;
            if (userContextDataProvider != null) {
            }
        } else {
            id = aSFDevice.getId();
            userContextDataProvider = authEnvironment.userContextDataProvider;
            if (userContextDataProvider != null) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getDeviceMetadata(@NotNull String str, @NotNull Continuation<? super DeviceMetadata.Metadata> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AuthEnvironment authEnvironment;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object objLoadCredentials = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            C56391yDq.AEQbTJ(objLoadCredentials);
            StoreClientBehavior storeClientBehavior = this.credentialStoreClient;
            CredentialType.Device device = new CredentialType.Device(str);
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objLoadCredentials = storeClientBehavior.loadCredentials(device, anonymousClass1);
            if (objLoadCredentials == objCopydefault) {
                return objCopydefault;
            }
            authEnvironment = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            authEnvironment = (AuthEnvironment) anonymousClass1.L$0;
            C56391yDq.AEQbTJ(objLoadCredentials);
        }
        AmplifyCredential.DeviceData deviceData = objLoadCredentials instanceof AmplifyCredential.DeviceData ? (AmplifyCredential.DeviceData) objLoadCredentials : null;
        if (deviceData == null) {
            authEnvironment.logger.warn("loadCredentials returned unexpected AmplifyCredential Type.");
            deviceData = new AmplifyCredential.DeviceData(DeviceMetadata.Empty.INSTANCE);
        }
        DeviceMetadata deviceMetadata = deviceData.getDeviceMetadata();
        if (deviceMetadata instanceof DeviceMetadata.Metadata) {
            return (DeviceMetadata.Metadata) deviceMetadata;
        }
        return null;
    }
}
