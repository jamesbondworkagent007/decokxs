package o;

import com.okinc.okimcore.model.im.inhouseim.ReceiveMessageOptionType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sPq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44433sPq extends C44442sPz<ReceiveMessageOptionType> {
    public C44433sPq() {
        super("ReceiveMessageOptionType", ReceiveMessageOptionType.values(), new Function1() { // from class: o.sPo
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C44433sPq.KWHzl((ReceiveMessageOptionType) obj));
            }
        }, new Function1() { // from class: o.sPv
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44433sPq.OLrzqt(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int KWHzl(ReceiveMessageOptionType receiveMessageOptionType) {
        Intrinsics.checkNotNullParameter(receiveMessageOptionType, "");
        return receiveMessageOptionType.getApiValue();
    }

    public static final ReceiveMessageOptionType OLrzqt(int i) {
        ReceiveMessageOptionType receiveMessageOptionType;
        ReceiveMessageOptionType[] receiveMessageOptionTypeArrValues = ReceiveMessageOptionType.values();
        int length = receiveMessageOptionTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                receiveMessageOptionType = null;
                break;
            }
            receiveMessageOptionType = receiveMessageOptionTypeArrValues[i2];
            if (receiveMessageOptionType.getApiValue() == i) {
                break;
            }
            i2++;
        }
        return receiveMessageOptionType == null ? ReceiveMessageOptionType.UNKNOWN : receiveMessageOptionType;
    }
}
