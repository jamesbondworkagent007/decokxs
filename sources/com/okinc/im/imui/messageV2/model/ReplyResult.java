package com.okinc.im.imui.messageV2.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ReplyResult implements Parcelable {
    public static final Parcelable.Creator<ReplyResult> CREATOR = new Creator();
    public final String AEQbTJ;
    public final Long EZpvd;
    public final Long OLrzqt;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ReplyResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReplyResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ReplyResult(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReplyResult[] newArray(int i) {
            return new ReplyResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ ReplyResult copy$default(ReplyResult replyResult, String str, Long l, Long l2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = replyResult.AEQbTJ;
        }
        if ((i & 2) != 0) {
            l = replyResult.OLrzqt;
        }
        if ((i & 4) != 0) {
            l2 = replyResult.EZpvd;
        }
        return replyResult.EZpvd(str, l, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long AEQbTJ() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReplyResult EZpvd(@NotNull String str, Long l, Long l2) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ReplyResult(str, l, l2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long copydefault() {
        return this.OLrzqt;
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
        if (!(obj instanceof ReplyResult)) {
            return false;
        }
        ReplyResult replyResult = (ReplyResult) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) replyResult.AEQbTJ) && Intrinsics.EZpvd(this.OLrzqt, replyResult.OLrzqt) && Intrinsics.EZpvd(this.EZpvd, replyResult.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        Long l = this.OLrzqt;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.EZpvd;
        return (((iHashCode * 31) + iHashCode2) * 31) + (l2 != null ? l2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReplyResult(channelId=" + this.AEQbTJ + ", oldReplyId=" + this.OLrzqt + ", newReplyId=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        Long l = this.OLrzqt;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.EZpvd;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
    }

    public ReplyResult(@NotNull String str, Long l, Long l2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
        this.OLrzqt = l;
        this.EZpvd = l2;
    }
}
