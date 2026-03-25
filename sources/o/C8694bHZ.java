package o;

import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.aptos.AptosTransaction;
import java.math.RoundingMode;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bHZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8694bHZ extends AbstractC12442cmy {
    public final C8670bHB EZpvd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8694bHZ(@NotNull C8670bHB c8670bHB) {
        super(c8670bHB);
        Intrinsics.checkNotNullParameter(c8670bHB, "");
        this.EZpvd = c8670bHB;
    }

    public final SignedTx EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        if (this.EZpvd.fHqPtx().OJuSTm()) {
            return xYX.copydefault.copydefault(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), AEQbTJ());
        }
        return xYX.copydefault.OLrzqt(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), AEQbTJ());
    }

    public final java.lang.String copydefault() {
        xYX xyx = xYX.copydefault;
        SignParams signParams = new SignParams(this.EZpvd.dHguZz().QKVWgx(), this.EZpvd.dHguZz().fetchVPNInfo(), null, null, null, null, 0, null, true, false, null, 1788, null);
        AptosTransaction aptosTransactionAEQbTJ = AEQbTJ();
        aptosTransactionAEQbTJ.setPublicKey(this.EZpvd.fERRXa().getPublicKey());
        Unit unit = Unit.INSTANCE;
        return xyx.EZpvd(signParams, aptosTransactionAEQbTJ);
    }

    public final AptosTransaction AEQbTJ() {
        return new AptosTransaction(this.EZpvd.fERRXa().getAddress(), this.EZpvd.zLjUOn(), C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.EZpvd, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(this.EZpvd.ORxRYg().getSequenceNumber(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(this.EZpvd.copydefault(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(this.EZpvd.OLrzqt(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(this.EZpvd.ORxRYg().getExpirationTimestampSecs(), false, (RoundingMode) null, 3, (java.lang.Object) null), this.EZpvd.fHqPtx().OJuSTm() ? null : this.EZpvd.ORxRYg().getTyArg(), C54862xYb.convertToBigIntegerString$default(this.EZpvd.ORxRYg().getChainId(), false, (RoundingMode) null, 3, (java.lang.Object) null), (java.lang.String) null, this.EZpvd.fHqPtx().OJuSTm() ? this.EZpvd.fHqPtx().OLrzqt() : null, 512, (DefaultConstructorMarker) null);
    }
}
