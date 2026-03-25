package o;

import com.okinc.okimcore.model.im.group.GroupEntryAssetsVerificationStatus;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class sOC extends C44442sPz<GroupEntryAssetsVerificationStatus> {
    public sOC() {
        super("assetVerificationStatus", GroupEntryAssetsVerificationStatus.values(), new Function1() { // from class: o.sOI
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(sOC.EZpvd((GroupEntryAssetsVerificationStatus) obj));
            }
        }, new Function1() { // from class: o.sOG
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sOC.copydefault(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int EZpvd(GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus) {
        Intrinsics.checkNotNullParameter(groupEntryAssetsVerificationStatus, "");
        return groupEntryAssetsVerificationStatus.getRawValue();
    }

    public static final GroupEntryAssetsVerificationStatus copydefault(int i) {
        GroupEntryAssetsVerificationStatus groupEntryAssetsVerificationStatus;
        GroupEntryAssetsVerificationStatus[] groupEntryAssetsVerificationStatusArrValues = GroupEntryAssetsVerificationStatus.values();
        int length = groupEntryAssetsVerificationStatusArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                groupEntryAssetsVerificationStatus = null;
                break;
            }
            groupEntryAssetsVerificationStatus = groupEntryAssetsVerificationStatusArrValues[i2];
            if (groupEntryAssetsVerificationStatus.getRawValue() == i) {
                break;
            }
            i2++;
        }
        return groupEntryAssetsVerificationStatus == null ? GroupEntryAssetsVerificationStatus.UNKNOWN : groupEntryAssetsVerificationStatus;
    }
}
