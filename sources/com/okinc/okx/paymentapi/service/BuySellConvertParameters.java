package com.okinc.okx.paymentapi.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency;
import com.okinc.okpaymentapi.data.remote.model.management.OrderType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o.yDY;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class BuySellConvertParameters implements Parcelable {
    public static final Parcelable.Creator<BuySellConvertParameters> CREATOR = new Creator();
    public String AEQbTJ;
    public final OrderType AYXKKw;
    public final OrderFrequency AhwBna;
    public final OKPaymentSource AkhnZx;
    public TargetTab DbNXlk;
    public BuySellBaseCurrencyInfo EZpvd;
    public DexTokenParameters KWHzl;
    public final String OLrzqt;
    public final String copydefault;
    public final boolean djBIcL;
    public String ejfBZ;
    public final List<VerificationStatus> fJNWhG;
    public final boolean fetchVPNInfo;
    public final String gEmmrt;
    public String isConnected;
    public final ProConvertEntranceParameters valueOf;
    public boolean values;

    public static final class Creator implements Parcelable.Creator<BuySellConvertParameters> {
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellConvertParameters createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            OKPaymentSource oKPaymentSourceValueOf = OKPaymentSource.valueOf(parcel.readString());
            TargetTab targetTabValueOf = TargetTab.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            BuySellBaseCurrencyInfo buySellBaseCurrencyInfoCreateFromParcel = parcel.readInt() == 0 ? null : BuySellBaseCurrencyInfo.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(VerificationStatus.CREATOR.createFromParcel(parcel));
            }
            return new BuySellConvertParameters(oKPaymentSourceValueOf, targetTabValueOf, string, string2, buySellBaseCurrencyInfoCreateFromParcel, string3, string4, arrayList, parcel.readString(), OrderType.valueOf(parcel.readString()), OrderFrequency.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() == 0 ? null : DexTokenParameters.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ProConvertEntranceParameters.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
        /* JADX DEBUG: Method merged with bridge method: newArray(I)[Ljava/lang/Object; */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BuySellConvertParameters[] newArray(int i) {
            return new BuySellConvertParameters[i];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final DexTokenParameters AEQbTJ() {
        return this.KWHzl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(BuySellBaseCurrencyInfo buySellBaseCurrencyInfo) {
        this.EZpvd = buySellBaseCurrencyInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void AEQbTJ(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.ejfBZ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderFrequency AYXKKw() {
        return this.AhwBna;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String AhwBna() {
        return this.isConnected;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OKPaymentSource AkhnZx() {
        return this.AkhnZx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean DbNXlk() {
        return this.fetchVPNInfo;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellBaseCurrencyInfo EZpvd() {
        return this.EZpvd;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final BuySellConvertParameters KWHzl(@NotNull OKPaymentSource oKPaymentSource, @NotNull TargetTab targetTab, @NotNull String str, @NotNull String str2, BuySellBaseCurrencyInfo buySellBaseCurrencyInfo, @NotNull String str3, @NotNull String str4, @NotNull List<? extends VerificationStatus> list, @NotNull String str5, @NotNull OrderType orderType, @NotNull OrderFrequency orderFrequency, @NotNull String str6, boolean z, DexTokenParameters dexTokenParameters, ProConvertEntranceParameters proConvertEntranceParameters, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(oKPaymentSource, "");
        Intrinsics.checkNotNullParameter(targetTab, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(orderType, "");
        Intrinsics.checkNotNullParameter(orderFrequency, "");
        Intrinsics.checkNotNullParameter(str6, "");
        return new BuySellConvertParameters(oKPaymentSource, targetTab, str, str2, buySellBaseCurrencyInfo, str3, str4, list, str5, orderType, orderFrequency, str6, z, dexTokenParameters, proConvertEntranceParameters, z2, z3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String KWHzl() {
        return this.OLrzqt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String OLrzqt() {
        return this.copydefault;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String copydefault() {
        return this.AEQbTJ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(DexTokenParameters dexTokenParameters) {
        this.KWHzl = dexTokenParameters;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull TargetTab targetTab) {
        Intrinsics.checkNotNullParameter(targetTab, "");
        this.DbNXlk = targetTab;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AEQbTJ = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final void copydefault(boolean z) {
        this.values = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final OrderType djBIcL() {
        return this.AYXKKw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BuySellConvertParameters)) {
            return false;
        }
        BuySellConvertParameters buySellConvertParameters = (BuySellConvertParameters) obj;
        return this.AkhnZx == buySellConvertParameters.AkhnZx && this.DbNXlk == buySellConvertParameters.DbNXlk && Intrinsics.EZpvd((Object) this.AEQbTJ, (Object) buySellConvertParameters.AEQbTJ) && Intrinsics.EZpvd((Object) this.isConnected, (Object) buySellConvertParameters.isConnected) && Intrinsics.EZpvd(this.EZpvd, buySellConvertParameters.EZpvd) && Intrinsics.EZpvd((Object) this.OLrzqt, (Object) buySellConvertParameters.OLrzqt) && Intrinsics.EZpvd((Object) this.gEmmrt, (Object) buySellConvertParameters.gEmmrt) && Intrinsics.EZpvd(this.fJNWhG, buySellConvertParameters.fJNWhG) && Intrinsics.EZpvd((Object) this.ejfBZ, (Object) buySellConvertParameters.ejfBZ) && this.AYXKKw == buySellConvertParameters.AYXKKw && this.AhwBna == buySellConvertParameters.AhwBna && Intrinsics.EZpvd((Object) this.copydefault, (Object) buySellConvertParameters.copydefault) && this.fetchVPNInfo == buySellConvertParameters.fetchVPNInfo && Intrinsics.EZpvd(this.KWHzl, buySellConvertParameters.KWHzl) && Intrinsics.EZpvd(this.valueOf, buySellConvertParameters.valueOf) && this.djBIcL == buySellConvertParameters.djBIcL && this.values == buySellConvertParameters.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean fJNWhG() {
        return this.djBIcL;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final List<VerificationStatus> fetchVPNInfo() {
        return this.fJNWhG;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final boolean gEmmrt() {
        return this.values;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public int hashCode() {
        int iHashCode = this.AkhnZx.hashCode();
        int iHashCode2 = this.DbNXlk.hashCode();
        int iHashCode3 = this.AEQbTJ.hashCode();
        int iHashCode4 = this.isConnected.hashCode();
        BuySellBaseCurrencyInfo buySellBaseCurrencyInfo = this.EZpvd;
        int iHashCode5 = buySellBaseCurrencyInfo == null ? 0 : buySellBaseCurrencyInfo.hashCode();
        int iHashCode6 = this.OLrzqt.hashCode();
        int iHashCode7 = this.gEmmrt.hashCode();
        int iHashCode8 = this.fJNWhG.hashCode();
        int iHashCode9 = this.ejfBZ.hashCode();
        int iHashCode10 = this.AYXKKw.hashCode();
        int iHashCode11 = this.AhwBna.hashCode();
        int iHashCode12 = this.copydefault.hashCode();
        int iHashCode13 = Boolean.hashCode(this.fetchVPNInfo);
        DexTokenParameters dexTokenParameters = this.KWHzl;
        int iHashCode14 = dexTokenParameters == null ? 0 : dexTokenParameters.hashCode();
        ProConvertEntranceParameters proConvertEntranceParameters = this.valueOf;
        return (((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + (proConvertEntranceParameters == null ? 0 : proConvertEntranceParameters.hashCode())) * 31) + Boolean.hashCode(this.djBIcL)) * 31) + Boolean.hashCode(this.values);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final TargetTab isConnected() {
        return this.DbNXlk;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public String toString() {
        return "BuySellConvertParameters(source=" + this.AkhnZx + ", targetTab=" + this.DbNXlk + ", baseCurrency=" + this.AEQbTJ + ", quoteCurrency=" + this.isConnected + ", buySellBaseCurrencyInfo=" + this.EZpvd + ", baseAmount=" + this.OLrzqt + ", quoteAmount=" + this.gEmmrt + ", verificationStates=" + this.fJNWhG + ", topUpCurrency=" + this.ejfBZ + ", orderType=" + this.AYXKKw + ", frequencyType=" + this.AhwBna + ", deeplinkFrequency=" + this.copydefault + ", showCryptoCoachmark=" + this.fetchVPNInfo + ", dexTokenParameters=" + this.KWHzl + ", proConvertParameters=" + this.valueOf + ", isOffshoreUser=" + this.djBIcL + ", showAddAccountToast=" + this.values + ")";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final ProConvertEntranceParameters valueOf() {
        return this.valueOf;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    public final String values() {
        return this.ejfBZ;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 0 */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "");
        parcel.writeString(this.AkhnZx.name());
        parcel.writeString(this.DbNXlk.name());
        parcel.writeString(this.AEQbTJ);
        parcel.writeString(this.isConnected);
        BuySellBaseCurrencyInfo buySellBaseCurrencyInfo = this.EZpvd;
        if (buySellBaseCurrencyInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buySellBaseCurrencyInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.OLrzqt);
        parcel.writeString(this.gEmmrt);
        List<VerificationStatus> list = this.fJNWhG;
        parcel.writeInt(list.size());
        Iterator<VerificationStatus> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
        parcel.writeString(this.ejfBZ);
        parcel.writeString(this.AYXKKw.name());
        parcel.writeString(this.AhwBna.name());
        parcel.writeString(this.copydefault);
        parcel.writeInt(this.fetchVPNInfo ? 1 : 0);
        DexTokenParameters dexTokenParameters = this.KWHzl;
        if (dexTokenParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dexTokenParameters.writeToParcel(parcel, i);
        }
        ProConvertEntranceParameters proConvertEntranceParameters = this.valueOf;
        if (proConvertEntranceParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            proConvertEntranceParameters.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.djBIcL ? 1 : 0);
        parcel.writeInt(this.values ? 1 : 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r21v0, resolved type: java.util.List<? extends com.okinc.okx.paymentapi.service.VerificationStatus> */
    /* JADX WARN: Multi-variable type inference failed */
    public BuySellConvertParameters(@NotNull OKPaymentSource oKPaymentSource, @NotNull TargetTab targetTab, @NotNull String str, @NotNull String str2, BuySellBaseCurrencyInfo buySellBaseCurrencyInfo, @NotNull String str3, @NotNull String str4, @NotNull List<? extends VerificationStatus> list, @NotNull String str5, @NotNull OrderType orderType, @NotNull OrderFrequency orderFrequency, @NotNull String str6, boolean z, DexTokenParameters dexTokenParameters, ProConvertEntranceParameters proConvertEntranceParameters, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(oKPaymentSource, "");
        Intrinsics.checkNotNullParameter(targetTab, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(orderType, "");
        Intrinsics.checkNotNullParameter(orderFrequency, "");
        Intrinsics.checkNotNullParameter(str6, "");
        this.AkhnZx = oKPaymentSource;
        this.DbNXlk = targetTab;
        this.AEQbTJ = str;
        this.isConnected = str2;
        this.EZpvd = buySellBaseCurrencyInfo;
        this.OLrzqt = str3;
        this.gEmmrt = str4;
        this.fJNWhG = list;
        this.ejfBZ = str5;
        this.AYXKKw = orderType;
        this.AhwBna = orderFrequency;
        this.copydefault = str6;
        this.fetchVPNInfo = z;
        this.KWHzl = dexTokenParameters;
        this.valueOf = proConvertEntranceParameters;
        this.djBIcL = z2;
        this.values = z3;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x00b3: CONSTRUCTOR 
  (r19v0 com.okinc.okx.paymentapi.service.OKPaymentSource)
  (wrap:com.okinc.okx.paymentapi.service.TargetTab:?: TERNARY null = ((wrap:int:0x0002: ARITH (r36v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:644) com.okinc.okx.paymentapi.service.TargetTab.BUY com.okinc.okx.paymentapi.service.TargetTab) : (r20v0 com.okinc.okx.paymentapi.service.TargetTab))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000b: ARITH (r36v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0015: ARITH (r36v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r22v0 java.lang.String))
  (wrap:com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo:?: TERNARY null = ((wrap:int:0x001d: ARITH (r36v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo) : (r23v0 com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r36v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r24v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r36v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r25v0 java.lang.String))
  (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0035: ARITH (r36v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0039: INVOKE  STATIC call: o.yDY.AhwBna():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:650)) : (r26v0 java.util.List))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0040: ARITH (r36v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? ("") : (r27v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.OrderType:?: TERNARY null = ((wrap:int:0x0048: ARITH (r36v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004c: SGET  A[WRAPPED] (LINE:652) com.okinc.okpaymentapi.data.remote.model.management.OrderType.ONE_TIME com.okinc.okpaymentapi.data.remote.model.management.OrderType) : (r28v0 com.okinc.okpaymentapi.data.remote.model.management.OrderType))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency:?: TERNARY null = ((wrap:int:0x0051: ARITH (r36v0 int) & (1024 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0055: SGET  A[WRAPPED] (LINE:653) com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency.NO_FREQ com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency) : (r29v0 com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x005a: ARITH (r36v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r30v0 java.lang.String) : (""))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0061: ARITH (r36v0 int) & (4096 int) A[WRAPPED]) != (0 int)) ? false : (r31v0 boolean))
  (wrap:com.okinc.okx.paymentapi.service.DexTokenParameters:?: TERNARY null = ((wrap:int:0x006a: ARITH (r36v0 int) & (8192 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.service.DexTokenParameters) : (r32v0 com.okinc.okx.paymentapi.service.DexTokenParameters))
  (wrap:com.okinc.okx.paymentapi.service.ProConvertEntranceParameters:?: TERNARY null = ((wrap:int:0x0072: ARITH (r36v0 int) & (16384 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.service.ProConvertEntranceParameters) : (r33v0 com.okinc.okx.paymentapi.service.ProConvertEntranceParameters))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x007d: ARITH (r36v0 int) & (32768 int) A[WRAPPED]) != (0 int)) ? false : (r34v0 boolean))
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0088: ARITH (r36v0 int) & (65536 int) A[WRAPPED]) == (0 int)) ? (r35v0 boolean) : false)
 A[MD:(com.okinc.okx.paymentapi.service.OKPaymentSource, com.okinc.okx.paymentapi.service.TargetTab, java.lang.String, java.lang.String, com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo, java.lang.String, java.lang.String, java.util.List<? extends com.okinc.okx.paymentapi.service.VerificationStatus>, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.OrderType, com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency, java.lang.String, boolean, com.okinc.okx.paymentapi.service.DexTokenParameters, com.okinc.okx.paymentapi.service.ProConvertEntranceParameters, boolean, boolean):void (m)] (LINE:642) call: com.okinc.okx.paymentapi.service.BuySellConvertParameters.<init>(com.okinc.okx.paymentapi.service.OKPaymentSource, com.okinc.okx.paymentapi.service.TargetTab, java.lang.String, java.lang.String, com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo, java.lang.String, java.lang.String, java.util.List, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.OrderType, com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency, java.lang.String, boolean, com.okinc.okx.paymentapi.service.DexTokenParameters, com.okinc.okx.paymentapi.service.ProConvertEntranceParameters, boolean, boolean):void type: THIS */
    public /* synthetic */ BuySellConvertParameters(OKPaymentSource oKPaymentSource, TargetTab targetTab, String str, String str2, BuySellBaseCurrencyInfo buySellBaseCurrencyInfo, String str3, String str4, List list, String str5, OrderType orderType, OrderFrequency orderFrequency, String str6, boolean z, DexTokenParameters dexTokenParameters, ProConvertEntranceParameters proConvertEntranceParameters, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oKPaymentSource, (i & 2) != 0 ? TargetTab.BUY : targetTab, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : buySellBaseCurrencyInfo, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? yDY.AhwBna() : list, (i & 256) != 0 ? "" : str5, (i & 512) != 0 ? OrderType.ONE_TIME : orderType, (i & 1024) != 0 ? OrderFrequency.NO_FREQ : orderFrequency, (i & 2048) == 0 ? str6 : "", (i & 4096) != 0 ? false : z, (i & 8192) != 0 ? null : dexTokenParameters, (i & 16384) != 0 ? null : proConvertEntranceParameters, (i & 32768) != 0 ? false : z2, (i & 65536) == 0 ? z3 : false);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0050: CONSTRUCTOR 
  (r11v0 com.okinc.okx.paymentapi.service.OKPaymentSource)
  (wrap:com.okinc.okx.paymentapi.service.TargetTab:?: TERNARY null = ((wrap:int:0x0002: ARITH (r20v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:663) com.okinc.okx.paymentapi.service.TargetTab.BUY com.okinc.okx.paymentapi.service.TargetTab) : (r12v0 com.okinc.okx.paymentapi.service.TargetTab))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r20v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r13v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0013: ARITH (r20v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r14v0 java.lang.String))
  (wrap:com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo:?: TERNARY null = ((wrap:int:0x001a: ARITH (r20v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo) : (r15v0 com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0022: ARITH (r20v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002a: ARITH (r20v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0032: ARITH (r20v0 int) & (128 int) A[WRAPPED]) == (0 int)) ? (r18v0 java.lang.String) : (""))
  (wrap:com.okinc.okx.paymentapi.service.DexTokenParameters:?: TERNARY null = ((wrap:int:0x0039: ARITH (r20v0 int) & (256 int) A[WRAPPED]) == (0 int)) ? (r19v0 com.okinc.okx.paymentapi.service.DexTokenParameters) : (null com.okinc.okx.paymentapi.service.DexTokenParameters))
 A[MD:(com.okinc.okx.paymentapi.service.OKPaymentSource, com.okinc.okx.paymentapi.service.TargetTab, java.lang.String, java.lang.String, com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo, java.lang.String, java.lang.String, java.lang.String, com.okinc.okx.paymentapi.service.DexTokenParameters):void (m)] (LINE:661) call: com.okinc.okx.paymentapi.service.BuySellConvertParameters.<init>(com.okinc.okx.paymentapi.service.OKPaymentSource, com.okinc.okx.paymentapi.service.TargetTab, java.lang.String, java.lang.String, com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo, java.lang.String, java.lang.String, java.lang.String, com.okinc.okx.paymentapi.service.DexTokenParameters):void type: THIS */
    public /* synthetic */ BuySellConvertParameters(OKPaymentSource oKPaymentSource, TargetTab targetTab, String str, String str2, BuySellBaseCurrencyInfo buySellBaseCurrencyInfo, String str3, String str4, String str5, DexTokenParameters dexTokenParameters, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oKPaymentSource, (i & 2) != 0 ? TargetTab.BUY : targetTab, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : buySellBaseCurrencyInfo, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) == 0 ? str5 : "", (i & 256) == 0 ? dexTokenParameters : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuySellConvertParameters(@NotNull OKPaymentSource oKPaymentSource, @NotNull TargetTab targetTab, @NotNull String str, @NotNull String str2, BuySellBaseCurrencyInfo buySellBaseCurrencyInfo, @NotNull String str3, @NotNull String str4, @NotNull String str5, DexTokenParameters dexTokenParameters) {
        this(oKPaymentSource, targetTab, str, str2, buySellBaseCurrencyInfo, str3, str4, yDY.AhwBna(), str5, null, null, null, false, dexTokenParameters, null, false, false, 122368, null);
        Intrinsics.checkNotNullParameter(oKPaymentSource, "");
        Intrinsics.checkNotNullParameter(targetTab, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0076: CONSTRUCTOR 
  (r14v0 com.okinc.okx.paymentapi.service.OKPaymentSource)
  (wrap:com.okinc.okx.paymentapi.service.TargetTab:?: TERNARY null = ((wrap:int:0x0002: ARITH (r26v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0006: SGET  A[WRAPPED] (LINE:675) com.okinc.okx.paymentapi.service.TargetTab.BUY com.okinc.okx.paymentapi.service.TargetTab) : (r15v0 com.okinc.okx.paymentapi.service.TargetTab))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r26v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("") : (r16v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0014: ARITH (r26v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("") : (r17v0 java.lang.String))
  (wrap:com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo:?: TERNARY null = ((wrap:int:0x001c: ARITH (r26v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo) : (r18v0 com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0025: ARITH (r26v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r19v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x002d: ARITH (r26v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? ("") : (r20v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0035: ARITH (r26v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? ("") : (r21v0 java.lang.String))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.OrderType:?: TERNARY null = ((wrap:int:0x003d: ARITH (r26v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0041: SGET  A[WRAPPED] (LINE:682) com.okinc.okpaymentapi.data.remote.model.management.OrderType.ONE_TIME com.okinc.okpaymentapi.data.remote.model.management.OrderType) : (r22v0 com.okinc.okpaymentapi.data.remote.model.management.OrderType))
  (wrap:com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency:?: TERNARY null = ((wrap:int:0x0046: ARITH (r26v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x004a: SGET  A[WRAPPED] (LINE:683) com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency.NO_FREQ com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency) : (r23v0 com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x004f: ARITH (r26v0 int) & (1024 int) A[WRAPPED]) == (0 int)) ? (r24v0 java.lang.String) : (""))
  (wrap:com.okinc.okx.paymentapi.service.DexTokenParameters:?: TERNARY null = ((wrap:int:0x0056: ARITH (r26v0 int) & (2048 int) A[WRAPPED]) == (0 int)) ? (r25v0 com.okinc.okx.paymentapi.service.DexTokenParameters) : (null com.okinc.okx.paymentapi.service.DexTokenParameters))
 A[MD:(com.okinc.okx.paymentapi.service.OKPaymentSource, com.okinc.okx.paymentapi.service.TargetTab, java.lang.String, java.lang.String, com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.OrderType, com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency, java.lang.String, com.okinc.okx.paymentapi.service.DexTokenParameters):void (m)] (LINE:673) call: com.okinc.okx.paymentapi.service.BuySellConvertParameters.<init>(com.okinc.okx.paymentapi.service.OKPaymentSource, com.okinc.okx.paymentapi.service.TargetTab, java.lang.String, java.lang.String, com.okinc.okx.paymentapi.service.BuySellBaseCurrencyInfo, java.lang.String, java.lang.String, java.lang.String, com.okinc.okpaymentapi.data.remote.model.management.OrderType, com.okinc.okpaymentapi.data.remote.model.management.OrderFrequency, java.lang.String, com.okinc.okx.paymentapi.service.DexTokenParameters):void type: THIS */
    public /* synthetic */ BuySellConvertParameters(OKPaymentSource oKPaymentSource, TargetTab targetTab, String str, String str2, BuySellBaseCurrencyInfo buySellBaseCurrencyInfo, String str3, String str4, String str5, OrderType orderType, OrderFrequency orderFrequency, String str6, DexTokenParameters dexTokenParameters, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oKPaymentSource, (i & 2) != 0 ? TargetTab.BUY : targetTab, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? null : buySellBaseCurrencyInfo, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? OrderType.ONE_TIME : orderType, (i & 512) != 0 ? OrderFrequency.NO_FREQ : orderFrequency, (i & 1024) == 0 ? str6 : "", (i & 2048) == 0 ? dexTokenParameters : null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuySellConvertParameters(@NotNull OKPaymentSource oKPaymentSource, @NotNull TargetTab targetTab, @NotNull String str, @NotNull String str2, BuySellBaseCurrencyInfo buySellBaseCurrencyInfo, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull OrderType orderType, @NotNull OrderFrequency orderFrequency, @NotNull String str6, DexTokenParameters dexTokenParameters) {
        this(oKPaymentSource, targetTab, str, str2, buySellBaseCurrencyInfo, str3, str4, yDY.AhwBna(), str5, orderType, orderFrequency, str6, false, dexTokenParameters, null, false, false, 118784, null);
        Intrinsics.checkNotNullParameter(oKPaymentSource, "");
        Intrinsics.checkNotNullParameter(targetTab, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(orderType, "");
        Intrinsics.checkNotNullParameter(orderFrequency, "");
        Intrinsics.checkNotNullParameter(str6, "");
    }
}
