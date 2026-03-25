package com.okinc.tradingbot.impl.order.strategy.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class SpotDcaConfirmMoreData implements Parcelable {
    public static final Parcelable.Creator<SpotDcaConfirmMoreData> CREATOR = new Creator();
    public String OLrzqt;

    public static final class Creator implements Parcelable.Creator<SpotDcaConfirmMoreData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotDcaConfirmMoreData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpotDcaConfirmMoreData(parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotDcaConfirmMoreData[] newArray(int i) {
            return new SpotDcaConfirmMoreData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpotDcaConfirmMoreData copy$default(SpotDcaConfirmMoreData spotDcaConfirmMoreData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotDcaConfirmMoreData.OLrzqt;
        }
        return spotDcaConfirmMoreData.AEQbTJ(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotDcaConfirmMoreData AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new SpotDcaConfirmMoreData(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void KWHzl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
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
        return (obj instanceof SpotDcaConfirmMoreData) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) ((SpotDcaConfirmMoreData) obj).OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotDcaConfirmMoreData(viewMore=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
    }

    public SpotDcaConfirmMoreData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.OLrzqt = str;
    }
}
