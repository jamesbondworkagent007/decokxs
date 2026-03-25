package o;

import com.okinc.okimcore.model.im.group.paidgroup.PaidGroupBillingStatus;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sPd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44420sPd extends C44442sPz<PaidGroupBillingStatus> {
    public C44420sPd() {
        super("enable", PaidGroupBillingStatus.values(), new Function1() { // from class: o.sPc
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C44420sPd.EZpvd((PaidGroupBillingStatus) obj));
            }
        }, new Function1() { // from class: o.sPb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44420sPd.OLrzqt(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int EZpvd(PaidGroupBillingStatus paidGroupBillingStatus) {
        Intrinsics.checkNotNullParameter(paidGroupBillingStatus, "");
        return paidGroupBillingStatus.getRawValue();
    }

    public static final PaidGroupBillingStatus OLrzqt(int i) {
        PaidGroupBillingStatus paidGroupBillingStatus;
        PaidGroupBillingStatus[] paidGroupBillingStatusArrValues = PaidGroupBillingStatus.values();
        int length = paidGroupBillingStatusArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                paidGroupBillingStatus = null;
                break;
            }
            paidGroupBillingStatus = paidGroupBillingStatusArrValues[i2];
            if (paidGroupBillingStatus.getRawValue() == i) {
                break;
            }
            i2++;
        }
        return paidGroupBillingStatus == null ? PaidGroupBillingStatus.UNKNOWN : paidGroupBillingStatus;
    }
}
