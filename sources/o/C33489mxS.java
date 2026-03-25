package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonKt;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mxS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C33489mxS {
    public static final C33489mxS KWHzl = new C33489mxS();

    private C33489mxS() {
    }

    public final Json AEQbTJ() {
        return JsonKt.Json$default(null, new Function1() { // from class: o.mxW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C33489mxS.EZpvd((JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(false);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setUseArrayPolymorphism(true);
        return Unit.INSTANCE;
    }

    public final <T> T OLrzqt(@NotNull DeserializationStrategy<? extends T> deserializationStrategy, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        Intrinsics.checkNotNullParameter(str, "");
        return (T) AEQbTJ().decodeFromString(deserializationStrategy, str);
    }

    public final <T> java.lang.String KWHzl(@NotNull SerializationStrategy<? super T> serializationStrategy, T t) {
        Intrinsics.checkNotNullParameter(serializationStrategy, "");
        return AEQbTJ().encodeToString(serializationStrategy, t);
    }

    public final <T> JsonObject OLrzqt(@NotNull SerializationStrategy<? super T> serializationStrategy, T t) {
        Intrinsics.checkNotNullParameter(serializationStrategy, "");
        return JsonElementKt.getJsonObject(AEQbTJ().encodeToJsonElement(serializationStrategy, t));
    }
}
