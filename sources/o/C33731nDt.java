package o;

import com.okinc.business.web3pay.api.model.ClaimTransactionParams;
import com.okinc.rxutils.RxBus;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.nDt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C33731nDt implements RxBus.Application {
    public static final int OLrzqt = ClaimTransactionParams.$stable;
    public final ClaimTransactionParams copydefault;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ClaimTransactionParams AEQbTJ() {
        return this.copydefault;
    }

    @Override // com.okinc.rxutils.RxBus.Application
    public boolean check(java.lang.String str) {
        return true;
    }

    public C33731nDt(@NotNull ClaimTransactionParams claimTransactionParams) {
        Intrinsics.checkNotNullParameter(claimTransactionParams, "");
        this.copydefault = claimTransactionParams;
    }
}
