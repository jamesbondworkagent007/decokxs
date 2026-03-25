package o;

import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodParameter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lMB {
    public static final SelectPaymentMethodParameter KWHzl(@NotNull android.os.Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "");
        return (SelectPaymentMethodParameter) bundle.getParcelable("com.okinc.okx.payment.SELECT_PAYMENT_METHOD_PARAMETER");
    }

    public static final void KWHzl(@NotNull android.os.Bundle bundle, SelectPaymentMethodParameter selectPaymentMethodParameter) {
        Intrinsics.checkNotNullParameter(bundle, "");
        bundle.putParcelable("com.okinc.okx.payment.SELECT_PAYMENT_METHOD_PARAMETER", selectPaymentMethodParameter);
    }
}
