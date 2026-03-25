package com.okinc.business.market.features.meme.ui.views;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class ToolDialogParams implements Parcelable {
    public static final Parcelable.Creator<ToolDialogParams> CREATOR = new Creator();
    public final List<ToolButton> AEQbTJ;

    public static final class Creator implements Parcelable.Creator<ToolDialogParams> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ToolDialogParams createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(ToolButton.CREATOR.createFromParcel(parcel));
            }
            return new ToolDialogParams(arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ToolDialogParams[] newArray(int i) {
            return new ToolDialogParams[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public ToolDialogParams() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.market.features.meme.ui.views.ToolDialogParams */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ToolDialogParams copy$default(ToolDialogParams toolDialogParams, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = toolDialogParams.AEQbTJ;
        }
        return toolDialogParams.copydefault(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ToolDialogParams copydefault(@NotNull List<ToolButton> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ToolDialogParams(list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ToolButton> copydefault() {
        return this.AEQbTJ;
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
        return (obj instanceof ToolDialogParams) && Intrinsics.EZpvd(this.AEQbTJ, ((ToolDialogParams) obj).AEQbTJ);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return this.AEQbTJ.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ToolDialogParams(buttons=" + this.AEQbTJ + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<ToolButton> list = this.AEQbTJ;
        parcel.writeInt(list.size());
        Iterator<ToolButton> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public ToolDialogParams(@NotNull List<ToolButton> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0008: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0004: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:40)) : (r1v0 java.util.List))
 A[MD:(java.util.List<com.okinc.business.market.features.meme.ui.views.ToolButton>):void (m)] (LINE:39) call: com.okinc.business.market.features.meme.ui.views.ToolDialogParams.<init>(java.util.List):void type: THIS */
    public /* synthetic */ ToolDialogParams(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? yDY.AhwBna() : list);
    }
}
