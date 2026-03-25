package com.okinc.business.market.features.coindetail.domain.models;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class EarlyBuyers {
    private final String chainId;
    private final List<SniperHolder> earlyBuyerDetailVOList;
    private final String tokenContractAddress;
    private final String totalBuyInAmountPercentage;
    private final String totalHoldAmountPercentage;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, new ArrayListSerializer(SniperHolder$$serializer.INSTANCE)};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EarlyBuyers() {
        this((String) null, (String) null, (String) null, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.market.features.coindetail.domain.models.EarlyBuyers */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EarlyBuyers copy$default(EarlyBuyers earlyBuyers, String str, String str2, String str3, String str4, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earlyBuyers.chainId;
        }
        if ((i & 2) != 0) {
            str2 = earlyBuyers.tokenContractAddress;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = earlyBuyers.totalBuyInAmountPercentage;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = earlyBuyers.totalHoldAmountPercentage;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            list = earlyBuyers.earlyBuyerDetailVOList;
        }
        return earlyBuyers.copy(str, str5, str6, str7, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.totalBuyInAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.totalHoldAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SniperHolder> component5() {
        return this.earlyBuyerDetailVOList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarlyBuyers copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<SniperHolder> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new EarlyBuyers(str, str2, str3, str4, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EarlyBuyers)) {
            return false;
        }
        EarlyBuyers earlyBuyers = (EarlyBuyers) obj;
        return Intrinsics.EZpvd((Object) this.chainId, (Object) earlyBuyers.chainId) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) earlyBuyers.tokenContractAddress) && Intrinsics.EZpvd((Object) this.totalBuyInAmountPercentage, (Object) earlyBuyers.totalBuyInAmountPercentage) && Intrinsics.EZpvd((Object) this.totalHoldAmountPercentage, (Object) earlyBuyers.totalHoldAmountPercentage) && Intrinsics.EZpvd(this.earlyBuyerDetailVOList, earlyBuyers.earlyBuyerDetailVOList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SniperHolder> getEarlyBuyerDetailVOList() {
        return this.earlyBuyerDetailVOList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalBuyInAmountPercentage() {
        return this.totalBuyInAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotalHoldAmountPercentage() {
        return this.totalHoldAmountPercentage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.chainId.hashCode() * 31) + this.tokenContractAddress.hashCode()) * 31) + this.totalBuyInAmountPercentage.hashCode()) * 31) + this.totalHoldAmountPercentage.hashCode()) * 31) + this.earlyBuyerDetailVOList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarlyBuyers(chainId=" + this.chainId + ", tokenContractAddress=" + this.tokenContractAddress + ", totalBuyInAmountPercentage=" + this.totalBuyInAmountPercentage + ", totalHoldAmountPercentage=" + this.totalHoldAmountPercentage + ", earlyBuyerDetailVOList=" + this.earlyBuyerDetailVOList + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.coindetail.domain.models.EarlyBuyers.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarlyBuyers> serializer() {
            return EarlyBuyers$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarlyBuyers(int i, String str, String str2, String str3, String str4, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str;
        }
        if ((i & 2) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str2;
        }
        if ((i & 4) == 0) {
            this.totalBuyInAmountPercentage = "";
        } else {
            this.totalBuyInAmountPercentage = str3;
        }
        if ((i & 8) == 0) {
            this.totalHoldAmountPercentage = "";
        } else {
            this.totalHoldAmountPercentage = str4;
        }
        if ((i & 16) == 0) {
            this.earlyBuyerDetailVOList = yDY.AhwBna();
        } else {
            this.earlyBuyerDetailVOList = list;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(EarlyBuyers earlyBuyers, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) earlyBuyers.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, earlyBuyers.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) earlyBuyers.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, earlyBuyers.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) earlyBuyers.totalBuyInAmountPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, earlyBuyers.totalBuyInAmountPercentage);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) earlyBuyers.totalHoldAmountPercentage, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, earlyBuyers.totalHoldAmountPercentage);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd(earlyBuyers.earlyBuyerDetailVOList, yDY.AhwBna())) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 4, kSerializerArr[4], earlyBuyers.earlyBuyerDetailVOList);
    }

    public EarlyBuyers(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull List<SniperHolder> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.chainId = str;
        this.tokenContractAddress = str2;
        this.totalBuyInAmountPercentage = str3;
        this.totalHoldAmountPercentage = str4;
        this.earlyBuyerDetailVOList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0021: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:36)) : (r8v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.business.market.features.coindetail.domain.models.SniperHolder>):void (m)] (LINE:31) call: com.okinc.business.market.features.coindetail.domain.models.EarlyBuyers.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ EarlyBuyers(String str, String str2, String str3, String str4, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) == 0 ? str4 : "", (i & 16) != 0 ? yDY.AhwBna() : list);
    }
}
