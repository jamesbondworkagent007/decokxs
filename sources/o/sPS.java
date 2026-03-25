package o;

import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMPlatformType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class sPS extends C44442sPz<InHouseIMPlatformType> {
    public sPS() {
        super("InHouseIMPlatformType", InHouseIMPlatformType.values(), new Function1() { // from class: o.sQa
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(sPS.EZpvd((InHouseIMPlatformType) obj));
            }
        }, new Function1() { // from class: o.sPY
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sPS.copydefault(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int EZpvd(InHouseIMPlatformType inHouseIMPlatformType) {
        Intrinsics.checkNotNullParameter(inHouseIMPlatformType, "");
        return inHouseIMPlatformType.getApiValue();
    }

    public static final InHouseIMPlatformType copydefault(int i) {
        InHouseIMPlatformType inHouseIMPlatformType;
        InHouseIMPlatformType[] inHouseIMPlatformTypeArrValues = InHouseIMPlatformType.values();
        int length = inHouseIMPlatformTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                inHouseIMPlatformType = null;
                break;
            }
            inHouseIMPlatformType = inHouseIMPlatformTypeArrValues[i2];
            if (inHouseIMPlatformType.getApiValue() == i) {
                break;
            }
            i2++;
        }
        return inHouseIMPlatformType == null ? InHouseIMPlatformType.Unknown : inHouseIMPlatformType;
    }
}
