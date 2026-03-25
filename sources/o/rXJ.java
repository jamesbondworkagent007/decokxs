package o;

import com.okinc.okcomponents.feature.oknotificationcenter.api.business.notificationmessage.model.InHouseIMChannelType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class rXJ extends rXB<InHouseIMChannelType> {
    public rXJ() {
        super("InHouseIMContentType", InHouseIMChannelType.values(), new Function1() { // from class: o.rXI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(rXJ.KWHzl((InHouseIMChannelType) obj));
            }
        }, new Function1() { // from class: o.rXK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return rXJ.AEQbTJ(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int KWHzl(InHouseIMChannelType inHouseIMChannelType) {
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
