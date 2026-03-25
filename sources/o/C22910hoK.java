package o;

import com.okinc.business.dexlogic.bean.ReferralParamInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.hoK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C22910hoK {
    public static /* synthetic */ java.util.Map getReferralParamInfoMap$default(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            str5 = "";
        }
        return KWHzl(str, str2, str3, str4, str5);
    }

    public static final java.util.Map<java.lang.String, java.lang.String> KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2, @NotNull java.lang.String str3, @NotNull java.lang.String str4, @NotNull java.lang.String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new ReferralParamInfo(str, str2, str3, str4, str5).referralToMap();
    }
}
