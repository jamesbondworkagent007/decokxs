package com.okinc.business.invest_biz.data.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestTokenWithMarketCap implements Parcelable {
    public static final int $stable = 0;
    private final long chainId;
    private final String deployAddress;
    private final String deployAddressUrl;
    private final boolean isBaseToken;
    private final String marketCap;
    private final String network;
    private final String price;
    private final String tokenAddress;
    private final String tokenLogo;
    private final String tokenName;
    private final String tokenPrecision;
    private final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestTokenWithMarketCap> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestTokenWithMarketCap> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTokenWithMarketCap createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestTokenWithMarketCap(parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestTokenWithMarketCap[] newArray(int i) {
            return new InvestTokenWithMarketCap[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestTokenWithMarketCap() {
        this(0L, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 4095, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.deployAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.deployAddressUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isBaseToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.tokenPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestTokenWithMarketCap copy(long j, boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        return new InvestTokenWithMarketCap(j, z, str, str2, str3, str4, str5, str6, str7, str8, str9, str10);
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
        if (!(obj instanceof InvestTokenWithMarketCap)) {
            return false;
        }
        InvestTokenWithMarketCap investTokenWithMarketCap = (InvestTokenWithMarketCap) obj;
        return this.chainId == investTokenWithMarketCap.chainId && this.isBaseToken == investTokenWithMarketCap.isBaseToken && Intrinsics.EZpvd((Object) this.marketCap, (Object) investTokenWithMarketCap.marketCap) && Intrinsics.EZpvd((Object) this.network, (Object) investTokenWithMarketCap.network) && Intrinsics.EZpvd((Object) this.price, (Object) investTokenWithMarketCap.price) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) investTokenWithMarketCap.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) investTokenWithMarketCap.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenName, (Object) investTokenWithMarketCap.tokenName) && Intrinsics.EZpvd((Object) this.tokenPrecision, (Object) investTokenWithMarketCap.tokenPrecision) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) investTokenWithMarketCap.tokenSymbol) && Intrinsics.EZpvd((Object) this.deployAddress, (Object) investTokenWithMarketCap.deployAddress) && Intrinsics.EZpvd((Object) this.deployAddressUrl, (Object) investTokenWithMarketCap.deployAddressUrl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeployAddress() {
        return this.deployAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeployAddressUrl() {
        return this.deployAddressUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketCap() {
        return this.marketCap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenLogo() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenPrecision() {
        return this.tokenPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((Long.hashCode(this.chainId) * 31) + Boolean.hashCode(this.isBaseToken)) * 31) + this.marketCap.hashCode()) * 31) + this.network.hashCode()) * 31) + this.price.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + this.tokenLogo.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenPrecision.hashCode()) * 31) + this.tokenSymbol.hashCode()) * 31) + this.deployAddress.hashCode()) * 31) + this.deployAddressUrl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBaseToken() {
        return this.isBaseToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestTokenWithMarketCap(chainId=" + this.chainId + ", isBaseToken=" + this.isBaseToken + ", marketCap=" + this.marketCap + ", network=" + this.network + ", price=" + this.price + ", tokenAddress=" + this.tokenAddress + ", tokenLogo=" + this.tokenLogo + ", tokenName=" + this.tokenName + ", tokenPrecision=" + this.tokenPrecision + ", tokenSymbol=" + this.tokenSymbol + ", deployAddress=" + this.deployAddress + ", deployAddressUrl=" + this.deployAddressUrl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainId);
        parcel.writeInt(this.isBaseToken ? 1 : 0);
        parcel.writeString(this.marketCap);
        parcel.writeString(this.network);
        parcel.writeString(this.price);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.tokenLogo);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenPrecision);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.deployAddress);
        parcel.writeString(this.deployAddressUrl);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestTokenWithMarketCap.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestTokenWithMarketCap> serializer() {
            return InvestTokenWithMarketCap$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestTokenWithMarketCap(int i, long j, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.isBaseToken = false;
        } else {
            this.isBaseToken = z;
        }
        if ((i & 4) == 0) {
            this.marketCap = "";
        } else {
            this.marketCap = str;
        }
        if ((i & 8) == 0) {
            this.network = "";
        } else {
            this.network = str2;
        }
        if ((i & 16) == 0) {
            this.price = "";
        } else {
            this.price = str3;
        }
        if ((i & 32) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str4;
        }
        if ((i & 64) == 0) {
            this.tokenLogo = "";
        } else {
            this.tokenLogo = str5;
        }
        if ((i & 128) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str6;
        }
        if ((i & 256) == 0) {
            this.tokenPrecision = "";
        } else {
            this.tokenPrecision = str7;
        }
        if ((i & 512) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str8;
        }
        if ((i & 1024) == 0) {
            this.deployAddress = "";
        } else {
            this.deployAddress = str9;
        }
        if ((i & 2048) == 0) {
            this.deployAddressUrl = "";
        } else {
            this.deployAddressUrl = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestTokenWithMarketCap investTokenWithMarketCap, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investTokenWithMarketCap.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, investTokenWithMarketCap.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investTokenWithMarketCap.isBaseToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, investTokenWithMarketCap.isBaseToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investTokenWithMarketCap.marketCap, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investTokenWithMarketCap.marketCap);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investTokenWithMarketCap.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investTokenWithMarketCap.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investTokenWithMarketCap.price, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, investTokenWithMarketCap.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) investTokenWithMarketCap.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, investTokenWithMarketCap.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investTokenWithMarketCap.tokenLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investTokenWithMarketCap.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) investTokenWithMarketCap.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, investTokenWithMarketCap.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) investTokenWithMarketCap.tokenPrecision, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, investTokenWithMarketCap.tokenPrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) investTokenWithMarketCap.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, investTokenWithMarketCap.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) investTokenWithMarketCap.deployAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, investTokenWithMarketCap.deployAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) && Intrinsics.EZpvd((Object) investTokenWithMarketCap.deployAddressUrl, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 11, investTokenWithMarketCap.deployAddressUrl);
    }

    public InvestTokenWithMarketCap(long j, boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10) {
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
        this.chainId = j;
        this.isBaseToken = z;
        this.marketCap = str;
        this.network = str2;
        this.price = str3;
        this.tokenAddress = str4;
        this.tokenLogo = str5;
        this.tokenName = str6;
        this.tokenPrecision = str7;
        this.tokenSymbol = str8;
        this.deployAddress = str9;
        this.deployAddressUrl = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007c: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r15v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r17v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (""))
 A[MD:(long, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:417) call: com.okinc.business.invest_biz.data.bean.InvestTokenWithMarketCap.<init>(long, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestTokenWithMarketCap(long j, boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) != 0 ? "" : str6, (i & 256) != 0 ? "" : str7, (i & 512) != 0 ? "" : str8, (i & 1024) != 0 ? "" : str9, (i & 2048) == 0 ? str10 : "");
    }
}
