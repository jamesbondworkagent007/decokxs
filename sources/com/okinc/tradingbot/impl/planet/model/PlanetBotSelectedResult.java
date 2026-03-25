package com.okinc.tradingbot.impl.planet.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class PlanetBotSelectedResult implements Parcelable {
    public static final Parcelable.Creator<PlanetBotSelectedResult> CREATOR = new Creator();
    public final PlanetBotMetadata KWHzl;
    public final String OLrzqt;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<PlanetBotSelectedResult> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetBotSelectedResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new PlanetBotSelectedResult(parcel.readString(), PlanetBotMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PlanetBotSelectedResult[] newArray(int i) {
            return new PlanetBotSelectedResult[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ PlanetBotSelectedResult copy$default(PlanetBotSelectedResult planetBotSelectedResult, String str, PlanetBotMetadata planetBotMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            str = planetBotSelectedResult.OLrzqt;
        }
        if ((i & 2) != 0) {
            planetBotMetadata = planetBotSelectedResult.KWHzl;
        }
        return planetBotSelectedResult.copydefault(str, planetBotMetadata);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetBotMetadata EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PlanetBotSelectedResult copydefault(@NotNull String str, @NotNull PlanetBotMetadata planetBotMetadata) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(planetBotMetadata, "");
        return new PlanetBotSelectedResult(str, planetBotMetadata);
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
        if (!(obj instanceof PlanetBotSelectedResult)) {
            return false;
        }
        PlanetBotSelectedResult planetBotSelectedResult = (PlanetBotSelectedResult) obj;
        return Intrinsics.EZpvd((Object) this.OLrzqt, (Object) planetBotSelectedResult.OLrzqt) && Intrinsics.EZpvd(this.KWHzl, planetBotSelectedResult.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.OLrzqt.hashCode() * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PlanetBotSelectedResult(algoId=" + this.OLrzqt + ", planetBotMetadata=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt);
        this.KWHzl.writeToParcel(parcel, i);
    }

    public PlanetBotSelectedResult(@NotNull String str, @NotNull PlanetBotMetadata planetBotMetadata) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(planetBotMetadata, "");
        this.OLrzqt = str;
        this.KWHzl = planetBotMetadata;
    }
}
