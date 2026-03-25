package com.okinc.business.dexlogic.bean;

import com.okinc.business.dexlogic.main.limmitorder.bean.OrderDetailListItem;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C56444yFp;
import o.InterfaceC22335hdS;
import o.InterfaceC56445yFq;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Serializable
public final class CrossChainBridgeRulesData implements InterfaceC22335hdS {
    private int bridgeId;
    private final ContentTip contentTip;
    private final String errorCode;
    private final String isContinueSwap;
    private final int needAgainTip;
    private final String orderId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CrossChainBridgeRulesData() {
        this((String) null, (String) null, 0, (ContentTip) null, (String) null, 0, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CrossChainBridgeRulesData copy$default(CrossChainBridgeRulesData crossChainBridgeRulesData, String str, String str2, int i, ContentTip contentTip, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = crossChainBridgeRulesData.errorCode;
        }
        if ((i3 & 2) != 0) {
            str2 = crossChainBridgeRulesData.isContinueSwap;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            i = crossChainBridgeRulesData.needAgainTip;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            contentTip = crossChainBridgeRulesData.contentTip;
        }
        ContentTip contentTip2 = contentTip;
        if ((i3 & 16) != 0) {
            str3 = crossChainBridgeRulesData.orderId;
        }
        String str5 = str3;
        if ((i3 & 32) != 0) {
            i2 = crossChainBridgeRulesData.bridgeId;
        }
        return crossChainBridgeRulesData.copy(str, str4, i4, contentTip2, str5, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.isContinueSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.needAgainTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentTip component4() {
        return this.contentTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component6() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CrossChainBridgeRulesData copy(@NotNull String str, @NotNull String str2, int i, ContentTip contentTip, @NotNull String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new CrossChainBridgeRulesData(str, str2, i, contentTip, str3, i2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrossChainBridgeRulesData)) {
            return false;
        }
        CrossChainBridgeRulesData crossChainBridgeRulesData = (CrossChainBridgeRulesData) obj;
        return Intrinsics.EZpvd((Object) this.errorCode, (Object) crossChainBridgeRulesData.errorCode) && Intrinsics.EZpvd((Object) this.isContinueSwap, (Object) crossChainBridgeRulesData.isContinueSwap) && this.needAgainTip == crossChainBridgeRulesData.needAgainTip && Intrinsics.EZpvd(this.contentTip, crossChainBridgeRulesData.contentTip) && Intrinsics.EZpvd((Object) this.orderId, (Object) crossChainBridgeRulesData.orderId) && this.bridgeId == crossChainBridgeRulesData.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBridgeId() {
        return this.bridgeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ContentTip getContentTip() {
        return this.contentTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNeedAgainTip() {
        return this.needAgainTip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.errorCode.hashCode();
        int iHashCode2 = this.isContinueSwap.hashCode();
        int iHashCode3 = Integer.hashCode(this.needAgainTip);
        ContentTip contentTip = this.contentTip;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (contentTip == null ? 0 : contentTip.hashCode())) * 31) + this.orderId.hashCode()) * 31) + Integer.hashCode(this.bridgeId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isContinueSwap() {
        return this.isContinueSwap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isShowCheckBox() {
        return this.needAgainTip == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBridgeId(int i) {
        this.bridgeId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CrossChainBridgeRulesData(errorCode=" + this.errorCode + ", isContinueSwap=" + this.isContinueSwap + ", needAgainTip=" + this.needAgainTip + ", contentTip=" + this.contentTip + ", orderId=" + this.orderId + ", bridgeId=" + this.bridgeId + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.dexlogic.bean.CrossChainBridgeRulesData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CrossChainBridgeRulesData> serializer() {
            return CrossChainBridgeRulesData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CrossChainBridgeRulesData(int i, String str, String str2, int i2, ContentTip contentTip, String str3, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.errorCode = "";
        } else {
            this.errorCode = str;
        }
        if ((i & 2) == 0) {
            this.isContinueSwap = "";
        } else {
            this.isContinueSwap = str2;
        }
        if ((i & 4) == 0) {
            this.needAgainTip = 0;
        } else {
            this.needAgainTip = i2;
        }
        if ((i & 8) == 0) {
            this.contentTip = null;
        } else {
            this.contentTip = contentTip;
        }
        if ((i & 16) == 0) {
            this.orderId = "";
        } else {
            this.orderId = str3;
        }
        if ((i & 32) == 0) {
            this.bridgeId = -1;
        } else {
            this.bridgeId = i3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(CrossChainBridgeRulesData crossChainBridgeRulesData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) crossChainBridgeRulesData.errorCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, crossChainBridgeRulesData.errorCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) crossChainBridgeRulesData.isContinueSwap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, crossChainBridgeRulesData.isContinueSwap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || crossChainBridgeRulesData.needAgainTip != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, crossChainBridgeRulesData.needAgainTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || crossChainBridgeRulesData.contentTip != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, ContentTip$$serializer.INSTANCE, crossChainBridgeRulesData.contentTip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) crossChainBridgeRulesData.orderId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, crossChainBridgeRulesData.orderId);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && crossChainBridgeRulesData.bridgeId == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 5, crossChainBridgeRulesData.bridgeId);
    }

    public CrossChainBridgeRulesData(@NotNull String str, @NotNull String str2, int i, ContentTip contentTip, @NotNull String str3, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.errorCode = str;
        this.isContinueSwap = str2;
        this.needAgainTip = i;
        this.contentTip = contentTip;
        this.orderId = str3;
        this.bridgeId = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002e: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:int:0x0015: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r7v0 int))
  (wrap:com.okinc.business.dexlogic.bean.ContentTip:0x001b: TERNARY null = ((wrap:int:0x0016: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.dexlogic.bean.ContentTip) : (r8v0 com.okinc.business.dexlogic.bean.ContentTip))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r11v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r9v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0022: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r10v0 int))
 A[MD:(java.lang.String, java.lang.String, int, com.okinc.business.dexlogic.bean.ContentTip, java.lang.String, int):void (m)] (LINE:2010) call: com.okinc.business.dexlogic.bean.CrossChainBridgeRulesData.<init>(java.lang.String, java.lang.String, int, com.okinc.business.dexlogic.bean.ContentTip, java.lang.String, int):void type: THIS */
    public /* synthetic */ CrossChainBridgeRulesData(String str, String str2, int i, ContentTip contentTip, String str3, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? null : contentTip, (i3 & 16) == 0 ? str3 : "", (i3 & 32) != 0 ? -1 : i2);
    }

    public final boolean isRepeatOrderSupported() {
        return RiskWarningRules.REPEAT_ORDER_SUFFICIENT.getCode().contentEquals(this.errorCode);
    }

    public final boolean isRepeatOrderUnSupported() {
        return RiskWarningRules.REPEAT_ORDER_IN_SUFFICIENT.getCode().contentEquals(this.errorCode);
    }

    public final boolean isRepeatOrderBtc() {
        return RiskWarningRules.REPEAT_ORDER_BTC.getCode().contentEquals(this.errorCode);
    }

    public final boolean isCentralizedBridgeTip() {
        return RiskWarningRules.CENTRALIZED_BRIDGE_TIPS.getCode().contentEquals(this.errorCode) && isSupportedSwap();
    }

    public final boolean isWarmHoleDailyLimit() {
        return RiskWarningRules.WORM_HOLE_DAILY_AMOUNT_LIMIT.getCode().contentEquals(this.errorCode);
    }

    public final boolean isSwiftBridgeBlackList() {
        return RiskWarningRules.SWIFT_BRIDGE_BLACK_LIST.getCode().contentEquals(this.errorCode);
    }

    public final boolean isSupportedSwap() {
        return this.isContinueSwap.contentEquals("1");
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class RiskWarningRules {
        private static final /* synthetic */ InterfaceC56445yFq $ENTRIES;
        private static final /* synthetic */ RiskWarningRules[] $VALUES;
        private final String code;
        public static final RiskWarningRules REPEAT_ORDER_SUFFICIENT = new RiskWarningRules("REPEAT_ORDER_SUFFICIENT", 0, "1");
        public static final RiskWarningRules REPEAT_ORDER_IN_SUFFICIENT = new RiskWarningRules("REPEAT_ORDER_IN_SUFFICIENT", 1, "2");
        public static final RiskWarningRules REPEAT_ORDER_BTC = new RiskWarningRules("REPEAT_ORDER_BTC", 2, "3");
        public static final RiskWarningRules CENTRALIZED_BRIDGE_TIPS = new RiskWarningRules("CENTRALIZED_BRIDGE_TIPS", 3, "4");
        public static final RiskWarningRules WORM_HOLE_DAILY_AMOUNT_LIMIT = new RiskWarningRules("WORM_HOLE_DAILY_AMOUNT_LIMIT", 4, "5");
        public static final RiskWarningRules SWIFT_BRIDGE_BLACK_LIST = new RiskWarningRules("SWIFT_BRIDGE_BLACK_LIST", 5, OrderDetailListItem.SLIP_OUT);

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private static final /* synthetic */ RiskWarningRules[] $values() {
            return new RiskWarningRules[]{REPEAT_ORDER_SUFFICIENT, REPEAT_ORDER_IN_SUFFICIENT, REPEAT_ORDER_BTC, CENTRALIZED_BRIDGE_TIPS, WORM_HOLE_DAILY_AMOUNT_LIMIT, SWIFT_BRIDGE_BLACK_LIST};
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public static InterfaceC56445yFq<RiskWarningRules> getEntries() {
            return $ENTRIES;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public final String getCode() {
            return this.code;
        }

        private RiskWarningRules(String str, int i, String str2) {
            this.code = str2;
        }

        static {
            RiskWarningRules[] riskWarningRulesArr$values = $values();
            $VALUES = riskWarningRulesArr$values;
            $ENTRIES = C56444yFp.AEQbTJ(riskWarningRulesArr$values);
        }

        public static RiskWarningRules valueOf(String str) {
            return (RiskWarningRules) Enum.valueOf(RiskWarningRules.class, str);
        }

        public static RiskWarningRules[] values() {
            return (RiskWarningRules[]) $VALUES.clone();
        }
    }
}
