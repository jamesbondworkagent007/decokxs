package com.okinc.okpaymentapi.data.remote.model.experience;

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

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class DexInfo implements Parcelable {
    public static final int $stable = 0;
    private final String balance;
    private final int balanceTag;
    private final String balanceUsd;
    private final String cefiId;
    private final boolean cexListing;
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
    public static final Parcelable.Creator<DexInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<DexInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new DexInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexInfo[] newArray(int i) {
            return new DexInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public DexInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, false, false, (String) null, 65535, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.uniqueId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.balanceTag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.decimal;
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
    public final boolean component15() {
        return this.cexListing;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.cefiId;
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
    public final DexInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i, int i2, @NotNull String str10, @NotNull String str11, boolean z, boolean z2, @NotNull String str12) {
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
        return new DexInfo(str, str2, str3, str4, str5, str6, str7, str8, str9, i, i2, str10, str11, z, z2, str12);
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
        if (!(obj instanceof DexInfo)) {
            return false;
        }
        DexInfo dexInfo = (DexInfo) obj;
        return Intrinsics.EZpvd((Object) this.uniqueId, (Object) dexInfo.uniqueId) && Intrinsics.EZpvd((Object) this.chainIndex, (Object) dexInfo.chainIndex) && Intrinsics.EZpvd((Object) this.chainName, (Object) dexInfo.chainName) && Intrinsics.EZpvd((Object) this.chainLogo, (Object) dexInfo.chainLogo) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) dexInfo.tokenAddress) && Intrinsics.EZpvd((Object) this.price, (Object) dexInfo.price) && Intrinsics.EZpvd((Object) this.liquidity, (Object) dexInfo.liquidity) && Intrinsics.EZpvd((Object) this.marketCap, (Object) dexInfo.marketCap) && Intrinsics.EZpvd((Object) this.riskLevel, (Object) dexInfo.riskLevel) && this.balanceTag == dexInfo.balanceTag && this.decimal == dexInfo.decimal && Intrinsics.EZpvd((Object) this.balance, (Object) dexInfo.balance) && Intrinsics.EZpvd((Object) this.balanceUsd, (Object) dexInfo.balanceUsd) && this.communityRecognized == dexInfo.communityRecognized && this.cexListing == dexInfo.cexListing && Intrinsics.EZpvd((Object) this.cefiId, (Object) dexInfo.cefiId);
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
    public final String getCefiId() {
        return this.cefiId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getCexListing() {
        return this.cexListing;
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
        return (((((((((((((((((((((((((((((this.uniqueId.hashCode() * 31) + this.chainIndex.hashCode()) * 31) + this.chainName.hashCode()) * 31) + this.chainLogo.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + this.price.hashCode()) * 31) + this.liquidity.hashCode()) * 31) + this.marketCap.hashCode()) * 31) + this.riskLevel.hashCode()) * 31) + Integer.hashCode(this.balanceTag)) * 31) + Integer.hashCode(this.decimal)) * 31) + this.balance.hashCode()) * 31) + this.balanceUsd.hashCode()) * 31) + Boolean.hashCode(this.communityRecognized)) * 31) + Boolean.hashCode(this.cexListing)) * 31) + this.cefiId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexInfo(uniqueId=" + this.uniqueId + ", chainIndex=" + this.chainIndex + ", chainName=" + this.chainName + ", chainLogo=" + this.chainLogo + ", tokenAddress=" + this.tokenAddress + ", price=" + this.price + ", liquidity=" + this.liquidity + ", marketCap=" + this.marketCap + ", riskLevel=" + this.riskLevel + ", balanceTag=" + this.balanceTag + ", decimal=" + this.decimal + ", balance=" + this.balance + ", balanceUsd=" + this.balanceUsd + ", communityRecognized=" + this.communityRecognized + ", cexListing=" + this.cexListing + ", cefiId=" + this.cefiId + ")";
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
        parcel.writeInt(this.balanceTag);
        parcel.writeInt(this.decimal);
        parcel.writeString(this.balance);
        parcel.writeString(this.balanceUsd);
        parcel.writeInt(this.communityRecognized ? 1 : 0);
        parcel.writeInt(this.cexListing ? 1 : 0);
        parcel.writeString(this.cefiId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.experience.DexInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DexInfo> serializer() {
            return DexInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DexInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i2, int i3, String str10, String str11, boolean z, boolean z2, String str12, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.chainLogo = "";
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
            this.liquidity = "";
        } else {
            this.liquidity = str7;
        }
        if ((i & 128) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str8;
        }
        if ((i & 256) == 0) {
            this.riskLevel = "";
        } else {
            this.riskLevel = str9;
        }
        this.balanceTag = (i & 512) == 0 ? 2 : i2;
        if ((i & 1024) == 0) {
            this.decimal = 0;
        } else {
            this.decimal = i3;
        }
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
        if ((i & 16384) == 0) {
            this.cexListing = false;
        } else {
            this.cexListing = z2;
        }
        if ((i & 32768) == 0) {
            this.cefiId = "";
        } else {
            this.cefiId = str12;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(DexInfo dexInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) dexInfo.uniqueId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dexInfo.uniqueId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) dexInfo.chainIndex, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, dexInfo.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) dexInfo.chainName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, dexInfo.chainName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) dexInfo.chainLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, dexInfo.chainLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) dexInfo.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, dexInfo.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) dexInfo.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, dexInfo.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) dexInfo.liquidity, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, dexInfo.liquidity);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) dexInfo.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, dexInfo.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) dexInfo.riskLevel, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, dexInfo.riskLevel);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || dexInfo.balanceTag != 2) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, dexInfo.balanceTag);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || dexInfo.decimal != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, dexInfo.decimal);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) dexInfo.balance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, dexInfo.balance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) dexInfo.balanceUsd, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, dexInfo.balanceUsd);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || dexInfo.communityRecognized) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, dexInfo.communityRecognized);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || dexInfo.cexListing) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 14, dexInfo.cexListing);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && Intrinsics.EZpvd((Object) dexInfo.cefiId, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 15, dexInfo.cefiId);
    }

    public DexInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, int i, int i2, @NotNull String str10, @NotNull String str11, boolean z, boolean z2, @NotNull String str12) {
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
        this.uniqueId = str;
        this.chainIndex = str2;
        this.chainName = str3;
        this.chainLogo = str4;
        this.tokenAddress = str5;
        this.price = str6;
        this.liquidity = str7;
        this.marketCap = str8;
        this.riskLevel = str9;
        this.balanceTag = i;
        this.decimal = i2;
        this.balance = str10;
        this.balanceUsd = str11;
        this.communityRecognized = z;
        this.cexListing = z2;
        this.cefiId = str12;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ac: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004c: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (2 int) : (r27v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0054: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r28v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x006c: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0076: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r32v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0081: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void (m)] (LINE:141) call: com.okinc.okpaymentapi.data.remote.model.experience.DexInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ DexInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, int i2, String str10, String str11, boolean z, boolean z2, String str12, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? "" : str5, (i3 & 32) != 0 ? "" : str6, (i3 & 64) != 0 ? "" : str7, (i3 & 128) != 0 ? "" : str8, (i3 & 256) != 0 ? "" : str9, (i3 & 512) != 0 ? 2 : i, (i3 & 1024) != 0 ? 0 : i2, (i3 & 2048) != 0 ? "" : str10, (i3 & 4096) != 0 ? "" : str11, (i3 & 8192) != 0 ? false : z, (i3 & 16384) != 0 ? false : z2, (i3 & 32768) != 0 ? "" : str12);
    }
}
