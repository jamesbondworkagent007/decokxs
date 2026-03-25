package com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class EscapeSignAddressData implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<EscapeSignAddressData> CREATOR = new Creator();
    private String chainAddress;
    private final long chainIndex;
    private final String chainName;
    private final EscapeSignStatus escapeSignStatus;
    private final EscapeTransactionData escapeTransactionData;
    private final String iconUrl;

    public static final class Creator implements Parcelable.Creator<EscapeSignAddressData> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeSignAddressData createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EscapeSignAddressData(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString(), EscapeSignStatus.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : EscapeTransactionData.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EscapeSignAddressData[] newArray(int i) {
            return new EscapeSignAddressData[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EscapeSignAddressData copy$default(EscapeSignAddressData escapeSignAddressData, String str, String str2, long j, String str3, EscapeSignStatus escapeSignStatus, EscapeTransactionData escapeTransactionData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = escapeSignAddressData.iconUrl;
        }
        if ((i & 2) != 0) {
            str2 = escapeSignAddressData.chainName;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            j = escapeSignAddressData.chainIndex;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = escapeSignAddressData.chainAddress;
        }
        String str5 = str3;
        if ((i & 16) != 0) {
            escapeSignStatus = escapeSignAddressData.escapeSignStatus;
        }
        EscapeSignStatus escapeSignStatus2 = escapeSignStatus;
        if ((i & 32) != 0) {
            escapeTransactionData = escapeSignAddressData.escapeTransactionData;
        }
        return escapeSignAddressData.copy(str, str4, j2, str5, escapeSignStatus2, escapeTransactionData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component3() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.chainAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeSignStatus component5() {
        return this.escapeSignStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeTransactionData component6() {
        return this.escapeTransactionData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeSignAddressData copy(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull EscapeSignStatus escapeSignStatus, EscapeTransactionData escapeTransactionData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(escapeSignStatus, "");
        return new EscapeSignAddressData(str, str2, j, str3, escapeSignStatus, escapeTransactionData);
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
        if (!(obj instanceof EscapeSignAddressData)) {
            return false;
        }
        EscapeSignAddressData escapeSignAddressData = (EscapeSignAddressData) obj;
        return Intrinsics.EZpvd((Object) this.iconUrl, (Object) escapeSignAddressData.iconUrl) && Intrinsics.EZpvd((Object) this.chainName, (Object) escapeSignAddressData.chainName) && this.chainIndex == escapeSignAddressData.chainIndex && Intrinsics.EZpvd((Object) this.chainAddress, (Object) escapeSignAddressData.chainAddress) && this.escapeSignStatus == escapeSignAddressData.escapeSignStatus && Intrinsics.EZpvd(this.escapeTransactionData, escapeSignAddressData.escapeTransactionData);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainAddress() {
        return this.chainAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainIndex() {
        return this.chainIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getChainName() {
        return this.chainName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeSignStatus getEscapeSignStatus() {
        return this.escapeSignStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EscapeTransactionData getEscapeTransactionData() {
        return this.escapeTransactionData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.iconUrl.hashCode();
        int iHashCode2 = this.chainName.hashCode();
        int iHashCode3 = Long.hashCode(this.chainIndex);
        int iHashCode4 = this.chainAddress.hashCode();
        int iHashCode5 = this.escapeSignStatus.hashCode();
        EscapeTransactionData escapeTransactionData = this.escapeTransactionData;
        return (((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (escapeTransactionData == null ? 0 : escapeTransactionData.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setChainAddress(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.chainAddress = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EscapeSignAddressData(iconUrl=" + this.iconUrl + ", chainName=" + this.chainName + ", chainIndex=" + this.chainIndex + ", chainAddress=" + this.chainAddress + ", escapeSignStatus=" + this.escapeSignStatus + ", escapeTransactionData=" + this.escapeTransactionData + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.iconUrl);
        parcel.writeString(this.chainName);
        parcel.writeLong(this.chainIndex);
        parcel.writeString(this.chainAddress);
        parcel.writeString(this.escapeSignStatus.name());
        EscapeTransactionData escapeTransactionData = this.escapeTransactionData;
        if (escapeTransactionData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            escapeTransactionData.writeToParcel(parcel, i);
        }
    }

    public EscapeSignAddressData(@NotNull String str, @NotNull String str2, long j, @NotNull String str3, @NotNull EscapeSignStatus escapeSignStatus, EscapeTransactionData escapeTransactionData) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(escapeSignStatus, "");
        this.iconUrl = str;
        this.chainName = str2;
        this.chainIndex = j;
        this.chainAddress = str3;
        this.escapeSignStatus = escapeSignStatus;
        this.escapeTransactionData = escapeTransactionData;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0017: CONSTRUCTOR 
  (r10v0 java.lang.String)
  (r11v0 java.lang.String)
  (r12v0 long)
  (r14v0 java.lang.String)
  (wrap:com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignStatus:?: TERNARY null = ((wrap:int:0x0000: ARITH (r17v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:25) com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignStatus.ESCAPE_SIGN_STATUS_UNSTARTED com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignStatus) : (r15v0 com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignStatus))
  (wrap:com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeTransactionData:?: TERNARY null = ((wrap:int:0x0009: ARITH (r17v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeTransactionData) : (r16v0 com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeTransactionData))
 A[MD:(java.lang.String, java.lang.String, long, java.lang.String, com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignStatus, com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeTransactionData):void (m)] (LINE:20) call: com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignAddressData.<init>(java.lang.String, java.lang.String, long, java.lang.String, com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeSignStatus, com.okinc.business.defi.wallet.passkey.cedefi.escape.ui.model.EscapeTransactionData):void type: THIS */
    public /* synthetic */ EscapeSignAddressData(String str, String str2, long j, String str3, EscapeSignStatus escapeSignStatus, EscapeTransactionData escapeTransactionData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, j, str3, (i & 16) != 0 ? EscapeSignStatus.ESCAPE_SIGN_STATUS_UNSTARTED : escapeSignStatus, (i & 32) != 0 ? null : escapeTransactionData);
    }
}
