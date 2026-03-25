package o;

import com.okinc.business.web3pay.lib.features.account.data.model.UserKycInfoResponse;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lqB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C31230lqB {
    public static final C31233lqE EZpvd(@NotNull UserKycInfoResponse userKycInfoResponse) {
        Intrinsics.checkNotNullParameter(userKycInfoResponse, "");
        return new C31233lqE(userKycInfoResponse.getMaskedName());
    }
}
