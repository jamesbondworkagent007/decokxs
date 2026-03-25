package com.okinc.business.defi.api.bean;

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

/* JADX INFO: loaded from: classes3.dex */
@Serializable
public final class FromToken implements Parcelable {
    private String amount;
    private String formatAmount;
    private String imageUrl;
    private boolean isNativeToken;
    private String minAmount;
    private String symbol;
    private String tokenContractAddress;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<FromToken> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<FromToken> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FromToken createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FromToken(parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FromToken[] newArray(int i) {
            return new FromToken[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FromToken() {
        this(false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FromToken copy$default(FromToken fromToken, boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            z = fromToken.isNativeToken;
        }
        if ((i & 2) != 0) {
            str = fromToken.tokenContractAddress;
        }
        String str7 = str;
        if ((i & 4) != 0) {
            str2 = fromToken.amount;
        }
        String str8 = str2;
        if ((i & 8) != 0) {
            str3 = fromToken.minAmount;
        }
        String str9 = str3;
        if ((i & 16) != 0) {
            str4 = fromToken.imageUrl;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = fromToken.formatAmount;
        }
        String str11 = str5;
        if ((i & 64) != 0) {
            str6 = fromToken.symbol;
        }
        return fromToken.copy(z, str7, str8, str9, str10, str11, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.formatAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FromToken copy(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new FromToken(z, str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof FromToken)) {
            return false;
        }
        FromToken fromToken = (FromToken) obj;
        return this.isNativeToken == fromToken.isNativeToken && Intrinsics.EZpvd((Object) this.tokenContractAddress, (Object) fromToken.tokenContractAddress) && Intrinsics.EZpvd((Object) this.amount, (Object) fromToken.amount) && Intrinsics.EZpvd((Object) this.minAmount, (Object) fromToken.minAmount) && Intrinsics.EZpvd((Object) this.imageUrl, (Object) fromToken.imageUrl) && Intrinsics.EZpvd((Object) this.formatAmount, (Object) fromToken.formatAmount) && Intrinsics.EZpvd((Object) this.symbol, (Object) fromToken.symbol);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAmount() {
        return this.amount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFormatAmount() {
        return this.formatAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAmount() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenContractAddress() {
        return this.tokenContractAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.isNativeToken) * 31) + this.tokenContractAddress.hashCode()) * 31) + this.amount.hashCode()) * 31) + this.minAmount.hashCode()) * 31) + this.imageUrl.hashCode()) * 31) + this.formatAmount.hashCode()) * 31) + this.symbol.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isNativeToken() {
        return this.isNativeToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.amount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFormatAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.formatAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setImageUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.imageUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNativeToken(boolean z) {
        this.isNativeToken = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTokenContractAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.tokenContractAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FromToken(isNativeToken=" + this.isNativeToken + ", tokenContractAddress=" + this.tokenContractAddress + ", amount=" + this.amount + ", minAmount=" + this.minAmount + ", imageUrl=" + this.imageUrl + ", formatAmount=" + this.formatAmount + ", symbol=" + this.symbol + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isNativeToken ? 1 : 0);
        parcel.writeString(this.tokenContractAddress);
        parcel.writeString(this.amount);
        parcel.writeString(this.minAmount);
        parcel.writeString(this.imageUrl);
        parcel.writeString(this.formatAmount);
        parcel.writeString(this.symbol);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.FromToken.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<FromToken> serializer() {
            return FromToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ FromToken(int i, boolean z, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        this.isNativeToken = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.tokenContractAddress = "";
        } else {
            this.tokenContractAddress = str;
        }
        if ((i & 4) == 0) {
            this.amount = "";
        } else {
            this.amount = str2;
        }
        if ((i & 8) == 0) {
            this.minAmount = "";
        } else {
            this.minAmount = str3;
        }
        if ((i & 16) == 0) {
            this.imageUrl = "";
        } else {
            this.imageUrl = str4;
        }
        if ((i & 32) == 0) {
            this.formatAmount = "";
        } else {
            this.formatAmount = str5;
        }
        if ((i & 64) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str6;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(FromToken fromToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || fromToken.isNativeToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 0, fromToken.isNativeToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) fromToken.tokenContractAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fromToken.tokenContractAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) fromToken.amount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, fromToken.amount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) fromToken.minAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, fromToken.minAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) fromToken.imageUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, fromToken.imageUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) fromToken.formatAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, fromToken.formatAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && Intrinsics.EZpvd((Object) fromToken.symbol, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 6, fromToken.symbol);
    }

    public FromToken(boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.isNativeToken = z;
        this.tokenContractAddress = str;
        this.amount = str2;
        this.minAmount = str3;
        this.imageUrl = str4;
        this.formatAmount = str5;
        this.symbol = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0038: CONSTRUCTOR 
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r13v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r12v0 java.lang.String) : (""))
 A[MD:(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:275) call: com.okinc.business.defi.api.bean.FromToken.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ FromToken(boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) == 0 ? str6 : "");
    }
}
