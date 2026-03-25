package o;

import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaExtJson;
import com.okinc.business.defi.biz.core.transaction.sign.solana.bean.SolanaSignInfo;
import com.okinc.business.defi.biz.net.bean.JitoInfoResult;
import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.solana.BaseSolanaTransaction;
import com.okinc.wallet.core.sign.solana.SolanaTokenTransaction;
import com.okinc.wallet.core.sign.solana.SolanaTransaction;
import java.math.RoundingMode;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bZk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9659bZk extends AbstractC12442cmy {
    public final C9615bYt KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9659bZk(@NotNull C9615bYt c9615bYt) {
        super(c9615bYt);
        Intrinsics.checkNotNullParameter(c9615bYt, "");
        this.KWHzl = c9615bYt;
    }

    public final SignedTx KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        C54892xZe c54892xZe = C54892xZe.KWHzl;
        SignParams signParamsGenerateSignParams$default = AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null);
        BaseSolanaTransaction baseSolanaTransactionEZpvd = EZpvd();
        if (baseSolanaTransactionEZpvd == null) {
            return null;
        }
        SignedTx signedTxOLrzqt = c54892xZe.OLrzqt(signParamsGenerateSignParams$default, baseSolanaTransactionEZpvd);
        if (this.KWHzl.isConnected() == 2) {
            SignedTx signedTxCopydefault = copydefault(str);
            if (signedTxCopydefault == null) {
                return null;
            }
            signedTxOLrzqt = C9591bYV.KWHzl.KWHzl(signedTxOLrzqt, signedTxCopydefault);
            if (signedTxOLrzqt != null) {
                signedTxOLrzqt.setJitoTxHash(signedTxCopydefault.getTxHash());
            }
        }
        return signedTxOLrzqt;
    }

    public final SolanaExtJson OLrzqt(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int iIsConnected = this.KWHzl.isConnected();
        if (iIsConnected == 1) {
            return null;
        }
        if (iIsConnected == 2) {
            SolanaExtJson solanaExtJsonORxRYg = this.KWHzl.ORxRYg();
            solanaExtJsonORxRYg.setRent("");
            solanaExtJsonORxRYg.setMev(SolanaExtJson.MEV);
            solanaExtJsonORxRYg.setJitoHash(str);
            return solanaExtJsonORxRYg;
        }
        return this.KWHzl.ORxRYg();
    }

    public final SignedTx copydefault(java.lang.String str) {
        C54892xZe c54892xZe = C54892xZe.KWHzl;
        SignParams signParamsGenerateSignParams$default = AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null);
        BaseSolanaTransaction baseSolanaTransactionCopydefault = copydefault();
        if (baseSolanaTransactionCopydefault == null) {
            return null;
        }
        return c54892xZe.OLrzqt(signParamsGenerateSignParams$default, baseSolanaTransactionCopydefault);
    }

    public final BaseSolanaTransaction copydefault() {
        java.lang.String clientGasPrice;
        SolanaSignInfo solanaSignInfoAkhnZx;
        java.lang.String recentBlockhash;
        JitoInfoResult jitoInfoResultQKVWgx = this.KWHzl.QKVWgx();
        if (jitoInfoResultQKVWgx == null) {
            return null;
        }
        java.lang.String address = this.KWHzl.fERRXa().getAddress();
        java.lang.String tipAccountAddress = jitoInfoResultQKVWgx.getTipAccountAddress();
        if (tipAccountAddress == null || (clientGasPrice = jitoInfoResultQKVWgx.getClientGasPrice()) == null || (solanaSignInfoAkhnZx = this.KWHzl.AkhnZx()) == null || (recentBlockhash = solanaSignInfoAkhnZx.getRecentBlockhash()) == null) {
            return null;
        }
        return new SolanaTransaction(address, tipAccountAddress, clientGasPrice, recentBlockhash, OLrzqt(), AEQbTJ());
    }

    public final BaseSolanaTransaction EZpvd() {
        java.lang.String decimal;
        SolanaSignInfo solanaSignInfoAkhnZx = this.KWHzl.AkhnZx();
        if (solanaSignInfoAkhnZx == null) {
            return null;
        }
        if (this.KWHzl.fHqPtx().AuCTel()) {
            java.lang.String address = this.KWHzl.fERRXa().getAddress();
            java.lang.String strZLjUOn = this.KWHzl.zLjUOn();
            java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
            java.lang.String recentBlockhash = solanaSignInfoAkhnZx.getRecentBlockhash();
            if (recentBlockhash == null) {
                return null;
            }
            return new SolanaTransaction(address, strZLjUOn, strConvertToBigIntegerString$default, recentBlockhash, OLrzqt(), AEQbTJ());
        }
        java.lang.String address2 = this.KWHzl.fERRXa().getAddress();
        java.lang.String strFJNWhG = this.KWHzl.fHqPtx().fJNWhG();
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String recentBlockhash2 = solanaSignInfoAkhnZx.getRecentBlockhash();
        if (recentBlockhash2 == null || (decimal = solanaSignInfoAkhnZx.getDecimal()) == null) {
            return null;
        }
        java.lang.String address3 = this.KWHzl.fERRXa().getAddress();
        java.lang.String tokenAccountAddress = solanaSignInfoAkhnZx.getTokenAccountAddress();
        if (tokenAccountAddress == null) {
            return null;
        }
        java.lang.Boolean toAddressLegal = solanaSignInfoAkhnZx.getToAddressLegal();
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        java.lang.String tokenAccountToAddress = Intrinsics.EZpvd(toAddressLegal, bool) ? solanaSignInfoAkhnZx.getTokenAccountToAddress() : null;
        java.lang.String mintAddress = solanaSignInfoAkhnZx.getMintAddress();
        if (mintAddress == null) {
            return null;
        }
        return new SolanaTokenTransaction(address2, strConvertToBigIntegerString$default2, strFJNWhG, recentBlockhash2, decimal, address3, tokenAccountAddress, tokenAccountToAddress, mintAddress, Intrinsics.EZpvd(solanaSignInfoAkhnZx.getToAddressLegal(), bool) ? null : this.KWHzl.zLjUOn(), this.KWHzl.fHqPtx().fERRXa(), OLrzqt(), AEQbTJ());
    }

    public final java.lang.String AEQbTJ() {
        SolanaSignInfo solanaSignInfoAkhnZx;
        java.lang.String computeUnitPrice;
        if (this.KWHzl.isConnected() == 2 || (solanaSignInfoAkhnZx = this.KWHzl.AkhnZx()) == null || (computeUnitPrice = solanaSignInfoAkhnZx.getComputeUnitPrice()) == null) {
            return null;
        }
        return computeUnitPrice;
    }

    public final java.lang.String OLrzqt() {
        if (this.KWHzl.isConnected() == 2) {
            return null;
        }
        return (java.lang.String) CollectionsKt___CollectionsKt.firstOrNull(this.KWHzl.OLrzqt());
    }
}
