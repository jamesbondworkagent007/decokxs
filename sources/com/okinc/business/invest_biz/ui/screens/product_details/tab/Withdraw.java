package com.okinc.business.invest_biz.ui.screens.product_details.tab;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class Withdraw extends ProductDetailsUserTradeAction {
    public static final Withdraw EZpvd = new Withdraw();
    public static final Parcelable.Creator<Withdraw> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<Withdraw> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Withdraw createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            parcel.readInt();
            return Withdraw.EZpvd;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Withdraw[] newArray(int i) {
            return new Withdraw[i];
        }
    }

    @Override // com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.invest_biz.ui.screens.product_details.tab.ProductDetailsUserTradeAction, android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(1);
    }

    private Withdraw() {
    }
}
