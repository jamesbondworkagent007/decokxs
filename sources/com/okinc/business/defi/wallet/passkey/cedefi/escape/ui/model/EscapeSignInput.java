package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapeSignInput implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EscapeSignInput> CREATOR = new Creator();
    private final boolean boundWebWallet;
    private final ArrayList<EscapeSignAddressData> signDataList;

    public static final class Creator implements Parcelable.Creator<EscapeSignInput> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeSignInput createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(EscapeSignAddressData.CREATOR.createFromParcel(parcel));
            }
            return new EscapeSignInput(arrayList, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeSignInput[] newArray(int i) {
            return new EscapeSignInput[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignInput */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EscapeSignInput copy$default(EscapeSignInput escapeSignInput, ArrayList arrayList, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = escapeSignInput.signDataList;
        }
        if ((i & 2) != 0) {
            z = escapeSignInput.boundWebWallet;
        }
        return escapeSignInput.copy(arrayList, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<EscapeSignAddressData> component1() {
        return this.signDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.boundWebWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeSignInput copy(@NotNull ArrayList<EscapeSignAddressData> arrayList, boolean z) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        return new EscapeSignInput(arrayList, z);
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
        if (!(obj instanceof EscapeSignInput)) {
            return false;
        }
        EscapeSignInput escapeSignInput = (EscapeSignInput) obj;
        return Intrinsics.EZpvd(this.signDataList, escapeSignInput.signDataList) && this.boundWebWallet == escapeSignInput.boundWebWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getBoundWebWallet() {
        return this.boundWebWallet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<EscapeSignAddressData> getSignDataList() {
        return this.signDataList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.signDataList.hashCode() * 31) + Boolean.hashCode(this.boundWebWallet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeSignInput(signDataList=" + this.signDataList + ", boundWebWallet=" + this.boundWebWallet + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ArrayList<EscapeSignAddressData> arrayList = this.signDataList;
        parcel.writeInt(arrayList.size());
        Iterator<EscapeSignAddressData> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeInt(this.boundWebWallet ? 1 : 0);
    }

    public EscapeSignInput(@NotNull ArrayList<EscapeSignAddressData> arrayList, boolean z) {
        Intrinsics.checkNotNullParameter(arrayList, "");
        this.signDataList = arrayList;
        this.boundWebWallet = z;
    }
}
