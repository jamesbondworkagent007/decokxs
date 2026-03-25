package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.TopInstIdsResponseBean;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class TopInstIdsBean implements Parcelable {
    private final String displayId;
    private final String instId;
    private final String latestPrice;
    private final String open24h;
    private final List<List<String>> priceList;
    private final String sodUtc0;
    private final String sodUtc8;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<TopInstIdsBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<TopInstIdsBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TopInstIdsBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.createStringArrayList());
            }
            return new TopInstIdsBean(string, string2, string3, string4, string5, string6, arrayList);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final TopInstIdsBean[] newArray(int i) {
            return new TopInstIdsBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public TopInstIdsBean() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.okinc.crcore.shared.net.responsebean.TopInstIdsBean */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TopInstIdsBean copy$default(TopInstIdsBean topInstIdsBean, String str, String str2, String str3, String str4, String str5, String str6, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = topInstIdsBean.instId;
        }
        if ((i & 2) != 0) {
            str2 = topInstIdsBean.displayId;
        }
        String str7 = str2;
        if ((i & 4) != 0) {
            str3 = topInstIdsBean.latestPrice;
        }
        String str8 = str3;
        if ((i & 8) != 0) {
            str4 = topInstIdsBean.open24h;
        }
        String str9 = str4;
        if ((i & 16) != 0) {
            str5 = topInstIdsBean.sodUtc0;
        }
        String str10 = str5;
        if ((i & 32) != 0) {
            str6 = topInstIdsBean.sodUtc8;
        }
        String str11 = str6;
        if ((i & 64) != 0) {
            list = topInstIdsBean.priceList;
        }
        return topInstIdsBean.copy(str, str7, str8, str9, str10, str11, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.latestPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component6() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> component7() {
        return this.priceList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TopInstIdsBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<? extends List<String>> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        return new TopInstIdsBean(str, str2, str3, str4, str5, str6, list);
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
        if (!(obj instanceof TopInstIdsBean)) {
            return false;
        }
        TopInstIdsBean topInstIdsBean = (TopInstIdsBean) obj;
        return Intrinsics.EZpvd((Object) this.instId, (Object) topInstIdsBean.instId) && Intrinsics.EZpvd((Object) this.displayId, (Object) topInstIdsBean.displayId) && Intrinsics.EZpvd((Object) this.latestPrice, (Object) topInstIdsBean.latestPrice) && Intrinsics.EZpvd((Object) this.open24h, (Object) topInstIdsBean.open24h) && Intrinsics.EZpvd((Object) this.sodUtc0, (Object) topInstIdsBean.sodUtc0) && Intrinsics.EZpvd((Object) this.sodUtc8, (Object) topInstIdsBean.sodUtc8) && Intrinsics.EZpvd(this.priceList, topInstIdsBean.priceList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getDisplayId() {
        return this.displayId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getInstId() {
        return this.instId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getLatestPrice() {
        return this.latestPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getOpen24h() {
        return this.open24h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<List<String>> getPriceList() {
        return this.priceList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc0() {
        return this.sodUtc0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getSodUtc8() {
        return this.sodUtc8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((((((this.instId.hashCode() * 31) + this.displayId.hashCode()) * 31) + this.latestPrice.hashCode()) * 31) + this.open24h.hashCode()) * 31) + this.sodUtc0.hashCode()) * 31) + this.sodUtc8.hashCode()) * 31) + this.priceList.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "TopInstIdsBean(instId=" + this.instId + ", displayId=" + this.displayId + ", latestPrice=" + this.latestPrice + ", open24h=" + this.open24h + ", sodUtc0=" + this.sodUtc0 + ", sodUtc8=" + this.sodUtc8 + ", priceList=" + this.priceList + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.instId);
        parcel.writeString(this.displayId);
        parcel.writeString(this.latestPrice);
        parcel.writeString(this.open24h);
        parcel.writeString(this.sodUtc0);
        parcel.writeString(this.sodUtc8);
        List<List<String>> list = this.priceList;
        parcel.writeInt(list.size());
        Iterator<List<String>> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeStringList(it.next());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: java.util.List<? extends java.util.List<java.lang.String>> */
    /* JADX WARN: Multi-variable type inference failed */
    public TopInstIdsBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String str6, @NotNull List<? extends List<String>> list) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.instId = str;
        this.displayId = str2;
        this.latestPrice = str3;
        this.open24h = str4;
        this.sodUtc0 = str5;
        this.sodUtc8 = str6;
        this.priceList = list;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x003b: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r13v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r13v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r13v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0017: ARITH (r13v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r13v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r10v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r13v0 int) & (32 int) A[WRAPPED]) == (0 int)) ? (r11v0 java.lang.String) : (""))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x002b: ARITH (r13v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:java.util.List:0x002f: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:17)) : (r12v0 java.util.List))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List<? extends java.util.List<java.lang.String>>):void (m)] (LINE:10) call: com.okinc.crcore.shared.net.responsebean.TopInstIdsBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List):void type: THIS */
    public /* synthetic */ TopInstIdsBean(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) == 0 ? str6 : "", (i & 64) != 0 ? yDY.AhwBna() : list);
    }

    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.TopInstIdsBean.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final List<TopInstIdsBean> copydefault(@NotNull List<TopInstIdsResponseBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (TopInstIdsResponseBean topInstIdsResponseBean : list) {
                arrayList.add(new TopInstIdsBean(topInstIdsResponseBean.getInstId(), topInstIdsResponseBean.getDisplayId(), topInstIdsResponseBean.getLatestPrice(), topInstIdsResponseBean.getOpen24h(), topInstIdsResponseBean.getSodUtc0(), topInstIdsResponseBean.getSodUtc8(), topInstIdsResponseBean.getPriceList()));
            }
            return arrayList;
        }
    }
}
