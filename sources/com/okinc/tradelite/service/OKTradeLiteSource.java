package com.okinc.tradelite.service;

import com.okinc.tradelite.service.OKTradeLiteSource;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56423yEv;
import o.C56444yFp;
import o.C56548yJl;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
@Serializable
public final class OKTradeLiteSource {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OKTradeLiteSource[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private static final InterfaceC56387yDm<Map<String, OKTradeLiteSource>> sourceMap$delegate;
    private final String tag;
    public static final OKTradeLiteSource LITE_HOME_PAGE = new OKTradeLiteSource("LITE_HOME_PAGE", 0, "lite_home_page");
    public static final OKTradeLiteSource LITE_DISCOVER_PAGE = new OKTradeLiteSource("LITE_DISCOVER_PAGE", 1, "lite_discover_page");
    public static final OKTradeLiteSource LITE_TRADE_PAGE = new OKTradeLiteSource("LITE_TRADE_PAGE", 2, "lite_trade_page");
    public static final OKTradeLiteSource LITE_SEARCH_PAGE = new OKTradeLiteSource("LITE_SEARCH_PAGE", 3, "lite_search_page");
    public static final OKTradeLiteSource LITE_PORTFOLIO_TOKEN = new OKTradeLiteSource("LITE_PORTFOLIO_TOKEN", 4, "lite_portfolio_token");
    public static final OKTradeLiteSource LITE_PORTFOLIO_HISTORY = new OKTradeLiteSource("LITE_PORTFOLIO_HISTORY", 5, "lite_portfolio_history");
    public static final OKTradeLiteSource LITE_DEEPLINK = new OKTradeLiteSource("LITE_DEEPLINK", 6, "lite_deeplink");
    public static final OKTradeLiteSource LITE_ASSET_DETAIL = new OKTradeLiteSource("LITE_ASSET_DETAIL", 7, "lite_asset_detail");
    public static final OKTradeLiteSource LITE_KLINE_PAGE = new OKTradeLiteSource("LITE_KLINE_PAGE", 8, "lite_kline_page");
    public static final OKTradeLiteSource LITE_ACTIVITY_ORDER_PAGE = new OKTradeLiteSource("LITE_ACTIVITY_ORDER_PAGE", 9, "lite_activity_order_page");
    public static final OKTradeLiteSource LITE_ACTIVITY_LEAD_TRADE_PAGE = new OKTradeLiteSource("LITE_ACTIVITY_LEAD_TRADE_PAGE", 10, "LITE_ACTIVITY_LEAD_TRADE_PAGE");
    public static final OKTradeLiteSource TRADE_INTERNAL_FLOW = new OKTradeLiteSource("TRADE_INTERNAL_FLOW", 11, "trade_internal_flow");
    public static final OKTradeLiteSource UNKNOWN_SOURCE = new OKTradeLiteSource("UNKNOWN_SOURCE", 12, "unknown_source");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OKTradeLiteSource[] $values() {
        return new OKTradeLiteSource[]{LITE_HOME_PAGE, LITE_DISCOVER_PAGE, LITE_TRADE_PAGE, LITE_SEARCH_PAGE, LITE_PORTFOLIO_TOKEN, LITE_PORTFOLIO_HISTORY, LITE_DEEPLINK, LITE_ASSET_DETAIL, LITE_KLINE_PAGE, LITE_ACTIVITY_ORDER_PAGE, LITE_ACTIVITY_LEAD_TRADE_PAGE, TRADE_INTERNAL_FLOW, UNKNOWN_SOURCE};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OKTradeLiteSource> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTag() {
        return this.tag;
    }

    private OKTradeLiteSource(String str, int i, String str2) {
        this.tag = str2;
    }

    static {
        OKTradeLiteSource[] oKTradeLiteSourceArr$values = $values();
        $VALUES = oKTradeLiteSourceArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(oKTradeLiteSourceArr$values);
        Companion = new Companion(null);
        sourceMap$delegate = C56392yDr.copydefault(new Function0() { // from class: o.upr
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKTradeLiteSource.sourceMap_delegate$lambda$0();
            }
        });
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.upp
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return OKTradeLiteSource._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradelite.service.OKTradeLiteSource.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer KWHzl() {
            return (KSerializer) OKTradeLiteSource.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<OKTradeLiteSource> serializer() {
            return KWHzl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.okinc.tradelite.service.OKTradeLiteSource", values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map sourceMap_delegate$lambda$0() {
        OKTradeLiteSource[] oKTradeLiteSourceArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(oKTradeLiteSourceArrValues.length), 16));
        for (OKTradeLiteSource oKTradeLiteSource : oKTradeLiteSourceArrValues) {
            linkedHashMap.put(oKTradeLiteSource.tag, oKTradeLiteSource);
        }
        return linkedHashMap;
    }

    public static OKTradeLiteSource valueOf(String str) {
        return (OKTradeLiteSource) Enum.valueOf(OKTradeLiteSource.class, str);
    }

    public static OKTradeLiteSource[] values() {
        return (OKTradeLiteSource[]) $VALUES.clone();
    }
}
