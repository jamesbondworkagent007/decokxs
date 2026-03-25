package com.okinc.assets.backend.api.model;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class AssetMaxApyEarnInfo {
    private String capitalTypeMsg;
    private String currencyFullName;
    private String currencyIcon;
    private Integer currencyId;
    private String period;
    private Integer productsType;
    private String projectIcon;
    private String projectName;
    private String projectType;
    private String rate;
    private Double rateRangeMax;
    private Double rateRangeMin;
    private Integer redeemDay;
    private Integer savingType;
    private Integer type;
    private String unit;
    private String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCapitalTypeMsg() {
        return this.capitalTypeMsg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyFullName() {
        return this.currencyFullName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCurrencyIcon() {
        return this.currencyIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getCurrencyId() {
        return this.currencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPeriod() {
        return this.period;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getProductsType() {
        return this.productsType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProjectIcon() {
        return this.projectIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProjectName() {
        return this.projectName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProjectType() {
        return this.projectType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRate() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getRateRangeMax() {
        return this.rateRangeMax;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Double getRateRangeMin() {
        return this.rateRangeMin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getRedeemDay() {
        return this.redeemDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSavingType() {
        return this.savingType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getType() {
        return this.type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUnit() {
        return this.unit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCapitalTypeMsg(String str) {
        this.capitalTypeMsg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyFullName(String str) {
        this.currencyFullName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyIcon(String str) {
        this.currencyIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyId(Integer num) {
        this.currencyId = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPeriod(String str) {
        this.period = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProductsType(Integer num) {
        this.productsType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProjectIcon(String str) {
        this.projectIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProjectName(String str) {
        this.projectName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setProjectType(String str) {
        this.projectType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRate(String str) {
        this.rate = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateRangeMax(Double d) {
        this.rateRangeMax = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRateRangeMin(Double d) {
        this.rateRangeMin = d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRedeemDay(Integer num) {
        this.redeemDay = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSavingType(Integer num) {
        this.savingType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setType(Integer num) {
        this.type = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUnit(String str) {
        this.unit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(String str) {
        this.url = str;
    }

    /* JADX INFO: loaded from: classes22.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.assets.backend.api.model.AssetMaxApyEarnInfo.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<AssetMaxApyEarnInfo> serializer() {
            return AssetMaxApyEarnInfo$$serializer.INSTANCE;
        }
    }

    public AssetMaxApyEarnInfo() {
    }

    public /* synthetic */ AssetMaxApyEarnInfo(int i, String str, String str2, String str3, Integer num, String str4, Integer num2, String str5, String str6, String str7, String str8, Double d, Double d2, Integer num3, Integer num4, Integer num5, String str9, String str10, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.capitalTypeMsg = null;
        } else {
            this.capitalTypeMsg = str;
        }
        if ((i & 2) == 0) {
            this.currencyFullName = null;
        } else {
            this.currencyFullName = str2;
        }
        if ((i & 4) == 0) {
            this.currencyIcon = null;
        } else {
            this.currencyIcon = str3;
        }
        if ((i & 8) == 0) {
            this.currencyId = null;
        } else {
            this.currencyId = num;
        }
        if ((i & 16) == 0) {
            this.period = null;
        } else {
            this.period = str4;
        }
        if ((i & 32) == 0) {
            this.productsType = null;
        } else {
            this.productsType = num2;
        }
        if ((i & 64) == 0) {
            this.projectIcon = null;
        } else {
            this.projectIcon = str5;
        }
        if ((i & 128) == 0) {
            this.projectName = null;
        } else {
            this.projectName = str6;
        }
        if ((i & 256) == 0) {
            this.projectType = null;
        } else {
            this.projectType = str7;
        }
        if ((i & 512) == 0) {
            this.rate = null;
        } else {
            this.rate = str8;
        }
        if ((i & 1024) == 0) {
            this.rateRangeMax = null;
        } else {
            this.rateRangeMax = d;
        }
        if ((i & 2048) == 0) {
            this.rateRangeMin = null;
        } else {
            this.rateRangeMin = d2;
        }
        if ((i & 4096) == 0) {
            this.redeemDay = null;
        } else {
            this.redeemDay = num3;
        }
        if ((i & 8192) == 0) {
            this.savingType = null;
        } else {
            this.savingType = num4;
        }
        if ((i & 16384) == 0) {
            this.type = null;
        } else {
            this.type = num5;
        }
        if ((32768 & i) == 0) {
            this.unit = null;
        } else {
            this.unit = str9;
        }
        if ((i & 65536) == 0) {
            this.url = null;
        } else {
            this.url = str10;
        }
    }

    public static final /* synthetic */ void write$Self$OKAssets_assets_pro_api(AssetMaxApyEarnInfo assetMaxApyEarnInfo, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || assetMaxApyEarnInfo.capitalTypeMsg != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, assetMaxApyEarnInfo.capitalTypeMsg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || assetMaxApyEarnInfo.currencyFullName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, assetMaxApyEarnInfo.currencyFullName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || assetMaxApyEarnInfo.currencyIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, assetMaxApyEarnInfo.currencyIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || assetMaxApyEarnInfo.currencyId != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, IntSerializer.INSTANCE, assetMaxApyEarnInfo.currencyId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || assetMaxApyEarnInfo.period != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, assetMaxApyEarnInfo.period);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || assetMaxApyEarnInfo.productsType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, IntSerializer.INSTANCE, assetMaxApyEarnInfo.productsType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || assetMaxApyEarnInfo.projectIcon != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, assetMaxApyEarnInfo.projectIcon);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || assetMaxApyEarnInfo.projectName != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, assetMaxApyEarnInfo.projectName);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || assetMaxApyEarnInfo.projectType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, assetMaxApyEarnInfo.projectType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || assetMaxApyEarnInfo.rate != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 9, StringSerializer.INSTANCE, assetMaxApyEarnInfo.rate);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || assetMaxApyEarnInfo.rateRangeMax != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 10, DoubleSerializer.INSTANCE, assetMaxApyEarnInfo.rateRangeMax);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || assetMaxApyEarnInfo.rateRangeMin != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 11, DoubleSerializer.INSTANCE, assetMaxApyEarnInfo.rateRangeMin);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || assetMaxApyEarnInfo.redeemDay != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 12, IntSerializer.INSTANCE, assetMaxApyEarnInfo.redeemDay);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || assetMaxApyEarnInfo.savingType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 13, IntSerializer.INSTANCE, assetMaxApyEarnInfo.savingType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || assetMaxApyEarnInfo.type != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 14, IntSerializer.INSTANCE, assetMaxApyEarnInfo.type);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || assetMaxApyEarnInfo.unit != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 15, StringSerializer.INSTANCE, assetMaxApyEarnInfo.unit);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) && assetMaxApyEarnInfo.url == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 16, StringSerializer.INSTANCE, assetMaxApyEarnInfo.url);
    }
}
