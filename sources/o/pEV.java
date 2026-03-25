package o;

import com.okinc.kline.library.template.TemplateSetting;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pEV {
    public static final pEV OLrzqt = new pEV();

    private pEV() {
    }

    public final void OLrzqt(@NotNull java.lang.String str, boolean z) {
        java.util.ArrayList<java.lang.String> mainIndicatorNames;
        Intrinsics.checkNotNullParameter(str, "");
        TemplateSetting templateSettingKWHzl = C36246oUr.copydefault().KWHzl("ds0");
        if (!z) {
            if (templateSettingKWHzl != null) {
                templateSettingKWHzl.removeMainIndicatorName(str);
            }
        } else if (templateSettingKWHzl == null || (mainIndicatorNames = templateSettingKWHzl.getMainIndicatorNames()) == null || !mainIndicatorNames.contains(str)) {
            templateSettingKWHzl.addMainIndicatorName(str);
        }
    }

    public final void KWHzl(@NotNull java.lang.String str, boolean z) {
        java.util.ArrayList<java.lang.String> sideIndicatorNames;
        Intrinsics.checkNotNullParameter(str, "");
        TemplateSetting templateSettingKWHzl = C36246oUr.copydefault().KWHzl("ds0");
        if (!z) {
            templateSettingKWHzl.removeSideIndicator(str);
        } else if (templateSettingKWHzl == null || (sideIndicatorNames = templateSettingKWHzl.getSideIndicatorNames()) == null || !sideIndicatorNames.contains(str)) {
            templateSettingKWHzl.addSideIndicator(str);
        }
    }

    public final long KWHzl() {
        int iODWQjV = C36246oUr.copydefault().ODWQjV();
        if (iODWQjV == -1) {
            return 60000L;
        }
        if (iODWQjV != 0) {
            return 1000 * ((long) (iODWQjV * 60));
        }
        return 1000L;
    }
}
