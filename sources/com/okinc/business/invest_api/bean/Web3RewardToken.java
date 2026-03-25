package com.okinc.business.invest_api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class Web3RewardToken implements Parcelable {
    public static final int $stable = 0;
    public final String apy;
    public final Long chainIndex;
    public final String decimal;
    public final String network;
    public final String pendingCurrencyAmount;
    public final String pendingTokenAmount;
    public final String tokenAddress;
    public final String tokenSymbol;
    public final String totalTokenAmount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<Web3RewardToken> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Web3RewardToken> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Web3RewardToken createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Web3RewardToken(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Web3RewardToken[] newArray(int i) {
            return new Web3RewardToken[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public Web3RewardToken() {
        this((String) null, (String) null, (String) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, FrameMetricsAggregator.EVERY_DURATION, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.apy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.tokenSymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.pendingCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.pendingTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.decimal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Web3RewardToken copydefault(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8) {
        return new Web3RewardToken(str, str2, str3, l, str4, str5, str6, str7, str8);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long copydefault() {
        return this.chainIndex;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.totalTokenAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Web3RewardToken)) {
            return false;
        }
        Web3RewardToken web3RewardToken = (Web3RewardToken) obj;
        return Intrinsics.EZpvd((Object) this.tokenSymbol, (Object) web3RewardToken.tokenSymbol) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) web3RewardToken.tokenAddress) && Intrinsics.EZpvd((Object) this.network, (Object) web3RewardToken.network) && Intrinsics.EZpvd(this.chainIndex, web3RewardToken.chainIndex) && Intrinsics.EZpvd((Object) this.apy, (Object) web3RewardToken.apy) && Intrinsics.EZpvd((Object) this.totalTokenAmount, (Object) web3RewardToken.totalTokenAmount) && Intrinsics.EZpvd((Object) this.pendingTokenAmount, (Object) web3RewardToken.pendingTokenAmount) && Intrinsics.EZpvd((Object) this.decimal, (Object) web3RewardToken.decimal) && Intrinsics.EZpvd((Object) this.pendingCurrencyAmount, (Object) web3RewardToken.pendingCurrencyAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.tokenSymbol;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.tokenAddress;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.network;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Long l = this.chainIndex;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        String str4 = this.apy;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.totalTokenAmount;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.pendingTokenAmount;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.decimal;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.pendingCurrencyAmount;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str8 != null ? str8.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Web3RewardToken(tokenSymbol=" + this.tokenSymbol + ", tokenAddress=" + this.tokenAddress + ", network=" + this.network + ", chainIndex=" + this.chainIndex + ", apy=" + this.apy + ", totalTokenAmount=" + this.totalTokenAmount + ", pendingTokenAmount=" + this.pendingTokenAmount + ", decimal=" + this.decimal + ", pendingCurrencyAmount=" + this.pendingCurrencyAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tokenSymbol);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.network);
        Long l = this.chainIndex;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.apy);
        parcel.writeString(this.totalTokenAmount);
        parcel.writeString(this.pendingTokenAmount);
        parcel.writeString(this.decimal);
        parcel.writeString(this.pendingCurrencyAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_api.bean.Web3RewardToken.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Web3RewardToken> serializer() {
            return Web3RewardToken$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ Web3RewardToken(int i, String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.tokenSymbol = "";
        } else {
            this.tokenSymbol = str;
        }
        if ((i & 2) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str2;
        }
        if ((i & 4) == 0) {
            this.network = "";
        } else {
            this.network = str3;
        }
        if ((i & 8) == 0) {
            this.chainIndex = Long.MIN_VALUE;
        } else {
            this.chainIndex = l;
        }
        if ((i & 16) == 0) {
            this.apy = "";
        } else {
            this.apy = str4;
        }
        if ((i & 32) == 0) {
            this.totalTokenAmount = "";
        } else {
            this.totalTokenAmount = str5;
        }
        if ((i & 64) == 0) {
            this.pendingTokenAmount = "";
        } else {
            this.pendingTokenAmount = str6;
        }
        if ((i & 128) == 0) {
            this.decimal = "";
        } else {
            this.decimal = str7;
        }
        if ((i & 256) == 0) {
            this.pendingCurrencyAmount = "";
        } else {
            this.pendingCurrencyAmount = str8;
        }
    }

    public static final /* synthetic */ void OLrzqt(Web3RewardToken web3RewardToken, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Long l;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) web3RewardToken.tokenSymbol, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, web3RewardToken.tokenSymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) web3RewardToken.tokenAddress, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, web3RewardToken.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) web3RewardToken.network, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, web3RewardToken.network);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || (l = web3RewardToken.chainIndex) == null || l.longValue() != Long.MIN_VALUE) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, LongSerializer.INSTANCE, web3RewardToken.chainIndex);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) web3RewardToken.apy, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, web3RewardToken.apy);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) web3RewardToken.totalTokenAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, web3RewardToken.totalTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) web3RewardToken.pendingTokenAmount, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, web3RewardToken.pendingTokenAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) web3RewardToken.decimal, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, web3RewardToken.decimal);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) web3RewardToken.pendingCurrencyAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, web3RewardToken.pendingCurrencyAmount);
    }

    public Web3RewardToken(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8) {
        this.tokenSymbol = str;
        this.tokenAddress = str2;
        this.network = str3;
        this.chainIndex = l;
        this.apy = str4;
        this.totalTokenAmount = str5;
        this.pendingTokenAmount = str6;
        this.decimal = str7;
        this.pendingCurrencyAmount = str8;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x005a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0019: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (Long.MIN_VALUE long) : (r14v0 java.lang.Long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r20v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:29) call: com.okinc.business.invest_api.bean.Web3RewardToken.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ Web3RewardToken(String str, String str2, String str3, Long l, String str4, String str5, String str6, String str7, String str8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? Long.MIN_VALUE : l, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) == 0 ? str8 : "");
    }
}
