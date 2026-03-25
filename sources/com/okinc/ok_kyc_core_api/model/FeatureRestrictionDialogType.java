package com.okinc.ok_kyc_core_api.model;

import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes10.dex */
public final class FeatureRestrictionDialogType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FeatureRestrictionDialogType[] $VALUES;
    public static final FeatureRestrictionDialogType REGISTER = new FeatureRestrictionDialogType("REGISTER", 0);
    public static final FeatureRestrictionDialogType LOGIN = new FeatureRestrictionDialogType("LOGIN", 1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FeatureRestrictionDialogType[] $values() {
        return new FeatureRestrictionDialogType[]{REGISTER, LOGIN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FeatureRestrictionDialogType> getEntries() {
        return $ENTRIES;
    }

    static {
        FeatureRestrictionDialogType[] featureRestrictionDialogTypeArr$values = $values();
        $VALUES = featureRestrictionDialogTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(featureRestrictionDialogTypeArr$values);
    }

    private FeatureRestrictionDialogType(String str, int i) {
    }

    public static FeatureRestrictionDialogType valueOf(String str) {
        return (FeatureRestrictionDialogType) Enum.valueOf(FeatureRestrictionDialogType.class, str);
    }

    public static FeatureRestrictionDialogType[] values() {
        return (FeatureRestrictionDialogType[]) $VALUES.clone();
    }
}
