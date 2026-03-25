package o;

import com.okinc.wallet.core.sign.SignedTx;
import com.okinc.wallet.core.sign.kaspa.KaspaTransaction;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bUv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9405bUv extends AbstractC12442cmy {
    public final C9318bTN KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9405bUv(@NotNull C9318bTN c9318bTN) {
        super(c9318bTN);
        Intrinsics.checkNotNullParameter(c9318bTN, "");
        this.KWHzl = c9318bTN;
    }

    public final SignedTx OLrzqt(java.lang.String str, @NotNull C9400bUq c9400bUq) {
        Intrinsics.checkNotNullParameter(c9400bUq, "");
        return C54888xZa.copydefault.KWHzl(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), KWHzl(c9400bUq));
    }

    public final KaspaTransaction KWHzl(C9400bUq c9400bUq) {
        return new KaspaTransaction(c9400bUq.copydefault(), this.KWHzl.zLjUOn(), C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null), C54862xYb.convertToBigIntegerString$default(c9400bUq.OLrzqt(), true, (RoundingMode) null, 2, (java.lang.Object) null), this.KWHzl.htlTjW(), C54862xYb.convertToBigIntegerString$default(C9318bTN.getMinOutput$default(this.KWHzl, false, false, 3, null), true, (RoundingMode) null, 2, (java.lang.Object) null));
    }
}
