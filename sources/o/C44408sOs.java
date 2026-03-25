package o;

import com.okinc.okimcore.model.im.group.GroupBillingType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sOs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44408sOs extends C44442sPz<GroupBillingType> {
    public C44408sOs() {
        super("billingType", GroupBillingType.values(), new Function1() { // from class: o.sOq
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C44408sOs.OLrzqt((GroupBillingType) obj));
            }
        }, new Function1() { // from class: o.sOu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44408sOs.OLrzqt(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int OLrzqt(GroupBillingType groupBillingType) {
        Intrinsics.checkNotNullParameter(groupBillingType, "");
        return groupBillingType.getRawValue();
    }

    public static final GroupBillingType OLrzqt(int i) {
        GroupBillingType groupBillingType;
        GroupBillingType[] groupBillingTypeArrValues = GroupBillingType.values();
        int length = groupBillingTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                groupBillingType = null;
                break;
            }
            groupBillingType = groupBillingTypeArrValues[i2];
            if (groupBillingType.getRawValue() == i) {
                break;
            }
            i2++;
        }
        return groupBillingType == null ? GroupBillingType.UNKNOWN : groupBillingType;
    }
}
