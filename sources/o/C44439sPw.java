package o;

import com.okinc.okimcore.model.im.inhouseim.UserTagType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.sPw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C44439sPw extends C44442sPz<UserTagType> {
    public C44439sPw() {
        super("UserTagType", UserTagType.values(), new Function1() { // from class: o.sPu
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return java.lang.Integer.valueOf(C44439sPw.KWHzl((UserTagType) obj));
            }
        }, new Function1() { // from class: o.sPt
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44439sPw.OLrzqt(((java.lang.Integer) obj).intValue());
            }
        });
    }

    public static final int KWHzl(UserTagType userTagType) {
        Intrinsics.checkNotNullParameter(userTagType, "");
        return userTagType.getApiValue();
    }

    public static final UserTagType OLrzqt(int i) {
        UserTagType userTagType;
        UserTagType[] userTagTypeArrValues = UserTagType.values();
        int length = userTagTypeArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                userTagType = null;
                break;
            }
            userTagType = userTagTypeArrValues[i2];
            if (userTagType.getApiValue() == i) {
                break;
            }
            i2++;
        }
        return userTagType == null ? UserTagType.UNKNOWN : userTagType;
    }
}
