package com.okinc.planet.biz_setting.data;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class OrbitSettingUpgradeCardType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ OrbitSettingUpgradeCardType[] $VALUES;
    public static final OrbitSettingUpgradeCardType NON_ORBITER_TO_ORBITER = new OrbitSettingUpgradeCardType("NON_ORBITER_TO_ORBITER", 0);
    public static final OrbitSettingUpgradeCardType ORBITER_TO_ORBITER_PLUS = new OrbitSettingUpgradeCardType("ORBITER_TO_ORBITER_PLUS", 1);
    public static final OrbitSettingUpgradeCardType ORBITER_PLUS_RECALL = new OrbitSettingUpgradeCardType("ORBITER_PLUS_RECALL", 2);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ OrbitSettingUpgradeCardType[] $values() {
        return new OrbitSettingUpgradeCardType[]{NON_ORBITER_TO_ORBITER, ORBITER_TO_ORBITER_PLUS, ORBITER_PLUS_RECALL};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<OrbitSettingUpgradeCardType> getEntries() {
        return $ENTRIES;
    }

    private OrbitSettingUpgradeCardType(String str, int i) {
    }

    static {
        OrbitSettingUpgradeCardType[] orbitSettingUpgradeCardTypeArr$values = $values();
        $VALUES = orbitSettingUpgradeCardTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(orbitSettingUpgradeCardTypeArr$values);
    }

    public static OrbitSettingUpgradeCardType valueOf(String str) {
        return (OrbitSettingUpgradeCardType) Enum.valueOf(OrbitSettingUpgradeCardType.class, str);
    }

    public static OrbitSettingUpgradeCardType[] values() {
        return (OrbitSettingUpgradeCardType[]) $VALUES.clone();
    }
}
