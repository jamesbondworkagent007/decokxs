package com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TransactionHistoryRequest implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<TransactionHistoryRequest> CREATOR = new Creator();
    private Long beginTime;
    private List<Integer> currencyIdList;
    private Long endTime;
    private Integer eventStatus;
    private List<Integer> eventStatusList;
    private Long eventTime;
    private Integer excludeEarnPay;
    private List<Integer> filterBizTypeList;
    private Long id;
    private Boolean p2pCountDown;
    private Integer pageIndex;
    private Integer pageSize;
    private String valuationUnit;

    public static final class Creator implements Parcelable.Creator<TransactionHistoryRequest> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionHistoryRequest createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Intrinsics.checkNotNullParameter(parcel, "");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList4.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList = arrayList4;
            }
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList5.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList2 = arrayList5;
            }
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList6.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList3 = arrayList6;
            }
            return new TransactionHistoryRequest(arrayList, lValueOf, lValueOf2, arrayList2, lValueOf3, lValueOf4, numValueOf, numValueOf2, arrayList3, parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TransactionHistoryRequest[] newArray(int i) {
            return new TransactionHistoryRequest[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TransactionHistoryRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component1() {
        return this.currencyIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component10() {
        return this.p2pCountDown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component11() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component12() {
        return this.pageIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component13() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component2() {
        return this.beginTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component3() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component4() {
        return this.filterBizTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component5() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long component6() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component7() {
        return this.excludeEarnPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component8() {
        return this.eventStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> component9() {
        return this.eventStatusList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TransactionHistoryRequest copy(List<Integer> list, Long l, Long l2, List<Integer> list2, Long l3, Long l4, Integer num, Integer num2, List<Integer> list3, Boolean bool, Integer num3, Integer num4, String str) {
        return new TransactionHistoryRequest(list, l, l2, list2, l3, l4, num, num2, list3, bool, num3, num4, str);
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
        if (!(obj instanceof TransactionHistoryRequest)) {
            return false;
        }
        TransactionHistoryRequest transactionHistoryRequest = (TransactionHistoryRequest) obj;
        return Intrinsics.EZpvd(this.currencyIdList, transactionHistoryRequest.currencyIdList) && Intrinsics.EZpvd(this.beginTime, transactionHistoryRequest.beginTime) && Intrinsics.EZpvd(this.endTime, transactionHistoryRequest.endTime) && Intrinsics.EZpvd(this.filterBizTypeList, transactionHistoryRequest.filterBizTypeList) && Intrinsics.EZpvd(this.id, transactionHistoryRequest.id) && Intrinsics.EZpvd(this.eventTime, transactionHistoryRequest.eventTime) && Intrinsics.EZpvd(this.excludeEarnPay, transactionHistoryRequest.excludeEarnPay) && Intrinsics.EZpvd(this.eventStatus, transactionHistoryRequest.eventStatus) && Intrinsics.EZpvd(this.eventStatusList, transactionHistoryRequest.eventStatusList) && Intrinsics.EZpvd(this.p2pCountDown, transactionHistoryRequest.p2pCountDown) && Intrinsics.EZpvd(this.pageSize, transactionHistoryRequest.pageSize) && Intrinsics.EZpvd(this.pageIndex, transactionHistoryRequest.pageIndex) && Intrinsics.EZpvd((Object) this.valuationUnit, (Object) transactionHistoryRequest.valuationUnit);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getBeginTime() {
        return this.beginTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getCurrencyIdList() {
        return this.currencyIdList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getEndTime() {
        return this.endTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getEventStatus() {
        return this.eventStatus;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getEventStatusList() {
        return this.eventStatusList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getEventTime() {
        return this.eventTime;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getExcludeEarnPay() {
        return this.excludeEarnPay;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<Integer> getFilterBizTypeList() {
        return this.filterBizTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Long getId() {
        return this.id;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getP2pCountDown() {
        return this.p2pCountDown;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPageIndex() {
        return this.pageIndex;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPageSize() {
        return this.pageSize;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getValuationUnit() {
        return this.valuationUnit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        List<Integer> list = this.currencyIdList;
        int iHashCode = list == null ? 0 : list.hashCode();
        Long l = this.beginTime;
        int iHashCode2 = l == null ? 0 : l.hashCode();
        Long l2 = this.endTime;
        int iHashCode3 = l2 == null ? 0 : l2.hashCode();
        List<Integer> list2 = this.filterBizTypeList;
        int iHashCode4 = list2 == null ? 0 : list2.hashCode();
        Long l3 = this.id;
        int iHashCode5 = l3 == null ? 0 : l3.hashCode();
        Long l4 = this.eventTime;
        int iHashCode6 = l4 == null ? 0 : l4.hashCode();
        Integer num = this.excludeEarnPay;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        Integer num2 = this.eventStatus;
        int iHashCode8 = num2 == null ? 0 : num2.hashCode();
        List<Integer> list3 = this.eventStatusList;
        int iHashCode9 = list3 == null ? 0 : list3.hashCode();
        Boolean bool = this.p2pCountDown;
        int iHashCode10 = bool == null ? 0 : bool.hashCode();
        Integer num3 = this.pageSize;
        int iHashCode11 = num3 == null ? 0 : num3.hashCode();
        Integer num4 = this.pageIndex;
        int iHashCode12 = num4 == null ? 0 : num4.hashCode();
        String str = this.valuationUnit;
        return (((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (str != null ? str.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setBeginTime(Long l) {
        this.beginTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCurrencyIdList(List<Integer> list) {
        this.currencyIdList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEndTime(Long l) {
        this.endTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventStatus(Integer num) {
        this.eventStatus = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventStatusList(List<Integer> list) {
        this.eventStatusList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setEventTime(Long l) {
        this.eventTime = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setExcludeEarnPay(Integer num) {
        this.excludeEarnPay = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setFilterBizTypeList(List<Integer> list) {
        this.filterBizTypeList = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setId(Long l) {
        this.id = l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setP2pCountDown(Boolean bool) {
        this.p2pCountDown = bool;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPageIndex(Integer num) {
        this.pageIndex = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setPageSize(Integer num) {
        this.pageSize = num;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setValuationUnit(String str) {
        this.valuationUnit = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TransactionHistoryRequest(currencyIdList=" + this.currencyIdList + ", beginTime=" + this.beginTime + ", endTime=" + this.endTime + ", filterBizTypeList=" + this.filterBizTypeList + ", id=" + this.id + ", eventTime=" + this.eventTime + ", excludeEarnPay=" + this.excludeEarnPay + ", eventStatus=" + this.eventStatus + ", eventStatusList=" + this.eventStatusList + ", p2pCountDown=" + this.p2pCountDown + ", pageSize=" + this.pageSize + ", pageIndex=" + this.pageIndex + ", valuationUnit=" + this.valuationUnit + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        List<Integer> list = this.currencyIdList;
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
        Long l = this.beginTime;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        Long l2 = this.endTime;
        if (l2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l2.longValue());
        }
        List<Integer> list2 = this.filterBizTypeList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            Iterator<Integer> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcel.writeInt(it2.next().intValue());
            }
        }
        Long l3 = this.id;
        if (l3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l3.longValue());
        }
        Long l4 = this.eventTime;
        if (l4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l4.longValue());
        }
        Integer num = this.excludeEarnPay;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.eventStatus;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        List<Integer> list3 = this.eventStatusList;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list3.size());
            Iterator<Integer> it3 = list3.iterator();
            while (it3.hasNext()) {
                parcel.writeInt(it3.next().intValue());
            }
        }
        Boolean bool = this.p2pCountDown;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num3 = this.pageSize;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Integer num4 = this.pageIndex;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num4.intValue());
        }
        parcel.writeString(this.valuationUnit);
    }

    public TransactionHistoryRequest(List<Integer> list, Long l, Long l2, List<Integer> list2, Long l3, Long l4, Integer num, Integer num2, List<Integer> list3, Boolean bool, Integer num3, Integer num4, String str) {
        this.currencyIdList = list;
        this.beginTime = l;
        this.endTime = l2;
        this.filterBizTypeList = list2;
        this.id = l3;
        this.eventTime = l4;
        this.excludeEarnPay = num;
        this.eventStatus = num2;
        this.eventStatusList = list3;
        this.p2pCountDown = bool;
        this.pageSize = num3;
        this.pageIndex = num4;
        this.valuationUnit = str;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0084: CONSTRUCTOR 
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0002: ARITH (r28v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r15v0 java.util.List))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x000a: ARITH (r28v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r16v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0012: ARITH (r28v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r17v0 java.lang.Long))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x001a: ARITH (r28v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r18v0 java.util.List))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x0022: ARITH (r28v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r19v0 java.lang.Long))
  (wrap:java.lang.Long:?: TERNARY null = ((wrap:int:0x002a: ARITH (r28v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Long) : (r20v0 java.lang.Long))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0032: ARITH (r28v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r21v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x003a: ARITH (r28v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r22v0 java.lang.Integer))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0042: ARITH (r28v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r23v0 java.util.List))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x004a: ARITH (r28v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Boolean) : (r24v0 java.lang.Boolean))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0052: ARITH (r28v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r25v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x005a: ARITH (r28v0 int) & (2048 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r26v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0062: ARITH (r28v0 int) & (4096 int) A[WRAPPED]) == (0 int)) ? (r27v0 java.lang.String) : (null java.lang.String))
 A[MD:(java.util.List<java.lang.Integer>, java.lang.Long, java.lang.Long, java.util.List<java.lang.Integer>, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Integer, java.util.List<java.lang.Integer>, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String):void (m)] (LINE:9) call: com.okinc.okassetslite.api.assets_lite_api.transactionhistory.model.TransactionHistoryRequest.<init>(java.util.List, java.lang.Long, java.lang.Long, java.util.List, java.lang.Long, java.lang.Long, java.lang.Integer, java.lang.Integer, java.util.List, java.lang.Boolean, java.lang.Integer, java.lang.Integer, java.lang.String):void type: THIS */
    public /* synthetic */ TransactionHistoryRequest(List list, Long l, Long l2, List list2, Long l3, Long l4, Integer num, Integer num2, List list3, Boolean bool, Integer num3, Integer num4, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : l, (i & 4) != 0 ? null : l2, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : l3, (i & 32) != 0 ? null : l4, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : list3, (i & 512) != 0 ? null : bool, (i & 1024) != 0 ? null : num3, (i & 2048) != 0 ? null : num4, (i & 4096) == 0 ? str : null);
    }
}
