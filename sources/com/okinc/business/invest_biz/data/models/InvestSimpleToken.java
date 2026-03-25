package com.okinc.business.invest_biz.data.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class InvestSimpleToken implements Parcelable {
    public static final int $stable = 0;
    private final Long chainId;
    private final String coinAmount;
    private final String currencyAmount;
    private final String expectTokenAddress;
    private final String tokenAddress;
    private final String tokenId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestSimpleToken> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestSimpleToken> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestSimpleToken createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestSimpleToken(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestSimpleToken[] newArray(int i) {
            return new InvestSimpleToken[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestSimpleToken() {
        this((Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, 63, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InvestSimpleToken copy$default(InvestSimpleToken investSimpleToken, Long l, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            l = investSimpleToken.chainId;
        }
        if ((i & 2) != 0) {
            str = investSimpleToken.coinAmount;
        }
        String str6 = str;
        if ((i & 4) != 0) {
            str2 = investSimpleToken.currencyAmount;
        }
        String str7 = str2;
        if ((i & 8) != 0) {
            str3 = investSimpleToken.tokenAddress;
        }
        String str8 = str3;
        if ((i & 16) != 0) {
            str4 = investSimpleToken.expectTokenAddress;
        }
        String str9 = str4;
        if ((i & 32) != 0) {
            str5 = investSimpleToken.tokenId;
        }
        return investSimpleToken.copy(l, str6, str7, str8, str9, str5);
    }

    @SerialName("chainId")
    public static /* synthetic */ void getChainId$annotations() {
    }

    @SerialName("coinAmount")
    public static /* synthetic */ void getCoinAmount$annotations() {
    }

    @SerialName("currencyAmount")
    public static /* synthetic */ void getCurrencyAmount$annotations() {
    }

    @SerialName("expectTokenAddress")
    public static /* synthetic */ void getExpectTokenAddress$annotations() {
    }

    @SerialName("tokenAddress")
    public static /* synthetic */ void getTokenAddress$annotations() {
    }

    @SerialName("tokenId")
    public static /* synthetic */ void getTokenId$annotations() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component1() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.expectTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestSimpleToken copy(Long l, String str, String str2, String str3, String str4, String str5) {
        return new InvestSimpleToken(l, str, str2, str3, str4, str5);
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
        if (!(obj instanceof InvestSimpleToken)) {
            return false;
        }
        InvestSimpleToken investSimpleToken = (InvestSimpleToken) obj;
        return Intrinsics.EZpvd(this.chainId, investSimpleToken.chainId) && Intrinsics.EZpvd((Object) this.coinAmount, (Object) investSimpleToken.coinAmount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) investSimpleToken.currencyAmount) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) investSimpleToken.tokenAddress) && Intrinsics.EZpvd((Object) this.expectTokenAddress, (Object) investSimpleToken.expectTokenAddress) && Intrinsics.EZpvd((Object) this.tokenId, (Object) investSimpleToken.tokenId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getExpectTokenAddress() {
        return this.expectTokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenId() {
        return this.tokenId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Long l = this.chainId;
        int iHashCode = l == null ? 0 : l.hashCode();
        String str = this.coinAmount;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.currencyAmount;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tokenAddress;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.expectTokenAddress;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tokenId;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str5 != null ? str5.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestSimpleToken(chainId=" + this.chainId + ", coinAmount=" + this.coinAmount + ", currencyAmount=" + this.currencyAmount + ", tokenAddress=" + this.tokenAddress + ", expectTokenAddress=" + this.expectTokenAddress + ", tokenId=" + this.tokenId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Long l = this.chainId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.currencyAmount);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.expectTokenAddress);
        parcel.writeString(this.tokenId);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.models.InvestSimpleToken.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestSimpleToken> serializer() {
            return InvestSimpleToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestSimpleToken(int i, Long l, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.chainId = null;
        } else {
            this.chainId = l;
        }
        if ((i & 2) == 0) {
            this.coinAmount = null;
        } else {
            this.coinAmount = str;
        }
        if ((i & 4) == 0) {
            this.currencyAmount = null;
        } else {
            this.currencyAmount = str2;
        }
        if ((i & 8) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str3;
        }
        if ((i & 16) == 0) {
            this.expectTokenAddress = null;
        } else {
            this.expectTokenAddress = str4;
        }
        if ((i & 32) == 0) {
            this.tokenId = null;
        } else {
            this.tokenId = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestSimpleToken investSimpleToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investSimpleToken.chainId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, LongSerializer.INSTANCE, investSimpleToken.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investSimpleToken.coinAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investSimpleToken.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investSimpleToken.currencyAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investSimpleToken.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investSimpleToken.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investSimpleToken.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investSimpleToken.expectTokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investSimpleToken.expectTokenAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) && investSimpleToken.tokenId == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, investSimpleToken.tokenId);
    }

    public InvestSimpleToken(Long l, String str, String str2, String str3, String str4, String str5) {
        this.chainId = l;
        this.coinAmount = str;
        this.currencyAmount = str2;
        this.tokenAddress = str3;
        this.expectTokenAddress = str4;
        this.tokenId = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0031: CONSTRUCTOR 
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r6v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r12v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
 A[MD:(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.business.invest_biz.data.models.InvestSimpleToken.<init>(java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestSimpleToken(Long l, String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : l, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5);
    }
}
