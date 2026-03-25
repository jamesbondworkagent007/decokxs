package o;

import com.okinc.okex.center.bean.enums.TransactionType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.seZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44842seZ extends C6984aZg<TransactionType> {
    public C44842seZ() {
        super("TransactionType", new Function1() { // from class: o.sfa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44842seZ.EZpvd((TransactionType) obj);
            }
        }, new Function1() { // from class: o.seY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44842seZ.KWHzl((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String EZpvd(TransactionType transactionType) {
        Intrinsics.checkNotNullParameter(transactionType, "");
        return transactionType.getValue();
    }

    public static final TransactionType KWHzl(java.lang.String str) {
        TransactionType transactionType;
        Intrinsics.checkNotNullParameter(str, "");
        TransactionType[] transactionTypeArrValues = TransactionType.values();
        int length = transactionTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                transactionType = null;
                break;
            }
            transactionType = transactionTypeArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) transactionType.getValue(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return transactionType == null ? TransactionType.Unknown : transactionType;
    }
}
