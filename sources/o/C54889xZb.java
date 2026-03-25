package o;

import com.okinc.wallet.core.sign.InvokeMethodParams;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.eos.EosNewAccountTransaction;
import com.okinc.wallet.core.sign.eos.EosTransaction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xZb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54889xZb {
    public static final C54889xZb AEQbTJ = new C54889xZb();

    private C54889xZb() {
    }

    public final java.lang.String AEQbTJ(@NotNull SignParams signParams, @NotNull EosTransaction eosTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(eosTransaction, "");
        return xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, eosTransaction));
    }

    public final java.lang.String copydefault(@NotNull SignParams signParams, @NotNull EosNewAccountTransaction eosNewAccountTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(eosNewAccountTransaction, "");
        return xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("newaccount", signParams, eosNewAccountTransaction));
    }
}
