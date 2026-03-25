package o;

import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.bUN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9371bUN extends AbstractC8422bCS {
    public final C9404bUu AYXKKw;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9371bUN(@NotNull C9404bUu c9404bUu) {
        super(c9404bUu);
        Intrinsics.checkNotNullParameter(c9404bUu, "");
        this.AYXKKw = c9404bUu;
    }

    @Override // o.AbstractC8426bCW
    public java.lang.String AEQbTJ() {
        BigDecimal bigDecimalKWHzl = C54862xYb.KWHzl(this.AYXKKw.ORxRYg().getFee(), this.AYXKKw.ORxRYg().getMinTransferTokenValue());
        java.lang.Integer toAddressCheck = this.AYXKKw.ORxRYg().getToAddressCheck();
        if (toAddressCheck != null && toAddressCheck.intValue() == 0) {
            return C54862xYb.convertToBigIntegerString$default(C54862xYb.KWHzl(C54862xYb.KWHzl(bigDecimalKWHzl, this.AYXKKw.ORxRYg().getDepositGasFee()), this.AYXKKw.ORxRYg().getDepositMinAmount()), false, RoundingMode.UP, 1, (java.lang.Object) null);
        }
        return C54862xYb.convertToBigIntegerString$default(bigDecimalKWHzl, false, RoundingMode.UP, 1, (java.lang.Object) null);
    }
}
