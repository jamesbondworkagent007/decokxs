package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.defi.biz.constant.WalletType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class EoaWalletInfo implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<EoaWalletInfo> CREATOR = new Creator();
    private final String eoaAddress;
    private final WalletType eoaType;
    private final boolean isBacked;
    private final String okxAccount;
    private final String walletId;

    public static final class Creator implements Parcelable.Creator<EoaWalletInfo> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EoaWalletInfo createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new EoaWalletInfo(WalletType.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EoaWalletInfo[] newArray(int i) {
            return new EoaWalletInfo[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ EoaWalletInfo copy$default(EoaWalletInfo eoaWalletInfo, WalletType walletType, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            walletType = eoaWalletInfo.eoaType;
        }
        if ((i & 2) != 0) {
            str = eoaWalletInfo.eoaAddress;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = eoaWalletInfo.walletId;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = eoaWalletInfo.okxAccount;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            z = eoaWalletInfo.isBacked;
        }
        return eoaWalletInfo.copy(walletType, str4, str5, str6, z);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletType component1() {
        return this.eoaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.eoaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.okxAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isBacked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final EoaWalletInfo copy(@NotNull WalletType walletType, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new EoaWalletInfo(walletType, str, str2, str3, z);
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
        if (!(obj instanceof EoaWalletInfo)) {
            return false;
        }
        EoaWalletInfo eoaWalletInfo = (EoaWalletInfo) obj;
        return this.eoaType == eoaWalletInfo.eoaType && Intrinsics.EZpvd((Object) this.eoaAddress, (Object) eoaWalletInfo.eoaAddress) && Intrinsics.EZpvd((Object) this.walletId, (Object) eoaWalletInfo.walletId) && Intrinsics.EZpvd((Object) this.okxAccount, (Object) eoaWalletInfo.okxAccount) && this.isBacked == eoaWalletInfo.isBacked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEoaAddress() {
        return this.eoaAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final WalletType getEoaType() {
        return this.eoaType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOkxAccount() {
        return this.okxAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletId() {
        return this.walletId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.eoaType.hashCode() * 31) + this.eoaAddress.hashCode()) * 31) + this.walletId.hashCode()) * 31) + this.okxAccount.hashCode()) * 31) + Boolean.hashCode(this.isBacked);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isBacked() {
        return this.isBacked;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "EoaWalletInfo(eoaType=" + this.eoaType + ", eoaAddress=" + this.eoaAddress + ", walletId=" + this.walletId + ", okxAccount=" + this.okxAccount + ", isBacked=" + this.isBacked + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.eoaType.name());
        parcel.writeString(this.eoaAddress);
        parcel.writeString(this.walletId);
        parcel.writeString(this.okxAccount);
        parcel.writeInt(this.isBacked ? 1 : 0);
    }

    public EoaWalletInfo(@NotNull WalletType walletType, @NotNull String str, @NotNull String str2, @NotNull String str3, boolean z) {
        Intrinsics.checkNotNullParameter(walletType, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.eoaType = walletType;
        this.eoaAddress = str;
        this.walletId = str2;
        this.okxAccount = str3;
        this.isBacked = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000b: CONSTRUCTOR 
  (r7v0 com.okinc.business.defi.biz.constant.WalletType)
  (r8v0 java.lang.String)
  (r9v0 java.lang.String)
  (r10v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? true : (r11v0 boolean))
 A[MD:(com.okinc.business.defi.biz.constant.WalletType, java.lang.String, java.lang.String, java.lang.String, boolean):void (m)] (LINE:1444) call: com.okinc.business.defi.biz.net.bean.EoaWalletInfo.<init>(com.okinc.business.defi.biz.constant.WalletType, java.lang.String, java.lang.String, java.lang.String, boolean):void type: THIS */
    public /* synthetic */ EoaWalletInfo(WalletType walletType, String str, String str2, String str3, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(walletType, str, str2, str3, (i & 16) != 0 ? true : z);
    }
}
