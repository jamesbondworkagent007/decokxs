package com.amplifyframework.auth.cognito;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import com.amplifyframework.auth.AuthProvider;
import com.amplifyframework.auth.cognito.activities.CustomTabsManagerActivity;
import com.amplifyframework.auth.cognito.exceptions.service.CodeValidationException;
import com.amplifyframework.auth.cognito.helpers.BrowserHelper;
import com.amplifyframework.auth.cognito.helpers.CodegenExtensionsKt;
import com.amplifyframework.auth.cognito.helpers.HostedUIHttpHelper;
import com.amplifyframework.auth.cognito.helpers.PkceHelper;
import com.amplifyframework.logging.Logger;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import com.amplifyframework.statemachine.codegen.data.HostedUIOptions;
import com.amplifyframework.statemachine.codegen.data.OauthConfiguration;
import com.google.firebase.messaging.Constants;
import java.net.URL;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C56390yDp;
import o.C56424yEw;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class HostedUIClient extends CustomTabsServiceConnection {
    public static final int CUSTOM_TABS_ACTIVITY_CODE = 49281;
    public static final Companion Companion = new Companion(null);
    private CustomTabsClient client;
    private final OauthConfiguration configuration;
    private final Context context;
    private final String defaultCustomTabsPackage;
    private final Logger logger;
    private final String proofKey;
    private final String proofKeyHash;
    private CustomTabsSession session;
    private final String state;

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR 
  (r1v0 android.content.Context)
  (r2v0 com.amplifyframework.statemachine.codegen.data.OauthConfiguration)
  (r3v0 com.amplifyframework.logging.Logger)
 A[MD:(android.content.Context, com.amplifyframework.statemachine.codegen.data.OauthConfiguration, com.amplifyframework.logging.Logger):void (m)] call: com.amplifyframework.auth.cognito.HostedUIClient.<init>(android.content.Context, com.amplifyframework.statemachine.codegen.data.OauthConfiguration, com.amplifyframework.logging.Logger):void type: THIS */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public /* synthetic */ HostedUIClient(Context context, OauthConfiguration oauthConfiguration, Logger logger, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, oauthConfiguration, logger);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@NotNull ComponentName componentName) {
        Intrinsics.checkNotNullParameter(componentName, "");
        this.client = null;
    }

    private HostedUIClient(Context context, OauthConfiguration oauthConfiguration, Logger logger) {
        this.context = context;
        this.configuration = oauthConfiguration;
        this.logger = logger;
        PkceHelper pkceHelper = PkceHelper.INSTANCE;
        String strGenerateRandom = pkceHelper.generateRandom();
        this.proofKey = strGenerateRandom;
        this.proofKeyHash = pkceHelper.generateHash(strGenerateRandom);
        this.state = pkceHelper.generateRandom();
        String defaultCustomTabPackage = BrowserHelper.INSTANCE.getDefaultCustomTabPackage(context);
        if (defaultCustomTabPackage != null) {
            preWarmCustomTabs(context, defaultCustomTabPackage);
        } else {
            defaultCustomTabPackage = null;
        }
        this.defaultCustomTabsPackage = defaultCustomTabPackage;
    }

    public final void launchCustomTabsSignIn(@NotNull HostedUIOptions hostedUIOptions) throws RuntimeException {
        Intrinsics.checkNotNullParameter(hostedUIOptions, "");
        launchCustomTabs(createAuthorizeUri(hostedUIOptions), hostedUIOptions.getCallingActivity(), hostedUIOptions.getBrowserPackage());
    }

    public final void launchCustomTabsSignOut(String str) throws RuntimeException {
        launchCustomTabs$default(this, createSignOutUri$aws_auth_cognito_release(), null, str, 2, null);
    }

    public static /* synthetic */ void launchCustomTabs$default(HostedUIClient hostedUIClient, Uri uri, Activity activity, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            activity = null;
        }
        hostedUIClient.launchCustomTabs(uri, activity, str);
    }

    private final void launchCustomTabs(Uri uri, Activity activity, String str) {
        if (!BrowserHelper.INSTANCE.isBrowserInstalled(this.context)) {
            throw new RuntimeException("No browsers installed");
        }
        if (str == null) {
            str = this.defaultCustomTabsPackage;
        }
        CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder(this.session).build();
        if (str != null) {
            customTabsIntentBuild.intent.setPackage(str);
        }
        customTabsIntentBuild.intent.setData(uri);
        Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "");
        Intent intentCreateStartIntent = CustomTabsManagerActivity.Companion.createStartIntent(this.context, customTabsIntentBuild.intent);
        if (activity != null) {
            activity.startActivityForResult(intentCreateStartIntent, 49281);
        } else {
            intentCreateStartIntent.addFlags(268435456);
            this.context.startActivity(intentCreateStartIntent);
        }
    }

    public final CognitoUserPoolTokens fetchToken(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "");
        String queryParameter = uri.getQueryParameter(Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        String queryParameter2 = uri.getQueryParameter("state");
        String queryParameter3 = uri.getQueryParameter("code");
        if (queryParameter == null) {
            if (queryParameter2 == null || queryParameter3 == null) {
                throw new CodeValidationException(null, 1, null);
            }
            return HostedUIHttpHelper.INSTANCE.fetchTokens(createFetchTokenUrl(), createFetchTokenHeaders(), C56424yEw.gEmmrt(C56390yDp.OLrzqt("grant_type", "authorization_code"), C56390yDp.OLrzqt("client_id", this.configuration.getAppClient()), C56390yDp.OLrzqt("redirect_uri", this.configuration.getSignInRedirectURI()), C56390yDp.OLrzqt("code_verifier", this.proofKey), C56390yDp.OLrzqt("code", queryParameter3)));
        }
        String queryParameter4 = uri.getQueryParameter("error_description");
        String string = queryParameter4 != null ? StringsKt__StringsKt.hDKMBd((CharSequence) queryParameter4).toString() : null;
        if (string != null && string.length() > 0) {
            queryParameter = queryParameter + ": " + string;
        }
        throw new CodeValidationException(queryParameter);
    }

    private final Uri createAuthorizeUri(HostedUIOptions hostedUIOptions) {
        List<String> list;
        String strJoinToString$default;
        String userPoolProviderName;
        Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme("https").authority(this.configuration.getDomain()).appendPath("oauth2").appendPath("authorize").appendQueryParameter("client_id", this.configuration.getAppClient()).appendQueryParameter("redirect_uri", this.configuration.getSignInRedirectURI()).appendQueryParameter("response_type", "code").appendQueryParameter("code_challenge", this.proofKeyHash).appendQueryParameter("code_challenge_method", "S256").appendQueryParameter("state", this.state);
        AuthProvider authProvider = hostedUIOptions.getProviderInfo().getAuthProvider();
        List<String> listAxsJAYsNCnLh = null;
        if (authProvider != null && (userPoolProviderName = CodegenExtensionsKt.getUserPoolProviderName(authProvider)) != null) {
            if (userPoolProviderName.length() <= 0) {
                userPoolProviderName = null;
            }
            if (userPoolProviderName != null) {
                builderAppendQueryParameter.appendQueryParameter("identity_provider", userPoolProviderName);
            }
        }
        String idpIdentifier = hostedUIOptions.getProviderInfo().getIdpIdentifier();
        if (idpIdentifier != null) {
            if (idpIdentifier.length() <= 0) {
                idpIdentifier = null;
            }
            if (idpIdentifier != null) {
                builderAppendQueryParameter.appendQueryParameter("idp_identifier", idpIdentifier);
            }
        }
        List<String> scopes = hostedUIOptions.getScopes();
        if (scopes == null) {
            list = listAxsJAYsNCnLh;
        } else if (scopes.isEmpty()) {
            listAxsJAYsNCnLh = CollectionsKt___CollectionsKt.AxsJAYsNCnLh(this.configuration.getScopes());
            list = listAxsJAYsNCnLh;
        } else {
            list = scopes;
        }
        if (list != null && (strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(list, " ", null, null, 0, null, null, 62, null)) != null) {
            builderAppendQueryParameter.appendQueryParameter("scope", strJoinToString$default);
        }
        Uri uriBuild = builderAppendQueryParameter.build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "");
        return uriBuild;
    }

    private final URL createFetchTokenUrl() {
        return new URL(new Uri.Builder().scheme("https").authority(this.configuration.getDomain()).appendPath("oauth2").appendPath("token").build().toString());
    }

    private final Map<String, String> createFetchTokenHeaders() {
        Map<String, String> mapDjBIcL = C56424yEw.djBIcL(C56390yDp.OLrzqt("Content-Type", "application/x-www-form-urlencoded"));
        if (this.configuration.getAppSecret() != null) {
            String strEncodeBase64 = PkceHelper.INSTANCE.encodeBase64(this.configuration.getAppClient() + ":" + this.configuration.getAppSecret());
            StringBuilder sb = new StringBuilder();
            sb.append("Basic ");
            sb.append(strEncodeBase64);
            mapDjBIcL.put("Authorization", sb.toString());
        }
        return mapDjBIcL;
    }

    public final Uri createSignOutUri$aws_auth_cognito_release() {
        Uri uriBuild = new Uri.Builder().scheme("https").authority(this.configuration.getDomain()).appendPath("logout").appendQueryParameter("client_id", this.configuration.getAppClient()).appendQueryParameter("logout_uri", this.configuration.getSignOutRedirectURI()).build();
        Intrinsics.checkNotNullExpressionValue(uriBuild, "");
        return uriBuild;
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public void onCustomTabsServiceConnected(@NotNull ComponentName componentName, @NotNull CustomTabsClient customTabsClient) {
        Intrinsics.checkNotNullParameter(componentName, "");
        Intrinsics.checkNotNullParameter(customTabsClient, "");
        this.client = customTabsClient;
        customTabsClient.warmup(0L);
        this.session = customTabsClient.newSession(null);
    }

    private final void preWarmCustomTabs(Context context, String str) {
        CustomTabsClient.bindCustomTabsService(context, str, this);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.HostedUIClient.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final HostedUIClient create(@NotNull Context context, OauthConfiguration oauthConfiguration, @NotNull Logger logger) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(logger, "");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (oauthConfiguration != null) {
                return new HostedUIClient(context, oauthConfiguration, logger, defaultConstructorMarker);
            }
            return null;
        }
    }
}
