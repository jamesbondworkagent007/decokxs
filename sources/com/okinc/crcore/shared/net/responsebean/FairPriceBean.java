package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.FairPriceResponseBean;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.C56403yEb;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
public final class FairPriceBean implements Parcelable {
    public static final int $stable = 0;
    private final String coin;
    private final String fairPrice;
    private final String fairPricePair;
    private final boolean isConverterNeeded;
    private final boolean isStableCoin;
    public static final Application Companion = new Application(null);
    public static final Parcelable.Creator<FairPriceBean> CREATOR = new Creator();

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Creator implements Parcelable.Creator<FairPriceBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FairPriceBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new FairPriceBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FairPriceBean[] newArray(int i) {
            return new FairPriceBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public FairPriceBean() {
        this(null, null, null, false, false, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ FairPriceBean copy$default(FairPriceBean fairPriceBean, String str, String str2, String str3, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fairPriceBean.coin;
        }
        if ((i & 2) != 0) {
            str2 = fairPriceBean.fairPrice;
        }
        String str4 = str2;
        if ((i & 4) != 0) {
            str3 = fairPriceBean.fairPricePair;
        }
        String str5 = str3;
        if ((i & 8) != 0) {
            z = fairPriceBean.isConverterNeeded;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = fairPriceBean.isStableCoin;
        }
        return fairPriceBean.copy(str, str4, str5, z3, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component2() {
        return this.fairPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component3() {
        return this.fairPricePair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.isConverterNeeded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component5() {
        return this.isStableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final FairPriceBean copy(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        return new FairPriceBean(str, str2, str3, z, z2);
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
        if (!(obj instanceof FairPriceBean)) {
            return false;
        }
        FairPriceBean fairPriceBean = (FairPriceBean) obj;
        return Intrinsics.EZpvd((Object) this.coin, (Object) fairPriceBean.coin) && Intrinsics.EZpvd((Object) this.fairPrice, (Object) fairPriceBean.fairPrice) && Intrinsics.EZpvd((Object) this.fairPricePair, (Object) fairPriceBean.fairPricePair) && this.isConverterNeeded == fairPriceBean.isConverterNeeded && this.isStableCoin == fairPriceBean.isStableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoin() {
        return this.coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFairPrice() {
        return this.fairPrice;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getFairPricePair() {
        return this.fairPricePair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.coin.hashCode() * 31) + this.fairPrice.hashCode()) * 31) + this.fairPricePair.hashCode()) * 31) + Boolean.hashCode(this.isConverterNeeded)) * 31) + Boolean.hashCode(this.isStableCoin);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isConverterNeeded() {
        return this.isConverterNeeded;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean isStableCoin() {
        return this.isStableCoin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "FairPriceBean(coin=" + this.coin + ", fairPrice=" + this.fairPrice + ", fairPricePair=" + this.fairPricePair + ", isConverterNeeded=" + this.isConverterNeeded + ", isStableCoin=" + this.isStableCoin + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coin);
        parcel.writeString(this.fairPrice);
        parcel.writeString(this.fairPricePair);
        parcel.writeInt(this.isConverterNeeded ? 1 : 0);
        parcel.writeInt(this.isStableCoin ? 1 : 0);
    }

    public FairPriceBean(@NotNull String str, @NotNull String str2, @NotNull String str3, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        this.coin = str;
        this.fairPrice = str2;
        this.fairPricePair = str3;
        this.isConverterNeeded = z;
        this.isStableCoin = z2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r9v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r4v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0009: ARITH (r9v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0010: ARITH (r9v0 int) & (4 int) A[WRAPPED]) == (0 int)) ? (r6v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0016: ARITH (r9v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x001e: ARITH (r9v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? false : (r8v0 boolean))
 A[MD:(java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void (m)] (LINE:10) call: com.okinc.crcore.shared.net.responsebean.FairPriceBean.<init>(java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void type: THIS */
    public /* synthetic */ FairPriceBean(String str, String str2, String str3, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) == 0 ? str3 : "", (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    /* JADX INFO: loaded from: classes23.dex */
    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.FairPriceBean.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final List<FairPriceBean> copydefault(@NotNull List<FairPriceResponseBean> list) {
            Intrinsics.checkNotNullParameter(list, "");
            ArrayList arrayList = new ArrayList(C56403yEb.AYXKKw(list, 10));
            for (FairPriceResponseBean fairPriceResponseBean : list) {
                arrayList.add(new FairPriceBean(fairPriceResponseBean.getCoin(), fairPriceResponseBean.getFairPrice(), fairPriceResponseBean.getFairPricePair(), Boolean.parseBoolean(fairPriceResponseBean.isConverterNeeded()), Boolean.parseBoolean(fairPriceResponseBean.isStableCoin())));
            }
            return arrayList;
        }
    }
}
