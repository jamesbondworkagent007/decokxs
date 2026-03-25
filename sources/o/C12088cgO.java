package o;

import com.okinc.wallet.core.sign.utxo.XRC20TransactionResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.cgO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C12088cgO extends C11990ceW {
    public final C12117cgr AkhnZx;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12088cgO(@NotNull C12117cgr c12117cgr) {
        super(c12117cgr);
        Intrinsics.checkNotNullParameter(c12117cgr, "");
        this.AkhnZx = c12117cgr;
    }

    /* JADX DEBUG: Possible override for method o.ceW.fJNWhG()Lo/ctf; */
    public final java.lang.String fJNWhG() {
        return C54862xYb.convertToString$default(C54862xYb.AEQbTJ(AEQbTJ(), ejfBZ()), false, null, null, 7, null);
    }

    public final java.lang.String ejfBZ() {
        XRC20TransactionResult xRC20TransactionResultDGgnkA = this.AkhnZx.DGgnkA();
        java.lang.String dummyTxFee = xRC20TransactionResultDGgnkA != null ? xRC20TransactionResultDGgnkA.getDummyTxFee() : null;
        return dummyTxFee == null ? "" : dummyTxFee;
    }
}
