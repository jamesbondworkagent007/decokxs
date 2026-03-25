package com.amplifyframework.api.aws;

import android.net.Uri;
import com.amplifyframework.AmplifyException;
import com.amplifyframework.api.ApiException;
import com.amplifyframework.api.aws.auth.IamRequestDecorator;
import com.amplifyframework.api.aws.sigv4.ApiKeyAuthProvider;
import com.amplifyframework.api.aws.sigv4.AppSyncV4Signer;
import com.amplifyframework.api.aws.sigv4.CognitoUserPoolsAuthProvider;
import com.amplifyframework.api.aws.sigv4.DefaultCognitoUserPoolsAuthProvider;
import com.amplifyframework.api.aws.sigv4.FunctionAuthProvider;
import com.amplifyframework.api.aws.sigv4.OidcAuthProvider;
import com.amplifyframework.api.graphql.GraphQLRequest;
import com.amplifyframework.auth.CognitoCredentialsProvider;
import com.google.api.client.json.Json;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import o.InterfaceC52805wZ;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes21.dex */
final class SubscriptionAuthorizer {
    private static final String AUTH_DEPENDENCY_PLUGIN_KEY = "awsCognitoAuthPlugin";
    private final ApiAuthProviders authProviders;
    private final ApiConfiguration configuration;

    public SubscriptionAuthorizer(ApiConfiguration apiConfiguration) {
        this(apiConfiguration, ApiAuthProviders.noProviderOverrides());
    }

    public SubscriptionAuthorizer(ApiConfiguration apiConfiguration, ApiAuthProviders apiAuthProviders) {
        this.configuration = apiConfiguration;
        this.authProviders = apiAuthProviders;
    }

    public JSONObject createHeadersForSubscription(GraphQLRequest<?> graphQLRequest, AuthorizationType authorizationType) throws ApiException {
        return createHeaders(graphQLRequest, authorizationType, false);
    }

    public JSONObject createHeadersForConnection(AuthorizationType authorizationType) throws ApiException {
        return createHeaders(null, authorizationType, true);
    }

    /* JADX INFO: renamed from: com.amplifyframework.api.aws.SubscriptionAuthorizer$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amplifyframework$api$aws$AuthorizationType;

        static {
            int[] iArr = new int[AuthorizationType.values().length];
            $SwitchMap$com$amplifyframework$api$aws$AuthorizationType = iArr;
            try {
                iArr[AuthorizationType.API_KEY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$AuthorizationType[AuthorizationType.AWS_IAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$AuthorizationType[AuthorizationType.AMAZON_COGNITO_USER_POOLS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$AuthorizationType[AuthorizationType.OPENID_CONNECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$AuthorizationType[AuthorizationType.AWS_LAMBDA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amplifyframework$api$aws$AuthorizationType[AuthorizationType.NONE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private JSONObject createHeaders(GraphQLRequest<?> graphQLRequest, AuthorizationType authorizationType, boolean z) throws ApiException {
        int i = AnonymousClass1.$SwitchMap$com$amplifyframework$api$aws$AuthorizationType[authorizationType.ordinal()];
        if (i == 1) {
            ApiKeyAuthProvider apiKeyAuthProvider = this.authProviders.getApiKeyAuthProvider();
            if (apiKeyAuthProvider == null) {
                final ApiConfiguration apiConfiguration = this.configuration;
                Objects.requireNonNull(apiConfiguration);
                apiKeyAuthProvider = new ApiKeyAuthProvider() { // from class: com.amplifyframework.api.aws.SubscriptionAuthorizer$$ExternalSyntheticLambda0
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.amplifyframework.api.aws.sigv4.ApiKeyAuthProvider
                    public final String getAPIKey() {
                        return apiConfiguration.getApiKey();
                    }
                };
            }
            return forApiKey(apiKeyAuthProvider);
        }
        if (i == 2) {
            InterfaceC52805wZ aWSCredentialsProvider = this.authProviders.getAWSCredentialsProvider();
            if (aWSCredentialsProvider == null) {
                aWSCredentialsProvider = new CognitoCredentialsProvider();
            }
            return forIam(aWSCredentialsProvider, graphQLRequest, z);
        }
        if (i == 3) {
            CognitoUserPoolsAuthProvider cognitoUserPoolsAuthProvider = this.authProviders.getCognitoUserPoolsAuthProvider();
            if (cognitoUserPoolsAuthProvider == null) {
                cognitoUserPoolsAuthProvider = new DefaultCognitoUserPoolsAuthProvider();
            }
            return forCognitoUserPools(cognitoUserPoolsAuthProvider);
        }
        if (i == 4) {
            OidcAuthProvider oidcAuthProvider = this.authProviders.getOidcAuthProvider();
            if (oidcAuthProvider == null) {
                oidcAuthProvider = new OidcAuthProvider() { // from class: com.amplifyframework.api.aws.SubscriptionAuthorizer$$ExternalSyntheticLambda1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.amplifyframework.api.aws.sigv4.AuthProvider
                    public final String getLatestAuthToken() {
                        return SubscriptionAuthorizer.lambda$createHeaders$0();
                    }
                };
            }
            return forOidc(oidcAuthProvider);
        }
        if (i == 5) {
            FunctionAuthProvider functionAuthProvider = this.authProviders.getFunctionAuthProvider();
            if (functionAuthProvider == null) {
                functionAuthProvider = new FunctionAuthProvider() { // from class: com.amplifyframework.api.aws.SubscriptionAuthorizer$$ExternalSyntheticLambda2
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                    @Override // com.amplifyframework.api.aws.sigv4.AuthProvider
                    public final String getLatestAuthToken() {
                        return SubscriptionAuthorizer.lambda$createHeaders$1();
                    }
                };
            }
            return forAwsLambda(functionAuthProvider);
        }
        return new JSONObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$createHeaders$0() throws ApiException {
        throw new ApiException.ApiAuthException("OidcAuthProvider interface is not implemented.", "Please implement OidcAuthProvider interface to return appropriate token from the appropriate service.");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$createHeaders$1() throws ApiException {
        throw new ApiException.ApiAuthException("FunctionAuthProvider interface is not implemented.", "Please implement FunctionAuthProvider interface to return appropriate token from the appropriate service.");
    }

    private JSONObject forApiKey(ApiKeyAuthProvider apiKeyAuthProvider) throws ApiException {
        try {
            return new JSONObject().put("host", getHost()).put("x-amz-date", Iso8601Timestamp.now()).put("x-api-key", apiKeyAuthProvider.getAPIKey());
        } catch (JSONException e) {
            throw new ApiException("Error constructing the authorization json for Api key.", e, AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION);
        }
    }

    private JSONObject forCognitoUserPools(CognitoUserPoolsAuthProvider cognitoUserPoolsAuthProvider) throws ApiException {
        try {
            return new JSONObject().put("host", getHost()).put("Authorization", cognitoUserPoolsAuthProvider.getLatestAuthToken());
        } catch (JSONException e) {
            throw new ApiException("Error constructing the authorization json for Cognito User Pools.", e, AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION);
        }
    }

    private JSONObject forOidc(OidcAuthProvider oidcAuthProvider) throws ApiException {
        try {
            return new JSONObject().put("host", getHost()).put("Authorization", oidcAuthProvider.getLatestAuthToken());
        } catch (JSONException e) {
            throw new ApiException("Error constructing the authorization json for Open ID Connect.", e, AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION);
        }
    }

    private JSONObject forAwsLambda(FunctionAuthProvider functionAuthProvider) throws ApiException {
        try {
            return new JSONObject().put("host", getHost()).put("Authorization", functionAuthProvider.getLatestAuthToken());
        } catch (JSONException e) {
            throw new ApiException("Error constructing the authorization json for the AWS_LAMBDA auth type.", e, AmplifyException.REPORT_BUG_TO_AWS_SUGGESTION);
        }
    }

    private JSONObject forIam(InterfaceC52805wZ interfaceC52805wZ, GraphQLRequest<?> graphQLRequest, boolean z) throws ApiException {
        Map<String, List<String>> multimap = new IamRequestDecorator(new AppSyncV4Signer(this.configuration.getRegion()), interfaceC52805wZ, "appsync").decorate(new Request.Builder().url(getRequestEndpoint(z).toString()).addHeader("accept", "application/json, text/javascript").addHeader("content-type", Json.MEDIA_TYPE).post(RequestBody.create((graphQLRequest != null ? graphQLRequest.getContent() : "{}").getBytes(), MediaType.parse(Json.MEDIA_TYPE))).build()).headers().toMultimap();
        final HashMap map = new HashMap();
        multimap.forEach(new BiConsumer() { // from class: com.amplifyframework.api.aws.SubscriptionAuthorizer$$ExternalSyntheticLambda3
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                SubscriptionAuthorizer.lambda$forIam$2(map, (String) obj, (List) obj2);
            }
        });
        return new JSONObject(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$forIam$2(Map map, String str, List list) {
        map.put(str, (String) list.get(0));
    }

    private String getHost() {
        return Uri.parse(this.configuration.getEndpoint()).getHost();
    }

    private URI getRequestEndpoint(boolean z) throws ApiException {
        try {
            String endpoint = this.configuration.getEndpoint();
            if (z) {
                endpoint = endpoint + "/connect";
            }
            return new URI(endpoint);
        } catch (URISyntaxException e) {
            throw new ApiException("Error constructing canonical URI for IAM request signature", e, "Verify that the API configuration contains valid GraphQL endpoint.");
        }
    }
}
