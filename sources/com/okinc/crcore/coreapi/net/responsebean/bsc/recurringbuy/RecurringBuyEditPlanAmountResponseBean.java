package com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy;

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
public final class RecurringBuyEditPlanAmountResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final String maxEditPlanAmount;
    private final String minEditPlanAmount;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RecurringBuyEditPlanAmountResponseBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RecurringBuyEditPlanAmountResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyEditPlanAmountResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecurringBuyEditPlanAmountResponseBean(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyEditPlanAmountResponseBean[] newArray(int i) {
            return new RecurringBuyEditPlanAmountResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecurringBuyEditPlanAmountResponseBean copy$default(RecurringBuyEditPlanAmountResponseBean recurringBuyEditPlanAmountResponseBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recurringBuyEditPlanAmountResponseBean.minEditPlanAmount;
        }
        if ((i & 2) != 0) {
            str2 = recurringBuyEditPlanAmountResponseBean.maxEditPlanAmount;
        }
        return recurringBuyEditPlanAmountResponseBean.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.minEditPlanAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.maxEditPlanAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyEditPlanAmountResponseBean copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new RecurringBuyEditPlanAmountResponseBean(str, str2);
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
        if (!(obj instanceof RecurringBuyEditPlanAmountResponseBean)) {
            return false;
        }
        RecurringBuyEditPlanAmountResponseBean recurringBuyEditPlanAmountResponseBean = (RecurringBuyEditPlanAmountResponseBean) obj;
        return Intrinsics.EZpvd((Object) this.minEditPlanAmount, (Object) recurringBuyEditPlanAmountResponseBean.minEditPlanAmount) && Intrinsics.EZpvd((Object) this.maxEditPlanAmount, (Object) recurringBuyEditPlanAmountResponseBean.maxEditPlanAmount);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxEditPlanAmount() {
        return this.maxEditPlanAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinEditPlanAmount() {
        return this.minEditPlanAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.minEditPlanAmount.hashCode() * 31) + this.maxEditPlanAmount.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyEditPlanAmountResponseBean(minEditPlanAmount=" + this.minEditPlanAmount + ", maxEditPlanAmount=" + this.maxEditPlanAmount + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.minEditPlanAmount);
        parcel.writeString(this.maxEditPlanAmount);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyEditPlanAmountResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringBuyEditPlanAmountResponseBean> serializer() {
            return RecurringBuyEditPlanAmountResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringBuyEditPlanAmountResponseBean(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, RecurringBuyEditPlanAmountResponseBean$$serializer.INSTANCE.getDescriptor());
        }
        this.minEditPlanAmount = str;
        this.maxEditPlanAmount = str2;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RecurringBuyEditPlanAmountResponseBean recurringBuyEditPlanAmountResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, recurringBuyEditPlanAmountResponseBean.minEditPlanAmount);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, recurringBuyEditPlanAmountResponseBean.maxEditPlanAmount);
    }

    public RecurringBuyEditPlanAmountResponseBean(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.minEditPlanAmount = str;
        this.maxEditPlanAmount = str2;
    }
}
