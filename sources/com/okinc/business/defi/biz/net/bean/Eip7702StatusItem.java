package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class Eip7702StatusItem implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<Eip7702StatusItem> CREATOR = new Creator();
    private final String address;
    private final long chainIndex;
    private final int status;

    public static final class Creator implements Parcelable.Creator<Eip7702StatusItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Eip7702StatusItem createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new Eip7702StatusItem(parcel.readLong(), parcel.readString(), parcel.readInt());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Eip7702StatusItem[] newArray(int i) {
            return new Eip7702StatusItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ Eip7702StatusItem copy$default(Eip7702StatusItem eip7702StatusItem, long j, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = eip7702StatusItem.chainIndex;
        }
        if ((i2 & 2) != 0) {
            str = eip7702StatusItem.address;
        }
        if ((i2 & 4) != 0) {
            i = eip7702StatusItem.status;
        }
        return eip7702StatusItem.copy(j, str, i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component1() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Eip7702StatusItem copy(long j, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        return new Eip7702StatusItem(j, str, i);
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
        if (!(obj instanceof Eip7702StatusItem)) {
            return false;
        }
        Eip7702StatusItem eip7702StatusItem = (Eip7702StatusItem) obj;
        return this.chainIndex == eip7702StatusItem.chainIndex && Intrinsics.EZpvd((Object) this.address, (Object) eip7702StatusItem.address) && this.status == eip7702StatusItem.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getStatus() {
        return this.status;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((Long.hashCode(this.chainIndex) * 31) + this.address.hashCode()) * 31) + Integer.hashCode(this.status);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "Eip7702StatusItem(chainIndex=" + this.chainIndex + ", address=" + this.address + ", status=" + this.status + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeLong(this.chainIndex);
        parcel.writeString(this.address);
        parcel.writeInt(this.status);
    }

    public Eip7702StatusItem(long j, @NotNull String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainIndex = j;
        this.address = str;
        this.status = i;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 long)
  (r3v0 java.lang.String)
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r5v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
 A[MD:(long, java.lang.String, int):void (m)] (LINE:68) call: com.okinc.business.defi.biz.net.bean.Eip7702StatusItem.<init>(long, java.lang.String, int):void type: THIS */
    public /* synthetic */ Eip7702StatusItem(long j, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, str, (i2 & 4) != 0 ? 0 : i);
    }
}
