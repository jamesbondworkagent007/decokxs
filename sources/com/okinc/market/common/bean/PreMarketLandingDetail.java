package com.okinc.market.common.bean;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class PreMarketLandingDetail implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<PreMarketLandingDetail> CREATOR = new Creator();
    private final ArrayList<PreMarketLandingBean> data;
    private final String pageNum;
    private final String pageSize;
    private final String total;

    /* JADX INFO: loaded from: classes19.dex */
    public static final class Creator implements Parcelable.Creator<PreMarketLandingDetail> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PreMarketLandingDetail createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(PreMarketLandingBean.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new PreMarketLandingDetail(arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PreMarketLandingDetail[] newArray(int i) {
            return new PreMarketLandingDetail[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public PreMarketLandingDetail() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.okinc.market.common.bean.PreMarketLandingDetail */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PreMarketLandingDetail copy$default(PreMarketLandingDetail preMarketLandingDetail, ArrayList arrayList, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = preMarketLandingDetail.data;
        }
        if ((i & 2) != 0) {
            str = preMarketLandingDetail.pageNum;
        }
        if ((i & 4) != 0) {
            str2 = preMarketLandingDetail.pageSize;
        }
        if ((i & 8) != 0) {
            str3 = preMarketLandingDetail.total;
        }
        return preMarketLandingDetail.copy(arrayList, str, str2, str3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<PreMarketLandingBean> component1() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final PreMarketLandingDetail copy(ArrayList<PreMarketLandingBean> arrayList, String str, String str2, String str3) {
        return new PreMarketLandingDetail(arrayList, str, str2, str3);
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
        if (!(obj instanceof PreMarketLandingDetail)) {
            return false;
        }
        PreMarketLandingDetail preMarketLandingDetail = (PreMarketLandingDetail) obj;
        return Intrinsics.EZpvd(this.data, preMarketLandingDetail.data) && Intrinsics.EZpvd((Object) this.pageNum, (Object) preMarketLandingDetail.pageNum) && Intrinsics.EZpvd((Object) this.pageSize, (Object) preMarketLandingDetail.pageSize) && Intrinsics.EZpvd((Object) this.total, (Object) preMarketLandingDetail.total);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ArrayList<PreMarketLandingBean> getData() {
        return this.data;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageNum() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTotal() {
        return this.total;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        ArrayList<PreMarketLandingBean> arrayList = this.data;
        int iHashCode = arrayList == null ? 0 : arrayList.hashCode();
        String str = this.pageNum;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.pageSize;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.total;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "PreMarketLandingDetail(data=" + this.data + ", pageNum=" + this.pageNum + ", pageSize=" + this.pageSize + ", total=" + this.total + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        ArrayList<PreMarketLandingBean> arrayList = this.data;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator<PreMarketLandingBean> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.pageNum);
        parcel.writeString(this.pageSize);
        parcel.writeString(this.total);
    }

    public PreMarketLandingDetail(ArrayList<PreMarketLandingBean> arrayList, String str, String str2, String str3) {
        this.data = arrayList;
        this.pageNum = str;
        this.pageSize = str2;
        this.total = str3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0015: CONSTRUCTOR 
  (wrap:java.util.ArrayList:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.ArrayList) : (r2v0 java.util.ArrayList))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0006: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r5v0 java.lang.String))
 A[MD:(java.util.ArrayList<com.okinc.market.common.bean.PreMarketLandingBean>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:31) call: com.okinc.market.common.bean.PreMarketLandingDetail.<init>(java.util.ArrayList, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ PreMarketLandingDetail(ArrayList arrayList, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : arrayList, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }
}
