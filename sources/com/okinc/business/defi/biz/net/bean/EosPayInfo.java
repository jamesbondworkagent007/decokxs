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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Serializable
public final class EosPayInfo implements Parcelable {
    private String baseCoinAmount;
    private String coinAmount;
    private long coinId;
    private String currencyAmount;
    private String fee;
    private String message;
    private boolean recommend;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EosPayInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EosPayInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EosPayInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EosPayInfo(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EosPayInfo[] newArray(int i) {
            return new EosPayInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EosPayInfo() {
        this(0L, (String) null, (String) null, (String) null, (String) null, (String) null, false, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.baseCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.recommend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EosPayInfo copy(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new EosPayInfo(j, str, str2, str3, str4, str5, z);
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
        if (!(obj instanceof EosPayInfo)) {
            return false;
        }
        EosPayInfo eosPayInfo = (EosPayInfo) obj;
        return this.coinId == eosPayInfo.coinId && Intrinsics.EZpvd((Object) this.coinAmount, (Object) eosPayInfo.coinAmount) && Intrinsics.EZpvd((Object) this.baseCoinAmount, (Object) eosPayInfo.baseCoinAmount) && Intrinsics.EZpvd((Object) this.currencyAmount, (Object) eosPayInfo.currencyAmount) && Intrinsics.EZpvd((Object) this.fee, (Object) eosPayInfo.fee) && Intrinsics.EZpvd((Object) this.message, (Object) eosPayInfo.message) && this.recommend == eosPayInfo.recommend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBaseCoinAmount() {
        return this.baseCoinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAmount() {
        return this.coinAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyAmount() {
        return this.currencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFee() {
        return this.fee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMessage() {
        return this.message;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getRecommend() {
        return this.recommend;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((Long.hashCode(this.coinId) * 31) + this.coinAmount.hashCode()) * 31) + this.baseCoinAmount.hashCode()) * 31) + this.currencyAmount.hashCode()) * 31) + this.fee.hashCode()) * 31) + this.message.hashCode()) * 31) + Boolean.hashCode(this.recommend);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBaseCoinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.baseCoinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinId(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencyAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFee(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fee = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.message = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRecommend(boolean z) {
        this.recommend = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EosPayInfo(coinId=" + this.coinId + ", coinAmount=" + this.coinAmount + ", baseCoinAmount=" + this.baseCoinAmount + ", currencyAmount=" + this.currencyAmount + ", fee=" + this.fee + ", message=" + this.message + ", recommend=" + this.recommend + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.coinId);
        parcel.writeString(this.coinAmount);
        parcel.writeString(this.baseCoinAmount);
        parcel.writeString(this.currencyAmount);
        parcel.writeString(this.fee);
        parcel.writeString(this.message);
        parcel.writeInt(this.recommend ? 1 : 0);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.EosPayInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EosPayInfo> serializer() {
            return EosPayInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EosPayInfo(int i, long j, String str, String str2, String str3, String str4, String str5, boolean z, SerializationConstructorMarker serializationConstructorMarker) {
        this.coinId = (i & 1) == 0 ? 0L : j;
        if ((i & 2) == 0) {
            this.coinAmount = "";
        } else {
            this.coinAmount = str;
        }
        if ((i & 4) == 0) {
            this.baseCoinAmount = "";
        } else {
            this.baseCoinAmount = str2;
        }
        if ((i & 8) == 0) {
            this.currencyAmount = "";
        } else {
            this.currencyAmount = str3;
        }
        if ((i & 16) == 0) {
            this.fee = "";
        } else {
            this.fee = str4;
        }
        if ((i & 32) == 0) {
            this.message = "";
        } else {
            this.message = str5;
        }
        if ((i & 64) == 0) {
            this.recommend = true;
        } else {
            this.recommend = z;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EosPayInfo eosPayInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || eosPayInfo.coinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 0, eosPayInfo.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) eosPayInfo.coinAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, eosPayInfo.coinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) eosPayInfo.baseCoinAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, eosPayInfo.baseCoinAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) eosPayInfo.currencyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, eosPayInfo.currencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) eosPayInfo.fee, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, eosPayInfo.fee);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) eosPayInfo.message, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, eosPayInfo.message);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && eosPayInfo.recommend) {
            return;
        }
        compositeEncoder.encodeBooleanElement(serialDescriptor, 6, eosPayInfo.recommend);
    }

    public EosPayInfo(long j, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.coinId = j;
        this.coinAmount = str;
        this.baseCoinAmount = str2;
        this.currencyAmount = str3;
        this.fee = str4;
        this.message = str5;
        this.recommend = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003e: CONSTRUCTOR 
  (wrap:long:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r9v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r17v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r17v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r17v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001f: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r17v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r15v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x002c: ARITH (r17v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? true : (r16v0 boolean))
 A[MD:(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:109) call: com.okinc.business.defi.biz.net.bean.EosPayInfo.<init>(long, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ EosPayInfo(long j, String str, String str2, String str3, String str4, String str5, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) == 0 ? str5 : "", (i & 64) != 0 ? true : z);
    }
}
