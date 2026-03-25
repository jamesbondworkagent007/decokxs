package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.SpotBuyAndSellResponseBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class SpotBuyAndSellBean implements Parcelable {
    private String category;
    private String ratioBuy;
    private String ratioSell;
    private String ts;
    public static final StateListAnimator Companion = new StateListAnimator(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<SpotBuyAndSellBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<SpotBuyAndSellBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotBuyAndSellBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new SpotBuyAndSellBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SpotBuyAndSellBean[] newArray(int i) {
            return new SpotBuyAndSellBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public SpotBuyAndSellBean() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ SpotBuyAndSellBean copy$default(SpotBuyAndSellBean spotBuyAndSellBean, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotBuyAndSellBean.ts;
        }
        if ((i & 2) != 0) {
            str2 = spotBuyAndSellBean.ratioBuy;
        }
        if ((i & 4) != 0) {
            str3 = spotBuyAndSellBean.ratioSell;
        }
        if ((i & 8) != 0) {
            str4 = spotBuyAndSellBean.category;
        }
        return spotBuyAndSellBean.copy(str, str2, str3, str4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.ratioBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.ratioSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component4() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final SpotBuyAndSellBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        return new SpotBuyAndSellBean(str, str2, str3, str4);
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
        if (!(obj instanceof SpotBuyAndSellBean)) {
            return false;
        }
        SpotBuyAndSellBean spotBuyAndSellBean = (SpotBuyAndSellBean) obj;
        return Intrinsics.EZpvd((Object) this.ts, (Object) spotBuyAndSellBean.ts) && Intrinsics.EZpvd((Object) this.ratioBuy, (Object) spotBuyAndSellBean.ratioBuy) && Intrinsics.EZpvd((Object) this.ratioSell, (Object) spotBuyAndSellBean.ratioSell) && Intrinsics.EZpvd((Object) this.category, (Object) spotBuyAndSellBean.category);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCategory() {
        return this.category;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRatioBuy() {
        return this.ratioBuy;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getRatioSell() {
        return this.ratioSell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getTs() {
        return this.ts;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((this.ts.hashCode() * 31) + this.ratioBuy.hashCode()) * 31) + this.ratioSell.hashCode()) * 31) + this.category.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCategory(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.category = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRatioBuy(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ratioBuy = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setRatioSell(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ratioSell = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setTs(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ts = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "SpotBuyAndSellBean(ts=" + this.ts + ", ratioBuy=" + this.ratioBuy + ", ratioSell=" + this.ratioSell + ", category=" + this.category + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.ts);
        parcel.writeString(this.ratioBuy);
        parcel.writeString(this.ratioSell);
        parcel.writeString(this.category);
    }

    public SpotBuyAndSellBean(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        this.ts = str;
        this.ratioBuy = str2;
        this.ratioSell = str3;
        this.category = str4;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0016: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r6v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r6v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000c: ARITH (r6v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0011: ARITH (r6v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.SpotBuyAndSellBean.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ SpotBuyAndSellBean(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class StateListAnimator {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.SpotBuyAndSellBean.StateListAnimator.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ StateListAnimator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private StateListAnimator() {
        }

        public final List<SpotBuyAndSellBean> AEQbTJ(@NotNull List<SpotBuyAndSellResponseBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (SpotBuyAndSellResponseBean spotBuyAndSellResponseBean : list) {
                arrayList.add(new SpotBuyAndSellBean(spotBuyAndSellResponseBean.getTs(), spotBuyAndSellResponseBean.getRatioBuy(), spotBuyAndSellResponseBean.getRatioSell(), spotBuyAndSellResponseBean.getCategory()));
            }
            return arrayList;
        }
    }
}
