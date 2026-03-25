package o;

import com.okinc.okx.paymentapi.presentation.PaymentMethodParameter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tmR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C47245tmR {
    public static final void copydefault(@NotNull android.content.Intent intent, PaymentMethodParameter paymentMethodParameter) {
        Intrinsics.checkNotNullParameter(intent, "");
        intent.putExtra("PAYMENT_METHOD_PARAMETER", paymentMethodParameter);
    }
}
