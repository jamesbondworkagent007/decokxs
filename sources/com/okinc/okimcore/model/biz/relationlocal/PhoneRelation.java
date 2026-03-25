package com.okinc.okimcore.model.biz.relationlocal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class PhoneRelation implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<PhoneRelation> CREATOR = new Creator();
    private final String contactId;
    private final String countryCode;
    private final String hash;
    private final String name;
    private final String nationalNumber;
    private final String rawNumber;
    private final String rowId;

    public static final class Creator implements Parcelable.Creator<PhoneRelation> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneRelation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PhoneRelation(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PhoneRelation[] newArray(int i) {
            return new PhoneRelation[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PhoneRelation copy$default(PhoneRelation phoneRelation, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phoneRelation.contactId;
        }
        if ((i & 2) != 0) {
            str2 = phoneRelation.rawNumber;
        }
        String str8 = str2;
        if ((i & 4) != 0) {
            str3 = phoneRelation.name;
        }
        String str9 = str3;
        if ((i & 8) != 0) {
            str4 = phoneRelation.countryCode;
        }
        String str10 = str4;
        if ((i & 16) != 0) {
            str5 = phoneRelation.nationalNumber;
        }
        String str11 = str5;
        if ((i & 32) != 0) {
            str6 = phoneRelation.rowId;
        }
        String str12 = str6;
        if ((i & 64) != 0) {
            str7 = phoneRelation.hash;
        }
        return phoneRelation.copy(str, str8, str9, str10, str11, str12, str7);
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
    public final String component7() {
        return this.hash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PhoneRelation copy(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        return new PhoneRelation(str, str2, str3, str4, str5, str6, str7);
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
        if (!(obj instanceof PhoneRelation)) {
            return false;
        }
        PhoneRelation phoneRelation = (PhoneRelation) obj;
        return Intrinsics.EZpvd((Object) this.contactId, (Object) phoneRelation.contactId) && Intrinsics.EZpvd((Object) this.rawNumber, (Object) phoneRelation.rawNumber) && Intrinsics.EZpvd((Object) this.name, (Object) phoneRelation.name) && Intrinsics.EZpvd((Object) this.countryCode, (Object) phoneRelation.countryCode) && Intrinsics.EZpvd((Object) this.nationalNumber, (Object) phoneRelation.nationalNumber) && Intrinsics.EZpvd((Object) this.rowId, (Object) phoneRelation.rowId) && Intrinsics.EZpvd((Object) this.hash, (Object) phoneRelation.hash);
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
    public final String getHash() {
        return this.hash;
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
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.nationalNumber.hashCode()) * 31) + this.rowId.hashCode()) * 31) + this.hash.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PhoneRelation(contactId=" + this.contactId + ", rawNumber=" + this.rawNumber + ", name=" + this.name + ", countryCode=" + this.countryCode + ", nationalNumber=" + this.nationalNumber + ", rowId=" + this.rowId + ", hash=" + this.hash + ")";
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
        parcel.writeString(this.hash);
    }

    public PhoneRelation(@NotNull String str, @NotNull String str2, String str3, String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        this.contactId = str;
        this.rawNumber = str2;
        this.name = str3;
        this.countryCode = str4;
        this.nationalNumber = str5;
        this.rowId = str6;
        this.hash = str7;
    }
}
