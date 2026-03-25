package o;

import com.okinc.okimcore.model.im.inhouseim.ws.MessageHandlingType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class sPZ extends C44442sPz<MessageHandlingType> {
    public sPZ() {
        super("MessageHandlingType", (java.lang.Enum[]) MessageHandlingType.getEntries().toArray(new MessageHandlingType[0]), new Function1() { // from class: o.sQb
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(sPZ.OLrzqt((MessageHandlingType) obj));
            }
        }, new Function1() { // from class: o.sQf
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sPZ.OLrzqt(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int OLrzqt(MessageHandlingType messageHandlingType) {
        Intrinsics.checkNotNullParameter(messageHandlingType, "");
        return messageHandlingType.getValue();
    }

    public static final MessageHandlingType OLrzqt(int i) {
        MessageHandlingType next;
        java.util.Iterator<MessageHandlingType> it = MessageHandlingType.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getValue() == i) {
                break;
            }
        }
        MessageHandlingType messageHandlingType = next;
        return messageHandlingType == null ? MessageHandlingType.UNKNOWN : messageHandlingType;
    }
}
