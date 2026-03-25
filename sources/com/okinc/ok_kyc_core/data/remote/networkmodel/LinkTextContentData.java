package com.okinc.ok_kyc_core.data.remote.networkmodel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Serializable
public final class LinkTextContentData implements Parcelable {
    private final CTAButton cta;
    private final String deeplink;
    private final String relativeUriType;
    private final LinkTextStyle style;
    private final String text;
    private final Boolean underline;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LinkTextContentData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LinkTextContentData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkTextContentData createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new LinkTextContentData(string, string2, string3, boolValueOf, parcel.readString(), parcel.readInt() == 0 ? null : LinkTextStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CTAButton.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkTextContentData[] newArray(int i) {
            return new LinkTextContentData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LinkTextContentData() {
        this((String) null, (String) null, (String) null, (Boolean) null, (String) null, (LinkTextStyle) null, (CTAButton) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LinkTextContentData copy$default(LinkTextContentData linkTextContentData, String str, String str2, String str3, Boolean bool, String str4, LinkTextStyle linkTextStyle, CTAButton cTAButton, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkTextContentData.text;
        }
        if ((i & 2) != 0) {
            str2 = linkTextContentData.url;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = linkTextContentData.relativeUriType;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            bool = linkTextContentData.underline;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            str4 = linkTextContentData.deeplink;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            linkTextStyle = linkTextContentData.style;
        }
        LinkTextStyle linkTextStyle2 = linkTextStyle;
        if ((i & 64) != 0) {
            cTAButton = linkTextContentData.cta;
        }
        return linkTextContentData.copy(str, str5, str6, bool2, str7, linkTextStyle2, cTAButton);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.relativeUriType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component4() {
        return this.underline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkTextStyle component6() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton component7() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkTextContentData copy(String str, String str2, String str3, Boolean bool, String str4, LinkTextStyle linkTextStyle, CTAButton cTAButton) {
        return new LinkTextContentData(str, str2, str3, bool, str4, linkTextStyle, cTAButton);
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
        if (!(obj instanceof LinkTextContentData)) {
            return false;
        }
        LinkTextContentData linkTextContentData = (LinkTextContentData) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) linkTextContentData.text) && Intrinsics.EZpvd((Object) this.url, (Object) linkTextContentData.url) && Intrinsics.EZpvd((Object) this.relativeUriType, (Object) linkTextContentData.relativeUriType) && Intrinsics.EZpvd(this.underline, linkTextContentData.underline) && Intrinsics.EZpvd((Object) this.deeplink, (Object) linkTextContentData.deeplink) && Intrinsics.EZpvd(this.style, linkTextContentData.style) && Intrinsics.EZpvd(this.cta, linkTextContentData.cta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButton getCta() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRelativeUriType() {
        return this.relativeUriType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkTextStyle getStyle() {
        return this.style;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getText() {
        return this.text;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getUnderline() {
        return this.underline;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.text;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.url;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.relativeUriType;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        Boolean bool = this.underline;
        int iHashCode4 = bool == null ? 0 : bool.hashCode();
        String str4 = this.deeplink;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        LinkTextStyle linkTextStyle = this.style;
        int iHashCode6 = linkTextStyle == null ? 0 : linkTextStyle.hashCode();
        CTAButton cTAButton = this.cta;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (cTAButton != null ? cTAButton.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LinkTextContentData(text=" + this.text + ", url=" + this.url + ", relativeUriType=" + this.relativeUriType + ", underline=" + this.underline + ", deeplink=" + this.deeplink + ", style=" + this.style + ", cta=" + this.cta + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.text);
        parcel.writeString(this.url);
        parcel.writeString(this.relativeUriType);
        Boolean bool = this.underline;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.deeplink);
        LinkTextStyle linkTextStyle = this.style;
        if (linkTextStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkTextStyle.writeToParcel(parcel, i);
        }
        CTAButton cTAButton = this.cta;
        if (cTAButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButton.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextContentData.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LinkTextContentData> serializer() {
            return LinkTextContentData$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LinkTextContentData(int i, String str, String str2, String str3, Boolean bool, String str4, LinkTextStyle linkTextStyle, CTAButton cTAButton, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.text = null;
        } else {
            this.text = str;
        }
        if ((i & 2) == 0) {
            this.url = null;
        } else {
            this.url = str2;
        }
        if ((i & 4) == 0) {
            this.relativeUriType = null;
        } else {
            this.relativeUriType = str3;
        }
        if ((i & 8) == 0) {
            this.underline = Boolean.TRUE;
        } else {
            this.underline = bool;
        }
        if ((i & 16) == 0) {
            this.deeplink = null;
        } else {
            this.deeplink = str4;
        }
        if ((i & 32) == 0) {
            this.style = null;
        } else {
            this.style = linkTextStyle;
        }
        if ((i & 64) == 0) {
            this.cta = null;
        } else {
            this.cta = cTAButton;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(LinkTextContentData linkTextContentData, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || linkTextContentData.text != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, linkTextContentData.text);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || linkTextContentData.url != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, linkTextContentData.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || linkTextContentData.relativeUriType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, linkTextContentData.relativeUriType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(linkTextContentData.underline, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, linkTextContentData.underline);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || linkTextContentData.deeplink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, linkTextContentData.deeplink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || linkTextContentData.style != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LinkTextStyle$$serializer.INSTANCE, linkTextContentData.style);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && linkTextContentData.cta == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, CTAButton$$serializer.INSTANCE, linkTextContentData.cta);
    }

    public LinkTextContentData(String str, String str2, String str3, Boolean bool, String str4, LinkTextStyle linkTextStyle, CTAButton cTAButton) {
        this.text = str;
        this.url = str2;
        this.relativeUriType = str3;
        this.underline = bool;
        this.deeplink = str4;
        this.style = linkTextStyle;
        this.cta = cTAButton;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.Boolean:0x001c: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x001a: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle) : (r12v0 com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton) : (r13v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton):void (m)] (LINE:1928) call: com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextContentData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButton):void type: THIS */
    public /* synthetic */ LinkTextContentData(String str, String str2, String str3, Boolean bool, String str4, LinkTextStyle linkTextStyle, CTAButton cTAButton, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? Boolean.TRUE : bool, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : linkTextStyle, (i & 64) != 0 ? null : cTAButton);
    }
}
