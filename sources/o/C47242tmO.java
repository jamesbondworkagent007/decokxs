package o;

import com.okinc.okx.paymentapi.presentation.AddPaymentMethodResult;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tmO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C47242tmO {
    public static final AddPaymentMethodResult AEQbTJ(@NotNull android.content.Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        return (AddPaymentMethodResult) intent.getParcelableExtra("com.okinc.okpayment.ADD_PAYMENT_METHOD_RESULT");
    }
}
