package com.okinc.business.defi.assets.utxo.widget;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class UtxoAssetDisplayItem implements Parcelable {
    public static final Parcelable.Creator<UtxoAssetDisplayItem> CREATOR = new Creator();
    public final String AEQbTJ;
    public final String EZpvd;
    public final String KWHzl;
    public final String OLrzqt;
    public final String copydefault;

    public static final class Creator implements Parcelable.Creator<UtxoAssetDisplayItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoAssetDisplayItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UtxoAssetDisplayItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UtxoAssetDisplayItem[] newArray(int i) {
            return new UtxoAssetDisplayItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UtxoAssetDisplayItem copy$default(UtxoAssetDisplayItem utxoAssetDisplayItem, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = utxoAssetDisplayItem.copydefault;
        }
        if ((i & 2) != 0) {
            str2 = utxoAssetDisplayItem.EZpvd;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = utxoAssetDisplayItem.OLrzqt;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = utxoAssetDisplayItem.KWHzl;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = utxoAssetDisplayItem.AEQbTJ;
        }
        return utxoAssetDisplayItem.KWHzl(str, str6, str7, str8, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UtxoAssetDisplayItem KWHzl(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        return new UtxoAssetDisplayItem(str, str2, str3, str4, str5);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.copydefault;
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
        if (!(obj instanceof UtxoAssetDisplayItem)) {
            return false;
        }
        UtxoAssetDisplayItem utxoAssetDisplayItem = (UtxoAssetDisplayItem) obj;
        return Intrinsics.EZpvd((Object) this.copydefault, (Object) utxoAssetDisplayItem.copydefault) && Intrinsics.EZpvd((Object) this.EZpvd, (Object) utxoAssetDisplayItem.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) utxoAssetDisplayItem.OLrzqt) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) utxoAssetDisplayItem.KWHzl) && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) utxoAssetDisplayItem.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.copydefault.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.OLrzqt.hashCode()) * 31) + this.KWHzl.hashCode()) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UtxoAssetDisplayItem(id=" + this.copydefault + ", logo=" + this.EZpvd + ", displayName=" + this.OLrzqt + ", protocolName=" + this.KWHzl + ", fiatAmount=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.copydefault);
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.KWHzl);
        parcel.writeString(this.AEQbTJ);
    }

    public UtxoAssetDisplayItem(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        this.copydefault = str;
        this.EZpvd = str2;
        this.OLrzqt = str3;
        this.KWHzl = str4;
        this.AEQbTJ = str5;
    }
}
