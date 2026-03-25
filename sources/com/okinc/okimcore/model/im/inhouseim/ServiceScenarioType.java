package com.okinc.okimcore.model.im.inhouseim;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes16.dex */
public final class ServiceScenarioType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ ServiceScenarioType[] $VALUES;
    public static final ServiceScenarioType TRADING_COMPETITION = new ServiceScenarioType("TRADING_COMPETITION", 0, "91");
    private final String value;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ ServiceScenarioType[] $values() {
        return new ServiceScenarioType[]{TRADING_COMPETITION};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<ServiceScenarioType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private ServiceScenarioType(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        ServiceScenarioType[] serviceScenarioTypeArr$values = $values();
        $VALUES = serviceScenarioTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(serviceScenarioTypeArr$values);
    }

    public static ServiceScenarioType valueOf(String str) {
        return (ServiceScenarioType) Enum.valueOf(ServiceScenarioType.class, str);
    }

    public static ServiceScenarioType[] values() {
        return (ServiceScenarioType[]) $VALUES.clone();
    }
}
