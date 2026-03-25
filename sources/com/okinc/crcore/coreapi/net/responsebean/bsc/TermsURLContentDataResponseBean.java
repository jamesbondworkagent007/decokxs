package com.okinc.crcore.coreapi.net.responsebean.bsc;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class TermsURLContentDataResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final String dexLearnMoreUrl;
    private final String policyUrl;
    private final String serviceUrl;
    private final String tcDesc;
    private final String tcKey;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<TermsURLContentDataResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<TermsURLContentDataResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TermsURLContentDataResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new TermsURLContentDataResponseBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TermsURLContentDataResponseBean[] newArray(int i) {
            return new TermsURLContentDataResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TermsURLContentDataResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ TermsURLContentDataResponseBean copy$default(TermsURLContentDataResponseBean termsURLContentDataResponseBean, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = termsURLContentDataResponseBean.policyUrl;
        }
        if ((i & 2) != 0) {
            str2 = termsURLContentDataResponseBean.serviceUrl;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = termsURLContentDataResponseBean.dexLearnMoreUrl;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = termsURLContentDataResponseBean.tcDesc;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = termsURLContentDataResponseBean.tcKey;
        }
        return termsURLContentDataResponseBean.copy(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.policyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.serviceUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.dexLearnMoreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.tcDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.tcKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TermsURLContentDataResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new TermsURLContentDataResponseBean(str, str2, str3, str4, str5);
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
        if (!(obj instanceof TermsURLContentDataResponseBean)) {
            return false;
        }
        TermsURLContentDataResponseBean termsURLContentDataResponseBean = (TermsURLContentDataResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.policyUrl, (Object) termsURLContentDataResponseBean.policyUrl) && Intrinsics.EZpvd((Object) this.serviceUrl, (Object) termsURLContentDataResponseBean.serviceUrl) && Intrinsics.EZpvd((Object) this.dexLearnMoreUrl, (Object) termsURLContentDataResponseBean.dexLearnMoreUrl) && Intrinsics.EZpvd((Object) this.tcDesc, (Object) termsURLContentDataResponseBean.tcDesc) && Intrinsics.EZpvd((Object) this.tcKey, (Object) termsURLContentDataResponseBean.tcKey);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDexLearnMoreUrl() {
        return this.dexLearnMoreUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPolicyUrl() {
        return this.policyUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getServiceUrl() {
        return this.serviceUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTcDesc() {
        return this.tcDesc;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTcKey() {
        return this.tcKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.policyUrl.hashCode();
        int iHashCode2 = this.serviceUrl.hashCode();
        int iHashCode3 = this.dexLearnMoreUrl.hashCode();
        String str = this.tcDesc;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        String str2 = this.tcKey;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TermsURLContentDataResponseBean(policyUrl=" + this.policyUrl + ", serviceUrl=" + this.serviceUrl + ", dexLearnMoreUrl=" + this.dexLearnMoreUrl + ", tcDesc=" + this.tcDesc + ", tcKey=" + this.tcKey + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.policyUrl);
        parcel.writeString(this.serviceUrl);
        parcel.writeString(this.dexLearnMoreUrl);
        parcel.writeString(this.tcDesc);
        parcel.writeString(this.tcKey);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.TermsURLContentDataResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TermsURLContentDataResponseBean> serializer() {
            return TermsURLContentDataResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TermsURLContentDataResponseBean(int i, String str, String str2, String str3, String str4, String str5, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.policyUrl = "";
        } else {
            this.policyUrl = str;
        }
        if ((i & 2) == 0) {
            this.serviceUrl = "";
        } else {
            this.serviceUrl = str2;
        }
        if ((i & 4) == 0) {
            this.dexLearnMoreUrl = "";
        } else {
            this.dexLearnMoreUrl = str3;
        }
        if ((i & 8) == 0) {
            this.tcDesc = null;
        } else {
            this.tcDesc = str4;
        }
        if ((i & 16) == 0) {
            this.tcKey = null;
        } else {
            this.tcKey = str5;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(TermsURLContentDataResponseBean termsURLContentDataResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) termsURLContentDataResponseBean.policyUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, termsURLContentDataResponseBean.policyUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) termsURLContentDataResponseBean.serviceUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, termsURLContentDataResponseBean.serviceUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) termsURLContentDataResponseBean.dexLearnMoreUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, termsURLContentDataResponseBean.dexLearnMoreUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || termsURLContentDataResponseBean.tcDesc != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, StringSerializer.INSTANCE, termsURLContentDataResponseBean.tcDesc);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) && termsURLContentDataResponseBean.tcKey == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, StringSerializer.INSTANCE, termsURLContentDataResponseBean.tcKey);
    }

    public TermsURLContentDataResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.policyUrl = str;
        this.serviceUrl = str2;
        this.dexLearnMoreUrl = str3;
        this.tcDesc = str4;
        this.tcKey = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r8v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.okinc.crcore.coreapi.net.responsebean.bsc.TermsURLContentDataResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ TermsURLContentDataResponseBean(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }
}
