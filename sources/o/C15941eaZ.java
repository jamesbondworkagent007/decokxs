package o;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eaZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C15941eaZ extends JsonContentPolymorphicSerializer<WalletEvent> {
    public static final C15941eaZ OLrzqt = new C15941eaZ();

    private C15941eaZ() {
        super(C56524yIo.AEQbTJ(WalletEvent.class));
    }

    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    public DeserializationStrategy<WalletEvent> selectDeserializer(@NotNull JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(jsonElement, "");
        JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get((java.lang.Object) FirebaseAnalytics.Param.METHOD);
        java.lang.String content = (jsonElement2 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : jsonPrimitive.getContent();
        if (content != null) {
            int iHashCode = content.hashCode();
            if (iHashCode != -808593805) {
                if (iHashCode != 530405532) {
                    if (iHashCode == 951351530 && content.equals("connect")) {
                        return WalletEvent.ConnectSuccess.Companion.serializer();
                    }
                } else if (content.equals("disconnect")) {
                    return WalletEvent.Disconnect.Companion.serializer();
                }
            } else if (content.equals("connect_error")) {
                return WalletEvent.ConnectError.Companion.serializer();
            }
        }
        throw new java.lang.IllegalArgumentException(content + " should not exist");
    }
}
