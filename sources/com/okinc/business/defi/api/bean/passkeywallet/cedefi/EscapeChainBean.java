package com.okinc.business.defi.api.bean.passkeywallet.cedefi;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class EscapeChainBean implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<EscapeChainBean> CREATOR = new Creator();
    private final String address;
    private final String chainIndex;
    private final String chainName;
    private final int chainType;
    private final String escapeAddress;
    private final int escapeStatus;
    private final long orderId;
    private final String saAddress;

    public static final class Creator implements Parcelable.Creator<EscapeChainBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeChainBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EscapeChainBean(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeChainBean[] newArray(int i) {
            return new EscapeChainBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.chainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component3() {
        return this.escapeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.escapeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component7() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.saAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeChainBean copy(int i, @NotNull String str, int i2, @NotNull String str2, @NotNull String str3, String str4, long j, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new EscapeChainBean(i, str, i2, str2, str3, str4, j, str5);
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
        if (!(obj instanceof EscapeChainBean)) {
            return false;
        }
        EscapeChainBean escapeChainBean = (EscapeChainBean) obj;
        return this.chainType == escapeChainBean.chainType && Intrinsics.EZpvd((Object) this.chainIndex, (Object) escapeChainBean.chainIndex) && this.escapeStatus == escapeChainBean.escapeStatus && Intrinsics.EZpvd((Object) this.escapeAddress, (Object) escapeChainBean.escapeAddress) && Intrinsics.EZpvd((Object) this.address, (Object) escapeChainBean.address) && Intrinsics.EZpvd((Object) this.chainName, (Object) escapeChainBean.chainName) && this.orderId == escapeChainBean.orderId && Intrinsics.EZpvd((Object) this.saAddress, (Object) escapeChainBean.saAddress);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getAddress() {
        return this.address;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getChainType() {
        return this.chainType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEscapeAddress() {
        return this.escapeAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getEscapeStatus() {
        return this.escapeStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getOrderId() {
        return this.orderId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSaAddress() {
        return this.saAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.chainType);
        int iHashCode2 = this.chainIndex.hashCode();
        int iHashCode3 = Integer.hashCode(this.escapeStatus);
        int iHashCode4 = this.escapeAddress.hashCode();
        int iHashCode5 = this.address.hashCode();
        String str = this.chainName;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        int iHashCode7 = Long.hashCode(this.orderId);
        String str2 = this.saAddress;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeChainBean(chainType=" + this.chainType + ", chainIndex=" + this.chainIndex + ", escapeStatus=" + this.escapeStatus + ", escapeAddress=" + this.escapeAddress + ", address=" + this.address + ", chainName=" + this.chainName + ", orderId=" + this.orderId + ", saAddress=" + this.saAddress + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.chainType);
        parcel.writeString(this.chainIndex);
        parcel.writeInt(this.escapeStatus);
        parcel.writeString(this.escapeAddress);
        parcel.writeString(this.address);
        parcel.writeString(this.chainName);
        parcel.writeLong(this.orderId);
        parcel.writeString(this.saAddress);
    }

    public EscapeChainBean(int i, @NotNull String str, int i2, @NotNull String str2, @NotNull String str3, String str4, long j, String str5) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.chainType = i;
        this.chainIndex = str;
        this.escapeStatus = i2;
        this.escapeAddress = str2;
        this.address = str3;
        this.chainName = str4;
        this.orderId = j;
        this.saAddress = str5;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x001f: CONSTRUCTOR 
  (r14v0 int)
  (r15v0 java.lang.String)
  (r16v0 int)
  (r17v0 java.lang.String)
  (r18v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r23v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (r20v0 long)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r23v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
 A[MD:(int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String):void (m)] (LINE:210) call: com.okinc.business.defi.api.bean.passkeywallet.cedefi.EscapeChainBean.<init>(int, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, long, java.lang.String):void type: THIS */
    public /* synthetic */ EscapeChainBean(int i, String str, int i2, String str2, String str3, String str4, long j, String str5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, str2, str3, (i3 & 32) != 0 ? "" : str4, j, (i3 & 128) != 0 ? "" : str5);
    }
}
