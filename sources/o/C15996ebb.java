package o;

import com.google.firebase.messaging.Constants;
import com.okinc.business.defi.wallet.common.okxconnect.model.wallet.WalletEvent;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.json.JsonContentPolymorphicSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ebb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C15996ebb extends JsonContentPolymorphicSerializer<WalletEvent.ConnectSuccess.Payload.Response.Accounts.ConnectRequestMethodResponse> {
    public static final C15996ebb copydefault = new C15996ebb();

    private C15996ebb() {
        super(C56524yIo.AEQbTJ(WalletEvent.ConnectSuccess.Payload.Response.Accounts.ConnectRequestMethodResponse.class));
    }

    @Override // kotlinx.serialization.json.JsonContentPolymorphicSerializer
    public DeserializationStrategy<WalletEvent.ConnectSuccess.Payload.Response.Accounts.ConnectRequestMethodResponse> selectDeserializer(@NotNull JsonElement jsonElement) {
        Intrinsics.checkNotNullParameter(jsonElement, "");
        if (JsonElementKt.getJsonObject(jsonElement).get((java.lang.Object) Constants.IPC_BUNDLE_KEY_SEND_ERROR) != null) {
            return WalletEvent.ConnectSuccess.Payload.Response.Accounts.ConnectRequestMethodResponse.Error.Companion.serializer();
        }
        return WalletEvent.ConnectSuccess.Payload.Response.Accounts.ConnectRequestMethodResponse.Success.Companion.serializer();
    }
}
