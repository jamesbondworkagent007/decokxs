package o;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xZt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54907xZt {
    public static /* synthetic */ java.lang.String encodeToString$default(SerializationStrategy serializationStrategy, java.lang.Object obj, boolean z, int i, java.lang.Object obj2) {
        if ((i & 2) != 0) {
            z = false;
        }
        return EZpvd(serializationStrategy, obj, z);
    }

    public static final <T> java.lang.String EZpvd(@NotNull SerializationStrategy<? super T> serializationStrategy, T t, boolean z) {
        Intrinsics.checkNotNullParameter(serializationStrategy, "");
        return copydefault(z).encodeToString(serializationStrategy, t);
    }

    public static final <T> T OLrzqt(@NotNull DeserializationStrategy<? extends T> deserializationStrategy, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        Intrinsics.checkNotNullParameter(str, "");
        return (T) buildDefaultJson$default(false, 1, null).decodeFromString(deserializationStrategy, str);
    }

    public static /* synthetic */ Json buildDefaultJson$default(boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return copydefault(z);
    }

    public static final Json copydefault(final boolean z) {
        return JsonKt.Json$default(null, new Function1() { // from class: o.xZx
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C54907xZt.EZpvd(z, (JsonBuilder) obj);
            }
        }, 1, null);
    }

    public static final Unit EZpvd(boolean z, JsonBuilder jsonBuilder) {
        Intrinsics.checkNotNullParameter(jsonBuilder, "");
        jsonBuilder.setEncodeDefaults(z);
        jsonBuilder.setIgnoreUnknownKeys(true);
        jsonBuilder.setLenient(true);
        jsonBuilder.setUseArrayPolymorphism(true);
        return Unit.INSTANCE;
    }
}
