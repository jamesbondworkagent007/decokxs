package com.okinc.unify_trade.biz;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class OrderCategory implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<OrderCategory> CREATOR = new Creator();
    private String instTypeList;
    private String mpEnabled;
    private String strategyType;
    private List<CategoryTag> tags;
    private String userCount;

    public static final class Creator implements Parcelable.Creator<OrderCategory> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderCategory createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CategoryTag.CREATOR.createFromParcel(parcel));
            }
            return new OrderCategory(string, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OrderCategory[] newArray(int i) {
            return new OrderCategory[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.okinc.unify_trade.biz.OrderCategory */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OrderCategory copy$default(OrderCategory orderCategory, String str, List list, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderCategory.instTypeList;
        }
        if ((i & 2) != 0) {
            list = orderCategory.tags;
        }
        List list2 = list;
        if ((i & 4) != 0) {
            str2 = orderCategory.strategyType;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = orderCategory.userCount;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = orderCategory.mpEnabled;
        }
        return orderCategory.copy(str, list2, str5, str6, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CategoryTag> component2() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.userCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.mpEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderCategory copy(@NotNull String str, @NotNull List<CategoryTag> list, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new OrderCategory(str, list, str2, str3, str4);
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
        if (!(obj instanceof OrderCategory)) {
            return false;
        }
        OrderCategory orderCategory = (OrderCategory) obj;
        return Intrinsics.EZpvd((Object) this.instTypeList, (Object) orderCategory.instTypeList) && Intrinsics.EZpvd(this.tags, orderCategory.tags) && Intrinsics.EZpvd((Object) this.strategyType, (Object) orderCategory.strategyType) && Intrinsics.EZpvd((Object) this.userCount, (Object) orderCategory.userCount) && Intrinsics.EZpvd((Object) this.mpEnabled, (Object) orderCategory.mpEnabled);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstTypeList() {
        return this.instTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMpEnabled() {
        return this.mpEnabled;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getStrategyType() {
        return this.strategyType;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CategoryTag> getTags() {
        return this.tags;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getUserCount() {
        return this.userCount;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.instTypeList.hashCode() * 31) + this.tags.hashCode()) * 31) + this.strategyType.hashCode()) * 31) + this.userCount.hashCode()) * 31) + this.mpEnabled.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setInstTypeList(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.instTypeList = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMpEnabled(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.mpEnabled = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setStrategyType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.strategyType = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTags(@NotNull List<CategoryTag> list) {
        Intrinsics.checkNotNullParameter(list, "");
        this.tags = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setUserCount(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.userCount = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "OrderCategory(instTypeList=" + this.instTypeList + ", tags=" + this.tags + ", strategyType=" + this.strategyType + ", userCount=" + this.userCount + ", mpEnabled=" + this.mpEnabled + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instTypeList);
        List<CategoryTag> list = this.tags;
        parcel.writeInt(list.size());
        Iterator<CategoryTag> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.strategyType);
        parcel.writeString(this.userCount);
        parcel.writeString(this.mpEnabled);
    }

    public OrderCategory(@NotNull String str, @NotNull List<CategoryTag> list, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.instTypeList = str;
        this.tags = list;
        this.strategyType = str2;
        this.userCount = str3;
        this.mpEnabled = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0022: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.util.List:0x0011: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x000d: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:1064)) : (r9v0 java.util.List))
  (r10v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
 A[MD:(java.lang.String, java.util.List<com.okinc.unify_trade.biz.CategoryTag>, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:1062) call: com.okinc.unify_trade.biz.OrderCategory.<init>(java.lang.String, java.util.List, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ OrderCategory(String str, List list, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? yDY.AhwBna() : list, str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }
}
