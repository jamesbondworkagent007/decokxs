package o;

import com.okinc.okimcore.model.im.group.GroupEntryAssetVerificationType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class sOF extends C44442sPz<GroupEntryAssetVerificationType> {
    public sOF() {
        super("assetVerificationType", GroupEntryAssetVerificationType.values(), new Function1() { // from class: o.sOH
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(sOF.copydefault((GroupEntryAssetVerificationType) obj));
            }
        }, new Function1() { // from class: o.sOJ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return sOF.copydefault(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int copydefault(GroupEntryAssetVerificationType groupEntryAssetVerificationType) {
        Intrinsics.checkNotNullParameter(groupEntryAssetVerificationType, "");
        return groupEntryAssetVerificationType.getRawValue();
    }

    public static final GroupEntryAssetVerificationType copydefault(int i) {
        GroupEntryAssetVerificationType groupEntryAssetVerificationType;
        GroupEntryAssetVerificationType[] groupEntryAssetVerificationTypeArrValues = GroupEntryAssetVerificationType.values();
        int length = groupEntryAssetVerificationTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                groupEntryAssetVerificationType = null;
                break;
            }
            groupEntryAssetVerificationType = groupEntryAssetVerificationTypeArrValues[i2];
            if (groupEntryAssetVerificationType.getRawValue() == i) {
                break;
            }
            i2++;
        }
        return groupEntryAssetVerificationType == null ? GroupEntryAssetVerificationType.UNKNOWN : groupEntryAssetVerificationType;
    }
}
