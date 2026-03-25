package o;

import com.okinc.okpaymentapi.data.remote.model.management.Localization;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lNr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30148lNr extends C30142lNl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30148lNr(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel, boolean z) {
        super(channel, z);
        Intrinsics.checkNotNullParameter(channel, "");
    }

    @Override // o.C30142lNl
    public java.lang.String getNewProxyInstance() {
        java.lang.String processingTimeForDisplay;
        Localization localization = fARcdN().getLocalization();
        return (localization == null || (processingTimeForDisplay = localization.getProcessingTimeForDisplay()) == null) ? C33070mpX.AYXKKw(C31351lsQ.Activity.DBxZfM) : processingTimeForDisplay;
    }

    @Override // o.C30142lNl, o.InterfaceC30133lNc
    public java.util.List<AbstractC30156lNz> AuCTel() {
        java.util.List<PaymentMethod> paymentMethods = fARcdN().getPaymentMethods();
        if (paymentMethods == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(C56403yEb.AYXKKw(paymentMethods, 10));
        java.util.Iterator<T> it = paymentMethods.iterator();
        while (it.hasNext()) {
            arrayList.add(new lNH((PaymentMethod) it.next()));
        }
        return arrayList;
    }
}
