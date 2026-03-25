package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.business.web3pay.lib.core.model.PayTransactionErrorType;
import com.okinc.business.web3pay.lib.core.network.OtherBizLineServerException;
import com.okinc.business.web3pay.lib.features.paytransaction.PayTransactionServerException;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lql, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31266lql {
    public static final java.lang.Throwable AEQbTJ(@NotNull OKServerException oKServerException) {
        JsonPrimitive jsonPrimitive;
        java.lang.String content;
        JsonElement jsonElement;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(oKServerException, "");
        int code = oKServerException.getCode();
        JsonObject response = oKServerException.getResponse();
        java.lang.String asString = (response == null || (jsonElement = response.get("msg")) == null) ? null : jsonElement.getAsString();
        if (code == 9998 && asString != null) {
            try {
                Result.Application application = Result.Companion;
                Json.Default r4 = Json.Default;
                r4.getSerializersModule();
                kotlinx.serialization.json.JsonObject jsonObject = (kotlinx.serialization.json.JsonObject) r4.decodeFromString(kotlinx.serialization.json.JsonObject.Companion.serializer(), asString);
                int i = java.lang.Integer.parseInt(java.lang.String.valueOf(jsonObject.get((java.lang.Object) "code")));
                kotlinx.serialization.json.JsonElement jsonElement2 = (kotlinx.serialization.json.JsonElement) jsonObject.get((java.lang.Object) "msg");
                if (jsonElement2 != null && (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) != null && (content = jsonPrimitive.getContent()) != null) {
                    str = content;
                }
                return new OtherBizLineServerException(oKServerException, i, str);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(th)));
            }
        }
        switch (code) {
            case 50001:
            case 50002:
                return new OtherBizLineServerException(oKServerException, code, asString);
            default:
                PayTransactionErrorType payTransactionErrorTypeKWHzl = PayTransactionErrorType.Companion.KWHzl(code);
                return payTransactionErrorTypeKWHzl != null ? new PayTransactionServerException(oKServerException, payTransactionErrorTypeKWHzl) : oKServerException;
        }
    }
}
