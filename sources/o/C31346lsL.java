package o;

import com.okinc.business.web3pay.lib.features.uop.model.CreateConvertUopResponse;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31346lsL {
    public static final C31345lsK copydefault(@NotNull CreateConvertUopResponse createConvertUopResponse) {
        Intrinsics.checkNotNullParameter(createConvertUopResponse, "");
        boolean need2FA = createConvertUopResponse.getNeed2FA();
        java.lang.String uopHash = createConvertUopResponse.getUopHash();
        JsonElement serverOption = createConvertUopResponse.getServerOption();
        C31269lqo c31269lqo = C31269lqo.OLrzqt;
        return new C31345lsK(need2FA, uopHash, serverOption, c31269lqo.EZpvd(createConvertUopResponse.getTransactionOperations()), c31269lqo.copydefault(createConvertUopResponse.getTransactionOperations()), createConvertUopResponse.getMfaSessionId());
    }
}
