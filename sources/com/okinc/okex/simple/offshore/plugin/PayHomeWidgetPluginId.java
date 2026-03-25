package com.okinc.okex.simple.offshore.plugin;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes24.dex */
public final class PayHomeWidgetPluginId {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ PayHomeWidgetPluginId[] $VALUES;
    public static final PayHomeWidgetPluginId KYC = new PayHomeWidgetPluginId("KYC", 0);
    public static final PayHomeWidgetPluginId PAY_BALANCE_SUMMARY = new PayHomeWidgetPluginId("PAY_BALANCE_SUMMARY", 1);
    public static final PayHomeWidgetPluginId PAY_PENDING_TRANSACTION = new PayHomeWidgetPluginId("PAY_PENDING_TRANSACTION", 2);
    public static final PayHomeWidgetPluginId PAY_SCAN_TO_PAY = new PayHomeWidgetPluginId("PAY_SCAN_TO_PAY", 3);
    public static final PayHomeWidgetPluginId DEBIT_CARD = new PayHomeWidgetPluginId("DEBIT_CARD", 4);
    public static final PayHomeWidgetPluginId SMART_CARD = new PayHomeWidgetPluginId("SMART_CARD", 5);
    public static final PayHomeWidgetPluginId RECENT_ACTIVITIES = new PayHomeWidgetPluginId("RECENT_ACTIVITIES", 6);
    public static final PayHomeWidgetPluginId RECENT_CONTACTS = new PayHomeWidgetPluginId("RECENT_CONTACTS", 7);
    public static final PayHomeWidgetPluginId PAY_SELLING_POINTS = new PayHomeWidgetPluginId("PAY_SELLING_POINTS", 8);
    public static final PayHomeWidgetPluginId BALANCE = new PayHomeWidgetPluginId("BALANCE", 9);
    public static final PayHomeWidgetPluginId FAQ = new PayHomeWidgetPluginId("FAQ", 10);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ PayHomeWidgetPluginId[] $values() {
        return new PayHomeWidgetPluginId[]{KYC, PAY_BALANCE_SUMMARY, PAY_PENDING_TRANSACTION, PAY_SCAN_TO_PAY, DEBIT_CARD, SMART_CARD, RECENT_ACTIVITIES, RECENT_CONTACTS, PAY_SELLING_POINTS, BALANCE, FAQ};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<PayHomeWidgetPluginId> getEntries() {
        return $ENTRIES;
    }

    private PayHomeWidgetPluginId(String str, int i) {
    }

    static {
        PayHomeWidgetPluginId[] payHomeWidgetPluginIdArr$values = $values();
        $VALUES = payHomeWidgetPluginIdArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(payHomeWidgetPluginIdArr$values);
    }

    public static PayHomeWidgetPluginId valueOf(String str) {
        return (PayHomeWidgetPluginId) Enum.valueOf(PayHomeWidgetPluginId.class, str);
    }

    public static PayHomeWidgetPluginId[] values() {
        return (PayHomeWidgetPluginId[]) $VALUES.clone();
    }
}
