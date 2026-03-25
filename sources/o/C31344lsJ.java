package o;

import com.okinc.business.web3pay.lib.features.onchaintransaction.model.OnChainTransferInfo;
import com.okinc.business.web3pay.lib.features.uop.model.CreateOnChainTransferUopResponse;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsJ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31344lsJ {
    public static final OnChainTransferInfo KWHzl(@NotNull CreateOnChainTransferUopResponse createOnChainTransferUopResponse) {
        Intrinsics.checkNotNullParameter(createOnChainTransferUopResponse, "");
        boolean need2FA = createOnChainTransferUopResponse.getNeed2FA();
        java.lang.String uopHash = createOnChainTransferUopResponse.getUopHash();
        JsonElement serverOption = createOnChainTransferUopResponse.getServerOption();
        C31269lqo c31269lqo = C31269lqo.OLrzqt;
        return new OnChainTransferInfo(need2FA, uopHash, serverOption, c31269lqo.copydefault(createOnChainTransferUopResponse.getTransactionOperations()), c31269lqo.EZpvd(createOnChainTransferUopResponse.getTransactionOperations()), createOnChainTransferUopResponse.getMfaSessionId());
    }
}
