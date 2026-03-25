package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class EscapeListDataResp implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EscapeListDataResp> CREATOR = new Creator();
    private final List<EscapeSingleBean> escapeList;
    private final String nextCursor;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<EscapeListDataResp> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeListDataResp createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(EscapeSingleBean.CREATOR.createFromParcel(parcel));
            }
            return new EscapeListDataResp(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeListDataResp[] newArray(int i) {
            return new EscapeListDataResp[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeListDataResp */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EscapeListDataResp copy$default(EscapeListDataResp escapeListDataResp, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = escapeListDataResp.nextCursor;
        }
        if ((i & 2) != 0) {
            list = escapeListDataResp.escapeList;
        }
        return escapeListDataResp.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EscapeSingleBean> component2() {
        return this.escapeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeListDataResp copy(@NotNull String str, @NotNull List<EscapeSingleBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new EscapeListDataResp(str, list);
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
        if (!(obj instanceof EscapeListDataResp)) {
            return false;
        }
        EscapeListDataResp escapeListDataResp = (EscapeListDataResp) obj;
        return Intrinsics.EZpvd((Object) this.nextCursor, (Object) escapeListDataResp.nextCursor) && Intrinsics.EZpvd(this.escapeList, escapeListDataResp.escapeList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EscapeSingleBean> getEscapeList() {
        return this.escapeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.nextCursor.hashCode() * 31) + this.escapeList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeListDataResp(nextCursor=" + this.nextCursor + ", escapeList=" + this.escapeList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.nextCursor);
        List<EscapeSingleBean> list = this.escapeList;
        parcel.writeInt(list.size());
        Iterator<EscapeSingleBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public EscapeListDataResp(@NotNull String str, @NotNull List<EscapeSingleBean> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.nextCursor = str;
        this.escapeList = list;
    }
}
