package o;

import aws.sdk.kotlin.runtime.config.AwsSdkSetting$AwsEndpointUrl$1;
import aws.sdk.kotlin.runtime.config.endpoints.AccountIdEndpointMode;
import aws.smithy.kotlin.runtime.ClientException;
import aws.smithy.kotlin.runtime.client.config.RetryMode;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C59449zhJ;
import o.yDV;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class IOException {
    public static final IOException zsXlph = new IOException();
    public static final C59492zi<java.lang.String> copydefault = C59333zf.OLrzqt().invoke("aws.accessKeyId", "AWS_ACCESS_KEY_ID");
    public static final C59492zi<java.lang.String> getFieldNames = C59333zf.OLrzqt().invoke("aws.secretAccessKey", "AWS_SECRET_ACCESS_KEY");
    public static final C59492zi<java.lang.String> hDKMBd = C59333zf.OLrzqt().invoke("aws.sessionToken", "AWS_SESSION_TOKEN");
    public static final C59492zi<java.lang.String> fARcdN = C59333zf.OLrzqt().invoke("aws.region", "AWS_REGION");
    public static final C59492zi<java.lang.String> EZpvd = C59333zf.OLrzqt().invoke("aws.accountId", "AWS_ACCOUNT_ID");
    public static final C59492zi<java.lang.String> AEQbTJ = C59333zf.OLrzqt().invoke("aws.userAgentAppId", "AWS_SDK_UA_APP_ID");
    public static final C59492zi<java.lang.String> KWHzl = C59333zf.OLrzqt().invoke("aws.configFile", "AWS_CONFIG_FILE");
    public static final C59492zi<java.lang.String> AubY = C59333zf.OLrzqt().invoke("aws.sharedCredentialsFile", "AWS_SHARED_CREDENTIALS_FILE");
    public static final C59492zi<java.lang.String> isConnected = C59333zf.OLrzqt().invoke("aws.executionEnvironment", "AWS_EXECUTION_ENV");
    public static final C59492zi<java.lang.String> fJNWhG = C59333zf.OLrzqt().invoke("aws.profile", "AWS_PROFILE").EZpvd("default");
    public static final C59492zi<java.lang.Boolean> AkhnZx = C59333zf.AEQbTJ().invoke("aws.disableEc2Metadata", "AWS_EC2_METADATA_DISABLED").EZpvd(java.lang.Boolean.FALSE);
    public static final C59492zi<java.lang.String> fetchVPNInfo = C59333zf.OLrzqt().invoke("aws.ec2MetadataServiceEndpoint", "AWS_EC2_METADATA_SERVICE_ENDPOINT");
    public static final C59492zi<java.lang.String> DbNXlk = C59333zf.OLrzqt().invoke("aws.ec2MetadataServiceEndpointMode", "AWS_EC2_METADATA_SERVICE_ENDPOINT_MODE");
    public static final C59492zi<java.lang.String> uzCIH = C59333zf.OLrzqt().invoke("aws.roleArn", "AWS_ROLE_ARN");
    public static final C59492zi<java.lang.String> getNewProxyInstance = C59333zf.OLrzqt().invoke("aws.roleSessionName", "AWS_ROLE_SESSION_NAME");
    public static final C59492zi<java.lang.String> AuCTelauCTel = C59333zf.OLrzqt().invoke("aws.webIdentityTokenFile", "AWS_WEB_IDENTITY_TOKEN_FILE");
    public static final C59492zi<java.lang.String> valueOf = C59333zf.OLrzqt().invoke("aws.containerCredentialsPath", "AWS_CONTAINER_CREDENTIALS_RELATIVE_URI");
    public static final C59492zi<java.lang.String> AYXKKw = C59333zf.OLrzqt().invoke("aws.containerCredentialsFullUri", "AWS_CONTAINER_CREDENTIALS_FULL_URI");
    public static final C59492zi<java.lang.String> gEmmrt = C59333zf.OLrzqt().invoke("aws.containerAuthorizationToken", "AWS_CONTAINER_AUTHORIZATION_TOKEN");
    public static final C59492zi<java.lang.String> AhwBna = C59333zf.OLrzqt().invoke("aws.containerAuthorizationTokenFile", "AWS_CONTAINER_AUTHORIZATION_TOKEN_FILE");
    public static final C59492zi<java.lang.Integer> AuCTel = C59333zf.copydefault().invoke("aws.maxAttempts", "AWS_MAX_ATTEMPTS");
    public static final C59492zi<RetryMode> iwGUEr = new C59492zi<>(new Function1<java.lang.String, RetryMode>() { // from class: aws.sdk.kotlin.runtime.config.AwsSdkSetting$special$$inlined$enumEnvSetting$1
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final RetryMode invoke(@NotNull String str) {
            RetryMode retryMode;
            Intrinsics.checkNotNullParameter(str, "");
            RetryMode[] retryModeArrValues = RetryMode.values();
            int length = retryModeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    retryMode = null;
                    break;
                }
                retryMode = retryModeArrValues[i];
                if (C59449zhJ.gEmmrt(retryMode.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (retryMode != null) {
                return retryMode;
            }
            throw new ClientException("Value " + str + " is not supported, should be one of " + yDV.joinToString$default(retryModeArrValues, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        }
    }, "aws.retryMode", "AWS_RETRY_MODE", null, 8, null);
    public static final C59492zi<java.lang.Boolean> wlaJM = C59333zf.AEQbTJ().invoke("aws.useFipsEndpoint", "AWS_USE_FIPS_ENDPOINT");
    public static final C59492zi<java.lang.Boolean> zLjUOn = C59333zf.AEQbTJ().invoke("aws.useDualstackEndpoint", "AWS_USE_DUALSTACK_ENDPOINT");
    public static final C59492zi<DL> values = (C59492zi) C59492zi.AEQbTJ.copydefault(new AwsSdkSetting$AwsEndpointUrl$1(DL.AEQbTJ)).invoke("aws.endpointUrl", "AWS_ENDPOINT_URL");
    public static final C59492zi<java.lang.Boolean> ejfBZ = C59333zf.AEQbTJ().invoke("aws.ignoreConfiguredEndpointUrls", "AWS_IGNORE_CONFIGURED_ENDPOINT_URLS");
    public static final C59492zi<AccountIdEndpointMode> OLrzqt = new C59492zi<>(new Function1<java.lang.String, AccountIdEndpointMode>() { // from class: aws.sdk.kotlin.runtime.config.AwsSdkSetting$special$$inlined$enumEnvSetting$2
        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // kotlin.jvm.functions.Function1
        public final AccountIdEndpointMode invoke(@NotNull String str) {
            AccountIdEndpointMode accountIdEndpointMode;
            Intrinsics.checkNotNullParameter(str, "");
            AccountIdEndpointMode[] accountIdEndpointModeArrValues = AccountIdEndpointMode.values();
            int length = accountIdEndpointModeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    accountIdEndpointMode = null;
                    break;
                }
                accountIdEndpointMode = accountIdEndpointModeArrValues[i];
                if (C59449zhJ.gEmmrt(accountIdEndpointMode.name(), str, true)) {
                    break;
                }
                i++;
            }
            if (accountIdEndpointMode != null) {
                return accountIdEndpointMode;
            }
            throw new ClientException("Value " + str + " is not supported, should be one of " + yDV.joinToString$default(accountIdEndpointModeArrValues, ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null));
        }
    }, "aws.accountIdEndpointMode", "AWS_ACCOUNT_ID_ENDPOINT_MODE", null, 8, null);
    public static final C59492zi<java.lang.Boolean> djBIcL = C59333zf.AEQbTJ().invoke("aws.disableRequestCompression", "AWS_DISABLE_REQUEST_COMPRESSION");
    public static final C59492zi<java.lang.Long> fIwbmz = C59333zf.EZpvd().invoke("aws.requestMinCompressionSizeBytes", "AWS_REQUEST_MIN_COMPRESSION_SIZE_BYTES");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> AEQbTJ() {
        return KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> AYXKKw() {
        return AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> AhwBna() {
        return gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> AkhnZx() {
        return fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.Integer> AuCTel() {
        return AuCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> AuCTelauCTel() {
        return AuCTelauCTel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.Boolean> AubY() {
        return zLjUOn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.Boolean> DbNXlk() {
        return ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> EZpvd() {
        return AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<AccountIdEndpointMode> KWHzl() {
        return OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> OLrzqt() {
        return copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> copydefault() {
        return EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.Boolean> djBIcL() {
        return djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> ejfBZ() {
        return fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> fARcdN() {
        return fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<RetryMode> fIwbmz() {
        return iwGUEr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.Long> fJNWhG() {
        return fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.Boolean> fetchVPNInfo() {
        return AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> gEmmrt() {
        return AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> getFieldNames() {
        return getNewProxyInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> getNewProxyInstance() {
        return hDKMBd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> hDKMBd() {
        return getFieldNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<DL> isConnected() {
        return values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> iwGUEr() {
        return uzCIH;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> uzCIH() {
        return AubY;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> valueOf() {
        return valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.String> values() {
        return DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final C59492zi<java.lang.Boolean> zsXlph() {
        return wlaJM;
    }

    private IOException() {
    }
}
