package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.TrendingCategoriesResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TrendingCategoriesBean implements Parcelable {
    private final String code;
    private final List<String> iconList;
    private final String introduce;
    private final String introduceShort;
    private final String name;
    private final String priceChange;
    private final List<TopInstIdsBean> topInstIds;
    public static final TaskDescription Companion = new TaskDescription(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TrendingCategoriesBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TrendingCategoriesBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrendingCategoriesBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(TopInstIdsBean.CREATOR.createFromParcel(parcel));
            }
            return new TrendingCategoriesBean(string, string2, string3, string4, string5, arrayListCreateStringArrayList, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TrendingCategoriesBean[] newArray(int i) {
            return new TrendingCategoriesBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TrendingCategoriesBean() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.crcore.shared.net.responsebean.TrendingCategoriesBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TrendingCategoriesBean copy$default(TrendingCategoriesBean trendingCategoriesBean, String str, String str2, String str3, String str4, String str5, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trendingCategoriesBean.code;
        }
        if ((i & 2) != 0) {
            str2 = trendingCategoriesBean.name;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = trendingCategoriesBean.introduce;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = trendingCategoriesBean.introduceShort;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = trendingCategoriesBean.priceChange;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            list = trendingCategoriesBean.iconList;
        }
        List list3 = list;
        if ((i & 64) != 0) {
            list2 = trendingCategoriesBean.topInstIds;
        }
        return trendingCategoriesBean.copy(str, str6, str7, str8, str9, list3, list2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.introduce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.introduceShort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.priceChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component6() {
        return this.iconList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopInstIdsBean> component7() {
        return this.topInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TrendingCategoriesBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<String> list, @NotNull List<TopInstIdsBean> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new TrendingCategoriesBean(str, str2, str3, str4, str5, list, list2);
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
        if (!(obj instanceof TrendingCategoriesBean)) {
            return false;
        }
        TrendingCategoriesBean trendingCategoriesBean = (TrendingCategoriesBean) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) trendingCategoriesBean.code) && Intrinsics.EZpvd((Object) this.name, (Object) trendingCategoriesBean.name) && Intrinsics.EZpvd((Object) this.introduce, (Object) trendingCategoriesBean.introduce) && Intrinsics.EZpvd((Object) this.introduceShort, (Object) trendingCategoriesBean.introduceShort) && Intrinsics.EZpvd((Object) this.priceChange, (Object) trendingCategoriesBean.priceChange) && Intrinsics.EZpvd(this.iconList, trendingCategoriesBean.iconList) && Intrinsics.EZpvd(this.topInstIds, trendingCategoriesBean.topInstIds);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> getIconList() {
        return this.iconList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntroduce() {
        return this.introduce;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getIntroduceShort() {
        return this.introduceShort;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getName() {
        return this.name;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getPriceChange() {
        return this.priceChange;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<TopInstIdsBean> getTopInstIds() {
        return this.topInstIds;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + this.introduce.hashCode()) * 31) + this.introduceShort.hashCode()) * 31) + this.priceChange.hashCode()) * 31) + this.iconList.hashCode()) * 31) + this.topInstIds.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TrendingCategoriesBean(code=" + this.code + ", name=" + this.name + ", introduce=" + this.introduce + ", introduceShort=" + this.introduceShort + ", priceChange=" + this.priceChange + ", iconList=" + this.iconList + ", topInstIds=" + this.topInstIds + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.code);
        parcel.writeString(this.name);
        parcel.writeString(this.introduce);
        parcel.writeString(this.introduceShort);
        parcel.writeString(this.priceChange);
        parcel.writeStringList(this.iconList);
        List<TopInstIdsBean> list = this.topInstIds;
        parcel.writeInt(list.size());
        Iterator<TopInstIdsBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public TrendingCategoriesBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull List<String> list, @NotNull List<TopInstIdsBean> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.code = str;
        this.name = str2;
        this.introduce = str3;
        this.introduceShort = str4;
        this.priceChange = str5;
        this.iconList = list;
        this.topInstIds = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003d: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) == (0 int)) ? (r10v0 java.lang.String) : (""))
  (wrap:java.util.List:0x002c: TERNARY null = ((wrap:int:0x0024: ARITH (r13v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0028: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:16)) : (r11v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002d: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x0031: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r12v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<com.okinc.crcore.shared.net.responsebean.TopInstIdsBean>):void (m)] (LINE:10) call: com.okinc.crcore.shared.net.responsebean.TrendingCategoriesBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ TrendingCategoriesBean(String str, String str2, String str3, String str4, String str5, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? yDY.AhwBna() : list, (i & 64) != 0 ? yDY.AhwBna() : list2);
    }

    public static final class TaskDescription {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.TrendingCategoriesBean.TaskDescription.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ TaskDescription(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TaskDescription() {
        }

        public final List<TrendingCategoriesBean> KWHzl(@NotNull List<TrendingCategoriesResponseBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (TrendingCategoriesResponseBean trendingCategoriesResponseBean : list) {
                arrayList.add(new TrendingCategoriesBean(trendingCategoriesResponseBean.getCode(), trendingCategoriesResponseBean.getName(), trendingCategoriesResponseBean.getIntroduce(), trendingCategoriesResponseBean.getIntroduceShort(), trendingCategoriesResponseBean.getPriceChange(), trendingCategoriesResponseBean.getIconList(), TopInstIdsBean.Companion.copydefault(trendingCategoriesResponseBean.getTopInstIds())));
            }
            return arrayList;
        }
    }
}
