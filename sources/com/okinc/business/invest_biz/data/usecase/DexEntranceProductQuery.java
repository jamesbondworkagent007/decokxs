package com.okinc.business.invest_biz.data.usecase;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class DexEntranceProductQuery implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<DexEntranceProductQuery> CREATOR = new Creator();
    private final long chainId;
    private final String order;
    private final Integer pageNum;
    private final String property;
    private final Boolean supportPaging;
    private final int tabId;
    private final String tabName;
    private final String tokenAddress;

    public static final class Creator implements Parcelable.Creator<DexEntranceProductQuery> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexEntranceProductQuery createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "");
            int i = parcel.readInt();
            long j = parcel.readLong();
            String string = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new DexEntranceProductQuery(i, j, string, numValueOf, string2, string3, boolValueOf, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DexEntranceProductQuery[] newArray(int i) {
            return new DexEntranceProductQuery[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int component1() {
        return this.tabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long component2() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Integer component4() {
        return this.pageNum;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.property;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.order;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final Boolean component7() {
        return this.supportPaging;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component8() {
        return this.tabName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexEntranceProductQuery copy(int i, long j, @NotNull String str, Integer num, @NotNull String str2, @NotNull String str3, Boolean bool, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new DexEntranceProductQuery(i, j, str, num, str2, str3, bool, str4);
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
        if (!(obj instanceof DexEntranceProductQuery)) {
            return false;
        }
        DexEntranceProductQuery dexEntranceProductQuery = (DexEntranceProductQuery) obj;
        return this.tabId == dexEntranceProductQuery.tabId && this.chainId == dexEntranceProductQuery.chainId && Intrinsics.EZpvd((Object) this.tokenAddress, (Object) dexEntranceProductQuery.tokenAddress) && Intrinsics.EZpvd(this.pageNum, dexEntranceProductQuery.pageNum) && Intrinsics.EZpvd((Object) this.property, (Object) dexEntranceProductQuery.property) && Intrinsics.EZpvd((Object) this.order, (Object) dexEntranceProductQuery.order) && Intrinsics.EZpvd(this.supportPaging, dexEntranceProductQuery.supportPaging) && Intrinsics.EZpvd((Object) this.tabName, (Object) dexEntranceProductQuery.tabName);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final long getChainId() {
        return this.chainId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOrder() {
        return this.order;
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
    public final Boolean getSupportPaging() {
        return this.supportPaging;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final int getTabId() {
        return this.tabId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTabName() {
        return this.tabName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTokenAddress() {
        return this.tokenAddress;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = Integer.hashCode(this.tabId);
        int iHashCode2 = Long.hashCode(this.chainId);
        int iHashCode3 = this.tokenAddress.hashCode();
        Integer num = this.pageNum;
        int iHashCode4 = num == null ? 0 : num.hashCode();
        int iHashCode5 = this.property.hashCode();
        int iHashCode6 = this.order.hashCode();
        Boolean bool = this.supportPaging;
        return (((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool != null ? bool.hashCode() : 0)) * 31) + this.tabName.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "DexEntranceProductQuery(tabId=" + this.tabId + ", chainId=" + this.chainId + ", tokenAddress=" + this.tokenAddress + ", pageNum=" + this.pageNum + ", property=" + this.property + ", order=" + this.order + ", supportPaging=" + this.supportPaging + ", tabName=" + this.tabName + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeInt(this.tabId);
        parcel.writeLong(this.chainId);
        parcel.writeString(this.tokenAddress);
        Integer num = this.pageNum;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.property);
        parcel.writeString(this.order);
        Boolean bool = this.supportPaging;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.tabName);
    }

    public DexEntranceProductQuery(int i, long j, @NotNull String str, Integer num, @NotNull String str2, @NotNull String str3, Boolean bool, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.tabId = i;
        this.chainId = j;
        this.tokenAddress = str;
        this.pageNum = num;
        this.property = str2;
        this.order = str3;
        this.supportPaging = bool;
        this.tabName = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002c: CONSTRUCTOR 
  (r13v0 int)
  (r14v0 long)
  (r16v0 java.lang.String)
  (wrap:java.lang.Integer:?: TERNARY null = ((wrap:int:0x0002: ARITH (r22v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (1 int) : (r17v0 java.lang.Integer))
  (r18v0 java.lang.String)
  (r19v0 java.lang.String)
  (wrap:java.lang.Boolean:?: TERNARY null = ((wrap:int:0x000f: ARITH (r22v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0015: SGET  A[WRAPPED] java.lang.Boolean.TRUE java.lang.Boolean) : (r20v0 java.lang.Boolean))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r22v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
 A[MD:(int, long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void (m)] (LINE:16) call: com.okinc.business.invest_biz.data.usecase.DexEntranceProductQuery.<init>(int, long, java.lang.String, java.lang.Integer, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String):void type: THIS */
    public /* synthetic */ DexEntranceProductQuery(int i, long j, String str, Integer num, String str2, String str3, Boolean bool, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, j, str, (i2 & 8) != 0 ? 1 : num, str2, str3, (i2 & 64) != 0 ? Boolean.TRUE : bool, (i2 & 128) != 0 ? "" : str4);
    }
}
