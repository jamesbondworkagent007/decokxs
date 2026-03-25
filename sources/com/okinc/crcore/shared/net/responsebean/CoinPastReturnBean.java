package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.CoinPastReturnResponseBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class CoinPastReturnBean implements Parcelable {
    private String coinYearReturn;
    private String marketYearReturn;
    public static final Activity Companion = new Activity(null);
    public static final int $stable = 8;
    public static final Parcelable.Creator<CoinPastReturnBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<CoinPastReturnBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinPastReturnBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new CoinPastReturnBean(parcel.readString(), parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CoinPastReturnBean[] newArray(int i) {
            return new CoinPastReturnBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public CoinPastReturnBean() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ CoinPastReturnBean copy$default(CoinPastReturnBean coinPastReturnBean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = coinPastReturnBean.coinYearReturn;
        }
        if ((i & 2) != 0) {
            str2 = coinPastReturnBean.marketYearReturn;
        }
        return coinPastReturnBean.copy(str, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coinYearReturn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.marketYearReturn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final CoinPastReturnBean copy(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new CoinPastReturnBean(str, str2);
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
        if (!(obj instanceof CoinPastReturnBean)) {
            return false;
        }
        CoinPastReturnBean coinPastReturnBean = (CoinPastReturnBean) obj;
        return Intrinsics.EZpvd((Object) this.coinYearReturn, (Object) coinPastReturnBean.coinYearReturn) && Intrinsics.EZpvd((Object) this.marketYearReturn, (Object) coinPastReturnBean.marketYearReturn);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinYearReturn() {
        return this.coinYearReturn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getMarketYearReturn() {
        return this.marketYearReturn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (this.coinYearReturn.hashCode() * 31) + this.marketYearReturn.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setCoinYearReturn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.coinYearReturn = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void setMarketYearReturn(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.marketYearReturn = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "CoinPastReturnBean(coinYearReturn=" + this.coinYearReturn + ", marketYearReturn=" + this.marketYearReturn + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coinYearReturn);
        parcel.writeString(this.marketYearReturn);
    }

    public CoinPastReturnBean(@NotNull String str, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.coinYearReturn = str;
        this.marketYearReturn = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x000c: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r2v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0007: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String):void (m)] (LINE:12) call: com.okinc.crcore.shared.net.responsebean.CoinPastReturnBean.<init>(java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ CoinPastReturnBean(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }

    public static final class Activity {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.CoinPastReturnBean.Activity.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Activity(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Activity() {
        }

        public final List<CoinPastReturnBean> copydefault(@NotNull List<CoinPastReturnResponseBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (CoinPastReturnResponseBean coinPastReturnResponseBean : list) {
                arrayList.add(new CoinPastReturnBean(coinPastReturnResponseBean.getCoinYearReturn(), coinPastReturnResponseBean.getMarketYearReturn()));
            }
            return arrayList;
        }
    }
}
