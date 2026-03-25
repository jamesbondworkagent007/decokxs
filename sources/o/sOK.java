package o;

import com.okinc.okimcore.model.im.group.GroupPublicType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class sOK extends C44442sPz<GroupPublicType> {
    public sOK() {
        super("publicType", GroupPublicType.values(), new Function1() { // from class: o.sOO
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(sOK.AEQbTJ((GroupPublicType) obj));
            }
        }, new Function1() { // from class: o.sOL
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sOK.AEQbTJ(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int AEQbTJ(GroupPublicType groupPublicType) {
        Intrinsics.checkNotNullParameter(groupPublicType, "");
        return groupPublicType.getRawValue();
    }

    public static final GroupPublicType AEQbTJ(int i) {
        GroupPublicType groupPublicType;
        GroupPublicType[] groupPublicTypeArrValues = GroupPublicType.values();
        int length = groupPublicTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                groupPublicType = null;
                break;
            }
            groupPublicType = groupPublicTypeArrValues[i2];
            if (groupPublicType.getRawValue() == i) {
                break;
            }
            i2++;
        }
        return groupPublicType == null ? GroupPublicType.UNKNOWN : groupPublicType;
    }
}
