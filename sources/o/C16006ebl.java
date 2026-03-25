package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.okinc.business.defi.wallet.common.okxconnect.network.rpc.RpcResponse;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ebl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C16006ebl extends JsonContentPolymorphicSerializer<RpcResponse> {
    public static final C16006ebl copydefault = new C16006ebl();

    private C16006ebl() {
        super(C56524yIo.AEQbTJ(RpcResponse.class));
    }

    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    public DeserializationStrategy<RpcResponse> selectDeserializer(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        JsonObject jsonObject = JsonElementKt.getJsonObject(jsonElement);
        if (jsonObject.containsKey((java.lang.Object) FirebaseAnalytics.Param.METHOD)) {
            java.lang.Object obj = jsonObject.get((java.lang.Object) FirebaseAnalytics.Param.METHOD);
            JsonPrimitive jsonPrimitive = obj instanceof JsonPrimitive ? (JsonPrimitive) obj : null;
            if (Intrinsics.EZpvd(jsonPrimitive != null ? jsonPrimitive.getContent() : null, (java.lang.Object) "disconnect")) {
                return RpcResponse.Disconnect.Companion.serializer();
            }
            return RpcResponse.Push.Companion.serializer();
        }
        if (jsonObject.containsKey((java.lang.Object) "hasMore")) {
            return RpcResponse.FetchSuccess.Companion.serializer();
        }
        if (jsonObject.containsKey((java.lang.Object) "result")) {
            java.lang.Object obj2 = jsonObject.get((java.lang.Object) "result");
            JsonPrimitive jsonPrimitive2 = obj2 instanceof JsonPrimitive ? (JsonPrimitive) obj2 : null;
            if ((jsonPrimitive2 != null ? JsonElementKt.getBooleanOrNull(jsonPrimitive2) : null) != null) {
                return RpcResponse.Success.Companion.serializer();
            }
            return RpcResponse.FetchSuccess.Companion.serializer();
        }
        if (jsonObject.containsKey((java.lang.Object) Constants.IPC_BUNDLE_KEY_SEND_ERROR)) {
            return RpcResponse.Error.Companion.serializer();
        }
        throw new java.lang.IllegalArgumentException("Unknown RpcResponse type");
    }
}
