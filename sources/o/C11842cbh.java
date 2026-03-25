package o;

import com.okinc.business.defi.biz.core.transaction.sign.starknet.bean.StarkNetSignInfo;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.starknet.StarknetTransaction;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cbh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11842cbh extends AbstractC12442cmy {
    public final C11767caL KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11842cbh(@NotNull C11767caL c11767caL) {
        super(c11767caL);
        Intrinsics.checkNotNullParameter(c11767caL, "");
        this.KWHzl = c11767caL;
    }

    public final java.lang.String KWHzl() {
        java.lang.String tx = C54897xZj.EZpvd.AEQbTJ(AbstractC12442cmy.generateSignParams$default(this, null, AhwBna(), false, 4, null), AEQbTJ(C33129mqd.gEmmrt(AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null), "1") ? "1" : AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null))).getTx();
        return tx == null ? "" : tx;
    }

    public final SignedTx EZpvd(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return C54897xZj.EZpvd.AEQbTJ(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), AEQbTJ(str2));
    }

    public final StarknetTransaction AEQbTJ(java.lang.String str) {
        java.lang.String strHtlTjW = this.KWHzl.htlTjW();
        java.lang.String strZLjUOn = this.KWHzl.zLjUOn();
        StarkNetSignInfo starkNetSignInfoOcIXYQ = this.KWHzl.OcIXYQ();
        java.lang.String strCopydefault = C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(starkNetSignInfoOcIXYQ != null ? starkNetSignInfoOcIXYQ.getNonce() : null, true, (RoundingMode) null, 2, (java.lang.Object) null));
        StarkNetSignInfo starkNetSignInfoOcIXYQ2 = this.KWHzl.OcIXYQ();
        java.lang.String contractAddress = starkNetSignInfoOcIXYQ2 != null ? starkNetSignInfoOcIXYQ2.getContractAddress() : null;
        return new StarknetTransaction(strHtlTjW, strZLjUOn, strCopydefault, str, contractAddress == null ? "" : contractAddress, this.KWHzl.AEQbTJ().OLrzqt(), this.KWHzl.AEQbTJ().KWHzl(), this.KWHzl.AEQbTJ().AEQbTJ(), this.KWHzl.AEQbTJ().copydefault(), this.KWHzl.AEQbTJ().valueOf(), this.KWHzl.AEQbTJ().EZpvd());
    }
}
