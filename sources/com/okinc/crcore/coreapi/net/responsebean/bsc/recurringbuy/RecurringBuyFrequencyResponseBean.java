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

/* JADX INFO: loaded from: classes15.dex */
@Serializable
public final class RecurringBuyFrequencyResponseBean implements Parcelable {
    public static final int $stable = 0;
    private final int code;
    private final String frequency;
    private final String localizedName;
    private final String nextPurchaseTime;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RecurringBuyFrequencyResponseBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<RecurringBuyFrequencyResponseBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyFrequencyResponseBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecurringBuyFrequencyResponseBean(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringBuyFrequencyResponseBean[] newArray(int i) {
            return new RecurringBuyFrequencyResponseBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecurringBuyFrequencyResponseBean copy$default(RecurringBuyFrequencyResponseBean recurringBuyFrequencyResponseBean, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = recurringBuyFrequencyResponseBean.code;
        }
        if ((i2 & 2) != 0) {
            str = recurringBuyFrequencyResponseBean.frequency;
        }
        if ((i2 & 4) != 0) {
            str2 = recurringBuyFrequencyResponseBean.localizedName;
        }
        if ((i2 & 8) != 0) {
            str3 = recurringBuyFrequencyResponseBean.nextPurchaseTime;
        }
        return recurringBuyFrequencyResponseBean.copy(i, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.localizedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.nextPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringBuyFrequencyResponseBean copy(int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new RecurringBuyFrequencyResponseBean(i, str, str2, str3);
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
        if (!(obj instanceof RecurringBuyFrequencyResponseBean)) {
            return false;
        }
        RecurringBuyFrequencyResponseBean recurringBuyFrequencyResponseBean = (RecurringBuyFrequencyResponseBean) obj;
        return this.code == recurringBuyFrequencyResponseBean.code && Intrinsics.EZpvd((Object) this.frequency, (Object) recurringBuyFrequencyResponseBean.frequency) && Intrinsics.EZpvd((Object) this.localizedName, (Object) recurringBuyFrequencyResponseBean.localizedName) && Intrinsics.EZpvd((Object) this.nextPurchaseTime, (Object) recurringBuyFrequencyResponseBean.nextPurchaseTime);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFrequency() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLocalizedName() {
        return this.localizedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextPurchaseTime() {
        return this.nextPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((Integer.hashCode(this.code) * 31) + this.frequency.hashCode()) * 31) + this.localizedName.hashCode()) * 31) + this.nextPurchaseTime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringBuyFrequencyResponseBean(code=" + this.code + ", frequency=" + this.frequency + ", localizedName=" + this.localizedName + ", nextPurchaseTime=" + this.nextPurchaseTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.code);
        parcel.writeString(this.frequency);
        parcel.writeString(this.localizedName);
        parcel.writeString(this.nextPurchaseTime);
    }

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.coreapi.net.responsebean.bsc.recurringbuy.RecurringBuyFrequencyResponseBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringBuyFrequencyResponseBean> serializer() {
            return RecurringBuyFrequencyResponseBean$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringBuyFrequencyResponseBean(int i, int i2, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            PluginExceptionsKt.throwMissingFieldException(i, 15, RecurringBuyFrequencyResponseBean$$serializer.INSTANCE.getDescriptor());
        }
        this.code = i2;
        this.frequency = str;
        this.localizedName = str2;
        this.nextPurchaseTime = str3;
    }

    public static final /* synthetic */ void write$Self$OKCRCore_cr_core(RecurringBuyFrequencyResponseBean recurringBuyFrequencyResponseBean, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeIntElement(serialDescriptor, 0, recurringBuyFrequencyResponseBean.code);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, recurringBuyFrequencyResponseBean.frequency);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, recurringBuyFrequencyResponseBean.localizedName);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, recurringBuyFrequencyResponseBean.nextPurchaseTime);
    }

    public RecurringBuyFrequencyResponseBean(int i, @NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.code = i;
        this.frequency = str;
        this.localizedName = str2;
        this.nextPurchaseTime = str3;
    }
}
