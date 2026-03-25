package com.okinc.okx.paymentapi.data.paas;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okx.paymentapi.service.CreateAccountType;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class ACHProperties extends ChannelProperties {
    public static final Parcelable.Creator<ACHProperties> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final CreateAccountType OLrzqt;

    public static final class Creator implements Parcelable.Creator<ACHProperties> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ACHProperties createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ACHProperties(parcel.readString(), CreateAccountType.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ACHProperties[] newArray(int i) {
            return new ACHProperties[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ACHProperties copy$default(ACHProperties aCHProperties, String str, CreateAccountType createAccountType, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aCHProperties.KWHzl;
        }
        if ((i & 2) != 0) {
            createAccountType = aCHProperties.OLrzqt;
        }
        if ((i & 4) != 0) {
            str2 = aCHProperties.AEQbTJ;
        }
        if ((i & 8) != 0) {
            str3 = aCHProperties.EZpvd;
        }
        return aCHProperties.OLrzqt(str, createAccountType, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ACHProperties OLrzqt(@NotNull String str, @NotNull CreateAccountType createAccountType, String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(createAccountType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ACHProperties(str, createAccountType, str2, str3);
    }

    @Override // com.okinc.okx.paymentapi.data.paas.ChannelProperties, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ACHProperties)) {
            return false;
        }
        ACHProperties aCHProperties = (ACHProperties) obj;
        return Intrinsics.EZpvd((Object) this.KWHzl, (Object) aCHProperties.KWHzl) && this.OLrzqt == aCHProperties.OLrzqt && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) aCHProperties.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) aCHProperties.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.KWHzl.hashCode();
        int iHashCode2 = this.OLrzqt.hashCode();
        String str = this.AEQbTJ;
        return (((((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ACHProperties(accountId=" + this.KWHzl + ", createAccountType=" + this.OLrzqt + ", depositName=" + this.AEQbTJ + ", platformCode=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.okx.paymentapi.data.paas.ChannelProperties, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.OLrzqt.name());
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ACHProperties(@NotNull String str, @NotNull CreateAccountType createAccountType, String str2, @NotNull String str3) {
        super(null, 1, null);
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(createAccountType, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.KWHzl = str;
        this.OLrzqt = createAccountType;
        this.AEQbTJ = str2;
        this.EZpvd = str3;
    }
}
