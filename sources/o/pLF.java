package o;

import com.huawei.hms.push.constant.RemoteMessageConst;
import com.okinc.lifecycle.impl.deeplink.core.LinkState;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public final class pLF {
    public static final boolean KWHzl(@NotNull LinkState linkState) {
        Intrinsics.checkNotNullParameter(linkState, "");
        return linkState == LinkState.LINK_OPENED_EXTERNALLY || linkState == LinkState.SUCCESS;
    }

    public static final void AEQbTJ(@NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, @NotNull kOG kog) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(kog, "");
        if (map.containsKey(RemoteMessageConst.Notification.CHANNEL_ID)) {
            kog.AEQbTJ(java.lang.String.valueOf(map.get(RemoteMessageConst.Notification.CHANNEL_ID)));
        }
    }

    public static final void KWHzl(@NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, pKI pki, @NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (!map.containsKey("ref") || pki == null) {
            return;
        }
        pki.copydefault(str, java.lang.String.valueOf(map.get("ref")));
    }

    public static final void OLrzqt(@NotNull java.util.Map<java.lang.String, ? extends java.lang.Object> map, pKI pki, @NotNull java.lang.String str) {
        pKM pkm;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (map.containsKey("utm_medium")) {
            java.lang.String strValueOf = java.lang.String.valueOf(map.get("utm_medium"));
            java.lang.Object obj = map.get("utm_source");
            java.lang.String string = obj != null ? obj.toString() : null;
            java.lang.Object obj2 = map.get("utm_campaign");
            java.lang.String string2 = obj2 != null ? obj2.toString() : null;
            java.lang.Object obj3 = map.get("utm_content");
            java.lang.String string3 = obj3 != null ? obj3.toString() : null;
            java.lang.Object obj4 = map.get("utm_term");
            pkm = new pKM(strValueOf, string, string2, string3, obj4 != null ? obj4.toString() : null);
        } else {
            pkm = null;
        }
        java.lang.String strValueOf2 = map.containsKey("ref") ? java.lang.String.valueOf(map.get("ref")) : null;
        if ((pkm == null && strValueOf2 == null) || pki == null) {
            return;
        }
        pki.EZpvd(str, pkm, strValueOf2);
    }
}
