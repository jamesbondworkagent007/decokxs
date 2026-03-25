package com.okinc.crcore.coreapi.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class DexInfoResponseBean implements Parcelable {
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
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<DexInfoResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexInfoResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexInfoResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexInfoResponseBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexInfoResponseBean[] newArray(int i) {
            return new DexInfoResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexInfoResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, false, 8191, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.balanceUsd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.communityRecognized;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.chainLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.liquidity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.riskLevel;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.balanceTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexInfoResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i, int i2, @NotNull String str9, @NotNull String str10, boolean z) {
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
        return new DexInfoResponseBean(str, str2, str3, str4, str5, str6, str7, str8, i, i2, str9, str10, z);
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
        if (!(obj instanceof DexInfoResponseBean)) {
            return false;
        }
        DexInfoResponseBean dexInfoResponseBean = (DexInfoResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.chainIndex, (Object) dexInfoResponseBean.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) dexInfoResponseBean.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) dexInfoResponseBean.chainLogo) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) dexInfoResponseBean.tokenAddress) && Intrinsics.EZpvd((Object) this.price, (Object) dexInfoResponseBean.price) && Intrinsics.EZpvd((Object) this.liquidity, (Object) dexInfoResponseBean.liquidity) && Intrinsics.EZpvd((Object) this.marketCap, (Object) dexInfoResponseBean.marketCap) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) dexInfoResponseBean.riskLevel) && this.balanceTag == dexInfoResponseBean.balanceTag && this.decimal == dexInfoResponseBean.decimal && Intrinsics.EZpvd((Object) this.balance, (Object) dexInfoResponseBean.balance) && Intrinsics.EZpvd((Object) this.balanceUsd, (Object) dexInfoResponseBean.balanceUsd) && this.communityRecognized == dexInfoResponseBean.communityRecognized;
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
    public int hashCode() {
        return (((((((((((((((((((((((this.chainIndex.hashCode() * 31) + this.chainName.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + this.price.hashCode()) * 31) + this.liquidity.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.riskLevel.hashCode()) * 31) + Integer.hashCode(this.balanceTag)) * 31) + Integer.hashCode(this.decimal)) * 31) + this.balance.hashCode()) * 31) + this.balanceUsd.hashCode()) * 31) + Boolean.hashCode(this.communityRecognized);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexInfoResponseBean(chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", tokenAddress=" + this.tokenAddress + ", price=" + this.price + ", liquidity=" + this.liquidity + ", marketCap=" + this.marketCap + ", riskLevel=" + this.riskLevel + ", balanceTag=" + this.balanceTag + ", decimal=" + this.decimal + ", balance=" + this.balance + ", balanceUsd=" + this.balanceUsd + ", communityRecognized=" + this.communityRecognized + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.chainIndex);
        parcel.writeString(this.chainName);
        parcel.writeString(this.chainLogo);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.price);
        parcel.writeString(this.liquidity);
        parcel.writeString(this.marketCap);
        parcel.writeString(this.riskLevel);
        parcel.writeInt(this.balanceTag);
        parcel.writeInt(this.decimal);
        parcel.writeString(this.balance);
        parcel.writeString(this.balanceUsd);
        parcel.writeInt(this.communityRecognized ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.DexInfoResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexInfoResponseBean> serializer() {
            return DexInfoResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexInfoResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, int i3, String str9, String str10, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainIndex = "";
        } else {
            this.chainIndex = str;
        }
        if ((i & 2) == 0) {
            this.chainName = "";
        } else {
            this.chainName = str2;
        }
        if ((i & 4) == 0) {
            this.chainLogo = "";
        } else {
            this.chainLogo = str3;
        }
        if ((i & 8) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str4;
        }
        if ((i & 16) == 0) {
            this.price = "";
        } else {
            this.price = str5;
        }
        if ((i & 32) == 0) {
            this.liquidity = "";
        } else {
            this.liquidity = str6;
        }
        if ((i & 64) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str7;
        }
        if ((i & 128) == 0) {
            this.riskLevel = "";
        } else {
            this.riskLevel = str8;
        }
        this.balanceTag = (i & 256) == 0 ? 2 : i2;
        if ((i & 512) == 0) {
            this.decimal = 0;
        } else {
            this.decimal = i3;
        }
        if ((i & 1024) == 0) {
            this.balance = "";
        } else {
            this.balance = str9;
        }
        if ((i & 2048) == 0) {
            this.balanceUsd = "";
        } else {
            this.balanceUsd = str10;
        }
        if ((i & 4096) == 0) {
            this.communityRecognized = false;
        } else {
            this.communityRecognized = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(DexInfoResponseBean dexInfoResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexInfoResponseBean.chainIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexInfoResponseBean.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexInfoResponseBean.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexInfoResponseBean.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexInfoResponseBean.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexInfoResponseBean.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexInfoResponseBean.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexInfoResponseBean.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexInfoResponseBean.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexInfoResponseBean.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dexInfoResponseBean.liquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dexInfoResponseBean.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dexInfoResponseBean.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dexInfoResponseBean.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dexInfoResponseBean.riskLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dexInfoResponseBean.riskLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || dexInfoResponseBean.balanceTag != 2) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, dexInfoResponseBean.balanceTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || dexInfoResponseBean.decimal != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, dexInfoResponseBean.decimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) dexInfoResponseBean.balance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, dexInfoResponseBean.balance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) dexInfoResponseBean.balanceUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, dexInfoResponseBean.balanceUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || dexInfoResponseBean.communityRecognized) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, dexInfoResponseBean.communityRecognized);
        }
    }

    public DexInfoResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i, int i2, @NotNull String str9, @NotNull String str10, boolean z) {
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
        this.chainIndex = str;
        this.chainName = str2;
        this.chainLogo = str3;
        this.tokenAddress = str4;
        this.price = str5;
        this.liquidity = str6;
        this.marketCap = str7;
        this.riskLevel = str8;
        this.balanceTag = i;
        this.decimal = i2;
        this.balance = str9;
        this.balanceUsd = str10;
        this.communityRecognized = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0087: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r29v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r29v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r29v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r29v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r29v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r29v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r29v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r29v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0044: ARITH (r29v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r24v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004c: ARITH (r29v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r25v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r29v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005d: ARITH (r29v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0064: ARITH (r29v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r28v0 boolean) : false)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, boolean):void (m)] (LINE:47) call: com.okinc.crcore.coreapi.net.responsebean.bsc.DexInfoResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ DexInfoResponseBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, String str9, String str10, boolean z, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? "" : str6, (i3 & 64) != 0 ? "" : str7, (i3 & 128) != 0 ? "" : str8, (i3 & 256) != 0 ? 2 : i, (i3 & 512) != 0 ? 0 : i2, (i3 & 1024) != 0 ? "" : str9, (i3 & 2048) == 0 ? str10 : "", (i3 & 4096) == 0 ? z : false);
    }
}
