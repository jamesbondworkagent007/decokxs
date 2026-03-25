package o;

import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.near.NearTokenTransaction;
import com.okinc.wallet.core.sign.near.NearTransaction;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bUL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9369bUL extends AbstractC12442cmy {
    public final C9404bUu KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9369bUL(@NotNull C9404bUu c9404bUu) {
        super(c9404bUu);
        Intrinsics.checkNotNullParameter(c9404bUu, "");
        this.KWHzl = c9404bUu;
    }

    public final SignedTx AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54891xZd.AEQbTJ.EZpvd(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), copydefault());
    }

    public final SignedTx copydefault(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54891xZd.AEQbTJ.OLrzqt(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), AEQbTJ());
    }

    public final NearTransaction copydefault() {
        java.lang.String blockHash = this.KWHzl.ORxRYg().getBlockHash();
        if (blockHash == null) {
            blockHash = "";
        }
        return new NearTransaction(blockHash, C54862xYb.convertToBigIntegerString$default(this.KWHzl.ORxRYg().getNonce(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null), this.KWHzl.fERRXa().getAddress(), this.KWHzl.zLjUOn());
    }

    public final NearTokenTransaction AEQbTJ() {
        java.lang.String blockHash = this.KWHzl.ORxRYg().getBlockHash();
        if (blockHash == null) {
            blockHash = "";
        }
        java.lang.String str = blockHash;
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(this.KWHzl.ORxRYg().getNonce(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String address = this.KWHzl.fERRXa().getAddress();
        java.lang.String strZLjUOn = this.KWHzl.zLjUOn();
        java.lang.String strOLrzqt = this.KWHzl.fHqPtx().OLrzqt();
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(this.KWHzl.ORxRYg().getFee(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.Integer toAddressCheck = this.KWHzl.ORxRYg().getToAddressCheck();
        return new NearTokenTransaction(str, strConvertToBigIntegerString$default2, strConvertToBigIntegerString$default, address, strZLjUOn, strOLrzqt, strConvertToBigIntegerString$default3, toAddressCheck != null && toAddressCheck.intValue() == 0, C54862xYb.convertToBigIntegerString$default(this.KWHzl.ORxRYg().getDepositGasFee(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(this.KWHzl.ORxRYg().getDepositMinAmount(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(this.KWHzl.ORxRYg().getMinTransferTokenValue(), false, (RoundingMode) null, 3, (java.lang.Object) null));
    }
}
