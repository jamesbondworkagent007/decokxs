package com.okinc.okpaymentapi.data.remote.model.management;

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
import kotlinx.serialization.internal.StringSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Serializable
public final class RecurringFrequency implements Parcelable {
    public static final int $stable = 0;
    private final String frequency;
    private final String localizedName;
    private final String nextPurchaseTime;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<RecurringFrequency> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<RecurringFrequency> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringFrequency createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecurringFrequency(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringFrequency[] newArray(int i) {
            return new RecurringFrequency[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecurringFrequency copy$default(RecurringFrequency recurringFrequency, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = recurringFrequency.frequency;
        }
        if ((i & 2) != 0) {
            str2 = recurringFrequency.localizedName;
        }
        if ((i & 4) != 0) {
            str3 = recurringFrequency.nextPurchaseTime;
        }
        return recurringFrequency.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.frequency;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.localizedName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.nextPurchaseTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringFrequency copy(@NotNull String str, String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new RecurringFrequency(str, str2, str3);
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
        if (!(obj instanceof RecurringFrequency)) {
            return false;
        }
        RecurringFrequency recurringFrequency = (RecurringFrequency) obj;
        return Intrinsics.EZpvd((Object) this.frequency, (Object) recurringFrequency.frequency) && Intrinsics.EZpvd((Object) this.localizedName, (Object) recurringFrequency.localizedName) && Intrinsics.EZpvd((Object) this.nextPurchaseTime, (Object) recurringFrequency.nextPurchaseTime);
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
        int iHashCode = this.frequency.hashCode();
        String str = this.localizedName;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.nextPurchaseTime.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringFrequency(frequency=" + this.frequency + ", localizedName=" + this.localizedName + ", nextPurchaseTime=" + this.nextPurchaseTime + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.frequency);
        parcel.writeString(this.localizedName);
        parcel.writeString(this.nextPurchaseTime);
    }

    public static final class Companion {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        private Companion() {
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.okpaymentapi.data.remote.model.management.RecurringFrequency.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<RecurringFrequency> serializer() {
            return RecurringFrequency$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ RecurringFrequency(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, RecurringFrequency$$serializer.INSTANCE.getDescriptor());
        }
        this.frequency = str;
        this.localizedName = str2;
        this.nextPurchaseTime = str3;
    }

    public static final /* synthetic */ void write$Self$OKPayments_ok_payment_api(RecurringFrequency recurringFrequency, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, recurringFrequency.frequency);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, recurringFrequency.localizedName);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, recurringFrequency.nextPurchaseTime);
    }

    public RecurringFrequency(@NotNull String str, String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.frequency = str;
        this.localizedName = str2;
        this.nextPurchaseTime = str3;
    }
}
