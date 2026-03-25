package o;

import com.okinc.business.defi.biz.model.wallet.ExtJson;
import com.okinc.wallet.core.sign.cosmos.CosmosIBCTransaction;
import com.okinc.wallet.core.sign.cosmos.CosmosSignedTx;
import com.okinc.wallet.core.sign.cosmos.CosmosTransaction;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bKT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8847bKT extends AbstractC12442cmy {
    public final C8865bKl copydefault;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8847bKT(@NotNull C8865bKl c8865bKl) {
        super(c8865bKl);
        Intrinsics.checkNotNullParameter(c8865bKl, "");
        this.copydefault = c8865bKl;
    }

    public final CosmosSignedTx copydefault(@NotNull java.lang.String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        if (z) {
            return signIBC$default(this, str, null, 2, null);
        }
        return sign$default(this, str, null, 2, null);
    }

    public final CosmosSignedTx copydefault(boolean z) {
        if (z) {
            return signIBC$default(this, null, AhwBna(), 1, null);
        }
        return sign$default(this, null, AhwBna(), 1, null);
    }

    public static /* synthetic */ CosmosSignedTx sign$default(C8847bKT c8847bKT, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c8847bKT.copydefault(str, str2);
    }

    private final CosmosSignedTx copydefault(java.lang.String str, java.lang.String str2) {
        return xYV.copydefault.OLrzqt(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), KWHzl());
    }

    public static /* synthetic */ CosmosSignedTx signIBC$default(C8847bKT c8847bKT, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return c8847bKT.AEQbTJ(str, str2);
    }

    public final CosmosSignedTx AEQbTJ(java.lang.String str, java.lang.String str2) {
        return xYV.copydefault.AEQbTJ(AbstractC12442cmy.generateSignParams$default(this, str, str2, false, 4, null), copydefault());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: Fee */
    /* JADX DEBUG: Multi-variable search result rejected for r7v4, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final CosmosTransaction KWHzl() {
        java.lang.String address = this.copydefault.fERRXa().getAddress();
        java.lang.String strZLjUOn = this.copydefault.zLjUOn();
        java.lang.String publicKey = this.copydefault.fERRXa().getPublicKey();
        java.lang.String transferAmount$default = AbstractC8704bHj.getTransferAmount$default(this.copydefault, false, false, 3, null);
        java.lang.String strAEQbTJ = ((C8843bKP) this.copydefault.QKudOq()).AEQbTJ();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(C8843bKP.getGasLimit$default((C8843bKP) this.copydefault.QKudOq(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String demon = this.copydefault.EZpvd().getDemon();
        if (demon == null) {
            demon = "";
        }
        java.lang.String chainId = this.copydefault.EZpvd().getChainId();
        if (chainId == null) {
            chainId = "";
        }
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(this.copydefault.EZpvd().getSequence(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(this.copydefault.EZpvd().getAccountNumber(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String feeDemon = this.copydefault.EZpvd().getFeeDemon();
        if (feeDemon == null) {
            feeDemon = "";
        }
        return new CosmosTransaction(address, strZLjUOn, demon, transferAmount$default, chainId, strConvertToBigIntegerString$default2, strConvertToBigIntegerString$default3, feeDemon, strAEQbTJ, strConvertToBigIntegerString$default, this.copydefault.copydefault(), C54862xYb.convertToBigIntegerString$default(this.copydefault.EZpvd().getTimeoutHeight(), false, (RoundingMode) null, 3, (java.lang.Object) null), ExtJson.BRC20TYPE_TRANSFER, publicKey);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r7v1, resolved type: Fee */
    /* JADX DEBUG: Multi-variable search result rejected for r7v4, resolved type: Fee */
    /* JADX WARN: Multi-variable type inference failed */
    public final CosmosIBCTransaction copydefault() {
        java.lang.String address = this.copydefault.fERRXa().getAddress();
        java.lang.String strZLjUOn = this.copydefault.zLjUOn();
        java.lang.String publicKey = this.copydefault.fERRXa().getPublicKey();
        java.lang.String transferAmount$default = AbstractC8704bHj.getTransferAmount$default(this.copydefault, false, false, 3, null);
        java.lang.String strAEQbTJ = ((C8843bKP) this.copydefault.QKudOq()).AEQbTJ();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(C8843bKP.getGasLimit$default((C8843bKP) this.copydefault.QKudOq(), 0, 1, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String demon = this.copydefault.EZpvd().getDemon();
        java.lang.String str = demon == null ? "" : demon;
        java.lang.String chainId = this.copydefault.EZpvd().getChainId();
        java.lang.String str2 = chainId == null ? "" : chainId;
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(this.copydefault.EZpvd().getSequence(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(this.copydefault.EZpvd().getAccountNumber(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String feeDemon = this.copydefault.EZpvd().getFeeDemon();
        java.lang.String str3 = feeDemon == null ? "" : feeDemon;
        java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(this.copydefault.EZpvd().getTimeoutHeight(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strCopydefault = this.copydefault.copydefault();
        java.lang.String sourceChannel = this.copydefault.EZpvd().getSourceChannel();
        return new CosmosIBCTransaction(address, strZLjUOn, str, transferAmount$default, ExtJson.BRC20TYPE_TRANSFER, sourceChannel != null ? sourceChannel : "", str2, strConvertToBigIntegerString$default2, strConvertToBigIntegerString$default3, str3, strAEQbTJ, strConvertToBigIntegerString$default, strCopydefault, strConvertToBigIntegerString$default4, "ibcTransfer", publicKey);
    }
}
