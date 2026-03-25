package o;

import com.okinc.business.defi.biz.net.bean.CeDefiSolGas;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bJa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8801bJa extends AbstractC8744bIW {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8801bJa(@NotNull AbstractC8564bFB<?, ?> abstractC8564bFB, @NotNull C8747bIZ c8747bIZ) {
        super(abstractC8564bFB, c8747bIZ);
        Intrinsics.checkNotNullParameter(abstractC8564bFB, "");
        Intrinsics.checkNotNullParameter(c8747bIZ, "");
    }

    @Override // o.AbstractC8426bCW
    public java.lang.String AEQbTJ() {
        CeDefiSolGas gasFeeInfo;
        java.lang.String strConvertToBigIntegerString$default;
        return (fJNWhG() || (gasFeeInfo = fetchVPNInfo().AEQbTJ().getGasFeeInfo()) == null || (strConvertToBigIntegerString$default = C54862xYb.convertToBigIntegerString$default(C54862xYb.KWHzl(gasFeeInfo.getTradeBaseFee(), gasFeeInfo.getTradePriorityFee()), false, RoundingMode.UP, 1, (java.lang.Object) null)) == null) ? "0" : strConvertToBigIntegerString$default;
    }
}
