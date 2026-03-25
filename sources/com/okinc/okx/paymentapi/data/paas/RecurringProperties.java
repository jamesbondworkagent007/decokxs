package com.okinc.okx.paymentapi.data.paas;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class RecurringProperties implements Parcelable {
    public static final Parcelable.Creator<RecurringProperties> CREATOR = new Creator();
    public final String OLrzqt;
    public int copydefault;

    public static final class Creator implements Parcelable.Creator<RecurringProperties> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringProperties createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new RecurringProperties(parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RecurringProperties[] newArray(int i) {
            return new RecurringProperties[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ RecurringProperties copy$default(RecurringProperties recurringProperties, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = recurringProperties.OLrzqt;
        }
        if ((i2 & 2) != 0) {
            i = recurringProperties.copydefault;
        }
        return recurringProperties.KWHzl(str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final RecurringProperties KWHzl(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new RecurringProperties(str, i);
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
        if (!(obj instanceof RecurringProperties)) {
            return false;
        }
        RecurringProperties recurringProperties = (RecurringProperties) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) recurringProperties.OLrzqt) && this.copydefault == recurringProperties.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + Integer.hashCode(this.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "RecurringProperties(orderType=" + this.OLrzqt + ", frequency=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        parcel.writeInt(this.copydefault);
    }

    public RecurringProperties(@NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
        this.copydefault = i;
    }
}
