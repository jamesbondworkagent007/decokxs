package o;

import com.okinc.okimcore.model.im.group.paidgroup.BillingCyclePaymentStatus;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class sOV extends C44442sPz<BillingCyclePaymentStatus> {
    public sOV() {
        super("billingCyclePaymentStatus", BillingCyclePaymentStatus.values(), new Function1() { // from class: o.sOW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(sOV.AEQbTJ((BillingCyclePaymentStatus) obj));
            }
        }, new Function1() { // from class: o.sOU
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sOV.KWHzl(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int AEQbTJ(BillingCyclePaymentStatus billingCyclePaymentStatus) {
        Intrinsics.checkNotNullParameter(billingCyclePaymentStatus, "");
        return billingCyclePaymentStatus.getRawValue();
    }

    public static final BillingCyclePaymentStatus KWHzl(int i) {
        BillingCyclePaymentStatus billingCyclePaymentStatus;
        BillingCyclePaymentStatus[] billingCyclePaymentStatusArrValues = BillingCyclePaymentStatus.values();
        int length = billingCyclePaymentStatusArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                billingCyclePaymentStatus = null;
                break;
            }
            billingCyclePaymentStatus = billingCyclePaymentStatusArrValues[i2];
            if (billingCyclePaymentStatus.getRawValue() == i) {
                break;
            }
            i2++;
        }
        return billingCyclePaymentStatus == null ? BillingCyclePaymentStatus.UNKNOWN : billingCyclePaymentStatus;
    }
}
