package com.amplifyframework.auth.cognito.asf;

import android.content.Context;
import android.util.Base64;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import o.C56392yDr;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class UserContextDataProvider {
    private static final String CONTEXT_DATA = "contextData";
    private static final String DATA_PAYLOAD = "payload";
    private static final String SIGNATURE = "signature";
    private static final String TIMESTAMP_MILLI_SEC = "timestamp";
    private static final String USERNAME = "username";
    private static final String USER_POOL_ID = "userPoolId";
    private static final String VERSION_KEY = "version";
    private static final String VERSION_VALUE = "ANDROID20171114";
    private ContextDataAggregator aggregator;
    private final String clientId;
    private final Context context;
    private final String poolId;
    private final String timestamp;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = UserContextDataProvider.class.getSimpleName();

    public UserContextDataProvider(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.context = context;
        this.poolId = str;
        this.clientId = str2;
        this.timestamp = String.valueOf(System.currentTimeMillis());
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.amplifyframework.auth.cognito.asf.UserContextDataProvider.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final JSONObject getJsonPayload(Map<String, String> map, String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(CONTEXT_DATA, new JSONObject(map));
        jSONObject.put("username", str);
        jSONObject.put(USER_POOL_ID, str2);
        jSONObject.put(TIMESTAMP_MILLI_SEC, this.timestamp);
        return jSONObject;
    }

    private final JSONObject getJsonResponse(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(DATA_PAYLOAD, str);
        jSONObject.put(SIGNATURE, str2);
        jSONObject.put("version", VERSION_VALUE);
        return jSONObject;
    }

    private final String getEncodedResponse(JSONObject jSONObject) {
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        String strEncodeToString = Base64.encodeToString(bytes, 0);
        Intrinsics.checkNotNullExpressionValue(strEncodeToString, "");
        return strEncodeToString;
    }

    public final String getEncodedContextData(@NotNull String str, @NotNull final String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            ContextDataAggregator contextDataAggregator = (ContextDataAggregator) C56392yDr.copydefault(new Function0<ContextDataAggregator>() { // from class: com.amplifyframework.auth.cognito.asf.UserContextDataProvider.getEncodedContextData.1
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX DEBUG: Method merged with bridge method: invoke()Ljava/lang/Object; */
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final ContextDataAggregator invoke() {
                    return new ContextDataAggregator(str2);
                }
            }).getValue();
            this.aggregator = contextDataAggregator;
            if (contextDataAggregator == null) {
                Intrinsics.gEmmrt("");
                contextDataAggregator = null;
            }
            String string = getJsonPayload(contextDataAggregator.getAggregatedData(this.context), str, this.poolId).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            return getEncodedResponse(getJsonResponse(string, SignatureGenerator.Companion.getSignature(string, this.clientId, VERSION_VALUE)));
        } catch (Exception unused) {
            return null;
        }
    }
}
