package o;

import com.okinc.okex.center.bean.DisplayControl;
import com.okinc.okex.center.bean.enums.RecommendSection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sel, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44854sel {
    public static final boolean OLrzqt(DisplayControl displayControl, @NotNull RecommendSection recommendSection) {
        Intrinsics.checkNotNullParameter(recommendSection, "");
        if (displayControl == null) {
            return true;
        }
        java.util.Set<RecommendSection> sections = displayControl.getSections();
        return sections != null && sections.contains(recommendSection);
    }
}
