package o;

import com.google.firebase.messaging.Constants;
import com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eaY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15940eaY extends JsonContentPolymorphicSerializer<WalletEvent.ConnectSuccess.Payload.Response> {
    public static final C15940eaY OLrzqt = new C15940eaY();

    private C15940eaY() {
        super(C56524yIo.AEQbTJ(WalletEvent.ConnectSuccess.Payload.Response.class));
    }

    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    public DeserializationStrategy<WalletEvent.ConnectSuccess.Payload.Response> selectDeserializer(@NotNull JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(jsonElement, "");
        if (JsonElementKt.getJsonObject(jsonElement).get((java.lang.Object) Constants.IPC_BUNDLE_KEY_SEND_ERROR) != null) {
            return WalletEvent.ConnectSuccess.Payload.Response.Error.Companion.serializer();
        }
        JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get((java.lang.Object) "name");
        java.lang.String content = (jsonElement2 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : jsonPrimitive.getContent();
        if (content != null) {
            int iHashCode = content.hashCode();
            if (iHashCode != -1660001448) {
                if (iHashCode != -1023840419) {
                    if (iHashCode == 451875733 && content.equals("requestAccounts")) {
                        return WalletEvent.ConnectSuccess.Payload.Response.Accounts.Companion.serializer();
                    }
                } else if (content.equals("ton_addr")) {
                    return WalletEvent.ConnectSuccess.Payload.Response.TonAddress.Companion.serializer();
                }
            } else if (content.equals("ton_proof")) {
                return WalletEvent.ConnectSuccess.Payload.Response.TonProof.Companion.serializer();
            }
        }
        throw new java.lang.IllegalArgumentException(content + " should not exist");
    }
}
