package com.okinc.crcore.shared.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.AudioStats;
import com.okinc.crcore.coreapi.net.responsebean.bsc.BaseCurrencyResponseBean;
import com.okinc.crcore.coreapi.net.responsebean.bsc.DexInfoResponseBean;
import com.okinc.crcore.shared.net.responsebean.bsc.DexInfoBean;
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
public final class BaseCurrencyBean implements Parcelable {
    public static final int $stable = 0;
    private final String availableBalance;
    private final String currency;
    private final String currencyId;
    private final String currencyName;
    private final DexInfoBean dexInfoBean;
    private final String displayName;
    private final String icon;
    private final String nightIcon;
    private final int scale;
    private final String symbol;
    private final double usdRate;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<BaseCurrencyBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BaseCurrencyBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BaseCurrencyBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BaseCurrencyBean(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString(), parcel.readString(), DexInfoBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BaseCurrencyBean[] newArray(int i) {
            return new BaseCurrencyBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BaseCurrencyBean() {
        this(0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, (String) null, (DexInfoBean) null, 2047, (DefaultConstructorMarker) null);
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
    public final DexInfoBean component11() {
        return this.dexInfoBean;
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
    public final BaseCurrencyBean copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, double d, @NotNull String str7, @NotNull String str8, @NotNull DexInfoBean dexInfoBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(dexInfoBean, "");
        return new BaseCurrencyBean(i, str, str2, str3, str4, str5, str6, d, str7, str8, dexInfoBean);
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
        if (!(obj instanceof BaseCurrencyBean)) {
            return false;
        }
        BaseCurrencyBean baseCurrencyBean = (BaseCurrencyBean) obj;
        return this.scale == baseCurrencyBean.scale && Intrinsics.EZpvd((Object) this.currencyName, (Object) baseCurrencyBean.currencyName) && Intrinsics.EZpvd((Object) this.nightIcon, (Object) baseCurrencyBean.nightIcon) && Intrinsics.EZpvd((Object) this.symbol, (Object) baseCurrencyBean.symbol) && Intrinsics.EZpvd((Object) this.currencyId, (Object) baseCurrencyBean.currencyId) && Intrinsics.EZpvd((Object) this.icon, (Object) baseCurrencyBean.icon) && Intrinsics.EZpvd((Object) this.availableBalance, (Object) baseCurrencyBean.availableBalance) && Double.compare(this.usdRate, baseCurrencyBean.usdRate) == 0 && Intrinsics.EZpvd((Object) this.currency, (Object) baseCurrencyBean.currency) && Intrinsics.EZpvd((Object) this.displayName, (Object) baseCurrencyBean.displayName) && Intrinsics.EZpvd(this.dexInfoBean, baseCurrencyBean.dexInfoBean);
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
    public final DexInfoBean getDexInfoBean() {
        return this.dexInfoBean;
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
        return (((((((((((((((((((Integer.hashCode(this.scale) * 31) + this.currencyName.hashCode()) * 31) + this.nightIcon.hashCode()) * 31) + this.symbol.hashCode()) * 31) + this.currencyId.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.availableBalance.hashCode()) * 31) + Double.hashCode(this.usdRate)) * 31) + this.currency.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.dexInfoBean.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BaseCurrencyBean(scale=" + this.scale + ", currencyName=" + this.currencyName + ", nightIcon=" + this.nightIcon + ", symbol=" + this.symbol + ", currencyId=" + this.currencyId + ", icon=" + this.icon + ", availableBalance=" + this.availableBalance + ", usdRate=" + this.usdRate + ", currency=" + this.currency + ", displayName=" + this.displayName + ", dexInfoBean=" + this.dexInfoBean + ")";
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
        this.dexInfoBean.writeToParcel(parcel, i);
    }

    public /* synthetic */ BaseCurrencyBean(int i, int i2, String str, String str2, String str3, String str4, String str5, String str6, double d, String str7, String str8, DexInfoBean dexInfoBean, SerializationConstructorMarker serializationConstructorMarker) {
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
        this.usdRate = (i & 128) == 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d;
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
        this.dexInfoBean = (i & 1024) == 0 ? new DexInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, false, 16383, (DefaultConstructorMarker) null) : dexInfoBean;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(BaseCurrencyBean baseCurrencyBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || baseCurrencyBean.scale != 8) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, baseCurrencyBean.scale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) baseCurrencyBean.currencyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, baseCurrencyBean.currencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) baseCurrencyBean.nightIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, baseCurrencyBean.nightIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) baseCurrencyBean.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, baseCurrencyBean.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) baseCurrencyBean.currencyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, baseCurrencyBean.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) baseCurrencyBean.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, baseCurrencyBean.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) baseCurrencyBean.availableBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, baseCurrencyBean.availableBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || Double.compare(baseCurrencyBean.usdRate, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 7, baseCurrencyBean.usdRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) baseCurrencyBean.currency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, baseCurrencyBean.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) baseCurrencyBean.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, baseCurrencyBean.displayName);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) && Intrinsics.EZpvd(baseCurrencyBean.dexInfoBean, new DexInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, false, 16383, (DefaultConstructorMarker) null))) {
            return;
        }
        compositeEncoder.encodeSerializableElement(serialDescriptor, 10, DexInfoBean$$serializer.INSTANCE, baseCurrencyBean.dexInfoBean);
    }

    public BaseCurrencyBean(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, double d, @NotNull String str7, @NotNull String str8, @NotNull DexInfoBean dexInfoBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(dexInfoBean, "");
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
        this.dexInfoBean = dexInfoBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0097: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (8 int) : (r30v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r31v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r42v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r32v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r42v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r42v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x003d: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0041: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r37v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0046: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004e: ARITH (r42v0 int) & (512 int) A[WRAPPED]) == (0 int)) ? (r40v0 java.lang.String) : (""))
  (wrap:com.okinc.crcore.shared.net.responsebean.bsc.DexInfoBean:?: TERNARY null = ((wrap:int:0x0055: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0079: CONSTRUCTOR 
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (0 int)
  (0 int)
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  (wrap:java.lang.String:?: CAST (java.lang.String) (null java.lang.String))
  false
  (16383 int)
  (wrap:kotlin.jvm.internal.DefaultConstructorMarker:?: CAST (kotlin.jvm.internal.DefaultConstructorMarker) (null kotlin.jvm.internal.DefaultConstructorMarker))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void (m), WRAPPED] (LINE:24) call: com.okinc.crcore.shared.net.responsebean.bsc.DexInfoBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void type: CONSTRUCTOR) : (r41v0 com.okinc.crcore.shared.net.responsebean.bsc.DexInfoBean))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, com.okinc.crcore.shared.net.responsebean.bsc.DexInfoBean):void (m)] (LINE:13) call: com.okinc.crcore.shared.net.responsebean.bsc.BaseCurrencyBean.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double, java.lang.String, java.lang.String, com.okinc.crcore.shared.net.responsebean.bsc.DexInfoBean):void type: THIS */
    public /* synthetic */ BaseCurrencyBean(int i, String str, String str2, String str3, String str4, String str5, String str6, double d, String str7, String str8, DexInfoBean dexInfoBean, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? "" : str3, (i2 & 16) != 0 ? "" : str4, (i2 & 32) != 0 ? "" : str5, (i2 & 64) != 0 ? "" : str6, (i2 & 128) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i2 & 256) != 0 ? "" : str7, (i2 & 512) == 0 ? str8 : "", (i2 & 1024) != 0 ? new DexInfoBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, false, 16383, (DefaultConstructorMarker) null) : dexInfoBean);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.BaseCurrencyBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BaseCurrencyBean> serializer() {
            return BaseCurrencyBean$$serializer.INSTANCE;
        }

        public final BaseCurrencyBean copydefault(@NotNull BaseCurrencyResponseBean baseCurrencyResponseBean) {
            Intrinsics.checkNotNullParameter(baseCurrencyResponseBean, "");
            int scale = baseCurrencyResponseBean.getScale();
            String currencyName = baseCurrencyResponseBean.getCurrencyName();
            String nightIcon = baseCurrencyResponseBean.getNightIcon();
            String symbol = baseCurrencyResponseBean.getSymbol();
            String currencyId = baseCurrencyResponseBean.getCurrencyId();
            String icon = baseCurrencyResponseBean.getIcon();
            String availableBalance = baseCurrencyResponseBean.getAvailableBalance();
            double usdRate = baseCurrencyResponseBean.getUsdRate();
            String currency = baseCurrencyResponseBean.getCurrency();
            String displayName = baseCurrencyResponseBean.getDisplayName();
            DexInfoBean.Companion companion = DexInfoBean.Companion;
            DexInfoResponseBean dexInfo = baseCurrencyResponseBean.getDexInfo();
            if (dexInfo == null) {
                dexInfo = new DexInfoResponseBean((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (String) null, (String) null, false, 8191, (DefaultConstructorMarker) null);
            }
            return new BaseCurrencyBean(scale, currencyName, nightIcon, symbol, currencyId, icon, availableBalance, usdRate, currency, displayName, companion.OLrzqt(dexInfo));
        }
    }
}
