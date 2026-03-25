package com.amplifyframework.auth.plugins.core;

import android.content.Context;
import aws.sdk.kotlin.services.cognitoidentity.model.NotAuthorizedException;
import com.amplifyframework.auth.AWSCredentials;
import com.amplifyframework.auth.AuthException;
import com.amplifyframework.auth.exceptions.SignedOutException;
import com.amplifyframework.auth.exceptions.UnknownException;
import com.amplifyframework.auth.plugins.core.data.AWSCognitoIdentityPoolConfiguration;
import com.amplifyframework.auth.plugins.core.data.AWSCredentialsInternal;
import com.amplifyframework.auth.plugins.core.data.AuthCredentialStore;
import com.amplifyframework.auth.result.AuthSessionResult;
import com.amplifyframework.core.Amplify;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.logging.LoggingCategory;
import com.amplitude.analytics.BuildConfig;
import j$.time.Instant;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.Json;
import o.C5173Hn;
import o.C56390yDp;
import o.C56391yDq;
import o.C56403yEb;
import o.C56423yEv;
import o.C56442yFn;
import o.C56443yFo;
import o.C56548yJl;
import o.C59454zhO;
import o.Character;
import o.Enum;
import o.IllegalAccessError;
import o.IllegalArgumentException;
import o.IllegalMonitorStateException;
import o.IllegalThreadStateException;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class AWSCognitoIdentityPoolOperations {
    public static final Companion Companion = new Companion(null);
    public static final String OIDC_PLUGIN_LOG_NAMESPACE = "amplify:oidc-plugin:%s";
    private final String KEY_AWS_CREDENTIALS;
    private final String KEY_IDENTITY_ID;
    private final String KEY_LOGINS_PROVIDER;
    private final AuthCredentialStore awsAuthCredentialStore;
    private final Character cognitoIdentityClient;
    private final AWSCognitoIdentityPoolConfiguration identityPool;
    private final Logger logger;
    private final String pluginKeySanitized;
    private final String pluginVersionSanitized;
    private final Regex semVerRegex;

    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[AuthSessionResult.Type.values().length];
            try {
                iArr[AuthSessionResult.Type.FAILURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AuthSessionResult.Type.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations$fetchAWSCognitoIdentityPoolDetails$1, reason: invalid class name */
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
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
            return AWSCognitoIdentityPoolOperations.this.fetchAWSCognitoIdentityPoolDetails(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations$getAWSCredentials$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16681 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C16681(Continuation<? super C16681> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSCognitoIdentityPoolOperations.this.getAWSCredentials(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations$getIdentityId$1, reason: invalid class name and case insensitive filesystem */
    public static final class C16691 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public C16691(Continuation<? super C16691> continuation) {
            super(continuation);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AWSCognitoIdentityPoolOperations.this.getIdentityId(null, this);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Character getCognitoIdentityClient() {
        return this.cognitoIdentityClient;
    }

    public AWSCognitoIdentityPoolOperations(@NotNull Context context, @NotNull AWSCognitoIdentityPoolConfiguration aWSCognitoIdentityPoolConfiguration, @NotNull String str, @NotNull String str2) throws IOException {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aWSCognitoIdentityPoolConfiguration, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.identityPool = aWSCognitoIdentityPoolConfiguration;
        LoggingCategory loggingCategory = Amplify.Logging;
        String str3 = String.format(OIDC_PLUGIN_LOG_NAMESPACE, Arrays.copyOf(new Object[]{AWSCognitoIdentityPoolOperations.class.getSimpleName()}, 1));
        Intrinsics.checkNotNullExpressionValue(str3, "");
        Logger loggerForNamespace = loggingCategory.forNamespace(str3);
        Intrinsics.checkNotNullExpressionValue(loggerForNamespace, "");
        this.logger = loggerForNamespace;
        this.semVerRegex = new Regex("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)?$");
        String strAkhnZx = C59454zhO.AkhnZx(str, 25);
        StringBuilder sb = new StringBuilder();
        int length = strAkhnZx.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strAkhnZx.charAt(i);
            if (Character.isLetterOrDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        this.pluginKeySanitized = string;
        String strAkhnZx2 = C59454zhO.AkhnZx(str2, 10);
        this.logger.warn("Plugin version does not match semantic versioning rules, version set to 1.0.0");
        strAkhnZx2 = this.semVerRegex.matches(strAkhnZx2) ? strAkhnZx2 : null;
        strAkhnZx2 = strAkhnZx2 == null ? BuildConfig.VERSION_NAME : strAkhnZx2;
        this.pluginVersionSanitized = strAkhnZx2;
        this.KEY_LOGINS_PROVIDER = "amplify." + this.identityPool.getPoolId() + ".session.loginsProvider";
        this.KEY_IDENTITY_ID = "amplify." + this.identityPool.getPoolId() + ".session.identityId";
        this.KEY_AWS_CREDENTIALS = "amplify." + this.identityPool.getPoolId() + ".session.credential";
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        this.awsAuthCredentialStore = new AuthCredentialStore(applicationContext, string, true);
        this.cognitoIdentityClient = CognitoClientFactory.INSTANCE.createIdentityClient(this.identityPool, string, strAkhnZx2);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 com.amplifyframework.auth.plugins.core.data.AWSCognitoIdentityPoolConfiguration)
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.String:0x0004: SGET  A[WRAPPED] com.amplitude.analytics.BuildConfig.VERSION_NAME java.lang.String) : (r4v0 java.lang.String))
 A[MD:(android.content.Context, com.amplifyframework.auth.plugins.core.data.AWSCognitoIdentityPoolConfiguration, java.lang.String, java.lang.String):void throws java.io.IOException (m)] (LINE:49) call: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations.<init>(android.content.Context, com.amplifyframework.auth.plugins.core.data.AWSCognitoIdentityPoolConfiguration, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ AWSCognitoIdentityPoolOperations(Context context, AWSCognitoIdentityPoolConfiguration aWSCognitoIdentityPoolConfiguration, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, aWSCognitoIdentityPoolConfiguration, str, (i & 8) != 0 ? BuildConfig.VERSION_NAME : str2);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final boolean isValidSession(AWSCredentialsInternal aWSCredentialsInternal) {
        Instant instantNow = Instant.now();
        Long expiration = aWSCredentialsInternal.getExpiration();
        boolean z = instantNow.compareTo(expiration != null ? Instant.ofEpochSecond(expiration.longValue()) : null) < 0;
        this.logger.verbose("fetchAWSCognitoIdentityPoolDetails: is AWS session valid? " + z);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getIdentityId(List<LoginProvider> list, Continuation<? super String> continuation) throws Throwable {
        C16691 c16691;
        NotAuthorizedException notAuthorizedException;
        AWSCognitoIdentityPoolOperations aWSCognitoIdentityPoolOperations;
        if (continuation instanceof C16691) {
            c16691 = (C16691) continuation;
            int i = c16691.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16691.label = i - Integer.MIN_VALUE;
            } else {
                c16691 = new C16691(continuation);
            }
        }
        Object objAEQbTJ = c16691.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c16691.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aWSCognitoIdentityPoolOperations = (AWSCognitoIdentityPoolOperations) c16691.L$0;
                try {
                    C56391yDq.AEQbTJ(objAEQbTJ);
                } catch (NotAuthorizedException e) {
                    notAuthorizedException = e;
                    aWSCognitoIdentityPoolOperations.logger.verbose("getIdentityId: guest access disabled");
                    throw new com.amplifyframework.auth.exceptions.NotAuthorizedException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED, notAuthorizedException, 1, null);
                }
            } else {
                C56391yDq.AEQbTJ(objAEQbTJ);
                try {
                    final LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
                    for (LoginProvider loginProvider : list) {
                        Pair pairOLrzqt = C56390yDp.OLrzqt(loginProvider.getName(), loginProvider.getUserIdentifier());
                        linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                    }
                    IllegalAccessError illegalAccessErrorAEQbTJ = IllegalAccessError.KWHzl.AEQbTJ(new Function1<IllegalAccessError.Activity, Unit>() { // from class: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations$getIdentityId$request$1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IllegalAccessError.Activity activity) {
                            invoke2(activity);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IllegalAccessError.Activity activity) {
                            Intrinsics.checkNotNullParameter(activity, "");
                            activity.KWHzl(this.this$0.identityPool.getPoolId());
                            activity.copydefault(linkedHashMap);
                        }
                    });
                    Character character = this.cognitoIdentityClient;
                    c16691.L$0 = this;
                    c16691.label = 1;
                    objAEQbTJ = character.AEQbTJ(illegalAccessErrorAEQbTJ, c16691);
                    if (objAEQbTJ == objCopydefault) {
                        return objCopydefault;
                    }
                    aWSCognitoIdentityPoolOperations = this;
                } catch (NotAuthorizedException e2) {
                    notAuthorizedException = e2;
                    aWSCognitoIdentityPoolOperations = this;
                    aWSCognitoIdentityPoolOperations.logger.verbose("getIdentityId: guest access disabled");
                    throw new com.amplifyframework.auth.exceptions.NotAuthorizedException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED, notAuthorizedException, 1, null);
                }
            }
            aWSCognitoIdentityPoolOperations.logger.verbose("getIdentityId: fetched identity id");
            String strCopydefault = ((IllegalThreadStateException) objAEQbTJ).copydefault();
            if (strCopydefault != null) {
                return strCopydefault;
            }
            throw new Exception("Fetching identity id failed.");
        } catch (Exception e3) {
            throw new SignedOutException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_POSSIBLE, e3, 1, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getAWSCredentials(final String str, List<LoginProvider> list, Continuation<? super Pair<String, AWSCredentialsInternal>> continuation) throws Throwable {
        C16681 c16681;
        NotAuthorizedException notAuthorizedException;
        AWSCognitoIdentityPoolOperations aWSCognitoIdentityPoolOperations;
        if (continuation instanceof C16681) {
            c16681 = (C16681) continuation;
            int i = c16681.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c16681.label = i - Integer.MIN_VALUE;
            } else {
                c16681 = new C16681(continuation);
            }
        }
        Object objEZpvd = c16681.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i2 = c16681.label;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aWSCognitoIdentityPoolOperations = (AWSCognitoIdentityPoolOperations) c16681.L$0;
                try {
                    C56391yDq.AEQbTJ(objEZpvd);
                } catch (NotAuthorizedException e) {
                    notAuthorizedException = e;
                    aWSCognitoIdentityPoolOperations.logger.verbose("getIdentityId: guest access disabled");
                    throw new com.amplifyframework.auth.exceptions.NotAuthorizedException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED, notAuthorizedException, 1, null);
                }
            } else {
                C56391yDq.AEQbTJ(objEZpvd);
                try {
                    final LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(C56403yEb.AYXKKw(list, 10)), 16));
                    for (LoginProvider loginProvider : list) {
                        Pair pairOLrzqt = C56390yDp.OLrzqt(loginProvider.getName(), loginProvider.getUserIdentifier());
                        linkedHashMap.put(pairOLrzqt.getFirst(), pairOLrzqt.getSecond());
                    }
                    IllegalMonitorStateException illegalMonitorStateExceptionCopydefault = IllegalMonitorStateException.copydefault.copydefault(new Function1<IllegalMonitorStateException.Application, Unit>() { // from class: com.amplifyframework.auth.plugins.core.AWSCognitoIdentityPoolOperations$getAWSCredentials$request$1
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(IllegalMonitorStateException.Application application) {
                            invoke2(application);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull IllegalMonitorStateException.Application application) {
                            Intrinsics.checkNotNullParameter(application, "");
                            application.OLrzqt(str);
                            application.AEQbTJ(linkedHashMap);
                        }
                    });
                    Character character = this.cognitoIdentityClient;
                    c16681.L$0 = this;
                    c16681.label = 1;
                    objEZpvd = character.EZpvd(illegalMonitorStateExceptionCopydefault, c16681);
                    if (objEZpvd == objCopydefault) {
                        return objCopydefault;
                    }
                    aWSCognitoIdentityPoolOperations = this;
                } catch (NotAuthorizedException e2) {
                    notAuthorizedException = e2;
                    aWSCognitoIdentityPoolOperations = this;
                    aWSCognitoIdentityPoolOperations.logger.verbose("getIdentityId: guest access disabled");
                    throw new com.amplifyframework.auth.exceptions.NotAuthorizedException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_DISABLED, notAuthorizedException, 1, null);
                }
            }
            IllegalArgumentException illegalArgumentException = (IllegalArgumentException) objEZpvd;
            aWSCognitoIdentityPoolOperations.logger.verbose("getAWSCredentials: fetched AWS credentials");
            Enum enumAEQbTJ = illegalArgumentException.AEQbTJ();
            if (enumAEQbTJ != null) {
                String strCopydefault = illegalArgumentException.copydefault();
                String strAEQbTJ = enumAEQbTJ.AEQbTJ();
                String strKWHzl = enumAEQbTJ.KWHzl();
                String strCopydefault2 = enumAEQbTJ.copydefault();
                C5173Hn c5173HnEZpvd = enumAEQbTJ.EZpvd();
                Pair pairOLrzqt2 = C56390yDp.OLrzqt(strCopydefault, new AWSCredentialsInternal(strAEQbTJ, strKWHzl, strCopydefault2, c5173HnEZpvd != null ? C56443yFo.KWHzl(c5173HnEZpvd.KWHzl()) : null));
                if (pairOLrzqt2 != null) {
                    return pairOLrzqt2;
                }
            }
            throw new Exception("Fetching AWS credentials failed.");
        } catch (Exception e3) {
            throw new SignedOutException(null, SignedOutException.RECOVERY_SUGGESTION_GUEST_ACCESS_POSSIBLE, e3, 1, null);
        }
    }

    private final AuthSessionResult<AWSCredentials> getCredentialsResult(AWSCredentialsInternal aWSCredentialsInternal) {
        AWSCredentials aWSCredentialsCreateAWSCredentials = AWSCredentials.Factory.createAWSCredentials(aWSCredentialsInternal.getAccessKeyId(), aWSCredentialsInternal.getSecretAccessKey(), aWSCredentialsInternal.getSessionToken(), aWSCredentialsInternal.getExpiration());
        AuthSessionResult<AWSCredentials> authSessionResultSuccess = aWSCredentialsCreateAWSCredentials != null ? AuthSessionResult.success(aWSCredentialsCreateAWSCredentials) : null;
        if (authSessionResultSuccess != null) {
            return authSessionResultSuccess;
        }
        AuthSessionResult<AWSCredentials> authSessionResultFailure = AuthSessionResult.failure(new UnknownException("Failed to fetch AWS credentials.", null, 2, null));
        Intrinsics.checkNotNullExpressionValue(authSessionResultFailure, "");
        return authSessionResultFailure;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAWSCognitoIdentityPoolDetails(@NotNull List<LoginProvider> list, boolean z, @NotNull Continuation<? super AWSCognitoIdentityPoolDetails> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        List<LoginProvider> listDeserializeLogins;
        AWSCognitoIdentityPoolOperations aWSCognitoIdentityPoolOperations;
        AuthException authException;
        boolean z2;
        AWSCredentialsInternal aWSCredentialsInternal;
        Object identityId;
        Object obj;
        AuthSessionResult authSessionResultSuccess;
        AWSCredentialsInternal aWSCredentialsInternal2;
        List<LoginProvider> list2;
        AuthException e;
        int i;
        AuthSessionResult<AWSCredentials> authSessionResultFailure;
        AuthSessionResult authSessionResult;
        List<LoginProvider> list3;
        AWSCognitoIdentityPoolOperations aWSCognitoIdentityPoolOperations2;
        AuthSessionResult<AWSCredentials> authSessionResultFailure2;
        String str;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i2 = anonymousClass1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i2 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        }
        Object aWSCredentials = anonymousClass1.result;
        Object objCopydefault = C56442yFn.copydefault();
        int i3 = anonymousClass1.label;
        if (i3 == 0) {
            C56391yDq.AEQbTJ(aWSCredentials);
            this.logger.verbose("fetchAWSCognitoIdentityPoolDetails: get cached AWS credentials");
            listDeserializeLogins = deserializeLogins(this.awsAuthCredentialStore.get(this.KEY_LOGINS_PROVIDER));
            String str2 = this.awsAuthCredentialStore.get(this.KEY_IDENTITY_ID);
            AWSCredentialsInternal aWSCredentialsInternalDeserializeCredential = deserializeCredential(this.awsAuthCredentialStore.get(this.KEY_AWS_CREDENTIALS));
            this.logger.verbose("fetchAWSCognitoIdentityPoolDetails: start fetching identity id");
            if (str2 == null || StringsKt__StringsKt.fARcdN((CharSequence) str2)) {
                try {
                    anonymousClass1.L$0 = this;
                    anonymousClass1.L$1 = list;
                    anonymousClass1.L$2 = listDeserializeLogins;
                    anonymousClass1.L$3 = aWSCredentialsInternalDeserializeCredential;
                    anonymousClass1.Z$0 = z;
                    anonymousClass1.label = 1;
                    identityId = getIdentityId(list, anonymousClass1);
                } catch (AuthException e2) {
                    aWSCognitoIdentityPoolOperations = this;
                    authException = e2;
                    z2 = z;
                    aWSCredentialsInternal = aWSCredentialsInternalDeserializeCredential;
                    list2 = listDeserializeLogins;
                    e = authException;
                    authSessionResultSuccess = AuthSessionResult.failure(e);
                    boolean z3 = z2;
                    aWSCredentialsInternal2 = aWSCredentialsInternal;
                    z = z3;
                    boolean zEZpvd = Intrinsics.EZpvd(list, list2);
                    aWSCognitoIdentityPoolOperations.logger.verbose("fetchAWSCognitoIdentityPoolDetails: start fetching AWS credentials");
                    if (aWSCredentialsInternal2 == null) {
                    }
                    authSessionResultSuccess = authSessionResult;
                    authSessionResultFailure = authSessionResultFailure2;
                    Intrinsics.copydefault(authSessionResultSuccess);
                    Intrinsics.copydefault(authSessionResultFailure);
                    return new AWSCognitoIdentityPoolDetails(authSessionResultSuccess, authSessionResultFailure);
                }
                if (identityId == objCopydefault) {
                    return objCopydefault;
                }
                aWSCognitoIdentityPoolOperations = this;
                obj = identityId;
                z2 = z;
                aWSCredentialsInternal = aWSCredentialsInternalDeserializeCredential;
                list2 = listDeserializeLogins;
                authSessionResultSuccess = AuthSessionResult.success((String) obj);
                boolean z32 = z2;
                aWSCredentialsInternal2 = aWSCredentialsInternal;
                z = z32;
                boolean zEZpvd2 = Intrinsics.EZpvd(list, list2);
                aWSCognitoIdentityPoolOperations.logger.verbose("fetchAWSCognitoIdentityPoolDetails: start fetching AWS credentials");
                if (aWSCredentialsInternal2 == null) {
                    i = WhenMappings.$EnumSwitchMapping$0[authSessionResultSuccess.getType().ordinal()];
                    if (i != 1) {
                    }
                }
                authSessionResultSuccess = authSessionResult;
                authSessionResultFailure = authSessionResultFailure2;
            } else {
                aWSCognitoIdentityPoolOperations = this;
                authSessionResultSuccess = AuthSessionResult.success(str2);
                aWSCredentialsInternal2 = aWSCredentialsInternalDeserializeCredential;
                list2 = listDeserializeLogins;
                boolean zEZpvd22 = Intrinsics.EZpvd(list, list2);
                aWSCognitoIdentityPoolOperations.logger.verbose("fetchAWSCognitoIdentityPoolDetails: start fetching AWS credentials");
                if (aWSCredentialsInternal2 == null) {
                }
                authSessionResultSuccess = authSessionResult;
                authSessionResultFailure = authSessionResultFailure2;
            }
        } else if (i3 == 1) {
            boolean z4 = anonymousClass1.Z$0;
            aWSCredentialsInternal = (AWSCredentialsInternal) anonymousClass1.L$3;
            listDeserializeLogins = (List) anonymousClass1.L$2;
            List<LoginProvider> list4 = (List) anonymousClass1.L$1;
            aWSCognitoIdentityPoolOperations = (AWSCognitoIdentityPoolOperations) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(aWSCredentials);
                obj = aWSCredentials;
                z2 = z4;
                list = list4;
                list2 = listDeserializeLogins;
                try {
                    authSessionResultSuccess = AuthSessionResult.success((String) obj);
                } catch (AuthException e3) {
                    e = e3;
                    authSessionResultSuccess = AuthSessionResult.failure(e);
                }
            } catch (AuthException e4) {
                authException = e4;
                z2 = z4;
                list = list4;
                list2 = listDeserializeLogins;
                e = authException;
                authSessionResultSuccess = AuthSessionResult.failure(e);
                boolean z322 = z2;
                aWSCredentialsInternal2 = aWSCredentialsInternal;
                z = z322;
                boolean zEZpvd222 = Intrinsics.EZpvd(list, list2);
                aWSCognitoIdentityPoolOperations.logger.verbose("fetchAWSCognitoIdentityPoolDetails: start fetching AWS credentials");
                if (aWSCredentialsInternal2 == null) {
                }
                authSessionResultSuccess = authSessionResult;
                authSessionResultFailure = authSessionResultFailure2;
                Intrinsics.copydefault(authSessionResultSuccess);
                Intrinsics.copydefault(authSessionResultFailure);
                return new AWSCognitoIdentityPoolDetails(authSessionResultSuccess, authSessionResultFailure);
            }
            boolean z3222 = z2;
            aWSCredentialsInternal2 = aWSCredentialsInternal;
            z = z3222;
            boolean zEZpvd2222 = Intrinsics.EZpvd(list, list2);
            aWSCognitoIdentityPoolOperations.logger.verbose("fetchAWSCognitoIdentityPoolDetails: start fetching AWS credentials");
            if (aWSCredentialsInternal2 == null || !aWSCognitoIdentityPoolOperations.isValidSession(aWSCredentialsInternal2) || (!zEZpvd2222) || z) {
                i = WhenMappings.$EnumSwitchMapping$0[authSessionResultSuccess.getType().ordinal()];
                if (i != 1) {
                    authSessionResultFailure = AuthSessionResult.failure(authSessionResultSuccess.getError());
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    try {
                        String str3 = (String) authSessionResultSuccess.getValue();
                        anonymousClass1.L$0 = aWSCognitoIdentityPoolOperations;
                        anonymousClass1.L$1 = list;
                        anonymousClass1.L$2 = authSessionResultSuccess;
                        anonymousClass1.L$3 = null;
                        anonymousClass1.label = 2;
                        aWSCredentials = aWSCognitoIdentityPoolOperations.getAWSCredentials(str3, list, anonymousClass1);
                    } catch (AuthException e5) {
                        e = e5;
                        authSessionResult = authSessionResultSuccess;
                        authSessionResultFailure2 = AuthSessionResult.failure(e);
                    }
                    if (aWSCredentials == objCopydefault) {
                        return objCopydefault;
                    }
                    list3 = list;
                    authSessionResult = authSessionResultSuccess;
                    aWSCognitoIdentityPoolOperations2 = aWSCognitoIdentityPoolOperations;
                    Pair pair = (Pair) aWSCredentials;
                    str = (String) pair.component1();
                    AWSCredentialsInternal aWSCredentialsInternal3 = (AWSCredentialsInternal) pair.component2();
                    AuthCredentialStore authCredentialStore = aWSCognitoIdentityPoolOperations2.awsAuthCredentialStore;
                    String str4 = aWSCognitoIdentityPoolOperations2.KEY_LOGINS_PROVIDER;
                    Json.Default r4 = Json.Default;
                    r4.getSerializersModule();
                    authCredentialStore.put(str4, r4.encodeToString(new ArrayListSerializer(LoginProvider.Companion.serializer()), list3));
                    AuthCredentialStore authCredentialStore2 = aWSCognitoIdentityPoolOperations2.awsAuthCredentialStore;
                    String str5 = aWSCognitoIdentityPoolOperations2.KEY_IDENTITY_ID;
                    if (str == null) {
                    }
                    authCredentialStore2.put(str5, str);
                    AuthCredentialStore authCredentialStore3 = aWSCognitoIdentityPoolOperations2.awsAuthCredentialStore;
                    String str6 = aWSCognitoIdentityPoolOperations2.KEY_AWS_CREDENTIALS;
                    r4.getSerializersModule();
                    authCredentialStore3.put(str6, r4.encodeToString(AWSCredentialsInternal.Companion.serializer(), aWSCredentialsInternal3));
                    aWSCognitoIdentityPoolOperations2.logger.verbose("fetchAWSCognitoIdentityPoolDetails: cached AWS credentials");
                    authSessionResultFailure2 = aWSCognitoIdentityPoolOperations2.getCredentialsResult(aWSCredentialsInternal3);
                    authSessionResultSuccess = authSessionResult;
                    authSessionResultFailure = authSessionResultFailure2;
                }
            } else {
                authSessionResultFailure = aWSCognitoIdentityPoolOperations.getCredentialsResult(aWSCredentialsInternal2);
            }
        } else {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            authSessionResult = (AuthSessionResult) anonymousClass1.L$2;
            list3 = (List) anonymousClass1.L$1;
            aWSCognitoIdentityPoolOperations2 = (AWSCognitoIdentityPoolOperations) anonymousClass1.L$0;
            try {
                C56391yDq.AEQbTJ(aWSCredentials);
                Pair pair2 = (Pair) aWSCredentials;
                str = (String) pair2.component1();
                AWSCredentialsInternal aWSCredentialsInternal32 = (AWSCredentialsInternal) pair2.component2();
                AuthCredentialStore authCredentialStore4 = aWSCognitoIdentityPoolOperations2.awsAuthCredentialStore;
                String str42 = aWSCognitoIdentityPoolOperations2.KEY_LOGINS_PROVIDER;
                Json.Default r42 = Json.Default;
                r42.getSerializersModule();
                authCredentialStore4.put(str42, r42.encodeToString(new ArrayListSerializer(LoginProvider.Companion.serializer()), list3));
                AuthCredentialStore authCredentialStore22 = aWSCognitoIdentityPoolOperations2.awsAuthCredentialStore;
                String str52 = aWSCognitoIdentityPoolOperations2.KEY_IDENTITY_ID;
                if (str == null) {
                    str = "";
                }
                authCredentialStore22.put(str52, str);
                AuthCredentialStore authCredentialStore32 = aWSCognitoIdentityPoolOperations2.awsAuthCredentialStore;
                String str62 = aWSCognitoIdentityPoolOperations2.KEY_AWS_CREDENTIALS;
                r42.getSerializersModule();
                authCredentialStore32.put(str62, r42.encodeToString(AWSCredentialsInternal.Companion.serializer(), aWSCredentialsInternal32));
                aWSCognitoIdentityPoolOperations2.logger.verbose("fetchAWSCognitoIdentityPoolDetails: cached AWS credentials");
                authSessionResultFailure2 = aWSCognitoIdentityPoolOperations2.getCredentialsResult(aWSCredentialsInternal32);
            } catch (AuthException e6) {
                e = e6;
                authSessionResultFailure2 = AuthSessionResult.failure(e);
            }
            authSessionResultSuccess = authSessionResult;
            authSessionResultFailure = authSessionResultFailure2;
        }
        Intrinsics.copydefault(authSessionResultSuccess);
        Intrinsics.copydefault(authSessionResultFailure);
        return new AWSCognitoIdentityPoolDetails(authSessionResultSuccess, authSessionResultFailure);
    }

    public final void clearCredentials() {
        this.logger.verbose("clearCredentials: clear cached AWS credentials");
        this.awsAuthCredentialStore.removeAll();
    }

    private final AWSCredentialsInternal deserializeCredential(String str) {
        if (str != null) {
            try {
                Json.Default r0 = Json.Default;
                r0.getSerializersModule();
                return (AWSCredentialsInternal) r0.decodeFromString(BuiltinSerializersKt.getNullable(AWSCredentialsInternal.Companion.serializer()), str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    private final List<LoginProvider> deserializeLogins(String str) {
        if (str != null) {
            try {
                Json.Default r0 = Json.Default;
                r0.getSerializersModule();
                List<LoginProvider> list = (List) r0.decodeFromString(BuiltinSerializersKt.getNullable(new ArrayListSerializer(LoginProvider.Companion.serializer())), str);
                if (list != null) {
                    return list;
                }
            } catch (Exception unused) {
                return yDY.AhwBna();
            }
        }
        return yDY.AhwBna();
    }
}
