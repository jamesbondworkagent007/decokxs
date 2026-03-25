package o;

import com.okinc.wallet.core.sign.InvokeMethodParams;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.cardano.CardanoMinAdaTransaction;
import com.okinc.wallet.core.sign.cardano.CardanoSignedMinFee;
import com.okinc.wallet.core.sign.cardano.CardanoTransaction;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xYY {
    public static final xYY copydefault = new xYY();

    private xYY() {
    }

    public final java.lang.String OLrzqt(@NotNull SignParams signParams, @NotNull CardanoTransaction cardanoTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(cardanoTransaction, "");
        return xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, cardanoTransaction));
    }

    public final java.lang.String AEQbTJ(@NotNull SignParams signParams, @NotNull CardanoMinAdaTransaction cardanoMinAdaTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(cardanoMinAdaTransaction, "");
        return xYU.copydefault.EZpvd(InvokeMethodParams.Companion.EZpvd("minAda", signParams, cardanoMinAdaTransaction));
    }

    public final CardanoSignedMinFee AEQbTJ(@NotNull SignParams signParams, @NotNull CardanoTransaction cardanoTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(cardanoTransaction, "");
        return CardanoSignedMinFee.Companion.OLrzqt(xYU.copydefault.EZpvd(InvokeMethodParams.Companion.EZpvd("minFee", signParams, cardanoTransaction)));
    }
}
