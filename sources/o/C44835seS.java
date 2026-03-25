package o;

import com.okinc.okex.center.bean.enums.TransactionTagLabel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.seS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44835seS extends C6984aZg<TransactionTagLabel> {
    public C44835seS() {
        super("TransactionTagLabel", new Function1() { // from class: o.seT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44835seS.EZpvd((TransactionTagLabel) obj);
            }
        }, new Function1() { // from class: o.seW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44835seS.KWHzl((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String EZpvd(TransactionTagLabel transactionTagLabel) {
        Intrinsics.checkNotNullParameter(transactionTagLabel, "");
        return transactionTagLabel.getValue();
    }

    public static final TransactionTagLabel KWHzl(java.lang.String str) {
        TransactionTagLabel transactionTagLabel;
        Intrinsics.checkNotNullParameter(str, "");
        TransactionTagLabel[] transactionTagLabelArrValues = TransactionTagLabel.values();
        int length = transactionTagLabelArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                transactionTagLabel = null;
                break;
            }
            transactionTagLabel = transactionTagLabelArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) transactionTagLabel.getValue(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return transactionTagLabel == null ? TransactionTagLabel.NoTag : transactionTagLabel;
    }
}
