package o;

import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lNJ extends lNH {
    @Override // o.AbstractC30149lNs, o.AbstractC30156lNz
    public boolean fetchVPNInfo() {
        return false;
    }

    @Override // o.AbstractC30149lNs, o.AbstractC30156lNz
    public boolean valueOf() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lNJ(@NotNull PaymentMethod paymentMethod) {
        super(paymentMethod);
        Intrinsics.checkNotNullParameter(paymentMethod, "");
    }

    @Override // o.lNH, o.AbstractC30156lNz
    public java.lang.String uzCIH() {
        java.lang.String accountNumber;
        com.okinc.okpaymentapi.data.remote.model.management.Account account = iwGUEr().getAccount();
        return (account == null || (accountNumber = account.getAccountNumber()) == null) ? "" : accountNumber;
    }
}
