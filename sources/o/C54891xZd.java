package o;

import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.near.NearTokenTransaction;
import com.okinc.wallet.core.sign.near.NearTransaction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xZd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54891xZd {
    public static final C54891xZd AEQbTJ = new C54891xZd();

    private C54891xZd() {
    }

    public final SignedTx EZpvd(@NotNull SignParams signParams, @NotNull NearTransaction nearTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(nearTransaction, "");
        return SignedTx.Companion.KWHzl(xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, nearTransaction)));
    }

    public final SignedTx OLrzqt(@NotNull SignParams signParams, @NotNull NearTokenTransaction nearTokenTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(nearTokenTransaction, "");
        return SignedTx.Companion.KWHzl(xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, nearTokenTransaction)));
    }
}
