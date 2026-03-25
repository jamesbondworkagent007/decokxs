package com.okinc.business.market.features.smart_money.signal.ui.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class SignalMultiSelectBottomSheetParams implements Parcelable {
    public static final Parcelable.Creator<SignalMultiSelectBottomSheetParams> CREATOR = new Creator();
    public final List<SignalMultiSelectUiModel> KWHzl;

    public static final class Creator implements Parcelable.Creator<SignalMultiSelectBottomSheetParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalMultiSelectBottomSheetParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(SignalMultiSelectUiModel.CREATOR.createFromParcel(parcel));
            }
            return new SignalMultiSelectBottomSheetParams(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SignalMultiSelectBottomSheetParams[] newArray(int i) {
            return new SignalMultiSelectBottomSheetParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SignalMultiSelectBottomSheetParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiSelectBottomSheetParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SignalMultiSelectBottomSheetParams copy$default(SignalMultiSelectBottomSheetParams signalMultiSelectBottomSheetParams, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = signalMultiSelectBottomSheetParams.KWHzl;
        }
        return signalMultiSelectBottomSheetParams.copydefault(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SignalMultiSelectBottomSheetParams copydefault(@NotNull List<SignalMultiSelectUiModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new SignalMultiSelectBottomSheetParams(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<SignalMultiSelectUiModel> copydefault() {
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
        return (obj instanceof SignalMultiSelectBottomSheetParams) && Intrinsics.EZpvd(this.KWHzl, ((SignalMultiSelectBottomSheetParams) obj).KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.KWHzl.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SignalMultiSelectBottomSheetParams(items=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<SignalMultiSelectUiModel> list = this.KWHzl;
        parcel.writeInt(list.size());
        Iterator<SignalMultiSelectUiModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public SignalMultiSelectBottomSheetParams(@NotNull List<SignalMultiSelectUiModel> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.KWHzl = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:38)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.features.smart_money.signal.domain.model.SignalMultiSelectUiModel>):void (m)] (LINE:37) call: com.okinc.business.market.features.smart_money.signal.ui.widget.SignalMultiSelectBottomSheetParams.<init>(java.util.List):void type: THIS */
    public /* synthetic */ SignalMultiSelectBottomSheetParams(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
