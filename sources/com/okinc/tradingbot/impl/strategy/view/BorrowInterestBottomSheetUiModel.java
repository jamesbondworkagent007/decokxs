package com.okinc.tradingbot.impl.strategy.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.tradingbot.impl.dto.BillsArchive;
import com.okinc.tradingbot.impl.dto.InterestInfoResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class BorrowInterestBottomSheetUiModel implements Parcelable {
    public final String AEQbTJ;
    public InterestInfoResponse KWHzl;
    public List<BillsArchive> copydefault;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int OLrzqt = 8;
    public static final Parcelable.Creator<BorrowInterestBottomSheetUiModel> CREATOR = new Creator();
    public static final BorrowInterestBottomSheetUiModel EZpvd = new BorrowInterestBottomSheetUiModel("", null, yDY.AhwBna());

    public static final class Creator implements Parcelable.Creator<BorrowInterestBottomSheetUiModel> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BorrowInterestBottomSheetUiModel createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            InterestInfoResponse interestInfoResponseCreateFromParcel = parcel.readInt() == 0 ? null : InterestInfoResponse.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(BillsArchive.CREATOR.createFromParcel(parcel));
            }
            return new BorrowInterestBottomSheetUiModel(string, interestInfoResponseCreateFromParcel, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BorrowInterestBottomSheetUiModel[] newArray(int i) {
            return new BorrowInterestBottomSheetUiModel[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.tradingbot.impl.strategy.view.BorrowInterestBottomSheetUiModel */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BorrowInterestBottomSheetUiModel copy$default(BorrowInterestBottomSheetUiModel borrowInterestBottomSheetUiModel, String str, InterestInfoResponse interestInfoResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = borrowInterestBottomSheetUiModel.AEQbTJ;
        }
        if ((i & 2) != 0) {
            interestInfoResponse = borrowInterestBottomSheetUiModel.KWHzl;
        }
        if ((i & 4) != 0) {
            list = borrowInterestBottomSheetUiModel.copydefault;
        }
        return borrowInterestBottomSheetUiModel.OLrzqt(str, interestInfoResponse, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<BillsArchive> EZpvd() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BorrowInterestBottomSheetUiModel OLrzqt(@NotNull String str, InterestInfoResponse interestInfoResponse, @NotNull List<BillsArchive> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new BorrowInterestBottomSheetUiModel(str, interestInfoResponse, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final InterestInfoResponse copydefault() {
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
        if (!(obj instanceof BorrowInterestBottomSheetUiModel)) {
            return false;
        }
        BorrowInterestBottomSheetUiModel borrowInterestBottomSheetUiModel = (BorrowInterestBottomSheetUiModel) obj;
        return Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) borrowInterestBottomSheetUiModel.AEQbTJ) && Intrinsics.EZpvd(this.KWHzl, borrowInterestBottomSheetUiModel.KWHzl) && Intrinsics.EZpvd(this.copydefault, borrowInterestBottomSheetUiModel.copydefault);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        InterestInfoResponse interestInfoResponse = this.KWHzl;
        return (((iHashCode * 31) + (interestInfoResponse == null ? 0 : interestInfoResponse.hashCode())) * 31) + this.copydefault.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BorrowInterestBottomSheetUiModel(debtCcy=" + this.AEQbTJ + ", interestInfo=" + this.KWHzl + ", accountBills=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AEQbTJ);
        InterestInfoResponse interestInfoResponse = this.KWHzl;
        if (interestInfoResponse == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            interestInfoResponse.writeToParcel(parcel, i);
        }
        List<BillsArchive> list = this.copydefault;
        parcel.writeInt(list.size());
        Iterator<BillsArchive> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public BorrowInterestBottomSheetUiModel(@NotNull String str, InterestInfoResponse interestInfoResponse, @NotNull List<BillsArchive> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = str;
        this.KWHzl = interestInfoResponse;
        this.copydefault = list;
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.tradingbot.impl.strategy.view.BorrowInterestBottomSheetUiModel.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final BorrowInterestBottomSheetUiModel KWHzl() {
            return BorrowInterestBottomSheetUiModel.EZpvd;
        }
    }
}
