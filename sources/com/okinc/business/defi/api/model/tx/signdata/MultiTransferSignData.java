package com.okinc.business.defi.api.model.tx.signdata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public class MultiTransferSignData extends BaseTransferSignData implements Parcelable {
    public static final String DEFAULT_INTERVAL = "-1";
    public static final String MAX_INTERVAL = "600";
    public static final int MULTI_TYPE_MANY2MANY = 3;
    public static final int MULTI_TYPE_MANY2ONE = 2;
    public static final int MULTI_TYPE_ONE2MANY = 1;
    private AmountMode amountMode;

    @SerializedName("multiCoinId")
    private long coinId;
    private int curTXIndex;
    private ArrayList<String> fromAddress;
    private ArrayList<String> interval;
    private IntervalMode intervalMode;
    private String maxAmount;
    private String maxInterval;
    private String minAmount;
    private String minInterval;
    private ArrayList<TransferAddressData> toAddress;
    private ArrayList<String> transferAmount;
    private int transferType;
    private ArrayList<String> walletId;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<MultiTransferSignData> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<MultiTransferSignData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiTransferSignData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            long j = parcel.readLong();
            int i = parcel.readInt();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(TransferAddressData.CREATOR.createFromParcel(parcel));
            }
            return new MultiTransferSignData(j, i, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MultiTransferSignData[] newArray(int i) {
            return new MultiTransferSignData[i];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final AmountMode getAmountMode() {
        return this.amountMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.BaseTransferSignData
    public long getCoinId$OKWallet_wallet_api() {
        return this.coinId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCurTXIndex() {
        return this.curTXIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getFromAddress() {
        return this.fromAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getInterval() {
        return this.interval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntervalMode getIntervalMode() {
        return this.intervalMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxAmount() {
        return this.maxAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMaxInterval() {
        return this.maxInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinAmount() {
        return this.minAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMinInterval() {
        return this.minInterval;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<TransferAddressData> getToAddress() {
        return this.toAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getTransferAmount() {
        return this.transferAmount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTransferType() {
        return this.transferType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<String> getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAmountMode(@NotNull AmountMode amountMode) {
        Intrinsics.checkNotNullParameter(amountMode, "");
        this.amountMode = amountMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // com.okinc.business.defi.api.model.tx.signdata.BaseTransferSignData
    public void setCoinId$OKWallet_wallet_api(long j) {
        this.coinId = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurTXIndex(int i) {
        this.curTXIndex = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFromAddress(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.fromAddress = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInterval(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.interval = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setIntervalMode(@NotNull IntervalMode intervalMode) {
        Intrinsics.checkNotNullParameter(intervalMode, "");
        this.intervalMode = intervalMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMaxInterval(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.maxInterval = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinAmount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minAmount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMinInterval(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.minInterval = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setToAddress(@NotNull ArrayList<TransferAddressData> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.toAddress = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransferAmount(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.transferAmount = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTransferType(int i) {
        this.transferType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletId(@NotNull ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.walletId = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.coinId);
        parcel.writeInt(this.transferType);
        parcel.writeStringList(this.walletId);
        parcel.writeStringList(this.fromAddress);
        ArrayList<TransferAddressData> arrayList = this.toAddress;
        parcel.writeInt(arrayList.size());
        Iterator<TransferAddressData> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiTransferSignData(long j, int i, @NotNull ArrayList<String> arrayList, @NotNull ArrayList<String> arrayList2, @NotNull ArrayList<TransferAddressData> arrayList3) {
        super(j, false, 2, null);
        Intrinsics.checkNotNullParameter(arrayList, "");
        Intrinsics.checkNotNullParameter(arrayList2, "");
        Intrinsics.checkNotNullParameter(arrayList3, "");
        this.coinId = j;
        this.transferType = i;
        this.walletId = arrayList;
        this.fromAddress = arrayList2;
        this.toAddress = arrayList3;
        this.transferAmount = new ArrayList<>();
        this.amountMode = AmountMode.SPECIFIED;
        this.minAmount = "0";
        this.maxAmount = DEFAULT_INTERVAL;
        this.intervalMode = IntervalMode.RANGE;
        this.interval = new ArrayList<>();
        this.minInterval = "0";
        this.maxInterval = DEFAULT_INTERVAL;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.business.defi.api.model.tx.signdata.MultiTransferSignData.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }
    }

    public String toString() {
        return "TransferSignData(coinId=" + getCoinId() + ", walletId= '" + this.walletId + "', fromAddress='" + this.fromAddress + "', toAddress='" + this.toAddress + "', transferAmount='" + this.transferAmount + "', isTransferMaxAmount=" + isTransferMaxAmount() + ")";
    }
}
