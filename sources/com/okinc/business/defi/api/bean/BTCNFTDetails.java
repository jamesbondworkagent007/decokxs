package com.okinc.business.defi.api.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class BTCNFTDetails implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<BTCNFTDetails> CREATOR = new Creator();
    private String coverUrl;
    private String inscriptionId;
    private String name;

    public static final class Creator implements Parcelable.Creator<BTCNFTDetails> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BTCNFTDetails createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BTCNFTDetails(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BTCNFTDetails[] newArray(int i) {
            return new BTCNFTDetails[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BTCNFTDetails() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BTCNFTDetails copy$default(BTCNFTDetails bTCNFTDetails, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bTCNFTDetails.inscriptionId;
        }
        if ((i & 2) != 0) {
            str2 = bTCNFTDetails.coverUrl;
        }
        if ((i & 4) != 0) {
            str3 = bTCNFTDetails.name;
        }
        return bTCNFTDetails.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.inscriptionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.coverUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BTCNFTDetails copy(String str, String str2, String str3) {
        return new BTCNFTDetails(str, str2, str3);
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
        if (!(obj instanceof BTCNFTDetails)) {
            return false;
        }
        BTCNFTDetails bTCNFTDetails = (BTCNFTDetails) obj;
        return Intrinsics.EZpvd((Object) this.inscriptionId, (Object) bTCNFTDetails.inscriptionId) && Intrinsics.EZpvd((Object) this.coverUrl, (Object) bTCNFTDetails.coverUrl) && Intrinsics.EZpvd((Object) this.name, (Object) bTCNFTDetails.name);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoverUrl() {
        return this.coverUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInscriptionId() {
        return this.inscriptionId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        String str = this.inscriptionId;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.coverUrl;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.name;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoverUrl(String str) {
        this.coverUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInscriptionId(String str) {
        this.inscriptionId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setName(String str) {
        this.name = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BTCNFTDetails(inscriptionId=" + this.inscriptionId + ", coverUrl=" + this.coverUrl + ", name=" + this.name + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.inscriptionId);
        parcel.writeString(this.coverUrl);
        parcel.writeString(this.name);
    }

    public BTCNFTDetails(String str, String str2, String str3) {
        this.inscriptionId = str;
        this.coverUrl = str2;
        this.name = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r5v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:547) call: com.okinc.business.defi.api.bean.BTCNFTDetails.<init>(java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ BTCNFTDetails(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }
}
