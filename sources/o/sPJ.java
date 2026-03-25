package o;

import com.okinc.okimcore.model.im.inhouseim.ws.InHouseIMChannelType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class sPJ extends C44442sPz<InHouseIMChannelType> {
    public sPJ() {
        super("InHouseIMContentType", InHouseIMChannelType.values(), new Function1() { // from class: o.sPK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(sPJ.AEQbTJ((InHouseIMChannelType) obj));
            }
        }, new Function1() { // from class: o.sPO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sPJ.AEQbTJ(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int AEQbTJ(InHouseIMChannelType inHouseIMChannelType) {
        Intrinsics.checkNotNullParameter(inHouseIMChannelType, "");
        return inHouseIMChannelType.getApiValue();
    }

    public static final InHouseIMChannelType AEQbTJ(int i) {
        InHouseIMChannelType inHouseIMChannelType;
        InHouseIMChannelType[] inHouseIMChannelTypeArrValues = InHouseIMChannelType.values();
        int length = inHouseIMChannelTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                inHouseIMChannelType = null;
                break;
            }
            inHouseIMChannelType = inHouseIMChannelTypeArrValues[i2];
            if (inHouseIMChannelType.getApiValue() == i) {
                break;
            }
            i2++;
        }
        return inHouseIMChannelType == null ? InHouseIMChannelType.Unknown : inHouseIMChannelType;
    }
}
