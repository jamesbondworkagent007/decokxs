package o;

import com.okinc.wallet.core.sign.eos.EosTransaction;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bLh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8914bLh extends AbstractC12442cmy {
    public final C8851bKX KWHzl;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8914bLh(@NotNull C8851bKX c8851bKX) {
        super(c8851bKX);
        Intrinsics.checkNotNullParameter(c8851bKX, "");
        this.KWHzl = c8851bKX;
    }

    public final java.lang.String AEQbTJ(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C54889xZb.AEQbTJ.AEQbTJ(AbstractC12442cmy.generateSignParams$default(this, str, null, false, 6, null), copydefault());
    }

    public final EosTransaction copydefault() {
        java.lang.String strHtlTjW = this.KWHzl.htlTjW();
        java.lang.String strZLjUOn = this.KWHzl.zLjUOn();
        java.lang.String strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(AbstractC8704bHj.getTransferAmount$default(this.KWHzl, false, false, 3, null), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strCopydefault = this.KWHzl.copydefault();
        java.lang.String strConvertToBigIntegerString$default2 = C54862xYb.convertToBigIntegerString$default(this.KWHzl.ORxRYg().getExpiration(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default3 = C54862xYb.convertToBigIntegerString$default(this.KWHzl.ORxRYg().getRef_block_number(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String strConvertToBigIntegerString$default4 = C54862xYb.convertToBigIntegerString$default(this.KWHzl.ORxRYg().getRef_block_prefix(), false, (RoundingMode) null, 3, (java.lang.Object) null);
        java.lang.String precision = this.KWHzl.ORxRYg().getPrecision();
        java.lang.String str = precision == null ? "" : precision;
        java.lang.String symbol = this.KWHzl.ORxRYg().getSymbol();
        java.lang.String str2 = symbol == null ? "" : symbol;
        java.lang.String contract = this.KWHzl.ORxRYg().getContract();
        java.lang.String str3 = contract == null ? "" : contract;
        java.lang.String chainid = this.KWHzl.ORxRYg().getChainid();
        return new EosTransaction(strHtlTjW, strZLjUOn, strConvertToBigIntegerString$default, strCopydefault, strConvertToBigIntegerString$default2, strConvertToBigIntegerString$default3, strConvertToBigIntegerString$default4, str, str2, str3, chainid == null ? "" : chainid);
    }
}
