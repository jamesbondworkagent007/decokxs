package o;

import com.okinc.business.web3pay.lib.core.model.NetworkFeeInfo;
import com.okinc.business.web3pay.lib.features.uop.model.CreateUpdateAccountUopResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lsR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31352lsR {
    public static final C31332lry KWHzl(@NotNull CreateUpdateAccountUopResponse createUpdateAccountUopResponse) {
        Intrinsics.checkNotNullParameter(createUpdateAccountUopResponse, "");
        return new C31332lry(createUpdateAccountUopResponse.getServerOption(), createUpdateAccountUopResponse.getUopHash(), NetworkFeeInfo.Companion.EZpvd(createUpdateAccountUopResponse.getTransactionOperations()));
    }
}
