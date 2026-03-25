package com.reown.android.internal.common.signing.eip1271;

import com.reown.android.internal.common.signing.signature.Signature;
import com.reown.android.internal.common.signing.signature.SignatureKt;
import com.reown.util.UtilFunctionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import o.C59442zhC;
import o.C60088zvK;
import o.C60091zvN;
import o.C60134zwX;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class EIP1271Verifier {
    public static final EIP1271Verifier INSTANCE = new EIP1271Verifier();
    public static final String dynamicTypeLength = "0000000000000000000000000000000000000000000000000000000000000041";
    public static final String dynamicTypeOffset = "0000000000000000000000000000000000000000000000000000000000000040";
    public static final String hexPrefix = "0x";
    public static final String isValidSignatureHash = "0x1626ba7e";
    public static final String mediaTypeString = "application/json; charset=utf-8";
    public static final String method = "eth_call";
    public static final String rpcUrlPrefix = "https://rpc.walletconnect.com/v1/?chainId=eip155:1&projectId=";

    public final String getValidResponse(long j) {
        return "{\"jsonrpc\":\"2.0\",\"id\":" + j + ",\"result\":\"0x1626ba7e00000000000000000000000000000000000000000000000000000000\"}";
    }

    public final String prefixWithRpcUrl(String str) {
        return rpcUrlPrefix + str;
    }

    public final RequestBody createBody(String str, String str2, long j) {
        return RequestBody.Companion.create(C59442zhC.trimMargin$default("{\n                |\"method\" : \"eth_call\",\n                |\"params\" : [{\"to\":\"" + str + "\", \"data\":\"" + str2 + "\"}, \"latest\"],\n                |\"id\":" + j + ", \"jsonrpc\":\"2.0\"\n                |}", null, 1, null), MediaType.Companion.get(mediaTypeString));
    }

    public final boolean verify(@NotNull Signature signature, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(signature, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        try {
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "");
            byte[] bArrEZpvd = C60091zvN.EZpvd(bytes);
            Intrinsics.checkNotNullExpressionValue(bArrEZpvd, "");
            return verify(UtilFunctionsKt.bytesToHex(bArrEZpvd), signature, str3, str2);
        } catch (Exception e) {
            C60134zwX.EZpvd.e(e);
            return false;
        }
    }

    public final boolean verifyHex(@NotNull Signature signature, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(signature, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        try {
            byte[] bArrEZpvd = C60091zvN.EZpvd(C60088zvK.copydefault(str));
            Intrinsics.checkNotNullExpressionValue(bArrEZpvd, "");
            return verify(UtilFunctionsKt.bytesToHex(bArrEZpvd), signature, str3, str2);
        } catch (Exception e) {
            C60134zwX.EZpvd.e(e);
            return false;
        }
    }

    public final boolean verify(String str, Signature signature, String str2, String str3) throws Exception {
        String strString;
        String str4 = isValidSignatureHash + str + "00000000000000000000000000000000000000000000000000000000000000400000000000000000000000000000000000000000000000000000000000000041" + StringsKt__StringsKt.KWHzl(SignatureKt.toCacaoSignature(signature), (CharSequence) hexPrefix);
        long jGenerateId = UtilFunctionsKt.generateId();
        ResponseBody responseBodyBody = new OkHttpClient().newCall(new Request.Builder().url(prefixWithRpcUrl(str2)).post(createBody(str3, str4, jGenerateId)).build()).execute().body();
        if (responseBodyBody == null || (strString = responseBodyBody.string()) == null) {
            throw new Exception("Response body is null");
        }
        return Intrinsics.EZpvd((Object) getResponseResult(strString), (Object) getResponseResult(getValidResponse(jGenerateId)));
    }

    public final String getResponseResult(String str) throws JSONException {
        Object obj = new JSONObject(C59442zhC.fJNWhG(str)).get("result");
        Intrinsics.copydefault(obj, "");
        return (String) obj;
    }
}
