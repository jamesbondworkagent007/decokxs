package o;

import com.okinc.okimcore.model.im.group.TransactionStatus;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class sOR extends C44442sPz<TransactionStatus> {
    public sOR() {
        super("transactionStatus", TransactionStatus.values(), new Function1() { // from class: o.sOP
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(sOR.copydefault((TransactionStatus) obj));
            }
        }, new Function1() { // from class: o.sOT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sOR.EZpvd(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int copydefault(TransactionStatus transactionStatus) {
        Intrinsics.checkNotNullParameter(transactionStatus, "");
        return transactionStatus.getRawValue();
    }

    public static final TransactionStatus EZpvd(int i) {
        TransactionStatus transactionStatus;
        TransactionStatus[] transactionStatusArrValues = TransactionStatus.values();
        int length = transactionStatusArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                transactionStatus = null;
                break;
            }
            transactionStatus = transactionStatusArrValues[i2];
            if (transactionStatus.getRawValue() == i) {
                break;
            }
            i2++;
        }
        return transactionStatus == null ? TransactionStatus.NONE : transactionStatus;
    }
}
