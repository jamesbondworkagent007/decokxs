package com.okinc.ok_kyc_core.data.eop;

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

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class VendorConfig implements Parcelable {
    public static final int CAPTURE_MODE_HORIZONTAL = 1;
    public static final int CAPTURE_MODE_VERTICAL = 2;
    public static final int CERTIFICATE_TYPE_DRIVING_LICENSE = 12;
    public static final int CERTIFICATE_TYPE_PASSPORT = 11;
    public static final int CERTIFICATE_TYPE_PASSPORT_ID_CARD = 13;
    private int captureMode;
    private int certificateType;
    private String certificateTypeOnboarding;
    private String countryOfResidence;
    private String dataCenter;
    private String document;
    private String highlightWords;
    private String msg;
    private String nfcServerUrl;
    private String nfcToken;
    private int nfcType;
    private int photoNumbers;
    private String scanTitle;
    private String source;
    private String sourceCode;
    private String subtitle;
    private String title;
    private String token;
    private String url;
    private int vendorType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<VendorConfig> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<VendorConfig> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VendorConfig createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new VendorConfig(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final VendorConfig[] newArray(int i) {
            return new VendorConfig[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public VendorConfig() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, 0, 0, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 1048575, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component10() {
        return this.certificateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component11() {
        return this.captureMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component12() {
        return this.photoNumbers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.certificateTypeOnboarding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component14() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component15() {
        return this.sourceCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component16() {
        return this.dataCenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component17() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component18() {
        return this.nfcToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component19() {
        return this.nfcServerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component20() {
        return this.nfcType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.scanTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.document;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.highlightWords;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.countryOfResidence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component9() {
        return this.vendorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final VendorConfig copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i, int i2, int i3, int i4, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, int i5) {
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
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        return new VendorConfig(str, str2, str3, str4, str5, str6, str7, str8, i, i2, i3, i4, str9, str10, str11, str12, str13, str14, str15, i5);
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
        if (!(obj instanceof VendorConfig)) {
            return false;
        }
        VendorConfig vendorConfig = (VendorConfig) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) vendorConfig.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) vendorConfig.subtitle) && Intrinsics.EZpvd((Object) this.scanTitle, (Object) vendorConfig.scanTitle) && Intrinsics.EZpvd((Object) this.document, (Object) vendorConfig.document) && Intrinsics.EZpvd((Object) this.msg, (Object) vendorConfig.msg) && Intrinsics.EZpvd((Object) this.highlightWords, (Object) vendorConfig.highlightWords) && Intrinsics.EZpvd((Object) this.url, (Object) vendorConfig.url) && Intrinsics.EZpvd((Object) this.countryOfResidence, (Object) vendorConfig.countryOfResidence) && this.vendorType == vendorConfig.vendorType && this.certificateType == vendorConfig.certificateType && this.captureMode == vendorConfig.captureMode && this.photoNumbers == vendorConfig.photoNumbers && Intrinsics.EZpvd((Object) this.certificateTypeOnboarding, (Object) vendorConfig.certificateTypeOnboarding) && Intrinsics.EZpvd((Object) this.source, (Object) vendorConfig.source) && Intrinsics.EZpvd((Object) this.sourceCode, (Object) vendorConfig.sourceCode) && Intrinsics.EZpvd((Object) this.dataCenter, (Object) vendorConfig.dataCenter) && Intrinsics.EZpvd((Object) this.token, (Object) vendorConfig.token) && Intrinsics.EZpvd((Object) this.nfcToken, (Object) vendorConfig.nfcToken) && Intrinsics.EZpvd((Object) this.nfcServerUrl, (Object) vendorConfig.nfcServerUrl) && this.nfcType == vendorConfig.nfcType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCaptureMode() {
        return this.captureMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCertificateType() {
        return this.certificateType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCertificateTypeOnboarding() {
        return this.certificateTypeOnboarding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountryOfResidence() {
        return this.countryOfResidence;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDataCenter() {
        return this.dataCenter;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDocument() {
        return this.document;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHighlightWords() {
        return this.highlightWords;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNfcServerUrl() {
        return this.nfcServerUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNfcToken() {
        return this.nfcToken;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getNfcType() {
        return this.nfcType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getPhotoNumbers() {
        return this.photoNumbers;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getScanTitle() {
        return this.scanTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSource() {
        return this.source;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSourceCode() {
        return this.sourceCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToken() {
        return this.token;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getVendorType() {
        return this.vendorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((this.title.hashCode() * 31) + this.subtitle.hashCode()) * 31) + this.scanTitle.hashCode()) * 31) + this.document.hashCode()) * 31) + this.msg.hashCode()) * 31) + this.highlightWords.hashCode()) * 31) + this.url.hashCode()) * 31) + this.countryOfResidence.hashCode()) * 31) + Integer.hashCode(this.vendorType)) * 31) + Integer.hashCode(this.certificateType)) * 31) + Integer.hashCode(this.captureMode)) * 31) + Integer.hashCode(this.photoNumbers)) * 31) + this.certificateTypeOnboarding.hashCode()) * 31) + this.source.hashCode()) * 31) + this.sourceCode.hashCode()) * 31) + this.dataCenter.hashCode()) * 31) + this.token.hashCode()) * 31) + this.nfcToken.hashCode()) * 31) + this.nfcServerUrl.hashCode()) * 31) + Integer.hashCode(this.nfcType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCaptureMode(int i) {
        this.captureMode = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCertificateType(int i) {
        this.certificateType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCertificateTypeOnboarding(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.certificateTypeOnboarding = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCountryOfResidence(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.countryOfResidence = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDataCenter(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.dataCenter = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setDocument(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.document = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHighlightWords(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.highlightWords = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMsg(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.msg = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNfcServerUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nfcServerUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNfcToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.nfcToken = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNfcType(int i) {
        this.nfcType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPhotoNumbers(int i) {
        this.photoNumbers = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setScanTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.scanTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSource(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.source = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSourceCode(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.sourceCode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubtitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.subtitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToken(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.token = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVendorType(int i) {
        this.vendorType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "VendorConfig(title=" + this.title + ", subtitle=" + this.subtitle + ", scanTitle=" + this.scanTitle + ", document=" + this.document + ", msg=" + this.msg + ", highlightWords=" + this.highlightWords + ", url=" + this.url + ", countryOfResidence=" + this.countryOfResidence + ", vendorType=" + this.vendorType + ", certificateType=" + this.certificateType + ", captureMode=" + this.captureMode + ", photoNumbers=" + this.photoNumbers + ", certificateTypeOnboarding=" + this.certificateTypeOnboarding + ", source=" + this.source + ", sourceCode=" + this.sourceCode + ", dataCenter=" + this.dataCenter + ", token=" + this.token + ", nfcToken=" + this.nfcToken + ", nfcServerUrl=" + this.nfcServerUrl + ", nfcType=" + this.nfcType + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.scanTitle);
        parcel.writeString(this.document);
        parcel.writeString(this.msg);
        parcel.writeString(this.highlightWords);
        parcel.writeString(this.url);
        parcel.writeString(this.countryOfResidence);
        parcel.writeInt(this.vendorType);
        parcel.writeInt(this.certificateType);
        parcel.writeInt(this.captureMode);
        parcel.writeInt(this.photoNumbers);
        parcel.writeString(this.certificateTypeOnboarding);
        parcel.writeString(this.source);
        parcel.writeString(this.sourceCode);
        parcel.writeString(this.dataCenter);
        parcel.writeString(this.token);
        parcel.writeString(this.nfcToken);
        parcel.writeString(this.nfcServerUrl);
        parcel.writeInt(this.nfcType);
    }

    public /* synthetic */ VendorConfig(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i2, int i3, int i4, int i5, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i6, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str2;
        }
        if ((i & 4) == 0) {
            this.scanTitle = "";
        } else {
            this.scanTitle = str3;
        }
        if ((i & 8) == 0) {
            this.document = "";
        } else {
            this.document = str4;
        }
        if ((i & 16) == 0) {
            this.msg = "";
        } else {
            this.msg = str5;
        }
        if ((i & 32) == 0) {
            this.highlightWords = "";
        } else {
            this.highlightWords = str6;
        }
        if ((i & 64) == 0) {
            this.url = "";
        } else {
            this.url = str7;
        }
        if ((i & 128) == 0) {
            this.countryOfResidence = "";
        } else {
            this.countryOfResidence = str8;
        }
        if ((i & 256) == 0) {
            this.vendorType = 1;
        } else {
            this.vendorType = i2;
        }
        this.certificateType = (i & 512) == 0 ? 11 : i3;
        if ((i & 1024) == 0) {
            this.captureMode = 1;
        } else {
            this.captureMode = i4;
        }
        if ((i & 2048) == 0) {
            this.photoNumbers = 0;
        } else {
            this.photoNumbers = i5;
        }
        if ((i & 4096) == 0) {
            this.certificateTypeOnboarding = "";
        } else {
            this.certificateTypeOnboarding = str9;
        }
        if ((i & 8192) == 0) {
            this.source = "";
        } else {
            this.source = str10;
        }
        if ((i & 16384) == 0) {
            this.sourceCode = "";
        } else {
            this.sourceCode = str11;
        }
        if ((32768 & i) == 0) {
            this.dataCenter = "";
        } else {
            this.dataCenter = str12;
        }
        if ((65536 & i) == 0) {
            this.token = "";
        } else {
            this.token = str13;
        }
        if ((131072 & i) == 0) {
            this.nfcToken = "";
        } else {
            this.nfcToken = str14;
        }
        if ((262144 & i) == 0) {
            this.nfcServerUrl = "";
        } else {
            this.nfcServerUrl = str15;
        }
        if ((i & 524288) == 0) {
            this.nfcType = 0;
        } else {
            this.nfcType = i6;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(VendorConfig vendorConfig, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) vendorConfig.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, vendorConfig.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) vendorConfig.subtitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, vendorConfig.subtitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) vendorConfig.scanTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, vendorConfig.scanTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) vendorConfig.document, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, vendorConfig.document);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) vendorConfig.msg, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, vendorConfig.msg);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) vendorConfig.highlightWords, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, vendorConfig.highlightWords);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) vendorConfig.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 6, vendorConfig.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 7) || !Intrinsics.EZpvd((Object) vendorConfig.countryOfResidence, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 7, vendorConfig.countryOfResidence);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) || vendorConfig.vendorType != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 8, vendorConfig.vendorType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 9) || vendorConfig.certificateType != 11) {
            compositeEncoder.encodeIntElement(serialDescriptor, 9, vendorConfig.certificateType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 10) || vendorConfig.captureMode != 1) {
            compositeEncoder.encodeIntElement(serialDescriptor, 10, vendorConfig.captureMode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 11) || vendorConfig.photoNumbers != 0) {
            compositeEncoder.encodeIntElement(serialDescriptor, 11, vendorConfig.photoNumbers);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 12) || !Intrinsics.EZpvd((Object) vendorConfig.certificateTypeOnboarding, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 12, vendorConfig.certificateTypeOnboarding);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 13) || !Intrinsics.EZpvd((Object) vendorConfig.source, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 13, vendorConfig.source);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 14) || !Intrinsics.EZpvd((Object) vendorConfig.sourceCode, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 14, vendorConfig.sourceCode);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 15) || !Intrinsics.EZpvd((Object) vendorConfig.dataCenter, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 15, vendorConfig.dataCenter);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 16) || !Intrinsics.EZpvd((Object) vendorConfig.token, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 16, vendorConfig.token);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 17) || !Intrinsics.EZpvd((Object) vendorConfig.nfcToken, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 17, vendorConfig.nfcToken);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 18) || !Intrinsics.EZpvd((Object) vendorConfig.nfcServerUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 18, vendorConfig.nfcServerUrl);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 19) && vendorConfig.nfcType == 0) {
            return;
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 19, vendorConfig.nfcType);
    }

    public VendorConfig(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull String str8, int i, int i2, int i3, int i4, @NotNull String str9, @NotNull String str10, @NotNull String str11, @NotNull String str12, @NotNull String str13, @NotNull String str14, @NotNull String str15, int i5) {
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
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        this.title = str;
        this.subtitle = str2;
        this.scanTitle = str3;
        this.document = str4;
        this.msg = str5;
        this.highlightWords = str6;
        this.url = str7;
        this.countryOfResidence = str8;
        this.vendorType = i;
        this.certificateType = i2;
        this.captureMode = i3;
        this.photoNumbers = i4;
        this.certificateTypeOnboarding = str9;
        this.source = str10;
        this.sourceCode = str11;
        this.dataCenter = str12;
        this.token = str13;
        this.nfcToken = str14;
        this.nfcServerUrl = str15;
        this.nfcType = i5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00e1: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r42v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r42v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r42v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0024: ARITH (r42v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r26v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002c: ARITH (r42v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0034: ARITH (r42v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r28v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003c: ARITH (r42v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r29v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0044: ARITH (r42v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r30v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x004d: ARITH (r42v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (11 int) : (r31v0 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0056: ARITH (r42v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r32v0 int) : (1 int))
  (wrap:int:?: TERNARY null = ((wrap:int:0x005d: ARITH (r42v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r33v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0065: ARITH (r42v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? ("") : (r34v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x006d: ARITH (r42v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? ("") : (r35v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0077: ARITH (r42v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? ("") : (r36v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0083: ARITH (r42v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? ("") : (r37v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x008e: ARITH (r42v0 int) & (65536 int) A[WRAPPED]) != (0 int)) ? ("") : (r38v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0099: ARITH (r42v0 int) & (131072 int) A[WRAPPED]) != (0 int)) ? ("") : (r39v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x00a4: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? ("") : (r40v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x00af: ARITH (r42v0 int) & (524288 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r41v0 int))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:11) call: com.okinc.ok_kyc_core.data.eop.VendorConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, int, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ VendorConfig(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, int i2, int i3, int i4, String str9, String str10, String str11, String str12, String str13, String str14, String str15, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? "" : str2, (i6 & 4) != 0 ? "" : str3, (i6 & 8) != 0 ? "" : str4, (i6 & 16) != 0 ? "" : str5, (i6 & 32) != 0 ? "" : str6, (i6 & 64) != 0 ? "" : str7, (i6 & 128) != 0 ? "" : str8, (i6 & 256) != 0 ? 1 : i, (i6 & 512) != 0 ? 11 : i2, (i6 & 1024) == 0 ? i3 : 1, (i6 & 2048) != 0 ? 0 : i4, (i6 & 4096) != 0 ? "" : str9, (i6 & 8192) != 0 ? "" : str10, (i6 & 16384) != 0 ? "" : str11, (i6 & 32768) != 0 ? "" : str12, (i6 & 65536) != 0 ? "" : str13, (i6 & 131072) != 0 ? "" : str14, (i6 & 262144) != 0 ? "" : str15, (i6 & 524288) != 0 ? 0 : i5);
    }

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.eop.VendorConfig.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<VendorConfig> serializer() {
            return VendorConfig$$serializer.INSTANCE;
        }
    }
}
