package o;

import com.okinc.buysell.ui.paymentmethod.data.SelectPaymentMethodResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class lMA {
    public static final SelectPaymentMethodResult AEQbTJ(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        return (SelectPaymentMethodResult) intent.getParcelableExtra("com.okinc.okpayment.SELECT_PAYMENT_METHOD_RESULT");
    }

    public static final void AEQbTJ(@NotNull android.content.Intent intent, SelectPaymentMethodResult selectPaymentMethodResult) {
        Intrinsics.checkNotNullParameter(intent, "");
        intent.putExtra("com.okinc.okpayment.SELECT_PAYMENT_METHOD_RESULT", selectPaymentMethodResult);
    }
}
