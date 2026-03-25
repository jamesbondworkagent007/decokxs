package com.okinc.business.defi.biz.drivers.bean;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class HDWalletCloudBackupBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<HDWalletCloudBackupBean> CREATOR = new Creator();
    private HDWalletBackupTypeBean backupTypeBean;
    private String createTime;
    private String modifyTime;
    private String passwordHash;

    public static final class Creator implements Parcelable.Creator<HDWalletCloudBackupBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HDWalletCloudBackupBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new HDWalletCloudBackupBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : HDWalletBackupTypeBean.CREATOR.createFromParcel(parcel));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final HDWalletCloudBackupBean[] newArray(int i) {
            return new HDWalletCloudBackupBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public HDWalletCloudBackupBean() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final HDWalletBackupTypeBean getBackupTypeBean() {
        return this.backupTypeBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCreateTime() {
        return this.createTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getModifyTime() {
        return this.modifyTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPasswordHash() {
        return this.passwordHash;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBackupTypeBean(HDWalletBackupTypeBean hDWalletBackupTypeBean) {
        this.backupTypeBean = hDWalletBackupTypeBean;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCreateTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.createTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setModifyTime(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.modifyTime = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPasswordHash(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.passwordHash = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.createTime);
        parcel.writeString(this.modifyTime);
        parcel.writeString(this.passwordHash);
        HDWalletBackupTypeBean hDWalletBackupTypeBean = this.backupTypeBean;
        if (hDWalletBackupTypeBean == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            hDWalletBackupTypeBean.writeToParcel(parcel, i);
        }
    }

    public HDWalletCloudBackupBean(@NotNull String str, @NotNull String str2, @NotNull String str3, HDWalletBackupTypeBean hDWalletBackupTypeBean) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.createTime = str;
        this.modifyTime = str2;
        this.passwordHash = str3;
        this.backupTypeBean = hDWalletBackupTypeBean;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:com.okinc.business.defi.biz.drivers.bean.HDWalletBackupTypeBean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.business.defi.biz.drivers.bean.HDWalletBackupTypeBean) : (r5v0 com.okinc.business.defi.biz.drivers.bean.HDWalletBackupTypeBean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.drivers.bean.HDWalletBackupTypeBean):void (m)] (LINE:9) call: com.okinc.business.defi.biz.drivers.bean.HDWalletCloudBackupBean.<init>(java.lang.String, java.lang.String, java.lang.String, com.okinc.business.defi.biz.drivers.bean.HDWalletBackupTypeBean):void type: THIS */
    public /* synthetic */ HDWalletCloudBackupBean(String str, String str2, String str3, HDWalletBackupTypeBean hDWalletBackupTypeBean, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : hDWalletBackupTypeBean);
    }

    public String toString() {
        return "CloudBackupBean(createTime='" + this.createTime + "', modifyTime='" + this.modifyTime + "', passwordHash='" + this.passwordHash + "', backupTypeBean=" + this.backupTypeBean + ")";
    }
}
