package com.okinc.okx.paymentapi.uv;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o.C56423yEv;
import o.C56444yFp;
import o.C56548yJl;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
public final class UnifiedVerificationType {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ UnifiedVerificationType[] $VALUES;
    public static final Application Companion;
    private static final Map<String, UnifiedVerificationType> typeMap;
    private final String type;
    public static final UnifiedVerificationType COUNTRY_RESTRICTION = new UnifiedVerificationType("COUNTRY_RESTRICTION", 0, "country_restriction");
    public static final UnifiedVerificationType LOGIN = new UnifiedVerificationType("LOGIN", 1, FirebaseAnalytics.Event.LOGIN);
    public static final UnifiedVerificationType SUB_ACCOUNT = new UnifiedVerificationType("SUB_ACCOUNT", 2, "sub_account");
    public static final UnifiedVerificationType KYC_LEVEL = new UnifiedVerificationType("KYC_LEVEL", 3, "kyc_level");
    public static final UnifiedVerificationType PAIR_CHECK = new UnifiedVerificationType("PAIR_CHECK", 4, "pair_check");
    public static final UnifiedVerificationType OPTIONAL_PAIR_CHECK = new UnifiedVerificationType("OPTIONAL_PAIR_CHECK", 5, "optional_pair_check");
    public static final UnifiedVerificationType CHECK_ACCOUNT_IS_FROZEN = new UnifiedVerificationType("CHECK_ACCOUNT_IS_FROZEN", 6, "check_account_is_frozen");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ UnifiedVerificationType[] $values() {
        return new UnifiedVerificationType[]{COUNTRY_RESTRICTION, LOGIN, SUB_ACCOUNT, KYC_LEVEL, PAIR_CHECK, OPTIONAL_PAIR_CHECK, CHECK_ACCOUNT_IS_FROZEN};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<UnifiedVerificationType> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    private UnifiedVerificationType(String str, int i, String str2) {
        this.type = str2;
    }

    static {
        UnifiedVerificationType[] unifiedVerificationTypeArr$values = $values();
        $VALUES = unifiedVerificationTypeArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(unifiedVerificationTypeArr$values);
        Companion = new Application(null);
        UnifiedVerificationType[] unifiedVerificationTypeArrValues = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C56548yJl.copydefault(C56423yEv.copydefault(unifiedVerificationTypeArrValues.length), 16));
        for (UnifiedVerificationType unifiedVerificationType : unifiedVerificationTypeArrValues) {
            linkedHashMap.put(unifiedVerificationType.type, unifiedVerificationType);
        }
        typeMap = linkedHashMap;
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.uv.UnifiedVerificationType.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }
    }

    public static UnifiedVerificationType valueOf(String str) {
        return (UnifiedVerificationType) Enum.valueOf(UnifiedVerificationType.class, str);
    }

    public static UnifiedVerificationType[] values() {
        return (UnifiedVerificationType[]) $VALUES.clone();
    }
}
