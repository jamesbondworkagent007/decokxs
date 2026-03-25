package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class EscapedWalletListUIData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EscapedWalletListUIData> CREATOR = new Creator();
    private final List<EscapedWalletItemUIData> escapedWalletList;
    private final String nextCursor;

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<EscapedWalletListUIData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapedWalletListUIData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(EscapedWalletItemUIData.CREATOR.createFromParcel(parcel));
            }
            return new EscapedWalletListUIData(string, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapedWalletListUIData[] newArray(int i) {
            return new EscapedWalletListUIData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.adapter.EscapedWalletListUIData */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EscapedWalletListUIData copy$default(EscapedWalletListUIData escapedWalletListUIData, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = escapedWalletListUIData.nextCursor;
        }
        if ((i & 2) != 0) {
            list = escapedWalletListUIData.escapedWalletList;
        }
        return escapedWalletListUIData.copy(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EscapedWalletItemUIData> component2() {
        return this.escapedWalletList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapedWalletListUIData copy(@NotNull String str, @NotNull List<EscapedWalletItemUIData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new EscapedWalletListUIData(str, list);
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
        if (!(obj instanceof EscapedWalletListUIData)) {
            return false;
        }
        EscapedWalletListUIData escapedWalletListUIData = (EscapedWalletListUIData) obj;
        return Intrinsics.EZpvd((Object) this.nextCursor, (Object) escapedWalletListUIData.nextCursor) && Intrinsics.EZpvd(this.escapedWalletList, escapedWalletListUIData.escapedWalletList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EscapedWalletItemUIData> getEscapedWalletList() {
        return this.escapedWalletList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.nextCursor.hashCode() * 31) + this.escapedWalletList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapedWalletListUIData(nextCursor=" + this.nextCursor + ", escapedWalletList=" + this.escapedWalletList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.nextCursor);
        List<EscapedWalletItemUIData> list = this.escapedWalletList;
        parcel.writeInt(list.size());
        Iterator<EscapedWalletItemUIData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public EscapedWalletListUIData(@NotNull String str, @NotNull List<EscapedWalletItemUIData> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.nextCursor = str;
        this.escapedWalletList = list;
    }
}
