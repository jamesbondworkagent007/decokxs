package com.okinc.business.defi.biz.net.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class TeeMetadata implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TeeMetadata> CREATOR = new Creator();
    private final Map<String, String> chainNameMapping;
    private final Boolean defaultAutoRenew;
    private final int defaultExpirePeriodDay;
    private final Integer entranceCloseFlag;
    private final List<Integer> expirePeriodDayList;
    private final boolean isTeeServiceMaintenance;
    private final List<EventItem> maintenanceEventList;
    private final List<Long> supportChainIndexList;
    private final long upgradeAssetThreshold;

    public static final class Creator implements Parcelable.Creator<TeeMetadata> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeMetadata createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(Long.valueOf(parcel.readLong()));
            }
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            for (int i4 = 0; i4 != i3; i4++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            for (int i6 = 0; i6 != i5; i6++) {
                arrayList3.add(Integer.valueOf(parcel.readInt()));
            }
            long j = parcel.readLong();
            int i7 = parcel.readInt();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i8 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList4.add(EventItem.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList4;
            }
            return new TeeMetadata(arrayList2, linkedHashMap, arrayList3, j, i7, boolValueOf, z, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TeeMetadata[] newArray(int i) {
            return new TeeMetadata[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> component1() {
        return this.supportChainIndexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> component2() {
        return this.chainNameMapping;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component3() {
        return this.expirePeriodDayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component4() {
        return this.upgradeAssetThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component5() {
        return this.defaultExpirePeriodDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component6() {
        return this.defaultAutoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component7() {
        return this.isTeeServiceMaintenance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EventItem> component8() {
        return this.maintenanceEventList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component9() {
        return this.entranceCloseFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TeeMetadata copy(@NotNull List<Long> list, @NotNull Map<String, String> map, @NotNull List<Integer> list2, long j, int i, Boolean bool, boolean z, List<EventItem> list3, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new TeeMetadata(list, map, list2, j, i, bool, z, list3, num);
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
        if (!(obj instanceof TeeMetadata)) {
            return false;
        }
        TeeMetadata teeMetadata = (TeeMetadata) obj;
        return Intrinsics.EZpvd(this.supportChainIndexList, teeMetadata.supportChainIndexList) && Intrinsics.EZpvd(this.chainNameMapping, teeMetadata.chainNameMapping) && Intrinsics.EZpvd(this.expirePeriodDayList, teeMetadata.expirePeriodDayList) && this.upgradeAssetThreshold == teeMetadata.upgradeAssetThreshold && this.defaultExpirePeriodDay == teeMetadata.defaultExpirePeriodDay && Intrinsics.EZpvd(this.defaultAutoRenew, teeMetadata.defaultAutoRenew) && this.isTeeServiceMaintenance == teeMetadata.isTeeServiceMaintenance && Intrinsics.EZpvd(this.maintenanceEventList, teeMetadata.maintenanceEventList) && Intrinsics.EZpvd(this.entranceCloseFlag, teeMetadata.entranceCloseFlag);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Map<String, String> getChainNameMapping() {
        return this.chainNameMapping;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getDefaultAutoRenew() {
        return this.defaultAutoRenew;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getDefaultExpirePeriodDay() {
        return this.defaultExpirePeriodDay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEntranceCloseFlag() {
        return this.entranceCloseFlag;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getExpirePeriodDayList() {
        return this.expirePeriodDayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<EventItem> getMaintenanceEventList() {
        return this.maintenanceEventList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Long> getSupportChainIndexList() {
        return this.supportChainIndexList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getUpgradeAssetThreshold() {
        return this.upgradeAssetThreshold;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.supportChainIndexList.hashCode();
        int iHashCode2 = this.chainNameMapping.hashCode();
        int iHashCode3 = this.expirePeriodDayList.hashCode();
        int iHashCode4 = Long.hashCode(this.upgradeAssetThreshold);
        int iHashCode5 = Integer.hashCode(this.defaultExpirePeriodDay);
        Boolean bool = this.defaultAutoRenew;
        int iHashCode6 = bool == null ? 0 : bool.hashCode();
        int iHashCode7 = Boolean.hashCode(this.isTeeServiceMaintenance);
        List<EventItem> list = this.maintenanceEventList;
        int iHashCode8 = list == null ? 0 : list.hashCode();
        Integer num = this.entranceCloseFlag;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (num != null ? num.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isTeeServiceMaintenance() {
        return this.isTeeServiceMaintenance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TeeMetadata(supportChainIndexList=" + this.supportChainIndexList + ", chainNameMapping=" + this.chainNameMapping + ", expirePeriodDayList=" + this.expirePeriodDayList + ", upgradeAssetThreshold=" + this.upgradeAssetThreshold + ", defaultExpirePeriodDay=" + this.defaultExpirePeriodDay + ", defaultAutoRenew=" + this.defaultAutoRenew + ", isTeeServiceMaintenance=" + this.isTeeServiceMaintenance + ", maintenanceEventList=" + this.maintenanceEventList + ", entranceCloseFlag=" + this.entranceCloseFlag + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<Long> list = this.supportChainIndexList;
        parcel.writeInt(list.size());
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeLong(it.next().longValue());
        }
        Map<String, String> map = this.chainNameMapping;
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
        List<Integer> list2 = this.expirePeriodDayList;
        parcel.writeInt(list2.size());
        Iterator<Integer> it2 = list2.iterator();
        while (it2.hasNext()) {
            parcel.writeInt(it2.next().intValue());
        }
        parcel.writeLong(this.upgradeAssetThreshold);
        parcel.writeInt(this.defaultExpirePeriodDay);
        Boolean bool = this.defaultAutoRenew;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeInt(this.isTeeServiceMaintenance ? 1 : 0);
        List<EventItem> list3 = this.maintenanceEventList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<EventItem> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(parcel, i);
            }
        }
        Integer num = this.entranceCloseFlag;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
    }

    public TeeMetadata(@NotNull List<Long> list, @NotNull Map<String, String> map, @NotNull List<Integer> list2, long j, int i, Boolean bool, boolean z, List<EventItem> list3, Integer num) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.supportChainIndexList = list;
        this.chainNameMapping = map;
        this.expirePeriodDayList = list2;
        this.upgradeAssetThreshold = j;
        this.defaultExpirePeriodDay = i;
        this.defaultAutoRenew = bool;
        this.isTeeServiceMaintenance = z;
        this.maintenanceEventList = list3;
        this.entranceCloseFlag = num;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x007c: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r24v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x001a: INVOKE (wrap:java.lang.Long[]:0x0012: FILLED_NEW_ARRAY (1 long), (501 long) A[WRAPPED] (LINE:12) elemType: java.lang.Long) STATIC call: o.yDY.gEmmrt(java.lang.Object[]):java.util.List A[MD:<T>:(T[]):java.util.List<T> VARARG (m), VARARG_CALL, WRAPPED] (LINE:12)) : (r14v0 java.util.List))
  (r15v0 java.util.Map)
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001d: ARITH (r24v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003a: INVOKE 
  (wrap:java.lang.Integer[]:0x0032: FILLED_NEW_ARRAY (7 int), (15 int), (30 int) A[WRAPPED] (LINE:14) elemType: java.lang.Integer)
 STATIC call: o.yDY.gEmmrt(java.lang.Object[]):java.util.List A[MD:<T>:(T[]):java.util.List<T> VARARG (m), VARARG_CALL, WRAPPED] (LINE:14)) : (r16v0 java.util.List))
  (wrap:long:?: TERNARY null = ((wrap:int:0x003e: ARITH (r24v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0042: SGET  A[WRAPPED] androidx.work.WorkRequest.MIN_BACKOFF_MILLIS long) : (r17v0 long))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0047: ARITH (r24v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (15 int) : (r19v0 int))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004f: ARITH (r24v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0055: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0059: ARITH (r24v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? false : (r21v0 boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0062: ARITH (r24v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x006a: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r22v0 java.util.List))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x006e: ARITH (r24v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (0 int) : (r23v0 java.lang.Integer))
 A[MD:(java.util.List<java.lang.Long>, java.util.Map<java.lang.String, java.lang.String>, java.util.List<java.lang.Integer>, long, int, java.lang.Boolean, boolean, java.util.List<com.okinc.business.defi.biz.net.bean.EventItem>, java.lang.Integer):void (m)] (LINE:11) call: com.okinc.business.defi.biz.net.bean.TeeMetadata.<init>(java.util.List, java.util.Map, java.util.List, long, int, java.lang.Boolean, boolean, java.util.List, java.lang.Integer):void type: THIS */
    public /* synthetic */ TeeMetadata(List list, Map map, List list2, long j, int i, Boolean bool, boolean z, List list3, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? yDY.gEmmrt(1L, 501L) : list, map, (i2 & 4) != 0 ? yDY.gEmmrt(7, 15, 30) : list2, (i2 & 8) != 0 ? WorkRequest.MIN_BACKOFF_MILLIS : j, (i2 & 16) != 0 ? 15 : i, (i2 & 32) != 0 ? Boolean.FALSE : bool, (i2 & 64) != 0 ? false : z, (i2 & 128) != 0 ? yDY.AhwBna() : list3, (i2 & 256) != 0 ? 0 : num);
    }
}
