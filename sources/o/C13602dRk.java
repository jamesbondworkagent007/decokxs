package o;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonObjectBuilder;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.dRk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C13602dRk {
    public final Json copydefault;

    @yCM
    public C13602dRk(@NotNull Json json) {
        Intrinsics.checkNotNullParameter(json, "");
        this.copydefault = json;
    }

    public final java.lang.Object copydefault(android.os.Bundle bundle) {
        java.lang.String string;
        try {
            try {
                Result.Application application = Result.Companion;
                java.lang.String strEncodeToString = "";
                if (bundle != null && bundle.getInt("result") != 0 && (string = bundle.getString("data")) != null && string.length() != 0) {
                    if (bundle.getBoolean("tx_isbatch")) {
                        java.lang.String string2 = bundle.getString("tx_id");
                        if (string2 == null) {
                            string2 = "";
                        }
                        try {
                            Json json = this.copydefault;
                            json.getSerializersModule();
                            JsonObject.Companion companion = JsonObject.Companion;
                            JsonObject jsonObject = (JsonObject) json.decodeFromString(companion.serializer(), string2);
                            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
                            jsonObjectBuilder.put("txHash", JsonElementKt.JsonPrimitive(string));
                            jsonObjectBuilder.put("orderIds", JsonElementKt.JsonPrimitive(""));
                            JsonElement jsonElement = (JsonElement) jsonObject.get((java.lang.Object) "batchId");
                            if (jsonElement != null) {
                                jsonObjectBuilder.put("batchId", jsonElement);
                            }
                            JsonObject jsonObjectBuild = jsonObjectBuilder.build();
                            Json json2 = this.copydefault;
                            json2.getSerializersModule();
                            strEncodeToString = json2.encodeToString(companion.serializer(), jsonObjectBuild);
                        } catch (java.lang.Exception unused) {
                            strEncodeToString = string;
                        }
                    }
                    strEncodeToString = string;
                }
                return Result.m7377constructorimpl(strEncodeToString);
            } catch (java.lang.Throwable th) {
                Result.Application application2 = Result.Companion;
                return Result.m7377constructorimpl(C56391yDq.EZpvd(th));
            }
        } catch (CancellationException e) {
            throw e;
        }
    }
}
