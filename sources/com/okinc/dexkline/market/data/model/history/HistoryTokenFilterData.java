package com.okinc.dexkline.market.data.model.history;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class HistoryTokenFilterData {
    private final String addressLabel;
    private final List<String> addressList;
    private final String chainId;
    private final String endTime;
    private final String lowerBound;
    private final String priceMax;
    private final String priceMin;
    private final String startTime;
    private final String tokenAddress;
    private final String type;
    private final String upperBound;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HistoryTokenFilterData() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    @SerialName("addressLabel")
    public static /* synthetic */ void getAddressLabel$annotations() {
    }

    @SerialName("userAddressList")
    public static /* synthetic */ void getAddressList$annotations() {
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("endTime")
    public static /* synthetic */ void getEndTime$annotations() {
    }

    @SerialName("volumeMin")
    public static /* synthetic */ void getLowerBound$annotations() {
    }

    @SerialName("priceMax")
    public static /* synthetic */ void getPriceMax$annotations() {
    }

    @SerialName("priceMin")
    public static /* synthetic */ void getPriceMin$annotations() {
    }

    @SerialName("startTime")
    public static /* synthetic */ void getStartTime$annotations() {
    }

    @SerialName("tokenContractAddress")
    public static /* synthetic */ void getTokenAddress$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @SerialName("volumeMax")
    public static /* synthetic */ void getUpperBound$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.lowerBound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.upperBound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.addressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.addressLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.priceMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.priceMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HistoryTokenFilterData copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<String> list, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new HistoryTokenFilterData(str, str2, str3, str4, str5, list, str6, str7, str8, str9, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoryTokenFilterData)) {
            return false;
        }
        HistoryTokenFilterData historyTokenFilterData = (HistoryTokenFilterData) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) historyTokenFilterData.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) historyTokenFilterData.tokenAddress) && Intrinsics.EZpvd((Object) this.type, (Object) historyTokenFilterData.type) && Intrinsics.EZpvd((Object) this.lowerBound, (Object) historyTokenFilterData.lowerBound) && Intrinsics.EZpvd((Object) this.upperBound, (Object) historyTokenFilterData.upperBound) && Intrinsics.EZpvd(this.addressList, historyTokenFilterData.addressList) && Intrinsics.EZpvd((Object) this.addressLabel, (Object) historyTokenFilterData.addressLabel) && Intrinsics.EZpvd((Object) this.priceMin, (Object) historyTokenFilterData.priceMin) && Intrinsics.EZpvd((Object) this.priceMax, (Object) historyTokenFilterData.priceMax) && Intrinsics.EZpvd((Object) this.startTime, (Object) historyTokenFilterData.startTime) && Intrinsics.EZpvd((Object) this.endTime, (Object) historyTokenFilterData.endTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddressLabel() {
        return this.addressLabel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getAddressList() {
        return this.addressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLowerBound() {
        return this.lowerBound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceMax() {
        return this.priceMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceMin() {
        return this.priceMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUpperBound() {
        return this.upperBound;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.chainId.hashCode() * 31) + this.tokenAddress.hashCode()) * 31) + this.type.hashCode()) * 31) + this.lowerBound.hashCode()) * 31) + this.upperBound.hashCode()) * 31) + this.addressList.hashCode()) * 31) + this.addressLabel.hashCode()) * 31) + this.priceMin.hashCode()) * 31) + this.priceMax.hashCode()) * 31) + this.startTime.hashCode()) * 31) + this.endTime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "HistoryTokenFilterData(chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", type=" + this.type + ", lowerBound=" + this.lowerBound + ", upperBound=" + this.upperBound + ", addressList=" + this.addressList + ", addressLabel=" + this.addressLabel + ", priceMin=" + this.priceMin + ", priceMax=" + this.priceMax + ", startTime=" + this.startTime + ", endTime=" + this.endTime + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.dexkline.market.data.model.history.HistoryTokenFilterData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<HistoryTokenFilterData> serializer() {
            return HistoryTokenFilterData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ HistoryTokenFilterData(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str2;
        }
        if ((i & 4) == 0) {
            this.type = "";
        } else {
            this.type = str3;
        }
        if ((i & 8) == 0) {
            this.lowerBound = "";
        } else {
            this.lowerBound = str4;
        }
        if ((i & 16) == 0) {
            this.upperBound = "";
        } else {
            this.upperBound = str5;
        }
        if ((i & 32) == 0) {
            this.addressList = yDY.AhwBna();
        } else {
            this.addressList = list;
        }
        if ((i & 64) == 0) {
            this.addressLabel = "";
        } else {
            this.addressLabel = str6;
        }
        if ((i & 128) == 0) {
            this.priceMin = "";
        } else {
            this.priceMin = str7;
        }
        if ((i & 256) == 0) {
            this.priceMax = "";
        } else {
            this.priceMax = str8;
        }
        if ((i & 512) == 0) {
            this.startTime = "";
        } else {
            this.startTime = str9;
        }
        if ((i & 1024) == 0) {
            this.endTime = "";
        } else {
            this.endTime = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKKLine_kline_impl(HistoryTokenFilterData historyTokenFilterData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) historyTokenFilterData.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, historyTokenFilterData.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) historyTokenFilterData.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, historyTokenFilterData.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) historyTokenFilterData.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, historyTokenFilterData.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) historyTokenFilterData.lowerBound, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, historyTokenFilterData.lowerBound);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) historyTokenFilterData.upperBound, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, historyTokenFilterData.upperBound);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(historyTokenFilterData.addressList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], historyTokenFilterData.addressList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) historyTokenFilterData.addressLabel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, historyTokenFilterData.addressLabel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) historyTokenFilterData.priceMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, historyTokenFilterData.priceMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) historyTokenFilterData.priceMax, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, historyTokenFilterData.priceMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) historyTokenFilterData.startTime, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, historyTokenFilterData.startTime);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) historyTokenFilterData.endTime, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, historyTokenFilterData.endTime);
    }

    public HistoryTokenFilterData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<String> list, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.chainId = str;
        this.tokenAddress = str2;
        this.type = str3;
        this.lowerBound = str4;
        this.upperBound = str5;
        this.addressList = list;
        this.addressLabel = str6;
        this.priceMin = str7;
        this.priceMax = str8;
        this.startTime = str9;
        this.endTime = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0070: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:21)) : (r18v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.dexkline.market.data.model.history.HistoryTokenFilterData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ HistoryTokenFilterData(String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? yDY.AhwBna() : list, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) == 0 ? str10 : "");
    }
}
