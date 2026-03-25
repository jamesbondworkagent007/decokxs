package o;

import com.okinc.business.defi.wallet.passkey.common.ws.bean.TxStatusSubResponse;
import com.okinc.business.defi.wallet.passkey.common.ws.service.PasskeyWalletWSService$getWebSocketFlow$1;
import com.okinc.websocket.v5config.web3.WsArgV5ForWeb3;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__ContextKt;
import kotlinx.serialization.DeserializationStrategy;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.fNr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@yCR
public final class C17663fNr {
    public final C17660fNo EZpvd;
    public final java.lang.String copydefault;

    @yCM
    public C17663fNr(@NotNull C17660fNo c17660fNo) {
        Intrinsics.checkNotNullParameter(c17660fNo, "");
        this.EZpvd = c17660fNo;
        this.copydefault = C17663fNr.class.getSimpleName();
    }

    public final Flow<TxStatusSubResponse> OLrzqt() {
        return KWHzl(yDY.copydefault(new WsArgV5ForWeb3("smart-account-pay-order", null, null, null, null, 30, null)), "smart-account-pay-order", false, TxStatusSubResponse.Companion.serializer());
    }

    public final <R> Flow<R> KWHzl(@NotNull java.util.ArrayList<WsArgV5ForWeb3> arrayList, @NotNull java.lang.String str, boolean z, @NotNull DeserializationStrategy<? extends R> deserializationStrategy) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(deserializationStrategy, "");
        java.lang.String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList, null, "[", "]", 0, null, new Function1() { // from class: o.fNt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C17663fNr.AEQbTJ((WsArgV5ForWeb3) obj);
            }
        }, 25, null);
        pUU.copydefault(this.copydefault, "websocket args = " + strJoinToString$default + " channel = " + str);
        return FlowKt__ContextKt.buffer$default(FlowKt.channelFlow(new PasskeyWalletWSService$getWebSocketFlow$1(str, this, z, arrayList, strJoinToString$default, deserializationStrategy, null)), Integer.MAX_VALUE, null, 2, null);
    }

    public static final java.lang.CharSequence AEQbTJ(WsArgV5ForWeb3 wsArgV5ForWeb3) {
        Intrinsics.checkNotNullParameter(wsArgV5ForWeb3, "");
        return "WsArgV5ForWeb3(instId=" + wsArgV5ForWeb3.getInstId() + ", channel=" + wsArgV5ForWeb3.getChannel() + ", extraParams=" + wsArgV5ForWeb3.getExtraParams() + ")";
    }
}
