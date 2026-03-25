package o;

import com.okinc.okimcore.model.im.group.GroupApplicationType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44404sOo extends C44442sPz<GroupApplicationType> {
    public C44404sOo() {
        super("groupApplicationType", GroupApplicationType.values(), new Function1() { // from class: o.sOm
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C44404sOo.KWHzl((GroupApplicationType) obj));
            }
        }, new Function1() { // from class: o.sOt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44404sOo.EZpvd(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int KWHzl(GroupApplicationType groupApplicationType) {
        Intrinsics.checkNotNullParameter(groupApplicationType, "");
        return groupApplicationType.getRawValue();
    }

    public static final GroupApplicationType EZpvd(int i) {
        GroupApplicationType groupApplicationType;
        GroupApplicationType[] groupApplicationTypeArrValues = GroupApplicationType.values();
        int length = groupApplicationTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                groupApplicationType = null;
                break;
            }
            groupApplicationType = groupApplicationTypeArrValues[i2];
            if (groupApplicationType.getRawValue() == i) {
                break;
            }
            i2++;
        }
        return groupApplicationType == null ? GroupApplicationType.NOT_NEEDED : groupApplicationType;
    }
}
