package o;

import com.okinc.okex.center.bean.enums.CommonServiceType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.seA, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C44817seA extends C45303snJ<CommonServiceType> {
    public C44817seA() {
        super("CommonServiceType", new Function1() { // from class: o.sex
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C44817seA.KWHzl((CommonServiceType) obj));
            }
        }, new Function1() { // from class: o.seD
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44817seA.AEQbTJ(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int KWHzl(CommonServiceType commonServiceType) {
        Intrinsics.checkNotNullParameter(commonServiceType, "");
        return commonServiceType.getValue();
    }

    public static final CommonServiceType AEQbTJ(int i) {
        CommonServiceType commonServiceType;
        CommonServiceType[] commonServiceTypeArrValues = CommonServiceType.values();
        int length = commonServiceTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                commonServiceType = null;
                break;
            }
            commonServiceType = commonServiceTypeArrValues[i2];
            if (commonServiceType.getValue() == i) {
                break;
            }
            i2++;
        }
        return commonServiceType == null ? CommonServiceType.UNKNOWN : commonServiceType;
    }
}
