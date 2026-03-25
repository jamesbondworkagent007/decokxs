package com.okinc.dexkline.market.common.constants;

import com.okinc.business.defi.api.bean.VerifyDAppDomainUrlResponse;
import com.okinc.dexkline.market.common.constants.RiskControlLevel;
import java.lang.annotation.Annotation;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.EnumsKt;
import o.C56392yDr;
import o.C56444yFp;
import o.InterfaceC56387yDm;
import o.InterfaceC56445yFq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class RiskControlLevel {
    private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
    private static final /* synthetic */ RiskControlLevel[] $VALUES;
    private static final InterfaceC56387yDm<KSerializer<Object>> $cachedSerializer$delegate;
    public static final Companion Companion;
    private final String value;

    @SerialName("0")
    public static final RiskControlLevel UNKNOWN = new RiskControlLevel("UNKNOWN", 0, "0");

    @SerialName("1")
    public static final RiskControlLevel LOW = new RiskControlLevel(VerifyDAppDomainUrlResponse.LEVEL_LOW, 1, "1");

    @SerialName("3")
    public static final RiskControlLevel MEDIUM = new RiskControlLevel(VerifyDAppDomainUrlResponse.LEVEL_MEDIUM, 2, "3");

    @SerialName("4")
    public static final RiskControlLevel HIGH = new RiskControlLevel(VerifyDAppDomainUrlResponse.LEVEL_HIGH, 3, "4");

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    private static final /* synthetic */ RiskControlLevel[] $values() {
        return new RiskControlLevel[]{UNKNOWN, LOW, MEDIUM, HIGH};
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static InterfaceC56445yFq<RiskControlLevel> getEntries() {
        return $ENTRIES;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValue() {
        return this.value;
    }

    private RiskControlLevel(String str, int i, String str2) {
        this.value = str2;
    }

    static {
        RiskControlLevel[] riskControlLevelArr$values = $values();
        $VALUES = riskControlLevelArr$values;
        $ENTRIES = C56444yFp.AEQbTJ(riskControlLevelArr$values);
        Companion = new Companion(null);
        $cachedSerializer$delegate = C56392yDr.EZpvd(LazyThreadSafetyMode.PUBLICATION, new Function0() { // from class: o.mUZ
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return RiskControlLevel._init_$_anonymous_();
            }
        });
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.common.constants.RiskControlLevel.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final /* synthetic */ KSerializer copydefault() {
            return (KSerializer) RiskControlLevel.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<RiskControlLevel> serializer() {
            return copydefault();
        }

        /* JADX DEBUG: Don't trust debug lines info. Repeating lines: [23=5] */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final RiskControlLevel AEQbTJ(String str) {
            if (str != null) {
                switch (str.hashCode()) {
                    case 49:
                        if (str.equals("1")) {
                            return RiskControlLevel.LOW;
                        }
                        break;
                    case 50:
                        if (str.equals("2")) {
                            return RiskControlLevel.MEDIUM;
                        }
                        break;
                    case 51:
                        if (str.equals("3")) {
                            return RiskControlLevel.MEDIUM;
                        }
                        break;
                    case 52:
                        if (str.equals("4")) {
                            return RiskControlLevel.HIGH;
                        }
                        break;
                    case 53:
                        if (str.equals("5")) {
                            return RiskControlLevel.HIGH;
                        }
                        break;
                }
            }
            return RiskControlLevel.UNKNOWN;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer _init_$_anonymous_() {
        return EnumsKt.createAnnotatedEnumSerializer("com.okinc.dexkline.market.common.constants.RiskControlLevel", values(), new String[]{"0", "1", "3", "4"}, new Annotation[][]{null, null, null, null}, null);
    }

    public static RiskControlLevel valueOf(String str) {
        return (RiskControlLevel) Enum.valueOf(RiskControlLevel.class, str);
    }

    public static RiskControlLevel[] values() {
        return (RiskControlLevel[]) $VALUES.clone();
    }
}
