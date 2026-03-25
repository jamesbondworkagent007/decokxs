package com.okinc.crcore.coreapi.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class BaseCurrencyResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final String availableBalance;
    private final String currency;
    private final String currencyId;
    private final String currencyName;
    private final DexInfoResponseBean dexInfo;
    private final String displayName;
    private final String icon;
    private final String nightIcon;
    private final int scale;
    private final String symbol;
    private final double usdRate;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BaseCurrencyResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BaseCurrencyResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BaseCurrencyResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BaseCurrencyResponseBean(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : DexInfoResponseBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BaseCurrencyResponseBean[] newArray(int i) {
            return new BaseCurrencyResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BaseCurrencyResponseBean() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, (String) null, (DexInfoResponseBean) null, 2047, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexInfoResponseBean component11() {
        return this.dexInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.availableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component8() {
        return this.usdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BaseCurrencyResponseBean copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, double d, @NotNull String str7, @NotNull String str8, DexInfoResponseBean dexInfoResponseBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        return new BaseCurrencyResponseBean(i, str, str2, str3, str4, str5, str6, d, str7, str8, dexInfoResponseBean);
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
        if (!(obj instanceof BaseCurrencyResponseBean)) {
            return false;
        }
        BaseCurrencyResponseBean baseCurrencyResponseBean = (BaseCurrencyResponseBean) obj;
        return this.scale == baseCurrencyResponseBean.scale && Intrinsics.EZpvd((Object) this.currencyName, (Object) baseCurrencyResponseBean.currencyName) && Intrinsics.EZpvd((Object) this.nightIcon, (Object) baseCurrencyResponseBean.nightIcon) && Intrinsics.EZpvd((Object) this.symbol, (Object) baseCurrencyResponseBean.symbol) && Intrinsics.EZpvd((Object) this.currencyId, (Object) baseCurrencyResponseBean.currencyId) && Intrinsics.EZpvd((Object) this.icon, (Object) baseCurrencyResponseBean.icon) && Intrinsics.EZpvd((Object) this.availableBalance, (Object) baseCurrencyResponseBean.availableBalance) && Double.compare(this.usdRate, baseCurrencyResponseBean.usdRate) == 0 && Intrinsics.EZpvd((Object) this.currency, (Object) baseCurrencyResponseBean.currency) && Intrinsics.EZpvd((Object) this.displayName, (Object) baseCurrencyResponseBean.displayName) && Intrinsics.EZpvd(this.dexInfo, baseCurrencyResponseBean.dexInfo);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyName() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexInfoResponseBean getDexInfo() {
        return this.dexInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNightIcon() {
        return this.nightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getScale() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getUsdRate() {
        return this.usdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.scale);
        int iHashCode2 = this.currencyName.hashCode();
        int iHashCode3 = this.nightIcon.hashCode();
        int iHashCode4 = this.symbol.hashCode();
        int iHashCode5 = this.currencyId.hashCode();
        int iHashCode6 = this.icon.hashCode();
        int iHashCode7 = this.availableBalance.hashCode();
        int iHashCode8 = Double.hashCode(this.usdRate);
        int iHashCode9 = this.currency.hashCode();
        int iHashCode10 = this.displayName.hashCode();
        DexInfoResponseBean dexInfoResponseBean = this.dexInfo;
        return (((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (dexInfoResponseBean == null ? 0 : dexInfoResponseBean.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BaseCurrencyResponseBean(scale=" + this.scale + ", currencyName=" + this.currencyName + ", nightIcon=" + this.nightIcon + ", symbol=" + this.symbol + ", currencyId=" + this.currencyId + ", icon=" + this.icon + ", availableBalance=" + this.availableBalance + ", usdRate=" + this.usdRate + ", currency=" + this.currency + ", displayName=" + this.displayName + ", dexInfo=" + this.dexInfo + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.scale);
        parcel.writeString(this.currencyName);
        parcel.writeString(this.nightIcon);
        parcel.writeString(this.symbol);
        parcel.writeString(this.currencyId);
        parcel.writeString(this.icon);
        parcel.writeString(this.availableBalance);
        parcel.writeDouble(this.usdRate);
        parcel.writeString(this.currency);
        parcel.writeString(this.displayName);
        DexInfoResponseBean dexInfoResponseBean = this.dexInfo;
        if (dexInfoResponseBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexInfoResponseBean.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.BaseCurrencyResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BaseCurrencyResponseBean> serializer() {
            return BaseCurrencyResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BaseCurrencyResponseBean(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, double d, String str7, String str8, DexInfoResponseBean dexInfoResponseBean, SerializationConstructorMarker serializationConstructorMarker) {
        this.scale = (i & 1) == 0 ? 8 : i2;
        if ((i & 2) == 0) {
            this.currencyName = "";
        } else {
            this.currencyName = str;
        }
        if ((i & 4) == 0) {
            this.nightIcon = "";
        } else {
            this.nightIcon = str2;
        }
        if ((i & 8) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str3;
        }
        if ((i & 16) == 0) {
            this.currencyId = "";
        } else {
            this.currencyId = str4;
        }
        if ((i & 32) == 0) {
            this.icon = "";
        } else {
            this.icon = str5;
        }
        if ((i & 64) == 0) {
            this.availableBalance = "";
        } else {
            this.availableBalance = str6;
        }
        if ((i & 128) == 0) {
            this.usdRate = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.usdRate = d;
        }
        if ((i & 256) == 0) {
            this.currency = "";
        } else {
            this.currency = str7;
        }
        if ((i & 512) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str8;
        }
        if ((i & 1024) == 0) {
            this.dexInfo = null;
        } else {
            this.dexInfo = dexInfoResponseBean;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(BaseCurrencyResponseBean baseCurrencyResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || baseCurrencyResponseBean.scale != 8) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, baseCurrencyResponseBean.scale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) baseCurrencyResponseBean.currencyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, baseCurrencyResponseBean.currencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) baseCurrencyResponseBean.nightIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, baseCurrencyResponseBean.nightIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) baseCurrencyResponseBean.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, baseCurrencyResponseBean.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) baseCurrencyResponseBean.currencyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, baseCurrencyResponseBean.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) baseCurrencyResponseBean.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, baseCurrencyResponseBean.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) baseCurrencyResponseBean.availableBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, baseCurrencyResponseBean.availableBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || Double.compare(baseCurrencyResponseBean.usdRate, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 7, baseCurrencyResponseBean.usdRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) baseCurrencyResponseBean.currency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, baseCurrencyResponseBean.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) baseCurrencyResponseBean.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, baseCurrencyResponseBean.displayName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && baseCurrencyResponseBean.dexInfo == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, DexInfoResponseBean$$serializer.INSTANCE, baseCurrencyResponseBean.dexInfo);
    }

    public BaseCurrencyResponseBean(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, double d, @NotNull String str7, @NotNull String str8, DexInfoResponseBean dexInfoResponseBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        this.scale = i;
        this.currencyName = str;
        this.nightIcon = str2;
        this.symbol = str3;
        this.currencyId = str4;
        this.icon = str5;
        this.availableBalance = str6;
        this.usdRate = d;
        this.currency = str7;
        this.displayName = str8;
        this.dexInfo = dexInfoResponseBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0071: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (8 int) : (r14v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001b: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0023: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002b: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0033: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x003b: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003f: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r21v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0044: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004c: ARITH (r26v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (""))
  (wrap:com.okinc.crcore.coreapi.net.responsebean.bsc.DexInfoResponseBean:?: TERNARY null = ((wrap:int:0x0053: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.crcore.coreapi.net.responsebean.bsc.DexInfoResponseBean) : (r25v0 com.okinc.crcore.coreapi.net.responsebean.bsc.DexInfoResponseBean))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.bsc.DexInfoResponseBean):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.BaseCurrencyResponseBean.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, com.okinc.crcore.coreapi.net.responsebean.bsc.DexInfoResponseBean):void type: THIS */
    public /* synthetic */ BaseCurrencyResponseBean(int i, String str, String str2, String str3, String str4, String str5, String str6, double d, String str7, String str8, DexInfoResponseBean dexInfoResponseBean, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i2 & 256) != 0 ? "" : str7, (i2 & 512) == 0 ? str8 : "", (i2 & 1024) != 0 ? null : dexInfoResponseBean);
    }
}
