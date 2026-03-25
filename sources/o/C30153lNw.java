package o;

import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lNw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30153lNw extends C30150lNt {
    @Override // o.C30150lNt, o.lMT, o.InterfaceC30133lNc
    public boolean OLrzqt() {
        return false;
    }

    @Override // o.C30150lNt
    public java.lang.String fIwbmz() {
        return null;
    }

    @Override // o.lMT, o.InterfaceC30133lNc
    public boolean fJNWhG() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30153lNw(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel, boolean z) {
        super(channel, z);
        Intrinsics.checkNotNullParameter(channel, "");
    }

    @Override // o.C30150lNt
    public java.lang.String hDKMBd() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.DGOPHZDGOPHZ);
    }

    @Override // o.C30150lNt, o.InterfaceC30133lNc
    public java.util.List<AbstractC30156lNz> AuCTel() {
        java.util.List<PaymentMethod> paymentMethods = fARcdN().getPaymentMethods();
        if (paymentMethods == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(paymentMethods, 10));
        java.util.Iterator<T> it = paymentMethods.iterator();
        while (it.hasNext()) {
            arrayList.add(new lNM((PaymentMethod) it.next()));
        }
        return arrayList;
    }
}
