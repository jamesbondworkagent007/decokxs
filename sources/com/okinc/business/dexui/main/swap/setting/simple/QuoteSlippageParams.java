package com.okinc.business.dexui.main.swap.setting.simple;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class QuoteSlippageParams implements Parcelable {
    public static final Parcelable.Creator<QuoteSlippageParams> CREATOR = new Creator();
    public final String AEQbTJ;
    public final boolean EZpvd;
    public final boolean KWHzl;

    public static final class Creator implements Parcelable.Creator<QuoteSlippageParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuoteSlippageParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new QuoteSlippageParams(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuoteSlippageParams[] newArray(int i) {
            return new QuoteSlippageParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ QuoteSlippageParams copy$default(QuoteSlippageParams quoteSlippageParams, boolean z, boolean z2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = quoteSlippageParams.EZpvd;
        }
        if ((i & 2) != 0) {
            z2 = quoteSlippageParams.KWHzl;
        }
        if ((i & 4) != 0) {
            str = quoteSlippageParams.AEQbTJ;
        }
        return quoteSlippageParams.EZpvd(z, z2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final QuoteSlippageParams EZpvd(boolean z, boolean z2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return new QuoteSlippageParams(z, z2, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
        return this.KWHzl;
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
        if (!(obj instanceof QuoteSlippageParams)) {
            return false;
        }
        QuoteSlippageParams quoteSlippageParams = (QuoteSlippageParams) obj;
        return this.EZpvd == quoteSlippageParams.EZpvd && this.KWHzl == quoteSlippageParams.KWHzl && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) quoteSlippageParams.AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Boolean.hashCode(this.EZpvd) * 31) + Boolean.hashCode(this.KWHzl)) * 31) + this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "QuoteSlippageParams(isSafeMoonToken=" + this.EZpvd + ", isSingleChain=" + this.KWHzl + ", autoSlippage=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.EZpvd ? 1 : 0);
        parcel.writeInt(this.KWHzl ? 1 : 0);
        parcel.writeString(this.AEQbTJ);
    }

    public QuoteSlippageParams(boolean z, boolean z2, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.EZpvd = z;
        this.KWHzl = z2;
        this.AEQbTJ = str;
    }
}
