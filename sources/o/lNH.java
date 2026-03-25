package o;

import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public class lNH extends AbstractC30149lNs {
    public static final int copydefault = PaymentMethod.$stable;
    public final PaymentMethod OLrzqt;

    @Override // o.AbstractC30156lNz
    public java.lang.String getNewProxyInstance() {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30154lNx
    public PaymentMethod iwGUEr() {
        return this.OLrzqt;
    }

    public lNH(@NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        this.OLrzqt = paymentMethod;
    }

    @Override // o.AbstractC30156lNz
    public java.lang.String uzCIH() {
        return iwGUEr().getDescription();
    }

    @Override // o.AbstractC30156lNz
    public java.lang.String getFieldNames() {
        com.okinc.okpaymentapi.data.remote.model.management.Account account = iwGUEr().getAccount();
        if (account != null) {
            return account.getAccountNumber();
        }
        return null;
    }
}
