package com.okinc.auth.impl.featureflag;

import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56444yFp;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public final class FeatureFlag {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ FeatureFlag[] $VALUES;
    public static final FeatureFlag BYPASS_CHINA_IP_CHECKING = new FeatureFlag("BYPASS_CHINA_IP_CHECKING", 0, "android_turnoff_chinaip_check", null, 2, null);
    public static final FeatureFlag CREDENTIAL_MANAGER_OPPO = new FeatureFlag("CREDENTIAL_MANAGER_OPPO", 2, "android_oppo_credential_manager", null, 2, null);
    public static final FeatureFlag CREDENTIAL_MANAGER_OPPO_OVERSEA;
    public static final FeatureFlag CREDENTIAL_MANAGER_XIAOMI;
    private final String key;
    private final String treatment;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ FeatureFlag[] $values() {
        return new FeatureFlag[]{BYPASS_CHINA_IP_CHECKING, CREDENTIAL_MANAGER_XIAOMI, CREDENTIAL_MANAGER_OPPO, CREDENTIAL_MANAGER_OPPO_OVERSEA};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<FeatureFlag> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getKey() {
        return this.key;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTreatment() {
        return this.treatment;
    }

    private FeatureFlag(String str, int i, String str2, String str3) {
        this.key = str2;
        this.treatment = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (r1v0 java.lang.String)
  (r2v0 int)
  (r3v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("treatment") : (r4v0 java.lang.String))
 A[MD:(java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:3) call: com.okinc.auth.impl.featureflag.FeatureFlag.<init>(java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FeatureFlag(String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, (i2 & 2) != 0 ? "treatment" : str3);
    }

    static {
        String str = null;
        int i = 2;
        DefaultConstructorMarker defaultConstructorMarker = null;
        CREDENTIAL_MANAGER_XIAOMI = new FeatureFlag("CREDENTIAL_MANAGER_XIAOMI", 1, "android_xiaomi_credential_manager", str, i, defaultConstructorMarker);
        CREDENTIAL_MANAGER_OPPO_OVERSEA = new FeatureFlag("CREDENTIAL_MANAGER_OPPO_OVERSEA", 3, "all_brands_credential_manager", str, i, defaultConstructorMarker);
        FeatureFlag[] featureFlagArr$values = $values();
        $VALUES = featureFlagArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(featureFlagArr$values);
    }

    public static FeatureFlag valueOf(String str) {
        return (FeatureFlag) Enum.valueOf(FeatureFlag.class, str);
    }

    public static FeatureFlag[] values() {
        return (FeatureFlag[]) $VALUES.clone();
    }
}
