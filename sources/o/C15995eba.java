package o;

import com.okinc.business.defi.wallet.common.okxconnect.model.dapp.DAppConnectRequest;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import kotlinx.serialization.json.JsonPrimitive;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.eba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C15995eba extends JsonContentPolymorphicSerializer<DAppConnectRequest.Request> {
    public static final C15995eba copydefault = new C15995eba();

    private C15995eba() {
        super(C56524yIo.AEQbTJ(DAppConnectRequest.Request.class));
    }

    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    public DeserializationStrategy<DAppConnectRequest.Request> selectDeserializer(@NotNull JsonElement jsonElement) {
        JsonPrimitive jsonPrimitive;
        Intrinsics.checkNotNullParameter(jsonElement, "");
        JsonElement jsonElement2 = (JsonElement) JsonElementKt.getJsonObject(jsonElement).get((java.lang.Object) "name");
        java.lang.String content = (jsonElement2 == null || (jsonPrimitive = JsonElementKt.getJsonPrimitive(jsonElement2)) == null) ? null : jsonPrimitive.getContent();
        if (content != null) {
            int iHashCode = content.hashCode();
            if (iHashCode != -1660001448) {
                if (iHashCode != -1023840419) {
                    if (iHashCode == 451875733 && content.equals("requestAccounts")) {
                        return DAppConnectRequest.Request.RequestAccounts.Companion.serializer();
                    }
                } else if (content.equals("ton_addr")) {
                    return DAppConnectRequest.Request.TonAddress.Companion.serializer();
                }
            } else if (content.equals("ton_proof")) {
                return DAppConnectRequest.Request.TonProof.Companion.serializer();
            }
        }
        return DAppConnectRequest.Request.Unknown.Companion.serializer();
    }
}
