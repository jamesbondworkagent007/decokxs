package com.okinc.business.invest_api.bean;

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

/* JADX INFO: loaded from: classes6.dex */
@Serializable
public final class EarnRecommendApyBean implements Parcelable {
    public static final int $stable = 0;
    public final long chainId;
    public final String formattedRate;
    public final String rate;
    public final String tokenAddress;
    public final String tokenTicker;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EarnRecommendApyBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EarnRecommendApyBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnRecommendApyBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EarnRecommendApyBean(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EarnRecommendApyBean[] newArray(int i) {
            return new EarnRecommendApyBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EarnRecommendApyBean copy$default(EarnRecommendApyBean earnRecommendApyBean, String str, String str2, long j, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = earnRecommendApyBean.tokenTicker;
        }
        if ((i & 2) != 0) {
            str2 = earnRecommendApyBean.rate;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            j = earnRecommendApyBean.chainId;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = earnRecommendApyBean.tokenAddress;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = earnRecommendApyBean.formattedRate;
        }
        return earnRecommendApyBean.copydefault(str, str5, j2, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.formattedRate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.rate;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long copydefault() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EarnRecommendApyBean copydefault(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new EarnRecommendApyBean(str, str2, j, str3, str4);
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
        if (!(obj instanceof EarnRecommendApyBean)) {
            return false;
        }
        EarnRecommendApyBean earnRecommendApyBean = (EarnRecommendApyBean) obj;
        return Intrinsics.EZpvd((Object) this.tokenTicker, (Object) earnRecommendApyBean.tokenTicker) && Intrinsics.EZpvd((Object) this.rate, (Object) earnRecommendApyBean.rate) && this.chainId == earnRecommendApyBean.chainId && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) earnRecommendApyBean.tokenAddress) && Intrinsics.EZpvd((Object) this.formattedRate, (Object) earnRecommendApyBean.formattedRate);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.tokenTicker.hashCode() * 31) + this.rate.hashCode()) * 31) + Long.hashCode(this.chainId)) * 31) + this.tokenAddress.hashCode()) * 31) + this.formattedRate.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EarnRecommendApyBean(tokenTicker=" + this.tokenTicker + ", rate=" + this.rate + ", chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", formattedRate=" + this.formattedRate + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.tokenTicker);
        parcel.writeString(this.rate);
        parcel.writeLong(this.chainId);
        parcel.writeString(this.tokenAddress);
        parcel.writeString(this.formattedRate);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.invest_api.bean.EarnRecommendApyBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EarnRecommendApyBean> serializer() {
            return EarnRecommendApyBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EarnRecommendApyBean(int i, String str, String str2, long j, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, EarnRecommendApyBean$$serializer.INSTANCE.getDescriptor());
        }
        this.tokenTicker = str;
        this.rate = str2;
        this.chainId = j;
        this.tokenAddress = str3;
        this.formattedRate = str4;
    }

    public static final /* synthetic */ void EZpvd(EarnRecommendApyBean earnRecommendApyBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, earnRecommendApyBean.tokenTicker);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, earnRecommendApyBean.rate);
        compositeEncoder.encodeLongElement(serialDescriptor, 2, earnRecommendApyBean.chainId);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, earnRecommendApyBean.tokenAddress);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, earnRecommendApyBean.formattedRate);
    }

    public EarnRecommendApyBean(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.tokenTicker = str;
        this.rate = str2;
        this.chainId = j;
        this.tokenAddress = str3;
        this.formattedRate = str4;
    }
}
