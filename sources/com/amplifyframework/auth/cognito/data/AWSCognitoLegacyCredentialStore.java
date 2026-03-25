package com.amplifyframework.auth.cognito.data;

import android.content.Context;
import android.content.SharedPreferences;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.cognito.helpers.CodegenExtensionsKt;
import com.amplifyframework.auth.cognito.helpers.SessionHelper;
import com.amplifyframework.core.store.KeyValueRepository;
import com.amplifyframework.statemachine.codegen.data.AWSCredentials;
import com.amplifyframework.statemachine.codegen.data.AmplifyCredential;
import com.amplifyframework.statemachine.codegen.data.AuthConfiguration;
import com.amplifyframework.statemachine.codegen.data.AuthCredentialStore;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import com.amplifyframework.statemachine.codegen.data.DeviceMetadata;
import com.amplifyframework.statemachine.codegen.data.FederatedToken;
import com.amplifyframework.statemachine.codegen.data.IdentityPoolConfiguration;
import com.amplifyframework.statemachine.codegen.data.SignInMethod;
import com.amplifyframework.statemachine.codegen.data.SignedInData;
import com.amplifyframework.statemachine.codegen.data.UserPoolConfiguration;
import com.reown.foundation.util.jwt.JwtUtilsKt;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import o.C56390yDp;
import o.C56392yDr;
import o.C56424yEw;
import o.C56529yIt;
import o.InterfaceC56387yDm;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class AWSCognitoLegacyCredentialStore implements AuthCredentialStore {
    private static final String AK_KEY = "accessKey";
    public static final String APP_DEVICE_INFO_CACHE = "CognitoIdentityProviderDeviceCache";
    private static final String APP_LAST_AUTH_USER = "LastAuthUser";
    private static final String APP_LOCAL_CACHE_KEY_PREFIX = "CognitoIdentityProvider";
    public static final String APP_TOKENS_INFO_CACHE = "CognitoIdentityProviderCache";
    public static final String AWS_KEY_VALUE_STORE_NAMESPACE_IDENTIFIER = "com.amazonaws.android.auth";
    public static final String AWS_MOBILE_CLIENT_PROVIDER = "com.amazonaws.mobile.client";
    public static final Companion Companion = new Companion(null);
    private static final String DEVICE_GROUP_KEY = "DeviceGroupKey";
    private static final String DEVICE_KEY = "DeviceKey";
    private static final String DEVICE_SECRET_KEY = "DeviceSecret";
    private static final String EXP_KEY = "expirationDate";
    private static final String ID_KEY = "identityId";
    private static final String LOCAL_STORAGE_DEVICE_ID_KEY = "CognitoDeviceId";
    public static final String LOCAL_STORAGE_PATH = "AWS.Cognito.ContextData";
    public static final String PROVIDER_KEY = "provider";
    public static final String SIGN_IN_MODE_KEY = "signInMode";
    private static final String SK_KEY = "secretKey";
    private static final String ST_KEY = "sessionToken";
    private static final String TOKEN_EXPIRATION = "tokenExpiration";
    public static final String TOKEN_KEY = "token";
    private static final String TOKEN_TYPE_ACCESS = "accessToken";
    private static final String TOKEN_TYPE_ID = "idToken";
    private static final String TOKEN_TYPE_REFRESH = "refreshToken";
    private final AuthConfiguration authConfiguration;
    private final Context context;
    private KeyValueRepository deviceKeyValue;
    private final InterfaceC56387yDm idAndCredentialsKeyValue$delegate;
    private final KeyValueRepositoryFactory keyValueRepoFactory;
    private final InterfaceC56387yDm mobileClientKeyValue$delegate;
    private final InterfaceC56387yDm tokensKeyValue$delegate;
    private final String userDeviceDetailsCacheKey;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Context getContext() {
        return this.context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveASFDevice(@NotNull AmplifyCredential.ASFDevice aSFDevice) {
        Intrinsics.checkNotNullParameter(aSFDevice, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveCredential(@NotNull AmplifyCredential amplifyCredential) {
        Intrinsics.checkNotNullParameter(amplifyCredential, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void saveDeviceMetadata(@NotNull String str, @NotNull DeviceMetadata deviceMetadata) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deviceMetadata, "");
    }

    public AWSCognitoLegacyCredentialStore(@NotNull Context context, @NotNull AuthConfiguration authConfiguration, @NotNull KeyValueRepositoryFactory keyValueRepositoryFactory) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(authConfiguration, "");
        Intrinsics.checkNotNullParameter(keyValueRepositoryFactory, "");
        this.context = context;
        this.authConfiguration = authConfiguration;
        this.keyValueRepoFactory = keyValueRepositoryFactory;
        UserPoolConfiguration userPool = authConfiguration.getUserPool();
        this.userDeviceDetailsCacheKey = "CognitoIdentityProviderDeviceCache." + (userPool != null ? userPool.getPoolId() : null) + ".%s";
        this.idAndCredentialsKeyValue$delegate = C56392yDr.copydefault(new Function0<KeyValueRepository>() { // from class: com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore$idAndCredentialsKeyValue$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final KeyValueRepository invoke() {
                return KeyValueRepositoryFactory.create$default(this.this$0.keyValueRepoFactory, this.this$0.getContext(), AWSCognitoLegacyCredentialStore.AWS_KEY_VALUE_STORE_NAMESPACE_IDENTIFIER, false, 4, null);
            }
        });
        this.mobileClientKeyValue$delegate = C56392yDr.copydefault(new Function0<KeyValueRepository>() { // from class: com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore$mobileClientKeyValue$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final KeyValueRepository invoke() {
                return KeyValueRepositoryFactory.create$default(this.this$0.keyValueRepoFactory, this.this$0.getContext(), AWSCognitoLegacyCredentialStore.AWS_MOBILE_CLIENT_PROVIDER, false, 4, null);
            }
        });
        this.tokensKeyValue$delegate = C56392yDr.copydefault(new Function0<KeyValueRepository>() { // from class: com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore$tokensKeyValue$2
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            {
                super(0);
            }

            /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final KeyValueRepository invoke() {
                return KeyValueRepositoryFactory.create$default(this.this$0.keyValueRepoFactory, this.this$0.getContext(), AWSCognitoLegacyCredentialStore.APP_TOKENS_INFO_CACHE, false, 4, null);
            }
        });
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0009: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 com.amplifyframework.statemachine.codegen.data.AuthConfiguration)
  (wrap:com.amplifyframework.auth.cognito.data.KeyValueRepositoryFactory:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:com.amplifyframework.auth.cognito.data.KeyValueRepositoryFactory:0x0006: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:38) call: com.amplifyframework.auth.cognito.data.KeyValueRepositoryFactory.<init>():void type: CONSTRUCTOR) : (r3v0 com.amplifyframework.auth.cognito.data.KeyValueRepositoryFactory))
 A[MD:(android.content.Context, com.amplifyframework.statemachine.codegen.data.AuthConfiguration, com.amplifyframework.auth.cognito.data.KeyValueRepositoryFactory):void (m)] (LINE:35) call: com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore.<init>(android.content.Context, com.amplifyframework.statemachine.codegen.data.AuthConfiguration, com.amplifyframework.auth.cognito.data.KeyValueRepositoryFactory):void type: THIS */
    public /* synthetic */ AWSCognitoLegacyCredentialStore(Context context, AuthConfiguration authConfiguration, KeyValueRepositoryFactory keyValueRepositoryFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, authConfiguration, (i & 4) != 0 ? new KeyValueRepositoryFactory() : keyValueRepositoryFactory);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.data.AWSCognitoLegacyCredentialStore.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final KeyValueRepository getIdAndCredentialsKeyValue() {
        return (KeyValueRepository) this.idAndCredentialsKeyValue$delegate.getValue();
    }

    private final KeyValueRepository getMobileClientKeyValue() {
        return (KeyValueRepository) this.mobileClientKeyValue$delegate.getValue();
    }

    private final KeyValueRepository getTokensKeyValue() {
        return (KeyValueRepository) this.tokensKeyValue$delegate.getValue();
    }

    public final String retrieveLastAuthUserId() {
        String str;
        synchronized (this) {
            String str2 = getTokenKeys().get(APP_LAST_AUTH_USER);
            str = str2 != null ? getTokensKeyValue().get(str2) : null;
        }
        return str;
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public AmplifyCredential retrieveCredential() {
        AmplifyCredential userPool;
        synchronized (this) {
            SignedInData signedInDataRetrieveSignedInData = retrieveSignedInData();
            AWSCredentials aWSCredentialsRetrieveAWSCredentials = retrieveAWSCredentials();
            String strRetrieveIdentityId = retrieveIdentityId();
            if (aWSCredentialsRetrieveAWSCredentials != null && strRetrieveIdentityId != null) {
                FederatedToken federatedTokenRetrieveFederateToIdentityPoolToken = retrieveFederateToIdentityPoolToken();
                if (signedInDataRetrieveSignedInData != null) {
                    userPool = new AmplifyCredential.UserAndIdentityPool(signedInDataRetrieveSignedInData, strRetrieveIdentityId, aWSCredentialsRetrieveAWSCredentials);
                } else if (federatedTokenRetrieveFederateToIdentityPoolToken != null) {
                    userPool = new AmplifyCredential.IdentityPoolFederated(federatedTokenRetrieveFederateToIdentityPoolToken, strRetrieveIdentityId, aWSCredentialsRetrieveAWSCredentials);
                } else {
                    userPool = new AmplifyCredential.IdentityPool(strRetrieveIdentityId, aWSCredentialsRetrieveAWSCredentials);
                }
            } else if (signedInDataRetrieveSignedInData != null) {
                userPool = new AmplifyCredential.UserPool(signedInDataRetrieveSignedInData);
            } else {
                userPool = AmplifyCredential.Empty.INSTANCE;
            }
        }
        return userPool;
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public AmplifyCredential.ASFDevice retrieveASFDevice() {
        AmplifyCredential.ASFDevice aSFDevice;
        synchronized (this) {
            SharedPreferences sharedPreferences = this.context.getSharedPreferences(LOCAL_STORAGE_PATH, 0);
            aSFDevice = new AmplifyCredential.ASFDevice(sharedPreferences != null ? sharedPreferences.getString(LOCAL_STORAGE_DEVICE_ID_KEY, null) : null);
        }
        return aSFDevice;
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteCredential() {
        deleteAWSCredentials();
        deleteIdentityId();
        deleteCognitoUserPoolTokens();
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteDeviceKeyCredential(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        String str2 = getTokenKeys().get(APP_LAST_AUTH_USER);
        if (str2 != null) {
            getTokensKeyValue().remove(str2);
        }
        KeyValueRepository keyValueRepository = this.deviceKeyValue;
        if (keyValueRepository == null) {
            Intrinsics.gEmmrt("");
            keyValueRepository = null;
        }
        keyValueRepository.remove(DEVICE_KEY);
        keyValueRepository.remove(DEVICE_GROUP_KEY);
        keyValueRepository.remove(DEVICE_SECRET_KEY);
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public void deleteASFDevice() {
        this.context.getSharedPreferences(LOCAL_STORAGE_PATH, 0).edit().remove(LOCAL_STORAGE_DEVICE_ID_KEY).apply();
    }

    private final void deleteCognitoUserPoolTokens() {
        Map<String, String> tokenKeys = getTokenKeys();
        String str = tokenKeys.get(TOKEN_TYPE_ID);
        if (str != null) {
            getTokensKeyValue().remove(str);
        }
        String str2 = tokenKeys.get(TOKEN_TYPE_ACCESS);
        if (str2 != null) {
            getTokensKeyValue().remove(str2);
        }
        String str3 = tokenKeys.get(TOKEN_TYPE_REFRESH);
        if (str3 != null) {
            getTokensKeyValue().remove(str3);
        }
        String str4 = tokenKeys.get(TOKEN_EXPIRATION);
        if (str4 != null) {
            getTokensKeyValue().remove(str4);
        }
    }

    private final void deleteIdentityId() {
        getIdAndCredentialsKeyValue().remove(namespace(ID_KEY));
    }

    private final void deleteAWSCredentials() {
        KeyValueRepository idAndCredentialsKeyValue = getIdAndCredentialsKeyValue();
        idAndCredentialsKeyValue.remove(namespace(AK_KEY));
        idAndCredentialsKeyValue.remove(namespace(SK_KEY));
        idAndCredentialsKeyValue.remove(namespace(ST_KEY));
        idAndCredentialsKeyValue.remove(namespace(EXP_KEY));
    }

    private final AWSCredentials retrieveAWSCredentials() {
        String str = getIdAndCredentialsKeyValue().get(namespace(AK_KEY));
        String str2 = getIdAndCredentialsKeyValue().get(namespace(SK_KEY));
        String str3 = getIdAndCredentialsKeyValue().get(namespace(ST_KEY));
        String str4 = getIdAndCredentialsKeyValue().get(namespace(EXP_KEY));
        Long fieldNames = str4 != null ? StringsKt__StringNumberConversionsKt.getFieldNames(str4) : null;
        if (str == null && str2 == null && str3 == null) {
            return null;
        }
        return new AWSCredentials(str, str2, str3, fieldNames);
    }

    private final String retrieveIdentityId() {
        return getIdAndCredentialsKeyValue().get(namespace(ID_KEY));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final SignedInData retrieveSignedInData() {
        SignInMethod signInMethodRetrieveUserPoolSignInMethod;
        String str;
        String str2;
        String accessToken;
        CognitoUserPoolTokens cognitoUserPoolTokensRetrieveCognitoUserPoolTokens = retrieveCognitoUserPoolTokens(getTokenKeys());
        if (cognitoUserPoolTokensRetrieveCognitoUserPoolTokens == null || (signInMethodRetrieveUserPoolSignInMethod = retrieveUserPoolSignInMethod()) == null) {
            return null;
        }
        try {
            String accessToken2 = cognitoUserPoolTokensRetrieveCognitoUserPoolTokens.getAccessToken();
            if (accessToken2 != null) {
                String userSub = SessionHelper.INSTANCE.getUserSub(accessToken2);
                if (userSub == null) {
                    userSub = "";
                }
                str = userSub;
            }
        } catch (Exception unused) {
            str = "";
        }
        try {
            accessToken = cognitoUserPoolTokensRetrieveCognitoUserPoolTokens.getAccessToken();
        } catch (Exception unused2) {
        }
        if (accessToken != null) {
            String username = SessionHelper.INSTANCE.getUsername(accessToken);
            str2 = username == null ? "" : username;
        }
        return new SignedInData(str, str2, new Date(0L), signInMethodRetrieveUserPoolSignInMethod, cognitoUserPoolTokensRetrieveCognitoUserPoolTokens);
    }

    @Override // com.amplifyframework.statemachine.codegen.data.AuthCredentialStore
    public DeviceMetadata retrieveDeviceMetadata(@NotNull String str) {
        DeviceMetadata metadata;
        synchronized (this) {
            Intrinsics.checkNotNullParameter(str, "");
            C56529yIt c56529yIt = C56529yIt.KWHzl;
            String str2 = String.format(this.userDeviceDetailsCacheKey, Arrays.copyOf(new Object[]{str}, 1));
            Intrinsics.checkNotNullExpressionValue(str2, "");
            KeyValueRepository keyValueRepositoryCreate$default = KeyValueRepositoryFactory.create$default(this.keyValueRepoFactory, this.context, str2, false, 4, null);
            this.deviceKeyValue = keyValueRepositoryCreate$default;
            KeyValueRepository keyValueRepository = null;
            if (keyValueRepositoryCreate$default == null) {
                Intrinsics.gEmmrt("");
                keyValueRepositoryCreate$default = null;
            }
            String str3 = keyValueRepositoryCreate$default.get(DEVICE_KEY);
            KeyValueRepository keyValueRepository2 = this.deviceKeyValue;
            if (keyValueRepository2 == null) {
                Intrinsics.gEmmrt("");
                keyValueRepository2 = null;
            }
            String str4 = keyValueRepository2.get(DEVICE_GROUP_KEY);
            KeyValueRepository keyValueRepository3 = this.deviceKeyValue;
            if (keyValueRepository3 == null) {
                Intrinsics.gEmmrt("");
            } else {
                keyValueRepository = keyValueRepository3;
            }
            String str5 = keyValueRepository.get(DEVICE_SECRET_KEY);
            if ((str3 == null || str3.length() == 0) && (str4 == null || str4.length() == 0)) {
                metadata = DeviceMetadata.Empty.INSTANCE;
            } else {
                if (str3 == null) {
                    str3 = "";
                }
                if (str4 == null) {
                    str4 = "";
                }
                metadata = new DeviceMetadata.Metadata(str3, str4, str5);
            }
        }
        return metadata;
    }

    private final CognitoUserPoolTokens retrieveCognitoUserPoolTokens(Map<String, String> map) {
        String str;
        String str2 = map.get(TOKEN_TYPE_ID);
        String str3 = str2 != null ? getTokensKeyValue().get(str2) : null;
        String str4 = map.get(TOKEN_TYPE_ACCESS);
        String str5 = str4 != null ? getTokensKeyValue().get(str4) : null;
        String str6 = map.get(TOKEN_TYPE_REFRESH);
        String str7 = str6 != null ? getTokensKeyValue().get(str6) : null;
        String str8 = map.get(TOKEN_EXPIRATION);
        Long fieldNames = (str8 == null || (str = getTokensKeyValue().get(str8)) == null) ? null : StringsKt__StringNumberConversionsKt.getFieldNames(str);
        if (str3 == null && str5 == null && str7 == null) {
            return null;
        }
        return new CognitoUserPoolTokens(str3, str5, str7, fieldNames);
    }

    private final Map<String, String> getTokenKeys() {
        UserPoolConfiguration userPool = this.authConfiguration.getUserPool();
        String appClient = userPool != null ? userPool.getAppClient() : null;
        C56529yIt c56529yIt = C56529yIt.KWHzl;
        Locale locale = Locale.US;
        String str = String.format(locale, "%s.%s.%s", Arrays.copyOf(new Object[]{APP_LOCAL_CACHE_KEY_PREFIX, appClient, APP_LAST_AUTH_USER}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "");
        String str2 = getTokensKeyValue().get(str);
        String str3 = String.format(locale, "%s.%s.%s.%s", Arrays.copyOf(new Object[]{APP_LOCAL_CACHE_KEY_PREFIX, appClient, str2, TOKEN_TYPE_ID}, 4));
        Intrinsics.checkNotNullExpressionValue(str3, "");
        String str4 = String.format(locale, "%s.%s.%s.%s", Arrays.copyOf(new Object[]{APP_LOCAL_CACHE_KEY_PREFIX, appClient, str2, TOKEN_TYPE_ACCESS}, 4));
        Intrinsics.checkNotNullExpressionValue(str4, "");
        String str5 = String.format(locale, "%s.%s.%s.%s", Arrays.copyOf(new Object[]{APP_LOCAL_CACHE_KEY_PREFIX, appClient, str2, TOKEN_TYPE_REFRESH}, 4));
        Intrinsics.checkNotNullExpressionValue(str5, "");
        String str6 = String.format(locale, "%s.%s.%s.%s", Arrays.copyOf(new Object[]{APP_LOCAL_CACHE_KEY_PREFIX, appClient, str2, TOKEN_EXPIRATION}, 4));
        Intrinsics.checkNotNullExpressionValue(str6, "");
        return C56424yEw.gEmmrt(C56390yDp.OLrzqt(APP_LAST_AUTH_USER, str), C56390yDp.OLrzqt(TOKEN_TYPE_ID, str3), C56390yDp.OLrzqt(TOKEN_TYPE_ACCESS, str4), C56390yDp.OLrzqt(TOKEN_TYPE_REFRESH, str5), C56390yDp.OLrzqt(TOKEN_EXPIRATION, str6));
    }

    private final String namespace(String str) {
        return getIdentityPoolId() + JwtUtilsKt.JWT_DELIMITER + str;
    }

    private final String getIdentityPoolId() {
        IdentityPoolConfiguration identityPool = this.authConfiguration.getIdentityPool();
        if (identityPool != null) {
            return identityPool.getPoolId();
        }
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final SignInMethod retrieveUserPoolSignInMethod() {
        String str = getMobileClientKeyValue().get(SIGN_IN_MODE_KEY);
        if (str != null) {
            String str2 = null;
            byte b = 0;
            switch (str.hashCode()) {
                case 49:
                    if (str.equals("1")) {
                        if (retrieveFederateToIdentityPoolToken() != null) {
                            return null;
                        }
                        return new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.UNKNOWN);
                    }
                    break;
                case 50:
                    if (str.equals("2")) {
                        return new SignInMethod.HostedUI(str2, 1, (DefaultConstructorMarker) (b == true ? 1 : 0));
                    }
                    break;
                case 51:
                    if (str.equals("3")) {
                        return null;
                    }
                    break;
            }
        }
        return new SignInMethod.ApiBased(SignInMethod.ApiBased.AuthType.USER_SRP_AUTH);
    }

    private final FederatedToken retrieveFederateToIdentityPoolToken() {
        String str;
        String str2 = getMobileClientKeyValue().get(PROVIDER_KEY);
        if (str2 == null || (str = getMobileClientKeyValue().get("token")) == null) {
            return null;
        }
        AuthProvider authProviderAmazon = AuthProvider.amazon();
        Intrinsics.checkNotNullExpressionValue(authProviderAmazon, "");
        String identityProviderName = CodegenExtensionsKt.getIdentityProviderName(authProviderAmazon);
        AuthProvider authProviderFacebook = AuthProvider.facebook();
        Intrinsics.checkNotNullExpressionValue(authProviderFacebook, "");
        String identityProviderName2 = CodegenExtensionsKt.getIdentityProviderName(authProviderFacebook);
        AuthProvider authProviderApple = AuthProvider.apple();
        Intrinsics.checkNotNullExpressionValue(authProviderApple, "");
        String identityProviderName3 = CodegenExtensionsKt.getIdentityProviderName(authProviderApple);
        AuthProvider authProviderGoogle = AuthProvider.google();
        Intrinsics.checkNotNullExpressionValue(authProviderGoogle, "");
        if (yDY.gEmmrt(identityProviderName, identityProviderName2, identityProviderName3, CodegenExtensionsKt.getIdentityProviderName(authProviderGoogle)).contains(str2)) {
            return new FederatedToken(str2, str);
        }
        return null;
    }
}
