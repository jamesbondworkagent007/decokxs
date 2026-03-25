package com.okinc.ok_kyc_core_api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class UrlVendorTokenResp implements Parcelable {
    private String helperText;
    private String mode;
    private Long pollingTimeout;
    private String pollingUrl;
    private String subtitle;
    private String title;
    private String transactionId;
    private String url;
    private Integer vendorType;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<UrlVendorTokenResp> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<UrlVendorTokenResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UrlVendorTokenResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UrlVendorTokenResp(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UrlVendorTokenResp[] newArray(int i) {
            return new UrlVendorTokenResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component1() {
        return this.vendorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.pollingUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.subtitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.helperText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component8() {
        return this.pollingTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component9() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UrlVendorTokenResp copy(Integer num, String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7) {
        return new UrlVendorTokenResp(num, str, str2, str3, str4, str5, str6, l, str7);
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
        if (!(obj instanceof UrlVendorTokenResp)) {
            return false;
        }
        UrlVendorTokenResp urlVendorTokenResp = (UrlVendorTokenResp) obj;
        return Intrinsics.EZpvd(this.vendorType, urlVendorTokenResp.vendorType) && Intrinsics.EZpvd((Object) this.transactionId, (Object) urlVendorTokenResp.transactionId) && Intrinsics.EZpvd((Object) this.url, (Object) urlVendorTokenResp.url) && Intrinsics.EZpvd((Object) this.pollingUrl, (Object) urlVendorTokenResp.pollingUrl) && Intrinsics.EZpvd((Object) this.title, (Object) urlVendorTokenResp.title) && Intrinsics.EZpvd((Object) this.subtitle, (Object) urlVendorTokenResp.subtitle) && Intrinsics.EZpvd((Object) this.helperText, (Object) urlVendorTokenResp.helperText) && Intrinsics.EZpvd(this.pollingTimeout, urlVendorTokenResp.pollingTimeout) && Intrinsics.EZpvd((Object) this.mode, (Object) urlVendorTokenResp.mode);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getHelperText() {
        return this.helperText;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMode() {
        return this.mode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getPollingTimeout() {
        return this.pollingTimeout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPollingUrl() {
        return this.pollingUrl;
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
    public final String getTransactionId() {
        return this.transactionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getVendorType() {
        return this.vendorType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        Integer num = this.vendorType;
        int iHashCode = num == null ? 0 : num.hashCode();
        String str = this.transactionId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.url;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.pollingUrl;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.title;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.subtitle;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.helperText;
        int iHashCode7 = str6 == null ? 0 : str6.hashCode();
        Long l = this.pollingTimeout;
        int iHashCode8 = l == null ? 0 : l.hashCode();
        String str7 = this.mode;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str7 != null ? str7.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHelperText(String str) {
        this.helperText = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMode(String str) {
        this.mode = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPollingTimeout(Long l) {
        this.pollingTimeout = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPollingUrl(String str) {
        this.pollingUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubtitle(String str) {
        this.subtitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(String str) {
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransactionId(String str) {
        this.transactionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(String str) {
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setVendorType(Integer num) {
        this.vendorType = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UrlVendorTokenResp(vendorType=" + this.vendorType + ", transactionId=" + this.transactionId + ", url=" + this.url + ", pollingUrl=" + this.pollingUrl + ", title=" + this.title + ", subtitle=" + this.subtitle + ", helperText=" + this.helperText + ", pollingTimeout=" + this.pollingTimeout + ", mode=" + this.mode + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        Integer num = this.vendorType;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.transactionId);
        parcel.writeString(this.url);
        parcel.writeString(this.pollingUrl);
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        parcel.writeString(this.helperText);
        Long l = this.pollingTimeout;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeString(this.mode);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core_api.model.UrlVendorTokenResp.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<UrlVendorTokenResp> serializer() {
            return UrlVendorTokenResp$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ UrlVendorTokenResp(int i, Integer num, String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, SerializationConstructorMarker serializationConstructorMarker) {
        if (128 != (i & 128)) {
            PluginExceptionsKt.throwMissingFieldException(i, 128, UrlVendorTokenResp$$serializer.INSTANCE.getDescriptor());
        }
        this.vendorType = (i & 1) == 0 ? 7 : num;
        if ((i & 2) == 0) {
            this.transactionId = "";
        } else {
            this.transactionId = str;
        }
        if ((i & 4) == 0) {
            this.url = "";
        } else {
            this.url = str2;
        }
        if ((i & 8) == 0) {
            this.pollingUrl = "";
        } else {
            this.pollingUrl = str3;
        }
        if ((i & 16) == 0) {
            this.title = "";
        } else {
            this.title = str4;
        }
        if ((i & 32) == 0) {
            this.subtitle = "";
        } else {
            this.subtitle = str5;
        }
        if ((i & 64) == 0) {
            this.helperText = "";
        } else {
            this.helperText = str6;
        }
        this.pollingTimeout = l;
        if ((i & 256) == 0) {
            this.mode = "url";
        } else {
            this.mode = str7;
        }
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_api(UrlVendorTokenResp urlVendorTokenResp, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        Integer num;
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || (num = urlVendorTokenResp.vendorType) == null || num.intValue() != 7) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, IntSerializer.INSTANCE, urlVendorTokenResp.vendorType);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) urlVendorTokenResp.transactionId, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, urlVendorTokenResp.transactionId);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) urlVendorTokenResp.url, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, StringSerializer.INSTANCE, urlVendorTokenResp.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) urlVendorTokenResp.pollingUrl, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, urlVendorTokenResp.pollingUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) urlVendorTokenResp.title, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, urlVendorTokenResp.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) urlVendorTokenResp.subtitle, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, StringSerializer.INSTANCE, urlVendorTokenResp.subtitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 6) || !Intrinsics.EZpvd((Object) urlVendorTokenResp.helperText, (Object) "")) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, urlVendorTokenResp.helperText);
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 7, LongSerializer.INSTANCE, urlVendorTokenResp.pollingTimeout);
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 8) && Intrinsics.EZpvd((Object) urlVendorTokenResp.mode, (Object) "url")) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, urlVendorTokenResp.mode);
    }

    public UrlVendorTokenResp(Integer num, String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7) {
        this.vendorType = num;
        this.transactionId = str;
        this.url = str2;
        this.pollingUrl = str3;
        this.title = str4;
        this.subtitle = str5;
        this.helperText = str6;
        this.pollingTimeout = l;
        this.mode = str7;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x004b: CONSTRUCTOR 
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (7 int) : (r13v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r22v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r22v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0026: ARITH (r22v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r22v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0036: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (r20v0 java.lang.Long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x003e: ARITH (r22v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("url") : (r21v0 java.lang.String))
 A[MD:(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String):void (m)] (LINE:11) call: com.okinc.ok_kyc_core_api.model.UrlVendorTokenResp.<init>(java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Long, java.lang.String):void type: THIS */
    public /* synthetic */ UrlVendorTokenResp(Integer num, String str, String str2, String str3, String str4, String str5, String str6, Long l, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 7 : num, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, l, (i & 256) != 0 ? "url" : str7);
    }
}
