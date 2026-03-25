package o;

import com.okinc.business.dexlogic.bean.ChainKeyBean;
import kotlin.jvm.internal.Intrinsics;
import o.C6777aVl;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.ihV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C24631ihV {
    public static final C24631ihV KWHzl = new C24631ihV();

    private C24631ihV() {
    }

    public void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        java.lang.String message;
        java.lang.String message2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        try {
            ChainKeyBean chainKeyBeanFetchVPNInfo = C23317hvu.fetchVPNInfo();
            if (chainKeyBeanFetchVPNInfo == null) {
                java.util.HashMap map = new java.util.HashMap();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(str2);
                map.put(str, arrayList);
                ChainKeyBean chainKeyBean = new ChainKeyBean(map);
                C23317hvu.OLrzqt(chainKeyBean);
                chainKeyBeanFetchVPNInfo = chainKeyBean;
            }
            java.util.List<java.lang.String> list = chainKeyBeanFetchVPNInfo.getMap().get(str);
            if (list == null || !list.contains(str2)) {
                java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> map2 = chainKeyBeanFetchVPNInfo.getMap();
                java.util.List<java.lang.String> arrayList2 = map2.get(str);
                if (arrayList2 == null) {
                    arrayList2 = new java.util.ArrayList<>();
                    map2.put(str, arrayList2);
                }
                java.util.ArrayList arrayList3 = (java.util.ArrayList) arrayList2;
                if (arrayList3.size() > 0) {
                    arrayList3.remove(yDY.AuCTel(arrayList3));
                }
                arrayList3.add(0, str2);
                C23317hvu.OLrzqt(chainKeyBeanFetchVPNInfo);
            }
        } catch (java.lang.Exception e) {
            C6777aVl.TaskDescription taskDescription = C6777aVl.Companion;
            java.lang.Throwable cause = e.getCause();
            if (cause == null || (message = cause.getMessage()) == null) {
                message = "";
            }
            taskDescription.EZpvd(new java.lang.Exception("ChainCacheUtils:" + message));
            C55328xhq c55328xhq = C55328xhq.OLrzqt;
            java.lang.Throwable cause2 = e.getCause();
            C55328xhq.show$default(c55328xhq, (cause2 == null || (message2 = cause2.getMessage()) == null) ? "" : message2, (android.graphics.drawable.Drawable) null, 0, (java.lang.Integer) null, 0, 0, 62, (java.lang.Object) null);
        }
    }
}
