package o;

import com.okinc.okimcore.model.im.inhouseim.ws.GroupStatus;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class sPB extends C44442sPz<GroupStatus> {
    public sPB() {
        super("GroupStatus", GroupStatus.values(), new Function1() { // from class: o.sPH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(sPB.AEQbTJ((GroupStatus) obj));
            }
        }, new Function1() { // from class: o.sPF
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sPB.AEQbTJ(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int AEQbTJ(GroupStatus groupStatus) {
        Intrinsics.checkNotNullParameter(groupStatus, "");
        return groupStatus.getApiValue();
    }

    public static final GroupStatus AEQbTJ(int i) {
        return GroupStatus.Companion.OLrzqt(java.lang.Integer.valueOf(i));
    }
}
