package o;

import androidx.lifecycle.ViewModel;
import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.okpaymentapi.data.remote.model.management.TradeType;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public class lLS extends ViewModel implements InterfaceC30116lMm {
    public java.util.List<InterfaceC30115lMl> AEQbTJ = new java.util.ArrayList();

    @Override // o.InterfaceC30116lMm
    public void AEQbTJ() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30116lMm
    public void AEQbTJ(@NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
    }

    public void AEQbTJ(java.lang.String str) {
    }

    @Override // o.InterfaceC30116lMm
    public void EZpvd() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30116lMm
    public void EZpvd(@NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30116lMm
    public void KWHzl(@NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // o.InterfaceC30116lMm
    public void copydefault(@NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
    }

    @Override // o.InterfaceC30116lMm
    public java.lang.String OLrzqt() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.ixgjPv);
    }

    @Override // o.InterfaceC30116lMm
    public java.lang.String KWHzl() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.OFhtUX);
    }

    public java.lang.String djBIcL() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.RqmePg);
    }

    public java.lang.String OLrzqt(@NotNull PaymentMethod paymentMethod) {
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        return C33069mpW.KWHzl(C43246rlf.OLrzqt.valueOf(), C31351lsQ.Activity.RgLUBD, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(MTAnalysisConstants.Account.KEY_ACCOUNT, lNB.KWHzl(paymentMethod))));
    }

    public java.lang.String copydefault() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.RSDDiY);
    }

    public java.lang.String gEmmrt() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.DQzvGNdrmXxudrmXxu);
    }

    @Override // o.InterfaceC30116lMm
    public void EZpvd(@NotNull InterfaceC30115lMl interfaceC30115lMl) {
        Intrinsics.checkNotNullParameter(interfaceC30115lMl, "");
        java.util.Iterator<T> it = this.AEQbTJ.iterator();
        while (it.hasNext()) {
            ((InterfaceC30115lMl) it.next()).EZpvd(false);
        }
        interfaceC30115lMl.EZpvd(true);
    }

    @Override // o.InterfaceC30116lMm
    public java.util.List<InterfaceC30115lMl> copydefault(@NotNull java.util.List<PaymentMethod> list, PaymentMethod paymentMethod, com.okinc.okpaymentapi.data.remote.model.management.Channel channel, @NotNull TradeType tradeType) {
        java.lang.Object next;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(tradeType, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            InterfaceC30115lMl interfaceC30115lMlCopydefault = C30123lMt.KWHzl.copydefault(channel, (PaymentMethod) it.next(), tradeType);
            if (interfaceC30115lMlCopydefault != null) {
                arrayList.add(interfaceC30115lMlCopydefault);
            }
        }
        java.util.List<InterfaceC30115lMl> listFJNWhG = CollectionsKt___CollectionsKt.fJNWhG((java.util.Collection) arrayList);
        this.AEQbTJ = listFJNWhG;
        java.util.Iterator<T> it2 = listFJNWhG.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (Intrinsics.EZpvd(((InterfaceC30115lMl) next).values(), paymentMethod)) {
                break;
            }
        }
        InterfaceC30115lMl interfaceC30115lMl = (InterfaceC30115lMl) next;
        if (interfaceC30115lMl != null) {
            interfaceC30115lMl.EZpvd(true);
        }
        return this.AEQbTJ;
    }
}
