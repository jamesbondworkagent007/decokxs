package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import com.okinc.p2p.api.OtcExtraKeys;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lLQ extends lLS {
    @Override // o.lLS, o.InterfaceC30116lMm
    public void AEQbTJ(final java.lang.String str) {
        TrackChannel[] trackChannelArrCopydefault = C32868mlh.OLrzqt.copydefault();
        C32866mlf.EZpvd("PaymentMethod_ManagePage_AddAccount_Click", (TrackChannel[]) java.util.Arrays.copyOf(trackChannelArrCopydefault, trackChannelArrCopydefault.length), (Function1<? super EventParamsList, Unit>) new Function1() { // from class: o.lLR
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return lLQ.KWHzl(str, (EventParamsList) obj);
            }
        });
    }

    public static final Unit KWHzl(java.lang.String str, EventParamsList eventParamsList) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        if (str != null) {
            eventParamsList.put(OtcExtraKeys.EXTRA_PAYMENT_METHOD, str, true);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    @Override // o.lLS, o.InterfaceC30116lMm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.String OLrzqt(@NotNull PaymentMethod paymentMethod) {
        java.lang.String strKWHzl;
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        java.lang.String strOLrzqt = lNB.OLrzqt(paymentMethod);
        if (!C33129mqd.OLrzqt((java.lang.CharSequence) strOLrzqt)) {
            strOLrzqt = null;
        }
        if (strOLrzqt != null) {
            strKWHzl = strOLrzqt + " " + lNB.KWHzl(paymentMethod);
            if (strKWHzl == null) {
                strKWHzl = lNB.KWHzl(paymentMethod);
            }
        }
        return C33069mpW.KWHzl(C43246rlf.OLrzqt.valueOf(), C31351lsQ.Activity.DGUQLI, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt("bankNameLastFour", strKWHzl)));
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public java.lang.String djBIcL() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.OTwTPd);
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public java.lang.String copydefault() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.hCLrkq);
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public java.lang.String gEmmrt() {
        return C33070mpX.AYXKKw(C31351lsQ.Activity.heceqZ);
    }
}
