package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
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

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class BtcNftData implements Parcelable {
    public static final String BTC_TXTYPE_DUMMY = "64";
    private List<BTCNFTInfo> batchBean;
    private String feeRate;
    private int scenario;
    private String to;
    private String txType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<BtcNftData> CREATOR = new Creator();
    private static final KSerializer<Object>[] $childSerializers = {null, new ArrayListSerializer(BTCNFTInfo$$serializer.INSTANCE), null, null, null};

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<BtcNftData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BtcNftData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(BTCNFTInfo.CREATOR.createFromParcel(parcel));
            }
            return new BtcNftData(string, arrayList, parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BtcNftData[] newArray(int i) {
            return new BtcNftData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BtcNftData() {
        this((String) null, (List) null, 0, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.business.defi.api.bean.BtcNftData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BtcNftData copy$default(BtcNftData btcNftData, String str, List list, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = btcNftData.to;
        }
        if ((i2 & 2) != 0) {
            list = btcNftData.batchBean;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            i = btcNftData.scenario;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            str2 = btcNftData.txType;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            str3 = btcNftData.feeRate;
        }
        return btcNftData.copy(str, list2, i3, str4, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BTCNFTInfo> component2() {
        return this.batchBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BtcNftData copy(@NotNull String str, @NotNull List<BTCNFTInfo> list, int i, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new BtcNftData(str, list, i, str2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BtcNftData)) {
            return false;
        }
        BtcNftData btcNftData = (BtcNftData) obj;
        return Intrinsics.EZpvd((Object) this.to, (Object) btcNftData.to) && Intrinsics.EZpvd(this.batchBean, btcNftData.batchBean) && this.scenario == btcNftData.scenario && Intrinsics.EZpvd((Object) this.txType, (Object) btcNftData.txType) && Intrinsics.EZpvd((Object) this.feeRate, (Object) btcNftData.feeRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BTCNFTInfo> getBatchBean() {
        return this.batchBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeRate() {
        return this.feeRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getScenario() {
        return this.scenario;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTo() {
        return this.to;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTxType() {
        return this.txType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.to.hashCode();
        int iHashCode2 = this.batchBean.hashCode();
        int iHashCode3 = Integer.hashCode(this.scenario);
        String str = this.txType;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.feeRate;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBatchBean(@NotNull List<BTCNFTInfo> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.batchBean = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeRate(String str) {
        this.feeRate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setScenario(int i) {
        this.scenario = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.to = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTxType(String str) {
        this.txType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BtcNftData(to=" + this.to + ", batchBean=" + this.batchBean + ", scenario=" + this.scenario + ", txType=" + this.txType + ", feeRate=" + this.feeRate + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.to);
        List<BTCNFTInfo> list = this.batchBean;
        parcel.writeInt(list.size());
        Iterator<BTCNFTInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.scenario);
        parcel.writeString(this.txType);
        parcel.writeString(this.feeRate);
    }

    public /* synthetic */ BtcNftData(int i, String str, List list, int i2, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        this.to = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.batchBean = yDY.AhwBna();
        } else {
            this.batchBean = list;
        }
        if ((i & 4) == 0) {
            this.scenario = 0;
        } else {
            this.scenario = i2;
        }
        if ((i & 8) == 0) {
            this.txType = null;
        } else {
            this.txType = str2;
        }
        if ((i & 16) == 0) {
            this.feeRate = null;
        } else {
            this.feeRate = str3;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(BtcNftData btcNftData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) btcNftData.to, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, btcNftData.to);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd(btcNftData.batchBean, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, kSerializerArr[1], btcNftData.batchBean);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || btcNftData.scenario != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 2, btcNftData.scenario);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || btcNftData.txType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, btcNftData.txType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && btcNftData.feeRate == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, btcNftData.feeRate);
    }

    public BtcNftData(@NotNull String str, @NotNull List<BTCNFTInfo> list, int i, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.to = str;
        this.batchBean = list;
        this.scenario = i;
        this.txType = str2;
        this.feeRate = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.util.List:0x000e: TERNARY null = ((wrap:int:0x0006: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:136)) : (r5v0 java.util.List))
  (wrap:int:0x0014: TERNARY null = ((wrap:int:0x000f: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r6v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<com.okinc.business.defi.api.bean.BTCNFTInfo>, int, java.lang.String, java.lang.String):void (m)] (LINE:134) call: com.okinc.business.defi.api.bean.BtcNftData.<init>(java.lang.String, java.util.List, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BtcNftData(String str, List list, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? yDY.AhwBna() : list, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? null : str2, (i2 & 16) != 0 ? null : str3);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.BtcNftData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BtcNftData> serializer() {
            return BtcNftData$$serializer.INSTANCE;
        }
    }

    public final Integer getFirstNftProtocolId() {
        return ((BTCNFTInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(this.batchBean)).getProtocolId();
    }

    public final String getFirstCoinTokenId() {
        return ((BTCNFTInfo) CollectionsKt___CollectionsKt.AuCTelauCTel(this.batchBean)).getTokenId();
    }
}
