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
public final class RechargeNavigationBean implements Parcelable {
    public static final int $stable = 0;
    private final boolean addCustomToken;
    private final int addressType;
    private final String chainId;
    private final String coinAddress;
    private final long coinId;
    private final int currencyId;
    private final boolean fromFullScreen;
    private final boolean isCoin;
    private final boolean isTrackingWallet;
    private final boolean needCustomToken;
    private final String sourceType;
    private final int subCurrencyId;
    private final String symbol;
    private final String tip;
    private final String tokenAddress;
    private final String url;
    private final String walletDisplayName;
    private final String walletId;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RechargeNavigationBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RechargeNavigationBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RechargeNavigationBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RechargeNavigationBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RechargeNavigationBean[] newArray(int i) {
            return new RechargeNavigationBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public RechargeNavigationBean() {
        this((String) null, (String) null, (String) null, 0L, (String) null, (String) null, (String) null, false, 0, 0, (String) null, false, false, false, false, (String) null, (String) null, 0, 262143, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.walletDisplayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component12() {
        return this.isTrackingWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component13() {
        return this.fromFullScreen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component14() {
        return this.addCustomToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component15() {
        return this.needCustomToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.tip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component18() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.coinAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.isCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RechargeNavigationBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, int i, int i2, @NotNull String str7, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull String str8, @NotNull String str9, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        return new RechargeNavigationBean(str, str2, str3, j, str4, str5, str6, z, i, i2, str7, z2, z3, z4, z5, str8, str9, i3);
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
        if (!(obj instanceof RechargeNavigationBean)) {
            return false;
        }
        RechargeNavigationBean rechargeNavigationBean = (RechargeNavigationBean) obj;
        return Intrinsics.EZpvd((Object) this.walletId, (Object) rechargeNavigationBean.walletId) && Intrinsics.EZpvd((Object) this.chainId, (Object) rechargeNavigationBean.chainId) && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) rechargeNavigationBean.tokenAddress) && this.coinId == rechargeNavigationBean.coinId && Intrinsics.EZpvd((Object) this.coinAddress, (Object) rechargeNavigationBean.coinAddress) && Intrinsics.EZpvd((Object) this.symbol, (Object) rechargeNavigationBean.symbol) && Intrinsics.EZpvd((Object) this.url, (Object) rechargeNavigationBean.url) && this.isCoin == rechargeNavigationBean.isCoin && this.currencyId == rechargeNavigationBean.currencyId && this.subCurrencyId == rechargeNavigationBean.subCurrencyId && Intrinsics.EZpvd((Object) this.walletDisplayName, (Object) rechargeNavigationBean.walletDisplayName) && this.isTrackingWallet == rechargeNavigationBean.isTrackingWallet && this.fromFullScreen == rechargeNavigationBean.fromFullScreen && this.addCustomToken == rechargeNavigationBean.addCustomToken && this.needCustomToken == rechargeNavigationBean.needCustomToken && Intrinsics.EZpvd((Object) this.tip, (Object) rechargeNavigationBean.tip) && Intrinsics.EZpvd((Object) this.sourceType, (Object) rechargeNavigationBean.sourceType) && this.addressType == rechargeNavigationBean.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getAddCustomToken() {
        return this.addCustomToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getAddressType() {
        return this.addressType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinAddress() {
        return this.coinAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getCoinId() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getFromFullScreen() {
        return this.fromFullScreen;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedCustomToken() {
        return this.needCustomToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceType() {
        return this.sourceType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTip() {
        return this.tip;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletDisplayName() {
        return this.walletDisplayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((this.walletId.hashCode() * 31) + this.chainId.hashCode()) * 31) + this.tokenAddress.hashCode()) * 31) + Long.hashCode(this.coinId)) * 31) + this.coinAddress.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.url.hashCode()) * 31) + Boolean.hashCode(this.isCoin)) * 31) + Integer.hashCode(this.currencyId)) * 31) + Integer.hashCode(this.subCurrencyId)) * 31) + this.walletDisplayName.hashCode()) * 31) + Boolean.hashCode(this.isTrackingWallet)) * 31) + Boolean.hashCode(this.fromFullScreen)) * 31) + Boolean.hashCode(this.addCustomToken)) * 31) + Boolean.hashCode(this.needCustomToken)) * 31) + this.tip.hashCode()) * 31) + this.sourceType.hashCode()) * 31) + Integer.hashCode(this.addressType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCoin() {
        return this.isCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTrackingWallet() {
        return this.isTrackingWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RechargeNavigationBean(walletId=" + this.walletId + ", chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", coinId=" + this.coinId + ", coinAddress=" + this.coinAddress + ", symbol=" + this.symbol + ", url=" + this.url + ", isCoin=" + this.isCoin + ", currencyId=" + this.currencyId + ", subCurrencyId=" + this.subCurrencyId + ", walletDisplayName=" + this.walletDisplayName + ", isTrackingWallet=" + this.isTrackingWallet + ", fromFullScreen=" + this.fromFullScreen + ", addCustomToken=" + this.addCustomToken + ", needCustomToken=" + this.needCustomToken + ", tip=" + this.tip + ", sourceType=" + this.sourceType + ", addressType=" + this.addressType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.walletId);
        parcel.writeString(this.chainId);
        parcel.writeString(this.tokenAddress);
        parcel.writeLong(this.coinId);
        parcel.writeString(this.coinAddress);
        parcel.writeString(this.symbol);
        parcel.writeString(this.url);
        parcel.writeInt(this.isCoin ? 1 : 0);
        parcel.writeInt(this.currencyId);
        parcel.writeInt(this.subCurrencyId);
        parcel.writeString(this.walletDisplayName);
        parcel.writeInt(this.isTrackingWallet ? 1 : 0);
        parcel.writeInt(this.fromFullScreen ? 1 : 0);
        parcel.writeInt(this.addCustomToken ? 1 : 0);
        parcel.writeInt(this.needCustomToken ? 1 : 0);
        parcel.writeString(this.tip);
        parcel.writeString(this.sourceType);
        parcel.writeInt(this.addressType);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.biz.net.bean.RechargeNavigationBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RechargeNavigationBean> serializer() {
            return RechargeNavigationBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RechargeNavigationBean(int i, String str, String str2, String str3, long j, String str4, String str5, String str6, boolean z, int i2, int i3, String str7, boolean z2, boolean z3, boolean z4, boolean z5, String str8, String str9, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.walletId = "";
        } else {
            this.walletId = str;
        }
        if ((i & 2) == 0) {
            this.chainId = "";
        } else {
            this.chainId = str2;
        }
        if ((i & 4) == 0) {
            this.tokenAddress = "";
        } else {
            this.tokenAddress = str3;
        }
        this.coinId = (i & 8) == 0 ? 0L : j;
        if ((i & 16) == 0) {
            this.coinAddress = "";
        } else {
            this.coinAddress = str4;
        }
        if ((i & 32) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str5;
        }
        if ((i & 64) == 0) {
            this.url = "";
        } else {
            this.url = str6;
        }
        if ((i & 128) == 0) {
            this.isCoin = false;
        } else {
            this.isCoin = z;
        }
        if ((i & 256) == 0) {
            this.currencyId = 0;
        } else {
            this.currencyId = i2;
        }
        if ((i & 512) == 0) {
            this.subCurrencyId = 0;
        } else {
            this.subCurrencyId = i3;
        }
        if ((i & 1024) == 0) {
            this.walletDisplayName = "";
        } else {
            this.walletDisplayName = str7;
        }
        if ((i & 2048) == 0) {
            this.isTrackingWallet = false;
        } else {
            this.isTrackingWallet = z2;
        }
        if ((i & 4096) == 0) {
            this.fromFullScreen = false;
        } else {
            this.fromFullScreen = z3;
        }
        if ((i & 8192) == 0) {
            this.addCustomToken = false;
        } else {
            this.addCustomToken = z4;
        }
        if ((i & 16384) == 0) {
            this.needCustomToken = false;
        } else {
            this.needCustomToken = z5;
        }
        if ((32768 & i) == 0) {
            this.tip = "";
        } else {
            this.tip = str8;
        }
        if ((65536 & i) == 0) {
            this.sourceType = "";
        } else {
            this.sourceType = str9;
        }
        this.addressType = (i & 131072) == 0 ? -1 : i4;
    }

    public static final /* synthetic */ void write$Self$OKWallet_wallet_impl(RechargeNavigationBean rechargeNavigationBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) rechargeNavigationBean.walletId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, rechargeNavigationBean.walletId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) rechargeNavigationBean.chainId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, rechargeNavigationBean.chainId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) rechargeNavigationBean.tokenAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, rechargeNavigationBean.tokenAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || rechargeNavigationBean.coinId != 0) {
            compositeEncoder.encodeLongElement(serialDescriptor, 3, rechargeNavigationBean.coinId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) rechargeNavigationBean.coinAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, rechargeNavigationBean.coinAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) rechargeNavigationBean.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, rechargeNavigationBean.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) rechargeNavigationBean.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, rechargeNavigationBean.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || rechargeNavigationBean.isCoin) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, rechargeNavigationBean.isCoin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || rechargeNavigationBean.currencyId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, rechargeNavigationBean.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || rechargeNavigationBean.subCurrencyId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, rechargeNavigationBean.subCurrencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || !Intrinsics.EZpvd((Object) rechargeNavigationBean.walletDisplayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 10, rechargeNavigationBean.walletDisplayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || rechargeNavigationBean.isTrackingWallet) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 11, rechargeNavigationBean.isTrackingWallet);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || rechargeNavigationBean.fromFullScreen) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 12, rechargeNavigationBean.fromFullScreen);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || rechargeNavigationBean.addCustomToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 13, rechargeNavigationBean.addCustomToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || rechargeNavigationBean.needCustomToken) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 14, rechargeNavigationBean.needCustomToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) rechargeNavigationBean.tip, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, rechargeNavigationBean.tip);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) rechargeNavigationBean.sourceType, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, rechargeNavigationBean.sourceType);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) && rechargeNavigationBean.addressType == -1) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 17, rechargeNavigationBean.addressType);
    }

    public RechargeNavigationBean(@NotNull String str, @NotNull String str2, @NotNull String str3, long j, @NotNull String str4, @NotNull String str5, @NotNull String str6, boolean z, int i, int i2, @NotNull String str7, boolean z2, boolean z3, boolean z4, boolean z5, @NotNull String str8, @NotNull String str9, int i3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        this.walletId = str;
        this.chainId = str2;
        this.tokenAddress = str3;
        this.coinId = j;
        this.coinAddress = str4;
        this.symbol = str5;
        this.url = str6;
        this.isCoin = z;
        this.currencyId = i;
        this.subCurrencyId = i2;
        this.walletDisplayName = str7;
        this.isTrackingWallet = z2;
        this.fromFullScreen = z3;
        this.addCustomToken = z4;
        this.needCustomToken = z5;
        this.tip = str8;
        this.sourceType = str9;
        this.addressType = i3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c8: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r40v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r40v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r40v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:long:?: TERNARY null = ((wrap:int:0x001c: ARITH (r40v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (0 long) : (r24v0 long))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r40v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r40v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r40v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x003d: ARITH (r40v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r29v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0045: ARITH (r40v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r30v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004d: ARITH (r40v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r31v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0055: ARITH (r40v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x005d: ARITH (r40v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? false : (r33v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0065: ARITH (r40v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:boolean:0x0077: TERNARY null = ((wrap:int:0x006f: ARITH (r40v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? false : (r35v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0079: ARITH (r40v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? false : (r36v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0084: ARITH (r40v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008f: ARITH (r40v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x009a: ARITH (r40v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r39v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, boolean, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, int):void (m)] (LINE:1159) call: com.okinc.business.defi.biz.net.bean.RechargeNavigationBean.<init>(java.lang.String, java.lang.String, java.lang.String, long, java.lang.String, java.lang.String, java.lang.String, boolean, int, int, java.lang.String, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ RechargeNavigationBean(String str, String str2, String str3, long j, String str4, String str5, String str6, boolean z, int i, int i2, String str7, boolean z2, boolean z3, boolean z4, boolean z5, String str8, String str9, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? "" : str2, (i4 & 4) != 0 ? "" : str3, (i4 & 8) != 0 ? 0L : j, (i4 & 16) != 0 ? "" : str4, (i4 & 32) != 0 ? "" : str5, (i4 & 64) != 0 ? "" : str6, (i4 & 128) != 0 ? false : z, (i4 & 256) != 0 ? 0 : i, (i4 & 512) != 0 ? 0 : i2, (i4 & 1024) != 0 ? "" : str7, (i4 & 2048) != 0 ? false : z2, (i4 & 4096) != 0 ? false : z3, (i4 & 8192) != 0 ? false : z4, (i4 & 16384) != 0 ? false : z5, (i4 & 32768) != 0 ? "" : str8, (i4 & 65536) != 0 ? "" : str9, (i4 & 131072) != 0 ? -1 : i3);
    }
}
