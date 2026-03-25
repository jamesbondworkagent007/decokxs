package o;

import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lNM extends lNQ {
    @Override // o.AbstractC30149lNs, o.AbstractC30156lNz
    public boolean fetchVPNInfo() {
        return false;
    }

    @Override // o.AbstractC30149lNs, o.AbstractC30156lNz
    public boolean valueOf() {
        return true;
    }

    @Override // o.AbstractC30149lNs, o.AbstractC30156lNz
    public boolean values() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lNM(@NotNull PaymentMethod paymentMethod) {
        super(paymentMethod);
        Intrinsics.checkNotNullParameter(paymentMethod, "");
    }
}
