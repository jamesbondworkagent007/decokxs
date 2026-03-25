package com.okinc.tradelite.service;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes24.dex */
public final class GoToTradeAlertRouteParams implements Parcelable {
    public static final Parcelable.Creator<GoToTradeAlertRouteParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final OKTradeLiteSource copydefault;

    public static final class Creator implements Parcelable.Creator<GoToTradeAlertRouteParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoToTradeAlertRouteParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new GoToTradeAlertRouteParams(parcel.readString(), OKTradeLiteSource.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoToTradeAlertRouteParams[] newArray(int i) {
            return new GoToTradeAlertRouteParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ GoToTradeAlertRouteParams copy$default(GoToTradeAlertRouteParams goToTradeAlertRouteParams, String str, OKTradeLiteSource oKTradeLiteSource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goToTradeAlertRouteParams.AEQbTJ;
        }
        if ((i & 2) != 0) {
            oKTradeLiteSource = goToTradeAlertRouteParams.copydefault;
        }
        return goToTradeAlertRouteParams.copydefault(str, oKTradeLiteSource);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final GoToTradeAlertRouteParams copydefault(@NotNull String str, @NotNull OKTradeLiteSource oKTradeLiteSource) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(oKTradeLiteSource, "");
        return new GoToTradeAlertRouteParams(str, oKTradeLiteSource);
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
        if (!(obj instanceof GoToTradeAlertRouteParams)) {
            return false;
        }
        GoToTradeAlertRouteParams goToTradeAlertRouteParams = (GoToTradeAlertRouteParams) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) goToTradeAlertRouteParams.AEQbTJ) && this.copydefault == goToTradeAlertRouteParams.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.AEQbTJ.hashCode() * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "GoToTradeAlertRouteParams(instId=" + this.AEQbTJ + ", source=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.copydefault.name());
    }

    public GoToTradeAlertRouteParams(@NotNull String str, @NotNull OKTradeLiteSource oKTradeLiteSource) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(oKTradeLiteSource, "");
        this.AEQbTJ = str;
        this.copydefault = oKTradeLiteSource;
    }
}
