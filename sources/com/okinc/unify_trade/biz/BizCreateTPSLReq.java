package com.okinc.unify_trade.biz;

import com.okinc.dex.StopOrderQuoteVO;
import com.okinc.dex.StopOrderQuoteVO$$serializer;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Serializable
public final class BizCreateTPSLReq {
    private String cefiSymbol;
    private String chainIndex;
    private String enableMev;
    private String maxSlippagePercentage;
    private String mevMode;
    private String price;
    private String priorityFeeTier;
    private String priorityFeeUsd;
    private String slippageMode;
    private String slippageValue;
    private List<StopOrderQuoteVO> stopOrders;
    private String tokenAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, null, null, new ArrayListSerializer(StopOrderQuoteVO$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BizCreateTPSLReq() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.priorityFeeTier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.priorityFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StopOrderQuoteVO> component12() {
        return this.stopOrders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.cefiSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.enableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.mevMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.slippageMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.slippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.maxSlippagePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BizCreateTPSLReq copy(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, String str9, @NotNull String str10, String str11, @NotNull List<StopOrderQuoteVO> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new BizCreateTPSLReq(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BizCreateTPSLReq)) {
            return false;
        }
        BizCreateTPSLReq bizCreateTPSLReq = (BizCreateTPSLReq) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) bizCreateTPSLReq.chainIndex) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) bizCreateTPSLReq.tokenAddress) && Intrinsics.EZpvd((Object) this.price, (Object) bizCreateTPSLReq.price) && Intrinsics.EZpvd((Object) this.cefiSymbol, (Object) bizCreateTPSLReq.cefiSymbol) && Intrinsics.EZpvd((Object) this.enableMev, (Object) bizCreateTPSLReq.enableMev) && Intrinsics.EZpvd((Object) this.mevMode, (Object) bizCreateTPSLReq.mevMode) && Intrinsics.EZpvd((Object) this.slippageMode, (Object) bizCreateTPSLReq.slippageMode) && Intrinsics.EZpvd((Object) this.slippageValue, (Object) bizCreateTPSLReq.slippageValue) && Intrinsics.EZpvd((Object) this.maxSlippagePercentage, (Object) bizCreateTPSLReq.maxSlippagePercentage) && Intrinsics.EZpvd((Object) this.priorityFeeTier, (Object) bizCreateTPSLReq.priorityFeeTier) && Intrinsics.EZpvd((Object) this.priorityFeeUsd, (Object) bizCreateTPSLReq.priorityFeeUsd) && Intrinsics.EZpvd(this.stopOrders, bizCreateTPSLReq.stopOrders);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCefiSymbol() {
        return this.cefiSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEnableMev() {
        return this.enableMev;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxSlippagePercentage() {
        return this.maxSlippagePercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMevMode() {
        return this.mevMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFeeTier() {
        return this.priorityFeeTier;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriorityFeeUsd() {
        return this.priorityFeeUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageMode() {
        return this.slippageMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSlippageValue() {
        return this.slippageValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<StopOrderQuoteVO> getStopOrders() {
        return this.stopOrders;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainIndex.hashCode();
        String str = this.tokenAddress;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.price.hashCode();
        int iHashCode4 = this.cefiSymbol.hashCode();
        int iHashCode5 = this.enableMev.hashCode();
        int iHashCode6 = this.mevMode.hashCode();
        int iHashCode7 = this.slippageMode.hashCode();
        String str2 = this.slippageValue;
        int iHashCode8 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.maxSlippagePercentage;
        int iHashCode9 = str3 == null ? 0 : str3.hashCode();
        int iHashCode10 = this.priorityFeeTier.hashCode();
        String str4 = this.priorityFeeUsd;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + this.stopOrders.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCefiSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cefiSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainIndex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainIndex = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEnableMev(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.enableMev = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxSlippagePercentage(String str) {
        this.maxSlippagePercentage = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMevMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mevMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriorityFeeTier(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.priorityFeeTier = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPriorityFeeUsd(String str) {
        this.priorityFeeUsd = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippageMode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.slippageMode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSlippageValue(String str) {
        this.slippageValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStopOrders(@NotNull List<StopOrderQuoteVO> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.stopOrders = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAddress(String str) {
        this.tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BizCreateTPSLReq(chainIndex=" + this.chainIndex + ", tokenAddress=" + this.tokenAddress + ", price=" + this.price + ", cefiSymbol=" + this.cefiSymbol + ", enableMev=" + this.enableMev + ", mevMode=" + this.mevMode + ", slippageMode=" + this.slippageMode + ", slippageValue=" + this.slippageValue + ", maxSlippagePercentage=" + this.maxSlippagePercentage + ", priorityFeeTier=" + this.priorityFeeTier + ", priorityFeeUsd=" + this.priorityFeeUsd + ", stopOrders=" + this.stopOrders + ")";
    }

    /* JADX INFO: loaded from: classes24.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.unify_trade.biz.BizCreateTPSLReq.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BizCreateTPSLReq> serializer() {
            return BizCreateTPSLReq$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BizCreateTPSLReq(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainIndex = "";
        } else {
            this.chainIndex = str;
        }
        if ((i & 2) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str2;
        }
        if ((i & 4) == 0) {
            this.price = "";
        } else {
            this.price = str3;
        }
        if ((i & 8) == 0) {
            this.cefiSymbol = "";
        } else {
            this.cefiSymbol = str4;
        }
        if ((i & 16) == 0) {
            this.enableMev = "";
        } else {
            this.enableMev = str5;
        }
        if ((i & 32) == 0) {
            this.mevMode = "";
        } else {
            this.mevMode = str6;
        }
        if ((i & 64) == 0) {
            this.slippageMode = "";
        } else {
            this.slippageMode = str7;
        }
        if ((i & 128) == 0) {
            this.slippageValue = "";
        } else {
            this.slippageValue = str8;
        }
        if ((i & 256) == 0) {
            this.maxSlippagePercentage = "";
        } else {
            this.maxSlippagePercentage = str9;
        }
        if ((i & 512) == 0) {
            this.priorityFeeTier = "";
        } else {
            this.priorityFeeTier = str10;
        }
        if ((i & 1024) == 0) {
            this.priorityFeeUsd = "";
        } else {
            this.priorityFeeUsd = str11;
        }
        if ((i & 2048) == 0) {
            this.stopOrders = yDY.AhwBna();
        } else {
            this.stopOrders = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKTradeCore_trade_core(BizCreateTPSLReq bizCreateTPSLReq, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) bizCreateTPSLReq.chainIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, bizCreateTPSLReq.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) bizCreateTPSLReq.tokenAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, bizCreateTPSLReq.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) bizCreateTPSLReq.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, bizCreateTPSLReq.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) bizCreateTPSLReq.cefiSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, bizCreateTPSLReq.cefiSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) bizCreateTPSLReq.enableMev, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, bizCreateTPSLReq.enableMev);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) bizCreateTPSLReq.mevMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, bizCreateTPSLReq.mevMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) bizCreateTPSLReq.slippageMode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, bizCreateTPSLReq.slippageMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) bizCreateTPSLReq.slippageValue, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, bizCreateTPSLReq.slippageValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) bizCreateTPSLReq.maxSlippagePercentage, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, bizCreateTPSLReq.maxSlippagePercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) bizCreateTPSLReq.priorityFeeTier, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, bizCreateTPSLReq.priorityFeeTier);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) bizCreateTPSLReq.priorityFeeUsd, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, StringSerializer.INSTANCE, bizCreateTPSLReq.priorityFeeUsd);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd(bizCreateTPSLReq.stopOrders, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], bizCreateTPSLReq.stopOrders);
    }

    public BizCreateTPSLReq(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, String str8, String str9, @NotNull String str10, String str11, @NotNull List<StopOrderQuoteVO> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.chainIndex = str;
        this.tokenAddress = str2;
        this.price = str3;
        this.cefiSymbol = str4;
        this.enableMev = str5;
        this.mevMode = str6;
        this.slippageMode = str7;
        this.slippageValue = str8;
        this.maxSlippagePercentage = str9;
        this.priorityFeeTier = str10;
        this.priorityFeeUsd = str11;
        this.stopOrders = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003a: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0042: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004a: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0052: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0059: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x005d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:521)) : (r25v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.dex.StopOrderQuoteVO>):void (m)] (LINE:509) call: com.okinc.unify_trade.biz.BizCreateTPSLReq.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ BizCreateTPSLReq(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) == 0 ? str11 : "", (i & 2048) != 0 ? yDY.AhwBna() : list);
    }
}
