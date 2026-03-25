package o;

import com.okinc.okex.center.bean.TopicListItem;
import com.okinc.okex.center.bean.TopicSection;
import kotlin.collections.CollectionsKt___CollectionsKt;

/* JADX INFO: renamed from: o.soC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C45349soC {
    public static final java.util.List<TopicListItem> AEQbTJ(java.util.List<TopicSection> list) {
        java.lang.String iconBright;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (TopicSection topicSection : list) {
            java.util.List listEZpvd = C56402yEa.EZpvd(new TopicListItem.TopicHeaderItem(topicSection.getTitle()));
            java.util.List<TopicSection> list2 = topicSection.getList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList(C56403yEb.AYXKKw(list2, 10));
            for (TopicSection topicSection2 : list2) {
                java.lang.String id = topicSection2.getId();
                java.lang.String title = topicSection2.getTitle();
                java.lang.String description = topicSection2.getDescription();
                if (C33492mxV.OLrzqt()) {
                    iconBright = topicSection2.getIconDark();
                } else {
                    iconBright = topicSection2.getIconBright();
                }
                arrayList2.add(new TopicListItem.TopicItem(id, title, description, iconBright, null, topicSection2.getSlug(), 16, null));
            }
            C56406yEe.KWHzl(arrayList, CollectionsKt___CollectionsKt.djBIcL((java.util.Collection) listEZpvd, (java.lang.Iterable) arrayList2));
        }
        return arrayList;
    }
}
