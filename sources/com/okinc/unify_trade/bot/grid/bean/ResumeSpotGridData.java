package com.okinc.unify_trade.bot.grid.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class ResumeSpotGridData implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<ResumeSpotGridData> CREATOR = new Creator();
    private final String algoId;
    private final String ccy;
    private final String topUpAmt;

    public static final class Creator implements Parcelable.Creator<ResumeSpotGridData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResumeSpotGridData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ResumeSpotGridData(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ResumeSpotGridData[] newArray(int i) {
            return new ResumeSpotGridData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ResumeSpotGridData copy$default(ResumeSpotGridData resumeSpotGridData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = resumeSpotGridData.algoId;
        }
        if ((i & 2) != 0) {
            str2 = resumeSpotGridData.topUpAmt;
        }
        if ((i & 4) != 0) {
            str3 = resumeSpotGridData.ccy;
        }
        return resumeSpotGridData.copy(str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.topUpAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ResumeSpotGridData copy(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new ResumeSpotGridData(str, str2, str3);
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
        if (!(obj instanceof ResumeSpotGridData)) {
            return false;
        }
        ResumeSpotGridData resumeSpotGridData = (ResumeSpotGridData) obj;
        return Intrinsics.EZpvd((Object) this.algoId, (Object) resumeSpotGridData.algoId) && Intrinsics.EZpvd((Object) this.topUpAmt, (Object) resumeSpotGridData.topUpAmt) && Intrinsics.EZpvd((Object) this.ccy, (Object) resumeSpotGridData.ccy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAlgoId() {
        return this.algoId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTopUpAmt() {
        return this.topUpAmt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.algoId.hashCode() * 31) + this.topUpAmt.hashCode()) * 31) + this.ccy.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ResumeSpotGridData(algoId=" + this.algoId + ", topUpAmt=" + this.topUpAmt + ", ccy=" + this.ccy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.algoId);
        parcel.writeString(this.topUpAmt);
        parcel.writeString(this.ccy);
    }

    public ResumeSpotGridData(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.algoId = str;
        this.topUpAmt = str2;
        this.ccy = str3;
    }
}
