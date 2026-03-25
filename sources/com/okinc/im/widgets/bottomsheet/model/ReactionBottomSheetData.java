package com.okinc.im.widgets.bottomsheet.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ReactionBottomSheetData implements Parcelable {
    public static final Parcelable.Creator<ReactionBottomSheetData> CREATOR = new Creator();
    public final int AEQbTJ;
    public final List<ReactionTab> EZpvd;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ReactionBottomSheetData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReactionBottomSheetData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(ReactionTab.CREATOR.createFromParcel(parcel));
            }
            return new ReactionBottomSheetData(i, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReactionBottomSheetData[] newArray(int i) {
            return new ReactionBottomSheetData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.widgets.bottomsheet.model.ReactionBottomSheetData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReactionBottomSheetData copy$default(ReactionBottomSheetData reactionBottomSheetData, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = reactionBottomSheetData.AEQbTJ;
        }
        if ((i2 & 2) != 0) {
            list = reactionBottomSheetData.EZpvd;
        }
        return reactionBottomSheetData.KWHzl(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReactionTab> EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReactionBottomSheetData KWHzl(int i, @NotNull List<ReactionTab> list) {
        Intrinsics.checkNotNullParameter(list, "");
        return new ReactionBottomSheetData(i, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int OLrzqt() {
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
        if (!(obj instanceof ReactionBottomSheetData)) {
            return false;
        }
        ReactionBottomSheetData reactionBottomSheetData = (ReactionBottomSheetData) obj;
        return this.AEQbTJ == reactionBottomSheetData.AEQbTJ && Intrinsics.EZpvd(this.EZpvd, reactionBottomSheetData.EZpvd);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (Integer.hashCode(this.AEQbTJ) * 31) + this.EZpvd.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReactionBottomSheetData(totalReactions=" + this.AEQbTJ + ", reactionTabs=" + this.EZpvd + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.AEQbTJ);
        List<ReactionTab> list = this.EZpvd;
        parcel.writeInt(list.size());
        Iterator<ReactionTab> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public ReactionBottomSheetData(int i, @NotNull List<ReactionTab> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.AEQbTJ = i;
        this.EZpvd = list;
    }
}
