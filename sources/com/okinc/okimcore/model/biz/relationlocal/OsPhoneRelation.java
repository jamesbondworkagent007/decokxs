package com.okinc.okimcore.model.biz.relationlocal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class OsPhoneRelation implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<OsPhoneRelation> CREATOR = new Creator();
    private final String contactId;
    private final String countryCode;
    private final String name;
    private final String nationalNumber;
    private final String rawNumber;
    private final String rowId;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<OsPhoneRelation> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OsPhoneRelation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new OsPhoneRelation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OsPhoneRelation[] newArray(int i) {
            return new OsPhoneRelation[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ OsPhoneRelation copy$default(OsPhoneRelation osPhoneRelation, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = osPhoneRelation.contactId;
        }
        if ((i & 2) != 0) {
            str2 = osPhoneRelation.rawNumber;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = osPhoneRelation.name;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = osPhoneRelation.countryCode;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = osPhoneRelation.nationalNumber;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = osPhoneRelation.rowId;
        }
        return osPhoneRelation.copy(str, str7, str8, str9, str10, str6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.contactId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.rawNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.countryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.nationalNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.rowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OsPhoneRelation copy(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new OsPhoneRelation(str, str2, str3, str4, str5, str6);
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
        if (!(obj instanceof OsPhoneRelation)) {
            return false;
        }
        OsPhoneRelation osPhoneRelation = (OsPhoneRelation) obj;
        return Intrinsics.EZpvd((Object) this.contactId, (Object) osPhoneRelation.contactId) && Intrinsics.EZpvd((Object) this.rawNumber, (Object) osPhoneRelation.rawNumber) && Intrinsics.EZpvd((Object) this.name, (Object) osPhoneRelation.name) && Intrinsics.EZpvd((Object) this.countryCode, (Object) osPhoneRelation.countryCode) && Intrinsics.EZpvd((Object) this.nationalNumber, (Object) osPhoneRelation.nationalNumber) && Intrinsics.EZpvd((Object) this.rowId, (Object) osPhoneRelation.rowId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getContactId() {
        return this.contactId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCountryCode() {
        return this.countryCode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNationalNumber() {
        return this.nationalNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRawNumber() {
        return this.rawNumber;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRowId() {
        return this.rowId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.contactId.hashCode();
        int iHashCode2 = this.rawNumber.hashCode();
        String str = this.name;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.countryCode;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.nationalNumber.hashCode()) * 31) + this.rowId.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OsPhoneRelation(contactId=" + this.contactId + ", rawNumber=" + this.rawNumber + ", name=" + this.name + ", countryCode=" + this.countryCode + ", nationalNumber=" + this.nationalNumber + ", rowId=" + this.rowId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.contactId);
        parcel.writeString(this.rawNumber);
        parcel.writeString(this.name);
        parcel.writeString(this.countryCode);
        parcel.writeString(this.nationalNumber);
        parcel.writeString(this.rowId);
    }

    public OsPhoneRelation(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, @NotNull String str6) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.contactId = str;
        this.rawNumber = str2;
        this.name = str3;
        this.countryCode = str4;
        this.nationalNumber = str5;
        this.rowId = str6;
    }
}
