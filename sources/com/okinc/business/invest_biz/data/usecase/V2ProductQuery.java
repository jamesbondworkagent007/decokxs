package com.okinc.business.invest_biz.data.usecase;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.business.invest_biz.data.bean.InvestChip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class V2ProductQuery implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<V2ProductQuery> CREATOR = new Creator();
    private final String filterTypeId;
    private final String investType;
    private final Boolean isSearch;
    private final String itemKey;
    private final List<InvestChip> keyword;
    private final String network;
    private final Integer pageNum;
    private final String property;
    private final String riskFilterId;
    private final Integer subTabId;
    private final Boolean supportPaging;
    private final int tabId;

    public static final class Creator implements Parcelable.Creator<V2ProductQuery> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final V2ProductQuery createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            Boolean boolValueOf2 = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList2.add(InvestChip.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new V2ProductQuery(i, string, numValueOf, numValueOf2, string2, string3, string4, boolValueOf, boolValueOf2, arrayList, parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final V2ProductQuery[] newArray(int i) {
            return new V2ProductQuery[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.tabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestChip> component10() {
        return this.keyword;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component11() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component12() {
        return this.riskFilterId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.itemKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component3() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.subTabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.filterTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.property;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component8() {
        return this.supportPaging;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component9() {
        return this.isSearch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final V2ProductQuery copy(int i, String str, Integer num, Integer num2, String str2, String str3, String str4, Boolean bool, Boolean bool2, List<InvestChip> list, String str5, String str6) {
        return new V2ProductQuery(i, str, num, num2, str2, str3, str4, bool, bool2, list, str5, str6);
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
        if (!(obj instanceof V2ProductQuery)) {
            return false;
        }
        V2ProductQuery v2ProductQuery = (V2ProductQuery) obj;
        return this.tabId == v2ProductQuery.tabId && Intrinsics.EZpvd((Object) this.itemKey, (Object) v2ProductQuery.itemKey) && Intrinsics.EZpvd(this.pageNum, v2ProductQuery.pageNum) && Intrinsics.EZpvd(this.subTabId, v2ProductQuery.subTabId) && Intrinsics.EZpvd((Object) this.network, (Object) v2ProductQuery.network) && Intrinsics.EZpvd((Object) this.filterTypeId, (Object) v2ProductQuery.filterTypeId) && Intrinsics.EZpvd((Object) this.property, (Object) v2ProductQuery.property) && Intrinsics.EZpvd(this.supportPaging, v2ProductQuery.supportPaging) && Intrinsics.EZpvd(this.isSearch, v2ProductQuery.isSearch) && Intrinsics.EZpvd(this.keyword, v2ProductQuery.keyword) && Intrinsics.EZpvd((Object) this.investType, (Object) v2ProductQuery.investType) && Intrinsics.EZpvd((Object) this.riskFilterId, (Object) v2ProductQuery.riskFilterId);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFilterTypeId() {
        return this.filterTypeId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInvestType() {
        return this.investType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getItemKey() {
        return this.itemKey;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<InvestChip> getKeyword() {
        return this.keyword;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getNetwork() {
        return this.network;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getPageNum() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getProperty() {
        return this.property;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRiskFilterId() {
        return this.riskFilterId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer getSubTabId() {
        return this.subTabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean getSupportPaging() {
        return this.supportPaging;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTabId() {
        return this.tabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.tabId);
        String str = this.itemKey;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.pageNum;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.subTabId;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        String str2 = this.network;
        int iHashCode5 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.filterTypeId;
        int iHashCode6 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.property;
        int iHashCode7 = str4 == null ? 0 : str4.hashCode();
        Boolean bool = this.supportPaging;
        int iHashCode8 = bool == null ? 0 : bool.hashCode();
        Boolean bool2 = this.isSearch;
        int iHashCode9 = bool2 == null ? 0 : bool2.hashCode();
        List<InvestChip> list = this.keyword;
        int iHashCode10 = list == null ? 0 : list.hashCode();
        String str5 = this.investType;
        int iHashCode11 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.riskFilterId;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean isSearch() {
        return this.isSearch;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "V2ProductQuery(tabId=" + this.tabId + ", itemKey=" + this.itemKey + ", pageNum=" + this.pageNum + ", subTabId=" + this.subTabId + ", network=" + this.network + ", filterTypeId=" + this.filterTypeId + ", property=" + this.property + ", supportPaging=" + this.supportPaging + ", isSearch=" + this.isSearch + ", keyword=" + this.keyword + ", investType=" + this.investType + ", riskFilterId=" + this.riskFilterId + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.tabId);
        parcel.writeString(this.itemKey);
        Integer num = this.pageNum;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.subTabId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.network);
        parcel.writeString(this.filterTypeId);
        parcel.writeString(this.property);
        Boolean bool = this.supportPaging;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Boolean bool2 = this.isSearch;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
        }
        List<InvestChip> list = this.keyword;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            Iterator<InvestChip> it = list.iterator();
            while (it.hasNext()) {
                it.next().writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.investType);
        parcel.writeString(this.riskFilterId);
    }

    public V2ProductQuery(int i, String str, Integer num, Integer num2, String str2, String str3, String str4, Boolean bool, Boolean bool2, List<InvestChip> list, String str5, String str6) {
        this.tabId = i;
        this.itemKey = str;
        this.pageNum = num;
        this.subTabId = num2;
        this.network = str2;
        this.filterTypeId = str3;
        this.property = str4;
        this.supportPaging = bool;
        this.isSearch = bool2;
        this.keyword = list;
        this.investType = str5;
        this.riskFilterId = str6;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0072: CONSTRUCTOR 
  (r13v0 int)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r25v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r14v0 java.lang.String))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x000a: ARITH (r25v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r15v0 java.lang.Integer))
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0011: ARITH (r25v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (null java.lang.Integer) : (r16v0 java.lang.Integer))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r25v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0021: ARITH (r25v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r18v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0029: ARITH (r25v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r19v0 java.lang.String))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x0031: ARITH (r25v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0035: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x003a: ARITH (r25v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003e: SGET  A[WRAPPED] java.lang.Boolean.FALSE java.lang.Boolean) : (r21v0 java.lang.Boolean))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0043: ARITH (r25v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null java.util.List) : (r22v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004b: ARITH (r25v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (r23v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0053: ARITH (r25v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (null java.lang.String))
 A[MD:(int, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.util.List<com.okinc.business.invest_biz.data.bean.InvestChip>, java.lang.String, java.lang.String):void (m)] (LINE:24) call: com.okinc.business.invest_biz.data.usecase.V2ProductQuery.<init>(int, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.Boolean, java.util.List, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ V2ProductQuery(int i, String str, Integer num, Integer num2, String str2, String str3, String str4, Boolean bool, Boolean bool2, List list, String str5, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? null : num, (i2 & 8) != 0 ? null : num2, (i2 & 16) != 0 ? null : str2, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? Boolean.FALSE : bool, (i2 & 256) != 0 ? Boolean.FALSE : bool2, (i2 & 512) != 0 ? null : list, (i2 & 1024) != 0 ? null : str5, (i2 & 2048) == 0 ? str6 : null);
    }
}
