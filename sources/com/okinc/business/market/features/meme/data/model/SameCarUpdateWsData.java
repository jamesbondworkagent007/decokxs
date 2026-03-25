package com.okinc.business.market.features.meme.data.model;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Serializable
public final class SameCarUpdateWsData {
    private final String chain;
    private final int collectType;
    private final List<Integer> tagTypeList;
    private final String tokenContractAddress;
    private final int userActionType;
    private final String walletAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SameCarUpdateWsData() {
        this((List) null, 0, 0, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.okinc.business.market.features.meme.data.model.SameCarUpdateWsData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SameCarUpdateWsData copy$default(SameCarUpdateWsData sameCarUpdateWsData, List list, int i, int i2, String str, String str2, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            list = sameCarUpdateWsData.tagTypeList;
        }
        if ((i3 & 2) != 0) {
            i = sameCarUpdateWsData.collectType;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            i2 = sameCarUpdateWsData.userActionType;
        }
        int i5 = i2;
        if ((i3 & 8) != 0) {
            str = sameCarUpdateWsData.walletAddress;
        }
        String str4 = str;
        if ((i3 & 16) != 0) {
            str2 = sameCarUpdateWsData.chain;
        }
        String str5 = str2;
        if ((i3 & 32) != 0) {
            str3 = sameCarUpdateWsData.tokenContractAddress;
        }
        return sameCarUpdateWsData.copy(list, i4, i5, str4, str5, str3);
    }

    @SerialName("chain")
    public static /* synthetic */ void getChain$annotations() {
    }

    @SerialName("collectType")
    public static /* synthetic */ void getCollectType$annotations() {
    }

    @SerialName("tagTypeList")
    public static /* synthetic */ void getTagTypeList$annotations() {
    }

    @SerialName("tokenAddress")
    public static /* synthetic */ void getTokenContractAddress$annotations() {
    }

    @SerialName("userActionType")
    public static /* synthetic */ void getUserActionType$annotations() {
    }

    @SerialName("walletAddress")
    public static /* synthetic */ void getWalletAddress$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component1() {
        return this.tagTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.collectType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.userActionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SameCarUpdateWsData copy(@NotNull List<Integer> list, int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new SameCarUpdateWsData(list, i, i2, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SameCarUpdateWsData)) {
            return false;
        }
        SameCarUpdateWsData sameCarUpdateWsData = (SameCarUpdateWsData) obj;
        return Intrinsics.EZpvd(this.tagTypeList, sameCarUpdateWsData.tagTypeList) && this.collectType == sameCarUpdateWsData.collectType && this.userActionType == sameCarUpdateWsData.userActionType && Intrinsics.EZpvd((Object) this.walletAddress, (Object) sameCarUpdateWsData.walletAddress) && Intrinsics.EZpvd((Object) this.chain, (Object) sameCarUpdateWsData.chain) && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) sameCarUpdateWsData.tokenContractAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChain() {
        return this.chain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCollectType() {
        return this.collectType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getTagTypeList() {
        return this.tagTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getUserActionType() {
        return this.userActionType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAddress() {
        return this.walletAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((this.tagTypeList.hashCode() * 31) + Integer.hashCode(this.collectType)) * 31) + Integer.hashCode(this.userActionType)) * 31) + this.walletAddress.hashCode()) * 31) + this.chain.hashCode()) * 31) + this.tokenContractAddress.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isClosePosition() {
        return this.userActionType == 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCollectedToken() {
        return this.collectType == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isOpenPosition() {
        return this.userActionType == 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SameCarUpdateWsData(tagTypeList=" + this.tagTypeList + ", collectType=" + this.collectType + ", userActionType=" + this.userActionType + ", walletAddress=" + this.walletAddress + ", chain=" + this.chain + ", tokenContractAddress=" + this.tokenContractAddress + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.market.features.meme.data.model.SameCarUpdateWsData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SameCarUpdateWsData> serializer() {
            return SameCarUpdateWsData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SameCarUpdateWsData(int i, List list, int i2, int i3, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.tagTypeList = (i & 1) == 0 ? yDY.AhwBna() : list;
        if ((i & 2) == 0) {
            this.collectType = 0;
        } else {
            this.collectType = i2;
        }
        if ((i & 4) == 0) {
            this.userActionType = 0;
        } else {
            this.userActionType = i3;
        }
        if ((i & 8) == 0) {
            this.walletAddress = "";
        } else {
            this.walletAddress = str;
        }
        if ((i & 16) == 0) {
            this.chain = "";
        } else {
            this.chain = str2;
        }
        if ((i & 32) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKDex_dex_impl(SameCarUpdateWsData sameCarUpdateWsData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd(sameCarUpdateWsData.tagTypeList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, kSerializerArr[0], sameCarUpdateWsData.tagTypeList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || sameCarUpdateWsData.collectType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 1, sameCarUpdateWsData.collectType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || sameCarUpdateWsData.userActionType != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, sameCarUpdateWsData.userActionType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) sameCarUpdateWsData.walletAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, sameCarUpdateWsData.walletAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) sameCarUpdateWsData.chain, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, sameCarUpdateWsData.chain);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) sameCarUpdateWsData.tokenContractAddress, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, sameCarUpdateWsData.tokenContractAddress);
    }

    public SameCarUpdateWsData(@NotNull List<Integer> list, int i, int i2, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.tagTypeList = list;
        this.collectType = i;
        this.userActionType = i2;
        this.walletAddress = str;
        this.chain = str2;
        this.tokenContractAddress = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0034: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r11v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:11)) : (r5v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0008: ARITH (r11v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0010: ARITH (r11v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r7v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r11v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r11v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r11v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
 A[MD:(java.util.List<java.lang.Integer>, int, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:9) call: com.okinc.business.market.features.meme.data.model.SameCarUpdateWsData.<init>(java.util.List, int, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SameCarUpdateWsData(List list, int i, int i2, String str, String str2, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? yDY.AhwBna() : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) == 0 ? i2 : 0, (i3 & 8) != 0 ? "" : str, (i3 & 16) != 0 ? "" : str2, (i3 & 32) != 0 ? "" : str3);
    }
}
