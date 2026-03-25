package com.okinc.business.defi.biz.drivers.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class HDWalletBackupTypeBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<HDWalletBackupTypeBean> CREATOR = new Creator();
    private ArrayList<HDWalletBackupAddressBean> addressList;
    private String encryptData;
    private String walletAccount;
    private String walletName;
    private int walletType;

    public static final class Creator implements Parcelable.Creator<HDWalletBackupTypeBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HDWalletBackupTypeBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList2.add(HDWalletBackupAddressBean.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new HDWalletBackupTypeBean(i, string, string2, string3, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HDWalletBackupTypeBean[] newArray(int i) {
            return new HDWalletBackupTypeBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HDWalletBackupTypeBean() {
        this(0, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<HDWalletBackupAddressBean> getAddressList() {
        return this.addressList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getEncryptData() {
        return this.encryptData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletAccount() {
        return this.walletAccount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getWalletName() {
        return this.walletName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getWalletType() {
        return this.walletType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setAddressList(ArrayList<HDWalletBackupAddressBean> arrayList) {
        this.addressList = arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEncryptData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.encryptData = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletAccount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletAccount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.walletName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setWalletType(int i) {
        this.walletType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.walletType);
        parcel.writeString(this.walletName);
        parcel.writeString(this.walletAccount);
        parcel.writeString(this.encryptData);
        ArrayList<HDWalletBackupAddressBean> arrayList = this.addressList;
        if (arrayList == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList.size());
        Iterator<HDWalletBackupAddressBean> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public HDWalletBackupTypeBean(int i, @NotNull String str, @NotNull String str2, @NotNull String str3, ArrayList<HDWalletBackupAddressBean> arrayList) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.walletType = i;
        this.walletName = str;
        this.walletAccount = str2;
        this.encryptData = str3;
        this.addressList = arrayList;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0027: CONSTRUCTOR 
  (wrap:int:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r4v0 int))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0005: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000e: ARITH (r9v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r9v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r7v0 java.lang.String) : (""))
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x001b: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r8v0 java.util.ArrayList))
 A[MD:(int, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList<com.okinc.business.defi.biz.drivers.bean.HDWalletBackupAddressBean>):void (m)] (LINE:41) call: com.okinc.business.defi.biz.drivers.bean.HDWalletBackupTypeBean.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.util.ArrayList):void type: THIS */
    public /* synthetic */ HDWalletBackupTypeBean(int i, String str, String str2, String str3, ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) == 0 ? str3 : "", (i2 & 16) != 0 ? null : arrayList);
    }

    public String toString() {
        return "BackupTypeBean(walletType=" + this.walletType + ", walletName='" + this.walletName + "', walletAccount='" + this.walletAccount + "', encryptData='" + this.encryptData + "', addressList=" + this.addressList + ")";
    }
}
