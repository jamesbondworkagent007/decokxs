package o;

import com.okinc.wallet.hardware.impl.onekey.data.Response;
import com.okinc.wallet.hardware.impl.onekey.data.Success;
import com.okinc.wallet.hardware.impl.onekey.data.Unsuccessful;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ycs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C57146ycs extends JsonContentPolymorphicSerializer<Response> {
    public static final C57146ycs KWHzl = new C57146ycs();

    private C57146ycs() {
        super(C56524yIo.AEQbTJ(Response.class));
    }

    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    public DeserializationStrategy<Response> selectDeserializer(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        JsonObject jsonObject = jsonElement instanceof JsonObject ? (JsonObject) jsonElement : null;
        JsonElement jsonElement2 = jsonObject != null ? (JsonElement) jsonObject.get((java.lang.Object) "success") : null;
        JsonPrimitive jsonPrimitive = jsonElement2 instanceof JsonPrimitive ? (JsonPrimitive) jsonElement2 : null;
        java.lang.Boolean booleanOrNull = jsonPrimitive != null ? JsonElementKt.getBooleanOrNull(jsonPrimitive) : null;
        if (booleanOrNull == null) {
            throw new java.lang.IllegalArgumentException("`success` is not in `element`");
        }
        if (Intrinsics.EZpvd(booleanOrNull, java.lang.Boolean.TRUE)) {
            return Success.Companion.serializer();
        }
        if (Intrinsics.EZpvd(booleanOrNull, java.lang.Boolean.FALSE)) {
            return Unsuccessful.Companion.serializer();
        }
        throw new NoWhenBranchMatchedException();
    }
}
