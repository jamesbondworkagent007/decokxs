package com.okinc.unify_trade.bot.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.unify_trade.bot.mapper.CoinMarginedCcyDisplay;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class SwapCoinMProfitSwitchUiModel implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<SwapCoinMProfitSwitchUiModel> CREATOR = new Creator();
    private final String ccy;
    private final boolean isCoinM;
    private final int selectedIndex;

    public static final class Creator implements Parcelable.Creator<SwapCoinMProfitSwitchUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwapCoinMProfitSwitchUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SwapCoinMProfitSwitchUiModel(parcel.readInt() != 0, parcel.readInt(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwapCoinMProfitSwitchUiModel[] newArray(int i) {
            return new SwapCoinMProfitSwitchUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SwapCoinMProfitSwitchUiModel copy$default(SwapCoinMProfitSwitchUiModel swapCoinMProfitSwitchUiModel, boolean z, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = swapCoinMProfitSwitchUiModel.isCoinM;
        }
        if ((i2 & 2) != 0) {
            i = swapCoinMProfitSwitchUiModel.selectedIndex;
        }
        if ((i2 & 4) != 0) {
            str = swapCoinMProfitSwitchUiModel.ccy;
        }
        return swapCoinMProfitSwitchUiModel.copy(z, i, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component1() {
        return this.isCoinM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component2() {
        return this.selectedIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SwapCoinMProfitSwitchUiModel copy(boolean z, int i, String str) {
        return new SwapCoinMProfitSwitchUiModel(z, i, str);
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
        if (!(obj instanceof SwapCoinMProfitSwitchUiModel)) {
            return false;
        }
        SwapCoinMProfitSwitchUiModel swapCoinMProfitSwitchUiModel = (SwapCoinMProfitSwitchUiModel) obj;
        return this.isCoinM == swapCoinMProfitSwitchUiModel.isCoinM && this.selectedIndex == swapCoinMProfitSwitchUiModel.selectedIndex && Intrinsics.EZpvd((Object) this.ccy, (Object) swapCoinMProfitSwitchUiModel.ccy);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCcy() {
        return this.ccy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getSelectedIndex() {
        return this.selectedIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isCoinM);
        int iHashCode2 = Integer.hashCode(this.selectedIndex);
        String str = this.ccy;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str == null ? 0 : str.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isCoinM() {
        return this.isCoinM;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SwapCoinMProfitSwitchUiModel(isCoinM=" + this.isCoinM + ", selectedIndex=" + this.selectedIndex + ", ccy=" + this.ccy + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.isCoinM ? 1 : 0);
        parcel.writeInt(this.selectedIndex);
        parcel.writeString(this.ccy);
    }

    public SwapCoinMProfitSwitchUiModel(boolean z, int i, String str) {
        this.isCoinM = z;
        this.selectedIndex = i;
        this.ccy = str;
    }

    public final boolean isUsdtSelected() {
        return this.selectedIndex == CoinMarginedCcyDisplay.USDT.getIndex();
    }
}
