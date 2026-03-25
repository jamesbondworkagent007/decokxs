package o;

import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lNI extends lNH {
    @Override // o.AbstractC30149lNs, o.AbstractC30156lNz
    public boolean AYXKKw() {
        return true;
    }

    @Override // o.AbstractC30149lNs, o.AbstractC30156lNz
    public boolean fetchVPNInfo() {
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
    public lNI(@NotNull PaymentMethod paymentMethod) {
        super(paymentMethod);
        Intrinsics.checkNotNullParameter(paymentMethod, "");
    }

    @Override // o.lNH, o.AbstractC30156lNz
    public java.lang.String uzCIH() {
        com.okinc.okpaymentapi.data.remote.model.management.Account account = iwGUEr().getAccount();
        java.lang.String brand = account != null ? account.getBrand() : null;
        java.lang.String str = C33129mqd.OLrzqt((java.lang.CharSequence) brand) ? brand : null;
        return str == null ? super.uzCIH() : str;
    }

    @Override // o.lNH, o.AbstractC30156lNz
    public java.lang.String getFieldNames() {
        com.okinc.okpaymentapi.data.remote.model.management.Account account = iwGUEr().getAccount();
        if (account != null) {
            return account.getLast4();
        }
        return null;
    }

    @Override // o.AbstractC30149lNs, o.AbstractC30156lNz
    public boolean AhwBna() {
        return EZpvd();
    }

    @Override // o.AbstractC30149lNs, o.AbstractC30156lNz
    public java.lang.String AEQbTJ() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.DQzvGNdrmXxu);
    }
}
