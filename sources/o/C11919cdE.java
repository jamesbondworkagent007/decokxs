package o;

import com.okinc.wallet.core.sign.SignParams;
import com.okinc.wallet.core.sign.ton.TonBaseTransaction;
import com.okinc.wallet.core.sign.ton.TonSignedTx;
import com.okinc.wallet.core.sign.ton.TonTokenTransaction;
import com.okinc.wallet.core.sign.ton.TonTransaction;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cdE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11919cdE extends AbstractC12442cmy {
    public final AbstractC8704bHj<?, ?> EZpvd;
    public final InterfaceC11834cbZ OLrzqt;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11919cdE(@NotNull AbstractC8704bHj<?, ?> abstractC8704bHj, @NotNull InterfaceC11834cbZ interfaceC11834cbZ) {
        super(abstractC8704bHj);
        Intrinsics.checkNotNullParameter(abstractC8704bHj, "");
        Intrinsics.checkNotNullParameter(interfaceC11834cbZ, "");
        this.EZpvd = abstractC8704bHj;
        this.OLrzqt = interfaceC11834cbZ;
    }

    public final TonSignedTx EZpvd(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54901xZn.OLrzqt.copydefault(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), KWHzl());
    }

    public final TonSignedTx copydefault() {
        return C54901xZn.OLrzqt.KWHzl(new SignParams(this.EZpvd.dHguZz().QKVWgx(), this.EZpvd.dHguZz().fetchVPNInfo(), null, null, null, null, 0, null, true, this.EZpvd.dUDNAs().QVAiDq(), null, 1276, null), KWHzl());
    }

    public final TonBaseTransaction KWHzl() {
        if (this.EZpvd.fHqPtx().AuCTel()) {
            return new TonTransaction(this.EZpvd.igXuih(), this.EZpvd.zLjUOn(), C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.EZpvd, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(this.OLrzqt.AEQbTJ().getNonce(), false, (RoundingMode) null, 3, (java.lang.Object) null), this.OLrzqt.copydefault(), this.OLrzqt.isConnected() ? 128 : 3, C33129mqd.AhwBna(this.OLrzqt.AEQbTJ().getTtl()));
        }
        java.lang.String strIgXuih = this.EZpvd.igXuih();
        java.lang.String fromJettonAccount = this.OLrzqt.AEQbTJ().getFromJettonAccount();
        if (fromJettonAccount == null) {
            fromJettonAccount = "";
        }
        return new TonTokenTransaction(strIgXuih, fromJettonAccount, this.EZpvd.zLjUOn(), C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.EZpvd, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null), this.EZpvd.fHqPtx().valueOf(), C54862xYb.convertToBigIntegerString$default(this.OLrzqt.AEQbTJ().getNonce(), false, (RoundingMode) null, 3, (java.lang.Object) null), this.OLrzqt.copydefault(), true, C54862xYb.convertToBigIntegerString$default(this.OLrzqt.EZpvd(), false, (RoundingMode) null, 3, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(this.OLrzqt.AEQbTJ().getMinTonLimit(), false, (RoundingMode) null, 3, (java.lang.Object) null), this.OLrzqt.gEmmrt(), this.OLrzqt.djBIcL(), C33129mqd.AhwBna(this.OLrzqt.AEQbTJ().getTtl()));
    }
}
