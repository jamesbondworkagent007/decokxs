package com.amplifyframework.auth.cognito.helpers;

import com.amplifyframework.auth.cognito.exceptions.service.InvalidGrantException;
import com.amplifyframework.auth.cognito.exceptions.service.ParseTokenException;
import com.amplifyframework.auth.exceptions.ServiceException;
import com.amplifyframework.auth.exceptions.SessionExpiredException;
import com.amplifyframework.statemachine.codegen.data.CognitoUserPoolTokens;
import com.google.android.exoplayer2.C;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import o.yFA;
import o.yFK;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class HostedUIHttpHelper {
    public static final HostedUIHttpHelper INSTANCE = new HostedUIHttpHelper();
    private static final Json json = JsonKt.Json$default(null, new Function1<JsonBuilder, Unit>() { // from class: com.amplifyframework.auth.cognito.helpers.HostedUIHttpHelper$json$1
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(JsonBuilder jsonBuilder) {
            invoke2(jsonBuilder);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull JsonBuilder jsonBuilder) {
            Intrinsics.checkNotNullParameter(jsonBuilder, "");
            jsonBuilder.setIgnoreUnknownKeys(true);
        }
    }, 1, null);

    private HostedUIHttpHelper() {
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    public final CognitoUserPoolTokens fetchTokens(@NotNull URL url, @NotNull Map<String, String> map, @NotNull Map<String, String> map2) throws Exception {
        InputStream errorStream;
        Intrinsics.checkNotNullParameter(url, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(map2, "");
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        Intrinsics.copydefault(uRLConnectionOpenConnection, "");
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        httpsURLConnection.setRequestMethod("POST");
        httpsURLConnection.setDoOutput(true);
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpsURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
            arrayList.add(Unit.INSTANCE);
        }
        DataOutputStream dataOutputStream = new DataOutputStream(httpsURLConnection.getOutputStream());
        try {
            ArrayList arrayList2 = new ArrayList(map2.size());
            for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                arrayList2.add(URLEncoder.encode(entry2.getKey(), C.UTF8_NAME) + ContainerUtils.KEY_VALUE_DELIMITER + URLEncoder.encode(entry2.getValue(), C.UTF8_NAME));
            }
            dataOutputStream.writeBytes(CollectionsKt___CollectionsKt.joinToString$default(arrayList2, ContainerUtils.FIELD_DELIMITER, null, null, 0, null, null, 62, null));
            Unit unit = Unit.INSTANCE;
            yFA.copydefault(dataOutputStream, null);
            int responseCode = httpsURLConnection.getResponseCode();
            if (responseCode >= 200 && responseCode < 500) {
                if (responseCode < 300) {
                    errorStream = httpsURLConnection.getInputStream();
                } else {
                    errorStream = httpsURLConnection.getErrorStream();
                }
                Intrinsics.copydefault(errorStream);
                Reader inputStreamReader = new InputStreamReader(errorStream, Charsets.UTF_8);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    String strAEQbTJ = yFK.AEQbTJ(bufferedReader);
                    yFA.copydefault(bufferedReader, null);
                    return parseTokenResponse(strAEQbTJ);
                } finally {
                }
            } else {
                String responseMessage = httpsURLConnection.getResponseMessage();
                Intrinsics.checkNotNullExpressionValue(responseMessage, "");
                throw new ServiceException(responseMessage, "Sorry, we don't have a suggested fix for this error yet.", null, 4, null);
            }
        } finally {
        }
    }

    private final CognitoUserPoolTokens parseTokenResponse(String str) throws Exception {
        if (str.length() == 0) {
            throw new ParseTokenException();
        }
        try {
            Json json2 = json;
            json2.getSerializersModule();
            FetchTokenResponse fetchTokenResponse = (FetchTokenResponse) json2.decodeFromString(FetchTokenResponse.Companion.serializer(), str);
            String error = fetchTokenResponse.getError();
            if (error != null) {
                if (Intrinsics.EZpvd((Object) error, (Object) "invalid_grant")) {
                    throw new SessionExpiredException(error, null, new InvalidGrantException(error, fetchTokenResponse.getErrorDescription()), 2, null);
                }
                throw new ServiceException(error, "Sorry, we don't have a suggested fix for this error yet.", null, 4, null);
            }
            return new CognitoUserPoolTokens(fetchTokenResponse.getIdToken(), fetchTokenResponse.getAccessToken(), fetchTokenResponse.getRefreshToken(), fetchTokenResponse.getExpiration());
        } catch (Exception e) {
            if (!(e instanceof SessionExpiredException) && !(e instanceof ServiceException)) {
                String message = e.getMessage();
                if (message == null) {
                    message = "An unknown service error has occurred";
                }
                throw new ServiceException(message, "Sorry, we don't have a suggested fix for this error yet.", e);
            }
            throw e;
        }
    }
}
