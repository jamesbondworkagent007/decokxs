package o;

import com.okinc.okpaymentapi.data.remote.model.management.Localization;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lNv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30152lNv extends C30150lNt {
    @Override // o.C30150lNt, o.lMT, o.InterfaceC30133lNc
    public boolean OLrzqt() {
        return true;
    }

    @Override // o.lMT, o.InterfaceC30133lNc
    public boolean fetchVPNInfo() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30152lNv(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel, boolean z) {
        super(channel, z);
        Intrinsics.checkNotNullParameter(channel, "");
    }

    @Override // o.C30150lNt
    public java.lang.String hDKMBd() {
        java.lang.String processingTimeForDisplay;
        Localization localization = fARcdN().getLocalization();
        return (localization == null || (processingTimeForDisplay = localization.getProcessingTimeForDisplay()) == null) ? C33070mpX.AYXKKw(C31351lsQ.Activity.DGOPHZDGOPHZ) : processingTimeForDisplay;
    }

    @Override // o.lMT, o.InterfaceC30133lNc
    public java.lang.String valueOf() {
        java.util.List<PaymentMethod> paymentMethods = fARcdN().getPaymentMethods();
        if (paymentMethods == null || paymentMethods.isEmpty()) {
            return null;
        }
        BigDecimal bigDecimal = new BigDecimal(0);
        java.util.List<PaymentMethod> paymentMethods2 = fARcdN().getPaymentMethods();
        if (paymentMethods2 != null) {
            java.util.Iterator<T> it = paymentMethods2.iterator();
            while (it.hasNext()) {
                com.okinc.okpaymentapi.data.remote.model.management.Account account = ((PaymentMethod) it.next()).getAccount();
                bigDecimal = bigDecimal.add(C33129mqd.EZpvd(account != null ? account.getAvailableBalance() : null));
                Intrinsics.checkNotNullExpressionValue(bigDecimal, "");
            }
        }
        return pTB.toLocalizationStringWithPrecision$default(C33129mqd.OLrzqt(bigDecimal), 0, 2, RoundingMode.HALF_UP, null, 8, null) + " " + fARcdN().getQuoteCurrency();
    }

    @Override // o.lMT, o.InterfaceC30133lNc
    public boolean DbNXlk() {
        return !getFieldNames();
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
            arrayList.add(new lNQ((PaymentMethod) it.next()));
        }
        return arrayList;
    }
}
