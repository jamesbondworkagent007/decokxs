package o;

import com.okinc.okimcore.model.im.group.GroupApplicationStatus;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sOk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44400sOk extends C44442sPz<GroupApplicationStatus> {
    public C44400sOk() {
        super("groupApplicationStatus", GroupApplicationStatus.values(), new Function1() { // from class: o.sOn
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C44400sOk.EZpvd((GroupApplicationStatus) obj));
            }
        }, new Function1() { // from class: o.sOl
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44400sOk.KWHzl(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int EZpvd(GroupApplicationStatus groupApplicationStatus) {
        Intrinsics.checkNotNullParameter(groupApplicationStatus, "");
        return groupApplicationStatus.getRawValue();
    }

    public static final GroupApplicationStatus KWHzl(int i) {
        GroupApplicationStatus groupApplicationStatus;
        GroupApplicationStatus[] groupApplicationStatusArrValues = GroupApplicationStatus.values();
        int length = groupApplicationStatusArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                groupApplicationStatus = null;
                break;
            }
            groupApplicationStatus = groupApplicationStatusArrValues[i2];
            if (groupApplicationStatus.getRawValue() == i) {
                break;
            }
            i2++;
        }
        return groupApplicationStatus == null ? GroupApplicationStatus.NOT_SUBMITTED : groupApplicationStatus;
    }
}
