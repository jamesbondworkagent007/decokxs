package o;

import com.okinc.okpaymentapi.data.remote.model.management.Localization;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lNk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30141lNk extends C30142lNl {
    @Override // o.C30142lNl, o.lMT, o.InterfaceC30133lNc
    public boolean OLrzqt() {
        return false;
    }

    @Override // o.lMT, o.InterfaceC30133lNc
    public boolean fJNWhG() {
        return false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30141lNk(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel, boolean z) {
        super(channel, z);
        Intrinsics.checkNotNullParameter(channel, "");
    }

    @Override // o.lMT, o.InterfaceC30133lNc
    public boolean AhwBna() {
        java.util.List<PaymentMethod> paymentMethods = fARcdN().getPaymentMethods();
        return paymentMethods == null || paymentMethods.isEmpty();
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
            arrayList.add(new lNL((PaymentMethod) it.next()));
        }
        return arrayList;
    }

    @Override // o.C30142lNl
    public java.lang.String fIwbmz() {
        java.lang.String feeRateForDisplay;
        Localization localization = fARcdN().getLocalization();
        return (localization == null || (feeRateForDisplay = localization.getFeeRateForDisplay()) == null) ? "" : feeRateForDisplay;
    }

    @Override // o.C30142lNl
    public java.lang.String iwGUEr() {
        Localization localization = fARcdN().getLocalization();
        java.lang.String limitForDisplay = localization != null ? localization.getLimitForDisplay() : null;
        return limitForDisplay == null ? "" : limitForDisplay;
    }

    @Override // o.C30142lNl
    public java.lang.String getNewProxyInstance() {
        java.lang.String processingTimeForDisplay;
        Localization localization = fARcdN().getLocalization();
        return (localization == null || (processingTimeForDisplay = localization.getProcessingTimeForDisplay()) == null) ? C33070mpX.AYXKKw(C31351lsQ.Activity.DBxZfM) : processingTimeForDisplay;
    }
}
