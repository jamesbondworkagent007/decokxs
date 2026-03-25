package o;

import com.okinc.okex.center.bean.enums.CategorySlug;
import com.okinc.okex.search.bean.SearchArticleBean;
import com.okinc.okex.search.ui.displaymodels.SearchArticleDisplayModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.sBl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44049sBl {
    public static /* synthetic */ SearchArticleDisplayModel toSearchArticleDisplayModel$default(SearchArticleBean searchArticleBean, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return KWHzl(searchArticleBean, str);
    }

    public static final SearchArticleDisplayModel KWHzl(@NotNull SearchArticleBean searchArticleBean, java.lang.String str) {
        Intrinsics.checkNotNullParameter(searchArticleBean, "");
        java.lang.String title = searchArticleBean.getTitle();
        java.lang.String str2 = title == null ? "" : title;
        java.lang.String url = searchArticleBean.getUrl();
        java.lang.String str3 = url == null ? "" : url;
        java.lang.String slug = searchArticleBean.getSlug();
        java.lang.String str4 = slug == null ? "" : slug;
        java.lang.Long publishTime = searchArticleBean.getPublishTime();
        long jLongValue = publishTime != null ? publishTime.longValue() : 0L;
        java.lang.Long updateTime = searchArticleBean.getUpdateTime();
        long jLongValue2 = updateTime != null ? updateTime.longValue() : 0L;
        java.lang.Integer okxLikesNums = searchArticleBean.getOkxLikesNums();
        int iIntValue = okxLikesNums != null ? okxLikesNums.intValue() : 0;
        java.lang.String categoryName = searchArticleBean.getCategoryName();
        java.lang.String str5 = categoryName == null ? "" : categoryName;
        CategorySlug categorySlug = searchArticleBean.getCategorySlug();
        if (categorySlug == null) {
            categorySlug = CategorySlug.Unknown;
        }
        CategorySlug categorySlug2 = categorySlug;
        java.lang.String rootSectionId = searchArticleBean.getRootSectionId();
        java.lang.String str6 = rootSectionId == null ? "" : rootSectionId;
        java.lang.String str7 = str == null ? "" : str;
        java.lang.String sectionSlug = searchArticleBean.getSectionSlug();
        return new SearchArticleDisplayModel(str2, str3, str4, jLongValue, jLongValue2, iIntValue, str5, categorySlug2, str6, str7, sectionSlug != null ? sectionSlug : "");
    }
}
