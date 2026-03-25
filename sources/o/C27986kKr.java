package o;

import com.okinc.business.market.utils.MarketHomeTabType;
import com.okinc.components.report.ReportManager;
import com.okinc.components.report.db.EventData;
import java.util.LinkedHashMap;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o.kKr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C27986kKr {
    public static final C27986kKr AEQbTJ = new C27986kKr();

    /* JADX INFO: renamed from: o.kKr$Application */
    /* JADX INFO: loaded from: classes15.dex */
    public final /* synthetic */ class Application {
        public static final /* synthetic */ int[] AEQbTJ;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        static {
            int[] iArr = new int[MarketHomeTabType.values().length];
            try {
                iArr[MarketHomeTabType.FAVORITE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[MarketHomeTabType.INDEX.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[MarketHomeTabType.HOT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[MarketHomeTabType.UP_RANK.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[MarketHomeTabType.NEW_COIN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            AEQbTJ = iArr;
        }
    }

    private C27986kKr() {
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EventData eventData = new EventData();
        eventData.setAct("market_tab_click");
        eventData.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt(str, str2)));
        ReportManager.AEQbTJ.EZpvd(eventData);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull java.util.Map<java.lang.String, java.lang.String> map) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(map, "");
        ReportManager reportManager = ReportManager.AEQbTJ;
        EventData eventData = new EventData();
        eventData.setAct(str);
        eventData.setAttrs(map);
        reportManager.EZpvd(eventData);
        pUU.EZpvd("MarketGrafanaUtils", "reportGrafanaEvent: " + str + " -> " + map);
    }

    public final void OLrzqt(@NotNull java.lang.String str, @NotNull MarketHomeTabType marketHomeTabType) {
        java.lang.String str2;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(marketHomeTabType, "");
        if (str.length() == 0) {
            return;
        }
        EventData eventData = new EventData();
        int i = Application.AEQbTJ[marketHomeTabType.ordinal()];
        if (i == 1) {
            str2 = "home_watchlist_load";
        } else if (i == 2) {
            str2 = "home_watchlist_maincoin_load";
        } else if (i == 3) {
            str2 = "home_watchlist_hotrank_load";
        } else if (i == 4) {
            str2 = "home_watchlist_uprank_load";
        } else {
            if (i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "home_watchlist_newcoin_load";
        }
        eventData.setAct(str2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("totalTime", str);
        eventData.setAttrs(linkedHashMap);
        ReportManager.AEQbTJ.EZpvd(eventData);
        Objects.toString(marketHomeTabType);
    }

    public final void AEQbTJ(@NotNull java.lang.String str, @NotNull java.lang.String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        EventData eventData = new EventData();
        eventData.setAct(str2);
        eventData.setAttrs(C56423yEv.EZpvd(C56390yDp.OLrzqt("totalTime", str)));
        ReportManager.AEQbTJ.EZpvd(eventData);
    }
}
