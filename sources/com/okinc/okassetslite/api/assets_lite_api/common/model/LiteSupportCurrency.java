package com.okinc.okassetslite.api.assets_lite_api.common.model;

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

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class LiteSupportCurrency implements Parcelable {
    private String balance;
    private String canInvoiceDeposit;
    private String canInvoiceWithdraw;
    private String canWithdrawAddress;
    private String canWithdrawInternal;
    private String currency;
    private int currencyId;
    private String currencySymbol;
    private String feeMin;
    private String fiatIcon;
    private String fullName;
    private String icon;
    private boolean isCashCurrency;
    private String precision;
    private String price;
    private String valuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LiteSupportCurrency> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LiteSupportCurrency> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiteSupportCurrency createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LiteSupportCurrency(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LiteSupportCurrency[] newArray(int i) {
            return new LiteSupportCurrency[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LiteSupportCurrency() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 65535, (DefaultConstructorMarker) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getBalance() {
        return this.balance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCanInvoiceDeposit() {
        return this.canInvoiceDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCanInvoiceWithdraw() {
        return this.canInvoiceWithdraw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCanWithdrawAddress() {
        return this.canWithdrawAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCanWithdrawInternal() {
        return this.canWithdrawInternal;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencySymbol() {
        return this.currencySymbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeMin() {
        return this.feeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFiatIcon() {
        return this.fiatIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFullName() {
        return this.fullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrecision() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPrice() {
        return this.price;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCashCurrency() {
        return this.isCashCurrency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBalance(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.balance = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanInvoiceDeposit(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.canInvoiceDeposit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanInvoiceWithdraw(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.canInvoiceWithdraw = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanWithdrawAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.canWithdrawAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCanWithdrawInternal(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.canWithdrawInternal = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCashCurrency(boolean z) {
        this.isCashCurrency = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrency(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currency = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(int i) {
        this.currencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencySymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.currencySymbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeMin(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feeMin = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFiatIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fiatIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFullName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.fullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.icon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrecision(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.precision = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrice(String str) {
        this.price = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuation(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.valuation = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.currencyId);
        parcel.writeString(this.currency);
        parcel.writeString(this.fullName);
        parcel.writeString(this.icon);
        parcel.writeString(this.balance);
        parcel.writeString(this.price);
        parcel.writeInt(this.isCashCurrency ? 1 : 0);
        parcel.writeString(this.precision);
        parcel.writeString(this.valuation);
        parcel.writeString(this.fiatIcon);
        parcel.writeString(this.feeMin);
        parcel.writeString(this.currencySymbol);
        parcel.writeString(this.canInvoiceDeposit);
        parcel.writeString(this.canInvoiceWithdraw);
        parcel.writeString(this.canWithdrawAddress);
        parcel.writeString(this.canWithdrawInternal);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okassetslite.api.assets_lite_api.common.model.LiteSupportCurrency.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LiteSupportCurrency> serializer() {
            return LiteSupportCurrency$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LiteSupportCurrency(int i, int i2, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, SerializationConstructorMarker serializationConstructorMarker) {
        this.currencyId = (i & 1) == 0 ? -1 : i2;
        if ((i & 2) == 0) {
            this.currency = "";
        } else {
            this.currency = str;
        }
        if ((i & 4) == 0) {
            this.fullName = "";
        } else {
            this.fullName = str2;
        }
        if ((i & 8) == 0) {
            this.icon = "";
        } else {
            this.icon = str3;
        }
        if ((i & 16) == 0) {
            this.balance = "";
        } else {
            this.balance = str4;
        }
        if ((i & 32) == 0) {
            this.price = "";
        } else {
            this.price = str5;
        }
        this.isCashCurrency = (i & 64) == 0 ? false : z;
        if ((i & 128) == 0) {
            this.precision = "";
        } else {
            this.precision = str6;
        }
        if ((i & 256) == 0) {
            this.valuation = "";
        } else {
            this.valuation = str7;
        }
        if ((i & 512) == 0) {
            this.fiatIcon = "";
        } else {
            this.fiatIcon = str8;
        }
        if ((i & 1024) == 0) {
            this.feeMin = "";
        } else {
            this.feeMin = str9;
        }
        if ((i & 2048) == 0) {
            this.currencySymbol = "";
        } else {
            this.currencySymbol = str10;
        }
        if ((i & 4096) == 0) {
            this.canInvoiceDeposit = "";
        } else {
            this.canInvoiceDeposit = str11;
        }
        if ((i & 8192) == 0) {
            this.canInvoiceWithdraw = "";
        } else {
            this.canInvoiceWithdraw = str12;
        }
        if ((i & 16384) == 0) {
            this.canWithdrawAddress = "";
        } else {
            this.canWithdrawAddress = str13;
        }
        if ((i & 32768) == 0) {
            this.canWithdrawInternal = "";
        } else {
            this.canWithdrawInternal = str14;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssetsLite_assets_lite_api(LiteSupportCurrency liteSupportCurrency, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || liteSupportCurrency.currencyId != -1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, liteSupportCurrency.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) liteSupportCurrency.currency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, liteSupportCurrency.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) liteSupportCurrency.fullName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, liteSupportCurrency.fullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) liteSupportCurrency.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, liteSupportCurrency.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) liteSupportCurrency.balance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, liteSupportCurrency.balance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) liteSupportCurrency.price, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, liteSupportCurrency.price);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || liteSupportCurrency.isCashCurrency) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 6, liteSupportCurrency.isCashCurrency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) liteSupportCurrency.precision, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, liteSupportCurrency.precision);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) liteSupportCurrency.valuation, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, liteSupportCurrency.valuation);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) liteSupportCurrency.fiatIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, liteSupportCurrency.fiatIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) liteSupportCurrency.feeMin, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, liteSupportCurrency.feeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd((Object) liteSupportCurrency.currencySymbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 11, liteSupportCurrency.currencySymbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) liteSupportCurrency.canInvoiceDeposit, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, liteSupportCurrency.canInvoiceDeposit);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) liteSupportCurrency.canInvoiceWithdraw, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, liteSupportCurrency.canInvoiceWithdraw);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) liteSupportCurrency.canWithdrawAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, liteSupportCurrency.canWithdrawAddress);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) && Intrinsics.EZpvd((Object) liteSupportCurrency.canWithdrawInternal, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 15, liteSupportCurrency.canWithdrawInternal);
    }

    public LiteSupportCurrency(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, String str5, boolean z, @NotNull String str6, @NotNull String str7, @NotNull String str8, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        this.currencyId = i;
        this.currency = str;
        this.fullName = str2;
        this.icon = str3;
        this.balance = str4;
        this.price = str5;
        this.isCashCurrency = z;
        this.precision = str6;
        this.valuation = str7;
        this.fiatIcon = str8;
        this.feeMin = str9;
        this.currencySymbol = str10;
        this.canInvoiceDeposit = str11;
        this.canInvoiceWithdraw = str12;
        this.canWithdrawAddress = str13;
        this.canWithdrawInternal = str14;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00ad: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r34v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r18v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r34v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r34v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r34v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r34v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r34v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0034: ARITH (r34v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r24v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r34v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r34v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r34v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0054: ARITH (r34v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005c: ARITH (r34v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0064: ARITH (r34v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r30v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006c: ARITH (r34v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0076: ARITH (r34v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0082: ARITH (r34v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.okassetslite.api.assets_lite_api.common.model.LiteSupportCurrency.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LiteSupportCurrency(int i, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? -1 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? "" : str6, (i2 & 256) != 0 ? "" : str7, (i2 & 512) != 0 ? "" : str8, (i2 & 1024) != 0 ? "" : str9, (i2 & 2048) != 0 ? "" : str10, (i2 & 4096) != 0 ? "" : str11, (i2 & 8192) != 0 ? "" : str12, (i2 & 16384) != 0 ? "" : str13, (i2 & 32768) != 0 ? "" : str14);
    }
}
