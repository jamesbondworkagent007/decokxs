package com.okinc.business.defi.biz.net.bean;

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

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class TokenInfoResp implements Parcelable {
    private String blockChain;
    private String contractAddress;
    private String logo;
    private String name;
    private int precision;
    private String symbol;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TokenInfoResp> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TokenInfoResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenInfoResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TokenInfoResp(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TokenInfoResp[] newArray(int i) {
            return new TokenInfoResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TokenInfoResp() {
        this((String) null, (String) null, (String) null, 0, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TokenInfoResp copy$default(TokenInfoResp tokenInfoResp, String str, String str2, String str3, int i, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = tokenInfoResp.name;
        }
        if ((i2 & 2) != 0) {
            str2 = tokenInfoResp.symbol;
        }
        String str6 = str2;
        if ((i2 & 4) != 0) {
            str3 = tokenInfoResp.logo;
        }
        String str7 = str3;
        if ((i2 & 8) != 0) {
            i = tokenInfoResp.precision;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = tokenInfoResp.contractAddress;
        }
        String str8 = str4;
        if ((i2 & 32) != 0) {
            str5 = tokenInfoResp.blockChain;
        }
        return tokenInfoResp.copy(str, str6, str7, i3, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component4() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.blockChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TokenInfoResp copy(@NotNull String str, @NotNull String str2, String str3, int i, String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new TokenInfoResp(str, str2, str3, i, str4, str5);
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
        if (!(obj instanceof TokenInfoResp)) {
            return false;
        }
        TokenInfoResp tokenInfoResp = (TokenInfoResp) obj;
        return Intrinsics.EZpvd((Object) this.name, (Object) tokenInfoResp.name) && Intrinsics.EZpvd((Object) this.symbol, (Object) tokenInfoResp.symbol) && Intrinsics.EZpvd((Object) this.logo, (Object) tokenInfoResp.logo) && this.precision == tokenInfoResp.precision && Intrinsics.EZpvd((Object) this.contractAddress, (Object) tokenInfoResp.contractAddress) && Intrinsics.EZpvd((Object) this.blockChain, (Object) tokenInfoResp.blockChain);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBlockChain() {
        return this.blockChain;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContractAddress() {
        return this.contractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogo() {
        return this.logo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPrecision() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.name.hashCode();
        int iHashCode2 = this.symbol.hashCode();
        String str = this.logo;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = Integer.hashCode(this.precision);
        String str2 = this.contractAddress;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.blockChain.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBlockChain(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.blockChain = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setContractAddress(String str) {
        this.contractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogo(String str) {
        this.logo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrecision(int i) {
        this.precision = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TokenInfoResp(name=" + this.name + ", symbol=" + this.symbol + ", logo=" + this.logo + ", precision=" + this.precision + ", contractAddress=" + this.contractAddress + ", blockChain=" + this.blockChain + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.name);
        parcel.writeString(this.symbol);
        parcel.writeString(this.logo);
        parcel.writeInt(this.precision);
        parcel.writeString(this.contractAddress);
        parcel.writeString(this.blockChain);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.TokenInfoResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TokenInfoResp> serializer() {
            return TokenInfoResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TokenInfoResp(int i, String str, String str2, String str3, int i2, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.name = "";
        } else {
            this.name = str;
        }
        if ((i & 2) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str2;
        }
        if ((i & 4) == 0) {
            this.logo = null;
        } else {
            this.logo = str3;
        }
        if ((i & 8) == 0) {
            this.precision = 0;
        } else {
            this.precision = i2;
        }
        if ((i & 16) == 0) {
            this.contractAddress = "";
        } else {
            this.contractAddress = str4;
        }
        if ((i & 32) == 0) {
            this.blockChain = "";
        } else {
            this.blockChain = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(TokenInfoResp tokenInfoResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) tokenInfoResp.name, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, tokenInfoResp.name);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) tokenInfoResp.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, tokenInfoResp.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || tokenInfoResp.logo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, tokenInfoResp.logo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || tokenInfoResp.precision != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, tokenInfoResp.precision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) tokenInfoResp.contractAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, tokenInfoResp.contractAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && Intrinsics.EZpvd((Object) tokenInfoResp.blockChain, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 5, tokenInfoResp.blockChain);
    }

    public TokenInfoResp(@NotNull String str, @NotNull String str2, String str3, int i, String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.name = str;
        this.symbol = str2;
        this.logo = str3;
        this.precision = i;
        this.contractAddress = str4;
        this.blockChain = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:0x0015: TERNARY null = ((wrap:int:0x0010: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:int:0x001b: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r9v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void (m)] (LINE:86) call: com.okinc.business.defi.biz.net.bean.TokenInfoResp.<init>(java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TokenInfoResp(String str, String str2, String str3, int i, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5);
    }
}
