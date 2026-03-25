package o;

import com.okinc.wallet.core.sign.InvokeMethodParams;
import com.okinc.wallet.core.sign.RawData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.UnsignedTx;
import com.okinc.wallet.core.sign.cosmos.CosmosIBCTransaction;
import com.okinc.wallet.core.sign.cosmos.CosmosSignDocTransaction;
import com.okinc.wallet.core.sign.cosmos.CosmosSignMessageTransaction;
import com.okinc.wallet.core.sign.cosmos.CosmosSignatureRawValue;
import com.okinc.wallet.core.sign.cosmos.CosmosSignedTx;
import com.okinc.wallet.core.sign.cosmos.CosmosTransaction;
import com.okinc.wallet.core.sign.cosmos.CosmosTransactionData;
import com.okinc.wallet.core.sign.cosmos.RSVSignatureRawValue;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xYV {
    public static final xYV copydefault = new xYV();

    private xYV() {
    }

    public final CosmosSignedTx OLrzqt(@NotNull SignParams signParams, @NotNull CosmosTransaction cosmosTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(cosmosTransaction, "");
        return CosmosSignedTx.Companion.EZpvd(xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, cosmosTransaction)));
    }

    public final CosmosSignedTx AEQbTJ(@NotNull SignParams signParams, @NotNull CosmosIBCTransaction cosmosIBCTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(cosmosIBCTransaction, "");
        return CosmosSignedTx.Companion.EZpvd(xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("ibcTransfer", signParams, cosmosIBCTransaction)));
    }

    public final CosmosSignedTx AEQbTJ(@NotNull SignParams signParams, @NotNull CosmosSignMessageTransaction cosmosSignMessageTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(cosmosSignMessageTransaction, "");
        return CosmosSignedTx.Companion.EZpvd(xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("signMessage", signParams, cosmosSignMessageTransaction)));
    }

    public final java.lang.String copydefault(@NotNull SignParams signParams, @NotNull CosmosSignMessageTransaction cosmosSignMessageTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(cosmosSignMessageTransaction, "");
        return xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("signAminoMessage", signParams, cosmosSignMessageTransaction));
    }

    public final CosmosSignedTx OLrzqt(@NotNull SignParams signParams, @NotNull CosmosSignDocTransaction cosmosSignDocTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(cosmosSignDocTransaction, "");
        return CosmosSignedTx.Companion.EZpvd(xYU.copydefault.AEQbTJ(InvokeMethodParams.Companion.EZpvd("signDoc", signParams, cosmosSignDocTransaction)));
    }

    public final TxMessage AEQbTJ(@NotNull java.lang.String str, @NotNull CosmosTransactionData cosmosTransactionData, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(cosmosTransactionData, "");
        return xXV.KWHzl.KWHzl(str, cosmosTransactionData, i);
    }

    public final java.lang.String EZpvd(long j, @NotNull CosmosTransaction cosmosTransaction) {
        Intrinsics.checkNotNullParameter(cosmosTransaction, "");
        return xYU.copydefault.KWHzl(new UnsignedTx(j, 0L, null, cosmosTransaction, 0, false, 50, null));
    }

    public final CosmosSignedTx AEQbTJ(long j, @NotNull CosmosSignatureRawValue cosmosSignatureRawValue) {
        Intrinsics.checkNotNullParameter(cosmosSignatureRawValue, "");
        return CosmosSignedTx.Companion.EZpvd(xYU.copydefault.copydefault(new RawData(j, 0L, cosmosSignatureRawValue, false, 0, 26, null)));
    }

    public final TxMessage AEQbTJ(long j, @NotNull CosmosTransaction cosmosTransaction) {
        Intrinsics.checkNotNullParameter(cosmosTransaction, "");
        return xYU.copydefault.AEQbTJ(new UnsignedTx(j, 0L, null, cosmosTransaction, 0, false, 50, null));
    }

    public final CosmosSignedTx EZpvd(long j, @NotNull RSVSignatureRawValue rSVSignatureRawValue) {
        Intrinsics.checkNotNullParameter(rSVSignatureRawValue, "");
        return CosmosSignedTx.Companion.EZpvd(xYU.copydefault.AEQbTJ(new RawData(j, 0L, rSVSignatureRawValue, false, 0, 26, null)));
    }
}
