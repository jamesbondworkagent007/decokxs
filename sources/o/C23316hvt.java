package o;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonElement;
import o.C33489mxS;
import o.C56391yDq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hvt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C23316hvt {
    public static final Gson KWHzl;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static final Gson KWHzl() {
        return KWHzl;
    }

    static {
        Gson gsonCreate = new GsonBuilder().registerTypeAdapter(JsonElement.class, new JsonDeserializer<JsonElement>() { // from class: com.okinc.business.dexlogic.utils.JsonUtils$gson$1
            /* JADX DEBUG: Method merged with bridge method: deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;Lcom/google/gson/JsonDeserializationContext;)Ljava/lang/Object; */
            @Override // com.google.gson.JsonDeserializer
            /* JADX INFO: renamed from: copydefault, reason: merged with bridge method [inline-methods] */
            public JsonElement deserialize(com.google.gson.JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
                Object objM7377constructorimpl;
                try {
                    Result.Application application = Result.Companion;
                    String json = new Gson().toJson(jsonElement);
                    objM7377constructorimpl = Result.m7377constructorimpl(json != null ? (JsonElement) C33489mxS.KWHzl.OLrzqt((DeserializationStrategy) JsonElement.Companion.serializer(), json) : null);
                } catch (Throwable th) {
                    Result.Application application2 = Result.Companion;
                    objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
                }
                return (JsonElement) (Result.m7383isFailureimpl(objM7377constructorimpl) ? null : objM7377constructorimpl);
            }
        }).registerTypeAdapter(JsonElement.class, new JsonSerializer<JsonElement>() { // from class: com.okinc.business.dexlogic.utils.JsonUtils$gson$2
            /* JADX DEBUG: Method merged with bridge method: serialize(Ljava/lang/Object;Ljava/lang/reflect/Type;Lcom/google/gson/JsonSerializationContext;)Lcom/google/gson/JsonElement; */
            @Override // com.google.gson.JsonSerializer
            /* JADX INFO: renamed from: OLrzqt, reason: merged with bridge method [inline-methods] */
            public com.google.gson.JsonElement serialize(JsonElement jsonElement, Type type, JsonSerializationContext jsonSerializationContext) {
                if (jsonElement == null) {
                    return null;
                }
                return (com.google.gson.JsonElement) new Gson().fromJson(C33489mxS.KWHzl.KWHzl(JsonElement.Companion.serializer(), jsonElement), com.google.gson.JsonElement.class);
            }
        }).create();
        Intrinsics.checkNotNullExpressionValue(gsonCreate, "");
        KWHzl = gsonCreate;
    }

    public static final java.lang.String OLrzqt(@NotNull java.lang.Object obj) {
        java.lang.Object objM7377constructorimpl;
        java.lang.Object obj2 = "";
        Intrinsics.checkNotNullParameter(obj, "");
        JsonElement.Companion companion = JsonElement.Companion;
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(KWHzl.toJson(obj));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        java.lang.Throwable thM7380exceptionOrNullimpl = Result.m7380exceptionOrNullimpl(objM7377constructorimpl);
        if (thM7380exceptionOrNullimpl == null) {
            obj2 = objM7377constructorimpl;
        } else {
            pUU.AEQbTJ("JsonExt", "toJson parse error", thM7380exceptionOrNullimpl);
        }
        return (java.lang.String) obj2;
    }
}
