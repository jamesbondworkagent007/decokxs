package o;

import com.okinc.okex.center.bean.enums.BannerType;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: o.seu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C44863seu extends C6984aZg<BannerType> {
    public C44863seu() {
        super("BannerType", new Function1() { // from class: o.ses
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44863seu.copydefault((BannerType) obj);
            }
        }, new Function1() { // from class: o.set
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return C44863seu.KWHzl((java.lang.String) obj);
            }
        });
    }

    public static final java.lang.String copydefault(BannerType bannerType) {
        Intrinsics.checkNotNullParameter(bannerType, "");
        return bannerType.getValue();
    }

    public static final BannerType KWHzl(java.lang.String str) {
        BannerType bannerType;
        Intrinsics.checkNotNullParameter(str, "");
        BannerType[] bannerTypeArrValues = BannerType.values();
        int length = bannerTypeArrValues.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                bannerType = null;
                break;
            }
            bannerType = bannerTypeArrValues[i];
            if (Intrinsics.EZpvd((java.lang.Object) bannerType.getValue(), (java.lang.Object) str)) {
                break;
            }
            i++;
        }
        return bannerType == null ? BannerType.DEFAULT : bannerType;
    }
}
