package com.okinc.business.trade.features.home.ui.cefi.placeorder;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.dexlogic.bean.DexMultiTokenInfoBean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class UIPricingToken implements Parcelable {
    public static final Parcelable.Creator<UIPricingToken> CREATOR = new Creator();
    public final boolean EZpvd;
    public final DexMultiTokenInfoBean KWHzl;

    public static final class Creator implements Parcelable.Creator<UIPricingToken> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UIPricingToken createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new UIPricingToken(DexMultiTokenInfoBean.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UIPricingToken[] newArray(int i) {
            return new UIPricingToken[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ UIPricingToken copy$default(UIPricingToken uIPricingToken, DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            dexMultiTokenInfoBean = uIPricingToken.KWHzl;
        }
        if ((i & 2) != 0) {
            z = uIPricingToken.EZpvd;
        }
        return uIPricingToken.AEQbTJ(dexMultiTokenInfoBean, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final UIPricingToken AEQbTJ(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        return new UIPricingToken(dexMultiTokenInfoBean, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexMultiTokenInfoBean EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean OLrzqt() {
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
        if (!(obj instanceof UIPricingToken)) {
            return false;
        }
        UIPricingToken uIPricingToken = (UIPricingToken) obj;
        return Intrinsics.EZpvd(this.KWHzl, uIPricingToken.KWHzl) && this.EZpvd == uIPricingToken.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.KWHzl.hashCode() * 31) + Boolean.hashCode(this.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "UIPricingToken(token=" + this.KWHzl + ", isSelected=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        this.KWHzl.writeToParcel(parcel, i);
        parcel.writeInt(this.EZpvd ? 1 : 0);
    }

    public UIPricingToken(@NotNull DexMultiTokenInfoBean dexMultiTokenInfoBean, boolean z) {
        Intrinsics.checkNotNullParameter(dexMultiTokenInfoBean, "");
        this.KWHzl = dexMultiTokenInfoBean;
        this.EZpvd = z;
    }
}
