package o;

import com.okinc.business.market.features.filter.ui.params.TabPosition;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class jVV {
    public static final TabPosition AEQbTJ(int i) {
        TabPosition next;
        java.util.Iterator<TabPosition> it = TabPosition.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getPosition() == i) {
                break;
            }
        }
        TabPosition tabPosition = next;
        return tabPosition == null ? TabPosition.RankTab : tabPosition;
    }

    public static final java.lang.String EZpvd(@NotNull TabPosition tabPosition) {
        Intrinsics.checkNotNullParameter(tabPosition, "");
        return tabPosition.getTabName();
    }
}
