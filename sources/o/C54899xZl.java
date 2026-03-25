package o;

import com.okinc.wallet.core.sign.InvokeMethodParams;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.stacks.StacksContractTransaction;
import com.okinc.wallet.core.sign.stacks.StacksTokenTransaction;
import com.okinc.wallet.core.sign.stacks.StacksTransaction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xZl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54899xZl {
    public static final C54899xZl AEQbTJ = new C54899xZl();

    private C54899xZl() {
    }

    public final java.lang.String EZpvd(@NotNull StacksTransaction stacksTransaction) {
        Intrinsics.checkNotNullParameter(stacksTransaction, "");
        return xXV.KWHzl.copydefault(stacksTransaction);
    }

    public final java.lang.String AEQbTJ(@NotNull StacksContractTransaction stacksContractTransaction) {
        Intrinsics.checkNotNullParameter(stacksContractTransaction, "");
        return xXV.KWHzl.AEQbTJ(stacksContractTransaction);
    }

    public final SignedTx OLrzqt(@NotNull SignParams signParams, @NotNull StacksTransaction stacksTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(stacksTransaction, "");
        return SignedTx.Companion.KWHzl(xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, stacksTransaction)));
    }

    public final SignedTx OLrzqt(@NotNull SignParams signParams, @NotNull StacksTokenTransaction stacksTokenTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(stacksTokenTransaction, "");
        return SignedTx.Companion.KWHzl(xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, stacksTokenTransaction)));
    }

    public final SignedTx AEQbTJ(@NotNull SignParams signParams, @NotNull StacksContractTransaction stacksContractTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(stacksContractTransaction, "");
        return SignedTx.Companion.KWHzl(xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("MakeContractCall", signParams, stacksContractTransaction)));
    }
}
