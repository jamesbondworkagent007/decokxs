package com.okinc.okx.paymentapi.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class ChannelQuote implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ChannelQuote> CREATOR = new Creator();
    private final VendorId channelId;
    private final String cryptoAmount;
    private final String cryptoCurrency;
    private final String displayIconUrl;
    private final String displayIconUrlNight;
    private final String displayName;
    private final String fiatAmount;
    private final String fiatCurrency;
    private final String networkFee;
    private final List<PaymentMethod> paymentMethod;
    private final String rampFee;

    public static final class Creator implements Parcelable.Creator<ChannelQuote> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelQuote createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            VendorId vendorIdValueOf = VendorId.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(PaymentMethod.CREATOR.createFromParcel(parcel));
            }
            return new ChannelQuote(vendorIdValueOf, string, string2, string3, string4, string5, string6, string7, string8, string9, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChannelQuote[] newArray(int i) {
            return new ChannelQuote[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VendorId component1() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.displayIconUrlNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PaymentMethod> component11() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fiatAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fiatCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.cryptoAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.cryptoCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.rampFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.displayIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ChannelQuote copy(@NotNull VendorId vendorId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, @NotNull List<PaymentMethod> list) {
        Intrinsics.checkNotNullParameter(vendorId, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new ChannelQuote(vendorId, str, str2, str3, str4, str5, str6, str7, str8, str9, list);
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
        if (!(obj instanceof ChannelQuote)) {
            return false;
        }
        ChannelQuote channelQuote = (ChannelQuote) obj;
        return this.channelId == channelQuote.channelId && Intrinsics.EZpvd((Object) this.fiatAmount, (Object) channelQuote.fiatAmount) && Intrinsics.EZpvd((Object) this.fiatCurrency, (Object) channelQuote.fiatCurrency) && Intrinsics.EZpvd((Object) this.cryptoAmount, (Object) channelQuote.cryptoAmount) && Intrinsics.EZpvd((Object) this.cryptoCurrency, (Object) channelQuote.cryptoCurrency) && Intrinsics.EZpvd((Object) this.rampFee, (Object) channelQuote.rampFee) && Intrinsics.EZpvd((Object) this.networkFee, (Object) channelQuote.networkFee) && Intrinsics.EZpvd((Object) this.displayName, (Object) channelQuote.displayName) && Intrinsics.EZpvd((Object) this.displayIconUrl, (Object) channelQuote.displayIconUrl) && Intrinsics.EZpvd((Object) this.displayIconUrlNight, (Object) channelQuote.displayIconUrlNight) && Intrinsics.EZpvd(this.paymentMethod, channelQuote.paymentMethod);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VendorId getChannelId() {
        return this.channelId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCryptoAmount() {
        return this.cryptoAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCryptoCurrency() {
        return this.cryptoCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayIconUrl() {
        return this.displayIconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayIconUrlNight() {
        return this.displayIconUrlNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFiatAmount() {
        return this.fiatAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFiatCurrency() {
        return this.fiatCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkFee() {
        return this.networkFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<PaymentMethod> getPaymentMethod() {
        return this.paymentMethod;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRampFee() {
        return this.rampFee;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.channelId.hashCode();
        String str = this.fiatAmount;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.fiatCurrency;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.cryptoAmount;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.cryptoCurrency;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.rampFee;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.networkFee;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.displayName;
        int iHashCode8 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.displayIconUrl;
        int iHashCode9 = str8 == null ? 0 : str8.hashCode();
        String str9 = this.displayIconUrlNight;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (str9 != null ? str9.hashCode() : 0)) * 31) + this.paymentMethod.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ChannelQuote(channelId=" + this.channelId + ", fiatAmount=" + this.fiatAmount + ", fiatCurrency=" + this.fiatCurrency + ", cryptoAmount=" + this.cryptoAmount + ", cryptoCurrency=" + this.cryptoCurrency + ", rampFee=" + this.rampFee + ", networkFee=" + this.networkFee + ", displayName=" + this.displayName + ", displayIconUrl=" + this.displayIconUrl + ", displayIconUrlNight=" + this.displayIconUrlNight + ", paymentMethod=" + this.paymentMethod + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.channelId.name());
        parcel.writeString(this.fiatAmount);
        parcel.writeString(this.fiatCurrency);
        parcel.writeString(this.cryptoAmount);
        parcel.writeString(this.cryptoCurrency);
        parcel.writeString(this.rampFee);
        parcel.writeString(this.networkFee);
        parcel.writeString(this.displayName);
        parcel.writeString(this.displayIconUrl);
        parcel.writeString(this.displayIconUrlNight);
        List<PaymentMethod> list = this.paymentMethod;
        parcel.writeInt(list.size());
        Iterator<PaymentMethod> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public ChannelQuote(@NotNull VendorId vendorId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, @NotNull List<PaymentMethod> list) {
        Intrinsics.checkNotNullParameter(vendorId, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.channelId = vendorId;
        this.fiatAmount = str;
        this.fiatCurrency = str2;
        this.cryptoAmount = str3;
        this.cryptoCurrency = str4;
        this.rampFee = str5;
        this.networkFee = str6;
        this.displayName = str7;
        this.displayIconUrl = str8;
        this.displayIconUrlNight = str9;
        this.paymentMethod = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0050: CONSTRUCTOR 
  (r16v0 com.okinc.okx.paymentapi.presentation.VendorId)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r27v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r27v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r27v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r27v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r27v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r27v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r27v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003b: ARITH (r27v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0043: ARITH (r27v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r25v0 java.lang.String))
  (r26v0 java.util.List)
 A[MD:(com.okinc.okx.paymentapi.presentation.VendorId, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<com.okinc.okx.paymentapi.presentation.PaymentMethod>):void (m)] (LINE:97) call: com.okinc.okx.paymentapi.presentation.ChannelQuote.<init>(com.okinc.okx.paymentapi.presentation.VendorId, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ ChannelQuote(VendorId vendorId, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(vendorId, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : str9, list);
    }
}
