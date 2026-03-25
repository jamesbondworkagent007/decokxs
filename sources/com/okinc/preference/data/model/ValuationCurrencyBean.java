package com.okinc.preference.data.model;

import androidx.camera.video.AudioStats;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class ValuationCurrencyBean {
    private int currencyId;
    private String displayName;
    private int isDefault;
    private boolean isPremium;
    private String isoCode;
    private int precision;
    private String symbol;
    private double usdToThisRate;
    private double usdToThisRatePremium;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIsoCode() {
        return this.isoCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPrecision() {
        return this.precision;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSymbol() {
        return this.symbol;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getUsdToThisRate() {
        return this.usdToThisRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final double getUsdToThisRatePremium() {
        return this.usdToThisRatePremium;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int isDefault() {
        return this.isDefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isPremium() {
        return this.isPremium;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(int i) {
        this.currencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDefault(int i) {
        this.isDefault = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDisplayName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.displayName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIsoCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.isoCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPrecision(int i) {
        this.precision = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPremium(boolean z) {
        this.isPremium = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSymbol(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.symbol = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdToThisRate(double d) {
        this.usdToThisRate = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUsdToThisRatePremium(double d) {
        this.usdToThisRatePremium = d;
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.preference.data.model.ValuationCurrencyBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<ValuationCurrencyBean> serializer() {
            return ValuationCurrencyBean$$serializer.INSTANCE;
        }
    }

    public ValuationCurrencyBean() {
        this.isoCode = "USD";
        this.displayName = "USD";
        this.symbol = "$";
        this.usdToThisRate = 1.0d;
        this.precision = 2;
    }

    public /* synthetic */ ValuationCurrencyBean(int i, int i2, String str, String str2, int i3, String str3, double d, double d2, boolean z, int i4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.currencyId = 0;
        } else {
            this.currencyId = i2;
        }
        if ((i & 2) == 0) {
            this.isoCode = "USD";
        } else {
            this.isoCode = str;
        }
        if ((i & 4) == 0) {
            this.displayName = "USD";
        } else {
            this.displayName = str2;
        }
        if ((i & 8) == 0) {
            this.isDefault = 0;
        } else {
            this.isDefault = i3;
        }
        if ((i & 16) == 0) {
            this.symbol = "$";
        } else {
            this.symbol = str3;
        }
        if ((i & 32) == 0) {
            this.usdToThisRate = 1.0d;
        } else {
            this.usdToThisRate = d;
        }
        if ((i & 64) == 0) {
            this.usdToThisRatePremium = AudioStats.AUDIO_AMPLITUDE_NONE;
        } else {
            this.usdToThisRatePremium = d2;
        }
        if ((i & 128) == 0) {
            this.isPremium = false;
        } else {
            this.isPremium = z;
        }
        if ((i & 256) == 0) {
            this.precision = 2;
        } else {
            this.precision = i4;
        }
    }

    public static final /* synthetic */ void write$Self$OKPreference_preference_impl(ValuationCurrencyBean valuationCurrencyBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || valuationCurrencyBean.currencyId != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 0, valuationCurrencyBean.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) valuationCurrencyBean.isoCode, (Object) "USD")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, valuationCurrencyBean.isoCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) valuationCurrencyBean.displayName, (Object) "USD")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, valuationCurrencyBean.displayName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || valuationCurrencyBean.isDefault != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 3, valuationCurrencyBean.isDefault);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) valuationCurrencyBean.symbol, (Object) "$")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, valuationCurrencyBean.symbol);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || Double.compare(valuationCurrencyBean.usdToThisRate, 1.0d) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 5, valuationCurrencyBean.usdToThisRate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || Double.compare(valuationCurrencyBean.usdToThisRatePremium, AudioStats.AUDIO_AMPLITUDE_NONE) != 0) {
            compositeEncoder.encodeDoubleElement(serialDescriptor, 6, valuationCurrencyBean.usdToThisRatePremium);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || valuationCurrencyBean.isPremium) {
            compositeEncoder.encodeBooleanElement(serialDescriptor, 7, valuationCurrencyBean.isPremium);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && valuationCurrencyBean.precision == 2) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 8, valuationCurrencyBean.precision);
    }
}
