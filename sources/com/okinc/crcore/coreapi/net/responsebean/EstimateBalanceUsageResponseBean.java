package com.okinc.crcore.coreapi.net.responsebean;

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

/* JADX INFO: loaded from: classes18.dex */
@Serializable
public final class EstimateBalanceUsageResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final String funding;
    private final String trading;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<EstimateBalanceUsageResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<EstimateBalanceUsageResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EstimateBalanceUsageResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EstimateBalanceUsageResponseBean(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EstimateBalanceUsageResponseBean[] newArray(int i) {
            return new EstimateBalanceUsageResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EstimateBalanceUsageResponseBean copy$default(EstimateBalanceUsageResponseBean estimateBalanceUsageResponseBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = estimateBalanceUsageResponseBean.trading;
        }
        if ((i & 2) != 0) {
            str2 = estimateBalanceUsageResponseBean.funding;
        }
        return estimateBalanceUsageResponseBean.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.trading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.funding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EstimateBalanceUsageResponseBean copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new EstimateBalanceUsageResponseBean(str, str2);
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
        if (!(obj instanceof EstimateBalanceUsageResponseBean)) {
            return false;
        }
        EstimateBalanceUsageResponseBean estimateBalanceUsageResponseBean = (EstimateBalanceUsageResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.trading, (Object) estimateBalanceUsageResponseBean.trading) && Intrinsics.EZpvd((Object) this.funding, (Object) estimateBalanceUsageResponseBean.funding);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFunding() {
        return this.funding;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTrading() {
        return this.trading;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.trading.hashCode() * 31) + this.funding.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EstimateBalanceUsageResponseBean(trading=" + this.trading + ", funding=" + this.funding + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.trading);
        parcel.writeString(this.funding);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.EstimateBalanceUsageResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EstimateBalanceUsageResponseBean> serializer() {
            return EstimateBalanceUsageResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EstimateBalanceUsageResponseBean(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, EstimateBalanceUsageResponseBean$$serializer.INSTANCE.getDescriptor());
        }
        this.trading = str;
        this.funding = str2;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(EstimateBalanceUsageResponseBean estimateBalanceUsageResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, estimateBalanceUsageResponseBean.trading);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, estimateBalanceUsageResponseBean.funding);
    }

    public EstimateBalanceUsageResponseBean(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.trading = str;
        this.funding = str2;
    }
}
