package o;

import com.okinc.okimcore.model.im.inhouseim.ws.InGroupStatus;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class sPD extends C44442sPz<InGroupStatus> {
    public sPD() {
        super("InGroupStatus", InGroupStatus.values(), new Function1() { // from class: o.sPE
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(sPD.EZpvd((InGroupStatus) obj));
            }
        }, new Function1() { // from class: o.sPL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sPD.AEQbTJ(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int EZpvd(InGroupStatus inGroupStatus) {
        Intrinsics.checkNotNullParameter(inGroupStatus, "");
        return inGroupStatus.getApiValue();
    }

    public static final InGroupStatus AEQbTJ(int i) {
        return InGroupStatus.Companion.OLrzqt(java.lang.Integer.valueOf(i));
    }
}
