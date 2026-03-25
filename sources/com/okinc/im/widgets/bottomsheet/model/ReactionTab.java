package com.okinc.im.widgets.bottomsheet.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class ReactionTab implements Parcelable {
    public static final Parcelable.Creator<ReactionTab> CREATOR = new Creator();
    public final int AEQbTJ;
    public final String EZpvd;
    public final boolean KWHzl;
    public final List<ReactionUser> OLrzqt;

    /* JADX INFO: loaded from: classes18.dex */
    public static final class Creator implements Parcelable.Creator<ReactionTab> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReactionTab createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            boolean z = parcel.readInt() != 0;
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(ReactionUser.CREATOR.createFromParcel(parcel));
            }
            return new ReactionTab(string, i, z, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReactionTab[] newArray(int i) {
            return new ReactionTab[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.im.widgets.bottomsheet.model.ReactionTab */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReactionTab copy$default(ReactionTab reactionTab, String str, int i, boolean z, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = reactionTab.EZpvd;
        }
        if ((i2 & 2) != 0) {
            i = reactionTab.AEQbTJ;
        }
        if ((i2 & 4) != 0) {
            z = reactionTab.KWHzl;
        }
        if ((i2 & 8) != 0) {
            list = reactionTab.OLrzqt;
        }
        return reactionTab.AEQbTJ(str, i, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int AEQbTJ() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ReactionTab AEQbTJ(@NotNull String str, int i, boolean z, @NotNull List<ReactionUser> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new ReactionTab(str, i, z, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<ReactionUser> EZpvd() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean copydefault() {
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
        if (!(obj instanceof ReactionTab)) {
            return false;
        }
        ReactionTab reactionTab = (ReactionTab) obj;
        return Intrinsics.EZpvd((Object) this.EZpvd, (Object) reactionTab.EZpvd) && this.AEQbTJ == reactionTab.AEQbTJ && this.KWHzl == reactionTab.KWHzl && Intrinsics.EZpvd(this.OLrzqt, reactionTab.OLrzqt);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.EZpvd.hashCode() * 31) + Integer.hashCode(this.AEQbTJ)) * 31) + Boolean.hashCode(this.KWHzl)) * 31) + this.OLrzqt.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ReactionTab(emoji=" + this.EZpvd + ", count=" + this.AEQbTJ + ", isSelected=" + this.KWHzl + ", userList=" + this.OLrzqt + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.EZpvd);
        parcel.writeInt(this.AEQbTJ);
        parcel.writeInt(this.KWHzl ? 1 : 0);
        List<ReactionUser> list = this.OLrzqt;
        parcel.writeInt(list.size());
        Iterator<ReactionUser> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public ReactionTab(@NotNull String str, int i, boolean z, @NotNull List<ReactionUser> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.EZpvd = str;
        this.AEQbTJ = i;
        this.KWHzl = z;
        this.OLrzqt = list;
    }
}
