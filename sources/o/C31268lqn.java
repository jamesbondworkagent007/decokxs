package o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.okinc.business.web3pay.lib.core.model.TransactionAlertType;
import com.okinc.business.web3pay.lib.core.network.GeneralServerException;
import com.okinc.business.web3pay.lib.core.network.OtherBizLineServerException;
import com.okinc.business.web3pay.lib.core.network.TransactionPreExecutionServerException;
import com.okinc.business.web3pay.lib.core.network.TransactionServerException;
import com.okinc.network.okg.response.OKServerException;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31268lqn {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002d, code lost:
    
        if (r0 != 9999) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Throwable copydefault(@NotNull OKServerException oKServerException) {
        JsonElement jsonElement;
        java.lang.String asString;
        Intrinsics.checkNotNullParameter(oKServerException, "");
        int code = oKServerException.getCode();
        if (code != 8105 && code != 10001 && code != 10004) {
            if (code == 10019) {
                return new TransactionPreExecutionServerException(oKServerException);
            }
            if (code != 20000) {
                if (code == 60003) {
                    return new TransactionServerException(oKServerException, TransactionAlertType.PURCHASE_ORDER_EXPIRED);
                }
                if (code == 60008) {
                    return new TransactionServerException(oKServerException, TransactionAlertType.PURCHASE_ALREADY_PAID);
                }
                if (code == 9998) {
                    JsonObject response = oKServerException.getResponse();
                    if (response != null && (jsonElement = response.get("msg")) != null && (asString = jsonElement.getAsString()) != null) {
                        try {
                            Result.Application application = Result.Companion;
                            Json.Default r2 = Json.Default;
                            r2.getSerializersModule();
                            kotlinx.serialization.json.JsonObject jsonObject = (kotlinx.serialization.json.JsonObject) r2.decodeFromString(kotlinx.serialization.json.JsonObject.Companion.serializer(), asString);
                            int i = java.lang.Integer.parseInt(java.lang.String.valueOf(jsonObject.get((java.lang.Object) "code")));
                            java.lang.Object obj = jsonObject.get((java.lang.Object) "msg");
                            JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
                            return new OtherBizLineServerException(oKServerException, i, jsonPrimitive != null ? jsonPrimitive.getContent() : null);
                        } catch (java.lang.Throwable th) {
                            Result.Application application2 = Result.Companion;
                            Result.m7376boximpl(Result.m7377constructorimpl(C56391yDq.EZpvd(th)));
                        }
                    }
                }
                TransactionAlertType transactionAlertTypeEZpvd = TransactionAlertType.Companion.EZpvd(oKServerException.getCode());
                return transactionAlertTypeEZpvd != null ? new TransactionServerException(oKServerException, transactionAlertTypeEZpvd) : oKServerException;
            }
        }
        return new GeneralServerException(oKServerException);
    }
}
