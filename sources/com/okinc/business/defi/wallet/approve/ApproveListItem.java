package com.okinc.business.defi.wallet.approve;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class ApproveListItem implements Parcelable {
    public static final Parcelable.Creator<ApproveListItem> CREATOR = new Creator();
    public final Long AEQbTJ;
    public List<Long> AYXKKw;
    public String AhwBna;
    public final String AkhnZx;
    public boolean DbNXlk;
    public final Long EZpvd;
    public Integer KWHzl;
    public final String OLrzqt;
    public final int copydefault;
    public final Integer djBIcL;
    public final String ejfBZ;
    public String fARcdN;
    public String fIwbmz;
    public String fJNWhG;
    public String fetchVPNInfo;
    public String gEmmrt;
    public boolean isConnected;
    public final Integer valueOf;
    public final boolean values;

    public static final class Creator implements Parcelable.Creator<ApproveListItem> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApproveListItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            int i = parcel.readInt();
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string9 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList2.add(Long.valueOf(parcel.readLong()));
                }
                arrayList = arrayList2;
            }
            return new ApproveListItem(string, string2, string3, string4, string5, string6, string7, string8, z, numValueOf, lValueOf, i, numValueOf2, string9, z2, lValueOf2, z3, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApproveListItem[] newArray(int i) {
            return new ApproveListItem[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AEQbTJ() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AYXKKw() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> AhwBna() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AkhnZx() {
        return this.fIwbmz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String DbNXlk() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer EZpvd() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ApproveListItem KWHzl(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, String str7, String str8, boolean z, Integer num, Long l, int i, Integer num2, String str9, boolean z2, Long l2, boolean z3, List<Long> list, Integer num3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new ApproveListItem(str, str2, str3, str4, str5, str6, str7, str8, z, num, l, i, num2, str9, z2, l2, z3, list, num3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer KWHzl() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer OLrzqt() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void OLrzqt(boolean z) {
        this.DbNXlk = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int copydefault() {
        return this.copydefault;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String djBIcL() {
        return this.gEmmrt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean ejfBZ() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApproveListItem)) {
            return false;
        }
        ApproveListItem approveListItem = (ApproveListItem) obj;
        return Intrinsics.EZpvd((Object) this.gEmmrt, (Object) approveListItem.gEmmrt) && Intrinsics.EZpvd((Object) this.fetchVPNInfo, (Object) approveListItem.fetchVPNInfo) && Intrinsics.EZpvd((Object) this.fJNWhG, (Object) approveListItem.fJNWhG) && Intrinsics.EZpvd((Object) this.AhwBna, (Object) approveListItem.AhwBna) && Intrinsics.EZpvd((Object) this.fARcdN, (Object) approveListItem.fARcdN) && Intrinsics.EZpvd((Object) this.fIwbmz, (Object) approveListItem.fIwbmz) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) approveListItem.OLrzqt) && Intrinsics.EZpvd((Object) this.AkhnZx, (Object) approveListItem.AkhnZx) && this.values == approveListItem.values && Intrinsics.EZpvd(this.djBIcL, approveListItem.djBIcL) && Intrinsics.EZpvd(this.AEQbTJ, approveListItem.AEQbTJ) && this.copydefault == approveListItem.copydefault && Intrinsics.EZpvd(this.valueOf, approveListItem.valueOf) && Intrinsics.EZpvd((Object) this.ejfBZ, (Object) approveListItem.ejfBZ) && this.DbNXlk == approveListItem.DbNXlk && Intrinsics.EZpvd(this.EZpvd, approveListItem.EZpvd) && this.isConnected == approveListItem.isConnected && Intrinsics.EZpvd(this.AYXKKw, approveListItem.AYXKKw) && Intrinsics.EZpvd(this.KWHzl, approveListItem.KWHzl);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fARcdN() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fetchVPNInfo() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String gEmmrt() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.gEmmrt.hashCode();
        String str = this.fetchVPNInfo;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = this.fJNWhG.hashCode();
        int iHashCode4 = this.AhwBna.hashCode();
        String str2 = this.fARcdN;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.fIwbmz;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.OLrzqt;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.AkhnZx;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        int iHashCode9 = Boolean.hashCode(this.values);
        Integer num = this.djBIcL;
        int iHashCode10 = num == null ? 0 : num.hashCode();
        Long l = this.AEQbTJ;
        int iHashCode11 = l == null ? 0 : l.hashCode();
        int iHashCode12 = Integer.hashCode(this.copydefault);
        Integer num2 = this.valueOf;
        int iHashCode13 = num2 == null ? 0 : num2.hashCode();
        String str6 = this.ejfBZ;
        int iHashCode14 = str6 == null ? 0 : str6.hashCode();
        int iHashCode15 = Boolean.hashCode(this.DbNXlk);
        Long l2 = this.EZpvd;
        int iHashCode16 = l2 == null ? 0 : l2.hashCode();
        int iHashCode17 = Boolean.hashCode(this.isConnected);
        List<Long> list = this.AYXKKw;
        int iHashCode18 = list == null ? 0 : list.hashCode();
        Integer num3 = this.KWHzl;
        return (((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + (num3 == null ? 0 : num3.hashCode());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String isConnected() {
        return this.fARcdN;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "ApproveListItem(coinId=" + this.gEmmrt + ", icon=" + this.fetchVPNInfo + ", title=" + this.fJNWhG + ", coinName=" + this.AhwBna + ", projectName=" + this.fARcdN + ", network=" + this.fIwbmz + ", approvalAddress=" + this.OLrzqt + ", linkApprovalAddress=" + this.AkhnZx + ", isRiskyProject=" + this.values + ", blackTagType=" + this.djBIcL + ", blackTagAlarmTime=" + this.AEQbTJ + ", approvalTokenCount=" + this.copydefault + ", blackTagLongTimeDayLimit=" + this.valueOf + ", status=" + this.ejfBZ + ", isSelected=" + this.DbNXlk + ", blackTagAlarmGapTime=" + this.EZpvd + ", isEIP7702Upgrade=" + this.isConnected + ", eip7702ChainList=" + this.AYXKKw + ", approvedTokenCount=" + this.KWHzl + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String valueOf() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.gEmmrt);
        parcel.writeString(this.fetchVPNInfo);
        parcel.writeString(this.fJNWhG);
        parcel.writeString(this.AhwBna);
        parcel.writeString(this.fARcdN);
        parcel.writeString(this.fIwbmz);
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.AkhnZx);
        parcel.writeInt(this.values ? 1 : 0);
        Integer num = this.djBIcL;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Long l = this.AEQbTJ;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.copydefault);
        Integer num2 = this.valueOf;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.ejfBZ);
        parcel.writeInt(this.DbNXlk ? 1 : 0);
        Long l2 = this.EZpvd;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        parcel.writeInt(this.isConnected ? 1 : 0);
        List<Long> list = this.AYXKKw;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<Long> it = list.iterator();
            while (it.hasNext()) {
                parcel.writeLong(it.next().longValue());
            }
        }
        Integer num3 = this.KWHzl;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
    }

    public ApproveListItem(@NotNull String str, String str2, @NotNull String str3, @NotNull String str4, String str5, String str6, String str7, String str8, boolean z, Integer num, Long l, int i, Integer num2, String str9, boolean z2, Long l2, boolean z3, List<Long> list, Integer num3) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.gEmmrt = str;
        this.fetchVPNInfo = str2;
        this.fJNWhG = str3;
        this.AhwBna = str4;
        this.fARcdN = str5;
        this.fIwbmz = str6;
        this.OLrzqt = str7;
        this.AkhnZx = str8;
        this.values = z;
        this.djBIcL = num;
        this.AEQbTJ = l;
        this.copydefault = i;
        this.valueOf = num2;
        this.ejfBZ = str9;
        this.DbNXlk = z2;
        this.EZpvd = l2;
        this.isConnected = z3;
        this.AYXKKw = list;
        this.KWHzl = num3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0055: CONSTRUCTOR 
  (r23v0 java.lang.String)
  (r24v0 java.lang.String)
  (r25v0 java.lang.String)
  (r26v0 java.lang.String)
  (r27v0 java.lang.String)
  (r28v0 java.lang.String)
  (r29v0 java.lang.String)
  (r30v0 java.lang.String)
  (r31v0 boolean)
  (r32v0 java.lang.Integer)
  (r33v0 java.lang.Long)
  (r34v0 int)
  (r35v0 java.lang.Integer)
  (r36v0 java.lang.String)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0002: ARITH (r42v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? true : (r37v0 boolean))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000f: ARITH (32768 int) & (r42v0 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r38v0 java.lang.Long))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001a: ARITH (65536 int) & (r42v0 int) A[WRAPPED]) != (0 int)) ? false : (r39v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0025: ARITH (131072 int) & (r42v0 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r40v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x002f: ARITH (r42v0 int) & (262144 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r41v0 java.lang.Integer))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, int, java.lang.Integer, java.lang.String, boolean, java.lang.Long, boolean, java.util.List<java.lang.Long>, java.lang.Integer):void (m)] (LINE:7) call: com.okinc.business.defi.wallet.approve.ApproveListItem.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.Integer, java.lang.Long, int, java.lang.Integer, java.lang.String, boolean, java.lang.Long, boolean, java.util.List, java.lang.Integer):void type: THIS */
    public /* synthetic */ ApproveListItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, Integer num, Long l, int i, Integer num2, String str9, boolean z2, Long l2, boolean z3, List list, Integer num3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, z, num, l, i, num2, str9, (i2 & 16384) != 0 ? true : z2, (32768 & i2) != 0 ? null : l2, (65536 & i2) != 0 ? false : z3, (131072 & i2) != 0 ? null : list, (i2 & 262144) != 0 ? null : num3);
    }
}
