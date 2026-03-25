package com.okinc.crcore.shared.net.responsebean;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.crcore.coreapi.net.responsebean.BusinessSupportResponseBean;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class BusinessSupportBean implements Parcelable {
    public static final int $stable = 0;
    private final String coin;
    private final String coinPair;
    private final boolean supportBuySell;
    private final boolean supportDeposit;
    private final boolean supportOrderbook;
    public static final Application Companion = new Application(null);
    public static final Parcelable.Creator<BusinessSupportBean> CREATOR = new Creator();

    public static final class Creator implements Parcelable.Creator<BusinessSupportBean> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BusinessSupportBean createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new BusinessSupportBean(parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString());
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BusinessSupportBean[] newArray(int i) {
            return new BusinessSupportBean[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public BusinessSupportBean() {
        this(null, false, false, false, null, 31, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public static /* synthetic */ BusinessSupportBean copy$default(BusinessSupportBean businessSupportBean, String str, boolean z, boolean z2, boolean z3, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = businessSupportBean.coin;
        }
        if ((i & 2) != 0) {
            z = businessSupportBean.supportDeposit;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = businessSupportBean.supportBuySell;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = businessSupportBean.supportOrderbook;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            str2 = businessSupportBean.coinPair;
        }
        return businessSupportBean.copy(str, z4, z5, z6, str2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component1() {
        return this.coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component2() {
        return this.supportDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component3() {
        return this.supportBuySell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean component4() {
        return this.supportOrderbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String component5() {
        return this.coinPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BusinessSupportBean copy(@NotNull String str, boolean z, boolean z2, boolean z3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        return new BusinessSupportBean(str, z, z2, z3, str2);
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
        if (!(obj instanceof BusinessSupportBean)) {
            return false;
        }
        BusinessSupportBean businessSupportBean = (BusinessSupportBean) obj;
        return Intrinsics.EZpvd((Object) this.coin, (Object) businessSupportBean.coin) && this.supportDeposit == businessSupportBean.supportDeposit && this.supportBuySell == businessSupportBean.supportBuySell && this.supportOrderbook == businessSupportBean.supportOrderbook && Intrinsics.EZpvd((Object) this.coinPair, (Object) businessSupportBean.coinPair);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoin() {
        return this.coin;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String getCoinPair() {
        return this.coinPair;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportBuySell() {
        return this.supportBuySell;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportDeposit() {
        return this.supportDeposit;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean getSupportOrderbook() {
        return this.supportOrderbook;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        return (((((((this.coin.hashCode() * 31) + Boolean.hashCode(this.supportDeposit)) * 31) + Boolean.hashCode(this.supportBuySell)) * 31) + Boolean.hashCode(this.supportOrderbook)) * 31) + this.coinPair.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BusinessSupportBean(coin=" + this.coin + ", supportDeposit=" + this.supportDeposit + ", supportBuySell=" + this.supportBuySell + ", supportOrderbook=" + this.supportOrderbook + ", coinPair=" + this.coinPair + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.coin);
        parcel.writeInt(this.supportDeposit ? 1 : 0);
        parcel.writeInt(this.supportBuySell ? 1 : 0);
        parcel.writeInt(this.supportOrderbook ? 1 : 0);
        parcel.writeString(this.coinPair);
    }

    public BusinessSupportBean(@NotNull String str, boolean z, boolean z2, boolean z3, @NotNull String str2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        this.coin = str;
        this.supportDeposit = z;
        this.supportBuySell = z2;
        this.supportOrderbook = z3;
        this.coinPair = str2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r10v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("") : (r5v0 java.lang.String))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0009: ARITH (r10v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? false : (r6v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0011: ARITH (r10v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? false : (r7v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0018: ARITH (r10v0 int) & (8 int) A[WRAPPED]) == (0 int)) ? (r8v0 boolean) : false)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001e: ARITH (r10v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("") : (r9v0 java.lang.String))
 A[MD:(java.lang.String, boolean, boolean, boolean, java.lang.String):void (m)] (LINE:10) call: com.okinc.crcore.shared.net.responsebean.BusinessSupportBean.<init>(java.lang.String, boolean, boolean, boolean, java.lang.String):void type: THIS */
    public /* synthetic */ BusinessSupportBean(String str, boolean z, boolean z2, boolean z3, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) == 0 ? z3 : false, (i & 16) != 0 ? "" : str2);
    }

    public static final class Application {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] call: com.okinc.crcore.shared.net.responsebean.BusinessSupportBean.Application.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        public /* synthetic */ Application(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Application() {
        }

        public final BusinessSupportBean EZpvd(@NotNull String str, @NotNull BusinessSupportResponseBean businessSupportResponseBean) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(businessSupportResponseBean, "");
            return new BusinessSupportBean(str, Boolean.parseBoolean(businessSupportResponseBean.getSupportDeposit()), Boolean.parseBoolean(businessSupportResponseBean.getSupportBuySell()), Boolean.parseBoolean(businessSupportResponseBean.getSupportOrderbook()), businessSupportResponseBean.getCoinPair());
        }
    }
}
