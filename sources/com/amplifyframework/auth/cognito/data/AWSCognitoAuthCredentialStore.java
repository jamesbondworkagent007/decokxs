package com.amplifyframework.auth.cognito.data;

import android.content.Context;
import com.amplifyframework.core.store.KeyValueRepository;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.AuthConfiguration;
import com.amplifyframework.statemachine.codegen.data.AuthCredentialStore;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.IdentityPoolConfiguration;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSCognitoAuthCredentialStore implements AuthCredentialStore {
    public static final Companion Companion = new Companion(null);
    private static final String Key_ASFDevice = "asfDevice";
    private static final String Key_DeviceMetadata = "deviceMetadata";
    private static final String Key_Session = "session";
    public static final String awsKeyValueStoreIdentifier = "com.amplify.credentialStore";
    private final AuthConfiguration authConfiguration;
    private final Context context;
    private KeyValueRepository keyValue;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Context getContext() {
        return this.context;
    }

    public AWSCognitoAuthCredentialStore(@NotNull Context context, @NotNull AuthConfiguration authConfiguration, boolean z, @NotNull KeyValueRepositoryFactory keyValueRepositoryFactory) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(authConfiguration, "");
        Intrinsics.checkNotNullParameter(keyValueRepositoryFactory, "");
        this.context = context;
        this.authConfiguration = authConfiguration;
        this.keyValue = keyValueRepositoryFactory.create(context, awsKeyValueStoreIdentifier, z);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000e: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 com.amplifyframework.statemachine.codegen.data.AuthConfiguration)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? true : (r3v0 boolean))
  (wrap:com.amplifyframework.auth.cognito.data.KeyValueRepositoryFactory:?: TERNARY null = ((wrap:int:0x0005: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:com.amplifyframework.auth.cognito.data.KeyValueRepositoryFactory:0x000b: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:32) call: com.amplifyframework.auth.cognito.data.KeyValueRepositoryFactory.<init>():void type: CONSTRUCTOR) : (r4v0 com.amplifyframework.auth.cognito.data.KeyValueRepositoryFactory))
 A[MD:(android.content.Context, com.amplifyframework.statemachine.codegen.data.AuthConfiguration, boolean, com.amplifyframework.auth.cognito.data.KeyValueRepositoryFactory):void (m)] (LINE:28) call: com.amplifyframework.auth.cognito.data.AWSCognitoAuthCredentialStore.<init>(android.content.Context, com.amplifyframework.statemachine.codegen.data.AuthConfiguration, boolean, com.amplifyframework.auth.cognito.data.KeyValueRepositoryFactory):void type: THIS */
    public /* synthetic */ AWSCognitoAuthCredentialStore(Context context, AuthConfiguration authConfiguration, boolean z, KeyValueRepositoryFactory keyValueRepositoryFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, authConfiguration, (i & 4) != 0 ? true : z, (i & 8) != 0 ? new KeyValueRepositoryFactory() : keyValueRepositoryFactory);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.data.AWSCognitoAuthCredentialStore.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveCredential(@NotNull AmplifyCredential amplifyCredential) {
        Intrinsics.checkNotNullParameter(amplifyCredential, "");
        this.keyValue.put(generateKey(Key_Session), serializeCredential(amplifyCredential));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveDeviceMetadata(@NotNull String str, @NotNull DeviceMetadata deviceMetadata) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deviceMetadata, "");
        this.keyValue.put(generateKey(str + ".deviceMetadata"), serializeMetaData(deviceMetadata));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveASFDevice(@NotNull AmplifyCredential.ASFDevice aSFDevice) {
        Intrinsics.checkNotNullParameter(aSFDevice, "");
        this.keyValue.put(generateKey(Key_ASFDevice), serializeASFDevice(aSFDevice));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public AmplifyCredential retrieveCredential() {
        return deserializeCredential(this.keyValue.get(generateKey(Key_Session)));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public DeviceMetadata retrieveDeviceMetadata(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return deserializeMetadata(this.keyValue.get(generateKey(str + ".deviceMetadata")));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public AmplifyCredential.ASFDevice retrieveASFDevice() {
        return deserializeASFDevice(this.keyValue.get(generateKey(Key_ASFDevice)));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteCredential() {
        this.keyValue.remove(generateKey(Key_Session));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteDeviceKeyCredential(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.keyValue.remove(generateKey(str + ".deviceMetadata"));
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteASFDevice() {
        this.keyValue.remove(generateKey(Key_ASFDevice));
    }

    private final String generateKey(String str) {
        UserPoolConfiguration userPool = this.authConfiguration.getUserPool();
        String str2 = "amplify";
        if (userPool != null) {
            str2 = ((Object) "amplify") + JwtUtilsKt.JWT_DELIMITER + userPool.getPoolId();
        }
        IdentityPoolConfiguration identityPool = this.authConfiguration.getIdentityPool();
        if (identityPool != null) {
            str2 = ((Object) str2) + JwtUtilsKt.JWT_DELIMITER + identityPool.getPoolId();
        }
        return ((Object) str2) + JwtUtilsKt.JWT_DELIMITER + str;
    }

    private final AmplifyCredential deserializeCredential(String str) {
        AmplifyCredential amplifyCredential;
        if (str != null) {
            try {
                Json.Default r0 = Json.Default;
                r0.getSerializersModule();
                Object objDecodeFromString = r0.decodeFromString(AmplifyCredential.Companion.serializer(), str);
                Intrinsics.copydefault(objDecodeFromString, "");
                amplifyCredential = (AmplifyCredential) objDecodeFromString;
            } catch (Exception unused) {
                return AmplifyCredential.Empty.INSTANCE;
            }
        } else {
            amplifyCredential = null;
        }
        return amplifyCredential == null ? AmplifyCredential.Empty.INSTANCE : amplifyCredential;
    }

    private final DeviceMetadata deserializeMetadata(String str) {
        DeviceMetadata deviceMetadata;
        if (str != null) {
            try {
                Json.Default r0 = Json.Default;
                r0.getSerializersModule();
                Object objDecodeFromString = r0.decodeFromString(DeviceMetadata.Companion.serializer(), str);
                Intrinsics.copydefault(objDecodeFromString, "");
                deviceMetadata = (DeviceMetadata) objDecodeFromString;
            } catch (Exception unused) {
                return DeviceMetadata.Empty.INSTANCE;
            }
        } else {
            deviceMetadata = null;
        }
        return deviceMetadata == null ? DeviceMetadata.Empty.INSTANCE : deviceMetadata;
    }

    private final AmplifyCredential.ASFDevice deserializeASFDevice(String str) {
        AmplifyCredential.ASFDevice aSFDevice;
        if (str != null) {
            try {
                Json.Default r1 = Json.Default;
                r1.getSerializersModule();
                Object objDecodeFromString = r1.decodeFromString(AmplifyCredential.ASFDevice.Companion.serializer(), str);
                Intrinsics.copydefault(objDecodeFromString, "");
                aSFDevice = (AmplifyCredential.ASFDevice) objDecodeFromString;
            } catch (Exception unused) {
                return new AmplifyCredential.ASFDevice(null);
            }
        } else {
            aSFDevice = null;
        }
        return aSFDevice == null ? new AmplifyCredential.ASFDevice(null) : aSFDevice;
    }

    private final String serializeCredential(AmplifyCredential amplifyCredential) {
        Json.Default r0 = Json.Default;
        r0.getSerializersModule();
        return r0.encodeToString(AmplifyCredential.Companion.serializer(), amplifyCredential);
    }

    private final String serializeMetaData(DeviceMetadata deviceMetadata) {
        Json.Default r0 = Json.Default;
        r0.getSerializersModule();
        return r0.encodeToString(DeviceMetadata.Companion.serializer(), deviceMetadata);
    }

    private final String serializeASFDevice(AmplifyCredential.ASFDevice aSFDevice) {
        Json.Default r0 = Json.Default;
        r0.getSerializersModule();
        return r0.encodeToString(AmplifyCredential.ASFDevice.Companion.serializer(), aSFDevice);
    }
}
