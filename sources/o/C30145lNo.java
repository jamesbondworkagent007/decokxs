package o;

import com.okinc.okpaymentapi.data.remote.model.management.Localization;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import java.math.BigDecimal;
import java.math.RoundingMode;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.lNo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C30145lNo extends C30142lNl {
    @Override // o.lMT, o.InterfaceC30133lNc
    public boolean DbNXlk() {
        return true;
    }

    @Override // o.C30142lNl, o.lMT, o.InterfaceC30133lNc
    public boolean OLrzqt() {
        return true;
    }

    @Override // o.lMT, o.InterfaceC30133lNc
    public boolean fetchVPNInfo() {
        return true;
    }

    @Override // o.C30142lNl, o.lMT, o.InterfaceC30133lNc
    public boolean gEmmrt() {
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30145lNo(@NotNull com.okinc.okpaymentapi.data.remote.model.management.Channel channel, boolean z) {
        super(channel, z);
        Intrinsics.checkNotNullParameter(channel, "");
    }

    @Override // o.C30142lNl
    public java.lang.String getNewProxyInstance() {
        java.lang.String processingTimeForDisplay;
        Localization localization = fARcdN().getLocalization();
        return (localization == null || (processingTimeForDisplay = localization.getProcessingTimeForDisplay()) == null) ? C33070mpX.AYXKKw(C31351lsQ.Activity.DBxZfM) : processingTimeForDisplay;
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
    public boolean AkhnZx() {
        java.util.List<PaymentMethod> paymentMethods = fARcdN().getPaymentMethods();
        java.lang.Object obj = null;
        if (paymentMethods != null) {
            java.util.Iterator<T> it = paymentMethods.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((PaymentMethod) next).getShowTransfer() && !getFieldNames()) {
                    obj = next;
                    break;
                }
            }
            obj = (PaymentMethod) obj;
        }
        return obj != null;
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
