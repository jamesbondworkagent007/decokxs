package o;

import com.amplifyframework.core.model.ModelIdentifier;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.okinc.network.okg.dns.model.DynamicCnameHostBean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.rnC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C43323rnC {
    public static final C43323rnC EZpvd = new C43323rnC();

    private C43323rnC() {
    }

    public final DynamicCnameHostBean KWHzl(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        java.lang.String strReplace$default = C59449zhJ.replace$default(str, ModelIdentifier.Helper.PRIMARY_KEY_ENCAPSULATE_CHAR, "", false, 4, (java.lang.Object) null);
        pUU.EZpvd(str2, "parseCloudFlareResult ==data = " + strReplace$default);
        if (strReplace$default.length() == 0 || !StringsKt__StringsKt.contains$default((java.lang.CharSequence) strReplace$default, (java.lang.CharSequence) HiAnalyticsConstant.REPORT_VAL_SEPARATOR, false, 2, (java.lang.Object) null)) {
            return null;
        }
        java.util.List listSplit$default = StringsKt__StringsKt.split$default((java.lang.CharSequence) strReplace$default, new java.lang.String[]{HiAnalyticsConstant.REPORT_VAL_SEPARATOR}, false, 0, 6, (java.lang.Object) null);
        if (listSplit$default.size() != 2) {
            return null;
        }
        try {
            DynamicCnameHostBean dynamicCnameHostBean = new DynamicCnameHostBean();
            dynamicCnameHostBean.setCname((java.lang.String) listSplit$default.get(0));
            dynamicCnameHostBean.setHostList(StringsKt__StringsKt.split$default((java.lang.CharSequence) listSplit$default.get(1), new java.lang.String[]{":"}, false, 0, 6, (java.lang.Object) null));
            return dynamicCnameHostBean;
        } catch (java.lang.Exception e) {
            pUU.valueOf(str2, "parseCloudFlareResult exception: " + e);
            return null;
        }
    }
}
