package com.okinc.im.widgets.bottomsheet.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okimcore.model.remote.OfficialTagInfo;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ReactionUser implements Parcelable {
    public final String AEQbTJ;
    public final String AYXKKw;
    public final OfficialTagInfo AhwBna;
    public final String EZpvd;
    public final String KWHzl;
    public final Integer copydefault;
    public static final int OLrzqt = OfficialTagInfo.$stable;
    public static final Parcelable.Creator<ReactionUser> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ReactionUser> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReactionUser createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ReactionUser(parcel.readString(), parcel.readString(), parcel.readString(), (OfficialTagInfo) parcel.readParcelable(ReactionUser.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReactionUser[] newArray(int i) {
            return new ReactionUser[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReactionUser copy$default(ReactionUser reactionUser, String str, String str2, String str3, OfficialTagInfo officialTagInfo, Integer num, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = reactionUser.AYXKKw;
        }
        if ((i & 2) != 0) {
            str2 = reactionUser.KWHzl;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = reactionUser.AEQbTJ;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            officialTagInfo = reactionUser.AhwBna;
        }
        OfficialTagInfo officialTagInfo2 = officialTagInfo;
        if ((i & 16) != 0) {
            num = reactionUser.copydefault;
        }
        Integer num2 = num;
        if ((i & 32) != 0) {
            str4 = reactionUser.EZpvd;
        }
        return reactionUser.OLrzqt(str, str5, str6, officialTagInfo2, num2, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer AEQbTJ() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OfficialTagInfo AhwBna() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReactionUser OLrzqt(@NotNull String str, String str2, @NotNull String str3, OfficialTagInfo officialTagInfo, Integer num, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ReactionUser(str, str2, str3, officialTagInfo, num, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.AYXKKw;
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
        if (!(obj instanceof ReactionUser)) {
            return false;
        }
        ReactionUser reactionUser = (ReactionUser) obj;
        return Intrinsics.EZpvd((Object) this.AYXKKw, (Object) reactionUser.AYXKKw) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) reactionUser.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) reactionUser.AEQbTJ) && Intrinsics.EZpvd(this.AhwBna, reactionUser.AhwBna) && Intrinsics.EZpvd(this.copydefault, reactionUser.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) reactionUser.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AYXKKw.hashCode();
        String str = this.KWHzl;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        OfficialTagInfo officialTagInfo = this.AhwBna;
        int iHashCode4 = officialTagInfo == null ? 0 : officialTagInfo.hashCode();
        Integer num = this.copydefault;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (num != null ? num.hashCode() : 0)) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReactionUser(userId=" + this.AYXKKw + ", displayName=" + this.KWHzl + ", avatar=" + this.AEQbTJ + ", userTag=" + this.AhwBna + ", groupRole=" + this.copydefault + ", emoji=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AYXKKw);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AEQbTJ);
        parcel.writeParcelable(this.AhwBna, i);
        Integer num = this.copydefault;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
        parcel.writeString(this.EZpvd);
    }

    public ReactionUser(@NotNull String str, String str2, @NotNull String str3, OfficialTagInfo officialTagInfo, Integer num, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.AYXKKw = str;
        this.KWHzl = str2;
        this.AEQbTJ = str3;
        this.AhwBna = officialTagInfo;
        this.copydefault = num;
        this.EZpvd = str4;
    }
}
