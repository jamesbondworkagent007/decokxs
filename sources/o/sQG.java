package o;

import com.okinc.okimcore.model.remote.GroupServiceType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class sQG extends C44442sPz<GroupServiceType> {
    public sQG() {
        super("GroupServiceType", GroupServiceType.values(), new Function1() { // from class: o.sQH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(sQG.copydefault((GroupServiceType) obj));
            }
        }, new Function1() { // from class: o.sQN
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sQG.KWHzl(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int copydefault(GroupServiceType groupServiceType) {
        Intrinsics.checkNotNullParameter(groupServiceType, "");
        return groupServiceType.getValue();
    }

    public static final GroupServiceType KWHzl(int i) {
        GroupServiceType groupServiceType;
        GroupServiceType[] groupServiceTypeArrValues = GroupServiceType.values();
        int length = groupServiceTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                groupServiceType = null;
                break;
            }
            groupServiceType = groupServiceTypeArrValues[i2];
            if (groupServiceType.getValue() == i) {
                break;
            }
            i2++;
        }
        return groupServiceType == null ? GroupServiceType.IM : groupServiceType;
    }
}
