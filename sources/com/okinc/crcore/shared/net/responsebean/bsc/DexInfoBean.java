package com.okinc.crcore.shared.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.bsc.DexInfoResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.mDA;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class DexInfoBean implements Parcelable {
    public static final int $stable = 0;
    private final String balance;
    private final int balanceTag;
    private final String balanceUsd;
    private final String chainIndex;
    private final String chainLogo;
    private final String chainName;
    private final boolean communityRecognized;
    private final int decimal;
    private final String liquidity;
    private final String marketCap;
    private final String price;
    private final String riskLevel;
    private final String tokenAddress;
    private final String uniqueId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DexInfoBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexInfoBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexInfoBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexInfoBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexInfoBean[] newArray(int i) {
            return new DexInfoBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexInfoBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, false, 16383, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.uniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.balanceTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.balanceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.communityRecognized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexInfoBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6, String str7, String str8, @NotNull String str9, int i, int i2, @NotNull String str10, @NotNull String str11, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        return new DexInfoBean(str, str2, str3, str4, str5, str6, str7, str8, str9, i, i2, str10, str11, z);
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
        if (!(obj instanceof DexInfoBean)) {
            return false;
        }
        DexInfoBean dexInfoBean = (DexInfoBean) obj;
        return Intrinsics.EZpvd((Object) this.uniqueId, (Object) dexInfoBean.uniqueId) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) dexInfoBean.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) dexInfoBean.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) dexInfoBean.chainLogo) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) dexInfoBean.tokenAddress) && Intrinsics.EZpvd((Object) this.price, (Object) dexInfoBean.price) && Intrinsics.EZpvd((Object) this.liquidity, (Object) dexInfoBean.liquidity) && Intrinsics.EZpvd((Object) this.marketCap, (Object) dexInfoBean.marketCap) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) dexInfoBean.riskLevel) && this.decimal == dexInfoBean.decimal && this.balanceTag == dexInfoBean.balanceTag && Intrinsics.EZpvd((Object) this.balance, (Object) dexInfoBean.balance) && Intrinsics.EZpvd((Object) this.balanceUsd, (Object) dexInfoBean.balanceUsd) && this.communityRecognized == dexInfoBean.communityRecognized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getBalanceTag() {
        return this.balanceTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalanceUsd() {
        return this.balanceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainLogo() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCommunityRecognized() {
        return this.communityRecognized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDecimal() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLiquidity() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskLevel() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUniqueId() {
        return this.uniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.uniqueId.hashCode();
        int iHashCode2 = this.chainIndex.hashCode();
        int iHashCode3 = this.chainName.hashCode();
        String str = this.chainLogo;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = this.tokenAddress.hashCode();
        int iHashCode6 = this.price.hashCode();
        String str2 = this.liquidity;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.marketCap;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + this.riskLevel.hashCode()) * 31) + Integer.hashCode(this.decimal)) * 31) + Integer.hashCode(this.balanceTag)) * 31) + this.balance.hashCode()) * 31) + this.balanceUsd.hashCode()) * 31) + Boolean.hashCode(this.communityRecognized);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexInfoBean(uniqueId=" + this.uniqueId + ", chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", tokenAddress=" + this.tokenAddress + ", price=" + this.price + ", liquidity=" + this.liquidity + ", marketCap=" + this.marketCap + ", riskLevel=" + this.riskLevel + ", decimal=" + this.decimal + ", balanceTag=" + this.balanceTag + ", balance=" + this.balance + ", balanceUsd=" + this.balanceUsd + ", communityRecognized=" + this.communityRecognized + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.uniqueId);
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.chainName);
        parcel.writeString(this.chainLogo);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.price);
        parcel.writeString(this.liquidity);
        parcel.writeString(this.marketCap);
        parcel.writeString(this.riskLevel);
        parcel.writeInt(this.decimal);
        parcel.writeInt(this.balanceTag);
        parcel.writeString(this.balance);
        parcel.writeString(this.balanceUsd);
        parcel.writeInt(this.communityRecognized ? 1 : 0);
    }

    public /* synthetic */ DexInfoBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, int i3, String str10, String str11, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.uniqueId = "";
        } else {
            this.uniqueId = str;
        }
        if ((i & 2) == 0) {
            this.chainIndex = "";
        } else {
            this.chainIndex = str2;
        }
        if ((i & 4) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str3;
        }
        if ((i & 8) == 0) {
            this.chainLogo = null;
        } else {
            this.chainLogo = str4;
        }
        if ((i & 16) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str5;
        }
        if ((i & 32) == 0) {
            this.price = "";
        } else {
            this.price = str6;
        }
        if ((i & 64) == 0) {
            this.liquidity = null;
        } else {
            this.liquidity = str7;
        }
        if ((i & 128) == 0) {
            this.marketCap = null;
        } else {
            this.marketCap = str8;
        }
        if ((i & 256) == 0) {
            this.riskLevel = "";
        } else {
            this.riskLevel = str9;
        }
        if ((i & 512) == 0) {
            this.decimal = 0;
        } else {
            this.decimal = i2;
        }
        this.balanceTag = (i & 1024) == 0 ? 2 : i3;
        if ((i & 2048) == 0) {
            this.balance = "";
        } else {
            this.balance = str10;
        }
        if ((i & 4096) == 0) {
            this.balanceUsd = "";
        } else {
            this.balanceUsd = str11;
        }
        if ((i & 8192) == 0) {
            this.communityRecognized = false;
        } else {
            this.communityRecognized = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DexInfoBean dexInfoBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexInfoBean.uniqueId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexInfoBean.uniqueId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexInfoBean.chainIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexInfoBean.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexInfoBean.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexInfoBean.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || dexInfoBean.chainLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, dexInfoBean.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexInfoBean.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexInfoBean.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dexInfoBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dexInfoBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || dexInfoBean.liquidity != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, dexInfoBean.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || dexInfoBean.marketCap != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, dexInfoBean.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) dexInfoBean.riskLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, dexInfoBean.riskLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || dexInfoBean.decimal != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, dexInfoBean.decimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || dexInfoBean.balanceTag != 2) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, dexInfoBean.balanceTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) dexInfoBean.balance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, dexInfoBean.balance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) dexInfoBean.balanceUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, dexInfoBean.balanceUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || dexInfoBean.communityRecognized) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, dexInfoBean.communityRecognized);
        }
    }

    public DexInfoBean(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, @NotNull String str5, @NotNull String str6, String str7, String str8, @NotNull String str9, int i, int i2, @NotNull String str10, @NotNull String str11, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        this.uniqueId = str;
        this.chainIndex = str2;
        this.chainName = str3;
        this.chainLogo = str4;
        this.tokenAddress = str5;
        this.price = str6;
        this.liquidity = str7;
        this.marketCap = str8;
        this.riskLevel = str9;
        this.decimal = i;
        this.balanceTag = i2;
        this.balance = str10;
        this.balanceUsd = str11;
        this.communityRecognized = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0091: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r31v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r31v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r31v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r31v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r31v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r31v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r31v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003d: ARITH (r31v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (null java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r31v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004c: ARITH (r31v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r26v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0055: ARITH (r31v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r27v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r31v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r31v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r29v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006c: ARITH (r31v0 int) & (8192 int) A[WRAPPED]) == (0 int)) ? (r30v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, boolean):void (m)] (LINE:170) call: com.okinc.crcore.shared.net.responsebean.bsc.DexInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ DexInfoBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2, String str10, String str11, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? "" : str6, (i3 & 64) != 0 ? null : str7, (i3 & 128) == 0 ? str8 : null, (i3 & 256) != 0 ? "" : str9, (i3 & 512) != 0 ? 0 : i, (i3 & 1024) != 0 ? 2 : i2, (i3 & 2048) != 0 ? "" : str10, (i3 & 4096) == 0 ? str11 : "", (i3 & 8192) == 0 ? z : false);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.DexInfoBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<DexInfoBean> serializer() {
            return DexInfoBean$$serializer.INSTANCE;
        }

        public final DexInfoBean OLrzqt(@NotNull DexInfoResponseBean dexInfoResponseBean) {
            Intrinsics.checkNotNullParameter(dexInfoResponseBean, "");
            return new DexInfoBean(mDA.EZpvd.EZpvd(dexInfoResponseBean.getChainIndex(), dexInfoResponseBean.getTokenAddress()), dexInfoResponseBean.getChainIndex(), dexInfoResponseBean.getChainName(), dexInfoResponseBean.getChainLogo(), dexInfoResponseBean.getTokenAddress(), dexInfoResponseBean.getPrice(), dexInfoResponseBean.getLiquidity(), dexInfoResponseBean.getMarketCap(), dexInfoResponseBean.getRiskLevel(), dexInfoResponseBean.getDecimal(), dexInfoResponseBean.getBalanceTag(), dexInfoResponseBean.getBalance(), dexInfoResponseBean.getBalanceUsd(), dexInfoResponseBean.getCommunityRecognized());
        }
    }
}
