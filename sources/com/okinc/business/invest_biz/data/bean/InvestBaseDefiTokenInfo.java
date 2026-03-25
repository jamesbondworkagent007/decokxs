package com.okinc.business.invest_biz.data.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
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
public final class InvestBaseDefiTokenInfo implements Parcelable {
    public static final int $stable = 0;
    private final String coinAmount;
    private final String currencyAmount;
    private final String network;
    private final String overflowCoinAmount;
    private final String overflowCurrencyAmount;
    private final String tokenAddress;
    private final String tokenLogo;
    private final String tokenPrecision;
    private final String tokenSymbol;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<InvestBaseDefiTokenInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<InvestBaseDefiTokenInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestBaseDefiTokenInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InvestBaseDefiTokenInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InvestBaseDefiTokenInfo[] newArray(int i) {
            return new InvestBaseDefiTokenInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public InvestBaseDefiTokenInfo() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenLogo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.tokenPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.overflowCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.overflowCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InvestBaseDefiTokenInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        return new InvestBaseDefiTokenInfo(str, str2, str3, str4, str5, str6, str7, str8, str9);
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
        if (!(obj instanceof InvestBaseDefiTokenInfo)) {
            return false;
        }
        InvestBaseDefiTokenInfo investBaseDefiTokenInfo = (InvestBaseDefiTokenInfo) obj;
        return Intrinsics.EZpvd((Object) this.coinAmount, (Object) investBaseDefiTokenInfo.coinAmount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) investBaseDefiTokenInfo.currencyAmount) && Intrinsics.EZpvd((Object) this.tokenLogo, (Object) investBaseDefiTokenInfo.tokenLogo) && Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) investBaseDefiTokenInfo.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) investBaseDefiTokenInfo.tokenAddress) && Intrinsics.EZpvd((Object) this.tokenPrecision, (Object) investBaseDefiTokenInfo.tokenPrecision) && Intrinsics.EZpvd((Object) this.network, (Object) investBaseDefiTokenInfo.network) && Intrinsics.EZpvd((Object) this.overflowCoinAmount, (Object) investBaseDefiTokenInfo.overflowCoinAmount) && Intrinsics.EZpvd((Object) this.overflowCurrencyAmount, (Object) investBaseDefiTokenInfo.overflowCurrencyAmount);
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
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOverflowCoinAmount() {
        return this.overflowCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOverflowCurrencyAmount() {
        return this.overflowCurrencyAmount;
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
    public final String getTokenPrecision() {
        return this.tokenPrecision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenSymbol() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.coinAmount;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.currencyAmount;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.tokenLogo;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.tokenSymbol;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.tokenAddress;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.tokenPrecision;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.network;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.overflowCoinAmount;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.overflowCurrencyAmount;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str9 != null ? str9.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InvestBaseDefiTokenInfo(coinAmount=" + this.coinAmount + ", currencyAmount=" + this.currencyAmount + ", tokenLogo=" + this.tokenLogo + ", tokenSymbol=" + this.tokenSymbol + ", tokenAddress=" + this.tokenAddress + ", tokenPrecision=" + this.tokenPrecision + ", network=" + this.network + ", overflowCoinAmount=" + this.overflowCoinAmount + ", overflowCurrencyAmount=" + this.overflowCurrencyAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.currencyAmount);
        parcel.writeString(this.tokenLogo);
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.tokenPrecision);
        parcel.writeString(this.network);
        parcel.writeString(this.overflowCoinAmount);
        parcel.writeString(this.overflowCurrencyAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InvestBaseDefiTokenInfo> serializer() {
            return InvestBaseDefiTokenInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InvestBaseDefiTokenInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.coinAmount = null;
        } else {
            this.coinAmount = str;
        }
        if ((i & 2) == 0) {
            this.currencyAmount = null;
        } else {
            this.currencyAmount = str2;
        }
        if ((i & 4) == 0) {
            this.tokenLogo = null;
        } else {
            this.tokenLogo = str3;
        }
        if ((i & 8) == 0) {
            this.tokenSymbol = null;
        } else {
            this.tokenSymbol = str4;
        }
        if ((i & 16) == 0) {
            this.tokenAddress = null;
        } else {
            this.tokenAddress = str5;
        }
        if ((i & 32) == 0) {
            this.tokenPrecision = null;
        } else {
            this.tokenPrecision = str6;
        }
        if ((i & 64) == 0) {
            this.network = null;
        } else {
            this.network = str7;
        }
        if ((i & 128) == 0) {
            this.overflowCoinAmount = null;
        } else {
            this.overflowCoinAmount = str8;
        }
        if ((i & 256) == 0) {
            this.overflowCurrencyAmount = null;
        } else {
            this.overflowCurrencyAmount = str9;
        }
    }

    public static final /* synthetic */ void write$Self$OKDeFi_invest_biz(InvestBaseDefiTokenInfo investBaseDefiTokenInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || investBaseDefiTokenInfo.coinAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, investBaseDefiTokenInfo.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || investBaseDefiTokenInfo.currencyAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, investBaseDefiTokenInfo.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || investBaseDefiTokenInfo.tokenLogo != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, investBaseDefiTokenInfo.tokenLogo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || investBaseDefiTokenInfo.tokenSymbol != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, investBaseDefiTokenInfo.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || investBaseDefiTokenInfo.tokenAddress != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, investBaseDefiTokenInfo.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || investBaseDefiTokenInfo.tokenPrecision != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, investBaseDefiTokenInfo.tokenPrecision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || investBaseDefiTokenInfo.network != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, investBaseDefiTokenInfo.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || investBaseDefiTokenInfo.overflowCoinAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, investBaseDefiTokenInfo.overflowCoinAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && investBaseDefiTokenInfo.overflowCurrencyAmount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, investBaseDefiTokenInfo.overflowCurrencyAmount);
    }

    public InvestBaseDefiTokenInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.coinAmount = str;
        this.currencyAmount = str2;
        this.tokenLogo = str3;
        this.tokenSymbol = str4;
        this.tokenAddress = str5;
        this.tokenPrecision = str6;
        this.network = str7;
        this.overflowCoinAmount = str8;
        this.overflowCurrencyAmount = str9;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0054: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:259) call: com.okinc.business.invest_biz.data.bean.InvestBaseDefiTokenInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ InvestBaseDefiTokenInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) == 0 ? str9 : null);
    }
}
