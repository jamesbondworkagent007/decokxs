package o;

import com.okinc.okex.center.bean.TopicBean;
import com.okinc.okex.center.bean.TopicListItem;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ser, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C44860ser {
    public static final TopicListItem.TopicItem AEQbTJ(@NotNull TopicBean topicBean) {
        java.lang.String iconBright;
        Intrinsics.checkNotNullParameter(topicBean, "");
        java.lang.String id = topicBean.getId();
        java.lang.String title = topicBean.getTitle();
        java.lang.String description = topicBean.getDescription();
        if (C33492mxV.OLrzqt()) {
            iconBright = topicBean.getIconDark();
        } else {
            iconBright = topicBean.getIconBright();
        }
        return new TopicListItem.TopicItem(id, title, description, iconBright, topicBean.getTags(), topicBean.getSlug());
    }
}
