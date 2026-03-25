package o;

import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lNL extends lNH {
    @Override // o.AbstractC30149lNs, o.AbstractC30156lNz
    public boolean ejfBZ() {
        return true;
    }

    @Override // o.AbstractC30149lNs, o.AbstractC30156lNz
    public boolean fetchVPNInfo() {
        return false;
    }

    @Override // o.AbstractC30149lNs, o.AbstractC30156lNz
    public boolean gEmmrt() {
        return true;
    }

    @Override // o.AbstractC30149lNs, o.AbstractC30156lNz
    public boolean isConnected() {
        return true;
    }

    @Override // o.AbstractC30149lNs, o.AbstractC30156lNz
    public boolean valueOf() {
        return false;
    }

    @Override // o.AbstractC30149lNs, o.AbstractC30156lNz
    public boolean values() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lNL(@NotNull PaymentMethod paymentMethod) {
        super(paymentMethod);
        Intrinsics.checkNotNullParameter(paymentMethod, "");
    }

    @Override // o.lNH, o.AbstractC30156lNz
    public java.lang.String uzCIH() {
        com.okinc.okpaymentapi.data.remote.model.management.Account account;
        java.lang.String bankName;
        com.okinc.okpaymentapi.data.remote.model.management.Account account2 = iwGUEr().getAccount();
        return (!C33129mqd.OLrzqt((java.lang.CharSequence) (account2 != null ? account2.getBankName() : null)) || (account = iwGUEr().getAccount()) == null || (bankName = account.getBankName()) == null) ? "" : bankName;
    }

    @Override // o.lNH, o.AbstractC30156lNz
    public java.lang.String getFieldNames() {
        return lNB.KWHzl(iwGUEr());
    }

    @Override // o.lNH, o.AbstractC30156lNz
    public java.lang.String getNewProxyInstance() {
        return lNB.copydefault(iwGUEr());
    }
}
