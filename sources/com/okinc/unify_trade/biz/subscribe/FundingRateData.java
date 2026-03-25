package com.okinc.unify_trade.biz.subscribe;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.okinc.localization.util.format.OKDateEnum;
import com.okinc.localization.util.format.OKTimeEnum;
import java.util.Date;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.C32979mnm;
import o.C33129mqd;
import o.C55688xof;
import o.C56390yDp;
import o.C56423yEv;
import o.pTA;
import o.pTB;
import o.pTD;
import o.pUU;
import o.xMN;
import o.xVD;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Serializable
public final class FundingRateData {
    private String fundingRate;
    private String fundingTime;
    private String instId;
    private String instType;
    private String maxFundingRate;
    private String method;
    private String minFundingRate;
    private String nextFundingRate;
    private String nextFundingTime;
    private String quickState;
    private String realizedRate;
    private String settFundingRate;
    private String settState;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FundingRateData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.settFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.settState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.quickState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.fundingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.nextFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.nextFundingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.realizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.minFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.maxFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FundingRateData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        return new FundingRateData(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FundingRateData)) {
            return false;
        }
        FundingRateData fundingRateData = (FundingRateData) obj;
        return Intrinsics.EZpvd((Object) this.instType, (Object) fundingRateData.instType) && Intrinsics.EZpvd((Object) this.instId, (Object) fundingRateData.instId) && Intrinsics.EZpvd((Object) this.fundingRate, (Object) fundingRateData.fundingRate) && Intrinsics.EZpvd((Object) this.fundingTime, (Object) fundingRateData.fundingTime) && Intrinsics.EZpvd((Object) this.nextFundingRate, (Object) fundingRateData.nextFundingRate) && Intrinsics.EZpvd((Object) this.nextFundingTime, (Object) fundingRateData.nextFundingTime) && Intrinsics.EZpvd((Object) this.realizedRate, (Object) fundingRateData.realizedRate) && Intrinsics.EZpvd((Object) this.minFundingRate, (Object) fundingRateData.minFundingRate) && Intrinsics.EZpvd((Object) this.maxFundingRate, (Object) fundingRateData.maxFundingRate) && Intrinsics.EZpvd((Object) this.settFundingRate, (Object) fundingRateData.settFundingRate) && Intrinsics.EZpvd((Object) this.settState, (Object) fundingRateData.settState) && Intrinsics.EZpvd((Object) this.method, (Object) fundingRateData.method) && Intrinsics.EZpvd((Object) this.quickState, (Object) fundingRateData.quickState);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingRate() {
        return this.fundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFundingTime() {
        return this.fundingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstType() {
        return this.instType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxFundingRate() {
        return this.maxFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinFundingRate() {
        return this.minFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextFundingRate() {
        return this.nextFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextFundingTime() {
        return this.nextFundingTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getQuickState() {
        return this.quickState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRealizedRate() {
        return this.realizedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettFundingRate() {
        return this.settFundingRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSettState() {
        return this.settState;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((this.instType.hashCode() * 31) + this.instId.hashCode()) * 31) + this.fundingRate.hashCode()) * 31) + this.fundingTime.hashCode()) * 31) + this.nextFundingRate.hashCode()) * 31) + this.nextFundingTime.hashCode()) * 31) + this.realizedRate.hashCode()) * 31) + this.minFundingRate.hashCode()) * 31) + this.maxFundingRate.hashCode()) * 31) + this.settFundingRate.hashCode()) * 31) + this.settState.hashCode()) * 31) + this.method.hashCode()) * 31) + this.quickState.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFundingRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fundingRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFundingTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fundingTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxFundingRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxFundingRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMethod(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.method = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinFundingRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minFundingRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNextFundingRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nextFundingRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNextFundingTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nextFundingTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setQuickState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.quickState = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRealizedRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.realizedRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettFundingRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.settFundingRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSettState(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.settState = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FundingRateData(instType=" + this.instType + ", instId=" + this.instId + ", fundingRate=" + this.fundingRate + ", fundingTime=" + this.fundingTime + ", nextFundingRate=" + this.nextFundingRate + ", nextFundingTime=" + this.nextFundingTime + ", realizedRate=" + this.realizedRate + ", minFundingRate=" + this.minFundingRate + ", maxFundingRate=" + this.maxFundingRate + ", settFundingRate=" + this.settFundingRate + ", settState=" + this.settState + ", method=" + this.method + ", quickState=" + this.quickState + ")";
    }

    public /* synthetic */ FundingRateData(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.instType = "";
        } else {
            this.instType = str;
        }
        if ((i & 2) == 0) {
            this.instId = "";
        } else {
            this.instId = str2;
        }
        if ((i & 4) == 0) {
            this.fundingRate = "";
        } else {
            this.fundingRate = str3;
        }
        if ((i & 8) == 0) {
            this.fundingTime = "";
        } else {
            this.fundingTime = str4;
        }
        if ((i & 16) == 0) {
            this.nextFundingRate = "";
        } else {
            this.nextFundingRate = str5;
        }
        if ((i & 32) == 0) {
            this.nextFundingTime = "";
        } else {
            this.nextFundingTime = str6;
        }
        if ((i & 64) == 0) {
            this.realizedRate = "";
        } else {
            this.realizedRate = str7;
        }
        if ((i & 128) == 0) {
            this.minFundingRate = "";
        } else {
            this.minFundingRate = str8;
        }
        if ((i & 256) == 0) {
            this.maxFundingRate = "";
        } else {
            this.maxFundingRate = str9;
        }
        if ((i & 512) == 0) {
            this.settFundingRate = "";
        } else {
            this.settFundingRate = str10;
        }
        if ((i & 1024) == 0) {
            this.settState = "";
        } else {
            this.settState = str11;
        }
        if ((i & 2048) == 0) {
            this.method = "";
        } else {
            this.method = str12;
        }
        if ((i & 4096) == 0) {
            this.quickState = "";
        } else {
            this.quickState = str13;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(FundingRateData fundingRateData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) fundingRateData.instType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fundingRateData.instType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) fundingRateData.instId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fundingRateData.instId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) fundingRateData.fundingRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, fundingRateData.fundingRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) fundingRateData.fundingTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, fundingRateData.fundingTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) fundingRateData.nextFundingRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, fundingRateData.nextFundingRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) fundingRateData.nextFundingTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, fundingRateData.nextFundingTime);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) fundingRateData.realizedRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, fundingRateData.realizedRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) fundingRateData.minFundingRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, fundingRateData.minFundingRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) fundingRateData.maxFundingRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, fundingRateData.maxFundingRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) fundingRateData.settFundingRate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, fundingRateData.settFundingRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) fundingRateData.settState, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, fundingRateData.settState);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) fundingRateData.method, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, fundingRateData.method);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) && Intrinsics.EZpvd((Object) fundingRateData.quickState, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 12, fundingRateData.quickState);
    }

    public FundingRateData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        this.instType = str;
        this.instId = str2;
        this.fundingRate = str3;
        this.fundingTime = str4;
        this.nextFundingRate = str5;
        this.nextFundingTime = str6;
        this.realizedRate = str7;
        this.minFundingRate = str8;
        this.maxFundingRate = str9;
        this.settFundingRate = str10;
        this.settState = str11;
        this.method = str12;
        this.quickState = str13;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0085: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005b: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0063: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:27) call: com.okinc.unify_trade.biz.subscribe.FundingRateData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FundingRateData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) != 0 ? "" : str11, (i & 2048) != 0 ? "" : str12, (i & 4096) == 0 ? str13 : "");
    }

    public static final class Companion {

        public static final class TaskDescription extends TypeToken<List<? extends FundingRateData>> {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.subscribe.FundingRateData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<FundingRateData> serializer() {
            return FundingRateData$$serializer.INSTANCE;
        }

        public final FundingRateData AEQbTJ(@NotNull String str) {
            Intrinsics.checkNotNullParameter(str, "");
            try {
                List list = (List) new Gson().fromJson(str, new TaskDescription().getType());
                if (list != null && !list.isEmpty()) {
                    return (FundingRateData) list.get(0);
                }
            } catch (Exception e) {
                pUU.KWHzl("JSON PARSE", "FundingRateData-jsonConvert" + e.getMessage());
            }
            return null;
        }
    }

    public final String getTimeInterval() {
        return C33129mqd.divS$default(C33129mqd.subS$default(this.nextFundingTime, this.fundingTime, null, null, null, 14, null), 3600000, null, null, null, 14, null);
    }

    public final boolean isTimeIntervalOneHour() {
        return Intrinsics.EZpvd((Object) getTimeInterval(), (Object) "1");
    }

    public final String preFundingTimeStr() {
        return pTA.format$default(new Date(C33129mqd.valueOf(C33129mqd.subS$default(this.fundingTime, C33129mqd.subS$default(this.nextFundingTime, this.fundingTime, null, null, null, 14, null), null, null, null, 14, null))), OKDateEnum.DATE_FORMAT_SIMPLE, OKTimeEnum.TIME_FORMAT_SIMPLE, null, null, false, 28, null);
    }

    public final String showFundingRate() {
        String strOLrzqt;
        String str = this.fundingRate;
        return (str == null || (strOLrzqt = xVD.KWHzl.OLrzqt(str, "")) == null) ? "--" : strOLrzqt;
    }

    public final String showMinMaxRate() {
        String str = this.maxFundingRate;
        if (str == null) {
            str = "";
        }
        String strShowFundingLimitRate = showFundingLimitRate(str);
        String str2 = this.minFundingRate;
        return strShowFundingLimitRate + " / " + showFundingLimitRate(str2 != null ? str2 : "");
    }

    private final String showFundingLimitRate(String str) {
        return str.length() == 0 ? "--" : xVD.KWHzl.copydefault(str, "");
    }

    public final String showFrequency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return pTD.EZpvd(C32979mnm.EZpvd.OLrzqt(), C55688xof.Activity.EZpvd, C33129mqd.AhwBna(str), C56423yEv.EZpvd(C56390yDp.OLrzqt("num", pTB.formatLocalized$default(str, null, 1, null))));
    }

    public final String showCountDown() {
        long jValueOf = C33129mqd.valueOf(this.fundingTime);
        return jValueOf > System.currentTimeMillis() ? xMN.KWHzl(jValueOf - System.currentTimeMillis()) : "--";
    }
}
