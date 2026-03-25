package o;

import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import o.C31351lsQ;
import o.C52761wXj;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lMu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C30124lMu extends C30122lMs {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public int KWHzl() {
        return C52761wXj.Activity.aappFQ;
    }

    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public boolean fARcdN() {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30124lMu(@NotNull PaymentMethod paymentMethod) {
        super(paymentMethod);
        Intrinsics.checkNotNullParameter(paymentMethod, "");
    }

    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public java.lang.String copydefault() {
        com.okinc.okpaymentapi.data.remote.model.management.Account account = values().getAccount();
        if (account == null) {
            return values().getDescription();
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) account.getBrand())) {
            return account.getBrand();
        }
        if (!StringsKt__StringsKt.fARcdN((java.lang.CharSequence) account.getBankName())) {
            return account.getBankName();
        }
        return values().getDescription();
    }

    @Override // o.C30122lMs, o.AbstractC30118lMo, o.InterfaceC30115lMl
    public java.lang.String EZpvd() {
        return gEmmrt();
    }

    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public boolean ejfBZ() {
        return DbNXlk();
    }

    @Override // o.AbstractC30118lMo, o.InterfaceC30115lMl
    public java.lang.String AEQbTJ() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.DQzvGNdrmXxu);
    }
}
