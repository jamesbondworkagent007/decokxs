package o;

import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lMv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30125lMv extends C30122lMs {
    @Override // o.C30122lMs, o.AbstractC30118lMo, o.InterfaceC30115lMl
    public boolean fIwbmz() {
        return true;
    }

    @Override // o.C30122lMs, o.AbstractC30118lMo, o.InterfaceC30115lMl
    public boolean fJNWhG() {
        return false;
    }

    @Override // o.C30122lMs, o.AbstractC30118lMo, o.InterfaceC30115lMl
    public boolean getFieldNames() {
        return true;
    }

    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public boolean hDKMBd() {
        return true;
    }

    @Override // o.C30122lMs, o.AbstractC30118lMo, o.InterfaceC30115lMl
    public boolean zLjUOn() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30125lMv(@NotNull PaymentMethod paymentMethod) {
        super(paymentMethod);
        Intrinsics.checkNotNullParameter(paymentMethod, "");
    }

    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public java.lang.String copydefault() {
        com.okinc.okpaymentapi.data.remote.model.management.Account account = values().getAccount();
        if (account != null) {
            return account.getAccountNumber();
        }
        return null;
    }

    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public java.lang.String fetchVPNInfo() {
        return values().getDescription();
    }
}
