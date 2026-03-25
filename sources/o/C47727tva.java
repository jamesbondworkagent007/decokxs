package o;

import com.okinc.planet_api.publisher.PlanetPublisherPluginType;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.tva, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C47727tva {
    public static final java.util.List<PlanetPublisherPluginType> AEQbTJ;
    public static final java.util.List<PlanetPublisherPluginType> AYXKKw;
    public static final C47727tva EZpvd = new C47727tva();
    public static final java.util.Map<PlanetPublisherPluginType, java.lang.String> KWHzl;
    public static final int OLrzqt;
    public static final java.util.Map<PlanetPublisherPluginType, java.lang.String> copydefault;

    private C47727tva() {
    }

    static {
        PlanetPublisherPluginType planetPublisherPluginType = PlanetPublisherPluginType.SPOT;
        kotlin.Pair pairOLrzqt = C56390yDp.OLrzqt(planetPublisherPluginType, "spot");
        PlanetPublisherPluginType planetPublisherPluginType2 = PlanetPublisherPluginType.FUTURES;
        kotlin.Pair pairOLrzqt2 = C56390yDp.OLrzqt(planetPublisherPluginType2, "futures");
        PlanetPublisherPluginType planetPublisherPluginType3 = PlanetPublisherPluginType.BOTS;
        KWHzl = C56424yEw.gEmmrt(pairOLrzqt, pairOLrzqt2, C56390yDp.OLrzqt(planetPublisherPluginType3, "bots"), C56390yDp.OLrzqt(PlanetPublisherPluginType.CHART, "chart"));
        copydefault = C56424yEw.gEmmrt(C56390yDp.OLrzqt(planetPublisherPluginType, "spot_position"), C56390yDp.OLrzqt(planetPublisherPluginType3, "bot_position"));
        AEQbTJ = yDY.gEmmrt(planetPublisherPluginType2, planetPublisherPluginType, planetPublisherPluginType3, PlanetPublisherPluginType.DEBUG1, PlanetPublisherPluginType.DEBUG2);
        AYXKKw = yDY.gEmmrt(planetPublisherPluginType, planetPublisherPluginType2, planetPublisherPluginType3);
        OLrzqt = 8;
    }

    public final boolean KWHzl(@NotNull PlanetPublisherPluginType planetPublisherPluginType) {
        Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
        return AEQbTJ.contains(planetPublisherPluginType);
    }

    public final java.lang.String AEQbTJ(PlanetPublisherPluginType planetPublisherPluginType) {
        if (planetPublisherPluginType != null) {
            return copydefault.get(planetPublisherPluginType);
        }
        return null;
    }

    public final boolean EZpvd(PlanetPublisherPluginType planetPublisherPluginType) {
        return planetPublisherPluginType != null && KWHzl(planetPublisherPluginType);
    }

    public final java.util.Map<java.lang.String, java.lang.String> OLrzqt(PlanetPublisherPluginType planetPublisherPluginType) {
        boolean zEZpvd = EZpvd(planetPublisherPluginType);
        java.lang.String strAEQbTJ = AEQbTJ(planetPublisherPluginType);
        if (strAEQbTJ == null) {
            strAEQbTJ = "no_plugin";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("insert_plugin", java.lang.String.valueOf(zEZpvd));
        linkedHashMap.put("plugin_type", strAEQbTJ);
        if (!zEZpvd) {
            linkedHashMap.put("plugin_token", "no_plugin");
            linkedHashMap.put("plugin_option_pnl", "no_plugin");
        }
        return linkedHashMap;
    }

    public final java.lang.String copydefault(@NotNull PlanetPublisherPluginType planetPublisherPluginType) {
        Intrinsics.checkNotNullParameter(planetPublisherPluginType, "");
        java.lang.String str = KWHzl.get(planetPublisherPluginType);
        return str == null ? planetPublisherPluginType.getValue() : str;
    }
}
