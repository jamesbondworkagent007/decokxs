package o;

import com.okinc.components.track.TrackChannel;
import com.okinc.components.track.bean.EventParam;
import com.okinc.components.track.bean.EventParamsList;
import com.okinc.core.util.SPUtils;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.mlg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C32867mlg {
    public static final C32867mlg KWHzl = new C32867mlg();

    private C32867mlg() {
    }

    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt(@NotNull EventParamsList eventParamsList, boolean z) {
        Intrinsics.checkNotNullParameter(eventParamsList, "");
        android.util.ArrayMap arrayMap = new android.util.ArrayMap(eventParamsList.size());
        int i = 0;
        int i2 = 0;
        for (EventParam eventParam : eventParamsList) {
            if (eventParam.EZpvd()) {
                if (z) {
                    arrayMap.put(eventParam.copydefault(), eventParam.KWHzl());
                }
                arrayMap.put("_reser" + i2, eventParam.KWHzl());
                i2++;
            } else {
                if (z) {
                    arrayMap.put(eventParam.copydefault(), eventParam.KWHzl());
                }
                arrayMap.put("_unlist" + i, eventParam.KWHzl());
                i++;
            }
        }
        return arrayMap;
    }

    public final TrackChannel[] KWHzl(@NotNull java.lang.String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return C32872mll.OLrzqt.EZpvd();
    }

    public final java.util.Map<java.lang.String, java.lang.String> AEQbTJ(@NotNull java.util.List<EventParam> list) {
        Intrinsics.checkNotNullParameter(list, "");
        android.util.ArrayMap arrayMap = new android.util.ArrayMap(list.size());
        for (EventParam eventParam : list) {
            arrayMap.put(eventParam.copydefault(), eventParam.KWHzl());
        }
        return arrayMap;
    }

    public final void OLrzqt(java.lang.String str) {
        SPUtils.put("app_instance_id_key", str, "firebase_analytics_app_instance_id_file");
    }
}
