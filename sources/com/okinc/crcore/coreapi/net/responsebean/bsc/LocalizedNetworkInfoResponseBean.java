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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Serializable
public final class LocalizedNetworkInfoResponseBean implements Parcelable {
    private String networkIcon;
    private String networkNightIcon;
    private String networkTitle;
    private String networkValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LocalizedNetworkInfoResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LocalizedNetworkInfoResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalizedNetworkInfoResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LocalizedNetworkInfoResponseBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalizedNetworkInfoResponseBean[] newArray(int i) {
            return new LocalizedNetworkInfoResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LocalizedNetworkInfoResponseBean() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LocalizedNetworkInfoResponseBean copy$default(LocalizedNetworkInfoResponseBean localizedNetworkInfoResponseBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localizedNetworkInfoResponseBean.networkTitle;
        }
        if ((i & 2) != 0) {
            str2 = localizedNetworkInfoResponseBean.networkValue;
        }
        if ((i & 4) != 0) {
            str3 = localizedNetworkInfoResponseBean.networkIcon;
        }
        if ((i & 8) != 0) {
            str4 = localizedNetworkInfoResponseBean.networkNightIcon;
        }
        return localizedNetworkInfoResponseBean.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.networkTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.networkValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.networkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.networkNightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizedNetworkInfoResponseBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new LocalizedNetworkInfoResponseBean(str, str2, str3, str4);
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
        if (!(obj instanceof LocalizedNetworkInfoResponseBean)) {
            return false;
        }
        LocalizedNetworkInfoResponseBean localizedNetworkInfoResponseBean = (LocalizedNetworkInfoResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.networkTitle, (Object) localizedNetworkInfoResponseBean.networkTitle) && Intrinsics.EZpvd((Object) this.networkValue, (Object) localizedNetworkInfoResponseBean.networkValue) && Intrinsics.EZpvd((Object) this.networkIcon, (Object) localizedNetworkInfoResponseBean.networkIcon) && Intrinsics.EZpvd((Object) this.networkNightIcon, (Object) localizedNetworkInfoResponseBean.networkNightIcon);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkIcon() {
        return this.networkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkNightIcon() {
        return this.networkNightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkTitle() {
        return this.networkTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetworkValue() {
        return this.networkValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.networkTitle.hashCode() * 31) + this.networkValue.hashCode()) * 31) + this.networkIcon.hashCode()) * 31) + this.networkNightIcon.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetworkIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.networkIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetworkNightIcon(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.networkNightIcon = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetworkTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.networkTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNetworkValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.networkValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LocalizedNetworkInfoResponseBean(networkTitle=" + this.networkTitle + ", networkValue=" + this.networkValue + ", networkIcon=" + this.networkIcon + ", networkNightIcon=" + this.networkNightIcon + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.networkTitle);
        parcel.writeString(this.networkValue);
        parcel.writeString(this.networkIcon);
        parcel.writeString(this.networkNightIcon);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizedNetworkInfoResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LocalizedNetworkInfoResponseBean> serializer() {
            return LocalizedNetworkInfoResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LocalizedNetworkInfoResponseBean(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.networkTitle = "";
        } else {
            this.networkTitle = str;
        }
        if ((i & 2) == 0) {
            this.networkValue = "";
        } else {
            this.networkValue = str2;
        }
        if ((i & 4) == 0) {
            this.networkIcon = "";
        } else {
            this.networkIcon = str3;
        }
        if ((i & 8) == 0) {
            this.networkNightIcon = "";
        } else {
            this.networkNightIcon = str4;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(LocalizedNetworkInfoResponseBean localizedNetworkInfoResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) localizedNetworkInfoResponseBean.networkTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, localizedNetworkInfoResponseBean.networkTitle);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) || !Intrinsics.EZpvd((Object) localizedNetworkInfoResponseBean.networkValue, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 1, localizedNetworkInfoResponseBean.networkValue);
        }
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 2) || !Intrinsics.EZpvd((Object) localizedNetworkInfoResponseBean.networkIcon, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 2, localizedNetworkInfoResponseBean.networkIcon);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 3) && Intrinsics.EZpvd((Object) localizedNetworkInfoResponseBean.networkNightIcon, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 3, localizedNetworkInfoResponseBean.networkNightIcon);
    }

    public LocalizedNetworkInfoResponseBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.networkTitle = str;
        this.networkValue = str2;
        this.networkIcon = str3;
        this.networkNightIcon = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:117) call: com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizedNetworkInfoResponseBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LocalizedNetworkInfoResponseBean(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }
}
