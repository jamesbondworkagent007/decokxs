package com.okinc.business.defi.biz.core.transaction.sign.sui.bean;

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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class SuiSignInfo {
    private static final KSerializer<Object>[] $childSerializers;
    private String gasPrice;
    private List<SuiInputCoin> inputCoins;
    private String maxObjectLimit;
    private List<SuiInputCoin> tokenInputCoins;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SuiSignInfo() {
        this((String) null, (List) null, (List) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.biz.core.transaction.sign.sui.bean.SuiSignInfo */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SuiSignInfo copy$default(SuiSignInfo suiSignInfo, String str, List list, List list2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = suiSignInfo.gasPrice;
        }
        if ((i & 2) != 0) {
            list = suiSignInfo.inputCoins;
        }
        if ((i & 4) != 0) {
            list2 = suiSignInfo.tokenInputCoins;
        }
        if ((i & 8) != 0) {
            str2 = suiSignInfo.maxObjectLimit;
        }
        return suiSignInfo.copy(str, list, list2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SuiInputCoin> component2() {
        return this.inputCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SuiInputCoin> component3() {
        return this.tokenInputCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.maxObjectLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SuiSignInfo copy(String str, List<SuiInputCoin> list, List<SuiInputCoin> list2, String str2) {
        return new SuiSignInfo(str, list, list2, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuiSignInfo)) {
            return false;
        }
        SuiSignInfo suiSignInfo = (SuiSignInfo) obj;
        return Intrinsics.EZpvd((Object) this.gasPrice, (Object) suiSignInfo.gasPrice) && Intrinsics.EZpvd(this.inputCoins, suiSignInfo.inputCoins) && Intrinsics.EZpvd(this.tokenInputCoins, suiSignInfo.tokenInputCoins) && Intrinsics.EZpvd((Object) this.maxObjectLimit, (Object) suiSignInfo.maxObjectLimit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getGasPrice() {
        return this.gasPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SuiInputCoin> getInputCoins() {
        return this.inputCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxObjectLimit() {
        return this.maxObjectLimit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SuiInputCoin> getTokenInputCoins() {
        return this.tokenInputCoins;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.gasPrice;
        int iHashCode = str == null ? 0 : str.hashCode();
        List<SuiInputCoin> list = this.inputCoins;
        int iHashCode2 = list == null ? 0 : list.hashCode();
        List<SuiInputCoin> list2 = this.tokenInputCoins;
        int iHashCode3 = list2 == null ? 0 : list2.hashCode();
        String str2 = this.maxObjectLimit;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setGasPrice(String str) {
        this.gasPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputCoins(List<SuiInputCoin> list) {
        this.inputCoins = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxObjectLimit(String str) {
        this.maxObjectLimit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenInputCoins(List<SuiInputCoin> list) {
        this.tokenInputCoins = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SuiSignInfo(gasPrice=" + this.gasPrice + ", inputCoins=" + this.inputCoins + ", tokenInputCoins=" + this.tokenInputCoins + ", maxObjectLimit=" + this.maxObjectLimit + ")";
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.core.transaction.sign.sui.bean.SuiSignInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SuiSignInfo> serializer() {
            return SuiSignInfo$$serializer.INSTANCE;
        }
    }

    static {
        SuiInputCoin$$serializer suiInputCoin$$serializer = SuiInputCoin$$serializer.INSTANCE;
        $childSerializers = new KSerializer[]{null, new ArrayListSerializer(suiInputCoin$$serializer), new ArrayListSerializer(suiInputCoin$$serializer), null};
    }

    public /* synthetic */ SuiSignInfo(int i, String str, List list, List list2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.gasPrice = null;
        } else {
            this.gasPrice = str;
        }
        if ((i & 2) == 0) {
            this.inputCoins = null;
        } else {
            this.inputCoins = list;
        }
        if ((i & 4) == 0) {
            this.tokenInputCoins = null;
        } else {
            this.tokenInputCoins = list2;
        }
        if ((i & 8) == 0) {
            this.maxObjectLimit = null;
        } else {
            this.maxObjectLimit = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(SuiSignInfo suiSignInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || suiSignInfo.gasPrice != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, suiSignInfo.gasPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || suiSignInfo.inputCoins != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, kSerializerArr[1], suiSignInfo.inputCoins);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || suiSignInfo.tokenInputCoins != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, kSerializerArr[2], suiSignInfo.tokenInputCoins);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && suiSignInfo.maxObjectLimit == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, suiSignInfo.maxObjectLimit);
    }

    public SuiSignInfo(String str, List<SuiInputCoin> list, List<SuiInputCoin> list2, String str2) {
        this.gasPrice = str;
        this.inputCoins = list;
        this.tokenInputCoins = list2;
        this.maxObjectLimit = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r3v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r4v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.defi.biz.core.transaction.sign.sui.bean.SuiInputCoin>, java.util.List<com.okinc.business.defi.biz.core.transaction.sign.sui.bean.SuiInputCoin>, java.lang.String):void (m)] (LINE:12) call: com.okinc.business.defi.biz.core.transaction.sign.sui.bean.SuiSignInfo.<init>(java.lang.String, java.util.List, java.util.List, java.lang.String):void type: THIS */
    public /* synthetic */ SuiSignInfo(String str, List list, List list2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : list2, (i & 8) != 0 ? null : str2);
    }
}
