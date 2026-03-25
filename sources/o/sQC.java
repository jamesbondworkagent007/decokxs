package o;

import com.okinc.okimcore.model.remote.GroupScenarioType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class sQC extends C44442sPz<GroupScenarioType> {
    public sQC() {
        super("GroupScenarioType", GroupScenarioType.values(), new Function1() { // from class: o.sQJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(sQC.copydefault((GroupScenarioType) obj));
            }
        }, new Function1() { // from class: o.sQK
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sQC.copydefault(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int copydefault(GroupScenarioType groupScenarioType) {
        Intrinsics.checkNotNullParameter(groupScenarioType, "");
        return groupScenarioType.getValue();
    }

    public static final GroupScenarioType copydefault(int i) {
        GroupScenarioType groupScenarioType;
        GroupScenarioType[] groupScenarioTypeArrValues = GroupScenarioType.values();
        int length = groupScenarioTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                groupScenarioType = null;
                break;
            }
            groupScenarioType = groupScenarioTypeArrValues[i2];
            if (groupScenarioType.getValue() == i) {
                break;
            }
            i2++;
        }
        return groupScenarioType == null ? GroupScenarioType.Default : groupScenarioType;
    }
}
