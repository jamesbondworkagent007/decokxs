package o;

import com.okinc.wallet.core.sign.InvokeMethodParams;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.zksync.ZKSyncChangePubKeyTransaction;
import com.okinc.wallet.core.sign.zksync.ZKSyncTransaction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xZp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54903xZp {
    public static final C54903xZp OLrzqt = new C54903xZp();

    private C54903xZp() {
    }

    public final SignedTx copydefault(@NotNull SignParams signParams, @NotNull ZKSyncTransaction zKSyncTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(zKSyncTransaction, "");
        return SignedTx.Companion.KWHzl(xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, zKSyncTransaction)));
    }

    public final SignedTx AEQbTJ(@NotNull SignParams signParams, @NotNull ZKSyncChangePubKeyTransaction zKSyncChangePubKeyTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(zKSyncChangePubKeyTransaction, "");
        return SignedTx.Companion.KWHzl(xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("changePubKey", signParams, zKSyncChangePubKeyTransaction)));
    }
}
