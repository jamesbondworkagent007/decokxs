package o;

import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMContentType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class sPN extends C44442sPz<InHouseIMContentType> {
    public sPN() {
        super("InHouseIMContentType", InHouseIMContentType.values(), new Function1() { // from class: o.sPW
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(sPN.EZpvd((InHouseIMContentType) obj));
            }
        }, new Function1() { // from class: o.sPT
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sPN.AEQbTJ(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int EZpvd(InHouseIMContentType inHouseIMContentType) {
        Intrinsics.checkNotNullParameter(inHouseIMContentType, "");
        return inHouseIMContentType.getApiValue();
    }

    public static final InHouseIMContentType AEQbTJ(int i) {
        InHouseIMContentType inHouseIMContentType;
        InHouseIMContentType[] inHouseIMContentTypeArrValues = InHouseIMContentType.values();
        int length = inHouseIMContentTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                inHouseIMContentType = null;
                break;
            }
            inHouseIMContentType = inHouseIMContentTypeArrValues[i2];
            if (inHouseIMContentType.getApiValue() == i) {
                break;
            }
            i2++;
        }
        return inHouseIMContentType == null ? InHouseIMContentType.Unknown : inHouseIMContentType;
    }
}
