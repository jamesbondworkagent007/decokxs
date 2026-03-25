package com.okinc.business.trade.features.home.ui.cefi.data;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class AdvancedQuoteUiData implements Parcelable {
    public static final Parcelable.Creator<AdvancedQuoteUiData> CREATOR = new Creator();
    public final AdvancedQuoteAndCallData AEQbTJ;

    public static final class Creator implements Parcelable.Creator<AdvancedQuoteUiData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedQuoteUiData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new AdvancedQuoteUiData((AdvancedQuoteAndCallData) parcel.readParcelable(AdvancedQuoteUiData.class.getClassLoader()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AdvancedQuoteUiData[] newArray(int i) {
            return new AdvancedQuoteUiData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ AdvancedQuoteUiData copy$default(AdvancedQuoteUiData advancedQuoteUiData, AdvancedQuoteAndCallData advancedQuoteAndCallData, int i, Object obj) {
        if ((i & 1) != 0) {
            advancedQuoteAndCallData = advancedQuoteUiData.AEQbTJ;
        }
        return advancedQuoteUiData.EZpvd(advancedQuoteAndCallData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedQuoteUiData EZpvd(@NotNull AdvancedQuoteAndCallData advancedQuoteAndCallData) {
        Intrinsics.checkNotNullParameter(advancedQuoteAndCallData, "");
        return new AdvancedQuoteUiData(advancedQuoteAndCallData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AdvancedQuoteAndCallData KWHzl() {
        return this.AEQbTJ;
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
        return (obj instanceof AdvancedQuoteUiData) && Intrinsics.EZpvd(this.AEQbTJ, ((AdvancedQuoteUiData) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "AdvancedQuoteUiData(data=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.AEQbTJ, i);
    }

    public AdvancedQuoteUiData(@NotNull AdvancedQuoteAndCallData advancedQuoteAndCallData) {
        Intrinsics.checkNotNullParameter(advancedQuoteAndCallData, "");
        this.AEQbTJ = advancedQuoteAndCallData;
    }
}
