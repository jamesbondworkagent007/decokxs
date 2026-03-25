package o;

import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lMs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C30122lMs extends AbstractC30118lMo {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public java.lang.String djBIcL() {
        return "";
    }

    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public boolean fIwbmz() {
        return false;
    }

    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public boolean fJNWhG() {
        return true;
    }

    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public boolean getFieldNames() {
        return false;
    }

    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public boolean zLjUOn() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30122lMs(@NotNull PaymentMethod paymentMethod) {
        super(paymentMethod);
        Intrinsics.checkNotNullParameter(paymentMethod, "");
    }

    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public java.lang.String EZpvd() {
        return valueOf();
    }
}
