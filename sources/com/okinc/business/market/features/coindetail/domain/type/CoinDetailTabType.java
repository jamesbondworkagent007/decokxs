package com.okinc.business.market.features.coindetail.domain.type;

import com.okinc.business.defi.api.bean.VerifyDAppDomainResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56444yFp;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public final class CoinDetailTabType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ CoinDetailTabType[] $VALUES;
    public static final Activity Companion;
    private final String appTabName;
    private final String trackingValue;
    public static final CoinDetailTabType CHART = new CoinDetailTabType("CHART", 0, "chart", "chart");
    public static final CoinDetailTabType INFO = new CoinDetailTabType("INFO", 1, "info", "info");
    public static final CoinDetailTabType DATA = new CoinDetailTabType("DATA", 2, "data", "data");
    public static final CoinDetailTabType ASSESSMENT = new CoinDetailTabType("ASSESSMENT", 3, VerifyDAppDomainResponse.LEVEL_RISK, "audit");
    public static final CoinDetailTabType FEEDS = new CoinDetailTabType("FEEDS", 4, "vibes", "feed");
    public static final CoinDetailTabType EARN = new CoinDetailTabType("EARN", 5, "defi", "earn");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ CoinDetailTabType[] $values() {
        return new CoinDetailTabType[]{CHART, INFO, DATA, ASSESSMENT, FEEDS, EARN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<CoinDetailTabType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAppTabName() {
        return this.appTabName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrackingValue() {
        return this.trackingValue;
    }

    private CoinDetailTabType(String str, int i, String str2, String str3) {
        this.trackingValue = str2;
        this.appTabName = str3;
    }

    static {
        CoinDetailTabType[] coinDetailTabTypeArr$values = $values();
        $VALUES = coinDetailTabTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(coinDetailTabTypeArr$values);
        Companion = new Activity(null);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.coindetail.domain.type.CoinDetailTabType.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final String AEQbTJ(@NotNull CoinDetailTabType coinDetailTabType) {
            Intrinsics.checkNotNullParameter(coinDetailTabType, "");
            return coinDetailTabType.getAppTabName();
        }
    }

    public static CoinDetailTabType valueOf(String str) {
        return (CoinDetailTabType) Enum.valueOf(CoinDetailTabType.class, str);
    }

    public static CoinDetailTabType[] values() {
        return (CoinDetailTabType[]) $VALUES.clone();
    }
}
