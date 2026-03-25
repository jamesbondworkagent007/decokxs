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
public final class EosMarketBean implements Parcelable {
    private String cpuAmount;
    private String currency;
    private String netAmount;
    private String ramAmount;
    private String ramBytes;
    private String ramPrice;
    private String rate;
    private String sumAmount;
    private String sumCurrencyAmount;
    private String weightAmount;
    private String weightCurrencyAmount;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<EosMarketBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EosMarketBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EosMarketBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EosMarketBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EosMarketBean[] newArray(int i) {
            return new EosMarketBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public EosMarketBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.weightAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.weightCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ramPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ramBytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.ramAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.cpuAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.netAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.sumAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.sumCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EosMarketBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
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
        return new EosMarketBean(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
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
        if (!(obj instanceof EosMarketBean)) {
            return false;
        }
        EosMarketBean eosMarketBean = (EosMarketBean) obj;
        return Intrinsics.EZpvd((Object) this.currency, (Object) eosMarketBean.currency) && Intrinsics.EZpvd((Object) this.ramPrice, (Object) eosMarketBean.ramPrice) && Intrinsics.EZpvd((Object) this.ramBytes, (Object) eosMarketBean.ramBytes) && Intrinsics.EZpvd((Object) this.ramAmount, (Object) eosMarketBean.ramAmount) && Intrinsics.EZpvd((Object) this.cpuAmount, (Object) eosMarketBean.cpuAmount) && Intrinsics.EZpvd((Object) this.netAmount, (Object) eosMarketBean.netAmount) && Intrinsics.EZpvd((Object) this.sumAmount, (Object) eosMarketBean.sumAmount) && Intrinsics.EZpvd((Object) this.sumCurrencyAmount, (Object) eosMarketBean.sumCurrencyAmount) && Intrinsics.EZpvd((Object) this.rate, (Object) eosMarketBean.rate) && Intrinsics.EZpvd((Object) this.weightAmount, (Object) eosMarketBean.weightAmount) && Intrinsics.EZpvd((Object) this.weightCurrencyAmount, (Object) eosMarketBean.weightCurrencyAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCpuAmount() {
        return this.cpuAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetAmount() {
        return this.netAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRamAmount() {
        return this.ramAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRamBytes() {
        return this.ramBytes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRamPrice() {
        return this.ramPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSumAmount() {
        return this.sumAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSumCurrencyAmount() {
        return this.sumCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWeightAmount() {
        return this.weightAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWeightCurrencyAmount() {
        return this.weightCurrencyAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((this.currency.hashCode() * 31) + this.ramPrice.hashCode()) * 31) + this.ramBytes.hashCode()) * 31) + this.ramAmount.hashCode()) * 31) + this.cpuAmount.hashCode()) * 31) + this.netAmount.hashCode()) * 31) + this.sumAmount.hashCode()) * 31) + this.sumCurrencyAmount.hashCode()) * 31) + this.rate.hashCode()) * 31) + this.weightAmount.hashCode()) * 31) + this.weightCurrencyAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCpuAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.cpuAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.netAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRamAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ramAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRamBytes(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ramBytes = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRamPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ramPrice = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRate(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.rate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSumAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sumAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSumCurrencyAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sumCurrencyAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWeightAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.weightAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWeightCurrencyAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.weightCurrencyAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EosMarketBean(currency=" + this.currency + ", ramPrice=" + this.ramPrice + ", ramBytes=" + this.ramBytes + ", ramAmount=" + this.ramAmount + ", cpuAmount=" + this.cpuAmount + ", netAmount=" + this.netAmount + ", sumAmount=" + this.sumAmount + ", sumCurrencyAmount=" + this.sumCurrencyAmount + ", rate=" + this.rate + ", weightAmount=" + this.weightAmount + ", weightCurrencyAmount=" + this.weightCurrencyAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.currency);
        parcel.writeString(this.ramPrice);
        parcel.writeString(this.ramBytes);
        parcel.writeString(this.ramAmount);
        parcel.writeString(this.cpuAmount);
        parcel.writeString(this.netAmount);
        parcel.writeString(this.sumAmount);
        parcel.writeString(this.sumCurrencyAmount);
        parcel.writeString(this.rate);
        parcel.writeString(this.weightAmount);
        parcel.writeString(this.weightCurrencyAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.EosMarketBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EosMarketBean> serializer() {
            return EosMarketBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EosMarketBean(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.currency = "";
        } else {
            this.currency = str;
        }
        if ((i & 2) == 0) {
            this.ramPrice = "";
        } else {
            this.ramPrice = str2;
        }
        if ((i & 4) == 0) {
            this.ramBytes = "";
        } else {
            this.ramBytes = str3;
        }
        if ((i & 8) == 0) {
            this.ramAmount = "";
        } else {
            this.ramAmount = str4;
        }
        if ((i & 16) == 0) {
            this.cpuAmount = "";
        } else {
            this.cpuAmount = str5;
        }
        if ((i & 32) == 0) {
            this.netAmount = "";
        } else {
            this.netAmount = str6;
        }
        if ((i & 64) == 0) {
            this.sumAmount = "";
        } else {
            this.sumAmount = str7;
        }
        if ((i & 128) == 0) {
            this.sumCurrencyAmount = "";
        } else {
            this.sumCurrencyAmount = str8;
        }
        if ((i & 256) == 0) {
            this.rate = "";
        } else {
            this.rate = str9;
        }
        if ((i & 512) == 0) {
            this.weightAmount = "";
        } else {
            this.weightAmount = str10;
        }
        if ((i & 1024) == 0) {
            this.weightCurrencyAmount = "";
        } else {
            this.weightCurrencyAmount = str11;
        }
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(EosMarketBean eosMarketBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) eosMarketBean.currency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, eosMarketBean.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) eosMarketBean.ramPrice, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, eosMarketBean.ramPrice);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) eosMarketBean.ramBytes, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, eosMarketBean.ramBytes);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) eosMarketBean.ramAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, eosMarketBean.ramAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) eosMarketBean.cpuAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, eosMarketBean.cpuAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) eosMarketBean.netAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, eosMarketBean.netAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) eosMarketBean.sumAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, eosMarketBean.sumAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) eosMarketBean.sumCurrencyAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, eosMarketBean.sumCurrencyAmount);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) eosMarketBean.rate, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, eosMarketBean.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) eosMarketBean.weightAmount, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, eosMarketBean.weightAmount);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd((Object) eosMarketBean.weightCurrencyAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 10, eosMarketBean.weightCurrencyAmount);
    }

    public EosMarketBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11) {
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
        this.currency = str;
        this.ramPrice = str2;
        this.ramBytes = str3;
        this.ramAmount = str4;
        this.cpuAmount = str5;
        this.netAmount = str6;
        this.sumAmount = str7;
        this.sumCurrencyAmount = str8;
        this.rate = str9;
        this.weightAmount = str10;
        this.weightCurrencyAmount = str11;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x006d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r24v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0031: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0039: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0041: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0049: ARITH (r24v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0051: ARITH (r24v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r23v0 java.lang.String) : (""))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:92) call: com.okinc.business.defi.biz.net.bean.EosMarketBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ EosMarketBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? "" : str7, (i & 128) != 0 ? "" : str8, (i & 256) != 0 ? "" : str9, (i & 512) != 0 ? "" : str10, (i & 1024) == 0 ? str11 : "");
    }
}
