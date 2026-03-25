package com.okinc.okx.paymentapi.educationinfo;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class EducationEventData implements Parcelable {
    public static final Parcelable.Creator<EducationEventData> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<EducationEventData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EducationEventData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EducationEventData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EducationEventData[] newArray(int i) {
            return new EducationEventData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EducationEventData copy$default(EducationEventData educationEventData, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = educationEventData.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = educationEventData.KWHzl;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = educationEventData.AEQbTJ;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = educationEventData.EZpvd;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = educationEventData.OLrzqt;
        }
        return educationEventData.EZpvd(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EducationEventData EZpvd(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new EducationEventData(str, str2, str3, str4, str5);
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
        if (!(obj instanceof EducationEventData)) {
            return false;
        }
        EducationEventData educationEventData = (EducationEventData) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) educationEventData.copydefault) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) educationEventData.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) educationEventData.AEQbTJ) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) educationEventData.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) educationEventData.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.copydefault.hashCode() * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode()) * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EducationEventData(flow=" + this.copydefault + ", platformCode=" + this.KWHzl + ", depositName=" + this.AEQbTJ + ", tradeType=" + this.EZpvd + ", entrySource=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.OLrzqt);
    }

    public EducationEventData(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.copydefault = str;
        this.KWHzl = str2;
        this.AEQbTJ = str3;
        this.EZpvd = str4;
        this.OLrzqt = str5;
    }
}
