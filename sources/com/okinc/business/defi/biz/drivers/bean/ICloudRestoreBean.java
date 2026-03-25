package com.okinc.business.defi.biz.drivers.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ICloudRestoreBean implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<ICloudRestoreBean> CREATOR = new Creator();
    private int cloudType;
    private boolean needFinishActivity;
    private List<Integer> supportedWalletTypes;

    public static final class Creator implements Parcelable.Creator<ICloudRestoreBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ICloudRestoreBean createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList = arrayList2;
            }
            return new ICloudRestoreBean(i, arrayList, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ICloudRestoreBean[] newArray(int i) {
            return new ICloudRestoreBean[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getCloudType() {
        return this.cloudType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getNeedFinishActivity() {
        return this.needFinishActivity;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getSupportedWalletTypes() {
        return this.supportedWalletTypes;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCloudType(int i) {
        this.cloudType = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setNeedFinishActivity(boolean z) {
        this.needFinishActivity = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setSupportedWalletTypes(List<Integer> list) {
        this.supportedWalletTypes = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.cloudType);
        List<Integer> list = this.supportedWalletTypes;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeInt(it.next().intValue());
            }
        }
        parcel.writeInt(this.needFinishActivity ? 1 : 0);
    }

    public ICloudRestoreBean(int i, List<Integer> list, boolean z) {
        this.cloudType = i;
        this.supportedWalletTypes = list;
        this.needFinishActivity = z;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 int)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r2v0 java.util.List))
  (r3v0 boolean)
 A[MD:(int, java.util.List<java.lang.Integer>, boolean):void (m)] (LINE:23) call: com.okinc.business.defi.biz.drivers.bean.ICloudRestoreBean.<init>(int, java.util.List, boolean):void type: THIS */
    public /* synthetic */ ICloudRestoreBean(int i, List list, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : list, z);
    }
}
