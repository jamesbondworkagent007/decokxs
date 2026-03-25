package com.okinc.okassetslite.api.assets_lite_api.simple;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56423yEv;
import o.C56444yFp;
import o.C56548yJl;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes23.dex */
public final class SimpleIaPortfolioWidgetId {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ SimpleIaPortfolioWidgetId[] $VALUES;
    public static final TaskDescription Companion;
    public static final String PLUGIN_NAVIGATION_KEY = "PLUGIN_NAVIGATION_KEY";
    private static final Map<Integer, SimpleIaPortfolioWidgetId> map;
    private final int widgetId;
    public static final SimpleIaPortfolioWidgetId ASSET_CHART = new SimpleIaPortfolioWidgetId("ASSET_CHART", 0, 1);
    public static final SimpleIaPortfolioWidgetId FROZEN_ASSET_BANNER = new SimpleIaPortfolioWidgetId("FROZEN_ASSET_BANNER", 1, 2);
    public static final SimpleIaPortfolioWidgetId EARN_SECTION = new SimpleIaPortfolioWidgetId("EARN_SECTION", 2, 3);
    public static final SimpleIaPortfolioWidgetId CASH_SECTION = new SimpleIaPortfolioWidgetId("CASH_SECTION", 3, 4);
    public static final SimpleIaPortfolioWidgetId CRYPTO_SECTION = new SimpleIaPortfolioWidgetId("CRYPTO_SECTION", 4, 5);
    public static final SimpleIaPortfolioWidgetId MULTI_ACCOUNT_BREAKDOWN_SECTION = new SimpleIaPortfolioWidgetId("MULTI_ACCOUNT_BREAKDOWN_SECTION", 5, 6);
    public static final SimpleIaPortfolioWidgetId PENDING_DEX_TRANSACTION = new SimpleIaPortfolioWidgetId("PENDING_DEX_TRANSACTION", 6, 7);
    public static final SimpleIaPortfolioWidgetId LEND_SECTION = new SimpleIaPortfolioWidgetId("LEND_SECTION", 7, 8);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ SimpleIaPortfolioWidgetId[] $values() {
        return new SimpleIaPortfolioWidgetId[]{ASSET_CHART, FROZEN_ASSET_BANNER, EARN_SECTION, CASH_SECTION, CRYPTO_SECTION, MULTI_ACCOUNT_BREAKDOWN_SECTION, PENDING_DEX_TRANSACTION, LEND_SECTION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<SimpleIaPortfolioWidgetId> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getWidgetId() {
        return this.widgetId;
    }

    private SimpleIaPortfolioWidgetId(String str, int i, int i2) {
        this.widgetId = i2;
    }

    static {
        SimpleIaPortfolioWidgetId[] simpleIaPortfolioWidgetIdArr$values = $values();
        $VALUES = simpleIaPortfolioWidgetIdArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(simpleIaPortfolioWidgetIdArr$values);
        Companion = new TaskDescription(null);
        SimpleIaPortfolioWidgetId[] simpleIaPortfolioWidgetIdArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(simpleIaPortfolioWidgetIdArrValues.length), 16));
        for (SimpleIaPortfolioWidgetId simpleIaPortfolioWidgetId : simpleIaPortfolioWidgetIdArrValues) {
            linkedHashMap.put(Integer.valueOf(simpleIaPortfolioWidgetId.widgetId), simpleIaPortfolioWidgetId);
        }
        map = linkedHashMap;
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okassetslite.api.assets_lite_api.simple.SimpleIaPortfolioWidgetId.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }
    }

    public static SimpleIaPortfolioWidgetId valueOf(String str) {
        return (SimpleIaPortfolioWidgetId) Enum.valueOf(SimpleIaPortfolioWidgetId.class, str);
    }

    public static SimpleIaPortfolioWidgetId[] values() {
        return (SimpleIaPortfolioWidgetId[]) $VALUES.clone();
    }
}
