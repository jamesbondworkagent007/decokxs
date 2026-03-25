package com.okinc.business.trade.features.home.ui.cefi.data;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.C33129mqd;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class OrderBookInfo {
    private final boolean batchPushFlag;
    private final String chainId;
    private final String tokenAddress;
    private final String type;
    private final List<String> userAddressList;
    private final String volumeMax;
    private final String volumeMin;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.business.trade.features.home.ui.cefi.data.OrderBookInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderBookInfo copy$default(OrderBookInfo orderBookInfo, String str, String str2, String str3, String str4, String str5, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderBookInfo.chainId;
        }
        if ((i & 2) != 0) {
            str2 = orderBookInfo.tokenAddress;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = orderBookInfo.type;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = orderBookInfo.volumeMin;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = orderBookInfo.volumeMax;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            list = orderBookInfo.userAddressList;
        }
        List list2 = list;
        if ((i & 64) != 0) {
            z = orderBookInfo.batchPushFlag;
        }
        return orderBookInfo.copy(str, str6, str7, str8, str9, list2, z);
    }

    @SerialName("batchPushFlag")
    public static /* synthetic */ void getBatchPushFlag$annotations() {
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("tokenContractAddress")
    public static /* synthetic */ void getTokenAddress$annotations() {
    }

    @SerialName("type")
    public static /* synthetic */ void getType$annotations() {
    }

    @SerialName("userAddressList")
    public static /* synthetic */ void getUserAddressList$annotations() {
    }

    @SerialName("volumeMax")
    public static /* synthetic */ void getVolumeMax$annotations() {
    }

    @SerialName("volumeMin")
    public static /* synthetic */ void getVolumeMin$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
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
        return this.volumeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.volumeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.userAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.batchPushFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderBookInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, List<String> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new OrderBookInfo(str, str2, str3, str4, str5, list, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderBookInfo)) {
            return false;
        }
        OrderBookInfo orderBookInfo = (OrderBookInfo) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) orderBookInfo.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) orderBookInfo.tokenAddress) && Intrinsics.EZpvd((Object) this.type, (Object) orderBookInfo.type) && Intrinsics.EZpvd((Object) this.volumeMin, (Object) orderBookInfo.volumeMin) && Intrinsics.EZpvd((Object) this.volumeMax, (Object) orderBookInfo.volumeMax) && Intrinsics.EZpvd(this.userAddressList, orderBookInfo.userAddressList) && this.batchPushFlag == orderBookInfo.batchPushFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBatchPushFlag() {
        return this.batchPushFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
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
    public final List<String> getUserAddressList() {
        return this.userAddressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolumeMax() {
        return this.volumeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getVolumeMin() {
        return this.volumeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.chainId.hashCode();
        int iHashCode2 = this.tokenAddress.hashCode();
        int iHashCode3 = this.type.hashCode();
        String str = this.volumeMin;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.volumeMax;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        List<String> list = this.userAddressList;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (list != null ? list.hashCode() : 0)) * 31) + Boolean.hashCode(this.batchPushFlag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderBookInfo(chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", type=" + this.type + ", volumeMin=" + this.volumeMin + ", volumeMax=" + this.volumeMax + ", userAddressList=" + this.userAddressList + ", batchPushFlag=" + this.batchPushFlag + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.trade.features.home.ui.cefi.data.OrderBookInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<OrderBookInfo> serializer() {
            return OrderBookInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ OrderBookInfo(int i, String str, String str2, String str3, String str4, String str5, List list, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, OrderBookInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.chainId = str;
        this.tokenAddress = str2;
        if ((i & 4) == 0) {
            this.type = "";
        } else {
            this.type = str3;
        }
        if ((i & 8) == 0) {
            this.volumeMin = null;
        } else {
            this.volumeMin = str4;
        }
        if ((i & 16) == 0) {
            this.volumeMax = null;
        } else {
            this.volumeMax = str5;
        }
        if ((i & 32) == 0) {
            this.userAddressList = yDY.AhwBna();
        } else {
            this.userAddressList = list;
        }
        if ((i & 64) == 0) {
            this.batchPushFlag = true;
        } else {
            this.batchPushFlag = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(OrderBookInfo orderBookInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        compositeEncoder.encodeStringElement(serialDescriptor, 0, orderBookInfo.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, orderBookInfo.tokenAddress);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) orderBookInfo.type, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, orderBookInfo.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || orderBookInfo.volumeMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, orderBookInfo.volumeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || orderBookInfo.volumeMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, orderBookInfo.volumeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd(orderBookInfo.userAddressList, yDY.AhwBna())) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, kSerializerArr[5], orderBookInfo.userAddressList);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && orderBookInfo.batchPushFlag) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 6, orderBookInfo.batchPushFlag);
    }

    public OrderBookInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, List<String> list, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.chainId = str;
        this.tokenAddress = str2;
        this.type = str3;
        this.volumeMin = str4;
        this.volumeMax = str5;
        this.userAddressList = list;
        this.batchPushFlag = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002f: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0018: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0020: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:39)) : (r15v0 java.util.List))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0023: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, boolean):void (m)] (LINE:27) call: com.okinc.business.trade.features.home.ui.cefi.data.OrderBookInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, boolean):void type: THIS */
    public /* synthetic */ OrderBookInfo(String str, String str2, String str3, String str4, String str5, List list, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? yDY.AhwBna() : list, (i & 64) != 0 ? true : z);
    }

    public final boolean hasFilters() {
        return C33129mqd.OLrzqt((CharSequence) this.volumeMin) || C33129mqd.OLrzqt((CharSequence) this.volumeMax);
    }
}
