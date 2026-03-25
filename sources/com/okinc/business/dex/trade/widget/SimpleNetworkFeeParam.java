package com.okinc.business.dex.trade.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexui.main.shared.model.TradeMode;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes18.dex */
public final class SimpleNetworkFeeParam implements Parcelable {
    public static final Parcelable.Creator<SimpleNetworkFeeParam> CREATOR = new Creator();
    public final String EZpvd;
    public final String KWHzl;
    public final TradeMode OLrzqt;

    public static final class Creator implements Parcelable.Creator<SimpleNetworkFeeParam> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleNetworkFeeParam createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SimpleNetworkFeeParam(TradeMode.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleNetworkFeeParam[] newArray(int i) {
            return new SimpleNetworkFeeParam[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SimpleNetworkFeeParam copy$default(SimpleNetworkFeeParam simpleNetworkFeeParam, TradeMode tradeMode, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            tradeMode = simpleNetworkFeeParam.OLrzqt;
        }
        if ((i & 2) != 0) {
            str = simpleNetworkFeeParam.EZpvd;
        }
        if ((i & 4) != 0) {
            str2 = simpleNetworkFeeParam.KWHzl;
        }
        return simpleNetworkFeeParam.KWHzl(tradeMode, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleNetworkFeeParam KWHzl(@NotNull TradeMode tradeMode, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(tradeMode, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new SimpleNetworkFeeParam(tradeMode, str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.EZpvd;
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
        if (!(obj instanceof SimpleNetworkFeeParam)) {
            return false;
        }
        SimpleNetworkFeeParam simpleNetworkFeeParam = (SimpleNetworkFeeParam) obj;
        return this.OLrzqt == simpleNetworkFeeParam.OLrzqt && Intrinsics.EZpvd((Object) this.EZpvd, (Object) simpleNetworkFeeParam.EZpvd) && Intrinsics.EZpvd((Object) this.KWHzl, (Object) simpleNetworkFeeParam.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((this.OLrzqt.hashCode() * 31) + this.EZpvd.hashCode()) * 31) + this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleNetworkFeeParam(tradeMode=" + this.OLrzqt + ", networkFeeTitle=" + this.EZpvd + ", networkFeeValue=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.OLrzqt.name());
        parcel.writeString(this.EZpvd);
        parcel.writeString(this.KWHzl);
    }

    public SimpleNetworkFeeParam(@NotNull TradeMode tradeMode, @NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(tradeMode, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.OLrzqt = tradeMode;
        this.EZpvd = str;
        this.KWHzl = str2;
    }
}
