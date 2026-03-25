package com.okinc.crcore.shared.net.responsebean.bsc;

import androidx.camera.video.AudioStats;
import com.okinc.crcore.coreapi.net.responsebean.bsc.BuySellCurrencyResponseBean;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Serializable
public final class BuySellCurrencyBean {
    private final String availableBalance;
    private final boolean channelAvailable;
    private final List<String> countryNames;
    private final String currency;
    private final String currencyId;
    private final String currencyName;
    private final String displayName;
    private final boolean hidden;
    private final String icon;
    private final String nightIcon;
    private final int priceScale;
    private final List<Integer> quickAmountList;
    private final int scale;
    private final String symbol;
    private final String tradeRange;
    private final double usdRate;
    private final String valuation;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, new ArrayListSerializer(StringSerializer.INSTANCE), null, null, null, null, null, null, null, null, new ArrayListSerializer(IntSerializer.INSTANCE), null, null, null, null, null};

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BuySellCurrencyBean() {
        this((String) null, false, (List) null, (String) null, (String) null, (String) null, (String) null, false, (String) null, (String) null, 0, (List) null, 0, (String) null, (String) null, AudioStats.AUDIO_AMPLITUDE_NONE, (String) null, 131071, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.availableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component10() {
        return this.nightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.priceScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component12() {
        return this.quickAmountList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component13() {
        return this.scale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.tradeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double component16() {
        return this.usdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.channelAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component3() {
        return this.countryNames;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.currency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.currencyName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component8() {
        return this.hidden;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.icon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellCurrencyBean copy(@NotNull String str, boolean z, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z2, @NotNull String str6, @NotNull String str7, int i, @NotNull List<Integer> list2, int i2, @NotNull String str8, @NotNull String str9, double d, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        return new BuySellCurrencyBean(str, z, list, str2, str3, str4, str5, z2, str6, str7, i, list2, i2, str8, str9, d, str10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuySellCurrencyBean)) {
            return false;
        }
        BuySellCurrencyBean buySellCurrencyBean = (BuySellCurrencyBean) obj;
        return Intrinsics.EZpvd((Object) this.availableBalance, (Object) buySellCurrencyBean.availableBalance) && this.channelAvailable == buySellCurrencyBean.channelAvailable && Intrinsics.EZpvd(this.countryNames, buySellCurrencyBean.countryNames) && Intrinsics.EZpvd((Object) this.currency, (Object) buySellCurrencyBean.currency) && Intrinsics.EZpvd((Object) this.currencyId, (Object) buySellCurrencyBean.currencyId) && Intrinsics.EZpvd((Object) this.currencyName, (Object) buySellCurrencyBean.currencyName) && Intrinsics.EZpvd((Object) this.displayName, (Object) buySellCurrencyBean.displayName) && this.hidden == buySellCurrencyBean.hidden && Intrinsics.EZpvd((Object) this.icon, (Object) buySellCurrencyBean.icon) && Intrinsics.EZpvd((Object) this.nightIcon, (Object) buySellCurrencyBean.nightIcon) && this.priceScale == buySellCurrencyBean.priceScale && Intrinsics.EZpvd(this.quickAmountList, buySellCurrencyBean.quickAmountList) && this.scale == buySellCurrencyBean.scale && Intrinsics.EZpvd((Object) this.symbol, (Object) buySellCurrencyBean.symbol) && Intrinsics.EZpvd((Object) this.tradeRange, (Object) buySellCurrencyBean.tradeRange) && Double.compare(this.usdRate, buySellCurrencyBean.usdRate) == 0 && Intrinsics.EZpvd((Object) this.valuation, (Object) buySellCurrencyBean.valuation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAvailableBalance() {
        return this.availableBalance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getChannelAvailable() {
        return this.channelAvailable;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getCountryNames() {
        return this.countryNames;
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
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHidden() {
        return this.hidden;
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
    public final int getPriceScale() {
        return this.priceScale;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getQuickAmountList() {
        return this.quickAmountList;
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
    public final String getTradeRange() {
        return this.tradeRange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getUsdRate() {
        return this.usdRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuation() {
        return this.valuation;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.availableBalance.hashCode() * 31) + Boolean.hashCode(this.channelAvailable)) * 31) + this.countryNames.hashCode()) * 31) + this.currency.hashCode()) * 31) + this.currencyId.hashCode()) * 31) + this.currencyName.hashCode()) * 31) + this.displayName.hashCode()) * 31) + Boolean.hashCode(this.hidden)) * 31) + this.icon.hashCode()) * 31) + this.nightIcon.hashCode()) * 31) + Integer.hashCode(this.priceScale)) * 31) + this.quickAmountList.hashCode()) * 31) + Integer.hashCode(this.scale)) * 31) + this.symbol.hashCode()) * 31) + this.tradeRange.hashCode()) * 31) + Double.hashCode(this.usdRate)) * 31) + this.valuation.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BuySellCurrencyBean(availableBalance=" + this.availableBalance + ", channelAvailable=" + this.channelAvailable + ", countryNames=" + this.countryNames + ", currency=" + this.currency + ", currencyId=" + this.currencyId + ", currencyName=" + this.currencyName + ", displayName=" + this.displayName + ", hidden=" + this.hidden + ", icon=" + this.icon + ", nightIcon=" + this.nightIcon + ", priceScale=" + this.priceScale + ", quickAmountList=" + this.quickAmountList + ", scale=" + this.scale + ", symbol=" + this.symbol + ", tradeRange=" + this.tradeRange + ", usdRate=" + this.usdRate + ", valuation=" + this.valuation + ")";
    }

    public /* synthetic */ BuySellCurrencyBean(int i, String str, boolean z, List list, String str2, String str3, String str4, String str5, boolean z2, String str6, String str7, int i2, List list2, int i3, String str8, String str9, double d, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.availableBalance = "";
        } else {
            this.availableBalance = str;
        }
        if ((i & 2) == 0) {
            this.channelAvailable = false;
        } else {
            this.channelAvailable = z;
        }
        this.countryNames = (i & 4) == 0 ? yDY.AhwBna() : list;
        if ((i & 8) == 0) {
            this.currency = "";
        } else {
            this.currency = str2;
        }
        if ((i & 16) == 0) {
            this.currencyId = "";
        } else {
            this.currencyId = str3;
        }
        if ((i & 32) == 0) {
            this.currencyName = "";
        } else {
            this.currencyName = str4;
        }
        if ((i & 64) == 0) {
            this.displayName = "";
        } else {
            this.displayName = str5;
        }
        if ((i & 128) == 0) {
            this.hidden = false;
        } else {
            this.hidden = z2;
        }
        if ((i & 256) == 0) {
            this.icon = "";
        } else {
            this.icon = str6;
        }
        if ((i & 512) == 0) {
            this.nightIcon = "";
        } else {
            this.nightIcon = str7;
        }
        if ((i & 1024) == 0) {
            this.priceScale = 0;
        } else {
            this.priceScale = i2;
        }
        this.quickAmountList = (i & 2048) == 0 ? yDY.AhwBna() : list2;
        if ((i & 4096) == 0) {
            this.scale = 0;
        } else {
            this.scale = i3;
        }
        if ((i & 8192) == 0) {
            this.symbol = "";
        } else {
            this.symbol = str8;
        }
        if ((i & 16384) == 0) {
            this.tradeRange = "";
        } else {
            this.tradeRange = str9;
        }
        this.usdRate = (32768 & i) == 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d;
        if ((i & 65536) == 0) {
            this.valuation = "";
        } else {
            this.valuation = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(BuySellCurrencyBean buySellCurrencyBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) buySellCurrencyBean.availableBalance, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, buySellCurrencyBean.availableBalance);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || buySellCurrencyBean.channelAvailable) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 1, buySellCurrencyBean.channelAvailable);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd(buySellCurrencyBean.countryNames, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, kSerializerArr[2], buySellCurrencyBean.countryNames);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) buySellCurrencyBean.currency, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, buySellCurrencyBean.currency);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) buySellCurrencyBean.currencyId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, buySellCurrencyBean.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) buySellCurrencyBean.currencyName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, buySellCurrencyBean.currencyName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) buySellCurrencyBean.displayName, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, buySellCurrencyBean.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || buySellCurrencyBean.hidden) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, buySellCurrencyBean.hidden);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || !Intrinsics.EZpvd((Object) buySellCurrencyBean.icon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 8, buySellCurrencyBean.icon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || !Intrinsics.EZpvd((Object) buySellCurrencyBean.nightIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 9, buySellCurrencyBean.nightIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || buySellCurrencyBean.priceScale != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, buySellCurrencyBean.priceScale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || !Intrinsics.EZpvd(buySellCurrencyBean.quickAmountList, yDY.AhwBna())) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 11, kSerializerArr[11], buySellCurrencyBean.quickAmountList);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || buySellCurrencyBean.scale != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 12, buySellCurrencyBean.scale);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) buySellCurrencyBean.symbol, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, buySellCurrencyBean.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) buySellCurrencyBean.tradeRange, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, buySellCurrencyBean.tradeRange);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || Double.compare(buySellCurrencyBean.usdRate, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 15, buySellCurrencyBean.usdRate);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && Intrinsics.EZpvd((Object) buySellCurrencyBean.valuation, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 16, buySellCurrencyBean.valuation);
    }

    public BuySellCurrencyBean(@NotNull String str, boolean z, @NotNull List<String> list, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, boolean z2, @NotNull String str6, @NotNull String str7, int i, @NotNull List<Integer> list2, int i2, @NotNull String str8, @NotNull String str9, double d, @NotNull String str10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        this.availableBalance = str;
        this.channelAvailable = z;
        this.countryNames = list;
        this.currency = str2;
        this.currencyId = str3;
        this.currencyName = str4;
        this.displayName = str5;
        this.hidden = z2;
        this.icon = str6;
        this.nightIcon = str7;
        this.priceScale = i;
        this.quickAmountList = list2;
        this.scale = i2;
        this.symbol = str8;
        this.tradeRange = str9;
        this.usdRate = d;
        this.valuation = str10;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00c0: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r38v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x000c: ARITH (r38v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0015: ARITH (r38v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0019: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:12)) : (r22v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r38v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0028: ARITH (r38v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0030: ARITH (r38v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0038: ARITH (r38v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0040: ARITH (r38v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? false : (r27v0 boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0048: ARITH (r38v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0050: ARITH (r38v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0058: ARITH (r38v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r30v0 int))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0060: ARITH (r38v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0064: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:21)) : (r31v0 java.util.List))
  (wrap:int:?: TERNARY null = ((wrap:int:0x006b: ARITH (r38v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r32v0 int) : (0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0072: ARITH (r38v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r33v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x007c: ARITH (r38v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:double:?: TERNARY null = ((wrap:int:0x0088: ARITH (r38v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x008c: SGET  A[WRAPPED] androidx.camera.video.AudioStats.AUDIO_AMPLITUDE_NONE double) : (r35v0 double))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0093: ARITH (r38v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
 A[MD:(java.lang.String, boolean, java.util.List<java.lang.String>, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.util.List<java.lang.Integer>, int, java.lang.String, java.lang.String, double, java.lang.String):void (m)] (LINE:9) call: com.okinc.crcore.shared.net.responsebean.bsc.BuySellCurrencyBean.<init>(java.lang.String, boolean, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, int, java.util.List, int, java.lang.String, java.lang.String, double, java.lang.String):void type: THIS */
    public /* synthetic */ BuySellCurrencyBean(String str, boolean z, List list, String str2, String str3, String str4, String str5, boolean z2, String str6, String str7, int i, List list2, int i2, String str8, String str9, double d, String str10, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? false : z, (i3 & 4) != 0 ? yDY.AhwBna() : list, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? "" : str4, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? false : z2, (i3 & 256) != 0 ? "" : str6, (i3 & 512) != 0 ? "" : str7, (i3 & 1024) != 0 ? 0 : i, (i3 & 2048) != 0 ? yDY.AhwBna() : list2, (i3 & 4096) == 0 ? i2 : 0, (i3 & 8192) != 0 ? "" : str8, (i3 & 16384) != 0 ? "" : str9, (i3 & 32768) != 0 ? AudioStats.AUDIO_AMPLITUDE_NONE : d, (i3 & 65536) != 0 ? "" : str10);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.bsc.BuySellCurrencyBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<BuySellCurrencyBean> serializer() {
            return BuySellCurrencyBean$$serializer.INSTANCE;
        }

        public final BuySellCurrencyBean AEQbTJ(@NotNull BuySellCurrencyResponseBean buySellCurrencyResponseBean) {
            Intrinsics.checkNotNullParameter(buySellCurrencyResponseBean, "");
            return new BuySellCurrencyBean(buySellCurrencyResponseBean.getAvailableBalance(), buySellCurrencyResponseBean.getChannelAvailable(), buySellCurrencyResponseBean.getCountryNames(), buySellCurrencyResponseBean.getCurrency(), buySellCurrencyResponseBean.getCurrencyId(), buySellCurrencyResponseBean.getCurrencyName(), buySellCurrencyResponseBean.getDisplayName(), buySellCurrencyResponseBean.getHidden(), buySellCurrencyResponseBean.getIcon(), buySellCurrencyResponseBean.getNightIcon(), buySellCurrencyResponseBean.getPriceScale(), buySellCurrencyResponseBean.getQuickAmountList(), buySellCurrencyResponseBean.getScale(), buySellCurrencyResponseBean.getSymbol(), buySellCurrencyResponseBean.getTradeRange(), buySellCurrencyResponseBean.getUsdRate(), buySellCurrencyResponseBean.getValuation());
        }
    }
}
