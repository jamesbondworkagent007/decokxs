package o;

import com.okinc.wallet.core.decode.PsbtDecodeItem;
import com.okinc.wallet.core.decode.PsbtDecodeNewItem;
import com.okinc.wallet.core.decode.PsbtDecodeParams;
import com.okinc.wallet.core.decode.PsbtDecodeParamsNew;
import com.okinc.wallet.core.other.CalUTXOInfo;
import com.okinc.wallet.core.sign.RawData;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.TransactionParams;
import com.okinc.wallet.core.sign.TxMessage;
import com.okinc.wallet.core.sign.UnsignedTx;
import com.okinc.wallet.core.sign.utxo.ARC20Transaction;
import com.okinc.wallet.core.sign.utxo.ARCBuyTransaction;
import com.okinc.wallet.core.sign.utxo.ARCBuyTransactionResult;
import com.okinc.wallet.core.sign.utxo.BRC20Buyer;
import com.okinc.wallet.core.sign.utxo.BRC20Transaction;
import com.okinc.wallet.core.sign.utxo.BRC20TransactionResult;
import com.okinc.wallet.core.sign.utxo.BTCSignatureRawValue;
import com.okinc.wallet.core.sign.utxo.DummySignedTx;
import com.okinc.wallet.core.sign.utxo.MPCBRC20PsbtResult;
import com.okinc.wallet.core.sign.utxo.MPCBtcMessage;
import com.okinc.wallet.core.sign.utxo.MPCRawPsbtTx;
import com.okinc.wallet.core.sign.utxo.RuneMainMintTransactionParams;
import com.okinc.wallet.core.sign.utxo.RuneMainMintTransactionResult;
import com.okinc.wallet.core.sign.utxo.RunesMainBuyTransaction;
import com.okinc.wallet.core.sign.utxo.RunesMainBuyTransactionResult;
import com.okinc.wallet.core.sign.utxo.RunesMainTransaction;
import com.okinc.wallet.core.sign.utxo.RunesTransaction;
import com.okinc.wallet.core.sign.utxo.RunesTransactionResult;
import com.okinc.wallet.core.sign.utxo.SRC20Transaction;
import com.okinc.wallet.core.sign.utxo.UTXOTransaction;
import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.xZq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C54904xZq {
    public static final C54904xZq copydefault = new C54904xZq();

    private C54904xZq() {
    }

    public final java.lang.String copydefault(@NotNull SignParams signParams, @NotNull UTXOTransaction uTXOTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(uTXOTransaction, "");
        return xYU.copydefault.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, uTXOTransaction));
    }

    public final BRC20TransactionResult AEQbTJ(@NotNull SignParams signParams, @NotNull BRC20Transaction bRC20Transaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(bRC20Transaction, "");
        return xYU.copydefault.EZpvd(TransactionParams.Companion.AEQbTJ(signParams, bRC20Transaction));
    }

    public final XRC20TransactionResult copydefault(@NotNull SignParams signParams, @NotNull ARC20Transaction aRC20Transaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(aRC20Transaction, "");
        return xYU.copydefault.copydefault(TransactionParams.Companion.AEQbTJ(signParams, aRC20Transaction));
    }

    public final ARCBuyTransactionResult OLrzqt(@NotNull SignParams signParams, @NotNull ARCBuyTransaction aRCBuyTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(aRCBuyTransaction, "");
        return xYU.copydefault.OLrzqt(TransactionParams.Companion.AEQbTJ(signParams, aRCBuyTransaction));
    }

    public final XRC20TransactionResult copydefault(@NotNull SignParams signParams, @NotNull SRC20Transaction sRC20Transaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(sRC20Transaction, "");
        return xYU.copydefault.valueOf(TransactionParams.Companion.AEQbTJ(signParams, sRC20Transaction));
    }

    public final RunesTransactionResult copydefault(@NotNull SignParams signParams, @NotNull RunesTransaction runesTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(runesTransaction, "");
        return xYU.copydefault.djBIcL(TransactionParams.Companion.AEQbTJ(signParams, runesTransaction));
    }

    public final java.lang.String copydefault(@NotNull SignParams signParams, @NotNull BRC20Buyer bRC20Buyer) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(bRC20Buyer, "");
        return xYU.copydefault.KWHzl(TransactionParams.Companion.AEQbTJ(signParams, bRC20Buyer));
    }

    public final RunesTransactionResult copydefault(@NotNull SignParams signParams, @NotNull RunesMainTransaction runesMainTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(runesMainTransaction, "");
        return xYU.copydefault.djBIcL(TransactionParams.Companion.AEQbTJ(signParams, runesMainTransaction));
    }

    public final RunesMainBuyTransactionResult KWHzl(@NotNull SignParams signParams, @NotNull RunesMainBuyTransaction runesMainBuyTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(runesMainBuyTransaction, "");
        return xYU.copydefault.AEQbTJ(TransactionParams.Companion.AEQbTJ(signParams, runesMainBuyTransaction));
    }

    public final RuneMainMintTransactionResult copydefault(@NotNull SignParams signParams, @NotNull RuneMainMintTransactionParams runeMainMintTransactionParams) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(runeMainMintTransactionParams, "");
        return xYU.copydefault.gEmmrt(TransactionParams.Companion.AEQbTJ(signParams, runeMainMintTransactionParams));
    }

    public final CalUTXOInfo KWHzl(@NotNull SignParams signParams, @NotNull UTXOTransaction uTXOTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(uTXOTransaction, "");
        return xXV.KWHzl.KWHzl(signParams, uTXOTransaction);
    }

    public final java.lang.String EZpvd(long j, java.lang.String str, int i, @NotNull UTXOTransaction uTXOTransaction) {
        Intrinsics.checkNotNullParameter(uTXOTransaction, "");
        return xYU.copydefault.KWHzl(new UnsignedTx(j, 0L, str, uTXOTransaction, i, false, 34, null));
    }

    public final TxMessage AEQbTJ(long j, java.lang.String str, int i, @NotNull UTXOTransaction uTXOTransaction) {
        Intrinsics.checkNotNullParameter(uTXOTransaction, "");
        return xYU.copydefault.AEQbTJ(new UnsignedTx(j, 0L, str, uTXOTransaction, i, false, 34, null));
    }

    public final java.lang.String OLrzqt(long j, int i, @NotNull BTCSignatureRawValue bTCSignatureRawValue) {
        Intrinsics.checkNotNullParameter(bTCSignatureRawValue, "");
        return xYU.copydefault.AEQbTJ(new RawData(j, 0L, bTCSignatureRawValue, false, i, 10, null));
    }

    public final BRC20TransactionResult EZpvd(@NotNull SignParams signParams, @NotNull BRC20Transaction bRC20Transaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(bRC20Transaction, "");
        return xXV.KWHzl.gEmmrt(TransactionParams.Companion.AEQbTJ(signParams, bRC20Transaction));
    }

    public final BRC20TransactionResult copydefault(@NotNull SignParams signParams, @NotNull BRC20Transaction bRC20Transaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(bRC20Transaction, "");
        return xXV.KWHzl.KWHzl(TransactionParams.Companion.AEQbTJ(signParams, bRC20Transaction));
    }

    public final DummySignedTx AEQbTJ(@NotNull SignParams signParams, @NotNull UTXOTransaction uTXOTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(uTXOTransaction, "");
        return xXV.KWHzl.AYXKKw(TransactionParams.Companion.AEQbTJ(signParams, uTXOTransaction));
    }

    public final DummySignedTx EZpvd(@NotNull SignParams signParams, @NotNull UTXOTransaction uTXOTransaction) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(uTXOTransaction, "");
        return xXV.KWHzl.OLrzqt(TransactionParams.Companion.AEQbTJ(signParams, uTXOTransaction));
    }

    public final MPCBRC20PsbtResult KWHzl(@NotNull SignParams signParams, @NotNull BRC20Buyer bRC20Buyer) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(bRC20Buyer, "");
        return xXV.KWHzl.AhwBna(TransactionParams.Companion.AEQbTJ(signParams, bRC20Buyer));
    }

    public final MPCBRC20PsbtResult OLrzqt(@NotNull SignParams signParams, @NotNull BRC20Buyer bRC20Buyer) {
        Intrinsics.checkNotNullParameter(signParams, "");
        Intrinsics.checkNotNullParameter(bRC20Buyer, "");
        return xXV.KWHzl.EZpvd(TransactionParams.Companion.AEQbTJ(signParams, bRC20Buyer));
    }

    public final MPCBRC20PsbtResult KWHzl(@NotNull MPCBtcMessage mPCBtcMessage) {
        Intrinsics.checkNotNullParameter(mPCBtcMessage, "");
        return xXV.KWHzl.EZpvd(mPCBtcMessage);
    }

    public final MPCBRC20PsbtResult copydefault(@NotNull MPCBtcMessage mPCBtcMessage) {
        Intrinsics.checkNotNullParameter(mPCBtcMessage, "");
        return xXV.KWHzl.AEQbTJ(mPCBtcMessage);
    }

    public final MPCBRC20PsbtResult copydefault(@NotNull MPCRawPsbtTx mPCRawPsbtTx) {
        Intrinsics.checkNotNullParameter(mPCRawPsbtTx, "");
        return xXV.KWHzl.EZpvd(mPCRawPsbtTx);
    }

    public final MPCBRC20PsbtResult KWHzl(@NotNull MPCRawPsbtTx mPCRawPsbtTx) {
        Intrinsics.checkNotNullParameter(mPCRawPsbtTx, "");
        return xXV.KWHzl.copydefault(mPCRawPsbtTx);
    }

    public final java.lang.String copydefault(@NotNull UTXOTransaction uTXOTransaction) {
        Intrinsics.checkNotNullParameter(uTXOTransaction, "");
        return xYU.copydefault.KWHzl(uTXOTransaction);
    }

    public final java.lang.String KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return xYU.copydefault.KWHzl(str);
    }

    public final java.lang.String KWHzl(@NotNull UTXOTransaction uTXOTransaction) {
        Intrinsics.checkNotNullParameter(uTXOTransaction, "");
        return xYU.copydefault.AEQbTJ(uTXOTransaction);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return xXV.KWHzl.KWHzl(str, str2, str3, str4);
    }

    public final java.lang.String OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        return xXV.KWHzl.copydefault(str, obj);
    }

    public final java.lang.String EZpvd(@NotNull java.lang.String str, @NotNull java.lang.Object obj) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(obj, "");
        return xXV.KWHzl.EZpvd(str, obj);
    }

    public final java.util.List<PsbtDecodeItem> KWHzl(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return xXV.KWHzl.EZpvd(new PsbtDecodeParams(list));
    }

    public final java.util.List<PsbtDecodeNewItem> copydefault(@NotNull java.util.List<java.lang.String> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return xXV.KWHzl.copydefault(new PsbtDecodeParamsNew(list, true));
    }
}
