package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.FrameMetricsAggregator;
import com.okinc.crcore.coreapi.net.responsebean.SimpleCategoriesResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class SimpleCategoriesBean implements Parcelable {
    private final String categoryDarkIcon;
    private final String categoryLightIcon;
    private final String code;
    private final List<CoinBean> coinList;
    private final List<String> iconList;
    private final String introduce;
    private final String introduceShort;
    private final String name;
    private final String priceChange;
    public static final Application Companion = new Application(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SimpleCategoriesBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<SimpleCategoriesBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleCategoriesBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(CoinBean.CREATOR.createFromParcel(parcel));
            }
            return new SimpleCategoriesBean(string, string2, string3, string4, string5, string6, string7, arrayListCreateStringArrayList, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SimpleCategoriesBean[] newArray(int i) {
            return new SimpleCategoriesBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SimpleCategoriesBean() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
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
    public final String component6() {
        return this.categoryDarkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component7() {
        return this.categoryLightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<String> component8() {
        return this.iconList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinBean> component9() {
        return this.coinList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SimpleCategoriesBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull List<String> list, @NotNull List<CoinBean> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        return new SimpleCategoriesBean(str, str2, str3, str4, str5, str6, str7, list, list2);
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
        if (!(obj instanceof SimpleCategoriesBean)) {
            return false;
        }
        SimpleCategoriesBean simpleCategoriesBean = (SimpleCategoriesBean) obj;
        return Intrinsics.EZpvd((Object) this.code, (Object) simpleCategoriesBean.code) && Intrinsics.EZpvd((Object) this.name, (Object) simpleCategoriesBean.name) && Intrinsics.EZpvd((Object) this.introduce, (Object) simpleCategoriesBean.introduce) && Intrinsics.EZpvd((Object) this.introduceShort, (Object) simpleCategoriesBean.introduceShort) && Intrinsics.EZpvd((Object) this.priceChange, (Object) simpleCategoriesBean.priceChange) && Intrinsics.EZpvd((Object) this.categoryDarkIcon, (Object) simpleCategoriesBean.categoryDarkIcon) && Intrinsics.EZpvd((Object) this.categoryLightIcon, (Object) simpleCategoriesBean.categoryLightIcon) && Intrinsics.EZpvd(this.iconList, simpleCategoriesBean.iconList) && Intrinsics.EZpvd(this.coinList, simpleCategoriesBean.coinList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategoryDarkIcon() {
        return this.categoryDarkIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategoryLightIcon() {
        return this.categoryLightIcon;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCode() {
        return this.code;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<CoinBean> getCoinList() {
        return this.coinList;
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
    public int hashCode() {
        return (((((((((((((((this.code.hashCode() * 31) + this.name.hashCode()) * 31) + this.introduce.hashCode()) * 31) + this.introduceShort.hashCode()) * 31) + this.priceChange.hashCode()) * 31) + this.categoryDarkIcon.hashCode()) * 31) + this.categoryLightIcon.hashCode()) * 31) + this.iconList.hashCode()) * 31) + this.coinList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SimpleCategoriesBean(code=" + this.code + ", name=" + this.name + ", introduce=" + this.introduce + ", introduceShort=" + this.introduceShort + ", priceChange=" + this.priceChange + ", categoryDarkIcon=" + this.categoryDarkIcon + ", categoryLightIcon=" + this.categoryLightIcon + ", iconList=" + this.iconList + ", coinList=" + this.coinList + ")";
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
        parcel.writeString(this.categoryDarkIcon);
        parcel.writeString(this.categoryLightIcon);
        parcel.writeStringList(this.iconList);
        List<CoinBean> list = this.coinList;
        parcel.writeInt(list.size());
        Iterator<CoinBean> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }

    public SimpleCategoriesBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull String str7, @NotNull List<String> list, @NotNull List<CoinBean> list2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.code = str;
        this.name = str2;
        this.introduce = str3;
        this.introduceShort = str4;
        this.priceChange = str5;
        this.categoryDarkIcon = str6;
        this.categoryLightIcon = str7;
        this.iconList = list;
        this.coinList = list2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0059: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r19v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r11v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r12v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0019: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0020: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0027: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r15v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002e: ARITH (r19v0 int) & (64 int) A[WRAPPED]) == (0 int)) ? (r16v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0035: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:18)) : (r17v0 java.util.List))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0040: ARITH (r19v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0044: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:19)) : (r18v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<java.lang.String>, java.util.List<com.okinc.crcore.shared.net.responsebean.CoinBean>):void (m)] (LINE:10) call: com.okinc.crcore.shared.net.responsebean.SimpleCategoriesBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List):void type: THIS */
    public /* synthetic */ SimpleCategoriesBean(String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) == 0 ? str7 : "", (i & 128) != 0 ? yDY.AhwBna() : list, (i & 256) != 0 ? yDY.AhwBna() : list2);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.SimpleCategoriesBean.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final List<SimpleCategoriesBean> EZpvd(@NotNull List<SimpleCategoriesResponseBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (SimpleCategoriesResponseBean simpleCategoriesResponseBean : list) {
                arrayList.add(new SimpleCategoriesBean(simpleCategoriesResponseBean.getCode(), simpleCategoriesResponseBean.getName(), simpleCategoriesResponseBean.getIntroduce(), simpleCategoriesResponseBean.getIntroduceShort(), simpleCategoriesResponseBean.getPriceChange(), simpleCategoriesResponseBean.getCategoryDarkIcon(), simpleCategoriesResponseBean.getCategoryLightIcon(), simpleCategoriesResponseBean.getIconList(), CoinBean.Companion.KWHzl(simpleCategoriesResponseBean.getCoinList())));
            }
            return arrayList;
        }
    }
}
