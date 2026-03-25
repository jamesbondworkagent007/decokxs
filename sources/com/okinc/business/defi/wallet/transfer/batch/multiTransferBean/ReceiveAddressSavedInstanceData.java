package com.okinc.business.defi.wallet.transfer.batch.multiTransferBean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData;
import com.okinc.wallet.widget.input.address.WalletAddressInput;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class ReceiveAddressSavedInstanceData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ReceiveAddressSavedInstanceData> CREATOR = new Creator();
    private int checkNextAddressIndexData;
    private ErrorMessage errorMessageData;
    private ExchangeAddressData exchangeAddressData;
    private boolean hasTonExchangeAddressData;
    private WalletAddressInput inputData;

    public static final class Creator implements Parcelable.Creator<ReceiveAddressSavedInstanceData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReceiveAddressSavedInstanceData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new ReceiveAddressSavedInstanceData((WalletAddressInput) parcel.readParcelable(ReceiveAddressSavedInstanceData.class.getClassLoader()), parcel.readInt() == 0 ? null : ErrorMessage.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt(), parcel.readInt() != 0 ? ExchangeAddressData.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReceiveAddressSavedInstanceData[] newArray(int i) {
            return new ReceiveAddressSavedInstanceData[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCheckNextAddressIndexData() {
        return this.checkNextAddressIndexData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ErrorMessage getErrorMessageData() {
        return this.errorMessageData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ExchangeAddressData getExchangeAddressData() {
        return this.exchangeAddressData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getHasTonExchangeAddressData() {
        return this.hasTonExchangeAddressData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletAddressInput getInputData() {
        return this.inputData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCheckNextAddressIndexData(int i) {
        this.checkNextAddressIndexData = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setErrorMessageData(ErrorMessage errorMessage) {
        this.errorMessageData = errorMessage;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExchangeAddressData(ExchangeAddressData exchangeAddressData) {
        this.exchangeAddressData = exchangeAddressData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setHasTonExchangeAddressData(boolean z) {
        this.hasTonExchangeAddressData = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInputData(@NotNull WalletAddressInput walletAddressInput) {
        Intrinsics.checkNotNullParameter(walletAddressInput, "");
        this.inputData = walletAddressInput;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeParcelable(this.inputData, i);
        ErrorMessage errorMessage = this.errorMessageData;
        if (errorMessage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            errorMessage.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.hasTonExchangeAddressData ? 1 : 0);
        parcel.writeInt(this.checkNextAddressIndexData);
        ExchangeAddressData exchangeAddressData = this.exchangeAddressData;
        if (exchangeAddressData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            exchangeAddressData.writeToParcel(parcel, i);
        }
    }

    public ReceiveAddressSavedInstanceData(@NotNull WalletAddressInput walletAddressInput, ErrorMessage errorMessage, boolean z, int i, ExchangeAddressData exchangeAddressData) {
        Intrinsics.checkNotNullParameter(walletAddressInput, "");
        this.inputData = walletAddressInput;
        this.errorMessageData = errorMessage;
        this.hasTonExchangeAddressData = z;
        this.checkNextAddressIndexData = i;
        this.exchangeAddressData = exchangeAddressData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0010: CONSTRUCTOR 
  (r7v0 com.okinc.wallet.widget.input.address.WalletAddressInput)
  (r8v0 com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.ErrorMessage)
  (wrap:boolean:0x0005: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r9v0 boolean))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0006: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (-1 int) : (r10v0 int))
  (r11v0 com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData)
 A[MD:(com.okinc.wallet.widget.input.address.WalletAddressInput, com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.ErrorMessage, boolean, int, com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData):void (m)] (LINE:12) call: com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.ReceiveAddressSavedInstanceData.<init>(com.okinc.wallet.widget.input.address.WalletAddressInput, com.okinc.business.defi.wallet.transfer.batch.multiTransferBean.ErrorMessage, boolean, int, com.okinc.business.defi.wallet.transfer.receive.exchange.bean.ExchangeAddressData):void type: THIS */
    public /* synthetic */ ReceiveAddressSavedInstanceData(WalletAddressInput walletAddressInput, ErrorMessage errorMessage, boolean z, int i, ExchangeAddressData exchangeAddressData, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(walletAddressInput, errorMessage, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? -1 : i, exchangeAddressData);
    }
}
