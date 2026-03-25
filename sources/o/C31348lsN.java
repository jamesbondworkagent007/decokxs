package o;

import com.okinc.business.web3pay.lib.features.uop.model.CreateSaUopResponse;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31348lsN {
    public static final C31264lqj EZpvd(@NotNull CreateSaUopResponse createSaUopResponse) {
        Intrinsics.checkNotNullParameter(createSaUopResponse, "");
        boolean need2FA = createSaUopResponse.getNeed2FA();
        java.lang.String uopHash = createSaUopResponse.getUopHash();
        JsonElement serverOption = createSaUopResponse.getServerOption();
        C31269lqo c31269lqo = C31269lqo.OLrzqt;
        return new C31264lqj(need2FA, uopHash, serverOption, c31269lqo.EZpvd(createSaUopResponse.getTransactionOperations()), c31269lqo.copydefault(createSaUopResponse.getTransactionOperations()), createSaUopResponse.getMfaSessionId());
    }
}
