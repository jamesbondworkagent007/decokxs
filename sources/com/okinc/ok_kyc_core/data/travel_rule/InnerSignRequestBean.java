package com.okinc.ok_kyc_core.data.travel_rule;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.api.bean.SignRequestBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Serializable
public final class InnerSignRequestBean implements Parcelable {
    private String logoUrl;
    private String signMessageInfo;
    private int subCurrencyId;
    private String title;
    private String toAddress;
    private String url;
    private String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<InnerSignRequestBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<InnerSignRequestBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InnerSignRequestBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new InnerSignRequestBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InnerSignRequestBean[] newArray(int i) {
            return new InnerSignRequestBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ InnerSignRequestBean copy$default(InnerSignRequestBean innerSignRequestBean, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = innerSignRequestBean.title;
        }
        if ((i2 & 2) != 0) {
            str2 = innerSignRequestBean.url;
        }
        String str7 = str2;
        if ((i2 & 4) != 0) {
            str3 = innerSignRequestBean.logoUrl;
        }
        String str8 = str3;
        if ((i2 & 8) != 0) {
            str4 = innerSignRequestBean.signMessageInfo;
        }
        String str9 = str4;
        if ((i2 & 16) != 0) {
            str5 = innerSignRequestBean.toAddress;
        }
        String str10 = str5;
        if ((i2 & 32) != 0) {
            str6 = innerSignRequestBean.walletId;
        }
        String str11 = str6;
        if ((i2 & 64) != 0) {
            i = innerSignRequestBean.subCurrencyId;
        }
        return innerSignRequestBean.copy(str, str7, str8, str9, str10, str11, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.logoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.signMessageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component7() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InnerSignRequestBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new InnerSignRequestBean(str, str2, str3, str4, str5, str6, i);
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
        if (!(obj instanceof InnerSignRequestBean)) {
            return false;
        }
        InnerSignRequestBean innerSignRequestBean = (InnerSignRequestBean) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) innerSignRequestBean.title) && Intrinsics.EZpvd((Object) this.url, (Object) innerSignRequestBean.url) && Intrinsics.EZpvd((Object) this.logoUrl, (Object) innerSignRequestBean.logoUrl) && Intrinsics.EZpvd((Object) this.signMessageInfo, (Object) innerSignRequestBean.signMessageInfo) && Intrinsics.EZpvd((Object) this.toAddress, (Object) innerSignRequestBean.toAddress) && Intrinsics.EZpvd((Object) this.walletId, (Object) innerSignRequestBean.walletId) && this.subCurrencyId == innerSignRequestBean.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLogoUrl() {
        return this.logoUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSignMessageInfo() {
        return this.signMessageInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSubCurrencyId() {
        return this.subCurrencyId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTitle() {
        return this.title;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getToAddress() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUrl() {
        return this.url;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.title.hashCode() * 31) + this.url.hashCode()) * 31) + this.logoUrl.hashCode()) * 31) + this.signMessageInfo.hashCode()) * 31) + this.toAddress.hashCode()) * 31) + this.walletId.hashCode()) * 31) + Integer.hashCode(this.subCurrencyId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setLogoUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.logoUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSignMessageInfo(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.signMessageInfo = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSubCurrencyId(int i) {
        this.subCurrencyId = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.title = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.toAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.url = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "InnerSignRequestBean(title=" + this.title + ", url=" + this.url + ", logoUrl=" + this.logoUrl + ", signMessageInfo=" + this.signMessageInfo + ", toAddress=" + this.toAddress + ", walletId=" + this.walletId + ", subCurrencyId=" + this.subCurrencyId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.title);
        parcel.writeString(this.url);
        parcel.writeString(this.logoUrl);
        parcel.writeString(this.signMessageInfo);
        parcel.writeString(this.toAddress);
        parcel.writeString(this.walletId);
        parcel.writeInt(this.subCurrencyId);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.ok_kyc_core.data.travel_rule.InnerSignRequestBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<InnerSignRequestBean> serializer() {
            return InnerSignRequestBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ InnerSignRequestBean(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (64 != (i & 64)) {
            PluginExceptionsKt.throwMissingFieldException(i, 64, InnerSignRequestBean$$serializer.INSTANCE.getDescriptor());
        }
        if ((i & 1) == 0) {
            this.title = "";
        } else {
            this.title = str;
        }
        if ((i & 2) == 0) {
            this.url = "";
        } else {
            this.url = str2;
        }
        if ((i & 4) == 0) {
            this.logoUrl = "";
        } else {
            this.logoUrl = str3;
        }
        if ((i & 8) == 0) {
            this.signMessageInfo = "";
        } else {
            this.signMessageInfo = str4;
        }
        if ((i & 16) == 0) {
            this.toAddress = "";
        } else {
            this.toAddress = str5;
        }
        if ((i & 32) == 0) {
            this.walletId = "";
        } else {
            this.walletId = str6;
        }
        this.subCurrencyId = i2;
    }

    public static final /* synthetic */ void write$Self$OKCompliance_ok_compliance_impl(InnerSignRequestBean innerSignRequestBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) innerSignRequestBean.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, innerSignRequestBean.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) innerSignRequestBean.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, innerSignRequestBean.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) innerSignRequestBean.logoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, innerSignRequestBean.logoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) innerSignRequestBean.signMessageInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, innerSignRequestBean.signMessageInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) innerSignRequestBean.toAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, innerSignRequestBean.toAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) innerSignRequestBean.walletId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, innerSignRequestBean.walletId);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 6, innerSignRequestBean.subCurrencyId);
    }

    public InnerSignRequestBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.title = str;
        this.url = str2;
        this.logoUrl = str3;
        this.signMessageInfo = str4;
        this.toAddress = str5;
        this.walletId = str6;
        this.subCurrencyId = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0030: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r18v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r18v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r18v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r18v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r18v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r18v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (r17v0 int)
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:44) call: com.okinc.ok_kyc_core.data.travel_rule.InnerSignRequestBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ InnerSignRequestBean(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, i);
    }

    public final SignRequestBean convertSignRequestBean() {
        return new SignRequestBean(this.title, this.url, this.logoUrl, this.signMessageInfo, this.toAddress, this.walletId, this.subCurrencyId);
    }
}
