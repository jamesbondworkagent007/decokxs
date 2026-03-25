package o;

import com.okinc.business.defi.biz.core.transaction.sign.starknet.bean.StarkNetSignInfo;
import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.starknet.StarknetTransaction;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cbj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C11844cbj extends AbstractC12442cmy {
    public final C11763caH KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11844cbj(@NotNull C11763caH c11763caH) {
        super(c11763caH);
        Intrinsics.checkNotNullParameter(c11763caH, "");
        this.KWHzl = c11763caH;
    }

    public final java.lang.String copydefault() {
        java.lang.String tx = C54897xZj.EZpvd.copydefault(AbstractC12442cmy.generateSignParams$default(this, null, AhwBna(), false, 4, null), KWHzl()).getTx();
        return tx == null ? "" : tx;
    }

    public final SignedTx copydefault(java.lang.String str) {
        return C54897xZj.EZpvd.copydefault(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), KWHzl());
    }

    public final StarknetTransaction KWHzl() {
        StarkNetSignInfo starkNetSignInfoRcXXUw = this.KWHzl.RcXXUw();
        return new StarknetTransaction("", "", C33491mxU.copydefault(C54862xYb.convertToBigIntegerString$default(starkNetSignInfoRcXXUw != null ? starkNetSignInfoRcXXUw.getNonce() : null, true, (RoundingMode) null, 2, (java.lang.Object) null)), "0", "", this.KWHzl.AEQbTJ().OLrzqt(), this.KWHzl.AEQbTJ().KWHzl(), this.KWHzl.AEQbTJ().AEQbTJ(), this.KWHzl.AEQbTJ().copydefault(), this.KWHzl.AEQbTJ().valueOf(), this.KWHzl.AEQbTJ().EZpvd());
    }
}
