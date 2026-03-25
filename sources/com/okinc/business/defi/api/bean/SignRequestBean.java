package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
@Serializable
public final class SignRequestBean implements Parcelable {
    private String logoUrl;
    private String signMessageInfo;
    private int subCurrencyId;
    private String title;
    private String toAddress;
    private String url;
    private String walletId;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SignRequestBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<SignRequestBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignRequestBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SignRequestBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignRequestBean[] newArray(int i) {
            return new SignRequestBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SignRequestBean copy$default(SignRequestBean signRequestBean, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = signRequestBean.title;
        }
        if ((i2 & 2) != 0) {
            str2 = signRequestBean.url;
        }
        String str7 = str2;
        if ((i2 & 4) != 0) {
            str3 = signRequestBean.logoUrl;
        }
        String str8 = str3;
        if ((i2 & 8) != 0) {
            str4 = signRequestBean.signMessageInfo;
        }
        String str9 = str4;
        if ((i2 & 16) != 0) {
            str5 = signRequestBean.toAddress;
        }
        String str10 = str5;
        if ((i2 & 32) != 0) {
            str6 = signRequestBean.walletId;
        }
        String str11 = str6;
        if ((i2 & 64) != 0) {
            i = signRequestBean.subCurrencyId;
        }
        return signRequestBean.copy(str, str7, str8, str9, str10, str11, i);
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
    public final SignRequestBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new SignRequestBean(str, str2, str3, str4, str5, str6, i);
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
        if (!(obj instanceof SignRequestBean)) {
            return false;
        }
        SignRequestBean signRequestBean = (SignRequestBean) obj;
        return Intrinsics.EZpvd((Object) this.title, (Object) signRequestBean.title) && Intrinsics.EZpvd((Object) this.url, (Object) signRequestBean.url) && Intrinsics.EZpvd((Object) this.logoUrl, (Object) signRequestBean.logoUrl) && Intrinsics.EZpvd((Object) this.signMessageInfo, (Object) signRequestBean.signMessageInfo) && Intrinsics.EZpvd((Object) this.toAddress, (Object) signRequestBean.toAddress) && Intrinsics.EZpvd((Object) this.walletId, (Object) signRequestBean.walletId) && this.subCurrencyId == signRequestBean.subCurrencyId;
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
        return "SignRequestBean(title=" + this.title + ", url=" + this.url + ", logoUrl=" + this.logoUrl + ", signMessageInfo=" + this.signMessageInfo + ", toAddress=" + this.toAddress + ", walletId=" + this.walletId + ", subCurrencyId=" + this.subCurrencyId + ")";
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

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.bean.SignRequestBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SignRequestBean> serializer() {
            return SignRequestBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SignRequestBean(int i, String str, String str2, String str3, String str4, String str5, String str6, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (64 != (i & 64)) {
            PluginExceptionsKt.throwMissingFieldException(i, 64, SignRequestBean$$serializer.INSTANCE.getDescriptor());
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

    public static final /* synthetic */ void write$Self$OKWallet_wallet_api(SignRequestBean signRequestBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) signRequestBean.title, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, signRequestBean.title);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) signRequestBean.url, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, signRequestBean.url);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) signRequestBean.logoUrl, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, signRequestBean.logoUrl);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) || !Intrinsics.EZpvd((Object) signRequestBean.signMessageInfo, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 3, signRequestBean.signMessageInfo);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 4) || !Intrinsics.EZpvd((Object) signRequestBean.toAddress, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 4, signRequestBean.toAddress);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 5) || !Intrinsics.EZpvd((Object) signRequestBean.walletId, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 5, signRequestBean.walletId);
        }
        compositeEncoder.encodeIntElement(serialDescriptor, 6, signRequestBean.subCurrencyId);
    }

    public SignRequestBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, int i) {
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
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void (m)] (LINE:299) call: com.okinc.business.defi.api.bean.SignRequestBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int):void type: THIS */
    public /* synthetic */ SignRequestBean(String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? "" : str5, (i2 & 32) != 0 ? "" : str6, i);
    }
}
