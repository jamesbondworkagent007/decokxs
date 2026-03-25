package o;

import com.okinc.okex.search.bean.SearchSectionBean;
import com.okinc.okex.search.ui.displaymodels.SearchSectionDisplayModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sBq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44054sBq {
    public static final SearchSectionDisplayModel AEQbTJ(@NotNull SearchSectionBean searchSectionBean) {
        java.lang.String iconBright;
        Intrinsics.checkNotNullParameter(searchSectionBean, "");
        if (C33492mxV.OLrzqt()) {
            iconBright = searchSectionBean.getIconDark();
        } else {
            iconBright = searchSectionBean.getIconBright();
        }
        java.lang.String id = searchSectionBean.getId();
        java.lang.String str = id == null ? "" : id;
        java.lang.String slug = searchSectionBean.getSlug();
        java.lang.String str2 = slug == null ? "" : slug;
        java.lang.String title = searchSectionBean.getTitle();
        java.lang.String str3 = title == null ? "" : title;
        java.lang.String chipColor = searchSectionBean.getChipColor();
        return new SearchSectionDisplayModel(str, str2, str3, chipColor == null ? "" : chipColor, iconBright == null ? "" : iconBright);
    }
}
