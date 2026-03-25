package com.okinc.unify_trade.biz;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Serializable
public final class BotAddInvestmentData {
    private String actualMarginSz;
    private String additionalInvestmentAmount;
    private String algoId;
    private Boolean autoReserve;
    private String contractGridVersion;
    private String extraMarginSz;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BotAddInvestmentData() {
        this((String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BotAddInvestmentData copy$default(BotAddInvestmentData botAddInvestmentData, String str, String str2, String str3, String str4, Boolean bool, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = botAddInvestmentData.algoId;
        }
        if ((i & 2) != 0) {
            str2 = botAddInvestmentData.additionalInvestmentAmount;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = botAddInvestmentData.actualMarginSz;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = botAddInvestmentData.extraMarginSz;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            bool = botAddInvestmentData.autoReserve;
        }
        Boolean bool2 = bool;
        if ((i & 32) != 0) {
            str5 = botAddInvestmentData.contractGridVersion;
        }
        return botAddInvestmentData.copy(str, str6, str7, str8, bool2, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.additionalInvestmentAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component5() {
        return this.autoReserve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.contractGridVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BotAddInvestmentData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, Boolean bool, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new BotAddInvestmentData(str, str2, str3, str4, bool, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BotAddInvestmentData)) {
            return false;
        }
        BotAddInvestmentData botAddInvestmentData = (BotAddInvestmentData) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) botAddInvestmentData.algoId) && Intrinsics.EZpvd((Object) this.additionalInvestmentAmount, (Object) botAddInvestmentData.additionalInvestmentAmount) && Intrinsics.EZpvd((Object) this.actualMarginSz, (Object) botAddInvestmentData.actualMarginSz) && Intrinsics.EZpvd((Object) this.extraMarginSz, (Object) botAddInvestmentData.extraMarginSz) && Intrinsics.EZpvd(this.autoReserve, botAddInvestmentData.autoReserve) && Intrinsics.EZpvd((Object) this.contractGridVersion, (Object) botAddInvestmentData.contractGridVersion);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getActualMarginSz() {
        return this.actualMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAdditionalInvestmentAmount() {
        return this.additionalInvestmentAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getAutoReserve() {
        return this.autoReserve;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractGridVersion() {
        return this.contractGridVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExtraMarginSz() {
        return this.extraMarginSz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.algoId.hashCode();
        int iHashCode2 = this.additionalInvestmentAmount.hashCode();
        int iHashCode3 = this.actualMarginSz.hashCode();
        int iHashCode4 = this.extraMarginSz.hashCode();
        Boolean bool = this.autoReserve;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + this.contractGridVersion.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setActualMarginSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.actualMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAdditionalInvestmentAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.additionalInvestmentAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAlgoId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.algoId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAutoReserve(Boolean bool) {
        this.autoReserve = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractGridVersion(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.contractGridVersion = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExtraMarginSz(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.extraMarginSz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BotAddInvestmentData(algoId=" + this.algoId + ", additionalInvestmentAmount=" + this.additionalInvestmentAmount + ", actualMarginSz=" + this.actualMarginSz + ", extraMarginSz=" + this.extraMarginSz + ", autoReserve=" + this.autoReserve + ", contractGridVersion=" + this.contractGridVersion + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BotAddInvestmentData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BotAddInvestmentData> serializer() {
            return BotAddInvestmentData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BotAddInvestmentData(int i, String str, String str2, String str3, String str4, Boolean bool, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.algoId = "";
        } else {
            this.algoId = str;
        }
        if ((i & 2) == 0) {
            this.additionalInvestmentAmount = "";
        } else {
            this.additionalInvestmentAmount = str2;
        }
        if ((i & 4) == 0) {
            this.actualMarginSz = "";
        } else {
            this.actualMarginSz = str3;
        }
        if ((i & 8) == 0) {
            this.extraMarginSz = "";
        } else {
            this.extraMarginSz = str4;
        }
        if ((i & 16) == 0) {
            this.autoReserve = null;
        } else {
            this.autoReserve = bool;
        }
        if ((i & 32) == 0) {
            this.contractGridVersion = "";
        } else {
            this.contractGridVersion = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BotAddInvestmentData botAddInvestmentData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) botAddInvestmentData.algoId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, botAddInvestmentData.algoId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) botAddInvestmentData.additionalInvestmentAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, botAddInvestmentData.additionalInvestmentAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) botAddInvestmentData.actualMarginSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, botAddInvestmentData.actualMarginSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) botAddInvestmentData.extraMarginSz, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, botAddInvestmentData.extraMarginSz);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || botAddInvestmentData.autoReserve != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, BooleanSerializer.INSTANCE, botAddInvestmentData.autoReserve);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) botAddInvestmentData.contractGridVersion, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, botAddInvestmentData.contractGridVersion);
    }

    public BotAddInvestmentData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, Boolean bool, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.algoId = str;
        this.additionalInvestmentAmount = str2;
        this.actualMarginSz = str3;
        this.extraMarginSz = str4;
        this.autoReserve = bool;
        this.contractGridVersion = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.Boolean:0x0023: TERNARY null = ((wrap:int:0x001e: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:4295) call: com.okinc.unify_trade.biz.BotAddInvestmentData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ BotAddInvestmentData(String str, String str2, String str3, String str4, Boolean bool, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? "" : str5);
    }
}
