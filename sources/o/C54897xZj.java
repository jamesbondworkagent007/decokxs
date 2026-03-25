package o;

import com.okinc.wallet.core.sign.InvokeMethodParams;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.starknet.StarknetContractTransaction;
import com.okinc.wallet.core.sign.starknet.StarknetTransaction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xZj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54897xZj {
    public static final C54897xZj EZpvd = new C54897xZj();

    private C54897xZj() {
    }

    public final SignedTx AEQbTJ(@NotNull SignParams signParams, @NotNull StarknetTransaction starknetTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(starknetTransaction, "");
        return SignedTx.Companion.KWHzl(xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, starknetTransaction)));
    }

    public final SignedTx copydefault(@NotNull SignParams signParams, @NotNull StarknetTransaction starknetTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(starknetTransaction, "");
        return SignedTx.Companion.KWHzl(xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("createDeployAccountTx", signParams, starknetTransaction)));
    }

    public final SignedTx KWHzl(@NotNull SignParams signParams, @NotNull StarknetContractTransaction starknetContractTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(starknetContractTransaction, "");
        return SignedTx.Companion.KWHzl(xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("createMultiContractCallTx", signParams, starknetContractTransaction)));
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return xXV.KWHzl.fARcdN(str, str2);
    }
}
