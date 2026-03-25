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
public final class InvestUnderlyingToken implements Parcelable {
    public static final int $stable = 0;
    private final long chainId;
    private final boolean isBaseToken;
    private final String network;
    private final String tokenAddress;
    private final String tokenLogo;
    private final String tokenName;
    private final String tokenPrecision;
    private final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestUnderlyingToken> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestUnderlyingToken> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUnderlyingToken createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestUnderlyingToken(parcel.readLong(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestUnderlyingToken[] newArray(int i) {
            return new InvestUnderlyingToken[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestUnderlyingToken() {
        this(0L, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 255, (DefaultConstructorMarker) null);
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
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.tokenPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestUnderlyingToken copy(long j, boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new InvestUnderlyingToken(j, z, str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof InvestUnderlyingToken)) {
            return false;
        }
        InvestUnderlyingToken investUnderlyingToken = (InvestUnderlyingToken) obj;
        return this.chainId == investUnderlyingToken.chainId && this.isBaseToken == investUnderlyingToken.isBaseToken && Intrinsics.EZpvd((Object) this.network, (Object) investUnderlyingToken.network) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) investUnderlyingToken.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) investUnderlyingToken.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenName, (Object) investUnderlyingToken.tokenName) && Intrinsics.EZpvd((Object) this.tokenPrecision, (Object) investUnderlyingToken.tokenPrecision) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) investUnderlyingToken.tokenSymbol);
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
    public final String getTokenPrecision() {
        return this.tokenPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((Long.hashCode(this.chainId) * 31) + Boolean.hashCode(this.isBaseToken)) * 31) + this.network.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + this.tokenLogo.hashCode()) * 31) + this.tokenName.hashCode()) * 31) + this.tokenPrecision.hashCode()) * 31) + this.tokenSymbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBaseToken() {
        return this.isBaseToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestUnderlyingToken(chainId=" + this.chainId + ", isBaseToken=" + this.isBaseToken + ", network=" + this.network + ", tokenAddress=" + this.tokenAddress + ", tokenLogo=" + this.tokenLogo + ", tokenName=" + this.tokenName + ", tokenPrecision=" + this.tokenPrecision + ", tokenSymbol=" + this.tokenSymbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainId);
        parcel.writeInt(this.isBaseToken ? 1 : 0);
        parcel.writeString(this.network);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.tokenLogo);
        parcel.writeString(this.tokenName);
        parcel.writeString(this.tokenPrecision);
        parcel.writeString(this.tokenSymbol);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestUnderlyingToken.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestUnderlyingToken> serializer() {
            return InvestUnderlyingToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestUnderlyingToken(int i, long j, boolean z, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str2;
        }
        if ((i & 16) == 0) {
            this.tokenLogo = "";
        } else {
            this.tokenLogo = str3;
        }
        if ((i & 32) == 0) {
            this.tokenName = "";
        } else {
            this.tokenName = str4;
        }
        if ((i & 64) == 0) {
            this.tokenPrecision = "";
        } else {
            this.tokenPrecision = str5;
        }
        if ((i & 128) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestUnderlyingToken investUnderlyingToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investUnderlyingToken.chainId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, investUnderlyingToken.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investUnderlyingToken.isBaseToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, investUnderlyingToken.isBaseToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) investUnderlyingToken.network, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, investUnderlyingToken.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) investUnderlyingToken.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, investUnderlyingToken.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) investUnderlyingToken.tokenLogo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, investUnderlyingToken.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) investUnderlyingToken.tokenName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, investUnderlyingToken.tokenName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) investUnderlyingToken.tokenPrecision, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, investUnderlyingToken.tokenPrecision);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) && Intrinsics.EZpvd((Object) investUnderlyingToken.tokenSymbol, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 7, investUnderlyingToken.tokenSymbol);
    }

    public InvestUnderlyingToken(long j, boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.chainId = j;
        this.isBaseToken = z;
        this.network = str;
        this.tokenAddress = str2;
        this.tokenLogo = str3;
        this.tokenName = str4;
        this.tokenPrecision = str5;
        this.tokenSymbol = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004e: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r11v0 long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r13v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001a: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(long, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:361) call: com.okinc.business.invest_biz.data.bean.InvestUnderlyingToken.<init>(long, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestUnderlyingToken(long j, boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? false : z, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? "" : str4, (i & 64) != 0 ? "" : str5, (i & 128) == 0 ? str6 : "");
    }
}
