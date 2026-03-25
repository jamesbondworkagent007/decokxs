package o;

import com.okinc.wallet.core.sign.ECDSA;
import com.okinc.wallet.core.sign.ED25519;
import com.okinc.wallet.core.sign.InvokeMethodParams;
import com.okinc.wallet.core.sign.MPCeCDSAToHEX;
import com.okinc.wallet.core.sign.RawData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.UnsignedTx;
import com.okinc.wallet.core.sign.VerifyMessageParams;
import com.okinc.wallet.core.sign.VerifyMessageResult;
import com.okinc.wallet.core.sign.utxo.ARCBuyTransactionResult;
import com.okinc.wallet.core.sign.utxo.BRC20TransactionResult;
import com.okinc.wallet.core.sign.utxo.RuneMainMintTransactionResult;
import com.okinc.wallet.core.sign.utxo.RunesMainBuyTransactionResult;
import com.okinc.wallet.core.sign.utxo.RunesTransactionResult;
import com.okinc.wallet.core.sign.utxo.UTXOTransaction;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import kotlin.Result;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class xYU {
    public static final xYU copydefault = new xYU();

    private xYU() {
    }

    public final java.lang.String AYXKKw(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        return xXV.KWHzl.DbNXlk(transactionParams);
    }

    public final BRC20TransactionResult EZpvd(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        return xXV.KWHzl.values(transactionParams);
    }

    public final XRC20TransactionResult copydefault(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        return xXV.KWHzl.djBIcL(transactionParams);
    }

    public final ARCBuyTransactionResult OLrzqt(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        return xXV.KWHzl.valueOf(transactionParams);
    }

    public final XRC20TransactionResult valueOf(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        return xXV.KWHzl.AkhnZx(transactionParams);
    }

    public final RunesTransactionResult djBIcL(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        return xXV.KWHzl.fetchVPNInfo(transactionParams);
    }

    public final RuneMainMintTransactionResult gEmmrt(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        return xXV.KWHzl.isConnected(transactionParams);
    }

    public final java.lang.String KWHzl(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        return xXV.KWHzl.AEQbTJ(transactionParams);
    }

    public final RunesMainBuyTransactionResult AEQbTJ(@NotNull TransactionParams transactionParams) {
        Intrinsics.checkNotNullParameter(transactionParams, "");
        return xXV.KWHzl.copydefault(transactionParams);
    }

    public final java.lang.String KWHzl(@NotNull ECDSA ecdsa) {
        Intrinsics.checkNotNullParameter(ecdsa, "");
        return xXV.KWHzl.KWHzl(ecdsa);
    }

    public final java.lang.String copydefault(@NotNull MPCeCDSAToHEX mPCeCDSAToHEX) {
        Intrinsics.checkNotNullParameter(mPCeCDSAToHEX, "");
        return xXV.KWHzl.OLrzqt(mPCeCDSAToHEX);
    }

    public final java.lang.String OLrzqt(@NotNull ED25519 ed25519) {
        Intrinsics.checkNotNullParameter(ed25519, "");
        return xXV.KWHzl.AEQbTJ(ed25519);
    }

    public final java.lang.String AEQbTJ(@NotNull SignParams signParams, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(str, "");
        return AEQbTJ(InvokeMethodParams.Companion.EZpvd("signCommonMessage", signParams, C56423yEv.EZpvd(C56390yDp.OLrzqt("signContent", str))));
    }

    public final VerifyMessageResult KWHzl(@NotNull SignParams signParams, @NotNull VerifyMessageParams verifyMessageParams) {
        java.lang.Object objM7377constructorimpl;
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(verifyMessageParams, "");
        java.lang.String strEZpvd = EZpvd(InvokeMethodParams.Companion.EZpvd("verifyMessage", signParams, verifyMessageParams));
        try {
            Result.Application application = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl((VerifyMessageResult) C54907xZt.OLrzqt(VerifyMessageResult.Companion.serializer(), strEZpvd));
        } catch (java.lang.Throwable th) {
            Result.Application application2 = Result.Companion;
            objM7377constructorimpl = Result.m7377constructorimpl(C56391yDq.EZpvd(th));
        }
        VerifyMessageResult verifyMessageResult = new VerifyMessageResult(false, 1, (DefaultConstructorMarker) null);
        if (Result.m7383isFailureimpl(objM7377constructorimpl)) {
            objM7377constructorimpl = verifyMessageResult;
        }
        return (VerifyMessageResult) objM7377constructorimpl;
    }

    public final TxMessage AEQbTJ(@NotNull UnsignedTx unsignedTx) {
        Intrinsics.checkNotNullParameter(unsignedTx, "");
        return xXV.KWHzl.copydefault(unsignedTx);
    }

    public final java.lang.String AEQbTJ(@NotNull RawData rawData) {
        Intrinsics.checkNotNullParameter(rawData, "");
        return xXV.KWHzl.copydefault(rawData);
    }

    public final java.lang.String KWHzl(@NotNull UnsignedTx unsignedTx) {
        Intrinsics.checkNotNullParameter(unsignedTx, "");
        return xXV.KWHzl.OLrzqt(unsignedTx);
    }

    public final java.lang.String copydefault(@NotNull RawData rawData) {
        Intrinsics.checkNotNullParameter(rawData, "");
        return xXV.KWHzl.EZpvd(rawData);
    }

    public final java.lang.String AEQbTJ(@NotNull InvokeMethodParams invokeMethodParams) {
        Intrinsics.checkNotNullParameter(invokeMethodParams, "");
        return xXV.KWHzl.KWHzl(invokeMethodParams);
    }

    public final java.lang.String EZpvd(@NotNull InvokeMethodParams invokeMethodParams) {
        Intrinsics.checkNotNullParameter(invokeMethodParams, "");
        return xXV.KWHzl.AEQbTJ(invokeMethodParams);
    }

    public final java.lang.String KWHzl(@NotNull UTXOTransaction uTXOTransaction) {
        Intrinsics.checkNotNullParameter(uTXOTransaction, "");
        return xXV.KWHzl.KWHzl(uTXOTransaction);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xXV.KWHzl.AkhnZx(str);
    }

    public final java.lang.String AEQbTJ(@NotNull UTXOTransaction uTXOTransaction) {
        Intrinsics.checkNotNullParameter(uTXOTransaction, "");
        return xXV.KWHzl.copydefault(uTXOTransaction);
    }
}
