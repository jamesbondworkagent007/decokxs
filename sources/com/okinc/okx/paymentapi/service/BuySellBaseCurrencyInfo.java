package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class BuySellBaseCurrencyInfo implements Parcelable {
    public static final int $stable = 0;
    private final String chainIcon;
    private final String coinUrl;
    private final String coinUrlNight;
    private final String sellTotalCryptoAmount;
    private final String tokenName;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BuySellBaseCurrencyInfo> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BuySellBaseCurrencyInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellBaseCurrencyInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BuySellBaseCurrencyInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellBaseCurrencyInfo[] newArray(int i) {
            return new BuySellBaseCurrencyInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BuySellBaseCurrencyInfo copy$default(BuySellBaseCurrencyInfo buySellBaseCurrencyInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buySellBaseCurrencyInfo.tokenName;
        }
        if ((i & 2) != 0) {
            str2 = buySellBaseCurrencyInfo.coinUrl;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = buySellBaseCurrencyInfo.coinUrlNight;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = buySellBaseCurrencyInfo.chainIcon;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = buySellBaseCurrencyInfo.sellTotalCryptoAmount;
        }
        return buySellBaseCurrencyInfo.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coinUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.coinUrlNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sellTotalCryptoAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellBaseCurrencyInfo copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new BuySellBaseCurrencyInfo(str, str2, str3, str4, str5);
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
        if (!(obj instanceof BuySellBaseCurrencyInfo)) {
            return false;
        }
        BuySellBaseCurrencyInfo buySellBaseCurrencyInfo = (BuySellBaseCurrencyInfo) obj;
        return Intrinsics.EZpvd((Object) this.tokenName, (Object) buySellBaseCurrencyInfo.tokenName) && Intrinsics.EZpvd((Object) this.coinUrl, (Object) buySellBaseCurrencyInfo.coinUrl) && Intrinsics.EZpvd((Object) this.coinUrlNight, (Object) buySellBaseCurrencyInfo.coinUrlNight) && Intrinsics.EZpvd((Object) this.chainIcon, (Object) buySellBaseCurrencyInfo.chainIcon) && Intrinsics.EZpvd((Object) this.sellTotalCryptoAmount, (Object) buySellBaseCurrencyInfo.sellTotalCryptoAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIcon() {
        return this.chainIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinUrl() {
        return this.coinUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinUrlNight() {
        return this.coinUrlNight;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSellTotalCryptoAmount() {
        return this.sellTotalCryptoAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenName() {
        return this.tokenName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.tokenName.hashCode() * 31) + this.coinUrl.hashCode()) * 31) + this.coinUrlNight.hashCode()) * 31) + this.chainIcon.hashCode()) * 31) + this.sellTotalCryptoAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BuySellBaseCurrencyInfo(tokenName=" + this.tokenName + ", coinUrl=" + this.coinUrl + ", coinUrlNight=" + this.coinUrlNight + ", chainIcon=" + this.chainIcon + ", sellTotalCryptoAmount=" + this.sellTotalCryptoAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tokenName);
        parcel.writeString(this.coinUrl);
        parcel.writeString(this.coinUrlNight);
        parcel.writeString(this.chainIcon);
        parcel.writeString(this.sellTotalCryptoAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BuySellBaseCurrencyInfo> serializer() {
            return BuySellBaseCurrencyInfo$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BuySellBaseCurrencyInfo(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, BuySellBaseCurrencyInfo$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenName = str;
        this.coinUrl = str2;
        this.coinUrlNight = str3;
        if ((i & 8) == 0) {
            this.chainIcon = "";
        } else {
            this.chainIcon = str4;
        }
        if ((i & 16) == 0) {
            this.sellTotalCryptoAmount = "";
        } else {
            this.sellTotalCryptoAmount = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(BuySellBaseCurrencyInfo buySellBaseCurrencyInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, buySellBaseCurrencyInfo.tokenName);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, buySellBaseCurrencyInfo.coinUrl);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, buySellBaseCurrencyInfo.coinUrlNight);
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) buySellBaseCurrencyInfo.chainIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, buySellBaseCurrencyInfo.chainIcon);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && Intrinsics.EZpvd((Object) buySellBaseCurrencyInfo.sellTotalCryptoAmount, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 4, buySellBaseCurrencyInfo.sellTotalCryptoAmount);
    }

    public BuySellBaseCurrencyInfo(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.tokenName = str;
        this.coinUrl = str2;
        this.coinUrlNight = str3;
        this.chainIcon = str4;
        this.sellTotalCryptoAmount = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0014: CONSTRUCTOR 
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:697) call: com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BuySellBaseCurrencyInfo(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5);
    }
}
