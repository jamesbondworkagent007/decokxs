package com.okinc.business.invest_biz.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class UnderlyingToken implements Parcelable {
    private final long chainId;
    private final boolean isBaseToken;
    private final String network;
    private String tokenAddress;
    private String tokenLogo;
    private final String tokenName;
    private final int tokenPrecision;
    private String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UnderlyingToken> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<UnderlyingToken> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnderlyingToken createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UnderlyingToken(parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UnderlyingToken[] newArray(int i) {
            return new UnderlyingToken[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public UnderlyingToken() {
        this(0L, false, (String) null, (String) null, 0, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.isBaseToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.tokenPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UnderlyingToken copy(long j, boolean z, @NotNull String str, @NotNull String str2, int i, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new UnderlyingToken(j, z, str, str2, i, str3, str4, str5);
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
        if (!(obj instanceof UnderlyingToken)) {
            return false;
        }
        UnderlyingToken underlyingToken = (UnderlyingToken) obj;
        return this.chainId == underlyingToken.chainId && this.isBaseToken == underlyingToken.isBaseToken && Intrinsics.EZpvd((Object) this.network, (Object) underlyingToken.network) && Intrinsics.EZpvd((Object) this.tokenName, (Object) underlyingToken.tokenName) && this.tokenPrecision == underlyingToken.tokenPrecision && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) underlyingToken.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) underlyingToken.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) underlyingToken.tokenLogo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
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
    public final int getTokenPrecision() {
        return this.tokenPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Long.hashCode(this.chainId);
        int iHashCode2 = Boolean.hashCode(this.isBaseToken);
        int iHashCode3 = this.network.hashCode();
        int iHashCode4 = this.tokenName.hashCode();
        int iHashCode5 = Integer.hashCode(this.tokenPrecision);
        String str = this.tokenSymbol;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        String str2 = this.tokenAddress;
        int iHashCode7 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tokenLogo;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBaseToken() {
        return this.isBaseToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenAddress(String str) {
        this.tokenAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenLogo(String str) {
        this.tokenLogo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenSymbol(String str) {
        this.tokenSymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UnderlyingToken(chainId=" + this.chainId + ", isBaseToken=" + this.isBaseToken + ", network=" + this.network + ", tokenName=" + this.tokenName + ", tokenPrecision=" + this.tokenPrecision + ", tokenSymbol=" + this.tokenSymbol + ", tokenAddress=" + this.tokenAddress + ", tokenLogo=" + this.tokenLogo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainId);
        parcel.writeInt(this.isBaseToken ? 1 : 0);
        parcel.writeString(this.network);
        parcel.writeString(this.tokenName);
        parcel.writeInt(this.tokenPrecision);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.tokenLogo);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.models.UnderlyingToken.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UnderlyingToken> serializer() {
            return UnderlyingToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UnderlyingToken(int i, long j, boolean z, String str, String str2, int i2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        this.chainId = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.isBaseToken = false;
        } else {
            this.isBaseToken = z;
        }
        if ((i & 4) == 0) {
            this.network = "";
        } else {
            this.network = str;
        }
        if ((i & 8) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str2;
        }
        if ((i & 16) == 0) {
            this.tokenPrecision = 0;
        } else {
            this.tokenPrecision = i2;
        }
        if ((i & 32) == 0) {
            this.tokenSymbol = null;
        } else {
            this.tokenSymbol = str3;
        }
        if ((i & 64) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str4;
        }
        if ((i & 128) == 0) {
            this.tokenLogo = null;
        } else {
            this.tokenLogo = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(UnderlyingToken underlyingToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || underlyingToken.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, underlyingToken.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || underlyingToken.isBaseToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, underlyingToken.isBaseToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) underlyingToken.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, underlyingToken.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) underlyingToken.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, underlyingToken.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || underlyingToken.tokenPrecision != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 4, underlyingToken.tokenPrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || underlyingToken.tokenSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, underlyingToken.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || underlyingToken.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, underlyingToken.tokenAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && underlyingToken.tokenLogo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, underlyingToken.tokenLogo);
    }

    public UnderlyingToken(long j, boolean z, @NotNull String str, @NotNull String str2, int i, String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.chainId = j;
        this.isBaseToken = z;
        this.network = str;
        this.tokenName = str2;
        this.tokenPrecision = i;
        this.tokenSymbol = str3;
        this.tokenAddress = str4;
        this.tokenLogo = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004e: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r11v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r20v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0021: ARITH (r20v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r16v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(long, boolean, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.business.invest_biz.data.models.UnderlyingToken.<init>(long, boolean, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ UnderlyingToken(long j, boolean z, String str, String str2, int i, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? "" : str, (i2 & 8) == 0 ? str2 : "", (i2 & 16) == 0 ? i : 0, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) == 0 ? str5 : null);
    }
}
