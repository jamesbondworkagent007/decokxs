package com.okinc.business.market.features.interval_picker.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.market.common.constants.TimeIntervalType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class IntervalPickerParams implements Parcelable {
    public static final Parcelable.Creator<IntervalPickerParams> CREATOR = new Creator();
    public final List<TimeIntervalType> AEQbTJ;
    public final TimeIntervalType copydefault;

    public static final class Creator implements Parcelable.Creator<IntervalPickerParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntervalPickerParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TimeIntervalType.valueOf(parcel.readString()));
            }
            return new IntervalPickerParams(arrayList, parcel.readInt() == 0 ? null : TimeIntervalType.valueOf(parcel.readString()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final IntervalPickerParams[] newArray(int i) {
            return new IntervalPickerParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public IntervalPickerParams() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.interval_picker.ui.IntervalPickerParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntervalPickerParams copy$default(IntervalPickerParams intervalPickerParams, List list, TimeIntervalType timeIntervalType, int i, Object obj) {
        if ((i & 1) != 0) {
            list = intervalPickerParams.AEQbTJ;
        }
        if ((i & 2) != 0) {
            timeIntervalType = intervalPickerParams.copydefault;
        }
        return intervalPickerParams.KWHzl(list, timeIntervalType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TimeIntervalType> EZpvd() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final IntervalPickerParams KWHzl(@NotNull List<? extends TimeIntervalType> list, TimeIntervalType timeIntervalType) {
        Intrinsics.checkNotNullParameter(list, "");
        return new IntervalPickerParams(list, timeIntervalType);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TimeIntervalType OLrzqt() {
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
        if (!(obj instanceof IntervalPickerParams)) {
            return false;
        }
        IntervalPickerParams intervalPickerParams = (IntervalPickerParams) obj;
        return Intrinsics.EZpvd(this.AEQbTJ, intervalPickerParams.AEQbTJ) && this.copydefault == intervalPickerParams.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AEQbTJ.hashCode();
        TimeIntervalType timeIntervalType = this.copydefault;
        return (iHashCode * 31) + (timeIntervalType == null ? 0 : timeIntervalType.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "IntervalPickerParams(options=" + this.AEQbTJ + ", selected=" + this.copydefault + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<TimeIntervalType> list = this.AEQbTJ;
        parcel.writeInt(list.size());
        Iterator<TimeIntervalType> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeString(it.next().name());
        }
        TimeIntervalType timeIntervalType = this.copydefault;
        if (timeIntervalType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(timeIntervalType.name());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.List<? extends com.okinc.business.market.common.constants.TimeIntervalType> */
    /* JADX WARN: Multi-variable type inference failed */
    public IntervalPickerParams(@NotNull List<? extends TimeIntervalType> list, TimeIntervalType timeIntervalType) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
        this.copydefault = timeIntervalType;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000d: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r3v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r1v0 java.util.List))
  (wrap:com.okinc.business.market.common.constants.TimeIntervalType:?: TERNARY null = ((wrap:int:0x0008: ARITH (r3v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.market.common.constants.TimeIntervalType) : (r2v0 com.okinc.business.market.common.constants.TimeIntervalType))
 A[MD:(java.util.List<? extends com.okinc.business.market.common.constants.TimeIntervalType>, com.okinc.business.market.common.constants.TimeIntervalType):void (m)] (LINE:16) call: com.okinc.business.market.features.interval_picker.ui.IntervalPickerParams.<init>(java.util.List, com.okinc.business.market.common.constants.TimeIntervalType):void type: THIS */
    public /* synthetic */ IntervalPickerParams(List list, TimeIntervalType timeIntervalType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list, (i & 2) != 0 ? null : timeIntervalType);
    }
}
