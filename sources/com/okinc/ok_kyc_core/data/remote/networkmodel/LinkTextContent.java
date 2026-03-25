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
public final class LinkTextContent implements Parcelable {
    private final CTAButtonAppModel cta;
    private final String deeplink;
    private final String relativeUriType;
    private final LinkTextStyle style;
    private final String text;
    private final Boolean underline;
    private final String url;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LinkTextContent> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LinkTextContent> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkTextContent createFromParcel(Parcel parcel) {
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
            return new LinkTextContent(string, string2, string3, boolValueOf, parcel.readString(), parcel.readInt() == 0 ? null : LinkTextStyle.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? CTAButtonAppModel.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkTextContent[] newArray(int i) {
            return new LinkTextContent[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LinkTextContent() {
        this((String) null, (String) null, (String) null, (Boolean) null, (String) null, (LinkTextStyle) null, (CTAButtonAppModel) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LinkTextContent copy$default(LinkTextContent linkTextContent, String str, String str2, String str3, Boolean bool, String str4, LinkTextStyle linkTextStyle, CTAButtonAppModel cTAButtonAppModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = linkTextContent.text;
        }
        if ((i & 2) != 0) {
            str2 = linkTextContent.url;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = linkTextContent.relativeUriType;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            bool = linkTextContent.underline;
        }
        Boolean bool2 = bool;
        if ((i & 16) != 0) {
            str4 = linkTextContent.deeplink;
        }
        String str7 = str4;
        if ((i & 32) != 0) {
            linkTextStyle = linkTextContent.style;
        }
        LinkTextStyle linkTextStyle2 = linkTextStyle;
        if ((i & 64) != 0) {
            cTAButtonAppModel = linkTextContent.cta;
        }
        return linkTextContent.copy(str, str5, str6, bool2, str7, linkTextStyle2, cTAButtonAppModel);
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
    public final CTAButtonAppModel component7() {
        return this.cta;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LinkTextContent copy(String str, String str2, String str3, Boolean bool, String str4, LinkTextStyle linkTextStyle, CTAButtonAppModel cTAButtonAppModel) {
        return new LinkTextContent(str, str2, str3, bool, str4, linkTextStyle, cTAButtonAppModel);
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
        if (!(obj instanceof LinkTextContent)) {
            return false;
        }
        LinkTextContent linkTextContent = (LinkTextContent) obj;
        return Intrinsics.EZpvd((Object) this.text, (Object) linkTextContent.text) && Intrinsics.EZpvd((Object) this.url, (Object) linkTextContent.url) && Intrinsics.EZpvd((Object) this.relativeUriType, (Object) linkTextContent.relativeUriType) && Intrinsics.EZpvd(this.underline, linkTextContent.underline) && Intrinsics.EZpvd((Object) this.deeplink, (Object) linkTextContent.deeplink) && Intrinsics.EZpvd(this.style, linkTextContent.style) && Intrinsics.EZpvd(this.cta, linkTextContent.cta);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CTAButtonAppModel getCta() {
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
        CTAButtonAppModel cTAButtonAppModel = this.cta;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (cTAButtonAppModel != null ? cTAButtonAppModel.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LinkTextContent(text=" + this.text + ", url=" + this.url + ", relativeUriType=" + this.relativeUriType + ", underline=" + this.underline + ", deeplink=" + this.deeplink + ", style=" + this.style + ", cta=" + this.cta + ")";
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
        CTAButtonAppModel cTAButtonAppModel = this.cta;
        if (cTAButtonAppModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cTAButtonAppModel.writeToParcel(parcel, i);
        }
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextContent.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LinkTextContent> serializer() {
            return LinkTextContent$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LinkTextContent(int i, String str, String str2, String str3, Boolean bool, String str4, LinkTextStyle linkTextStyle, CTAButtonAppModel cTAButtonAppModel, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.cta = cTAButtonAppModel;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(LinkTextContent linkTextContent, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || linkTextContent.text != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, linkTextContent.text);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || linkTextContent.url != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, linkTextContent.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || linkTextContent.relativeUriType != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, linkTextContent.relativeUriType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd(linkTextContent.underline, Boolean.TRUE)) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, BooleanSerializer.INSTANCE, linkTextContent.underline);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || linkTextContent.deeplink != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, linkTextContent.deeplink);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || linkTextContent.style != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, LinkTextStyle$$serializer.INSTANCE, linkTextContent.style);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) && linkTextContent.cta == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, CTAButtonAppModel$$serializer.INSTANCE, linkTextContent.cta);
    }

    public LinkTextContent(String str, String str2, String str3, Boolean bool, String str4, LinkTextStyle linkTextStyle, CTAButtonAppModel cTAButtonAppModel) {
        this.text = str;
        this.url = str2;
        this.relativeUriType = str3;
        this.underline = bool;
        this.deeplink = str4;
        this.style = linkTextStyle;
        this.cta = cTAButtonAppModel;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0039: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r14v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0008: ARITH (r14v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000f: ARITH (r14v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r9v0 java.lang.String))
  (wrap:java.lang.Boolean:0x001c: TERNARY null = ((wrap:int:0x0016: ARITH (r14v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:java.lang.Boolean:0x001a: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r10v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001d: ARITH (r14v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r11v0 java.lang.String))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle:?: TERNARY null = ((wrap:int:0x0024: ARITH (r14v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle) : (r12v0 com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle))
  (wrap:com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel:?: TERNARY null = ((wrap:int:0x002b: ARITH (r14v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel) : (r13v0 com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel):void (m)] (LINE:1941) call: com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextContent.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, com.okinc.ok_kyc_core.data.remote.networkmodel.LinkTextStyle, com.okinc.ok_kyc_core.data.remote.networkmodel.CTAButtonAppModel):void type: THIS */
    public /* synthetic */ LinkTextContent(String str, String str2, String str3, Boolean bool, String str4, LinkTextStyle linkTextStyle, CTAButtonAppModel cTAButtonAppModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? Boolean.TRUE : bool, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : linkTextStyle, (i & 64) != 0 ? null : cTAButtonAppModel);
    }
}
