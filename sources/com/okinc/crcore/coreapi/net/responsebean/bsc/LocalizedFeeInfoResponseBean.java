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
public final class LocalizedFeeInfoResponseBean implements Parcelable {
    private String feeTitle;
    private String feeValue;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<LocalizedFeeInfoResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<LocalizedFeeInfoResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalizedFeeInfoResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new LocalizedFeeInfoResponseBean(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalizedFeeInfoResponseBean[] newArray(int i) {
            return new LocalizedFeeInfoResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public LocalizedFeeInfoResponseBean() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ LocalizedFeeInfoResponseBean copy$default(LocalizedFeeInfoResponseBean localizedFeeInfoResponseBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = localizedFeeInfoResponseBean.feeTitle;
        }
        if ((i & 2) != 0) {
            str2 = localizedFeeInfoResponseBean.feeValue;
        }
        return localizedFeeInfoResponseBean.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.feeTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.feeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final LocalizedFeeInfoResponseBean copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new LocalizedFeeInfoResponseBean(str, str2);
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
        if (!(obj instanceof LocalizedFeeInfoResponseBean)) {
            return false;
        }
        LocalizedFeeInfoResponseBean localizedFeeInfoResponseBean = (LocalizedFeeInfoResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.feeTitle, (Object) localizedFeeInfoResponseBean.feeTitle) && Intrinsics.EZpvd((Object) this.feeValue, (Object) localizedFeeInfoResponseBean.feeValue);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeTitle() {
        return this.feeTitle;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFeeValue() {
        return this.feeValue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.feeTitle.hashCode() * 31) + this.feeValue.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feeTitle = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFeeValue(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.feeValue = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "LocalizedFeeInfoResponseBean(feeTitle=" + this.feeTitle + ", feeValue=" + this.feeValue + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.feeTitle);
        parcel.writeString(this.feeValue);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizedFeeInfoResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<LocalizedFeeInfoResponseBean> serializer() {
            return LocalizedFeeInfoResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ LocalizedFeeInfoResponseBean(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.feeTitle = "";
        } else {
            this.feeTitle = str;
        }
        if ((i & 2) == 0) {
            this.feeValue = "";
        } else {
            this.feeValue = str2;
        }
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(LocalizedFeeInfoResponseBean localizedFeeInfoResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        if (compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 0) || !Intrinsics.EZpvd((Object) localizedFeeInfoResponseBean.feeTitle, (Object) "")) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, localizedFeeInfoResponseBean.feeTitle);
        }
        if (!compositeEncoder.shouldEncodeElementDefault(serialDescriptor, 1) && Intrinsics.EZpvd((Object) localizedFeeInfoResponseBean.feeValue, (Object) "")) {
            return;
        }
        compositeEncoder.encodeStringElement(serialDescriptor, 1, localizedFeeInfoResponseBean.feeValue);
    }

    public LocalizedFeeInfoResponseBean(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.feeTitle = str;
        this.feeValue = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:86) call: com.okinc.crcore.coreapi.net.responsebean.bsc.LocalizedFeeInfoResponseBean.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ LocalizedFeeInfoResponseBean(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
