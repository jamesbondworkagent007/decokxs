package o;

import com.okinc.okimcore.model.im.group.paidgroup.PaymentRequiredStatus;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sPe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44421sPe extends C44442sPz<PaymentRequiredStatus> {
    public C44421sPe() {
        super("paymentRequiredStatus", PaymentRequiredStatus.values(), new Function1() { // from class: o.sPf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C44421sPe.OLrzqt((PaymentRequiredStatus) obj));
            }
        }, new Function1() { // from class: o.sPi
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44421sPe.AEQbTJ(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int OLrzqt(PaymentRequiredStatus paymentRequiredStatus) {
        Intrinsics.checkNotNullParameter(paymentRequiredStatus, "");
        return paymentRequiredStatus.getRawValue();
    }

    public static final PaymentRequiredStatus AEQbTJ(int i) {
        PaymentRequiredStatus paymentRequiredStatus;
        PaymentRequiredStatus[] paymentRequiredStatusArrValues = PaymentRequiredStatus.values();
        int length = paymentRequiredStatusArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                paymentRequiredStatus = null;
                break;
            }
            paymentRequiredStatus = paymentRequiredStatusArrValues[i2];
            if (paymentRequiredStatus.getRawValue() == i) {
                break;
            }
            i2++;
        }
        return paymentRequiredStatus == null ? PaymentRequiredStatus.UNKNOWN : paymentRequiredStatus;
    }
}
