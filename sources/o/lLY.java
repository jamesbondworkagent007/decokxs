package o;

import com.engagelab.privates.analysis.constants.MTAnalysisConstants;
import com.okinc.okpaymentapi.data.remote.model.management.PaymentMethod;
import kotlin.jvm.internal.Intrinsics;
import o.C31351lsQ;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lLY extends C30106lMc {
    @Override // o.lLS, o.InterfaceC30116lMm
    public java.lang.String OLrzqt() {
        java.lang.String string = C43246rlf.OLrzqt.valueOf().getString(C31351lsQ.Activity.UccSpe);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public java.lang.String OLrzqt(@NotNull PaymentMethod paymentMethod) {
        java.lang.String accountNumber;
        java.lang.String str = "";
        Intrinsics.checkNotNullParameter(paymentMethod, "");
        android.app.Application applicationValueOf = C43246rlf.OLrzqt.valueOf();
        int i = C31351lsQ.Activity.RgLUBD;
        com.okinc.okpaymentapi.data.remote.model.management.Account account = paymentMethod.getAccount();
        if (account != null && (accountNumber = account.getAccountNumber()) != null) {
            str = accountNumber;
        }
        return C33069mpW.KWHzl(applicationValueOf, i, (java.util.Map<java.lang.String, ? extends java.lang.Object>) C56423yEv.EZpvd(C56390yDp.OLrzqt(MTAnalysisConstants.Account.KEY_ACCOUNT, str)));
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public java.lang.String copydefault() {
        java.lang.String string = C43246rlf.OLrzqt.valueOf().getString(C31351lsQ.Activity.RkASWs);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    @Override // o.lLS, o.InterfaceC30116lMm
    public java.lang.String gEmmrt() {
        java.lang.String string = C43246rlf.OLrzqt.valueOf().getString(C31351lsQ.Activity.RIuxYh);
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }
}
