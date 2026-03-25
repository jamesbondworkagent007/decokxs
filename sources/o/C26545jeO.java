package o;

import com.okinc.business.invest_biz.data.contants.PaymentOption;
import com.okinc.core.util.SPUtils;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.jeO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C26545jeO {
    @yCM
    public C26545jeO() {
    }

    public final java.lang.Object copydefault(boolean z, @NotNull Continuation<? super PaymentOption> continuation) {
        PaymentOption paymentOption;
        java.lang.Integer num = SPUtils.getInt(z ? "sp_invest_pool_subscribe_select" : "sp_invest_pool_redeem_select", -1);
        PaymentOption[] paymentOptionArrValues = PaymentOption.values();
        int length = paymentOptionArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                paymentOption = null;
                break;
            }
            paymentOption = paymentOptionArrValues[i];
            int value = paymentOption.getValue();
            if (num != null && value == num.intValue()) {
                break;
            }
            i++;
        }
        return paymentOption == null ? PaymentOption.NotDecided : paymentOption;
    }
}
