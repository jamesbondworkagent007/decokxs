package o;

import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lMy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30128lMy extends C30122lMs {
    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public boolean ejfBZ() {
        return true;
    }

    @Override // o.C30122lMs, o.AbstractC30118lMo, o.InterfaceC30115lMl
    public boolean fIwbmz() {
        return true;
    }

    @Override // o.C30122lMs, o.AbstractC30118lMo, o.InterfaceC30115lMl
    public boolean fJNWhG() {
        return true;
    }

    @Override // o.C30122lMs, o.AbstractC30118lMo, o.InterfaceC30115lMl
    public boolean getFieldNames() {
        return true;
    }

    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public boolean hDKMBd() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30128lMy(@NotNull PaymentMethod paymentMethod) {
        super(paymentMethod);
        Intrinsics.checkNotNullParameter(paymentMethod, "");
    }

    @Override // o.C30122lMs, o.AbstractC30118lMo, o.InterfaceC30115lMl
    public java.lang.String EZpvd() {
        return gEmmrt();
    }

    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public java.lang.String copydefault() {
        return lNB.OLrzqt(values());
    }

    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public java.lang.String fetchVPNInfo() {
        com.okinc.okpaymentapi.data.remote.model.management.Account account = values().getAccount();
        if (account != null) {
            return account.getBankAccountType();
        }
        return null;
    }
}
